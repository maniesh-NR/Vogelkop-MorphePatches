package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class vrm extends kuk implements Function2 {
    public final /* synthetic */ byte t = 0;
    public final /* synthetic */ wrm u;
    public boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrm(mt5 mt5Var, wrm wrmVar) {
        super(2, mt5Var);
        this.u = wrmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrm(mt5 mt5Var, wrm wrmVar, boolean z) {
        super(2, mt5Var);
        this.u = wrmVar;
        this.v = z;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        wrm wrmVar = this.u;
        switch (b) {
            case 0:
                return new vrm(mt5Var, wrmVar);
            default:
                return new vrm(mt5Var, wrmVar, this.v);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
        }
        return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) throws InterruptedException {
        cd5 cd5Var;
        boolean zIsTerminated;
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.v;
                if (z) {
                    if (z) {
                        ybh.y(obj);
                        return Unit.a;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                if (gyg.G(3, "CXCP")) {
                    Objects.toString(this.u);
                }
                vsm vsmVar = this.u.a;
                if (vsmVar.e.isInitialized()) {
                    AutoCloseable autoCloseableA = vsmVar.a();
                    if (autoCloseableA instanceof AutoCloseable) {
                        autoCloseableA.close();
                    } else {
                        if (!(autoCloseableA instanceof ExecutorService)) {
                            hai.d();
                            return null;
                        }
                        ExecutorService executorService = (ExecutorService) autoCloseableA;
                        if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                            executorService.shutdown();
                            boolean z2 = false;
                            while (!zIsTerminated) {
                                try {
                                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                } catch (InterruptedException unused) {
                                    if (!z2) {
                                        executorService.shutdownNow();
                                        z2 = true;
                                    }
                                }
                            }
                            if (z2) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
                }
                btm btmVar = (btm) this.u.i.getValue();
                synchronized (btmVar.e) {
                    cd5Var = btmVar.i;
                    if (cd5Var == null) {
                        i07 i07Var = btmVar.f;
                        if (i07Var != null) {
                            i07Var.k((CancellationException) null);
                        }
                        btmVar.c.o();
                        btmVar.h = null;
                        cd5Var = new cd5();
                        btmVar.i = cd5Var;
                        btmVar.e();
                    }
                }
                this.v = true;
                Object objA = cd5Var.A(this);
                px5 px5Var2 = px5.a;
                if (objA == px5Var) {
                    return px5Var;
                }
                return Unit.a;
            default:
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                if (!this.u.h.b()) {
                    nd4 nd4VarA = this.u.a.a();
                    boolean z3 = this.v;
                    fa4 fa4Var = nd4VarA.e;
                    synchronized (fa4Var.p) {
                        fa4Var.q = z3;
                    }
                }
                return Unit.a;
        }
    }
}
