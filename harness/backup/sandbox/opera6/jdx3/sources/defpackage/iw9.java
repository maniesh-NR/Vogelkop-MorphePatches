package defpackage;

import com.opera.android.settings.SettingsManager;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class iw9 extends j93 implements p5j {
    public final ev1 d;
    public final swf e;
    public final po3 f;
    public final ode g;
    public final h42 h;
    public final Set i;
    public final hw9 j;

    public iw9(SettingsManager settingsManager, ev1 ev1Var, g8j g8jVar, swf swfVar, po3 po3Var) {
        super(settingsManager, g8jVar);
        this.d = ev1Var;
        this.e = swfVar;
        this.f = po3Var;
        ode odeVar = new ode();
        this.g = odeVar;
        this.h = b8h.d(odeVar);
        this.i = e82.E(new String[]{"main_menu_swipe_gesture_enabled", "tab_switch_swipe_gesture_enabled", "thumb_scroller_enabled"});
        hw9 hw9Var = new hw9(this, (byte) 0);
        this.j = hw9Var;
        swfVar.g.b(hw9Var);
        settingsManager.F(this);
        h();
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if (this.i.contains(str)) {
            h();
        }
    }

    public final void e() {
        this.b.H(this);
        this.e.g.c(this.j);
    }

    public final f03 g(dp3 dp3Var, boolean z) {
        ev1 ev1Var = this.d;
        e7j e7jVarF = ev1Var.a;
        SettingsManager settingsManager = this.b;
        if (e7jVarF == null) {
            e7jVarF = settingsManager.f();
        }
        b7j b7jVarC = ev1Var.b;
        if (b7jVarC == null) {
            b7jVarC = settingsManager.c();
        }
        return dp3Var.a(e7jVarF, b7jVarC) ? new lw9(z) : kw9.l;
    }

    public final void h() {
        po3 po3Var = this.f;
        k7d k7dVar = po3Var.b;
        SettingsManager settingsManager = this.b;
        f03 f03VarG = g(k7dVar, settingsManager.i("main_menu_swipe_gesture_enabled"));
        f03 f03VarG2 = g(po3Var.a, settingsManager.i("tab_switch_swipe_gesture_enabled"));
        boolean zI = settingsManager.i("thumb_scroller_enabled");
        qwf qwfVar = (qwf) CollectionsKt.K(this.e.a());
        qhj.e.getClass();
        this.g.r(new gw9(f03VarG, f03VarG2, zI, r16.p(qwfVar)));
    }
}
