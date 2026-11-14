package defpackage;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;

/* loaded from: classes.dex */
public final class mpf implements MediationAppOpenAd {
    public final MediationAdLoadCallback a;
    public final qhf b;
    public MediationAppOpenAdCallback c;
    public vt1 d;

    public mpf(MediationAdLoadCallback mediationAdLoadCallback, qhf qhfVar) {
        this.a = mediationAdLoadCallback;
        this.b = qhfVar;
    }

    public final void a(String str) {
        this.b.getClass();
        qhf.a();
    }

    public final void showAd(Context context) {
        vt1 vt1Var = this.d;
        if (vt1Var != null) {
            vt1Var.K(context, new wub(this));
            return;
        }
        a("showAd: no ad loaded");
        AdError adErrorO = rm5.o(103, "The AppOpen ad is invalid to show.");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.c;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adErrorO);
        }
    }
}
