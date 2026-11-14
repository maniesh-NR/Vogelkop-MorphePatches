package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class e8i {
    public final crk a;
    public final ScheduledExecutorService b;
    public final AtomicBoolean c = new AtomicBoolean(true);

    public e8i(crk crkVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = crkVar;
        this.b = scheduledExecutorService;
    }
}
