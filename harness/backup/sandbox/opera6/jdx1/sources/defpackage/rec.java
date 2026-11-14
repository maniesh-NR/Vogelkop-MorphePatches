package defpackage;

/* loaded from: classes.dex */
public final class rec {
    public static final rec d = new rec(oec.c, 17, 0);
    public final float a;
    public final int b;
    public final int c;

    public rec(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rec)) {
            return false;
        }
        rec recVar = (rec) obj;
        float f = recVar.a;
        float f2 = oec.b;
        return Float.compare(this.a, f) == 0 && this.b == recVar.b && this.c == recVar.c;
    }

    public final int hashCode() {
        float f = oec.b;
        return Integer.hashCode(this.c) + rfp.c(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String strB = oec.b(this.a);
        String str = "Invalid";
        int i = this.b;
        String str2 = i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        int i2 = this.c;
        if (i2 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str = "LineHeightStyle.Mode.Tight";
        }
        return z1m.l(z1m.n("LineHeightStyle(alignment=", strB, ", trim=", str2, ",mode="), str, ")");
    }
}
