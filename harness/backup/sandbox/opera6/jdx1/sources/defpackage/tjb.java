package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class tjb implements Executor {
    public static volatile tjb c;
    public final /* synthetic */ byte a;
    public final ExecutorService b;

    public tjb() {
        this.a = (byte) 0;
        this.b = Executors.newFixedThreadPool(2, new ad4((byte) 3));
    }

    public tjb(ExecutorService executorService) {
        this.a = (byte) 1;
        this.b = executorService;
    }

    public static Executor a() {
        if (c != null) {
            return c;
        }
        synchronized (tjb.class) {
            if (c == null) {
                c = new tjb();
            }
        }
        return c;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                this.b.execute(runnable);
                break;
            default:
                this.b.execute(new gg(runnable, (byte) 3));
                break;
        }
    }
}
