package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class rz1 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rz1(int i, mt5 mt5Var, byte b) {
        super(i, mt5Var);
        this.t = b;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                rz1 rz1Var = new rz1(2, mt5Var, (byte) 0);
                rz1Var.u = ((Boolean) obj).booleanValue();
                return rz1Var;
            case 1:
                return new rz1(2, mt5Var, (byte) 1);
            case 2:
                return new rz1(2, mt5Var, (byte) 2);
            case 3:
                return new rz1(2, mt5Var, (byte) 3);
            case 4:
                return new rz1(2, mt5Var, (byte) 4);
            case 5:
                return new rz1(2, mt5Var, (byte) 5);
            case 6:
                return new rz1(2, mt5Var, (byte) 6);
            case 7:
                return new rz1(2, mt5Var, (byte) 7);
            default:
                return new rz1(2, mt5Var, (byte) 8);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                rz1 rz1Var = new rz1(2, (mt5) obj2, (byte) 0);
                rz1Var.u = zBooleanValue;
                break;
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        mt5 mt5Var = null;
        switch (this.t) {
            case 0:
                boolean z = this.u;
                px5 px5Var = px5.a;
                ybh.y(obj);
                break;
            case 1:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    this.u = true;
                    if (nb6.p(3000L, this) == px5Var2) {
                        break;
                    }
                } else if (!z2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 2:
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    this.u = true;
                    Object objF = c26.F(this);
                    if (objF == px5Var3) {
                        break;
                    }
                } else if (!z3) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                    break;
                }
                break;
            case 3:
                px5 px5Var4 = px5.a;
                boolean z4 = this.u;
                if (!z4) {
                    ybh.y(obj);
                    avj avjVar = cak.d;
                    this.u = true;
                    if (mfh.w(1, this) == px5Var4) {
                        break;
                    }
                } else if (!z4) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 4:
                px5 px5Var5 = px5.a;
                boolean z5 = this.u;
                if (!z5) {
                    ybh.y(obj);
                    long j = dek.a;
                    this.u = true;
                    if (nb6.q(j, this) == px5Var5) {
                        break;
                    }
                } else if (!z5) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 5:
                px5 px5Var6 = px5.a;
                boolean z6 = this.u;
                if (!z6) {
                    ybh.y(obj);
                    avj avjVar2 = cak.d;
                    this.u = true;
                    if (mfh.w(9, this) == px5Var6) {
                        break;
                    }
                } else if (!z6) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 6:
                px5 px5Var7 = px5.a;
                boolean z7 = this.u;
                if (!z7) {
                    ybh.y(obj);
                    long j2 = aap.f().D;
                    this.u = true;
                    if (nb6.q(j2, this) == px5Var7) {
                        break;
                    }
                } else if (!z7) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                d3k d3kVar = jno.i;
                if (d3kVar != null) {
                    d3kVar.k((CancellationException) null);
                }
                break;
            case 7:
                px5 px5Var8 = px5.a;
                boolean z8 = this.u;
                if (!z8) {
                    ybh.y(obj);
                    long j3 = aap.f().D;
                    this.u = true;
                    if (nb6.q(j3, this) == px5Var8) {
                        break;
                    }
                } else if (!z8) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                d3k d3kVar2 = aap.g;
                if (d3kVar2 != null) {
                    d3kVar2.k((CancellationException) null);
                }
                aap.g = null;
                d3k d3kVar3 = aap.h;
                if (d3kVar3 != null) {
                    d3kVar3.k((CancellationException) null);
                }
                aap.h = null;
                break;
            default:
                px5 px5Var9 = px5.a;
                boolean z9 = this.u;
                if (!z9) {
                    ybh.y(obj);
                    oxo oxoVar = oxo.a;
                    this.u = true;
                    cv6 cv6Var = bb7.a;
                    Object objZ = na2.Z(mr6.b, new wv0(2, mt5Var, (byte) 8), this);
                    if (objZ != px5Var9) {
                        objZ = Unit.a;
                    }
                    if (objZ == px5Var9) {
                        break;
                    }
                } else if (!z9) {
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
