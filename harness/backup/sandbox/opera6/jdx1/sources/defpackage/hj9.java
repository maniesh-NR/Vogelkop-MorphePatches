package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;

/* loaded from: classes.dex */
public final class hj9 implements Runnable {
    public static final long e;
    public final Context a;
    public final x4o b;
    public final rua c;
    public int d = 0;

    static {
        qs7.B("ForceStopRunnable");
        e = 315360000000L;
    }

    public hj9(Context context, x4o x4oVar) {
        this.a = context.getApplicationContext();
        this.b = x4oVar;
        this.c = x4oVar.g;
    }

    public static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + e;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj9.a():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            android.content.Context r0 = r7.a
            x4o r1 = r7.b
            jl5 r2 = r1.b
            r2.getClass()     // Catch: java.lang.Throwable -> L7b
            qs7 r3 = qs7.x()     // Catch: java.lang.Throwable -> L7b
            r3.getClass()     // Catch: java.lang.Throwable -> L7b
        L10:
            defpackage.j7h.j(r0)     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.Throwable -> L7b
            qs7 r3 = qs7.x()     // Catch: java.lang.Throwable -> L7b
            r3.getClass()     // Catch: java.lang.Throwable -> L7b
            r7.a()     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L7b
            goto L76
        L1e:
            r3 = move-exception
            int r4 = r7.d     // Catch: java.lang.Throwable -> L7b
            int r4 = r4 + 1
            r7.d = r4     // Catch: java.lang.Throwable -> L7b
            r5 = 3
            if (r4 < r5) goto L4f
            boolean r7 = w8h.p(r0)     // Catch: java.lang.Throwable -> L7b
            if (r7 == 0) goto L31
            java.lang.String r7 = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store."
            goto L33
        L31:
            java.lang.String r7 = "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot"
        L33:
            qs7 r0 = qs7.x()     // Catch: java.lang.Throwable -> L7b
            r0.getClass()     // Catch: java.lang.Throwable -> L7b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7b
            r0.<init>(r7, r3)     // Catch: java.lang.Throwable -> L7b
            z67 r7 = r2.g     // Catch: java.lang.Throwable -> L7b
            if (r7 == 0) goto L4e
            qs7 r2 = qs7.x()     // Catch: java.lang.Throwable -> L7b
            r2.getClass()     // Catch: java.lang.Throwable -> L7b
            r7.accept(r0)     // Catch: java.lang.Throwable -> L7b
            goto L76
        L4e:
            throw r0     // Catch: java.lang.Throwable -> L7b
        L4f:
            qs7 r3 = qs7.x()     // Catch: java.lang.Throwable -> L7b
            r3.getClass()     // Catch: java.lang.Throwable -> L7b
            int r3 = r7.d     // Catch: java.lang.Throwable -> L7b
            long r3 = (long) r3
            r5 = 300(0x12c, double:1.48E-321)
            long r3 = r3 * r5
            java.lang.Thread.sleep(r3)     // Catch: java.lang.InterruptedException -> L10 java.lang.Throwable -> L7b
            goto L10
        L60:
            r7 = move-exception
            java.lang.String r0 = "Unexpected SQLite exception during migrations"
            qs7 r3 = qs7.x()     // Catch: java.lang.Throwable -> L7b
            r3.getClass()     // Catch: java.lang.Throwable -> L7b
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7b
            r3.<init>(r0, r7)     // Catch: java.lang.Throwable -> L7b
            z67 r7 = r2.g     // Catch: java.lang.Throwable -> L7b
            if (r7 == 0) goto L7a
            r7.accept(r3)     // Catch: java.lang.Throwable -> L7b
        L76:
            r1.e()
            return
        L7a:
            throw r3     // Catch: java.lang.Throwable -> L7b
        L7b:
            r7 = move-exception
            r1.e()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj9.run():void");
    }
}
