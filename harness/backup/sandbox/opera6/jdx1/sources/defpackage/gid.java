package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Rect;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.collection.ArrayMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class gid {
    public SurfaceHolder A;
    public TextureView B;
    public zoj C;
    public ssa D;
    public MediaController E;
    public long F;
    public long G;
    public ijg H;
    public Bundle I;
    public final ghd a;
    public final m59 b;
    public final lid c;
    public final Context d;
    public final m4j e;
    public final Bundle f;
    public final zhd g;
    public final fid h;
    public final ijc i;
    public final pad j;
    public final t72 k;
    public final SparseArray l;
    public final Handler m;
    public m4j n;
    public boolean o;
    public ijg p;
    public PendingIntent q;
    public h1b r;
    public h1b s;
    public csh t;
    public csh u;
    public o3j v;
    public cig w;
    public cig x;
    public cig y;
    public Surface z;

    public gid(Context context, ghd ghdVar, m4j m4jVar, Looper looper) {
        Bundle bundle = Bundle.EMPTY;
        this.p = ijg.H;
        this.C = zoj.c;
        this.v = o3j.b;
        a1b a1bVar = h1b.b;
        csh cshVar = csh.e;
        this.r = cshVar;
        this.s = cshVar;
        this.t = cshVar;
        this.u = cshVar;
        cig cigVar = cig.b;
        this.w = cigVar;
        this.x = cigVar;
        this.y = d(cigVar, cigVar);
        this.i = new ijc(looper, (gjc) new uac(this));
        this.m = new Handler(looper);
        this.a = ghdVar;
        z4o.D(m4jVar, "token must not be null");
        this.d = context;
        this.b = new m59();
        this.c = new lid(this);
        this.k = new t72(0);
        this.e = m4jVar;
        this.f = bundle;
        this.g = new zhd(this, (byte) 0);
        this.h = new fid(this);
        this.I = bundle;
        this.j = new pad(this, looper);
        this.F = -9223372036854775807L;
        this.G = -9223372036854775807L;
        this.l = new SparseArray();
    }

    public static void C(gql gqlVar, ArrayList arrayList, ArrayList arrayList2) {
        for (int i = 0; i < arrayList.size(); i++) {
            fql fqlVar = (fql) arrayList.get(i);
            int i2 = fqlVar.m;
            int i3 = fqlVar.n;
            if (i2 == -1 || i3 == -1) {
                fqlVar.m = arrayList2.size();
                fqlVar.n = arrayList2.size();
                dql dqlVar = new dql();
                dqlVar.j(null, null, i, -9223372036854775807L, 0L, to.f, true);
                arrayList2.add(dqlVar);
            } else {
                fqlVar.m = arrayList2.size();
                fqlVar.n = (i3 - i2) + arrayList2.size();
                while (i2 <= i3) {
                    dql dqlVar2 = new dql();
                    gqlVar.f(i2, dqlVar2, false);
                    dqlVar2.c = i;
                    arrayList2.add(dqlVar2);
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static csh G(csh r2, java.util.List r3, android.os.Bundle r4, defpackage.o3j r5, defpackage.cig r6) {
        /*
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Lb
            csh r2 = defpackage.vb5.e(r3, r5, r6)
            return r2
        Lb:
            java.lang.String r3 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS"
            boolean r3 = r4.getBoolean(r3)
            r5 = 0
            r0 = 1
            if (r3 != 0) goto L25
            r3 = 6
            r1 = 7
            int[] r3 = new int[]{r3, r1}
            w69 r1 = r6.a
            boolean r3 = r1.a(r3)
            if (r3 != 0) goto L25
            r3 = r0
            goto L26
        L25:
            r3 = r5
        L26:
            java.lang.String r1 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT"
            boolean r4 = r4.getBoolean(r1)
            if (r4 != 0) goto L3f
            r4 = 8
            r1 = 9
            int[] r4 = new int[]{r4, r1}
            w69 r6 = r6.a
            boolean r4 = r6.a(r4)
            if (r4 != 0) goto L3f
            r5 = r0
        L3f:
            csh r2 = defpackage.vb5.h(r2, r3, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gid.G(csh, java.util.List, android.os.Bundle, o3j, cig):csh");
    }

    public static csh H(List list, List list2, o3j o3jVar, cig cigVar, Bundle bundle) {
        if (list.isEmpty()) {
            String str = vb5.k;
            if (list2.isEmpty()) {
                a1b a1bVar = h1b.b;
                list = csh.e;
            } else {
                boolean zA = cigVar.a.a(7, 6);
                boolean zA2 = cigVar.a.a(9, 8);
                boolean z = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z2 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                int i = (zA || z) ? -1 : 0;
                int i2 = (zA2 || z2) ? -1 : i == 0 ? 1 : 0;
                z0b z0bVarP = h1b.p();
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    vb5 vb5Var = (vb5) list2.get(i3);
                    if (i3 == i) {
                        if (i2 == -1) {
                            z0bVarP.c(vb5Var.d(y0b.g(2, 6)));
                        } else {
                            z0bVarP.c(vb5Var.d(new y0b(new int[]{2, 3, 6})));
                        }
                    } else if (i3 == i2) {
                        z0bVarP.c(vb5Var.d(y0b.g(3, 6)));
                    } else {
                        z0bVarP.c(vb5Var.d(new y0b(new int[]{6})));
                    }
                }
                list = z0bVarP.g();
            }
        }
        return vb5.e(list, o3jVar, cigVar);
    }

    public static cig d(cig cigVar, cig cigVar2) {
        cig cigVarV = z5i.V(cigVar, cigVar2);
        if (cigVarV.a(32)) {
            return cigVarV;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        w69 w69Var = cigVarV.a;
        for (int i = 0; i < w69Var.a.size(); i++) {
            int iB = w69Var.b(i);
            z4o.H(!false);
            sparseBooleanArray.append(iB, true);
        }
        z4o.H(!false);
        sparseBooleanArray.append(32, true);
        z4o.H(!false);
        return new cig(new w69(sparseBooleanArray));
    }

    public static eql e(ArrayList arrayList, ArrayList arrayList2) {
        z0b z0bVar = new z0b(4);
        z0bVar.e(arrayList);
        csh cshVarG = z0bVar.g();
        z0b z0bVar2 = new z0b(4);
        z0bVar2.e(arrayList2);
        csh cshVarG2 = z0bVar2.g();
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = i;
        }
        return new eql(cshVarG, cshVarG2, iArr);
    }

    public static int j(ijg ijgVar) {
        return ijgVar.c.a.b;
    }

    public static ijg u(ijg ijgVar, int i, List list, long j, long j2) {
        int size;
        gql gqlVar = ijgVar.j;
        c4j c4jVar = ijgVar.c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size2 = 0;
        for (int i2 = 0; i2 < gqlVar.o(); i2++) {
            arrayList.add(gqlVar.m(i2, new fql(), 0L));
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            qjd qjdVar = (qjd) list.get(i3);
            fql fqlVar = new fql();
            fqlVar.b(0, qjdVar, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, -1, -1, 0L);
            arrayList.add(i3 + i, fqlVar);
        }
        C(gqlVar, arrayList, arrayList2);
        eql eqlVarE = e(arrayList, arrayList2);
        if (ijgVar.j.p()) {
            size = 0;
        } else {
            int i4 = c4jVar.a.b;
            size2 = i4 >= i ? list.size() + i4 : i4;
            int i5 = c4jVar.a.e;
            size = i5 >= i ? list.size() + i5 : i5;
        }
        return w(ijgVar, eqlVarE, size2, size, j, j2, 5);
    }

    public static ijg v(ijg ijgVar, int i, int i2, boolean z, long j, long j2) {
        int i3;
        int iA;
        int i4;
        ijg ijgVarW;
        gql gqlVar = ijgVar.j;
        boolean z2 = ijgVar.i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i5 = 0; i5 < gqlVar.o(); i5++) {
            if (i5 < i || i5 >= i2) {
                arrayList.add(gqlVar.m(i5, new fql(), 0L));
            }
        }
        C(gqlVar, arrayList, arrayList2);
        eql eqlVarE = e(arrayList, arrayList2);
        fig figVar = ijgVar.c.a;
        int i6 = figVar.b;
        int i7 = figVar.e;
        fql fqlVar = new fql();
        boolean z3 = i6 >= i && i6 < i2;
        if (eqlVarE.p()) {
            i7 = 0;
            iA = -1;
            i3 = 1;
        } else {
            if (z3) {
                int i8 = ijgVar.h;
                int iO = gqlVar.o();
                iA = i6;
                i3 = 1;
                for (int i9 = 0; i9 < iO; i9++) {
                    iA = gqlVar.e(iA, i8, z2);
                    if (iA == -1) {
                        break;
                    }
                    if (iA < i || iA >= i2) {
                        break;
                    }
                }
                iA = -1;
                if (iA == -1) {
                    iA = eqlVarE.a(z2);
                } else if (iA >= i2) {
                    iA -= i2 - i;
                }
                eqlVarE.m(iA, fqlVar, 0L);
                i4 = fqlVar.m;
            } else {
                i3 = 1;
                if (i6 >= i2) {
                    iA = i6 - (i2 - i);
                    if (i7 != -1) {
                        for (int i10 = i; i10 < i2; i10++) {
                            fql fqlVar2 = new fql();
                            gqlVar.n(i10, fqlVar2);
                            i7 -= (fqlVar2.n - fqlVar2.m) + 1;
                        }
                    }
                    i4 = i7;
                } else {
                    iA = i6;
                }
            }
            i7 = i4;
        }
        if (!z3) {
            ijgVarW = w(ijgVar, eqlVarE, iA, i7, j, j2, 4);
        } else if (iA == -1) {
            ijgVarW = x(ijgVar, eqlVarE, c4j.k, c4j.l, 4);
        } else if (z) {
            ijgVarW = w(ijgVar, eqlVarE, iA, i7, j, j2, 4);
        } else {
            int i11 = iA;
            fql fqlVar3 = new fql();
            eqlVarE.m(i11, fqlVar3, 0L);
            long jC0 = tym.c0(fqlVar3.k);
            long jC02 = tym.c0(fqlVar3.l);
            fig figVar2 = new fig(null, i11, fqlVar3.b, null, i7, jC0, jC0, -1, -1);
            ijgVarW = x(ijgVar, eqlVarE, figVar2, new c4j(figVar2, false, SystemClock.elapsedRealtime(), jC02, jC0, z5i.q(jC0, jC02), 0L, -9223372036854775807L, jC02, jC0), 4);
        }
        int i12 = ijgVarW.A;
        return (i12 == i3 || i12 == 4 || i >= i2 || i2 != gqlVar.o() || i6 < i) ? ijgVarW : ijgVarW.f(4, null);
    }

    public static ijg w(ijg ijgVar, eql eqlVar, int i, int i2, long j, long j2, int i3) {
        fql fqlVar = new fql();
        eqlVar.m(i, fqlVar, 0L);
        qjd qjdVar = fqlVar.b;
        fig figVar = ijgVar.c.a;
        fig figVar2 = new fig(null, i, qjdVar, null, i2, j, j2, figVar.h, figVar.i);
        c4j c4jVar = ijgVar.c;
        return x(ijgVar, eqlVar, figVar2, new c4j(figVar2, c4jVar.b, SystemClock.elapsedRealtime(), c4jVar.d, c4jVar.e, c4jVar.f, c4jVar.g, c4jVar.h, c4jVar.i, c4jVar.j), i3);
    }

    public static ijg x(ijg ijgVar, gql gqlVar, fig figVar, c4j c4jVar, int i) {
        c4j c4jVar2;
        nyl nylVar;
        fzl fzlVar;
        rhg rhgVar = ijgVar.a;
        int i2 = ijgVar.b;
        c4j c4jVar3 = ijgVar.c;
        thg thgVar = ijgVar.g;
        int i3 = ijgVar.h;
        boolean z = ijgVar.i;
        int i4 = ijgVar.k;
        r4n r4nVar = ijgVar.l;
        vjd vjdVar = ijgVar.m;
        float f = ijgVar.n;
        float f2 = ijgVar.o;
        int i5 = ijgVar.p;
        pf2 pf2Var = ijgVar.q;
        y36 y36Var = ijgVar.r;
        u67 u67Var = ijgVar.s;
        int i6 = ijgVar.t;
        boolean z2 = ijgVar.u;
        boolean z3 = ijgVar.v;
        int i7 = ijgVar.w;
        boolean z4 = ijgVar.x;
        boolean z5 = ijgVar.y;
        int i8 = ijgVar.z;
        int i9 = ijgVar.A;
        vjd vjdVar2 = ijgVar.B;
        long j = ijgVar.C;
        long j2 = ijgVar.D;
        long j3 = ijgVar.E;
        fzl fzlVar2 = ijgVar.F;
        nyl nylVar2 = ijgVar.G;
        fig figVar2 = c4jVar3.a;
        if (!gqlVar.p()) {
            c4jVar2 = c4jVar;
            nylVar = nylVar2;
            fzlVar = fzlVar2;
            boolean z6 = c4jVar2.a.b < gqlVar.o();
            z4o.H(z6);
            return new ijg(rhgVar, i2, c4jVar2, figVar2, figVar, i, thgVar, i3, z, r4nVar, gqlVar, i4, vjdVar, f, f2, pf2Var, i5, y36Var, u67Var, i6, z2, z3, i7, i8, i9, z4, z5, vjdVar2, j, j2, j3, fzlVar, nylVar);
        }
        c4jVar2 = c4jVar;
        nylVar = nylVar2;
        fzlVar = fzlVar2;
        z4o.H(z6);
        return new ijg(rhgVar, i2, c4jVar2, figVar2, figVar, i, thgVar, i3, z, r4nVar, gqlVar, i4, vjdVar, f, f2, pf2Var, i5, y36Var, u67Var, i6, z2, z3, i7, i8, i9, z4, z5, vjdVar2, j, j2, j3, fzlVar, nylVar);
    }

    public final void A(ijg ijgVar, gjg gjgVar) {
        if (r()) {
            m4j m4jVar = this.n;
            m4jVar.getClass();
            boolean z = m4jVar.a.c < 6;
            ijg ijgVar2 = this.H;
            if (ijgVar2 != null) {
                this.H = z5i.c0(ijgVar2, ijgVar, gjgVar, this.y, z);
                if (!this.k.isEmpty()) {
                    return;
                }
                ijgVar = this.H;
                gjgVar = gjg.c;
                this.H = null;
            }
            ijg ijgVar3 = this.p;
            ijg ijgVarC0 = z5i.c0(ijgVar3, ijgVar, gjgVar, this.y, z);
            this.p = ijgVarC0;
            Integer numValueOf = (ijgVar3.d.equals(ijgVar.d) && ijgVar3.e.equals(ijgVar.e)) ? null : Integer.valueOf(ijgVarC0.f);
            Integer numValueOf2 = !Objects.equals(ijgVar3.q(), ijgVarC0.q()) ? Integer.valueOf(ijgVarC0.b) : null;
            Integer numValueOf3 = !ijgVar3.j.equals(ijgVarC0.j) ? Integer.valueOf(ijgVarC0.k) : null;
            int i = ijgVar3.w;
            int i2 = ijgVarC0.w;
            z(ijgVar3, ijgVarC0, numValueOf3, (i == i2 && ijgVar3.v == ijgVarC0.v) ? null : Integer.valueOf(i2), numValueOf, numValueOf2);
        }
    }

    public final void B(int i, int i2) {
        zoj zojVar = this.C;
        if (zojVar.a == i && zojVar.b == i2) {
            return;
        }
        this.C = new zoj(i, i2);
        this.i.i(24, new gi8(i, i2, (byte) 1));
    }

    public final void D() {
        ssa ssaVar = this.D;
        if (this.o) {
            return;
        }
        final byte b = 1;
        this.o = true;
        this.n = null;
        this.m.removeCallbacksAndMessages(null);
        b();
        pad padVar = this.j;
        Handler handler = (Handler) padVar.b;
        if (handler.hasMessages(1)) {
            try {
                gid gidVar = (gid) padVar.c;
                gidVar.D.L(gidVar.c);
            } catch (RemoteException unused) {
                w7d.K("Error in sending flushCommandQueue");
            }
        }
        handler.removeCallbacksAndMessages(null);
        this.D = null;
        if (ssaVar != null) {
            int iJ = this.b.j();
            try {
                ssaVar.asBinder().unlinkToDeath(this.g, 0);
                ssaVar.C0(this.c, iJ);
            } catch (RemoteException unused2) {
            }
        }
        this.i.e();
        m59 m59Var = this.b;
        Runnable runnable = new Runnable(this) { // from class: ohd
            public final /* synthetic */ gid b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                gid gidVar2 = this.b;
                switch (b2) {
                    case 0:
                        ijg ijgVar = gidVar2.H;
                        if (ijgVar != null) {
                            gidVar2.A(ijgVar, gjg.c);
                            break;
                        }
                        break;
                    default:
                        gidVar2.c.a.clear();
                        break;
                }
            }
        };
        synchronized (m59Var.d) {
            Handler handlerP = tym.p(null);
            m59Var.g = handlerP;
            m59Var.f = runnable;
            if (((ArrayMap) m59Var.e).isEmpty()) {
                m59Var.k();
            } else {
                handlerP.postDelayed(new mni(m59Var, (byte) 7), 30000L);
            }
        }
    }

    public final void E(int i, int i2) {
        int iO = this.p.j.o();
        int iMin = Math.min(i2, iO);
        if (i >= iO || i == iMin || iO == 0) {
            return;
        }
        boolean z = j(this.p) >= i && j(this.p) < iMin;
        ijg ijgVarV = v(this.p, i, iMin, false, k(), i());
        int i3 = this.p.c.a.b;
        O(ijgVarV, 0, null, z ? 4 : null, i3 >= i && i3 < iMin ? 3 : null);
    }

    public final void F(int i, int i2, List list) throws d45 {
        Integer num;
        Integer num2;
        int iO = this.p.j.o();
        if (i > iO) {
            return;
        }
        if (this.p.j.p()) {
            K(list, false, -9223372036854775807L, -1);
            return;
        }
        int iMin = Math.min(i2, iO);
        ijg ijgVarV = v(u(this.p, iMin, list, k(), i()), i, iMin, true, k(), i());
        int i3 = this.p.c.a.b;
        if (i3 >= i && i3 < iMin) {
            num = 4;
            num2 = 3;
        } else {
            num = null;
            num2 = null;
        }
        O(ijgVarV, 0, null, num, num2);
    }

    public final void I(int i, long j) {
        int i2;
        int i3;
        ijg ijgVarX;
        gql gqlVar = this.p.j;
        if ((gqlVar.p() || i < gqlVar.o()) && !t()) {
            ijg ijgVar = this.p;
            ijg ijgVarF = ijgVar.f(ijgVar.A == 1 ? 1 : 2, ijgVar.a);
            y85 y85VarN = n(gqlVar, i, j);
            if (y85VarN == null) {
                long j2 = j != -9223372036854775807L ? j : 0L;
                i2 = 1;
                i3 = 2;
                fig figVar = new fig(null, i, null, null, i, j2, j2, -1, -1);
                ijg ijgVar2 = this.p;
                gql gqlVar2 = ijgVar2.j;
                boolean z = this.p.c.b;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                c4j c4jVar = this.p.c;
                ijgVarX = x(ijgVar2, gqlVar2, figVar, new c4j(figVar, z, jElapsedRealtime, c4jVar.d, j == -9223372036854775807L ? 0L : j, 0, 0L, c4jVar.h, c4jVar.i, j == -9223372036854775807L ? 0L : j), 1);
            } else {
                i2 = 1;
                i3 = 2;
                c4j c4jVar2 = ijgVarF.c;
                fig figVar2 = c4jVar2.a;
                fig figVar3 = c4jVar2.a;
                int i4 = figVar2.e;
                int i5 = y85VarN.b;
                dql dqlVar = new dql();
                gqlVar.f(i4, dqlVar, false);
                dql dqlVar2 = new dql();
                gqlVar.f(i5, dqlVar2, false);
                boolean z2 = i4 != i5;
                long j3 = y85VarN.a;
                long jN = tym.N(k()) - dqlVar.e;
                if (z2 || j3 != jN) {
                    z4o.H(figVar3.h == -1);
                    fig figVar4 = new fig(null, dqlVar.c, figVar3.c, null, i4, tym.c0(dqlVar.e + jN), tym.c0(dqlVar.e + jN), -1, -1);
                    gqlVar.f(i5, dqlVar2, false);
                    fql fqlVar = new fql();
                    gqlVar.n(dqlVar2.c, fqlVar);
                    long jC0 = tym.c0(dqlVar2.e + j3);
                    fig figVar5 = new fig(null, dqlVar2.c, fqlVar.b, null, i5, jC0, jC0, -1, -1);
                    ijg ijgVarH = ijgVarF.h(1, figVar4, figVar5);
                    if (z2 || j3 < jN) {
                        ijgVarF = ijgVarH.j(new c4j(figVar5, false, SystemClock.elapsedRealtime(), tym.c0(fqlVar.l), jC0, z5i.q(jC0, tym.c0(fqlVar.l)), 0L, -9223372036854775807L, -9223372036854775807L, jC0));
                    } else {
                        long jMax = Math.max(0L, tym.N(ijgVarH.c.g) - (j3 - jN));
                        long jC02 = tym.c0(dqlVar2.e + j3 + jMax);
                        ijgVarF = ijgVarH.j(new c4j(figVar5, false, SystemClock.elapsedRealtime(), tym.c0(fqlVar.l), jC02, z5i.q(jC02, tym.c0(fqlVar.l)), tym.c0(jMax), -9223372036854775807L, -9223372036854775807L, jC02));
                    }
                }
                ijgVarX = ijgVarF;
            }
            c4j c4jVar3 = ijgVarX.c;
            int i6 = (this.p.j.p() || c4jVar3.a.b == this.p.c.a.b) ? 0 : i2;
            if (i6 == 0 && c4jVar3.a.f == this.p.c.a.f) {
                return;
            }
            O(ijgVarX, null, null, Integer.valueOf(i2), i6 != 0 ? Integer.valueOf(i3) : null);
        }
    }

    public final void J(long j) {
        long jK = k() + j;
        long jL = l();
        if (jL != -9223372036854775807L) {
            jK = Math.min(jK, jL);
        }
        I(j(this.p), Math.max(jK, 0L));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: d45 */
    public final void K(List list, boolean z, long j, int i) throws d45 {
        long j2;
        c4j c4jVar;
        fig figVar;
        int iA = i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z2 = false;
        int i2 = 0;
        while (i2 < list.size()) {
            qjd qjdVar = (qjd) list.get(i2);
            int i3 = nac.a;
            fql fqlVar = new fql();
            int i4 = i2;
            fqlVar.b(0, qjdVar, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, i4, i4, 0L);
            arrayList.add(fqlVar);
            dql dqlVar = new dql();
            dqlVar.j(null, null, i4, -9223372036854775807L, 0L, to.f, true);
            arrayList2.add(dqlVar);
            i2 = i4 + 1;
        }
        eql eqlVarE = e(arrayList, arrayList2);
        csh cshVar = eqlVarE.e;
        if (!eqlVarE.p() && iA >= cshVar.d) {
            throw new d45();
        }
        if (z) {
            iA = eqlVarE.p() ? 0 : eqlVarE.a(this.p.i);
            j2 = -9223372036854775807L;
        } else if (iA == -1) {
            fig figVar2 = this.p.c.a;
            int i5 = figVar2.b;
            j2 = figVar2.f;
            if (eqlVarE.p() || i5 < cshVar.d) {
                iA = i5;
            } else {
                iA = eqlVarE.a(this.p.i);
                j2 = -9223372036854775807L;
                z2 = true;
            }
        } else {
            j2 = j;
        }
        y85 y85VarN = n(eqlVarE, iA, j2);
        if (y85VarN == null) {
            long j3 = j2 == -9223372036854775807L ? 0L : j2;
            fig figVar3 = new fig(null, iA, null, null, iA, j3, j3, -1, -1);
            c4jVar = new c4j(figVar3, false, SystemClock.elapsedRealtime(), -9223372036854775807L, j2 == -9223372036854775807L ? 0L : j2, 0, 0L, -9223372036854775807L, -9223372036854775807L, j2 == -9223372036854775807L ? 0L : j2);
            figVar = figVar3;
        } else {
            long j4 = y85VarN.a;
            fig figVar4 = new fig(null, iA, (qjd) list.get(iA), null, y85VarN.b, tym.c0(j4), tym.c0(j4), -1, -1);
            c4jVar = new c4j(figVar4, false, SystemClock.elapsedRealtime(), -9223372036854775807L, tym.c0(j4), 0, 0L, -9223372036854775807L, -9223372036854775807L, tym.c0(j4));
            figVar = figVar4;
        }
        ijg ijgVarX = x(this.p, eqlVarE, figVar, c4jVar, 4);
        int i6 = ijgVarX.A;
        if (iA != -1 && i6 != 1) {
            i6 = (eqlVarE.p() || z2) ? 4 : 2;
        }
        ijg ijgVarF = ijgVarX.f(i6, this.p.a);
        O(ijgVarF, 0, null, !this.p.j.p() ? 4 : null, (this.p.j.p() && ijgVarF.j.p()) ? null : 3);
    }

    public final void L(boolean z) {
        ijg ijgVar = this.p;
        int i = ijgVar.z;
        int i2 = i == 1 ? 0 : i;
        if (ijgVar.v == z && i == i2) {
            return;
        }
        this.F = z5i.M(ijgVar, this.F, this.G, this.a.g);
        this.G = SystemClock.elapsedRealtime();
        O(this.p.d(1, i2, z), null, 1, null, null);
    }

    public final void M(SurfaceHolder surfaceHolder) {
        if (s(27)) {
            if (surfaceHolder == null) {
                c();
                return;
            }
            if (this.A == surfaceHolder) {
                return;
            }
            b();
            this.A = surfaceHolder;
            surfaceHolder.addCallback(this.h);
            Surface surface = surfaceHolder.getSurface();
            if (surface == null || !surface.isValid()) {
                this.z = null;
                N(null, 0, 0);
                B(0, 0);
            } else {
                this.z = surface;
                Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                N(surface, surfaceFrame.width(), surfaceFrame.height());
                B(surfaceFrame.width(), surfaceFrame.height());
            }
        }
    }

    public final void N(Surface surface, int i, int i2) {
        if (r()) {
            m4j m4jVar = this.n;
            m4jVar.getClass();
            if (m4jVar.a.c >= 8) {
                h(new rhd(this, surface, i, i2, (byte) 0));
            } else {
                h(new z0c(this, surface, (byte) 6));
            }
        }
    }

    public final void O(ijg ijgVar, Integer num, Integer num2, Integer num3, Integer num4) {
        ijg ijgVar2 = this.p;
        this.p = ijgVar;
        z(ijgVar2, ijgVar, num, num2, num3, num4);
    }

    public final void a(int i, List list) throws d45 {
        if (list.isEmpty()) {
            return;
        }
        if (this.p.j.p()) {
            K(list, false, -9223372036854775807L, -1);
        } else {
            O(u(this.p, Math.min(i, this.p.j.o()), list, k(), i()), 0, null, null, this.p.j.p() ? 3 : null);
        }
    }

    public final void b() {
        TextureView textureView = this.B;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(null);
            this.B = null;
        }
        SurfaceHolder surfaceHolder = this.A;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.h);
            this.A = null;
        }
        if (this.z != null) {
            this.z = null;
        }
    }

    public final void c() {
        if (s(27)) {
            b();
            N(null, 0, 0);
            B(0, 0);
        }
    }

    public final ListenableFuture f(ssa ssaVar, did didVar) {
        MediaController mediaController;
        if (ssaVar == null) {
            return yr9.c(new e4j(-4));
        }
        if (Build.VERSION.SDK_INT >= 31 && (mediaController = this.E) != null) {
            mediaController.getTransportControls().sendCustomAction("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST", (Bundle) null);
        }
        e4j e4jVar = new e4j(1);
        m59 m59Var = this.b;
        o1j o1jVarC = m59Var.c(e4jVar);
        int i = o1jVarC.a;
        t72 t72Var = this.k;
        if (t72Var.isEmpty()) {
            this.H = this.p;
        }
        t72Var.add(Integer.valueOf(i));
        try {
            didVar.c(ssaVar, i);
            return o1jVarC;
        } catch (RemoteException e) {
            w7d.L("Cannot connect to the service or the session is gone", e);
            t72Var.remove(Integer.valueOf(i));
            m59Var.n(i, new e4j(-100));
            return o1jVarC;
        }
    }

    public final void g(did didVar) {
        pad padVar = this.j;
        Handler handler = (Handler) padVar.b;
        if (((gid) padVar.c).D != null && !handler.hasMessages(1)) {
            handler.sendEmptyMessage(1);
        }
        f(this.D, didVar);
    }

    public final void h(did didVar) {
        pad padVar = this.j;
        Handler handler = (Handler) padVar.b;
        if (((gid) padVar.c).D != null && !handler.hasMessages(1)) {
            handler.sendEmptyMessage(1);
        }
        o1j o1jVarF = f(this.D, didVar);
        try {
            nac.e(o1jVarF);
        } catch (ExecutionException e) {
            h9o.o(e);
        } catch (TimeoutException e2) {
            if (o1jVarF instanceof o1j) {
                int i = o1jVarF.a;
                this.k.remove(Integer.valueOf(i));
                this.b.n(i, new e4j(-1));
            }
            w7d.L("Synchronous command takes too long on the session side.", e2);
        }
    }

    public final long i() {
        c4j c4jVar = this.p.c;
        return !c4jVar.b ? k() : c4jVar.a.g;
    }

    public final long k() {
        long jM = z5i.M(this.p, this.F, this.G, this.a.g);
        this.F = jM;
        return jM;
    }

    public final long l() {
        return this.p.c.d;
    }

    public final int m() {
        if (this.p.j.p()) {
            return -1;
        }
        ijg ijgVar = this.p;
        gql gqlVar = ijgVar.j;
        int iJ = j(ijgVar);
        ijg ijgVar2 = this.p;
        int i = ijgVar2.h;
        if (i == 1) {
            i = 0;
        }
        return gqlVar.e(iJ, i, ijgVar2.i);
    }

    public final y85 n(gql gqlVar, int i, long j) {
        if (gqlVar.p()) {
            return null;
        }
        fql fqlVar = new fql();
        dql dqlVar = new dql();
        if (i == -1 || i >= gqlVar.o()) {
            i = gqlVar.a(this.p.i);
            j = tym.c0(gqlVar.m(i, fqlVar, 0L).k);
        }
        long jN = tym.N(j);
        z4o.A(i, gqlVar.o());
        gqlVar.n(i, fqlVar);
        if (jN == -9223372036854775807L) {
            jN = fqlVar.k;
            if (jN == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = fqlVar.m;
        gqlVar.f(i2, dqlVar, false);
        while (i2 < fqlVar.n && dqlVar.e != jN) {
            int i3 = i2 + 1;
            if (gqlVar.f(i3, dqlVar, false).e > jN) {
                break;
            }
            i2 = i3;
        }
        gqlVar.f(i2, dqlVar, false);
        return new y85(i2, jN - dqlVar.e);
    }

    public final int o() {
        if (this.p.j.p()) {
            return -1;
        }
        ijg ijgVar = this.p;
        gql gqlVar = ijgVar.j;
        int iJ = j(ijgVar);
        ijg ijgVar2 = this.p;
        int i = ijgVar2.h;
        if (i == 1) {
            i = 0;
        }
        return gqlVar.k(iJ, i, ijgVar2.i);
    }

    public final boolean p() {
        return m() != -1;
    }

    public final boolean q() {
        return o() != -1;
    }

    public final boolean r() {
        return this.D != null;
    }

    public final boolean s(int i) {
        if (this.y.a(i)) {
            return true;
        }
        vep.y(i, "Controller isn't allowed to call command= ");
        return false;
    }

    public final boolean t() {
        return this.p.c.b;
    }

    public final void y(int i, int i2, int i3) {
        int i4;
        int i5;
        gql gqlVar = this.p.j;
        int iO = gqlVar.o();
        int iMin = Math.min(i2, iO);
        int i6 = iMin - i;
        int iMin2 = Math.min(i3, iO - i6);
        if (i >= iO || i == iMin || i == iMin2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < iO; i7++) {
            arrayList.add(gqlVar.m(i7, new fql(), 0L));
        }
        tym.M(arrayList, i, iMin, iMin2);
        C(gqlVar, arrayList, arrayList2);
        eql eqlVarE = e(arrayList, arrayList2);
        if (eqlVarE.p()) {
            return;
        }
        int iJ = j(this.p);
        if (iJ < i || iJ >= iMin) {
            if (iMin <= iJ) {
                if (iMin2 > iJ) {
                    i4 = iJ - i6;
                }
                i5 = iJ;
            } else {
                if (iMin2 <= iJ) {
                    i4 = iJ + i6;
                }
                i5 = iJ;
            }
            fql fqlVar = new fql();
            int i8 = this.p.c.a.e - gqlVar.m(iJ, fqlVar, 0L).m;
            eqlVarE.m(i5, fqlVar, 0L);
            O(w(this.p, eqlVarE, i5, fqlVar.m + i8, k(), i(), 5), 0, null, null, null);
        }
        i4 = (iJ - i) + iMin2;
        i5 = i4;
        fql fqlVar2 = new fql();
        int i82 = this.p.c.a.e - gqlVar.m(iJ, fqlVar2, 0L).m;
        eqlVarE.m(i5, fqlVar2, 0L);
        O(w(this.p, eqlVarE, i5, fqlVar2.m + i82, k(), i(), 5), 0, null, null, null);
    }

    public final void z(ijg ijgVar, final ijg ijgVar2, final Integer num, final Integer num2, final Integer num3, Integer num4) {
        final byte b = 0;
        ijc ijcVar = this.i;
        if (num != null) {
            ijcVar.d(0, new fjc() { // from class: bid
                public final void invoke(Object obj) {
                    byte b2 = b;
                    Integer num5 = num;
                    ijg ijgVar3 = ijgVar2;
                    eig eigVar = (eig) obj;
                    switch (b2) {
                        case 0:
                            eigVar.K(ijgVar3.j, num5.intValue());
                            break;
                        case 1:
                            eigVar.n(num5.intValue(), ijgVar3.d, ijgVar3.e);
                            break;
                        default:
                            eigVar.z(num5.intValue(), ijgVar3.v);
                            break;
                    }
                }
            });
        }
        final byte b2 = 11;
        final byte b3 = 1;
        if (num3 != null) {
            ijcVar.d(11, new fjc() { // from class: bid
                public final void invoke(Object obj) {
                    byte b22 = b3;
                    Integer num5 = num3;
                    ijg ijgVar3 = ijgVar2;
                    eig eigVar = (eig) obj;
                    switch (b22) {
                        case 0:
                            eigVar.K(ijgVar3.j, num5.intValue());
                            break;
                        case 1:
                            eigVar.n(num5.intValue(), ijgVar3.d, ijgVar3.e);
                            break;
                        default:
                            eigVar.z(num5.intValue(), ijgVar3.v);
                            break;
                    }
                }
            });
        }
        qjd qjdVarQ = ijgVar2.q();
        final byte b4 = 10;
        if (num4 != null) {
            ijcVar.d(1, new z0c(qjdVarQ, num4, b4));
        }
        rhg rhgVar = ijgVar.a;
        rhg rhgVar2 = ijgVar2.a;
        final byte b5 = 2;
        if (rhgVar != rhgVar2 && (rhgVar == null || !rhgVar.d(rhgVar2))) {
            ijcVar.d(10, new al6(rhgVar2, b3));
            if (rhgVar2 != null) {
                ijcVar.d(10, new al6(rhgVar2, b5));
            }
        }
        final byte b6 = 18;
        if (!ijgVar.F.equals(ijgVar2.F)) {
            ijcVar.d(2, new fjc() { // from class: cid
                public final void invoke(Object obj) {
                    byte b7 = b6;
                    ijg ijgVar3 = ijgVar2;
                    eig eigVar = (eig) obj;
                    switch (b7) {
                        case 0:
                            eigVar.b(ijgVar3.z);
                            break;
                        case 1:
                            eigVar.P(ijgVar3.x);
                            break;
                        case 2:
                            eigVar.M(ijgVar3.g);
                            break;
                        case 3:
                            eigVar.onRepeatModeChanged(ijgVar3.h);
                            break;
                        case 4:
                            eigVar.onShuffleModeEnabledChanged(ijgVar3.i);
                            break;
                        case 5:
                            eigVar.o(ijgVar3.m);
                            break;
                        case 6:
                            eigVar.A(ijgVar3.n);
                            break;
                        case 7:
                            eigVar.v(ijgVar3.q);
                            break;
                        case 8:
                            eigVar.g(ijgVar3.p);
                            break;
                        case 9:
                            eigVar.p(ijgVar3.r.a);
                            break;
                        case 10:
                            eigVar.E(ijgVar3.r);
                            break;
                        case 11:
                            eigVar.r(ijgVar3.s);
                            break;
                        case 12:
                            eigVar.l(ijgVar3.t, ijgVar3.u);
                            break;
                        case 13:
                            eigVar.a(ijgVar3.l);
                            break;
                        case 14:
                            eigVar.m(ijgVar3.C);
                            break;
                        case 15:
                            eigVar.J(ijgVar3.D);
                            break;
                        case 16:
                            eigVar.O(ijgVar3.E);
                            break;
                        case 17:
                            eigVar.w(ijgVar3.G);
                            break;
                        case 18:
                            eigVar.G(ijgVar3.F);
                            break;
                        case 19:
                            eigVar.I(ijgVar3.B);
                            break;
                        case 20:
                            eigVar.x(ijgVar3.y);
                            break;
                        default:
                            eigVar.h(ijgVar3.A);
                            break;
                    }
                }
            });
        }
        final byte b7 = 19;
        if (!ijgVar.B.equals(ijgVar2.B)) {
            ijcVar.d(14, new fjc() { // from class: cid
                public final void invoke(Object obj) {
                    byte b72 = b7;
                    ijg ijgVar3 = ijgVar2;
                    eig eigVar = (eig) obj;
                    switch (b72) {
                        case 0:
                            eigVar.b(ijgVar3.z);
                            break;
                        case 1:
                            eigVar.P(ijgVar3.x);
                            break;
                        case 2:
                            eigVar.M(ijgVar3.g);
                            break;
                        case 3:
                            eigVar.onRepeatModeChanged(ijgVar3.h);
                            break;
                        case 4:
                            eigVar.onShuffleModeEnabledChanged(ijgVar3.i);
                            break;
                        case 5:
                            eigVar.o(ijgVar3.m);
                            break;
                        case 6:
                            eigVar.A(ijgVar3.n);
                            break;
                        case 7:
                            eigVar.v(ijgVar3.q);
                            break;
                        case 8:
                            eigVar.g(ijgVar3.p);
                            break;
                        case 9:
                            eigVar.p(ijgVar3.r.a);
                            break;
                        case 10:
                            eigVar.E(ijgVar3.r);
                            break;
                        case 11:
                            eigVar.r(ijgVar3.s);
                            break;
                        case 12:
                            eigVar.l(ijgVar3.t, ijgVar3.u);
                            break;
                        case 13:
                            eigVar.a(ijgVar3.l);
                            break;
                        case 14:
                            eigVar.m(ijgVar3.C);
                            break;
                        case 15:
                            eigVar.J(ijgVar3.D);
                            break;
                        case 16:
                            eigVar.O(ijgVar3.E);
                            break;
                        case 17:
                            eigVar.w(ijgVar3.G);
                            break;
                        case 18:
                            eigVar.G(ijgVar3.F);
                            break;
                        case 19:
                            eigVar.I(ijgVar3.B);
                            break;
                        case 20:
                            eigVar.x(ijgVar3.y);
                            break;
                        default:
                            eigVar.h(ijgVar3.A);
                            break;
                    }
                }
            });
        }
        final byte b8 = 20;
        final byte b9 = 3;
        if (ijgVar.y != ijgVar2.y) {
            ijcVar.d(3, new fjc() { // from class: cid
                public final void invoke(Object obj) {
                    byte b72 = b8;
                    ijg ijgVar3 = ijgVar2;
                    eig eigVar = (eig) obj;
                    switch (b72) {
                        case 0:
                            eigVar.b(ijgVar3.z);
                            break;
                        case 1:
                            eigVar.P(ijgVar3.x);
                            break;
                        case 2:
                            eigVar.M(ijgVar3.g);
                            break;
                        case 3:
                            eigVar.onRepeatModeChanged(ijgVar3.h);
                            break;
                        case 4:
                            eigVar.onShuffleModeEnabledChanged(ijgVar3.i);
                            break;
                        case 5:
                            eigVar.o(ijgVar3.m);
                            break;
                        case 6:
                            eigVar.A(ijgVar3.n);
                            break;
                        case 7:
                            eigVar.v(ijgVar3.q);
                            break;
                        case 8:
                            eigVar.g(ijgVar3.p);
                            break;
                        case 9:
                            eigVar.p(ijgVar3.r.a);
                            break;
                        case 10:
                            eigVar.E(ijgVar3.r);
                            break;
                        case 11:
                            eigVar.r(ijgVar3.s);
                            break;
                        case 12:
                            eigVar.l(ijgVar3.t, ijgVar3.u);
                            break;
                        case 13:
                            eigVar.a(ijgVar3.l);
                            break;
                        case 14:
                            eigVar.m(ijgVar3.C);
                            break;
                        case 15:
                            eigVar.J(ijgVar3.D);
                            break;
                        case 16:
                            eigVar.O(ijgVar3.E);
                            break;
                        case 17:
                            eigVar.w(ijgVar3.G);
                            break;
                        case 18:
                            eigVar.G(ijgVar3.F);
                            break;
                        case 19:
                            eigVar.I(ijgVar3.B);
                            break;
                        case 20:
                            eigVar.x(ijgVar3.y);
                            break;
                        default:
                            eigVar.h(ijgVar3.A);
                            break;
                    }
                }
            });
        }
        final byte b10 = 21;
        final byte b11 = 4;
        if (ijgVar.A != ijgVar2.A) {
            ijcVar.d(4, new fjc() { // from class: cid
                public final void invoke(Object obj) {
                    byte b72 = b10;
                    ijg ijgVar3 = ijgVar2;
                    eig eigVar = (eig) obj;
                    switch (b72) {
                        case 0:
                            eigVar.b(ijgVar3.z);
                            break;
                        case 1:
                            eigVar.P(ijgVar3.x);
                            break;
                        case 2:
                            eigVar.M(ijgVar3.g);
                            break;
                        case 3:
                            eigVar.onRepeatModeChanged(ijgVar3.h);
                            break;
                        case 4:
                            eigVar.onShuffleModeEnabledChanged(ijgVar3.i);
                            break;
                        case 5:
                            eigVar.o(ijgVar3.m);
                            break;
                        case 6:
                            eigVar.A(ijgVar3.n);
                            break;
                        case 7:
                            eigVar.v(ijgVar3.q);
                            break;
                        case 8:
                            eigVar.g(ijgVar3.p);
                            break;
                        case 9:
                            eigVar.p(ijgVar3.r.a);
                            break;
                        case 10:
                            eigVar.E(ijgVar3.r);
                            break;
                        case 11:
                            eigVar.r(ijgVar3.s);
                            break;
                        case 12:
                            eigVar.l(ijgVar3.t, ijgVar3.u);
                            break;
                        case 13:
                            eigVar.a(ijgVar3.l);
                            break;
                        case 14:
                            eigVar.m(ijgVar3.C);
                            break;
                        case 15:
                            eigVar.J(ijgVar3.D);
                            break;
                        case 16:
                            eigVar.O(ijgVar3.E);
                            break;
                        case 17:
                            eigVar.w(ijgVar3.G);
                            break;
                        case 18:
                            eigVar.G(ijgVar3.F);
                            break;
                        case 19:
                            eigVar.I(ijgVar3.B);
                            break;
                        case 20:
                            eigVar.x(ijgVar3.y);
                            break;
                        default:
                            eigVar.h(ijgVar3.A);
                            break;
                    }
                }
            });
        }
        final byte b12 = 5;
        if (num2 != null) {
            ijcVar.d(5, new fjc() { // from class: bid
                public final void invoke(Object obj) {
                    byte b22 = b5;
                    Integer num5 = num2;
                    ijg ijgVar3 = ijgVar2;
                    eig eigVar = (eig) obj;
                    switch (b22) {
                        case 0:
                            eigVar.K(ijgVar3.j, num5.intValue());
                            break;
                        case 1:
                            eigVar.n(num5.intValue(), ijgVar3.d, ijgVar3.e);
                            break;
                        default:
                            eigVar.z(num5.intValue(), ijgVar3.v);
                            break;
                    }
                }
            });
        }
        final byte b13 = 6;
        if (ijgVar.z != ijgVar2.z) {
            ijcVar.d(6, new fjc() { // from class: cid
                public final void invoke(Object obj) {
                    byte b72 = b;
                    ijg ijgVar3 = ijgVar2;
                    eig eigVar = (eig) obj;
                    switch (b72) {
                        case 0:
                            eigVar.b(ijgVar3.z);
                            break;
                        case 1:
                            eigVar.P(ijgVar3.x);
                            break;
                        case 2:
                            eigVar.M(ijgVar3.g);
                            break;
                        case 3:
                            eigVar.onRepeatModeChanged(ijgVar3.h);
                            break;
                        case 4:
                            eigVar.onShuffleModeEnabledChanged(ijgVar3.i);
                            break;
                        case 5:
                            eigVar.o(ijgVar3.m);
                            break;
                        case 6:
                            eigVar.A(ijgVar3.n);
                            break;
                        case 7:
                            eigVar.v(ijgVar3.q);
                            break;
                        case 8:
                            eigVar.g(ijgVar3.p);
                            break;
                        case 9:
                            eigVar.p(ijgVar3.r.a);
                            break;
                        case 10:
                            eigVar.E(ijgVar3.r);
                            break;
                        case 11:
                            eigVar.r(ijgVar3.s);
                            break;
                        case 12:
                            eigVar.l(ijgVar3.t, ijgVar3.u);
                            break;
                        case 13:
                            eigVar.a(ijgVar3.l);
                            break;
                        case 14:
                            eigVar.m(ijgVar3.C);
                            break;
                        case 15:
                            eigVar.J(ijgVar3.D);
                            break;
                        case 16:
                            eigVar.O(ijgVar3.E);
                            break;
                        case 17:
                            eigVar.w(ijgVar3.G);
                            break;
                        case 18:
                            eigVar.G(ijgVar3.F);
                            break;
                        case 19:
                            eigVar.I(ijgVar3.B);
                            break;
                        case 20:
                            eigVar.x(ijgVar3.y);
                            break;
                        default:
                            eigVar.h(ijgVar3.A);
                            break;
                    }
                }
            });
        }
        final byte b14 = 7;
        if (ijgVar.x != ijgVar2.x) {
            ijcVar.d(7, new fjc() { // from class: cid
                public final void invoke(Object obj) {
                    byte b72 = b3;
                    ijg ijgVar3 = ijgVar2;
                    eig eigVar = (eig) obj;
                    switch (b72) {
                        case 0:
                            eigVar.b(ijgVar3.z);
                            break;
                        case 1:
                            eigVar.P(ijgVar3.x);
                            break;
                        case 2:
                            eigVar.M(ijgVar3.g);
                            break;
                        case 3:
                            eigVar.onRepeatModeChanged(ijgVar3.h);
                            break;
                        case 4:
                            eigVar.onShuffleModeEnabledChanged(ijgVar3.i);
                            break;
                        case 5:
                            eigVar.o(ijgVar3.m);
                            break;
                        case 6:
                            eigVar.A(ijgVar3.n);
                            break;
                        case 7:
                            eigVar.v(ijgVar3.q);
                            break;
                        case 8:
                            eigVar.g(ijgVar3.p);
                            break;
                        case 9:
                            eigVar.p(ijgVar3.r.a);
                            break;
                        case 10:
                            eigVar.E(ijgVar3.r);
                            break;
                        case 11:
                            eigVar.r(ijgVar3.s);
                            break;
                        case 12:
                            eigVar.l(ijgVar3.t, ijgVar3.u);
                            break;
                        case 13:
                            eigVar.a(ijgVar3.l);
                            break;
                        case 14:
                            eigVar.m(ijgVar3.C);
                            break;
                        case 15:
                            eigVar.J(ijgVar3.D);
                            break;
                        case 16:
                            eigVar.O(ijgVar3.E);
                            break;
                        case 17:
                            eigVar.w(ijgVar3.G);
                            break;
                        case 18:
                            eigVar.G(ijgVar3.F);
                            break;
                        case 19:
                            eigVar.I(ijgVar3.B);
                            break;
                        case 20:
                            eigVar.x(ijgVar3.y);
                            break;
                        default:
                            eigVar.h(ijgVar3.A);
                            break;
                    }
                }
            });
        }
        final byte b15 = 12;
        if (!ijgVar.g.equals(ijgVar2.g)) {
            ijcVar.d(12, new fjc() { // from class: cid
                public final void invoke(Object obj) {
                    byte b72 = b5;
                    ijg ijgVar3 = ijgVar2;
                    eig eigVar = (eig) obj;
                    switch (b72) {
                        case 0:
                            eigVar.b(ijgVar3.z);
                            break;
                        case 1:
                            eigVar.P(ijgVar3.x);
                            break;
                        case 2:
                            eigVar.M(ijgVar3.g);
                            break;
                        case 3:
                            eigVar.onRepeatModeChanged(ijgVar3.h);
                            break;
                        case 4:
                            eigVar.onShuffleModeEnabledChanged(ijgVar3.i);
                            break;
                        case 5:
                            eigVar.o(ijgVar3.m);
                            break;
                        case 6:
                            eigVar.A(ijgVar3.n);
                            break;
                        case 7:
                            eigVar.v(ijgVar3.q);
                            break;
                        case 8:
                            eigVar.g(ijgVar3.p);
                            break;
                        case 9:
                            eigVar.p(ijgVar3.r.a);
                            break;
                        case 10:
                            eigVar.E(ijgVar3.r);
                            break;
                        case 11:
                            eigVar.r(ijgVar3.s);
                            break;
                        case 12:
                            eigVar.l(ijgVar3.t, ijgVar3.u);
                            break;
                        case 13:
                            eigVar.a(ijgVar3.l);
                            break;
                        case 14:
                            eigVar.m(ijgVar3.C);
                            break;
                        case 15:
                            eigVar.J(ijgVar3.D);
                            break;
                        case 16:
                            eigVar.O(ijgVar3.E);
                            break;
                        case 17:
                            eigVar.w(ijgVar3.G);
                            break;
                        case 18:
                            eigVar.G(ijgVar3.F);
                            break;
                        case 19:
                            eigVar.I(ijgVar3.B);
                            break;
                        case 20:
                            eigVar.x(ijgVar3.y);
                            break;
                        default:
                            eigVar.h(ijgVar3.A);
                            break;
                    }
                }
            });
        }
        final byte b16 = 8;
        if (ijgVar.h != ijgVar2.h) {
            ijcVar.d(8, new fjc() { // from class: cid
                public final void invoke(Object obj) {
                    byte b72 = b9;
                    ijg ijgVar3 = ijgVar2;
                    eig eigVar = (eig) obj;
                    switch (b72) {
                        case 0:
                            eigVar.b(ijgVar3.z);
                            break;
                        case 1:
                            eigVar.P(ijgVar3.x);
                            break;
                        case 2:
                            eigVar.M(ijgVar3.g);
                            break;
                        case 3:
                            eigVar.onRepeatModeChanged(ijgVar3.h);
                            break;
                        case 4:
                            eigVar.onShuffleModeEnabledChanged(ijgVar3.i);
                            break;
                        case 5:
                            eigVar.o(ijgVar3.m);
                            break;
                        case 6:
                            eigVar.A(ijgVar3.n);
                            break;
                        case 7:
                            eigVar.v(ijgVar3.q);
                            break;
                        case 8:
                            eigVar.g(ijgVar3.p);
                            break;
                        case 9:
                            eigVar.p(ijgVar3.r.a);
                            break;
                        case 10:
                            eigVar.E(ijgVar3.r);
                            break;
                        case 11:
                            eigVar.r(ijgVar3.s);
                            break;
                        case 12:
                            eigVar.l(ijgVar3.t, ijgVar3.u);
                            break;
                        case 13:
                            eigVar.a(ijgVar3.l);
                            break;
                        case 14:
                            eigVar.m(ijgVar3.C);
                            break;
                        case 15:
                            eigVar.J(ijgVar3.D);
                            break;
                        case 16:
                            eigVar.O(ijgVar3.E);
                            break;
                        case 17:
                            eigVar.w(ijgVar3.G);
                            break;
                        case 18:
                            eigVar.G(ijgVar3.F);
                            break;
                        case 19:
                            eigVar.I(ijgVar3.B);
                            break;
                        case 20:
                            eigVar.x(ijgVar3.y);
                            break;
                        default:
                            eigVar.h(ijgVar3.A);
                            break;
                    }
                }
            });
        }
        final byte b17 = 9;
        if (ijgVar.i != ijgVar2.i) {
            ijcVar.d(9, new fjc() { // from class: cid
                public final void invoke(Object obj) {
                    byte b72 = b11;
                    ijg ijgVar3 = ijgVar2;
                    eig eigVar = (eig) obj;
                    switch (b72) {
                        case 0:
                            eigVar.b(ijgVar3.z);
                            break;
                        case 1:
                            eigVar.P(ijgVar3.x);
                            break;
                        case 2:
                            eigVar.M(ijgVar3.g);
                            break;
                        case 3:
                            eigVar.onRepeatModeChanged(ijgVar3.h);
                            break;
                        case 4:
                            eigVar.onShuffleModeEnabledChanged(ijgVar3.i);
                            break;
                        case 5:
                            eigVar.o(ijgVar3.m);
                            break;
                        case 6:
                            eigVar.A(ijgVar3.n);
                            break;
                        case 7:
                            eigVar.v(ijgVar3.q);
                            break;
                        case 8:
                            eigVar.g(ijgVar3.p);
                            break;
                        case 9:
                            eigVar.p(ijgVar3.r.a);
                            break;
                        case 10:
                            eigVar.E(ijgVar3.r);
                            break;
                        case 11:
                            eigVar.r(ijgVar3.s);
                            break;
                        case 12:
                            eigVar.l(ijgVar3.t, ijgVar3.u);
                            break;
                        case 13:
                            eigVar.a(ijgVar3.l);
                            break;
                        case 14:
                            eigVar.m(ijgVar3.C);
                            break;
                        case 15:
                            eigVar.J(ijgVar3.D);
                            break;
                        case 16:
                            eigVar.O(ijgVar3.E);
                            break;
                        case 17:
                            eigVar.w(ijgVar3.G);
                            break;
                        case 18:
                            eigVar.G(ijgVar3.F);
                            break;
                        case 19:
                            eigVar.I(ijgVar3.B);
                            break;
                        case 20:
                            eigVar.x(ijgVar3.y);
                            break;
                        default:
                            eigVar.h(ijgVar3.A);
                            break;
                    }
                }
            });
        }
        final byte b18 = 15;
        if (!ijgVar.m.equals(ijgVar2.m)) {
            ijcVar.d(15, new fjc() { // from class: cid
                public final void invoke(Object obj) {
                    byte b72 = b12;
                    ijg ijgVar3 = ijgVar2;
                    eig eigVar = (eig) obj;
                    switch (b72) {
                        case 0:
                            eigVar.b(ijgVar3.z);
                            break;
                        case 1:
                            eigVar.P(ijgVar3.x);
                            break;
                        case 2:
                            eigVar.M(ijgVar3.g);
                            break;
                        case 3:
                            eigVar.onRepeatModeChanged(ijgVar3.h);
                            break;
                        case 4:
                            eigVar.onShuffleModeEnabledChanged(ijgVar3.i);
                            break;
                        case 5:
                            eigVar.o(ijgVar3.m);
                            break;
                        case 6:
                            eigVar.A(ijgVar3.n);
                            break;
                        case 7:
                            eigVar.v(ijgVar3.q);
                            break;
                        case 8:
                            eigVar.g(ijgVar3.p);
                            break;
                        case 9:
                            eigVar.p(ijgVar3.r.a);
                            break;
                        case 10:
                            eigVar.E(ijgVar3.r);
                            break;
                        case 11:
                            eigVar.r(ijgVar3.s);
                            break;
                        case 12:
                            eigVar.l(ijgVar3.t, ijgVar3.u);
                            break;
                        case 13:
                            eigVar.a(ijgVar3.l);
                            break;
                        case 14:
                            eigVar.m(ijgVar3.C);
                            break;
                        case 15:
                            eigVar.J(ijgVar3.D);
                            break;
                        case 16:
                            eigVar.O(ijgVar3.E);
                            break;
                        case 17:
                            eigVar.w(ijgVar3.G);
                            break;
                        case 18:
                            eigVar.G(ijgVar3.F);
                            break;
                        case 19:
                            eigVar.I(ijgVar3.B);
                            break;
                        case 20:
                            eigVar.x(ijgVar3.y);
                            break;
                        default:
                            eigVar.h(ijgVar3.A);
                            break;
                    }
                }
            });
        }
        if (ijgVar.n != ijgVar2.n) {
            ijcVar.d(22, new fjc() { // from class: cid
                public final void invoke(Object obj) {
                    byte b72 = b13;
                    ijg ijgVar3 = ijgVar2;
                    eig eigVar = (eig) obj;
                    switch (b72) {
                        case 0:
                            eigVar.b(ijgVar3.z);
                            break;
                        case 1:
                            eigVar.P(ijgVar3.x);
                            break;
                        case 2:
                            eigVar.M(ijgVar3.g);
                            break;
                        case 3:
                            eigVar.onRepeatModeChanged(ijgVar3.h);
                            break;
                        case 4:
                            eigVar.onShuffleModeEnabledChanged(ijgVar3.i);
                            break;
                        case 5:
                            eigVar.o(ijgVar3.m);
                            break;
                        case 6:
                            eigVar.A(ijgVar3.n);
                            break;
                        case 7:
                            eigVar.v(ijgVar3.q);
                            break;
                        case 8:
                            eigVar.g(ijgVar3.p);
                            break;
                        case 9:
                            eigVar.p(ijgVar3.r.a);
                            break;
                        case 10:
                            eigVar.E(ijgVar3.r);
                            break;
                        case 11:
                            eigVar.r(ijgVar3.s);
                            break;
                        case 12:
                            eigVar.l(ijgVar3.t, ijgVar3.u);
                            break;
                        case 13:
                            eigVar.a(ijgVar3.l);
                            break;
                        case 14:
                            eigVar.m(ijgVar3.C);
                            break;
                        case 15:
                            eigVar.J(ijgVar3.D);
                            break;
                        case 16:
                            eigVar.O(ijgVar3.E);
                            break;
                        case 17:
                            eigVar.w(ijgVar3.G);
                            break;
                        case 18:
                            eigVar.G(ijgVar3.F);
                            break;
                        case 19:
                            eigVar.I(ijgVar3.B);
                            break;
                        case 20:
                            eigVar.x(ijgVar3.y);
                            break;
                        default:
                            eigVar.h(ijgVar3.A);
                            break;
                    }
                }
            });
        }
        if (!ijgVar.q.equals(ijgVar2.q)) {
            ijcVar.d(20, new fjc() { // from class: cid
                public final void invoke(Object obj) {
                    byte b72 = b14;
                    ijg ijgVar3 = ijgVar2;
                    eig eigVar = (eig) obj;
                    switch (b72) {
                        case 0:
                            eigVar.b(ijgVar3.z);
                            break;
                        case 1:
                            eigVar.P(ijgVar3.x);
                            break;
                        case 2:
                            eigVar.M(ijgVar3.g);
                            break;
                        case 3:
                            eigVar.onRepeatModeChanged(ijgVar3.h);
                            break;
                        case 4:
                            eigVar.onShuffleModeEnabledChanged(ijgVar3.i);
                            break;
                        case 5:
                            eigVar.o(ijgVar3.m);
                            break;
                        case 6:
                            eigVar.A(ijgVar3.n);
                            break;
                        case 7:
                            eigVar.v(ijgVar3.q);
                            break;
                        case 8:
                            eigVar.g(ijgVar3.p);
                            break;
                        case 9:
                            eigVar.p(ijgVar3.r.a);
                            break;
                        case 10:
                            eigVar.E(ijgVar3.r);
                            break;
                        case 11:
                            eigVar.r(ijgVar3.s);
                            break;
                        case 12:
                            eigVar.l(ijgVar3.t, ijgVar3.u);
                            break;
                        case 13:
                            eigVar.a(ijgVar3.l);
                            break;
                        case 14:
                            eigVar.m(ijgVar3.C);
                            break;
                        case 15:
                            eigVar.J(ijgVar3.D);
                            break;
                        case 16:
                            eigVar.O(ijgVar3.E);
                            break;
                        case 17:
                            eigVar.w(ijgVar3.G);
                            break;
                        case 18:
                            eigVar.G(ijgVar3.F);
                            break;
                        case 19:
                            eigVar.I(ijgVar3.B);
                            break;
                        case 20:
                            eigVar.x(ijgVar3.y);
                            break;
                        default:
                            eigVar.h(ijgVar3.A);
                            break;
                    }
                }
            });
        }
        if (ijgVar.p != ijgVar2.p) {
            ijcVar.d(21, new fjc() { // from class: cid
                public final void invoke(Object obj) {
                    byte b72 = b16;
                    ijg ijgVar3 = ijgVar2;
                    eig eigVar = (eig) obj;
                    switch (b72) {
                        case 0:
                            eigVar.b(ijgVar3.z);
                            break;
                        case 1:
                            eigVar.P(ijgVar3.x);
                            break;
                        case 2:
                            eigVar.M(ijgVar3.g);
                            break;
                        case 3:
                            eigVar.onRepeatModeChanged(ijgVar3.h);
                            break;
                        case 4:
                            eigVar.onShuffleModeEnabledChanged(ijgVar3.i);
                            break;
                        case 5:
                            eigVar.o(ijgVar3.m);
                            break;
                        case 6:
                            eigVar.A(ijgVar3.n);
                            break;
                        case 7:
                            eigVar.v(ijgVar3.q);
                            break;
                        case 8:
                            eigVar.g(ijgVar3.p);
                            break;
                        case 9:
                            eigVar.p(ijgVar3.r.a);
                            break;
                        case 10:
                            eigVar.E(ijgVar3.r);
                            break;
                        case 11:
                            eigVar.r(ijgVar3.s);
                            break;
                        case 12:
                            eigVar.l(ijgVar3.t, ijgVar3.u);
                            break;
                        case 13:
                            eigVar.a(ijgVar3.l);
                            break;
                        case 14:
                            eigVar.m(ijgVar3.C);
                            break;
                        case 15:
                            eigVar.J(ijgVar3.D);
                            break;
                        case 16:
                            eigVar.O(ijgVar3.E);
                            break;
                        case 17:
                            eigVar.w(ijgVar3.G);
                            break;
                        case 18:
                            eigVar.G(ijgVar3.F);
                            break;
                        case 19:
                            eigVar.I(ijgVar3.B);
                            break;
                        case 20:
                            eigVar.x(ijgVar3.y);
                            break;
                        default:
                            eigVar.h(ijgVar3.A);
                            break;
                    }
                }
            });
        }
        if (!ijgVar.r.a.equals(ijgVar2.r.a)) {
            ijcVar.d(27, new fjc() { // from class: cid
                public final void invoke(Object obj) {
                    byte b72 = b17;
                    ijg ijgVar3 = ijgVar2;
                    eig eigVar = (eig) obj;
                    switch (b72) {
                        case 0:
                            eigVar.b(ijgVar3.z);
                            break;
                        case 1:
                            eigVar.P(ijgVar3.x);
                            break;
                        case 2:
                            eigVar.M(ijgVar3.g);
                            break;
                        case 3:
                            eigVar.onRepeatModeChanged(ijgVar3.h);
                            break;
                        case 4:
                            eigVar.onShuffleModeEnabledChanged(ijgVar3.i);
                            break;
                        case 5:
                            eigVar.o(ijgVar3.m);
                            break;
                        case 6:
                            eigVar.A(ijgVar3.n);
                            break;
                        case 7:
                            eigVar.v(ijgVar3.q);
                            break;
                        case 8:
                            eigVar.g(ijgVar3.p);
                            break;
                        case 9:
                            eigVar.p(ijgVar3.r.a);
                            break;
                        case 10:
                            eigVar.E(ijgVar3.r);
                            break;
                        case 11:
                            eigVar.r(ijgVar3.s);
                            break;
                        case 12:
                            eigVar.l(ijgVar3.t, ijgVar3.u);
                            break;
                        case 13:
                            eigVar.a(ijgVar3.l);
                            break;
                        case 14:
                            eigVar.m(ijgVar3.C);
                            break;
                        case 15:
                            eigVar.J(ijgVar3.D);
                            break;
                        case 16:
                            eigVar.O(ijgVar3.E);
                            break;
                        case 17:
                            eigVar.w(ijgVar3.G);
                            break;
                        case 18:
                            eigVar.G(ijgVar3.F);
                            break;
                        case 19:
                            eigVar.I(ijgVar3.B);
                            break;
                        case 20:
                            eigVar.x(ijgVar3.y);
                            break;
                        default:
                            eigVar.h(ijgVar3.A);
                            break;
                    }
                }
            });
            ijcVar.d(27, new fjc() { // from class: cid
                public final void invoke(Object obj) {
                    byte b72 = b4;
                    ijg ijgVar3 = ijgVar2;
                    eig eigVar = (eig) obj;
                    switch (b72) {
                        case 0:
                            eigVar.b(ijgVar3.z);
                            break;
                        case 1:
                            eigVar.P(ijgVar3.x);
                            break;
                        case 2:
                            eigVar.M(ijgVar3.g);
                            break;
                        case 3:
                            eigVar.onRepeatModeChanged(ijgVar3.h);
                            break;
                        case 4:
                            eigVar.onShuffleModeEnabledChanged(ijgVar3.i);
                            break;
                        case 5:
                            eigVar.o(ijgVar3.m);
                            break;
                        case 6:
                            eigVar.A(ijgVar3.n);
                            break;
                        case 7:
                            eigVar.v(ijgVar3.q);
                            break;
                        case 8:
                            eigVar.g(ijgVar3.p);
                            break;
                        case 9:
                            eigVar.p(ijgVar3.r.a);
                            break;
                        case 10:
                            eigVar.E(ijgVar3.r);
                            break;
                        case 11:
                            eigVar.r(ijgVar3.s);
                            break;
                        case 12:
                            eigVar.l(ijgVar3.t, ijgVar3.u);
                            break;
                        case 13:
                            eigVar.a(ijgVar3.l);
                            break;
                        case 14:
                            eigVar.m(ijgVar3.C);
                            break;
                        case 15:
                            eigVar.J(ijgVar3.D);
                            break;
                        case 16:
                            eigVar.O(ijgVar3.E);
                            break;
                        case 17:
                            eigVar.w(ijgVar3.G);
                            break;
                        case 18:
                            eigVar.G(ijgVar3.F);
                            break;
                        case 19:
                            eigVar.I(ijgVar3.B);
                            break;
                        case 20:
                            eigVar.x(ijgVar3.y);
                            break;
                        default:
                            eigVar.h(ijgVar3.A);
                            break;
                    }
                }
            });
        }
        if (!ijgVar.s.equals(ijgVar2.s)) {
            ijcVar.d(29, new fjc() { // from class: cid
                public final void invoke(Object obj) {
                    byte b72 = b2;
                    ijg ijgVar3 = ijgVar2;
                    eig eigVar = (eig) obj;
                    switch (b72) {
                        case 0:
                            eigVar.b(ijgVar3.z);
                            break;
                        case 1:
                            eigVar.P(ijgVar3.x);
                            break;
                        case 2:
                            eigVar.M(ijgVar3.g);
                            break;
                        case 3:
                            eigVar.onRepeatModeChanged(ijgVar3.h);
                            break;
                        case 4:
                            eigVar.onShuffleModeEnabledChanged(ijgVar3.i);
                            break;
                        case 5:
                            eigVar.o(ijgVar3.m);
                            break;
                        case 6:
                            eigVar.A(ijgVar3.n);
                            break;
                        case 7:
                            eigVar.v(ijgVar3.q);
                            break;
                        case 8:
                            eigVar.g(ijgVar3.p);
                            break;
                        case 9:
                            eigVar.p(ijgVar3.r.a);
                            break;
                        case 10:
                            eigVar.E(ijgVar3.r);
                            break;
                        case 11:
                            eigVar.r(ijgVar3.s);
                            break;
                        case 12:
                            eigVar.l(ijgVar3.t, ijgVar3.u);
                            break;
                        case 13:
                            eigVar.a(ijgVar3.l);
                            break;
                        case 14:
                            eigVar.m(ijgVar3.C);
                            break;
                        case 15:
                            eigVar.J(ijgVar3.D);
                            break;
                        case 16:
                            eigVar.O(ijgVar3.E);
                            break;
                        case 17:
                            eigVar.w(ijgVar3.G);
                            break;
                        case 18:
                            eigVar.G(ijgVar3.F);
                            break;
                        case 19:
                            eigVar.I(ijgVar3.B);
                            break;
                        case 20:
                            eigVar.x(ijgVar3.y);
                            break;
                        default:
                            eigVar.h(ijgVar3.A);
                            break;
                    }
                }
            });
        }
        if (ijgVar.t != ijgVar2.t || ijgVar.u != ijgVar2.u) {
            ijcVar.d(30, new fjc() { // from class: cid
                public final void invoke(Object obj) {
                    byte b72 = b15;
                    ijg ijgVar3 = ijgVar2;
                    eig eigVar = (eig) obj;
                    switch (b72) {
                        case 0:
                            eigVar.b(ijgVar3.z);
                            break;
                        case 1:
                            eigVar.P(ijgVar3.x);
                            break;
                        case 2:
                            eigVar.M(ijgVar3.g);
                            break;
                        case 3:
                            eigVar.onRepeatModeChanged(ijgVar3.h);
                            break;
                        case 4:
                            eigVar.onShuffleModeEnabledChanged(ijgVar3.i);
                            break;
                        case 5:
                            eigVar.o(ijgVar3.m);
                            break;
                        case 6:
                            eigVar.A(ijgVar3.n);
                            break;
                        case 7:
                            eigVar.v(ijgVar3.q);
                            break;
                        case 8:
                            eigVar.g(ijgVar3.p);
                            break;
                        case 9:
                            eigVar.p(ijgVar3.r.a);
                            break;
                        case 10:
                            eigVar.E(ijgVar3.r);
                            break;
                        case 11:
                            eigVar.r(ijgVar3.s);
                            break;
                        case 12:
                            eigVar.l(ijgVar3.t, ijgVar3.u);
                            break;
                        case 13:
                            eigVar.a(ijgVar3.l);
                            break;
                        case 14:
                            eigVar.m(ijgVar3.C);
                            break;
                        case 15:
                            eigVar.J(ijgVar3.D);
                            break;
                        case 16:
                            eigVar.O(ijgVar3.E);
                            break;
                        case 17:
                            eigVar.w(ijgVar3.G);
                            break;
                        case 18:
                            eigVar.G(ijgVar3.F);
                            break;
                        case 19:
                            eigVar.I(ijgVar3.B);
                            break;
                        case 20:
                            eigVar.x(ijgVar3.y);
                            break;
                        default:
                            eigVar.h(ijgVar3.A);
                            break;
                    }
                }
            });
        }
        if (!ijgVar.l.equals(ijgVar2.l)) {
            final byte b19 = 13;
            ijcVar.d(25, new fjc() { // from class: cid
                public final void invoke(Object obj) {
                    byte b72 = b19;
                    ijg ijgVar3 = ijgVar2;
                    eig eigVar = (eig) obj;
                    switch (b72) {
                        case 0:
                            eigVar.b(ijgVar3.z);
                            break;
                        case 1:
                            eigVar.P(ijgVar3.x);
                            break;
                        case 2:
                            eigVar.M(ijgVar3.g);
                            break;
                        case 3:
                            eigVar.onRepeatModeChanged(ijgVar3.h);
                            break;
                        case 4:
                            eigVar.onShuffleModeEnabledChanged(ijgVar3.i);
                            break;
                        case 5:
                            eigVar.o(ijgVar3.m);
                            break;
                        case 6:
                            eigVar.A(ijgVar3.n);
                            break;
                        case 7:
                            eigVar.v(ijgVar3.q);
                            break;
                        case 8:
                            eigVar.g(ijgVar3.p);
                            break;
                        case 9:
                            eigVar.p(ijgVar3.r.a);
                            break;
                        case 10:
                            eigVar.E(ijgVar3.r);
                            break;
                        case 11:
                            eigVar.r(ijgVar3.s);
                            break;
                        case 12:
                            eigVar.l(ijgVar3.t, ijgVar3.u);
                            break;
                        case 13:
                            eigVar.a(ijgVar3.l);
                            break;
                        case 14:
                            eigVar.m(ijgVar3.C);
                            break;
                        case 15:
                            eigVar.J(ijgVar3.D);
                            break;
                        case 16:
                            eigVar.O(ijgVar3.E);
                            break;
                        case 17:
                            eigVar.w(ijgVar3.G);
                            break;
                        case 18:
                            eigVar.G(ijgVar3.F);
                            break;
                        case 19:
                            eigVar.I(ijgVar3.B);
                            break;
                        case 20:
                            eigVar.x(ijgVar3.y);
                            break;
                        default:
                            eigVar.h(ijgVar3.A);
                            break;
                    }
                }
            });
        }
        final byte b20 = 16;
        if (ijgVar.C != ijgVar2.C) {
            final byte b21 = 14;
            ijcVar.d(16, new fjc() { // from class: cid
                public final void invoke(Object obj) {
                    byte b72 = b21;
                    ijg ijgVar3 = ijgVar2;
                    eig eigVar = (eig) obj;
                    switch (b72) {
                        case 0:
                            eigVar.b(ijgVar3.z);
                            break;
                        case 1:
                            eigVar.P(ijgVar3.x);
                            break;
                        case 2:
                            eigVar.M(ijgVar3.g);
                            break;
                        case 3:
                            eigVar.onRepeatModeChanged(ijgVar3.h);
                            break;
                        case 4:
                            eigVar.onShuffleModeEnabledChanged(ijgVar3.i);
                            break;
                        case 5:
                            eigVar.o(ijgVar3.m);
                            break;
                        case 6:
                            eigVar.A(ijgVar3.n);
                            break;
                        case 7:
                            eigVar.v(ijgVar3.q);
                            break;
                        case 8:
                            eigVar.g(ijgVar3.p);
                            break;
                        case 9:
                            eigVar.p(ijgVar3.r.a);
                            break;
                        case 10:
                            eigVar.E(ijgVar3.r);
                            break;
                        case 11:
                            eigVar.r(ijgVar3.s);
                            break;
                        case 12:
                            eigVar.l(ijgVar3.t, ijgVar3.u);
                            break;
                        case 13:
                            eigVar.a(ijgVar3.l);
                            break;
                        case 14:
                            eigVar.m(ijgVar3.C);
                            break;
                        case 15:
                            eigVar.J(ijgVar3.D);
                            break;
                        case 16:
                            eigVar.O(ijgVar3.E);
                            break;
                        case 17:
                            eigVar.w(ijgVar3.G);
                            break;
                        case 18:
                            eigVar.G(ijgVar3.F);
                            break;
                        case 19:
                            eigVar.I(ijgVar3.B);
                            break;
                        case 20:
                            eigVar.x(ijgVar3.y);
                            break;
                        default:
                            eigVar.h(ijgVar3.A);
                            break;
                    }
                }
            });
        }
        final byte b22 = 17;
        if (ijgVar.D != ijgVar2.D) {
            ijcVar.d(17, new fjc() { // from class: cid
                public final void invoke(Object obj) {
                    byte b72 = b18;
                    ijg ijgVar3 = ijgVar2;
                    eig eigVar = (eig) obj;
                    switch (b72) {
                        case 0:
                            eigVar.b(ijgVar3.z);
                            break;
                        case 1:
                            eigVar.P(ijgVar3.x);
                            break;
                        case 2:
                            eigVar.M(ijgVar3.g);
                            break;
                        case 3:
                            eigVar.onRepeatModeChanged(ijgVar3.h);
                            break;
                        case 4:
                            eigVar.onShuffleModeEnabledChanged(ijgVar3.i);
                            break;
                        case 5:
                            eigVar.o(ijgVar3.m);
                            break;
                        case 6:
                            eigVar.A(ijgVar3.n);
                            break;
                        case 7:
                            eigVar.v(ijgVar3.q);
                            break;
                        case 8:
                            eigVar.g(ijgVar3.p);
                            break;
                        case 9:
                            eigVar.p(ijgVar3.r.a);
                            break;
                        case 10:
                            eigVar.E(ijgVar3.r);
                            break;
                        case 11:
                            eigVar.r(ijgVar3.s);
                            break;
                        case 12:
                            eigVar.l(ijgVar3.t, ijgVar3.u);
                            break;
                        case 13:
                            eigVar.a(ijgVar3.l);
                            break;
                        case 14:
                            eigVar.m(ijgVar3.C);
                            break;
                        case 15:
                            eigVar.J(ijgVar3.D);
                            break;
                        case 16:
                            eigVar.O(ijgVar3.E);
                            break;
                        case 17:
                            eigVar.w(ijgVar3.G);
                            break;
                        case 18:
                            eigVar.G(ijgVar3.F);
                            break;
                        case 19:
                            eigVar.I(ijgVar3.B);
                            break;
                        case 20:
                            eigVar.x(ijgVar3.y);
                            break;
                        default:
                            eigVar.h(ijgVar3.A);
                            break;
                    }
                }
            });
        }
        if (ijgVar.E != ijgVar2.E) {
            ijcVar.d(18, new fjc() { // from class: cid
                public final void invoke(Object obj) {
                    byte b72 = b20;
                    ijg ijgVar3 = ijgVar2;
                    eig eigVar = (eig) obj;
                    switch (b72) {
                        case 0:
                            eigVar.b(ijgVar3.z);
                            break;
                        case 1:
                            eigVar.P(ijgVar3.x);
                            break;
                        case 2:
                            eigVar.M(ijgVar3.g);
                            break;
                        case 3:
                            eigVar.onRepeatModeChanged(ijgVar3.h);
                            break;
                        case 4:
                            eigVar.onShuffleModeEnabledChanged(ijgVar3.i);
                            break;
                        case 5:
                            eigVar.o(ijgVar3.m);
                            break;
                        case 6:
                            eigVar.A(ijgVar3.n);
                            break;
                        case 7:
                            eigVar.v(ijgVar3.q);
                            break;
                        case 8:
                            eigVar.g(ijgVar3.p);
                            break;
                        case 9:
                            eigVar.p(ijgVar3.r.a);
                            break;
                        case 10:
                            eigVar.E(ijgVar3.r);
                            break;
                        case 11:
                            eigVar.r(ijgVar3.s);
                            break;
                        case 12:
                            eigVar.l(ijgVar3.t, ijgVar3.u);
                            break;
                        case 13:
                            eigVar.a(ijgVar3.l);
                            break;
                        case 14:
                            eigVar.m(ijgVar3.C);
                            break;
                        case 15:
                            eigVar.J(ijgVar3.D);
                            break;
                        case 16:
                            eigVar.O(ijgVar3.E);
                            break;
                        case 17:
                            eigVar.w(ijgVar3.G);
                            break;
                        case 18:
                            eigVar.G(ijgVar3.F);
                            break;
                        case 19:
                            eigVar.I(ijgVar3.B);
                            break;
                        case 20:
                            eigVar.x(ijgVar3.y);
                            break;
                        default:
                            eigVar.h(ijgVar3.A);
                            break;
                    }
                }
            });
        }
        if (!ijgVar.G.equals(ijgVar2.G)) {
            ijcVar.d(19, new fjc() { // from class: cid
                public final void invoke(Object obj) {
                    byte b72 = b22;
                    ijg ijgVar3 = ijgVar2;
                    eig eigVar = (eig) obj;
                    switch (b72) {
                        case 0:
                            eigVar.b(ijgVar3.z);
                            break;
                        case 1:
                            eigVar.P(ijgVar3.x);
                            break;
                        case 2:
                            eigVar.M(ijgVar3.g);
                            break;
                        case 3:
                            eigVar.onRepeatModeChanged(ijgVar3.h);
                            break;
                        case 4:
                            eigVar.onShuffleModeEnabledChanged(ijgVar3.i);
                            break;
                        case 5:
                            eigVar.o(ijgVar3.m);
                            break;
                        case 6:
                            eigVar.A(ijgVar3.n);
                            break;
                        case 7:
                            eigVar.v(ijgVar3.q);
                            break;
                        case 8:
                            eigVar.g(ijgVar3.p);
                            break;
                        case 9:
                            eigVar.p(ijgVar3.r.a);
                            break;
                        case 10:
                            eigVar.E(ijgVar3.r);
                            break;
                        case 11:
                            eigVar.r(ijgVar3.s);
                            break;
                        case 12:
                            eigVar.l(ijgVar3.t, ijgVar3.u);
                            break;
                        case 13:
                            eigVar.a(ijgVar3.l);
                            break;
                        case 14:
                            eigVar.m(ijgVar3.C);
                            break;
                        case 15:
                            eigVar.J(ijgVar3.D);
                            break;
                        case 16:
                            eigVar.O(ijgVar3.E);
                            break;
                        case 17:
                            eigVar.w(ijgVar3.G);
                            break;
                        case 18:
                            eigVar.G(ijgVar3.F);
                            break;
                        case 19:
                            eigVar.I(ijgVar3.B);
                            break;
                        case 20:
                            eigVar.x(ijgVar3.y);
                            break;
                        default:
                            eigVar.h(ijgVar3.A);
                            break;
                    }
                }
            });
        }
        ijcVar.c();
    }
}
