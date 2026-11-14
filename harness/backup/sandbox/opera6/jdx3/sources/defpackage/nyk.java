package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class nyk implements ywk {
    public final /* synthetic */ zwk a;
    public final /* synthetic */ db b;
    public final /* synthetic */ SettingsManager c;

    public nyk(db dbVar, zwk zwkVar, SettingsManager settingsManager) {
        this.a = zwkVar;
        this.b = dbVar;
        this.c = settingsManager;
    }

    @Override // defpackage.ywk
    public final void G(int i) {
        if (i == 0 || i == 1) {
            return;
        }
        zwk zwkVar = this.a;
        if (i == 2) {
            xih.q(this.b, zwkVar, this.c);
        } else if (i == 4) {
            return;
        }
        zwkVar.H(this);
    }
}
