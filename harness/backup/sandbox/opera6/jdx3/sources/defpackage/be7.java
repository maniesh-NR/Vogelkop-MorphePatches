package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class be7 extends z43 {
    public static final be7 j = new be7("domains", "https://ofa-d-sub.osp.opera.software/v1/binary", "XLdN7fEVjmXoVi8p0KXaxxMD1XBKOyvJ:");

    @Override // defpackage.z43
    public final zsf r(Context context) {
        umi umiVar = (umi) this.e;
        if (umiVar == null) {
            umiVar = null;
        }
        return new zsf(context, umiVar, "osp_domains_data", "osp_domains_storage", new eq6((byte) 7));
    }
}
