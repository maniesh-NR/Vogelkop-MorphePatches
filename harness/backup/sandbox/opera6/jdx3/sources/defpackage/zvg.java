package defpackage;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final class zvg implements f7f, as6 {
    public final tcc a;
    public final gmk b;
    public final pjg c;
    public boolean d;

    public zvg(tcc tccVar, gmk gmkVar, pjg pjgVar) {
        this.a = tccVar;
        this.b = gmkVar;
        this.c = pjgVar;
    }

    public final void a() {
        if (this.d) {
            this.d = false;
            this.b.a.p(this);
            this.a.b(this);
        }
    }

    public final void d0(Object obj) throws Resources.NotFoundException {
        uvg uvgVar = (uvg) obj;
        if (uvgVar == uvg.LOADING || uvgVar.ordinal() != 2) {
            return;
        }
        a();
        this.c.run();
    }

    @Override // defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        a();
    }
}
