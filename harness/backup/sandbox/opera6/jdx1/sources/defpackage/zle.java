package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class zle extends nr9 implements Function1 {
    public static final zle a = new zle(1, rm5.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);

    public final Object invoke(Object obj) {
        Context applicationContext = ((Context) obj).getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        if (connectivityManager != null && nb6.h(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return new qm5(connectivityManager);
            } catch (Exception unused) {
            }
        }
        return pm5.a;
    }
}
