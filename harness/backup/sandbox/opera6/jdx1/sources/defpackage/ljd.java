package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class ljd {
    public static final ljd f = new ljd(new kjd());
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        String str = tym.a;
        g = "0";
        h = "1";
        i = "2";
        j = "3";
        k = "4";
    }

    public ljd(kjd kjdVar) {
        long j2 = kjdVar.a;
        long j3 = kjdVar.b;
        long j4 = kjdVar.c;
        float f2 = kjdVar.d;
        float f3 = kjdVar.e;
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = f2;
        this.e = f3;
    }

    public static ljd b(Bundle bundle) {
        kjd kjdVar = new kjd();
        ljd ljdVar = f;
        kjdVar.a = bundle.getLong(g, ljdVar.a);
        kjdVar.b = bundle.getLong(h, ljdVar.b);
        kjdVar.c = bundle.getLong(i, ljdVar.c);
        kjdVar.d = bundle.getFloat(j, ljdVar.d);
        kjdVar.e = bundle.getFloat(k, ljdVar.e);
        return new ljd(kjdVar);
    }

    public final kjd a() {
        kjd kjdVar = new kjd();
        kjdVar.a = this.a;
        kjdVar.b = this.b;
        kjdVar.c = this.c;
        kjdVar.d = this.d;
        kjdVar.e = this.e;
        return kjdVar;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        ljd ljdVar = f;
        long j2 = ljdVar.a;
        long j3 = this.a;
        if (j3 != j2) {
            bundle.putLong(g, j3);
        }
        long j4 = ljdVar.b;
        long j5 = this.b;
        if (j5 != j4) {
            bundle.putLong(h, j5);
        }
        long j6 = ljdVar.c;
        long j7 = this.c;
        if (j7 != j6) {
            bundle.putLong(i, j7);
        }
        float f2 = ljdVar.d;
        float f3 = this.d;
        if (f3 != f2) {
            bundle.putFloat(j, f3);
        }
        float f4 = ljdVar.e;
        float f5 = this.e;
        if (f5 != f4) {
            bundle.putFloat(k, f5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljd)) {
            return false;
        }
        ljd ljdVar = (ljd) obj;
        return this.a == ljdVar.a && this.b == ljdVar.b && this.c == ljdVar.c && this.d == ljdVar.d && this.e == ljdVar.e;
    }

    public final int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.c;
        int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        float f2 = this.d;
        int iFloatToIntBits = (i3 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.e;
        return iFloatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
    }
}
