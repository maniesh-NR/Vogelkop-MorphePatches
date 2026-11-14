package defpackage;

/* loaded from: classes.dex */
public final class u6b implements ck7 {
    public final oj7 a;
    public p6b b;
    public s6b c;
    public r6b d;
    public q6b e;
    public mkh f;
    public bxk g;
    public yv4 h;
    public final bp i;
    public final bp j;

    public u6b(oj7 oj7Var) {
        this.a = oj7Var;
        bp bpVar = new bp();
        bpVar.b = new dee();
        this.i = bpVar;
        bp bpVar2 = new bp();
        bpVar2.b = new rde();
        this.j = bpVar2;
    }

    public static void c(u6b u6bVar, n6b n6bVar, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        oj7 oj7Var = u6bVar.a;
        r6b r6bVar = u6bVar.d;
        if (r6bVar == null) {
            r6bVar = new r6b();
            r6bVar.k = null;
            r6bVar.l = Long.MAX_VALUE;
            r6bVar.m = false;
            u6bVar.d = r6bVar;
        }
        r6bVar.k = n6bVar;
        r6bVar.l = j;
        yv4 yv4Var = u6bVar.h;
        fsf fsfVar = oj7Var.q;
        if (yv4Var == null) {
            u6bVar.h = new yv4(fsfVar);
        } else {
            yv4Var.c = fsfVar;
            yv4Var.b = j2;
        }
        r6bVar.m = false;
        u6bVar.f = r6bVar;
    }

    @Override // defpackage.ck7
    public final fsf C() {
        return this.a.q;
    }

    public final void a() {
        p6b p6bVar = this.b;
        if (p6bVar == null) {
            o6b o6bVar = o6b.c;
            p6bVar = new p6b();
            p6bVar.k = o6bVar;
            p6bVar.l = false;
            p6bVar.m = false;
            this.b = p6bVar;
        }
        p6bVar.k = o6b.c;
        p6bVar.l = false;
        p6bVar.m = false;
        this.f = p6bVar;
    }

    public final void b(n6b n6bVar, long j, yv4 yv4Var) {
        q6b q6bVar = this.e;
        if (q6bVar == null) {
            q6bVar = new q6b();
            q6bVar.k = null;
            q6bVar.l = Long.MAX_VALUE;
            this.e = q6bVar;
        }
        q6bVar.k = n6bVar;
        q6bVar.l = j;
        yv4Var.b = 0L;
        this.f = q6bVar;
    }

