package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ea4 extends kuk implements Function2 {
    public final /* synthetic */ byte t = 0;
    public boolean u;
    public final /* synthetic */ short v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
    public ea4(long j, fa4 fa4Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.v = (int) j;
        this.w = fa4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
    public ea4(cd5 cd5Var, long j, mt5 mt5Var) {
        super(2, mt5Var);
        this.w = cd5Var;
        this.v = (int) j;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        short s = this.v;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                return new ea4(s, (fa4) obj2, mt5Var);
            default:
                return new ea4((cd5) obj2, s, mt5Var);
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
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    long j = this.v;
                    this.u = true;
                    if (nb6.p(j, this) == px5Var) {
                        return px5Var;
                    }
                } else {
                    if (!z) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                fa4 fa4Var = (fa4) this.w;
                synchronized (fa4Var.p) {
                    if (!fa4Var.c() && !fa4Var.r.equals(rc4.D) && !fa4Var.r.equals(rc4.C)) {
                        fa4Var.toString();
                        fa4Var.e.k();
                        fa4Var.f();
                        fa4Var.e();
                    }
                }
                return Unit.a;
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    cd5 cd5Var = (cd5) this.w;
                    long j2 = this.v;
                    this.u = true;
                    obj = p37.q(cd5Var, j2, this);
                    if (obj == px5Var2) {
                        return px5Var2;
                    }
                } else {
                    if (!z2) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                ((Boolean) obj).getClass();
                return Unit.a;
        }
    }
}
