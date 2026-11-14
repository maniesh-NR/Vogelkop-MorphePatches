package ads_mobile_sdk;

import defpackage.prb;
import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class uq1 extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ zq1 b;
    public final /* synthetic */ cy0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq1(zq1 zq1Var, cy0 cy0Var, int i, int i2, int i3, int i4, mt5 mt5Var) {
        super(2, mt5Var);
        this.b = zq1Var;
        this.c = cy0Var;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new uq1(this.b, this.c, this.d, this.e, this.f, this.g, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        px5 px5Var = px5.a;
        boolean z = this.a;
        if (!z) {
            ybh.y(obj);
            bq1 bq1Var = this.b.c;
            this.a = true;
            bq1Var.getClass();
            prb prbVar = new prb();
            prbVar.p(new Integer(this.d), "x");
            prbVar.p(new Integer(this.e), "y");
            prbVar.p(new Integer(this.f), "width");
            prbVar.p(new Integer(this.g), "height");
            Object objA = this.c.a(prbVar, "onDefaultPositionReceived", this);
            if (objA != px5Var) {
                objA = Unit.a;
            }
            if (objA == px5Var) {
                return px5Var;
            }
        } else {
            if (!z) {
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ybh.y(obj);
        }
        return Unit.a;
    }
}
