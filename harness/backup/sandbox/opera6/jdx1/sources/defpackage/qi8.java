package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class qi8 extends g83 implements ExoPlayer {
    public final ev4 A;
    public final ev4 B;
    public final short C;
    public final pr D;
    public final tah E;
    public final pi8 F;
    public final z8b G;
    public final z8b H;
    public int I;
    public boolean J;
    public int K;
    public byte L;
    public boolean M;
    public boolean N;
    public u1b O;
    public final upi P;
    public jij Q;
    public cig R;
    public vjd S;
    public vjd T;
    public Object U;
    public Surface V;
    public SurfaceHolder W;
    public g0k X;
    public boolean Y;
    public TextureView Z;
    public final boolean a0;
    public zoj b0;
    public final pyl c;
    public pf2 c0;
    public final cig d;
    public float d0;
    public final rj5 e;
    public float e0;
    public final Context f;
    public boolean f0;
    public final qi8 g;
    public y36 g0;
    public final q83[] h;
    public final boolean h0;
    public final q83[] i;
    public boolean i0;
    public final jx6 j;
    public final int j0;
    public final szk k;
    public boolean k0;
    public final fi8 l;
    public final u67 l0;
    public final zi8 m;
    public r4n m0;
    public final ijc n;
    public final short n0;
    public final CopyOnWriteArraySet o;
    public final short o0;
    public final dql p;
    public final short p0;
    public final ArrayList q;
    public vjd q0;
    public final boolean r;
    public shg r0;
    public final ird s;
    public int s0;
    public final el6 t;
    public long t0;
    public final Looper u;
    public final pl6 v;
    public final kzk w;
    public final mi8 x;
    public final ni8 y;
    public final tn z;

    static {
        rjd.a("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12, types: [int, short] */
    /* JADX WARN: Type inference failed for: r10v14, types: [int, short] */
    public qi8(ai8 ai8Var) {
        Integer num;
        Handler.Callback callback;
        short s = ai8Var.n;
        Context context = ai8Var.a;
        Looper looper = ai8Var.f;
        Integer num2 = 0;
        this.e = new rj5(0);
        try {
            w7d.G("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.9.0] [" + tym.a + "]");
            kzk kzkVar = kzk.a;
            this.f = context.getApplicationContext();
            this.t = new el6(kzkVar);
            this.j0 = -1000;
            this.c0 = ai8Var.g;
            this.a0 = true;
            this.f0 = false;
            this.C = (short) 2000;
            mi8 mi8Var = new mi8(this);
            this.x = mi8Var;
            this.y = new ni8();
            q83[] q83VarArrN = ((i16) ai8Var.b.get()).n(new Handler(looper), mi8Var, mi8Var, mi8Var, mi8Var);
            this.h = q83VarArrN;
            z4o.H(q83VarArrN.length > 0);
            this.i = new q83[q83VarArrN.length];
            int i = 0;
            while (true) {
                q83[] q83VarArr = this.i;
                if (i >= q83VarArr.length) {
                    break;
                }
                byte b = this.h[i].b;
                q83VarArr[i] = null;
                i++;
            }
            jx6 jx6Var = (jx6) ai8Var.d.get();
            this.j = jx6Var;
            this.s = (ird) ai8Var.c.get();
            pl6 pl6Var = (pl6) ai8Var.e.get();
            this.v = pl6Var;
            this.r = true;
            uwi uwiVar = ai8Var.i;
            this.n0 = ai8Var.k;
            this.o0 = ai8Var.l;
            this.p0 = (short) 3000;
            this.P = ai8Var.j;
            this.u = looper;
            this.w = kzkVar;
            this.g = this;
            this.n = new ijc(looper, (gjc) new yt7(this));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.o = copyOnWriteArraySet;
            this.q = new ArrayList();
            this.Q = new hij(0);
            q83[] q83VarArr2 = this.h;
            boolean z = true;
            pyl pylVar = new pyl(new luh[q83VarArr2.length], new bj8[q83VarArr2.length], fzl.b, (pr) null);
            this.c = pylVar;
            this.p = new dql();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                num = num2;
                if (i2 >= length) {
                    break;
                }
                int i3 = iArr[i2];
                z4o.H(!false);
                sparseBooleanArray.append(i3, z);
                i2++;
                num2 = num;
                iArr = iArr;
                z = true;
            }
            jx6Var.getClass();
            z4o.H(!false);
            sparseBooleanArray.append(29, true);
            z4o.H(!false);
            w69 w69Var = new w69(sparseBooleanArray);
            this.d = new cig(w69Var);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i4 = 0; i4 < w69Var.a.size(); i4++) {
                int iB = w69Var.b(i4);
                z4o.H(!false);
                sparseBooleanArray2.append(iB, true);
            }
            z4o.H(!false);
            sparseBooleanArray2.append(4, true);
            z4o.H(!false);
            sparseBooleanArray2.append(10, true);
            z4o.H(!false);
            this.R = new cig(new w69(sparseBooleanArray2));
            this.k = kzkVar.a(looper, null);
            fi8 fi8Var = new fi8(this, (byte) 0);
            this.l = fi8Var;
            this.r0 = shg.k(pylVar);
            this.t.W(this, looper);
            fjg fjgVar = new fjg("");
            zi8 zi8Var = new zi8(this.f, this.h, this.i, jx6Var, pylVar, new xs6(), pl6Var, this.I, this.J, this.t, uwiVar, ai8Var.m, looper, fi8Var, fjgVar, this.y);
            szk szkVar = zi8Var.h;
            Looper looper2 = zi8Var.j;
            this.m = zi8Var;
            this.d0 = 1.0f;
            this.I = 0;
            vjd vjdVar = vjd.K;
            this.S = vjdVar;
            this.T = vjdVar;
            this.q0 = vjdVar;
            this.s0 = -1;
            this.g0 = y36.d;
            this.h0 = true;
            S(this.t);
            Handler handler = new Handler(looper);
            el6 el6Var = this.t;
            el6Var.getClass();
            zy9 zy9Var = pl6Var.c;
            zy9Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) zy9Var.a;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                m13 m13Var = (m13) it.next();
                if (m13Var.b == el6Var) {
                    m13Var.c = true;
                    copyOnWriteArrayList.remove(m13Var);
                }
            }
            copyOnWriteArrayList.add(new m13(handler, el6Var));
            copyOnWriteArraySet.add(this.x);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 31) {
                callback = null;
                kzkVar.a(looper2, null).c(new gl6(this.f, this, fjgVar, (byte) 21));
            } else {
                callback = null;
            }
            fi8 fi8Var2 = new fi8(this, (byte) 1);
            pr prVar = new pr();
            prVar.b = new szk(new Handler(looper2, callback));
            prVar.c = new szk(new Handler(looper, callback));
            prVar.e = num;
            prVar.f = num;
            prVar.d = fi8Var2;
            this.D = prVar;
            prVar.A(new bn7(this, (byte) 14));
            tn tnVar = new tn(context, looper2, looper, this.x);
            this.z = tnVar;
            tnVar.H();
            boolean z2 = s != 2147483647;
            ev4 ev4Var = new ev4(context, looper2, (byte) 6);
            this.A = ev4Var;
            ev4Var.l(z2);
            ev4 ev4Var2 = new ev4(context, looper2, (byte) 7);
            this.B = ev4Var2;
            ev4Var2.l(false);
            this.l0 = u67.e;
            this.m0 = r4n.d;
            this.b0 = zoj.c;
            this.F = i5 >= 34 ? new pi8(this, context) : callback;
            this.G = new z8b((byte) 16);
            this.H = new z8b((byte) 16);
            this.E = new tah(this, this.x, this.w, s);
            szkVar.a(38, this.P).b();
            pf2 pf2Var = this.c0;
            boolean z3 = ai8Var.h;
            szkVar.getClass();
            rzk rzkVarB = szk.b();
            rzkVarB.a = szkVar.a.obtainMessage(31, z3 ? 1 : 0, 0, pf2Var);
            rzkVarB.b();
            O0(1, 3, this.c0);
            O0(2, 4, Integer.valueOf(this.a0 ? 1 : 0));
            O0(2, 5, num);
            O0(1, 9, Boolean.valueOf(this.f0));
            O0(6, 8, this.y);
            O0(-1, 16, Integer.valueOf(this.j0));
        } finally {
            this.e.c();
        }
    }

    public static long H0(shg shgVar) {
        fql fqlVar = new fql();
        dql dqlVar = new dql();
        shgVar.a.g(shgVar.b.a, dqlVar);
        long j = shgVar.c;
        return j == -9223372036854775807L ? shgVar.a.m(dqlVar.c, fqlVar, 0L).k : dqlVar.e + j;
    }

    public static shg I0(shg shgVar, int i) {
        shg shgVarH = shgVar.h(i);
        return (i == 1 || i == 4) ? shgVarH.b(false) : shgVarH;
    }

    @Override // defpackage.gig
    public final void A(pf2 pf2Var, boolean z) {
        Y0();
        if (this.k0) {
            return;
        }
        boolean zEquals = Objects.equals(this.c0, pf2Var);
        ijc ijcVar = this.n;
        if (!zEquals) {
            this.c0 = pf2Var;
            O0(1, 3, pf2Var);
            ijcVar.d(20, new hi8(pf2Var, (byte) 0));
        }
        pf2 pf2Var2 = this.c0;
        szk szkVar = this.m.h;
        szkVar.getClass();
        rzk rzkVarB = szk.b();
        rzkVarB.a = szkVar.a.obtainMessage(31, z ? 1 : 0, 0, pf2Var2);
        rzkVarB.b();
        ijcVar.c();
    }

    public final void A0() {
        Y0();
        N0();
        R0(null);
        L0(0, 0);
    }

    @Override // defpackage.gig
    public final void B(vjd vjdVar) {
        Y0();
        vjdVar.getClass();
        if (vjdVar.equals(this.T)) {
            return;
        }
        this.T = vjdVar;
        this.n.i(15, new fi8(this, (byte) 3));
    }

    public final ArrayList B0(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.s.a((qjd) list.get(i)));
        }
        return arrayList;
    }

    public final ckg C0(bkg bkgVar) {
        int iF0 = F0(this.r0);
        gql gqlVar = this.r0.a;
        if (iF0 == -1) {
            iF0 = 0;
        }
        zi8 zi8Var = this.m;
        return new ckg(zi8Var, bkgVar, gqlVar, iF0, zi8Var.j);
    }

    @Override // defpackage.gig
    public final void D(boolean z) {
        Y0();
    }

    public final long D0(shg shgVar) {
        jrd jrdVar = shgVar.b;
        long j = shgVar.c;
        gql gqlVar = shgVar.a;
        if (!jrdVar.b()) {
            return tym.c0(E0(shgVar));
        }
        Object obj = shgVar.b.a;
        dql dqlVar = this.p;
        gqlVar.g(obj, dqlVar);
        if (j == -9223372036854775807L) {
            return tym.c0(gqlVar.m(F0(shgVar), this.b, 0L).k);
        }
        return tym.c0(j) + tym.c0(dqlVar.e);
    }

    public final long E0(shg shgVar) {
        if (shgVar.a.p()) {
            return tym.N(this.t0);
        }
        long jL = shgVar.p ? shgVar.l() : shgVar.s;
        if (shgVar.b.b()) {
            return jL;
        }
        gql gqlVar = shgVar.a;
        Object obj = shgVar.b.a;
        dql dqlVar = this.p;
        gqlVar.g(obj, dqlVar);
        return jL + dqlVar.e;
    }

    public final int F0(shg shgVar) {
        return shgVar.a.p() ? this.s0 : shgVar.a.g(shgVar.b.a, this.p).c;
    }

    @Override // defpackage.gig
    public final int G() {
        Y0();
        return this.r0.n;
    }

    public final Pair G0(gql gqlVar, blg blgVar, int i, long j) {
        long j2 = -9223372036854775807L;
        int i2 = -1;
        if (gqlVar.p() || blgVar.p()) {
            if (gqlVar.p() || !blgVar.p()) {
                i2 = i;
                j2 = j;
            }
            return K0(blgVar, i2, j2);
        }
        dql dqlVar = this.p;
        long jN = tym.N(j);
        fql fqlVar = this.b;
        Pair pairI = gqlVar.i(fqlVar, dqlVar, i, jN);
        Object obj = pairI.first;
        if (blgVar.b(obj) != -1) {
            return pairI;
        }
        int iR = zi8.R(fqlVar, this.p, this.I, this.J, obj, gqlVar, blgVar);
        if (iR == -1) {
            return K0(blgVar, -1, -9223372036854775807L);
        }
        blgVar.m(iR, fqlVar, 0L);
        return K0(blgVar, iR, tym.c0(fqlVar.k));
    }

    @Override // defpackage.gig
    public final Looper I() {
        return this.u;
    }

    @Override // defpackage.gig
    public final void J() {
        Y0();
        if (this.d0 != 0.0f) {
            setVolume(0.0f);
        }
    }

    public final shg J0(shg shgVar, gql gqlVar, Pair pair) {
        fyl fylVar;
        pyl pylVar;
        csh cshVar;
        z4o.w(gqlVar.p() || pair != null);
        gql gqlVar2 = shgVar.a;
        long jD0 = D0(shgVar);
        shg shgVarJ = shgVar.j(gqlVar);
        if (gqlVar.p()) {
            jrd jrdVar = shg.u;
            long jN = tym.N(this.t0);
            fyl fylVar2 = fyl.d;
            pyl pylVar2 = this.c;
            a1b a1bVar = h1b.b;
            shg shgVarC = shgVarJ.d(jrdVar, jN, jN, jN, 0L, fylVar2, pylVar2, csh.e).c(jrdVar);
            shgVarC.q = shgVarC.s;
            return shgVarC;
        }
        Object obj = shgVarJ.b.a;
        String str = tym.a;
        boolean zEquals = obj.equals(pair.first);
        jrd jrdVar2 = !zEquals ? new jrd(pair.first) : shgVarJ.b;
        long jLongValue = ((Long) pair.second).longValue();
        long jN2 = tym.N(jD0);
        if (!gqlVar2.p()) {
            jN2 -= gqlVar2.g(obj, this.p).e;
            if (zEquals && jN2 - jLongValue == 1 && jN2 == gqlVar2.g(obj, this.p).d) {
                jN2--;
            }
        }
        if (!zEquals || jLongValue < jN2) {
            jrd jrdVar3 = jrdVar2;
            z4o.H(!jrdVar3.b());
            if (zEquals) {
                fylVar = shgVarJ.h;
                pylVar = shgVarJ.i;
                cshVar = shgVarJ.j;
            } else {
                fylVar = fyl.d;
                pylVar = this.c;
                a1b a1bVar2 = h1b.b;
                cshVar = csh.e;
            }
            shg shgVarC2 = shgVarJ.d(jrdVar3, jLongValue, jLongValue, jLongValue, 0L, fylVar, pylVar, cshVar).c(jrdVar3);
            shgVarC2.q = jLongValue;
            return shgVarC2;
        }
        if (jLongValue != jN2) {
            jrd jrdVar4 = jrdVar2;
            z4o.H(!jrdVar4.b());
            long jMax = Math.max(0L, shgVarJ.r - (jLongValue - jN2));
            long j = shgVarJ.q;
            if (shgVarJ.k.equals(shgVarJ.b)) {
                j = jLongValue + jMax;
            }
            shg shgVarD = shgVarJ.d(jrdVar4, jLongValue, jLongValue, jLongValue, jMax, shgVarJ.h, shgVarJ.i, shgVarJ.j);
            shgVarD.q = j;
            return shgVarD;
        }
        int iB = gqlVar.b(shgVarJ.k.a);
        if (iB != -1 && gqlVar.f(iB, this.p, false).c == gqlVar.g(jrdVar2.a, this.p).c) {
            return shgVarJ;
        }
        gqlVar.g(jrdVar2.a, this.p);
        boolean zB = jrdVar2.b();
        dql dqlVar = this.p;
        long jA = zB ? dqlVar.a(jrdVar2.b, jrdVar2.c) : dqlVar.d;
        jrd jrdVar5 = jrdVar2;
        shg shgVarC3 = shgVarJ.d(jrdVar5, shgVarJ.s, shgVarJ.s, shgVarJ.d, jA - shgVarJ.s, shgVarJ.h, shgVarJ.i, shgVarJ.j).c(jrdVar5);
        shgVarC3.q = jA;
        return shgVarC3;
    }

    @Override // defpackage.gig
    public final void K() {
        Y0();
    }

    public final Pair K0(gql gqlVar, int i, long j) {
        if (gqlVar.p()) {
            this.s0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.t0 = j;
            return null;
        }
        fql fqlVar = this.b;
        if (i == -1 || i >= gqlVar.o()) {
            i = gqlVar.a(this.J);
            j = tym.c0(gqlVar.m(i, fqlVar, 0L).k);
        }
        return gqlVar.i(fqlVar, this.p, i, tym.N(j));
    }

    @Override // defpackage.gig
    public final nyl L() {
        Y0();
        bx6 bx6VarD = this.j.d();
        if (!this.N) {
            return bx6VarD;
        }
        bx6VarD.getClass();
        ax6 ax6Var = new ax6(bx6VarD);
        ax6Var.m(this.O);
        return new bx6(ax6Var);
    }

    public final void L0(int i, int i2) {
        zoj zojVar = this.b0;
        if (i == zojVar.a && i2 == zojVar.b) {
            return;
        }
        this.b0 = new zoj(i, i2);
        this.n.i(24, new gi8(i, i2, (byte) 0));
        O0(2, 14, new zoj(i, i2));
    }

    public final shg M0(shg shgVar, int i, int i2) {
        int iF0 = F0(shgVar);
        long jD0 = D0(shgVar);
        gql gqlVar = shgVar.a;
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        this.K++;
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            arrayList.remove(i3);
        }
        this.Q = this.Q.a(i, i2);
        blg blgVar = new blg(arrayList, this.Q);
        shg shgVarJ0 = J0(shgVar, blgVar, G0(gqlVar, blgVar, iF0, jD0));
        int i4 = shgVarJ0.e;
        if (i4 != 1 && i4 != 4 && i < i2 && i2 == size && iF0 >= shgVarJ0.a.o()) {
            shgVarJ0 = I0(shgVarJ0, 4);
        }
        jij jijVar = this.Q;
        szk szkVar = this.m.h;
        szkVar.getClass();
        rzk rzkVarB = szk.b();
        rzkVarB.a = szkVar.a.obtainMessage(20, i, i2, jijVar);
        rzkVarB.b();
        return shgVarJ0;
    }

    @Override // defpackage.gig
    public final int N() {
        Y0();
        return 0;
    }

    public final void N0() {
        g0k g0kVar = this.X;
        mi8 mi8Var = this.x;
        if (g0kVar != null) {
            ckg ckgVarC0 = C0(this.y);
            z4o.H(!ckgVarC0.f);
            ckgVarC0.c = (short) 10000;
            z4o.H(!ckgVarC0.f);
            ckgVarC0.d = null;
            ckgVarC0.b();
            this.X.a.remove(mi8Var);
            this.X = null;
        }
        TextureView textureView = this.Z;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != mi8Var) {
                w7d.K("SurfaceTextureListener already unset or replaced.");
            } else {
                this.Z.setSurfaceTextureListener(null);
            }
            this.Z = null;
        }
        SurfaceHolder surfaceHolder = this.W;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(mi8Var);
            this.W = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O0(int i, int i2, Object obj) {
        for (q83 q83Var : this.h) {
            if (i == -1 || q83Var.b == i) {
                ckg ckgVarC0 = C0(q83Var);
                z4o.H(!ckgVarC0.f);
                ckgVarC0.c = i2;
                z4o.H(!ckgVarC0.f);
                ckgVarC0.d = obj;
                ckgVarC0.b();
            }
        }
        for (q83 q83Var2 : this.i) {
            if (q83Var2 != null && (i == -1 || q83Var2.b == i)) {
                ckg ckgVarC02 = C0(q83Var2);
                z4o.H(!ckgVarC02.f);
                ckgVarC02.c = i2;
                z4o.H(!ckgVarC02.f);
                ckgVarC02.d = obj;
                ckgVarC02.b();
            }
        }
    }

    @Override // defpackage.gig
    public final cig P() {
        Y0();
        return this.R;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: d45 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P0(java.util.List r15, boolean r16, long r17, int r19) throws d45 {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qi8.P0(java.util.List, boolean, long, int):void");
    }

    public final void Q0(SurfaceHolder surfaceHolder) {
        this.Y = false;
        this.W = surfaceHolder;
        surfaceHolder.addCallback(this.x);
        Surface surface = this.W.getSurface();
        if (surface == null || !surface.isValid()) {
            L0(0, 0);
        } else {
            Rect surfaceFrame = this.W.getSurfaceFrame();
            L0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // defpackage.gig
    public final long R() {
        Y0();
        return this.p0;
    }

    public final void R0(Object obj) {
        Object obj2 = this.U;
        boolean zB = true;
        boolean z = (obj2 == null || obj2 == obj) ? false : true;
        long j = z ? this.C : -9223372036854775807L;
        zi8 zi8Var = this.m;
        if (!zi8Var.G && zi8Var.j.getThread().isAlive()) {
            rj5 rj5Var = new rj5(0);
            zi8Var.h.a(30, new Pair(obj, rj5Var)).b();
            if (j != -9223372036854775807L) {
                zB = rj5Var.b(j);
            }
        }
        if (z) {
            Object obj3 = this.U;
            Surface surface = this.V;
            if (obj3 == surface) {
                surface.release();
                this.V = null;
            }
        }
        this.U = obj;
        if (zB) {
            return;
        }
        T0(zh8.h(1003, new e22("Detaching surface timed out.")));
    }

    @Override // defpackage.gig
    public final void S(eig eigVar) {
        eigVar.getClass();
        this.n.a(eigVar);
    }

    public final void S0(int i) {
        Y0();
        ev4 ev4Var = this.B;
        ev4 ev4Var2 = this.A;
        if (i == 0) {
            ev4Var2.l(false);
            ev4Var.l(false);
        } else if (i == 1) {
            ev4Var2.l(true);
            ev4Var.l(false);
        } else {
            if (i != 2) {
                return;
            }
            ev4Var2.l(true);
            ev4Var.l(true);
        }
    }

    public final void T0(zh8 zh8Var) {
        shg shgVar = this.r0;
        shg shgVarC = shgVar.c(shgVar.b);
        shgVarC.q = shgVarC.s;
        shgVarC.r = 0L;
        shg shgVarI0 = I0(shgVarC, 1);
        if (zh8Var != null) {
            shgVarI0 = shgVarI0.f(zh8Var);
        }
        shg shgVar2 = shgVarI0;
        this.K++;
        szk szkVar = this.m.h;
        szkVar.getClass();
        rzk rzkVarB = szk.b();
        rzkVarB.a = szkVar.a.obtainMessage(6);
        rzkVarB.b();
        W0(shgVar2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.gig
    public final r4n U() {
        Y0();
        return this.m0;
    }

    public final void U0() {
        cig cigVar = this.R;
        String str = tym.a;
        qi8 qi8Var = this.g;
        boolean zIsPlayingAd = qi8Var.isPlayingAd();
        boolean zC0 = qi8Var.c0();
        boolean Z = qi8Var.Z();
        boolean zY = qi8Var.y();
        boolean zT0 = qi8Var.t0();
        boolean zF = qi8Var.F();
        boolean zP = qi8Var.getCurrentTimeline().p();
        nrl nrlVar = new nrl((byte) 11);
        nrlVar.c(this.d.a);
        if (!zIsPlayingAd) {
            nrlVar.a(4);
        }
        boolean z = false;
        if (zC0 && !zIsPlayingAd) {
            nrlVar.a(5);
        }
        if (Z && !zIsPlayingAd) {
            nrlVar.a(6);
        }
        if (!zP && (Z || !zT0 || zC0) && !zIsPlayingAd) {
            nrlVar.a(7);
        }
        if (zY && !zIsPlayingAd) {
            nrlVar.a(8);
        }
        if (!zP && (zY || (zT0 && zF)) && !zIsPlayingAd) {
            nrlVar.a(9);
        }
        if (!zIsPlayingAd) {
            nrlVar.a(10);
        }
        if (zC0 && !zIsPlayingAd) {
            nrlVar.a(11);
        }
        if (zC0 && !zIsPlayingAd) {
            z = true;
        }
        if (z) {
            nrlVar.a(12);
        }
        cig cigVar2 = new cig(nrlVar.j());
        this.R = cigVar2;
        if (cigVar2.equals(cigVar)) {
            return;
        }
        this.n.d(13, new fi8(this, (byte) 2));
    }

    @Override // defpackage.gig
    public final float V() {
        Y0();
        return this.d0;
    }

    public final void V0(int i, boolean z) {
        int i2 = this.N ? 4 : (this.r0.n != 1 || z) ? 0 : 1;
        shg shgVarA = this.r0;
        if (shgVarA.l == z && shgVarA.n == i2 && shgVarA.m == i) {
            return;
        }
        this.K++;
        if (shgVarA.p) {
            shgVarA = shgVarA.a();
        }
        shg shgVarE = shgVarA.e(i, i2, z);
        int i3 = (i2 << 4) | i;
        szk szkVar = this.m.h;
        szkVar.getClass();
        rzk rzkVarB = szk.b();
        rzkVarB.a = szkVar.a.obtainMessage(1, z ? 1 : 0, i3);
        rzkVarB.b();
        W0(shgVarE, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.gig
    public final pf2 W() {
        Y0();
        return this.c0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W0(final defpackage.shg r35, int r36, boolean r37, final int r38, long r39, int r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qi8.W0(shg, int, boolean, int, long, int, boolean):void");
    }

    @Override // defpackage.gig
    public final u67 X() {
        Y0();
        return this.l0;
    }

    public final void X0() {
        int playbackState = getPlaybackState();
        ev4 ev4Var = this.B;
        ev4 ev4Var2 = this.A;
        boolean z = false;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                Y0();
                boolean z2 = this.r0.p;
                if (getPlayWhenReady() && !z2) {
                    z = true;
                }
                ev4Var2.m(z);
                ev4Var.m(getPlayWhenReady());
                return;
            }
            if (playbackState != 4) {
                h9o.e();
                return;
            }
        }
        ev4Var2.m(false);
        ev4Var.m(false);
    }

    @Override // defpackage.gig
    public final void Y(int i, int i2) {
        Y0();
    }

    public final void Y0() {
        this.e.a();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.u;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = tym.a;
            Locale locale = Locale.US;
            String strL = sko.l("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.h0) {
                qp2.n(strL);
            } else {
                w7d.L(strL, this.i0 ? null : new IllegalStateException());
                this.i0 = true;
            }
        }
    }

    @Override // defpackage.gig
    public final void a() {
        Y0();
        shg shgVar = this.r0;
        if (shgVar.e != 1) {
            return;
        }
        shg shgVarF = shgVar.f(null);
        shg shgVarI0 = I0(shgVarF, shgVarF.a.p() ? 4 : 2);
        this.K++;
        szk szkVar = this.m.h;
        szkVar.getClass();
        rzk rzkVarB = szk.b();
        rzkVarB.a = szkVar.a.obtainMessage(29);
        rzkVarB.b();
        W0(shgVarI0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.gig
    public final long a0() {
        Y0();
        return this.o0;
    }

    @Override // defpackage.gig
    public final void b0(int i, List list) throws d45 {
        Y0();
        ArrayList arrayListB0 = B0(list);
        Y0();
        z4o.w(i >= 0);
        int iMin = Math.min(i, this.q.size());
        if (!this.r0.a.p()) {
            W0(y0(this.r0, iMin, arrayListB0), 0, false, 5, -9223372036854775807L, -1, false);
            return;
        }
        boolean z = this.s0 == -1;
        Y0();
        P0(arrayListB0, z, -9223372036854775807L, -1);
    }

    @Override // defpackage.gig
    public final void c(thg thgVar) {
        Y0();
        if (thgVar == null) {
            thgVar = thg.d;
        }
        if (this.r0.o.equals(thgVar)) {
            return;
        }
        shg shgVarG = this.r0.g(thgVar);
        this.K++;
        this.m.h.a(4, thgVar).b();
        W0(shgVarG, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.gig
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
        Y0();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        Y0();
        if (holder == null || holder != this.W) {
            return;
        }
        A0();
    }

    @Override // defpackage.gig
    public final void clearVideoTextureView(TextureView textureView) {
        Y0();
        if (textureView == null || textureView != this.Z) {
            return;
        }
        A0();
    }

    @Override // defpackage.gig
    public final long d() {
        Y0();
        return tym.c0(this.r0.r);
    }

    @Override // defpackage.gig
    public final vjd d0() {
        Y0();
        return this.T;
    }

    @Override // defpackage.gig
    public final int f0() {
        Y0();
        int iF0 = F0(this.r0);
        if (iF0 == -1) {
            return 0;
        }
        return iF0;
    }

    @Override // defpackage.gig
    public final void g0(eig eigVar) {
        Y0();
        eigVar.getClass();
        this.n.f(eigVar);
    }

    @Override // defpackage.gig
    public final long getBufferedPosition() {
        Y0();
        if (!isPlayingAd()) {
            return m0();
        }
        shg shgVar = this.r0;
        return shgVar.k.equals(shgVar.b) ? tym.c0(this.r0.q) : getDuration();
    }

    @Override // defpackage.gig
    public final long getContentPosition() {
        Y0();
        return D0(this.r0);
    }

    @Override // defpackage.gig
    public final int getCurrentAdGroupIndex() {
        Y0();
        if (isPlayingAd()) {
            return this.r0.b.b;
        }
        return -1;
    }

    @Override // defpackage.gig
    public final int getCurrentAdIndexInAdGroup() {
        Y0();
        if (isPlayingAd()) {
            return this.r0.b.c;
        }
        return -1;
    }

    @Override // defpackage.gig
    public final int getCurrentPeriodIndex() {
        Y0();
        if (!this.r0.a.p()) {
            shg shgVar = this.r0;
            return shgVar.a.b(shgVar.b.a);
        }
        int i = this.s0;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // defpackage.gig
    public final long getCurrentPosition() {
        Y0();
        return tym.c0(E0(this.r0));
    }

    @Override // defpackage.gig
    public final gql getCurrentTimeline() {
        Y0();
        return this.r0.a;
    }

    @Override // defpackage.gig
    public final long getDuration() {
        Y0();
        if (!isPlayingAd()) {
            return T();
        }
        shg shgVar = this.r0;
        jrd jrdVar = shgVar.b;
        gql gqlVar = shgVar.a;
        Object obj = jrdVar.a;
        dql dqlVar = this.p;
        gqlVar.g(obj, dqlVar);
        return tym.c0(dqlVar.a(jrdVar.b, jrdVar.c));
    }

    @Override // defpackage.gig
    public final boolean getPlayWhenReady() {
        Y0();
        return this.r0.l;
    }

    @Override // defpackage.gig
    public final thg getPlaybackParameters() {
        Y0();
        return this.r0.o;
    }

    @Override // defpackage.gig
    public final int getPlaybackState() {
        Y0();
        return this.r0.e;
    }

    @Override // defpackage.gig
    public final int getRepeatMode() {
        Y0();
        return this.I;
    }

    @Override // defpackage.gig
    public final boolean getShuffleModeEnabled() {
        Y0();
        return this.J;
    }

    @Override // defpackage.gig
    public final void i(int i, boolean z) {
        Y0();
    }

    @Override // defpackage.gig
    public final void i0(int i, int i2, int i3) {
        Y0();
        z4o.w(i >= 0 && i <= i2 && i3 >= 0);
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        int iMin = Math.min(i2, size);
        int iMin2 = Math.min(i3, size - (iMin - i));
        if (i >= size || i == iMin || i == iMin2) {
            return;
        }
        gql currentTimeline = getCurrentTimeline();
        this.K++;
        tym.M(arrayList, i, iMin, iMin2);
        jij jijVar = this.Q;
        jijVar.getClass();
        this.Q = jijVar;
        blg blgVar = new blg(arrayList, this.Q);
        shg shgVar = this.r0;
        shg shgVarJ0 = J0(shgVar, blgVar, G0(currentTimeline, blgVar, F0(shgVar), D0(this.r0)));
        jij jijVar2 = this.Q;
        zi8 zi8Var = this.m;
        zi8Var.getClass();
        zi8Var.h.a(19, new vi8(i, iMin, iMin2, jijVar2)).b();
        W0(shgVarJ0, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.gig
    public final boolean isLoading() {
        Y0();
        return this.r0.g;
    }

    @Override // defpackage.gig
    public final boolean isPlayingAd() {
        Y0();
        return this.r0.b.b();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        Y0();
        return this.N;
    }

    @Override // defpackage.gig
    public final void j() {
        Y0();
    }

    @Override // defpackage.gig
    public final void k(int i) {
        Y0();
    }

    @Override // defpackage.gig
    public final boolean k0() {
        Y0();
        return false;
    }

    @Override // defpackage.gig
    public final void l(int i, int i2, List list) throws d45 {
        Y0();
        z4o.w(i >= 0 && i2 >= i);
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        if (i > size) {
            return;
        }
        int iMin = Math.min(i2, size);
        if (iMin - i == list.size()) {
            for (int i3 = i; i3 < iMin; i3++) {
                if (((oi8) arrayList.get(i3)).b.k.a((qjd) list.get(i3 - i))) {
                }
            }
            this.K++;
            szk szkVar = this.m.h;
            szkVar.getClass();
            rzk rzkVarB = szk.b();
            rzkVarB.a = szkVar.a.obtainMessage(27, i, iMin, list);
            rzkVarB.b();
            for (int i4 = i; i4 < iMin; i4++) {
                oi8 oi8Var = (oi8) arrayList.get(i4);
                oi8Var.c = new alg(oi8Var.c, (qjd) list.get(i4 - i));
            }
            W0(this.r0.j(new blg(arrayList, this.Q)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList arrayListB0 = B0(list);
        if (!this.r0.a.p()) {
            shg shgVarM0 = M0(y0(this.r0, iMin, arrayListB0), i, iMin);
            W0(shgVarM0, 0, !shgVarM0.b.a.equals(this.r0.b.a), 4, E0(shgVarM0), -1, false);
        } else {
            boolean z = this.s0 == -1;
            Y0();
            P0(arrayListB0, z, -9223372036854775807L, -1);
        }
    }

    @Override // defpackage.gig
    public final void m(nyl nylVar) {
        nyl nylVarB;
        Y0();
        jx6 jx6Var = this.j;
        jx6Var.getClass();
        nyl nylVarL = L();
        if (this.N) {
            this.O = nylVar.I;
            u1b u1bVar = this.P.a;
            myl mylVarA = nylVar.a();
            omm ommVarN = u1bVar.n();
            while (ommVarN.hasNext()) {
                mylVarA.l(((Integer) ommVarN.next()).intValue(), true);
            }
            nylVarB = mylVarA.b();
        } else {
            nylVarB = nylVar;
        }
        if (!nylVarB.equals(jx6Var.d())) {
            jx6Var.k(nylVarB);
        }
        if (nylVarL.equals(nylVar)) {
            return;
        }
        this.n.i(19, new ii8(nylVar, (byte) 0));
    }

    @Override // defpackage.gig
    public final long m0() {
        Y0();
        if (this.r0.a.p()) {
            return this.t0;
        }
        shg shgVar = this.r0;
        if (shgVar.k.d != shgVar.b.d) {
            return tym.c0(shgVar.a.m(f0(), this.b, 0L).l);
        }
        long j = shgVar.q;
        if (this.r0.k.b()) {
            shg shgVar2 = this.r0;
            dql dqlVarG = shgVar2.a.g(shgVar2.k.a, this.p);
            long jD = dqlVarG.d(this.r0.k.b);
            j = jD == Long.MIN_VALUE ? dqlVarG.d : jD;
        }
        shg shgVar3 = this.r0;
        gql gqlVar = shgVar3.a;
        Object obj = shgVar3.k.a;
        dql dqlVar = this.p;
        gqlVar.g(obj, dqlVar);
        return tym.c0(j + dqlVar.e);
    }

    @Override // defpackage.gig
    public final void n0(int i) {
        Y0();
    }

    @Override // defpackage.gig
    public final void q(int i, int i2) {
        Y0();
        z4o.w(i >= 0 && i2 >= i);
        int size = this.q.size();
        int iMin = Math.min(i2, size);
        if (i >= size || i == iMin) {
            return;
        }
        shg shgVarM0 = M0(this.r0, i, iMin);
        W0(shgVarM0, 0, !shgVarM0.b.a.equals(this.r0.b.a), 4, E0(shgVarM0), -1, false);
    }

    @Override // defpackage.gig
    public final vjd q0() {
        Y0();
        return this.S;
    }

    @Override // defpackage.gig
    public final void r0(List list) throws d45 {
        Y0();
        ArrayList arrayListB0 = B0(list);
        Y0();
        P0(arrayListB0, true, -9223372036854775807L, -1);
    }

    @Override // defpackage.gig
    public final void release() {
        String str;
        boolean zB;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.9.0] [");
        sb.append(tym.a);
        sb.append("] [");
        HashSet hashSet = rjd.a;
        synchronized (rjd.class) {
            str = rjd.b;
        }
        sb.append(str);
        sb.append("]");
        w7d.G(sb.toString());
        Y0();
        this.z.H();
        this.A.m(false);
        this.B.m(false);
        pi8 pi8Var = this.F;
        if (pi8Var != null && Build.VERSION.SDK_INT >= 34) {
            pi8Var.a();
        }
        tah tahVar = this.E;
        ((szk) tahVar.g).a.removeCallbacksAndMessages(null);
        ((qi8) tahVar.c).g0((fkg) tahVar.d);
        zi8 zi8Var = this.m;
        if (zi8Var.G || !zi8Var.j.getThread().isAlive()) {
            zB = true;
        } else {
            zi8Var.G = true;
            rj5 rj5Var = new rj5(0);
            zi8Var.h.a(7, rj5Var).b();
            zB = rj5Var.b(500L);
        }
        if (!zB) {
            this.n.i(10, new yt7((byte) 12));
        }
        this.n.e();
        this.k.a.removeCallbacksAndMessages(null);
        pl6 pl6Var = this.v;
        el6 el6Var = this.t;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) pl6Var.c.a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            m13 m13Var = (m13) it.next();
            if (m13Var.b == el6Var) {
                m13Var.c = true;
                copyOnWriteArrayList.remove(m13Var);
            }
        }
        shg shgVarA = this.r0;
        if (shgVarA.p) {
            shgVarA = shgVarA.a();
            this.r0 = shgVarA;
        }
        shg shgVarI0 = I0(shgVarA, 1);
        this.r0 = shgVarI0;
        shg shgVarC = shgVarI0.c(shgVarI0.b);
        this.r0 = shgVarC;
        shgVarC.q = shgVarC.s;
        this.r0.r = 0L;
        el6 el6Var2 = this.t;
        szk szkVar = el6Var2.h;
        szkVar.getClass();
        szkVar.c(new bl6(el6Var2, (byte) 0));
        N0();
        Surface surface = this.V;
        if (surface != null) {
            surface.release();
            this.V = null;
        }
        this.g0 = y36.d;
        this.k0 = true;
    }

    @Override // defpackage.gig
    public final rhg s() {
        Y0();
        return this.r0.f;
    }

    @Override // defpackage.gig
    public final long s0() {
        Y0();
        return this.n0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        Y0();
        O0(4, 15, imageOutput);
    }

    @Override // defpackage.gig
    public final void setPlayWhenReady(boolean z) {
        Y0();
        V0(1, z);
    }

    @Override // defpackage.gig
    public final void setRepeatMode(int i) {
        Y0();
        if (this.I != i) {
            this.I = i;
            szk szkVar = this.m.h;
            szkVar.getClass();
            rzk rzkVarB = szk.b();
            rzkVarB.a = szkVar.a.obtainMessage(11, i, 0);
            rzkVarB.b();
            gz3 gz3Var = new gz3((byte) 4, i);
            ijc ijcVar = this.n;
            ijcVar.d(8, gz3Var);
            U0();
            ijcVar.c();
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z) {
        nyl nylVarB;
        Y0();
        if (z == this.N) {
            return;
        }
        this.N = z;
        upi upiVar = this.P;
        if (!upiVar.a.isEmpty()) {
            jx6 jx6Var = this.j;
            jx6Var.getClass();
            bx6 bx6VarD = jx6Var.d();
            if (z) {
                this.O = bx6VarD.I;
                u1b u1bVar = upiVar.a;
                myl mylVarA = bx6VarD.a();
                omm ommVarN = u1bVar.n();
                while (ommVarN.hasNext()) {
                    mylVarA.l(((Integer) ommVarN.next()).intValue(), true);
                }
                nylVarB = mylVarA.b();
            } else {
                bx6VarD.getClass();
                ax6 ax6Var = new ax6(bx6VarD);
                ax6Var.m(this.O);
                bx6 bx6Var = new bx6(ax6Var);
                this.O = null;
                nylVarB = bx6Var;
            }
            if (!nylVarB.equals(bx6VarD)) {
                jx6Var.k(nylVarB);
            }
        }
        this.m.h.a(36, Boolean.valueOf(z)).b();
        shg shgVar = this.r0;
        V0(shgVar.m, shgVar.l);
    }

    @Override // defpackage.gig
    public final void setShuffleModeEnabled(boolean z) {
        Y0();
        if (this.J != z) {
            this.J = z;
            szk szkVar = this.m.h;
            szkVar.getClass();
            rzk rzkVarB = szk.b();
            rzkVarB.a = szkVar.a.obtainMessage(12, z ? 1 : 0, 0);
            rzkVarB.b();
            go4 go4Var = new go4((byte) 3, z);
            ijc ijcVar = this.n;
            ijcVar.d(9, go4Var);
            U0();
            ijcVar.c();
        }
    }

    @Override // defpackage.gig
    public final void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        Y0();
        if (surfaceHolder == null) {
            A0();
            return;
        }
        N0();
        this.Y = true;
        this.W = surfaceHolder;
        surfaceHolder.addCallback(this.x);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            R0(null);
            L0(0, 0);
        } else {
            R0(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            L0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // defpackage.gig
    public final void setVideoSurfaceView(SurfaceView surfaceView) {
        Y0();
        if (surfaceView instanceof r3n) {
            N0();
            R0(surfaceView);
            Q0(surfaceView.getHolder());
            return;
        }
        if (!(surfaceView instanceof g0k)) {
            setVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
            return;
        }
        N0();
        this.X = (g0k) surfaceView;
        ckg ckgVarC0 = C0(this.y);
        z4o.H(!ckgVarC0.f);
        ckgVarC0.c = (short) 10000;
        g0k g0kVar = this.X;
        z4o.H(!ckgVarC0.f);
        ckgVarC0.d = g0kVar;
        ckgVarC0.b();
        this.X.a.add(this.x);
        R0(this.X.h);
        Q0(surfaceView.getHolder());
    }

    @Override // defpackage.gig
    public final void setVideoTextureView(TextureView textureView) {
        Y0();
        if (textureView == null) {
            A0();
            return;
        }
        N0();
        this.Z = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            w7d.K("Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.x);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            R0(null);
            L0(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            R0(surface);
            this.V = surface;
            L0(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // defpackage.gig
    public final void setVolume(float f) {
        Y0();
        float fH = tym.h(f, 0.0f, 1.0f);
        float f2 = this.d0;
        if (f2 == fH) {
            return;
        }
        if (fH != 0.0f) {
            f2 = fH;
        }
        this.e0 = f2;
        this.d0 = fH;
        this.m.h.a(32, Float.valueOf(fH)).b();
        this.n.i(22, new io4(fH, (byte) 2));
    }

    @Override // defpackage.gig
    public final void stop() {
        Y0();
        T0(null);
        a1b a1bVar = h1b.b;
        this.g0 = new y36(this.r0.s, csh.e);
    }

    @Override // defpackage.gig
    public final void t() {
        Y0();
        if (this.d0 == 0.0f) {
            float f = this.e0;
            if (f != 0.0f) {
                setVolume(f);
            }
        }
    }

    @Override // defpackage.gig
    public final void v(int i) {
        Y0();
    }

    @Override // defpackage.gig
    public final fzl w() {
        Y0();
        return (fzl) this.r0.i.e;
    }

    @Override // defpackage.g83
    public final void w0(int i, long j, boolean z) {
        Y0();
        if (i != -1) {
            z4o.w(i >= 0);
            gql gqlVar = this.r0.a;
            if (gqlVar.p() || i < gqlVar.o()) {
                el6 el6Var = this.t;
                if (!el6Var.i) {
                    d11 d11VarQ = el6Var.Q();
                    el6Var.i = true;
                    el6Var.V(d11VarQ, -1, new zk6((byte) 8));
                }
                this.K++;
                if (isPlayingAd()) {
                    w7d.K("seekTo ignored because an ad is playing");
                    wi8 wi8Var = new wi8(this.r0);
                    wi8Var.a(1);
                    qi8 qi8Var = this.l.b;
                    qi8Var.k.c(new cn7(qi8Var, wi8Var, (byte) 17));
                    return;
                }
                shg shgVarH = this.r0;
                int i2 = shgVarH.e;
                if (i2 == 3 || (i2 == 4 && !gqlVar.p())) {
                    shgVarH = this.r0.h(2);
                }
                int iF0 = f0();
                shg shgVarJ0 = J0(shgVarH, gqlVar, K0(gqlVar, i, j));
                this.m.h.a(3, new yi8(gqlVar, i, tym.N(j))).b();
                W0(shgVarJ0, 0, true, 1, E0(shgVarJ0), iF0, z);
            }
        }
    }

    @Override // defpackage.gig
    public final void x(int i, List list, long j) throws d45 {
        Y0();
        ArrayList arrayListB0 = B0(list);
        Y0();
        P0(arrayListB0, false, j, i);
    }

    public final shg y0(shg shgVar, int i, ArrayList arrayList) {
        gql gqlVar = shgVar.a;
        this.K++;
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList3 = this.q;
            if (i2 >= size) {
                this.Q = this.Q.cloneAndInsert(i, arrayList2.size());
                blg blgVar = new blg(arrayList3, this.Q);
                shg shgVarJ0 = J0(shgVar, blgVar, G0(gqlVar, blgVar, F0(shgVar), D0(shgVar)));
                jij jijVar = this.Q;
                szk szkVar = this.m.h;
                ui8 ui8Var = new ui8(arrayList2, jijVar, -1, -9223372036854775807L);
                szkVar.getClass();
                rzk rzkVarB = szk.b();
                rzkVarB.a = szkVar.a.obtainMessage(18, i, 0, ui8Var);
                rzkVarB.b();
                return shgVarJ0;
            }
            xrd xrdVar = new xrd((l73) arrayList.get(i2), this.r);
            arrayList2.add(xrdVar);
            arrayList3.add(i2 + i, new oi8(xrdVar.b, xrdVar.a));
            i2++;
        }
    }

    @Override // defpackage.gig
    public final y36 z() {
        Y0();
        return this.g0;
    }

    public final vjd z0() {
        gql currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            return this.q0;
        }
        qjd qjdVar = currentTimeline.m(f0(), this.b, 0L).b;
        ujd ujdVarA = this.q0.a();
        vjd vjdVar = qjdVar.e;
        if (vjdVar != null) {
            h1b h1bVar = vjdVar.J;
            byte[] bArr = vjdVar.k;
            CharSequence charSequence = vjdVar.a;
            if (charSequence != null) {
                ujdVarA.a = charSequence;
            }
            CharSequence charSequence2 = vjdVar.b;
            if (charSequence2 != null) {
                ujdVarA.b = charSequence2;
            }
            CharSequence charSequence3 = vjdVar.c;
            if (charSequence3 != null) {
                ujdVarA.c = charSequence3;
            }
            CharSequence charSequence4 = vjdVar.d;
            if (charSequence4 != null) {
                ujdVarA.d = charSequence4;
            }
            CharSequence charSequence5 = vjdVar.e;
            if (charSequence5 != null) {
                ujdVarA.e = charSequence5;
            }
            CharSequence charSequence6 = vjdVar.f;
            if (charSequence6 != null) {
                ujdVarA.f = charSequence6;
            }
            CharSequence charSequence7 = vjdVar.g;
            if (charSequence7 != null) {
                ujdVarA.g = charSequence7;
            }
            Long l = vjdVar.h;
            if (l != null) {
                ujdVarA.c(l);
            }
            xjh xjhVar = vjdVar.i;
            if (xjhVar != null) {
                ujdVarA.i = xjhVar;
            }
            xjh xjhVar2 = vjdVar.j;
            if (xjhVar2 != null) {
                ujdVarA.j = xjhVar2;
            }
            Uri uri = vjdVar.m;
            if (uri != null || bArr != null) {
                ujdVarA.m = uri;
                ujdVarA.b(bArr, vjdVar.l);
            }
            Integer num = vjdVar.n;
            if (num != null) {
                ujdVarA.n = num;
            }
            Integer num2 = vjdVar.o;
            if (num2 != null) {
                ujdVarA.o = num2;
            }
            Integer num3 = vjdVar.p;
            if (num3 != null) {
                ujdVarA.p = num3;
            }
            Boolean bool = vjdVar.q;
            if (bool != null) {
                ujdVarA.q = bool;
            }
            Boolean bool2 = vjdVar.r;
            if (bool2 != null) {
                ujdVarA.r = bool2;
            }
            Integer num4 = vjdVar.s;
            if (num4 != null) {
                ujdVarA.s = num4;
            }
            Integer num5 = vjdVar.t;
            if (num5 != null) {
                ujdVarA.s = num5;
            }
            Integer num6 = vjdVar.u;
            if (num6 != null) {
                ujdVarA.t = num6;
            }
            Integer num7 = vjdVar.v;
            if (num7 != null) {
                ujdVarA.u = num7;
            }
            Integer num8 = vjdVar.w;
            if (num8 != null) {
                ujdVarA.v = num8;
            }
            Integer num9 = vjdVar.x;
            if (num9 != null) {
                ujdVarA.w = num9;
            }
            Integer num10 = vjdVar.y;
            if (num10 != null) {
                ujdVarA.x = num10;
            }
            CharSequence charSequence8 = vjdVar.z;
            if (charSequence8 != null) {
                ujdVarA.y = charSequence8;
            }
            CharSequence charSequence9 = vjdVar.A;
            if (charSequence9 != null) {
                ujdVarA.z = charSequence9;
            }
            CharSequence charSequence10 = vjdVar.B;
            if (charSequence10 != null) {
                ujdVarA.A = charSequence10;
            }
            Integer num11 = vjdVar.C;
            if (num11 != null) {
                ujdVarA.B = num11;
            }
            Integer num12 = vjdVar.D;
            if (num12 != null) {
                ujdVarA.C = num12;
            }
            CharSequence charSequence11 = vjdVar.E;
            if (charSequence11 != null) {
                ujdVarA.D = charSequence11;
            }
            CharSequence charSequence12 = vjdVar.F;
            if (charSequence12 != null) {
                ujdVarA.E = charSequence12;
            }
            CharSequence charSequence13 = vjdVar.G;
            if (charSequence13 != null) {
                ujdVarA.F = charSequence13;
            }
            Integer num13 = vjdVar.H;
            if (num13 != null) {
                ujdVarA.G = num13;
            }
            Bundle bundle = vjdVar.I;
            if (bundle != null) {
                ujdVarA.H = bundle;
            }
            if (!h1bVar.isEmpty()) {
                ujdVarA.I = h1b.s(h1bVar);
            }
        }
        return new vjd(ujdVarA);
    }
}
