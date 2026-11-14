package ads_mobile_sdk;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class t1 extends ozb implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(String str, byte b) {
        super(0);
        this.i = b;
        this.a = str;
    }

    public final Object invoke() {
        byte b = this.i;
        String str = this.a;
        switch (b) {
            case 0:
                return sko.j("Unknown ad config parameter: ", str);
            case 1:
                return sko.j("Requested mraid ", str);
            default:
                return "Ad Request Signals: ".concat(str);
        }
    }
}
