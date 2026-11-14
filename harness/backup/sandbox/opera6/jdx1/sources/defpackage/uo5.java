package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class uo5 {
    public final eo5 H;
    public final eo5 I;
    public final eo5 J;
    public final eo5 K;
    public final eo5 L;
    public final eo5 M;
    public final eo5 N;
    public final eo5 O;
    public final eo5[] P;
    public final ArrayList Q;
    public final boolean[] R;
    public vo5 S;
    public int T;
    public int U;
    public float V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public er4 b;
    public int b0;
    public er4 c;
    public float c0;
    public float d0;
    public View e0;
    public int f0;
    public String g0;
    public int h0;
    public int i0;
    public final float[] j0;
    public final uo5[] k0;
    public final uo5[] l0;
    public int m0;
    public int n0;
    public final int[] o0;
    public boolean a = false;
    public tga d = null;
    public k2n e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public int n = -1;
    public int o = -1;
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public final int[] s = new int[2];
    public int t = 0;
    public int u = 0;
    public float v = 1.0f;
    public int w = 0;
    public int x = 0;
    public float y = 1.0f;
    public int z = -1;
    public float A = 1.0f;
    public final int[] B = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float C = Float.NaN;
    public boolean D = false;
    public boolean E = false;
    public int F = 0;
    public int G = 0;

    public uo5() {
        eo5 eo5Var = new eo5(this, 2);
        this.H = eo5Var;
        eo5 eo5Var2 = new eo5(this, 3);
        this.I = eo5Var2;
        eo5 eo5Var3 = new eo5(this, 4);
        this.J = eo5Var3;
        eo5 eo5Var4 = new eo5(this, 5);
        this.K = eo5Var4;
        eo5 eo5Var5 = new eo5(this, 6);
        this.L = eo5Var5;
        eo5 eo5Var6 = new eo5(this, 8);
        this.M = eo5Var6;
        eo5 eo5Var7 = new eo5(this, 9);
        this.N = eo5Var7;
        eo5 eo5Var8 = new eo5(this, 7);
        this.O = eo5Var8;
        this.P = new eo5[]{eo5Var, eo5Var3, eo5Var2, eo5Var4, eo5Var5, eo5Var8};
        ArrayList arrayList = new ArrayList();
        this.Q = arrayList;
        this.R = new boolean[2];
        this.o0 = new int[]{1, 1};
        this.S = null;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        this.f0 = 0;
        this.g0 = null;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = new float[]{-1.0f, -1.0f};
        this.k0 = new uo5[]{null, null};
        this.l0 = new uo5[]{null, null};
        this.m0 = -1;
        this.n0 = -1;
        arrayList.add(eo5Var);
        arrayList.add(eo5Var2);
        arrayList.add(eo5Var3);
        arrayList.add(eo5Var4);
        arrayList.add(eo5Var6);
        arrayList.add(eo5Var7);
        arrayList.add(eo5Var8);
        arrayList.add(eo5Var5);
    }

    public final void A() {
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((eo5) arrayList.get(i)).j();
        }
    }

    public final void B() {
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            eo5 eo5Var = (eo5) arrayList.get(i);
            eo5Var.c = false;
            eo5Var.b = 0;
        }
    }

    public void C(l45 l45Var) {
        this.H.k();
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.O.k();
        this.M.k();
        this.N.k();
    }

    public final void D(int i) {
        this.Z = i;
        this.D = i > 0;
    }

    public final void E(int i, int i2) {
        if (this.j) {
            return;
        }
        this.H.l(i);
        this.J.l(i2);
        this.X = i;
        this.T = i2 - i;
        this.j = true;
    }

    public final void F(int i, int i2) {
        if (this.k) {
            return;
        }
        this.I.l(i);
        this.K.l(i2);
        this.Y = i;
        this.U = i2 - i;
        if (this.D) {
            this.L.l(i + this.Z);
        }
        this.k = true;
    }

    public final void G(int i) {
        this.U = i;
        int i2 = this.b0;
        if (i < i2) {
            this.U = i2;
        }
    }

    public final void H(int i) {
        this.o0[0] = i;
    }

    public final void I(int i) {
        this.o0[1] = i;
    }

    public final void J(int i) {
        this.T = i;
        int i2 = this.a0;
        if (i < i2) {
            this.T = i2;
        }
    }

    public void K(boolean z, boolean z2) {
        int i;
        int i2;
        tga tgaVar = this.d;
        boolean z3 = z & tgaVar.g;
        k2n k2nVar = this.e;
        boolean z4 = z2 & k2nVar.g;
        int i3 = tgaVar.h.g;
        int i4 = k2nVar.h.g;
        int i5 = tgaVar.i.g;
        int i6 = k2nVar.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.X = i3;
        }
        if (z4) {
            this.Y = i4;
        }
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.o0;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.T)) {
                i8 = i2;
            }
            this.T = i8;
            int i10 = this.a0;
            if (i8 < i10) {
                this.T = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.U)) {
                i9 = i;
            }
            this.U = i9;
            int i11 = this.b0;
            if (i9 < i11) {
                this.U = i11;
            }
        }
    }

    public void L(jfc jfcVar, boolean z) {
        int i;
        int i2;
        k2n k2nVar;
        tga tgaVar;
        jfcVar.getClass();
        int iN = jfc.n(this.H);
        int iN2 = jfc.n(this.I);
        int iN3 = jfc.n(this.J);
        int iN4 = jfc.n(this.K);
        if (z && (tgaVar = this.d) != null) {
            e37 e37Var = tgaVar.h;
            if (e37Var.j) {
                e37 e37Var2 = tgaVar.i;
                if (e37Var2.j) {
                    iN = e37Var.g;
                    iN3 = e37Var2.g;
                }
            }
        }
        if (z && (k2nVar = this.e) != null) {
            e37 e37Var3 = k2nVar.h;
            if (e37Var3.j) {
                e37 e37Var4 = k2nVar.i;
                if (e37Var4.j) {
                    iN2 = e37Var3.g;
                    iN4 = e37Var4.g;
                }
            }
        }
        int i3 = iN4 - iN2;
        if (iN3 - iN < 0 || i3 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i4 = iN3 - iN;
        int i5 = iN4 - iN2;
        this.X = iN;
        this.Y = iN2;
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.o0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.T)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.U)) {
            i5 = i;
        }
        this.T = i4;
        this.U = i5;
        int i7 = this.b0;
        if (i5 < i7) {
            this.U = i7;
        }
        int i8 = this.a0;
        if (i4 < i8) {
            this.T = i8;
        } else {
            i8 = i4;
        }
        int i9 = this.u;
        if (i9 > 0 && i6 == 3) {
            this.T = Math.min(i8, i9);
        }
        int i10 = this.x;
        if (i10 > 0 && iArr[1] == 3) {
            this.U = Math.min(this.U, i10);
        }
        int i11 = this.T;
        if (i4 != i11) {
            this.h = i11;
        }
        int i12 = this.U;
        if (i5 != i12) {
            this.i = i12;
        }
    }

    public final void a(vo5 vo5Var, jfc jfcVar, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            rm5.l(vo5Var, jfcVar, this);
            hashSet.remove(this);
            b(jfcVar, vo5Var.R(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.H.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((eo5) it.next()).d.a(vo5Var, jfcVar, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.J.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((eo5) it2.next()).d.a(vo5Var, jfcVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.I.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((eo5) it3.next()).d.a(vo5Var, jfcVar, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.K.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((eo5) it4.next()).d.a(vo5Var, jfcVar, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.L.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((eo5) it5.next()).d.a(vo5Var, jfcVar, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x040a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0413 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0176  */
    /* JADX WARN: Type inference failed for: r17v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r18v23 */
    /* JADX WARN: Type inference failed for: r18v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r58v0, types: [uo5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(defpackage.jfc r59, boolean r60) {
        /*
            Method dump skipped, instructions count: 1895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uo5.b(jfc, boolean):void");
    }

    public boolean c() {
        return this.f0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:272:0x044a A[PHI: r0
      0x044a: PHI (r0v19 int) = (r0v18 int), (r0v23 int), (r0v23 int), (r0v23 int) binds: [B:265:0x043a, B:267:0x0440, B:268:0x0442, B:270:0x0446] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x048c A[PHI: r6 r7 r14 r34
      0x048c: PHI (r6v11 pvj) = (r6v1 pvj), (r6v1 pvj), (r6v12 pvj) binds: [B:293:0x0498, B:295:0x04a4, B:290:0x0485] A[DONT_GENERATE, DONT_INLINE]
      0x048c: PHI (r7v27 pvj) = (r7v2 pvj), (r7v2 pvj), (r7v28 pvj) binds: [B:293:0x0498, B:295:0x04a4, B:290:0x0485] A[DONT_GENERATE, DONT_INLINE]
      0x048c: PHI (r14v8 eo5) = (r14v1 eo5), (r14v1 eo5), (r14v9 eo5) binds: [B:293:0x0498, B:295:0x04a4, B:290:0x0485] A[DONT_GENERATE, DONT_INLINE]
      0x048c: PHI (r34v10 boolean) = (r34v2 boolean), (r34v2 boolean), (r34v11 boolean) binds: [B:293:0x0498, B:295:0x04a4, B:290:0x0485] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0505  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.jfc r30, boolean r31, boolean r32, boolean r33, boolean r34, defpackage.pvj r35, defpackage.pvj r36, int r37, boolean r38, defpackage.eo5 r39, defpackage.eo5 r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, int r51, int r52, int r53, int r54, float r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uo5.d(jfc, boolean, boolean, boolean, boolean, pvj, pvj, int, boolean, eo5, eo5, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(int i, uo5 uo5Var, int i2, int i3) {
        boolean z;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2 || i2 == 4) {
                    e(2, uo5Var, i2, 0);
                    e(4, uo5Var, i2, 0);
                    i(7).a(uo5Var.i(i2), 0);
                    return;
                } else {
                    if (i2 == 3 || i2 == 5) {
                        e(3, uo5Var, i2, 0);
                        e(5, uo5Var, i2, 0);
                        i(7).a(uo5Var.i(i2), 0);
                        return;
                    }
                    return;
                }
            }
            eo5 eo5VarI = i(2);
            eo5 eo5VarI2 = i(4);
            eo5 eo5VarI3 = i(3);
            eo5 eo5VarI4 = i(5);
            boolean z2 = true;
            if ((eo5VarI == null || !eo5VarI.h()) && (eo5VarI2 == null || !eo5VarI2.h())) {
                e(2, uo5Var, 2, 0);
                e(4, uo5Var, 4, 0);
                z = true;
            } else {
                z = false;
            }
            if ((eo5VarI3 == null || !eo5VarI3.h()) && (eo5VarI4 == null || !eo5VarI4.h())) {
                e(3, uo5Var, 3, 0);
                e(5, uo5Var, 5, 0);
            } else {
                z2 = false;
            }
            if (!z) {
                if (z2) {
                    i(9).a(uo5Var.i(9), 0);
                    return;
                }
                return;
            } else if (z2) {
                i(7).a(uo5Var.i(7), 0);
                return;
            } else {
                i(8).a(uo5Var.i(8), 0);
                return;
            }
        }
        if (i == 8 && (i2 == 2 || i2 == 4)) {
            eo5 eo5VarI5 = i(2);
            eo5 eo5VarI6 = uo5Var.i(i2);
            eo5 eo5VarI7 = i(4);
            eo5VarI5.a(eo5VarI6, 0);
            eo5VarI7.a(eo5VarI6, 0);
            i(8).a(eo5VarI6, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            eo5 eo5VarI8 = uo5Var.i(i2);
            i(3).a(eo5VarI8, 0);
            i(5).a(eo5VarI8, 0);
            i(9).a(eo5VarI8, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            i(2).a(uo5Var.i(2), 0);
            i(4).a(uo5Var.i(4), 0);
            i(8).a(uo5Var.i(i2), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            i(3).a(uo5Var.i(3), 0);
            i(5).a(uo5Var.i(5), 0);
            i(9).a(uo5Var.i(i2), 0);
            return;
        }
        eo5 eo5VarI9 = i(i);
        eo5 eo5VarI10 = uo5Var.i(i2);
        if (eo5VarI9.i(eo5VarI10)) {
            if (i == 6) {
                eo5 eo5VarI11 = i(3);
                eo5 eo5VarI12 = i(5);
                if (eo5VarI11 != null) {
                    eo5VarI11.j();
                }
                if (eo5VarI12 != null) {
                    eo5VarI12.j();
                }
            } else if (i == 3 || i == 5) {
                eo5 eo5VarI13 = i(6);
                if (eo5VarI13 != null) {
                    eo5VarI13.j();
                }
                eo5 eo5VarI14 = i(7);
                if (eo5VarI14.f != eo5VarI10) {
                    eo5VarI14.j();
                }
                eo5 eo5VarF = i(i).f();
                eo5 eo5VarI15 = i(9);
                if (eo5VarI15.h()) {
                    eo5VarF.j();
                    eo5VarI15.j();
                }
            } else if (i == 2 || i == 4) {
                eo5 eo5VarI16 = i(7);
                if (eo5VarI16.f != eo5VarI10) {
                    eo5VarI16.j();
                }
                eo5 eo5VarF2 = i(i).f();
                eo5 eo5VarI17 = i(8);
                if (eo5VarI17.h()) {
                    eo5VarF2.j();
                    eo5VarI17.j();
                }
            }
            eo5VarI9.a(eo5VarI10, i3);
        }
    }

    public final void f(eo5 eo5Var, eo5 eo5Var2, int i) {
        if (eo5Var.d == this) {
            e(eo5Var.e, eo5Var2.d, eo5Var2.e, i);
        }
    }

    public final void g(jfc jfcVar) {
        jfcVar.k(this.H);
        jfcVar.k(this.I);
        jfcVar.k(this.J);
        jfcVar.k(this.K);
        if (this.Z > 0) {
            jfcVar.k(this.L);
        }
    }

    public final void h() {
        if (this.d == null) {
            tga tgaVar = new tga(this);
            tgaVar.h.e = 4;
            tgaVar.i.e = 5;
            tgaVar.f = 0;
            this.d = tgaVar;
        }
        if (this.e == null) {
            k2n k2nVar = new k2n(this);
            e37 e37Var = new e37(k2nVar);
            k2nVar.k = e37Var;
            k2nVar.l = null;
            k2nVar.h.e = 6;
            k2nVar.i.e = 7;
            e37Var.e = 8;
            k2nVar.f = 1;
            this.e = k2nVar;
        }
    }

    public eo5 i(int i) {
        switch (vep.A(i)) {
            case 0:
                return null;
            case 1:
                return this.H;
            case 2:
                return this.I;
            case 3:
                return this.J;
            case 4:
                return this.K;
            case 5:
                return this.L;
            case 6:
                return this.O;
            case 7:
                return this.M;
            case 8:
                return this.N;
            default:
                qp2.g(u35.u(i));
                return null;
        }
    }

    public final int j(int i) {
        int[] iArr = this.o0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final uo5 l(int i) {
        eo5 eo5Var;
        eo5 eo5Var2;
        if (i != 0) {
            if (i == 1 && (eo5Var2 = (eo5Var = this.K).f) != null && eo5Var2.f == eo5Var) {
                return eo5Var2.d;
            }
            return null;
        }
        eo5 eo5Var3 = this.J;
        eo5 eo5Var4 = eo5Var3.f;
        if (eo5Var4 == null || eo5Var4.f != eo5Var3) {
            return null;
        }
        return eo5Var4.d;
    }

    public final uo5 m(int i) {
        eo5 eo5Var;
        eo5 eo5Var2;
        if (i != 0) {
            if (i == 1 && (eo5Var2 = (eo5Var = this.I).f) != null && eo5Var2.f == eo5Var) {
                return eo5Var2.d;
            }
            return null;
        }
        eo5 eo5Var3 = this.H;
        eo5 eo5Var4 = eo5Var3.f;
        if (eo5Var4 == null || eo5Var4.f != eo5Var3) {
            return null;
        }
        return eo5Var4.d;
    }

    public final int n() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.T;
    }

    public final int o() {
        vo5 vo5Var = this.S;
        return vo5Var != null ? vo5Var.w0 + this.X : this.X;
    }

    public final int p() {
        vo5 vo5Var = this.S;
        return vo5Var != null ? vo5Var.x0 + this.Y : this.Y;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(int r5) {
        /*
            r4 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            if (r5 != 0) goto L1b
            eo5 r5 = r4.H
            eo5 r5 = r5.f
            if (r5 == 0) goto Ld
            r5 = r2
            goto Le
        Ld:
            r5 = r1
        Le:
            eo5 r4 = r4.J
            eo5 r4 = r4.f
            if (r4 == 0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = r1
        L17:
            int r5 = r5 + r4
            if (r5 >= r0) goto L3b
            goto L3a
        L1b:
            eo5 r5 = r4.I
            eo5 r5 = r5.f
            if (r5 == 0) goto L23
            r5 = r2
            goto L24
        L23:
            r5 = r1
        L24:
            eo5 r3 = r4.K
            eo5 r3 = r3.f
            if (r3 == 0) goto L2c
            r3 = r2
            goto L2d
        L2c:
            r3 = r1
        L2d:
            int r5 = r5 + r3
            eo5 r4 = r4.L
            eo5 r4 = r4.f
            if (r4 == 0) goto L36
            r4 = r2
            goto L37
        L36:
            r4 = r1
        L37:
            int r5 = r5 + r4
            if (r5 >= r0) goto L3b
        L3a:
            return r2
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uo5.q(int):boolean");
    }

    public final boolean r(int i, int i2) {
        eo5 eo5Var;
        eo5 eo5Var2;
        eo5 eo5Var3;
        eo5 eo5Var4;
        if (i == 0) {
            eo5 eo5Var5 = this.H;
            eo5 eo5Var6 = eo5Var5.f;
            if (eo5Var6 == null || !eo5Var6.c || (eo5Var4 = (eo5Var3 = this.J).f) == null || !eo5Var4.c) {
                return false;
            }
            return (eo5Var4.d() - eo5Var3.e()) - (eo5Var5.e() + eo5Var5.f.d()) >= i2;
        }
        eo5 eo5Var7 = this.I;
        eo5 eo5Var8 = eo5Var7.f;
        if (eo5Var8 == null || !eo5Var8.c || (eo5Var2 = (eo5Var = this.K).f) == null || !eo5Var2.c) {
            return false;
        }
        return (eo5Var2.d() - eo5Var.e()) - (eo5Var7.e() + eo5Var7.f.d()) >= i2;
    }

    public final void s(int i, int i2, int i3, int i4, uo5 uo5Var) {
        i(i).b(uo5Var.i(i2), i3, i4, true);
    }

    public final boolean t(int i) {
        eo5 eo5Var;
        eo5 eo5Var2;
        int i2 = i << 1;
        eo5[] eo5VarArr = this.P;
        eo5 eo5Var3 = eo5VarArr[i2];
        eo5 eo5Var4 = eo5Var3.f;
        return (eo5Var4 == null || eo5Var4.f == eo5Var3 || (eo5Var2 = (eo5Var = eo5VarArr[i2 + 1]).f) == null || eo5Var2.f != eo5Var) ? false : true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.g0 != null ? z1m.l(new StringBuilder("id: "), this.g0, " ") : "");
        sb.append("(");
        sb.append(this.X);
        sb.append(", ");
        sb.append(this.Y);
        sb.append(") - (");
        sb.append(this.T);
        sb.append(" x ");
        return p3p.k(this.U, ")", sb);
    }

    public final boolean u() {
        eo5 eo5Var = this.H;
        eo5 eo5Var2 = eo5Var.f;
        if (eo5Var2 != null && eo5Var2.f == eo5Var) {
            return true;
        }
        eo5 eo5Var3 = this.J;
        eo5 eo5Var4 = eo5Var3.f;
        return eo5Var4 != null && eo5Var4.f == eo5Var3;
    }

    public final boolean v() {
        eo5 eo5Var = this.I;
        eo5 eo5Var2 = eo5Var.f;
        if (eo5Var2 != null && eo5Var2.f == eo5Var) {
            return true;
        }
        eo5 eo5Var3 = this.K;
        eo5 eo5Var4 = eo5Var3.f;
        return eo5Var4 != null && eo5Var4.f == eo5Var3;
    }

    public final boolean w() {
        return this.g && this.f0 != 8;
    }

    public boolean x() {
        if (this.j) {
            return true;
        }
        return this.H.c && this.J.c;
    }

    public boolean y() {
        if (this.k) {
            return true;
        }
        return this.I.c && this.K.c;
    }

    public void z() {
        this.H.j();
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.S = null;
        this.C = Float.NaN;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        int[] iArr = this.o0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.e0 = null;
        this.f0 = 0;
        this.h0 = 0;
        this.i0 = 0;
        float[] fArr = this.j0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.n = -1;
        this.o = -1;
        int[] iArr2 = this.B;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.q = 0;
        this.r = 0;
        this.v = 1.0f;
        this.y = 1.0f;
        this.u = Integer.MAX_VALUE;
        this.x = Integer.MAX_VALUE;
        this.t = 0;
        this.w = 0;
        this.z = -1;
        this.A = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.E = false;
        boolean[] zArr2 = this.R;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr3 = this.s;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.i = -1;
    }
}
