package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class lo5 extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    static {
        qs7.B("ConstraintProxy");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        qs7 qs7VarX = qs7.x();
        Objects.toString(intent);
        qs7VarX.getClass();
        int i = wb5.f;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
