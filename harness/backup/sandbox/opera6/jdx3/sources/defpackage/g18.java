package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g18 implements xng {
    public final WeakReference a;

    public g18(ig igVar) {
        this.a = new WeakReference(igVar);
    }

    public final void d() {
        Runnable runnable = (Runnable) this.a.get();
        if (runnable != null) {
            runnable.run();
        }
    }
}
