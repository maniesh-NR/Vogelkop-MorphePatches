package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class z9j extends pde implements p5j {
    public final SettingsManager l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9j(SettingsManager settingsManager, r16 r16Var) {
        super((b3c) b3c.i.get(settingsManager.n("tabui_layout_mode")));
        r16Var.getClass();
        this.l = settingsManager;
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if (str.equals("tabui_layout_mode")) {
            xf8.F0(this, (b3c) b3c.i.get(this.l.n(str)));
        }
    }

    public final void l() {
        SettingsManager settingsManager = this.l;
        settingsManager.F(this);
        xf8.F0(this, (b3c) b3c.i.get(settingsManager.n("tabui_layout_mode")));
    }

    public final void m() {
        this.l.H(this);
    }

    public final void r(Object obj) {
        super.r(obj);
        this.l.V(((b3c) obj).ordinal(), "tabui_layout_mode");
    }
}
