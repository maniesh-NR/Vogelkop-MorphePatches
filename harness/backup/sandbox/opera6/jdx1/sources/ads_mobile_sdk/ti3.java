package ads_mobile_sdk;

import android.os.Binder;
import defpackage.jjp;
import defpackage.sep;
import defpackage.ybh;
import defpackage.ycp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ti3 extends kuk implements Function2 {
    public final /* synthetic */ wi3 a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ti3(wi3 wi3Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.a = wi3Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        wi3 wi3Var = this.a;
        switch (b) {
            case 0:
                return new ti3(wi3Var, mt5Var, (byte) 0);
            default:
                return new ti3(wi3Var, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        wi3 wi3Var = this.a;
        switch (b) {
            case 0:
                return new ti3(wi3Var, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            default:
                return new ti3(wi3Var, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        wi3 wi3Var = this.a;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                wi3Var.g.set(true);
                jjp jjpVar = wi3Var.d;
                if (jjpVar.isConnected() || jjpVar.isConnecting()) {
                    jjpVar.disconnect();
                }
                Binder.flushPendingCommands();
                break;
            default:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                try {
                    ((ycp) ((sep) wi3Var.d.getService())).S0(new rg0(wi3Var.b.getPackageName()), wi3Var);
                } catch (Throwable th) {
                    bv0 bv0Var = new bv0(th, null, null, 6);
                    int i = wi3.j;
                    if (!wi3Var.f.getAndSet(true)) {
                        wi3Var.h.j0(bv0Var);
                    }
                    wi3Var.c.a("Throwable caught getting trustless token", th);
                }
                break;
        }
        return Unit.a;
    }
}
