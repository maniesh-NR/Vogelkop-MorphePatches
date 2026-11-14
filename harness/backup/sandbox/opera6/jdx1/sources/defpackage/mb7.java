package defpackage;

/* loaded from: classes.dex */
public final class mb7 {
    public final lb7 a;

    static {
        new mb7("", 0, 0);
    }

    public mb7(String str, int i, int i2) {
        this.a = new lb7(str, i, i2);
    }

    public static mb7 a(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        String string;
        if (z) {
            int i7 = i / 2;
            int i8 = i2 / 2;
            StringBuilder sbO = sko.o(i8, i7, "M0,", " A", ",");
            sko.r(i8, i, " 0 1,1 ", ",", sbO);
            sko.r(i8, i7, " A", ",", sbO);
            sbO.append(i8);
            sbO.append(" 0 1,1 0,");
            sbO.append(i8);
            sbO.append(" Z");
            string = sbO.toString();
        } else {
            StringBuilder sb = new StringBuilder("M ");
            int iMin = Math.min(i / 2, i2 / 2);
            int iMin2 = Math.min(iMin, i3);
            int iMin3 = Math.min(iMin, i4);
            int iMin4 = Math.min(iMin, i5);
            int iMin5 = Math.min(iMin, i6);
            sb.append(iMin2);
            sb.append(",0 L ");
            sb.append(i - iMin3);
            sb.append(",0");
            if (iMin3 > 0) {
                vep.w(iMin3, iMin3, " A ", ",", sb);
                vep.w(i, iMin3, " 0 0,1 ", ",", sb);
            }
            sb.append(" L ");
            sb.append(i);
            sb.append(",");
            sb.append(i2 - iMin4);
            if (iMin4 > 0) {
                vep.w(iMin4, iMin4, " A ", ",", sb);
                sb.append(" 0 0,1 ");
                sb.append(i - iMin4);
                sb.append(",");
                sb.append(i2);
            }
            vep.w(iMin5, i2, " L ", ",", sb);
            if (iMin5 > 0) {
                vep.w(iMin5, iMin5, " A ", ",", sb);
                sb.append(" 0 0,1 0,");
                sb.append(i2 - iMin5);
            }
            if (iMin2 > 0) {
                vep.w(iMin2, iMin2, " L 0,", " A ", sb);
                vep.w(iMin2, iMin2, ",", " 0 0,1 ", sb);
                sb.append(",0");
            }
            sb.append(" Z");
            string = sb.toString();
        }
        return new mb7(string, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mb7) {
            return this.a.equals(((mb7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
