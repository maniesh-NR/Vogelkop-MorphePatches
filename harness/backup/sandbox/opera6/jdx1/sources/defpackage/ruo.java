package defpackage;

import ads_mobile_sdk.di1;
import ads_mobile_sdk.gh;
import ads_mobile_sdk.ko1;
import ads_mobile_sdk.ly2;
import ads_mobile_sdk.ow2;
import ads_mobile_sdk.q61;
import ads_mobile_sdk.sx2;
import ads_mobile_sdk.xi1;
import ads_mobile_sdk.yh;
import android.content.Context;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationRewardedAd;

/* loaded from: classes.dex */
public final /* synthetic */ class ruo implements l3p {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q61 b;
    public final /* synthetic */ gso c;

    public /* synthetic */ ruo(q61 q61Var, gso gsoVar, byte b) {
        this.a = b;
        this.b = q61Var;
        this.c = gsoVar;
    }

    @Override // defpackage.l3p
    public final void a() {
        switch (this.a) {
            case 0:
                ko1 ko1Var = (ko1) this.b;
                di1 di1Var = (di1) this.c;
                Context contextB = di1Var.d.b();
                if (contextB == null) {
                    contextB = di1Var.c;
                }
                MediationInterstitialAd mediationInterstitialAd = ko1Var.d;
                (mediationInterstitialAd != null ? mediationInterstitialAd : null).showAd(contextB);
                return;
            case 1:
                ko1 ko1Var2 = (ko1) this.b;
                gh ghVar = (gh) this.c;
                Context contextB2 = ghVar.d.b();
                if (contextB2 == null) {
                    contextB2 = ghVar.c;
                }
                MediationAppOpenAd mediationAppOpenAd = ko1Var2.f;
                (mediationAppOpenAd != null ? mediationAppOpenAd : null).showAd(contextB2);
                return;
            case 2:
                ko1 ko1Var3 = (ko1) this.b;
                ow2 ow2Var = (ow2) this.c;
                Context contextB3 = ow2Var.e.b();
                if (contextB3 == null) {
                    contextB3 = ow2Var.d;
                }
                MediationRewardedAd mediationRewardedAd = ko1Var3.e;
                (mediationRewardedAd != null ? mediationRewardedAd : null).showAd(contextB3);
                return;
            case 3:
                ly2 ly2Var = (ly2) this.b;
                sx2 sx2Var = (sx2) this.c;
                Context contextB4 = sx2Var.e.b();
                if (contextB4 == null) {
                    contextB4 = sx2Var.d;
                }
                synchronized (ly2Var) {
                    MediationRewardedAd mediationRewardedAd2 = ly2Var.f;
                    (mediationRewardedAd2 != null ? mediationRewardedAd2 : null).showAd(contextB4);
                }
                return;
            case 4:
                ly2 ly2Var2 = (ly2) this.b;
                xi1 xi1Var = (xi1) this.c;
                Context contextB5 = xi1Var.d.b();
                if (contextB5 == null) {
                    contextB5 = xi1Var.c;
                }
                synchronized (ly2Var2) {
                    MediationInterstitialAd mediationInterstitialAd2 = ly2Var2.e;
                    (mediationInterstitialAd2 != null ? mediationInterstitialAd2 : null).showAd(contextB5);
                }
                return;
            default:
                ly2 ly2Var3 = (ly2) this.b;
                yh yhVar = (yh) this.c;
                Context contextB6 = yhVar.d.b();
                if (contextB6 == null) {
                    contextB6 = yhVar.c;
                }
                synchronized (ly2Var3) {
                    MediationAppOpenAd mediationAppOpenAd2 = ly2Var3.g;
                    (mediationAppOpenAd2 != null ? mediationAppOpenAd2 : null).showAd(contextB6);
                }
                return;
        }
    }
}
