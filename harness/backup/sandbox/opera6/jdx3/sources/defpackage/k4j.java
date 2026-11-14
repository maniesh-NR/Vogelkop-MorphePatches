package defpackage;

import com.opera.android.browser.SessionStore;
import com.opera.android.browser.TabInfo;

/* loaded from: classes.dex */
public final class k4j implements a9l {
    public final int a;
    public final TabInfo b;
    public final /* synthetic */ SessionStore c;

    public k4j(SessionStore sessionStore, int i, TabInfo tabInfo) {
        this.c = sessionStore;
        this.a = i;
        this.b = tabInfo;
    }

    @Override // defpackage.a9l
    public final TabInfo a() {
        return this.b;
    }

    @Override // defpackage.a9l
    public final int d() {
        return ((bp) i()).d();
    }

    @Override // defpackage.a9l
    public final jke i() {
        return new bp(this.c, this.a);
    }

    @Override // defpackage.a9l
    public final int j() {
        return ((bp) i()).j();
    }

    @Override // defpackage.a9l
    public final z8l k() {
        bp bpVar = (bp) i();
        if (bpVar.d() == 0) {
            return null;
        }
        return new lld(this, bpVar.i(bpVar.j()));
    }

    @Override // defpackage.a9l
    public final d7l l(xbf xbfVar) {
        return xbfVar.r(this);
    }

    @Override // defpackage.a9l
    public final int m() {
        return this.a;
    }
}
