package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b05 implements vhi, n1j, osc, usc {
    public final int a;
    public final int[] b;
    public final oj9[] c;
    public final boolean[] d;
    public final gn6 e;
    public final ab6 f;
    public final ro9 g;
    public final i06 h;
    public final qb7 i;
    public final nrl j;
    public final ArrayList k;
    public final List l;
    public final uhi m;
    public final uhi[] n;
    public final k5o o;
    public wz4 p;
    public oj9 q;
    public ab6 r;
    public long s;
    public long t;
    public int u;
    public i73 v;
    public boolean w;
    public boolean x;
    public boolean y;

    public b05(int i, int[] iArr, oj9[] oj9VarArr, gn6 gn6Var, ab6 ab6Var, l45 l45Var, long j, em7 em7Var, am7 am7Var, i06 i06Var, ro9 ro9Var, boolean z, enb enbVar) {
        this.a = i;
        this.b = iArr;
        this.c = oj9VarArr;
        this.e = gn6Var;
        this.f = ab6Var;
        this.g = ro9Var;
        this.h = i06Var;
        this.w = z;
        this.i = enbVar != null ? new qb7(enbVar) : new qb7("ChunkSampleStream");
        this.j = new nrl();
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.n = new uhi[length];
        this.d = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        uhi[] uhiVarArr = new uhi[i2];
        em7Var.getClass();
        uhi uhiVar = new uhi(l45Var, em7Var, am7Var);
        this.m = uhiVar;
        int i3 = 0;
        iArr2[0] = i;
        uhiVarArr[0] = uhiVar;
        while (i3 < length) {
            uhi uhiVar2 = new uhi(l45Var, null, null);
            this.n[i3] = uhiVar2;
            int i4 = i3 + 1;
            uhiVarArr[i4] = uhiVar2;
            iArr2[i4] = this.b[i3];
            i3 = i4;
        }
        this.o = new k5o(iArr2, uhiVarArr, (byte) 5);
        this.s = j;
        this.t = j;
    }

    @Override // defpackage.vhi
    public final int c(i16 i16Var, qj6 qj6Var, int i) {
        if (l()) {
            return -3;
        }
        i73 i73Var = this.v;
        uhi uhiVar = this.m;
        if (i73Var != null && i73Var.c(0) <= uhiVar.t()) {
            return -3;
        }
        m();
        return uhiVar.C(i16Var, qj6Var, i, this.y);
    }

    @Override // defpackage.osc
    public final void d(rsc rscVar, long j, long j2, boolean z) {
        wz4 wz4Var = (wz4) rscVar;
        this.p = null;
        this.v = null;
        long j3 = wz4Var.a;
        nd6 nd6Var = wz4Var.b;
        vbk vbkVar = wz4Var.i;
        bsc bscVar = new bsc(nd6Var, vbkVar.c, vbkVar.d, j, j2, vbkVar.b);
        this.h.getClass();
        this.g.x(bscVar, wz4Var.c, this.a, wz4Var.d, wz4Var.e, wz4Var.f, wz4Var.g, wz4Var.h);
        if (z) {
            return;
        }
        if (l()) {
            this.m.D(false);
            for (uhi uhiVar : this.n) {
                uhiVar.D(false);
            }
        } else if (wz4Var instanceof i73) {
            ArrayList arrayList = this.k;
            h(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.s = this.t;
            }
        }
        this.f.j(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03f8  */
    @Override // defpackage.n1j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(defpackage.gtc r60) {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b05.g(gtc):boolean");
    }

    @Override // defpackage.n1j
    public final long getBufferedPositionUs() {
        if (this.y) {
            return Long.MIN_VALUE;
        }
        if (l()) {
            return this.s;
        }
        long jMax = this.t;
        i73 i73VarJ = j();
        if (!i73VarJ.b()) {
            ArrayList arrayList = this.k;
            i73VarJ = arrayList.size() > 1 ? (i73) am2.k(2, arrayList) : null;
        }
        if (i73VarJ != null) {
            jMax = Math.max(jMax, i73VarJ.h);
        }
        return Math.max(jMax, this.m.q());
    }

    @Override // defpackage.n1j
    public final long getNextLoadPositionUs() {
        if (l()) {
            return this.s;
        }
        if (this.y) {
            return Long.MIN_VALUE;
        }
        return j().h;
    }

    public final i73 h(int i) {
        ArrayList arrayList = this.k;
        i73 i73Var = (i73) arrayList.get(i);
        tym.T(arrayList, i, arrayList.size());
        this.u = Math.max(this.u, arrayList.size());
        int i2 = 0;
        this.m.n(i73Var.c(0));
        while (true) {
            uhi[] uhiVarArr = this.n;
            if (i2 >= uhiVarArr.length) {
                return i73Var;
            }
            uhi uhiVar = uhiVarArr[i2];
            i2++;
            uhiVar.n(i73Var.c(i2));
        }
    }

    @Override // defpackage.osc
    public final void i(rsc rscVar, long j, long j2) {
        wz4 wz4Var = (wz4) rscVar;
        this.p = null;
        gn6 gn6Var = this.e;
        en6[] en6VarArr = gn6Var.h;
        if (wz4Var instanceof r7b) {
            int iF = gn6Var.i.f(((r7b) wz4Var).d);
            en6 en6Var = en6VarArr[iF];
            if (en6Var.d == null) {
                m14 m14Var = en6Var.a;
                m14Var.getClass();
                xz4 xz4VarA = m14Var.a();
                if (xz4VarA != null) {
                    evh evhVar = en6Var.b;
                    en6VarArr[iF] = new en6(en6Var.e, evhVar, en6Var.c, en6Var.a, en6Var.f, new yv4(xz4VarA, evhVar.c, (byte) 2));
                }
            }
        }
        bjg bjgVar = gn6Var.g;
        if (bjgVar != null) {
            long j3 = bjgVar.d;
            if (j3 == -9223372036854775807L || wz4Var.h > j3) {
                bjgVar.d = wz4Var.h;
            }
            bjgVar.e.g = true;
        }
        long j4 = wz4Var.a;
        nd6 nd6Var = wz4Var.b;
        vbk vbkVar = wz4Var.i;
        bsc bscVar = new bsc(nd6Var, vbkVar.c, vbkVar.d, j, j2, vbkVar.b);
        this.h.getClass();
        this.g.y(bscVar, wz4Var.c, this.a, wz4Var.d, wz4Var.e, wz4Var.f, wz4Var.g, wz4Var.h);
        this.f.j(this);
    }

    @Override // defpackage.n1j
    public final boolean isLoading() {
        return this.i.s();
    }

    @Override // defpackage.vhi
    public final boolean isReady() {
        return !l() && this.m.x(this.y);
    }

    public final i73 j() {
        return (i73) am2.k(1, this.k);
    }

    public final boolean k(int i) {
        int iT;
        i73 i73Var = (i73) this.k.get(i);
        if (this.m.t() > i73Var.c(0)) {
            return true;
        }
        int i2 = 0;
        do {
            uhi[] uhiVarArr = this.n;
            if (i2 >= uhiVarArr.length) {
                return false;
            }
            iT = uhiVarArr[i2].t();
            i2++;
        } while (iT <= i73Var.c(i2));
        return true;
    }

    public final boolean l() {
        return this.s != -9223372036854775807L;
    }

    public final void m() {
        int iN = n(this.m.t(), this.u - 1);
        while (true) {
            int i = this.u;
            if (i > iN) {
                return;
            }
            this.u = i + 1;
            i73 i73Var = (i73) this.k.get(i);
            oj9 oj9Var = i73Var.d;
            if (!oj9Var.equals(this.q)) {
                this.g.n(this.a, oj9Var, i73Var.e, i73Var.f, i73Var.g);
            }
            this.q = oj9Var;
        }
    }

    @Override // defpackage.vhi
    public final void maybeThrowError() throws uc3 {
        qb7 qb7Var = this.i;
        qb7Var.maybeThrowError();
        this.m.z();
        if (qb7Var.s()) {
            return;
        }
        gn6 gn6Var = this.e;
        uc3 uc3Var = gn6Var.l;
        if (uc3Var != null) {
            throw uc3Var;
        }
        gn6Var.a.maybeThrowError();
    }

    public final int n(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.k;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((i73) arrayList.get(i2)).c(0) <= i);
        return i2 - 1;
    }

    public final void o(ab6 ab6Var) {
        this.r = ab6Var;
        uhi uhiVar = this.m;
        uhiVar.k();
        xl7 xl7Var = uhiVar.h;
        if (xl7Var != null) {
            xl7Var.d(uhiVar.e);
            uhiVar.h = null;
            uhiVar.g = null;
        }
        for (uhi uhiVar2 : this.n) {
            uhiVar2.k();
            xl7 xl7Var2 = uhiVar2.h;
            if (xl7Var2 != null) {
                xl7Var2.d(uhiVar2.e);
                uhiVar2.h = null;
                uhiVar2.g = null;
            }
        }
        this.i.y(this);
    }

    public final void onLoaderReleased() {
        uhi uhiVar = this.m;
        uhiVar.D(true);
        xl7 xl7Var = uhiVar.h;
        if (xl7Var != null) {
            xl7Var.d(uhiVar.e);
            uhiVar.h = null;
            uhiVar.g = null;
        }
        for (uhi uhiVar2 : this.n) {
            uhiVar2.D(true);
            xl7 xl7Var2 = uhiVar2.h;
            if (xl7Var2 != null) {
                xl7Var2.d(uhiVar2.e);
                uhiVar2.h = null;
                uhiVar2.g = null;
            }
        }
        for (en6 en6Var : this.e.h) {
            m14 m14Var = en6Var.a;
            if (m14Var != null) {
                m14Var.a.release();
            }
        }
        ab6 ab6Var = this.r;
        if (ab6Var != null) {
            synchronized (ab6Var) {
                bjg bjgVar = (bjg) ab6Var.n.remove(this);
                if (bjgVar != null) {
                    uhi uhiVar3 = bjgVar.a;
                    uhiVar3.D(true);
                    xl7 xl7Var3 = uhiVar3.h;
                    if (xl7Var3 != null) {
                        xl7Var3.d(null);
                        uhiVar3.h = null;
                        uhiVar3.g = null;
                    }
                }
            }
        }
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
        this.g.B(bscVar, wz4Var.c, this.a, wz4Var.d, wz4Var.e, wz4Var.f, wz4Var.g, wz4Var.h, i);
    }

    @Override // defpackage.n1j
    public final void reevaluateBuffer(long j) {
        qb7 qb7Var = this.i;
        if (qb7Var.q() || l()) {
            return;
        }
        boolean zS = qb7Var.s();
        List list = this.l;
        gn6 gn6Var = this.e;
        ArrayList arrayList = this.k;
        if (zS) {
            wz4 wz4Var = this.p;
            wz4Var.getClass();
            boolean z = wz4Var instanceof i73;
            if (z && k(arrayList.size() - 1)) {
                return;
            }
            if (gn6Var.l == null ? gn6Var.i.b(j, wz4Var, list) : false) {
                qb7Var.i();
                if (z) {
                    this.v = (i73) wz4Var;
                    return;
                }
                return;
            }
            return;
        }
        int size = (gn6Var.l != null || gn6Var.i.length() < 2) ? list.size() : gn6Var.i.evaluateQueueSize(j, list);
        if (size < arrayList.size()) {
            z4o.H(!qb7Var.s());
            int size2 = arrayList.size();
            while (true) {
                if (size >= size2) {
                    size = -1;
                    break;
                } else if (!k(size)) {
                    break;
                } else {
                    size++;
                }
            }
            if (size != -1) {
                long j2 = j().h;
                i73 i73VarH = h(size);
                if (arrayList.isEmpty()) {
                    this.s = this.t;
                }
                this.y = false;
                this.g.d0(this.a, i73VarH.g, j2);
            }
        }
    }

    @Override // defpackage.vhi
    public final int skipData(long j) {
        if (l()) {
            return 0;
        }
        boolean z = this.y;
        uhi uhiVar = this.m;
        int iV = uhiVar.v(j, z);
        i73 i73Var = this.v;
        if (i73Var != null) {
            iV = Math.min(iV, i73Var.c(0) - uhiVar.t());
        }
        uhiVar.G(iV);
        m();
        return iV;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0229  */
    @Override // defpackage.osc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.psc u(defpackage.rsc r28, long r29, long r31, java.io.IOException r33, int r34) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b05.u(rsc, long, long, java.io.IOException, int):psc");
    }
}
