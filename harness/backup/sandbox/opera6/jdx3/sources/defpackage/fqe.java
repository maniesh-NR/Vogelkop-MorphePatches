package defpackage;

import android.content.Context;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* loaded from: classes.dex */
public final class fqe {
    public final Context a;
    public final umi b;
    public uqe c;
    public p1c d;
    public final tm5 e;
    public final ode f = new ode((Object) null);
    public WeakReference g = new WeakReference(null);
    public final ob h = new ob((Object) this, (byte) 10);
    public final dqe i = new dqe(this);
    public ndc j;
    public boolean k;

    public fqe(Context context, umi umiVar, tm5 tm5Var) {
        this.a = context.getApplicationContext();
        this.b = umiVar;
        this.e = tm5Var;
    }

    public final void a(q8j q8jVar) {
        b().b(q8jVar);
    }

    public final p1c b() {
        p1c p1cVar = this.d;
        if (p1cVar != null) {
            return p1cVar;
        }
        String[] strArr = OperaApplication.K;
        Context context = this.a;
        OperaApplication operaApplication = (OperaApplication) context.getApplicationContext();
        x5f x5fVar = operaApplication.L().c;
        SettingsManager settingsManagerJ = operaApplication.J();
        cqe cqeVar = bqe.k;
        bqe bqeVarR = uup.r(context);
        ite iteVar = hte.k;
        p1c p1cVar2 = new p1c(this.a, this.b, x5fVar, settingsManagerJ, bqeVarR, na2.w(context), this.e);
        this.d = p1cVar2;
        return p1cVar2;
    }

    public final uqe c() {
        if (this.c == null) {
            String[] strArr = OperaApplication.K;
            OperaApplication operaApplication = (OperaApplication) this.a.getApplicationContext();
            p1c p1cVarB = b();
            vx vxVar = new vx(this, (byte) 25);
            jtg jtgVarD = operaApplication.D();
            y0a y0aVar = new y0a(this, (byte) 26);
            Objects.requireNonNull((ize) operaApplication.r.y.get());
            uqe uqeVar = new uqe(this.a, this.b, this.e, p1cVarB, vxVar, jtgVarD, this.i, y0aVar, operaApplication.A(), operaApplication.L().c, operaApplication.L().d);
            this.c = uqeVar;
            boolean z = this.k;
            g93 g93Var = uqeVar.i;
            if (z != g93Var.s) {
                g93Var.s = z;
                fue fueVar = g93Var.n;
                fueVar.d();
                if (fueVar.a == cue.NewsFeed) {
                    g93Var.c();
                }
            }
            this.c.getClass();
            uqe uqeVar2 = this.c;
            eqe eqeVar = (eqe) this.g.get();
            if (eqeVar != null) {
                uqeVar2.getClass();
                eqeVar.a.add(new tqe(uqeVar2));
            }
            ndc ndcVar = this.j;
            if (ndcVar != null) {
                tcc lifecycle = ndcVar.getLifecycle();
                ob obVar = this.c.y;
                if (obVar != null) {
                    lifecycle.a(obVar);
                }
            }
        }
        return this.c;
    }
}
