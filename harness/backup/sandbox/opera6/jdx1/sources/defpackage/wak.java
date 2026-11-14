package defpackage;

/* loaded from: classes.dex */
public abstract class wak implements vak {
    public final cf2 a = new cf2(0);

    public final boolean f(int i) {
        return (this.a.get() & i) != 0;
    }

    public final void g(int i) {
        cf2 cf2Var;
        int i2;
        do {
            cf2Var = this.a;
            i2 = cf2Var.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!cf2Var.compareAndSet(i2, i2 | i));
    }
}
