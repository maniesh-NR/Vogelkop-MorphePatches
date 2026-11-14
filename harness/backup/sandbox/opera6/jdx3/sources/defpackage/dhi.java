package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class dhi implements rmi {
    public final ScheduledExecutorService a;

    public dhi(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(new gg(runnable, (byte) 2));
    }

    @Override // defpackage.rmi
    public final qmi schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return new chi(this.a.schedule(new gg(runnable, (byte) 2), j, timeUnit));
    }
}
