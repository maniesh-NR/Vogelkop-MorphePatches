package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class e07 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ g07 b;

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        g07 g07Var = this.b;
        switch (b) {
            case 0:
                try {
                    g07Var.e.get();
                    g07.l.decrementAndGet();
                    g07.k.get();
                    g07Var.toString();
                    return;
                } catch (Exception e) {
                    g07Var.toString();
                    synchronized (g07Var.a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", g07Var, Boolean.valueOf(g07Var.c), Integer.valueOf(g07Var.b)), e);
                    }
                }
            default:
                g07Var.b();
                return;
        }
    }
}
