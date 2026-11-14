package defpackage;

import com.opera.android.mainmenu.MainMenuSheetToggleLayout;
import com.opera.android.mainmenu.ToggleAnimationView;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public abstract class url extends k8 {
    public final SettingsManager o;
    public final nrl p;

    public url(MainMenuSheetToggleLayout mainMenuSheetToggleLayout, crk crkVar, SettingsManager settingsManager, nrl nrlVar) {
        super(mainMenuSheetToggleLayout, crkVar);
        this.o = settingsManager;
        this.p = nrlVar;
    }

    public final void B() {
        s0();
    }

    public final void s0() {
        q0();
        MainMenuSheetToggleLayout mainMenuSheetToggleLayout = (MainMenuSheetToggleLayout) this.a;
        mainMenuSheetToggleLayout.c = isEnabled();
        mainMenuSheetToggleLayout.a();
        boolean zIsEnabled = isEnabled();
        nrl nrlVar = this.p;
        if (zIsEnabled != nrlVar.a) {
            nrlVar.a = zIsEnabled;
            ToggleAnimationView toggleAnimationView = (ToggleAnimationView) nrlVar.b;
            if (((n2d) toggleAnimationView).m == null) {
                return;
            }
            toggleAnimationView.t(zIsEnabled ? nrl.c : nrl.d, null);
        }
    }

    public final void y(boolean z) {
        s0();
    }
}
