package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yf8 implements g2o {
    public final tlm a;
    public final g2o b;

    public yf8(tlm tlmVar, g2o g2oVar) {
        this.a = tlmVar;
        this.b = g2oVar;
    }

    @Override // defpackage.g2o
    public final int a(n27 n27Var) {
        int iA = this.a.a(n27Var) - this.b.a(n27Var);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // defpackage.g2o
    public final int b(n27 n27Var, d2c d2cVar) {
        int iB = this.a.b(n27Var, d2cVar) - this.b.b(n27Var, d2cVar);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // defpackage.g2o
    public final int c(n27 n27Var) {
        int iC = this.a.c(n27Var) - this.b.c(n27Var);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // defpackage.g2o
    public final int d(n27 n27Var, d2c d2cVar) {
        int iD = this.a.d(n27Var, d2cVar) - this.b.d(n27Var, d2cVar);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf8)) {
            return false;
        }
        yf8 yf8Var = (yf8) obj;
        return Intrinsics.a(yf8Var.a, this.a) && Intrinsics.a(yf8Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ")";
    }
}
