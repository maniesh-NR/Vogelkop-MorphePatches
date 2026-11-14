package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class m0i extends kuk implements Function1 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ o0i v;
    public final /* synthetic */ joc w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0i(o0i o0iVar, joc jocVar, mt5 mt5Var, byte b) {
        super(1, mt5Var);
        this.t = b;
        this.v = o0iVar;
        this.w = jocVar;
    }

    public final mt5 create(mt5 mt5Var) {
        byte b = this.t;
        joc jocVar = this.w;
        o0i o0iVar = this.v;
        switch (b) {
            case 0:
                return new m0i(o0iVar, jocVar, mt5Var, (byte) 0);
            default:
                return new m0i(o0iVar, jocVar, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        mt5 mt5Var = (mt5) obj;
        switch (this.t) {
        }
        return create(mt5Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        joc jocVar = this.w;
        o0i o0iVar = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (z) {
                    if (z) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                qs6 qs6Var = o0iVar.b;
                this.u = true;
                Object objF = qs6Var.f(jocVar, this);
                return objF == px5Var ? px5Var : objF;
            default:
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
                qs6 qs6Var2 = o0iVar.b;
                this.u = true;
                Object objE = qs6Var2.e(jocVar, this);
                return objE == px5Var2 ? px5Var2 : objE;
        }
    }
}
