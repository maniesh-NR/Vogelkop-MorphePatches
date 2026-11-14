package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.zzba;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzdf;
import com.google.android.gms.internal.play_billing.zzdk;
import com.google.android.gms.internal.play_billing.zzjg;
import com.google.android.gms.internal.play_billing.zzjk;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzju;
import com.google.android.gms.internal.play_billing.zzkb;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class mrp extends cf3 {
    public final Context G;
    public volatile byte H;
    public volatile zzba I;
    public volatile tko J;
    public volatile ScheduledExecutorService K;

    public mrp(hr5 hr5Var, Context context, bf3 bf3Var) {
        super(hr5Var, context, bf3Var);
        this.H = (byte) 0;
        this.G = context;
    }

    public mrp(hr5 hr5Var, Context context, ye3 ye3Var, bf3 bf3Var) {
        super(hr5Var, context, ye3Var, bf3Var);
        this.H = (byte) 0;
        this.G = context;
    }

    public final synchronized boolean E() {
        if (this.H == 2 && this.I != null) {
            if (this.J != null) {
                return true;
            }
        }
        return false;
    }

    public final zzdk F(int i) {
        if (E()) {
            return zzu.zza(new lq3(this, i, (byte) 6));
        }
        zzc.zzo("BillingClientTesting", "Billing Override Service is not ready.");
        G(28, xrp.a(-1, "Billing Override Service connection is disconnected."), zzjn.zzaP);
        return zzdf.zza(0);
    }

    public final void G(int i, mf3 mf3Var, zzjn zzjnVar) {
        int i2 = nrp.a;
        zzjg zzjgVarB = nrp.b(zzjnVar, i, mf3Var, null, zzju.zza);
        Objects.requireNonNull(zzjgVarB, "ApiFailure should not be null");
        this.h.l(zzjgVarB);
    }

    public final void H(int i) {
        int i2 = nrp.a;
        zzjk zzjkVarC = nrp.c(i, zzju.zza);
        Objects.requireNonNull(zzjkVarC, "ApiSuccess should not be null");
        mgh mghVar = this.h;
        mghVar.getClass();
        try {
            mghVar.t(zzjkVarC, (zzkb) mghVar.b);
        } catch (Throwable th) {
            zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // defpackage.cf3
    public final void a() {
        synchronized (this) {
            H(27);
            try {
                try {
                    if (this.J != null && this.I != null) {
                        zzc.zzn("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.G.unbindService(this.J);
                        this.J = new tko(this, (byte) 3);
                    }
                    this.I = null;
                    if (this.K != null) {
                        this.K.shutdownNow();
                        this.K = null;
                    }
                } catch (RuntimeException e) {
                    zzc.zzp("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e);
                }
            } finally {
                this.H = (byte) 3;
            }
        }
        super.a();
    }

    @Override // defpackage.cf3
    public final mf3 b(hjf hjfVar, lf3 lf3Var) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) F(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            G(28, xrp.q, zzjn.zzaX);
            zzc.zzp("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
        } catch (Exception e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            G(28, xrp.q, zzjn.zzaQ);
            zzc.zzp("BillingClientTesting", "An error occurred while retrieving billing override.", e2);
        }
        if (iIntValue > 0) {
            mf3 mf3VarA = xrp.a(iIntValue, "Billing override value was set by a license tester.");
            G(2, mf3VarA, zzjn.zzaO);
            C(mf3VarA);
            return mf3VarA;
        }
        try {
            return super.b(hjfVar, lf3Var);
        } catch (Exception e3) {
            zzjn zzjnVar = zzjn.zzaY;
            mf3 mf3Var = xrp.e;
            G(2, mf3Var, zzjnVar);
            zzc.zzp("BillingClientTesting", "An internal error occurred.", e3);
            return mf3Var;
        }
    }

    @Override // defpackage.cf3
    public final void c(qie qieVar, cz8 cz8Var) {
        ScheduledExecutorService scheduledExecutorService;
        ms7 ms7Var = new ms7(cz8Var, (byte) 5);
        iv ivVar = new iv(this, qieVar, cz8Var, false, (byte) 18);
        zzdk zzdkVarF = F(7);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            if (this.K == null) {
                this.K = Executors.newSingleThreadScheduledExecutor();
            }
            scheduledExecutorService = this.K;
        }
        zzdf.zzc(zzdf.zzb(zzdkVarF, 28500L, timeUnit, scheduledExecutorService), new wtm(false, this, ms7Var, ivVar), e());
    }

    @Override // defpackage.cf3
    public final void d(ve3 ve3Var) {
        synchronized (this) {
            if (E()) {
                zzc.zzn("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                H(26);
            } else if (this.H == 1) {
                zzc.zzo("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            } else if (this.H == 3) {
                zzc.zzo("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                G(26, xrp.a(-1, "Billing Override Service connection is disconnected."), zzjn.zzL);
            } else {
                this.H = (byte) 1;
                zzc.zzn("BillingClientTesting", "Starting Billing Override Service setup.");
                this.J = new tko(this, (byte) 3);
                Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                Context context = this.G;
                List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                zzjn zzjnVar = zzjn.zza;
                if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                    zzjnVar = zzjn.zzO;
                } else {
                    ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                    if (serviceInfo != null) {
                        String str = serviceInfo.packageName;
                        String str2 = serviceInfo.name;
                        if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                            zzjnVar = zzjn.zzM;
                            zzc.zzo("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                        } else {
                            ComponentName componentName = new ComponentName(str, str2);
                            Intent intent2 = new Intent(intent);
                            intent2.setComponent(componentName);
                            if (context.bindService(intent2, (ServiceConnection) this.J, 1)) {
                                zzc.zzn("BillingClientTesting", "Billing Override Service was bonded successfully.");
                            } else {
                                zzjnVar = zzjn.zzM;
                                zzc.zzo("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                            }
                        }
                    }
                }
                this.H = (byte) 0;
                zzc.zzn("BillingClientTesting", "Billing Override Service unavailable on device.");
                G(26, xrp.a(2, "Billing Override Service unavailable on device."), zzjnVar);
            }
        }
        r(ve3Var, 0);
    }
}
