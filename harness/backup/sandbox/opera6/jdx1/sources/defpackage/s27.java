package defpackage;

/* loaded from: classes.dex */
public final class s27 implements n27 {
    public final float a;
    public final float b;
    public final di9 c;

    public s27(float f, float f2, di9 di9Var) {
        this.a = f;
        this.b = f2;
        this.c = di9Var;
    }

    @Override // defpackage.n27
    public final float b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s27)) {
            return false;
        }
        s27 s27Var = (s27) obj;
        return Float.compare(this.a, s27Var.a) == 0 && Float.compare(this.b, s27Var.b) == 0 && this.c.equals(s27Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + sko.d(this.b, Float.hashCode(this.a) * 31, 31);
    }

    @Override // defpackage.n27
    public final long j(float f) {
        return rih.s(4294967296L, this.c.a(f));
    }

    @Override // defpackage.n27
    public final float n0() {
        return this.b;
    }

    @Override // defpackage.n27
    public final float o(long j) {
        if (skl.a(rkl.b(j), 4294967296L)) {
            return this.c.b(rkl.c(j));
        }
        qp2.n("Only Sp can convert to Px");
        return 0.0f;
    }

    public final String toString() {
        StringBuilder sbP = am2.p("DensityWithConverter(density=", this.a, ", fontScale=", this.b, ", converter=");
        sbP.append(this.c);
        sbP.append(")");
        return sbP.toString();
    }
}
