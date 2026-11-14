package defpackage;

import ads_mobile_sdk.ai1;

/* loaded from: classes.dex */
public final class go extends ln {
    public final ai1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go(ai1 ai1Var, String str, boolean z, dl dlVar, int i, bp bpVar, i3j i3jVar, ap apVar, String str2) {
        super(rm.INTERSTITIAL, str, z, dlVar, bpVar, i, i3jVar, apVar, str2);
        yo yoVar = yo.ADMOB;
        this.w = ai1Var;
    }

    @Override // defpackage.yz
    public final v50 e() {
        return v50.k;
    }

    @Override // defpackage.yz
    public final String l() {
        xzh responseInfo = this.w.getResponseInfo();
        if (responseInfo != null) {
            return responseInfo.c();
        }
        return null;
    }
}
