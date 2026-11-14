package defpackage;

import com.opera.android.BrowserActivity;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class ucn extends mgn {
    public final gjm j;
    public final ysj k;
    public f6l l;

    public ucn(BrowserActivity browserActivity, gjm gjmVar, oz3 oz3Var, ysj ysjVar, BrowserActivity browserActivity2, gbf gbfVar, BrowserActivity browserActivity3, k6l k6lVar, ydn ydnVar, ysl yslVar, SettingsManager settingsManager) {
        super(browserActivity, oz3Var, browserActivity2, gbfVar, browserActivity3, k6lVar, ydnVar, yslVar, settingsManager);
        this.j = gjmVar;
        this.k = ysjVar;
    }

    @Override // defpackage.mgn
    public final boolean e() {
        b2l b2lVar = this.f.o;
        return (!super.e() || b2lVar == null || d(b2lVar)) ? false : true;
    }

    @Override // defpackage.mgn
    public final void f() {
        this.c.getLifecycle().a(this);
        this.l = this.f.a(new c23(this));
    }

    @Override // defpackage.mgn
    public final void g() {
        this.c.getLifecycle().b(this);
        f6l f6lVar = this.l;
        if (f6lVar != null) {
            this.f.H(f6lVar);
            this.l = null;
        }
    }
}
