package com.leanplum;

import android.text.TextUtils;
import com.leanplum.callbacks.VariableCallback;
import com.leanplum.internal.Constants;
import com.leanplum.internal.FileManager;
import com.leanplum.internal.LeanplumInternal;
import com.leanplum.internal.Log;
import com.leanplum.internal.OperationQueue;
import com.leanplum.internal.Util;
import com.leanplum.internal.VarCache;
import defpackage.fc;
import defpackage.sko;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class Var<T> {
    private static boolean printedCallbackWarning;
    private byte[] data;
    private T defaultValue;
    private boolean fileIsPending;
    private boolean hadStarted;
    private String hash;
    private boolean isAsset;
    private boolean isInternal;
    public boolean isResource;
    private String kind;
    private String name;
    private String[] nameComponents;
    private Double numberValue;
    private int overrideResId;
    private int size;
    public String stringValue;
    private T value;
    private final List<VariableCallback<T>> fileReadyHandlers = new ArrayList();
    private final List<VariableCallback<T>> valueChangedHandlers = new ArrayList();
    private boolean valueIsInAssets = false;

    private interface VarInitializer<T> {
        void init(Var<T> var);
    }

    private void cacheComputedValues() {
        T t = this.value;
        if (t instanceof String) {
            String str = (String) t;
            this.stringValue = str;
            modifyNumberValue(str);
            modifyValue(this.numberValue);
            return;
        }
        if (t instanceof Number) {
            this.stringValue = String.valueOf(this.value);
            this.numberValue = Double.valueOf(((Number) this.value).doubleValue());
            modifyValue((Number) this.value);
        } else if (t == null || (t instanceof Iterable) || (t instanceof Map)) {
            this.stringValue = null;
            this.numberValue = null;
        } else {
            this.stringValue = t.toString();
            this.numberValue = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputStream defaultStream() {
        try {
            if (!"file".equals(this.kind)) {
                return null;
            }
            boolean z = this.isResource;
            Boolean boolValueOf = Boolean.valueOf(this.isAsset);
            Boolean boolValueOf2 = Boolean.valueOf(this.valueIsInAssets);
            T t = this.defaultValue;
            return FileManager.stream(z, boolValueOf, boolValueOf2, (String) t, (String) t, this.data);
        } catch (Throwable th) {
            Log.exception(th);
            return null;
        }
    }

    public static <T> Var<T> define(String str, T t) {
        return define(str, t, VarCache.kindFromValue(t), null);
    }

    public static <T> Var<T> define(String str, T t, String str2) {
        return define(str, t, str2, null);
    }

    private static <T> Var<T> define(String str, T t, String str2, VarInitializer<T> varInitializer) {
        if (TextUtils.isEmpty(str)) {
            Log.e("Empty name parameter provided.", new Object[0]);
            return null;
        }
        Var<T> variable = VarCache.getVariable(str);
        if (variable != null) {
            return variable;
        }
        if (LeanplumInternal.hasCalledStart() && !str.startsWith(Constants.Values.RESOURCES_VARIABLE)) {
            Log.i(sko.k("You should not create new variables after calling start (name=", str, ")"), new Object[0]);
        }
        Var<T> var = new Var<>();
        try {
            ((Var) var).name = str;
            ((Var) var).nameComponents = VarCache.getNameComponents(str);
            ((Var) var).defaultValue = t;
            ((Var) var).value = t;
            ((Var) var).kind = str2;
            byte b = 1;
            if (str.startsWith(Constants.Values.RESOURCES_VARIABLE)) {
                ((Var) var).isInternal = true;
            }
            if (varInitializer != null) {
                varInitializer.init(var);
            }
            var.cacheComputedValues();
            VarCache.registerVariable(var);
            if ("file".equals(((Var) var).kind)) {
                if (var.isResource) {
                    VarCache.registerFile(var.stringValue, new fc(var, b), ((Var) var).hash, ((Var) var).size);
                } else {
                    VarCache.registerFile(var.stringValue, var.defaultValue() != null ? var.defaultValue().toString() : null, new fc(var, b));
                }
            }
            var.update();
            return var;
        } catch (Throwable th) {
            Log.exception(th);
            return var;
        }
    }

    public static Var<String> defineAsset(String str, String str2) {
        return define(str, str2, "file", new VarInitializer<String>() { // from class: com.leanplum.Var.1
            @Override // com.leanplum.Var.VarInitializer
            public void init(Var<String> var) {
                ((Var) var).isAsset = true;
            }
        });
    }

    public static Var<Integer> defineColor(String str, int i) {
        return define(str, Integer.valueOf(i), Constants.Kinds.COLOR, null);
    }

    public static Var<String> defineFile(String str, String str2) {
        return define(str, str2, "file", null);
    }

    public static Var<String> defineResource(String str, int i) {
        return define(str, Util.generateResourceNameFromId(i), "file", new VarInitializer<String>() { // from class: com.leanplum.Var.2
            @Override // com.leanplum.Var.VarInitializer
            public void init(Var<String> var) {
                var.isResource = true;
            }
        });
    }

    public static Var<String> defineResource(String str, String str2, final int i, final String str3, final byte[] bArr) {
        return define(str, str2, "file", new VarInitializer<String>() { // from class: com.leanplum.Var.3
            @Override // com.leanplum.Var.VarInitializer
            public void init(Var<String> var) {
                var.isResource = true;
                ((Var) var).size = i;
                ((Var) var).hash = str3;
                ((Var) var).data = bArr;
            }
        });
    }

    private void modifyNumberValue(String str) {
        try {
            this.numberValue = Double.valueOf(str);
        } catch (NumberFormatException unused) {
            this.numberValue = null;
            T t = this.defaultValue;
            if (t instanceof Number) {
                this.numberValue = Double.valueOf(((Number) t).doubleValue());
            }
        }
    }

    private void modifyValue(Number number) {
        if (number != null) {
            T t = this.defaultValue;
            if (t instanceof Byte) {
                this.value = (T) Byte.valueOf(number.byteValue());
                return;
            }
            if (t instanceof Short) {
                this.value = (T) Short.valueOf(number.shortValue());
                return;
            }
            if (t instanceof Integer) {
                this.value = (T) Integer.valueOf(number.intValue());
                return;
            }
            if (t instanceof Long) {
                this.value = (T) Long.valueOf(number.longValue());
                return;
            }
            if (t instanceof Float) {
                this.value = (T) Float.valueOf(number.floatValue());
            } else if (t instanceof Double) {
                this.value = (T) Double.valueOf(number.doubleValue());
            } else if (t instanceof Character) {
                this.value = (T) Character.valueOf((char) number.intValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void triggerFileIsReady() {
        synchronized (this.fileReadyHandlers) {
            this.fileIsPending = false;
            for (VariableCallback<T> variableCallback : this.fileReadyHandlers) {
                variableCallback.setVariable(this);
                OperationQueue.sharedInstance().addUiOperation(variableCallback);
            }
        }
    }

    private void triggerValueChanged() {
        synchronized (this.valueChangedHandlers) {
            for (VariableCallback<T> variableCallback : this.valueChangedHandlers) {
                variableCallback.setVariable(this);
                OperationQueue.sharedInstance().addUiOperation(variableCallback);
            }
        }
    }

    private void warnIfNotStarted() {
        if (this.isInternal || Leanplum.hasStarted() || printedCallbackWarning) {
            return;
        }
        Log.i("Leanplum hasn't finished retrieving values from the server. You should use a callback to make sure the value for '%s' is ready. Otherwise, your app may not use the most up-to-date value.", this.name);
        printedCallbackWarning = true;
    }

    public void addFileReadyHandler(VariableCallback<T> variableCallback) {
        if (variableCallback == null) {
            Log.e("Invalid handler parameter provided.", new Object[0]);
            return;
        }
        synchronized (this.fileReadyHandlers) {
            this.fileReadyHandlers.add(variableCallback);
        }
        if (!Leanplum.hasStarted() || this.fileIsPending) {
            return;
        }
        variableCallback.handle(this);
    }

    public void addValueChangedHandler(VariableCallback<T> variableCallback) {
        if (variableCallback == null) {
            Log.e("Invalid handler parameter provided.", new Object[0]);
            return;
        }
        synchronized (this.valueChangedHandlers) {
            this.valueChangedHandlers.add(variableCallback);
        }
        if (Leanplum.hasStarted()) {
            variableCallback.handle(this);
        }
    }

    public int count() {
        try {
            warnIfNotStarted();
            Object mergedValueFromComponentArray = VarCache.getMergedValueFromComponentArray(this.nameComponents);
            if (mergedValueFromComponentArray instanceof List) {
                return ((List) mergedValueFromComponentArray).size();
            }
            LeanplumInternal.maybeThrowException(new UnsupportedOperationException("This variable is not a list."));
            return 0;
        } catch (Throwable th) {
            Log.exception(th);
            return 0;
        }
    }

    public T defaultValue() {
        return this.defaultValue;
    }

    public String fileValue() {
        try {
            warnIfNotStarted();
            if ("file".equals(this.kind)) {
                return FileManager.fileValue(this.stringValue, (String) this.defaultValue, Boolean.valueOf(this.valueIsInAssets));
            }
            return null;
        } catch (Throwable th) {
            Log.exception(th);
            return null;
        }
    }

    public String kind() {
        return this.kind;
    }

    public String name() {
        return this.name;
    }

    public String[] nameComponents() {
        return this.nameComponents;
    }

    public Number numberValue() {
        warnIfNotStarted();
        return this.numberValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object objectForKeyPath(Object... objArr) {
        try {
            warnIfNotStarted();
            ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, this.nameComponents);
            if (objArr != null && objArr.length > 0) {
                Collections.addAll(arrayList, objArr);
            }
            return VarCache.getMergedValueFromComponentArray(arrayList.toArray(new Object[arrayList.size()]));
        } catch (Throwable th) {
            Log.exception(th);
            return null;
        }
    }

    public int overrideResId() {
        return this.overrideResId;
    }

    public void removeFileReadyHandler(VariableCallback<T> variableCallback) {
        if (variableCallback == null) {
            Log.e("Invalid handler parameter provided.", new Object[0]);
            return;
        }
        synchronized (this.fileReadyHandlers) {
            this.fileReadyHandlers.remove(variableCallback);
        }
    }

    public void removeValueChangedHandler(VariableCallback<T> variableCallback) {
        synchronized (this.valueChangedHandlers) {
            this.valueChangedHandlers.remove(variableCallback);
        }
    }

    public void setOverrideResId(int i) {
        this.overrideResId = i;
    }

    public InputStream stream() {
        try {
            if (!"file".equals(this.kind)) {
                return null;
            }
            warnIfNotStarted();
            InputStream inputStreamStream = FileManager.stream(this.isResource, Boolean.valueOf(this.isAsset), Boolean.valueOf(this.valueIsInAssets), fileValue(), (String) this.defaultValue, this.data);
            return inputStreamStream == null ? defaultStream() : inputStreamStream;
        } catch (Throwable th) {
            Log.exception(th);
            return null;
        }
    }

    public String stringValue() {
        warnIfNotStarted();
        return this.stringValue;
    }

    public String toString() {
        return "Var(" + this.name + ")=" + this.value;
    }

    public synchronized void update() {
        T t = this.value;
        T t2 = (T) VarCache.getMergedValueFromComponentArray(this.nameComponents);
        this.value = t2;
        if (t2 == null && t == null) {
            return;
        }
        if (t2 == null || t == null || !t2.equals(t) || !this.hadStarted) {
            cacheComputedValues();
            if (VarCache.silent() && this.name.startsWith(Constants.Values.RESOURCES_VARIABLE) && "file".equals(this.kind) && !this.fileIsPending) {
                triggerFileIsReady();
            }
            if (VarCache.silent()) {
                return;
            }
            if (Leanplum.hasStarted()) {
                triggerValueChanged();
            }
            if ("file".equals(this.kind)) {
                if (!Constants.isNoop()) {
                    FileManager.DownloadFileResult downloadFileResultMaybeDownloadFile = FileManager.maybeDownloadFile(this.isResource, this.stringValue, (String) this.defaultValue, null, new Runnable() { // from class: com.leanplum.Var.4
                        @Override // java.lang.Runnable
                        public void run() {
                            Var.this.triggerFileIsReady();
                        }
                    });
                    this.valueIsInAssets = false;
                    if (downloadFileResultMaybeDownloadFile == FileManager.DownloadFileResult.DOWNLOADING) {
                        this.fileIsPending = true;
                    } else if (downloadFileResultMaybeDownloadFile == FileManager.DownloadFileResult.EXISTS_IN_ASSETS) {
                        this.valueIsInAssets = true;
                    }
                }
                if (Leanplum.hasStarted() && !this.fileIsPending) {
                    triggerFileIsReady();
                }
            }
            if (Leanplum.hasStarted()) {
                this.hadStarted = true;
            }
        }
    }

    public T value() {
        warnIfNotStarted();
        return this.value;
    }
}
