package defpackage;

import com.opera.android.BrowserActivity;
import java.util.Objects;

/* loaded from: classes.dex */
public final class rwe extends lim {
    public final bpd a;
    public final xg b;
    public final qim c;
    public final gjm d;
    public final eej e;
    public final yqd f;
    public final rqd g;
    public final BrowserActivity h;
    public final orm i;
    public qz j;

    /* JADX WARN: Multi-variable type inference failed */
    public rwe(BrowserActivity browserActivity, gjm gjmVar, xg xgVar, orm ormVar, eej eejVar) {
        bpd bpdVar = new bpd(browserActivity);
        qim qimVar = browserActivity.o;
        Objects.requireNonNull(qimVar);
        yqd yqdVar = new yqd(gjmVar, (byte) 17);
        rqd rqdVar = new rqd((byte) 23);
        this.a = bpdVar;
        this.b = xgVar;
        this.c = qimVar;
        this.d = gjmVar;
        this.e = eejVar;
        this.f = yqdVar;
        this.g = rqdVar;
        this.h = browserActivity;
        this.i = ormVar;
        qz qzVar = new qz(this, (byte) 14);
        this.j = qzVar;
        xgVar.a(qzVar);
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        qz qzVar = this.j;
        if (qzVar != null) {
            this.b.b(qzVar);
            this.j = null;
        }
    }
}
