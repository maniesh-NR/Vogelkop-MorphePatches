package defpackage;

import J.N;
import com.opera.android.browser.TabInfo;

/* loaded from: classes.dex */
public final class j3j implements cdb {
    public final boolean a;
    public final boolean b;
    public final lsc c;
    public final xbf d;
    public final k6l e;
    public final int f;

    public j3j(boolean z, boolean z2, lsc lscVar, xbf xbfVar, k6l k6lVar, int i) {
        this.a = z;
        this.b = z2;
        this.c = lscVar;
        this.d = xbfVar;
        this.e = k6lVar;
        this.f = i;
    }

    @Override // defpackage.cdb
    public final void execute() {
        lsc lscVar = this.c;
        d7l d7lVarV = this.d.v(TabInfo.b(), this.a, (lscVar.d & 134217728) != 0 ? lqm.i : lqm.d, lscVar, true, null);
        k6l k6lVar = this.e;
        k6lVar.f(k6lVar.o, d7lVarV, this.b);
        uy3 uy3VarF = uy3.F(d7lVarV);
        N.MSWPRGSX(this.f, (uy3VarF != null ? uy3VarF.b : null).e());
    }
}
