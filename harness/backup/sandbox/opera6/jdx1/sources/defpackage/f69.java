package defpackage;

/* loaded from: classes.dex */
public final class f69 implements g2o {
    public final int a;

    public f69(int i) {
        this.a = i;
    }

    @Override // defpackage.g2o
    public final int a(n27 n27Var) {
        return this.a;
    }

    @Override // defpackage.g2o
    public final int b(n27 n27Var, d2c d2cVar) {
        return 0;
    }

    @Override // defpackage.g2o
    public final int c(n27 n27Var) {
        return 0;
    }

    @Override // defpackage.g2o
    public final int d(n27 n27Var, d2c d2cVar) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f69) && this.a == ((f69) obj).a;
    }

    public final int hashCode() {
        return this.a * 961;
    }

    public final String toString() {
        return p3p.i(this.a, "Insets(left=0, top=", ", right=0, bottom=0)");
    }
}
