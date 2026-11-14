package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class zx7 extends o0g {
    public final /* synthetic */ o0g i;
    public final /* synthetic */ ThreadPoolExecutor j;

    public zx7(o0g o0gVar, ThreadPoolExecutor threadPoolExecutor) {
        this.i = o0gVar;
        this.j = threadPoolExecutor;
    }

    public final void t0(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.j;
        try {
            this.i.t0(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    public final void u0(cyd cydVar) {
        ThreadPoolExecutor threadPoolExecutor = this.j;
        try {
            this.i.u0(cydVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
