package defpackage;

import ads_mobile_sdk.rr1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class tx6 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ boolean v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx6(ga6 ga6Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 0;
        this.w = ga6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tx6(Object obj, boolean z, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.w = obj;
        this.v = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx6(boolean z, cd1 cd1Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 1;
        this.v = z;
        this.w = cd1Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                tx6 tx6Var = new tx6((ga6) obj2, mt5Var);
                tx6Var.v = ((Boolean) obj).booleanValue();
                return tx6Var;
            case 1:
                return new tx6(this.v, (cd1) obj2, mt5Var);
            case 2:
                return new tx6((dil) obj2, this.v, mt5Var, (byte) 2);
            default:
                return new tx6((rr1) obj2, this.v, mt5Var, (byte) 3);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        Object obj3 = this.w;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                tx6 tx6Var = new tx6((ga6) obj3, (mt5) obj2);
                tx6Var.v = zBooleanValue;
                return tx6Var.invokeSuspend(Unit.a);
            case 1:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 2:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return new tx6((rr1) obj3, this.v, (mt5) obj2, (byte) 3).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        Object obj2 = this.w;
        sf1 sf1VarI = null;
        switch (b) {
            case 0:
                boolean z = this.v;
                px5 px5Var = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    if (z) {
                        wx6 wx6Var = (wx6) ((ga6) obj2).b;
                        this.v = z;
                        this.u = true;
                        if (wx6Var.a(this) == px5Var) {
                            break;
                        }
                    }
                } else if (!z2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                    Object obj3 = ((t0i) obj).a;
                }
                break;
            case 1:
                px5 px5Var2 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    if (this.v) {
                        Float f = new Float(1.0f);
                        e8m e8mVarX = rm5.X(300, 6, null);
                        this.u = true;
                        if (cd1.a((cd1) obj2, f, e8mVarX, this, 12) == px5Var2) {
                            break;
                        }
                    }
                } else if (!z3) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 2:
                dil dilVar = (dil) obj2;
                Unit unit = px5.a;
                boolean z4 = this.u;
                if (!z4) {
                    ybh.y(obj);
                    boolean z5 = this.v;
                    if (!xjl.c(dilVar.l().b)) {
                        sf1VarI = ybh.i(dilVar.l());
                        if (z5) {
                            int iE = xjl.e(dilVar.l().b);
                            dilVar.c.invoke(dil.b(dilVar.l().a, upj.c(iE, iE)));
                            dilVar.r(b7a.a);
                        }
                    }
                    if (sf1VarI != null) {
                        f31 f31Var = dilVar.g;
                        if (f31Var != null) {
                            d55 d55VarJ0 = cqp.J0(sf1VarI);
                            this.u = true;
                            f31Var.a.a().setPrimaryClip(d55VarJ0.a);
                            if (Unit.a == unit) {
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                } else if (!z4) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            default:
                px5 px5Var3 = px5.a;
                boolean z6 = this.u;
                if (!z6) {
                    ybh.y(obj);
                    boolean z7 = this.v;
                    this.u = true;
                    if (rr1.a((rr1) obj2, z7, (nt5) this) == px5Var3) {
                        break;
                    }
                } else if (!z6) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
        }
        return Unit.a;
    }
}
