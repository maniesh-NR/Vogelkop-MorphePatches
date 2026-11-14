package ads_mobile_sdk;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class d30 extends ozb implements Function0 {
    public final /* synthetic */ Throwable a;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d30(Throwable th, byte b) {
        super(0);
        this.i = b;
        this.a = th;
    }

    public final Object invoke() {
        byte b = this.i;
        Throwable th = this.a;
        switch (b) {
            case 0:
                return sko.j("Cronet engine initialization failed. Falling back to Java provider: ", th.getMessage());
            case 1:
                return sko.j("Non-fatal error closing resources: ", th.getMessage());
            default:
                return "Untrapped exception: " + th;
        }
    }
}
