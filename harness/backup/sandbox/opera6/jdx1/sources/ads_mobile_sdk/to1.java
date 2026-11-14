package ads_mobile_sdk;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;

/* loaded from: classes.dex */
public final class to1 implements MediationInterstitialAdCallback {
    public final /* synthetic */ rh0 a;

    public to1(rh0 rh0Var) {
        this.a = rh0Var;
    }

    public final void onAdClosed() {
        this.a.b();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback
    public final void onAdFailedToShow(AdError adError) {
        this.a.a(adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback
    public final void onAdFailedToShow(String str) {
        this.a.a(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback
    public final void onAdLeftApplication() {
        this.a.a();
    }

    public final void onAdOpened() {
        this.a.c();
    }

    public final void reportAdClicked() {
        this.a.d();
    }

    public final void reportAdImpression() {
        this.a.e();
    }
}
