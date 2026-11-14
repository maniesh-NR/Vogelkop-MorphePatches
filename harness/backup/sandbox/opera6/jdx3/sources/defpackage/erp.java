package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class erp {
    public final r40 a;
    public final IntentFilter b;
    public final Context c;
    public final HashSet d;
    public up1 e;

    public erp(Context context) {
        r40 r40Var = new r40("AppUpdateListenerRegistry", (byte) 6);
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        this.d = new HashSet();
        this.e = null;
        this.a = r40Var;
        this.b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
    }

    public final void a() {
        up1 up1Var;
        HashSet hashSet = this.d;
        boolean zIsEmpty = hashSet.isEmpty();
        Context context = this.c;
        if (!zIsEmpty && this.e == null) {
            up1 up1Var2 = new up1(this, (byte) 26);
            this.e = up1Var2;
            int i = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.b;
            if (i >= 33) {
                context.registerReceiver(up1Var2, intentFilter, 2);
            } else {
                context.registerReceiver(up1Var2, intentFilter);
            }
        }
        if (!hashSet.isEmpty() || (up1Var = this.e) == null) {
            return;
        }
        context.unregisterReceiver(up1Var);
        this.e = null;
    }
}
