package defpackage;

import java.net.ConnectException;

/* loaded from: classes.dex */
public final class sl5 extends ConnectException {
    public final Throwable a;

    public sl5(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
