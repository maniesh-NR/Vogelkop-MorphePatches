package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class swk {
    public static final long c;
    public static final long d;
    public static final /* synthetic */ int e = 0;
    public final b59 a;
    public final umi b;

    static {
        on7 on7Var = pn7.b;
        c = pn7.f(cs5.x0(1, un7.h));
        d = pn7.f(cs5.x0(72, un7.g));
    }

    public swk(b59 b59Var, umi umiVar) {
        this.a = b59Var;
        this.b = umiVar;
    }

    public final SharedPreferences a() {
        return (SharedPreferences) this.a.get();
    }
}
