package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class cx1 extends w1h {
    public static volatile cx1 b;
    public static final bx1 c = new bx1((byte) 0);
    public final qw6 a = new qw6();

    public static cx1 C() {
        if (b != null) {
            return b;
        }
        synchronized (cx1.class) {
            if (b == null) {
                b = new cx1();
            }
        }
        return b;
    }

    public final void D(Runnable runnable) {
        qw6 qw6Var = this.a;
        if (qw6Var.c == null) {
            synchronized (qw6Var.a) {
                if (qw6Var.c == null) {
                    qw6Var.c = Handler.createAsync(Looper.getMainLooper());
                }
            }
        }
        qw6Var.c.post(runnable);
    }
}
