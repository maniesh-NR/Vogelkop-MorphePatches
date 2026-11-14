package defpackage;

import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class q0h implements as6 {
    public final BrowserActivity a;
    public final BrowserActivity b;
    public final BrowserActivity c;
    public final eej d;
    public final k6l e;
    public final qz f;
    public int g;

    public q0h(BrowserActivity browserActivity, BrowserActivity browserActivity2, BrowserActivity browserActivity3, eej eejVar, k6l k6lVar) {
        qz qzVar = new qz(this, (byte) 19);
        this.f = qzVar;
        this.a = browserActivity;
        this.b = browserActivity2;
        this.c = browserActivity3;
        this.d = eejVar;
        this.e = k6lVar;
        browserActivity2.getLifecycle().a(this);
        k6lVar.b(qzVar);
    }

    @Override // defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        this.e.v(this.f);
        this.b.getLifecycle().b(this);
    }
}
