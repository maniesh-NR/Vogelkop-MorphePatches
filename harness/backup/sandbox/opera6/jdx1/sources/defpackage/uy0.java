package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* loaded from: classes.dex */
public abstract class uy0 {
    public static final /* synthetic */ int a = 0;

    static {
        qs7.B("Alarms");
    }

    public static void a(Context context, w4o w4oVar, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        int i2 = wb5.f;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        wb5.d(intent, w4oVar);
        PendingIntent service = PendingIntent.getService(context, i, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        qs7 qs7VarX = qs7.x();
        w4oVar.toString();
        qs7VarX.getClass();
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, w4o w4oVar, long j) {
        vzk vzkVarZ = workDatabase.z();
        tzk tzkVarP = vzkVarZ.P(w4oVar);
        if (tzkVarP != null) {
            int i = tzkVarP.c;
            a(context, w4oVar, i);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            int i2 = wb5.f;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            wb5.d(intent, w4oVar);
            PendingIntent service = PendingIntent.getService(context, i, intent, 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        int iIntValue = ((Number) workDatabase.t(new ce2(new rua(workDatabase), (byte) 2))).intValue();
        vzkVarZ.Q(new tzk(w4oVar.a, w4oVar.b, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        int i3 = wb5.f;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        wb5.d(intent2, w4oVar);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j, service2);
        }
    }
}
