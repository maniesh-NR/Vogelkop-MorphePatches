package ads_mobile_sdk;

import defpackage.d2i;
import defpackage.nip;
import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class id3 extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ ae3 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ id3(ae3 ae3Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = ae3Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        ae3 ae3Var = this.b;
        switch (b) {
            case 0:
                return new id3(ae3Var, mt5Var, (byte) 0);
            case 1:
                return new id3(ae3Var, mt5Var, (byte) 1);
            case 2:
                return new id3(ae3Var, mt5Var, (byte) 2);
            case 3:
                return new id3(ae3Var, mt5Var, (byte) 3);
            case 4:
                return new id3(ae3Var, mt5Var, (byte) 4);
            case 5:
                return new id3(ae3Var, mt5Var, (byte) 5);
            case 6:
                return new id3(ae3Var, mt5Var, (byte) 6);
            default:
                return new id3(ae3Var, mt5Var, (byte) 7);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        ae3 ae3Var = this.b;
        switch (b) {
            case 0:
                return new id3(ae3Var, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            case 1:
                return new id3(ae3Var, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
            case 2:
                return new id3(ae3Var, (mt5) obj2, (byte) 2).invokeSuspend(Unit.a);
            case 3:
                return new id3(ae3Var, (mt5) obj2, (byte) 3).invokeSuspend(Unit.a);
            case 4:
                return new id3(ae3Var, (mt5) obj2, (byte) 4).invokeSuspend(Unit.a);
            case 5:
                return new id3(ae3Var, (mt5) obj2, (byte) 5).invokeSuspend(Unit.a);
            case 6:
                return new id3(ae3Var, (mt5) obj2, (byte) 6).invokeSuspend(Unit.a);
            default:
                return new id3(ae3Var, (mt5) obj2, (byte) 7).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        ae3 ae3Var = this.b;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    z2 z2Var = ae3Var.c;
                    this.a = true;
                    if (z2Var.g(this) == px5Var) {
                        break;
                    }
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 1:
                Unit unit = px5.a;
                boolean z2 = this.a;
                if (!z2) {
                    ybh.y(obj);
                    z2 z2Var2 = ae3Var.c;
                    this.a = true;
                    if (z2Var2.o(this) == unit) {
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
                px5 px5Var2 = px5.a;
                boolean z3 = this.a;
                if (!z3) {
                    ybh.y(obj);
                    z2 z2Var3 = ae3Var.c;
                    this.a = true;
                    if (z2Var3.q(this) == px5Var2) {
                        break;
                    }
                } else if (!z3) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 3:
                px5 px5Var3 = px5.a;
                boolean z4 = this.a;
                if (!z4) {
                    ybh.y(obj);
                    z2 z2Var4 = ae3Var.c;
                    this.a = true;
                    if (z2Var4.n(this) == px5Var3) {
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
                px5 px5Var4 = px5.a;
                boolean z5 = this.a;
                if (!z5) {
                    ybh.y(obj);
                    z2 z2Var5 = ae3Var.c;
                    this.a = true;
                    if (z2Var5.q(this) == px5Var4) {
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
                px5 px5Var5 = px5.a;
                boolean z6 = this.a;
                if (!z6) {
                    ybh.y(obj);
                    z2 z2Var6 = ae3Var.c;
                    this.a = true;
                    if (z2Var6.q(this) == px5Var5) {
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
                px5 px5Var6 = px5.a;
                boolean z7 = this.a;
                if (!z7) {
                    ybh.y(obj);
                    z2 z2Var7 = ae3Var.c;
                    this.a = true;
                    if (z2Var7.j(this) == px5Var6) {
                        break;
                    }
                } else if (!z7) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            default:
                Unit unit2 = px5.a;
                boolean z8 = this.a;
                if (!z8) {
                    ybh.y(obj);
                    nip nipVar = ae3Var.d;
                    d2i d2iVar = ae3Var.b.k0;
                    if (d2iVar == null) {
                        d2iVar = bw2.b;
                    }
                    this.a = true;
                    if (nipVar.a(d2iVar, this) == unit2) {
                        break;
                    }
                } else if (!z8) {
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
