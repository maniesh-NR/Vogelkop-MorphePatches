package ads_mobile_sdk;

import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import defpackage.fsg;
import defpackage.sto;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class v42 implements MediationBannerListener, MediationInterstitialListener {
    public final /* synthetic */ os a;
    public final /* synthetic */ z42 b;
    public final /* synthetic */ rh0 c;

    public /* synthetic */ v42(rh0 rh0Var, os osVar, z42 z42Var) {
        this.a = osVar;
        this.b = z42Var;
        this.c = rh0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        this.c.d();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        this.c.d();
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        this.c.b();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        this.c.b();
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i) {
        os osVar = this.a;
        osVar.a(new AdError(i, ((cd3) osVar.c).a(i), AdError.UNDEFINED_DOMAIN));
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, AdError adError) {
        this.a.a(adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        os osVar = this.a;
        osVar.a(new AdError(i, ((cd3) osVar.c).a(i), AdError.UNDEFINED_DOMAIN));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, AdError adError) {
        this.a.a(adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        this.c.a();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        this.c.a();
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        View bannerView = mediationBannerAdapter.getBannerView();
        os osVar = this.a;
        if (bannerView == null) {
            osVar.a(new AdError(0, "Adapter returned a non-null View for getBannerView() after invoking the onAdLoaded() callback.", AdError.GOOGLE_MOBILE_ADS_DOMAIN));
        } else {
            this.b.b = bannerView;
            osVar.a();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        this.b.d = mediationInterstitialAdapter;
        this.a.a();
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        this.c.c();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        this.c.c();
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAppEvent(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        rh0 rh0Var = this.c;
        rh0Var.getClass();
        ae3 ae3VarA = rh0Var.a();
        if (ae3VarA != null) {
            defpackage.na2.B(ae3VarA.a, h.a, null, new fsg(new sto((Object) ae3VarA, (Object) str, (Object) str2, (mt5) null, (byte) 1), null, (byte) 3), 2);
        }
    }
}
