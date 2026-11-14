package defpackage;

import com.google.android.gms.internal.play_billing.zzbo;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzje;
import com.google.android.gms.internal.play_billing.zzjg;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.internal.play_billing.zzjk;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzju;

/* loaded from: classes.dex */
public abstract /* synthetic */ class nrp {
    public static final /* synthetic */ int a = 0;

    static {
        int i = orp.Kq;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + zzbo.zzc(exc.getMessage());
            int i = zzc.zza;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            zzc.zzp("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static zzjg b(zzjn zzjnVar, int i, mf3 mf3Var, String str, zzju zzjuVar) {
        try {
            zzjl zzjlVarZza = zzjp.zza();
            zzjlVarZza.zzp(mf3Var.a);
            zzjlVarZza.zzb(mf3Var.c);
            int i2 = mf3Var.b;
            if (i2 != 0) {
                zzjlVarZza.zzd(i2);
            }
            if (zzjnVar != null) {
                zzjlVarZza.zze(zzjnVar);
            }
            if (str != null) {
                zzjlVarZza.zza(str);
            }
            zzje zzjeVarZza = zzjg.zza();
            zzjeVarZza.zzb(zzjlVarZza);
            zzjeVarZza.zzp(i);
            if (!zzjuVar.equals(zzju.zza)) {
                zzjeVarZza.zza(zzjuVar);
            }
            return zzjeVarZza.zzi();
        } catch (Throwable th) {
            zzc.zzp("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static zzjk c(int i, zzju zzjuVar) {
        try {
            zzji zzjiVarZza = zzjk.zza();
            zzjiVarZza.zze(i);
            if (!zzjuVar.equals(zzju.zza)) {
                zzjiVarZza.zza(zzjuVar);
            }
            return zzjiVarZza.zzi();
        } catch (Exception e) {
            zzc.zzp("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
