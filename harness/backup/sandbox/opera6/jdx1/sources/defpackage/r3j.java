package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class r3j implements s3j {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final s3j b;

    public r3j(s3j s3jVar) {
        this.b = s3jVar;
    }

    @Override // defpackage.s3j
    public final void a(u3j u3jVar) {
        if (this.a.get()) {
            return;
        }
        this.b.a(u3jVar);
    }

    public final void b() {
        this.a.set(true);
    }
}
