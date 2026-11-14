package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public abstract class a6o {
    public static final /* synthetic */ int a = 0;

    static {
        qs7.B("WorkerWrapper");
    }

    public static final Object a(ListenableFuture listenableFuture, ajc ajcVar, kuk kukVar) {
        Object obj;
        try {
            if (!listenableFuture.isDone()) {
                nh4 nh4Var = new nh4(1, hib.b(kukVar));
                nh4Var.s();
                listenableFuture.addListener(new vr9(listenableFuture, nh4Var, (byte) 22), l97.a);
                nh4Var.u(new of3(ajcVar, listenableFuture, (byte) 14));
                Object objQ = nh4Var.q();
                px5 px5Var = px5.a;
                return objQ;
            }
            boolean z = false;
            while (true) {
                try {
                    obj = listenableFuture.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e) {
            throw e.getCause();
        }
    }
}
