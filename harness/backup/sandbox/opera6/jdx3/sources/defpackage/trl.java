package defpackage;

import com.opera.android.mainmenu.MainMenuSheetToggleLayout;
import com.opera.android.mainmenu.ToggleAnimationView;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class trl extends url implements nwe, cxe {
    public final dxe q;
    public final xt8 r;

    public trl(MainMenuSheetToggleLayout mainMenuSheetToggleLayout, crk crkVar, SettingsManager settingsManager, dxe dxeVar, xt8 xt8Var) {
        super(mainMenuSheetToggleLayout, crkVar, settingsManager, new nrl((ToggleAnimationView) mainMenuSheetToggleLayout.a.c, 2131951691));
        this.q = dxeVar;
        this.r = xt8Var;
    }

    @Override // defpackage.k8
    public final void P() {
        ((MainMenuSheetToggleLayout) this.a).setOnClickListener(null);
        owe.c.H(this);
        this.q.h.c(this);
    }

    @Override // defpackage.k8
    public final int W() {
        return 3;
    }

    @Override // defpackage.k8
    public final void k0(boolean z) {
        this.q.T(z, true);
    }

    @Override // defpackage.k8
    public final boolean m0() {
        return uup.K(this.r, 1);
    }

    @Override // defpackage.k8
    public final void q0() {
        MainMenuSheetToggleLayout mainMenuSheetToggleLayout = (MainMenuSheetToggleLayout) this.a;
        mainMenuSheetToggleLayout.d = this.q.R(2132021995, 2132021994, 2132019660, 2132019659);
        mainMenuSheetToggleLayout.a();
    }
}
