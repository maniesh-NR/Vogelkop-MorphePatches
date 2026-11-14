package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class oj7 extends i17 implements omg, v6b, hi5, ck7 {
    public cw9 A;
    public cw9 B;
    public si7 C;
    public ri7 D;
    public qi7 E;
    public uup F;
    public bxk G;
    public yv4 H;
    public u6b I;
    public fsf q;
    public Function1 r;
    public boolean s;
    public lde t;
    public p04 u;
    public qj7 v;
    public boolean w;
    public boolean x;
    public pi7 y;
    public long z = 0;

    public oj7(Function1 function1, boolean z, lde ldeVar, fsf fsfVar) {
        this.q = fsfVar;
        this.r = function1;
        this.s = z;
        this.t = ldeVar;
    }

    public static void a1(oj7 oj7Var, lmg lmgVar, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        ri7 ri7Var = oj7Var.D;
        if (ri7Var == null) {
            ri7Var = new ri7();
            ri7Var.h = null;
            ri7Var.i = Long.MAX_VALUE;
            ri7Var.j = false;
            oj7Var.D = ri7Var;
        }
        ri7Var.h = lmgVar;
        ri7Var.i = j;
        yv4 yv4Var = oj7Var.H;
        fsf fsfVar = oj7Var.q;
        if (yv4Var == null) {
            oj7Var.H = new yv4(fsfVar);
        } else {
            yv4Var.c = fsfVar;
            yv4Var.b = j2;
        }
        ri7Var.j = false;
        oj7Var.F = ri7Var;
    }

    @Override // defpackage.ck7
    public final fsf C() {
        return this.q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v0, types: [i17, oj7] */
    /* JADX WARN: Type inference failed for: r7v39, types: [java.lang.Object] */
    @Override // defpackage.v6b
    public final void D(ro9 ro9Var, gmg gmgVar) throws pxb {
        char c;
        Object obj;
        float f;
        Object obj2;
        u6b u6bVar;
        float fIntBitsToFloat;
        boolean z;
        long jFloatToRawIntBits;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits2;
        float fIntBitsToFloat3;
        Object obj3;
        n6b n6bVar;
        n6b n6bVar2;
        int i = ro9Var.b;
        ArrayList arrayList = (ArrayList) ro9Var.c;
        if (this.s) {
            u6b u6bVar2 = this.I;
            if (u6bVar2 == null) {
                u6bVar2 = new u6b(this);
                this.I = u6bVar2;
            }
            if (this.B == null) {
                cw9 cw9Var = new cw9(u6bVar2);
                T0(cw9Var);
                this.B = cw9Var;
            }
            u6b u6bVar3 = this.I;
            if (u6bVar3 != null) {
                oj7 oj7Var = u6bVar3.a;
                mkh mkhVar = u6bVar3.f;
                int i2 = 0;
                mkh mkhVar2 = mkhVar;
                if (mkhVar == null) {
                    p6b p6bVar = u6bVar3.b;
                    p6b p6bVar2 = p6bVar;
                    if (p6bVar == null) {
                        o6b o6bVar = o6b.c;
                        p6b p6bVar3 = new p6b();
                        p6bVar3.k = o6bVar;
                        p6bVar3.l = false;
                        p6bVar3.m = false;
                        u6bVar3.b = p6bVar3;
                        p6bVar2 = p6bVar3;
                    }
                    u6bVar3.f = p6bVar2;
                    mkhVar2 = p6bVar2;
                }
                if (mkhVar2 instanceof p6b) {
                    p6b p6bVar4 = (p6b) mkhVar2;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    while (i2 < size) {
                        if (!wyh.i((n6b) arrayList.get(i2))) {
                            return;
                        } else {
                            i2++;
                        }
                    }
                    n6b n6bVar3 = (n6b) CollectionsKt.K(arrayList);
                    o6b o6bVar2 = t6b.a[p6bVar4.k.ordinal()] == 1 ? !oj7Var.l1() ? o6b.a : o6b.b : p6bVar4.k;
                    p6bVar4.k = o6bVar2;
                    if (gmgVar == gmg.a) {
                        if (o6bVar2 == o6b.b) {
                            n6bVar3.i = true;
                            p6bVar4.l = true;
                        }
                        p6bVar4.m = true;
                    }
                    if (gmgVar == gmg.b) {
                        if (o6bVar2 == o6b.a) {
                            u6b.c(u6bVar3, n6bVar3, n6bVar3.a, 0L, 12);
                            return;
                        }
                        if (p6bVar4.l) {
                            u6bVar3.f(n6bVar3, n6bVar3, new m6b(i), 0L);
                            u6bVar3.e(n6bVar3, new m6b(i), 0L);
                            long j = n6bVar3.a;
                            s6b s6bVar = u6bVar3.c;
                            if (s6bVar == null) {
                                s6bVar = new s6b();
                                s6bVar.k = Long.MAX_VALUE;
                                u6bVar3.c = s6bVar;
                            }
                            s6bVar.k = j;
                            u6bVar3.f = s6bVar;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (mkhVar2 instanceof r6b) {
                    r6b r6bVar = (r6b) mkhVar2;
                    if (gmgVar != gmg.a) {
                        int size2 = arrayList.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size2) {
                                obj3 = null;
                                break;
                            }
                            obj3 = arrayList.get(i3);
                            int i4 = i3;
                            if (k1g.s(((n6b) obj3).a, r6bVar.l)) {
                                break;
                            } else {
                                i3 = i4 + 1;
                            }
                        }
                        n6b n6bVar4 = (n6b) obj3;
                        if (n6bVar4 == null) {
                            int size3 = arrayList.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size3) {
                                    n6bVar2 = 0;
                                    break;
                                }
                                n6bVar2 = arrayList.get(i5);
                                if (((n6b) n6bVar2).d) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                            n6bVar4 = n6bVar2;
                            if (n6bVar4 == null) {
                                u6bVar3.a();
                                return;
                            }
                            r6bVar.l = n6bVar4.a;
                        }
                        if (gmgVar == gmg.b) {
                            if (n6bVar4.i) {
                                n6b n6bVar5 = r6bVar.k;
                                if (n6bVar5 == null) {
                                    qp2.o("AwaitTouchSlop.initialDown was not initialized");
                                    return;
                                }
                                long j2 = r6bVar.l;
                                yv4 yv4Var = u6bVar3.h;
                                if (yv4Var == null) {
                                    qp2.o("AwaitTouchSlop.touchSlopDetector was not initialized");
                                    return;
                                }
                                u6bVar3.b(n6bVar5, j2, yv4Var);
                            } else if (wyh.j(n6bVar4)) {
                                int size4 = arrayList.size();
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= size4) {
                                        n6bVar = null;
                                        break;
                                    }
                                    ?? r7 = arrayList.get(i6);
                                    if (((n6b) r7).d) {
                                        n6bVar = r7;
                                        break;
                                    }
                                    i6++;
                                }
                                n6b n6bVar6 = n6bVar;
                                if (n6bVar6 == null) {
                                    u6bVar3.a();
                                } else {
                                    r6bVar.l = n6bVar6.a;
                                }
                            } else {
                                float f2 = ((u5n) z4o.N(oj7Var, mi5.t)).f();
                                yv4 yv4Var2 = u6bVar3.h;
                                if (yv4Var2 == null) {
                                    qp2.o("Touch slop detector not initialized.");
                                    return;
                                }
                                long j3 = yv4.j(yv4Var2, wyh.P(n6bVar4, oj7Var.q, new m6b(i), true), f2);
                                if ((9223372034707292159L & j3) != 9205357640488583168L) {
                                    n6bVar4.i = true;
                                    n6b n6bVar7 = n6bVar4;
                                    u6bVar3.f(r6bVar.k, n6bVar7, new m6b(i), j3);
                                    n6bVar4 = n6bVar7;
                                    u6bVar3.e(n6bVar4, new m6b(i), j3);
                                    long j4 = n6bVar4.a;
                                    s6b s6bVar2 = u6bVar3.c;
                                    if (s6bVar2 == null) {
                                        s6bVar2 = new s6b();
                                        s6bVar2.k = Long.MAX_VALUE;
                                        u6bVar3.c = s6bVar2;
                                    }
                                    s6bVar2.k = j4;
                                    u6bVar3.f = s6bVar2;
                                } else {
                                    r6bVar.m = true;
                                }
                            }
                        }
                        if (gmgVar == gmg.c && r6bVar.m) {
                            if (!n6bVar4.i) {
                                r6bVar.m = false;
                                return;
                            }
                            n6b n6bVar8 = r6bVar.k;
                            if (n6bVar8 == null) {
                                qp2.o("AwaitTouchSlop.initialDown was not initialized");
                                return;
                            }
                            long j5 = r6bVar.l;
                            yv4 yv4Var3 = u6bVar3.h;
                            if (yv4Var3 != null) {
                                u6bVar3.b(n6bVar8, j5, yv4Var3);
                                return;
                            } else {
                                qp2.o("AwaitTouchSlop.touchSlopDetector was not initialized");
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                char c2 = ' ';
                if (mkhVar2 instanceof q6b) {
                    q6b q6bVar = (q6b) mkhVar2;
                    if (gmgVar == gmg.c) {
                        int size5 = arrayList.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size5) {
                                z = true;
                                break;
                            } else {
                                if (((n6b) arrayList.get(i7)).i) {
                                    z = false;
                                    break;
                                }
                                i7++;
                            }
                        }
                        int size6 = arrayList.size();
                        while (true) {
                            if (i2 >= size6) {
                                break;
                            }
                            if (!((n6b) arrayList.get(i2)).d) {
                                i2++;
                            } else if (!arrayList.isEmpty()) {
                                if (z) {
                                    n6b n6bVar9 = (n6b) CollectionsKt.K(arrayList);
                                    fsf fsfVar = oj7Var.q;
                                    if (fsfVar == null) {
                                        jFloatToRawIntBits = n6bVar9.c;
                                    } else {
                                        if (i == 1) {
                                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (n6bVar9.c >> 32));
                                        } else if (i == 2) {
                                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (n6bVar9.c & 4294967295L));
                                        } else {
                                            jFloatToRawIntBits = n6bVar9.c;
                                        }
                                        jFloatToRawIntBits = fsfVar == fsf.b ? Float.floatToRawIntBits(fIntBitsToFloat2) << 32 : Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L;
                                    }
                                    n6b n6bVar10 = q6bVar.k;
                                    fsf fsfVar2 = oj7Var.q;
                                    if (fsfVar2 == null) {
                                        jFloatToRawIntBits2 = n6bVar10.c;
                                    } else {
                                        if (i == 1) {
                                            fIntBitsToFloat3 = Float.intBitsToFloat((int) (n6bVar10.c >> 32));
                                        } else if (i == 2) {
                                            fIntBitsToFloat3 = Float.intBitsToFloat((int) (n6bVar10.c & 4294967295L));
                                        } else {
                                            jFloatToRawIntBits2 = n6bVar10.c;
                                        }
                                        jFloatToRawIntBits2 = fsfVar2 == fsf.b ? Float.floatToRawIntBits(fIntBitsToFloat3) << 32 : Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L;
                                    }
                                    long jD = y8f.d(jFloatToRawIntBits, jFloatToRawIntBits2);
                                    n6b n6bVar11 = q6bVar.k;
                                    if (n6bVar11 != null) {
                                        u6b.c(u6bVar3, n6bVar11, q6bVar.l, jD, 8);
                                        return;
                                    } else {
                                        qp2.o("AwaitGesturePickup.initialDown was not initialized.");
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                        u6bVar3.a();
                        return;
                    }
                    return;
                }
                if (!(mkhVar2 instanceof s6b)) {
                    h9o.p();
                    return;
                }
                s6b s6bVar3 = (s6b) mkhVar2;
                if (gmgVar == gmg.b) {
                    long j6 = s6bVar3.k;
                    int size7 = arrayList.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size7) {
                            c = c2;
                            obj = null;
                            break;
                        }
                        obj = arrayList.get(i8);
                        c = c2;
                        if (k1g.s(((n6b) obj).a, j6)) {
                            break;
                        }
                        i8++;
                        c2 = c;
                    }
                    n6b n6bVar12 = (n6b) obj;
                    if (n6bVar12 != null) {
                        long j7 = n6bVar12.c;
                        boolean zJ = wyh.j(n6bVar12);
                        xi7 xi7Var = xi7.a;
                        if (!zJ) {
                            if (n6bVar12.i) {
                                oj7Var.b1(xi7Var);
                                return;
                            } else {
                                if (y8f.c(wyh.P(n6bVar12, oj7Var.q, new m6b(i), true)) != 0.0f) {
                                    u6bVar3.e(n6bVar12, new m6b(i), wyh.P(n6bVar12, oj7Var.q, new m6b(i), false));
                                    n6bVar12.i = true;
                                    return;
                                }
                                return;
                            }
                        }
                        int size8 = arrayList.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size8) {
                                f = 0.0f;
                                obj2 = null;
                                break;
                            } else {
                                obj2 = arrayList.get(i9);
                                f = 0.0f;
                                if (((n6b) obj2).d) {
                                    break;
                                } else {
                                    i9++;
                                }
                            }
                        }
                        n6b n6bVar13 = (n6b) obj2;
                        if (n6bVar13 != null) {
                            s6bVar3.k = n6bVar13.a;
                            return;
                        }
                        if (n6bVar12.i || !wyh.j(n6bVar12)) {
                            u6bVar = u6bVar3;
                            oj7Var.b1(xi7Var);
                        } else {
                            bxk bxkVarD = u6bVar3.d();
                            fsf fsfVar3 = oj7Var.q;
                            bp bpVar = u6bVar3.i;
                            dee deeVar = (dee) bpVar.b;
                            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j7 >> c));
                            float fIntBitsToFloat5 = Float.intBitsToFloat((int) (j7 & 4294967295L));
                            if (wyh.i(n6bVar12)) {
                                bpVar.a = 0;
                                deeVar.d();
                            }
                            if (wyh.j(n6bVar12) || wyh.i(n6bVar12)) {
                                u6bVar = u6bVar3;
                            } else {
                                if (deeVar.b == 3) {
                                    int i10 = bpVar.a;
                                    bpVar.a = i10 + 1;
                                    deeVar.o(i10, n6bVar12);
                                } else {
                                    deeVar.a(n6bVar12);
                                }
                                if (bpVar.a == 3) {
                                    bpVar.a = 0;
                                }
                                Object[] objArr = deeVar.a;
                                int i11 = deeVar.b;
                                float fIntBitsToFloat6 = f;
                                for (int i12 = 0; i12 < i11; i12++) {
                                    fIntBitsToFloat6 += Float.intBitsToFloat((int) (((n6b) objArr[i12]).c >> c));
                                }
                                int i13 = deeVar.b;
                                fIntBitsToFloat4 = fIntBitsToFloat6 / i13;
                                Object[] objArr2 = deeVar.a;
                                float fIntBitsToFloat7 = f;
                                int i14 = 0;
                                while (i14 < i13) {
                                    fIntBitsToFloat7 += Float.intBitsToFloat((int) (((n6b) objArr2[i14]).c & 4294967295L));
                                    i14++;
                                    u6bVar3 = u6bVar3;
                                }
                                u6bVar = u6bVar3;
                                fIntBitsToFloat5 = fIntBitsToFloat7 / deeVar.b;
                            }
                            long jFloatToRawIntBits3 = (Float.floatToRawIntBits(fIntBitsToFloat4) << c) | (Float.floatToRawIntBits(fIntBitsToFloat5) & 4294967295L);
                            if (fsfVar3 != null) {
                                if (i == 1) {
                                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> c));
                                } else if (i == 2) {
                                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L));
                                }
                                jFloatToRawIntBits3 = fsfVar3 == fsf.b ? Float.floatToRawIntBits(fIntBitsToFloat) << c : Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L;
                            }
                            ((qq8) bxkVarD.b).b(n6bVar12.b, jFloatToRawIntBits3);
                            float fE = ((u5n) z4o.N(oj7Var, mi5.t)).e();
                            long jF = u6bVar.d().f(w0h.a(fE, fE));
                            qq8 qq8Var = (qq8) u6bVar.d().b;
                            k1n k1nVar = (k1n) qq8Var.b;
                            b82.i(null, k1nVar.d);
                            k1nVar.e = 0;
                            k1n k1nVar2 = (k1n) qq8Var.c;
                            b82.i(null, k1nVar2.d);
                            k1nVar2.e = 0;
                            qq8Var.a = 0L;
                            oj7Var.b1(new aj7(ek7.c(jF), true));
                        }
                        u6bVar.a();
                    }
                }
            }
        }
    }

    @Override // defpackage.b8e
    public final void M0() throws pxb {
        this.w = false;
        W0();
        cw9 cw9Var = this.B;
        if (cw9Var != null) {
            U0(cw9Var);
        }
        cw9 cw9Var2 = this.A;
        if (cw9Var2 != null) {
            U0(cw9Var2);
        }
        this.B = null;
        this.A = null;
    }

    public final void W0() {
        qj7 qj7Var = this.v;
        if (qj7Var != null) {
            lde ldeVar = this.t;
            if (ldeVar != null) {
                ldeVar.b(new pj7(qj7Var));
            }
            this.v = null;
        }
    }

    public abstract Object X0(s71 s71Var, jj4 jj4Var);

    public final void Y0() {
        this.z = 0L;
        pi7 pi7Var = this.y;
        if (pi7Var == null) {
            oi7 oi7Var = oi7.c;
            pi7Var = new pi7();
            pi7Var.h = oi7Var;
            pi7Var.i = false;
            pi7Var.j = false;
            this.y = pi7Var;
        }
        pi7Var.h = oi7.c;
        pi7Var.i = false;
        pi7Var.j = false;
        this.F = pi7Var;
    }

    public final void Z0(lmg lmgVar, long j, yv4 yv4Var) {
        qi7 qi7Var = this.E;
        if (qi7Var == null) {
            qi7Var = new qi7();
            qi7Var.h = null;
            qi7Var.i = Long.MAX_VALUE;
            this.E = qi7Var;
        }
        qi7Var.h = lmgVar;
        qi7Var.i = j;
        yv4Var.b = 0L;
        this.F = qi7Var;
    }

    public final void b1(bj7 bj7Var) {
        if ((bj7Var instanceof zi7) && !this.w) {
            this.w = true;
            m1();
        }
        h1().b(bj7Var);
    }

    public void c1(long j) {
    }

    public abstract void d1(aj7 aj7Var);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e1(nt5 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.lj7
            if (r0 == 0) goto L13
            r0 = r7
            lj7 r0 = (defpackage.lj7) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            lj7 r0 = new lj7
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.ybh.y(r7)
            goto L47
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L2e:
            defpackage.ybh.y(r7)
            qj7 r7 = r6.v
            if (r7 == 0) goto L49
            lde r2 = r6.t
            if (r2 == 0) goto L47
            pj7 r5 = new pj7
            r5.<init>(r7)
            r0.v = r4
            java.lang.Object r7 = r2.a(r5, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r6.v = r3
        L49:
            aj7 r7 = new aj7
            r0 = 0
            r2 = 0
            r7.<init>(r0, r2)
            r6.d1(r7)
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj7.e1(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f1(defpackage.zi7 r7, nt5 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.mj7
            if (r0 == 0) goto L13
            r0 = r8
            mj7 r0 = (defpackage.mj7) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            mj7 r0 = new mj7
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            qj7 r7 = r0.u
            zi7 r0 = r0.t
            defpackage.ybh.y(r8)
            goto L6d
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            r6 = 0
            return r6
        L35:
            zi7 r7 = r0.t
            defpackage.ybh.y(r8)
            goto L55
        L3b:
            defpackage.ybh.y(r8)
            qj7 r8 = r6.v
            if (r8 == 0) goto L55
            lde r2 = r6.t
            if (r2 == 0) goto L55
            pj7 r5 = new pj7
            r5.<init>(r8)
            r0.t = r7
            r0.x = r4
            java.lang.Object r8 = r2.a(r5, r0)
            if (r8 == r1) goto L6a
        L55:
            qj7 r8 = new qj7
            r8.<init>()
            lde r2 = r6.t
            if (r2 == 0) goto L6f
            r0.t = r7
            r0.u = r8
            r0.x = r3
            java.lang.Object r0 = r2.a(r8, r0)
            if (r0 != r1) goto L6b
        L6a:
            return r1
        L6b:
            r0 = r7
            r7 = r8
        L6d:
            r8 = r7
            r7 = r0
        L6f:
            r6.v = r8
            long r7 = r7.a
            r6.c1(r7)
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj7.f1(zi7, nt5):java.lang.Object");
    }

    @Override // defpackage.omg
    public final void g0() {
        if (this.x) {
            Y0();
            if (this.w) {
                h1().b(xi7.a);
            }
            this.G = null;
        }
        this.x = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g1(defpackage.aj7 r7, nt5 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.nj7
            if (r0 == 0) goto L13
            r0 = r8
            nj7 r0 = (defpackage.nj7) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            nj7 r0 = new nj7
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            aj7 r7 = r0.t
            defpackage.ybh.y(r8)
            goto L4b
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L30:
            defpackage.ybh.y(r8)
            qj7 r8 = r6.v
            if (r8 == 0) goto L4d
            lde r2 = r6.t
            if (r2 == 0) goto L4b
            rj7 r5 = new rj7
            r5.<init>(r8)
            r0.t = r7
            r0.w = r4
            java.lang.Object r8 = r2.a(r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            r6.v = r3
        L4d:
            r6.d1(r7)
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj7.g1(aj7, nt5):java.lang.Object");
    }

    public final or4 h1() {
        p04 p04Var = this.u;
        if (p04Var != null) {
            return p04Var;
        }
        qp2.o("Events channel not initialized.");
        return null;
    }

    public final bxk i1() {
        bxk bxkVar = this.G;
        if (bxkVar != null) {
            return bxkVar;
        }
        qp2.o("Velocity Tracker not initialized.");
        return null;
    }

    public final void j1(long j, lmg lmgVar) {
        this.z = y8f.e(this.z, j);
        ocp.e(i1(), lmgVar);
        h1().b(new yi7(j, false));
    }

    public final void k1(lmg lmgVar, lmg lmgVar2, long j) {
        if (this.G == null) {
            this.G = new bxk((byte) 8);
        }
        ocp.e(i1(), lmgVar);
        long jD = y8f.d(lmgVar2.c, j);
        if (((Boolean) this.r.invoke(new vmg(lmgVar.i))).booleanValue()) {
            if (!this.w) {
                if (this.u == null) {
                    this.u = xf8.h(Integer.MAX_VALUE, null, null, 6);
                }
                m1();
            }
            h1().b(new zi7(jD));
        }
    }

    public boolean l1() {
        spi spiVar = ((jpi) this).R;
        if (spiVar.a.a()) {
            return true;
        }
        v51 v51Var = spiVar.b;
        return v51Var != null ? v51Var.e() : false;
    }

    public final void m1() {
        this.w = true;
        mt5 mt5Var = null;
        if (this.u == null) {
            this.u = xf8.h(Integer.MAX_VALUE, null, null, 6);
        }
        na2.B(H0(), null, null, new jj4((byte) 5, mt5Var, (Object) this), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01bb  */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v0, types: [aw9, f17, hi5, i17, oj7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(defpackage.fmg r20, defpackage.gmg r21, long r22) {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj7.n(fmg, gmg, long):void");
    }

    public final void n1(Function1 function1, boolean z, lde ldeVar, fsf fsfVar, boolean z2) {
        this.r = function1;
        boolean z3 = true;
        if (this.s != z) {
            this.s = z;
            if (!z) {
                cw9 cw9Var = this.B;
                if (cw9Var != null) {
                    U0(cw9Var);
                }
                cw9 cw9Var2 = this.A;
                if (cw9Var2 != null) {
                    U0(cw9Var2);
                }
                this.B = null;
                this.A = null;
                W0();
                this.I = null;
            }
            z2 = true;
        }
        if (!Intrinsics.a(this.t, ldeVar)) {
            W0();
            this.t = ldeVar;
        }
        if (this.q != fsfVar) {
            this.q = fsfVar;
        } else {
            z3 = z2;
        }
        if (z3) {
            boolean z4 = this.x;
            xi7 xi7Var = xi7.a;
            if (z4) {
                Y0();
                if (this.w) {
                    h1().b(xi7Var);
                }
                this.G = null;
            }
            u6b u6bVar = this.I;
            if (u6bVar != null) {
                u6bVar.a();
                oj7 oj7Var = u6bVar.a;
                if (oj7Var.w) {
                    oj7Var.b1(xi7Var);
                }
                u6bVar.g = null;
                bp bpVar = u6bVar.j;
                bpVar.a = 0;
                ((rde) bpVar.b).b = 0;
            }
        }
    }

    @Override // defpackage.v6b
    public final void q0() {
        u6b u6bVar = this.I;
        if (u6bVar != null) {
            u6bVar.a();
            oj7 oj7Var = u6bVar.a;
            if (oj7Var.w) {
                oj7Var.b1(xi7.a);
            }
            u6bVar.g = null;
            bp bpVar = u6bVar.j;
            bpVar.a = 0;
            ((rde) bpVar.b).b = 0;
        }
    }

    @Override // defpackage.aw9
    public final String x() {
        if (!this.s) {
            return "idle";
        }
        uup uupVar = this.F;
        return uupVar instanceof pi7 ? ((pi7) uupVar).j ? "waiting" : "idle" : ((uupVar instanceof ri7) || (uupVar instanceof qi7)) ? "waiting" : uupVar instanceof si7 ? "recognized" : "idle";
    }
}
