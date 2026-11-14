package ads_mobile_sdk;

import defpackage.ybh;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class gx extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ lx b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gx(lx lxVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = lxVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        lx lxVar = this.b;
        switch (b) {
            case 0:
                return new gx(lxVar, mt5Var, (byte) 0);
            case 1:
                return new gx(lxVar, mt5Var, (byte) 1);
            case 2:
                return new gx(lxVar, mt5Var, (byte) 2);
            case 3:
                return new gx(lxVar, mt5Var, (byte) 3);
            default:
                return new gx(lxVar, mt5Var, (byte) 4);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        lx lxVar = this.b;
        switch (b) {
            case 0:
                return new gx(lxVar, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            case 1:
                return new gx(lxVar, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
            case 2:
                return new gx(lxVar, (mt5) obj2, (byte) 2).invokeSuspend(Unit.a);
            case 3:
                return new gx(lxVar, (mt5) obj2, (byte) 3).invokeSuspend(Unit.a);
            default:
                return new gx(lxVar, (mt5) obj2, (byte) 4).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        lx lxVar = this.b;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    sb sbVar = lxVar.j;
                    this.a = true;
                    sbVar.getClass();
                    if (sb.b(sbVar, this) == px5Var) {
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
                px5 px5Var2 = px5.a;
                boolean z2 = this.a;
                if (!z2) {
                    ybh.y(obj);
                    this.a = true;
                    if (defpackage.na2.Z(lxVar.c, new dg6(lxVar, true, (String) null, (mt5) null), this) == px5Var2) {
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
                boolean z3 = this.a;
                if (!z3) {
                    ybh.y(obj);
                    sb sbVar2 = lxVar.j;
                    this.a = true;
                    sbVar2.getClass();
                    if (sb.b(sbVar2, this) == px5Var3) {
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
                px5 px5Var4 = px5.a;
                boolean z4 = this.a;
                if (!z4) {
                    ybh.y(obj);
                    sb sbVar3 = lxVar.j;
                    this.a = true;
                    sbVar3.getClass();
                    if (sb.b(sbVar3, this) == px5Var4) {
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
                px5 px5Var5 = px5.a;
                boolean z5 = this.a;
                if (!z5) {
                    ybh.y(obj);
                    vz vzVar = lxVar.o;
                    this.a = true;
                    Pattern pattern = vz.R;
                    vzVar.getClass();
                    if (vz.b(vzVar, true, true, this) == px5Var5) {
                        break;
                    }
                } else if (!z5) {
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
