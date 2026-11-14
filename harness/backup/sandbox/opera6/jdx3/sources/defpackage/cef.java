package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class cef extends z43 {
    public static final cef j = new cef("onboarding", "https://ofa-o-sub.osp.opera.software/v1/binary", "68UQR0w0qJyMAeV7bEgHsxYlbk3dVsAa:");

    @Override // defpackage.z43
    public final zsf r(Context context) {
        umi umiVar = (umi) this.e;
        if (umiVar == null) {
            umiVar = null;
        }
        return new zsf(context, umiVar, "osp_onboarding_data", "osp_onboarding_storage", new c5o(context, (byte) 27));
    }
}
