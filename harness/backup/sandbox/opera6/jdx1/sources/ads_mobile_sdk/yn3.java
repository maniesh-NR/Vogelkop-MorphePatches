package ads_mobile_sdk;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.fbp;
import defpackage.mip;
import defpackage.opo;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class yn3 implements opo, fbp {
    public static final String[] h = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    public final mip a;
    public final Context b;
    public final ExecutorService c;
    public long d = 0;
    public long e = 0;
    public long f = -1;
    public boolean g = false;

    public yn3(Context context, mip mipVar, ExecutorService executorService) {
        this.a = mipVar;
        this.b = context;
        this.c = executorService;
    }

    @Override // defpackage.fbp
    public final ListenableFuture a() {
        if (Build.VERSION.SDK_INT < 30) {
            return r0b.b;
        }
        Runnable m7mVar = new m7m(Executors.callable(new ttn(this, (byte) 29), null));
        this.c.execute(m7mVar);
        return m7mVar;
    }

    @Override // defpackage.opo
    public final void a(HashMap map) {
        long j;
        long j2;
        c();
        synchronized (this) {
            j = this.g ? this.e - this.d : -1L;
        }
        map.put("vs", Long.valueOf(j));
        synchronized (this) {
            j2 = this.f;
            this.f = -1L;
        }
        map.put("vf", Long.valueOf(j2));
    }

    @Override // defpackage.opo
    public final void a(HashMap map, Context context, View view) {
        c();
    }

    @Override // defpackage.opo
    public final void b(HashMap map) {
        c();
    }

    public final void c() {
        synchronized (this) {
            if (this.g) {
                this.a.getClass();
                this.e = System.currentTimeMillis();
            }
        }
    }

    public final void d() {
        xn3 xn3Var = new xn3(this);
        try {
            Object systemService = this.b.getSystemService("appops");
            systemService.getClass();
            ((AppOpsManager) systemService).startWatchingActive(h, this.c, xn3Var);
        } catch (Throwable unused) {
        }
    }
}
