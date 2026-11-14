package defpackage;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;

/* loaded from: classes.dex */
public final class opf implements MediationInterstitialAd {
    public final MediationAdLoadCallback a;
    public final qhf b;
    public MediationInterstitialAdCallback c;
    public dhb d;

    public opf(MediationAdLoadCallback mediationAdLoadCallback, qhf qhfVar) {
        this.a = mediationAdLoadCallback;
        this.b = qhfVar;
    }

    public final void a(String str) {
        this.b.getClass();
        qhf.a();
    }

    public final void showAd(Context context) {
        a("showAd");
        dhb dhbVar = this.d;
        if (dhbVar != null) {
            dhbVar.K(context, new lld((Object) this, (byte) 9));
            return;
        }
        a("showAd: no ad loaded");
        AdError adErrorO = rm5.o(103, "The interstitial ad is invalid to show.");
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adErrorO);
        }
    }
}
