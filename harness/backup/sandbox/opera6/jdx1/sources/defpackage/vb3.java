package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class vb3 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ ztl v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vb3(ztl ztlVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = ztlVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new vb3(this.v, mt5Var, (byte) 0);
            case 1:
                vb3 vb3Var = new vb3(this.v, mt5Var, (byte) 1);
                vb3Var.u = ((Boolean) obj).booleanValue();
                return vb3Var;
            default:
                return new vb3(this.v, mt5Var, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                vb3 vb3Var = new vb3(this.v, (mt5) obj2, (byte) 1);
                vb3Var.u = zBooleanValue;
                return vb3Var.invokeSuspend(Unit.a);
            default:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        ztl ztlVar = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    this.u = true;
                    if (ztlVar.c(gfe.a, this) == px5Var) {
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
                ybh.y(obj);
                if (!this.u) {
                    ztlVar.a();
                }
                break;
            default:
                px5 px5Var3 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    gfe gfeVar = gfe.b;
                    this.u = true;
                    if (ztlVar.c(gfeVar, this) == px5Var3) {
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
