package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class to {
    public static final to f = new to(new ro[0], 0, -9223372036854775807L, 0);
    public static final ro g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final int a;
    public final long b;
    public final long c;
    public final int d;
    public final ro[] e;

    static {
        ro roVar = new ro(0L, -1, -1, new int[0], new qjd[0], new long[0], 0L, false, new String[0], new so[0], false);
        int[] iArr = roVar.f;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = roVar.g;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        qjd[] qjdVarArr = (qjd[]) Arrays.copyOf(roVar.e, 0);
        String[] strArr = (String[]) Arrays.copyOf(roVar.h, 0);
        so[] soVarArr = roVar.i;
        g = new ro(roVar.a, 0, roVar.c, iArrCopyOf, qjdVarArr, jArrCopyOf, roVar.j, roVar.k, strArr, (so[]) Arrays.copyOf(soVarArr, Math.max(0, soVarArr.length)), roVar.l);
        String str = tym.a;
        h = "1";
        i = "2";
        j = "3";
        k = "4";
    }

    public to(ro[] roVarArr, long j2, long j3, int i2) {
        this.b = j2;
        this.c = j3;
        this.a = roVarArr.length + i2;
        this.e = roVarArr;
        this.d = i2;
    }

    public final ro a(int i2) {
        int i3 = this.d;
        return i2 < i3 ? g : this.e[i2 - i3];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || to.class != obj.getClass()) {
            return false;
        }
        to toVar = (to) obj;
        return this.a == toVar.a && this.b == toVar.b && this.c == toVar.c && this.d == toVar.d && Arrays.equals(this.e, toVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + (((((((this.a * 961) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + this.d) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb.append(this.b);
        sb.append(", adGroups=[");
        int i2 = 0;
        while (true) {
            ro[] roVarArr = this.e;
            if (i2 >= roVarArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(roVarArr[i2].a);
            sb.append(", ads=[");
            for (int i3 = 0; i3 < roVarArr[i2].f.length; i3++) {
                sb.append("ad(state=");
                int i4 = roVarArr[i2].f[i3];
                if (i4 == 0) {
                    sb.append('_');
                } else if (i4 == 1) {
                    sb.append('R');
                } else if (i4 == 2) {
                    sb.append('S');
                } else if (i4 == 3) {
                    sb.append('P');
                } else if (i4 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(roVarArr[i2].g[i3]);
                sb.append(')');
                if (i3 < roVarArr[i2].f.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i2 < roVarArr.length - 1) {
                sb.append(", ");
            }
            i2++;
        }
    }
}
