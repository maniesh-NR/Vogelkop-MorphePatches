package ads_mobile_sdk;

import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class tf extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ bg b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tf(bg bgVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = bgVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        bg bgVar = this.b;
        switch (b) {
            case 0:
                return new tf(bgVar, mt5Var, (byte) 0);
            case 1:
                return new tf(bgVar, mt5Var, (byte) 1);
            default:
                return new tf(bgVar, mt5Var, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        bg bgVar = this.b;
        switch (b) {
            case 0:
                return new tf(bgVar, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            case 1:
                return new tf(bgVar, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
            default:
                return new tf(bgVar, (mt5) obj2, (byte) 2).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        bg bgVar = this.b;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    this.a = true;
                    if (bg.b(bgVar, (nt5) this) == px5Var) {
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
                    if (bg.c(bgVar, this) == px5Var2) {
                        break;
                    }
                } else if (!z2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            default:
                px5 px5Var3 = px5.a;
                boolean z3 = this.a;
                if (!z3) {
                    ybh.y(obj);
                    this.a = true;
                    if (bg.a(bgVar, (nt5) this) == px5Var3) {
                        break;
                    }
                } else if (!z3) {
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
