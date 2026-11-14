package ads_mobile_sdk;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class ou0 extends CancellationException implements iyo {
    public final CancellationException a;

    public ou0(CancellationException cancellationException) {
        super(cancellationException.getMessage());
        this.a = cancellationException;
    }

    public final Throwable a() {
        return this.a;
    }
}
