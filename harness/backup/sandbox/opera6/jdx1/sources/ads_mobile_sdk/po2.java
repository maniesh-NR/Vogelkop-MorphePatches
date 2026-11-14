package ads_mobile_sdk;

import defpackage.dvj;
import defpackage.rap;
import defpackage.sgb;
import defpackage.ulp;
import defpackage.xzh;
import defpackage.ybh;
import defpackage.yrc;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class po2 extends kuk implements Function2 {
    public final /* synthetic */ uo2 a;
    public final /* synthetic */ rap b;
    public final /* synthetic */ xzh c;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ po2(xzh xzhVar, uo2 uo2Var, rap rapVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.a = uo2Var;
        this.b = rapVar;
        this.c = xzhVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new po2(this.c, this.a, this.b, mt5Var, (byte) 0);
            case 1:
                return new po2(this.c, this.a, this.b, mt5Var, (byte) 1);
            default:
                return new po2(this.c, this.a, this.b, mt5Var, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        uo2 uo2Var = this.a;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                vd1 vd1Var = uo2Var.x;
                if (vd1Var != null) {
                    av0 av0Var = (av0) this.b;
                    vd1Var.a(new yrc(av0Var.a().a(), dyg.b(av0Var), this.c));
                }
                return Unit.a;
            case 1:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                ji jiVar = uo2Var.u;
                xtb xtbVar = uo2.B[0];
                if (jiVar.getValue(uo2Var) == null) {
                    return Unit.a;
                }
                h9o.t();
                return null;
            default:
                ulp ulpVar = ulp.h;
                psp pspVar = psp.b;
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                uo2 uo2Var2 = this.a;
                vd1 vd1Var2 = uo2Var2.x;
                mt5 mt5Var = null;
                tmj tmjVar = rh3.b;
                xzh xzhVar = this.c;
                rap rapVar = this.b;
                if (vd1Var2 != null) {
                    dvj dvjVar = ax0.f;
                    defpackage.na2.B(sgb.b(kotlin.coroutines.e.a(dze.b, getContext()).minusKey(tmjVar).minusKey(pspVar).minusKey(ulpVar)), null, null, new po2(xzhVar, uo2Var2, rapVar, mt5Var, (byte) 0), 3);
                } else {
                    dvj dvjVar2 = ax0.f;
                    defpackage.na2.B(sgb.b(kotlin.coroutines.e.a(dze.b, getContext()).minusKey(tmjVar).minusKey(pspVar).minusKey(ulpVar)), null, null, new po2(xzhVar, uo2Var2, rapVar, mt5Var, (byte) 1), 3);
                }
                return Unit.a;
        }
    }
}
