package defpackage;

/* loaded from: classes.dex */
public final class y6b implements we1 {
    public final qn7 a;
    public final puh b;
    public final long c;

    public y6b(qn7 qn7Var, puh puhVar, long j) {
        this.a = qn7Var;
        this.b = puhVar;
        this.c = j;
        if (qn7Var instanceof e8m) {
            e8m e8mVar = (e8m) qn7Var;
            if (e8mVar.a != 0 || e8mVar.b != 0) {
                return;
            }
        } else if (qn7Var instanceof stj) {
            if (((stj) qn7Var).a != 0) {
                return;
            }
        } else if (!(qn7Var instanceof fwb) || ((fwb) qn7Var).a.a != 0) {
            return;
        }
        qp2.o("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    @Override // defpackage.we1
    public final y0n a(j8m j8mVar) {
        a1n a1nVarA = this.a.a(j8mVar);
        tr3 tr3Var = new tr3();
        tr3Var.c = a1nVarA;
        tr3Var.d = this.b;
        tr3Var.a = (a1nVarA.o() + a1nVarA.g()) * 1000000;
        tr3Var.b = this.c * 1000000;
        return tr3Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y6b) {
            y6b y6bVar = (y6b) obj;
            if (y6bVar.a.equals(this.a) && y6bVar.b == this.b && y6bVar.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
