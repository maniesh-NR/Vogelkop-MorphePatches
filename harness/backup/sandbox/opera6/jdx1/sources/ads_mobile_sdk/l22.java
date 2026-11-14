package ads_mobile_sdk;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class l22 extends ozb implements Function0 {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l22(long j, boolean z, byte b) {
        super(0);
        this.i = b;
        this.a = j;
        this.b = z;
    }

    public final Object invoke() {
        byte b = this.i;
        boolean z = this.b;
        long j = this.a;
        switch (b) {
            case 0:
                return "Previously online at " + pn7.q(j) + "?: " + z;
            default:
                return "Now online at " + pn7.q(j) + "?: " + z;
        }
    }
}
