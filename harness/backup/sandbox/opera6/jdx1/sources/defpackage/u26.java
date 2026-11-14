package defpackage;

import kotlin.time.TimeMark;

/* loaded from: classes.dex */
public final class u26 extends hyf {
    public final hyf f;
    public final kr5 g;
    public final long h;
    public final upl i;
    public final boolean j;
    public final q0g k;
    public TimeMark l;
    public boolean m;
    public float n;
    public kh3 o;
    public hyf p;
    public final long q;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u26(defpackage.hyf r5, defpackage.hyf r6, defpackage.kr5 r7, long r8, boolean r10, boolean r11) {
        /*
            r4 = this;
            tpl r0 = tpl.a
            r4.<init>()
            r4.f = r6
            r4.g = r7
            r4.h = r8
            r4.i = r0
            r4.j = r10
            q0g r7 = new q0g
            r8 = 0
            r7.<init>(r8)
            r4.k = r7
            r7 = 1065353216(0x3f800000, float:1.0)
            r4.n = r7
            r4.p = r5
            r9 = 0
            if (r5 == 0) goto L26
            long r0 = r5.h()
            goto L27
        L26:
            r0 = r9
        L27:
            if (r6 == 0) goto L2d
            long r9 = r6.h()
        L2d:
            r5 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r2 = 1
            if (r7 == 0) goto L39
            r7 = r2
            goto L3a
        L39:
            r7 = r8
        L3a:
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 == 0) goto L3f
            r8 = r2
        L3f:
            if (r11 == 0) goto L47
            if (r8 == 0) goto L45
            r0 = r9
            goto L83
        L45:
            if (r7 != 0) goto L83
        L47:
            if (r7 == 0) goto L82
            if (r8 == 0) goto L82
            r5 = 32
            long r6 = r0 >> r5
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r7 = r9 >> r5
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r6 = java.lang.Math.max(r6, r7)
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r7
            int r11 = (int) r0
            float r11 = java.lang.Float.intBitsToFloat(r11)
            long r9 = r9 & r7
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r9 = java.lang.Math.max(r11, r9)
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r10 = (long) r6
            int r6 = java.lang.Float.floatToRawIntBits(r9)
            long r0 = (long) r6
            long r10 = r10 << r5
            long r0 = r0 & r7
            long r0 = r0 | r10
            goto L83
        L82:
            r0 = r5
        L83:
            r4.q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u26.<init>(hyf, hyf, kr5, long, boolean, boolean):void");
    }

    @Override // defpackage.hyf
    public final boolean d(float f) {
        this.n = f;
        return true;
    }

    @Override // defpackage.hyf
    public final boolean e(kh3 kh3Var) {
        this.o = kh3Var;
        return true;
    }

    @Override // defpackage.hyf
    public final long h() {
        return this.q;
    }

    @Override // defpackage.hyf
    public final void i(mk7 mk7Var) {
        boolean z = this.m;
        hyf hyfVar = this.f;
        if (z) {
            j(mk7Var, hyfVar, this.n);
            return;
        }
        TimeMark timeMarkA = this.l;
        if (timeMarkA == null) {
            timeMarkA = this.i.a();
            this.l = timeMarkA;
        }
        float f = pn7.f(timeMarkA.a()) / pn7.f(this.h);
        float fB = djh.b(f, 0.0f, 1.0f);
        float f2 = this.n;
        float f3 = fB * f2;
        if (this.j) {
            f2 -= f3;
        }
        this.m = f >= 1.0f;
        j(mk7Var, this.p, f2);
        j(mk7Var, hyfVar, f3);
        if (this.m) {
            this.p = null;
        } else {
            q0g q0gVar = this.k;
            q0gVar.i(q0gVar.h() + 1);
        }
    }

    public final void j(mk7 mk7Var, hyf hyfVar, float f) {
        if (hyfVar == null || f <= 0.0f) {
            return;
        }
        long jE = mk7Var.e();
        long jH = hyfVar.h();
        long jG = (jH == 9205357640488583168L || bpj.e(jH) || jE == 9205357640488583168L || bpj.e(jE)) ? jE : fac.G(jH, this.g.g(jH, jE));
        if (jE == 9205357640488583168L || bpj.e(jE)) {
            hyfVar.g(mk7Var, jG, f, this.o);
            return;
        }
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (jE >> 32)) - Float.intBitsToFloat((int) (jG >> 32))) / 2.0f;
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (jE & 4294967295L)) - Float.intBitsToFloat((int) (jG & 4294967295L))) / 2.0f;
        ((wth) mk7Var.s0().a).I(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2);
        try {
            hyfVar.g(mk7Var, jG, f, this.o);
        } finally {
            float f2 = -fIntBitsToFloat;
            float f3 = -fIntBitsToFloat2;
            ((wth) mk7Var.s0().a).I(f2, f3, f2, f3);
        }
    }
}
