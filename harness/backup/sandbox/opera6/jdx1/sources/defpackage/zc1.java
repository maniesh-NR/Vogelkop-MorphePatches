package defpackage;

/* loaded from: classes.dex */
public final class zc1 implements g2o {
    public final short a;
    public final String b;
    public final t0g c = hyg.k(r9b.e);
    public final t0g d = hyg.k(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    public zc1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.g2o
    public final int a(n27 n27Var) {
        return e().b;
    }

    @Override // defpackage.g2o
    public final int b(n27 n27Var, d2c d2cVar) {
        return e().c;
    }

    @Override // defpackage.g2o
    public final int c(n27 n27Var) {
        return e().d;
    }

    @Override // defpackage.g2o
    public final int d(n27 n27Var, d2c d2cVar) {
        return e().a;
    }

    public final r9b e() {
        return (r9b) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zc1) {
            return this.a == ((zc1) obj).a;
        }
        return false;
    }

    public final void f(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void g(g3o g3oVar, int i) {
        short s = this.a;
        if (i == 0 || (i & s) != 0) {
            this.c.setValue(g3oVar.a.i(s));
            f(g3oVar.a.u(s));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = e().a;
        int i2 = e().b;
        int i3 = e().c;
        int i4 = e().d;
        StringBuilder sb = new StringBuilder(this.b);
        sb.append("(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        vep.w(i3, i4, ", ", ", ", sb);
        sb.append(")");
        return sb.toString();
    }
}
