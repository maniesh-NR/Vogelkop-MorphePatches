package defpackage;

import android.content.Context;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final class blk extends lim implements f7f {
    public final ode a;
    public final Context b;

    public blk(Context context, ode odeVar) {
        this.a = odeVar;
        this.b = context.getApplicationContext();
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        this.a.k(this);
    }

    public final void d0(Object obj) {
        int iOrdinal = ((h0d) obj).ordinal();
        d59 d59Var = d59.f;
        Context context = this.b;
        if (iOrdinal == 0 || iOrdinal == 1) {
            String[] strArr = OperaApplication.K;
            ((OperaApplication) context.getApplicationContext()).q().c(d59Var, false);
        } else if (iOrdinal != 2) {
            h9o.p();
        } else {
            String[] strArr2 = OperaApplication.K;
            ((OperaApplication) context.getApplicationContext()).q().c(d59Var, true);
        }
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        this.a.p(this);
    }
}
