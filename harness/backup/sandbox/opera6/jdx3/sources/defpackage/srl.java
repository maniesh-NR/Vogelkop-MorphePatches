package defpackage;

import android.content.Context;
import com.opera.android.mainmenu.MainMenuSheetToggleLayout;
import com.opera.android.mainmenu.ToggleAnimationView;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class srl extends url {
    public final i3j q;

    public srl(MainMenuSheetToggleLayout mainMenuSheetToggleLayout, crk crkVar, SettingsManager settingsManager, i3j i3jVar) {
        super(mainMenuSheetToggleLayout, crkVar, settingsManager, new nrl((ToggleAnimationView) mainMenuSheetToggleLayout.a.c, 2131951690));
        this.q = i3jVar;
    }

    @Override // defpackage.k8
    public final int W() {
        return 1;
    }

    @Override // defpackage.k8
    public final boolean isEnabled() {
        return this.o.i("compression");
    }

    @Override // defpackage.k8
    public final void k0(boolean z) {
        this.o.V(z ? 1 : 0, "compression");
    }

    @Override // defpackage.k8
    public final void r0(qrl qrlVar) {
        i3j i3jVar = this.q;
        Context context = (Context) i3jVar.a;
        if (((SettingsManager) i3jVar.b).i("show_conflicting_settings_warning")) {
            ydn ydnVar = (ydn) i3jVar.c;
            if (ydnVar.d.a && !ydnVar.c.isEnabled()) {
                String string = context.getString(2132022285);
                String string2 = context.getString(2132018492);
                String string3 = ((Context) i3jVar.a).getString(2132019667);
                z77 z77Var = (z77) i3jVar.d;
                ql5 ql5Var = new ql5(string, string2, string3, (SettingsManager) i3jVar.b, qrlVar);
                z77Var.getClass();
                z77Var.b(ql5Var, ijm.b);
                return;
            }
        }
        qrlVar.run();
    }
}
