package defpackage;

import ads_mobile_sdk.bw2;
import ads_mobile_sdk.oi3;
import ads_mobile_sdk.q6;
import ads_mobile_sdk.r6;
import ads_mobile_sdk.s6;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class hto implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ hto(Runnable runnable, float f, byte b) {
        this.a = b;
        this.c = runnable;
        this.b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        float f = this.b;
        ssi ssiVar = this.c;
        switch (b) {
            case 0:
                w5p w5pVar = (w5p) ((ouo) ssiVar.b).i;
                w5pVar.b = f;
                xqo xqoVar = (xqo) w5pVar.d;
                if (xqoVar == null) {
                    xqoVar = xqo.c;
                    w5pVar.d = xqoVar;
                }
                Iterator it = Collections.unmodifiableCollection(xqoVar.b).iterator();
                while (it.hasNext()) {
                    yp ypVar = ((uio) it.next()).e;
                    qii.p.m(ypVar.g(), "setDeviceVolume", Float.valueOf(f), ypVar.a);
                }
                break;
            default:
                w5p w5pVar2 = (w5p) ((ouo) ((oi3) ssiVar).a).i;
                w5pVar2.b = f;
                r6 r6Var = (r6) w5pVar2.d;
                if (r6Var == null) {
                    r6Var = r6.c;
                    w5pVar2.d = r6Var;
                }
                Iterator it2 = Collections.unmodifiableCollection(r6Var.b).iterator();
                while (it2.hasNext()) {
                    s6 s6Var = ((q6) it2.next()).d;
                    bw2.a$1.a((WebView) s6Var.b.get(), "setDeviceVolume", Float.valueOf(f), s6Var.a);
                }
                break;
        }
    }
}
