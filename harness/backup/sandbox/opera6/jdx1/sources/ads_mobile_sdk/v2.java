package ads_mobile_sdk;

import defpackage.fsg;
import defpackage.xe6;
import defpackage.ybh;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class v2 extends kuk implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ z2 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2(z2 z2Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = z2Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        z2 z2Var = this.b;
        switch (b) {
            case 0:
                v2 v2Var = new v2(z2Var, mt5Var, (byte) 0);
                v2Var.a = obj;
                return v2Var;
            default:
                v2 v2Var2 = new v2(z2Var, mt5Var, (byte) 1);
                v2Var2.a = obj;
                return v2Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                v2 v2Var = new v2(this.b, (mt5) obj2, (byte) 1);
                v2Var.a = (cy0) obj;
                return v2Var.invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        z2 z2Var = this.b;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                nx5 nx5Var = (nx5) this.a;
                for (Map.Entry entry : ((Map) ((k8) z2Var).b).entrySet()) {
                    defpackage.na2.B(nx5Var, h.a, null, new fsg(new xe6((String) entry.getKey(), entry.getValue(), (mt5) ry0Var, (byte) 27), ry0Var, (byte) 3), 2);
                }
                break;
            default:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                ry0 ry0Var = ((cy0) this.a).z;
                (ry0Var != null ? ry0Var : null).p.setValue(ry0.w[4], z2Var);
                break;
        }
        return Unit.a;
    }
}
