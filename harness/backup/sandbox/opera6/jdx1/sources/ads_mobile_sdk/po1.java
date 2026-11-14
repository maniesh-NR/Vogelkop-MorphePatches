package ads_mobile_sdk;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;

/* loaded from: classes.dex */
public final class po1 implements MediationAppOpenAdCallback {
    public final /* synthetic */ rh0 a;

    public po1(rh0 rh0Var) {
        this.a = rh0Var;
    }

    public final void onAdClosed() {
        this.a.b();
    }

    public final void onAdFailedToShow(AdError adError) {
        this.a.a(adError);
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
