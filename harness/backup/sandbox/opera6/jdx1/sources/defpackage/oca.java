package defpackage;

import ads_mobile_sdk.fo;
import ads_mobile_sdk.l0;
import ads_mobile_sdk.qr0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class oca extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ int v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oca(Object obj, int i, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.w = obj;
        this.v = i;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        int i = this.v;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                return new oca((pca) obj2, i, mt5Var, (byte) 0);
            case 1:
                return new oca((e6c) obj2, i, mt5Var, (byte) 1);
            case 2:
                return new oca((gu6) obj2, i, mt5Var, (byte) 2);
            default:
                return new oca((l0) obj2, i, mt5Var, (byte) 3);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 2:
                return create((toi) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return new oca((l0) this.w, this.v, (mt5) obj2, (byte) 3).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object objG;
        Object value;
        byte b = this.t;
        int i = this.v;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                pca pcaVar = (pca) obj2;
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    h5e h5eVar = pcaVar.d;
                    String strValueOf = String.valueOf(i);
                    this.u = true;
                    objG = h5eVar.g(strValueOf, this);
                    if (objG == px5Var) {
                        break;
                    }
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                    objG = ((t0i) obj).a;
                }
                p0i p0iVar = t0i.b;
                if (!(objG instanceof q0i)) {
                    nak nakVar = pcaVar.p;
                    fca fcaVar = new fca(((r1k) objG).b);
                    nakVar.getClass();
                    nakVar.k((Object) null, fcaVar);
                }
                Throwable thD = t0i.d(objG);
                if (thD != null) {
                    nak nakVar2 = pcaVar.n;
                    do {
                        value = nakVar2.getValue();
                    } while (!nakVar2.h(value, hn9.v(ynh.i((shk) dhk.m.getValue()), thD)));
                    pcaVar.p.j((Object) null);
                }
                break;
            case 1:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    y5c y5cVar = ((e6c) obj2).p;
                    this.u = true;
                    if (y5cVar.f(i, this) == px5Var2) {
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
                gu6 gu6Var = (gu6) obj2;
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    this.u = true;
                    if (gu6Var.i(this) == px5Var3) {
                        break;
                    }
                } else if (!z3) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                gu6Var.t(gu6Var.j(i), 0.0f, true);
                break;
            default:
                l0 l0Var = (l0) obj2;
                px5 px5Var4 = px5.a;
                boolean z4 = this.u;
                if (!z4) {
                    ybh.y(obj);
                    qr0 qr0Var = l0Var.b;
                    qr0Var.getClass();
                    on7 on7Var = pn7.b;
                    long j = ((pn7) qr0Var.a("gads:ad_activity_delegate_map_retain_duration", u0h.b(60, un7.e), fo.a$21)).a;
                    this.u = true;
                    if (nb6.q(j, this) == px5Var4) {
                        break;
                    }
                } else if (!z4) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                l0Var.d.remove(new Integer(i));
                break;
        }
        return Unit.a;
    }
}
