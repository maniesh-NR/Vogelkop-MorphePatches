package defpackage;

import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* loaded from: classes.dex */
public final class tnf implements vm, idf {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MediationRewardedAd b;

    public /* synthetic */ tnf(MediationRewardedAd mediationRewardedAd, byte b) {
        this.a = b;
        this.b = mediationRewardedAd;
    }

    @Override // defpackage.vm
    public final void C(cm cmVar) {
        byte b = this.a;
        MediationRewardedAd mediationRewardedAd = this.b;
        switch (b) {
            case 0:
                qpf qpfVar = (qpf) mediationRewardedAd;
                qpfVar.a("showAd: onAdFailedToShow, error=" + cmVar);
                if (qpfVar.d != null) {
                    qpfVar.d.onAdFailedToShow(rm5.q(cmVar.b, cmVar.c));
                }
                i2i i2iVar = (i2i) qpfVar.e;
                if (i2iVar != null) {
                    i2iVar.P();
                    qpfVar.e = null;
                    break;
                }
                break;
            default:
                qpf qpfVar2 = (qpf) mediationRewardedAd;
                qpfVar2.b("showAd: onAdFailedToShow, error=" + cmVar);
                if (qpfVar2.d != null) {
                    qpfVar2.d.onAdFailedToShow(rm5.q(cmVar.b, cmVar.c));
                }
                l2i l2iVar = (l2i) qpfVar2.e;
                if (l2iVar != null) {
                    l2iVar.P();
                    qpfVar2.e = null;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.idf
    public final void a(a36 a36Var) {
        byte b = this.a;
        MediationRewardedAd mediationRewardedAd = this.b;
        switch (b) {
            case 0:
                qpf qpfVar = (qpf) mediationRewardedAd;
                qpfVar.a("showAd: onUserRewarded");
                MediationRewardedAdCallback mediationRewardedAdCallback = qpfVar.d;
                if (mediationRewardedAdCallback != null) {
                    mediationRewardedAdCallback.onUserEarnedReward();
                    break;
                }
                break;
            default:
                qpf qpfVar2 = (qpf) mediationRewardedAd;
                qpfVar2.b("showAd: onUserRewarded");
                MediationRewardedAdCallback mediationRewardedAdCallback2 = qpfVar2.d;
                if (mediationRewardedAdCallback2 != null) {
                    mediationRewardedAdCallback2.onUserEarnedReward();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.vm
    public final void g() {
        byte b = this.a;
        MediationRewardedAd mediationRewardedAd = this.b;
        switch (b) {
            case 0:
                qpf qpfVar = (qpf) mediationRewardedAd;
                qpfVar.a("showAd: onAdDisplayed");
                MediationRewardedAdCallback mediationRewardedAdCallback = qpfVar.d;
                if (mediationRewardedAdCallback != null) {
                    mediationRewardedAdCallback.reportAdImpression();
                    break;
                }
                break;
            default:
                qpf qpfVar2 = (qpf) mediationRewardedAd;
                qpfVar2.b("showAd: onAdDisplayed");
                MediationRewardedAdCallback mediationRewardedAdCallback2 = qpfVar2.d;
                if (mediationRewardedAdCallback2 != null) {
                    mediationRewardedAdCallback2.reportAdImpression();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.vm
    public final void onAdClicked() {
        byte b = this.a;
        MediationRewardedAd mediationRewardedAd = this.b;
        switch (b) {
            case 0:
                qpf qpfVar = (qpf) mediationRewardedAd;
                qpfVar.a("showAd: onAdClicked");
                MediationRewardedAdCallback mediationRewardedAdCallback = qpfVar.d;
                if (mediationRewardedAdCallback != null) {
                    mediationRewardedAdCallback.reportAdClicked();
                    break;
                }
                break;
            default:
                qpf qpfVar2 = (qpf) mediationRewardedAd;
                qpfVar2.b("showAd: onAdClicked");
                MediationRewardedAdCallback mediationRewardedAdCallback2 = qpfVar2.d;
                if (mediationRewardedAdCallback2 != null) {
                    mediationRewardedAdCallback2.reportAdClicked();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.vm
    public final void onAdDismissed() {
        byte b = this.a;
        MediationRewardedAd mediationRewardedAd = this.b;
        switch (b) {
            case 0:
                qpf qpfVar = (qpf) mediationRewardedAd;
                qpfVar.a("showAd: onAdDismissed");
                MediationRewardedAdCallback mediationRewardedAdCallback = qpfVar.d;
                if (mediationRewardedAdCallback != null) {
                    mediationRewardedAdCallback.onAdClosed();
                }
                i2i i2iVar = (i2i) qpfVar.e;
                if (i2iVar != null) {
                    i2iVar.P();
                    qpfVar.e = null;
                    break;
                }
                break;
            default:
                qpf qpfVar2 = (qpf) mediationRewardedAd;
                qpfVar2.b("showAd: onAdDismissed");
                MediationRewardedAdCallback mediationRewardedAdCallback2 = qpfVar2.d;
                if (mediationRewardedAdCallback2 != null) {
                    mediationRewardedAdCallback2.onAdClosed();
                }
                l2i l2iVar = (l2i) qpfVar2.e;
                if (l2iVar != null) {
                    l2iVar.P();
                    qpfVar2.e = null;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.vm
    public final void onAdOpened() {
        byte b = this.a;
        MediationRewardedAd mediationRewardedAd = this.b;
        switch (b) {
            case 0:
                qpf qpfVar = (qpf) mediationRewardedAd;
                qpfVar.a("showAd: onAdOpened");
                MediationRewardedAdCallback mediationRewardedAdCallback = qpfVar.d;
                if (mediationRewardedAdCallback != null) {
                    mediationRewardedAdCallback.onAdOpened();
                    break;
                }
                break;
            default:
                qpf qpfVar2 = (qpf) mediationRewardedAd;
                qpfVar2.b("showAd: onAdOpened");
                MediationRewardedAdCallback mediationRewardedAdCallback2 = qpfVar2.d;
                if (mediationRewardedAdCallback2 != null) {
                    mediationRewardedAdCallback2.onAdOpened();
                    break;
                }
                break;
        }
    }
}
