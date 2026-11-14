package defpackage;

import com.leanplum.internal.ResourceQualifiers;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class jf0 {
    public final Charset a = Charset.forName("UTF-8");
    public final short b;
    public final int c;
    public final df0[] d;
    public HashMap e;

    /* JADX WARN: Multi-variable type inference failed */
    public jf0(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = new df0[i3];
    }

    public static byte c(Object obj) {
        if (obj == null) {
            return (byte) 0;
        }
        if (obj instanceof String) {
            return (byte) 6;
        }
        if (obj instanceof Long) {
            return (byte) 3;
        }
        if (obj instanceof jf0) {
            return (byte) 8;
        }
        if (obj instanceof Boolean) {
            return (byte) 1;
        }
        if (obj instanceof yc0) {
            return (byte) 11;
        }
        if (obj instanceof List) {
            return (byte) 9;
        }
        if (obj instanceof Integer) {
            return (byte) 2;
        }
        if (obj instanceof Map) {
            return (byte) 10;
        }
        if (obj instanceof Float) {
            return (byte) 4;
        }
        return obj instanceof Double ? (byte) 5 : (byte) 7;
    }

    public static jf0 f(jf0 jf0Var, jf0 jf0Var2) {
        return jf0Var == null ? jf0Var2 : jf0Var2 == null ? jf0Var : jf0Var2.m(jf0Var);
    }

    public static Integer g(Integer num, Integer num2) {
        if (num == null) {
            return num2;
        }
        if (num2 == null) {
            return num;
        }
        return Integer.valueOf(num2.intValue() + num.intValue());
    }

    public static Long h(Long l, Long l2) {
        if (l == null) {
            return l2;
        }
        if (l2 == null) {
            return l;
        }
        return Long.valueOf(l2.longValue() + l.longValue());
    }

    public static List i(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return arrayList;
    }

    public static Map j(Map map, Map map2) {
        if (map == null) {
            return map2;
        }
        if (map2 == null) {
            return map;
        }
        HashMap map3 = new HashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            if (entry.getValue() != null) {
                map3.put((String) entry.getKey(), entry.getValue());
            }
        }
        return map3;
    }

    public static Map k(Map map, Map map2) {
        if (map == null) {
            return map2;
        }
        if (map2 == null) {
            return map;
        }
        HashMap map3 = new HashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            if (entry.getValue() != null) {
                Long l = (Long) map3.get(entry.getKey());
                if (l == null) {
                    map3.put((String) entry.getKey(), (Long) entry.getValue());
                } else {
                    map3.put((String) entry.getKey(), Long.valueOf(((Long) entry.getValue()).longValue() + l.longValue()));
                }
            }
        }
        return map3;
    }

    public static Map l(Map map, Map map2) {
        if (map == null) {
            return map2;
        }
        if (map2 == null) {
            return map;
        }
        HashMap map3 = new HashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            if (entry.getValue() != null) {
                map3.put((String) entry.getKey(), f((jf0) map3.get(entry.getKey()), (jf0) entry.getValue()));
            }
        }
        return map3;
    }

    public static void s(List list) {
        if (list == null || list.size() <= 10) {
            return;
        }
        list.subList(0, list.size() - 10).clear();
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, long j) throws IOException {
        long j2 = (j << 1) ^ (j >> 63);
        if (((-128) & j2) != 0) {
            byteArrayOutputStream.write(((int) (j2 & 127)) | ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL);
            while (true) {
                j2 >>>= 7;
                if (j2 <= 127) {
                    break;
                } else {
                    byteArrayOutputStream.write(((int) (j2 & 127)) | ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL);
                }
            }
        }
        byteArrayOutputStream.write((int) j2);
    }

    public df0 a(int i) {
        return n50.g[i];
    }

    public ef0 b(int i) {
        return n50.f[i];
    }

    public final void d(int i, int i2) {
        Integer num = (Integer) n(i);
        if (num == null) {
            num = 0;
        }
        q(i, i2, Integer.valueOf(num.intValue() + 1));
    }

    public final void e(int i) {
        Long l = (Long) n(i);
        if (l == null) {
            l = 0L;
        }
        q(i, 1, Long.valueOf(l.longValue() + 1));
    }

    public jf0 m(jf0 jf0Var) {
        n50 n50Var = (n50) jf0Var;
        Long lH = h((Long) n50Var.n(0), (Long) n(0));
        if (lH != null) {
            q(0, 1, lH);
        }
        Long lH2 = h((Long) n50Var.n(1), (Long) n(1));
        if (lH2 != null) {
            q(1, 1, lH2);
        }
        Long lH3 = h((Long) n50Var.n(2), (Long) n(2));
        if (lH3 != null) {
            q(2, 1, lH3);
        }
        Long lH4 = h((Long) n50Var.n(3), (Long) n(3));
        if (lH4 != null) {
            q(3, 1, lH4);
        }
        Long lH5 = h((Long) n50Var.n(4), (Long) n(4));
        if (lH5 != null) {
            q(4, 1, lH5);
        }
        return this;
    }

    public final Object n(int i) {
        df0 df0VarA = this.d[i];
        if (df0VarA == null) {
            df0VarA = a(i);
        }
        if (df0VarA != null) {
            return df0VarA.c;
        }
        return null;
    }

    public final void o(int i, int i2, int i3) {
        this.d[i] = new df0(i2, Integer.valueOf(i3), (byte) 2);
    }

    public final void p(int i, int i2, long j) {
        this.d[i] = new df0(i2, Long.valueOf(j), (byte) 3);
    }

    public final void q(int i, int i2, Object obj) {
        if (obj != null || i2 >= 0) {
            this.d[i] = new df0(i2, obj, c(obj));
            return;
        }
        Locale locale = Locale.US;
        throw new IllegalArgumentException("null value on non-nullable field[" + i + "]: " + getClass());
    }

    public final void r(int i, int i2, boolean z) {
        this.d[i] = new df0(i2, Boolean.valueOf(z), (byte) 1);
    }

    public final void t(ByteArrayOutputStream byteArrayOutputStream, long j) throws IOException {
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        short s = this.b;
        byteArrayOutputStream.write(s >> 8);
        byteArrayOutputStream.write(s);
        int i = this.c;
        if (i >= 0) {
            v(byteArrayOutputStream, i);
        }
        u(byteArrayOutputStream, j);
    }

    public final void u(ByteArrayOutputStream byteArrayOutputStream, long j) throws IOException {
        int i = 0;
        while (true) {
            df0[] df0VarArr = this.d;
            if (i >= df0VarArr.length) {
                return;
            }
            df0 df0VarA = df0VarArr[i];
            long j2 = b(i).a;
            boolean z = (j2 & j) != j2;
            if (df0VarA == null || z) {
                df0VarA = a(i);
            }
            if (df0VarA == null) {
                StringBuilder sbO = p3p.o(i, "Field #", " is not set in ");
                sbO.append(getClass().getSimpleName());
                throw new RuntimeException(sbO.toString());
            }
            byte b = df0VarA.b;
            if (b >= 0) {
                v(byteArrayOutputStream, b);
            }
            w(byteArrayOutputStream, j, df0VarA.a, df0VarA.c);
            i++;
        }
    }

    public final void w(ByteArrayOutputStream byteArrayOutputStream, long j, byte b, Object obj) throws IOException {
        Charset charset = this.a;
        switch (b) {
            case 1:
                byteArrayOutputStream.write(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case 2:
                v(byteArrayOutputStream, ((Integer) obj).intValue());
                return;
            case 3:
                v(byteArrayOutputStream, ((Long) obj).longValue());
                return;
            case 4:
                int iFloatToIntBits = Float.floatToIntBits(((Float) obj).floatValue());
                byteArrayOutputStream.write(iFloatToIntBits);
                byteArrayOutputStream.write(iFloatToIntBits >> 8);
                byteArrayOutputStream.write(iFloatToIntBits >> 16);
                byteArrayOutputStream.write(iFloatToIntBits >> 24);
                return;
            case 5:
                long jDoubleToLongBits = Double.doubleToLongBits(((Double) obj).doubleValue());
                byteArrayOutputStream.write((int) jDoubleToLongBits);
                byteArrayOutputStream.write((int) (jDoubleToLongBits >> 8));
                byteArrayOutputStream.write((int) (jDoubleToLongBits >> 16));
                byteArrayOutputStream.write((int) (jDoubleToLongBits >> 24));
                byteArrayOutputStream.write((int) (jDoubleToLongBits >> 32));
                byteArrayOutputStream.write((int) (jDoubleToLongBits >> 40));
                byteArrayOutputStream.write((int) (jDoubleToLongBits >> 48));
                byteArrayOutputStream.write((int) (jDoubleToLongBits >> 56));
                return;
            case 6:
                byte[] bytes = ((String) obj).getBytes(charset);
                v(byteArrayOutputStream, bytes.length);
                byteArrayOutputStream.write(bytes);
                return;
            case 7:
                v(byteArrayOutputStream, r12.length);
                byteArrayOutputStream.write((byte[]) obj);
                return;
            case 8:
                ((jf0) obj).u(byteArrayOutputStream, j);
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                List list = (List) obj;
                if (!list.isEmpty()) {
                    byte bC = c(list.iterator().next());
                    v(byteArrayOutputStream, list.size());
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        w(byteArrayOutputStream, j, bC, it.next());
                    }
                }
                v(byteArrayOutputStream, 0L);
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                Map map = (Map) obj;
                if (!map.isEmpty()) {
                    v(byteArrayOutputStream, map.size());
                    Iterator it2 = map.entrySet().iterator();
                    Map.Entry entry = (Map.Entry) it2.next();
                    byte bC2 = c(entry.getValue());
                    while (true) {
                        byte[] bytes2 = ((String) entry.getKey()).getBytes(charset);
                        v(byteArrayOutputStream, bytes2.length);
                        byteArrayOutputStream.write(bytes2);
                        w(byteArrayOutputStream, j, bC2, entry.getValue());
                        if (it2.hasNext()) {
                            entry = (Map.Entry) it2.next();
                        }
                    }
                }
                v(byteArrayOutputStream, 0L);
                return;
            case 11:
                v(byteArrayOutputStream, ((yc0) obj).getValue());
                return;
            case 12:
                throw sko.g(obj);
            default:
                return;
        }
    }
}
