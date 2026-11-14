package ads_mobile_sdk;

import defpackage.eap;
import defpackage.ybh;
import defpackage.zbf;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class l81 extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ d91 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l81(d91 d91Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = d91Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new l81(this.b, mt5Var, (byte) 0);
            default:
                return new l81(this.b, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return new l81(this.b, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            default:
                return new l81(this.b, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        d91 d91Var = this.b;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    x71 x71Var = x71.c;
                    eap eapVar = new eap();
                    this.a = true;
                    d91Var.getClass();
                    if (d91.a(d91Var, x71Var, (zbf) eapVar, (nt5) this) == px5Var) {
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
                boolean z2 = this.a;
                if (!z2) {
                    ybh.y(obj);
                    x71 x71Var2 = x71.c;
                    eap eapVar2 = new eap();
                    this.a = true;
                    d91Var.getClass();
                    if (d91.a(d91Var, x71Var2, (zbf) eapVar2, (nt5) this) == px5Var2) {
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
