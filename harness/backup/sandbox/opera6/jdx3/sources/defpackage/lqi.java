package defpackage;

import android.content.SharedPreferences;
import com.appsflyer.internal.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class lqi extends kuk implements Function2 {
    public boolean t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ y03 v;
    public final /* synthetic */ shf w;
    public final /* synthetic */ v84 x;
    public final /* synthetic */ xbf y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqi(boolean z, y03 y03Var, shf shfVar, v84 v84Var, xbf xbfVar, boolean z2, mt5 mt5Var) {
        super(2, mt5Var);
        this.u = z;
        this.v = y03Var;
        this.w = shfVar;
        this.x = v84Var;
        this.y = xbfVar;
        this.z = z2;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new lqi(this.u, this.v, this.w, this.x, this.y, this.z, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) throws Exception {
        px5 px5Var = px5.a;
        boolean z = this.t;
        xbf xbfVar = this.y;
        y03 y03Var = this.v;
        if (!z) {
            ybh.y(obj);
            if (!this.u || y03Var.a >= 3) {
                if (this.z) {
                    j.c((SharedPreferences) ((vqi) xbfVar.c).e.a.get(), "etag", (String) null);
                }
                ((q2g) xbfVar.g).run();
                return Unit.a;
            }
            long jA = y03Var.a();
            this.t = true;
            if (nb6.q(jA, this) == px5Var) {
                return px5Var;
            }
        } else {
            if (!z) {
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ybh.y(obj);
        }
        v84 v84VarClone = this.x.clone();
        int i = y03Var.a;
        if (i < 3) {
            y03Var.a = i + 1;
        }
        v84VarClone.enqueue(new p8f(this.w, xbfVar, y03Var, (byte) 14));
        return Unit.a;
    }
}
