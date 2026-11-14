package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class jg extends WeakReference {
    public final s38 a;
    public final boolean b;
    public kyh c;

    public jg(s38 s38Var, t38 t38Var, ReferenceQueue referenceQueue) {
        super(t38Var, referenceQueue);
        qyn.l(s38Var, "Argument must not be null");
        this.a = s38Var;
        boolean z = t38Var.a;
        this.c = null;
        this.b = z;
    }
}
