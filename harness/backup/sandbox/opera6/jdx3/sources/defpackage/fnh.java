package defpackage;

import J.N;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.SessionStore;
import com.opera.android.browser.TabInfo;
import com.opera.android.settings.SettingsManager;
import java.util.Collections;

/* loaded from: classes.dex */
public final class fnh {
    public final BrowserActivity a;
    public final b59 b;
    public k6l c;
    public final xbf d;
    public final SettingsManager e;
    public final SessionStore f;

    /* JADX WARN: Multi-variable type inference failed */
    public fnh(BrowserActivity browserActivity, umi umiVar, k6l k6lVar, xbf xbfVar, SettingsManager settingsManager, SessionStore sessionStore) {
        this.a = browserActivity;
        this.b = w1h.l(browserActivity, umiVar, "recently_closed_tabs", new bg1[0]);
        this.c = k6lVar;
        this.d = xbfVar;
        this.e = settingsManager;
        this.f = sessionStore;
        k6lVar.F(new dnh(this));
    }

    public final void a(int i, String str, TabInfo tabInfo, int i2, boolean z) {
        if (this.c == null) {
            return;
        }
        boolean z2 = this.e.C() == q7j.FOREGROUND;
        SessionStore sessionStore = this.f;
        long j = sessionStore.a;
        d7l d7lVar = null;
        if (N.MZcxFvhT(j, i)) {
            xbf xbfVar = this.d;
            int iL = ((vzk) xbfVar.b).L(false);
            boolean zM1uN$9Ct = N.M1uN$9Ct(j, i, iL);
            TabInfo tabInfo2 = (TabInfo) N.M6QsDkLe(j, i);
            N.MKH2wY$N(j, i);
            if (zM1uN$9Ct) {
                d7lVar = new d7l(xbfVar, new ilj((vzk) xbfVar.b, new bp(sessionStore, iL), iL, tabInfo2), (tw2) xbfVar.e, (aal) xbfVar.f, (iga) xbfVar.c, (rc6) xbfVar.d, lqm.j);
            } else {
                N.MKH2wY$N(j, iL);
            }
        }
        if (d7lVar != null) {
            this.c.e(i2, d7lVar, z);
            return;
        }
        boolean z3 = z || z2;
        vx3 vx3VarA = ay3.a(str, lqm.d, true);
        vx3VarA.c(true);
        vx3VarA.a(z3);
        vx3VarA.d(false);
        vx3VarA.f = z;
        vx3VarA.j = i2;
        vx3VarA.h = tabInfo;
        vx3VarA.r = false;
        am2.v(vx3VarA);
    }

    public final void b(enh enhVar, b2l b2lVar, boolean z) {
        if (((d7l) b2lVar).m) {
            b2lVar = this.c.o;
        }
        int iIndexOf = Collections.unmodifiableList(this.c.b).indexOf(b2lVar);
        if (iIndexOf == -1) {
            return;
        }
        a(enhVar.c, enhVar.b, null, iIndexOf + 1, z);
    }
}
