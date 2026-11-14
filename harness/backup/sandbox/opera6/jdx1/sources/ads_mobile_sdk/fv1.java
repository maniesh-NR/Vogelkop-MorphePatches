package ads_mobile_sdk;

import defpackage.ybh;
import defpackage.ymp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class fv1 extends kuk implements Function2 {
    public final /* synthetic */ long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv1(long j, mt5 mt5Var) {
        super(2, mt5Var);
        this.a = j;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new fv1(this.a, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new fv1(this.a, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        px5 px5Var = px5.a;
        ybh.y(obj);
        ymp ympVarR = zu1.r();
        ympVarR.b$1();
        ((zu1) ympVarR.b).appVersionCode_ = this.a;
        return (zu1) ympVarR.a();
    }
}
