package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tlm implements g2o {
    public final g2o a;
    public final g2o b;

    public tlm(g2o g2oVar, g2o g2oVar2) {
        this.a = g2oVar;
        this.b = g2oVar2;
    }

    @Override // defpackage.g2o
    public final int a(n27 n27Var) {
        return Math.max(this.a.a(n27Var), this.b.a(n27Var));
    }

    @Override // defpackage.g2o
    public final int b(n27 n27Var, d2c d2cVar) {
        return Math.max(this.a.b(n27Var, d2cVar), this.b.b(n27Var, d2cVar));
    }

    @Override // defpackage.g2o
    public final int c(n27 n27Var) {
        return Math.max(this.a.c(n27Var), this.b.c(n27Var));
    }

    @Override // defpackage.g2o
    public final int d(n27 n27Var, d2c d2cVar) {
        return Math.max(this.a.d(n27Var, d2cVar), this.b.d(n27Var, d2cVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlm)) {
            return false;
        }
        tlm tlmVar = (tlm) obj;
        return Intrinsics.a(tlmVar.a, this.a) && Intrinsics.a(tlmVar.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ")";
    }
}
