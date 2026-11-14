package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class yka extends kuk implements Function1 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ ks3 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yka(ks3 ks3Var, mt5 mt5Var, byte b) {
        super(1, mt5Var);
        this.t = b;
        this.v = ks3Var;
    }

    public final mt5 create(mt5 mt5Var) {
        byte b = this.t;
        ks3 ks3Var = this.v;
        switch (b) {
            case 0:
                return new yka(ks3Var, mt5Var, (byte) 0);
            case 1:
                return new yka(ks3Var, mt5Var, (byte) 1);
            default:
                return new yka(ks3Var, mt5Var, (byte) 2);
        }
    }

    public final Object invoke(Object obj) {
        mt5 mt5Var = (mt5) obj;
        switch (this.t) {
        }
        return create(mt5Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        ks3 ks3Var = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    vga vgaVar = (vga) ks3Var.c;
                    this.u = true;
                    if (vgaVar.s(this) == px5Var) {
                        return px5Var;
                    }
                } else {
                    if (!z) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 1:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (z2) {
                    if (z2) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                pn6 pn6Var = (pn6) ks3Var.i;
                this.u = true;
                Object objA = pn6Var.a(this);
                return objA == px5Var2 ? px5Var2 : objA;
            default:
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (z3) {
                    if (z3) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                plh plhVar = (plh) ((xm5) ks3Var.b).a;
                this.u = true;
                Object objE = cs5.E(plhVar, this);
                return objE == px5Var3 ? px5Var3 : objE;
        }
    }
}
