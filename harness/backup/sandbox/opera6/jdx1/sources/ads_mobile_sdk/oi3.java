package ads_mobile_sdk;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import defpackage.auj;
import defpackage.hnp;
import defpackage.hto;
import defpackage.ouo;

/* loaded from: classes.dex */
public final class oi3 implements Runnable {
    public final Object a;
    public final /* synthetic */ byte b;

    public oi3(xu1 xu1Var) {
        this.b = (byte) 2;
        this.a = xu1Var.e;
    }

    public /* synthetic */ oi3(Object obj, byte b) {
        this.b = b;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        byte b = this.b;
        Object obj = this.a;
        switch (b) {
            case 0:
                ji jiVar = ((ri3) obj).e;
                ((os) jiVar.b).a(new hnp(jiVar));
                break;
            case 1:
                try {
                    WebSettings.getDefaultUserAgent((Context) obj);
                    break;
                } catch (Throwable unused) {
                    return;
                }
            case 2:
                ((WebView) obj).destroy();
                break;
            default:
                ouo ouoVar = (ouo) obj;
                int streamVolume = ouoVar.d.getStreamVolume(3);
                int streamMaxVolume = ouoVar.d.getStreamMaxVolume(3);
                ((auj) ouoVar.h).getClass();
                if (streamMaxVolume <= 0 || streamVolume <= 0) {
                    f = 0.0f;
                } else {
                    f = streamVolume / streamMaxVolume;
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                }
                ouoVar.f.set(false);
                if (((Float) ouoVar.e.getAndSet(Float.valueOf(f))).floatValue() != f) {
                    ouoVar.b.post(new hto(this, f, (byte) 1));
                    break;
                }
                break;
        }
    }
}
