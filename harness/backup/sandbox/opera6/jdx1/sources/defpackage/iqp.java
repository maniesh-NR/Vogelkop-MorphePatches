package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzrr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzca;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.playcore_hsdp.zzb;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashSet;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final /* synthetic */ class iqp implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iqp(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public iqp(n0k n0kVar, HashSet hashSet) {
        this.a = (byte) 6;
        this.c = n0kVar;
        this.b = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Future future = (Future) this.b;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.c;
                future.cancel(true);
                zzc.zzo("BillingClient", "Async task is taking too long, cancel it!");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                cf3 cf3Var = (cf3) this.b;
                cz8 cz8Var = (cz8) this.c;
                zzjn zzjnVar = zzjn.zzx;
                mf3 mf3Var = xrp.h;
                cf3Var.y(7, mf3Var, zzjnVar);
                cz8Var.a(mf3Var, new yqa(zzca.zzk(), zzca.zzk(), (byte) 28));
                return;
            case 2:
                try {
                    ((wqp) this.b).b.C.a((mf3) this.c);
                    return;
                } catch (Throwable th) {
                    zzc.zzp("BillingClient", "Exception calling onBillingSetupFinished.", th);
                    return;
                }
            case 3:
                cp8 cp8Var = (cp8) this.b;
                qop qopVar = (qop) this.c;
                cp8Var.f.i(qopVar);
                cp8Var.g.i(qopVar);
                return;
            case 4:
                eup eupVar = (eup) this.b;
                Bundle bundle = (Bundle) this.c;
                try {
                    g7m g7mVar = eupVar.a;
                    if (g7mVar == null) {
                        throw null;
                    }
                    grp grpVar = (IInterface) g7mVar.k;
                    if (grpVar != null) {
                        mop mopVar = (mop) grpVar;
                        Parcel parcelZza = mopVar.zza();
                        com.google.android.gms.internal.playcore_hsdp.zzc.zzc(parcelZza, bundle);
                        mopVar.zzb(2, parcelZza);
                        return;
                    }
                    return;
                } catch (RemoteException unused) {
                    return;
                }
            case 5:
                mtp mtpVar = (mtp) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                int iDecrementAndGet = mtpVar.b.decrementAndGet();
                Preconditions.checkState(iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    synchronized (mtpVar) {
                        mtpVar.e.zzb();
                        mtp.k = true;
                        zzrd zzrdVar = new zzrd();
                        zzra zzraVar = mtpVar.i ? zzra.zzc : zzra.zzb;
                        zzwp zzwpVar = mtpVar.f;
                        zzrdVar.zze(zzraVar);
                        zzrp zzrpVar = new zzrp();
                        zzrpVar.zzi(zpp.a(mtpVar.d));
                        zzrdVar.zzg(zzrpVar.zzj());
                        zzwpVar.zzd(zzws.zzf(zzrdVar), zzrc.zzl);
                    }
                    mtpVar.c.set(false);
                }
                zzrr.zza();
                taskCompletionSource.setResult((Object) null);
                return;
            case 6:
                try {
                    ((n0k) this.c).b((HashSet) this.b);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            default:
                gpp gppVar = (gpp) this.b;
                Bundle bundle2 = (Bundle) this.c;
                try {
                    wsp wspVar = (IInterface) gppVar.b.k;
                    if (wspVar != null) {
                        zzb zzbVar = gppVar.d;
                        isp ispVar = (isp) wspVar;
                        Parcel parcelZza2 = ispVar.zza();
                        com.google.android.gms.internal.playcore_hsdp.zzc.zzc(parcelZza2, bundle2);
                        com.google.android.gms.internal.playcore_hsdp.zzc.zzd(parcelZza2, zzbVar);
                        ispVar.zzb(4, parcelZza2);
                        return;
                    }
                    return;
                } catch (DeadObjectException | RemoteException unused3) {
                    return;
                }
        }
    }
}
