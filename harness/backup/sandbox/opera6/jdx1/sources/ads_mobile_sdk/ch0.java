package ads_mobile_sdk;

import defpackage.dvj;
import defpackage.im;
import defpackage.sgb;
import defpackage.ulp;
import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ch0 extends kuk implements Function2 {
    public final /* synthetic */ ph0 a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ch0(ph0 ph0Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.a = ph0Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        ph0 ph0Var = this.a;
        switch (b) {
            case 0:
                return new ch0(ph0Var, mt5Var, (byte) 0);
            case 1:
                return new ch0(ph0Var, mt5Var, (byte) 1);
            case 2:
                return new ch0(ph0Var, mt5Var, (byte) 2);
            case 3:
                return new ch0(ph0Var, mt5Var, (byte) 3);
            case 4:
                return new ch0(ph0Var, mt5Var, (byte) 4);
            case 5:
                return new ch0(ph0Var, mt5Var, (byte) 5);
            default:
                return new ch0(ph0Var, mt5Var, (byte) 6);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        ph0 ph0Var = this.a;
        switch (b) {
            case 0:
                return new ch0(ph0Var, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            case 1:
                return new ch0(ph0Var, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
            case 2:
                return new ch0(ph0Var, (mt5) obj2, (byte) 2).invokeSuspend(Unit.a);
            case 3:
                return new ch0(ph0Var, (mt5) obj2, (byte) 3).invokeSuspend(Unit.a);
            case 4:
                return new ch0(ph0Var, (mt5) obj2, (byte) 4).invokeSuspend(Unit.a);
            case 5:
                return new ch0(ph0Var, (mt5) obj2, (byte) 5).invokeSuspend(Unit.a);
            default:
                return new ch0(ph0Var, (mt5) obj2, (byte) 6).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                im imVarA = this.a.a();
                if (imVarA != null) {
                    imVarA.onAdClicked();
                }
                break;
            case 1:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                this.a.a();
                break;
            case 2:
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                im imVarA2 = this.a.a();
                if (imVarA2 != null) {
                    imVarA2.c();
                }
                break;
            case 3:
                px5 px5Var4 = px5.a;
                ybh.y(obj);
                synchronized (this.a) {
                }
                break;
            case 4:
                px5 px5Var5 = px5.a;
                ybh.y(obj);
                dvj dvjVar = ax0.f;
                defpackage.na2.B(sgb.b(kotlin.coroutines.e.a(dze.b, getContext()).minusKey(rh3.b).minusKey(psp.b).minusKey(ulp.h)), null, null, new ch0(this.a, null, (byte) 3), 3);
                break;
            case 5:
                px5 px5Var6 = px5.a;
                ybh.y(obj);
                this.a.a();
                break;
            default:
                px5 px5Var7 = px5.a;
                ybh.y(obj);
                synchronized (this.a) {
                }
                break;
        }
        return Unit.a;
    }
}
