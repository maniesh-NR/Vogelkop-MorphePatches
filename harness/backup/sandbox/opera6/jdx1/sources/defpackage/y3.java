package defpackage;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class y3 extends i17 implements omg, tub, i0j, hi5, j7f, v6b, aw9 {
    public String A = "idle";
    public f17 B;
    public nwg C;
    public cma D;
    public final sde E;
    public long F;
    public nwg G;
    public lde H;
    public boolean I;
    public d3k J;
    public lde q;
    public g6b r;
    public boolean s;
    public String t;
    public q5i u;
    public boolean v;
    public Function0 w;
    public final ah9 x;
    public g6b y;
    public cw9 z;

    public y3(lde ldeVar, g6b g6bVar, boolean z, boolean z2, String str, q5i q5iVar, Function0 function0) {
        this.q = ldeVar;
        this.r = g6bVar;
        this.s = z;
        this.t = str;
        this.u = q5iVar;
        this.v = z2;
        this.w = function0;
        this.x = new ah9(ldeVar, 0, new r2(1, this, y3.class, "onFocusChange", "onFocusChange(Z)V", 0, (byte) 2));
        int i = t0d.a;
        this.E = new sde(6);
        this.F = 0L;
        lde ldeVar2 = this.q;
        this.H = ldeVar2;
        this.I = ldeVar2 == null;
    }

    @Override // defpackage.i0j
    public final boolean D0() {
        return true;
    }

    @Override // defpackage.b8e
    public final boolean I0() {
        return false;
    }

    public final void J() {
        if (this.s) {
            x7d.y(this, new p3(this, (byte) 0));
        }
    }

    @Override // defpackage.b8e
    public final void L0() throws pxb {
        J();
        if (!this.I) {
            e1();
        }
        if (this.v) {
            T0(this.x);
        }
    }

    @Override // defpackage.b8e
    public final void M0() throws pxb {
        Y0();
        if (this.H == null) {
            this.q = null;
        }
        f17 f17Var = this.B;
        if (f17Var != null) {
            U0(f17Var);
        }
        this.B = null;
        cw9 cw9Var = this.z;
        if (cw9Var != null) {
            U0(cw9Var);
        }
        this.z = null;
    }

    @Override // defpackage.i0j
    public final void R(q0j q0jVar) {
        q5i q5iVar = this.u;
        if (q5iVar != null) {
            o0j.h(q0jVar, q5iVar.a);
        }
        String str = this.t;
        p3 p3Var = new p3(this, (byte) 1);
        xtb[] xtbVarArr = o0j.a;
        q0jVar.b(e0j.b, new c8(str, p3Var));
        if (this.v) {
            this.x.R(q0jVar);
        } else {
            q0jVar.b(n0j.j, Unit.a);
        }
        W0(q0jVar);
    }

    @Override // defpackage.tub
    public final boolean V(KeyEvent keyEvent) {
        return false;
    }

    public void W0(q0j q0jVar) {
    }

    public final boolean X0() throws pxb {
        pqh pqhVar = new pqh();
        zch.B(this, cw9.p, new ra(new j31(pqhVar, (byte) 2), (byte) 14));
        if (pqhVar.a != null) {
            return true;
        }
        int i = c45.b;
        ViewParent parent = p37.i0(this).getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y0() {
        /*
            r17 = this;
            r0 = r17
            lde r1 = r0.q
            sde r2 = r0.E
            if (r1 == 0) goto L76
            nwg r3 = r0.C
            if (r3 == 0) goto L14
            mwg r4 = new mwg
            r4.<init>(r3)
            r1.b(r4)
        L14:
            nwg r3 = r0.G
            if (r3 == 0) goto L20
            mwg r4 = new mwg
            r4.<init>(r3)
            r1.b(r4)
        L20:
            cma r3 = r0.D
            if (r3 == 0) goto L2c
            dma r4 = new dma
            r4.<init>(r3)
            r1.b(r4)
        L2c:
            java.lang.Object[] r3 = r2.c
            long[] r4 = r2.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L76
            r6 = 0
            r7 = r6
        L37:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L71
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L51:
            if (r12 >= r10) goto L6f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L6b
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            nwg r13 = (defpackage.nwg) r13
            mwg r14 = new mwg
            r14.<init>(r13)
            r1.b(r14)
        L6b:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L51
        L6f:
            if (r10 != r11) goto L76
        L71:
            if (r7 == r5) goto L76
            int r7 = r7 + 1
            goto L37
        L76:
            r1 = 0
            r0.C = r1
            r0.G = r1
            r0.D = r1
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y3.Y0():void");
    }

    public final long Z0(long j) {
        long jY0 = ui6.e0(this).y.y0(((u5n) z4o.N(this, mi5.t)).d());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jY0 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (jY0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
    }

    public final void a1(boolean z) {
        lde ldeVar = this.q;
        if (ldeVar != null) {
            d3k d3kVar = this.J;
            mt5 mt5Var = null;
            if (d3kVar == null || !d3kVar.isActive()) {
                nwg nwgVar = z ? this.G : this.C;
                if (nwgVar != null) {
                    mwg mwgVar = new mwg(nwgVar);
                    unb unbVar = H0().b.get(ulp.h);
                    na2.B(H0(), null, null, new s3(ldeVar, mwgVar, unbVar != null ? unbVar.s(new q3(ldeVar, mwgVar, (byte) 0)) : null, mt5Var, (byte) 0), 3);
                }
            } else {
                d3k d3kVar2 = this.J;
                if (d3kVar2 != null) {
                    d3kVar2.k((CancellationException) null);
                }
            }
            if (z) {
                this.G = null;
            } else {
                this.C = null;
            }
        }
    }

    public final void b1(long j, boolean z) {
        lde ldeVar = this.q;
        if (ldeVar != null) {
            d3k d3kVar = this.J;
            if (d3kVar == null || !d3kVar.isActive()) {
                nwg nwgVar = z ? this.G : this.C;
                if (nwgVar != null) {
                    na2.B(H0(), null, null, new u3(nwgVar, ldeVar, null), 3);
                }
            } else {
                d3kVar.k((CancellationException) null);
                na2.B(H0(), null, null, new t3((Object) d3kVar, j, ldeVar, (mt5) null, (byte) 0), 3);
            }
            if (z) {
                this.G = null;
            } else {
                this.C = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077 A[RETURN] */
    @Override // defpackage.tub
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c0(android.view.KeyEvent r12) throws pxb {
        /*
            r11 = this;
            r11.e1()
            long r0 = defpackage.uup.s(r12)
            boolean r2 = r11.v
            r3 = 3
            r4 = 0
            sde r5 = r11.E
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4a
            int r2 = defpackage.uup.t(r12)
            r8 = 2
            if (r2 != r8) goto L4a
            boolean r2 = jpo.G(r12)
            if (r2 == 0) goto L4a
            boolean r2 = r5.b(r0)
            if (r2 != 0) goto L40
            nwg r2 = new nwg
            long r9 = r11.F
            r2.<init>(r9)
            r5.g(r0, r2)
            lde r0 = r11.q
            if (r0 == 0) goto L3e
            nx5 r0 = r11.H0()
            w3 r1 = new w3
            r1.<init>(r11, r2, r4, r8)
            defpackage.na2.B(r0, r4, r4, r1, r3)
        L3e:
            r0 = r6
            goto L41
        L40:
            r0 = r7
        L41:
            boolean r11 = r11.g1(r12)
            if (r11 != 0) goto L77
            if (r0 == 0) goto L78
            goto L77
        L4a:
            boolean r2 = r11.v
            if (r2 == 0) goto L78
            int r2 = defpackage.uup.t(r12)
            if (r2 != r6) goto L78
            boolean r2 = jpo.G(r12)
            if (r2 == 0) goto L78
            java.lang.Object r0 = r5.f(r0)
            nwg r0 = (defpackage.nwg) r0
            if (r0 == 0) goto L75
            lde r1 = r11.q
            if (r1 == 0) goto L72
            nx5 r1 = r11.H0()
            w3 r2 = new w3
            r2.<init>(r11, r0, r4, r3)
            defpackage.na2.B(r1, r4, r4, r2, r3)
        L72:
            r11.h1(r12)
        L75:
            if (r0 == 0) goto L78
        L77:
            return r6
        L78:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y3.c0(android.view.KeyEvent):boolean");
    }

    public final void c1(n6b n6bVar) {
        lde ldeVar = this.q;
        if (ldeVar != null) {
            nwg nwgVar = new nwg(n6bVar.c);
            mt5 mt5Var = null;
            if (X0()) {
                this.J = na2.B(H0(), null, null, new v3(ldeVar, nwgVar, this, mt5Var, (byte) 0), 3);
            } else {
                this.G = nwgVar;
                na2.B(H0(), null, null, new u3(ldeVar, nwgVar, null, (byte) 1), 3);
            }
        }
    }

    public final void d1(lmg lmgVar) {
        lde ldeVar = this.q;
        if (ldeVar != null) {
            nwg nwgVar = new nwg(lmgVar.c);
            mt5 mt5Var = null;
            if (X0()) {
                this.J = na2.B(H0(), null, null, new v3(ldeVar, nwgVar, this, mt5Var, (byte) 1), 3);
            } else {
                this.C = nwgVar;
                na2.B(H0(), null, null, new u3(ldeVar, nwgVar, null, (byte) 2), 3);
            }
        }
    }

    public final void e1() throws pxb {
        if (this.B == null) {
            g6b g6bVar = this.s ? this.y : this.r;
            if (g6bVar != null) {
                lde ldeVar = this.q;
                if (ldeVar == null) {
                    ldeVar = new lde();
                    this.q = ldeVar;
                }
                this.x.Y0(ldeVar);
                f17 f17VarA = g6bVar.a(this.q);
                T0(f17VarA);
                this.B = f17VarA;
            }
        }
    }

    public void f1() {
    }

    public boolean g1(KeyEvent keyEvent) {
        return false;
    }

    public void h1(KeyEvent keyEvent) {
        i1();
    }

    public final void i1() {
        bwj bwjVar = (bwj) z4o.N(this, mi5.v);
        if (bwjVar != null) {
            bwjVar.a();
        }
        this.w.invoke();
    }

    public final void j1(lde ldeVar, g6b g6bVar, boolean z, boolean z2, String str, q5i q5iVar, Function0 function0) throws pxb {
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (Intrinsics.a(this.H, ldeVar)) {
            z3 = false;
        } else {
            Y0();
            this.H = ldeVar;
            this.q = ldeVar;
            z3 = true;
        }
        if (!Intrinsics.a(this.r, g6bVar)) {
            this.r = g6bVar;
            z3 = true;
        }
        if (this.s != z) {
            this.s = z;
            if (z) {
                J();
            }
            z3 = true;
        }
        boolean z6 = this.v;
        ah9 ah9Var = this.x;
        if (z6 != z2) {
            if (z2) {
                T0(ah9Var);
            } else {
                U0(ah9Var);
                Y0();
            }
            aoh.j(this);
            if (!z2) {
                f17 f17Var = this.z;
                if (f17Var != null) {
                    U0(f17Var);
                }
                this.z = null;
                this.A = "idle";
            }
            this.v = z2;
        }
        if (!Intrinsics.a(this.t, str)) {
            this.t = str;
            aoh.j(this);
        }
        if (!Intrinsics.a(this.u, q5iVar)) {
            this.u = q5iVar;
            aoh.j(this);
        }
        this.w = function0;
        boolean z7 = this.I;
        lde ldeVar2 = this.H;
        if (z7 == (ldeVar2 == null)) {
            z5 = z3;
            z4 = z7;
        } else {
            z4 = ldeVar2 == null;
            this.I = z4;
            if (z4 || this.B != null) {
                z7 = z4;
                z5 = z3;
                z4 = z7;
            }
        }
        if (z5) {
            f17 f17Var2 = this.B;
            if (f17Var2 != null) {
                U0(f17Var2);
            } else if (!z4) {
            }
            this.B = null;
            e1();
        }
        ah9Var.Y0(this.q);
    }

    public void n(fmg fmgVar, gmg gmgVar, long j) throws pxb {
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.F = (Float.floatToRawIntBits((int) (j2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L);
        e1();
        if (this.v) {
            if (this.z == null) {
                cw9 cw9Var = new cw9(this);
                T0(cw9Var);
                this.z = cw9Var;
            }
            if (gmgVar == gmg.b) {
                byte b = fmgVar.f;
                mt5 mt5Var = null;
                if (b == 4) {
                    na2.B(H0(), null, null, new x3(this, mt5Var, (byte) 0), 3);
                } else if (b == 5) {
                    na2.B(H0(), null, null, new x3(this, mt5Var, (byte) 1), 3);
                }
            }
        }
    }

    @Override // defpackage.aw9
    public final String x() {
        return this.A;
    }
}
