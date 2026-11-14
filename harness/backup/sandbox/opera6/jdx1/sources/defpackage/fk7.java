package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fk7 extends oj7 {
    public gk7 J;
    public boolean K;
    public dk7 L;
    public cr9 M;

    @Override // defpackage.oj7
    public final Object X0(s71 s71Var, jj4 jj4Var) {
        fsf fsfVar = this.q;
        if (fsfVar == null) {
            return Unit.a;
        }
        gk7 gk7Var = this.J;
        gfe gfeVar = gfe.a;
        Object objA = gk7Var.a(new s71(s71Var, this, fsfVar, (mt5) null, (byte) 13), jj4Var);
        return objA == px5.a ? objA : Unit.a;
    }

    @Override // defpackage.oj7
    public final void c1(long j) {
        if (!this.n || Intrinsics.a(this.L, ek7.a)) {
            return;
        }
        na2.B(H0(), null, rx5.d, new gg6((byte) 1, j, (mt5) null, this), 1);
    }

    @Override // defpackage.oj7
    public final void d1(aj7 aj7Var) {
        fsf fsfVar;
        if (!this.n || Intrinsics.a(this.M, ek7.b) || (fsfVar = this.q) == null) {
            return;
        }
        na2.B(H0(), null, rx5.d, new s71(this, aj7Var, fsfVar, (mt5) null, (byte) 14), 1);
    }

    @Override // defpackage.oj7
    public final boolean l1() {
        return this.K;
    }
}
