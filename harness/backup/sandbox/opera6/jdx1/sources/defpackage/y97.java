package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.os.Binder;
import android.os.Bundle;
import android.os.Process;
import com.google.ads.interactivemedia.v3.internal.zzes;
import com.google.ads.interactivemedia.v3.internal.zzet;
import com.google.ads.interactivemedia.v3.internal.zzeu;
import com.google.ads.interactivemedia.v3.internal.zzev;
import com.google.ads.interactivemedia.v3.internal.zzfa;
import com.google.ads.interactivemedia.v3.internal.zzsx;
import com.google.android.gms.internal.play_billing.zzar;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class y97 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public y97(FirebaseAnalytics firebaseAnalytics) {
        this.a = (byte) 5;
        Objects.requireNonNull(firebaseAnalytics);
        this.b = firebaseAnalytics;
    }

    public y97(iri iriVar, SQLiteDatabase sQLiteDatabase) {
        this.a = (byte) 3;
        this.b = sQLiteDatabase;
    }

    public /* synthetic */ y97(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final Object a() throws InterruptedException {
        zzar zzarVar;
        long j;
        long j2;
        Boolean boolValueOf;
        Bundle bundle;
        yqp yqpVar = (yqp) this.b;
        cf3 cf3Var = yqpVar.e;
        synchronized (cf3Var.a) {
            if (cf3Var.b == 3) {
                return null;
            }
            int i = 0;
            boolean z = cf3Var.b == 1;
            zzjn zzjnVar = zzjn.zza;
            synchronized (cf3Var.a) {
                zzarVar = cf3Var.i;
            }
            cf3 cf3Var2 = yqpVar.e;
            if (zzarVar == null) {
                cf3Var2.q(0);
                int i2 = yqpVar.d;
                zzjn zzjnVar2 = zzjn.zzbc;
                mf3 mf3Var = xrp.g;
                cf3Var2.p(i2, mf3Var, zzjnVar2);
                yqpVar.d(mf3Var);
                return null;
            }
            String packageName = cf3Var2.g.getPackageName();
            try {
                if (zzarVar.zzb(25, packageName, "inapp") != 0) {
                    int i3 = 28;
                    int iZzb = 3;
                    int i4 = 28;
                    while (true) {
                        if (i4 < 3) {
                            i4 = 0;
                            break;
                        }
                        try {
                            zzc.zzn("BillingClient", "trying subs apiVersion: " + i4);
                            iZzb = zzarVar.zzb(i4, packageName, "subs");
                            if (iZzb == 0) {
                                zzc.zzn("BillingClient", "highestLevelSupportedForSubs: " + i4);
                                break;
                            }
                            i4--;
                        } catch (Exception e) {
                            yqpVar.f(e, z);
                        }
                    }
                    cf3 cf3Var3 = yqpVar.e;
                    cf3Var3.k = i4 >= 3;
                    if (i4 < 3) {
                        zzjnVar = zzjn.zzi;
                        zzc.zzn("BillingClient", "In-app billing API does not support subscription on this device.");
                    }
                    while (true) {
                        if (i3 < 3) {
                            break;
                        }
                        zzc.zzn("BillingClient", "trying inapp apiVersion: " + i3);
                        iZzb = zzarVar.zzb(i3, packageName, "inapp");
                        if (iZzb == 0) {
                            cf3Var3.l = i3;
                            zzc.zzn("BillingClient", "mHighestLevelSupportedForInApp: " + i3);
                            break;
                        }
                        i3--;
                    }
                    cf3.l(cf3Var3, cf3Var3.l);
                    if (cf3Var3.l < 3) {
                        zzjnVar = zzjn.zzJ;
                        zzc.zzo("BillingClient", "In-app billing API version 3 is not supported on this device.");
                    }
                    cf3.m(cf3Var3, iZzb);
                    if (iZzb == 0) {
                        yqpVar.c(z, 0);
                        yqpVar.d(xrp.f);
                        return null;
                    }
                    boolean z2 = z;
                    zzjn zzjnVar3 = zzjnVar;
                    mf3 mf3Var2 = xrp.a;
                    yqpVar.b(mf3Var2, zzjnVar3, null, z2, 0);
                    yqpVar.d(mf3Var2);
                    return null;
                }
                cf3 cf3Var4 = yqpVar.e;
                synchronized (fsp.class) {
                }
                synchronized (fsp.class) {
                }
                synchronized (fsp.class) {
                }
                synchronized (fsp.class) {
                }
                long jMin = 100;
                Exception e2 = null;
                while (true) {
                    long j3 = i;
                    if (j3 > 3) {
                        break;
                    }
                    try {
                        try {
                            boolValueOf = Boolean.valueOf(z);
                            bundle = new Bundle();
                            bundle.putString("callingPackage", cf3Var4.g.getPackageName());
                            j = jMin;
                        } catch (Exception e3) {
                            e2 = e3;
                            j = jMin;
                        }
                        try {
                            zzc.zzc(bundle, cf3Var4.c, cf3Var4.d, cf3Var4.E.longValue());
                            if (cf3Var4.y != null) {
                                bundle.putBoolean("enablePendingPurchases", true);
                            }
                            zzarVar.zzq(25, cf3Var4.g.getPackageName(), bundle, new krp(cf3Var4, yqpVar, boolValueOf, i));
                            break;
                        } catch (Exception e4) {
                            e2 = e4;
                            if (j3 == 3) {
                                yqpVar.e(e2, z, i);
                                return null;
                            }
                            j2 = j;
                            zzc.zzp("BillingClient", z1m.j(j2, "Transient error during initialize(), retrying in ", "ms"), e2);
                            try {
                                Thread.sleep(j2);
                                i++;
                                jMin = (long) Math.min(j2 * 2.0d, 60000.0d);
                            } catch (InterruptedException e5) {
                                Thread.currentThread().interrupt();
                                yqpVar.e(e5, z, i);
                            }
                        }
                    } catch (SecurityException e6) {
                        yqpVar.e(e6, z, i);
                    }
                    i++;
                    jMin = (long) Math.min(j2 * 2.0d, 60000.0d);
                }
                yqpVar.e(e2, z, i);
            } catch (Exception e7) {
                yqpVar.f(e7, z);
            }
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object objOnLoadInBackground = null;
        switch (this.a) {
            case 0:
                synchronized (((ea7) this.b)) {
                    ea7 ea7Var = (ea7) this.b;
                    if (ea7Var.i != null) {
                        ea7Var.G();
                        if (((ea7) this.b).p()) {
                            ((ea7) this.b).D();
                            ((ea7) this.b).k = 0;
                        }
                    }
                }
                return null;
            case 1:
                ((Runnable) this.b).run();
                return null;
            case 2:
                ie2 ie2Var = (ie2) this.b;
                AtomicBoolean atomicBoolean = ie2Var.c;
                ie2Var.d.set(true);
                try {
                    Process.setThreadPriority(10);
                    try {
                        objOnLoadInBackground = ie2Var.f.onLoadInBackground();
                    } catch (crf e) {
                        if (!atomicBoolean.get()) {
                            throw e;
                        }
                    }
                    Binder.flushPendingCommands();
                    return objOnLoadInBackground;
                } catch (Throwable th) {
                    try {
                        atomicBoolean.set(true);
                        throw th;
                    } finally {
                        ie2Var.a(null);
                    }
                }
            case 3:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.b;
                iri.o(3, sQLiteDatabase);
                iri.o(1, sQLiteDatabase);
                return null;
            case 4:
                synchronized (((z9p) this.b)) {
                    z9p z9pVar = (z9p) this.b;
                    z9pVar.m = false;
                    if (z9pVar.h != null) {
                        z9pVar.I();
                        if (((z9p) this.b).q()) {
                            ((z9p) this.b).E();
                            ((z9p) this.b).j = 0;
                        }
                    }
                }
                return null;
            case 5:
                return ((FirebaseAnalytics) this.b).a.zzG();
            case 6:
                return a();
            default:
                zzfa zzfaVar = (zzfa) this.b;
                zzsx zzsxVar = zzfaVar.e;
                try {
                    Task taskContinueWith = zzfaVar.c.getTask().continueWith(zzsxVar, new zzes()).continueWithTask(zzsxVar, new zzet(zzfaVar)).continueWith(zzsxVar, new zzeu());
                    return (List) Tasks.await(zzfaVar.g == null ? Tasks.forResult(new ArrayList()) : Tasks.withTimeout(taskContinueWith, r1.intValue(), TimeUnit.MILLISECONDS).addOnFailureListener(new zzev(zzfaVar)));
                } catch (InterruptedException | ExecutionException unused) {
                    return new ArrayList();
                }
        }
    }
}
