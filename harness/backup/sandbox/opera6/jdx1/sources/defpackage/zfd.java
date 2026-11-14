package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class zfd extends agd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfd(Context context, byte b) {
        super(MeasurementManager.get(context));
        switch (b) {
            case 1:
                super(uac.d(context.getSystemService(uac.g())));
                break;
            default:
                break;
        }
    }
}
