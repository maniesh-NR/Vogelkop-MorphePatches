package ads_mobile_sdk;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ea2 extends ozb implements Function0 {
    public final /* synthetic */ ha2 a;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea2(ha2 ha2Var, byte b) {
        super(0);
        this.i = b;
        this.a = ha2Var;
    }

    public final Object invoke() {
        ka2 ka2Var;
        ma2 ma2Var;
        switch (this.i) {
            case 0:
                return hz0.a(this.a.b);
            case 1:
                Context context = this.a.b;
                ka2 ka2Var2 = ka2.h;
                synchronized (ka2.class) {
                    ka2Var = ka2.h;
                    if (ka2Var == null) {
                        ka2Var = new ka2(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
                        ka2.h = ka2Var;
                    }
                }
                return ka2Var;
            default:
                Context context2 = this.a.b;
                ma2 ma2Var2 = ma2.h;
                synchronized (ma2.class) {
                    ma2Var = ma2.h;
                    if (ma2Var == null) {
                        ma2Var = new ma2(context2, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
                        ma2.h = ma2Var;
                    }
                }
                return ma2Var;
        }
    }
}
