package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjg;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzju;

/* loaded from: classes.dex */
public final class uop extends BroadcastReceiver {
    public boolean a;
    public final boolean b;
    public final /* synthetic */ i9c c;

    public uop(i9c i9cVar, boolean z) {
        this.c = i9cVar;
        this.b = z;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        if (!this.a) {
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.a = true;
        }
    }

    public final synchronized void b(Context context) {
        if (!this.a) {
            zzc.zzo("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.a = false;
        }
    }

    public final void c(Bundle bundle, mf3 mf3Var, int i, zzju zzjuVar, long j, boolean z) {
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            i9c i9cVar = this.c;
            if (byteArray != null) {
                ((mgh) i9cVar.e).n(zzjg.zzc(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD")), j, z);
            } else {
                ((mgh) i9cVar.e).n(nrp.b(zzjn.zzw, i, mf3Var, null, zzjuVar), j, z);
            }
        } catch (Throwable unused) {
            zzc.zzo("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r14, android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uop.onReceive(android.content.Context, android.content.Intent):void");
    }
}
