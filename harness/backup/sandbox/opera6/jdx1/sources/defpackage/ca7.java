package defpackage;

/* loaded from: classes.dex */
public final class ca7 implements AutoCloseable {
    public final ba7 a;
    public boolean b;
    public final /* synthetic */ fa7 c;

    public ca7(fa7 fa7Var, ba7 ba7Var) {
        this.c = fa7Var;
        this.a = ba7Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        fa7 fa7Var = this.c;
        synchronized (fa7Var.h) {
            ba7 ba7Var = this.a;
            int i = ba7Var.h - 1;
            ba7Var.h = i;
            if (i == 0 && ba7Var.f) {
                fa7Var.r(ba7Var);
            }
        }
    }
}
