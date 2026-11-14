package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class wva extends rva {
    public final Executor v;
    public final Object w = new Object();
    public qya x;
    public vva y;

    public wva(Executor executor) {
        this.v = executor;
    }

    @Override // defpackage.rva
    public final qya a(uya uyaVar) {
        return uyaVar.e();
    }

    @Override // defpackage.rva
    public final void c() {
        synchronized (this.w) {
            qya qyaVar = this.x;
            if (qyaVar != null) {
                qyaVar.close();
                this.x = null;
            }
        }
    }

    @Override // defpackage.rva
    public final void e(qya qyaVar) {
        synchronized (this.w) {
            if (!this.u) {
                qyaVar.close();
                return;
            }
            if (this.y != null) {
                if (qyaVar.h1().e() <= this.y.b.h1().e()) {
                    qyaVar.close();
                } else {
                    qya qyaVar2 = this.x;
                    if (qyaVar2 != null) {
                        qyaVar2.close();
                    }
                    this.x = qyaVar;
                }
                return;
            }
            vva vvaVar = new vva(qyaVar, this);
            this.y = vvaVar;
            ListenableFuture listenableFutureB = b(vvaVar);
            nv6 nv6Var = new nv6(vvaVar);
            listenableFutureB.addListener(new wr9(listenableFutureB, nv6Var, (byte) 0), n97.a());
        }
    }
}
