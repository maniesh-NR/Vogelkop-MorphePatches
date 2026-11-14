package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ao5 implements x6f {
    public static final ao5 b = new ao5(null);
    public final q0b a;

    public ao5(Object obj) {
        this.a = k1g.G(obj);
    }

    @Override // defpackage.x6f
    public final ListenableFuture b() {
        return this.a;
    }

    @Override // defpackage.x6f
    public final void f(v6f v6fVar) {
    }

    @Override // defpackage.x6f
    public final void g(Executor executor, v6f v6fVar) {
        this.a.addListener(new fh4((Object) this, (Object) v6fVar, (byte) 12), executor);
    }
}
