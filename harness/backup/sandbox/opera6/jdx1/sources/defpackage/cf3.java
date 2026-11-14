package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.play_billing.zzar;
import com.google.android.gms.internal.play_billing.zzbf;
import com.google.android.gms.internal.play_billing.zzbn;
import com.google.android.gms.internal.play_billing.zzbq;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzca;
import com.google.android.gms.internal.play_billing.zzcf;
import com.google.android.gms.internal.play_billing.zzdf;
import com.google.android.gms.internal.play_billing.zzdk;
import com.google.android.gms.internal.play_billing.zzje;
import com.google.android.gms.internal.play_billing.zzjg;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.internal.play_billing.zzjk;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzju;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkb;
import com.google.android.gms.internal.play_billing.zzlg;
import com.google.android.gms.internal.play_billing.zzli;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class cf3 {
    public final boolean A;
    public volatile df3 C;
    public ExecutorService D;
    public final Long E;
    public final zzbq F;
    public final String c;
    public final String d;
    public volatile i9c f;
    public final Context g;
    public final mgh h;
    public volatile zzar i;
    public volatile yqp j;
    public boolean k;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final hr5 y;
    public final boolean z;
    public final Object a = new Object();
    public volatile byte b = 0;
    public final Handler e = new Handler(Looper.getMainLooper());
    public int l = 0;
    public zzcf B = zzcf.zzk();

    public cf3(hr5 hr5Var, Context context, bf3 bf3Var) {
        long jNextLong = new Random().nextLong();
        this.E = Long.valueOf(jNextLong);
        this.F = zzbf.zza();
        this.c = a14.a;
        String strK = k();
        this.d = strK;
        this.g = context.getApplicationContext();
        zzjz zzjzVarZza = zzkb.zza();
        zzjzVarZza.zzx(a14.a);
        if (strK != null) {
            zzjzVarZza.zzy(strK);
        }
        zzjzVarZza.zzq(this.g.getPackageName());
        zzjzVarZza.zzd(jNextLong);
        zzjzVarZza.zzw(bf3Var.d);
        zzjzVarZza.zza(Build.VERSION.SDK_INT);
        zzjzVarZza.zzp(912213584L);
        w(zzjzVarZza, context);
        try {
            zzjzVarZza.zzb(this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            zzc.zzp("BillingClient", "Error getting app version code.", th);
        }
        this.h = new mgh(this.g, zzjzVarZza.zzi());
        zzc.zzo("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f = new i9c(this.g, (ye3) null, this.h);
        this.y = hr5Var;
        this.g.getPackageName();
        this.z = bf3Var.d;
    }

    public cf3(hr5 hr5Var, Context context, ye3 ye3Var, bf3 bf3Var) {
        long jNextLong = new Random().nextLong();
        this.E = Long.valueOf(jNextLong);
        this.F = zzbf.zza();
        this.c = a14.a;
        String strK = k();
        this.d = strK;
        this.g = context.getApplicationContext();
        zzjz zzjzVarZza = zzkb.zza();
        zzjzVarZza.zzx(a14.a);
        if (strK != null) {
            zzjzVarZza.zzy(strK);
        }
        zzjzVarZza.zzq(this.g.getPackageName());
        zzjzVarZza.zzd(jNextLong);
        zzjzVarZza.zzw(bf3Var.d);
        zzjzVarZza.zza(Build.VERSION.SDK_INT);
        zzjzVarZza.zzp(912213584L);
        w(zzjzVarZza, context);
        try {
            zzjzVarZza.zzb(this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            zzc.zzp("BillingClient", "Error getting app version code.", th);
        }
        this.h = new mgh(this.g, zzjzVarZza.zzi());
        if (ye3Var == null) {
            zzc.zzo("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f = new i9c(this.g, ye3Var, this.h);
        this.y = hr5Var;
        this.A = false;
        this.g.getPackageName();
        this.z = bf3Var.d;
    }

    public static Future f(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new iqp(futureSubmit, runnable, (byte) 0), (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception e) {
            zzc.zzp("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static String k() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void l(cf3 cf3Var, int i) {
        cf3Var.l = i;
        cf3Var.x = i >= 28;
        cf3Var.w = i >= 26;
        cf3Var.v = i >= 24;
        cf3Var.u = i >= 21;
        cf3Var.t = i >= 20;
        cf3Var.s = i >= 19;
        cf3Var.r = i >= 17;
        cf3Var.q = i >= 16;
        cf3Var.p = i >= 15;
        cf3Var.o = i >= 14;
        cf3Var.n = i >= 9;
        cf3Var.m = i >= 6;
    }

    public static void m(cf3 cf3Var, int i) {
        if (i != 0) {
            cf3Var.q(0);
            return;
        }
        synchronized (cf3Var.a) {
            if (cf3Var.b == 3) {
                return;
            }
            cf3Var.q(2);
            i9c i9cVar = cf3Var.f != null ? cf3Var.f : null;
            if (i9cVar != null) {
                boolean z = cf3Var.u;
                IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                i9cVar.b = z;
                uop uopVar = (uop) i9cVar.f;
                Context context = (Context) i9cVar.c;
                uopVar.a(context, intentFilter2);
                boolean z2 = i9cVar.b;
                uop uopVar2 = (uop) i9cVar.a;
                if (!z2) {
                    uopVar2.a(context, intentFilter);
                    return;
                }
                synchronized (uopVar2) {
                    if (!uopVar2.a) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            context.registerReceiver(uopVar2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != uopVar2.b ? 4 : 2);
                        } else {
                            context.registerReceiver(uopVar2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                        }
                        uopVar2.a = true;
                    }
                }
            }
        }
    }

    public static final void w(zzjz zzjzVar, Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                zzjzVar.zzv((int) (memoryInfo.totalMem / 1048576));
                zzjzVar.zzr(Build.BRAND);
                zzjzVar.zzu(Build.MODEL);
                zzjzVar.zzt(Build.MANUFACTURER);
                zzjzVar.zzs(Build.FINGERPRINT);
            }
        } catch (RuntimeException e) {
            zzc.zzp("BillingClient", "Runtime error while populating device info.", e);
        }
    }

    public final void A(zzjn zzjnVar, mf3 mf3Var, long j, boolean z) {
        try {
            int i = nrp.a;
            try {
                this.h.o(nrp.b(zzjnVar, 2, mf3Var, null, zzju.zza), this.l, j, z);
            } catch (Throwable th) {
                zzc.zzp("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            zzc.zzp("BillingClient", "Unable to log.", th2);
        }
    }

    public final void B(zzjn zzjnVar, mf3 mf3Var, String str, long j, boolean z) {
        try {
            int i = nrp.a;
            try {
                this.h.o(nrp.b(zzjnVar, 2, mf3Var, str, zzju.zza), this.l, j, z);
            } catch (Throwable th) {
                zzc.zzp("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            zzc.zzp("BillingClient", "Unable to log.", th2);
        }
    }

    public final void C(mf3 mf3Var) {
        if (Thread.interrupted()) {
            return;
        }
        this.e.post(new wr9(this, mf3Var, (byte) 28));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r6 = this;
            int r0 = defpackage.nrp.a     // Catch: java.lang.Throwable -> Le
            com.google.android.gms.internal.play_billing.zzju r0 = com.google.android.gms.internal.play_billing.zzju.zza     // Catch: java.lang.Throwable -> Le
            r1 = 12
            com.google.android.gms.internal.play_billing.zzjk r0 = defpackage.nrp.c(r1, r0)     // Catch: java.lang.Throwable -> Le
            r6.o(r0)     // Catch: java.lang.Throwable -> Le
            goto L16
        Le:
            r0 = move-exception
            java.lang.String r1 = "BillingClient"
            java.lang.String r2 = "Unable to log."
            com.google.android.gms.internal.play_billing.zzc.zzp(r1, r2, r0)
        L16:
            java.lang.Object r0 = r6.a
            monitor-enter(r0)
            i9c r1 = r6.f     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L3a
            i9c r1 = r6.f     // Catch: java.lang.Throwable -> L32
            java.lang.Object r2 = r1.a     // Catch: java.lang.Throwable -> L32
            uop r2 = (defpackage.uop) r2     // Catch: java.lang.Throwable -> L32
            java.lang.Object r3 = r1.c     // Catch: java.lang.Throwable -> L32
            android.content.Context r3 = (android.content.Context) r3     // Catch: java.lang.Throwable -> L32
            r2.b(r3)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.f     // Catch: java.lang.Throwable -> L32
            uop r1 = (defpackage.uop) r1     // Catch: java.lang.Throwable -> L32
            r1.b(r3)     // Catch: java.lang.Throwable -> L32
            goto L3a
        L32:
            r1 = move-exception
            java.lang.String r2 = "BillingClient"
            java.lang.String r3 = "There was an exception while shutting down broadcast manager while ending connection!"
            com.google.android.gms.internal.play_billing.zzc.zzp(r2, r3, r1)     // Catch: java.lang.Throwable -> L77
        L3a:
            java.lang.String r1 = "BillingClient"
            java.lang.String r2 = "Unbinding from service."
            com.google.android.gms.internal.play_billing.zzc.zzn(r1, r2)     // Catch: java.lang.Throwable -> L45
            r6.s()     // Catch: java.lang.Throwable -> L45
            goto L4d
        L45:
            r1 = move-exception
            java.lang.String r2 = "BillingClient"
            java.lang.String r3 = "There was an exception while unbinding from the service while ending connection!"
            com.google.android.gms.internal.play_billing.zzc.zzp(r2, r3, r1)     // Catch: java.lang.Throwable -> L77
        L4d:
            r1 = 3
            r2 = 0
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L5f
            java.util.concurrent.ExecutorService r3 = r6.D     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L59
            r3.shutdownNow()     // Catch: java.lang.Throwable -> L5d
            r6.D = r2     // Catch: java.lang.Throwable -> L5d
        L59:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5f
            goto L67
        L5b:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5d
            throw r3     // Catch: java.lang.Throwable -> L5f
        L5d:
            r3 = move-exception
            goto L5b
        L5f:
            r3 = move-exception
            java.lang.String r4 = "BillingClient"
            java.lang.String r5 = "There was an exception while shutting down the executor service while ending connection!"
            com.google.android.gms.internal.play_billing.zzc.zzp(r4, r5, r3)     // Catch: java.lang.Throwable -> L6e
        L67:
            r6.q(r1)     // Catch: java.lang.Throwable -> L77
            r6.C = r2     // Catch: java.lang.Throwable -> L77
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
            return
        L6e:
            r3 = move-exception
            r6.q(r1)     // Catch: java.lang.Throwable -> L77
            r6.C = r2     // Catch: java.lang.Throwable -> L77
            throw r3     // Catch: java.lang.Throwable -> L77
        L75:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
            throw r6
        L77:
            r6 = move-exception
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cf3.a():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v33, types: [android.os.Bundle] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.mf3 b(hjf r33, final defpackage.lf3 r34) {
        /*
            Method dump skipped, instructions count: 1799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cf3.b(hjf, lf3):mf3");
    }

    public void c(qie qieVar, cz8 cz8Var) {
        byte b = 1;
        if (f(new hpp(this, cz8Var, qieVar, b), 30000L, new iqp(this, cz8Var, b), Looper.myLooper() == null ? this.e : new Handler(Looper.myLooper()), e()) == null) {
            mf3 mf3VarI = i();
            y(7, mf3VarI, zzjn.zzy);
            cz8Var.a(mf3VarI, new yqa(zzca.zzk(), zzca.zzk(), (byte) 28));
        }
    }

    public void d(ve3 ve3Var) {
        r(ve3Var, 0);
    }

    public final synchronized ExecutorService e() {
        ExecutorService executorServiceNewFixedThreadPool;
        executorServiceNewFixedThreadPool = this.D;
        if (executorServiceNewFixedThreadPool == null) {
            executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(zzc.zza, new qqp(this));
            this.D = executorServiceNewFixedThreadPool;
        }
        return executorServiceNewFixedThreadPool;
    }

    public final zg g(mf3 mf3Var, zzjn zzjnVar, String str, Exception exc) {
        zzc.zzp("BillingClient", str, exc);
        try {
            n(nrp.b(zzjnVar, 7, mf3Var, nrp.a(exc), zzju.zza));
        } catch (Throwable th) {
            zzc.zzp("BillingClient", "Unable to log.", th);
        }
        return new zg(mf3Var.a, mf3Var.c, new ArrayList(), new ArrayList());
    }

    public final mf3 h(int i) {
        zzc.zzn("BillingClient", "Service connection is valid. No need to re-initialize.");
        zzji zzjiVarZza = zzjk.zza();
        zzjiVarZza.zze(6);
        zzlg zzlgVarZza = zzli.zza();
        zzlgVarZza.zze(true);
        zzlgVarZza.zza(i > 0);
        zzlgVarZza.zzb(i);
        zzjiVarZza.zzd(zzlgVarZza);
        o((zzjk) zzjiVarZza.zzi());
        return xrp.f;
    }

    public final mf3 i() {
        int[] iArr = {0, 3};
        synchronized (this.a) {
            for (int i = 0; i < 2; i++) {
                if (this.b == iArr[i]) {
                    return xrp.g;
                }
            }
            return xrp.e;
        }
    }

    public final zzdk j(int i) {
        if (this.z && !v()) {
            return zzu.zza(new mhk(this, i));
        }
        zzc.zzn("BillingClient", "Already connected or not opted into auto reconnection.");
        return zzdf.zza(xrp.f);
    }

    public final void n(zzjg zzjgVar) {
        try {
            mgh mghVar = this.h;
            int i = this.l;
            mghVar.getClass();
            try {
                zzjz zzjzVarZzq = ((zzkb) mghVar.b).zzq();
                zzjzVarZzq.zzc(i);
                mghVar.b = zzjzVarZzq.zzi();
                mghVar.l(zzjgVar);
            } catch (Throwable th) {
                zzc.zzp("BillingLogger", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            zzc.zzp("BillingClient", "Unable to log.", th2);
        }
    }

    public final void o(zzjk zzjkVar) {
        try {
            mgh mghVar = this.h;
            int i = this.l;
            mghVar.getClass();
            try {
                zzjz zzjzVarZzq = ((zzkb) mghVar.b).zzq();
                zzjzVarZzq.zzc(i);
                zzkb zzkbVar = (zzkb) zzjzVarZzq.zzi();
                mghVar.b = zzkbVar;
                try {
                    mghVar.t(zzjkVar, zzkbVar);
                } catch (Throwable th) {
                    zzc.zzp("BillingLogger", "Unable to log.", th);
                }
            } catch (Throwable th2) {
                zzc.zzp("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            zzc.zzp("BillingClient", "Unable to log.", th3);
        }
    }

    public final void p(int i, mf3 mf3Var, zzjn zzjnVar) {
        try {
            int i2 = nrp.a;
            zzje zzjeVarZzq = nrp.b(zzjnVar, 6, mf3Var, null, zzju.zza).zzq();
            zzlg zzlgVarZza = zzli.zza();
            zzlgVarZza.zza(i > 0);
            zzlgVarZza.zzb(i);
            zzjeVarZzq.zze(zzlgVarZza);
            n((zzjg) zzjeVarZzq.zzi());
        } catch (Throwable th) {
            zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(int i) {
        synchronized (this.a) {
            if (this.b == 3) {
                return;
            }
            byte b = this.b;
            zzc.zzn("BillingClient", "Setting clientState from " + (b != 0 ? b != 1 ? b != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED") + " to " + (i != 0 ? i != 1 ? i != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED"));
            this.b = i;
        }
    }

    public final void r(df3 df3Var, int i) {
        zzjn zzjnVar;
        mf3 mf3VarH;
        mf3 mf3Var;
        synchronized (this.a) {
            if (v()) {
                mf3VarH = h(i);
            } else {
                if (this.b == 1) {
                    zzc.zzo("BillingClient", "Client is already in the process of connecting to billing service.");
                    zzjn zzjnVar2 = zzjn.zzK;
                    mf3Var = xrp.c;
                    p(i, mf3Var, zzjnVar2);
                } else if (this.b == 3) {
                    zzc.zzo("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    zzjn zzjnVar3 = zzjn.zzL;
                    mf3Var = xrp.g;
                    p(i, mf3Var, zzjnVar3);
                } else {
                    q(1);
                    if (i == 0) {
                        this.C = df3Var;
                        i = 0;
                    }
                    s();
                    zzc.zzn("BillingClient", "Starting in-app billing setup.");
                    this.j = new yqp(this, df3Var, i);
                    yqp yqpVar = this.j;
                    synchronized (yqpVar.e.a) {
                        try {
                            zzbn zzbnVar = yqpVar.b;
                            zzbnVar.zzd();
                            zzbnVar.zze();
                        } finally {
                        }
                    }
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> listQueryIntentServices = this.g.getPackageManager().queryIntentServices(intent, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        zzjnVar = zzjn.zzO;
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                zzjnVar = zzjn.zzN;
                                zzc.zzo("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.c);
                                synchronized (this.a) {
                                    if (this.b == 2) {
                                        mf3VarH = h(i);
                                    } else if (this.b != 1) {
                                        zzc.zzo("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                        zzjn zzjnVar4 = zzjn.zzba;
                                        mf3Var = xrp.g;
                                        p(i, mf3Var, zzjnVar4);
                                    } else {
                                        yqp yqpVar2 = this.j;
                                        Context context = this.g;
                                        if (i > 0 ? context.bindService(intent2, 1, e(), yqpVar2) : context.bindService(intent2, yqpVar2, 1)) {
                                            zzc.zzn("BillingClient", "Service was bonded successfully.");
                                            mf3VarH = null;
                                        } else {
                                            zzjnVar = zzjn.zzM;
                                            zzc.zzo("BillingClient", "Connection to Billing service is blocked.");
                                        }
                                    }
                                }
                            }
                        } else {
                            zzjnVar = zzjn.zzN;
                            zzc.zzo("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    }
                    q(0);
                    zzc.zzn("BillingClient", "Billing service unavailable on device.");
                    mf3 mf3Var2 = xrp.a;
                    p(i, mf3Var2, zzjnVar);
                    mf3VarH = mf3Var2;
                }
                mf3VarH = mf3Var;
            }
        }
        if (mf3VarH != null) {
            df3Var.a(mf3VarH);
        }
    }

    public final void s() {
        synchronized (this.a) {
            if (this.j != null) {
                try {
                    this.g.unbindService(this.j);
                } catch (Throwable th) {
                    try {
                        zzc.zzp("BillingClient", "There was an exception while unbinding service!", th);
                        this.i = null;
                        this.j = null;
                    } finally {
                        this.i = null;
                        this.j = null;
                    }
                }
            }
        }
    }

    public final boolean t(long j) {
        try {
            int i = ((mf3) j(1).get(j, TimeUnit.MILLISECONDS)).a;
            if (i == 0) {
                zzc.zzn("BillingClient", "Reconnection succeeded with result: " + i);
            } else {
                zzc.zzo("BillingClient", "Reconnection failed with result: " + i);
            }
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            zzc.zzp("BillingClient", "Error during reconnection attempt: ", e);
        }
        return v();
    }

    public final boolean u(long j) throws InterruptedException {
        long jMax;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zzbn zzbnVarZzb = zzbn.zzb(this.F);
        int i = n1h.c;
        long jZza = j;
        for (int i2 = 1; i2 <= i; i2++) {
            try {
                jMax = Math.max(0L, jZza);
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                zzc.zzp("BillingClient", "Error during reconnection attempt: ", e);
            }
            if (jMax <= 0) {
                zzc.zzo("BillingClient", "No time remaining for reconnection attempt.");
                return v();
            }
            int i3 = ((mf3) j(i2).get(jMax, timeUnit)).a;
            if (i3 == 0) {
                zzc.zzn("BillingClient", "Reconnection succeeded with result: " + i3);
                return v();
            }
            zzc.zzo("BillingClient", "Reconnection failed with result: " + i3);
            jZza = j - zzbnVarZzb.zza(timeUnit);
            long jPow = ((long) Math.pow(2.0d, i2 - 1)) * 1000;
            if (jZza < jPow) {
                zzc.zzo("BillingClient", "Reconnection failed due to timeout limit reached.");
                return v();
            }
            if (i2 < i && jPow > 0) {
                try {
                    Thread.sleep(jPow);
                    jZza = j - zzbnVarZzb.zza(timeUnit);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    zzc.zzp("BillingClient", "Error sleeping during reconnection attempt: ", e2);
                }
            }
        }
        zzc.zzo("BillingClient", "Max retries reached.");
        return v();
    }

    public final boolean v() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.b == 2 && this.i != null && this.j != null) {
                z = true;
            }
        }
        return z;
    }

    public final rgh x(mf3 mf3Var, zzjn zzjnVar, String str, Exception exc) {
        try {
            n(nrp.b(zzjnVar, 9, mf3Var, nrp.a(exc), zzju.zza));
        } catch (Throwable th) {
            zzc.zzp("BillingClient", "Unable to log.", th);
        }
        zzc.zzp("BillingClient", str, exc);
        return new rgh(mf3Var, (Object) null, false);
    }

    public final void y(int i, mf3 mf3Var, zzjn zzjnVar) {
        try {
            int i2 = nrp.a;
            n(nrp.b(zzjnVar, i, mf3Var, null, zzju.zza));
        } catch (Throwable th) {
            zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    public final void z(zzjn zzjnVar, mf3 mf3Var, long j) {
        try {
            int i = nrp.a;
            try {
                this.h.m(nrp.b(zzjnVar, 2, mf3Var, null, zzju.zza), this.l, j);
            } catch (Throwable th) {
                zzc.zzp("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            zzc.zzp("BillingClient", "Unable to log.", th2);
        }
    }
}
