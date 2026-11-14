package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ojb extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ pjb v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ojb(pjb pjbVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = pjbVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        pjb pjbVar = this.v;
        switch (b) {
            case 0:
                return new ojb(pjbVar, mt5Var, (byte) 0);
            case 1:
                return new ojb(pjbVar, mt5Var, (byte) 1);
            default:
                return new ojb(pjbVar, mt5Var, (byte) 2);
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
        pjb pjbVar = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    g7m g7mVar = pjbVar.b;
                    this.u = true;
                    if (g7mVar.n(this) == px5Var) {
                        break;
                    }
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 1:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    g7m g7mVar2 = pjbVar.b;
                    this.u = true;
                    if (g7mVar2.n(this) == px5Var2) {
                        break;
                    }
                } else if (!z2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            default:
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    this.u = true;
                    if (pjbVar.c(this) == px5Var3) {
                        break;
                    }
                } else if (!z3) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
        }
        return Unit.a;
    }
}
