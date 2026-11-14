package ads_mobile_sdk;

import defpackage.hpo;
import defpackage.r3p;
import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class y9 extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ nn3 e;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y9(String str, Object obj, mt5 mt5Var, nn3 nn3Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.c = str;
        this.d = obj;
        this.e = nn3Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new y9(this.c, this.d, mt5Var, this.e, (byte) 0);
            default:
                return new y9(this.c, this.d, mt5Var, this.e, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        nn3 nn3Var = this.e;
        Object obj2 = this.d;
        String str = this.c;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    vr3 vr3Var = xu0.a;
                    sko.t("Invoking function [onViewabilityEvent] on listener [", str, "]", (Throwable) null);
                    this.a = true;
                    if (((hpo) obj2).a(nn3Var, this) == px5Var) {
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
                    vr3 vr3Var2 = xu0.a;
                    sko.t("Invoking function [onViewabilityEvent] on listener [", str, "]", (Throwable) null);
                    this.a = true;
                    if (((r3p) obj2).b(nn3Var, this) == px5Var2) {
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
