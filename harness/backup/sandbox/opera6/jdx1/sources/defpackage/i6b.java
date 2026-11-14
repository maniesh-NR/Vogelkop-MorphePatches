package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i6b extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ j6b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i6b(j6b j6bVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = j6bVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        j6b j6bVar = this.v;
        switch (b) {
            case 0:
                return new i6b(j6bVar, mt5Var, (byte) 0);
            case 1:
                return new i6b(j6bVar, mt5Var, (byte) 1);
            case 2:
                return new i6b(j6bVar, mt5Var, (byte) 2);
            default:
                return new i6b(j6bVar, mt5Var, (byte) 3);
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
        byte b = this.t;
        j6b j6bVar = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    cd1 cd1Var = j6bVar.x;
                    if (cd1Var != null) {
                        sgl sglVarB = j6bVar.w;
                        if (sglVarB == null) {
                            sglVarB = ulp.B((sa5) z4o.N(j6bVar, ua5.a), (akl) z4o.N(j6bVar, bkl.a));
                        }
                        u95 u95Var = new u95(sglVarB.c(j6bVar.q, false, j6bVar.u));
                        we1 we1VarS = j6bVar.q ? nb6.s((iae) z4o.N(j6bVar, fed.a), jae.d) : rm5.Q();
                        this.u = true;
                        obj = cd1.a(cd1Var, u95Var, we1VarS, this, 12);
                        if (obj == px5Var) {
                            return px5Var;
                        }
                    }
                    return Unit.a;
                }
                if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                return Unit.a;
            case 1:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    cd1 cd1Var2 = j6bVar.z;
                    gh7 gh7Var = new gh7((j6bVar.u && j6bVar.q) ? j6bVar.s : j6bVar.t);
                    we1 we1VarS2 = j6bVar.q ? nb6.s((iae) z4o.N(j6bVar, fed.a), jae.b) : rm5.Q();
                    this.u = true;
                    if (cd1.a(cd1Var2, gh7Var, we1VarS2, this, 12) == px5Var2) {
                        return px5Var2;
                    }
                } else {
                    if (!z2) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 2:
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    this.u = true;
                    j6bVar.X0(this);
                    return px5Var3;
                }
                if (z3) {
                    ybh.y(obj);
                    return Unit.a;
                }
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                px5 px5Var4 = px5.a;
                boolean z4 = this.u;
                if (!z4) {
                    ybh.y(obj);
                    this.u = true;
                    j6bVar.X0(this);
                    return px5Var4;
                }
                if (z4) {
                    ybh.y(obj);
                    return Unit.a;
                }
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
