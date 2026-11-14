package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes.dex */
public abstract class iin {
    public static final /* synthetic */ int a = 0;

    static {
        qs7.B("WakeLocks");
    }

    public static final PowerManager.WakeLock a(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String strConcat = "WorkManager: ".concat(str);
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, strConcat);
        synchronized (jin.a) {
        }
        return wakeLockNewWakeLock;
    }
}
