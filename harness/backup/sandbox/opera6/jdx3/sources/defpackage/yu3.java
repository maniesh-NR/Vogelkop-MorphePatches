package defpackage;

import com.opera.android.BrowserActivity;
import com.opera.android.browser.TabInfo;

/* loaded from: classes.dex */
public final class yu3 implements tvb, w9l {
    public final /* synthetic */ BrowserActivity a;

    public /* synthetic */ yu3(BrowserActivity browserActivity) {
        this.a = browserActivity;
    }

    @Override // defpackage.w9l
    public final void L(Long l) {
        int i = BrowserActivity.E1;
        this.a.P0().e(new xl3(l), false);
    }

    @Override // defpackage.tvb
    public final boolean a() {
        return cqp.d0(this.a.getSupportFragmentManager()) != 1;
    }

    @Override // defpackage.w9l
    public final b2l h0(b2l b2lVar, TabInfo tabInfo) {
        boolean zM = ((d7l) b2lVar).j.m();
        int i = BrowserActivity.E1;
        return this.a.i0(zM, b2lVar, false, lqm.l, tabInfo);
    }

    @Override // defpackage.w9l
    public final b2l j0(p6l p6lVar, TabInfo tabInfo) {
        boolean z = p6lVar == p6l.b;
        int i = BrowserActivity.E1;
        return this.a.j1(z, false, tabInfo);
    }

    @Override // defpackage.w9l
    public final b2l k(p6l p6lVar) {
        boolean z = p6lVar == p6l.b;
        int i = BrowserActivity.E1;
        return this.a.i0(z, null, false, lqm.l, null);
    }

    @Override // defpackage.tvb
    public final void run() {
        int i = BrowserActivity.E1;
        BrowserActivity browserActivity = this.a;
        int iD0 = cqp.d0(browserActivity.getSupportFragmentManager());
        if (iD0 == 0) {
            browserActivity.v1();
        } else {
            if (iD0 != 2) {
                return;
            }
            browserActivity.getSupportFragmentManager().Y(-1, 1, (String) null);
        }
    }

    @Override // defpackage.w9l
    public final void y() {
        ((g8j) ((d8j) this.a.g0.E(d8j.class))).d(new int[0]);
    }
}
