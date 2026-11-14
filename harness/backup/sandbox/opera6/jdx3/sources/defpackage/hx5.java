package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class hx5 extends h42 {
    public final /* synthetic */ byte n;
    public Object o;

    public hx5(ekc ekcVar, Function1 function1) {
        this.n = (byte) 2;
        this.o = function1;
        s(ekcVar, new u6j(this));
    }

    public hx5(v6j v6jVar) {
        this.n = (byte) 3;
        this.o = v6jVar;
    }

    public final Object g() {
        switch (this.n) {
            case 1:
                ekc ekcVar = (ekc) this.o;
                if (ekcVar == null) {
                    return null;
                }
                return ekcVar.g();
            default:
                return super/*ekc*/.g();
        }
    }

    @Override // defpackage.h42
    public final void l() {
        switch (this.n) {
            case 0:
                super.l();
                igi igiVar = (igi) this.o;
                if (igiVar != null) {
                    d3k d3kVar = (d3k) igiVar.g;
                    if (d3kVar != null) {
                        d3kVar.k((CancellationException) null);
                    }
                    igiVar.g = null;
                    if (((d3k) igiVar.f) == null) {
                        igiVar.f = na2.B((a64) igiVar.d, (CoroutineContext) null, (rx5) null, new r3((byte) 8, (mt5) null, igiVar), 3);
                        break;
                    }
                }
                break;
            case 3:
                super.l();
                ((v6j) this.o).e();
                break;
            default:
                super.l();
                break;
        }
    }

    @Override // defpackage.h42
    public final void m() {
        switch (this.n) {
            case 0:
                super.m();
                igi igiVar = (igi) this.o;
                if (igiVar != null) {
                    if (((d3k) igiVar.g) != null) {
                        qp2.n("Cancel call cannot happen without a maybeRun");
                        break;
                    } else {
                        a64 a64Var = (a64) igiVar.d;
                        cv6 cv6Var = bb7.a;
                        igiVar.g = na2.B(a64Var, s6d.a.e, (rx5) null, new yf((byte) 3, (mt5) null, igiVar), 2);
                        break;
                    }
                }
                break;
            case 3:
                super.m();
                ((v6j) this.o).f();
                break;
            default:
                super.m();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit u(nt5 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.gx5
            if (r0 == 0) goto L13
            r0 = r5
            gx5 r0 = (defpackage.gx5) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            gx5 r0 = new gx5
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r4 = r0.t
            px5 r5 = px5.a
            int r5 = r0.v
            if (r5 == 0) goto L2a
            r0 = 1
            if (r5 == r0) goto L2a
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r4)
            r4 = 0
            return r4
        L2a:
            ybh.y(r4)
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hx5.u(nt5):kotlin.Unit");
    }
}
