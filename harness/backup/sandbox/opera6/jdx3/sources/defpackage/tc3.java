package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class tc3 extends z43 {
    public static final tc3 j = new tc3("behavior", "https://ofa-b-sub.osp.opera.software/v1/binary", "oow7faeYeep2phoohohQueeghiepaiLa:");

    @Override // defpackage.z43
    public final zsf r(Context context) {
        umi umiVar = (umi) this.e;
        if (umiVar == null) {
            umiVar = null;
        }
        return new zsf(context, umiVar, "osp_behavior_data", "osp_behavior_storage", new f1p(context, (byte) 5));
    }
}
