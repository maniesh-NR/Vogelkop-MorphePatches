package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class e29 extends l7n {
    public final v61 b;
    public final SettingsManager c;
    public final d8j d;
    public final nak e;
    public final rlh f;
    public final s9 g;

    public e29(v61 v61Var, SettingsManager settingsManager, d8j d8jVar) {
        wxe t8fVar;
        wxe t8fVar2 = s8f.m;
        this.b = v61Var;
        this.c = settingsManager;
        this.d = d8jVar;
        String strJ = sko.j("~/", v61.b(v61Var.a, settingsManager.m()));
        if (settingsManager.O()) {
            t8fVar = t8fVar2;
        } else {
            t8fVar = new t8f(sko.j("~/", v61.b(v61Var.a, settingsManager.t(false))));
        }
        nak nakVarF = z4o.f(new d29(strJ, t8fVar, settingsManager.n("concurrent_downloads"), settingsManager.i("ask_before_downloading")));
        this.e = nakVarF;
        this.f = a26.j(nakVarF);
        s9 s9Var = new s9(this, (byte) 13);
        this.g = s9Var;
        String strJ2 = sko.j("~/", v61.b(v61Var.a, settingsManager.m()));
        if (!settingsManager.O()) {
            t8fVar2 = new t8f(sko.j("~/", v61.b(v61Var.a, settingsManager.t(false))));
        }
        nakVarF.k((Object) null, new d29(strJ2, t8fVar2, settingsManager.n("concurrent_downloads"), settingsManager.i("ask_before_downloading")));
        settingsManager.F(s9Var);
    }

    public final void e() {
        this.c.H(this.g);
    }
}
