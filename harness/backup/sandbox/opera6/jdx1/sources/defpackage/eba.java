package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class eba implements Executor {
    public static volatile eba c;
    public final /* synthetic */ byte a;
    public final Object b;

    public eba() {
        this.a = (byte) 0;
        this.b = Executors.newSingleThreadExecutor(new hg((byte) 1));
    }

    public eba(a5o a5oVar) {
        this.a = (byte) 1;
        this.b = a5oVar;
    }

    public static Executor a() {
        if (c != null) {
            return c;
        }
        synchronized (eba.class) {
            if (c == null) {
                c = new eba();
            }
        }
        return c;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ExecutorService) obj).execute(runnable);
                break;
            default:
                ((a5o) obj).c.post(runnable);
                break;
        }
    }
}
