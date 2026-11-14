package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ae4 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ be4 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae4(be4 be4Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = be4Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        be4 be4Var = this.v;
        switch (b) {
            case 0:
                return new ae4(be4Var, mt5Var, (byte) 0);
            default:
                return new ae4(be4Var, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
        }
        return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    mf4 mf4Var = this.v.e;
                    vm2 vm2Var = new vm2(8);
                    synchronized (mf4Var.a) {
                        if (!mf4Var.g) {
                            mf4Var.g = true;
                            yd4 yd4Var = yd4.c;
                            mf4Var.e = yd4Var;
                            mf4Var.f = vm2Var;
                            mf4Var.c(yd4Var, vm2Var);
                            mf4Var.d = null;
                        }
                    }
                    ysm ysmVar = this.v.a;
                    this.u = true;
                    if (ysmVar.e(this) == px5Var) {
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
            default:
                be4 be4Var = this.v;
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    ysm ysmVar2 = be4Var.a;
                    this.u = true;
                    if (ysmVar2.e(this) == px5Var2) {
                        return px5Var2;
                    }
                } else {
                    if (!z2) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                sgb.k(be4Var.d.a, null);
                return Unit.a;
        }
    }
}
