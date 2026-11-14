package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ro {
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public final long a;
    public final int b;
    public final int c;
    public final Uri[] d;
    public final qjd[] e;
    public final int[] f;
    public final long[] g;
    public final String[] h;
    public final so[] i;
    public final long j;
    public final boolean k;
    public final boolean l;

    static {
        String str = tym.a;
        m = "0";
        n = "1";
        o = "2";
        p = "3";
        q = "4";
        r = "5";
        s = "6";
        t = "7";
        u = "8";
        v = "9";
        w = "a";
        x = "b";
    }

    public ro(long j, int i, int i2, int[] iArr, qjd[] qjdVarArr, long[] jArr, long j2, boolean z, String[] strArr, so[] soVarArr, boolean z2) {
        Uri uri;
        int i3 = 0;
        z4o.w(iArr.length == qjdVarArr.length);
        z4o.w(iArr.length == soVarArr.length);
        this.a = j;
        this.b = i;
        this.c = i2;
        this.f = iArr;
        this.e = qjdVarArr;
        this.g = jArr;
        this.j = j2;
        this.k = z;
        this.d = new Uri[qjdVarArr.length];
        while (true) {
            Uri[] uriArr = this.d;
            if (i3 >= uriArr.length) {
                this.h = strArr;
                this.i = soVarArr;
                this.l = z2;
                return;
            }
            qjd qjdVar = qjdVarArr[i3];
            if (qjdVar == null) {
                uri = null;
            } else {
                mjd mjdVar = qjdVar.b;
                mjdVar.getClass();
                uri = mjdVar.a;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f;
            if (i3 >= iArr.length || this.k || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ro.class != obj.getClass()) {
            return false;
        }
        ro roVar = (ro) obj;
        return this.a == roVar.a && this.b == roVar.b && this.c == roVar.c && Arrays.equals(this.e, roVar.e) && Arrays.equals(this.f, roVar.f) && Arrays.equals(this.g, roVar.g) && this.j == roVar.j && this.k == roVar.k && Arrays.equals(this.h, roVar.h) && Arrays.equals(this.i, roVar.i) && this.l == roVar.l;
    }

    public final int hashCode() {
        int i = ((this.b * 31) + this.c) * 31;
        long j = this.a;
        int iHashCode = (Arrays.hashCode(this.g) + ((Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31)) * 31)) * 31;
        long j2 = this.j;
        return ((Arrays.hashCode(this.i) + ((((((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.k ? 1 : 0)) * 31) + Arrays.hashCode(this.h)) * 31)) * 31) + (this.l ? 1 : 0);
    }
}
