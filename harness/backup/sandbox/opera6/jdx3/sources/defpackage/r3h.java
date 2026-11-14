package defpackage;

import com.opera.android.settings.SettingsManager;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class r3h extends kuk implements cr9 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ l99 v;
    public /* synthetic */ Object w;
    public final /* synthetic */ SettingsManager x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r3h(mt5 mt5Var, SettingsManager settingsManager, byte b) {
        super(3, mt5Var);
        this.t = b;
        this.x = settingsManager;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        l99 l99Var = (l99) obj;
        mt5 mt5Var = (mt5) obj3;
        switch (this.t) {
            case 0:
                r3h r3hVar = new r3h(mt5Var, this.x, (byte) 0);
                r3hVar.v = l99Var;
                r3hVar.w = obj2;
                return r3hVar.invokeSuspend(Unit.a);
            default:
                r3h r3hVar2 = new r3h(mt5Var, this.x, (byte) 1);
                r3hVar2.v = l99Var;
                r3hVar2.w = obj2;
                return r3hVar2.invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        SettingsManager settingsManager = this.x;
        switch (b) {
            case 0:
                l99 l99Var = this.v;
                Object obj2 = this.w;
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    yc1 yc1Var = ((f3h) obj2).b() ? new yc1(uyg.d(settingsManager, "enable_product_suggestion", we5.t), (byte) 21) : new xd6(p3h.a, (byte) 7);
                    this.v = null;
                    this.w = null;
                    this.u = true;
                    if (j14.F(l99Var, yc1Var, this) == px5Var) {
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
                l99 l99Var2 = this.v;
                Object obj3 = this.w;
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    xd6 xd6Var = !((Boolean) obj3).booleanValue() ? new xd6(cpn.a, (byte) 7) : new yc1(uyg.d(settingsManager, "enable_weather", we5.w), (byte) 26);
                    this.v = null;
                    this.w = null;
                    this.u = true;
                    if (j14.F(l99Var2, xd6Var, this) == px5Var2) {
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
