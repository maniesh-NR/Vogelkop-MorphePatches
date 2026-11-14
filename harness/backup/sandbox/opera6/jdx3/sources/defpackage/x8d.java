package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class x8d extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ a9d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x8d(a9d a9dVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = a9dVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        a9d a9dVar = this.v;
        switch (b) {
            case 0:
                return new x8d(a9dVar, mt5Var, (byte) 0);
            default:
                return new x8d(a9dVar, mt5Var, (byte) 1);
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
        byte b = this.t;
        a9d a9dVar = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    this.u = true;
                    nh4 nh4Var = new nh4(1, hib.b(this));
                    nh4Var.s();
                    a9dVar.b.d(new bha(nh4Var, (byte) 1));
                    obj = nh4Var.q();
                    if (obj == px5Var) {
                        break;
                    }
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                ((yah) obj).s0(a9dVar);
                break;
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    this.u = true;
                    if (nb6.p(2500L, this) == px5Var2) {
                        break;
                    }
                } else if (!z2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                a9dVar.d.b(new dnb(a9dVar, (byte) 21));
                break;
        }
        return Unit.a;
    }
}
