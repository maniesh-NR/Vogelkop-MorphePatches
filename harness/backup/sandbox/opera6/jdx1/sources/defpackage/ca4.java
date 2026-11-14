package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ca4 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ fa4 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ca4(fa4 fa4Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = fa4Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        fa4 fa4Var = this.v;
        switch (b) {
            case 0:
                return new ca4(fa4Var, mt5Var, (byte) 0);
            case 1:
                return new ca4(fa4Var, mt5Var, (byte) 1);
            default:
                return new ca4(fa4Var, mt5Var, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws pxb {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
            case 0:
                create(nx5Var, mt5Var).invokeSuspend(Unit.a);
                return px5.a;
            case 1:
                create(nx5Var, mt5Var).invokeSuspend(Unit.a);
                return px5.a;
            default:
                return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) throws pxb {
        man manVar;
        dk4 dk4Var;
        Object objCollect;
        byte b = 1;
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (z) {
                    if (!z) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    t3p.v();
                    return null;
                }
                ybh.y(obj);
                fa4 fa4Var = this.v;
                rlh rlhVar = fa4Var.f.g;
                ba4 ba4Var = new ba4(fa4Var, (byte) 0);
                this.u = true;
                rlhVar.a.collect(ba4Var, this);
                return px5Var;
            case 1:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (z2) {
                    if (!z2) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    t3p.v();
                    return null;
                }
                ybh.y(obj);
                fa4 fa4Var2 = this.v;
                plh plhVar = fa4Var2.f.i;
                ba4 ba4Var2 = new ba4(fa4Var2, b);
                this.u = true;
                plhVar.a.collect(ba4Var2, this);
                return px5Var2;
            default:
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    fa4 fa4Var3 = this.v;
                    this.u = true;
                    pqh pqhVar = new pqh();
                    synchronized (fa4Var3.p) {
                        manVar = fa4Var3.x;
                        dk4Var = fa4Var3.y;
                        pqhVar.a = dk4Var;
                    }
                    if (manVar == null || dk4Var == null || (objCollect = manVar.i.collect(new o23(pqhVar, fa4Var3, (byte) 2), this)) != px5Var3) {
                        objCollect = Unit.a;
                    }
                    if (objCollect == px5Var3) {
                        return px5Var3;
                    }
                } else {
                    if (!z3) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
        }
    }
}
