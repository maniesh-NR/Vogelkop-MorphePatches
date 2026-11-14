package ads_mobile_sdk;

import android.view.View;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class do1 extends ozb implements Function1 {
    public final /* synthetic */ ko1 a;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ do1(ko1 ko1Var, byte b) {
        super(1);
        this.i = b;
        this.a = ko1Var;
    }

    public final Object invoke(Object obj) {
        Unit unit;
        Unit unit2;
        Unit unit3;
        Unit unit4;
        switch (this.i) {
            case 0:
                MediationAppOpenAd mediationAppOpenAd = (MediationAppOpenAd) obj;
                ko1 ko1Var = this.a;
                synchronized (ko1Var) {
                    ko1Var.f = mediationAppOpenAd;
                    unit = Unit.a;
                }
                return unit;
            case 1:
                this.a.b = (View) obj;
                return Unit.a;
            case 2:
                MediationInterstitialAd mediationInterstitialAd = (MediationInterstitialAd) obj;
                ko1 ko1Var2 = this.a;
                synchronized (ko1Var2) {
                    ko1Var2.d = mediationInterstitialAd;
                    unit2 = Unit.a;
                }
                return unit2;
            case 3:
                this.a.c = new ju1((NativeAdMapper) obj);
                return Unit.a;
            case 4:
                this.a.c = new vk3((UnifiedNativeAdMapper) obj);
                return Unit.a;
            case 5:
                MediationRewardedAd mediationRewardedAd = (MediationRewardedAd) obj;
                ko1 ko1Var3 = this.a;
                synchronized (ko1Var3) {
                    ko1Var3.e = mediationRewardedAd;
                    unit3 = Unit.a;
                }
                return unit3;
            default:
                MediationRewardedAd mediationRewardedAd2 = (MediationRewardedAd) obj;
                ko1 ko1Var4 = this.a;
                synchronized (ko1Var4) {
                    ko1Var4.e = mediationRewardedAd2;
                    unit4 = Unit.a;
                }
                return unit4;
        }
    }
}
