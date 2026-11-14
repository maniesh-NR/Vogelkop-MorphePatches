package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class cec implements g2o {
    public final g2o a;
    public final int b;

    public cec(g2o g2oVar, int i) {
        this.a = g2oVar;
        this.b = i;
    }

    @Override // defpackage.g2o
    public final int a(n27 n27Var) {
        if ((this.b & 16) != 0) {
            return this.a.a(n27Var);
        }
        return 0;
    }

    @Override // defpackage.g2o
    public final int b(n27 n27Var, d2c d2cVar) {
        if ((this.b & (d2cVar == d2c.a ? 4 : 1)) != 0) {
            return this.a.b(n27Var, d2cVar);
        }
        return 0;
    }

    @Override // defpackage.g2o
    public final int c(n27 n27Var) {
        if ((this.b & 32) != 0) {
            return this.a.c(n27Var);
        }
        return 0;
    }

    @Override // defpackage.g2o
    public final int d(n27 n27Var, d2c d2cVar) {
        if ((this.b & (d2cVar == d2c.a ? 8 : 2)) != 0) {
            return this.a.d(n27Var, d2cVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cec)) {
            return false;
        }
        cec cecVar = (cec) obj;
        return Intrinsics.a(this.a, cecVar.a) && this.b == cecVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        if ((i & 9) == 9) {
            a4h.s(sb, "Start");
        }
        if ((i & 10) == 10) {
            a4h.s(sb, "Left");
        }
        if ((i & 16) == 16) {
            a4h.s(sb, "Top");
        }
        if ((i & 6) == 6) {
            a4h.s(sb, "End");
        }
        if ((i & 5) == 5) {
            a4h.s(sb, "Right");
        }
        if ((i & 32) == 32) {
            a4h.s(sb, "Bottom");
        }
        return "(" + this.a + " only " + sko.k("WindowInsetsSides(", sb.toString(), ")") + ")";
    }
}
