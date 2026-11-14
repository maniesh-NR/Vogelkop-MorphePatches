package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class p1d implements n27 {
    public boolean a;
    public final /* synthetic */ byte b;
    public final Object c;

    public /* synthetic */ p1d(Object obj, byte b) {
        this.b = b;
        this.c = obj;
    }

    public static void f(p1d p1dVar, ifg ifgVar, int i, int i2) {
        p1dVar.d(ifgVar);
        ifgVar.d0(ybb.c((i << 32) | (i2 & 4294967295L), ifgVar.e), 0.0f, null);
    }

    public static void g(p1d p1dVar, ifg ifgVar, long j) {
        p1dVar.d(ifgVar);
        ifgVar.d0(ybb.c(j, ifgVar.e), 0.0f, null);
    }

    public static void h(p1d p1dVar, ifg ifgVar, int i, int i2) {
        long j = (i << 32) | (i2 & 4294967295L);
        if (p1dVar.a() == d2c.a || p1dVar.c() == 0) {
            p1dVar.d(ifgVar);
            ifgVar.d0(ybb.c(j, ifgVar.e), 0.0f, null);
        } else {
            int iC = (p1dVar.c() - ifgVar.a) - ((int) (j >> 32));
            p1dVar.d(ifgVar);
            ifgVar.d0(ybb.c((iC << 32) | (((int) (j & 4294967295L)) & 4294967295L), ifgVar.e), 0.0f, null);
        }
    }

    public static void l(p1d p1dVar, ifg ifgVar, int i, int i2) {
        m3g m3gVar = jfg.a;
        long j = (i << 32) | (i2 & 4294967295L);
        if (p1dVar.a() == d2c.a || p1dVar.c() == 0) {
            p1dVar.d(ifgVar);
            ifgVar.d0(ybb.c(j, ifgVar.e), 0.0f, m3gVar);
        } else {
            int iC = (p1dVar.c() - ifgVar.a) - ((int) (j >> 32));
            p1dVar.d(ifgVar);
            ifgVar.d0(ybb.c((iC << 32) | (((int) (j & 4294967295L)) & 4294967295L), ifgVar.e), 0.0f, m3gVar);
        }
    }

    public static void n(p1d p1dVar, ifg ifgVar, long j) {
        m3g m3gVar = jfg.a;
        if (p1dVar.a() == d2c.a || p1dVar.c() == 0) {
            p1dVar.d(ifgVar);
            ifgVar.d0(ybb.c(j, ifgVar.e), 0.0f, m3gVar);
        } else {
            int iC = (p1dVar.c() - ifgVar.a) - ((int) (j >> 32));
            p1dVar.d(ifgVar);
            ifgVar.d0(ybb.c((iC << 32) | (((int) (j & 4294967295L)) & 4294967295L), ifgVar.e), 0.0f, m3gVar);
        }
    }

    public static void p(p1d p1dVar, ifg ifgVar, Function1 function1, int i) {
        if ((i & 8) != 0) {
            function1 = jfg.a;
        }
        p1dVar.d(ifgVar);
        ifgVar.d0(ybb.c(0L, ifgVar.e), 0.0f, function1);
    }

    public static void r(p1d p1dVar, ifg ifgVar, long j) {
        m3g m3gVar = jfg.a;
        p1dVar.d(ifgVar);
        ifgVar.d0(ybb.c(j, ifgVar.e), 0.0f, m3gVar);
    }

    public final d2c a() {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                return ((o1d) obj).getLayoutDirection();
            default:
                return (d2c) ((v31) obj).i0.getValue();
        }
    }

    @Override // defpackage.n27
    public final float b() {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                return ((o1d) obj).b();
            default:
                return ((v31) obj).h().b();
        }
    }

    public final int c() {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                return ((o1d) obj).Y();
            default:
                return ((v31) obj).r.G.p.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(ifg ifgVar) {
        if (ifgVar instanceof hae) {
            ((hae) ifgVar).r(this.a);
        }
    }

    @Override // defpackage.n27
    public final float n0() {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                return ((o1d) obj).n0();
            default:
                return ((v31) obj).h().n0();
        }
    }
}
