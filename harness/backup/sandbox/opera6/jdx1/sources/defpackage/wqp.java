package defpackage;

import android.os.Looper;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzp;

/* loaded from: classes.dex */
public final class wqp implements df3 {
    public final /* synthetic */ zzp a;
    public final /* synthetic */ cf3 b;

    public wqp(cf3 cf3Var, zzp zzpVar) {
        this.a = zzpVar;
        this.b = cf3Var;
    }

    @Override // defpackage.df3
    public final void a(mf3 mf3Var) {
        zzc.zzn("BillingClient", "Reconnection finished with result: " + mf3Var.a);
        try {
            this.a.zzb(mf3Var);
        } catch (Throwable th) {
            zzc.zzp("BillingClient", "Exception setting completer.", th);
        }
        cf3 cf3Var = this.b;
        if (cf3Var.C != null) {
            iqp iqpVar = new iqp(this, mf3Var, (byte) 2);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                iqpVar.run();
            } else {
                cf3Var.e.post(iqpVar);
            }
        }
    }

    @Override // defpackage.df3
    public final void b() {
        zzc.zzn("BillingClient", "Reconnection attempt failed.");
        try {
            this.a.zzb(xrp.g);
        } catch (Throwable th) {
            zzc.zzp("BillingClient", "Exception setting completer.", th);
        }
        cf3 cf3Var = this.b;
        if (cf3Var.C != null) {
            uqp uqpVar = new uqp(this, (byte) 1);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                uqpVar.run();
            } else {
                cf3Var.e.post(uqpVar);
            }
        }
    }
}
