package ads_mobile_sdk;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import defpackage.fsg;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class xo1 implements MediationRewardedAdCallback {
    public final /* synthetic */ rh0 a;

    public xo1(rh0 rh0Var) {
        this.a = rh0Var;
    }

    public final void onAdClosed() {
        this.a.b();
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(AdError adError) {
        this.a.a(adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(String str) {
        this.a.a(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }

    public final void onAdOpened() {
        this.a.c();
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onUserEarnedReward() {
        ae3 ae3VarA = this.a.a();
        if (ae3VarA != null) {
            mt5 mt5Var = null;
            defpackage.na2.B(ae3VarA.a, h.a, null, new fsg(new id3(ae3VarA, mt5Var, (byte) 7), mt5Var, (byte) 3), 2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onUserEarnedReward(RewardItem rewardItem) {
        rh0 rh0Var = this.a;
        rh0Var.getClass();
        ae3 ae3VarA = rh0Var.a();
        if (ae3VarA != null) {
            mt5 mt5Var = null;
            defpackage.na2.B(ae3VarA.a, h.a, null, new fsg(new zj((Object) ae3VarA, (Object) rewardItem, mt5Var, (byte) 6), mt5Var, (byte) 3), 2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoComplete() {
        this.a.f();
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoStart() {
        this.a.a();
    }

    public final void reportAdClicked() {
        this.a.d();
    }

    public final void reportAdImpression() {
        this.a.e();
    }
}
