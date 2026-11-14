package defpackage;

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class xnn extends njb {
    public final pjb b;
    public final WeakReference c;

    public xnn(pjb pjbVar, g6i g6iVar) {
        super(g6iVar.a);
        this.b = pjbVar;
        this.c = new WeakReference(g6iVar);
    }

    @Override // defpackage.njb
    public final void a(Set set) {
        njb njbVar = (njb) this.c.get();
        if (njbVar != null) {
            njbVar.a(set);
            return;
        }
        pjb pjbVar = this.b;
        ReentrantLock reentrantLock = pjbVar.d;
        reentrantLock.lock();
        try {
            l7f l7fVar = (l7f) pjbVar.c.remove(this);
            if (l7fVar != null) {
                g7m g7mVar = pjbVar.b;
                if (((d7f) g7mVar.h).b(l7fVar.b)) {
                    bwg.B(new ojb(pjbVar, null, (byte) 1));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
