package ads_mobile_sdk;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class uw0 extends CancellationException implements iyo {
    public final kql a;

    public uw0(kql kqlVar) {
        super(kqlVar.getMessage());
        this.a = kqlVar;
    }

    public final Throwable a() {
        return this.a;
    }
}
