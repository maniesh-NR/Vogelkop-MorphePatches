package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.opera.android.esim.EsimTimeZoneChangeReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j98 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ l98 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j98(l98 l98Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = l98Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        l98 l98Var = this.v;
        switch (b) {
            case 0:
                return new j98(l98Var, mt5Var, (byte) 0);
            case 1:
                j98 j98Var = new j98(l98Var, mt5Var, (byte) 1);
                j98Var.u = ((Boolean) obj).booleanValue();
                return j98Var;
            default:
                return new j98(l98Var, mt5Var, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((j98) create(bool, (mt5) obj2)).invokeSuspend(Unit.a);
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                j98 j98Var = new j98(this.v, (mt5) obj2, (byte) 1);
                j98Var.u = zBooleanValue;
                return j98Var.invokeSuspend(Unit.a);
            default:
                return ((j98) create((nx5) obj, (mt5) obj2)).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        l98 l98Var = this.v;
        switch (b) {
            case 0:
                Object obj2 = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    ot6 ot6Var = l98Var.c;
                    fp1 fp1Var = l98Var.a;
                    this.u = true;
                    if (ot6Var.a(fp1Var, this) == obj2) {
                        break;
                    }
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                    Object obj3 = ((t0i) obj).a;
                }
                break;
            case 1:
                boolean z2 = this.u;
                px5 px5Var = px5.a;
                ybh.y(obj);
                int i = EsimTimeZoneChangeReceiver.a;
                fp1 fp1Var2 = l98Var.a;
                fp1Var2.getPackageManager().setComponentEnabledSetting(new ComponentName((Context) fp1Var2, (Class<?>) EsimTimeZoneChangeReceiver.class), z2 ? 1 : 2, 1);
                break;
            default:
                px5 px5Var2 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    this.u = true;
                    if (l98Var.a(this) == px5Var2) {
                        break;
                    }
                } else if (!z3) {
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
