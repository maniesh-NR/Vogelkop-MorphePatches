package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class fig {
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final Object a;
    public final int b;
    public final qjd c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        String str = tym.a;
        j = "0";
        k = "1";
        l = "2";
        m = "3";
        n = "4";
        o = "5";
        p = "6";
    }

    public fig(Object obj, int i, qjd qjdVar, Object obj2, int i2, long j2, long j3, int i3, int i4) {
        z4o.w(i >= 0);
        z4o.w(i2 >= 0);
        this.a = obj;
        this.b = i;
        this.c = qjdVar;
        this.d = obj2;
        this.e = i2;
        this.f = j2;
        this.g = j3;
        this.h = i3;
        this.i = i4;
    }

    public static fig c(Bundle bundle) {
        int iMax = Math.max(0, bundle.getInt(j, 0));
        Bundle bundle2 = bundle.getBundle(k);
        return new fig(null, iMax, bundle2 == null ? null : qjd.b(bundle2), null, Math.max(0, bundle.getInt(l, 0)), bundle.getLong(m, 0L), bundle.getLong(n, 0L), bundle.getInt(o, -1), bundle.getInt(p, -1));
    }

    public final boolean a(fig figVar) {
        return this.b == figVar.b && this.e == figVar.e && this.f == figVar.f && this.g == figVar.g && this.h == figVar.h && this.i == figVar.i && Objects.equals(this.c, figVar.c);
    }

    public final fig b(boolean z, boolean z2) {
        long j2;
        long j3;
        int i;
        int i2;
        if (z && z2) {
            return this;
        }
        int i3 = z2 ? this.b : 0;
        qjd qjdVar = z ? this.c : null;
        int i4 = z2 ? this.e : 0;
        if (z) {
            long j4 = this.f;
            long j5 = this.g;
            i = this.h;
            i2 = this.i;
            j3 = j5;
            j2 = j4;
        } else {
            j2 = 0;
            j3 = 0;
            i = -1;
            i2 = -1;
        }
        return new fig(this.a, i3, qjdVar, this.d, i4, j2, j3, i, i2);
    }

    public final Bundle d(int i) {
        Bundle bundle = new Bundle();
        int i2 = this.b;
        if (i < 3 || i2 != 0) {
            bundle.putInt(j, i2);
        }
        qjd qjdVar = this.c;
        if (qjdVar != null) {
            bundle.putBundle(k, qjdVar.c(false));
        }
        int i3 = this.e;
        if (i < 3 || i3 != 0) {
            bundle.putInt(l, i3);
        }
        long j2 = this.f;
        if (i < 3 || j2 != 0) {
            bundle.putLong(m, j2);
        }
        long j3 = this.g;
        if (i < 3 || j3 != 0) {
            bundle.putLong(n, j3);
        }
        int i4 = this.h;
        if (i4 != -1) {
            bundle.putInt(o, i4);
        }
        int i5 = this.i;
        if (i5 != -1) {
            bundle.putInt(p, i5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fig.class == obj.getClass()) {
            fig figVar = (fig) obj;
            if (a(figVar) && Objects.equals(this.a, figVar.a) && Objects.equals(this.d, figVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.b + ", period=" + this.e + ", pos=" + this.f;
        int i = this.h;
        if (i == -1) {
            return str;
        }
        StringBuilder sbR = p3p.r(str, ", contentPos=");
        sbR.append(this.g);
        sbR.append(", adGroup=");
        sbR.append(i);
        sbR.append(", ad=");
        sbR.append(this.i);
        return sbR.toString();
    }
}
