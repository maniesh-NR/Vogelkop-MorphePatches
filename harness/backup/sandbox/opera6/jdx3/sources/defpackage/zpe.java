package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class zpe implements due, p5j {
    public final SettingsManager a;
    public final fue b;
    public final x5f c;

    public zpe(SettingsManager settingsManager, fue fueVar, x5f x5fVar) {
        this.a = settingsManager;
        this.b = fueVar;
        this.c = x5fVar;
        settingsManager.F(this);
        fueVar.b(this);
        fueVar.d();
        a(fueVar.a);
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if (str.equals("enable_newsfeed")) {
            fue fueVar = this.b;
            fueVar.d();
            a(fueVar.a);
        }
    }

    public final void a(cue cueVar) {
        boolean zI = this.a.i("enable_newsfeed");
        x5f x5fVar = this.c;
        if (!zI) {
            x5fVar.g0(ej0.b);
        } else {
            if (cueVar.ordinal() != 1) {
                return;
            }
            x5fVar.g0(ej0.d);
        }
    }

    @Override // defpackage.due
    public final void b(cue cueVar) {
        a(cueVar);
    }
}
