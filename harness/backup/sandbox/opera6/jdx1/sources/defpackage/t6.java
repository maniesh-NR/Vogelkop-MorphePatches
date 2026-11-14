package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class t6 extends na2 {
    public final AtomicReferenceFieldUpdater o;
    public final AtomicReferenceFieldUpdater p;
    public final AtomicReferenceFieldUpdater q;
    public final AtomicReferenceFieldUpdater r;
    public final AtomicReferenceFieldUpdater s;

    public t6(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.o = atomicReferenceFieldUpdater;
        this.p = atomicReferenceFieldUpdater2;
        this.q = atomicReferenceFieldUpdater3;
        this.r = atomicReferenceFieldUpdater4;
        this.s = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.na2
    public final void J(w6 w6Var, w6 w6Var2) {
        this.p.lazySet(w6Var, w6Var2);
    }

    @Override // defpackage.na2
    public final void K(w6 w6Var, Thread thread) {
        this.o.lazySet(w6Var, thread);
    }

    @Override // defpackage.na2
    public final boolean k(x6 x6Var, s6 s6Var, s6 s6Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.r;
            if (atomicReferenceFieldUpdater.compareAndSet(x6Var, s6Var, s6Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(x6Var) == s6Var);
        return false;
    }

    @Override // defpackage.na2
    public final boolean l(x6 x6Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.s;
            if (atomicReferenceFieldUpdater.compareAndSet(x6Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(x6Var) == obj);
        return false;
    }

    @Override // defpackage.na2
    public final boolean m(x6 x6Var, w6 w6Var, w6 w6Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.q;
            if (atomicReferenceFieldUpdater.compareAndSet(x6Var, w6Var, w6Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(x6Var) == w6Var);
        return false;
    }
}
