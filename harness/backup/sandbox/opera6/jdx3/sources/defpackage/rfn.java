package defpackage;

import android.content.SharedPreferences;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.bar.OmniButtonView;
import com.opera.android.settings.SettingsManager;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class rfn extends mgn {
    public final yug j;
    public final HashSet k;
    public boolean l;
    public qfn m;

    /* JADX WARN: Multi-variable type inference failed */
    public rfn(BrowserActivity browserActivity, oz3 oz3Var, BrowserActivity browserActivity2, gbf gbfVar, BrowserActivity browserActivity3, k6l k6lVar, ydn ydnVar, yug yugVar, ysl yslVar, SettingsManager settingsManager) {
        super(browserActivity, oz3Var, browserActivity2, gbfVar, browserActivity3, k6lVar, ydnVar, yslVar, settingsManager);
        this.k = new HashSet();
        this.j = yugVar;
        if (ydnVar.d.a && ru9.c(browserActivity).a.getLong("vpn.tooltip_premium.vpn_enabled_timestamp", 0L) == 0) {
            nv6 nv6VarB = ru9.c(browserActivity).b();
            ((SharedPreferences.Editor) nv6VarB.a).putLong("vpn.tooltip_premium.vpn_enabled_timestamp", System.currentTimeMillis());
            nv6VarB.w();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean h(BrowserActivity browserActivity) {
        String[] strArr = OperaApplication.K;
        return (((OperaApplication) browserActivity.getApplicationContext()).R().c.isEnabled() || ru9.c(browserActivity).a.getBoolean("vpn.tooltip_premium.closed", false) || !((OperaApplication) browserActivity.getApplicationContext()).D().d()) ? false : true;
    }

    @Override // defpackage.mgn
    public final boolean a() {
        return h(this.a);
    }

    @Override // defpackage.mgn
    public final OmniButtonView c() {
        gbf gbfVar = this.d;
        if (gbfVar.b.q()) {
            return (OmniButtonView) gbfVar.r();
        }
        return null;
    }

    @Override // defpackage.mgn
    public final boolean e() {
        return super.e() && i(this.f.o);
    }

    @Override // defpackage.mgn
    public final void f() {
        this.c.getLifecycle().a(this);
        qfn qfnVar = new qfn(this);
        this.m = qfnVar;
        this.g.F(qfnVar);
        this.f.F(this.m);
    }

    @Override // defpackage.mgn
    public final void g() {
        this.c.getLifecycle().b(this);
        qfn qfnVar = this.m;
        if (qfnVar != null) {
            f6l f6lVar = qfnVar.b;
            if (f6lVar != null) {
                qfnVar.d.f.H(f6lVar);
                qfnVar.b = null;
            }
            this.g.H(this.m);
            this.f.H(this.m);
            this.m = null;
        }
    }

    public final boolean i(b2l b2lVar) {
        if (b2lVar == null) {
            return false;
        }
        d7l d7lVar = (d7l) b2lVar;
        return (d7lVar.n0() || !d(b2lVar) || this.g.t(d7lVar.i0())) ? false : true;
    }
}
