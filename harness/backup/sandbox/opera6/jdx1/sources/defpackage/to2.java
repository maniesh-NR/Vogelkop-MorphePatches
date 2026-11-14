package defpackage;

import android.util.Range;
import android.util.Size;

/* loaded from: classes.dex */
public final class to2 {
    public static final Range h = new Range(0, 0);
    public final Size a;
    public final Size b;
    public final ip7 c;
    public final int d;
    public final Range e;
    public final eb4 f;
    public final boolean g;

    public to2(Size size, Size size2, ip7 ip7Var, int i, Range range, eb4 eb4Var, boolean z) {
        this.a = size;
        this.b = size2;
        this.c = ip7Var;
        this.d = i;
        this.e = range;
        this.f = eb4Var;
        this.g = z;
    }

    public static ne5 a(Size size) {
        ne5 ne5Var = new ne5();
        ne5Var.S(size);
        ne5Var.b = size;
        ne5Var.d = 0;
        Range range = h;
        if (range == null) {
            t3p.q("Null expectedFrameRateRange");
            return null;
        }
        ne5Var.e = range;
        ne5Var.c = ip7.d;
        ne5Var.g = Boolean.FALSE;
        return ne5Var;
    }

    public final ne5 b() {
        ne5 ne5Var = new ne5();
        ne5Var.a = this.a;
        ne5Var.b = this.b;
        ne5Var.c = this.c;
        ne5Var.d = Integer.valueOf(this.d);
        ne5Var.e = this.e;
        ne5Var.f = this.f;
        ne5Var.g = Boolean.valueOf(this.g);
        return ne5Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof to2) {
            to2 to2Var = (to2) obj;
            if (this.a.equals(to2Var.a) && this.b.equals(to2Var.b) && this.c.equals(to2Var.c) && this.d == to2Var.d && this.e.equals(to2Var.e)) {
                eb4 eb4Var = to2Var.f;
                eb4 eb4Var2 = this.f;
                if (eb4Var2 == null) {
                    if (eb4Var == null) {
                    }
                } else if (eb4Var2 != eb4Var) {
                    return false;
                }
                if (this.g == to2Var.g) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        eb4 eb4Var = this.f;
        return ((iHashCode ^ (eb4Var == null ? 0 : eb4Var.hashCode())) * 1000003) ^ (this.g ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.a);
        sb.append(", originalConfiguredResolution=");
        sb.append(this.b);
        sb.append(", dynamicRange=");
        sb.append(this.c);
        sb.append(", sessionType=");
        sb.append(this.d);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.e);
        sb.append(", implementationOptions=");
        sb.append(this.f);
        sb.append(", zslDisabled=");
        return z1m.m(sb, this.g, "}");
    }
}
