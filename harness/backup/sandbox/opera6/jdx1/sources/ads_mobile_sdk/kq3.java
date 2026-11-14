package ads_mobile_sdk;

import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class kq3 extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ yq3 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kq3(yq3 yq3Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = yq3Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        yq3 yq3Var = this.b;
        switch (b) {
            case 0:
                return new kq3(yq3Var, mt5Var, (byte) 0);
            default:
                return new kq3(yq3Var, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        yq3 yq3Var = this.b;
        switch (b) {
            case 0:
                return new kq3(yq3Var, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            default:
                return new kq3(yq3Var, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        yq3 yq3Var = this.b;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    this.a = true;
                    if (yq3.a(yq3Var, (nt5) this) == px5Var) {
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
                    this.a = true;
                    if (yq3.b(yq3Var, this) == px5Var2) {
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
