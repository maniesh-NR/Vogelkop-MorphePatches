package defpackage;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class jo9 extends k8 implements cuf {
    public final int o;
    public final int p;
    public final bf2 q;
    public final /* synthetic */ lo9 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo9(lo9 lo9Var, int i, int i2, bf2 bf2Var) {
        super((byte) 9);
        this.r = lo9Var;
        this.o = i;
        this.p = i2;
        this.q = bf2Var;
    }

    public final void j0() throws Exception {
        boolean zIsTerminated;
        cd5 cd5Var = (cd5) ((k8) this).b;
        Object obj = null;
        if (cd5Var.h0() && !cd5Var.isCancelled()) {
            Object obj2 = ((muf) cd5Var.R()).a;
            if (muf.a(obj2)) {
                obj = obj2;
            }
        }
        g0b g0bVar = (pdj) obj;
        if (g0bVar != null) {
            if (g0bVar instanceof AutoCloseable) {
                g0bVar.close();
                return;
            }
            if (!(g0bVar instanceof ExecutorService)) {
                hai.d();
                return;
            }
            ExecutorService executorService = (ExecutorService) g0bVar;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // defpackage.cuf
    public final void x(Object obj) throws InterruptedException {
        Object obj2;
        ko9 ko9Var;
        AutoCloseable autoCloseableP;
        boolean zIsTerminated;
        guf gufVar = (guf) (muf.a(obj) ? obj : null);
        if (gufVar != null) {
            if (gufVar instanceof pdj) {
                autoCloseableP = ((pdj) gufVar).p();
            } else {
                pdj pdjVar = (pdj) gufVar.E(uqh.a(pdj.class));
                autoCloseableP = pdjVar != null ? pdjVar.p() : new pdj(gufVar, new ghf(gufVar));
            }
            if (!((cd5) ((k8) this).b).j0(new muf(autoCloseableP))) {
                if (autoCloseableP instanceof AutoCloseable) {
                    autoCloseableP.close();
                } else {
                    if (!(autoCloseableP instanceof ExecutorService)) {
                        hai.d();
                        return;
                    }
                    ExecutorService executorService = (ExecutorService) autoCloseableP;
                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z = false;
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z) {
                                    executorService.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        } else {
            ((cd5) ((k8) this).b).j0(new muf(new ouf(muf.a(obj) ? (byte) 1 : ((ouf) obj).a)));
        }
        bf2 bf2Var = this.q;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = bf2.b;
        if (atomicIntegerFieldUpdater.decrementAndGet(bf2Var) == 0) {
            Iterator it = this.r.h.iterator();
            if (it.hasNext()) {
                throw p3p.g(it);
            }
            lo9 lo9Var = this.r;
            bf2 bf2Var2 = lo9Var.g;
            bf2Var2.getClass();
            if (atomicIntegerFieldUpdater.decrementAndGet(bf2Var2) == 0) {
                ef2 ef2Var = lo9Var.f;
                do {
                    obj2 = ef2Var.a;
                    ko9 ko9Var2 = (ko9) obj2;
                    int iOrdinal = ko9Var2.ordinal();
                    if (iOrdinal == 0) {
                        ko9Var = ko9.c;
                    } else {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unexpected frame state for " + lo9Var + "! State is " + ko9Var2 + ' ');
                        }
                        ko9Var = ko9.d;
                    }
                } while (!ef2Var.a(obj2, ko9Var));
                Iterator it2 = lo9Var.h.iterator();
                if (it2.hasNext()) {
                    throw p3p.g(it2);
                }
                if (ko9Var == ko9.d) {
                    Iterator it3 = lo9Var.h.iterator();
                    if (it3.hasNext()) {
                        throw p3p.g(it3);
                    }
                }
            }
        }
    }
}
