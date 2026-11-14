package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class vs8 implements wkn {
    public final /* synthetic */ byte a;
    public final ekc b;

    public vs8() {
        this.a = (byte) 1;
        this.b = new pde(v08.a);
    }

    public vs8(SettingsManager settingsManager) {
        this.a = (byte) 2;
        this.b = uyg.e(settingsManager, "wallpaper_current", new bli((byte) 7));
    }

    public vs8(vzk vzkVar) {
        this.a = (byte) 0;
        this.b = b8h.d(b8h.j((kze) vzkVar.c, new d58((byte) 8)));
    }

    @Override // defpackage.wkn
    public final ekc a() {
        byte b = this.a;
        ekc ekcVar = this.b;
        switch (b) {
            case 0:
                return (h42) ekcVar;
            case 1:
                return (pde) ekcVar;
            default:
                return (tsd) ekcVar;
        }
    }
}
