package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class enb implements Executor {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ Object c;

    public enb(fnb fnbVar, Executor executor) {
        this.b = executor;
        this.c = fnbVar;
    }

    public enb(ExecutorService executorService, uac uacVar) {
        this.b = executorService;
        this.c = uacVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.a;
        Executor executor = this.b;
        switch (b) {
            case 0:
                try {
                    executor.execute(runnable);
                    break;
                } catch (RejectedExecutionException e) {
                    ((fnb) this.c).c(e);
                    return;
                }
            default:
                ((ExecutorService) executor).execute(runnable);
                break;
        }
    }
}
