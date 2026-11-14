package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class c47 {
    public static final long g;
    public static final long h;
    public final umi a;
    public final x5f b;
    public final d5o c;
    public final d5o d;
    public final wu5 e = new wu5();
    public final d5o f;

    static {
        on7 on7Var = pn7.b;
        g = cs5.x0(30, un7.e);
        h = cs5.x0(2, un7.f);
    }

    public c47(Context context, umi umiVar, x5f x5fVar, tcc tccVar) {
        this.a = umiVar;
        this.b = x5fVar;
        this.c = new d5o(new y37(context, umiVar));
        this.d = new d5o(new v37(umiVar, (byte) 0));
        this.f = new d5o(new v37(umiVar, (byte) 1));
        tccVar.a(new b47(this));
    }
}
