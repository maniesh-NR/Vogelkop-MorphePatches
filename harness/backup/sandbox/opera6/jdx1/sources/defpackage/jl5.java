package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class jl5 {
    public final ExecutorService a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ll5(false));
    public final cv6 b = bb7.a;
    public final ExecutorService c = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ll5(true));
    public final ioj d = new ioj((byte) 4);
    public final o5o e;
    public final xm5 f;
    public final z67 g;
    public final byte h;
    public final int i;
    public final ydp j;

    public jl5(fl5 fl5Var) {
        yz6 yz6Var = (w17) fl5Var.c;
        this.e = yz6Var == null ? yz6.a : yz6Var;
        this.f = new xm5((byte) 8);
        this.h = fl5Var.b;
        this.i = fl5Var.a;
        this.g = (z67) fl5Var.d;
        this.j = new ydp((byte) 29);
    }
}
