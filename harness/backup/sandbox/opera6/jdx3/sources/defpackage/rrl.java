package defpackage;

import com.opera.android.mainmenu.MainMenuSheetToggleLayout;
import com.opera.android.mainmenu.ToggleAnimationView;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class rrl extends url {
    public final boolean q;

    public rrl(MainMenuSheetToggleLayout mainMenuSheetToggleLayout, crk crkVar, SettingsManager settingsManager) {
        super(mainMenuSheetToggleLayout, crkVar, settingsManager, new nrl((ToggleAnimationView) mainMenuSheetToggleLayout.a.c, 2131951689));
        this.q = true;
    }

    @Override // defpackage.k8
    public final boolean isEnabled() {
        return this.q && this.o.i("ad_blocking");
    }

    @Override // defpackage.k8
    public final void k0(boolean z) {
        if (!z || this.q) {
            this.o.V(z ? 1 : 0, "ad_blocking");
        } else {
            xf8.s0(((MainMenuSheetToggleLayout) this.a).getContext(), new gpk((byte) 26), 2132017291, 2132017290);
        }
    }
}
