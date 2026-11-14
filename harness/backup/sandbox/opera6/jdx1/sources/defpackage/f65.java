package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class f65 implements AutoCloseable, nx5 {
    public final CoroutineContext a;

    public f65(CoroutineContext coroutineContext) {
        this.a = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        o0g.q(this.a, null);
    }

    public final CoroutineContext l() {
        return this.a;
    }
}
