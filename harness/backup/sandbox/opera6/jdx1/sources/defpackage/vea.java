package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class vea implements nkd, nfa {
    public final rq6 a;
    public final uq6 b;
    public final qq6 c;
    public final pl6 d;
    public final em7 e;
    public final am7 f;
    public final i06 g;
    public final ro9 h;
    public final l45 i;
    public final IdentityHashMap j;
    public final z4k k;
    public final ir5 l;
    public final boolean m;
    public final boolean n;
    public final fjg o;
    public final xm5 p = new xm5(this);
    public mkd q;
    public int r;
    public fyl s;
    public sfa[] t;
    public sfa[] u;
    public int v;
    public vh5 w;

    /* JADX WARN: Multi-variable type inference failed */
    public vea(rq6 rq6Var, uq6 uq6Var, qq6 qq6Var, pl6 pl6Var, em7 em7Var, am7 am7Var, i06 i06Var, ro9 ro9Var, l45 l45Var, ir5 ir5Var, boolean z, int i, fjg fjgVar) {
        this.a = rq6Var;
        this.b = uq6Var;
        this.c = qq6Var;
        this.d = pl6Var;
        this.e = em7Var;
        this.f = am7Var;
        this.g = i06Var;
        this.h = ro9Var;
        this.i = l45Var;
        this.l = ir5Var;
        this.m = z;
        this.n = i;
        this.o = fjgVar;
        ir5Var.getClass();
        a1b a1bVar = h1b.b;
        csh cshVar = csh.e;
        this.w = new vh5(cshVar, cshVar);
        this.j = new IdentityHashMap();
        this.k = new z4k((byte) 6);
        this.t = new sfa[0];
        this.u = new sfa[0];
    }

    public static oj9 i(oj9 oj9Var, oj9 oj9Var2, boolean z) {
        lxd lxdVar;
        int i;
        String str;
        String str2;
        h1b h1bVar;
        int i2;
        int i3;
        String str3;
        int i4;
        a1b a1bVar = h1b.b;
        h1b h1bVar2 = csh.e;
        int i5 = -1;
        if (oj9Var2 != null) {
            str2 = oj9Var2.k;
            lxdVar = oj9Var2.l;
            i2 = oj9Var2.F;
            i = oj9Var2.e;
            i3 = oj9Var2.f;
            str = oj9Var2.d;
            str3 = oj9Var2.b;
            h1bVar = oj9Var2.c;
        } else {
            String strU = tym.u(oj9Var.k, 1);
            lxdVar = oj9Var.l;
            if (z) {
                i2 = oj9Var.F;
                i = oj9Var.e;
                i3 = oj9Var.f;
                str = oj9Var.d;
                str3 = oj9Var.b;
                str2 = strU;
                h1bVar = oj9Var.c;
            } else {
                i = 0;
                str = null;
                str2 = strU;
                h1bVar = h1bVar2;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        String strE = dzd.e(str2);
        if (z) {
            int i6 = oj9Var.h;
            i5 = oj9Var.i;
            i4 = i6;
        } else {
            i4 = -1;
        }
        nj9 nj9Var = new nj9();
        nj9Var.a = oj9Var.a;
        nj9Var.b = str3;
        nj9Var.c = h1b.s(h1bVar);
        nj9Var.l = dzd.p(oj9Var.m);
        nj9Var.m = dzd.p(strE);
        nj9Var.j = str2;
        nj9Var.k = lxdVar;
        nj9Var.h = i4;
        nj9Var.i = i5;
        nj9Var.E = i2;
        nj9Var.e = i;
        nj9Var.f = i3;
        nj9Var.d = str;
        return new oj9(nj9Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0191  */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // defpackage.nkd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(defpackage.bj8[] r40, boolean[] r41, defpackage.vhi[] r42, boolean[] r43, long r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vea.a(bj8[], boolean[], vhi[], boolean[], long):long");
    }

    @Override // defpackage.nkd
    public final long b(long j, uwi uwiVar) {
        sfa[] sfaVarArr = this.u;
        int length = sfaVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            sfa sfaVar = sfaVarArr[i];
            if (sfaVar.A == 2) {
                tea teaVar = sfaVar.d;
                uq6 uq6Var = teaVar.g;
                int selectedIndex = teaVar.r.getSelectedIndex();
                Uri[] uriArr = teaVar.e;
                efa efaVarA = (selectedIndex >= uriArr.length || selectedIndex == -1) ? null : uq6Var.a(true, uriArr[teaVar.r.getSelectedIndexInTrackGroup()]);
                if (efaVarA != null) {
                    h1b h1bVar = efaVarA.r;
                    if (!h1bVar.isEmpty()) {
                        long j2 = efaVarA.h - uq6Var.n;
                        long j3 = j - j2;
                        int iC = tym.c(h1bVar, Long.valueOf(j3), true);
                        long j4 = ((bfa) h1bVar.get(iC)).e;
                        return uwiVar.a(j3, j4, (!efaVarA.c || iC == h1bVar.size() - 1) ? j4 : ((bfa) h1bVar.get(iC + 1)).e) + j2;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    @Override // defpackage.nfa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.net.Uri r17, bp r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sfa[] r2 = r0.t
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto L7f
            r8 = r2[r6]
            tea r9 = r8.d
            android.net.Uri[] r10 = r9.e
            boolean r11 = defpackage.tym.l(r10, r1)
            if (r11 == 0) goto L78
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L3a
            i06 r8 = r8.i
            bj8 r13 = r9.r
            z16 r13 = n6h.f(r13)
            r8.getClass()
            r8 = r18
            asc r13 = i06.g(r13, r8)
            if (r13 == 0) goto L3a
            byte r14 = r13.a
            r15 = 2
            if (r14 != r15) goto L3a
            int r13 = r13.b
            long r13 = (long) r13
            goto L3b
        L3a:
            r13 = r11
        L3b:
            r15 = 0
        L3c:
            int r4 = r10.length
            r5 = -1
            if (r15 >= r4) goto L4b
            r4 = r10[r15]
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L4c
            int r15 = r15 + 1
            goto L3c
        L4b:
            r15 = r5
        L4c:
            if (r15 == r5) goto L78
            bj8 r4 = r9.r
            int r4 = r4.indexOf(r15)
            if (r4 == r5) goto L78
            r9.o = r1
            int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r5 == 0) goto L7a
            bj8 r5 = r9.r
            boolean r4 = r5.c(r4, r13)
            if (r4 == 0) goto L7a
            uq6 r4 = r9.g
            java.util.HashMap r4 = r4.d
            java.lang.Object r4 = r4.get(r1)
            tq6 r4 = (defpackage.tq6) r4
            if (r4 == 0) goto L75
            boolean r4 = r4.a(r13)
            goto L76
        L75:
            r4 = 0
        L76:
            if (r4 == 0) goto L7a
        L78:
            r4 = 1
            goto L7b
        L7a:
            r4 = 0
        L7b:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        L7f:
            mkd r1 = r0.q
            r1.j(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vea.c(android.net.Uri, bp, boolean):boolean");
    }

    @Override // defpackage.nfa
    public final void d() {
        for (sfa sfaVar : this.t) {
            qb7 qb7Var = sfaVar.j;
            tea teaVar = sfaVar.d;
            ArrayList arrayList = sfaVar.n;
            if (!arrayList.isEmpty()) {
                uea ueaVar = (uea) sfe.c0(arrayList);
                int iB = teaVar.b(ueaVar);
                int i = ueaVar.o;
                if (iB == 1) {
                    if (!ueaVar.f()) {
                        z4o.H(i != -1);
                        efa efaVarA = teaVar.g.a(false, teaVar.e[teaVar.h.b(ueaVar.d)]);
                        efaVarA.getClass();
                        h1b h1bVar = efaVarA.r;
                        int i2 = (int) (ueaVar.j - efaVarA.k);
                        ueaVar.K = i2 < 0 ? 0L : ((zea) (i2 < h1bVar.size() ? ((bfa) h1bVar.get(i2)).m : efaVarA.s).get(i)).c;
                    }
                } else if (iB == 0) {
                    sfaVar.r.post(new zr9(sfaVar, ueaVar, (byte) 3));
                } else if (iB == 2 && !sfaVar.T && qb7Var.s()) {
                    qb7Var.i();
                }
            }
        }
        this.q.j(this);
    }

    @Override // defpackage.nkd
    public final void e(long j) throws Throwable {
        for (sfa sfaVar : this.u) {
            if (sfaVar.C && !sfaVar.s()) {
                int length = sfaVar.v.length;
                for (int i = 0; i < length; i++) {
                    sfaVar.v[i].j(j, sfaVar.N[i]);
                }
            }
        }
    }

    @Override // defpackage.nkd
    public final void f(mkd mkdVar, long j) {
        rq6 rq6Var;
        boolean z;
        List list;
        List list2;
        sfa[] sfaVarArr;
        HashSet hashSet;
        int i;
        HashSet hashSet2;
        int i2;
        boolean z2;
        rq6 rq6Var2;
        int i3;
        boolean z3;
        Uri[] uriArr;
        this.q = mkdVar;
        uq6 uq6Var = this.b;
        uq6Var.e.add(this);
        ifa ifaVar = uq6Var.j;
        ifaVar.getClass();
        List list3 = ifaVar.g;
        List list4 = ifaVar.e;
        Map map = Collections.EMPTY_MAP;
        boolean zIsEmpty = list4.isEmpty();
        List list5 = ifaVar.h;
        int i4 = 0;
        this.r = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        rq6 rq6Var3 = this.a;
        boolean z4 = this.m;
        if (zIsEmpty) {
            rq6Var = rq6Var3;
            z = z4;
            list = list3;
            list2 = list5;
        } else {
            oj9 oj9Var = ifaVar.j;
            int size = list4.size();
            int[] iArr = new int[size];
            int i5 = 0;
            int i6 = 0;
            while (true) {
                list2 = list5;
                if (i5 >= list4.size()) {
                    break;
                }
                oj9 oj9Var2 = ((hfa) list4.get(i5)).b;
                int i7 = oj9Var2.v;
                String str = oj9Var2.k;
                if (i7 > 0 || tym.u(str, 2) != null) {
                    iArr[i5] = 2;
                    i6++;
                } else if (tym.u(str, 1) != null) {
                    iArr[i5] = 1;
                    i4++;
                } else {
                    iArr[i5] = -1;
                }
                i5++;
                list5 = list2;
            }
            if (i6 > 0) {
                z3 = false;
                rq6Var2 = rq6Var3;
                i3 = i6;
                z2 = true;
            } else if (i4 < size) {
                z2 = false;
                rq6Var2 = rq6Var3;
                i3 = size - i4;
                z3 = true;
            } else {
                z2 = false;
                rq6Var2 = rq6Var3;
                i3 = size;
                z3 = false;
            }
            Uri[] uriArr2 = new Uri[i3];
            oj9[] oj9VarArr = new oj9[i3];
            int[] iArr2 = new int[i3];
            int i8 = 0;
            int i9 = 0;
            while (i8 < list4.size()) {
                if (z2) {
                    uriArr = uriArr2;
                    if (iArr[i8] == 2) {
                    }
                    i8++;
                    uriArr2 = uriArr;
                } else {
                    uriArr = uriArr2;
                }
                if (!z3 || iArr[i8] != 1) {
                    hfa hfaVar = (hfa) list4.get(i8);
                    uriArr[i9] = hfaVar.a;
                    oj9VarArr[i9] = hfaVar.b;
                    iArr2[i9] = i8;
                    i9++;
                }
                i8++;
                uriArr2 = uriArr;
            }
            Uri[] uriArr3 = uriArr2;
            String str2 = oj9VarArr[0].k;
            int iT = tym.t(2, str2);
            int iT2 = tym.t(1, str2);
            boolean z5 = (iT2 == 1 || (iT2 == 0 && list3.isEmpty())) && iT <= 1 && iT2 + iT > 0;
            rq6 rq6Var4 = rq6Var2;
            list = list3;
            z = z4;
            sfa sfaVarH = h("main", (z2 || iT2 <= 0) ? 0 : 1, uriArr3, oj9VarArr, ifaVar.j, ifaVar.k, map, j);
            arrayList.add(sfaVarH);
            arrayList2.add(iArr2);
            if (z && z5) {
                ArrayList arrayList3 = new ArrayList();
                if (iT > 0) {
                    oj9[] oj9VarArr2 = new oj9[i3];
                    int i10 = 0;
                    while (i10 < i3) {
                        oj9 oj9Var3 = oj9VarArr[i10];
                        String strU = tym.u(oj9Var3.k, 2);
                        String strE = dzd.e(strU);
                        nj9 nj9Var = new nj9();
                        nj9Var.a = oj9Var3.a;
                        nj9Var.b = oj9Var3.b;
                        nj9Var.c = h1b.s(oj9Var3.c);
                        nj9Var.l = dzd.p(oj9Var3.m);
                        nj9Var.m = dzd.p(strE);
                        nj9Var.j = strU;
                        nj9Var.k = oj9Var3.l;
                        nj9Var.h = oj9Var3.h;
                        nj9Var.i = oj9Var3.i;
                        nj9Var.t = oj9Var3.u;
                        nj9Var.u = oj9Var3.v;
                        nj9Var.x = oj9Var3.y;
                        nj9Var.e = oj9Var3.e;
                        nj9Var.f = oj9Var3.f;
                        oj9VarArr2[i10] = new oj9(nj9Var);
                        i10++;
                        oj9VarArr = oj9VarArr;
                    }
                    oj9[] oj9VarArr3 = oj9VarArr;
                    arrayList3.add(new eyl("main", oj9VarArr2));
                    if (iT2 > 0 && (oj9Var != null || list.isEmpty())) {
                        arrayList3.add(new eyl("main:audio", i(oj9VarArr3[0], oj9Var, false)));
                    }
                    List list6 = ifaVar.k;
                    if (list6 != null) {
                        for (int i11 = 0; i11 < list6.size(); i11++) {
                            arrayList3.add(new eyl(sko.i(i11, "main:cc:"), rq6Var4.b((oj9) list6.get(i11))));
                        }
                    }
                    rq6Var = rq6Var4;
                } else {
                    rq6Var = rq6Var4;
                    oj9[] oj9VarArr4 = new oj9[i3];
                    for (int i12 = 0; i12 < i3; i12++) {
                        oj9VarArr4[i12] = i(oj9VarArr[i12], oj9Var, true);
                    }
                    arrayList3.add(new eyl("main", oj9VarArr4));
                }
                nj9 nj9Var2 = new nj9();
                nj9Var2.a = "ID3";
                nj9Var2.m = dzd.p("application/id3");
                eyl eylVar = new eyl("main:id3", new oj9(nj9Var2));
                arrayList3.add(eylVar);
                sfaVarH.w((eyl[]) arrayList3.toArray(new eyl[0]), arrayList3.indexOf(eylVar));
            } else {
                rq6Var = rq6Var4;
            }
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        HashSet hashSet3 = new HashSet();
        int i13 = 0;
        while (i13 < list.size()) {
            List list7 = list;
            String str3 = ((gfa) list7.get(i13)).c;
            if (hashSet3.add(str3)) {
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                boolean z6 = true;
                for (int i14 = 0; i14 < list7.size(); i14++) {
                    if (str3.equals(((gfa) list7.get(i14)).c)) {
                        gfa gfaVar = (gfa) list7.get(i14);
                        arrayList6.add(Integer.valueOf(i14));
                        Uri uri = gfaVar.a;
                        oj9 oj9Var4 = gfaVar.b;
                        arrayList4.add(uri);
                        arrayList5.add(oj9Var4);
                        z6 &= tym.t(1, oj9Var4.k) == 1;
                    }
                }
                String strConcat = "audio:".concat(str3);
                String str4 = tym.a;
                list = list7;
                hashSet2 = hashSet3;
                i2 = i13;
                sfa sfaVarH2 = h(strConcat, 1, (Uri[]) arrayList4.toArray(new Uri[0]), (oj9[]) arrayList5.toArray(new oj9[0]), null, Collections.EMPTY_LIST, map, j);
                arrayList2.add(sgb.b0(arrayList6));
                arrayList.add(sfaVarH2);
                if (z && z6) {
                    sfaVarH2.w(new eyl[]{new eyl(strConcat, (oj9[]) arrayList5.toArray(new oj9[0]))}, new int[0]);
                }
            } else {
                hashSet2 = hashSet3;
                i2 = i13;
                list = list7;
            }
            i13 = i2 + 1;
            hashSet3 = hashSet2;
        }
        this.v = arrayList.size();
        ArrayList arrayList7 = new ArrayList(list2.size());
        ArrayList arrayList8 = new ArrayList(list2.size());
        ArrayList arrayList9 = new ArrayList(list2.size());
        HashSet hashSet4 = new HashSet();
        int i15 = 0;
        while (i15 < list2.size()) {
            List list8 = list2;
            String str5 = ((gfa) list8.get(i15)).c;
            if (hashSet4.add(str5)) {
                arrayList7.clear();
                arrayList8.clear();
                arrayList9.clear();
                for (int i16 = 0; i16 < list8.size(); i16++) {
                    if (str5.equals(((gfa) list8.get(i16)).c)) {
                        gfa gfaVar2 = (gfa) list8.get(i16);
                        arrayList9.add(Integer.valueOf(i16));
                        arrayList7.add(gfaVar2.a);
                        arrayList8.add(gfaVar2.b);
                    }
                }
                String strConcat2 = "subtitle:".concat(str5);
                oj9[] oj9VarArr5 = (oj9[]) arrayList8.toArray(new oj9[0]);
                String str6 = tym.a;
                Uri[] uriArr4 = (Uri[]) arrayList7.toArray(new Uri[0]);
                a1b a1bVar = h1b.b;
                list2 = list8;
                hashSet = hashSet4;
                i = i15;
                sfa sfaVarH3 = h(strConcat2, 3, uriArr4, oj9VarArr5, null, csh.e, map, j);
                arrayList2.add(sgb.b0(arrayList9));
                arrayList.add(sfaVarH3);
                int length = oj9VarArr5.length;
                oj9[] oj9VarArr6 = new oj9[length];
                for (int i17 = 0; i17 < length; i17++) {
                    oj9VarArr6[i17] = rq6Var.b(oj9VarArr5[i17]);
                }
                sfaVarH3.w(new eyl[]{new eyl(strConcat2, oj9VarArr6)}, new int[0]);
            } else {
                hashSet = hashSet4;
                i = i15;
                list2 = list8;
            }
            i15 = i + 1;
            hashSet4 = hashSet;
        }
        this.t = (sfa[]) arrayList.toArray(new sfa[0]);
        this.r = this.t.length;
        int i18 = 0;
        while (true) {
            int i19 = this.v;
            sfaVarArr = this.t;
            if (i18 >= i19) {
                break;
            }
            sfaVarArr[i18].d.l = true;
            i18++;
        }
        for (sfa sfaVar : sfaVarArr) {
            if (!sfaVar.D) {
                ftc ftcVar = new ftc();
                ftcVar.a = sfaVar.P;
                sfaVar.g(new gtc(ftcVar));
            }
        }
        this.u = this.t;
    }

    @Override // defpackage.n1j
    public final boolean g(gtc gtcVar) {
        if (this.s != null) {
            return this.w.g(gtcVar);
        }
        for (sfa sfaVar : this.t) {
            if (!sfaVar.D) {
                ftc ftcVar = new ftc();
                ftcVar.a = sfaVar.P;
                sfaVar.g(new gtc(ftcVar));
            }
        }
        return false;
    }

    @Override // defpackage.n1j
    public final long getBufferedPositionUs() {
        return this.w.getBufferedPositionUs();
    }

    @Override // defpackage.n1j
    public final long getNextLoadPositionUs() {
        return this.w.getNextLoadPositionUs();
    }

    @Override // defpackage.nkd
    public final fyl getTrackGroups() {
        fyl fylVar = this.s;
        fylVar.getClass();
        return fylVar;
    }

    public final sfa h(String str, int i, Uri[] uriArr, oj9[] oj9VarArr, oj9 oj9Var, List list, Map map, long j) {
        return new sfa(str, i, this.p, new tea(this.a, this.b, uriArr, oj9VarArr, this.c, this.d, this.k, list, this.o), map, this.i, j, oj9Var, this.e, this.f, this.g, this.h, this.n ? 1 : 0, null);
    }

    @Override // defpackage.n1j
    public final boolean isLoading() {
        return this.w.isLoading();
    }

    @Override // defpackage.nkd
    public final void maybeThrowPrepareError() throws IOException {
        for (sfa sfaVar : this.t) {
            sfaVar.v();
            if (sfaVar.T && !sfaVar.D) {
                throw s1g.d("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override // defpackage.nkd
    public final long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // defpackage.n1j
    public final void reevaluateBuffer(long j) {
        this.w.reevaluateBuffer(j);
    }

    @Override // defpackage.nkd
    public final long seekToUs(long j) throws Throwable {
        sfa[] sfaVarArr = this.u;
        if (sfaVarArr.length > 0) {
            boolean zY = sfaVarArr[0].y(j, false);
            int i = 1;
            while (true) {
                sfa[] sfaVarArr2 = this.u;
                if (i >= sfaVarArr2.length) {
                    break;
                }
                sfaVarArr2[i].y(j, zY);
                i++;
            }
            if (zY) {
                ((SparseArray) this.k.b).clear();
            }
        }
        return j;
    }
}
