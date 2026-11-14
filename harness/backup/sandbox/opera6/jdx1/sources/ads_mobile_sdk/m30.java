package ads_mobile_sdk;

import defpackage.p76;
import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.chromium.net.CronetEngine;

/* loaded from: classes.dex */
public final class m30 extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ long b;
    public final /* synthetic */ p30 c;
    public final /* synthetic */ h21 d;
    public final /* synthetic */ CronetEngine e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m30(long j, p30 p30Var, h21 h21Var, CronetEngine cronetEngine, boolean z, boolean z2, mt5 mt5Var) {
        super(2, mt5Var);
        this.b = j;
        this.c = p30Var;
        this.d = h21Var;
        this.e = cronetEngine;
        this.f = z;
        this.g = z2;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new m30(this.b, this.c, this.d, this.e, this.f, this.g, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        px5 px5Var = px5.a;
        boolean z = this.a;
        if (z) {
            if (z) {
                ybh.y(obj);
                return obj;
            }
            qp2.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ybh.y(obj);
        p76 p76Var = new p76(this.c, this.d, this.e, this.f, this.g, (mt5) null);
        this.a = true;
        Object objU = uyg.u(this.b, p76Var, this);
        return objU == px5Var ? px5Var : objU;
    }
}
