package defpackage;

/* loaded from: classes.dex */
public final class ip7 {
    public static final ip7 c = new ip7(0, 0);
    public static final ip7 d = new ip7(1, 8);
    public static final ip7 e = new ip7(3, 10);
    public static final ip7 f = new ip7(4, 10);
    public static final ip7 g = new ip7(5, 10);
    public static final ip7 h = new ip7(6, 10);
    public static final ip7 i = new ip7(6, 8);
    public final int a;
    public final int b;

    public ip7(int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    public final boolean a() {
        return b() && this.a != 1 && this.b == 10;
    }

    public final boolean b() {
        int i2 = this.a;
        return (i2 == 0 || i2 == 2 || this.b == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ip7) {
            ip7 ip7Var = (ip7) obj;
            if (this.a == ip7Var.a && this.b == ip7Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DynamicRange@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("{encoding=");
        switch (this.a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb.append(str);
        sb.append(", bitDepth=");
        return p3p.k(this.b, "}", sb);
    }
}
