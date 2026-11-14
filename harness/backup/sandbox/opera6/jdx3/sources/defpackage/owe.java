package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class owe implements w6f {
    public static final owe c = new owe();
    public final AtomicBoolean a = new AtomicBoolean();
    public final i7f b = new i7f();

    @Override // defpackage.w6f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void F(nwe nweVar) {
        this.b.b(nweVar);
    }

    @Override // defpackage.w6f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void H(nwe nweVar) {
        this.b.c(nweVar);
    }

    public final void c(boolean z) {
        if (this.a.getAndSet(z) != z) {
            g7f g7fVar = new g7f(this.b);
            while (g7fVar.hasNext()) {
                ((nwe) g7fVar.next()).y(z);
            }
        }
    }
}
