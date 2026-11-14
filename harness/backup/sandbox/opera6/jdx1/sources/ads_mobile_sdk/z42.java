package ads_mobile_sdk;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import defpackage.cek;

/* loaded from: classes.dex */
public final class z42 implements ejp {
    public final MediationAdapter a;
    public View b;
    public vk3 c;
    public MediationInterstitialAdapter d;

    public z42(MediationAdapter mediationAdapter) {
        this.a = mediationAdapter;
    }

    public final Object a(Context context, oa oaVar, cek cekVar) {
        return new ev0("Old mediation adapters do not implement initialize method.", ae1.a);
    }
}
