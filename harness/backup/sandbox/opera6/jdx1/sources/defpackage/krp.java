package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzaj;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzce;
import com.google.android.gms.internal.play_billing.zzjn;

/* loaded from: classes.dex */
public final class krp extends zzaj {
    public final yqp a;
    public final Boolean b;
    public final int c;
    public final /* synthetic */ cf3 d;

    public /* synthetic */ krp(cf3 cf3Var, yqp yqpVar, Boolean bool, int i) {
        this.d = cf3Var;
        this.a = yqpVar;
        this.b = bool;
        this.c = i;
    }

    public final void a(yqp yqpVar, mf3 mf3Var, zzjn zzjnVar, boolean z, String str, int i) {
        this.d.q(0);
        yqpVar.b(mf3Var, zzjnVar, str, z, i);
        yqpVar.d(mf3Var);
    }

    public final void zza(Bundle bundle) {
        if (bundle == null) {
            zzc.zzo("BillingClient", "Response bundle is null.");
            a(this.a, xrp.e, zzjn.zzbr, this.b.booleanValue(), null, this.c);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            zzc.zzo("BillingClient", "Response bundle doesn't contain a response code");
            a(this.a, xrp.e, zzjn.zzby, this.b.booleanValue(), null, this.c);
            return;
        }
        if (bundle.getInt("RESPONSE_CODE") != 0) {
            a(this.a, xrp.a(bundle.getInt("RESPONSE_CODE"), bundle.getString("DEBUG_MESSAGE", "")), zzjn.zzbz, this.b.booleanValue(), sko.i(bundle.getInt("RESPONSE_CODE"), "Response code from Phonesky: "), this.c);
            return;
        }
        if (!bundle.containsKey("BILLING_API_VERSION_KEY")) {
            zzc.zzo("BillingClient", "Billing API version not found in response bundle.");
            a(this.a, xrp.e, zzjn.zzbx, this.b.booleanValue(), null, this.c);
            return;
        }
        int i = bundle.getInt("BILLING_API_VERSION_KEY");
        cf3 cf3Var = this.d;
        cf3.l(cf3Var, i);
        cf3Var.k = i >= 3;
        Bundle bundle2 = bundle.getBundle("EXPERIMENT_VALUES_KEY");
        if (bundle2 != null) {
            try {
                bundle2.getBoolean("DELEGATION_API_ENABLED_KEY");
            } catch (Throwable th) {
                zzc.zzp("BillingClient", "Error reading EnableDelegationApi experiment flag: ".concat(bundle2.toString()), th);
            }
            try {
                n1h.a = bundle2.getLong("AUTO_SERVICE_RECONNECTION_SYNCHRONOUS_TIMEOUT_MS_KEY");
            } catch (Throwable th2) {
                zzc.zzp("BillingClient", "Error reading AutoServiceReconnectionSynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th2);
            }
            try {
                n1h.b = bundle2.getLong("AUTO_SERVICE_RECONNECTION_ASYNCHRONOUS_TIMEOUT_MS_KEY");
            } catch (Throwable th3) {
                zzc.zzp("BillingClient", "Error reading AutoServiceReconnectionAsynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th3);
            }
            try {
                n1h.c = bundle2.getInt("AUTO_SERVICE_RECONNECTION_MAX_NUM_RETRIES_KEY");
            } catch (Throwable th4) {
                zzc.zzp("BillingClient", "Error reading AutoServiceReconnectionMaxNumRetries experiment flag: ".concat(bundle2.toString()), th4);
            }
        }
        Bundle bundle3 = bundle.getBundle("ENABLED_SUBSCRIPTION_CLIENT_ACTIONS_KEY");
        if (bundle3 != null) {
            zzce zzceVar = new zzce();
            for (gsp gspVar : gsp.values()) {
                if (bundle3.getBoolean(gspVar.name(), false)) {
                    zzceVar.zzb(gspVar);
                }
            }
            cf3 cf3Var2 = this.d;
            cf3Var2.B = zzceVar.zzc();
            if (cf3Var2.f != null) {
                cf3Var2.f.g = cf3Var2.B;
            }
        }
        cf3 cf3Var3 = this.d;
        if (cf3Var3.l < 3) {
            zzc.zzo("BillingClient", "In-app billing API version 3 is not supported on this device.");
            a(this.a, xrp.a, zzjn.zzJ, this.b.booleanValue(), null, this.c);
            return;
        }
        yqp yqpVar = this.a;
        Boolean bool = this.b;
        int i2 = this.c;
        boolean zBooleanValue = bool.booleanValue();
        cf3.m(cf3Var3, 0);
        synchronized (cf3Var3.a) {
            if (cf3Var3.b == 3) {
                return;
            }
            yqpVar.c(zBooleanValue, i2);
            yqpVar.d(xrp.f);
        }
    }
}
