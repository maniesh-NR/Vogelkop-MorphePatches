package defpackage;

import androidx.core.app.NotificationCompat;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m3c implements eg5, ivf, bh5 {
    public static final w7i R = new w7i("Undefined intrinsics block and it is required", 1);
    public static final fza S = new fza((byte) 14);
    public static final h3c T = new h3c();
    public static final c9 U = new c9(21);
    public u5n A;
    public ji5 B;
    public k3c C;
    public k3c D;
    public boolean E;
    public final tah F;
    public final q3c G;
    public z3c H;
    public wye I;
    public boolean J;
    public c8e K;
    public c8e L;
    public cc1 M;
    public dc1 N;
    public boolean O;
    public int P;
    public boolean Q;
    public final boolean a;
    public int b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public int g;
    public m3c h;
    public int i;
    public final pad j;
    public dfe k;
    public boolean l;
    public m3c m;
    public v31 n;
    public c6n o;
    public int p;
    public boolean q;
    public boolean r;
    public f0j s;
    public boolean t;
    public final dfe u;
    public boolean v;
    public tfd w;
    public c37 x;
    public n27 y;
    public d2c z;

    public m3c(int i) {
        this((i & 1) == 0, h0j.a.addAndGet(1));
    }

    public m3c(boolean z, int i) {
        this.a = z;
        this.b = i;
        this.d = 9223372034707292159L;
        this.e = true;
        this.f = true;
        this.g = -4;
        this.j = new pad((Object) new dfe(new m3c[16]), (Object) new q4b(this, (byte) 9), (byte) 24);
        this.u = new dfe(new m3c[16]);
        this.v = true;
        this.w = R;
        this.y = p3c.a;
        this.z = d2c.a;
        this.A = T;
        ji5.Uo.getClass();
        this.B = ii5.b;
        k3c k3cVar = k3c.c;
        this.C = k3cVar;
        this.D = k3cVar;
        this.F = new tah(this);
        this.G = new q3c(this);
        this.J = true;
        this.K = z7e.b;
    }

    public static void T(m3c m3cVar, boolean z, int i) {
        m3c m3cVarU;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (m3cVar.h == null) {
            a8b.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        v31 v31Var = m3cVar.n;
        if (v31Var == null || m3cVar.q || m3cVar.a) {
            return;
        }
        v31Var.D(m3cVar, true, z, z2);
        if (z3) {
            q3c q3cVar = m3cVar.G.q.f;
            m3c m3cVarU2 = q3cVar.a.u();
            k3c k3cVar = q3cVar.a.C;
            if (m3cVarU2 == null || k3cVar == k3c.c) {
                return;
            }
            while (m3cVarU2.C == k3cVar && (m3cVarU = m3cVarU2.u()) != null) {
                m3cVarU2 = m3cVarU;
            }
            int iOrdinal = k3cVar.ordinal();
            if (iOrdinal == 0) {
                if (m3cVarU2.h != null) {
                    T(m3cVarU2, z, 6);
                    return;
                } else {
                    V(m3cVarU2, z, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                qp2.n("Intrinsics isn't used by the parent");
            } else if (m3cVarU2.h != null) {
                m3cVarU2.S(z);
            } else {
                m3cVarU2.U(z);
            }
        }
    }

    public static void V(m3c m3cVar, boolean z, int i) {
        v31 v31Var;
        m3c m3cVarU;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (m3cVar.q || m3cVar.a || (v31Var = m3cVar.n) == null) {
            return;
        }
        v31Var.D(m3cVar, false, z, z2);
        if (z3) {
            q3c q3cVar = m3cVar.G.p.f;
            m3c m3cVarU2 = q3cVar.a.u();
            k3c k3cVar = q3cVar.a.C;
            if (m3cVarU2 == null || k3cVar == k3c.c) {
                return;
            }
            while (m3cVarU2.C == k3cVar && (m3cVarU = m3cVarU2.u()) != null) {
                m3cVarU2 = m3cVarU;
            }
            int iOrdinal = k3cVar.ordinal();
            if (iOrdinal == 0) {
                V(m3cVarU2, z, 6);
            } else if (iOrdinal == 1) {
                m3cVarU2.U(z);
            } else {
                qp2.n("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void W(m3c m3cVar) {
        int i = l3c.a[m3cVar.G.d.ordinal()];
        q3c q3cVar = m3cVar.G;
        if (i != 1) {
            j9h.u(q3cVar.d, "Unexpected state ");
            return;
        }
        if (q3cVar.e) {
            T(m3cVar, true, 6);
            return;
        }
        if (q3cVar.f) {
            m3cVar.S(true);
        }
        if (m3cVar.q()) {
            V(m3cVar, true, 6);
        } else if (m3cVar.p()) {
            m3cVar.U(true);
        }
    }

    private final String j(m3c m3cVar) {
        String strG = g(0);
        m3c m3cVar2 = m3cVar.m;
        return "Cannot insert " + m3cVar + " because it already has a parent or an owner. This tree: " + strG + " Other tree: " + (m3cVar2 != null ? m3cVar2.g(0) : null);
    }

    public final void A(long j, oea oeaVar, int i, boolean z) {
        tah tahVar = this.F;
        wye wyeVar = (wye) tahVar.e;
        zbe zbeVar = wye.U;
        ((wye) tahVar.e).f1(wye.Z, wyeVar.W0(j), oeaVar, i, z);
    }

    public final void B(int i, m3c m3cVar) throws pxb {
        if (m3cVar.m != null && m3cVar.n != null) {
            a8b.b(j(m3cVar));
        }
        m3cVar.m = this;
        pad padVar = this.j;
        ((dfe) padVar.b).b(i, m3cVar);
        ((q4b) padVar.c).invoke();
        O();
        if (m3cVar.a) {
            this.i++;
        }
        G();
        v31 v31Var = this.n;
        if (v31Var != null) {
            m3cVar.d(v31Var);
        }
        if (m3cVar.G.l > 0) {
            q3c q3cVar = this.G;
            q3cVar.d(q3cVar.l + 1);
        }
        if (m3cVar.P > 0) {
            b0(this.P + 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    public final void C() throws pxb {
        if (this.J) {
            tah tahVar = this.F;
            wye wyeVar = (j8b) tahVar.b;
            wye wyeVar2 = ((wye) tahVar.e).w;
            this.I = null;
            while (true) {
                if (Intrinsics.a(wyeVar, wyeVar2)) {
                    break;
                }
                if ((wyeVar != null ? wyeVar.T : null) != null) {
                    this.I = wyeVar;
                    break;
                }
                wyeVar = wyeVar != null ? wyeVar.w : null;
            }
            this.J = false;
        }
        wye wyeVar3 = this.I;
        if (wyeVar3 != null) {
            if (wyeVar3.T == null) {
                throw vep.q("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
            }
            wyeVar3.h1();
            return;
        }
        m3c m3cVarU = u();
        if (m3cVarU != null) {
            m3cVarU.C();
            return;
        }
        v31 v31Var = this.n;
        if (v31Var != null) {
            v31Var.invalidate();
        }
    }

    public final void D() {
        tah tahVar = this.F;
        wye wyeVar = (wye) tahVar.e;
        j8b j8bVar = (j8b) tahVar.b;
        while (wyeVar != j8bVar) {
            g3c g3cVar = (g3c) wyeVar;
            evf evfVar = g3cVar.T;
            if (evfVar != null) {
                ((s3a) evfVar).c();
            }
            wyeVar = g3cVar.v;
        }
        evf evfVar2 = j8bVar.T;
        if (evfVar2 != null) {
            ((s3a) evfVar2).c();
        }
    }

    public final void E() {
        if (this.a) {
            m3c m3cVarU = u();
            if (m3cVarU != null) {
                m3cVarU.E();
                return;
            }
            return;
        }
        if (this.h != null) {
            T(this, false, 7);
        } else {
            V(this, false, 7);
        }
    }

    public final void F() {
        if (this.t) {
            return;
        }
        if (((sye) this.F.d).f != null || this.L != null) {
            this.r = true;
            return;
        }
        f0j f0jVar = this.s;
        this.t = true;
        pqh pqhVar = new pqh();
        pqhVar.a = new f0j();
        p12 p12Var = p3c.a(this).K;
        Function0 gv8Var = new gv8(this, pqhVar, (byte) 14);
        ((tuj) p12Var.a).e(this, (w5f) p12Var.d, gv8Var);
        this.t = false;
        this.s = (f0j) pqhVar.a;
        this.r = false;
        v31 v31VarA = p3c.a(this);
        v31VarA.u.F(this, f0jVar);
        v31VarA.G();
    }

    public final void G() {
        m3c m3cVar;
        if (this.i > 0) {
            this.l = true;
        }
        if (!this.a || (m3cVar = this.m) == null) {
            return;
        }
        m3cVar.G();
    }

    public final boolean H() {
        return this.n != null;
    }

    public final boolean I() {
        return this.G.p.s;
    }

    public final Boolean J() {
        u1d u1dVar = this.G.q;
        if (u1dVar != null) {
            return Boolean.valueOf(u1dVar.q != t1d.c);
        }
        return null;
    }

    public final void K() {
        m3c m3cVarU;
        if (this.C == k3c.c) {
            f();
        }
        u1d u1dVar = this.G.q;
        u1dVar.getClass();
        try {
            u1dVar.g = true;
            if (!u1dVar.l) {
                a8b.b("replace() called on item that was not placed");
            }
            u1dVar.B = false;
            boolean z = u1dVar.q != t1d.c;
            u1dVar.B0(u1dVar.o, u1dVar.p);
            if (z && !u1dVar.B && (m3cVarU = u1dVar.f.a.u()) != null) {
                m3cVarU.S(false);
            }
        } finally {
            u1dVar.g = false;
        }
    }

    public final void L(int i, int i2, int i3) {
        int i4;
        int i5;
        if (i == i2) {
            return;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            if (i > i2) {
                i5 = i + i6;
                i4 = i2 + i6;
            } else {
                i4 = (i2 + i3) - 2;
                i5 = i;
            }
            pad padVar = this.j;
            dfe dfeVar = (dfe) padVar.b;
            q4b q4bVar = (q4b) padVar.c;
            Object objL = dfeVar.l(i5);
            q4bVar.invoke();
            ((dfe) padVar.b).b(i4, (m3c) objL);
            q4bVar.invoke();
        }
        O();
        G();
        E();
    }

    public final void M(m3c m3cVar) throws pxb {
        if (m3cVar.G.l > 0) {
            this.G.d(r0.l - 1);
        }
        if (this.n != null) {
            m3cVar.h();
        }
        m3cVar.m = null;
        if (m3cVar.P > 0) {
            b0(this.P - 1);
        }
        ((wye) m3cVar.F.e).w = null;
        if (m3cVar.a) {
            this.i--;
            dfe dfeVar = (dfe) m3cVar.j.b;
            Object[] objArr = dfeVar.a;
            int i = dfeVar.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((wye) ((m3c) objArr[i2]).F.e).w = null;
            }
        }
        G();
        O();
    }

    public final void N(wye wyeVar) {
        v31 v31Var = this.n;
        yoh yohVar = v31Var != null ? v31Var.t : null;
        q3c q3cVar = this.G;
        boolean z = q3cVar.d != i3c.e || q() || p();
        if (this.g != -4 && yohVar != null) {
            if (wyeVar == ((wye) this.F.e)) {
                this.f = true;
                if (!z) {
                    yohVar.g(this);
                }
            } else {
                this.e = true;
                dfe dfeVarZ = z();
                Object[] objArr = dfeVarZ.a;
                int i = dfeVarZ.c;
                for (int i2 = 0; i2 < i; i2++) {
                    m3c m3cVar = (m3c) objArr[i2];
                    m3cVar.f = true;
                    if (!z) {
                        yohVar.g(m3cVar);
                    }
                }
                if (this.g != -4) {
                    yohVar.f = true;
                    int iD = yohVar.d(this);
                    long[] jArr = (long[]) yohVar.c.c;
                    int i3 = iD + 2;
                    long j = jArr[i3];
                    jArr[i3] = j | (((j >> 63) & 1) << 60);
                }
                yohVar.j();
            }
        }
        q3cVar.p.D0();
    }

    public final void O() {
        if (!this.a) {
            this.v = true;
            return;
        }
        m3c m3cVarU = u();
        if (m3cVarU != null) {
            m3cVarU.O();
        }
    }

    public final void P() throws pxb {
        pad padVar = this.j;
        int i = ((dfe) padVar.b).c;
        while (true) {
            i--;
            dfe dfeVar = (dfe) padVar.b;
            if (-1 >= i) {
                dfeVar.h();
                ((q4b) padVar.c).invoke();
                return;
            }
            M((m3c) dfeVar.a[i]);
        }
    }

    public final void Q(int i, int i2) throws pxb {
        if (i2 < 0) {
            a8b.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            pad padVar = this.j;
            M((m3c) ((dfe) padVar.b).a[i3]);
            Object objL = ((dfe) padVar.b).l(i3);
            ((q4b) padVar.c).invoke();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void R() {
        m3c m3cVarU;
        if (this.C == k3c.c) {
            f();
        }
        sfd sfdVar = this.G.p;
        q3c q3cVar = sfdVar.f;
        try {
            sfdVar.g = true;
            if (!sfdVar.k) {
                a8b.b("replace called on unplaced item");
            }
            boolean z = sfdVar.s;
            sfdVar.A0(sfdVar.n, sfdVar.p, sfdVar.o);
            if (z && !sfdVar.F && (m3cVarU = q3cVar.a.u()) != null) {
                m3cVarU.U(false);
            }
        } finally {
        }
    }

    public final void S(boolean z) {
        v31 v31Var;
        if (this.a || (v31Var = this.n) == null) {
            return;
        }
        v31Var.F(this, true, z);
    }

    public final void U(boolean z) {
        v31 v31Var;
        if (this.a || (v31Var = this.n) == null) {
            return;
        }
        v31Var.F(this, false, z);
    }

    public final void X() {
        dfe dfeVarZ = z();
        Object[] objArr = dfeVarZ.a;
        int i = dfeVarZ.c;
        for (int i2 = 0; i2 < i; i2++) {
            m3c m3cVar = (m3c) objArr[i2];
            k3c k3cVar = m3cVar.D;
            m3cVar.C = k3cVar;
            if (k3cVar != k3c.c) {
                m3cVar.X();
            }
        }
    }

    public final void Y(Throwable th) throws Throwable {
        ji5 ji5Var = this.B;
        hp7 hp7Var = ei5.a;
        oag oagVar = (oag) ji5Var;
        oagVar.getClass();
        ci5 ci5Var = (ci5) alo.d0(oagVar, hp7Var);
        if (ci5Var == null) {
            throw th;
        }
        phj.A0(th, new gb3((di5) ci5Var, this, (byte) 17));
        throw th;
    }

    public final boolean Z() {
        return H();
    }

    public final void a() {
        p21 p21Var;
        c6n c6nVar = this.o;
        if (c6nVar != null) {
            c6nVar.a();
        }
        z3c z3cVar = this.H;
        if (z3cVar != null) {
            z3cVar.i(true);
        }
        this.Q = true;
        b8e b8eVar = (lbl) this.F.f;
        for (b8e b8eVar2 = b8eVar; b8eVar2 != null; b8eVar2 = b8eVar2.e) {
            if (b8eVar2.n) {
                b8eVar2.O0();
            }
        }
        for (b8e b8eVar3 = b8eVar; b8eVar3 != null; b8eVar3 = b8eVar3.e) {
            if (b8eVar3.n) {
                b8eVar3.Q0();
            }
        }
        while (b8eVar != null) {
            if (b8eVar.n) {
                b8eVar.K0();
            }
            b8eVar = b8eVar.e;
        }
        if (H()) {
            this.s = null;
            this.r = false;
        }
        v31 v31Var = this.n;
        if (v31Var == null || (p21Var = v31Var.I) == null || !p21Var.h.f(this.b)) {
            return;
        }
        p21Var.a.L(p21Var.c, this.b, false);
    }

    public final void a0(n27 n27Var) throws pxb {
        if (Intrinsics.a(this.y, n27Var)) {
            return;
        }
        this.y = n27Var;
        E();
        m3c m3cVarU = u();
        if (m3cVarU != null) {
            m3cVarU.C();
        } else {
            v31 v31Var = this.n;
            if (v31Var != null) {
                v31Var.invalidate();
            }
        }
        D();
        for (b8e b8eVar = (b8e) this.F.g; b8eVar != null; b8eVar = b8eVar.f) {
            b8eVar.d();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0120, code lost:
    
        r20 = r5;
        r21 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [b8e, sye] */
    /* JADX WARN: Type inference failed for: r2v6, types: [b8e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.c8e r24) throws pxb {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m3c.b(c8e):void");
    }

    public final void b0(int i) {
        m3c m3cVarU;
        m3c m3cVarU2;
        int i2 = this.P;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (m3cVarU2 = u()) != null) {
                m3cVarU2.b0(m3cVarU2.P + 1);
            }
            if (i == 0 && this.P > 0 && (m3cVarU = u()) != null) {
                m3cVarU.b0(m3cVarU.P - 1);
            }
            this.P = i;
        }
    }

    public final void c() throws pxb {
        c6n c6nVar = this.o;
        if (c6nVar != null) {
            c6nVar.c();
        }
        z3c z3cVar = this.H;
        if (z3cVar != null) {
            z3cVar.c();
        }
        tah tahVar = this.F;
        wye wyeVar = ((j8b) tahVar.b).v;
        for (wye wyeVar2 = (wye) tahVar.e; !Intrinsics.a(wyeVar2, wyeVar) && wyeVar2 != null; wyeVar2 = wyeVar2.v) {
            wyeVar2.m1();
        }
    }

    public final void c0(m3c m3cVar) {
        if (Intrinsics.a(m3cVar, this.h)) {
            return;
        }
        this.h = m3cVar;
        q3c q3cVar = this.G;
        if (m3cVar != null) {
            if (q3cVar.q == null) {
                q3cVar.q = new u1d(q3cVar);
            }
            tah tahVar = this.F;
            wye wyeVar = ((j8b) tahVar.b).v;
            for (wye wyeVar2 = (wye) tahVar.e; !Intrinsics.a(wyeVar2, wyeVar) && wyeVar2 != null; wyeVar2 = wyeVar2.v) {
                wyeVar2.U0();
            }
        } else {
            q3cVar.q = null;
            q3cVar.f = false;
            q3cVar.e = false;
        }
        E();
    }

    public final void d(v31 v31Var) throws pxb {
        m3c m3cVar;
        f0j f0jVarW;
        if (this.n != null) {
            a8b.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        m3c m3cVar2 = this.m;
        if (m3cVar2 != null && !Intrinsics.a(m3cVar2.n, v31Var)) {
            m3c m3cVarU = u();
            v31 v31Var2 = m3cVarU != null ? m3cVarU.n : null;
            String strG = g(0);
            m3c m3cVar3 = this.m;
            a8b.b("Attaching to a different owner(" + v31Var + ") than the parent's owner(" + v31Var2 + "). This tree: " + strG + " Parent tree: " + (m3cVar3 != null ? m3cVar3.g(0) : null));
        }
        m3c m3cVarU2 = u();
        q3c q3cVar = this.G;
        if (m3cVarU2 == null) {
            q3cVar.p.s = true;
            v31Var.t.g(this);
            u1d u1dVar = q3cVar.q;
            if (u1dVar != null) {
                u1dVar.q = t1d.a;
            }
        }
        tah tahVar = this.F;
        ((wye) tahVar.e).w = m3cVarU2 != null ? (j8b) m3cVarU2.F.b : null;
        this.n = v31Var;
        this.p = (m3cVarU2 != null ? m3cVarU2.p : -1) + 1;
        c8e c8eVar = this.L;
        if (c8eVar != null) {
            b(c8eVar);
        }
        this.L = null;
        v31Var.s.i(this.b, this);
        m3c m3cVar4 = this.m;
        if (m3cVar4 == null || (m3cVar = m3cVar4.h) == null) {
            m3cVar = this.h;
        }
        c0(m3cVar);
        if (this.h == null && tahVar.w(NotificationCompat.FLAG_GROUP_SUMMARY)) {
            c0(this);
        }
        if (!this.Q) {
            for (b8e b8eVar = (b8e) tahVar.g; b8eVar != null; b8eVar = b8eVar.f) {
                b8eVar.J0();
            }
        }
        dfe dfeVar = (dfe) this.j.b;
        Object[] objArr = dfeVar.a;
        int i = dfeVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((m3c) objArr[i2]).d(v31Var);
        }
        if (!this.Q) {
            tahVar.K();
        }
        E();
        if (m3cVarU2 != null) {
            m3cVarU2.E();
        }
        cc1 cc1Var = this.M;
        if (cc1Var != null) {
            cc1Var.invoke(v31Var);
        }
        q3cVar.j();
        if (!this.Q && tahVar.w(8)) {
            F();
        }
        p21 p21Var = v31Var.I;
        if (p21Var == null || (f0jVarW = w()) == null || !f0jVarW.a.b(n0j.r)) {
            return;
        }
        p21Var.h.a(this.b);
        p21Var.a.L(p21Var.c, this.b, true);
    }

    public final void d0(tfd tfdVar) {
        if (Intrinsics.a(this.w, tfdVar)) {
            return;
        }
        this.w = tfdVar;
        c37 c37Var = this.x;
        if (c37Var != null) {
            ((t0g) c37Var.b).setValue(tfdVar);
        }
        E();
    }

    public final void e() {
        this.D = this.C;
        this.C = k3c.c;
        dfe dfeVarZ = z();
        Object[] objArr = dfeVarZ.a;
        int i = dfeVarZ.c;
        for (int i2 = 0; i2 < i; i2++) {
            m3c m3cVar = (m3c) objArr[i2];
            if (m3cVar.C != k3c.c) {
                m3cVar.e();
            }
        }
    }

    public final void e0(c8e c8eVar) throws pxb {
        if (this.a && this.K != z7e.b) {
            a8b.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.Q) {
            a8b.a("modifier is updated when deactivated");
        }
        if (!H()) {
            this.L = c8eVar;
            return;
        }
        b(c8eVar);
        if (this.r) {
            F();
        }
    }

    public final void f() {
        this.D = this.C;
        this.C = k3c.c;
        dfe dfeVarZ = z();
        Object[] objArr = dfeVarZ.a;
        int i = dfeVarZ.c;
        for (int i2 = 0; i2 < i; i2++) {
            m3c m3cVar = (m3c) objArr[i2];
            if (m3cVar.C == k3c.b) {
                m3cVar.f();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [b8e] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [b8e] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [dfe] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [dfe] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void f0(u5n u5nVar) {
        if (Intrinsics.a(this.A, u5nVar)) {
            return;
        }
        this.A = u5nVar;
        b8e b8eVar = (b8e) this.F.g;
        if ((b8eVar.d & 16) != 0) {
            while (b8eVar != null) {
                if ((b8eVar.c & 16) != 0) {
                    i17 i17VarU = b8eVar;
                    ?? dfeVar = 0;
                    while (i17VarU != 0) {
                        if (i17VarU instanceof omg) {
                            ((omg) i17VarU).A0();
                        } else if ((i17VarU.c & 16) != 0 && (i17VarU instanceof i17)) {
                            b8e b8eVar2 = i17VarU.p;
                            int i = 0;
                            i17VarU = i17VarU;
                            dfeVar = dfeVar;
                            while (b8eVar2 != null) {
                                if ((b8eVar2.c & 16) != 0) {
                                    i++;
                                    dfeVar = dfeVar;
                                    if (i == 1) {
                                        i17VarU = b8eVar2;
                                    } else {
                                        if (dfeVar == 0) {
                                            dfeVar = new dfe(new b8e[16]);
                                        }
                                        if (i17VarU != 0) {
                                            dfeVar.c(i17VarU);
                                            i17VarU = 0;
                                        }
                                        dfeVar.c(b8eVar2);
                                    }
                                }
                                b8eVar2 = b8eVar2.f;
                                i17VarU = i17VarU;
                                dfeVar = dfeVar;
                            }
                            if (i != 1) {
                            }
                        }
                        i17VarU = ui6.U(dfeVar);
                    }
                }
                if ((b8eVar.d & 16) == 0) {
                    return;
                } else {
                    b8eVar = b8eVar.f;
                }
            }
        }
    }

    public final String g(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        dfe dfeVarZ = z();
        Object[] objArr = dfeVarZ.a;
        int i3 = dfeVarZ.c;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((m3c) objArr[i4]).g(i + 1));
        }
        String string = sb.toString();
        return i == 0 ? p3p.h(1, 0, string) : string;
    }

    public final void g0() {
        if (this.i <= 0 || !this.l) {
            return;
        }
        this.l = false;
        dfe dfeVar = this.k;
        if (dfeVar == null) {
            dfeVar = new dfe(new m3c[16]);
            this.k = dfeVar;
        }
        dfeVar.h();
        dfe dfeVar2 = (dfe) this.j.b;
        Object[] objArr = dfeVar2.a;
        int i = dfeVar2.c;
        for (int i2 = 0; i2 < i; i2++) {
            m3c m3cVar = (m3c) objArr[i2];
            if (m3cVar.a) {
                dfeVar.d(dfeVar.c, m3cVar.z());
            } else {
                dfeVar.c(m3cVar);
            }
        }
        q3c q3cVar = this.G;
        q3cVar.p.z = true;
        u1d u1dVar = q3cVar.q;
        if (u1dVar != null) {
            u1dVar.t = true;
        }
    }

    public final void h() throws pxb {
        n3c n3cVar;
        v31 v31Var = this.n;
        if (v31Var == null) {
            m3c m3cVarU = u();
            a8b.c("Cannot detach node that is already detached!  Tree: " + (m3cVarU != null ? m3cVarU.g(0) : null));
            t3p.v();
            return;
        }
        m3c m3cVarU2 = u();
        q3c q3cVar = this.G;
        if (m3cVarU2 != null) {
            m3cVarU2.C();
            m3cVarU2.E();
            sfd sfdVar = q3cVar.p;
            k3c k3cVar = k3c.c;
            sfdVar.l = k3cVar;
            u1d u1dVar = q3cVar.q;
            if (u1dVar != null) {
                u1dVar.j = k3cVar;
            }
        }
        n3c n3cVar2 = q3cVar.p.x;
        n3cVar2.b = true;
        n3cVar2.c = false;
        n3cVar2.e = false;
        n3cVar2.d = false;
        n3cVar2.f = false;
        n3cVar2.g = false;
        n3cVar2.h = null;
        u1d u1dVar2 = q3cVar.q;
        if (u1dVar2 != null && (n3cVar = u1dVar2.r) != null) {
            n3cVar.b = true;
            n3cVar.c = false;
            n3cVar.e = false;
            n3cVar.d = false;
            n3cVar.f = false;
            n3cVar.g = false;
            n3cVar.h = null;
        }
        tah tahVar = this.F;
        b8e b8eVar = (lbl) tahVar.f;
        wye wyeVar = ((j8b) tahVar.b).v;
        for (wye wyeVar2 = (wye) tahVar.e; !Intrinsics.a(wyeVar2, wyeVar) && wyeVar2 != null; wyeVar2 = wyeVar2.v) {
            wyeVar2.s1();
            if (wyeVar2.u.I()) {
                wyeVar2.n1();
            }
        }
        dc1 dc1Var = this.N;
        if (dc1Var != null) {
            dc1Var.invoke(v31Var);
        }
        for (b8e b8eVar2 = b8eVar; b8eVar2 != null; b8eVar2 = b8eVar2.e) {
            if (b8eVar2.n) {
                b8eVar2.Q0();
            }
        }
        this.q = true;
        dfe dfeVar = (dfe) this.j.b;
        Object[] objArr = dfeVar.a;
        int i = dfeVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((m3c) objArr[i2]).h();
        }
        this.q = false;
        while (b8eVar != null) {
            if (b8eVar.n) {
                b8eVar.K0();
            }
            b8eVar = b8eVar.e;
        }
        v31Var.s.g(this.b);
        d37 d37Var = v31Var.P;
        d5o d5oVar = (d5o) d37Var.d;
        ((qq6) d5oVar.a).j(this);
        ((qq6) d5oVar.b).j(this);
        ((qq6) d5oVar.c).j(this);
        ((dfe) ((s6h) d37Var.e).a).k(this);
        v31Var.J = true;
        p21 p21Var = v31Var.I;
        if (p21Var != null && p21Var.h.f(this.b)) {
            p21Var.a.L(p21Var.c, this.b, false);
        }
        v31Var.t.h(this);
        this.n = null;
        c0(null);
        this.p = 0;
        sfd sfdVar2 = q3cVar.p;
        sfdVar2.i = Integer.MAX_VALUE;
        sfdVar2.h = Integer.MAX_VALUE;
        sfdVar2.s = false;
        u1d u1dVar3 = q3cVar.q;
        if (u1dVar3 != null) {
            u1dVar3.i = Integer.MAX_VALUE;
            u1dVar3.h = Integer.MAX_VALUE;
            u1dVar3.q = t1d.c;
        }
        if (tahVar.w(8)) {
            f0j f0jVar = this.s;
            this.s = null;
            this.r = false;
            v31Var.u.F(this, f0jVar);
            v31Var.G();
        }
    }

    public final void i(sh4 sh4Var, q3a q3aVar) {
        try {
            ((wye) this.F.e).S0(sh4Var, q3aVar);
        } catch (Throwable th) {
            Y(th);
            throw null;
        }
    }

    public final void k() {
        if (this.h != null) {
            T(this, false, 5);
        } else {
            V(this, false, 5);
        }
        sfd sfdVar = this.G.p;
        yo5 yo5Var = sfdVar.j ? new yo5(sfdVar.d) : null;
        v31 v31Var = this.n;
        if (yo5Var != null) {
            if (v31Var != null) {
                v31Var.z(this, yo5Var.a);
            }
        } else if (v31Var != null) {
            v31Var.y(true);
        }
    }

    public final List l() {
        u1d u1dVar = this.G.q;
        dfe dfeVar = u1dVar.s;
        q3c q3cVar = u1dVar.f;
        q3cVar.a.n();
        if (!u1dVar.t) {
            return dfeVar.g();
        }
        m3c m3cVar = q3cVar.a;
        dfe dfeVarZ = m3cVar.z();
        Object[] objArr = dfeVarZ.a;
        int i = dfeVarZ.c;
        for (int i2 = 0; i2 < i; i2++) {
            m3c m3cVar2 = (m3c) objArr[i2];
            int i3 = dfeVar.c;
            u1d u1dVar2 = m3cVar2.G.q;
            if (i3 <= i2) {
                dfeVar.c(u1dVar2);
            } else {
                Object[] objArr2 = dfeVar.a;
                Object obj = objArr2[i2];
                objArr2[i2] = u1dVar2;
            }
        }
        dfeVar.m(((dfe) ((bee) m3cVar.n()).b).c, dfeVar.c);
        u1dVar.t = false;
        return dfeVar.g();
    }

    public final List m() {
        return this.G.p.i0();
    }

    public final List n() {
        return z().g();
    }

    public final List o() {
        return ((dfe) this.j.b).g();
    }

    public final boolean p() {
        return this.G.p.v;
    }

    public final boolean q() {
        return this.G.p.u;
    }

    public final k3c r() {
        return this.G.p.l;
    }

    public final k3c s() {
        k3c k3cVar;
        u1d u1dVar = this.G.q;
        return (u1dVar == null || (k3cVar = u1dVar.j) == null) ? k3c.c : k3cVar;
    }

    public final c37 t() {
        c37 c37Var = this.x;
        if (c37Var != null) {
            return c37Var;
        }
        tfd tfdVar = this.w;
        c37 c37Var2 = new c37();
        c37Var2.a = this;
        c37Var2.b = hyg.k(tfdVar);
        this.x = c37Var2;
        return c37Var2;
    }

    public final String toString() {
        return x1p.T(this) + " children: " + ((dfe) ((bee) n()).b).c + " measurePolicy: " + this.w + " deactivated: " + this.Q + " isVirtual: " + this.a + " isPlaced: " + I();
    }

    public final m3c u() {
        m3c m3cVar = this.m;
        while (m3cVar != null && m3cVar.a) {
            m3cVar = m3cVar.m;
        }
        return m3cVar;
    }

    public final int v() {
        return this.G.p.i;
    }

    public final f0j w() {
        if (H() && !this.Q && this.F.w(8)) {
            return this.s;
        }
        return null;
    }

    public final float x() {
        return this.G.p.E;
    }

    public final dfe y() {
        boolean z = this.v;
        dfe dfeVar = this.u;
        if (z) {
            dfeVar.h();
            dfeVar.d(dfeVar.c, z());
            Arrays.sort(dfeVar.a, 0, dfeVar.c, U);
            this.v = false;
        }
        return dfeVar;
    }

    public final dfe z() {
        g0();
        return this.i == 0 ? (dfe) this.j.b : this.k;
    }
}
