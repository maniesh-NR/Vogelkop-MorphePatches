package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class u1d extends ifg implements pfd, xz0, hae {
    public final s1d A;
    public boolean B;
    public final q3c f;
    public boolean g;
    public boolean k;
    public boolean l;
    public boolean m;
    public yo5 n;
    public Function1 p;
    public boolean u;
    public final s1d v;
    public Object x;
    public final s1d z;
    public int h = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public k3c j = k3c.c;
    public long o = 0;
    public t1d q = t1d.c;
    public final n3c r = new n3c(this, (byte) 1);
    public final dfe s = new dfe(new u1d[16]);
    public boolean t = true;
    public boolean w = true;
    public long y = ap5.b(0, 0, 0, 0, 15);

    /* JADX WARN: Type inference failed for: r0v6, types: [s1d] */
    /* JADX WARN: Type inference failed for: r5v4, types: [s1d] */
    /* JADX WARN: Type inference failed for: r5v5, types: [s1d] */
    public u1d(q3c q3cVar) {
        this.f = q3cVar;
        final byte b = 1;
        final byte b2 = 0;
        this.v = new Function0(this) { // from class: s1d
            public final /* synthetic */ u1d b;

            {
                this.b = this;
            }

            public final Object invoke() {
                q1d q1dVarX0;
                byte b3 = b2;
                p1d p1dVar = null;
                u1d u1dVar = this.b;
                switch (b3) {
                    case 0:
                        q3c q3cVar2 = u1dVar.f;
                        q3cVar2.h = 0;
                        m3c m3cVar = q3cVar2.a;
                        dfe dfeVarZ = m3cVar.z();
                        Object[] objArr = dfeVarZ.a;
                        int i = dfeVarZ.c;
                        for (int i2 = 0; i2 < i; i2++) {
                            u1d u1dVar2 = ((m3c) objArr[i2]).G.q;
                            u1dVar2.h = u1dVar2.i;
                            u1dVar2.i = Integer.MAX_VALUE;
                            if (u1dVar2.j == k3c.b) {
                                u1dVar2.j = k3c.c;
                            }
                        }
                        dfe dfeVarZ2 = m3cVar.z();
                        Object[] objArr2 = dfeVarZ2.a;
                        int i3 = dfeVarZ2.c;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((m3c) objArr2[i4]).G.q.r.d = false;
                        }
                        i8b i8bVar = u1dVar.C().c0;
                        if (i8bVar != null) {
                            pqh pqhVar = new pqh();
                            List listN = m3cVar.n();
                            int size = listN.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                m3c m3cVar2 = (m3c) ((bee) listN).get(i5);
                                q1d q1dVarX02 = ((wye) m3cVar2.F.e).X0();
                                if (q1dVarX02 != null) {
                                    if (q1dVarX02.o) {
                                        dee deeVar = (dee) pqhVar.a;
                                        if (deeVar == null) {
                                            deeVar = new dee();
                                            pqhVar.a = deeVar;
                                        }
                                        pqhVar.a = deeVar;
                                        deeVar.a(m3cVar2);
                                    }
                                    q1dVarX02.o = i8bVar.o;
                                }
                            }
                            i8bVar.G0().b();
                            List listN2 = m3cVar.n();
                            int size2 = listN2.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                m3c m3cVar3 = (m3c) ((bee) listN2).get(i6);
                                dee deeVar2 = (dee) pqhVar.a;
                                boolean z = deeVar2 != null && deeVar2.e(m3cVar3);
                                q1d q1dVarX03 = ((wye) m3cVar3.F.e).X0();
                                if (q1dVarX03 != null) {
                                    q1dVarX03.o = z;
                                }
                            }
                            dfe dfeVarZ3 = m3cVar.z();
                            Object[] objArr3 = dfeVarZ3.a;
                            int i7 = dfeVarZ3.c;
                            for (int i8 = 0; i8 < i7; i8++) {
                                u1d u1dVar3 = ((m3c) objArr3[i8]).G.q;
                                int i9 = u1dVar3.h;
                                int i10 = u1dVar3.i;
                                if (i9 != i10 && i10 == Integer.MAX_VALUE) {
                                    u1dVar3.q0(true);
                                }
                            }
                            dfe dfeVarZ4 = m3cVar.z();
                            Object[] objArr4 = dfeVarZ4.a;
                            int i11 = dfeVarZ4.c;
                            for (int i12 = 0; i12 < i11; i12++) {
                                n3c n3cVar = ((m3c) objArr4[i12]).G.q.r;
                                n3cVar.e = n3cVar.d;
                            }
                            break;
                        } else {
                            qp2.n("Expected lookahead delegate");
                            break;
                        }
                        break;
                    case 1:
                        u1dVar.f.a().X0().N(u1dVar.y);
                        break;
                    default:
                        q3c q3cVar3 = u1dVar.f;
                        if (ui6.M(q3cVar3.a) || q3cVar3.c) {
                            wye wyeVar = q3cVar3.a().w;
                            if (wyeVar != null) {
                                p1dVar = wyeVar.p;
                            }
                        } else {
                            wye wyeVar2 = q3cVar3.a().w;
                            if (wyeVar2 != null && (q1dVarX0 = wyeVar2.X0()) != null) {
                                p1dVar = q1dVarX0.p;
                            }
                        }
                        if (p1dVar == null) {
                            v31 v31VarA = p3c.a(q3cVar3.a);
                            m3g m3gVar = jfg.a;
                            p1dVar = new p1d(v31VarA, (byte) 1);
                        }
                        p1d.g(p1dVar, q3cVar3.a().X0(), u1dVar.o);
                        break;
                }
                return Unit.a;
            }
        };
        this.x = q3cVar.p.r;
        this.z = new Function0(this) { // from class: s1d
            public final /* synthetic */ u1d b;

            {
                this.b = this;
            }

            public final Object invoke() {
                q1d q1dVarX0;
                byte b3 = b;
                p1d p1dVar = null;
                u1d u1dVar = this.b;
                switch (b3) {
                    case 0:
                        q3c q3cVar2 = u1dVar.f;
                        q3cVar2.h = 0;
                        m3c m3cVar = q3cVar2.a;
                        dfe dfeVarZ = m3cVar.z();
                        Object[] objArr = dfeVarZ.a;
                        int i = dfeVarZ.c;
                        for (int i2 = 0; i2 < i; i2++) {
                            u1d u1dVar2 = ((m3c) objArr[i2]).G.q;
                            u1dVar2.h = u1dVar2.i;
                            u1dVar2.i = Integer.MAX_VALUE;
                            if (u1dVar2.j == k3c.b) {
                                u1dVar2.j = k3c.c;
                            }
                        }
                        dfe dfeVarZ2 = m3cVar.z();
                        Object[] objArr2 = dfeVarZ2.a;
                        int i3 = dfeVarZ2.c;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((m3c) objArr2[i4]).G.q.r.d = false;
                        }
                        i8b i8bVar = u1dVar.C().c0;
                        if (i8bVar != null) {
                            pqh pqhVar = new pqh();
                            List listN = m3cVar.n();
                            int size = listN.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                m3c m3cVar2 = (m3c) ((bee) listN).get(i5);
                                q1d q1dVarX02 = ((wye) m3cVar2.F.e).X0();
                                if (q1dVarX02 != null) {
                                    if (q1dVarX02.o) {
                                        dee deeVar = (dee) pqhVar.a;
                                        if (deeVar == null) {
                                            deeVar = new dee();
                                            pqhVar.a = deeVar;
                                        }
                                        pqhVar.a = deeVar;
                                        deeVar.a(m3cVar2);
                                    }
                                    q1dVarX02.o = i8bVar.o;
                                }
                            }
                            i8bVar.G0().b();
                            List listN2 = m3cVar.n();
                            int size2 = listN2.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                m3c m3cVar3 = (m3c) ((bee) listN2).get(i6);
                                dee deeVar2 = (dee) pqhVar.a;
                                boolean z = deeVar2 != null && deeVar2.e(m3cVar3);
                                q1d q1dVarX03 = ((wye) m3cVar3.F.e).X0();
                                if (q1dVarX03 != null) {
                                    q1dVarX03.o = z;
                                }
                            }
                            dfe dfeVarZ3 = m3cVar.z();
                            Object[] objArr3 = dfeVarZ3.a;
                            int i7 = dfeVarZ3.c;
                            for (int i8 = 0; i8 < i7; i8++) {
                                u1d u1dVar3 = ((m3c) objArr3[i8]).G.q;
                                int i9 = u1dVar3.h;
                                int i10 = u1dVar3.i;
                                if (i9 != i10 && i10 == Integer.MAX_VALUE) {
                                    u1dVar3.q0(true);
                                }
                            }
                            dfe dfeVarZ4 = m3cVar.z();
                            Object[] objArr4 = dfeVarZ4.a;
                            int i11 = dfeVarZ4.c;
                            for (int i12 = 0; i12 < i11; i12++) {
                                n3c n3cVar = ((m3c) objArr4[i12]).G.q.r;
                                n3cVar.e = n3cVar.d;
                            }
                            break;
                        } else {
                            qp2.n("Expected lookahead delegate");
                            break;
                        }
                        break;
                    case 1:
                        u1dVar.f.a().X0().N(u1dVar.y);
                        break;
                    default:
                        q3c q3cVar3 = u1dVar.f;
                        if (ui6.M(q3cVar3.a) || q3cVar3.c) {
                            wye wyeVar = q3cVar3.a().w;
                            if (wyeVar != null) {
                                p1dVar = wyeVar.p;
                            }
                        } else {
                            wye wyeVar2 = q3cVar3.a().w;
                            if (wyeVar2 != null && (q1dVarX0 = wyeVar2.X0()) != null) {
                                p1dVar = q1dVarX0.p;
                            }
                        }
                        if (p1dVar == null) {
                            v31 v31VarA = p3c.a(q3cVar3.a);
                            m3g m3gVar = jfg.a;
                            p1dVar = new p1d(v31VarA, (byte) 1);
                        }
                        p1d.g(p1dVar, q3cVar3.a().X0(), u1dVar.o);
                        break;
                }
                return Unit.a;
            }
        };
        final byte b3 = 2;
        this.A = new Function0(this) { // from class: s1d
            public final /* synthetic */ u1d b;

            {
                this.b = this;
            }

            public final Object invoke() {
                q1d q1dVarX0;
                byte b32 = b3;
                p1d p1dVar = null;
                u1d u1dVar = this.b;
                switch (b32) {
                    case 0:
                        q3c q3cVar2 = u1dVar.f;
                        q3cVar2.h = 0;
                        m3c m3cVar = q3cVar2.a;
                        dfe dfeVarZ = m3cVar.z();
                        Object[] objArr = dfeVarZ.a;
                        int i = dfeVarZ.c;
                        for (int i2 = 0; i2 < i; i2++) {
                            u1d u1dVar2 = ((m3c) objArr[i2]).G.q;
                            u1dVar2.h = u1dVar2.i;
                            u1dVar2.i = Integer.MAX_VALUE;
                            if (u1dVar2.j == k3c.b) {
                                u1dVar2.j = k3c.c;
                            }
                        }
                        dfe dfeVarZ2 = m3cVar.z();
                        Object[] objArr2 = dfeVarZ2.a;
                        int i3 = dfeVarZ2.c;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((m3c) objArr2[i4]).G.q.r.d = false;
                        }
                        i8b i8bVar = u1dVar.C().c0;
                        if (i8bVar != null) {
                            pqh pqhVar = new pqh();
                            List listN = m3cVar.n();
                            int size = listN.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                m3c m3cVar2 = (m3c) ((bee) listN).get(i5);
                                q1d q1dVarX02 = ((wye) m3cVar2.F.e).X0();
                                if (q1dVarX02 != null) {
                                    if (q1dVarX02.o) {
                                        dee deeVar = (dee) pqhVar.a;
                                        if (deeVar == null) {
                                            deeVar = new dee();
                                            pqhVar.a = deeVar;
                                        }
                                        pqhVar.a = deeVar;
                                        deeVar.a(m3cVar2);
                                    }
                                    q1dVarX02.o = i8bVar.o;
                                }
                            }
                            i8bVar.G0().b();
                            List listN2 = m3cVar.n();
                            int size2 = listN2.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                m3c m3cVar3 = (m3c) ((bee) listN2).get(i6);
                                dee deeVar2 = (dee) pqhVar.a;
                                boolean z = deeVar2 != null && deeVar2.e(m3cVar3);
                                q1d q1dVarX03 = ((wye) m3cVar3.F.e).X0();
                                if (q1dVarX03 != null) {
                                    q1dVarX03.o = z;
                                }
                            }
                            dfe dfeVarZ3 = m3cVar.z();
                            Object[] objArr3 = dfeVarZ3.a;
                            int i7 = dfeVarZ3.c;
                            for (int i8 = 0; i8 < i7; i8++) {
                                u1d u1dVar3 = ((m3c) objArr3[i8]).G.q;
                                int i9 = u1dVar3.h;
                                int i10 = u1dVar3.i;
                                if (i9 != i10 && i10 == Integer.MAX_VALUE) {
                                    u1dVar3.q0(true);
                                }
                            }
                            dfe dfeVarZ4 = m3cVar.z();
                            Object[] objArr4 = dfeVarZ4.a;
                            int i11 = dfeVarZ4.c;
                            for (int i12 = 0; i12 < i11; i12++) {
                                n3c n3cVar = ((m3c) objArr4[i12]).G.q.r;
                                n3cVar.e = n3cVar.d;
                            }
                            break;
                        } else {
                            qp2.n("Expected lookahead delegate");
                            break;
                        }
                        break;
                    case 1:
                        u1dVar.f.a().X0().N(u1dVar.y);
                        break;
                    default:
                        q3c q3cVar3 = u1dVar.f;
                        if (ui6.M(q3cVar3.a) || q3cVar3.c) {
                            wye wyeVar = q3cVar3.a().w;
                            if (wyeVar != null) {
                                p1dVar = wyeVar.p;
                            }
                        } else {
                            wye wyeVar2 = q3cVar3.a().w;
                            if (wyeVar2 != null && (q1dVarX0 = wyeVar2.X0()) != null) {
                                p1dVar = q1dVarX0.p;
                            }
                        }
                        if (p1dVar == null) {
                            v31 v31VarA = p3c.a(q3cVar3.a);
                            m3g m3gVar = jfg.a;
                            p1dVar = new p1d(v31VarA, (byte) 1);
                        }
                        p1d.g(p1dVar, q3cVar3.a().X0(), u1dVar.o);
                        break;
                }
                return Unit.a;
            }
        };
    }

    public final void A0() {
        i3c i3cVar;
        this.B = true;
        q3c q3cVar = this.f;
        m3c m3cVarU = q3cVar.a.u();
        t1d t1dVar = this.q;
        if ((t1dVar != t1d.a && !q3cVar.c) || (t1dVar != t1d.b && q3cVar.c)) {
            r0();
            if (this.g && m3cVarU != null) {
                m3cVarU.S(false);
            }
        }
        if (m3cVarU != null) {
            q3c q3cVar2 = m3cVarU.G;
            if (!this.g && ((i3cVar = q3cVar2.d) == i3c.c || i3cVar == i3c.d)) {
                if (this.i != Integer.MAX_VALUE) {
                    a8b.b("Place was called on a node which was placed already");
                }
                int i = q3cVar2.h;
                this.i = i;
                q3cVar2.h = i + 1;
            }
        } else {
            this.i = 0;
        }
        t();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:10:0x001a, B:12:0x001e, B:13:0x0023, B:15:0x0032, B:17:0x0036, B:20:0x003c, B:19:0x003a, B:21:0x003f, B:23:0x0049, B:27:0x0052, B:29:0x007d, B:28:0x0067), top: B:34:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B0(long r10, kotlin.jvm.functions.Function1 r12) throws java.lang.Throwable {
        /*
            r9 = this;
            q3c r0 = r9.f
            m3c r1 = r0.a
            m3c r2 = r0.a
            r3 = 0
            m3c r4 = r1.u()     // Catch: java.lang.Throwable -> L84
            if (r4 == 0) goto L12
            q3c r4 = r4.G     // Catch: java.lang.Throwable -> L84
            i3c r4 = r4.d     // Catch: java.lang.Throwable -> L84
            goto L13
        L12:
            r4 = r3
        L13:
            i3c r5 = defpackage.i3c.d     // Catch: java.lang.Throwable -> L84
            r6 = 0
            if (r4 != r5) goto L1a
            r0.c = r6     // Catch: java.lang.Throwable -> L84
        L1a:
            boolean r4 = r2.Q     // Catch: java.lang.Throwable -> L84
            if (r4 == 0) goto L23
            java.lang.String r4 = "place is called on a deactivated node"
            defpackage.a8b.a(r4)     // Catch: java.lang.Throwable -> L84
        L23:
            r0.d = r5     // Catch: java.lang.Throwable -> L84
            r4 = 1
            r9.l = r4     // Catch: java.lang.Throwable -> L84
            r9.B = r6     // Catch: java.lang.Throwable -> L84
            long r7 = r9.o     // Catch: java.lang.Throwable -> L84
            boolean r5 = defpackage.ybb.a(r10, r7)     // Catch: java.lang.Throwable -> L84
            if (r5 != 0) goto L3f
            boolean r5 = r0.n     // Catch: java.lang.Throwable -> L84
            if (r5 != 0) goto L3a
            boolean r5 = r0.m     // Catch: java.lang.Throwable -> L84
            if (r5 == 0) goto L3c
        L3a:
            r0.f = r4     // Catch: java.lang.Throwable -> L84
        L3c:
            r9.v0()     // Catch: java.lang.Throwable -> L84
        L3f:
            v31 r5 = defpackage.p3c.a(r2)     // Catch: java.lang.Throwable -> L84
            r9.o = r10     // Catch: java.lang.Throwable -> L84
            boolean r7 = r0.f     // Catch: java.lang.Throwable -> L84
            if (r7 != 0) goto L67
            t1d r7 = r9.q     // Catch: java.lang.Throwable -> L84
            t1d r8 = defpackage.t1d.c     // Catch: java.lang.Throwable -> L84
            if (r7 != r8) goto L50
            r4 = r6
        L50:
            if (r4 == 0) goto L67
            wye r2 = r0.a()     // Catch: java.lang.Throwable -> L84
            q1d r2 = r2.X0()     // Catch: java.lang.Throwable -> L84
            long r4 = r2.e     // Catch: java.lang.Throwable -> L84
            long r10 = defpackage.ybb.c(r10, r4)     // Catch: java.lang.Throwable -> L84
            r2.P0(r10)     // Catch: java.lang.Throwable -> L84
            r9.A0()     // Catch: java.lang.Throwable -> L84
            goto L7d
        L67:
            r0.h(r6)     // Catch: java.lang.Throwable -> L84
            n3c r10 = r9.r     // Catch: java.lang.Throwable -> L84
            r10.g = r6     // Catch: java.lang.Throwable -> L84
            p12 r10 = r5.K     // Catch: java.lang.Throwable -> L84
            s1d r11 = r9.A     // Catch: java.lang.Throwable -> L84
            java.lang.Object r4 = r10.g     // Catch: java.lang.Throwable -> L84
            w5f r4 = (w5f) r4     // Catch: java.lang.Throwable -> L84
            java.lang.Object r10 = r10.a     // Catch: java.lang.Throwable -> L84
            tuj r10 = (defpackage.tuj) r10     // Catch: java.lang.Throwable -> L84
            r10.e(r2, r4, r11)     // Catch: java.lang.Throwable -> L84
        L7d:
            r9.p = r12     // Catch: java.lang.Throwable -> L84
            i3c r9 = defpackage.i3c.e     // Catch: java.lang.Throwable -> L84
            r0.d = r9     // Catch: java.lang.Throwable -> L84
            return
        L84:
            r9 = move-exception
            r1.Y(r9)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u1d.B0(long, kotlin.jvm.functions.Function1):void");
    }

    @Override // defpackage.xz0
    public final j8b C() {
        return (j8b) this.f.a.F.b;
    }

    public final boolean D0(long j) {
        q3c q3cVar = this.f;
        m3c m3cVar = q3cVar.a;
        m3c m3cVar2 = q3cVar.a;
        try {
            if (m3cVar.Q) {
                a8b.a("measure is called on a deactivated node");
            }
            m3c m3cVarU = m3cVar2.u();
            m3cVar2.E = m3cVar2.E || (m3cVarU != null && m3cVarU.E);
            if (!m3cVar2.G.e) {
                yo5 yo5Var = this.n;
                if (yo5Var == null ? false : yo5.b(yo5Var.a, j)) {
                    v31 v31Var = m3cVar2.n;
                    if (v31Var != null) {
                        v31Var.f(m3cVar2, true);
                    }
                    m3cVar2.X();
                    return false;
                }
            }
            this.n = new yo5(j);
            g0(j);
            this.r.f = false;
            dfe dfeVarZ = m3cVar2.z();
            Object[] objArr = dfeVarZ.a;
            int i = dfeVarZ.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((m3c) objArr[i2]).G.q.r.c = false;
            }
            long j2 = this.m ? this.c : -9223372034707292160L;
            this.m = true;
            q1d q1dVarX0 = q3cVar.a().X0();
            if (q1dVarX0 == null) {
                a8b.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            q3cVar.c(j);
            f0((q1dVarX0.a << 32) | (q1dVarX0.b & 4294967295L));
            return (((int) (j2 >> 32)) == q1dVarX0.a && ((int) (j2 & 4294967295L)) == q1dVarX0.b) ? false : true;
        } catch (Throwable th) {
            m3cVar.Y(th);
            throw null;
        }
    }

    @Override // defpackage.pfd
    public final int E(int i) {
        x0();
        return this.f.a().X0().E(i);
    }

    @Override // defpackage.xz0
    public final int G() {
        return this.i;
    }

    @Override // defpackage.pfd
    public final int J(int i) {
        x0();
        return this.f.a().X0().J(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    @Override // defpackage.pfd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ifg N(long r7) {
        /*
            r6 = this;
            q3c r0 = r6.f
            m3c r1 = r0.a
            m3c r2 = r0.a
            m3c r1 = r1.u()
            r3 = 0
            if (r1 == 0) goto L12
            q3c r1 = r1.G
            i3c r1 = r1.d
            goto L13
        L12:
            r1 = r3
        L13:
            i3c r4 = defpackage.i3c.b
            if (r1 == r4) goto L27
            m3c r1 = r2.u()
            if (r1 == 0) goto L22
            q3c r1 = r1.G
            i3c r1 = r1.d
            goto L23
        L22:
            r1 = r3
        L23:
            i3c r4 = defpackage.i3c.d
            if (r1 != r4) goto L2a
        L27:
            r1 = 0
            r0.b = r1
        L2a:
            m3c r0 = r2.u()
            if (r0 == 0) goto L62
            q3c r0 = r0.G
            k3c r1 = r6.j
            k3c r4 = defpackage.k3c.c
            if (r1 == r4) goto L41
            boolean r1 = r2.E
            if (r1 != 0) goto L41
            java.lang.String r1 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            defpackage.a8b.b(r1)
        L41:
            i3c r1 = r0.d
            int r1 = r1.ordinal()
            if (r1 == 0) goto L5d
            r5 = 1
            if (r1 == r5) goto L5d
            r5 = 2
            if (r1 == r5) goto L5a
            r5 = 3
            if (r1 == r5) goto L5a
            i3c r6 = r0.d
            java.lang.String r7 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            j9h.u(r6, r7)
            return r3
        L5a:
            k3c r0 = defpackage.k3c.b
            goto L5f
        L5d:
            k3c r0 = defpackage.k3c.a
        L5f:
            r6.j = r0
            goto L66
        L62:
            k3c r4 = defpackage.k3c.c
            r6.j = r4
        L66:
            k3c r0 = r2.C
            if (r0 != r4) goto L6d
            r2.e()
        L6d:
            r6.D0(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u1d.N(long):ifg");
    }

    @Override // defpackage.xz0
    public final void V() {
        m3c.T(this.f.a, false, 7);
    }

    @Override // defpackage.ifg
    public final int W(sz0 sz0Var) {
        q3c q3cVar = this.f;
        m3c m3cVarU = q3cVar.a.u();
        i3c i3cVar = m3cVarU != null ? m3cVarU.G.d : null;
        i3c i3cVar2 = i3c.b;
        n3c n3cVar = this.r;
        if (i3cVar == i3cVar2) {
            n3cVar.c = true;
        } else {
            m3c m3cVarU2 = q3cVar.a.u();
            if ((m3cVarU2 != null ? m3cVarU2.G.d : null) == i3c.d) {
                n3cVar.d = true;
            }
        }
        this.k = true;
        int iW = q3cVar.a().X0().W(sz0Var);
        this.k = false;
        return iW;
    }

    @Override // defpackage.ifg
    public final int X() {
        return this.f.a().X0().X();
    }

    @Override // defpackage.ifg
    public final int Y() {
        return this.f.a().X0().Y();
    }

    @Override // defpackage.xz0
    public final n3c a() {
        return this.r;
    }

    @Override // defpackage.pfd
    public final int c(int i) {
        x0();
        return this.f.a().X0().c(i);
    }

    @Override // defpackage.xz0
    public final xz0 d() {
        q3c q3cVar;
        m3c m3cVarU = this.f.a.u();
        if (m3cVarU == null || (q3cVar = m3cVarU.G) == null) {
            return null;
        }
        return q3cVar.q;
    }

    @Override // defpackage.ifg
    public final void d0(long j, float f, Function1 function1) throws Throwable {
        B0(j, function1);
    }

    public final boolean i0() {
        q3c q3cVar = this.f;
        return ui6.M(q3cVar.a) || q3cVar.c;
    }

    @Override // defpackage.xz0
    public final void n(z3 z3Var) {
        dfe dfeVarZ = this.f.a.z();
        Object[] objArr = dfeVarZ.a;
        int i = dfeVarZ.c;
        for (int i2 = 0; i2 < i; i2++) {
            z3Var.invoke(((m3c) objArr[i2]).G.q);
        }
    }

    @Override // defpackage.ifg, defpackage.pfd
    public final Object p() {
        return this.x;
    }

    public final void q0(boolean z) {
        if (z) {
            if (i0()) {
                return;
            }
        } else if (!i0()) {
            return;
        }
        this.q = t1d.c;
        dfe dfeVarZ = this.f.a.z();
        Object[] objArr = dfeVarZ.a;
        int i = dfeVarZ.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((m3c) objArr[i2]).G.q.q0(true);
        }
    }

    @Override // defpackage.hae
    public final void r(boolean z) {
        q1d q1dVarX0;
        q3c q3cVar = this.f;
        q1d q1dVarX02 = q3cVar.a().X0();
        if (Boolean.valueOf(z).equals(q1dVarX02 != null ? Boolean.valueOf(q1dVarX02.l) : null) || (q1dVarX0 = q3cVar.a().X0()) == null) {
            return;
        }
        q1dVarX0.l = z;
    }

    public final void r0() {
        t1d t1dVar = this.q;
        q3c q3cVar = this.f;
        boolean z = q3cVar.c;
        m3c m3cVar = q3cVar.a;
        if (z) {
            this.q = t1d.b;
        } else {
            this.q = t1d.a;
        }
        if (t1dVar != t1d.a && q3cVar.e) {
            m3c.T(m3cVar, true, 6);
        }
        dfe dfeVarZ = m3cVar.z();
        Object[] objArr = dfeVarZ.a;
        int i = dfeVarZ.c;
        for (int i2 = 0; i2 < i; i2++) {
            m3c m3cVar2 = (m3c) objArr[i2];
            u1d u1dVar = m3cVar2.G.q;
            if (u1dVar == null) {
                qp2.o("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (u1dVar.i != Integer.MAX_VALUE) {
                u1dVar.r0();
                m3c.W(m3cVar2);
            }
        }
    }

    @Override // defpackage.xz0
    public final void requestLayout() {
        this.f.a.S(false);
    }

    @Override // defpackage.xz0
    public final void t() {
        this.u = true;
        n3c n3cVar = this.r;
        n3cVar.h();
        q3c q3cVar = this.f;
        boolean z = q3cVar.f;
        m3c m3cVar = q3cVar.a;
        if (z) {
            dfe dfeVarZ = m3cVar.z();
            Object[] objArr = dfeVarZ.a;
            int i = dfeVarZ.c;
            for (int i2 = 0; i2 < i; i2++) {
                m3c m3cVar2 = (m3c) objArr[i2];
                if (m3cVar2.G.e && m3cVar2.s() == k3c.a) {
                    u1d u1dVar = m3cVar2.G.q;
                    if (u1dVar.D0((u1dVar != null ? u1dVar.n : null).a)) {
                        m3c.T(m3cVar, false, 7);
                    }
                }
            }
        }
        i8b i8bVar = C().c0;
        if (q3cVar.g || (!this.k && !i8bVar.o && q3cVar.f)) {
            q3cVar.f = false;
            i3c i3cVar = q3cVar.d;
            q3cVar.d = i3c.d;
            q3cVar.i(false);
            p12 p12Var = p3c.a(m3cVar).K;
            ((tuj) p12Var.a).e(m3cVar, (w5f) p12Var.h, this.v);
            q3cVar.d = i3cVar;
            if (q3cVar.m && i8bVar.o) {
                requestLayout();
            }
            q3cVar.g = false;
        }
        if (n3cVar.d) {
            n3cVar.e = true;
        }
        if (n3cVar.b && n3cVar.e()) {
            n3cVar.g();
        }
        this.u = false;
    }

    public final void v0() {
        q3c q3cVar = this.f;
        if (q3cVar.o > 0) {
            dfe dfeVarZ = q3cVar.a.z();
            Object[] objArr = dfeVarZ.a;
            int i = dfeVarZ.c;
            for (int i2 = 0; i2 < i; i2++) {
                m3c m3cVar = (m3c) objArr[i2];
                q3c q3cVar2 = m3cVar.G;
                if ((q3cVar2.m || q3cVar2.n) && !q3cVar2.f) {
                    m3cVar.S(false);
                }
                u1d u1dVar = q3cVar2.q;
                if (u1dVar != null) {
                    u1dVar.v0();
                }
            }
        }
    }

    public final void x0() {
        q3c q3cVar = this.f;
        m3c.T(q3cVar.a, false, 7);
        m3c m3cVar = q3cVar.a;
        m3c m3cVarU = m3cVar.u();
        if (m3cVarU == null || m3cVar.C != k3c.c) {
            return;
        }
        int iOrdinal = m3cVarU.G.d.ordinal();
        m3cVar.C = iOrdinal != 0 ? iOrdinal != 2 ? m3cVarU.C : k3c.b : k3c.a;
    }

    @Override // defpackage.pfd
    public final int z(int i) {
        x0();
        return this.f.a().X0().z(i);
    }
}
