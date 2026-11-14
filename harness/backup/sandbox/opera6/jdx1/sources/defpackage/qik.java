package defpackage;

/* loaded from: classes.dex */
public final class qik extends nk7 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public qik(int i, int i2, float f, float f2, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qik)) {
            return false;
        }
        qik qikVar = (qik) obj;
        return this.a == qikVar.a && this.b == qikVar.b && this.c == qikVar.c && this.d == qikVar.d;
    }

    public final int hashCode() {
        return rfp.c(this.d, rfp.c(this.c, sko.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        String str = "Unknown";
        int i = this.c;
        String str2 = i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown";
        int i2 = this.d;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        return sko.n(am2.p("Stroke(width=", this.a, ", miter=", this.b, ", cap="), str2, ", join=", str, ", pathEffect=null)");
    }
}
