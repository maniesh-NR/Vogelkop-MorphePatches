package ads_mobile_sdk;

import android.content.Context;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.fbp;
import defpackage.opo;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class e32 implements opo, fbp {
    public final Context a;
    public final ExecutorService b;
    public NetworkCapabilities c = null;
    public Network d = null;

    public e32(Context context, ExecutorService executorService) {
        this.a = context;
        this.b = executorService;
    }

    @Override // defpackage.fbp
    public final ListenableFuture a() {
        Runnable m7mVar = new m7m(Executors.callable(new ttn(this, (byte) 17), null));
        this.b.execute(m7mVar);
        return m7mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033 A[Catch: all -> 0x0042, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {, blocks: (B:8:0x000a, B:10:0x000e, B:12:0x0015, B:14:0x0019, B:16:0x0022, B:18:0x0026, B:20:0x002f, B:22:0x0033), top: B:34:0x000a }] */
    @Override // defpackage.opo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.HashMap r3) {
        /*
            r2 = this;
            java.lang.String r0 = "ntc"
            monitor-enter(r2)
            android.net.NetworkCapabilities r1 = r2.c     // Catch: java.lang.Throwable -> L46
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L46
            r3.put(r0, r1)
            monitor-enter(r2)
            android.net.NetworkCapabilities r0 = r2.c     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L33
            r1 = 4
            boolean r0 = r0.hasTransport(r1)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L19
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L42
            r0 = 2
            goto L36
        L19:
            android.net.NetworkCapabilities r0 = r2.c     // Catch: java.lang.Throwable -> L42
            r1 = 1
            boolean r0 = r0.hasTransport(r1)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L26
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L42
            r0 = 1
            goto L36
        L26:
            android.net.NetworkCapabilities r0 = r2.c     // Catch: java.lang.Throwable -> L42
            r1 = 0
            boolean r0 = r0.hasTransport(r1)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L33
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L42
            r0 = 0
            goto L36
        L33:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L42
            r0 = -1
        L36:
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "nt"
            r3.put(r0, r2)
            return
        L40:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L42
            throw r3
        L42:
            r3 = move-exception
            goto L40
        L44:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L46
            throw r3
        L46:
            r3 = move-exception
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.e32.a(java.util.HashMap):void");
    }

    @Override // defpackage.opo
    public final void a(HashMap map, Context context, View view) {
    }

    @Override // defpackage.opo
    public final void b(HashMap map) {
    }
}
