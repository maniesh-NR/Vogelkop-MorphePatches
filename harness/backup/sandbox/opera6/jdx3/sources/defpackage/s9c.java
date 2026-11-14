package defpackage;

import android.content.SharedPreferences;
import com.appsflyer.internal.j;
import com.opera.android.browser.obml.Platform;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s9c implements agg, Runnable {
    public final m9c a;

    public s9c(m9c m9cVar) {
        this.a = m9cVar;
    }

    @Override // defpackage.agg
    public final void a(String str, String str2) {
        if (Intrinsics.a(str, "Cookies") && Intrinsics.a(str2, "Client")) {
            run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        j.c((SharedPreferences) this.a.b.get(), "huid", Platform.c());
    }
}
