package defpackage;

/* loaded from: classes.dex */
public final class ww8 implements Runnable {
    public final wr9 a;
    public final wr9 b;
    public boolean c;
    public boolean d;
    public boolean e;

    public ww8(hv2 hv2Var, dg7 dg7Var) {
        this.c = hv2Var.d.k(hv2Var);
        this.a = new wr9(new hu5((Object) this, (Object) hv2Var, (byte) 11));
        this.b = new wr9(dg7Var);
    }

    public final void a(boolean z) {
        if (z) {
            if (this.d) {
                return;
            }
            if (this.c) {
                this.d = true;
                this.c = false;
                vml.d(this, 2000L);
                return;
            }
        }
        this.d = false;
        this.c = false;
        vml.a(this);
        run();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d = false;
        this.a.run();
        this.b.run();
    }
}
