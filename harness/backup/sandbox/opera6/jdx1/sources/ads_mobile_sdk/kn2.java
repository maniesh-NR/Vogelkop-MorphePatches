package ads_mobile_sdk;

import defpackage.dvj;
import defpackage.egp;
import defpackage.hkm;
import defpackage.sgb;
import defpackage.ulp;
import defpackage.y7h;
import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class kn2 extends kuk implements Function2 {
    public final /* synthetic */ y7h a;
    public final /* synthetic */ egp b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kn2(y7h y7hVar, egp egpVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.a = y7hVar;
        this.b = egpVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        egp egpVar = this.b;
        y7h y7hVar = this.a;
        switch (b) {
            case 0:
                return new kn2(y7hVar, egpVar, mt5Var, (byte) 0);
            case 1:
                return new kn2(y7hVar, egpVar, mt5Var, (byte) 1);
            default:
                return new kn2(y7hVar, egpVar, mt5Var, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        egp egpVar = this.b;
        y7h y7hVar = this.a;
        switch (b) {
            case 0:
                return new kn2(y7hVar, egpVar, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            case 1:
                return new kn2(y7hVar, egpVar, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
            default:
                return new kn2(y7hVar, egpVar, (mt5) obj2, (byte) 2).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        mt5 mt5Var = null;
        tmj tmjVar = rh3.b;
        egp egpVar = this.b;
        y7h y7hVar = this.a;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                dvj dvjVar = ax0.f;
                defpackage.na2.B(sgb.b(kotlin.coroutines.e.a(dze.b, getContext()).minusKey(tmjVar).minusKey(psp.b).minusKey(ulp.h)), null, null, new hkm(y7hVar, egpVar, mt5Var, (byte) 22), 3);
                break;
            case 1:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                y7hVar.a(((pn2) egpVar).a);
                break;
            default:
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                dvj dvjVar2 = ax0.f;
                defpackage.na2.B(sgb.b(kotlin.coroutines.e.a(dze.b, getContext()).minusKey(tmjVar).minusKey(psp.b).minusKey(ulp.h)), null, null, new kn2(y7hVar, egpVar, mt5Var, (byte) 1), 3);
                break;
        }
        return Unit.a;
    }
}
