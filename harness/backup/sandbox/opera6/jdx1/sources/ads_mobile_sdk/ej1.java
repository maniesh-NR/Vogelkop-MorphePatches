package ads_mobile_sdk;

import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import defpackage.cfp;
import defpackage.fsg;
import defpackage.zhl;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class ej1 extends TimerTask {
    public final /* synthetic */ j7p a;
    public final /* synthetic */ Timer b;
    public final /* synthetic */ gj1 c;

    public ej1(gj1 gj1Var, j7p j7pVar, Timer timer) {
        this.c = gj1Var;
        this.a = j7pVar;
        this.b = timer;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        ji jiVar = this.c.g;
        WebViewCompat.removeWebMessageListener((WebView) jiVar.a, ((cfp) jiVar.b).a());
        r62 r62Var = this.a.a;
        defpackage.na2.B(r62Var.c, h.a, null, new fsg(new zhl((byte) 18, (mt5) null, r62Var), null, (byte) 3), 2);
        this.b.cancel();
    }
}
