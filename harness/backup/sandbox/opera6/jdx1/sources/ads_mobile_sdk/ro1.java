package ads_mobile_sdk;

import com.google.android.gms.ads.mediation.MediationBannerAdCallback;

/* loaded from: classes.dex */
public final class ro1 implements MediationBannerAdCallback {
    public final /* synthetic */ rh0 a;

    public ro1(rh0 rh0Var) {
        this.a = rh0Var;
    }

    public final void onAdClosed() {
        this.a.b();
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdCallback
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
