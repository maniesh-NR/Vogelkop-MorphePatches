package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class t1a extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ v1a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1a(v1a v1aVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = v1aVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        v1a v1aVar = this.v;
        switch (b) {
            case 0:
                return new t1a(v1aVar, mt5Var, (byte) 0);
            default:
                return new t1a(v1aVar, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
            case 0:
                create(nx5Var, mt5Var).invokeSuspend(Unit.a);
                return px5.a;
            default:
                return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        v1a v1aVar = this.v;
        byte b2 = 1;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (z) {
                    if (!z) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    t3p.v();
                    return null;
                }
                ybh.y(obj);
                avj avjVar = cak.d;
                avj.g(1, new r1a(v1aVar, b2));
                xkk xkkVarG = v1aVar.e.g();
                o71 o71Var = new o71(v1aVar, (byte) 7);
                this.u = true;
                xkkVarG.collect(o71Var, this);
                return px5Var;
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    this.u = true;
                    if (nb6.p(200L, this) == px5Var2) {
                        return px5Var2;
                    }
                } else {
                    if (!z2) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                v1aVar.a(new s1a(v1aVar, b2));
                return Unit.a;
        }
    }
}
