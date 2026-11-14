package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes.dex */
public final class dn6 implements um5 {
    public final Context a;
    public final jvg b;
    public boolean c;
    public boolean d;
    public final up1 e = new up1(this, 5);

    public dn6(Context context, jvg jvgVar) {
        this.a = context.getApplicationContext();
        this.b = jvgVar;
    }

    @Override // defpackage.kdc
    public final void onDestroy() {
    }

    @Override // defpackage.kdc
    public final void onStart() {
        NetworkInfo activeNetworkInfo;
        if (this.d) {
            return;
        }
        Context context = this.a;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        qyn.l(connectivityManager, "Argument must not be null");
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (RuntimeException unused) {
        }
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        this.c = z;
        try {
            context.registerReceiver(this.e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.d = true;
        } catch (SecurityException unused2) {
        }
    }

    @Override // defpackage.kdc
    public final void onStop() {
        if (this.d) {
            this.a.unregisterReceiver(this.e);
            this.d = false;
        }
    }
}
