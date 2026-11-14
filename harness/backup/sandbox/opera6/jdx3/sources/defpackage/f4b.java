package defpackage;

/* loaded from: classes.dex */
public final class f4b {
    public static final long e;
    public static final /* synthetic */ int f = 0;
    public final vg4 a;
    public final d4b b;
    public final d4b c;
    public final d4b d;

    static {
        on7 on7Var = pn7.b;
        e = cs5.x0(30, un7.h);
    }

    public f4b(vg4 vg4Var, d4b d4bVar, d4b d4bVar2, d4b d4bVar3) {
        this.a = vg4Var;
        this.b = d4bVar;
        this.c = d4bVar2;
        this.d = d4bVar3;
    }

    public final boolean a() {
        long jLongValue = ((Number) this.c.invoke()).longValue();
        if (jLongValue <= 0) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis >= jLongValue && jCurrentTimeMillis - jLongValue >= pn7.f(e);
    }

    public final boolean b() {
        return ((Boolean) this.a.invoke()).booleanValue() && ((Boolean) this.b.invoke()).booleanValue() && !((Boolean) this.d.invoke()).booleanValue() && a();
    }
}
