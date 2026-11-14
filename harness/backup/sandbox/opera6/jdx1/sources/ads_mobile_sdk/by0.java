package ads_mobile_sdk;

import defpackage.llp;
import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class by0 extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ cy0 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ by0(cy0 cy0Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = cy0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by0(cy0 cy0Var, boolean z, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 3;
        this.b = cy0Var;
        this.a = z;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        cy0 cy0Var = this.b;
        switch (b) {
            case 0:
                return new by0(cy0Var, mt5Var, (byte) 0);
            case 1:
                return new by0(cy0Var, mt5Var, (byte) 1);
            case 2:
                return new by0(cy0Var, mt5Var, (byte) 2);
            case 3:
                return new by0(cy0Var, this.a, mt5Var);
            case 4:
                return new by0(cy0Var, mt5Var, (byte) 4);
            case 5:
                return new by0(cy0Var, mt5Var, (byte) 5);
            case 6:
                return new by0(cy0Var, mt5Var, (byte) 6);
            case 7:
                return new by0(cy0Var, mt5Var, (byte) 7);
            default:
                return new by0(cy0Var, mt5Var, (byte) 8);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        cy0 cy0Var = this.b;
        switch (b) {
            case 0:
                return new by0(cy0Var, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            case 1:
                return new by0(cy0Var, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
            case 2:
                return new by0(cy0Var, (mt5) obj2, (byte) 2).invokeSuspend(Unit.a);
            case 3:
                return new by0(cy0Var, this.a, (mt5) obj2).invokeSuspend(Unit.a);
            case 4:
                return new by0(cy0Var, (mt5) obj2, (byte) 4).invokeSuspend(Unit.a);
            case 5:
                return new by0(cy0Var, (mt5) obj2, (byte) 5).invokeSuspend(Unit.a);
            case 6:
                return new by0(cy0Var, (mt5) obj2, (byte) 6).invokeSuspend(Unit.a);
            case 7:
                return new by0(cy0Var, (mt5) obj2, (byte) 7).invokeSuspend(Unit.a);
            default:
                return new by0(cy0Var, (mt5) obj2, (byte) 8).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    q70 q70Var = this.b.d;
                    if (q70Var != null) {
                        this.a = true;
                        obj = q70.a(q70Var, "native:view_create", this);
                        if (obj == px5Var) {
                            break;
                        }
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
                    q70 q70Var2 = this.b.d;
                    if (q70Var2 != null) {
                        this.a = true;
                        if (q70Var2.a("action", "make_wv", true, (nt5) this) == px5Var2) {
                            break;
                        }
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
                    cy0 cy0Var = this.b;
                    this.a = true;
                    if (cy0Var.a((mt5) this) == px5Var3) {
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
                ybh.y(obj);
                mt0 mt0Var = this.b.o;
                if (mt0Var != null) {
                    if ((!this.a || mt0Var.h()) && !mt0Var.f()) {
                        y46 y46Var = mt0Var.r;
                        if (y46Var != null) {
                            y46Var.setVisibility(0);
                        }
                        mt0Var.s = false;
                    } else {
                        y46 y46Var2 = mt0Var.r;
                        if (y46Var2 != null) {
                            y46Var2.setVisibility(8);
                        }
                        mt0Var.s = true;
                    }
                }
                break;
            case 4:
                px5 px5Var5 = px5.a;
                boolean z4 = this.a;
                if (!z4) {
                    ybh.y(obj);
                    cy0 cy0Var2 = this.b;
                    this.a = true;
                    if (cy0Var2.a((mt5) this) == px5Var5) {
                        break;
                    }
                } else if (!z4) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 5:
                px5 px5Var6 = px5.a;
                boolean z5 = this.a;
                if (!z5) {
                    ybh.y(obj);
                    cy0 cy0Var3 = this.b;
                    this.a = true;
                    if (cy0Var3.a((mt5) this) == px5Var6) {
                        break;
                    }
                } else if (!z5) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 6:
                px5 px5Var7 = px5.a;
                boolean z6 = this.a;
                if (!z6) {
                    ybh.y(obj);
                    cy0 cy0Var4 = this.b;
                    this.a = true;
                    if (cy0Var4.a("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();", this) == px5Var7) {
                        break;
                    }
                } else if (!z6) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 7:
                px5 px5Var8 = px5.a;
                boolean z7 = this.a;
                if (!z7) {
                    ybh.y(obj);
                    cy0 cy0Var5 = this.b;
                    this.a = true;
                    if (cy0Var5.a((mt5) this) == px5Var8) {
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
                px5 px5Var9 = px5.a;
                boolean z8 = this.a;
                if (!z8) {
                    ybh.y(obj);
                    llp llpVar = this.b.p;
                    if (llpVar != null) {
                        this.a = true;
                        if (llpVar.a(this) == px5Var9) {
                            break;
                        }
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
