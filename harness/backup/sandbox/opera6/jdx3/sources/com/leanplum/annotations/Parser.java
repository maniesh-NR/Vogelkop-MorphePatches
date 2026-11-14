package com.leanplum.annotations;

import android.text.TextUtils;
import com.leanplum.Var;
import com.leanplum.callbacks.VariableCallback;
import com.leanplum.internal.Constants;
import com.leanplum.internal.Log;
import defpackage.sko;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class Parser {
    private static void defineFileVariable(Object obj, String str, String str2, final Field field) {
        final Var<String> varDefineFile = Var.defineFile(str, str2);
        final boolean z = obj != null;
        final WeakReference weakReference = new WeakReference(obj);
        varDefineFile.addFileReadyHandler(new VariableCallback<String>() { // from class: com.leanplum.annotations.Parser.2
            @Override // com.leanplum.callbacks.VariableCallback
            public void handle(Var<String> var) throws IllegalAccessException, SecurityException, IllegalArgumentException {
                Field field2;
                Object obj2 = weakReference.get();
                if ((z && obj2 == null) || (field2 = field) == null) {
                    varDefineFile.removeFileReadyHandler(this);
                    return;
                }
                try {
                    boolean zIsAccessible = field2.isAccessible();
                    if (!zIsAccessible) {
                        field.setAccessible(true);
                    }
                    field.set(obj2, varDefineFile.fileValue());
                    if (zIsAccessible) {
                        return;
                    }
                    field.setAccessible(false);
                } catch (IllegalAccessException e) {
                    Log.e("Error setting value for field " + varDefineFile.name(), e);
                } catch (IllegalArgumentException e2) {
                    Log.e("Invalid value " + ((String) varDefineFile.value()) + " for field " + varDefineFile.name(), e2);
                }
            }
        });
    }

    private static <T> void defineVariable(Object obj, String str, T t, String str2, final Field field) {
        final Var varDefine = Var.define(str, t, str2);
        final boolean z = obj != null;
        final WeakReference weakReference = new WeakReference(obj);
        varDefine.addValueChangedHandler(new VariableCallback<T>() { // from class: com.leanplum.annotations.Parser.1
            @Override // com.leanplum.callbacks.VariableCallback
            public void handle(Var<T> var) throws IllegalAccessException, SecurityException, IllegalArgumentException {
                Field field2;
                Object obj2 = weakReference.get();
                if ((z && obj2 == null) || (field2 = field) == null) {
                    varDefine.removeValueChangedHandler(this);
                    return;
                }
                try {
                    boolean zIsAccessible = field2.isAccessible();
                    if (!zIsAccessible) {
                        field.setAccessible(true);
                    }
                    field.set(obj2, varDefine.value());
                    if (zIsAccessible) {
                        return;
                    }
                    field.setAccessible(false);
                } catch (IllegalAccessException e) {
                    Log.e("Error setting value for field " + varDefine.name(), e);
                } catch (IllegalArgumentException e2) {
                    Log.e("Invalid value " + varDefine.value() + " for field " + varDefine.name(), e2);
                }
            }
        });
    }

    public static void parseVariables(Object... objArr) {
        try {
            for (Object obj : objArr) {
                parseVariablesHelper(obj, obj.getClass());
            }
        } catch (Throwable th) {
            Log.e("Error parsing variables", th);
        }
    }

    public static void parseVariablesForClasses(Class<?>... clsArr) {
        try {
            for (Class<?> cls : clsArr) {
                parseVariablesHelper(null, cls);
            }
        } catch (Throwable th) {
            Log.e("Error parsing variables", th);
        }
    }

    private static void parseVariablesHelper(Object obj, Class<?> cls) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        String strGroup;
        String strName;
        boolean z;
        for (Field field : cls.getFields()) {
            if (field.isAnnotationPresent(Variable.class)) {
                Variable variable = (Variable) field.getAnnotation(Variable.class);
                strGroup = variable.group();
                strName = variable.name();
                z = false;
            } else if (field.isAnnotationPresent(File.class)) {
                File file = (File) field.getAnnotation(File.class);
                strGroup = file.group();
                strName = file.name();
                z = true;
            }
            if (TextUtils.isEmpty(strName)) {
                strName = field.getName();
            }
            if (!TextUtils.isEmpty(strGroup)) {
                strName = sko.v(strGroup, ".", strName);
            }
            Class<?> type = field.getType();
            String string = type.toString();
            if (string.equals("int")) {
                defineVariable(obj, strName, Integer.valueOf(field.getInt(obj)), Constants.Kinds.INT, field);
            } else if (string.equals("byte")) {
                defineVariable(obj, strName, Byte.valueOf(field.getByte(obj)), Constants.Kinds.INT, field);
            } else if (string.equals("short")) {
                defineVariable(obj, strName, Short.valueOf(field.getShort(obj)), Constants.Kinds.INT, field);
            } else if (string.equals("long")) {
                defineVariable(obj, strName, Long.valueOf(field.getLong(obj)), Constants.Kinds.INT, field);
            } else if (string.equals("char")) {
                defineVariable(obj, strName, Character.valueOf(field.getChar(obj)), Constants.Kinds.INT, field);
            } else if (string.equals(Constants.Kinds.FLOAT)) {
                defineVariable(obj, strName, Float.valueOf(field.getFloat(obj)), Constants.Kinds.FLOAT, field);
            } else if (string.equals("double")) {
                defineVariable(obj, strName, Double.valueOf(field.getDouble(obj)), Constants.Kinds.FLOAT, field);
            } else if (string.equals("boolean")) {
                defineVariable(obj, strName, Boolean.valueOf(field.getBoolean(obj)), Constants.Kinds.BOOLEAN, field);
            } else if (type.isPrimitive()) {
                Log.e(sko.k("Variable ", strName, " is an unsupported primitive type."), new Object[0]);
            } else if (type.isArray()) {
                Log.e(sko.k("Variable ", strName, " should be a List instead of an Array."), new Object[0]);
            } else if (type.isAssignableFrom(List.class)) {
                defineVariable(obj, strName, field.get(obj), Constants.Kinds.ARRAY, field);
            } else if (type.isAssignableFrom(Map.class)) {
                defineVariable(obj, strName, field.get(obj), Constants.Kinds.DICTIONARY, field);
            } else {
                Object obj2 = field.get(obj);
                String string2 = obj2 == null ? null : obj2.toString();
                if (z) {
                    defineFileVariable(obj, strName, string2, field);
                } else {
                    defineVariable(obj, strName, string2, Constants.Kinds.STRING, field);
                }
            }
        }
    }
}
