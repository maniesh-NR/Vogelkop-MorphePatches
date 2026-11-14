package defpackage;

/* loaded from: classes.dex */
public final class h9g implements ax5 {
    public final float a;

    public h9g(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            d8b.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.ax5
    public final float a(long j, n27 n27Var) {
        return (this.a / 100.0f) * bpj.c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h9g) && Float.compare(this.a, ((h9g) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
