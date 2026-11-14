package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n97 implements Executor {
    public static volatile n97 b;
    public static final n97 c = new n97(1);
    public static final /* synthetic */ n97 d = new n97(4);
    public final /* synthetic */ byte a;

    public /* synthetic */ n97(byte b2) {
        this.a = b2;
    }

    public static n97 a() {
        if (b != null) {
            return b;
        }
        synchronized (n97.class) {
            if (b == null) {
                b = new n97((byte) 0);
            }
        }
        return b;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                new Thread(runnable).start();
                break;
            case 3:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
