package ads_mobile_sdk;

import android.content.Context;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewStartUpConfig;
import defpackage.dvo;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class ho3 {
    public static final AtomicBoolean a = new AtomicBoolean(false);
    public static final AtomicBoolean b = new AtomicBoolean(true);
    public static final AtomicBoolean c = new AtomicBoolean(true);
    public static final AtomicBoolean d = new AtomicBoolean(true);

    public static void a(Context context, Executor executor, boolean z, Set set, cp3 cp3Var) {
        if (!a.compareAndSet(false, true)) {
            if (cp3Var != null) {
                dvo dvoVar = new dvo();
                nh4 nh4Var = cp3Var.a;
                p0i p0iVar = t0i.b;
                nh4Var.resumeWith(new hv0(dvoVar));
                return;
            }
            return;
        }
        try {
            WebViewStartUpConfig.Builder builder = new WebViewStartUpConfig.Builder(executor);
            builder.setShouldRunUiThreadStartUpTasks(z);
            try {
                builder.setProfilesToLoadDuringStartup(set);
            } catch (Throwable unused) {
            }
            WebViewCompat.startUpWebView(context, builder.build(), new e7((Object) cp3Var, (byte) 8));
        } catch (Throwable unused2) {
            if (cp3Var != null) {
                dvo dvoVar2 = new dvo();
                nh4 nh4Var2 = cp3Var.a;
                p0i p0iVar2 = t0i.b;
                nh4Var2.resumeWith(new hv0(dvoVar2));
            }
        }
    }
}
