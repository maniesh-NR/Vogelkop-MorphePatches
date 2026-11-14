package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class sxf implements kpi {
    public final afe A;
    public final t0g B;
    public final t0g C;
    public final t0g D;
    public final t0g E;
    public boolean a;
    public jxf b;
    public final t0g c;
    public final hd d;
    public int e;
    public int f;
    public long g;
    public long h;
    public float i;
    public float j;
    public final fv6 k;
    public final boolean l;
    public final t0g m;
    public n27 n;
    public int o;
    public final lde p;
    public final q0g q;
    public final q0g r;
    public final u5c s;
    public final bxf t;
    public final nv6 u;
    public final cw2 v;
    public final t0g w;
    public final r6c x;
    public final r5c y;
    public final afe z;

    public sxf(int i, float f) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            d8b.a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.c = hyg.k(new y8f(0L));
        this.d = new hd(i, f, this);
        this.e = i;
        this.g = Long.MAX_VALUE;
        final byte b = 0;
        this.k = new fv6(new Function1(this) { // from class: oxf
            public final /* synthetic */ sxf b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Long] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r14) {
                /*
                    Method dump skipped, instructions count: 248
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.oxf.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final byte b2 = 1;
        this.l = true;
        this.m = new t0g(uxf.b, qs7.g);
        this.n = uxf.a;
        this.p = new lde();
        this.q = new q0g(-1);
        this.r = new q0g(i);
        p8f p8fVar = luj.a;
        new cf2(0);
        new h37(ytj.h().g());
        new cf2(0);
        new h37(ytj.h().g());
        u5c u5cVar = new u5c(new Function1(this) { // from class: oxf
            public final /* synthetic */ sxf b;

            {
                this.b = this;
            }

            public final Object invoke(Object v) {
                /*
                    Method dump skipped, instructions count: 248
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.oxf.invoke(java.lang.Object):java.lang.Object");
            }
        });
        this.s = u5cVar;
        this.t = new bxf(new i4d(this, (byte) 13), u5cVar, new d8e(this, (byte) 11));
        this.u = new nv6((byte) 21);
        this.v = new cw2();
        this.w = hyg.k((Object) null);
        this.x = new r6c(this, (byte) 1);
        ap5.b(0, 0, 0, 0, 15);
        this.y = new r5c();
        this.z = w7d.j();
        this.A = w7d.j();
        Boolean bool = Boolean.FALSE;
        this.B = hyg.k(bool);
        this.C = hyg.k(bool);
        this.D = hyg.k(bool);
        this.E = hyg.k(bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (r9.b(r7, r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object s(defpackage.sxf r6, defpackage.gfe r7, kotlin.jvm.functions.Function2 r8, nt5 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.rxf
            if (r0 == 0) goto L13
            r0 = r9
            rxf r0 = (defpackage.rxf) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.y = r1
            goto L18
        L13:
            rxf r0 = new rxf
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.w
            px5 r1 = px5.a
            int r2 = r0.y
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            sxf r6 = r0.t
            defpackage.ybh.y(r9)
            goto L76
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L33:
            kuk r6 = r0.v
            r8 = r6
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            gfe r7 = r0.u
            sxf r6 = r0.t
            defpackage.ybh.y(r9)
            goto L54
        L40:
            defpackage.ybh.y(r9)
            r0.t = r6
            r0.u = r7
            r9 = r8
            kuk r9 = (kuk) r9
            r0.v = r9
            r0.y = r5
            java.lang.Object r9 = r6.i(r0)
            if (r9 == r1) goto L75
        L54:
            fv6 r9 = r6.k
            boolean r9 = r9.a()
            if (r9 != 0) goto L65
            int r9 = r6.k()
            q0g r2 = r6.r
            r2.i(r9)
        L65:
            fv6 r9 = r6.k
            r0.t = r6
            r0.u = r3
            r0.v = r3
            r0.y = r4
            java.lang.Object r7 = r9.b(r7, r8, r0)
            if (r7 != r1) goto L76
        L75:
            return r1
        L76:
            r7 = -1
            q0g r6 = r6.q
            r6.i(r7)
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxf.s(sxf, gfe, kotlin.jvm.functions.Function2, nt5):java.lang.Object");
    }

    @Override // defpackage.kpi
    public final boolean a() {
        return this.k.a();
    }

    @Override // defpackage.kpi
    public final Object b(gfe gfeVar, Function2 function2, nt5 nt5Var) {
        return s(this, gfeVar, function2, nt5Var);
    }

    @Override // defpackage.kpi
    public final boolean c() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    @Override // defpackage.kpi
    public final boolean d() {
        return ((Boolean) this.B.getValue()).booleanValue();
    }

    @Override // defpackage.kpi
    public final float e(float f) {
        return this.k.e(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (b(defpackage.gfe.a, r6, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r13, defpackage.a2k r14, nt5 r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.pxf
            if (r0 == 0) goto L13
            r0 = r15
            pxf r0 = (defpackage.pxf) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            pxf r0 = new pxf
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 0
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3b
            if (r2 == r6) goto L32
            if (r2 != r5) goto L2c
            defpackage.ybh.y(r15)
            goto L81
        L2c:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r12)
            return r3
        L32:
            int r13 = r0.t
            a2k r14 = r0.u
            defpackage.ybh.y(r15)
        L39:
            r10 = r14
            goto L62
        L3b:
            defpackage.ybh.y(r15)
            int r15 = r12.k()
            if (r13 != r15) goto L4c
            float r15 = r12.l()
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 == 0) goto L52
        L4c:
            int r15 = r12.n()
            if (r15 != 0) goto L55
        L52:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        L55:
            r0.u = r14
            r0.t = r13
            r0.x = r6
            java.lang.Object r15 = r12.i(r0)
            if (r15 != r1) goto L39
            goto L80
        L62:
            int r8 = r12.j(r13)
            int r13 = r12.p()
            float r13 = (float) r13
            float r9 = r4 * r13
            qxf r6 = new qxf
            r11 = 0
            r7 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r0.u = r3
            r0.x = r5
            gfe r12 = defpackage.gfe.a
            java.lang.Object r12 = r7.b(r12, r6, r0)
            if (r12 != r1) goto L81
        L80:
            return r1
        L81:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxf.f(int, a2k, nt5):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x036c A[Catch: all -> 0x03ae, TryCatch #0 {all -> 0x03ae, blocks: (B:182:0x031d, B:184:0x0325, B:186:0x0331, B:188:0x033d, B:195:0x0372, B:193:0x036c, B:191:0x0355), top: B:209:0x031d }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x031d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(defpackage.jxf r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxf.h(jxf, boolean, boolean):void");
    }

    public final Object i(nt5 nt5Var) {
        Object objI;
        return (this.m.getValue() == uxf.b && (objI = this.v.i(nt5Var)) == px5.a) ? objI : Unit.a;
    }

    public final int j(int i) {
        if (n() > 0) {
            return djh.c(i, 0, n() - 1);
        }
        return 0;
    }

    public final int k() {
        return ((q0g) this.d.d).h();
    }

    public final float l() {
        return ((p0g) this.d.e).h();
    }

    public final jxf m() {
        return (jxf) this.m.getValue();
    }

    public abstract int n();

    public final int o() {
        return ((jxf) this.m.getValue()).b;
    }

    public final int p() {
        return ((jxf) this.m.getValue()).c + o();
    }

    public final long q() {
        return ((y8f) this.c.getValue()).a;
    }

    public final boolean r() {
        return ((int) Float.intBitsToFloat((int) (q() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (q() & 4294967295L))) == 0;
    }

    public final void t(int i, float f, boolean z) {
        hd hdVar = this.d;
        q0g q0gVar = (q0g) hdVar.d;
        p0g p0gVar = (p0g) hdVar.e;
        if (q0gVar.h() != i || p0gVar.h() != f) {
            this.t.f();
        }
        ((q0g) hdVar.d).i(i);
        ((o5c) hdVar.g).b(i);
        p0gVar.i(f);
        hdVar.f = null;
        if (!z) {
            this.A.setValue(Unit.a);
            return;
        }
        m3c m3cVar = (m3c) this.w.getValue();
        if (m3cVar != null) {
            m3cVar.k();
        }
    }
}
