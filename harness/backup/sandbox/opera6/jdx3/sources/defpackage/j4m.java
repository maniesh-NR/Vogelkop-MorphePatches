package defpackage;

import com.opera.android.settings.SettingsManager;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class j4m implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r4m b;

    public /* synthetic */ j4m(r4m r4mVar, byte b) {
        this.a = b;
        this.b = r4mVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        final r4m r4mVar = this.b;
        final szb szbVar = (szb) obj;
        r4mVar.getClass();
        switch (b) {
            case 0:
                final byte b2 = 0;
                r4mVar.c0(new Runnable() { // from class: q4m
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        szb szbVar2 = szbVar;
                        r4m r4mVar2 = r4mVar;
                        switch (b3) {
                            case 0:
                                y4m y4mVar = r4mVar2.b;
                                if (!szbVar2.equals(y4mVar.i)) {
                                    y4mVar.i = szbVar2;
                                    v3m v3mVar = y4mVar.d;
                                    SettingsManager settingsManager = v3mVar.b;
                                    settingsManager.getClass();
                                    settingsManager.Y("translate_web_pages_to_language", szbVar2.toString());
                                    v3mVar.i(szbVar2);
                                    y4mVar.v0();
                                }
                                r4mVar2.d.a();
                                r4mVar2.Z(r4mVar2.f.o, 1);
                                break;
                            default:
                                b0c b0cVar = r4mVar2.c;
                                b0cVar.f = szbVar2;
                                b0cVar.d = (byte) 1;
                                b0cVar.v0();
                                r4mVar2.d.a();
                                r4mVar2.Z(r4mVar2.f.o, 1);
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b3 = 1;
                r4mVar.c0(new Runnable() { // from class: q4m
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        szb szbVar2 = szbVar;
                        r4m r4mVar2 = r4mVar;
                        switch (b32) {
                            case 0:
                                y4m y4mVar = r4mVar2.b;
                                if (!szbVar2.equals(y4mVar.i)) {
                                    y4mVar.i = szbVar2;
                                    v3m v3mVar = y4mVar.d;
                                    SettingsManager settingsManager = v3mVar.b;
                                    settingsManager.getClass();
                                    settingsManager.Y("translate_web_pages_to_language", szbVar2.toString());
                                    v3mVar.i(szbVar2);
                                    y4mVar.v0();
                                }
                                r4mVar2.d.a();
                                r4mVar2.Z(r4mVar2.f.o, 1);
                                break;
                            default:
                                b0c b0cVar = r4mVar2.c;
                                b0cVar.f = szbVar2;
                                b0cVar.d = (byte) 1;
                                b0cVar.v0();
                                r4mVar2.d.a();
                                r4mVar2.Z(r4mVar2.f.o, 1);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
