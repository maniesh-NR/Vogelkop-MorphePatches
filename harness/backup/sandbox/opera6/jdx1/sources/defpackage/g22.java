package defpackage;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class g22 {
    public final LinkedHashMap a;

    public g22(byte b) {
        switch (b) {
            case 1:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public final void a(String str, String str2, f22 f22Var) {
        boolean z;
        int iOrdinal = f22Var.ordinal();
        if (iOrdinal != 0) {
            z = true;
            if (iOrdinal != 1) {
                h9o.p();
                return;
            }
        } else {
            z = false;
        }
        LinkedHashMap linkedHashMap = this.a;
        Object d22Var = linkedHashMap.get(str);
        if (d22Var == null) {
            d22Var = new d22(str, new q3(this, str, (byte) 17));
            linkedHashMap.put(str, d22Var);
        }
        d22 d22Var2 = (d22) d22Var;
        kze kzeVar = d22Var2.c;
        if (d22Var2.e || d22Var2.d) {
            return;
        }
        kzeVar.r(new c22(((c22) kzeVar.g()).a.concat(str2), z));
    }

    public final ib6 b() throws IOException {
        ib6 ib6Var = new ib6(this.a);
        cqp.H0(ib6Var);
        return ib6Var;
    }

    public final void c(HashMap map) {
        Object[] objArr;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                value = null;
            } else {
                s15 s15VarA = uqh.a(value.getClass());
                if (s15VarA.equals(uqh.a(Boolean.TYPE)) ? true : s15VarA.equals(uqh.a(Byte.TYPE)) ? true : s15VarA.equals(uqh.a(Integer.TYPE)) ? true : s15VarA.equals(uqh.a(Long.TYPE)) ? true : s15VarA.equals(uqh.a(Float.TYPE)) ? true : s15VarA.equals(uqh.a(Double.TYPE)) ? true : s15VarA.equals(uqh.a(String.class)) ? true : s15VarA.equals(uqh.a(Boolean[].class)) ? true : s15VarA.equals(uqh.a(Byte[].class)) ? true : s15VarA.equals(uqh.a(Integer[].class)) ? true : s15VarA.equals(uqh.a(Long[].class)) ? true : s15VarA.equals(uqh.a(Float[].class)) ? true : s15VarA.equals(uqh.a(Double[].class)) ? true : s15VarA.equals(uqh.a(String[].class))) {
                    continue;
                } else {
                    int i = 0;
                    if (s15VarA.equals(uqh.a(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        int i2 = se6.a;
                        int length = zArr.length;
                        objArr = new Boolean[length];
                        while (i < length) {
                            objArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                    } else if (s15VarA.equals(uqh.a(byte[].class))) {
                        byte[] bArr = (byte[]) value;
                        int i3 = se6.a;
                        int length2 = bArr.length;
                        objArr = new Byte[length2];
                        while (i < length2) {
                            objArr[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                    } else if (s15VarA.equals(uqh.a(int[].class))) {
                        int[] iArr = (int[]) value;
                        int i4 = se6.a;
                        int length3 = iArr.length;
                        objArr = new Integer[length3];
                        while (i < length3) {
                            objArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                    } else if (s15VarA.equals(uqh.a(long[].class))) {
                        long[] jArr = (long[]) value;
                        int i5 = se6.a;
                        int length4 = jArr.length;
                        objArr = new Long[length4];
                        while (i < length4) {
                            objArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                    } else if (s15VarA.equals(uqh.a(float[].class))) {
                        float[] fArr = (float[]) value;
                        int i6 = se6.a;
                        int length5 = fArr.length;
                        objArr = new Float[length5];
                        while (i < length5) {
                            objArr[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                    } else {
                        if (!s15VarA.equals(uqh.a(double[].class))) {
                            kp5.d("Key ", str, " has invalid type ", s15VarA);
                            return;
                        }
                        double[] dArr = (double[]) value;
                        int i7 = se6.a;
                        int length6 = dArr.length;
                        objArr = new Double[length6];
                        while (i < length6) {
                            objArr[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                    }
                    value = objArr;
                }
            }
            this.a.put(str, value);
        }
    }
}
