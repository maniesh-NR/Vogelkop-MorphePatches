package defpackage;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class vy9 implements ThreadFactory {
    public final String a;
    public final boolean b;
    public int c;

    public vy9(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final synchronized Thread newThread(Runnable runnable) {
        uy9 uy9Var;
        uy9Var = new uy9(this, runnable, "glide-" + this.a + "-thread-" + this.c);
        this.c = this.c + 1;
        return uy9Var;
    }
}
