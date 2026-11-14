package defpackage;

import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class ye4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cf4 b;

    public /* synthetic */ ye4(cf4 cf4Var, byte b) {
        this.a = b;
        this.b = cf4Var;
    }

    public /* synthetic */ ye4(cf4 cf4Var, p12 p12Var) {
        this.a = (byte) 2;
        this.b = cf4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        cf4 cf4Var = this.b;
        switch (b) {
            case 0:
                synchronized (cf4Var.d) {
                    ScheduledFuture scheduledFuture = cf4Var.e;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    cf4Var.d(3, cf4Var.k);
                }
                return;
            case 1:
                Iterator it = cf4Var.k.iterator();
                while (it.hasNext()) {
                    cf4Var.a(((td4) it.next()).a());
                }
                return;
            default:
                CollectionsKt.n0(cf4Var.k).isEmpty();
                return;
        }
    }
}
