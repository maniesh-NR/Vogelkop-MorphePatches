package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class t9 extends j93 {
    public final bxk d;
    public final ode e;
    public final s9 f;

    public t9(d8j d8jVar, SettingsManager settingsManager, bxk bxkVar) {
        super(settingsManager, d8jVar);
        this.d = bxkVar;
        this.e = new ode();
        s9 s9Var = new s9(this, (byte) 0);
        this.f = s9Var;
        h();
        settingsManager.F(s9Var);
    }

    public final void e() {
        this.b.H(this.f);
    }

    public final ndo g(int i) {
        boolean zI = this.b.i("text_wrap");
        float f = i;
        this.d.getClass();
        float f2 = f / 100.0f;
        return new ndo(zI, f, i, f2 * 12.0f, f2 * 16.0f, f2 * 22.0f, f2 * 24.0f);
    }

    public final void h() {
        ndo ndoVarG = g(this.d.g());
        SettingsManager settingsManager = this.b;
        this.e.n(new r9(ndoVarG, settingsManager.i("force_enable_zoom"), s7j.values()[settingsManager.n("user_agent")].a));
    }
}
