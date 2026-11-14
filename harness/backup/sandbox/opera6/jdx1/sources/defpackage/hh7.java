package defpackage;

/* loaded from: classes.dex */
public final class hh7 implements ax5 {
    public final float a;

    public hh7(float f) {
        this.a = f;
    }

    @Override // defpackage.ax5
    public final float a(long j, n27 n27Var) {
        return n27Var.o0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof hh7) && gh7.b(this.a, ((hh7) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
