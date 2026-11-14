package defpackage;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* loaded from: classes.dex */
public final class qpf implements MediationRewardedAd {
    public final /* synthetic */ byte a;
    public final MediationAdLoadCallback b;
    public final qhf c;
    public MediationRewardedAdCallback d;
    public m4b e;

    public /* synthetic */ qpf(MediationAdLoadCallback mediationAdLoadCallback, qhf qhfVar, byte b) {
        this.a = b;
        this.b = mediationAdLoadCallback;
        this.c = qhfVar;
    }

    public final void a(String str) {
        this.c.getClass();
        qhf.a();
    }

    public final void b(String str) {
        this.c.getClass();
        qhf.a();
    }

    public final void showAd(Context context) {
        switch (this.a) {
            case 0:
                a("showAd");
                i2i i2iVar = (i2i) this.e;
                if (i2iVar != null) {
                    i2iVar.K(context, new tnf(this, (byte) 0));
                    break;
                } else {
                    a("showAd: no ad loaded");
                    AdError adErrorO = rm5.o(103, "The rewarded ad is invalid to show.");
                    MediationRewardedAdCallback mediationRewardedAdCallback = this.d;
                    if (mediationRewardedAdCallback != null) {
                        mediationRewardedAdCallback.onAdFailedToShow(adErrorO);
                        break;
                    }
                }
                break;
            default:
                b("showAd");
                l2i l2iVar = (l2i) this.e;
                if (l2iVar != null) {
                    l2iVar.K(context, new tnf(this, (byte) 1));
                    break;
                } else {
                    b("showAd: no ad loaded");
                    AdError adErrorO2 = rm5.o(103, "The rewarded interstitial ad is invalid to show.");
                    MediationRewardedAdCallback mediationRewardedAdCallback2 = this.d;
                    if (mediationRewardedAdCallback2 != null) {
                        mediationRewardedAdCallback2.onAdFailedToShow(adErrorO2);
                        break;
                    }
                }
                break;
        }
    }
}
