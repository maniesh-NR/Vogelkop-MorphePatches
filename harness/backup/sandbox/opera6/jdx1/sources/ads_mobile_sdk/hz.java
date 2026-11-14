package ads_mobile_sdk;

import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class hz extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ vz b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz(vz vzVar, boolean z, boolean z2, mt5 mt5Var) {
        super(2, mt5Var);
        this.b = vzVar;
        this.c = z;
        this.d = z2;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new hz(this.b, this.c, this.d, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        px5 px5Var = px5.a;
        boolean z = this.a;
        if (!z) {
            ybh.y(obj);
            this.a = true;
            if (vz.a(this.b, this.c, this.d, (nt5) this) == px5Var) {
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
