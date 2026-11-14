package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.x4o;
import java.util.Objects;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    static {
        qs7.B("RescheduleReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        qs7 qs7VarX = qs7.x();
        Objects.toString(intent);
        qs7VarX.getClass();
        try {
            x4o x4oVarC = x4o.c(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            x4oVarC.getClass();
            synchronized (x4o.m) {
                BroadcastReceiver.PendingResult pendingResult = x4oVarC.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                x4oVarC.i = pendingResultGoAsync;
                if (x4oVarC.h) {
                    pendingResultGoAsync.finish();
                    x4oVarC.i = null;
                }
            }
        } catch (IllegalStateException unused) {
            qs7.x().getClass();
        }
    }
}
