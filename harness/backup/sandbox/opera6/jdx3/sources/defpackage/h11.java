package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class h11 extends z43 {
    public static final h11 j = new h11("analytics", "https://ofa-sub.osp.opera.software/v1/binary", "BUce4RU0cGacBYcKb6RUI8G8hNqgkAQu:");

    @Override // defpackage.z43
    public final zsf r(Context context) {
        umi umiVar = (umi) this.e;
        if (umiVar == null) {
            umiVar = null;
        }
        return new zsf(context, umiVar, "opera_osp_service_data", "opera_osp_avro_scheduler_pref", new s9i(context));
    }
}
