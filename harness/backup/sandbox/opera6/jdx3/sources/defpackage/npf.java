package defpackage;

import android.view.View;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;

/* loaded from: classes.dex */
public final class npf implements MediationBannerAd {
    public final MediationAdLoadCallback a;
    public final qhf b;
    public MediationBannerAdCallback c;
    public z13 d;

    public npf(MediationAdLoadCallback mediationAdLoadCallback, qhf qhfVar) {
        this.a = mediationAdLoadCallback;
        this.b = qhfVar;
    }

    public final void a(String str) {
        this.b.getClass();
        qhf.a();
    }

    public final View getView() {
        return this.d;
    }
}
