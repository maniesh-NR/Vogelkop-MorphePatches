package defpackage;

import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class fu3 extends lim implements kg {
    public final /* synthetic */ BrowserActivity a;

    public fu3(BrowserActivity browserActivity) {
        this.a = browserActivity;
    }

    public final void R(eri eriVar, boolean z) {
        gbf gbfVar = this.a.M;
        if (gbfVar == null) {
            gbfVar = null;
        }
        vbf vbfVar = gbfVar.j;
        vbfVar.G = eriVar;
        vbfVar.q();
        if (!z || vbfVar.p()) {
            return;
        }
        zg zgVar = vbfVar.t.b.g;
        if (zgVar == null) {
            gbfVar.l(null, hbf.d);
            return;
        }
        int i = zgVar.a;
        xbf xbfVarG = gbfVar.t.y().g();
        xbfVarG.getClass();
        xbf.F(xbfVarG, skk.b, i, 4);
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        BrowserActivity browserActivity = this.a;
        browserActivity.M().a.add(this);
        R(browserActivity.M().b(), false);
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        this.a.M().a.remove(this);
    }

    @Override // defpackage.kg
    public final void q(eri eriVar, boolean z) {
        R(eriVar, z);
    }
}
