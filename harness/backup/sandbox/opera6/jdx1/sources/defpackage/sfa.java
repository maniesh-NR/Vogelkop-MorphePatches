package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class sfa implements osc, usc, n1j, en8, thi {
    public static final Set Y = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public oj9 F;
    public oj9 G;
    public boolean H;
    public fyl I;
    public Set J;
    public int[] K;
    public int L;
    public boolean M;
    public boolean[] N;
    public boolean[] O;
    public long P;
    public long Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public long V;
    public vl7 W;
    public uea X;
    public final String a;
    public final byte b;
    public final xm5 c;
    public final tea d;
    public final l45 e;
    public final oj9 f;
    public final em7 g;
    public final am7 h;
    public final i06 i;
    public final qb7 j;
    public final ro9 k;
    public final boolean l;
    public final rn9 m;
    public final ArrayList n;
    public final List o;
    public final pfa p;
    public final pfa q;
    public final Handler r;
    public final ArrayList s;
    public final Map t;
    public wz4 u;
    public rfa[] v;
    public int[] w;
    public final HashSet x;
    public final SparseIntArray y;
    public qfa z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [pfa] */
    /* JADX WARN: Type inference failed for: r2v14, types: [pfa] */
    public sfa(String str, int i, xm5 xm5Var, tea teaVar, Map map, l45 l45Var, long j, oj9 oj9Var, em7 em7Var, am7 am7Var, i06 i06Var, ro9 ro9Var, int i2, enb enbVar) {
        this.a = str;
        this.b = i;
        this.c = xm5Var;
        this.d = teaVar;
        this.t = map;
        this.e = l45Var;
        this.f = oj9Var;
        this.g = em7Var;
        this.h = am7Var;
        this.i = i06Var;
        this.k = ro9Var;
        this.l = i2;
        this.j = enbVar != null ? new qb7(enbVar) : new qb7("Loader:HlsSampleStreamWrapper");
        rn9 rn9Var = new rn9((byte) 19);
        rn9Var.c = null;
        final byte b = 0;
        rn9Var.b = false;
        rn9Var.d = null;
        this.m = rn9Var;
        this.w = new int[0];
        Set set = Y;
        this.x = new HashSet(set.size());
        this.y = new SparseIntArray(set.size());
        this.v = new rfa[0];
        this.O = new boolean[0];
        this.N = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.n = arrayList;
        this.o = Collections.unmodifiableList(arrayList);
        this.s = new ArrayList();
        this.p = new Runnable(this) { // from class: pfa
            public final /* synthetic */ sfa b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                sfa sfaVar = this.b;
                switch (b2) {
                    case 0:
                        sfaVar.t();
                        break;
                    default:
                        sfaVar.C = true;
                        sfaVar.t();
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.q = new Runnable(this) { // from class: pfa
            public final /* synthetic */ sfa b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                sfa sfaVar = this.b;
                switch (b22) {
                    case 0:
                        sfaVar.t();
                        break;
                    default:
                        sfaVar.C = true;
                        sfaVar.t();
                        break;
                }
            }
        };
        this.r = tym.p(null);
        this.P = j;
        this.Q = j;
    }

    public static s97 l(int i, int i2) {
        w7d.K("Unmapped track with id " + i + " of type " + i2);
        return new s97();
    }

    public static oj9 n(oj9 oj9Var, oj9 oj9Var2, boolean z) {
        String strC;
        if (oj9Var == null) {
            return oj9Var2;
        }
        String str = oj9Var.k;
        String strE = oj9Var2.n;
        int i = dzd.i(strE);
        if (tym.t(i, str) == 1) {
            strC = tym.u(str, i);
            strE = dzd.e(strC);
        } else {
            strC = dzd.c(str, strE);
        }
        nj9 nj9VarA = oj9Var2.a();
        nj9VarA.a = oj9Var.a;
        nj9VarA.b = oj9Var.b;
        nj9VarA.c = h1b.s(oj9Var.c);
        nj9VarA.d = oj9Var.d;
        nj9VarA.e = oj9Var.e;
        nj9VarA.f = oj9Var.f;
        nj9VarA.h = z ? oj9Var.h : -1;
        nj9VarA.i = z ? oj9Var.i : -1;
        nj9VarA.j = strC;
        if (i == 2) {
            nj9VarA.t = oj9Var.u;
            nj9VarA.u = oj9Var.v;
            nj9VarA.x = oj9Var.y;
        }
        if (strE != null) {
            nj9VarA.m = dzd.p(strE);
        }
        int i2 = oj9Var.F;
        if (i2 != -1 && i == 1) {
            nj9VarA.E = i2;
        }
        lxd lxdVarB = oj9Var.l;
        if (lxdVarB != null) {
            lxd lxdVar = oj9Var2.l;
            if (lxdVar != null) {
                lxdVarB = lxdVar.b(lxdVarB);
            }
            nj9VarA.k = lxdVarB;
        }
        return new oj9(nj9VarA);
    }

    public static int q(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // defpackage.thi
    public final void c() {
        this.r.post(this.p);
    }

    @Override // defpackage.osc
    public final void d(rsc rscVar, long j, long j2, boolean z) {
        wz4 wz4Var = (wz4) rscVar;
        this.u = null;
        long j3 = wz4Var.a;
        nd6 nd6Var = wz4Var.b;
        vbk vbkVar = wz4Var.i;
        bsc bscVar = new bsc(nd6Var, vbkVar.c, vbkVar.d, j, j2, vbkVar.b);
        this.i.getClass();
        this.k.x(bscVar, wz4Var.c, this.b, wz4Var.d, wz4Var.e, wz4Var.f, wz4Var.g, wz4Var.h);
        if (z) {
            return;
        }
        if (s() || this.E == 0) {
            x();
        }
        if (this.E > 0) {
            this.c.j(this);
        }
    }

    @Override // defpackage.en8
    public final void endTracks() {
        this.U = true;
        this.r.post(this.q);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0201  */
    @Override // defpackage.n1j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(defpackage.gtc r69) {
        /*
            Method dump skipped, instructions count: 1319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sfa.g(gtc):boolean");
    }

    @Override // defpackage.n1j
    public final long getBufferedPositionUs() {
        if (this.T) {
            return Long.MIN_VALUE;
        }
        if (s()) {
            return this.Q;
        }
        long jMax = this.P;
        uea ueaVarP = p();
        if (!ueaVarP.H) {
            ArrayList arrayList = this.n;
            ueaVarP = arrayList.size() > 1 ? (uea) am2.k(2, arrayList) : null;
        }
        if (ueaVarP != null) {
            jMax = Math.max(jMax, ueaVarP.h);
        }
        if (this.C) {
            for (rfa rfaVar : this.v) {
                jMax = Math.max(jMax, rfaVar.q());
            }
        }
        return jMax;
    }

    @Override // defpackage.n1j
    public final long getNextLoadPositionUs() {
        if (s()) {
            return this.Q;
        }
        if (this.T) {
            return Long.MIN_VALUE;
        }
        return p().h;
    }

    @Override // defpackage.en8
    public final void h(twi twiVar) {
    }

    @Override // defpackage.osc
    public final void i(rsc rscVar, long j, long j2) {
        wz4 wz4Var = (wz4) rscVar;
        this.u = null;
        if (wz4Var instanceof pea) {
            pea peaVar = (pea) wz4Var;
            byte[] bArr = peaVar.j;
            tea teaVar = this.d;
            teaVar.m = bArr;
            qq6 qq6Var = teaVar.j;
            Uri uri = peaVar.b.a;
            byte[] bArr2 = peaVar.l;
            bArr2.getClass();
            yp9 yp9Var = (yp9) qq6Var.b;
            uri.getClass();
        }
        long j3 = wz4Var.a;
        nd6 nd6Var = wz4Var.b;
        vbk vbkVar = wz4Var.i;
        bsc bscVar = new bsc(nd6Var, vbkVar.c, vbkVar.d, j, j2, vbkVar.b);
        this.i.getClass();
        this.k.y(bscVar, wz4Var.c, this.b, wz4Var.d, wz4Var.e, wz4Var.f, wz4Var.g, wz4Var.h);
        if (this.D) {
            this.c.j(this);
            return;
        }
        ftc ftcVar = new ftc();
        ftcVar.a = this.P;
        g(new gtc(ftcVar));
    }

    @Override // defpackage.n1j
    public final boolean isLoading() {
        return this.j.s();
    }

    public final void j() {
        z4o.H(this.D);
        this.I.getClass();
        this.J.getClass();
    }

    public final boolean k(int i) {
        int i2 = i;
        while (true) {
            ArrayList arrayList = this.n;
            if (i2 >= arrayList.size()) {
                uea ueaVar = (uea) arrayList.get(i);
                for (int i3 = 0; i3 < this.v.length; i3++) {
                    if (this.v[i3].t() <= ueaVar.e(i3)) {
                    }
                }
                return true;
            }
            if (((uea) arrayList.get(i2)).L) {
                break;
            }
            i2++;
        }
        return false;
    }

    public final fyl m(eyl[] eylVarArr) {
        for (int i = 0; i < eylVarArr.length; i++) {
            eyl eylVar = eylVarArr[i];
            oj9[] oj9VarArr = new oj9[eylVar.a];
            for (int i2 = 0; i2 < eylVar.a; i2++) {
                oj9 oj9Var = eylVar.d[i2];
                int iD = this.g.d(oj9Var);
                nj9 nj9VarA = oj9Var.a();
                nj9VarA.N = iD;
                oj9VarArr[i2] = new oj9(nj9VarA);
            }
            eylVarArr[i] = new eyl(eylVar.b, oj9VarArr);
        }
        return new fyl(eylVarArr);
    }

    public final void o(int i) {
        ArrayList arrayList;
        z4o.H(!this.j.s());
        while (true) {
            arrayList = this.n;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (k(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = p().h;
        uea ueaVar = (uea) arrayList.get(i);
        tym.T(arrayList, i, arrayList.size());
        for (int i2 = 0; i2 < this.v.length; i2++) {
            this.v[i2].n(ueaVar.e(i2));
        }
        if (arrayList.isEmpty()) {
            this.Q = this.P;
        } else {
            ((uea) sfe.c0(arrayList)).J = true;
        }
        this.T = false;
        this.k.d0(this.A, ueaVar.g, j);
    }

    public final void onLoaderReleased() {
        for (rfa rfaVar : this.v) {
            rfaVar.D(true);
            xl7 xl7Var = rfaVar.h;
            if (xl7Var != null) {
                xl7Var.d(rfaVar.e);
                rfaVar.h = null;
                rfaVar.g = null;
            }
        }
    }

    public final uea p() {
        return (uea) am2.k(1, this.n);
    }

    @Override // defpackage.osc
    public final void r(rsc rscVar, long j, long j2, int i) {
        bsc bscVar;
        wz4 wz4Var = (wz4) rscVar;
        if (i == 0) {
            long j3 = wz4Var.a;
            bscVar = new bsc(wz4Var.b, j);
        } else {
            long j4 = wz4Var.a;
            nd6 nd6Var = wz4Var.b;
            vbk vbkVar = wz4Var.i;
            bscVar = new bsc(nd6Var, vbkVar.c, vbkVar.d, j, j2, vbkVar.b);
        }
        this.k.B(bscVar, wz4Var.c, this.b, wz4Var.d, wz4Var.e, wz4Var.f, wz4Var.g, wz4Var.h, i);
    }

    @Override // defpackage.n1j
    public final void reevaluateBuffer(long j) {
        qb7 qb7Var = this.j;
        if (qb7Var.q() || s()) {
            return;
        }
        boolean zS = qb7Var.s();
        tea teaVar = this.d;
        List list = this.o;
        if (zS) {
            this.u.getClass();
            if (teaVar.n != null ? false : teaVar.r.b(j, this.u, list)) {
                qb7Var.i();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && teaVar.b((uea) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            o(size);
        }
        int size2 = (teaVar.n != null || teaVar.r.length() < 2) ? list.size() : teaVar.r.evaluateQueueSize(j, list);
        if (size2 < this.n.size()) {
            o(size2);
        }
    }

    public final boolean s() {
        return this.Q != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t() {
        int i;
        if (!this.H && this.K == null && this.C) {
            int i2 = 0;
            for (rfa rfaVar : this.v) {
                if (rfaVar.w() == null) {
                    return;
                }
            }
            fyl fylVar = this.I;
            if (fylVar != null) {
                int i3 = fylVar.a;
                int[] iArr = new int[i3];
                this.K = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        rfa[] rfaVarArr = this.v;
                        if (i5 < rfaVarArr.length) {
                            oj9 oj9VarW = rfaVarArr[i5].w();
                            oj9VarW.getClass();
                            oj9 oj9Var = this.I.a(i4).d[0];
                            String str = oj9VarW.n;
                            String str2 = oj9Var.n;
                            int i6 = dzd.i(str);
                            if (i6 == 3) {
                                if (Objects.equals(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || oj9VarW.K == oj9Var.K)) {
                                    break;
                                } else {
                                    i5++;
                                }
                            } else if (i6 == dzd.i(str2)) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    this.K[i4] = i5;
                }
                ArrayList arrayList = this.s;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((ofa) obj).a();
                }
                return;
            }
            int length = this.v.length;
            int i7 = 0;
            int i8 = -1;
            int i9 = -2;
            while (true) {
                int i10 = 1;
                if (i7 >= length) {
                    break;
                }
                oj9 oj9VarW2 = this.v[i7].w();
                oj9VarW2.getClass();
                String str3 = oj9VarW2.n;
                if (dzd.o(str3)) {
                    i10 = 2;
                } else if (!dzd.k(str3)) {
                    i10 = dzd.n(str3) ? 3 : -2;
                }
                if (q(i10) > q(i9)) {
                    i8 = i7;
                    i9 = i10;
                } else if (i10 == i9 && i8 != -1) {
                    i8 = -1;
                }
                i7++;
            }
            eyl eylVar = this.d.h;
            int i11 = eylVar.a;
            this.L = -1;
            this.K = new int[length];
            for (int i12 = 0; i12 < length; i12++) {
                this.K[i12] = i12;
            }
            eyl[] eylVarArr = new eyl[length];
            int i13 = 0;
            while (i13 < length) {
                oj9 oj9VarW3 = this.v[i13].w();
                oj9VarW3.getClass();
                String str4 = this.a;
                oj9 oj9Var2 = this.f;
                if (i13 == i8) {
                    oj9[] oj9VarArr = new oj9[i11];
                    for (int i14 = i2; i14 < i11; i14++) {
                        oj9 oj9VarD = eylVar.d[i14];
                        if (i9 == 1 && oj9Var2 != null) {
                            oj9VarD = oj9VarD.d(oj9Var2);
                        }
                        oj9VarArr[i14] = i11 == 1 ? oj9VarW3.d(oj9VarD) : n(oj9VarD, oj9VarW3, true);
                    }
                    eylVarArr[i13] = new eyl(str4, oj9VarArr);
                    this.L = i13;
                    i = 0;
                } else {
                    if (i9 != 2 || !dzd.k(oj9VarW3.n)) {
                        oj9Var2 = null;
                    }
                    StringBuilder sbR = p3p.r(str4, ":muxed:");
                    sbR.append(i13 < i8 ? i13 : i13 - 1);
                    i = 0;
                    eylVarArr[i13] = new eyl(sbR.toString(), n(oj9Var2, oj9VarW3, false));
                }
                i13++;
                i2 = i;
            }
            int i15 = i2;
            this.I = m(eylVarArr);
            z4o.H(this.J == null ? 1 : i15);
            this.J = Collections.EMPTY_SET;
            this.D = true;
            this.c.B();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [rfa[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [rfa[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [hyl] */
    /* JADX WARN: Type inference failed for: r5v4, types: [rfa, uhi] */
    /* JADX WARN: Type inference failed for: r5v6, types: [s97] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.en8
    public final hyl track(int i, int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        Set set = Y;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.x;
        SparseIntArray sparseIntArray = this.y;
        ?? rfaVar = 0;
        rfaVar = 0;
        if (zContains) {
            z4o.w(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.w[i3] = i;
                }
                rfaVar = this.w[i3] == i ? this.v[i3] : l(i, i2);
            }
        } else {
            int i4 = 0;
            while (true) {
                ?? r1 = this.v;
                if (i4 >= r1.length) {
                    break;
                }
                if (this.w[i4] == i) {
                    rfaVar = r1[i4];
                    break;
                }
                i4++;
            }
        }
        if (rfaVar == 0) {
            if (this.U) {
                return l(i, i2);
            }
            int length = this.v.length;
            boolean z = i2 == 1 || i2 == 2;
            rfaVar = new rfa(this.e, this.g, this.h, this.t);
            rfaVar.t = this.P;
            if (z) {
                rfaVar.I = this.W;
                rfaVar.z = true;
            }
            long j = this.V;
            if (rfaVar.F != j) {
                rfaVar.F = j;
                rfaVar.z = true;
            }
            if (this.X != null) {
                rfaVar.C = r6.k;
            }
            rfaVar.f = this;
            int i5 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.w, i5);
            this.w = iArrCopyOf;
            iArrCopyOf[length] = i;
            rfa[] rfaVarArr = this.v;
            String str = tym.a;
            ?? CopyOf = Arrays.copyOf(rfaVarArr, rfaVarArr.length + 1);
            CopyOf[rfaVarArr.length] = rfaVar;
            this.v = (rfa[]) CopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.O, i5);
            this.O = zArrCopyOf;
            zArrCopyOf[length] = z;
            this.M |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (q(i2) > q(this.A)) {
                this.B = length;
                this.A = i2;
            }
            this.N = Arrays.copyOf(this.N, i5);
        }
        if (i2 != 5) {
            return rfaVar;
        }
        qfa qfaVar = this.z;
        if (qfaVar != null) {
            return qfaVar;
        }
        qfa qfaVar2 = new qfa(rfaVar, this.l ? 1 : 0);
        this.z = qfaVar2;
        return qfaVar2;
    }

    @Override // defpackage.osc
    public final psc u(rsc rscVar, long j, long j2, IOException iOException, int i) {
        boolean zC;
        psc pscVar;
        int i2;
        wz4 wz4Var = (wz4) rscVar;
        boolean z = wz4Var instanceof uea;
        if (z && !((uea) wz4Var).f() && (iOException instanceof loa) && ((i2 = ((loa) iOException).c) == 410 || i2 == 404)) {
            return qb7.e;
        }
        long j3 = wz4Var.i.b;
        nd6 nd6Var = wz4Var.b;
        vbk vbkVar = wz4Var.i;
        bsc bscVar = new bsc(nd6Var, vbkVar.c, vbkVar.d, j, j2, j3);
        tym.c0(wz4Var.g);
        tym.c0(wz4Var.h);
        bp bpVar = new bp(iOException, i);
        tea teaVar = this.d;
        z16 z16VarF = n6h.f(teaVar.r);
        this.i.getClass();
        asc ascVarG = i06.g(z16VarF, bpVar);
        if (ascVarG == null || ascVarG.a != 2) {
            zC = false;
        } else {
            long j4 = ascVarG.b;
            bj8 bj8Var = teaVar.r;
            zC = bj8Var.c(bj8Var.indexOf(teaVar.h.b(wz4Var.d)), j4);
        }
        if (zC) {
            if (z && j3 == 0) {
                ArrayList arrayList = this.n;
                z4o.H(((uea) vep.r(1, arrayList)) == wz4Var);
                if (arrayList.isEmpty()) {
                    this.Q = this.P;
                } else {
                    ((uea) sfe.c0(arrayList)).J = true;
                }
            }
            pscVar = qb7.f;
        } else {
            long jL = i06.l(bpVar);
            pscVar = jL != -9223372036854775807L ? new psc(0, jL) : qb7.g;
        }
        psc pscVar2 = pscVar;
        boolean zA = pscVar2.a();
        this.k.z(bscVar, wz4Var.c, this.b, wz4Var.d, wz4Var.e, wz4Var.f, wz4Var.g, wz4Var.h, iOException, !zA);
        if (!zA) {
            this.u = null;
        }
        if (zC) {
            if (!this.D) {
                ftc ftcVar = new ftc();
                ftcVar.a = this.P;
                g(new gtc(ftcVar));
                return pscVar2;
            }
            this.c.j(this);
        }
        return pscVar2;
    }

    public final void v() throws IOException {
        this.j.maybeThrowError();
        tea teaVar = this.d;
        uc3 uc3Var = teaVar.n;
        if (uc3Var != null) {
            throw uc3Var;
        }
        Uri uri = teaVar.o;
        if (uri == null || !uri.equals(teaVar.p)) {
            return;
        }
        uq6 uq6Var = teaVar.g;
        tq6 tq6Var = (tq6) uq6Var.d.get(teaVar.o);
        tq6Var.b.maybeThrowError();
        IOException iOException = tq6Var.j;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void w(eyl[] eylVarArr, int... iArr) {
        this.I = m(eylVarArr);
        this.J = new HashSet();
        for (int i : iArr) {
            this.J.add(this.I.a(i));
        }
        this.L = 0;
        this.r.post(new ld9(this.c, (byte) 21));
        this.D = true;
    }

    public final void x() {
        for (rfa rfaVar : this.v) {
            rfaVar.D(this.R);
        }
        this.R = false;
    }

    public final boolean y(long j, boolean z) throws Throwable {
        uea ueaVar;
        boolean zF;
        this.P = j;
        if (s()) {
            this.Q = j;
            return true;
        }
        boolean z2 = this.d.q;
        ArrayList arrayList = this.n;
        if (z2) {
            for (int i = 0; i < arrayList.size(); i++) {
                ueaVar = (uea) arrayList.get(i);
                if (ueaVar.g == j) {
                    break;
                }
            }
            ueaVar = null;
        } else {
            ueaVar = null;
        }
        if (this.C && !z && !arrayList.isEmpty()) {
            int length = this.v.length;
            for (int i2 = 0; i2 < length; i2++) {
                rfa rfaVar = this.v[i2];
                if (ueaVar != null) {
                    zF = rfaVar.E(ueaVar.e(i2));
                } else {
                    long nextLoadPositionUs = getNextLoadPositionUs();
                    zF = rfaVar.F(j, nextLoadPositionUs == Long.MIN_VALUE || j < nextLoadPositionUs);
                }
                if (zF || (!this.O[i2] && this.M)) {
                }
            }
            return false;
        }
        this.Q = j;
        this.T = false;
        arrayList.clear();
        qb7 qb7Var = this.j;
        if (!qb7Var.s()) {
            qb7Var.c = null;
            x();
            return true;
        }
        if (this.C) {
            for (rfa rfaVar2 : this.v) {
                rfaVar2.k();
            }
        }
        qb7Var.i();
        return true;
    }
}
