package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class vo5 extends uo5 {
    public dr4[] A0;
    public dr4[] B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public WeakReference F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public final HashSet J0;
    public final cb3 K0;
    public ArrayList p0 = new ArrayList();
    public final d5o q0;
    public final d37 r0;
    public int s0;
    public n5h t0;
    public boolean u0;
    public final jfc v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    public vo5() {
        d5o d5oVar = new d5o();
        d5oVar.a = new ArrayList();
        d5oVar.b = new cb3();
        d5oVar.c = this;
        this.q0 = d5oVar;
        d37 d37Var = new d37();
        d37Var.a = true;
        d37Var.b = true;
        d37Var.e = new ArrayList();
        d37Var.g = null;
        d37Var.h = new cb3();
        d37Var.f = new ArrayList();
        d37Var.c = this;
        d37Var.d = this;
        this.r0 = d37Var;
        this.t0 = null;
        this.u0 = false;
        this.v0 = new jfc();
        this.y0 = 0;
        this.z0 = 0;
        this.A0 = new dr4[4];
        this.B0 = new dr4[4];
        this.C0 = 257;
        this.D0 = false;
        this.E0 = false;
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = new HashSet();
        this.K0 = new cb3();
    }

    public static void Q(uo5 uo5Var, n5h n5hVar, cb3 cb3Var) {
        int i;
        int i2;
        if (n5hVar == null) {
            return;
        }
        int i3 = uo5Var.f0;
        int[] iArr = uo5Var.s;
        if (i3 == 8 || (uo5Var instanceof r5a) || (uo5Var instanceof u33)) {
            cb3Var.e = 0;
            cb3Var.f = 0;
            return;
        }
        int[] iArr2 = uo5Var.o0;
        cb3Var.a = iArr2[0];
        cb3Var.b = iArr2[1];
        cb3Var.c = uo5Var.n();
        cb3Var.d = uo5Var.k();
        cb3Var.i = false;
        cb3Var.j = (byte) 0;
        boolean z = cb3Var.a == 3;
        boolean z2 = cb3Var.b == 3;
        boolean z3 = z && uo5Var.V > 0.0f;
        boolean z4 = z2 && uo5Var.V > 0.0f;
        if (z && uo5Var.q(0) && uo5Var.q == 0 && !z3) {
            cb3Var.a = 2;
            if (z2 && uo5Var.r == 0) {
                cb3Var.a = 1;
            }
            z = false;
        }
        if (z2 && uo5Var.q(1) && uo5Var.r == 0 && !z4) {
            cb3Var.b = 2;
            if (z && uo5Var.q == 0) {
                cb3Var.b = 1;
            }
            z2 = false;
        }
        if (uo5Var.x()) {
            cb3Var.a = 1;
            z = false;
        }
        if (uo5Var.y()) {
            cb3Var.b = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                cb3Var.a = 1;
            } else if (!z2) {
                if (cb3Var.b == 1) {
                    i2 = cb3Var.d;
                } else {
                    cb3Var.a = 2;
                    n5hVar.d(uo5Var, cb3Var);
                    i2 = cb3Var.f;
                }
                cb3Var.a = 1;
                cb3Var.c = (int) (uo5Var.V * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                cb3Var.b = 1;
            } else if (!z) {
                if (cb3Var.a == 1) {
                    i = cb3Var.c;
                } else {
                    cb3Var.b = 2;
                    n5hVar.d(uo5Var, cb3Var);
                    i = cb3Var.e;
                }
                cb3Var.b = 1;
                int i4 = uo5Var.W;
                float f = uo5Var.V;
                float f2 = i;
                if (i4 == -1) {
                    cb3Var.d = (int) (f2 / f);
                } else {
                    cb3Var.d = (int) (f * f2);
                }
            }
        }
        n5hVar.d(uo5Var, cb3Var);
        uo5Var.J(cb3Var.e);
        uo5Var.G(cb3Var.f);
        uo5Var.D = cb3Var.h;
        uo5Var.D(cb3Var.g);
        cb3Var.j = (byte) 0;
    }

    @Override // defpackage.uo5
    public final void C(l45 l45Var) {
        super.C(l45Var);
        int size = this.p0.size();
        for (int i = 0; i < size; i++) {
            ((uo5) this.p0.get(i)).C(l45Var);
        }
    }

    @Override // defpackage.uo5
    public final void K(boolean z, boolean z2) {
        super.K(z, z2);
        int size = this.p0.size();
        for (int i = 0; i < size; i++) {
            ((uo5) this.p0.get(i)).K(z, z2);
        }
    }

    public final void M(uo5 uo5Var, int i) {
        if (i == 0) {
            int i2 = this.y0 + 1;
            dr4[] dr4VarArr = this.B0;
            if (i2 >= dr4VarArr.length) {
                dr4VarArr = (dr4[]) Arrays.copyOf(dr4VarArr, dr4VarArr.length << 1);
                this.B0 = dr4VarArr;
            }
            int i3 = this.y0;
            dr4VarArr[i3] = new dr4(uo5Var, 0, this.u0);
            this.y0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.z0 + 1;
            dr4[] dr4VarArr2 = this.A0;
            if (i4 >= dr4VarArr2.length) {
                dr4VarArr2 = (dr4[]) Arrays.copyOf(dr4VarArr2, dr4VarArr2.length << 1);
                this.A0 = dr4VarArr2;
            }
            int i5 = this.z0;
            dr4VarArr2[i5] = new dr4(uo5Var, 1, this.u0);
            this.z0 = i5 + 1;
        }
    }

    public final void N(jfc jfcVar) {
        vo5 vo5Var;
        jfc jfcVar2;
        boolean zR = R(64);
        b(jfcVar, zR);
        int size = this.p0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            uo5 uo5Var = (uo5) this.p0.get(i);
            boolean[] zArr = uo5Var.R;
            zArr[0] = false;
            zArr[1] = false;
            if (uo5Var instanceof u33) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                uo5 uo5Var2 = (uo5) this.p0.get(i2);
                if (uo5Var2 instanceof u33) {
                    u33 u33Var = (u33) uo5Var2;
                    for (int i3 = 0; i3 < u33Var.q0; i3++) {
                        uo5 uo5Var3 = u33Var.p0[i3];
                        if (u33Var.s0 || uo5Var3.c()) {
                            int i4 = u33Var.r0;
                            if (i4 == 0 || i4 == 1) {
                                uo5Var3.R[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                uo5Var3.R[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.J0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            uo5 uo5Var4 = (uo5) this.p0.get(i5);
            uo5Var4.getClass();
            boolean z2 = uo5Var4 instanceof g99;
            if (z2 || (uo5Var4 instanceof r5a)) {
                if (z2) {
                    hashSet.add(uo5Var4);
                } else {
                    uo5Var4.b(jfcVar, zR);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g99 g99Var = (g99) ((uo5) it.next());
                for (int i6 = 0; i6 < g99Var.q0; i6++) {
                    if (hashSet.contains(g99Var.p0[i6])) {
                        g99Var.b(jfcVar, zR);
                        hashSet.remove(g99Var);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((uo5) it2.next()).b(jfcVar, zR);
                }
                hashSet.clear();
            }
        }
        if (jfc.q) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                uo5 uo5Var5 = (uo5) this.p0.get(i7);
                uo5Var5.getClass();
                if (!(uo5Var5 instanceof g99) && !(uo5Var5 instanceof r5a)) {
                    hashSet2.add(uo5Var5);
                }
            }
            vo5Var = this;
            jfcVar2 = jfcVar;
            vo5Var.a(this, jfcVar2, hashSet2, this.o0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                uo5 uo5Var6 = (uo5) it3.next();
                rm5.l(vo5Var, jfcVar2, uo5Var6);
                uo5Var6.b(jfcVar2, zR);
            }
        } else {
            vo5Var = this;
            jfcVar2 = jfcVar;
            for (int i8 = 0; i8 < size; i8++) {
                uo5 uo5Var7 = (uo5) vo5Var.p0.get(i8);
                if (uo5Var7 instanceof vo5) {
                    int[] iArr = uo5Var7.o0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        uo5Var7.H(1);
                    }
                    if (i10 == 2) {
                        uo5Var7.I(1);
                    }
                    uo5Var7.b(jfcVar2, zR);
                    if (i9 == 2) {
                        uo5Var7.H(i9);
                    }
                    if (i10 == 2) {
                        uo5Var7.I(i10);
                    }
                } else {
                    rm5.l(vo5Var, jfcVar2, uo5Var7);
                    if (!(uo5Var7 instanceof g99) && !(uo5Var7 instanceof r5a)) {
                        uo5Var7.b(jfcVar2, zR);
                    }
                }
            }
        }
        if (vo5Var.y0 > 0) {
            nb6.e(vo5Var, jfcVar2, null, 0);
        }
        if (vo5Var.z0 > 0) {
            nb6.e(vo5Var, jfcVar2, null, 1);
        }
    }

    public final boolean O(int i, boolean z) {
        boolean z2;
        d37 d37Var = this.r0;
        ArrayList arrayList = (ArrayList) d37Var.e;
        vo5 vo5Var = (vo5) d37Var.c;
        boolean z3 = false;
        int iJ = vo5Var.j(0);
        int iJ2 = vo5Var.j(1);
        int iO = vo5Var.o();
        int iP = vo5Var.p();
        if (z && (iJ == 2 || iJ2 == 2)) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                f1o f1oVar = (f1o) obj;
                if (f1oVar.f == i && !f1oVar.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && iJ == 2) {
                    vo5Var.H(1);
                    vo5Var.J(d37Var.d(vo5Var, 0));
                    vo5Var.d.e.d(vo5Var.n());
                }
            } else if (z && iJ2 == 2) {
                vo5Var.I(1);
                vo5Var.G(d37Var.d(vo5Var, 1));
                vo5Var.e.e.d(vo5Var.k());
            }
        }
        int[] iArr = vo5Var.o0;
        if (i == 0) {
            int i3 = iArr[0];
            if (i3 == 1 || i3 == 4) {
                int iN = vo5Var.n() + iO;
                vo5Var.d.i.d(iN);
                vo5Var.d.e.d(iN - iO);
                z2 = true;
            }
            z2 = false;
        } else {
            int i4 = iArr[1];
            if (i4 == 1 || i4 == 4) {
                int iK = vo5Var.k() + iP;
                vo5Var.e.i.d(iK);
                vo5Var.e.e.d(iK - iP);
                z2 = true;
            }
            z2 = false;
        }
        d37Var.v();
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList.get(i5);
            i5++;
            f1o f1oVar2 = (f1o) obj2;
            if (f1oVar2.f == i && (f1oVar2.b != vo5Var || f1oVar2.g)) {
                f1oVar2.e();
            }
        }
        int size3 = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size3) {
                z3 = true;
                break;
            }
            Object obj3 = arrayList.get(i6);
            i6++;
            f1o f1oVar3 = (f1o) obj3;
            if (f1oVar3.f == i && (z2 || f1oVar3.b != vo5Var)) {
                if (!f1oVar3.h.j || !f1oVar3.i.j || (!(f1oVar3 instanceof er4) && !f1oVar3.e.j)) {
                    break;
                }
            }
        }
        vo5Var.H(iJ);
        vo5Var.I(iJ2);
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:329:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0664 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x07e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x07f3 A[LOOP:14: B:455:0x07f1->B:456:0x07f3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x08b4 A[PHI: r0 r13
      0x08b4: PHI (r0v18 boolean) = (r0v17 boolean), (r0v21 boolean), (r0v21 boolean), (r0v21 boolean) binds: [B:474:0x0881, B:482:0x089e, B:483:0x08a0, B:485:0x08a6] A[DONT_GENERATE, DONT_INLINE]
      0x08b4: PHI (r13v9 boolean) = (r13v8 boolean), (r13v13 boolean), (r13v13 boolean), (r13v13 boolean) binds: [B:474:0x0881, B:482:0x089e, B:483:0x08a0, B:485:0x08a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:489:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x08b9 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P() {
        /*
            Method dump skipped, instructions count: 2261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vo5.P():void");
    }

    public final boolean R(int i) {
        return (this.C0 & i) == i;
    }

    @Override // defpackage.uo5
    public final void z() {
        this.v0.t();
        this.w0 = 0;
        this.x0 = 0;
        this.p0.clear();
        super.z();
    }
}
