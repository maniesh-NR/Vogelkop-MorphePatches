package defpackage;

import com.opera.android.BrowserActivity;
import com.opera.android.bar.OmniButtonView;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public abstract class mgn implements as6 {
    public final BrowserActivity a;
    public final oz3 b;
    public final BrowserActivity c;
    public final gbf d;
    public final BrowserActivity e;
    public final k6l f;
    public final ydn g;
    public final ysl h;
    public final SettingsManager i;

    public mgn(BrowserActivity browserActivity, oz3 oz3Var, BrowserActivity browserActivity2, gbf gbfVar, BrowserActivity browserActivity3, k6l k6lVar, ydn ydnVar, ysl yslVar, SettingsManager settingsManager) {
        this.a = browserActivity;
        this.b = oz3Var;
        this.c = browserActivity2;
        this.d = gbfVar;
        this.e = browserActivity3;
        this.f = k6lVar;
        this.g = ydnVar;
        this.h = yslVar;
        this.i = settingsManager;
        f();
    }

    public boolean a() {
        return !ru9.c(this.a).a.getBoolean("vpn.tooltip_free_closed", false);
    }

    public final void b(lgn lgnVar) {
        if (e()) {
            oz3 oz3Var = this.b;
            oz3Var.getClass();
            oz3Var.b(lgnVar, ijm.b);
        } else {
            if (a()) {
                return;
            }
            g();
        }
    }

    public OmniButtonView c() {
        gbf gbfVar = this.d;
        if (gbfVar.b.q()) {
            return gbfVar.q();
        }
        return null;
    }

    public final boolean d(b2l b2lVar) {
        boolean zM = ((d7l) b2lVar).j.m();
        ydn ydnVar = this.g;
        return zM ? ydnVar.d.a : ydnVar.d.a();
    }

    public boolean e() {
        return this.i.i("feature_tips_notification") && this.e.k0();
    }

    public abstract void f();

    public abstract void g();

    @Override // defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        g();
    }
}
