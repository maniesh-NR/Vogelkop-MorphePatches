package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class sfd extends ifg implements pfd, xz0, hae {
    public boolean A;
    public final rfd C;
    public final rfd D;
    public float E;
    public boolean F;
    public Function1 G;
    public float I;
    public final rfd J;
    public boolean K;
    public final q3c f;
    public boolean g;
    public boolean j;
    public boolean k;
    public boolean m;
    public Function1 o;
    public float p;
    public Object r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int h = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public k3c l = k3c.c;
    public long n = 0;
    public boolean q = true;
    public final n3c x = new n3c(this, (byte) 0);
    public final dfe y = new dfe(new sfd[16]);
    public boolean z = true;
    public long B = ap5.b(0, 0, 0, 0, 15);
    public long H = 0;

    /* JADX WARN: Type inference failed for: r2v3, types: [rfd] */
    /* JADX WARN: Type inference failed for: r2v4, types: [rfd] */
    /* JADX WARN: Type inference failed for: r7v4, types: [rfd] */
    public sfd(q3c q3cVar) {
        this.f = q3cVar;
        final byte b = 1;
        final byte b2 = 0;
        this.C = new Function0(this) { // from class: rfd
            public final /* synthetic */ sfd b;

            {
                this.b = this;
            }

            public final Object invoke() throws pxb {
                p1d p1dVar;
                byte b3 = b2;
                sfd sfdVar = this.b;
                switch (b3) {
                    case 0:
                        sfdVar.f.a().N(sfdVar.B);
                        break;
                    case 1:
                        q3c q3cVar2 = sfdVar.f;
                        q3cVar2.i = 0;
                        m3c m3cVar = q3cVar2.a;
                        dfe dfeVarZ = m3cVar.z();
                        Object[] objArr = dfeVarZ.a;
                        int i = dfeVarZ.c;
                        for (int i2 = 0; i2 < i; i2++) {
                            sfd sfdVar2 = ((m3c) objArr[i2]).G.p;
                            sfdVar2.h = sfdVar2.i;
                            sfdVar2.i = Integer.MAX_VALUE;
                            sfdVar2.t = false;
                            if (sfdVar2.l == k3c.b) {
                                sfdVar2.l = k3c.c;
                            }
                        }
                        dfe dfeVarZ2 = m3cVar.z();
                        Object[] objArr2 = dfeVarZ2.a;
                        int i3 = dfeVarZ2.c;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((m3c) objArr2[i4]).G.p.x.d = false;
                        }
                        pqh pqhVar = new pqh();
                        List listN = m3cVar.n();
                        int size = listN.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            m3c m3cVar2 = (m3c) ((bee) listN).get(i5);
                            if (((wye) m3cVar2.F.e).o) {
                                dee deeVar = (dee) pqhVar.a;
                                if (deeVar == null) {
                                    deeVar = new dee();
                                    pqhVar.a = deeVar;
                                }
                                pqhVar.a = deeVar;
                                deeVar.a(m3cVar2);
                            }
                            ((wye) m3cVar2.F.e).o = sfdVar.C().o;
                        }
                        sfdVar.C().G0().b();
                        List listN2 = m3cVar.n();
                        int size2 = listN2.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            m3c m3cVar3 = (m3c) ((bee) listN2).get(i6);
                            dee deeVar2 = (dee) pqhVar.a;
                            ((wye) m3cVar3.F.e).o = deeVar2 != null && deeVar2.e(m3cVar3);
                        }
                        dfe dfeVarZ3 = m3cVar.z();
                        Object[] objArr3 = dfeVarZ3.a;
                        int i7 = dfeVarZ3.c;
                        for (int i8 = 0; i8 < i7; i8++) {
                            m3c m3cVar4 = (m3c) objArr3[i8];
                            q3c q3cVar3 = m3cVar4.G;
                            if (q3cVar3.p.h != m3cVar4.v()) {
                                m3cVar.O();
                                m3cVar.C();
                                if (m3cVar4.v() == Integer.MAX_VALUE) {
                                    if (q3cVar3.c || ui6.M(m3cVar4)) {
                                        q3cVar3.q.q0(false);
                                    }
                                    q3cVar3.p.r0();
                                }
                            }
                        }
                        dfe dfeVarZ4 = m3cVar.z();
                        Object[] objArr4 = dfeVarZ4.a;
                        int i9 = dfeVarZ4.c;
                        for (int i10 = 0; i10 < i9; i10++) {
                            n3c n3cVar = ((m3c) objArr4[i10]).G.p.x;
                            n3cVar.e = n3cVar.d;
                        }
                        break;
                    default:
                        q3c q3cVar4 = sfdVar.f;
                        wye wyeVar = q3cVar4.a().w;
                        if (wyeVar != null) {
                            p1dVar = wyeVar.p;
                        } else {
                            v31 v31VarA = p3c.a(q3cVar4.a);
                            m3g m3gVar = jfg.a;
                            p1dVar = new p1d(v31VarA, (byte) 1);
                        }
                        Function1 function1 = sfdVar.G;
                        if (function1 == null) {
                            wye wyeVarA = q3cVar4.a();
                            long j = sfdVar.H;
                            float f = sfdVar.I;
                            p1dVar.d(wyeVarA);
                            wyeVarA.d0(ybb.c(j, wyeVarA.e), f, null);
                        } else {
                            wye wyeVarA2 = q3cVar4.a();
                            long j2 = sfdVar.H;
                            float f2 = sfdVar.I;
                            p1dVar.d(wyeVarA2);
                            wyeVarA2.d0(ybb.c(j2, wyeVarA2.e), f2, function1);
                        }
                        break;
                }
                return Unit.a;
            }
        };
        this.D = new Function0(this) { // from class: rfd
            public final /* synthetic */ sfd b;

            {
                this.b = this;
            }

            public final Object invoke() throws pxb {
                p1d p1dVar;
                byte b3 = b;
                sfd sfdVar = this.b;
                switch (b3) {
                    case 0:
                        sfdVar.f.a().N(sfdVar.B);
                        break;
                    case 1:
                        q3c q3cVar2 = sfdVar.f;
                        q3cVar2.i = 0;
                        m3c m3cVar = q3cVar2.a;
                        dfe dfeVarZ = m3cVar.z();
                        Object[] objArr = dfeVarZ.a;
                        int i = dfeVarZ.c;
                        for (int i2 = 0; i2 < i; i2++) {
                            sfd sfdVar2 = ((m3c) objArr[i2]).G.p;
                            sfdVar2.h = sfdVar2.i;
                            sfdVar2.i = Integer.MAX_VALUE;
                            sfdVar2.t = false;
                            if (sfdVar2.l == k3c.b) {
                                sfdVar2.l = k3c.c;
                            }
                        }
                        dfe dfeVarZ2 = m3cVar.z();
                        Object[] objArr2 = dfeVarZ2.a;
                        int i3 = dfeVarZ2.c;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((m3c) objArr2[i4]).G.p.x.d = false;
                        }
                        pqh pqhVar = new pqh();
                        List listN = m3cVar.n();
                        int size = listN.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            m3c m3cVar2 = (m3c) ((bee) listN).get(i5);
                            if (((wye) m3cVar2.F.e).o) {
                                dee deeVar = (dee) pqhVar.a;
                                if (deeVar == null) {
                                    deeVar = new dee();
                                    pqhVar.a = deeVar;
                                }
                                pqhVar.a = deeVar;
                                deeVar.a(m3cVar2);
                            }
                            ((wye) m3cVar2.F.e).o = sfdVar.C().o;
                        }
                        sfdVar.C().G0().b();
                        List listN2 = m3cVar.n();
                        int size2 = listN2.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            m3c m3cVar3 = (m3c) ((bee) listN2).get(i6);
                            dee deeVar2 = (dee) pqhVar.a;
                            ((wye) m3cVar3.F.e).o = deeVar2 != null && deeVar2.e(m3cVar3);
                        }
                        dfe dfeVarZ3 = m3cVar.z();
                        Object[] objArr3 = dfeVarZ3.a;
                        int i7 = dfeVarZ3.c;
                        for (int i8 = 0; i8 < i7; i8++) {
                            m3c m3cVar4 = (m3c) objArr3[i8];
                            q3c q3cVar3 = m3cVar4.G;
                            if (q3cVar3.p.h != m3cVar4.v()) {
                                m3cVar.O();
                                m3cVar.C();
                                if (m3cVar4.v() == Integer.MAX_VALUE) {
                                    if (q3cVar3.c || ui6.M(m3cVar4)) {
                                        q3cVar3.q.q0(false);
                                    }
                                    q3cVar3.p.r0();
                                }
                            }
                        }
                        dfe dfeVarZ4 = m3cVar.z();
                        Object[] objArr4 = dfeVarZ4.a;
                        int i9 = dfeVarZ4.c;
                        for (int i10 = 0; i10 < i9; i10++) {
                            n3c n3cVar = ((m3c) objArr4[i10]).G.p.x;
                            n3cVar.e = n3cVar.d;
                        }
                        break;
                    default:
                        q3c q3cVar4 = sfdVar.f;
                        wye wyeVar = q3cVar4.a().w;
                        if (wyeVar != null) {
                            p1dVar = wyeVar.p;
                        } else {
                            v31 v31VarA = p3c.a(q3cVar4.a);
                            m3g m3gVar = jfg.a;
                            p1dVar = new p1d(v31VarA, (byte) 1);
                        }
                        Function1 function1 = sfdVar.G;
                        if (function1 == null) {
                            wye wyeVarA = q3cVar4.a();
                            long j = sfdVar.H;
                            float f = sfdVar.I;
                            p1dVar.d(wyeVarA);
                            wyeVarA.d0(ybb.c(j, wyeVarA.e), f, null);
                        } else {
                            wye wyeVarA2 = q3cVar4.a();
                            long j2 = sfdVar.H;
                            float f2 = sfdVar.I;
                            p1dVar.d(wyeVarA2);
                            wyeVarA2.d0(ybb.c(j2, wyeVarA2.e), f2, function1);
                        }
                        break;
                }
                return Unit.a;
            }
        };
        final byte b3 = 2;
        this.J = new Function0(this) { // from class: rfd
            public final /* synthetic */ sfd b;

            {
                this.b = this;
            }

            public final Object invoke() throws pxb {
                p1d p1dVar;
                byte b32 = b3;
                sfd sfdVar = this.b;
                switch (b32) {
                    case 0:
                        sfdVar.f.a().N(sfdVar.B);
                        break;
                    case 1:
                        q3c q3cVar2 = sfdVar.f;
                        q3cVar2.i = 0;
                        m3c m3cVar = q3cVar2.a;
                        dfe dfeVarZ = m3cVar.z();
                        Object[] objArr = dfeVarZ.a;
                        int i = dfeVarZ.c;
                        for (int i2 = 0; i2 < i; i2++) {
                            sfd sfdVar2 = ((m3c) objArr[i2]).G.p;
                            sfdVar2.h = sfdVar2.i;
                            sfdVar2.i = Integer.MAX_VALUE;
                            sfdVar2.t = false;
                            if (sfdVar2.l == k3c.b) {
                                sfdVar2.l = k3c.c;
                            }
                        }
                        dfe dfeVarZ2 = m3cVar.z();
                        Object[] objArr2 = dfeVarZ2.a;
                        int i3 = dfeVarZ2.c;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((m3c) objArr2[i4]).G.p.x.d = false;
                        }
                        pqh pqhVar = new pqh();
                        List listN = m3cVar.n();
                        int size = listN.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            m3c m3cVar2 = (m3c) ((bee) listN).get(i5);
                            if (((wye) m3cVar2.F.e).o) {
                                dee deeVar = (dee) pqhVar.a;
                                if (deeVar == null) {
                                    deeVar = new dee();
                                    pqhVar.a = deeVar;
                                }
                                pqhVar.a = deeVar;
                                deeVar.a(m3cVar2);
                            }
                            ((wye) m3cVar2.F.e).o = sfdVar.C().o;
                        }
                        sfdVar.C().G0().b();
                        List listN2 = m3cVar.n();
                        int size2 = listN2.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            m3c m3cVar3 = (m3c) ((bee) listN2).get(i6);
                            dee deeVar2 = (dee) pqhVar.a;
                            ((wye) m3cVar3.F.e).o = deeVar2 != null && deeVar2.e(m3cVar3);
                        }
                        dfe dfeVarZ3 = m3cVar.z();
                        Object[] objArr3 = dfeVarZ3.a;
                        int i7 = dfeVarZ3.c;
                        for (int i8 = 0; i8 < i7; i8++) {
                            m3c m3cVar4 = (m3c) objArr3[i8];
                            q3c q3cVar3 = m3cVar4.G;
                            if (q3cVar3.p.h != m3cVar4.v()) {
                                m3cVar.O();
                                m3cVar.C();
                                if (m3cVar4.v() == Integer.MAX_VALUE) {
                                    if (q3cVar3.c || ui6.M(m3cVar4)) {
                                        q3cVar3.q.q0(false);
                                    }
                                    q3cVar3.p.r0();
                                }
                            }
                        }
                        dfe dfeVarZ4 = m3cVar.z();
                        Object[] objArr4 = dfeVarZ4.a;
                        int i9 = dfeVarZ4.c;
                        for (int i10 = 0; i10 < i9; i10++) {
                            n3c n3cVar = ((m3c) objArr4[i10]).G.p.x;
                            n3cVar.e = n3cVar.d;
                        }
                        break;
                    default:
                        q3c q3cVar4 = sfdVar.f;
                        wye wyeVar = q3cVar4.a().w;
                        if (wyeVar != null) {
                            p1dVar = wyeVar.p;
                        } else {
                            v31 v31VarA = p3c.a(q3cVar4.a);
                            m3g m3gVar = jfg.a;
                            p1dVar = new p1d(v31VarA, (byte) 1);
                        }
                        Function1 function1 = sfdVar.G;
                        if (function1 == null) {
                            wye wyeVarA = q3cVar4.a();
                            long j = sfdVar.H;
                            float f = sfdVar.I;
                            p1dVar.d(wyeVarA);
                            wyeVarA.d0(ybb.c(j, wyeVarA.e), f, null);
                        } else {
                            wye wyeVarA2 = q3cVar4.a();
                            long j2 = sfdVar.H;
                            float f2 = sfdVar.I;
                            p1dVar.d(wyeVarA2);
                            wyeVarA2.d0(ybb.c(j2, wyeVarA2.e), f2, function1);
                        }
                        break;
                }
                return Unit.a;
            }
        };
    }

    public final void A0(long j, float f, Function1 function1) throws Throwable {
        q3c q3cVar = this.f;
        m3c m3cVar = q3cVar.a;
        m3c m3cVar2 = q3cVar.a;
        if (m3cVar.Q) {
            a8b.a("place is called on a deactivated node");
        }
        q3cVar.d = i3c.c;
        this.n = j;
        this.p = f;
        this.o = function1;
        this.F = false;
        v31 v31VarA = p3c.a(m3cVar2);
        if (this.v || !this.s) {
            this.x.g = false;
            q3cVar.f(false);
            this.G = function1;
            this.H = j;
            this.I = f;
            p12 p12Var = v31VarA.K;
            ((tuj) p12Var.a).e(m3cVar2, (w5f) p12Var.f, this.J);
        } else {
            wye wyeVarA = q3cVar.a();
            wyeVarA.q1(ybb.c(j, wyeVarA.e), f, function1);
            x0();
        }
        q3cVar.d = i3c.e;
        if (q3cVar.a().o && (q3cVar.k || q3cVar.j)) {
            requestLayout();
        }
        this.k = true;
    }

    public final boolean B0(long j) throws Throwable {
        q3c q3cVar = this.f;
        m3c m3cVar = q3cVar.a;
        m3c m3cVar2 = q3cVar.a;
        try {
            if (m3cVar.Q) {
                a8b.a("measure is called on a deactivated node");
            }
            v31 v31VarA = p3c.a(m3cVar2);
            m3c m3cVarU = m3cVar2.u();
            boolean z = true;
            m3cVar2.E = m3cVar2.E || (m3cVarU != null && m3cVarU.E);
            if (!m3cVar2.q() && yo5.b(this.d, j)) {
                v31VarA.f(m3cVar2, false);
                m3cVar2.X();
                return false;
            }
            this.x.f = false;
            dfe dfeVarZ = m3cVar2.z();
            Object[] objArr = dfeVarZ.a;
            int i = dfeVarZ.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((m3c) objArr[i2]).G.p.x.c = false;
            }
            this.j = true;
            long j2 = q3cVar.a().c;
            g0(j);
            i3c i3cVar = q3cVar.d;
            i3c i3cVar2 = i3c.e;
            if (i3cVar != i3cVar2) {
                a8b.b("layout state is not idle before measure starts");
            }
            this.B = j;
            i3c i3cVar3 = i3c.a;
            q3cVar.d = i3cVar3;
            this.u = false;
            p12 p12Var = p3c.a(m3cVar2).K;
            ((tuj) p12Var.a).e(m3cVar2, (w5f) p12Var.c, this.C);
            if (q3cVar.d == i3cVar3) {
                this.v = true;
                this.w = true;
                q3cVar.d = i3cVar2;
            }
            if (gcb.a(q3cVar.a().c, j2) && q3cVar.a().a == this.a && q3cVar.a().b == this.b) {
                z = false;
            }
            f0((q3cVar.a().a << 32) | (q3cVar.a().b & 4294967295L));
            return z;
        } catch (Throwable th) {
            m3cVar.Y(th);
            throw null;
        }
    }

    @Override // defpackage.xz0
    public final j8b C() {
        return (j8b) this.f.a.F.b;
    }

    public final void D0() {
        q3c q3cVar = this.f;
        m3c m3cVar = q3cVar.a;
        m3c m3cVar2 = q3cVar.a;
        if (!m3cVar.I() || q3cVar.l <= 0) {
            return;
        }
        q3c q3cVar2 = m3cVar2.G;
        if ((q3cVar2.j || q3cVar2.k) && !q3cVar2.p.v) {
            m3cVar2.U(false);
        }
        dfe dfeVarZ = m3cVar2.z();
        Object[] objArr = dfeVarZ.a;
        int i = dfeVarZ.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((m3c) objArr[i2]).G.p.D0();
        }
    }

    @Override // defpackage.pfd
    public final int E(int i) {
        q3c q3cVar = this.f;
        if (ui6.M(q3cVar.a)) {
            return q3cVar.q.E(i);
        }
        v0();
        return q3cVar.a().E(i);
    }

    @Override // defpackage.xz0
    public final int G() {
        return this.i;
    }

    @Override // defpackage.pfd
    public final int J(int i) {
        q3c q3cVar = this.f;
        if (ui6.M(q3cVar.a)) {
            return q3cVar.q.J(i);
        }
        v0();
        return q3cVar.a().J(i);
    }

    @Override // defpackage.pfd
    public final ifg N(long j) throws Throwable {
        k3c k3cVar;
        q3c q3cVar = this.f;
        m3c m3cVar = q3cVar.a;
        m3c m3cVar2 = q3cVar.a;
        k3c k3cVar2 = m3cVar.C;
        k3c k3cVar3 = k3c.c;
        if (k3cVar2 == k3cVar3) {
            m3cVar.e();
        }
        if (ui6.M(m3cVar2)) {
            u1d u1dVar = q3cVar.q;
            u1dVar.j = k3cVar3;
            u1dVar.N(j);
        }
        m3c m3cVarU = m3cVar2.u();
        if (m3cVarU != null) {
            q3c q3cVar2 = m3cVarU.G;
            if (this.l != k3cVar3 && !m3cVar2.E) {
                a8b.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = q3cVar2.d.ordinal();
            if (iOrdinal == 0) {
                k3cVar = k3c.a;
            } else {
                if (iOrdinal != 2) {
                    j9h.u(q3cVar2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                k3cVar = k3c.b;
            }
            this.l = k3cVar;
        } else {
            this.l = k3cVar3;
        }
        B0(j);
        return this;
    }

    @Override // defpackage.xz0
    public final void V() {
        m3c.V(this.f.a, false, 7);
    }

    @Override // defpackage.ifg
    public final int W(sz0 sz0Var) {
        q3c q3cVar = this.f;
        m3c m3cVarU = q3cVar.a.u();
        i3c i3cVar = m3cVarU != null ? m3cVarU.G.d : null;
        i3c i3cVar2 = i3c.a;
        n3c n3cVar = this.x;
        if (i3cVar == i3cVar2) {
            n3cVar.c = true;
        } else {
            m3c m3cVarU2 = q3cVar.a.u();
            if ((m3cVarU2 != null ? m3cVarU2.G.d : null) == i3c.c) {
                n3cVar.d = true;
            }
        }
        this.m = true;
        int iW = q3cVar.a().W(sz0Var);
        this.m = false;
        return iW;
    }

    @Override // defpackage.ifg
    public final int X() {
        return this.f.a().X();
    }

    @Override // defpackage.ifg
    public final int Y() {
        return this.f.a().Y();
    }

    @Override // defpackage.xz0
    public final n3c a() {
        return this.x;
    }

    @Override // defpackage.pfd
    public final int c(int i) {
        q3c q3cVar = this.f;
        if (ui6.M(q3cVar.a)) {
            return q3cVar.q.c(i);
        }
        v0();
        return q3cVar.a().c(i);
    }

    @Override // defpackage.xz0
    public final xz0 d() {
        q3c q3cVar;
        m3c m3cVarU = this.f.a.u();
        if (m3cVarU == null || (q3cVar = m3cVarU.G) == null) {
            return null;
        }
        return q3cVar.p;
    }

    @Override // defpackage.ifg
    public final void d0(long j, float f, Function1 function1) throws Throwable {
        p1d p1dVar;
        q3c q3cVar = this.f;
        m3c m3cVar = q3cVar.a;
        m3c m3cVar2 = q3cVar.a;
        try {
            this.t = true;
            if ((!ybb.a(j, this.n) || function1 != this.o || this.K) && (q3cVar.k || q3cVar.j || this.K)) {
                this.v = true;
                this.K = false;
            }
            u1d u1dVar = q3cVar.q;
            if (u1dVar != null) {
                q3c q3cVar2 = u1dVar.f;
                if (u1dVar.q == t1d.c && !ui6.M(q3cVar2.a)) {
                    q3cVar2.c = true;
                }
            }
            u1d u1dVar2 = q3cVar.q;
            if (u1dVar2 != null && u1dVar2.i0()) {
                wye wyeVar = q3cVar.a().w;
                if (wyeVar != null) {
                    p1dVar = wyeVar.p;
                } else {
                    v31 v31VarA = p3c.a(m3cVar2);
                    m3g m3gVar = jfg.a;
                    p1dVar = new p1d(v31VarA, (byte) 1);
                }
                u1d u1dVar3 = q3cVar.q;
                m3c m3cVarU = m3cVar2.u();
                if (m3cVarU != null) {
                    m3cVarU.G.h = 0;
                }
                u1dVar3.i = Integer.MAX_VALUE;
                p1d.f(p1dVar, u1dVar3, (int) (j >> 32), (int) (4294967295L & j));
            }
            u1d u1dVar4 = q3cVar.q;
            if (u1dVar4 != null && !u1dVar4.l) {
                a8b.b("Error: Placement happened before lookahead.");
            }
            A0(j, f, function1);
        } catch (Throwable th) {
            m3cVar.Y(th);
            throw null;
        }
    }

    public final List i0() {
        q3c q3cVar = this.f;
        q3cVar.a.g0();
        boolean z = this.z;
        dfe dfeVar = this.y;
        if (!z) {
            return dfeVar.g();
        }
        m3c m3cVar = q3cVar.a;
        dfe dfeVarZ = m3cVar.z();
        Object[] objArr = dfeVarZ.a;
        int i = dfeVarZ.c;
        for (int i2 = 0; i2 < i; i2++) {
            m3c m3cVar2 = (m3c) objArr[i2];
            int i3 = dfeVar.c;
            sfd sfdVar = m3cVar2.G.p;
            if (i3 <= i2) {
                dfeVar.c(sfdVar);
            } else {
                Object[] objArr2 = dfeVar.a;
                Object obj = objArr2[i2];
                objArr2[i2] = sfdVar;
            }
        }
        dfeVar.m(((dfe) ((bee) m3cVar.n()).b).c, dfeVar.c);
        this.z = false;
        return dfeVar.g();
    }

    @Override // defpackage.xz0
    public final void n(z3 z3Var) {
        dfe dfeVarZ = this.f.a.z();
        Object[] objArr = dfeVarZ.a;
        int i = dfeVarZ.c;
        for (int i2 = 0; i2 < i; i2++) {
            z3Var.invoke(((m3c) objArr[i2]).G.p);
        }
    }

    @Override // defpackage.ifg, defpackage.pfd
    public final Object p() {
        return this.r;
    }

    public final void q0() {
        boolean z = this.s;
        this.s = true;
        q3c q3cVar = this.f;
        m3c m3cVar = q3cVar.a;
        tah tahVar = m3cVar.F;
        if (!z) {
            ((j8b) tahVar.b).l1();
            p3c.a(m3cVar).t.g(q3cVar.a);
            if (m3cVar.q()) {
                m3c.V(m3cVar, true, 6);
            } else if (m3cVar.G.e) {
                m3c.T(m3cVar, true, 6);
            }
        }
        wye wyeVar = ((j8b) tahVar.b).v;
        for (wye wyeVar2 = (wye) tahVar.e; !Intrinsics.a(wyeVar2, wyeVar) && wyeVar2 != null; wyeVar2 = wyeVar2.v) {
            if (wyeVar2.S) {
                wyeVar2.h1();
            }
        }
        dfe dfeVarZ = m3cVar.z();
        Object[] objArr = dfeVarZ.a;
        int i = dfeVarZ.c;
        for (int i2 = 0; i2 < i; i2++) {
            m3c m3cVar2 = (m3c) objArr[i2];
            if (m3cVar2.v() != Integer.MAX_VALUE) {
                m3cVar2.G.p.q0();
                m3c.W(m3cVar2);
            }
        }
    }

    @Override // defpackage.hae
    public final void r(boolean z) {
        q3c q3cVar = this.f;
        if (z != q3cVar.a().l) {
            q3cVar.a().l = z;
            this.K = true;
        }
    }

    public final void r0() throws pxb {
        if (this.s) {
            this.s = false;
            q3c q3cVar = this.f;
            m3c m3cVar = q3cVar.a;
            m3c m3cVar2 = q3cVar.a;
            p3c.a(m3cVar).t.h(m3cVar2);
            tah tahVar = m3cVar2.F;
            wye wyeVar = ((j8b) tahVar.b).v;
            for (wye wyeVar2 = (wye) tahVar.e; !Intrinsics.a(wyeVar2, wyeVar) && wyeVar2 != null; wyeVar2 = wyeVar2.v) {
                wyeVar2.n1();
                wyeVar2.s1();
            }
            dfe dfeVarZ = m3cVar2.z();
            Object[] objArr = dfeVarZ.a;
            int i = dfeVarZ.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((m3c) objArr[i2]).G.p.r0();
            }
        }
    }

    @Override // defpackage.xz0
    public final void requestLayout() {
        this.f.a.U(false);
    }

    @Override // defpackage.xz0
    public final void t() throws Throwable {
        boolean zB0;
        this.A = true;
        n3c n3cVar = this.x;
        n3cVar.h();
        boolean z = this.v;
        q3c q3cVar = this.f;
        if (z) {
            dfe dfeVarZ = q3cVar.a.z();
            Object[] objArr = dfeVarZ.a;
            int i = dfeVarZ.c;
            for (int i2 = 0; i2 < i; i2++) {
                m3c m3cVar = (m3c) objArr[i2];
                boolean zQ = m3cVar.q();
                q3c q3cVar2 = m3cVar.G;
                if (zQ && m3cVar.r() == k3c.a) {
                    sfd sfdVar = q3cVar2.p;
                    yo5 yo5Var = sfdVar.j ? new yo5(sfdVar.d) : null;
                    if (yo5Var != null) {
                        if (m3cVar.C == k3c.c) {
                            m3cVar.e();
                        }
                        zB0 = q3cVar2.p.B0(yo5Var.a);
                    } else {
                        zB0 = false;
                    }
                    if (zB0) {
                        m3c.V(q3cVar.a, false, 7);
                    }
                }
            }
        }
        if (this.w || (!this.m && !C().o && this.v)) {
            this.v = false;
            i3c i3cVar = q3cVar.d;
            q3cVar.d = i3c.c;
            q3cVar.g(false);
            m3c m3cVar2 = q3cVar.a;
            p12 p12Var = p3c.a(m3cVar2).K;
            ((tuj) p12Var.a).e(m3cVar2, (w5f) p12Var.e, this.D);
            q3cVar.d = i3cVar;
            this.w = false;
        }
        if (n3cVar.d) {
            n3cVar.e = true;
        }
        if (n3cVar.b && n3cVar.e()) {
            n3cVar.g();
        }
        this.A = false;
    }

    public final void v0() {
        q3c q3cVar = this.f;
        m3c.V(q3cVar.a, false, 7);
        m3c m3cVar = q3cVar.a;
        m3c m3cVarU = m3cVar.u();
        if (m3cVarU == null || m3cVar.C != k3c.c) {
            return;
        }
        int iOrdinal = m3cVarU.G.d.ordinal();
        m3cVar.C = iOrdinal != 0 ? iOrdinal != 2 ? m3cVarU.C : k3c.b : k3c.a;
    }

    public final void x0() throws Throwable {
        this.F = true;
        q3c q3cVar = this.f;
        m3c m3cVarU = q3cVar.a.u();
        float f = C().G;
        m3c m3cVar = q3cVar.a;
        tah tahVar = m3cVar.F;
        wye wyeVar = (wye) tahVar.e;
        j8b j8bVar = (j8b) tahVar.b;
        while (wyeVar != j8bVar) {
            g3c g3cVar = (g3c) wyeVar;
            f += g3cVar.G;
            wyeVar = g3cVar.v;
        }
        if (f != this.E) {
            this.E = f;
            if (m3cVarU != null) {
                m3cVarU.O();
                m3cVarU.C();
            }
        }
        if (!C().o) {
            boolean z = this.s;
            if (!z || this.x.d()) {
                q0();
            }
            if (z) {
                ((j8b) m3cVar.F.b).l1();
            } else {
                if (m3cVarU != null) {
                    m3cVarU.C();
                }
                if (this.g && m3cVarU != null) {
                    m3cVarU.U(false);
                }
            }
        }
        if (m3cVarU != null) {
            q3c q3cVar2 = m3cVarU.G;
            if (!this.g && q3cVar2.d == i3c.c) {
                if (this.i != Integer.MAX_VALUE) {
                    a8b.b("Place was called on a node which was placed already");
                }
                int i = q3cVar2.i;
                this.i = i;
                q3cVar2.i = i + 1;
            }
        } else {
            this.i = 0;
        }
        t();
    }

    @Override // defpackage.pfd
    public final int z(int i) {
        q3c q3cVar = this.f;
        if (ui6.M(q3cVar.a)) {
            return q3cVar.q.z(i);
        }
        v0();
        return q3cVar.a().z(i);
    }
}
