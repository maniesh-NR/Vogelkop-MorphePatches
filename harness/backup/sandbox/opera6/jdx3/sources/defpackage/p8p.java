package defpackage;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public abstract class p8p {

    @NotNull
    public static final k8p Companion = new k8p();
    public static final crb e;
    public static final l4c f;
    public final String a;
    public final long b;
    public final zyk c;
    public final zyk d;

    static {
        zyk zykVar = x9p.a;
        e = phj.o(fcp.d(), k0l.M);
        f = z4c.a(f7c.b, xvo.l);
    }

    public /* synthetic */ p8p() {
        this.a = "";
        this.b = System.currentTimeMillis();
        this.c = z4c.b(new j8p(this, (byte) 0));
        this.d = z4c.b(new j8p(this, (byte) 1));
    }

    public p8p(String str) {
        this.a = str;
        this.b = System.currentTimeMillis();
        this.c = z4c.b(new j8p(this, (byte) 0));
        this.d = z4c.b(new j8p(this, (byte) 1));
    }

    public static void a(p8p p8pVar) {
        na2.B(w2p.b, (CoroutineContext) null, (rx5) null, new eno((byte) 10, (mt5) null, p8pVar), 3);
    }

    public Object b() {
        return ((t0i) this.c.getValue()).a;
    }
}
