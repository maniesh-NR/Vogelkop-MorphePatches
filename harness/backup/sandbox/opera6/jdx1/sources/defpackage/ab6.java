package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ab6 implements nkd, m1j {
    public final int a;
    public final k5o b;
    public final pl6 c;
    public final em7 d;
    public final i06 e;
    public final r9i f;
    public final long g;
    public final xsc h;
    public final l45 i;
    public final fyl j;
    public final za6[] k;
    public final ir5 l;
    public final cjg m;
    public final ro9 o;
    public final am7 p;
    public mkd q;
    public vh5 t;
    public wa6 u;
    public int v;
    public List w;
    public long y;
    public static final Pattern z = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern A = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public boolean x = true;
    public b05[] r = new b05[0];
    public gd8[] s = new gd8[0];
    public final IdentityHashMap n = new IdentityHashMap();

    public ab6(int i, wa6 wa6Var, r9i r9iVar, int i2, k5o k5oVar, pl6 pl6Var, em7 em7Var, am7 am7Var, i06 i06Var, ro9 ro9Var, long j, xsc xscVar, l45 l45Var, ir5 ir5Var, ole oleVar, fjg fjgVar) throws NumberFormatException {
        int i3;
        int i4;
        int[][] iArr;
        boolean[] zArr;
        oj9[][] oj9VarArr;
        oj9[] oj9VarArrK;
        l37 l37VarD;
        Integer num;
        this.a = i;
        this.u = wa6Var;
        this.f = r9iVar;
        this.v = i2;
        this.b = k5oVar;
        this.c = pl6Var;
        this.d = em7Var;
        this.p = am7Var;
        this.e = i06Var;
        this.o = ro9Var;
        this.g = j;
        this.h = xscVar;
        this.i = l45Var;
        this.l = ir5Var;
        boolean z2 = true;
        this.m = new cjg(wa6Var, oleVar, l45Var);
        int i5 = 0;
        ir5Var.getClass();
        a1b a1bVar = h1b.b;
        csh cshVar = csh.e;
        this.t = new vh5(cshVar, cshVar);
        j9g j9gVarA = wa6Var.a(i2);
        List list = j9gVarA.d;
        this.w = list;
        List list2 = j9gVarA.c;
        int size = list2.size();
        HashMap map = new HashMap(na2.j(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i6 = 0; i6 < size; i6++) {
            map.put(Long.valueOf(((jr) list2.get(i6)).a), Integer.valueOf(i6));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i6));
            arrayList.add(arrayList2);
            sparseArray.put(i6, arrayList2);
        }
        int i7 = 0;
        while (i7 < size) {
            jr jrVar = (jr) list2.get(i7);
            List list3 = jrVar.e;
            List list4 = jrVar.f;
            boolean z3 = z2;
            l37 l37VarD2 = d("http://dashif.org/guidelines/trickmode", list3);
            l37VarD2 = l37VarD2 == null ? d("http://dashif.org/guidelines/trickmode", list4) : l37VarD2;
            int iIntValue = (l37VarD2 == null || (num = (Integer) map.get(Long.valueOf(Long.parseLong(l37VarD2.b)))) == null || !c(jrVar, (jr) list2.get(num.intValue()))) ? i7 : num.intValue();
            if (iIntValue == i7 && (l37VarD = d("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = l37VarD.b;
                String str2 = tym.a;
                String[] strArrSplit = str.split(",", -1);
                int length = strArrSplit.length;
                for (int i8 = i5; i8 < length; i8++) {
                    Integer num2 = (Integer) map.get(Long.valueOf(Long.parseLong(strArrSplit[i8])));
                    if (num2 != null && c(jrVar, (jr) list2.get(num2.intValue()))) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i7) {
                List list5 = (List) sparseArray.get(i7);
                List list6 = (List) sparseArray.get(iIntValue);
                list6.addAll(list5);
                sparseArray.put(i7, list6);
                arrayList.remove(list5);
            }
            i7++;
            z2 = z3;
            i5 = 0;
        }
        boolean z4 = z2;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i9 = 0; i9 < size2; i9++) {
            int[] iArrB0 = sgb.b0((Collection) arrayList.get(i9));
            iArr2[i9] = iArrB0;
            Arrays.sort(iArrB0);
        }
        boolean[] zArr2 = new boolean[size2];
        oj9[][] oj9VarArr2 = new oj9[size2][];
        int i10 = 0;
        int i11 = 0;
        while (i10 < size2) {
            int[] iArr3 = iArr2[i10];
            int length2 = iArr3.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    iArr = iArr2;
                    break;
                }
                List list7 = ((jr) list2.get(iArr3[i12])).c;
                iArr = iArr2;
                for (int i13 = 0; i13 < list7.size(); i13++) {
                    if (!((evh) list7.get(i13)).d.isEmpty()) {
                        zArr2[i10] = z4;
                        i11++;
                        break;
                    }
                }
                i12++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i10];
            int length3 = iArr4.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length3) {
                    zArr = zArr2;
                    oj9VarArr = oj9VarArr2;
                    oj9VarArrK = new oj9[0];
                    break;
                }
                int i15 = iArr4[i14];
                jr jrVar2 = (jr) list2.get(i15);
                List list8 = ((jr) list2.get(i15)).d;
                int[] iArr5 = iArr4;
                int i16 = 0;
                while (i16 < list8.size()) {
                    l37 l37Var = (l37) list8.get(i16);
                    zArr = zArr2;
                    oj9VarArr = oj9VarArr2;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(l37Var.a)) {
                        nj9 nj9Var = new nj9();
                        nj9Var.m = dzd.p("application/cea-608");
                        nj9Var.a = j7c.o(jrVar2.a, ":cea608", new StringBuilder());
                        oj9VarArrK = k(l37Var, z, new oj9(nj9Var));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(l37Var.a)) {
                        nj9 nj9Var2 = new nj9();
                        nj9Var2.m = dzd.p("application/cea-708");
                        nj9Var2.a = j7c.o(jrVar2.a, ":cea708", new StringBuilder());
                        oj9VarArrK = k(l37Var, A, new oj9(nj9Var2));
                        break;
                    }
                    i16++;
                    oj9VarArr2 = oj9VarArr;
                    zArr2 = zArr;
                }
                i14++;
                iArr4 = iArr5;
            }
            oj9VarArr[i10] = oj9VarArrK;
            if (oj9VarArrK.length != 0) {
                i11++;
            }
            i10++;
            oj9VarArr2 = oj9VarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        oj9[][] oj9VarArr3 = oj9VarArr2;
        int size3 = list.size() + i11 + size2;
        eyl[] eylVarArr = new eyl[size3];
        za6[] za6VarArr = new za6[size3];
        int i17 = 0;
        int i18 = 0;
        while (i17 < size2) {
            int[] iArr7 = iArr6[i17];
            ArrayList arrayList3 = new ArrayList();
            for (int i19 : iArr7) {
                arrayList3.addAll(((jr) list2.get(i19)).c);
            }
            int size4 = arrayList3.size();
            oj9[] oj9VarArr4 = new oj9[size4];
            int i20 = 0;
            while (i20 < size4) {
                int i21 = size2;
                oj9 oj9Var = ((evh) arrayList3.get(i20)).a;
                int i22 = i18;
                nj9 nj9VarA = oj9Var.a();
                nj9VarA.N = em7Var.d(oj9Var);
                oj9VarArr4[i20] = new oj9(nj9VarA);
                i20++;
                size2 = i21;
                i18 = i22;
            }
            int i23 = size2;
            int i24 = i18;
            jr jrVar3 = (jr) list2.get(iArr7[0]);
            long j2 = jrVar3.a;
            String string = j2 != -1 ? Long.toString(j2) : sko.i(i17, "unset:");
            int i25 = i24 + 1;
            if (zArr3[i17]) {
                i3 = i24 + 2;
            } else {
                i3 = i25;
                i25 = -1;
            }
            if (oj9VarArr3[i17].length != 0) {
                i4 = i3 + 1;
            } else {
                i4 = i3;
                i3 = -1;
            }
            i(k5oVar, oj9VarArr4);
            List list9 = list2;
            eylVarArr[i24] = new eyl(string, oj9VarArr4);
            int i26 = jrVar3.b;
            a1b a1bVar2 = h1b.b;
            csh cshVar2 = csh.e;
            za6 za6Var = new za6(i26, 0, iArr7, i24, i25, i3, -1, cshVar2);
            int i27 = i24;
            za6VarArr[i27] = za6Var;
            int i28 = -1;
            if (i25 != -1) {
                String strU = sko.u(string, ":emsg");
                nj9 nj9Var3 = new nj9();
                nj9Var3.a = strU;
                nj9Var3.m = dzd.p("application/x-emsg");
                eylVarArr[i25] = new eyl(strU, new oj9(nj9Var3));
                za6 za6Var2 = new za6(5, 1, iArr7, i27, -1, -1, -1, cshVar2);
                i27 = i27;
                za6VarArr[i25] = za6Var2;
                i28 = -1;
            }
            if (i3 != i28) {
                String strU2 = sko.u(string, ":cc");
                za6VarArr[i3] = new za6(3, 1, iArr7, i27, -1, -1, -1, h1b.t(oj9VarArr3[i17]));
                i(k5oVar, oj9VarArr3[i17]);
                eylVarArr[i3] = new eyl(strU2, oj9VarArr3[i17]);
            }
            i17++;
            size2 = i23;
            i18 = i4;
            list2 = list9;
        }
        int i29 = 0;
        while (i29 < list.size()) {
            hd8 hd8Var = (hd8) list.get(i29);
            nj9 nj9Var4 = new nj9();
            nj9Var4.a = hd8Var.a();
            nj9Var4.m = dzd.p("application/x-emsg");
            eylVarArr[i18] = new eyl(rfp.n(i29, ":", new StringBuilder(hd8Var.a())), new oj9(nj9Var4));
            a1b a1bVar3 = h1b.b;
            za6VarArr[i18] = new za6(5, 2, new int[0], -1, -1, -1, i29, csh.e);
            i29++;
            i18++;
        }
        Pair pairCreate = Pair.create(new fyl(eylVarArr), za6VarArr);
        this.j = (fyl) pairCreate.first;
        this.k = (za6[]) pairCreate.second;
    }

    public static boolean c(jr jrVar, jr jrVar2) {
        int i = jrVar.b;
        List list = jrVar.c;
        int i2 = jrVar2.b;
        List list2 = jrVar2.c;
        if (i == i2) {
            if (list.isEmpty() || list2.isEmpty()) {
                return true;
            }
            oj9 oj9Var = ((evh) list.get(0)).a;
            oj9 oj9Var2 = ((evh) list2.get(0)).a;
            int i3 = oj9Var.f & (-16385);
            int i4 = oj9Var2.f & (-16385);
            if (Objects.equals(oj9Var.d, oj9Var2.d) && i3 == i4) {
                return true;
            }
        }
        return false;
    }

    public static l37 d(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            l37 l37Var = (l37) list.get(i);
            if (str.equals(l37Var.a)) {
                return l37Var;
            }
        }
        return null;
    }

    public static void i(k5o k5oVar, oj9[] oj9VarArr) {
        for (int i = 0; i < oj9VarArr.length; i++) {
            oj9 oj9Var = oj9VarArr[i];
            rq6 rq6Var = (rq6) k5oVar.c;
            if (rq6Var.b && rq6Var.a.b(oj9Var)) {
                nj9 nj9VarA = oj9Var.a();
                String str = oj9Var.k;
                nj9VarA.m = dzd.p("application/x-media3-cues");
                nj9VarA.K = rq6Var.a.l(oj9Var);
                StringBuilder sb = new StringBuilder();
                sb.append(oj9Var.n);
                sb.append(str != null ? " ".concat(str) : "");
                nj9VarA.j = sb.toString();
                nj9VarA.r = Long.MAX_VALUE;
                oj9Var = new oj9(nj9VarA);
            }
            oj9VarArr[i] = oj9Var;
        }
    }

    public static oj9[] k(l37 l37Var, Pattern pattern, oj9 oj9Var) throws NumberFormatException {
        String str = l37Var.b;
        if (str == null) {
            return new oj9[]{oj9Var};
        }
        String str2 = tym.a;
        String[] strArrSplit = str.split(";", -1);
        oj9[] oj9VarArr = new oj9[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            Matcher matcher = pattern.matcher(strArrSplit[i]);
            if (!matcher.matches()) {
                return new oj9[]{oj9Var};
            }
            int i2 = Integer.parseInt(matcher.group(1));
            nj9 nj9VarA = oj9Var.a();
            nj9VarA.a = oj9Var.a + ":" + i2;
            nj9VarA.J = i2;
            nj9VarA.d = matcher.group(2);
            oj9VarArr[i] = new oj9(nj9VarA);
        }
        return oj9VarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nkd
    public final long a(bj8[] bj8VarArr, boolean[] zArr, vhi[] vhiVarArr, boolean[] zArr2, long j) throws Throwable {
        int i;
        eyl eylVar;
        boolean z2;
        int[] iArr;
        int[] iArr2;
        int i2;
        int i3;
        int i4;
        eyl eylVarA;
        csh cshVar;
        int i5;
        bjg bjgVar;
        boolean z3;
        bj8[] bj8VarArr2 = bj8VarArr;
        int[] iArr3 = new int[bj8VarArr2.length];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = -1;
            if (i7 >= bj8VarArr2.length) {
                break;
            }
            bj8 bj8Var = bj8VarArr2[i7];
            if (bj8Var != null) {
                iArr3[i7] = this.j.b(bj8Var.getTrackGroup());
            } else {
                iArr3[i7] = -1;
            }
            i7++;
        }
        int i8 = 0;
        while (true) {
            eylVar = null;
            if (i8 >= bj8VarArr2.length) {
                break;
            }
            if (bj8VarArr2[i8] == null || !zArr[i8]) {
                vhi vhiVar = vhiVarArr[i8];
                if (vhiVar instanceof b05) {
                    ((b05) vhiVar).o(this);
                } else if (vhiVar instanceof a05) {
                    a05 a05Var = (a05) vhiVar;
                    boolean[] zArr3 = a05Var.e.d;
                    int i9 = a05Var.c;
                    z4o.H(zArr3[i9]);
                    zArr3[i9] = false;
                }
                vhiVarArr[i8] = null;
            }
            i8++;
        }
        int i10 = 0;
        while (true) {
            z2 = true;
            if (i10 >= bj8VarArr2.length) {
                break;
            }
            vhi vhiVar2 = vhiVarArr[i10];
            if ((vhiVar2 instanceof s08) || (vhiVar2 instanceof a05)) {
                int iH = h(i10, iArr3);
                if (iH == -1) {
                    z3 = vhiVarArr[i10] instanceof s08;
                } else {
                    vhi vhiVar3 = vhiVarArr[i10];
                    z3 = (vhiVar3 instanceof a05) && ((a05) vhiVar3).a == vhiVarArr[iH];
                }
                if (!z3) {
                    vhi vhiVar4 = vhiVarArr[i10];
                    if (vhiVar4 instanceof a05) {
                        a05 a05Var2 = (a05) vhiVar4;
                        boolean[] zArr4 = a05Var2.e.d;
                        int i11 = a05Var2.c;
                        z4o.H(zArr4[i11]);
                        zArr4[i11] = false;
                    }
                    vhiVarArr[i10] = null;
                }
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < bj8VarArr2.length) {
            bj8 bj8Var2 = bj8VarArr2[i12];
            if (bj8Var2 == null) {
                iArr2 = iArr3;
                i2 = i6;
                i3 = i12;
            } else {
                vhi vhiVar5 = vhiVarArr[i12];
                if (vhiVar5 == null) {
                    zArr2[i12] = z2;
                    za6 za6Var = this.k[iArr3[i12]];
                    byte b = za6Var.c;
                    if (b == 0) {
                        int i13 = za6Var.f;
                        boolean z4 = i13 != i ? z2 ? 1 : 0 : i6;
                        if (z4 != 0) {
                            eylVarA = this.j.a(i13);
                            i4 = z2 ? 1 : 0;
                        } else {
                            i4 = i6;
                            eylVarA = eylVar;
                        }
                        int i14 = za6Var.g;
                        if (i14 != i) {
                            cshVar = this.k[i14].h;
                        } else {
                            a1b a1bVar = h1b.b;
                            cshVar = csh.e;
                        }
                        int i15 = cshVar.d + i4;
                        oj9[] oj9VarArr = new oj9[i15];
                        int[] iArr4 = new int[i15];
                        if (z4 != 0) {
                            oj9VarArr[i6] = eylVarA.d[i6];
                            iArr4[i6] = 5;
                            i5 = z2 ? 1 : 0;
                        } else {
                            i5 = i6;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i16 = i6; i16 < cshVar.d; i16++) {
                            oj9 oj9Var = (oj9) cshVar.get(i16);
                            oj9VarArr[i5] = oj9Var;
                            iArr4[i5] = 3;
                            arrayList.add(oj9Var);
                            i5 += z2 ? 1 : 0;
                        }
                        if (!this.u.d || z4 == 0) {
                            bjgVar = eylVar;
                        } else {
                            cjg cjgVar = this.m;
                            bjgVar = new bjg(cjgVar, cjgVar.a);
                        }
                        k5o k5oVar = this.b;
                        xsc xscVar = this.h;
                        wa6 wa6Var = this.u;
                        r9i r9iVar = this.f;
                        int i17 = this.v;
                        int[] iArr5 = za6Var.a;
                        int i18 = za6Var.b;
                        long j2 = this.g;
                        int[] iArr6 = iArr3;
                        pl6 pl6Var = this.c;
                        ed6 ed6VarCreateDataSource = ((bd6) k5oVar.b).createDataSource();
                        if (pl6Var != null) {
                            ed6VarCreateDataSource.c(pl6Var);
                        }
                        gn6 gn6Var = new gn6((rq6) k5oVar.c, xscVar, wa6Var, r9iVar, i17, iArr5, bj8Var2, i18, ed6VarCreateDataSource, j2, z4, arrayList, bjgVar);
                        Object obj = bjgVar;
                        iArr2 = iArr6;
                        eylVar = null;
                        i3 = i12;
                        b05 b05Var = new b05(za6Var.b, iArr4, oj9VarArr, gn6Var, this, this.i, j, this.d, this.p, this.e, this.o, this.x, null);
                        synchronized (this) {
                            this.n.put(b05Var, obj);
                        }
                        vhiVarArr[i3] = b05Var;
                    } else {
                        iArr2 = iArr3;
                        i3 = i12;
                        if (b == 2) {
                            i2 = 0;
                            vhiVarArr[i3] = new gd8((hd8) this.w.get(za6Var.d), bj8Var2.getTrackGroup().d[0], this.u.d);
                        }
                    }
                    i2 = 0;
                } else {
                    iArr2 = iArr3;
                    i2 = i6;
                    i3 = i12;
                    if (vhiVar5 instanceof b05) {
                        ((b05) vhiVar5).e.i = bj8Var2;
                    }
                }
            }
            i12 = i3 + 1;
            bj8VarArr2 = bj8VarArr;
            i6 = i2;
            iArr3 = iArr2;
            i = -1;
            z2 = true;
        }
        int[] iArr7 = iArr3;
        boolean z5 = i6;
        int i19 = z5 ? 1 : 0;
        while (i19 < bj8VarArr.length) {
            if (vhiVarArr[i19] != null || bj8VarArr[i19] == null) {
                iArr = iArr7;
            } else {
                iArr = iArr7;
                za6 za6Var2 = this.k[iArr[i19]];
                if (za6Var2.c != 1) {
                    continue;
                } else {
                    int iH2 = h(i19, iArr);
                    if (iH2 != -1) {
                        b05 b05Var2 = (b05) vhiVarArr[iH2];
                        int i20 = za6Var2.b;
                        boolean[] zArr5 = b05Var2.d;
                        uhi[] uhiVarArr = b05Var2.n;
                        for (int i21 = z5 ? 1 : 0; i21 < uhiVarArr.length; i21++) {
                            if (b05Var2.b[i21] == i20) {
                                z4o.H(!zArr5[i21]);
                                zArr5[i21] = true;
                                uhiVarArr[i21].F(j, true);
                                vhiVarArr[i19] = new a05(b05Var2, b05Var2, uhiVarArr[i21], i21);
                            }
                        }
                        h9o.e();
                        return 0L;
                    }
                    vhiVarArr[i19] = new s08();
                }
            }
            i19++;
            iArr7 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = vhiVarArr.length;
        for (int i22 = z5 ? 1 : 0; i22 < length; i22++) {
            vhi vhiVar6 = vhiVarArr[i22];
            if (vhiVar6 instanceof b05) {
                arrayList2.add((b05) vhiVar6);
            } else if (vhiVar6 instanceof gd8) {
                arrayList3.add((gd8) vhiVar6);
            }
        }
        b05[] b05VarArr = new b05[arrayList2.size()];
        this.r = b05VarArr;
        arrayList2.toArray(b05VarArr);
        gd8[] gd8VarArr = new gd8[arrayList3.size()];
        this.s = gd8VarArr;
        arrayList3.toArray(gd8VarArr);
        ir5 ir5Var = this.l;
        AbstractList abstractListW = nb6.W(new b10((byte) 9), arrayList2);
        ir5Var.getClass();
        this.t = new vh5(arrayList2, abstractListW);
        if (this.x) {
            this.x = z5;
            this.y = j;
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    @Override // defpackage.nkd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(long r19, defpackage.uwi r21) {
        /*
            r18 = this;
            r1 = r19
            r0 = r18
            b05[] r0 = r0.r
            int r3 = r0.length
            r4 = 0
            r5 = r4
        L9:
            if (r5 >= r3) goto L73
            r6 = r0[r5]
            int r7 = r6.a
            r8 = 2
            if (r7 != r8) goto L6e
            gn6 r0 = r6.e
            en6[] r0 = r0.h
            int r3 = r0.length
        L17:
            if (r4 >= r3) goto L73
            r5 = r0[r4]
            gb6 r6 = r5.d
            long r7 = r5.f
            gb6 r9 = r5.d
            if (r6 == 0) goto L69
            long r10 = r5.c()
            r12 = 0
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 == 0) goto L69
            r9.getClass()
            long r3 = r5.e
            long r3 = r9.r(r1, r3)
            long r3 = r3 + r7
            r12 = r3
            long r3 = r5.e(r12)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L62
            r14 = -1
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            r14 = 1
            if (r0 == 0) goto L59
            r9.getClass()
            long r16 = r9.S()
            long r16 = r16 + r7
            long r16 = r16 + r10
            long r16 = r16 - r14
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 >= 0) goto L62
        L59:
            long r6 = r12 + r14
            long r5 = r5.e(r6)
        L5f:
            r0 = r21
            goto L64
        L62:
            r5 = r3
            goto L5f
        L64:
            long r0 = r0.a(r1, r3, r5)
            return r0
        L69:
            int r4 = r4 + 1
            r1 = r19
            goto L17
        L6e:
            int r5 = r5 + 1
            r1 = r19
            goto L9
        L73:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab6.b(long, uwi):long");
    }

    @Override // defpackage.nkd
    public final void e(long j) throws Throwable {
        long j2;
        for (b05 b05Var : this.r) {
            if (!b05Var.l()) {
                uhi uhiVar = b05Var.m;
                int i = uhiVar.q;
                uhiVar.j(j, true);
                uhi uhiVar2 = b05Var.m;
                int i2 = uhiVar2.q;
                if (i2 > i) {
                    synchronized (uhiVar2) {
                        j2 = uhiVar2.p == 0 ? Long.MIN_VALUE : uhiVar2.n[uhiVar2.r];
                    }
                    int i3 = 0;
                    while (true) {
                        uhi[] uhiVarArr = b05Var.n;
                        if (i3 >= uhiVarArr.length) {
                            break;
                        }
                        uhiVarArr[i3].j(j2, b05Var.d[i3]);
                        i3++;
                    }
                }
                int iMin = Math.min(b05Var.n(i2, 0), b05Var.u);
                if (iMin > 0) {
                    tym.T(b05Var.k, 0, iMin);
                    b05Var.u -= iMin;
                }
            }
        }
    }

    @Override // defpackage.nkd
    public final void f(mkd mkdVar, long j) {
        this.q = mkdVar;
        mkdVar.p(this);
    }

    @Override // defpackage.n1j
    public final boolean g(gtc gtcVar) {
        return this.t.g(gtcVar);
    }

    @Override // defpackage.n1j
    public final long getBufferedPositionUs() {
        return this.t.getBufferedPositionUs();
    }

    @Override // defpackage.n1j
    public final long getNextLoadPositionUs() {
        return this.t.getNextLoadPositionUs();
    }

    @Override // defpackage.nkd
    public final fyl getTrackGroups() {
        return this.j;
    }

    public final int h(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 != -1) {
            za6[] za6VarArr = this.k;
            int i3 = za6VarArr[i2].e;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 == i3 && za6VarArr[i5].c == 0) {
                    return i4;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.n1j
    public final boolean isLoading() {
        return this.t.isLoading();
    }

    @Override // defpackage.m1j
    public final void j(n1j n1jVar) {
        this.q.j(this);
    }

    @Override // defpackage.nkd
    public final void maybeThrowPrepareError() {
        this.h.maybeThrowError();
    }

    @Override // defpackage.nkd
    public final long readDiscontinuity() {
        b05[] b05VarArr = this.r;
        int length = b05VarArr.length;
        for (int i = 0; i < length; i++) {
            b05 b05Var = b05VarArr[i];
            b05Var.getClass();
            try {
                if (b05Var.x) {
                    return this.y;
                }
            } finally {
                b05Var.x = false;
            }
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    @Override // defpackage.n1j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void reevaluateBuffer(long r20) {
        /*
            r19 = this;
            r0 = r19
            b05[] r1 = r0.r
            int r2 = r1.length
            r4 = 0
        L6:
            if (r4 >= r2) goto L90
            r5 = r1[r4]
            qb7 r6 = r5.i
            boolean r6 = r6.s()
            if (r6 != 0) goto L8a
            wa6 r6 = r0.u
            int r7 = r0.v
            long r10 = r6.c(r7)
            uhi r6 = r5.m
            qb7 r7 = r5.i
            boolean r7 = r7.s()
            r7 = r7 ^ 1
            defpackage.z4o.H(r7)
            boolean r7 = r5.l()
            if (r7 != 0) goto L8a
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r9 == 0) goto L8a
            java.util.ArrayList r9 = r5.k
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L8a
            i73 r9 = r5.j()
            long r12 = r9.l
            int r7 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r7 != 0) goto L4a
            long r12 = r9.h
        L4a:
            int r7 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r7 <= 0) goto L8a
            long r12 = r6.q()
            int r7 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r7 <= 0) goto L8a
            long r7 = r6.r()
            r14 = 1
            long r7 = r7 + r14
            long r7 = java.lang.Math.max(r10, r7)
            r6.l(r7)
            uhi[] r6 = r5.n
            int r7 = r6.length
            r8 = 0
        L68:
            if (r8 >= r7) goto L80
            r9 = r6[r8]
            long r16 = r9.r()
            r18 = r4
            long r3 = r16 + r14
            long r3 = java.lang.Math.max(r10, r3)
            r9.l(r3)
            int r8 = r8 + 1
            r4 = r18
            goto L68
        L80:
            r18 = r4
            ro9 r8 = r5.g
            int r9 = r5.a
            r8.d0(r9, r10, r12)
            goto L8c
        L8a:
            r18 = r4
        L8c:
            int r4 = r18 + 1
            goto L6
        L90:
            vh5 r0 = r0.t
            r1 = r20
            r0.reevaluateBuffer(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab6.reevaluateBuffer(long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    @Override // defpackage.nkd
    public final long seekToUs(long j) throws Throwable {
        int i;
        i73 i73Var;
        boolean zF;
        boolean z2;
        b05[] b05VarArr = this.r;
        int length = b05VarArr.length;
        boolean z3 = false;
        int i2 = 0;
        while (i2 < length) {
            b05 b05Var = b05VarArr[i2];
            uhi[] uhiVarArr = b05Var.n;
            uhi uhiVar = b05Var.m;
            qb7 qb7Var = b05Var.i;
            ?? r14 = b05Var.k;
            b05Var.t = j;
            b05Var.w = z3;
            if (b05Var.l()) {
                b05Var.s = j;
                z2 = z3;
                i = i2;
            } else {
                ?? r15 = z3;
                while (true) {
                    if (r15 >= r14.size()) {
                        i = i2;
                        break;
                    }
                    i73Var = (i73) r14.get(r15);
                    long j2 = i73Var.g;
                    i = i2;
                    if (j2 == j && i73Var.k == -9223372036854775807L) {
                        break;
                    }
                    if (j2 > j) {
                        break;
                    }
                    r15++;
                    i2 = i;
                }
                i73Var = null;
                if (i73Var != null) {
                    zF = uhiVar.E(i73Var.c(0));
                } else {
                    long nextLoadPositionUs = b05Var.getNextLoadPositionUs();
                    zF = uhiVar.F(j, nextLoadPositionUs == Long.MIN_VALUE || j < nextLoadPositionUs);
                }
                if (zF) {
                    b05Var.u = b05Var.n(uhiVar.t(), 0);
                    for (uhi uhiVar2 : uhiVarArr) {
                        uhiVar2.F(j, true);
                    }
                } else {
                    b05Var.s = j;
                    b05Var.y = false;
                    r14.clear();
                    b05Var.u = 0;
                    if (qb7Var.s()) {
                        uhiVar.k();
                        for (uhi uhiVar3 : uhiVarArr) {
                            uhiVar3.k();
                        }
                        qb7Var.i();
                    } else {
                        qb7Var.c = null;
                        z2 = false;
                        uhiVar.D(false);
                        for (uhi uhiVar4 : b05Var.n) {
                            uhiVar4.D(false);
                        }
                    }
                }
                z2 = false;
            }
            i2 = i + 1;
            z3 = z2;
        }
        gd8[] gd8VarArr = this.s;
        int length2 = gd8VarArr.length;
        for (?? r5 = z3; r5 < length2; r5++) {
            gd8 gd8Var = gd8VarArr[r5];
            int iB = tym.b(gd8Var.c, j, true);
            gd8Var.g = iB;
            gd8Var.h = (gd8Var.d && iB == gd8Var.c.length) ? j : -9223372036854775807L;
        }
        return j;
    }
}
