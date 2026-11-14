package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class nxn extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ ayn v;
    public final /* synthetic */ wc1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nxn(ayn aynVar, wc1 wc1Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = aynVar;
        this.w = wc1Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        wc1 wc1Var = this.w;
        ayn aynVar = this.v;
        switch (b) {
            case 0:
                return new nxn(aynVar, wc1Var, mt5Var, (byte) 0);
            default:
                return new nxn(aynVar, wc1Var, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
            case 0:
                create(nx5Var, mt5Var).invokeSuspend(Unit.a);
                break;
            default:
                create(nx5Var, mt5Var).invokeSuspend(Unit.a);
                break;
        }
        return px5.a;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        wc1 wc1Var = this.w;
        ayn aynVar = this.v;
        byte b2 = 1;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    this.u = true;
                    aynVar.a(wc1Var, this);
                    return px5Var;
                }
                if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                t3p.v();
                return null;
            default:
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
                jdj jdjVar = aynVar.c;
                oxn oxnVar = new oxn(wc1Var, b2);
                this.u = true;
                jdjVar.collect(oxnVar, this);
                return px5Var2;
        }
    }
}
