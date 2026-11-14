package ads_mobile_sdk;

import defpackage.pio;
import defpackage.rw4;
import defpackage.zfp;

/* loaded from: classes.dex */
public final class gm0 {
    public final ca3 a;
    public boolean b;

    static {
        new gm0(new ca3()).a();
    }

    public gm0() {
        this.a = new ca3();
    }

    public gm0(ca3 ca3Var) {
        this.a = ca3Var;
        a();
    }

    public static int a(cs3 cs3Var, int i, Object obj) {
        int iA;
        int i2;
        int iH = ov.h(i);
        if (cs3Var == cs3.e) {
            iH <<= 1;
        }
        int iA2 = 4;
        switch (cs3Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iA2 = 8;
                return iA2 + iH;
            case 1:
                ((Float) obj).getClass();
                return iA2 + iH;
            case 2:
                iA2 = ov.a(((Long) obj).longValue());
                return iA2 + iH;
            case 3:
                iA2 = ov.a(((Long) obj).longValue());
                return iA2 + iH;
            case 4:
                iA2 = ov.a(((Integer) obj).intValue());
                return iA2 + iH;
            case 5:
                ((Long) obj).getClass();
                iA2 = 8;
                return iA2 + iH;
            case 6:
                ((Integer) obj).getClass();
                return iA2 + iH;
            case 7:
                ((Boolean) obj).getClass();
                iA2 = 1;
                return iA2 + iH;
            case 8:
                if (obj instanceof hr) {
                    iA = ((hr) obj).size();
                    i2 = ov.i(iA);
                } else {
                    iA = sm3.a.a((String) obj);
                    i2 = ov.i(iA);
                }
                iA2 = i2 + iA;
                return iA2 + iH;
            case 9:
                iA2 = ((ku0) ((g) obj)).a((pio) null);
                return iA2 + iH;
            case 10:
                iA = ((ku0) ((g) obj)).a((pio) null);
                i2 = ov.i(iA);
                iA2 = i2 + iA;
                return iA2 + iH;
            case 11:
                if (obj instanceof hr) {
                    iA = ((hr) obj).size();
                    i2 = ov.i(iA);
                } else {
                    iA = ((byte[]) obj).length;
                    i2 = ov.i(iA);
                }
                iA2 = i2 + iA;
                return iA2 + iH;
            case 12:
                iA2 = ov.i(((Integer) obj).intValue());
                return iA2 + iH;
            case 13:
                iA2 = obj instanceof zfp ? ov.a(((zfp) obj).getNumber()) : ov.a(((Integer) obj).intValue());
                return iA2 + iH;
            case 14:
                ((Integer) obj).getClass();
                return iA2 + iH;
            case 15:
                ((Long) obj).getClass();
                iA2 = 8;
                return iA2 + iH;
            case 16:
                iA2 = ov.i(ov.j(((Integer) obj).intValue()));
                return iA2 + iH;
            case 17:
                iA2 = ov.a(ov.b(((Long) obj).longValue()));
                return iA2 + iH;
            default:
                h9o.r("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    public static void a(ov ovVar, cs3 cs3Var, int i, Object obj) {
        if (cs3Var == cs3.e) {
            ovVar.g(i, 3);
            ((ku0) ((g) obj)).a(ovVar);
            ovVar.g(i, 4);
        }
        ovVar.g(i, cs3Var.b);
        switch (cs3Var.ordinal()) {
            case 0:
                ovVar.c(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                ovVar.k(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                ovVar.d(((Long) obj).longValue());
                break;
            case 3:
                ovVar.d(((Long) obj).longValue());
                break;
            case 4:
                ovVar.l(((Integer) obj).intValue());
                break;
            case 5:
                ovVar.c(((Long) obj).longValue());
                break;
            case 6:
                ovVar.k(((Integer) obj).intValue());
                break;
            case 7:
                ovVar.a(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof hr)) {
                    ovVar.a((String) obj);
                    break;
                } else {
                    ovVar.b((hr) obj);
                    break;
                }
            case 9:
                ((ku0) ((g) obj)).a(ovVar);
                break;
            case 10:
                ovVar.b((g) obj);
                break;
            case 11:
                if (!(obj instanceof hr)) {
                    byte[] bArr = (byte[]) obj;
                    ovVar.a$1(bArr.length, bArr);
                    break;
                } else {
                    ovVar.b((hr) obj);
                    break;
                }
            case 12:
                ovVar.m(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zfp)) {
                    ovVar.l(((Integer) obj).intValue());
                    break;
                } else {
                    ovVar.l(((zfp) obj).getNumber());
                    break;
                }
            case 14:
                ovVar.k(((Integer) obj).intValue());
                break;
            case 15:
                ovVar.c(((Long) obj).longValue());
                break;
            case 16:
                ovVar.m(ov.j(((Integer) obj).intValue()));
                break;
            case 17:
                ovVar.d(ov.b(((Long) obj).longValue()));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        ca3 ca3Var = this.a;
        ca3Var.b$1();
        if (ca3Var.b > 0) {
            ca3Var.b$1();
            if (ca3Var.b <= 0) {
                throw new ArrayIndexOutOfBoundsException(0);
            }
            throw sko.g(ca3Var.a[0]);
        }
        if (!ca3Var.c) {
            ca3Var.b$1();
            Object[] objArr = ca3Var.a;
            if (objArr != null && ca3Var.b > 0) {
                throw sko.g(objArr[0]);
            }
            ca3Var.c = true;
        }
        this.b = true;
    }

    public final Object clone() {
        gm0 gm0Var = new gm0();
        ca3 ca3Var = this.a;
        ca3Var.b$1();
        if (ca3Var.b <= 0) {
            return gm0Var;
        }
        ca3Var.b$1();
        if (ca3Var.b > 0) {
            throw sko.g(ca3Var.a[0]);
        }
        throw new ArrayIndexOutOfBoundsException(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm0)) {
            return false;
        }
        ca3 ca3Var = ((gm0) obj).a;
        ca3 ca3Var2 = this.a;
        ca3Var2.b$1();
        int i = ca3Var2.b;
        ca3Var.b$1();
        if (i != ca3Var.b || !ca3Var2.keySet().equals(ca3Var.keySet())) {
            return false;
        }
        rw4 rw4Var = (rw4) ((defpackage.l72) ca3Var2.entrySet()).iterator();
        if (!rw4Var.hasNext()) {
            return true;
        }
        rw4Var.next();
        throw null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
