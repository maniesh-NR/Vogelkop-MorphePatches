package ads_mobile_sdk;

import defpackage.dep;
import defpackage.g9p;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class st3 {
    public Object a;
    public long b;
    public double c;
    public ws3 d;
    public ArrayList e;
    public g9p f;
    public int g = 1;

    public static st3 a(double d) {
        st3 st3Var = new st3();
        int[] iArr = {76065818, 1629326670, 912768099, 1092092300, 784816880, -1349977414, 434065736, 1884661237, 1605908235};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int iA = u0h.a(((~i) & i2) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        st3Var.h();
        st3Var.g = iA;
        st3Var.c = d;
        return st3Var;
    }

    public static st3 a(long j) {
        st3 st3Var = new st3();
        int[] iArr = {269455306, 1628467785, 508432336, 1769894153, 149815616, -1737813993, 468055906, 524872353, 327254586};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int iA = u0h.a(((~i) & i2) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        st3Var.h();
        st3Var.g = iA;
        st3Var.b = j;
        return st3Var;
    }

    public static st3 a(st3 st3Var) {
        int[] iArr = {1154349542, 1365661854, 772762753, -35647458, -1399059520, 905919471, 65677639, 1759726503, 552812661};
        int i = 0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int iA = u0h.a(((~i2) & i3) | i4, (i2 & i5) | i6, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        try {
            int i7 = st3Var.g;
            int i8 = iA + i7;
            if (i7 == 0) {
                throw null;
            }
            switch (i8) {
                case 0:
                    return new st3();
                case 1:
                    return a(st3Var.b());
                case 2:
                    return a(st3Var.c());
                case 3:
                    return a(st3Var.d());
                case 4:
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = (ArrayList) st3Var.e();
                    int size = arrayList2.size();
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        arrayList.add(a((st3) obj));
                    }
                    return a(arrayList);
                case 5:
                    return a(st3Var.f());
                case 6:
                    return a(st3Var.g());
                default:
                    qp2.g(us3.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
                    return null;
            }
        } catch (dep e) {
            h9o.v(us3.a("CEiv6BFfPnitUE+D"), e);
            return null;
        }
    }

    public static st3 a(ws3 ws3Var) {
        st3 st3Var = new st3();
        int[] iArr = {1143408282, 544368152, 1884037077, 79323401, 1472762119, -801477845, 201305624, 1470503465, 1402586708};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int iA = u0h.a(((~i) & i2) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        st3Var.h();
        st3Var.g = iA;
        st3Var.d = ws3Var;
        return st3Var;
    }

    public static st3 a(g9p g9pVar) {
        st3 st3Var = new st3();
        int[] iArr = {1315209188, 67133601, 1612794668, 612376713, 2023183116, -774012042, 5007439, 661761152, 474613996};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int iA = u0h.a(((~i) & i2) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        st3Var.h();
        st3Var.g = iA;
        st3Var.f = g9pVar;
        return st3Var;
    }

    public static st3 a(Object obj) {
        st3 st3Var = new st3();
        int[] iArr = {572660336, 1963204074, 810270723, 1168973800, 12304897, -1027511958, 1433925857, 2084420925, 1937477084};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int iA = u0h.a(((~i) & i2) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        st3Var.h();
        st3Var.g = iA;
        st3Var.a = obj;
        return st3Var;
    }

    public static st3 a(ArrayList arrayList) {
        st3 st3Var = new st3();
        int[] iArr = {231602422, 370241669, 619070592, 319896591, 694865338, 1425770340, 39950860, 555996658, 324763920};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int iA = u0h.a(((~i) & i2) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        st3Var.h();
        st3Var.g = iA;
        st3Var.e = arrayList;
        return st3Var;
    }

    public static st3 b(Object obj) {
        if (obj instanceof Long) {
            return a(((Long) obj).longValue());
        }
        if (obj instanceof Boolean) {
            return a(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Integer) {
            return a(((Integer) obj).intValue());
        }
        if (obj instanceof Double) {
            return a(((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return a(((Float) obj).floatValue());
        }
        if (obj instanceof Short) {
            return a(((Short) obj).shortValue());
        }
        if (obj instanceof Byte) {
            return a(((Byte) obj).byteValue());
        }
        if (obj instanceof ws3) {
            return a((ws3) obj);
        }
        if (obj instanceof String) {
            return a(ws3.a((String) obj));
        }
        if (!(obj instanceof ArrayList)) {
            return a(obj);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(b(arrayList2.get(i)));
        }
        return a(arrayList);
    }

    public final Object a() throws dep {
        int[] iArr = {172154289, 1050326876, 843682288, -858640882, -228026365, 881347074, 13857144, 514820752, 473891334};
        int i = 0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int iA = u0h.a(((~i2) & i3) | i4, (i2 & i5) | i6, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        int i7 = this.g;
        int i8 = iA + i7;
        if (i7 == 0) {
            throw null;
        }
        switch (i8) {
            case 0:
            case 5:
                throw new dep();
            case 1:
                return b();
            case 2:
                return Long.valueOf(c());
            case 3:
                return d().a();
            case 4:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) e();
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    arrayList.add(((st3) obj).a());
                }
                return arrayList;
            case 6:
                return Double.valueOf(g());
            default:
                qp2.g(us3.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
                return null;
        }
    }

    public final Object a(Class cls) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, dep, NegativeArraySizeException {
        int iA = u0h.a(1036135034, 1174417764, -1634246151, 697652827) ^ 247484496;
        int i = this.g;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        Class cls2 = Double.TYPE;
        Class cls3 = Short.TYPE;
        Class cls4 = Byte.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        Class cls7 = Float.TYPE;
        switch (i2) {
            case 0:
                throw new dep();
            case 1:
                return b();
            case 2:
                long jC = c();
                if (!cls.equals(Byte.class) && !cls.equals(cls4)) {
                    if (cls.equals(Short.class) || cls.equals(cls3)) {
                        return Short.valueOf((short) ((((int) jC) << iA) >> iA));
                    }
                    if (cls.equals(Integer.class) || cls.equals(cls6)) {
                        return Integer.valueOf(Math.toIntExact(jC));
                    }
                    if (!cls.equals(Long.class) && !cls.equals(cls5)) {
                        if (cls.equals(Float.class) || cls.equals(cls7)) {
                            return Float.valueOf(jC);
                        }
                        if (cls.equals(Double.class) || cls.equals(cls2)) {
                            return Double.valueOf(jC);
                        }
                        if (cls.equals(Boolean.class) || cls.equals(Boolean.TYPE)) {
                            return Boolean.valueOf(jC != 0);
                        }
                        if (!cls.equals(Character.class) && !cls.equals(Character.TYPE)) {
                            if (!cls.equals(Object.class)) {
                                throw new dep();
                            }
                        }
                    }
                    return Long.valueOf(jC);
                }
                return Byte.valueOf((byte) ((((int) jC) << 24) >> 24));
            case 3:
                ws3 ws3VarD = d();
                if (cls.equals(ws3.class)) {
                    return ws3VarD;
                }
                if (cls.equals(Object.class)) {
                    ws3VarD.getClass();
                    Charset charsetForName = Charset.forName(us3.a("Hn2H4l0="));
                    byte[] bArr = ws3VarD.a;
                    return new String(bArr, 0, bArr.length, charsetForName);
                }
                if (!cls.equals(String.class)) {
                    if (cls.equals(byte[].class)) {
                        return ws3VarD.a();
                    }
                    throw new dep();
                }
                ws3VarD.getClass();
                Charset charsetForName2 = Charset.forName(us3.a("Hn2H4l0="));
                byte[] bArr2 = ws3VarD.a;
                return new String(bArr2, 0, bArr2.length, charsetForName2);
            case 4:
                if (cls.equals(ArrayList.class) || cls.equals(Object.class) || cls.equals(AbstractList.class) || cls.equals(AbstractCollection.class) || cls.equals(Serializable.class) || cls.equals(Cloneable.class) || cls.equals(Iterable.class) || cls.equals(Collection.class) || cls.equals(List.class) || cls.equals(RandomAccess.class)) {
                    return a();
                }
                if (!cls.isArray()) {
                    throw new dep();
                }
                List listE = e();
                Class<?> componentType = cls.getComponentType();
                ArrayList arrayList = (ArrayList) listE;
                Object objNewInstance = Array.newInstance(componentType, arrayList.size());
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    Array.set(objNewInstance, i3, ((st3) arrayList.get(i3)).a((Class) componentType));
                }
                return objNewInstance;
            case 5:
                return f();
            case 6:
                double dG = g();
                if (cls.equals(Float.class) || cls.equals(cls7)) {
                    return Float.valueOf((float) dG);
                }
                if (cls.equals(Integer.class) || cls.equals(cls6)) {
                    return Integer.valueOf((int) dG);
                }
                if (cls.equals(Long.class) || cls.equals(cls5)) {
                    return Long.valueOf((long) dG);
                }
                if (cls.equals(Byte.class) || cls.equals(cls4)) {
                    return Byte.valueOf((byte) ((((int) dG) << 24) >> 24));
                }
                if (cls.equals(Short.class) || cls.equals(cls3)) {
                    return Short.valueOf((short) ((((int) dG) << iA) >> iA));
                }
                if (cls.equals(Double.class) || cls.equals(cls2) || cls.equals(Object.class)) {
                    return Double.valueOf(dG);
                }
                throw new dep();
            default:
                qp2.g(us3.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
                return null;
        }
    }

    public final void a(int i) throws dep {
        if (i != this.g) {
            throw new dep();
        }
    }

    public final void a(ByteArrayOutputStream byteArrayOutputStream) throws IOException, dep {
        long[] jArr = {1269833163, 1628598594, 308676977, 1629286434, 15633520, 3337700125L, 1402923307, 613197917, 297598514};
        int i = 0;
        long j = jArr[0];
        long j2 = jArr[1];
        int i2 = 2;
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = ((((((~j) & j2) | j3) + ((j & j4) | j5)) - jArr[5]) + jArr[6]) ^ (jArr[7] % jArr[8]);
        int iA = u0h.a(2133792663, -169454993, -2025383063, 91654737) ^ 213591825;
        int i3 = this.g;
        int i4 = iA + i3;
        if (i3 == 0) {
            throw null;
        }
        switch (i4) {
            case 0:
            case 1:
            case 5:
                throw new dep();
            case 2:
                dpj.i(c(), new e7(1, byteArrayOutputStream), true);
                return;
            case 3:
                ws3 ws3VarD = d();
                dpj.i(ws3VarD.a.length * j6, new e7(i, byteArrayOutputStream), true);
                byteArrayOutputStream.write(ws3VarD.a);
                return;
            case 4:
                ArrayList arrayList = (ArrayList) e();
                dpj.i(arrayList.size(), new e7(i2, byteArrayOutputStream), true);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((st3) obj).a(byteArrayOutputStream);
                }
                return;
            case 6:
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(g());
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate.putLong(jDoubleToRawLongBits);
                byte[] bArrArray = byteBufferAllocate.array();
                int length = bArrArray.length;
                while (i < length) {
                    byteArrayOutputStream.write(bArrArray[i]);
                    i++;
                }
                int length2 = byteBufferAllocate.array().length;
                return;
            default:
                return;
        }
    }

    public final Object b() throws dep {
        int[] iArr = {427355115, 404248040, 1318670750, 874677346, 1819730563, -970011213, 126401947, 1858504292, 235745791};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        a(u0h.a(((~i) & i2) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]));
        return this.a;
    }

    public final long c() throws dep {
        int[] iArr = {1646478179, 763209928, 1529626135, 609321208, 1403807536, -1382063087, 25624641, 1388803074, 733327814};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        a(u0h.a(((~i) & i2) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]));
        return this.b;
    }

    public final ws3 d() throws dep {
        int[] iArr = {2059344234, 1917530355, 739411611, 1399403104, 95815174, 2094390031, 51245830, 1312994984, 1140384172};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        a(u0h.a(((~i) & i2) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]));
        return this.d;
    }

    public final List e() throws dep {
        int[] iArr = {1435218189, 1093276829, 949583962, 1092752517, 575966040, -2054938211, 262178224, 1891252715, 1250801052};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        a(u0h.a(((~i) & i2) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]));
        return this.e;
    }

    public final g9p f() throws dep {
        int[] iArr = {672139932, 1821026951, 1629321417, 214090246, 828986457, -1439766056, 580508860, 1579068977, 395191309};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        a(u0h.a(((~i) & i2) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]));
        return this.f;
    }

    public final double g() throws dep {
        int[] iArr = {1714636915, 1758565445, 174653454, 1653642817, 38095532, -1976041400, 596516649, 1804289383, 846930886};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        a(u0h.a(((~i) & i2) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]));
        return this.c;
    }

    public final void h() {
        this.g = 1;
        this.b = 0L;
        this.a = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
