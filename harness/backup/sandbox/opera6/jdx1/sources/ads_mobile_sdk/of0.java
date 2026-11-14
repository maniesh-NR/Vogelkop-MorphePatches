package ads_mobile_sdk;

import ads_mobile_sdk.cg0;
import android.app.Activity;
import android.net.Uri;
import defpackage.ybh;
import defpackage.zbf;
import kotlin.Unit;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class of0 extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ cg0 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ of0(cg0 cg0Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = cg0Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new of0(this.b, mt5Var, (byte) 0);
            case 1:
                return new of0(this.b, mt5Var, (byte) 1);
            case 2:
                return new of0(this.b, mt5Var, (byte) 2);
            case 3:
                return new of0(this.b, mt5Var, (byte) 3);
            case 4:
                return new of0(this.b, mt5Var, (byte) 4);
            case 5:
                return new of0(this.b, mt5Var, (byte) 5);
            default:
                return new of0(this.b, mt5Var, (byte) 6);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return new of0(this.b, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            case 1:
                return new of0(this.b, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
            case 2:
                return new of0(this.b, (mt5) obj2, (byte) 2).invokeSuspend(Unit.a);
            case 3:
                return new of0(this.b, (mt5) obj2, (byte) 3).invokeSuspend(Unit.a);
            case 4:
                return new of0(this.b, (mt5) obj2, (byte) 4).invokeSuspend(Unit.a);
            case 5:
                return new of0(this.b, (mt5) obj2, (byte) 5).invokeSuspend(Unit.a);
            default:
                return new of0(this.b, (mt5) obj2, (byte) 6).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        final cg0 cg0Var = this.b;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    this.a = true;
                    Uri uri = cg0.q;
                    if (cg0Var.a((Activity) null, (nt5) this) == px5Var) {
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
                    Uri uri2 = cg0.q;
                    if (cg0Var.a((Activity) null, (nt5) this) == px5Var2) {
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
                    this.a = true;
                    Uri uri3 = cg0.q;
                    if (cg0Var.d(this) == px5Var3) {
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
                    this.a = true;
                    Uri uri4 = cg0.q;
                    if (cg0Var.e(this) == px5Var4) {
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
                boolean z5 = this.a;
                if (!z5) {
                    ybh.y(obj);
                    this.a = true;
                    Uri uri5 = cg0.q;
                    d91 d91Var = cg0Var.j;
                    x71 x71Var = x71.d;
                    zbf zbfVar = new zbf() { // from class: oso
                        @Override // defpackage.zbf
                        public final void a(um umVar) {
                            if (umVar != null) {
                                cg0 cg0Var2 = cg0Var;
                                na2.B(cg0Var2.b, h.a, null, new fsg(new hkm(cg0Var2, umVar, null, (byte) 17), null, (byte) 3), 2);
                            }
                        }
                    };
                    d91Var.getClass();
                    Object objA = d91.a(d91Var, x71Var, zbfVar, (nt5) this);
                    if (objA != px5Var5) {
                        objA = Unit.a;
                    }
                    if (objA == px5Var5) {
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
                boolean z6 = this.a;
                if (!z6) {
                    ybh.y(obj);
                    this.a = true;
                    if (cg0.b(cg0Var, this) == px5Var6) {
                        break;
                    }
                } else if (!z6) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            default:
                px5 px5Var7 = px5.a;
                boolean z7 = this.a;
                if (!z7) {
                    ybh.y(obj);
                    this.a = true;
                    if (cg0.a(cg0Var, (nt5) this) == px5Var7) {
                        break;
                    }
                } else if (!z7) {
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
