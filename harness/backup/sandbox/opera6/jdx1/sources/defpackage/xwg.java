package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class xwg implements v6f {
    public final xd4 a;
    public final ode b;
    public axg c;
    public final n1f d;
    public sr9 e;
    public boolean f = false;

    public xwg(xd4 xd4Var, ode odeVar, n1f n1fVar) {
        this.a = xd4Var;
        this.b = odeVar;
        this.d = n1fVar;
        synchronized (this) {
            this.c = (axg) odeVar.g();
        }
    }

    @Override // defpackage.v6f
    public final void a(Object obj) {
        yd4 yd4Var = (yd4) obj;
        yd4 yd4Var2 = yd4.e;
        axg axgVar = axg.a;
        if (yd4Var == yd4Var2 || yd4Var == yd4.c || yd4Var == yd4.b || yd4Var == yd4.a) {
            b(axgVar);
            if (this.f) {
                this.f = false;
                ListenableFuture listenableFuture = this.e;
                if (listenableFuture != null) {
                    listenableFuture.cancel(false);
                    this.e = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((yd4Var == yd4.f || yd4Var == yd4.g || yd4Var == yd4.d) && !this.f) {
            xd4 xd4Var = this.a;
            b(axgVar);
            ArrayList arrayList = new ArrayList();
            l94 l94Var = new l94();
            l94Var.c = new byh();
            o94 o94Var = new o94(l94Var);
            l94Var.b = o94Var;
            l94Var.a = vep.class;
            try {
                wwg wwgVar = new wwg(l94Var, xd4Var);
                arrayList.add(wwgVar);
                xd4Var.f(n97.a(), wwgVar);
                l94Var.a = "waitForCaptureResult";
            } catch (Exception e) {
                o94Var.a(e);
            }
            fr4 fr4VarI0 = k1g.i0(sr9.a(o94Var), new vwg(this), n97.a());
            vwg vwgVar = new vwg(this);
            fr4 fr4VarI02 = k1g.i0(fr4VarI0, new qe6(vwgVar, (byte) 14), n97.a());
            this.e = fr4VarI02;
            shf shfVar = new shf();
            shfVar.c = this;
            shfVar.a = arrayList;
            shfVar.b = xd4Var;
            fr4VarI02.addListener(new wr9(fr4VarI02, shfVar, (byte) 0), n97.a());
            this.f = true;
        }
    }

    public final void b(axg axgVar) {
        synchronized (this) {
            if (this.c.equals(axgVar)) {
                return;
            }
            this.c = axgVar;
            Objects.toString(axgVar);
            this.b.n(axgVar);
        }
    }

    @Override // defpackage.v6f
    public final void onError(Throwable th) {
        ListenableFuture listenableFuture = this.e;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.e = null;
        }
        b(axg.a);
    }
}
