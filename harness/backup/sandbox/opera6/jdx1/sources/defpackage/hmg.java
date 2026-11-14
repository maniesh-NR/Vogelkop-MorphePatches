package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class hmg extends CancellationException {
    public hmg(long j) {
        super(z1m.j(j, "Timed out waiting for ", " ms"));
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(x1p.l);
        return this;
    }
}
