package ads_mobile_sdk;

import defpackage.prb;
import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class vq1 extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ zq1 b;
    public final /* synthetic */ cy0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq1(zq1 zq1Var, cy0 cy0Var, boolean z, boolean z2, boolean z3, boolean z4, mt5 mt5Var) {
        super(2, mt5Var);
        this.b = zq1Var;
        this.c = cy0Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new vq1(this.b, this.c, this.d, this.e, this.f, this.g, mt5Var);
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
            prbVar.q("sms", Boolean.valueOf(this.d));
            prbVar.q("tel", Boolean.valueOf(this.e));
            prbVar.q("calendar", Boolean.valueOf(this.f));
            prbVar.q("storePicture", Boolean.valueOf(this.g));
            prbVar.q("inlineVideo", Boolean.TRUE);
            Object objA = this.c.a(prbVar, "onDeviceFeaturesReceived", this);
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
