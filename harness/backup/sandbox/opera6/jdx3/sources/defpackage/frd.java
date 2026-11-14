package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class frd extends l7n {
    public final SettingsManager b;
    public final d8j c;
    public final qoj d;
    public final j3i e;
    public final boolean f;
    public final nak g;
    public final rlh h;
    public final s9 i;

    public frd(SettingsManager settingsManager, d8j d8jVar, qoj qojVar, j3i j3iVar, boolean z) {
        this.b = settingsManager;
        this.c = d8jVar;
        this.d = qojVar;
        this.e = j3iVar;
        this.f = z;
        nak nakVarF = z4o.f(new erd(settingsManager.i("media_background_play"), ((Boolean) j3iVar.invoke()).booleanValue(), z));
        this.g = nakVarF;
        this.h = a26.j(nakVarF);
        s9 s9Var = new s9(this, (byte) 22);
        this.i = s9Var;
        settingsManager.F(s9Var);
    }

    public final void e() {
        this.b.H(this.i);
    }
}
