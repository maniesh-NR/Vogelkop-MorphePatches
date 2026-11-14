package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.x4o;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    static {
        qs7.B("DiagnosticsRcvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        qs7.x().getClass();
        try {
            x4o.c(context).a(new tn(DiagnosticsWorker.class).j());
        } catch (IllegalStateException unused) {
            qs7.x().getClass();
        }
    }
}
