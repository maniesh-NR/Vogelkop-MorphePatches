package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class d6j {
    public final SettingsManager a;
    public final qfb b;
    public final x5f c;
    public final x5f d;
    public final hd e;
    public final osf f;
    public final wsf g;
    public final hd h;

    public d6j(SettingsManager settingsManager, qfb qfbVar, x5f x5fVar, x5f x5fVar2, hd hdVar, osf osfVar, wsf wsfVar, hd hdVar2) {
        this.a = settingsManager;
        this.b = qfbVar;
        this.c = x5fVar;
        this.d = x5fVar2;
        this.e = hdVar;
        this.f = osfVar;
        this.g = wsfVar;
        this.h = hdVar2;
        settingsManager.F(new j25(this, (byte) 5));
        if (settingsManager.i("ga_usage_statistics")) {
            qfbVar.setEnabled(settingsManager.i("ga_usage_statistics"));
        }
    }
}
