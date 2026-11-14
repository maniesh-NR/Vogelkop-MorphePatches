package ads_mobile_sdk;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ap1 implements MediationAdLoadCallback {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ os b;
    public final /* synthetic */ rh0 c;
    public final /* synthetic */ byte d;

    public /* synthetic */ ap1(rh0 rh0Var, os osVar, Function1 function1, byte b) {
        this.d = b;
        this.a = function1;
        this.b = osVar;
        this.c = rh0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        byte b = this.d;
        os osVar = this.b;
        switch (b) {
            case 0:
                osVar.a(adError);
                break;
            case 1:
                osVar.a(adError);
                break;
            case 2:
                osVar.a(adError);
                break;
            case 3:
                osVar.a(adError);
                break;
            case 4:
                osVar.a(adError);
                break;
            default:
                osVar.a(adError);
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        byte b = this.d;
        os osVar = this.b;
        switch (b) {
            case 0:
                osVar.a(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            case 1:
                osVar.a(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            case 2:
                osVar.a(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            case 3:
                osVar.a(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            case 4:
                osVar.a(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            default:
                osVar.a(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final Object onSuccess(Object obj) {
        byte b = this.d;
        rh0 rh0Var = this.c;
        Function1 function1 = this.a;
        os osVar = this.b;
        switch (b) {
            case 0:
                function1.invoke((UnifiedNativeAdMapper) obj);
                osVar.a();
                return new vo1(rh0Var, (byte) 1);
            case 1:
                osVar.a();
                function1.invoke((MediationAppOpenAd) obj);
                return new po1(rh0Var);
            case 2:
                function1.invoke(((MediationBannerAd) obj).getView());
                osVar.a();
                return new ro1(rh0Var);
            case 3:
                osVar.a();
                function1.invoke((MediationInterstitialAd) obj);
                return new to1(rh0Var);
            case 4:
                function1.invoke((NativeAdMapper) obj);
                osVar.a();
                return new vo1(rh0Var, (byte) 0);
            default:
                osVar.a();
                function1.invoke((MediationRewardedAd) obj);
                return new xo1(rh0Var);
        }
    }
}
