package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class hnk extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ shf v;
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hnk(shf shfVar, String str, String str2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        switch (b) {
            case 1:
                enk enkVar = enk.a;
                this.v = shfVar;
                this.w = str;
                this.x = str2;
                super(2, mt5Var);
                break;
            default:
                enk enkVar2 = enk.a;
                this.v = shfVar;
                this.w = str;
                this.x = str2;
                break;
        }
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                enk enkVar = enk.a;
                return new hnk(this.v, this.w, this.x, mt5Var, (byte) 0);
            default:
                enk enkVar2 = enk.a;
                return new hnk(this.v, this.w, this.x, mt5Var, (byte) 1);
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
                if (z) {
                    if (z) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                enk enkVar = enk.a;
                this.u = true;
                nh4 nh4Var = new nh4(1, hib.b(this));
                nh4Var.s();
                bha bhaVar = new bha(nh4Var, (byte) 5);
                shf shfVar = this.v;
                ((wth) shfVar.a).w(new xx1(this.w, this.x, shfVar, bhaVar));
                Object objQ = nh4Var.q();
                return objQ == px5Var ? px5Var : objQ;
            default:
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
                enk enkVar2 = enk.a;
                this.u = true;
                nh4 nh4Var2 = new nh4(1, hib.b(this));
                nh4Var2.s();
                bha bhaVar2 = new bha(nh4Var2, (byte) 7);
                shf shfVar2 = this.v;
                ((wth) shfVar2.a).w(new xx1(this.w, this.x, shfVar2, bhaVar2, (byte) 0));
                Object objQ2 = nh4Var2.q();
                return objQ2 == px5Var2 ? px5Var2 : objQ2;
        }
    }
}
