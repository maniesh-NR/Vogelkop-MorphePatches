package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public interface rmi extends Executor {
    qmi schedule(Runnable runnable, long j, TimeUnit timeUnit);
}