    public final bxk d() {
        bxk bxkVar = this.g;
        if (bxkVar != null) {
            return bxkVar;
        }
        qp2.o("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(n6b n6bVar, m6b m6bVar, long j) {
        long j2;
        float fIntBitsToFloat;
        long j3 = n6bVar.c;
        oj7 oj7Var = this.a;
        fsf fsfVar = oj7Var.q;
        dk7 dk7Var = ek7.a;
        long j4 = 4294967295L;
        if (Math.abs(Float.intBitsToFloat((int) (fsfVar == fsf.a ? j & 4294967295L : j >> 32))) > 2.0f) {
            bxk bxkVarD = d();
            fsf fsfVar2 = oj7Var.q;
            bp bpVar = this.i;
            dee deeVar = (dee) bpVar.b;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 & 4294967295L));
            if (wyh.i(n6bVar)) {
                bpVar.a = 0;
                deeVar.d();
            }
            float fIntBitsToFloat4 = 0.0f;
            if (wyh.j(n6bVar) || wyh.i(n6bVar)) {
                j2 = 4294967295L;
            } else {
                if (deeVar.b == 3) {
                    int i = bpVar.a;
                    bpVar.a = i + 1;
                    deeVar.o(i, n6bVar);
                } else {
                    deeVar.a(n6bVar);
                }
                if (bpVar.a == 3) {
                    bpVar.a = 0;
                }
                Object[] objArr = deeVar.a;
                int i2 = deeVar.b;
                int i3 = 0;
                float fIntBitsToFloat5 = 0.0f;
                while (i3 < i2) {
                    fIntBitsToFloat5 += Float.intBitsToFloat((int) (((n6b) objArr[i3]).c >> 32));
                    i3++;
                    j4 = j4;
                }
                j2 = j4;
                int i4 = deeVar.b;
                fIntBitsToFloat2 = fIntBitsToFloat5 / i4;
                Object[] objArr2 = deeVar.a;
                float fIntBitsToFloat6 = 0.0f;
                for (int i5 = 0; i5 < i4; i5++) {
                    fIntBitsToFloat6 += Float.intBitsToFloat((int) (((n6b) objArr2[i5]).c & j2));
                }
                fIntBitsToFloat3 = fIntBitsToFloat6 / deeVar.b;
            }
            long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat3) & j2);
            if (fsfVar2 != null) {
                int i6 = m6bVar.a;
                if (i6 == 1) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                } else if (i6 == 2) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
                }
                jFloatToRawIntBits = fsfVar2 == fsf.b ? Float.floatToRawIntBits(fIntBitsToFloat) << 32 : Float.floatToRawIntBits(fIntBitsToFloat) & j2;
            }
            ((qq8) bxkVarD.b).b(n6bVar.b, jFloatToRawIntBits);
            bp bpVar2 = this.j;
            rde rdeVar = (rde) bpVar2.b;
            int i7 = rdeVar.b;
            if (i7 == 3) {
                int i8 = bpVar2.a;
                bpVar2.a = i8 + 1;
                if (i8 < 0 || i8 >= i7) {
                    zwg.u("Index must be between 0 and size");
                    throw null;
                }
                long[] jArr = rdeVar.a;
                long j5 = jArr[i8];
                jArr[i8] = j;
            } else {
                rdeVar.a(j);
            }
            if (bpVar2.a == 3) {
                bpVar2.a = 0;
            }
            long[] jArr2 = rdeVar.a;
            int i9 = rdeVar.b;
            float fIntBitsToFloat7 = 0.0f;
            for (int i10 = 0; i10 < i9; i10++) {
                fIntBitsToFloat7 += Float.intBitsToFloat((int) (jArr2[i10] >> 32));
            }
            int i11 = rdeVar.b;
            float f = fIntBitsToFloat7 / i11;
            long[] jArr3 = rdeVar.a;
            for (int i12 = 0; i12 < i11; i12++) {
                fIntBitsToFloat4 = Float.intBitsToFloat((int) (jArr3[i12] & j2)) + fIntBitsToFloat4;
            }
            oj7Var.b1(new yi7((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat4 / rdeVar.b) & j2), true));
        }
    }

    public final void f(n6b n6bVar, n6b n6bVar2, m6b m6bVar, long j) {
        char c;
        long j2;
        float fIntBitsToFloat;
        if (this.g == null) {
            this.g = new bxk((byte) 8);
        }
        bxk bxkVarD = d();
        oj7 oj7Var = this.a;
        fsf fsfVar = oj7Var.q;
        bp bpVar = this.i;
        dee deeVar = (dee) bpVar.b;
        char c2 = ' ';
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (n6bVar.c >> 32));
        long j3 = 4294967295L;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (n6bVar.c & 4294967295L));
        if (wyh.i(n6bVar)) {
            bpVar.a = 0;
            deeVar.d();
        }
        if (wyh.j(n6bVar) || wyh.i(n6bVar)) {
            c = ' ';
            j2 = 4294967295L;
        } else {
            if (deeVar.b == 3) {
                int i = bpVar.a;
                bpVar.a = i + 1;
                deeVar.o(i, n6bVar);
            } else {
                deeVar.a(n6bVar);
            }
            if (bpVar.a == 3) {
                bpVar.a = 0;
            }
            Object[] objArr = deeVar.a;
            int i2 = deeVar.b;
            int i3 = 0;
            float fIntBitsToFloat4 = 0.0f;
            while (i3 < i2) {
                char c3 = c2;
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((n6b) objArr[i3]).c >> c3));
                i3++;
                c2 = c3;
            }
            c = c2;
            int i4 = deeVar.b;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = deeVar.a;
            int i5 = 0;
            float fIntBitsToFloat5 = 0.0f;
            while (i5 < i4) {
                long j4 = j3;
                fIntBitsToFloat5 = Float.intBitsToFloat((int) (((n6b) objArr2[i5]).c & j4)) + fIntBitsToFloat5;
                i5++;
                j3 = j4;
            }
            j2 = j3;
            fIntBitsToFloat3 = fIntBitsToFloat5 / deeVar.b;
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) << c) | (Float.floatToRawIntBits(fIntBitsToFloat3) & j2);
        if (fsfVar != null) {
            int i6 = m6bVar.a;
            if (i6 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c));
            } else if (i6 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
            }
            jFloatToRawIntBits = fsfVar == fsf.b ? Float.floatToRawIntBits(fIntBitsToFloat) << c : Float.floatToRawIntBits(fIntBitsToFloat) & j2;
        }
        ((qq8) bxkVarD.b).b(n6bVar.b, jFloatToRawIntBits);
        long jD = y8f.d(wyh.Q(n6bVar2, oj7Var.q, m6bVar), j);
        if (((Boolean) oj7Var.r.invoke(new vmg(1))).booleanValue()) {
            oj7Var.b1(new zi7(jD));
        }
        bp bpVar2 = this.j;
        bpVar2.a = 0;
        ((rde) bpVar2.b).b = 0;
    }

    @Override // defpackage.aw9
    public final String x() {
        mkh mkhVar = this.f;
        return mkhVar instanceof p6b ? ((p6b) mkhVar).m ? "waiting" : "idle" : ((mkhVar instanceof r6b) || (mkhVar instanceof q6b)) ? "waiting" : mkhVar instanceof s6b ? "recognized" : "idle";
    }
}
