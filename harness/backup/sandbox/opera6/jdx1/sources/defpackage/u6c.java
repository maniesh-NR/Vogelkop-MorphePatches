package defpackage;

import android.os.Trace;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class u6c implements kpi {
    public static final c67 y = rm5.H(new gbb((byte) 22), new nf8((byte) 12));
    public final zr6 a;
    public boolean b;
    public m6c c;
    public boolean d;
    public final s14 e;
    public final t0g f;
    public final lde g;
    public float h;
    public boolean i;
    public final fv6 j;
    public final boolean k;
    public m3c l;
    public final r6c m;
    public final cw2 n;
    public final p12 o;
    public final nv6 p;
    public final u5c q;
    public final eq6 r;
    public final r5c s;
    public final afe t;
    public final t0g u;
    public final t0g v;
    public final afe w;
    public final c5o x;

    public u6c(int i, int i2) {
        zr6 zr6Var = new zr6();
        zr6Var.a = -1;
        zr6Var.d = -1;
        this.a = zr6Var;
        this.e = new s14(i, i2);
        this.f = new t0g(x6c.a, qs7.g);
        this.g = new lde();
        this.j = new fv6(new nna((Object) this, (byte) 17));
        this.k = true;
        this.m = new r6c(this, (byte) 0);
        this.n = new cw2();
        this.o = new p12((byte) 8);
        this.p = new nv6((byte) 21);
        this.q = new u5c(new r95(this, i));
        this.r = new eq6(this);
        this.s = new r5c();
        this.t = w7d.j();
        Boolean bool = Boolean.FALSE;
        this.u = hyg.k(bool);
        this.v = hyg.k(bool);
        this.w = w7d.j();
        c5o c5oVar = new c5o();
        j8m j8mVar = a26.e;
        Float fValueOf = Float.valueOf(0.0f);
        c5oVar.b = new xe1(j8mVar, fValueOf, (if1) j8mVar.a.invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
        this.x = c5oVar;
    }

    public static Object l(u6c u6cVar, int i, kuk kukVar) {
        u6cVar.getClass();
        Object objB = u6cVar.b(gfe.a, new t6c(u6cVar, i, (mt5) null, (byte) 0), kukVar);
        return objB == px5.a ? objB : Unit.a;
    }

    @Override // defpackage.kpi
    public final boolean a() {
        return this.j.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r6.j.b(r7, r8, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.kpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.gfe r7, kotlin.jvm.functions.Function2 r8, nt5 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.s6c
            if (r0 == 0) goto L13
            r0 = r9
            s6c r0 = (defpackage.s6c) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            s6c r0 = new s6c
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.ybh.y(r9)
            goto L69
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L31:
            kuk r7 = r0.u
            r8 = r7
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            gfe r7 = r0.t
            defpackage.ybh.y(r9)
            goto L5a
        L3c:
            defpackage.ybh.y(r9)
            t0g r9 = r6.f
            java.lang.Object r9 = r9.getValue()
            m6c r2 = defpackage.x6c.a
            if (r9 != r2) goto L5a
            r0.t = r7
            r9 = r8
            kuk r9 = (kuk) r9
            r0.u = r9
            r0.x = r5
            cw2 r9 = r6.n
            java.lang.Object r9 = r9.i(r0)
            if (r9 == r1) goto L68
        L5a:
            r0.t = r3
            r0.u = r3
            r0.x = r4
            fv6 r6 = r6.j
            java.lang.Object r6 = r6.b(r7, r8, r0)
            if (r6 != r1) goto L69
        L68:
            return r1
        L69:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u6c.b(gfe, kotlin.jvm.functions.Function2, nt5):java.lang.Object");
    }

    @Override // defpackage.kpi
    public final boolean c() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    @Override // defpackage.kpi
    public final boolean d() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // defpackage.kpi
    public final float e(float f) {
        return this.j.e(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r7, nt5 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.p6c
            if (r0 == 0) goto L13
            r0 = r8
            p6c r0 = (defpackage.p6c) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            p6c r0 = new p6c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L2f
            if (r2 != r5) goto L29
            defpackage.ybh.y(r8)     // Catch: java.lang.Throwable -> L49
            goto L44
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L2f:
            defpackage.ybh.y(r8)
            r6.i = r5     // Catch: java.lang.Throwable -> L49
            q6c r8 = new q6c     // Catch: java.lang.Throwable -> L49
            r8.<init>(r6, r7, r3, r4)     // Catch: java.lang.Throwable -> L49
            r0.v = r5     // Catch: java.lang.Throwable -> L49
            gfe r7 = defpackage.gfe.a     // Catch: java.lang.Throwable -> L49
            java.lang.Object r7 = r6.b(r7, r8, r0)     // Catch: java.lang.Throwable -> L49
            if (r7 != r1) goto L44
            return r1
        L44:
            r6.i = r4
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L49:
            r7 = move-exception
            r6.i = r4
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u6c.f(int, nt5):java.lang.Object");
    }

    public final void g(m6c m6cVar, boolean z, boolean z2) {
        c5o c5oVar;
        long j;
        ttj ttjVarT;
        Function1 function1E;
        ttj ttjVarX;
        j8m j8mVar = a26.e;
        List list = m6cVar.l;
        int i = m6cVar.o;
        int i2 = m6cVar.b;
        n6c n6cVar = m6cVar.a;
        this.q.e = list.size();
        c5o c5oVar2 = this.x;
        s14 s14Var = this.e;
        if (z) {
            this.b = true;
        } else if (this.b) {
            this.c = m6cVar;
            ttjVarT = bwg.t();
            function1E = ttjVarT != null ? ttjVarT.e() : null;
            ttjVarX = bwg.x(ttjVarT);
            try {
                if (((Number) ((xe1) c5oVar2.b).b.getValue()).floatValue() != 0.0f && n6cVar != null && n6cVar.a == ((q0g) s14Var.c).h() && i2 == ((q0g) s14Var.d).h()) {
                    d3k d3kVar = (d3k) c5oVar2.a;
                    if (d3kVar != null) {
                        d3kVar.k((CancellationException) null);
                    }
                    c5oVar2.b = new xe1(j8mVar, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
            }
        }
        this.v.setValue(Boolean.valueOf(((n6cVar != null ? n6cVar.a : 0) == 0 && i2 == 0) ? false : true));
        this.u.setValue(Boolean.valueOf(m6cVar.c));
        this.h -= m6cVar.d;
        this.f.setValue(m6cVar);
        if (z2) {
            s14Var.getClass();
            if (i2 < 0.0f) {
                d8b.c("scrollOffset should be non-negative");
            }
            ((q0g) s14Var.d).i(i2);
            c5oVar = c5oVar2;
        } else {
            n6c n6cVar2 = (n6c) CollectionsKt.firstOrNull(list);
            n6c n6cVar3 = (n6c) CollectionsKt.R(list);
            if (n6cVar2 != null) {
                c5oVar = c5oVar2;
                j = n6cVar2.a;
            } else {
                c5oVar = c5oVar2;
                j = -1;
            }
            Trace.setCounter("firstVisibleItem:index", j);
            Trace.setCounter("lastVisibleItem:index", n6cVar3 != null ? n6cVar3.a : -1L);
            s14Var.getClass();
            s14Var.e = n6cVar != null ? n6cVar.i : null;
            if (s14Var.b || i > 0) {
                s14Var.b = true;
                if (i2 < 0.0f) {
                    d8b.c("scrollOffset should be non-negative");
                }
                s14Var.N(n6cVar != null ? n6cVar.a : 0, i2);
            }
            if (this.k) {
                zr6 zr6Var = this.a;
                int i3 = zr6Var.a;
                boolean z3 = zr6Var.c;
                if (i3 != -1 && !list.isEmpty() && i3 != zr6.a(m6cVar, z3)) {
                    zr6Var.a = -1;
                    t5c t5cVar = zr6Var.b;
                    if (t5cVar != null) {
                        t5cVar.cancel();
                    }
                    zr6Var.b = null;
                }
                int i4 = zr6Var.d;
                if (i4 != -1 && zr6Var.e != 0.0f && i4 != i && !list.isEmpty()) {
                    int iA = zr6.a(m6cVar, zr6Var.e < 0.0f);
                    if (iA >= 0 && iA < i) {
                        zr6Var.a = iA;
                        zr6Var.b = eq6.M(this.r, iA);
                    }
                }
                zr6Var.d = i;
            }
        }
        if (z) {
            float f = m6cVar.f;
            n27 n27Var = m6cVar.i;
            nx5 nx5Var = m6cVar.h;
            c5oVar.getClass();
            if (f > n27Var.o0(1.0f)) {
                ttjVarT = bwg.t();
                function1E = ttjVarT != null ? ttjVarT.e() : null;
                ttjVarX = bwg.x(ttjVarT);
                c5o c5oVar3 = c5oVar;
                try {
                    float fFloatValue = ((Number) ((xe1) c5oVar3.b).b.getValue()).floatValue();
                    d3k d3kVar2 = (d3k) c5oVar3.a;
                    if (d3kVar2 != null) {
                        d3kVar2.k((CancellationException) null);
                    }
                    xe1 xe1Var = (xe1) c5oVar3.b;
                    if (xe1Var.f) {
                        c5oVar3.b = cs5.u(xe1Var, fFloatValue - f, 0.0f, 30);
                    } else {
                        c5oVar3.b = new xe1(j8mVar, Float.valueOf(-f), null, 60);
                    }
                    c5oVar3.a = na2.B(nx5Var, null, null, new agb((byte) 2, (mt5) null, c5oVar3), 3);
                } finally {
                }
            }
        }
    }

    public final int h() {
        return ((q0g) this.e.c).h();
    }

    public final int i() {
        return ((q0g) this.e.d).h();
    }

    public final m6c j() {
        return (m6c) this.f.getValue();
    }

    public final void k(float f, m6c m6cVar) {
        t5c t5cVar;
        t5c t5cVar2;
        if (this.k) {
            boolean zIsEmpty = m6cVar.l.isEmpty();
            zr6 zr6Var = this.a;
            if (!zIsEmpty) {
                boolean z = f < 0.0f;
                int iA = zr6.a(m6cVar, z);
                if (iA >= 0 && iA < m6cVar.o) {
                    if (iA != zr6Var.a) {
                        if (zr6Var.c != z) {
                            zr6Var.a = -1;
                            t5c t5cVar3 = zr6Var.b;
                            if (t5cVar3 != null) {
                                t5cVar3.cancel();
                            }
                            zr6Var.b = null;
                        }
                        zr6Var.c = z;
                        zr6Var.a = iA;
                        zr6Var.b = eq6.M(this.r, iA);
                    }
                    List list = m6cVar.l;
                    if (z) {
                        n6c n6cVar = (n6c) CollectionsKt.Q(list);
                        if (((n6cVar.l + n6cVar.m) + m6cVar.r) - m6cVar.n < (-f) && (t5cVar2 = zr6Var.b) != null) {
                            t5cVar2.a();
                        }
                    } else if (m6cVar.m - ((n6c) CollectionsKt.K(list)).l < f && (t5cVar = zr6Var.b) != null) {
                        t5cVar.a();
                    }
                }
            }
            zr6Var.e = f;
        }
    }

    public final void m(int i) {
        s14 s14Var = this.e;
        if (((q0g) s14Var.c).h() != i || ((q0g) s14Var.d).h() != 0) {
            p12 p12Var = this.o;
            p12Var.t();
            p12Var.b = null;
        }
        s14Var.N(i, 0);
        s14Var.e = null;
        m3c m3cVar = this.l;
        if (m3cVar != null) {
            m3cVar.k();
        }
    }
}
