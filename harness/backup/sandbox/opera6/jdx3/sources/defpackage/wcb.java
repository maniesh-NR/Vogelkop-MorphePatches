package defpackage;

import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class wcb implements cdb {
    public final BrowserActivity a;
    public final lqm b;
    public final eri c;

    public wcb(BrowserActivity browserActivity, lqm lqmVar, eri eriVar) {
        this.a = browserActivity;
        this.b = lqmVar;
        this.c = eriVar;
    }

    @Override // defpackage.cdb
    public final void execute() {
        this.a.n0(false, false);
        this.a.k1(3, this.b, this.c, false, false);
    }
}
