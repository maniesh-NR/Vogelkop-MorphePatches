package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ygj extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ i9c w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ygj(i9c i9cVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.w = i9cVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                ygj ygjVar = new ygj(this.w, mt5Var, (byte) 0);
                ygjVar.v = obj;
                return ygjVar;
            default:
                ygj ygjVar2 = new ygj(this.w, mt5Var, (byte) 1);
                ygjVar2.v = obj;
                return ygjVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
        }
        return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        String q0iVar;
        byte b = this.t;
        i9c i9cVar = this.w;
        byte b2 = 1;
        mt5 mt5Var = null;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                try {
                    if (!z) {
                        ybh.y(obj);
                        p0i p0iVar = t0i.b;
                        this.v = null;
                        this.u = true;
                        bhi bhiVar = new bhi(hib.b(this));
                        ((ghj) i9cVar.d).a(new hu5(i9cVar, new hz(bhiVar, (byte) 2), b2));
                        obj = bhiVar.a();
                        if (obj == px5Var) {
                            return px5Var;
                        }
                    } else {
                        if (!z) {
                            qp2.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ybh.y(obj);
                    }
                    q0iVar = (String) obj;
                    p0i p0iVar2 = t0i.b;
                } catch (Throwable th) {
                    p0i p0iVar3 = t0i.b;
                    q0iVar = new q0i(th);
                }
                return new t0i(q0iVar);
            default:
                nx5 nx5Var = (nx5) this.v;
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (z2) {
                    if (z2) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                i07 i07VarG = na2.g(nx5Var, (CoroutineContext) null, (rx5) null, new ygj(i9cVar, mt5Var, (byte) 0), 3);
                this.v = null;
                this.u = true;
                Object objA = i07VarG.A(this);
                return objA == px5Var2 ? px5Var2 : objA;
        }
    }
}
