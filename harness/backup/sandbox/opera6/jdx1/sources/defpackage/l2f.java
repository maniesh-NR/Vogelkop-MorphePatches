package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class l2f {
    public static String d;
    public static k2f g;
    public final Context a;
    public final NotificationManager b;
    public static final Object c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f = new Object();

    public l2f(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i, String str) {
        this.b.cancel(str, i);
    }

    public final void b(String str, int i, Notification notification) {
        Bundle extras = NotificationCompat.getExtras(notification);
        if (extras == null || !extras.getBoolean("android.support.useSideChannel")) {
            this.b.notify(str, i, notification);
            return;
        }
        h2f h2fVar = new h2f(this.a.getPackageName(), i, str, notification);
        synchronized (f) {
            k2f k2fVar = g;
            if (k2fVar == null) {
                k2fVar = new k2f(this.a.getApplicationContext());
                g = k2fVar;
            }
            k2fVar.b.obtainMessage(0, h2fVar).sendToTarget();
        }
        this.b.cancel(str, i);
    }
}
