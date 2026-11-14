package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class lb5 extends y3 {
    public final sde K;
    public final sde L;
    public lmg M;
    public d3k N;
    public d3k O;
    public boolean P;
    public boolean Q;
    public long R;
    public boolean S;
    public n6b T;
    public d3k U;
    public d3k V;
    public boolean W;
    public boolean X;
    public long Y;
    public boolean Z;

    public lb5(lde ldeVar, Function0 function0) {
        super(ldeVar, null, false, true, null, null, function0);
        int i = t0d.a;
        this.K = new sde(6);
        this.L = new sde(6);
        this.R = -1L;
        this.Y = -1L;
    }

    @Override // defpackage.v6b
    public final void D(ro9 ro9Var, gmg gmgVar) throws pxb {
        ArrayList arrayList = (ArrayList) ro9Var.c;
        e1();
        if (this.v && this.z == null) {
            cw9 cw9Var = new cw9(this);
            T0(cw9Var);
            this.z = cw9Var;
        }
        int i = 0;
        if (gmgVar != gmg.b) {
            if (gmgVar != gmg.c || this.T == null || this.X) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                n6b n6bVar = (n6b) arrayList.get(i);
                if (n6bVar.i && n6bVar != this.T) {
                    k1(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.T == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (wyh.i((n6b) arrayList.get(i2))) {
                    n6b n6bVar2 = (n6b) arrayList.get(0);
                    n6bVar2.i = true;
                    this.T = n6bVar2;
                    if (this.v) {
                        d3k d3kVar = this.V;
                        if (d3kVar != null && d3kVar.isActive()) {
                            ((u5n) z4o.N(this, mi5.t)).getClass();
                            if (n6bVar2.b - this.Y < 40) {
                                this.Z = true;
                                return;
                            }
                            this.W = true;
                            d3k d3kVar2 = this.V;
                            if (d3kVar2 != null) {
                                d3kVar2.k((CancellationException) null);
                            }
                            this.V = null;
                        }
                        this.X = false;
                        c1(n6bVar2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.X) {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                n6b n6bVar3 = (n6b) arrayList.get(i3);
                if (!n6bVar3.h || n6bVar3.d) {
                    int size4 = arrayList.size();
                    while (i < size4) {
                        ((n6b) arrayList.get(i)).i = true;
                        i++;
                    }
                    return;
                }
            }
            n6b n6bVar4 = (n6b) arrayList.get(0);
            n6bVar4.i = true;
            l1(n6bVar4.b, this.T);
            return;
        }
        int size5 = arrayList.size();
        for (int i4 = 0; i4 < size5; i4++) {
            n6b n6bVar5 = (n6b) arrayList.get(i4);
            if (n6bVar5.i || !n6bVar5.h || n6bVar5.d) {
                float f = ((u5n) z4o.N(this, mi5.t)).f();
                int size6 = arrayList.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    n6b n6bVar6 = (n6b) arrayList.get(i5);
                    boolean z = Math.abs(y8f.c(y8f.d(n6bVar6.c, this.T.c))) > f;
                    if (n6bVar6.i || z) {
                        k1(true);
                        return;
                    }
                }
                return;
            }
        }
        n6b n6bVar7 = (n6b) arrayList.get(0);
        n6bVar7.i = true;
        l1(n6bVar7.b, this.T);
    }

    @Override // defpackage.b8e
    public final void N0() {
        n1();
    }

    @Override // defpackage.y3
    public final void W0(q0j q0jVar) {
    }

    @Override // defpackage.y3
    public final void f1() {
        n1();
    }

    @Override // defpackage.omg
    public final void g0() {
        cma cmaVar;
        lde ldeVar = this.q;
        if (ldeVar != null && (cmaVar = this.D) != null) {
            ldeVar.b(new dma(cmaVar));
        }
        this.D = null;
        k1(false);
    }

    @Override // defpackage.y3
    public final boolean g1(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.y3
    public final void h1(KeyEvent keyEvent) {
        long jS = uup.s(keyEvent);
        sde sdeVar = this.K;
        boolean z = false;
        if (sdeVar.d(jS) != null) {
            unb unbVar = (unb) sdeVar.d(jS);
            if (unbVar != null) {
                if (unbVar.isActive()) {
                    unbVar.k((CancellationException) null);
                } else {
                    z = true;
                }
            }
            sdeVar.f(jS);
        }
        if (z) {
            return;
        }
        i1();
    }

    public final void k1(boolean z) {
        if (z) {
            this.T = null;
            d3k d3kVar = this.U;
            if (d3kVar != null) {
                d3kVar.k((CancellationException) null);
            }
            this.U = null;
            d3k d3kVar2 = this.V;
            if (d3kVar2 != null) {
                d3kVar2.k((CancellationException) null);
            }
            this.V = null;
            this.W = false;
            this.X = false;
            this.Y = -1L;
            this.Z = false;
        } else {
            this.M = null;
            d3k d3kVar3 = this.N;
            if (d3kVar3 != null) {
                d3kVar3.k((CancellationException) null);
            }
            this.N = null;
            d3k d3kVar4 = this.O;
            if (d3kVar4 != null) {
                d3kVar4.k((CancellationException) null);
            }
            this.O = null;
            this.P = false;
            this.Q = false;
            this.R = -1L;
            this.S = false;
        }
        a1(z);
    }

    public final void l1(long j, n6b n6bVar) {
        if (this.v && !this.Z) {
            b1(n6bVar.c, true);
            this.Y = j;
            if (!this.X && !this.W) {
                i1();
            }
        }
        this.T = null;
        this.Z = false;
        this.W = false;
        d3k d3kVar = this.U;
        if (d3kVar != null) {
            d3kVar.k((CancellationException) null);
        }
        this.U = null;
        this.X = false;
    }

    public final void m1(long j, lmg lmgVar) {
        if (this.v && !this.S) {
            b1(lmgVar.c, false);
            this.R = j;
            if (!this.Q && !this.P) {
                i1();
            }
        }
        this.M = null;
        this.S = false;
        this.P = false;
        d3k d3kVar = this.N;
        if (d3kVar != null) {
            d3kVar.k((CancellationException) null);
        }
        this.N = null;
        this.Q = false;
    }

    @Override // defpackage.y3, defpackage.omg
    public final void n(fmg fmgVar, gmg gmgVar, long j) throws pxb {
        super.n(fmgVar, gmgVar, j);
        if (gmgVar != gmg.b) {
            if (gmgVar != gmg.c || this.M == null || this.Q) {
                return;
            }
            List list = fmgVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                lmg lmgVar = (lmg) list.get(i);
                if (lmgVar.c() && lmgVar != this.M) {
                    k1(false);
                    return;
                }
            }
            return;
        }
        if (this.M == null) {
            if (xbl.e(fmgVar, true)) {
                lmg lmgVar2 = (lmg) fmgVar.a.get(0);
                lmgVar2.a();
                this.M = lmgVar2;
                if (this.v) {
                    d3k d3kVar = this.O;
                    if (d3kVar != null && d3kVar.isActive()) {
                        ((u5n) z4o.N(this, mi5.t)).getClass();
                        if (lmgVar2.b - this.R < 40) {
                            this.S = true;
                            return;
                        }
                        this.P = true;
                        d3k d3kVar2 = this.O;
                        if (d3kVar2 != null) {
                            d3kVar2.k((CancellationException) null);
                        }
                        this.O = null;
                    }
                    this.Q = false;
                    d1(lmgVar2);
                    return;
                }
                return;
            }
            return;
        }
        int i2 = fmgVar.c;
        List list2 = fmgVar.a;
        if (this.Q) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if (!wxe.m((lmg) list2.get(i3))) {
                    int size3 = list2.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        ((lmg) list2.get(i4)).a();
                    }
                    return;
                }
            }
            lmg lmgVar3 = (lmg) list2.get(0);
            lmgVar3.a();
            m1(lmgVar3.b, this.M);
            return;
        }
        int size4 = list2.size();
        for (int i5 = 0; i5 < size4; i5++) {
            if (!wxe.l((lmg) list2.get(i5))) {
                long jZ0 = Z0(j);
                int size5 = list2.size();
                for (int i6 = 0; i6 < size5; i6++) {
                    lmg lmgVar4 = (lmg) list2.get(i6);
                    if (lmgVar4.c() || wxe.I(lmgVar4, j, jZ0)) {
                        k1(false);
                        return;
                    }
                }
                return;
            }
        }
        lmg lmgVar5 = (lmg) list2.get(0);
        lmgVar5.a();
        m1(lmgVar5.b, this.M);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n1() {
        /*
            r24 = this;
            r0 = r24
            sde r1 = r0.K
            java.lang.Object[] r2 = r1.c
            long[] r3 = r1.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            r10 = 7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = 8
            r14 = 0
            if (r4 < 0) goto L5c
            r15 = r14
            r16 = 128(0x80, double:6.3E-322)
        L1a:
            r6 = r3[r15]
            r18 = 255(0xff, double:1.26E-321)
            long r8 = ~r6
            long r8 = r8 << r10
            long r8 = r8 & r6
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L53
            int r8 = r15 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = r14
        L2e:
            if (r9 >= r8) goto L4e
            long r20 = r6 & r18
            int r20 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r20 >= 0) goto L46
            int r20 = r15 << 3
            int r20 = r20 + r9
            r20 = r2[r20]
            r21 = r10
            r10 = r20
            unb r10 = (unb) r10
            r10.k(r5)
            goto L48
        L46:
            r21 = r10
        L48:
            long r6 = r6 >> r13
            int r9 = r9 + 1
            r10 = r21
            goto L2e
        L4e:
            r21 = r10
            if (r8 != r13) goto L62
            goto L55
        L53:
            r21 = r10
        L55:
            if (r15 == r4) goto L62
            int r15 = r15 + 1
            r10 = r21
            goto L1a
        L5c:
            r21 = r10
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
        L62:
            r1.a()
            sde r0 = r0.L
            java.lang.Object[] r1 = r0.c
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto La2
            r4 = r14
        L71:
            r6 = r2[r4]
            long r8 = ~r6
            long r8 = r8 << r21
            long r8 = r8 & r6
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L9d
            int r8 = r4 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = r14
        L84:
            if (r9 >= r8) goto L9b
            long r22 = r6 & r18
            int r10 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r10 < 0) goto L90
            long r6 = r6 >> r13
            int r9 = r9 + 1
            goto L84
        L90:
            int r4 = r4 << 3
            int r4 = r4 + r9
            r0 = r1[r4]
            kb5 r0 = (defpackage.kb5) r0
            r0.getClass()
            throw r5
        L9b:
            if (r8 != r13) goto La2
        L9d:
            if (r4 == r3) goto La2
            int r4 = r4 + 1
            goto L71
        La2:
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lb5.n1():void");
    }

    @Override // defpackage.v6b
    public final void q0() {
        k1(true);
    }
}
