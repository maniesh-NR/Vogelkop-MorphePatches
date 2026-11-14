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
public final class ey2 extends ozb implements Function1 {
    public final /* synthetic */ ly2 a;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey2(ly2 ly2Var, byte b) {
        super(1);
        this.i = b;
        this.a = ly2Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.i;
        ly2 ly2Var = this.a;
        switch (b) {
            case 0:
                ly2Var.g = (MediationAppOpenAd) obj;
                break;
            case 1:
                ly2Var.c = (View) obj;
                break;
            case 2:
                ly2Var.e = (MediationInterstitialAd) obj;
                break;
            case 3:
                ly2Var.d = new ju1((NativeAdMapper) obj);
                break;
            case 4:
                ly2Var.d = new vk3((UnifiedNativeAdMapper) obj);
                break;
            case 5:
                ly2Var.f = (MediationRewardedAd) obj;
                break;
            default:
                ly2Var.f = (MediationRewardedAd) obj;
                break;
        }
        return Unit.a;
    }
}
