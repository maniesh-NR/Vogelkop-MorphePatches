package defpackage;

import defpackage.gv9;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class vvd {
    private static final String BUILDER_LIST_SUFFIX = "OrBuilderList";
    private static final String BYTES_SUFFIX = "Bytes";
    private static final char[] INDENT_BUFFER;
    private static final String LIST_SUFFIX = "List";
    private static final String MAP_SUFFIX = "Map";

    static {
        char[] cArr = new char[80];
        INDENT_BUFFER = cArr;
        Arrays.fill(cArr, ' ');
    }

    private vvd() {
    }

    private static void indent(int i, StringBuilder sb) {
        while (i > 0) {
            char[] cArr = INDENT_BUFFER;
            int length = i > cArr.length ? cArr.length : i;
            sb.append(cArr, 0, length);
            i -= length;
        }
    }

    private static boolean isDefaultValue(Object obj) {
        return obj instanceof Boolean ? !((Boolean) obj).booleanValue() : obj instanceof Integer ? ((Integer) obj).intValue() == 0 : obj instanceof Float ? Float.floatToRawIntBits(((Float) obj).floatValue()) == 0 : obj instanceof Double ? Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0 : obj instanceof String ? obj.equals("") : obj instanceof v44 ? obj.equals(v44.EMPTY) : obj instanceof rvd ? obj == ((rvd) obj).getDefaultInstanceForType() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    private static String pascalCaseToSnakeCase(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    public static void printField(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                printField(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                printField(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        indent(i, sb);
        sb.append(pascalCaseToSnakeCase(str));
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(qil.escapeText((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof v44) {
            sb.append(": \"");
            sb.append(qil.escapeBytes((v44) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof gv9) {
            sb.append(" {");
            reflectivePrintWithIndent((gv9) obj, sb, i + 2);
            sb.append("\n");
            indent(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i2 = i + 2;
        printField(sb, i2, "key", entry.getKey());
        printField(sb, i2, "value", entry.getValue());
        sb.append("\n");
        indent(i, sb);
        sb.append("}");
    }

    private static void reflectivePrintWithIndent(rvd rvdVar, StringBuilder sb, int i) throws SecurityException {
        int i2;
        int i3;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = rvdVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (!strSubstring.endsWith(LIST_SUFFIX) || strSubstring.endsWith(BUILDER_LIST_SUFFIX) || strSubstring.equals(LIST_SUFFIX) || (method2 = (Method) entry.getValue()) == null || !method2.getReturnType().equals(List.class)) {
                if (!strSubstring.endsWith(MAP_SUFFIX) || strSubstring.equals(MAP_SUFFIX) || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                    i3 = 3;
                    if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith(BYTES_SUFFIX) || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                        Method method4 = (Method) entry.getValue();
                        Method method5 = (Method) map.get("has".concat(strSubstring));
                        if (method4 != null) {
                            Object objInvokeOrDie = gv9.invokeOrDie(method4, rvdVar, new Object[0]);
                            if (method5 == null ? !isDefaultValue(objInvokeOrDie) : ((Boolean) gv9.invokeOrDie(method5, rvdVar, new Object[0])).booleanValue()) {
                                printField(sb, i, strSubstring, objInvokeOrDie);
                            }
                        }
                    }
                } else {
                    i3 = 3;
                    printField(sb, i, p3p.h(3, 0, strSubstring), gv9.invokeOrDie(method, rvdVar, new Object[0]));
                }
                i2 = i3;
            } else {
                printField(sb, i, p3p.h(4, 0, strSubstring), gv9.invokeOrDie(method2, rvdVar, new Object[0]));
                i2 = 3;
            }
        }
        if (rvdVar instanceof gv9.c) {
            Iterator<Map.Entry<e09, Object>> it = ((gv9.c) rvdVar).extensions.iterator();
            while (it.hasNext()) {
                Map.Entry<e09, Object> next = it.next();
                printField(sb, i, "[" + ((gv9.d) next.getKey()).getNumber() + "]", next.getValue());
            }
        }
        dmm dmmVar = ((gv9) rvdVar).unknownFields;
        if (dmmVar != null) {
            dmmVar.printWithIndent(sb, i);
        }
    }

    public static String toString(rvd rvdVar, String str) throws SecurityException {
        StringBuilder sbH = u35.h("# ", str);
        reflectivePrintWithIndent(rvdVar, sbH, 0);
        return sbH.toString();
    }
}
