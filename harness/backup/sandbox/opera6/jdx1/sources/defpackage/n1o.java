package defpackage;

/* loaded from: classes.dex */
public final class n1o implements iud {
    public final pd3 a;

    public n1o(pd3 pd3Var) {
        this.a = pd3Var;
    }

    @Override // defpackage.iud
    public final int a(ccb ccbVar, long j, int i, d2c d2cVar) {
        int i2 = (int) (j >> 32);
        if (i >= i2) {
            return Math.round((1.0f + (d2cVar == d2c.a ? 0.0f : -0.0f)) * ((i2 - i) / 2.0f));
        }
        return djh.c(this.a.a(i, i2, d2cVar), 0, i2 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n1o) && this.a.equals(((n1o) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a) * 31;
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ", margin=0)";
    }
}
