package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class sof {
    public final SettingsManager a;
    public final nzk b;
    public final jll c;
    public final jll d;
    public final nak e = z4o.f(new oof(nof.a, false, false, false));

    public sof(SettingsManager settingsManager, nzk nzkVar, jll jllVar, jll jllVar2) {
        this.a = settingsManager;
        this.b = nzkVar;
        this.c = jllVar;
        this.d = jllVar2;
        a();
    }

    public final void a() {
        nof nofVar;
        SettingsManager settingsManager = this.a;
        g7j g7jVarG = settingsManager.g();
        boolean zP = settingsManager.P(this.b);
        boolean zBooleanValue = ((Boolean) this.c.get()).booleanValue();
        switch (g7jVarG.ordinal()) {
            case 0:
                nofVar = nof.f;
                break;
            case 1:
                nofVar = nof.g;
                break;
            case 2:
                nofVar = nof.i;
                break;
            case 3:
                nofVar = nof.h;
                break;
            case 4:
                nofVar = nof.c;
                break;
            case 5:
                nofVar = nof.b;
                break;
            case 6:
                nofVar = nof.a;
                break;
            case 7:
                nofVar = nof.d;
                break;
            case 8:
                nofVar = nof.e;
                break;
            default:
                h9o.p();
                return;
        }
        oof oofVar = new oof(nofVar, zP, zBooleanValue, ((Boolean) this.d.get()).booleanValue());
        nak nakVar = this.e;
        nakVar.getClass();
        nakVar.k((Object) null, oofVar);
    }
}
