package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class d8i {
    public final pc4 a;
    public final ScheduledExecutorService b;
    public final AtomicBoolean c = new AtomicBoolean(true);

    public d8i(pc4 pc4Var, ScheduledExecutorService scheduledExecutorService) {
        this.a = pc4Var;
        this.b = scheduledExecutorService;
    }
}
