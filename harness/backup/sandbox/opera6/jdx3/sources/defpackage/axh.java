package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class axh extends z43 {
    public static final axh j = new axh("requests", "https://ofa-r-sub.osp.opera.software/v1/binary", "UdUYBBTuEnScltExUnRcqX3YefmyHDKU:");

    @Override // defpackage.z43
    public final zsf r(Context context) {
        umi umiVar = (umi) this.e;
        if (umiVar == null) {
            umiVar = null;
        }
        return new zsf(context, umiVar, "osp_requests_data", "osp_requests_storage", new yqa(context, (byte) 29));
    }
}
