package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class zi8 implements Handler.Callback, mkd, oyl, y3n {
    public static final long d0 = tym.c0(10000);
    public boolean A;
    public boolean B;
    public yi8 C;
    public int D;
    public shg E;
    public wi8 F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public long K;
    public boolean L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public yi8 S;
    public long T;
    public long U;
    public int V;
    public boolean W;
    public zh8 X;
    public long Y;
    public bi8 Z;
    public final muh[] a;
    public long a0;
    public final kuh[] b;
    public boolean b0;
    public final boolean[] c;
    public float c0;
    public final jx6 d;
    public final pyl e;
    public final xs6 f;
    public final pl6 g;
    public final szk h;
    public final zg i;
    public final Looper j;
    public final fql k;
    public final dql l;
    public final long m;
    public final qt6 n;
    public final ArrayList o;
    public final fi8 p;
    public final qkd q;
    public final vq8 r;
    public final ds6 s;
    public final fjg t;
    public final el6 u;
    public final szk v;
    public final boolean w;
    public final mg2 x;
    public uwi y;
    public upi z;

    public zi8(Context context, q83[] q83VarArr, q83[] q83VarArr2, jx6 jx6Var, pyl pylVar, xs6 xs6Var, pl6 pl6Var, int i, boolean z, el6 el6Var, uwi uwiVar, ds6 ds6Var, Looper looper, fi8 fi8Var, fjg fjgVar, final y3n y3nVar) {
        Looper looper2;
        bi8 bi8Var = bi8.a;
        this.a0 = -9223372036854775807L;
        this.p = fi8Var;
        this.d = jx6Var;
        this.e = pylVar;
        this.f = xs6Var;
        this.g = pl6Var;
        this.M = i;
        this.N = z;
        this.y = uwiVar;
        this.s = ds6Var;
        boolean z2 = false;
        this.H = false;
        this.t = fjgVar;
        this.Z = bi8Var;
        this.u = el6Var;
        this.c0 = 1.0f;
        this.z = upi.b;
        this.Y = -9223372036854775807L;
        this.K = -9223372036854775807L;
        this.m = xs6Var.l;
        cql cqlVar = gql.a;
        shg shgVarK = shg.k(pylVar);
        this.E = shgVarK;
        this.F = new wi8(shgVarK);
        this.b = new kuh[q83VarArr.length];
        this.c = new boolean[q83VarArr.length];
        jx6Var.getClass();
        this.a = new muh[q83VarArr.length];
        boolean z3 = false;
        for (int i2 = 0; i2 < q83VarArr.length; i2++) {
            q83 q83Var = q83VarArr[i2];
            kzk kzkVar = kzk.a;
            q83Var.e = i2;
            q83Var.f = fjgVar;
            q83Var.g = kzkVar;
            this.b[i2] = q83Var;
            this.b[i2].p(jx6Var);
            q83 q83Var2 = q83VarArr2[i2];
            if (q83Var2 != null) {
                q83Var2.e = i2;
                q83Var2.f = fjgVar;
                q83Var2.g = kzkVar;
                z3 = true;
            }
            this.a[i2] = new muh(q83VarArr[i2], q83Var2, i2);
        }
        this.w = z3;
        qt6 qt6Var = new qt6();
        qt6Var.d = this;
        e3k e3kVar = new e3k();
        e3kVar.d = thg.d;
        qt6Var.c = e3kVar;
        qt6Var.a = true;
        this.n = qt6Var;
        this.o = new ArrayList();
        this.k = new fql();
        this.l = new dql();
        z4o.H(jx6Var.a == null);
        jx6Var.a = this;
        jx6Var.b = pl6Var;
        this.W = true;
        szk szkVar = new szk(new Handler(looper, null));
        this.v = szkVar;
        this.q = new qkd(el6Var, szkVar, new uk6(this, (byte) 29));
        this.r = new vq8(this, el6Var, szkVar, fjgVar);
        zg zgVar = new zg((byte) 9);
        this.i = zgVar;
        synchronized (zgVar.b) {
            looper2 = (Looper) zgVar.c;
            if (looper2 == null) {
                if (zgVar.a == 0 && ((HandlerThread) zgVar.d) == null) {
                    z2 = true;
                }
                z4o.H(z2);
                HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                zgVar.d = handlerThread;
                handlerThread.start();
                looper2 = ((HandlerThread) zgVar.d).getLooper();
                zgVar.c = looper2;
            }
            zgVar.a++;
        }
        this.j = looper2;
        szk szkVar2 = new szk(new Handler(looper2, this));
        this.h = szkVar2;
        this.x = new mg2(context, looper2, this);
        szkVar2.a(35, new y3n() { // from class: si8
            @Override // defpackage.y3n
            public final void b(long j, long j2, oj9 oj9Var, MediaFormat mediaFormat) {
                y3nVar.b(j, j2, oj9Var, mediaFormat);
                this.a.b(j, j2, oj9Var, mediaFormat);
            }
        }).b();
    }

    public static Pair Q(gql gqlVar, yi8 yi8Var, boolean z, int i, boolean z2, fql fqlVar, dql dqlVar) {
        int iR;
        gql gqlVar2 = yi8Var.a;
        if (gqlVar.p()) {
            return null;
        }
        gql gqlVar3 = gqlVar2.p() ? gqlVar : gqlVar2;
        try {
            Pair pairI = gqlVar3.i(fqlVar, dqlVar, yi8Var.b, yi8Var.c);
            if (!gqlVar.equals(gqlVar3)) {
                if (gqlVar.b(pairI.first) == -1) {
                    if (!z || (iR = R(fqlVar, dqlVar, i, z2, pairI.first, gqlVar3, gqlVar)) == -1) {
                        return null;
                    }
                    return gqlVar.i(fqlVar, dqlVar, iR, -9223372036854775807L);
                }
                if (gqlVar3.g(pairI.first, dqlVar).f && gqlVar3.m(dqlVar.c, fqlVar, 0L).m == gqlVar3.b(pairI.first)) {
                    return gqlVar.i(fqlVar, dqlVar, gqlVar.g(pairI.first, dqlVar).c, yi8Var.c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int R(fql fqlVar, dql dqlVar, int i, boolean z, Object obj, gql gqlVar, gql gqlVar2) {
        fql fqlVar2 = fqlVar;
        gql gqlVar3 = gqlVar;
        Object obj2 = gqlVar3.m(gqlVar3.g(obj, dqlVar).c, fqlVar, 0L).a;
        for (int i2 = 0; i2 < gqlVar2.o(); i2++) {
            if (gqlVar2.m(i2, fqlVar, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int iB = gqlVar3.b(obj);
        int iH = gqlVar3.h();
        int iB2 = -1;
        int i3 = 0;
        while (i3 < iH && iB2 == -1) {
            gql gqlVar4 = gqlVar3;
            int iD = gqlVar4.d(iB, dqlVar, fqlVar2, i, z);
            if (iD == -1) {
                break;
            }
            iB2 = gqlVar2.b(gqlVar4.l(iD));
            i3++;
            gqlVar3 = gqlVar4;
            iB = iD;
            fqlVar2 = fqlVar;
        }
        if (iB2 == -1) {
            return -1;
        }
        return gqlVar2.f(iB2, dqlVar, false).c;
    }

    public static boolean y(okd okdVar) {
        if (okdVar != null) {
            try {
                nkd nkdVar = okdVar.a;
                if (okdVar.e) {
                    for (vhi vhiVar : okdVar.c) {
                        if (vhiVar != null) {
                            vhiVar.maybeThrowError();
                        }
                    }
                } else {
                    nkdVar.maybeThrowPrepareError();
                }
                if ((!okdVar.e ? 0L : nkdVar.getNextLoadPositionUs()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A() {
        okd okdVar = this.q.i;
        long j = okdVar.g.e;
        if (okdVar.e) {
            return j == -9223372036854775807L || this.E.s < j || !n0();
        }
        return false;
    }

    public final void B() {
        boolean zB;
        if (y(this.q.l)) {
            okd okdVar = this.q.l;
            long jN = n(!okdVar.e ? 0L : okdVar.a.getNextLoadPositionUs());
            okd okdVar2 = this.q.i;
            long j = o0(this.E.a, okdVar.g.a) ? this.s.h : -9223372036854775807L;
            fjg fjgVar = this.t;
            gql gqlVar = this.E.a;
            jrd jrdVar = okdVar.g.a;
            float f = this.n.getPlaybackParameters().a;
            boolean z = this.E.l;
            zrc zrcVar = new zrc(fjgVar, gqlVar, jrdVar, jN, f, this.J, j);
            zB = this.f.b(zrcVar);
            okd okdVar3 = this.q.i;
            if (!zB && okdVar3.e && jN < 500000 && this.m > 0) {
                okdVar3.a.e(this.E.s);
                zB = this.f.b(zrcVar);
            }
        } else {
            zB = false;
        }
        this.L = zB;
        if (zB) {
            okd okdVar4 = this.q.l;
            okdVar4.getClass();
            ftc ftcVar = new ftc();
            ftcVar.a = this.T - okdVar4.p;
            float f2 = this.n.getPlaybackParameters().a;
            z4o.w(f2 > 0.0f || f2 == -3.4028235E38f);
            ftcVar.b = f2;
            long j2 = this.K;
            z4o.w(j2 >= 0 || j2 == -9223372036854775807L);
            ftcVar.c = j2;
            gtc gtcVar = new gtc(ftcVar);
            z4o.H(okdVar4.m == null);
            okdVar4.a.g(gtcVar);
        }
        s0();
    }

    public final void C() {
        qkd qkdVar = this.q;
        qkdVar.k();
        okd okdVar = qkdVar.m;
        if (okdVar != null) {
            nkd nkdVar = okdVar.a;
            if ((!okdVar.d || okdVar.e) && !nkdVar.isLoading()) {
                gql gqlVar = this.E.a;
                if (okdVar.e) {
                    nkdVar.getBufferedPositionUs();
                }
                Iterator it = this.f.n.values().iterator();
                while (it.hasNext()) {
                    if (((ws6) it.next()).b) {
                        return;
                    }
                }
                if (!okdVar.d) {
                    long j = okdVar.g.b;
                    okdVar.d = true;
                    nkdVar.f(this, j);
                    return;
                }
                ftc ftcVar = new ftc();
                ftcVar.a = this.T - okdVar.p;
                float f = this.n.getPlaybackParameters().a;
                z4o.w(f > 0.0f || f == -3.4028235E38f);
                ftcVar.b = f;
                long j2 = this.K;
                z4o.w(j2 >= 0 || j2 == -9223372036854775807L);
                ftcVar.c = j2;
                gtc gtcVar = new gtc(ftcVar);
                z4o.H(okdVar.m == null);
                nkdVar.g(gtcVar);
            }
        }
    }

    public final void D() {
        wi8 wi8Var = this.F;
        shg shgVar = this.E;
        boolean z = wi8Var.a | (wi8Var.b != shgVar);
        wi8Var.a = z;
        wi8Var.b = shgVar;
        if (z) {
            qi8 qi8Var = this.p.b;
            qi8Var.k.c(new cn7(qi8Var, wi8Var, (byte) 17));
            this.F = new wi8(this.E);
        }
    }

    public final void E(int i) {
        muh muhVar = this.a[i];
        try {
            okd okdVar = this.q.i;
            okdVar.getClass();
            q83 q83VarD = muhVar.d(okdVar);
            q83VarD.getClass();
            vhi vhiVar = q83VarD.i;
            vhiVar.getClass();
            vhiVar.maybeThrowError();
        } catch (IOException | RuntimeException e) {
            byte b = muhVar.a.b;
            if (b != 3 && b != 5) {
                throw e;
            }
            pyl pylVar = this.q.i.o;
            w7d.r("Disabling track due to error: ".concat(oj9.c(((bj8[]) pylVar.d)[i].getSelectedFormat())), e);
            pyl pylVar2 = new pyl((luh[]) ((luh[]) pylVar.c).clone(), (bj8[]) ((bj8[]) pylVar.d).clone(), (fzl) pylVar.e, (pr) pylVar.f);
            ((luh[]) pylVar2.c)[i] = null;
            ((bj8[]) pylVar2.d)[i] = null;
            f(i);
            okd okdVar2 = this.q.i;
            okdVar2.a(pylVar2, this.E.s, false, new boolean[okdVar2.j.length]);
        }
    }

    public final void F(int i, boolean z) {
        boolean[] zArr = this.c;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.v.c(new ri8((byte) 0, i, this, z));
        }
    }

    public final void G() throws Throwable {
        u(this.r.e(), true);
    }

    public final void H(vi8 vi8Var) throws Throwable {
        gql gqlVarE;
        this.F.a(1);
        int i = vi8Var.a;
        int i2 = vi8Var.b;
        int i3 = vi8Var.c;
        jij jijVar = vi8Var.d;
        vq8 vq8Var = this.r;
        ArrayList arrayList = (ArrayList) vq8Var.c;
        z4o.w(i >= 0 && i <= i2 && i2 <= arrayList.size() && i3 >= 0);
        vq8Var.k = jijVar;
        if (i == i2 || i == i3) {
            gqlVarE = vq8Var.e();
        } else {
            int iMin = Math.min(i, i3);
            int iMax = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int iO = ((xrd) arrayList.get(iMin)).d;
            tym.M(arrayList, i, i2, i3);
            while (iMin <= iMax) {
                xrd xrdVar = (xrd) arrayList.get(iMin);
                xrdVar.d = iO;
                iO += xrdVar.a.o.e.o();
                iMin++;
            }
            gqlVarE = vq8Var.e();
        }
        u(gqlVarE, false);
    }

    public final void I() {
        this.F.a(1);
        M(false, false, false, true);
        xs6 xs6Var = this.f;
        ConcurrentHashMap concurrentHashMap = xs6Var.n;
        long id = Thread.currentThread().getId();
        long j = xs6Var.o;
        z4o.G("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        xs6Var.o = id;
        fjg fjgVar = this.t;
        ws6 ws6Var = (ws6) concurrentHashMap.get(fjgVar);
        if (ws6Var == null) {
            ws6 ws6Var2 = new ws6();
            ws6Var2.a = 1;
            concurrentHashMap.put(fjgVar, ws6Var2);
        } else {
            ws6Var.a++;
        }
        ws6 ws6Var3 = (ws6) concurrentHashMap.get(fjgVar);
        ws6Var3.getClass();
        Integer num = (Integer) xs6Var.m.get(fjgVar.a);
        int iIntValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        if (iIntValue == -1) {
            iIntValue = 13107200;
        }
        ws6Var3.c = iIntValue;
        ws6Var3.b = false;
        j0(this.E.a.p() ? 4 : 2);
        shg shgVar = this.E;
        boolean z = shgVar.l;
        v0(this.x.c(shgVar.e, z), shgVar.n, shgVar.m, z);
        pl6 pl6Var = this.g;
        pl6Var.getClass();
        vq8 vq8Var = this.r;
        ArrayList arrayList = (ArrayList) vq8Var.c;
        z4o.H(!vq8Var.a);
        vq8Var.l = pl6Var;
        for (int i = 0; i < arrayList.size(); i++) {
            xrd xrdVar = (xrd) arrayList.get(i);
            vq8Var.o(xrdVar);
            ((HashSet) vq8Var.h).add(xrdVar);
        }
        vq8Var.a = true;
        this.h.e(2);
    }

    public final void J(rj5 rj5Var) {
        zg zgVar = this.i;
        szk szkVar = this.h;
        try {
            M(true, false, true, false);
            muh[] muhVarArr = this.a;
            for (int i = 0; i < muhVarArr.length; i++) {
                this.b[i].d();
                muh muhVar = muhVarArr[i];
                q83 q83Var = muhVar.a;
                z4o.H(q83Var.h == 0);
                q83Var.r();
                muhVar.e = false;
                q83 q83Var2 = muhVar.c;
                if (q83Var2 != null) {
                    z4o.H(q83Var2.h == 0);
                    q83Var2.r();
                    muhVar.f = false;
                }
            }
            xs6 xs6Var = this.f;
            fjg fjgVar = this.t;
            ConcurrentHashMap concurrentHashMap = xs6Var.n;
            ws6 ws6Var = (ws6) concurrentHashMap.get(fjgVar);
            if (ws6Var != null) {
                int i2 = ws6Var.a - 1;
                ws6Var.a = i2;
                if (i2 == 0) {
                    concurrentHashMap.remove(fjgVar);
                    xs6Var.c();
                }
            }
            if (xs6Var.n.isEmpty()) {
                xs6Var.o = -1L;
            }
            mg2 mg2Var = this.x;
            mg2Var.c = null;
            mg2Var.a();
            mg2Var.b(0);
            this.d.g();
            j0(1);
        } finally {
            szkVar.a.removeCallbacksAndMessages(null);
            zgVar.z();
            rj5Var.c();
        }
    }

    public final void K(int i, int i2, jij jijVar) throws Throwable {
        this.F.a(1);
        vq8 vq8Var = this.r;
        vq8Var.getClass();
        z4o.w(i >= 0 && i <= i2 && i2 <= ((ArrayList) vq8Var.c).size());
        vq8Var.k = jijVar;
        vq8Var.r(i, i2);
        u(vq8Var.e(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0178 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L() {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi8.L():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi8.M(boolean, boolean, boolean, boolean):void");
    }

    public final void N() {
        okd okdVar = this.q.i;
        this.I = okdVar != null && okdVar.g.i && this.H;
    }

    public final void O(long j, boolean z) {
        okd okdVar = this.q.i;
        long j2 = j + (okdVar == null ? 1000000000000L : okdVar.p);
        this.T = j2;
        ((e3k) this.n.c).a(j2);
        for (muh muhVar : this.a) {
            long j3 = this.T;
            q83 q83VarD = muhVar.d(okdVar);
            if (q83VarD != null) {
                q83VarD.A(j3, false, z);
            }
        }
        for (okd okdVar2 = r0.i; okdVar2 != null; okdVar2 = okdVar2.m) {
            for (bj8 bj8Var : (bj8[]) okdVar2.o.d) {
                if (bj8Var != null) {
                    bj8Var.d();
                }
            }
        }
    }

    public final void P(gql gqlVar, gql gqlVar2) {
        if (gqlVar.p() && gqlVar2.p()) {
            return;
        }
        ArrayList arrayList = this.o;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            sko.s(arrayList.get(size));
            throw null;
        }
    }

    public final void S(long j) {
        boolean z = this.A;
        long j2 = d0;
        if (z) {
            this.z.getClass();
            jMin = this.E.e != 3 ? j2 : 1000L;
            for (muh muhVar : this.a) {
                long j3 = this.T;
                long j4 = this.U;
                q83 q83Var = muhVar.c;
                q83 q83Var2 = muhVar.a;
                long jI = muh.h(q83Var2) ? q83Var2.i(j3, j4) : Long.MAX_VALUE;
                if (q83Var != null && q83Var.h != 0) {
                    jI = Math.min(jI, q83Var.i(j3, j4));
                }
                jMin = Math.min(jMin, tym.c0(jI));
            }
            if (this.E.m()) {
                okd okdVar = this.q.i;
                if ((okdVar != null ? okdVar.m : null) != null) {
                    if ((tym.N(jMin) * this.E.o.a) + this.T >= r1.e()) {
                        jMin = Math.min(jMin, j2);
                    }
                }
            }
        } else if (this.E.e != 3 || n0()) {
            jMin = j2;
        }
        this.h.a.sendEmptyMessageAtTime(2, j + jMin);
    }

    public final void T(boolean z) {
        jrd jrdVar = this.q.i.g.a;
        long jV = V(jrdVar, this.E.s, true, false);
        if (jV != this.E.s) {
            shg shgVar = this.E;
            this.E = x(jrdVar, jV, shgVar.c, shgVar.d, z, 5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0173, code lost:
    
        r1.B = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(defpackage.yi8 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi8.U(yi8):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long V(defpackage.jrd r10, long r11, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi8.V(jrd, long, boolean, boolean):long");
    }

    public final void W(ckg ckgVar) {
        ckgVar.getClass();
        szk szkVar = this.h;
        if (ckgVar.e != this.j) {
            szkVar.a(15, ckgVar).b();
            return;
        }
        synchronized (ckgVar) {
        }
        try {
            ckgVar.a.handleMessage(ckgVar.c, ckgVar.d);
            ckgVar.a(true);
            int i = this.E.e;
            if (i == 3 || i == 2) {
                szkVar.e(2);
            }
        } catch (Throwable th) {
            ckgVar.a(true);
            throw th;
        }
    }

    public final void X(ckg ckgVar) {
        Looper looper = ckgVar.e;
        if (looper.getThread().isAlive()) {
            new szk(new Handler(looper, null)).c(new bn7(this, ckgVar));
        } else {
            w7d.K("Trying to send message on a dead thread.");
            ckgVar.a(false);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y(defpackage.pf2 r6, boolean r7) {
        /*
            r5 = this;
            jx6 r0 = r5.d
            pf2 r1 = r0.j
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto Lf
            r0.j = r6
            r0.e()
        Lf:
            if (r7 != 0) goto L12
            r6 = 0
        L12:
            mg2 r7 = r5.x
            pf2 r0 = r7.d
            boolean r0 = java.util.Objects.equals(r0, r6)
            if (r0 != 0) goto L4c
            r7.d = r6
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L2e
            int r2 = r6.c
            r3 = 3
            r4 = 2
            switch(r2) {
                case 0: goto L3a;
                case 1: goto L38;
                case 2: goto L36;
                case 3: goto L2e;
                case 4: goto L36;
                case 5: goto L40;
                case 6: goto L40;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                case 10: goto L40;
                case 11: goto L32;
                case 12: goto L40;
                case 13: goto L40;
                case 14: goto L38;
                case 15: goto L29;
                case 16: goto L30;
                default: goto L29;
            }
        L29:
            java.lang.String r6 = "Unidentified audio usage: "
            vep.y(r2, r6)
        L2e:
            r3 = r0
            goto L40
        L30:
            r3 = 4
            goto L40
        L32:
            int r6 = r6.a
            if (r6 != r1) goto L40
        L36:
            r3 = r4
            goto L40
        L38:
            r3 = r1
            goto L40
        L3a:
            java.lang.String r6 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            defpackage.w7d.K(r6)
            goto L38
        L40:
            r7.f = r3
            if (r3 == r1) goto L46
            if (r3 != 0) goto L47
        L46:
            r0 = r1
        L47:
            java.lang.String r6 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            defpackage.z4o.v(r6, r0)
        L4c:
            shg r6 = r5.E
            boolean r0 = r6.l
            int r1 = r6.n
            int r2 = r6.m
            int r6 = r6.e
            int r6 = r7.c(r6, r0)
            r5.v0(r6, r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi8.Y(pf2, boolean):void");
    }

    public final void Z(boolean z, rj5 rj5Var) {
        if (this.O != z) {
            this.O = z;
            if (!z) {
                for (muh muhVar : this.a) {
                    muhVar.k();
                }
            }
        }
        if (rj5Var != null) {
            rj5Var.c();
        }
    }

    public final void a(ui8 ui8Var, int i) throws Throwable {
        this.F.a(1);
        vq8 vq8Var = this.r;
        if (i == -1) {
            i = ((ArrayList) vq8Var.c).size();
        }
        u(vq8Var.a(i, ui8Var.a, ui8Var.b), false);
    }

    public final void a0(ui8 ui8Var) throws Throwable {
        this.F.a(1);
        int i = ui8Var.c;
        jij jijVar = ui8Var.b;
        ArrayList arrayList = ui8Var.a;
        if (i != -1) {
            this.S = new yi8(new blg(arrayList, jijVar), ui8Var.c, ui8Var.d);
        }
        vq8 vq8Var = this.r;
        ArrayList arrayList2 = (ArrayList) vq8Var.c;
        vq8Var.r(0, arrayList2.size());
        u(vq8Var.a(arrayList2.size(), arrayList, jijVar), false);
    }

    @Override // defpackage.y3n
    public final void b(long j, long j2, oj9 oj9Var, MediaFormat mediaFormat) {
        if (this.B) {
            szk szkVar = this.h;
            szkVar.getClass();
            rzk rzkVarB = szk.b();
            rzkVarB.a = szkVar.a.obtainMessage(37);
            rzkVarB.b();
        }
    }

    public final void b0(boolean z) {
        this.H = z;
        N();
        if (this.I) {
            qkd qkdVar = this.q;
            if (qkdVar.j != qkdVar.i) {
                T(true);
                t(false);
            }
        }
    }

    public final void c() {
        for (muh muhVar : this.a) {
            upi upiVar = this.A ? this.z : null;
            muhVar.a.handleMessage(18, upiVar);
            q83 q83Var = muhVar.c;
            if (q83Var != null) {
                q83Var.handleMessage(18, upiVar);
            }
        }
    }

    public final void c0(thg thgVar) {
        this.h.d(16);
        qt6 qt6Var = this.n;
        qt6Var.c(thgVar);
        thg playbackParameters = qt6Var.getPlaybackParameters();
        w(playbackParameters, playbackParameters.a, true, true);
    }

    public final boolean d() {
        if (this.w) {
            for (muh muhVar : this.a) {
                if (muhVar.f()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d0(bi8 bi8Var) {
        this.Z = bi8Var;
        gql gqlVar = this.E.a;
        qkd qkdVar = this.q;
        qkdVar.getClass();
        bi8Var.getClass();
        if (qkdVar.q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < qkdVar.q.size(); i++) {
            ((okd) qkdVar.q.get(i)).i();
        }
        qkdVar.q = arrayList;
        qkdVar.m = null;
        qkdVar.k();
    }

    public final void e() {
        q83 q83Var;
        if (this.w && d()) {
            for (muh muhVar : this.a) {
                int iC = muhVar.c();
                if (muhVar.f()) {
                    byte b = muhVar.d;
                    boolean z = b == 4 || b == 2;
                    byte b2 = b != 4 ? (byte) 0 : (byte) 1;
                    if (z) {
                        q83Var = muhVar.a;
                    } else {
                        q83Var = muhVar.c;
                        q83Var.getClass();
                    }
                    muhVar.a(q83Var, this.n);
                    muhVar.i(z);
                    muhVar.d = b2;
                }
                this.R -= iC - muhVar.c();
            }
            this.a0 = -9223372036854775807L;
        }
    }

    public final void e0(int i) {
        this.M = i;
        gql gqlVar = this.E.a;
        qkd qkdVar = this.q;
        qkdVar.g = i;
        int iR = qkdVar.r(gqlVar);
        if ((iR & 1) != 0) {
            T(true);
        } else if ((iR & 2) != 0) {
            e();
        }
        t(false);
    }

    public final void f(int i) {
        muh[] muhVarArr = this.a;
        int iC = muhVarArr[i].c();
        muh muhVar = muhVarArr[i];
        q83 q83Var = muhVar.a;
        qt6 qt6Var = this.n;
        muhVar.a(q83Var, qt6Var);
        q83 q83Var2 = muhVar.c;
        if (q83Var2 != null) {
            boolean z = (q83Var2.h == 0 || muhVar.d == 3) ? false : true;
            muhVar.a(q83Var2, qt6Var);
            muhVar.i(false);
            if (z) {
                q83 q83Var3 = muhVar.a;
                q83Var2.getClass();
                q83Var2.handleMessage(17, q83Var3);
            }
        }
        muhVar.d = (byte) 0;
        F(i, false);
        this.R -= iC;
    }

    public final void f0(boolean z) throws Throwable {
        if (!z) {
            yi8 yi8Var = this.C;
            szk szkVar = this.h;
            if (yi8Var != null && this.B && !szkVar.a.hasMessages(37)) {
                this.D++;
            }
            int i = this.D;
            if (i > 0) {
                this.v.c(new bn7(this, i, (byte) 15));
            }
            this.D = 0;
            this.B = false;
            szkVar.d(37);
            yi8 yi8Var2 = this.C;
            if (yi8Var2 != null) {
                U(yi8Var2);
                this.C = null;
                this.B = false;
            }
        }
        this.A = z;
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x08e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 2308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi8.g():void");
    }

    public final void g0(upi upiVar) {
        this.z = upiVar;
        c();
    }

    public final void h(okd okdVar, int i, boolean z, long j) {
        muh muhVar = this.a[i];
        boolean zG = muhVar.g();
        q83 q83Var = muhVar.a;
        if (zG) {
            return;
        }
        boolean z2 = okdVar == this.q.i;
        pyl pylVar = okdVar.o;
        luh luhVar = ((luh[]) pylVar.c)[i];
        bj8 bj8Var = ((bj8[]) pylVar.d)[i];
        boolean z3 = n0() && this.E.e == 3;
        boolean z4 = !z && z3;
        this.R++;
        vhi vhiVar = okdVar.c[i];
        long j2 = okdVar.p;
        jrd jrdVar = okdVar.g.a;
        q83 q83Var2 = muhVar.c;
        int length = bj8Var != null ? bj8Var.length() : 0;
        oj9[] oj9VarArr = new oj9[length];
        for (int i2 = 0; i2 < length; i2++) {
            bj8Var.getClass();
            oj9VarArr[i2] = bj8Var.getFormat(i2);
        }
        byte b = muhVar.d;
        qt6 qt6Var = this.n;
        if (b == 0 || b == 2 || b == 4) {
            muhVar.e = true;
            z4o.H(q83Var.h == 0);
            q83Var.d = luhVar;
            q83Var.q = jrdVar;
            q83Var.h = (byte) 1;
            q83Var.o(z4, z2);
            q83Var.z(oj9VarArr, vhiVar, j, j2, jrdVar);
            q83Var.A(j, z4, true);
            qt6Var.l(q83Var);
        } else {
            muhVar.f = true;
            q83Var2.getClass();
            z4o.H(q83Var2.h == 0);
            q83Var2.d = luhVar;
            q83Var2.q = jrdVar;
            q83Var2.h = (byte) 1;
            q83Var2.o(z4, z2);
            q83Var2.z(oj9VarArr, vhiVar, j, j2, jrdVar);
            q83Var2.A(j, z4, true);
            qt6Var.l(q83Var2);
        }
        ti8 ti8Var = new ti8(this);
        q83 q83VarD = muhVar.d(okdVar);
        q83VarD.getClass();
        q83VarD.handleMessage(11, ti8Var);
        if (z3 && z2) {
            muhVar.m();
        }
    }

    public final void h0(boolean z) {
        this.N = z;
        gql gqlVar = this.E.a;
        qkd qkdVar = this.q;
        qkdVar.h = z;
        int iR = qkdVar.r(gqlVar);
        if ((iR & 1) != 0) {
            T(true);
        } else if ((iR & 2) != 0) {
            e();
        }
        t(false);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        okd okdVar;
        jrd jrdVar;
        okd okdVar2;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i2 = message.arg2;
                    this.F.a(1);
                    v0(this.x.c(this.E.e, z), i2 >> 4, i2 & 15, z);
                    break;
                case 2:
                    g();
                    break;
                case 3:
                    U((yi8) message.obj);
                    break;
                case 4:
                    c0((thg) message.obj);
                    break;
                case 5:
                    this.y = (uwi) message.obj;
                    break;
                case 6:
                    q0(false, true);
                    break;
                case 7:
                    J((rj5) message.obj);
                    return true;
                case 8:
                    v((nkd) message.obj);
                    break;
                case 9:
                    r((nkd) message.obj);
                    break;
                case 10:
                    L();
                    break;
                case 11:
                    e0(message.arg1);
                    break;
                case 12:
                    h0(message.arg1 != 0);
                    break;
                case 13:
                    Z(message.arg1 != 0, (rj5) message.obj);
                    break;
                case 14:
                    W((ckg) message.obj);
                    break;
                case 15:
                    X((ckg) message.obj);
                    break;
                case 16:
                    thg thgVar = (thg) message.obj;
                    w(thgVar, thgVar.a, true, false);
                    break;
                case 17:
                    a0((ui8) message.obj);
                    break;
                case 18:
                    a((ui8) message.obj, message.arg1);
                    break;
                case 19:
                    H((vi8) message.obj);
                    break;
                case 20:
                    K(message.arg1, message.arg2, (jij) message.obj);
                    break;
                case 21:
                    i0((jij) message.obj);
                    break;
                case 22:
                    G();
                    break;
                case 23:
                    b0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    L();
                    T(true);
                    break;
                case 26:
                    L();
                    T(true);
                    break;
                case 27:
                    u0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    d0((bi8) message.obj);
                    break;
                case 29:
                    I();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    l0(pair.first, (rj5) pair.second);
                    break;
                case 31:
                    Y((pf2) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    m0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    o(message.arg1);
                    break;
                case 34:
                    q();
                    break;
                case 35:
                    k0((y3n) message.obj);
                    break;
                case 36:
                    f0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.B = false;
                    yi8 yi8Var = this.C;
                    if (yi8Var != null) {
                        U(yi8Var);
                        this.C = null;
                        break;
                    }
                    break;
                case 38:
                    g0((upi) message.obj);
                    break;
            }
        } catch (id6 e) {
            s(e.a, e);
        } catch (RuntimeException e2) {
            zh8 zh8VarH = zh8.h(((e2 instanceof IllegalStateException) || (e2 instanceof IllegalArgumentException)) ? 1004 : 1000, e2);
            w7d.r("Playback error", zh8VarH);
            q0(true, false);
            this.E = this.E.f(zh8VarH);
        } catch (s1g e3) {
            boolean z2 = e3.a;
            byte b = e3.b;
            if (b == 1) {
                i = z2 ? 3001 : 3003;
            } else if (b == 4) {
                i = z2 ? 3002 : 3004;
            }
            s(i, e3);
        } catch (uc3 e4) {
            s(1002, e4);
        } catch (wl7 e5) {
            s(e5.a, e5);
        } catch (IOException e6) {
            s(2000, e6);
        } catch (zh8 e7) {
            e = e7;
            byte b2 = e.j;
            qkd qkdVar = this.q;
            if (b2 == 1 && (okdVar2 = qkdVar.j) != null && e.o == null) {
                e = e.g(okdVar2.g.a);
            }
            byte b3 = e.j;
            szk szkVar = this.h;
            if (b3 == 1 && (jrdVar = e.o) != null && z(e.l, jrdVar)) {
                this.b0 = true;
                e();
                okd okdVar3 = qkdVar.k;
                okd okdVar4 = qkdVar.i;
                if (okdVar4 != okdVar3) {
                    while (okdVar4 != null) {
                        okd okdVar5 = okdVar4.m;
                        if (okdVar5 == okdVar3) {
                            break;
                        }
                        okdVar4 = okdVar5;
                    }
                }
                qkdVar.n(okdVar4);
                if (this.E.e != 4) {
                    B();
                    szkVar.e(2);
                }
            } else {
                zh8 zh8Var = this.X;
                if (zh8Var != null) {
                    zh8Var.addSuppressed(e);
                    e = this.X;
                }
                if (e.j == 1 && qkdVar.i != qkdVar.j) {
                    while (true) {
                        okdVar = qkdVar.i;
                        if (okdVar == qkdVar.j) {
                            break;
                        }
                        qkdVar.a();
                    }
                    z4o.C(okdVar);
                    D();
                    pkd pkdVar = okdVar.g;
                    jrd jrdVar2 = pkdVar.a;
                    long j = pkdVar.b;
                    this.E = x(jrdVar2, j, pkdVar.c, j, true, 0);
                }
                if (e.p && (this.X == null || (i = e.a) == 5004 || i == 5003)) {
                    w7d.L("Recoverable renderer error", e);
                    if (this.X == null) {
                        this.X = e;
                    }
                    rzk rzkVarA = szkVar.a(25, e);
                    Handler handler = szkVar.a;
                    Message message2 = rzkVarA.a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    rzkVarA.a();
                } else {
                    w7d.r("Playback error", e);
                    q0(true, false);
                    this.E = this.E.f(e);
                }
            }
        }
        D();
        return true;
    }

    public final void i(boolean[] zArr, long j) {
        muh[] muhVarArr;
        zi8 zi8Var;
        long j2;
        okd okdVar = this.q.j;
        pyl pylVar = okdVar.o;
        int i = 0;
        while (true) {
            muhVarArr = this.a;
            if (i >= muhVarArr.length) {
                break;
            }
            if (!pylVar.p(i)) {
                muhVarArr[i].k();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < muhVarArr.length) {
            if (pylVar.p(i2) && muhVarArr[i2].d(okdVar) == null) {
                zi8Var = this;
                j2 = j;
                zi8Var.h(okdVar, i2, zArr[i2], j2);
            } else {
                zi8Var = this;
                j2 = j;
            }
            i2++;
            this = zi8Var;
            j = j2;
        }
    }

    public final void i0(jij jijVar) throws Throwable {
        this.F.a(1);
        vq8 vq8Var = this.r;
        int size = ((ArrayList) vq8Var.c).size();
        if (jijVar.getLength() != size) {
            jijVar = jijVar.cloneAndClear().cloneAndInsert(0, size);
        }
        vq8Var.k = jijVar;
        u(vq8Var.e(), false);
    }

    @Override // defpackage.m1j
    public final void j(n1j n1jVar) {
        this.h.a(9, (nkd) n1jVar).b();
    }

    public final void j0(int i) {
        shg shgVarI = this.E;
        if (shgVarI.e != i) {
            if (i != 2) {
                this.Y = -9223372036854775807L;
            }
            if (i != 3 && shgVarI.p) {
                shgVarI = shgVarI.i(false);
                this.E = shgVarI;
            }
            this.E = shgVarI.h(i);
        }
    }

    public final long k(gql gqlVar, Object obj, long j) {
        dql dqlVar = this.l;
        int i = gqlVar.g(obj, dqlVar).c;
        fql fqlVar = this.k;
        gqlVar.n(i, fqlVar);
        if (fqlVar.e != -9223372036854775807L && fqlVar.a() && fqlVar.h) {
            return tym.N(tym.z(fqlVar.f) - fqlVar.e) - (j + dqlVar.e);
        }
        return -9223372036854775807L;
    }

    public final void k0(y3n y3nVar) {
        for (muh muhVar : this.a) {
            q83 q83Var = muhVar.a;
            byte b = q83Var.b;
            if (b == 2 || b == 4) {
                q83Var.handleMessage(7, y3nVar);
                q83 q83Var2 = muhVar.c;
                if (q83Var2 != null) {
                    q83Var2.handleMessage(7, y3nVar);
                }
            }
        }
    }

    public final long l(okd okdVar) {
        if (okdVar == null) {
            return 0L;
        }
        long jMax = okdVar.p;
        if (!okdVar.e) {
            return jMax;
        }
        int i = 0;
        while (true) {
            muh[] muhVarArr = this.a;
            if (i >= muhVarArr.length) {
                return jMax;
            }
            if (muhVarArr[i].d(okdVar) != null) {
                q83 q83VarD = muhVarArr[i].d(okdVar);
                Objects.requireNonNull(q83VarD);
                long j = q83VarD.m;
                if (j == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(j, jMax);
            }
            i++;
        }
    }

    public final void l0(Object obj, rj5 rj5Var) {
        for (muh muhVar : this.a) {
            q83 q83Var = muhVar.a;
            if (q83Var.b == 2) {
                byte b = muhVar.d;
                if (b == 4 || b == 1) {
                    q83 q83Var2 = muhVar.c;
                    q83Var2.getClass();
                    q83Var2.handleMessage(1, obj);
                } else {
                    q83Var.handleMessage(1, obj);
                }
            }
        }
        int i = this.E.e;
        if (i == 3 || i == 2) {
            this.h.e(2);
        }
        if (rj5Var != null) {
            rj5Var.c();
        }
    }

    public final Pair m(gql gqlVar) {
        if (gqlVar.p()) {
            return Pair.create(shg.u, 0L);
        }
        Pair pairI = gqlVar.i(this.k, this.l, gqlVar.a(this.N), -9223372036854775807L);
        jrd jrdVarP = this.q.p(gqlVar, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (jrdVarP.b()) {
            Object obj = jrdVarP.a;
            dql dqlVar = this.l;
            gqlVar.g(obj, dqlVar);
            jLongValue = jrdVarP.c == dqlVar.f(jrdVarP.b) ? dqlVar.g.b : 0L;
        }
        return Pair.create(jrdVarP, Long.valueOf(jLongValue));
    }

    public final void m0(float f) {
        this.c0 = f;
        float f2 = f * this.x.g;
        for (muh muhVar : this.a) {
            q83 q83Var = muhVar.a;
            if (q83Var.b == 1) {
                q83Var.handleMessage(2, Float.valueOf(f2));
                q83 q83Var2 = muhVar.c;
                if (q83Var2 != null) {
                    q83Var2.handleMessage(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final long n(long j) {
        okd okdVar = this.q.l;
        if (okdVar == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.T - okdVar.p));
    }

    public final boolean n0() {
        shg shgVar = this.E;
        return shgVar.l && shgVar.n == 0;
    }

    public final void o(int i) {
        shg shgVar = this.E;
        v0(i, shgVar.n, shgVar.m, shgVar.l);
    }

    public final boolean o0(gql gqlVar, jrd jrdVar) {
        if (jrdVar.b() || gqlVar.p()) {
            return false;
        }
        int i = gqlVar.g(jrdVar.a, this.l).c;
        fql fqlVar = this.k;
        gqlVar.n(i, fqlVar);
        return fqlVar.a() && fqlVar.h && fqlVar.e != -9223372036854775807L;
    }

    @Override // defpackage.oyl
    public final void onTrackSelectionsInvalidated() {
        this.h.e(10);
    }

    @Override // defpackage.mkd
    public final void p(nkd nkdVar) {
        this.h.a(8, nkdVar).b();
    }

    public final void p0() {
        okd okdVar = this.q.i;
        if (okdVar == null) {
            return;
        }
        pyl pylVar = okdVar.o;
        int i = 0;
        while (true) {
            muh[] muhVarArr = this.a;
            if (i >= muhVarArr.length) {
                return;
            }
            if (pylVar.p(i)) {
                muhVarArr[i].m();
            }
            i++;
        }
    }

    public final void q() {
        m0(this.c0);
    }

    public final void q0(boolean z, boolean z2) {
        M(z || !this.O, false, true, false);
        this.F.a(z2 ? 1 : 0);
        xs6 xs6Var = this.f;
        ConcurrentHashMap concurrentHashMap = xs6Var.n;
        fjg fjgVar = this.t;
        ws6 ws6Var = (ws6) concurrentHashMap.get(fjgVar);
        if (ws6Var != null) {
            int i = ws6Var.a - 1;
            ws6Var.a = i;
            if (i == 0) {
                concurrentHashMap.remove(fjgVar);
                xs6Var.c();
            }
        }
        this.x.c(1, this.E.l);
        j0(1);
    }

    public final void r(nkd nkdVar) {
        qkd qkdVar = this.q;
        okd okdVar = qkdVar.l;
        if (okdVar != null && okdVar.a == nkdVar) {
            qkdVar.m(this.T);
            B();
            return;
        }
        okd okdVar2 = qkdVar.m;
        if (okdVar2 == null || okdVar2.a != nkdVar) {
            return;
        }
        C();
    }

    public final void r0() {
        qt6 qt6Var = this.n;
        qt6Var.b = false;
        e3k e3kVar = (e3k) qt6Var.c;
        if (e3kVar.a) {
            e3kVar.a(e3kVar.getPositionUs());
            e3kVar.a = false;
        }
        for (muh muhVar : this.a) {
            q83 q83Var = muhVar.c;
            q83 q83Var2 = muhVar.a;
            if (muh.h(q83Var2)) {
                muh.b(q83Var2);
            }
            if (q83Var != null && q83Var.h != 0) {
                muh.b(q83Var);
            }
        }
    }

    public final void s(int i, IOException iOException) {
        zh8 zh8Var = new zh8(0, iOException, i);
        okd okdVar = this.q.i;
        if (okdVar != null) {
            zh8Var = zh8Var.g(okdVar.g.a);
        }
        w7d.r("Playback error", zh8Var);
        q0(false, false);
        this.E = this.E.f(zh8Var);
    }

    public final void s0() {
        okd okdVar = this.q.l;
        boolean z = this.L || (okdVar != null && okdVar.a.isLoading());
        shg shgVar = this.E;
        if (z != shgVar.g) {
            this.E = shgVar.b(z);
        }
    }

    public final void t(boolean z) {
        okd okdVar = this.q.l;
        jrd jrdVar = okdVar == null ? this.E.b : okdVar.g.a;
        boolean zEquals = this.E.k.equals(jrdVar);
        if (!zEquals) {
            this.E = this.E.c(jrdVar);
        }
        shg shgVar = this.E;
        shgVar.q = okdVar == null ? shgVar.s : okdVar.d();
        shg shgVar2 = this.E;
        shgVar2.r = n(shgVar2.q);
        if ((!zEquals || z) && okdVar != null && okdVar.e) {
            t0(okdVar.g.a, okdVar.o);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t0(defpackage.jrd r9, pyl r10) {
        /*
            r8 = this;
            qkd r0 = r8.q
            okd r0 = r0.l
            r0.getClass()
            long r1 = r0.d()
            r8.n(r1)
            shg r1 = r8.E
            gql r1 = r1.a
            pkd r0 = r0.g
            jrd r0 = r0.a
            r8.o0(r1, r0)
            shg r0 = r8.E
            gql r0 = r0.a
            qt6 r1 = r8.n
            thg r1 = r1.getPlaybackParameters()
            float r1 = r1.a
            shg r1 = r8.E
            boolean r1 = r1.l
            java.lang.Object r10 = r10.d
            bj8[] r10 = (defpackage.bj8[]) r10
            xs6 r1 = r8.f
            r1.getClass()
            l1b r2 = r1.m
            fjg r8 = r8.t
            java.lang.String r3 = r8.a
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            r3 = -1
            if (r2 == 0) goto L4c
            int r4 = r2.intValue()
            if (r4 == r3) goto L4c
            int r2 = r2.intValue()
            goto L4d
        L4c:
            r2 = r3
        L4d:
            java.util.concurrent.ConcurrentHashMap r4 = r1.n
            java.lang.Object r8 = r4.get(r8)
            ws6 r8 = (defpackage.ws6) r8
            r8.getClass()
            if (r2 != r3) goto Lbf
            java.lang.Object r9 = r9.a
            dql r2 = r1.b
            dql r9 = r0.g(r9, r2)
            int r9 = r9.c
            fql r2 = r1.a
            r3 = 0
            fql r9 = r0.m(r9, r2, r3)
            qjd r9 = r9.b
            mjd r9 = r9.b
            r0 = 0
            if (r9 == 0) goto L87
            android.net.Uri r9 = r9.a
            java.lang.String r9 = r9.getScheme()
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 != 0) goto L89
            csh r2 = defpackage.xs6.p
            boolean r9 = r2.contains(r9)
            if (r9 != 0) goto L89
        L87:
            r9 = r0
            goto L8a
        L89:
            r9 = 1
        L8a:
            int r2 = r10.length
            r3 = r0
            r4 = r3
        L8d:
            r5 = 13107200(0xc80000, float:1.8367099E-38)
            if (r3 >= r2) goto Lb9
            r6 = r10[r3]
            if (r6 == 0) goto Lb6
            eyl r6 = r6.getTrackGroup()
            int r6 = r6.c
            r7 = 131072(0x20000, float:1.83671E-40)
            switch(r6) {
                case -2: goto Lb4;
                case -1: goto Lb5;
                case 0: goto Lb1;
                case 1: goto Lb5;
                case 2: goto La9;
                case 3: goto La7;
                case 4: goto La4;
                case 5: goto La7;
                case 6: goto La7;
                default: goto La0;
            }
        La0:
            hai.d()
            return
        La4:
            r5 = 26214400(0x1900000, float:5.2897246E-38)
            goto Lb5
        La7:
            r5 = r7
            goto Lb5
        La9:
            if (r9 == 0) goto Lae
            r5 = 19660800(0x12c0000, float:3.159141E-38)
            goto Lb5
        Lae:
            r5 = 131072000(0x7d00000, float:3.1296362E-34)
            goto Lb5
        Lb1:
            r5 = 144310272(0x89a0000, float:9.268538E-34)
            goto Lb5
        Lb4:
            r5 = r0
        Lb5:
            int r4 = r4 + r5
        Lb6:
            int r3 = r3 + 1
            goto L8d
        Lb9:
            r9 = 210239488(0xc880000, float:2.0954118E-31)
            int r2 = defpackage.tym.i(r4, r5, r9)
        Lbf:
            r8.c = r2
            r1.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi8.t0(jrd, pyl):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0214  */
    /* JADX WARN: Type inference failed for: r12v13, types: [long] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v22 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v13 */
    /* JADX WARN: Type inference failed for: r24v14 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v10 */
    /* JADX WARN: Type inference failed for: r26v11 */
    /* JADX WARN: Type inference failed for: r26v12 */
    /* JADX WARN: Type inference failed for: r26v17 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r26v9 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [int] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(defpackage.gql r44, boolean r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi8.u(gql, boolean):void");
    }

    public final void u0(int i, int i2, List list) throws Throwable {
        this.F.a(1);
        vq8 vq8Var = this.r;
        vq8Var.getClass();
        ArrayList arrayList = (ArrayList) vq8Var.c;
        z4o.w(i >= 0 && i <= i2 && i2 <= arrayList.size());
        z4o.w(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((xrd) arrayList.get(i3)).a.t((qjd) list.get(i3 - i));
        }
        u(vq8Var.e(), false);
    }

    public final void v(nkd nkdVar) {
        okd okdVar;
        zi8 zi8Var;
        qkd qkdVar = this.q;
        okd okdVar2 = qkdVar.l;
        qt6 qt6Var = this.n;
        if (okdVar2 != null && okdVar2.a == nkdVar) {
            okdVar2.getClass();
            if (!okdVar2.e) {
                float f = qt6Var.getPlaybackParameters().a;
                shg shgVar = this.E;
                okdVar2.f(f, shgVar.a, shgVar.l);
            }
            t0(okdVar2.g.a, okdVar2.o);
            if (okdVar2 == qkdVar.i) {
                O(okdVar2.g.b, true);
                i(new boolean[this.a.length], qkdVar.j.e());
                okdVar2.h = true;
                shg shgVar2 = this.E;
                jrd jrdVar = shgVar2.b;
                long j = okdVar2.g.b;
                zi8Var = this;
                zi8Var.E = x(jrdVar, j, shgVar2.c, j, false, 5);
            } else {
                zi8Var = this;
            }
            zi8Var.B();
            return;
        }
        int i = 0;
        while (true) {
            if (i >= qkdVar.q.size()) {
                okdVar = null;
                break;
            }
            okdVar = (okd) qkdVar.q.get(i);
            if (okdVar.a == nkdVar) {
                break;
            } else {
                i++;
            }
        }
        if (okdVar != null) {
            z4o.H(!okdVar.e);
            float f2 = qt6Var.getPlaybackParameters().a;
            shg shgVar3 = this.E;
            okdVar.f(f2, shgVar3.a, shgVar3.l);
            okd okdVar3 = qkdVar.m;
            if (okdVar3 == null || okdVar3.a != nkdVar) {
                return;
            }
            C();
        }
    }

    public final void v0(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.A;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        shg shgVar = this.E;
        if (shgVar.l == z2 && shgVar.n == i2 && shgVar.m == i3) {
            return;
        }
        this.E = shgVar.e(i3, i2, z2);
        y0(false, false);
        qkd qkdVar = this.q;
        for (okd okdVar = qkdVar.i; okdVar != null; okdVar = okdVar.m) {
            for (bj8 bj8Var : (bj8[]) okdVar.o.d) {
                if (bj8Var != null) {
                    bj8Var.g(z2);
                }
            }
        }
        if (!n0()) {
            r0();
            w0();
            shg shgVar2 = this.E;
            if (shgVar2.p) {
                this.E = shgVar2.i(false);
            }
            qkdVar.m(this.T);
            return;
        }
        int i4 = this.E.e;
        szk szkVar = this.h;
        if (i4 != 3) {
            if (i4 == 2) {
                szkVar.e(2);
            }
        } else {
            qt6 qt6Var = this.n;
            qt6Var.b = true;
            ((e3k) qt6Var.c).b();
            p0();
            szkVar.e(2);
        }
    }

    public final void w(thg thgVar, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.F.a(1);
            }
            this.E = this.E.g(thgVar);
        }
        float f2 = thgVar.a;
        okd okdVar = this.q.i;
        while (true) {
            i = 0;
            if (okdVar == null) {
                break;
            }
            bj8[] bj8VarArr = (bj8[]) okdVar.o.d;
            int length = bj8VarArr.length;
            while (i < length) {
                bj8 bj8Var = bj8VarArr[i];
                if (bj8Var != null) {
                    bj8Var.onPlaybackSpeed(f2);
                }
                i++;
            }
            okdVar = okdVar.m;
        }
        muh[] muhVarArr = this.a;
        int length2 = muhVarArr.length;
        while (i < length2) {
            muh muhVar = muhVarArr[i];
            float f3 = thgVar.a;
            muhVar.a.B(f, f3);
            q83 q83Var = muhVar.c;
            if (q83Var != null) {
                q83Var.B(f, f3);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w0() {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi8.w0():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final shg x(jrd jrdVar, long j, long j2, long j3, boolean z, int i) {
        csh cshVarG;
        boolean z2;
        this.W = (!this.W && j == this.E.s && jrdVar.equals(this.E.b)) ? false : true;
        N();
        shg shgVar = this.E;
        fyl fylVar = shgVar.h;
        pyl pylVar = shgVar.i;
        csh cshVar = shgVar.j;
        if (this.r.a) {
            okd okdVar = this.q.i;
            if (okdVar == null) {
                fylVar = fyl.d;
                pylVar = this.e;
            } else {
                fylVar = okdVar.n;
                pylVar = okdVar.o;
            }
            bj8[] bj8VarArr = (bj8[]) pylVar.d;
            z0b z0bVar = new z0b(4);
            boolean z3 = false;
            for (bj8 bj8Var : bj8VarArr) {
                if (bj8Var != null) {
                    lxd lxdVar = bj8Var.getFormat(0).l;
                    if (lxdVar == null) {
                        z0bVar.c(new lxd(new jxd[0]));
                    } else {
                        z0bVar.c(lxdVar);
                        z3 = true;
                    }
                }
            }
            if (z3) {
                cshVarG = z0bVar.g();
            } else {
                a1b a1bVar = h1b.b;
                cshVarG = csh.e;
            }
            cshVar = cshVarG;
            if (okdVar != null) {
                pkd pkdVar = okdVar.g;
                if (pkdVar.c != j2) {
                    okdVar.g = pkdVar.a(j2);
                }
            }
            muh[] muhVarArr = this.a;
            qkd qkdVar = this.q;
            okd okdVar2 = qkdVar.i;
            if (okdVar2 == qkdVar.j && okdVar2 != null) {
                pyl pylVar2 = okdVar2.o;
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= muhVarArr.length) {
                        z2 = true;
                        break;
                    }
                    if (pylVar2.p(i2)) {
                        if (muhVarArr[i2].a.b != 1) {
                            z2 = false;
                            break;
                        }
                        if (((luh[]) pylVar2.c)[i2].a != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.Q) {
                    this.Q = z5;
                    if (!z5 && this.E.p) {
                        this.h.e(2);
                    }
                }
            }
        } else if (!jrdVar.equals(shgVar.b)) {
            fylVar = fyl.d;
            pylVar = this.e;
            a1b a1bVar2 = h1b.b;
            cshVar = csh.e;
        }
        pyl pylVar3 = pylVar;
        csh cshVar2 = cshVar;
        fyl fylVar2 = fylVar;
        if (z) {
            wi8 wi8Var = this.F;
            if (!wi8Var.d || wi8Var.e == 5) {
                wi8Var.a = true;
                wi8Var.d = true;
                wi8Var.e = i;
            } else {
                z4o.w(i == 5);
            }
        }
        shg shgVar2 = this.E;
        return shgVar2.d(jrdVar, j, j2, j3, n(shgVar2.q), fylVar2, pylVar3, cshVar2);
    }

    public final void x0(gql gqlVar, jrd jrdVar, gql gqlVar2, jrd jrdVar2, long j, boolean z) {
        boolean zO0 = o0(gqlVar, jrdVar);
        Object obj = jrdVar.a;
        if (!zO0) {
            thg thgVar = jrdVar.b() ? thg.d : this.E.o;
            qt6 qt6Var = this.n;
            if (qt6Var.getPlaybackParameters().equals(thgVar)) {
                return;
            }
            this.h.d(16);
            qt6Var.c(thgVar);
            w(this.E.o, thgVar.a, false, false);
            return;
        }
        dql dqlVar = this.l;
        int i = gqlVar.g(obj, dqlVar).c;
        fql fqlVar = this.k;
        gqlVar.n(i, fqlVar);
        ljd ljdVar = fqlVar.i;
        String str = tym.a;
        long jN = tym.N(ljdVar.a);
        ds6 ds6Var = this.s;
        ds6Var.c = jN;
        ds6Var.f = tym.N(ljdVar.b);
        ds6Var.g = tym.N(ljdVar.c);
        float f = ljdVar.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        ds6Var.j = f;
        float f2 = ljdVar.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        ds6Var.i = f2;
        if (f == 1.0f && f2 == 1.0f) {
            ds6Var.c = -9223372036854775807L;
        }
        ds6Var.a();
        if (j != -9223372036854775807L) {
            ds6Var.d = k(gqlVar, obj, j);
            ds6Var.a();
            return;
        }
        if (!Objects.equals(!gqlVar2.p() ? gqlVar2.m(gqlVar2.g(jrdVar2.a, dqlVar).c, fqlVar, 0L).a : null, fqlVar.a) || z) {
            ds6Var.d = -9223372036854775807L;
            ds6Var.a();
        }
    }

    public final void y0(boolean z, boolean z2) {
        this.J = z;
        this.K = (!z || z2) ? -9223372036854775807L : SystemClock.elapsedRealtime();
    }

    public final boolean z(int i, jrd jrdVar) {
        qkd qkdVar = this.q;
        okd okdVar = qkdVar.k;
        if (okdVar != null && okdVar.g.a.equals(jrdVar)) {
            muh muhVar = this.a[i];
            okd okdVar2 = qkdVar.k;
            byte b = muhVar.d;
            boolean z = (b == 2 || b == 4) && muhVar.d(okdVar2) == muhVar.a;
            boolean z2 = muhVar.d == 3 && muhVar.d(okdVar2) == muhVar.c;
            if (z || z2) {
                return true;
            }
        }
        return false;
    }
}
