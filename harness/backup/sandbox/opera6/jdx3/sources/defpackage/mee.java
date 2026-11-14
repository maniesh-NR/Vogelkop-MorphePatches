package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class mee {
    public static final mee b = new mee();
    public final AtomicReference a = new AtomicReference(new byg(new yqa((byte) 27)));

    public final synchronized void a(vxg vxgVar) {
        yqa yqaVar = new yqa((byg) this.a.get());
        yqaVar.o(vxgVar);
        this.a.set(new byg(yqaVar));
    }

    public final synchronized void b(e20 e20Var) {
        yqa yqaVar = new yqa((byg) this.a.get());
        yqaVar.p(e20Var);
        this.a.set(new byg(yqaVar));
    }
}
