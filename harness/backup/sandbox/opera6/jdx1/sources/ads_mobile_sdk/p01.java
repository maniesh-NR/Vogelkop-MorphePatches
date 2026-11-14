package ads_mobile_sdk;

import defpackage.ybh;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p01 extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ s01 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Map e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p01(s01 s01Var, String str, String str2, Map map, boolean z, mt5 mt5Var) {
        super(2, mt5Var);
        this.b = s01Var;
        this.c = str;
        this.d = str2;
        this.e = map;
        this.f = z;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new p01(this.b, this.c, this.d, this.e, this.f, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        px5 px5Var = px5.a;
        boolean z = this.a;
        if (!z) {
            ybh.y(obj);
            s01 s01Var = this.b;
            String str = this.c;
            String str2 = this.d;
            Map map = this.e;
            boolean z2 = this.f;
            this.a = true;
            nh4 nh4Var = new nh4(1, hib.b(this));
            nh4Var.s();
            o01 o01Var = new o01(new AtomicBoolean(false), nh4Var);
            synchronized (((kma) s01Var.c.getValue())) {
                ((kma) s01Var.c.getValue()).b(str, str2, o01Var, map, z2);
            }
            if (nh4Var.q() == px5Var) {
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
