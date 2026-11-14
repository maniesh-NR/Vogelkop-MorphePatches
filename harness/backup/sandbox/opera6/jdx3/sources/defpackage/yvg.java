package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class yvg {
    public final Context a;
    public final tcc b;
    public final z77 c;
    public final umi d;
    public oml e;
    public final zvg f;
    public final c1a g;
    public gkj h;

    public yvg(Context context, tcc tccVar, gmk gmkVar, z77 z77Var, umi umiVar, c1a c1aVar) {
        this.a = context;
        this.b = tccVar;
        this.c = z77Var;
        this.d = umiVar;
        this.g = c1aVar;
        this.f = new zvg(tccVar, gmkVar, new pjg(this, (byte) 7));
    }

    public final void a() {
        nv6 nv6VarB = ru9.c(this.a).b();
        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("premium.upgrade_notification.is_pending", false);
        nv6VarB.w();
        oml omlVar = this.e;
        if (omlVar != null) {
            omlVar.cancel(false);
            this.e = null;
        }
        this.f.a();
    }

    public final void b(int i) {
        oml omlVar = this.e;
        if (omlVar != null) {
            omlVar.cancel(false);
            this.e = null;
        }
        if (this.h == null) {
            oml omlVar2 = new oml(this.d.d(new br((Object) this, i, (byte) 20)));
            this.e = omlVar2;
            omlVar2.b(null, 3L, TimeUnit.SECONDS, null);
        }
    }

    public final void c() {
        nv6 nv6VarB = ru9.c(this.a).b();
        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("premium.upgrade_notification.is_pending", true);
        nv6VarB.w();
        zvg zvgVar = this.f;
        if (zvgVar.d) {
            return;
        }
        qdc qdcVar = zvgVar.a;
        if (qdcVar.i == qcc.a) {
            return;
        }
        zvgVar.d = true;
        qdcVar.a(zvgVar);
        zvgVar.b.a.k(zvgVar);
    }

    public final void d() {
        c1a c1aVar = this.g;
        ydn ydnVar = (ydn) c1aVar.c;
        if (ydnVar.p().a()) {
            z77 z77Var = (z77) c1aVar.e;
            b23 b23VarR = c1aVar.R();
            z77Var.getClass();
            z77Var.b(b23VarR, ijm.b);
            return;
        }
        qdc qdcVar = (tcc) c1aVar.b;
        if (((nlk) c1aVar.h) != null || qdcVar.i == qcc.a) {
            return;
        }
        nlk nlkVar = new nlk(c1aVar, (byte) 4);
        c1aVar.h = nlkVar;
        ydnVar.F(nlkVar);
        qdcVar.a(c1aVar);
    }
}
