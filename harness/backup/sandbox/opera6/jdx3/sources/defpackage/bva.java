package defpackage;

/* loaded from: classes.dex */
public final class bva implements Runnable {
    public final Runnable a;
    public boolean b;
    public final /* synthetic */ cva c;

    public bva(cva cvaVar, Runnable runnable) {
        this.c = cvaVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b) {
            return;
        }
        this.b = true;
        boolean zC = this.c.c(this);
        vml.a(this);
        Runnable runnable = this.a;
        if (zC) {
            runnable.run();
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
