package ads_mobile_sdk;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.goo;
import defpackage.iao;
import defpackage.k3p;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class y0 implements goo {
    public final Map a;
    public final k3p b;
    public final iao c;
    public final long d;

    public y0(k3p k3pVar, Map map, l7 l7Var, th3 th3Var) {
        this.a = map;
        this.b = k3pVar;
        this.c = th3Var.a(fl0.EVENT_ID_AD_ATTEST_SIGNALS_TASK);
        this.d = l7Var.B();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        pd pdVar;
        try {
            this.c.b();
            ListenableFuture listenableFuture = (ListenableFuture) this.a.get("gs");
            if (listenableFuture != null && (pdVar = (pd) listenableFuture.get(this.d, TimeUnit.MILLISECONDS)) != null) {
                synchronized (this.b) {
                    k3p k3pVar = this.b;
                    he heVarR = pdVar.r();
                    k3pVar.b$1();
                    ((pd) k3pVar.b).a(heVarR);
                    k3p k3pVar2 = this.b;
                    long jO = pdVar.o();
                    k3pVar2.b$1();
                    pd pdVar2 = (pd) k3pVar2.b;
                    pdVar2.bitField1_ |= 1048576;
                    pdVar2.gmscoreVersionSignal_ = jO;
                }
            }
            return null;
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e) {
            this.c.a(e);
            return null;
        } finally {
            this.c.a();
        }
    }
}
