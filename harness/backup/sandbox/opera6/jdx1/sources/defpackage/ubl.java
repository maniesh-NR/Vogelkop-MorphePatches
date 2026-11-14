package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ubl extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ cr9 v;
    public final /* synthetic */ lwg w;
    public final /* synthetic */ lmg x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ubl(cr9 cr9Var, lwg lwgVar, lmg lmgVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = cr9Var;
        this.w = lwgVar;
        this.x = lmgVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new ubl(this.v, this.w, this.x, mt5Var, (byte) 0);
            default:
                return new ubl(this.v, this.w, this.x, mt5Var, (byte) 1);
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
        lmg lmgVar = this.x;
        lwg lwgVar = this.w;
        cr9 cr9Var = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    y8f y8fVar = new y8f(lmgVar.c);
                    this.u = true;
                    if (cr9Var.invoke(lwgVar, y8fVar, this) == px5Var) {
                        break;
                    }
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    y8f y8fVar2 = new y8f(lmgVar.c);
                    this.u = true;
                    if (cr9Var.invoke(lwgVar, y8fVar2, this) == px5Var2) {
                        break;
                    }
                } else if (!z2) {
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
