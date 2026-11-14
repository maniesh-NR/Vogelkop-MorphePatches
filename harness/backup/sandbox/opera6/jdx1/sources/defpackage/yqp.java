package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.internal.play_billing.zzaq;
import com.google.android.gms.internal.play_billing.zzbn;
import com.google.android.gms.internal.play_billing.zzbq;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzje;
import com.google.android.gms.internal.play_billing.zzjg;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.internal.play_billing.zzjk;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzkb;
import com.google.android.gms.internal.play_billing.zzkp;
import com.google.android.gms.internal.play_billing.zzkr;
import com.google.android.gms.internal.play_billing.zzkz;
import com.google.android.gms.internal.play_billing.zzlb;
import com.google.android.gms.internal.play_billing.zzlf;
import com.google.android.gms.internal.play_billing.zzlg;
import com.google.android.gms.internal.play_billing.zzli;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class yqp implements ServiceConnection {
    public final df3 a;
    public final zzbn b;
    public final zzbn c;
    public final int d;
    public final /* synthetic */ cf3 e;

    public /* synthetic */ yqp(cf3 cf3Var, df3 df3Var, int i) {
        this.e = cf3Var;
        zzbq zzbqVar = cf3Var.F;
        this.b = zzbn.zzc(zzbqVar);
        this.c = zzbn.zzc(zzbqVar);
        this.a = df3Var;
        this.d = i;
    }

    public final Long a(boolean z) {
        try {
            Object obj = this.e.a;
            if (!z) {
                synchronized (obj) {
                    zzbn zzbnVar = this.c;
                    if (!zzbnVar.zzg()) {
                        return null;
                    }
                    zzbnVar.zzf();
                    return Long.valueOf(zzbnVar.zza(TimeUnit.MILLISECONDS));
                }
            }
            synchronized (obj) {
                try {
                    zzbn zzbnVar2 = this.b;
                    if (!zzbnVar2.zzg()) {
                        return null;
                    }
                    zzbnVar2.zzf();
                    return Long.valueOf(zzbnVar2.zza(TimeUnit.MILLISECONDS));
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            zzc.zzp("BillingClient", "Exception getting connection establishment duration.", th2);
            return null;
        }
        zzc.zzp("BillingClient", "Exception getting connection establishment duration.", th2);
        return null;
    }

    public final void b(mf3 mf3Var, zzjn zzjnVar, String str, boolean z, int i) {
        try {
            zzjl zzjlVarZza = zzjp.zza();
            zzjlVarZza.zzp(mf3Var.a);
            zzjlVarZza.zzb(mf3Var.c);
            zzjlVarZza.zze(zzjnVar);
            zzjlVarZza.zzc(i);
            if (str != null) {
                zzjlVarZza.zza(str);
            }
            Long lA = a(z);
            cf3 cf3Var = this.e;
            if (!z) {
                zzkz zzkzVarZza = zzlb.zza();
                zzkzVarZza.zza(zzjlVarZza);
                if (lA != null) {
                    zzkzVarZza.zzb(lA.longValue());
                }
                cf3Var.h.r((zzlb) zzkzVarZza.zzi());
                return;
            }
            zzlg zzlgVarZza = zzli.zza();
            int i2 = this.d;
            zzlgVarZza.zza(i2 > 0);
            zzlgVarZza.zzb(i2);
            zzlgVarZza.zzd(i);
            if (lA != null) {
                zzlgVarZza.zzc(lA.longValue());
            }
            zzje zzjeVarZza = zzjg.zza();
            zzjeVarZza.zzb(zzjlVarZza);
            zzjeVarZza.zzp(6);
            zzjeVarZza.zze(zzlgVarZza);
            cf3Var.n((zzjg) zzjeVarZza.zzi());
        } catch (Throwable th) {
            zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    public final void c(boolean z, int i) {
        try {
            Long lA = a(z);
            cf3 cf3Var = this.e;
            if (!z) {
                zzkz zzkzVarZza = zzlb.zza();
                zzjl zzjlVarZza = zzjp.zza();
                zzjlVarZza.zzp(0);
                zzjlVarZza.zzc(i);
                zzkzVarZza.zza(zzjlVarZza);
                if (lA != null) {
                    zzkzVarZza.zzb(lA.longValue());
                }
                cf3Var.h.r((zzlb) zzkzVarZza.zzi());
                return;
            }
            zzji zzjiVarZza = zzjk.zza();
            zzjiVarZza.zze(6);
            zzlg zzlgVarZza = zzli.zza();
            int i2 = this.d;
            zzlgVarZza.zza(i2 > 0);
            zzlgVarZza.zzb(i2);
            zzlgVarZza.zzd(i);
            if (lA != null) {
                zzlgVarZza.zzc(lA.longValue());
            }
            zzjiVarZza.zzd(zzlgVarZza);
            cf3Var.o((zzjk) zzjiVarZza.zzi());
        } catch (Throwable th) {
            zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    public final void d(mf3 mf3Var) {
        cf3 cf3Var = this.e;
        synchronized (cf3Var.a) {
            if (cf3Var.b == 3) {
                return;
            }
            try {
                this.a.a(mf3Var);
            } catch (Throwable th) {
                zzc.zzp("BillingClient", "Exception while calling onBillingSetupFinished.", th);
            }
        }
    }

    public final void e(Exception exc, boolean z, int i) {
        zzc.zzp("BillingClient", "Exception while invoking initialize AIDL method", exc);
        boolean z2 = exc instanceof DeadObjectException;
        zzjn zzjnVar = z2 ? zzjn.zzbB : exc instanceof RemoteException ? zzjn.zzbD : exc instanceof SecurityException ? zzjn.zzbC : zzjn.zzbA;
        String strA = nrp.a(exc);
        this.e.q(0);
        b(z2 ? xrp.g : xrp.e, zzjnVar, strA, z, i);
        d(z2 ? xrp.g : xrp.e);
    }

    public final void f(Exception exc, boolean z) {
        zzc.zzp("BillingClient", "Exception while checking if billing is supported; try to reconnect", exc);
        boolean z2 = exc instanceof DeadObjectException;
        zzjn zzjnVar = z2 ? zzjn.zzaM : exc instanceof RemoteException ? zzjn.zzaL : exc instanceof SecurityException ? zzjn.zzaN : zzjn.zzP;
        String strA = zzjnVar.equals(zzjn.zzP) ? nrp.a(exc) : null;
        this.e.q(0);
        b(z2 ? xrp.g : xrp.e, zzjnVar, strA, z, 0);
        d(z2 ? xrp.g : xrp.e);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z;
        zzc.zzo("BillingClient", "Billing service died.");
        try {
            cf3 cf3Var = this.e;
            synchronized (cf3Var.a) {
                z = cf3Var.b == 1;
            }
            mgh mghVar = cf3Var.h;
            if (z) {
                zzje zzjeVarZza = zzjg.zza();
                zzjeVarZza.zzp(6);
                zzjl zzjlVarZza = zzjp.zza();
                zzjlVarZza.zze(zzjn.zzbf);
                zzjeVarZza.zzb(zzjlVarZza);
                zzlg zzlgVarZza = zzli.zza();
                int i = this.d;
                zzlgVarZza.zza(i > 0);
                zzlgVarZza.zzb(i);
                zzjeVarZza.zze(zzlgVarZza);
                mghVar.l((zzjg) zzjeVarZza.zzi());
            } else {
                zzjs zzjsVarZzb = zzjs.zzb();
                mghVar.getClass();
                try {
                    zzkp zzkpVarZza = zzkr.zza();
                    zzkpVarZza.zzp((zzkb) mghVar.b);
                    zzkpVarZza.zzc(zzjsVarZzb);
                    ((n9k) mghVar.c).m(zzkpVarZza.zzi());
                } catch (Throwable th) {
                    zzc.zzp("BillingLogger", "Unable to log.", th);
                }
            }
        } catch (Throwable th2) {
            zzc.zzp("BillingClient", "Unable to log.", th2);
        }
        cf3 cf3Var2 = this.e;
        synchronized (cf3Var2.a) {
            if (cf3Var2.b == 3 || cf3Var2.b == 0) {
                return;
            }
            cf3Var2.q(0);
            cf3Var2.s();
            try {
                this.a.b();
            } catch (Throwable th3) {
                zzc.zzp("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzc.zzn("BillingClient", "Billing service connected.");
        cf3 cf3Var = this.e;
        synchronized (cf3Var.a) {
            if (cf3Var.b == 3) {
                return;
            }
            cf3Var.i = zzaq.zzu(iBinder);
            if (cf3.f(new y97(this, (byte) 6), 30000L, new uqp(this, (byte) 2), Looper.myLooper() == null ? cf3Var.e : new Handler(Looper.myLooper()), cf3Var.e()) == null) {
                int i = this.d;
                mf3 mf3VarI = cf3Var.i();
                cf3Var.p(i, mf3VarI, zzjn.zzy);
                d(mf3VarI);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z;
        zzc.zzo("BillingClient", "Billing service disconnected.");
        try {
            cf3 cf3Var = this.e;
            synchronized (cf3Var.a) {
                z = cf3Var.b == 1;
            }
            mgh mghVar = cf3Var.h;
            if (z) {
                zzje zzjeVarZza = zzjg.zza();
                zzjeVarZza.zzp(6);
                zzjl zzjlVarZza = zzjp.zza();
                zzjlVarZza.zze(zzjn.zzbe);
                zzjeVarZza.zzb(zzjlVarZza);
                zzlg zzlgVarZza = zzli.zza();
                int i = this.d;
                zzlgVarZza.zza(i > 0);
                zzlgVarZza.zzb(i);
                zzjeVarZza.zze(zzlgVarZza);
                mghVar.l((zzjg) zzjeVarZza.zzi());
            } else {
                zzlf zzlfVarZzb = zzlf.zzb();
                mghVar.getClass();
                if (zzlfVarZzb != null) {
                    try {
                        zzkp zzkpVarZza = zzkr.zza();
                        zzkpVarZza.zzp((zzkb) mghVar.b);
                        zzkpVarZza.zzr(zzlfVarZzb);
                        ((n9k) mghVar.c).m((zzkr) zzkpVarZza.zzi());
                    } catch (Throwable th) {
                        zzc.zzp("BillingLogger", "Unable to log.", th);
                    }
                }
            }
        } catch (Throwable th2) {
            zzc.zzp("BillingClient", "Unable to log.", th2);
        }
        cf3 cf3Var2 = this.e;
        synchronized (cf3Var2.a) {
            zzbn zzbnVar = this.c;
            zzbnVar.zzd();
            zzbnVar.zze();
            if (cf3Var2.b == 3) {
                return;
            }
            cf3Var2.q(0);
            try {
                this.a.b();
            } catch (Throwable th3) {
                zzc.zzp("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
            }
        }
    }
}
