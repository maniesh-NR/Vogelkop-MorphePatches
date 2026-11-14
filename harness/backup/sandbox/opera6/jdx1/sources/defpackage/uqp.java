package defpackage;

import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjn;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class uqp implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uqp(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((oam) this.b).r();
                break;
            case 1:
                try {
                    ((wqp) this.b).b.C.b();
                    break;
                } catch (Throwable th) {
                    zzc.zzp("BillingClient", "Exception calling onBillingServiceDisconnected.", th);
                    return;
                }
            case 2:
                yqp yqpVar = (yqp) this.b;
                cf3 cf3Var = yqpVar.e;
                cf3Var.q(0);
                zzjn zzjnVar = zzjn.zzx;
                mf3 mf3Var = xrp.h;
                cf3Var.p(yqpVar.d, mf3Var, zzjnVar);
                yqpVar.d(mf3Var);
                break;
            case 3:
                try {
                    ((n0k) this.b).a.r();
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                Iterator it = ((gpp) this.b).c.values().iterator();
                while (it.hasNext()) {
                    ((xpp) it.next()).a(4);
                    it.remove();
                }
                break;
        }
    }
}
