package ads_mobile_sdk;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class vh2 extends ozb implements Function1 {
    public final /* synthetic */ xj2 a;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vh2(xj2 xj2Var, byte b) {
        super(1);
        this.i = b;
        this.a = xj2Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.i;
        boolean z = false;
        xj2 xj2Var = this.a;
        switch (b) {
            case 0:
                if (((av2) obj) == av2.e && xj2Var.t) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                if (((av2) obj) == av2.e && xj2Var.t) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
