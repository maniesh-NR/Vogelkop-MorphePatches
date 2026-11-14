package defpackage;

import android.os.Trace;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vt9 implements ih5 {
    public int A;
    public int B;
    public boolean C;
    public final ut9 D;
    public final ArrayList E;
    public boolean F;
    public hqj G;
    public iqj H;
    public lqj I;
    public boolean J;
    public oag K;
    public lr4 L;
    public final jh5 M;
    public qt9 N;
    public p69 O;
    public thj P;
    public final di5 Q;
    public final CoroutineContext R;
    public boolean S;
    public long T;
    public wt9 U;
    public final jim a;
    public final zh5 b;
    public final iqj c;
    public final wee d;
    public final lr4 e;
    public final lr4 f;
    public final eme g;
    public final fi5 h;
    public yt9 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public hde p;
    public boolean q;
    public boolean r;
    public jde v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final bg3 n = new bg3((byte) 2);
    public final ArrayList s = new ArrayList();
    public final bg3 t = new bg3((byte) 2);
    public oag u = oag.g;
    public final bg3 x = new bg3((byte) 2);
    public int z = -1;

    public vt9(jim jimVar, zh5 zh5Var, iqj iqjVar, wee weeVar, lr4 lr4Var, lr4 lr4Var2, eme emeVar, fi5 fi5Var) {
        this.a = jimVar;
        this.b = zh5Var;
        this.c = iqjVar;
        this.d = weeVar;
        this.e = lr4Var;
        this.f = lr4Var2;
        this.g = emeVar;
        this.h = fi5Var;
        this.C = zh5Var.f() || zh5Var.d();
        this.D = new ut9(this, (byte) 0);
        this.E = new ArrayList();
        hqj hqjVarD = iqjVar.d();
        hqjVarD.c();
        this.G = hqjVarD;
        iqj iqjVar2 = new iqj();
        if (zh5Var.f()) {
            iqjVar2.c();
        }
        if (zh5Var.d()) {
            iqjVar2.k = new jde();
        }
        this.H = iqjVar2;
        lqj lqjVarE = iqjVar2.e();
        lqjVarE.e(true);
        this.I = lqjVarE;
        this.M = new jh5(this, lr4Var);
        hqj hqjVarD2 = this.H.d();
        try {
            qt9 qt9VarA = hqjVarD2.a(0);
            hqjVarD2.c();
            this.N = qt9VarA;
            this.O = new p69();
            this.Q = new di5(this);
            CoroutineContext coroutineContextJ = zh5Var.j();
            h hVarY = y();
            this.R = coroutineContextJ.plus(hVarY == null ? h.a : hVarY);
        } catch (Throwable th) {
            hqjVarD2.c();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int M(defpackage.vt9 r19, int r20, boolean r21, int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt9.M(vt9, int, boolean, int):int");
    }

    public final void A(ArrayList arrayList) {
        vt9 vt9Var = this;
        lr4 lr4Var = vt9Var.f;
        jh5 jh5Var = vt9Var.M;
        lr4 lr4Var2 = jh5Var.b;
        try {
            jh5Var.b = lr4Var;
            lr4Var.l.J0(rqf.d);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Pair pair = (Pair) arrayList.get(i);
                uae uaeVar = (uae) pair.a;
                uaeVar.getClass();
                qt9 qt9VarE = na2.e(null);
                iqj iqjVarA = kqj.a(null);
                int iB = iqjVarA.b(qt9VarE);
                dcb dcbVar = new dcb();
                jh5Var.b();
                erf erfVar = jh5Var.b.l;
                erfVar.J0(aqf.d);
                ui6.j0(erfVar, 0, dcbVar, 1, qt9VarE);
                if (iqjVarA == vt9Var.H) {
                    if (!vt9Var.I.w) {
                        mh5.a("Check failed");
                    }
                    vt9Var.u();
                }
                hqj hqjVarD = iqjVarA.d();
                try {
                    hqjVarD.r(iB);
                    jh5Var.f = iB;
                    lr4 lr4Var3 = new lr4();
                    vt9Var.F(null, null, null, l08.a, new hv(vt9Var, lr4Var3, hqjVarD, uaeVar));
                    lr4 lr4Var4 = jh5Var.b;
                    lr4Var4.getClass();
                    if (!lr4Var3.l.I0()) {
                        erf erfVar2 = lr4Var4.l;
                        erfVar2.J0(wpf.d);
                        ui6.j0(erfVar2, 0, lr4Var3, 1, dcbVar);
                    }
                    hqjVarD.c();
                    jh5Var.b.l.J0(tqf.d);
                    i++;
                    vt9Var = this;
                } catch (Throwable th) {
                    hqjVarD.c();
                    throw th;
                }
            }
            jh5Var.b();
            jh5Var.b.l.J0(eqf.d);
            jh5Var.f = 0;
        } finally {
            jh5Var.b = lr4Var2;
        }
    }

    public final void B(oag oagVar, Object obj) {
        U(126665345, null);
        C();
        h0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                lqj.y(this.I);
            }
            boolean z = (this.S || Intrinsics.a(this.G.f(), oagVar)) ? false : true;
            if (z) {
                I(oagVar);
            }
            R(mh5.c, 202, 0, oagVar);
            this.K = null;
            boolean z2 = this.w;
            this.w = z;
            ue5 ue5Var = new ue5(-59194059, new whf(obj, (byte) 26), true);
            y9m.t(2, ue5Var);
            ue5Var.invoke(this, 1);
            this.w = z2;
        } finally {
        }
    }

    public final Object C() {
        boolean z = this.S;
        zpa zpaVar = hh5.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof l1i)) {
                return objM;
            }
        } else if (this.r) {
            mh5.a("A call to createNode(), emitNode() or useNode() expected");
            return zpaVar;
        }
        return zpaVar;
    }

    public final List D() {
        zh5 zh5Var = this.b;
        yh5 yh5VarH = zh5Var.h();
        fi5 fi5Var = yh5VarH != null ? (fi5) yh5VarH : null;
        if (fi5Var == null) {
            return l08.a;
        }
        iqj iqjVar = fi5Var.f;
        hqj hqjVarD = kqj.a(iqjVar).d();
        try {
            Integer numD = z5i.D(hqjVarD, zh5Var, 0, hqjVarD.c);
            if (numD == null) {
                return l08.a;
            }
            hqjVarD = kqj.a(iqjVar).d();
            try {
                ArrayList arrayListC0 = z5i.C0(hqjVarD, numD.intValue(), 0);
                hqjVarD.c();
                return CollectionsKt.V(fi5Var.v.D(), arrayListC0);
            } finally {
            }
        } finally {
        }
    }

    public final int E(int i) {
        int iQ = this.G.q(i) + 1;
        int i2 = 0;
        while (iQ < i) {
            if (!this.G.k(iQ)) {
                i2++;
            }
            iQ += this.G.b[(iQ * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0005, B:6:0x0015, B:8:0x0023, B:10:0x002a, B:9:0x0027, B:13:0x0031, B:18:0x003d, B:20:0x0045, B:22:0x004b, B:23:0x004f, B:24:0x0050, B:26:0x0056, B:19:0x0041), top: B:34:0x0005, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(defpackage.fi5 r9, defpackage.fi5 r10, java.lang.Integer r11, java.util.List r12, kotlin.jvm.functions.Function0 r13) {
        /*
            r8 = this;
            boolean r0 = r8.F
            int r1 = r8.k
            r2 = 1
            r8.F = r2     // Catch: java.lang.Throwable -> L5f
            r2 = 0
            r8.k = r2     // Catch: java.lang.Throwable -> L5f
            r3 = r12
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L5f
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L5f
            r4 = r2
        L12:
            r5 = 0
            if (r4 >= r3) goto L2d
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L5f
            kotlin.Pair r6 = (kotlin.Pair) r6     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r7 = r6.a     // Catch: java.lang.Throwable -> L5f
            znh r7 = (defpackage.znh) r7     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r6 = r6.b     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L27
            r8.c0(r7, r6)     // Catch: java.lang.Throwable -> L5f
            goto L2a
        L27:
            r8.c0(r7, r5)     // Catch: java.lang.Throwable -> L5f
        L2a:
            int r4 = r4 + 1
            goto L12
        L2d:
            if (r9 == 0) goto L56
            if (r11 == 0) goto L36
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L5f
            goto L37
        L36:
            r11 = -1
        L37:
            if (r10 == 0) goto L50
            if (r10 == r9) goto L50
            if (r11 < 0) goto L50
            r9.r = r10     // Catch: java.lang.Throwable -> L5f
            r9.s = r11     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L4a
            r9.r = r5     // Catch: java.lang.Throwable -> L5f
            r9.s = r2     // Catch: java.lang.Throwable -> L5f
            goto L54
        L4a:
            r10 = move-exception
            r9.r = r5     // Catch: java.lang.Throwable -> L5f
            r9.s = r2     // Catch: java.lang.Throwable -> L5f
            throw r10     // Catch: java.lang.Throwable -> L5f
        L50:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L5f
        L54:
            if (r10 != 0) goto L5a
        L56:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L5f
        L5a:
            r8.F = r0
            r8.k = r1
            return r10
        L5f:
            r9 = move-exception
            r8.F = r0
            r8.k = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt9.F(fi5, fi5, java.lang.Integer, java.util.List, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x01af, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G() {
        /*
            Method dump skipped, instructions count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt9.G():void");
    }

    public final void H() throws Throwable {
        int i;
        L(this.G.g);
        jh5 jh5Var = this.M;
        jh5Var.d(false);
        bg3 bg3Var = jh5Var.d;
        vt9 vt9Var = jh5Var.a;
        hqj hqjVar = vt9Var.G;
        if (hqjVar.c > 0 && bg3Var.b(-2) != (i = hqjVar.i)) {
            if (!jh5Var.c && jh5Var.e) {
                jh5Var.d(false);
                jh5Var.b.l.J0(hqf.d);
                jh5Var.c = true;
            }
            if (i > 0) {
                qt9 qt9VarA = hqjVar.a(i);
                bg3Var.d(i);
                jh5Var.d(false);
                erf erfVar = jh5Var.b.l;
                erfVar.J0(gqf.d);
                ui6.i0(erfVar, 0, qt9VarA);
                jh5Var.c = true;
            }
        }
        jh5Var.b.l.J0(pqf.d);
        int i2 = jh5Var.f;
        hqj hqjVar2 = vt9Var.G;
        jh5Var.f = hqjVar2.b[(hqjVar2.g * 5) + 3] + i2;
    }

    public final void I(oag oagVar) {
        jde jdeVar = this.v;
        if (jdeVar == null) {
            jdeVar = new jde();
            this.v = jdeVar;
        }
        jdeVar.i(this.G.g, oagVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(int r7, int r8, int r9) {
        /*
            r6 = this;
            hqj r0 = r6.G
            if (r7 == r8) goto L17
            if (r7 == r9) goto L68
            if (r8 == r9) goto L68
            int r1 = r0.q(r7)
            if (r1 != r8) goto L11
            r9 = r8
            goto L68
        L11:
            int r1 = r0.q(r8)
            if (r1 != r7) goto L19
        L17:
            r9 = r7
            goto L68
        L19:
            int r1 = r0.q(r7)
            int r2 = r0.q(r8)
            if (r1 != r2) goto L28
            int r9 = r0.q(r7)
            goto L68
        L28:
            r1 = 0
            r2 = r7
            r3 = r1
        L2b:
            if (r2 <= 0) goto L36
            if (r2 == r9) goto L36
            int r2 = r0.q(r2)
            int r3 = r3 + 1
            goto L2b
        L36:
            r2 = r8
            r4 = r1
        L38:
            if (r2 <= 0) goto L43
            if (r2 == r9) goto L43
            int r2 = r0.q(r2)
            int r4 = r4 + 1
            goto L38
        L43:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L47:
            if (r2 >= r9) goto L50
            int r5 = r0.q(r5)
            int r2 = r2 + 1
            goto L47
        L50:
            int r4 = r4 - r3
            r9 = r8
        L52:
            if (r1 >= r4) goto L5b
            int r9 = r0.q(r9)
            int r1 = r1 + 1
            goto L52
        L5b:
            r1 = r9
            r9 = r5
        L5d:
            if (r9 == r1) goto L68
            int r9 = r0.q(r9)
            int r1 = r0.q(r1)
            goto L5d
        L68:
            if (r7 <= 0) goto L7c
            if (r7 == r9) goto L7c
            boolean r1 = r0.l(r7)
            if (r1 == 0) goto L77
            jh5 r1 = r6.M
            r1.a()
        L77:
            int r7 = r0.q(r7)
            goto L68
        L7c:
            r6.o(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt9.J(int, int, int):void");
    }

    public final Object K() {
        boolean z = this.S;
        zpa zpaVar = hh5.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof l1i)) {
                return objM instanceof zt9 ? ((zt9) objM).a : objM;
            }
        } else if (this.r) {
            mh5.a("A call to createNode(), emitNode() or useNode() expected");
            return zpaVar;
        }
        return zpaVar;
    }

    public final void L(int i) throws Throwable {
        boolean zL = this.G.l(i);
        jh5 jh5Var = this.M;
        if (zL) {
            jh5Var.c();
            Object objN = this.G.n(i);
            jh5Var.c();
            jh5Var.h.add(objN);
        }
        M(this, i, zL, 0);
        jh5Var.c();
        if (zL) {
            jh5Var.a();
        }
    }

    public final boolean N(int i, boolean z) {
        znh znhVarW;
        if ((i & 1) == 0 && (this.S || this.y)) {
            thj thjVar = this.P;
            if (thjVar != null && (znhVarW = w()) != null && thjVar.f()) {
                int i2 = znhVarW.b;
                if ((i2 & NotificationCompat.FLAG_GROUP_SUMMARY) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                znhVarW.b = i3;
                znhVarW.b = (this.y ? i2 | 129 : i3 & (-129)) | NotificationCompat.FLAG_LOCAL_ONLY;
                erf erfVar = this.M.b.l;
                erfVar.J0(oqf.d);
                ui6.i0(erfVar, 0, znhVarW);
                this.b.q(znhVarW);
                return false;
            }
        } else if (!z && z()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt9.O():void");
    }

    public final void P() {
        hqj hqjVar = this.G;
        int i = hqjVar.i;
        this.l = i >= 0 ? hqjVar.b[(i * 5) + 1] & 67108863 : 0;
        hqjVar.t();
    }

    public final void Q() {
        if (this.l != 0) {
            mh5.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        znh znhVarW = w();
        if (znhVarW != null) {
            int i = znhVarW.b;
            if ((i & NotificationCompat.FLAG_HIGH_PRIORITY) == 0) {
                znhVarW.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            P();
        } else {
            G();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(java.lang.Object r27, int r28, int r29, java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt9.R(java.lang.Object, int, int, java.lang.Object):void");
    }

    public final void S() {
        R(null, -127, 0, null);
    }

    public final void T(int i, wff wffVar) {
        R(wffVar, i, 0, null);
    }

    public final void U(int i, Object obj) {
        R(obj, i, 0, null);
    }

    public final void V(Object obj, boolean z) {
        if (z) {
            hqj hqjVar = this.G;
            if (hqjVar.k <= 0) {
                if ((hqjVar.b[(hqjVar.g * 5) + 1] & 1073741824) == 0) {
                    bpg.a("Expected a node group");
                }
                hqjVar.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            jh5 jh5Var = this.M;
            jh5Var.getClass();
            jh5Var.d(false);
            erf erfVar = jh5Var.b.l;
            erfVar.J0(yqf.d);
            ui6.i0(erfVar, 0, obj);
        }
        this.G.u();
    }

    public final void W(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            R(null, i, 0, null);
            return;
        }
        if (this.r) {
            mh5.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i, 3) ^ this.m;
        this.m++;
        hqj hqjVar = this.G;
        boolean z = this.S;
        zpa zpaVar = hh5.a;
        if (z) {
            hqjVar.k++;
            this.I.P(i, zpaVar, zpaVar, false);
            t(false, null);
            return;
        }
        if (hqjVar.g() == i && ((i3 = hqjVar.g) >= hqjVar.h || (hqjVar.b[(i3 * 5) + 1] & 536870912) == 0)) {
            hqjVar.u();
            t(false, null);
            return;
        }
        if (hqjVar.k <= 0 && (i2 = hqjVar.g) != hqjVar.h) {
            int i4 = this.k;
            H();
            this.M.e(i4, hqjVar.s());
            gyg.R(this.s, i2, hqjVar.g);
        }
        hqjVar.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            lqj lqjVarE = this.H.e();
            this.I = lqjVarE;
            lqjVarE.L();
            this.J = false;
            this.K = null;
        }
        lqj lqjVar = this.I;
        lqjVar.d();
        int i5 = lqjVar.t;
        lqjVar.P(i, zpaVar, zpaVar, false);
        this.N = lqjVar.b(i5);
        t(false, null);
    }

    public final void X(int i) {
        R(null, i, 0, null);
    }

    public final vt9 Y(int i) {
        znh znhVar;
        boolean z;
        W(i);
        boolean z2 = this.S;
        eme emeVar = this.g;
        ArrayList arrayList = this.E;
        fi5 fi5Var = this.h;
        if (z2) {
            znh znhVar2 = new znh(fi5Var);
            arrayList.add(znhVar2);
            h0(znhVar2);
            znhVar2.e = this.B;
            znhVar2.b &= -17;
            emeVar.r0();
            return this;
        }
        int i2 = this.G.i;
        ArrayList arrayList2 = this.s;
        int iS = gyg.s(i2, arrayList2);
        ljb ljbVar = iS >= 0 ? (ljb) arrayList2.remove(iS) : null;
        Object objM = this.G.m();
        if (Intrinsics.a(objM, hh5.a)) {
            znhVar = new znh(fi5Var);
            h0(znhVar);
        } else {
            znhVar = (znh) objM;
        }
        if (ljbVar == null) {
            int i3 = znhVar.b;
            if ((i3 & 64) != 0) {
                znhVar.b = i3 & (-65);
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        int i4 = znhVar.b;
        znhVar.b = z ? i4 | 8 : i4 & (-9);
        arrayList.add(znhVar);
        znhVar.e = this.B;
        znhVar.b &= -17;
        emeVar.r0();
        int i5 = znhVar.b;
        if ((i5 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            znhVar.b = (i5 & (-257)) | NotificationCompat.FLAG_GROUP_SUMMARY;
            erf erfVar = this.M.b.l;
            erfVar.J0(uqf.d);
            ui6.i0(erfVar, 0, znhVar);
            if (!this.y) {
                int i6 = znhVar.b;
                if ((i6 & NotificationCompat.FLAG_HIGH_PRIORITY) != 0) {
                    this.y = true;
                    this.z = this.G.i;
                    znhVar.b = i6 | 1024;
                }
            }
        }
        return this;
    }

    public final void Z(Object obj) {
        if (!this.S && this.G.g() == 207 && !Intrinsics.a(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        R(null, 207, 0, obj);
    }

    public final void a() {
        i();
        this.i.clear();
        this.n.c = 0;
        this.t.c = 0;
        this.x.c = 0;
        this.v = null;
        p69 p69Var = this.O;
        p69Var.j.G0();
        p69Var.i.G0();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        hqj hqjVar = this.G;
        if (!hqjVar.f) {
            hqjVar.c();
        }
        if (this.I.w) {
            return;
        }
        u();
    }

    public final void a0() {
        R(null, 125, 2, null);
        this.r = true;
    }

    public final void b(Object obj, Function2 function2) {
        if (this.S) {
            erf erfVar = this.O.i;
            erfVar.J0(zqf.d);
            ui6.i0(erfVar, 0, obj);
            y9m.t(2, function2);
            ui6.i0(erfVar, 1, function2);
            return;
        }
        jh5 jh5Var = this.M;
        jh5Var.b();
        erf erfVar2 = jh5Var.b.l;
        erfVar2.J0(zqf.d);
        y9m.t(2, function2);
        ui6.j0(erfVar2, 0, obj, 1, function2);
    }

    public final void b0() {
        this.m = 0;
        this.G = this.c.d();
        R(null, 100, 0, null);
        zh5 zh5Var = this.b;
        zh5Var.t();
        oag oagVarI = zh5Var.i();
        this.x.d(this.w ? 1 : 0);
        this.w = f(oagVarI);
        this.K = null;
        if (!this.q) {
            this.q = zh5Var.e();
        }
        boolean zF = this.C;
        if (!zF) {
            zF = zh5Var.f();
            this.C = zF;
        }
        if (zF) {
            oagVarI = oagVarI.j(ei5.a, new kbk(y()));
        }
        this.u = oagVarI;
        Set set = (Set) alo.d0(oagVarI, dab.a);
        if (set != null) {
            set.add(v());
            zh5Var.o(set);
        }
        R(null, Long.hashCode(zh5Var.g()), 0, null);
    }

    public final boolean c(float f) {
        Object objC = C();
        if ((objC instanceof Float) && f == ((Number) objC).floatValue()) {
            return false;
        }
        h0(Float.valueOf(f));
        return true;
    }

    public final boolean c0(znh znhVar, Object obj) {
        qt9 qt9Var = znhVar.c;
        if (qt9Var == null) {
            return false;
        }
        int iB = this.G.a.b(na2.e(qt9Var));
        if (!this.F || iB < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int iS = gyg.s(iB, arrayList);
        if (iS < 0) {
            int i = -(iS + 1);
            if (!(obj instanceof i37)) {
                obj = null;
            }
            arrayList.add(i, new ljb(znhVar, iB, obj));
            return true;
        }
        ljb ljbVar = (ljb) arrayList.get(iS);
        if (!(obj instanceof i37)) {
            ljbVar.c = null;
            return true;
        }
        Object obj2 = ljbVar.c;
        if (obj2 == null) {
            ljbVar.c = obj;
            return true;
        }
        if (obj2 instanceof tee) {
            ((tee) obj2).a(obj);
            return true;
        }
        tee teeVar = jmi.a;
        tee teeVar2 = new tee(2);
        teeVar2.k(obj2);
        teeVar2.k(obj);
        ljbVar.c = teeVar2;
        return true;
    }

    public final boolean d(int i) {
        Object objC = C();
        if ((objC instanceof Integer) && i == ((Number) objC).intValue()) {
            return false;
        }
        h0(Integer.valueOf(i));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d0(defpackage.see r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.ArrayList r0 = r0.s
            int r2 = j95.h(r0)
        La:
            r4 = -1
            if (r4 >= r2) goto L36
            java.lang.Object r4 = r0.get(r2)
            ljb r4 = (defpackage.ljb) r4
            znh r5 = r4.a
            qt9 r5 = r5.c
            if (r5 == 0) goto L1e
            qt9 r3 = defpackage.na2.e(r5)
            goto L1f
        L1e:
            r3 = 0
        L1f:
            if (r3 == 0) goto L30
            boolean r5 = r3.a()
            if (r5 == 0) goto L30
            int r5 = r4.b
            int r3 = r3.a
            if (r5 == r3) goto L33
            r4.b = r3
            goto L33
        L30:
            r0.remove(r2)
        L33:
            int r2 = r2 + (-1)
            goto La
        L36:
            java.lang.Object[] r2 = r1.b
            java.lang.Object[] r4 = r1.c
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L93
            r6 = 0
            r7 = r6
        L43:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8e
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L5d:
            if (r12 >= r10) goto L8c
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L88
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            r13 = r4[r13]
            znh r14 = (defpackage.znh) r14
            qt9 r15 = r14.c
            if (r15 == 0) goto L88
            qt9 r15 = defpackage.na2.e(r15)
            int r15 = r15.a
            rbe r3 = defpackage.rbe.y
            if (r13 != r3) goto L80
            r13 = 0
        L80:
            ljb r3 = new ljb
            r3.<init>(r14, r15, r13)
            r0.add(r3)
        L88:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L5d
        L8c:
            if (r10 != r11) goto L93
        L8e:
            if (r7 == r5) goto L93
            int r7 = r7 + 1
            goto L43
        L93:
            c9 r1 = defpackage.gyg.f
            n95.r(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt9.d0(see):void");
    }

    public final boolean e(long j) {
        Object objC = C();
        if ((objC instanceof Long) && j == ((Number) objC).longValue()) {
            return false;
        }
        h0(Long.valueOf(j));
        return true;
    }

    public final void e0(int i, int i2) {
        if (i0(i) != i2) {
            if (i < 0) {
                hde hdeVar = this.p;
                if (hdeVar == null) {
                    hdeVar = new hde();
                    this.p = hdeVar;
                }
                hdeVar.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                int i3 = this.G.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final boolean f(Object obj) {
        if (Intrinsics.a(C(), obj)) {
            return false;
        }
        h0(obj);
        return true;
    }

    public final void f0(int i, int i2) {
        int iI0 = i0(i);
        if (iI0 != i2) {
            int i3 = i2 - iI0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iI02 = i0(i) + i3;
                e0(i, iI02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        yt9 yt9Var = (yt9) arrayList.get(i4);
                        if (yt9Var != null && yt9Var.a(i, iI02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                hqj hqjVar = this.G;
                if (i < 0) {
                    i = hqjVar.i;
                } else if (hqjVar.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final boolean g(boolean z) {
        Object objC = C();
        if ((objC instanceof Boolean) && z == ((Boolean) objC).booleanValue()) {
            return false;
        }
        h0(Boolean.valueOf(z));
        return true;
    }

    public final void g0(Object obj) {
        if (obj instanceof dth) {
            zt9 zt9Var = new zt9((dth) obj, this.m - 1);
            if (this.S) {
                erf erfVar = this.M.b.l;
                erfVar.J0(nqf.d);
                ui6.i0(erfVar, 0, zt9Var);
            }
            this.d.add(obj);
            obj = zt9Var;
        }
        h0(obj);
    }

    public final boolean h(Object obj) {
        if (C() == obj) {
            return false;
        }
        h0(obj);
        return true;
    }

    public final void h0(Object obj) {
        if (this.S) {
            lqj lqjVar = this.I;
            if (lqjVar.n <= 0 || lqjVar.i == lqjVar.k) {
                lqjVar.E(obj);
                return;
            }
            jde jdeVar = lqjVar.s;
            if (jdeVar == null) {
                jdeVar = new jde();
            }
            lqjVar.s = jdeVar;
            int i = lqjVar.v;
            Object objE = jdeVar.e(i);
            if (objE == null) {
                objE = new dee();
                jdeVar.i(i, objE);
            }
            ((dee) objE).a(obj);
            return;
        }
        hqj hqjVar = this.G;
        boolean z = hqjVar.n;
        jh5 jh5Var = this.M;
        if (!z) {
            qt9 qt9VarA = hqjVar.a(hqjVar.i);
            erf erfVar = jh5Var.b.l;
            erfVar.J0(vpf.d);
            ui6.j0(erfVar, 0, qt9VarA, 1, obj);
            return;
        }
        int iD = (hqjVar.l - kqj.d(hqjVar.i, hqjVar.b)) - 1;
        if (jh5Var.a.G.i - jh5Var.f >= 0) {
            jh5Var.d(true);
            erf erfVar2 = jh5Var.b.l;
            erfVar2.J0(iqf.h);
            ui6.i0(erfVar2, 0, obj);
            erfVar2.k[erfVar2.l - erfVar2.i[erfVar2.j - 1].b] = iD;
            return;
        }
        hqj hqjVar2 = this.G;
        qt9 qt9VarA2 = hqjVar2.a(hqjVar2.i);
        erf erfVar3 = jh5Var.b.l;
        erfVar3.J0(iqf.g);
        ui6.j0(erfVar3, 0, obj, 1, qt9VarA2);
        erfVar3.k[erfVar3.l - erfVar3.i[erfVar3.j - 1].b] = iD;
    }

    public final void i() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        jh5 jh5Var = this.M;
        jh5Var.c = false;
        jh5Var.d.c = 0;
        jh5Var.f = 0;
        jh5Var.e = true;
        jh5Var.g = 0;
        jh5Var.h.clear();
        jh5Var.i = -1;
        jh5Var.j = -1;
        jh5Var.k = -1;
        jh5Var.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final int i0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        hde hdeVar = this.p;
        if (hdeVar != null && hdeVar.c(i) >= 0) {
            int iC = hdeVar.c(i);
            if (iC >= 0) {
                return hdeVar.c[iC];
            }
            h9o.h(sko.i(i, "Cannot find value for key "));
        }
        return 0;
    }

    public final Object j(g7h g7hVar) {
        return alo.d0(l(), g7hVar);
    }

    public final void j0() {
        if (!this.r) {
            mh5.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            mh5.a("useNode() called while inserting");
        }
        hqj hqjVar = this.G;
        Object objN = hqjVar.n(hqjVar.i);
        jh5 jh5Var = this.M;
        jh5Var.c();
        jh5Var.h.add(objN);
        if (this.y && (objN instanceof eg5)) {
            jh5Var.b();
            jh5Var.b.l.J0(brf.d);
        }
    }

    public final void k(Function0 function0) {
        if (!this.r) {
            mh5.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            mh5.a("createNode() can only be called when inserting");
        }
        bg3 bg3Var = this.n;
        int i = bg3Var.b[bg3Var.c - 1];
        lqj lqjVar = this.I;
        qt9 qt9VarB = lqjVar.b(lqjVar.v);
        this.l++;
        p69 p69Var = this.O;
        erf erfVar = p69Var.i;
        erfVar.J0(iqf.e);
        ui6.i0(erfVar, 0, function0);
        erfVar.k[erfVar.l - erfVar.i[erfVar.j - 1].b] = i;
        ui6.i0(erfVar, 1, qt9VarB);
        erf erfVar2 = p69Var.j;
        erfVar2.J0(iqf.f);
        erfVar2.k[erfVar2.l - erfVar2.i[erfVar2.j - 1].b] = i;
        ui6.i0(erfVar2, 0, qt9VarB);
    }

    public final oag l() {
        oag oagVar;
        oag oagVar2 = this.K;
        if (oagVar2 != null) {
            return oagVar2;
        }
        int iQ = this.G.i;
        boolean z = this.S;
        wff wffVar = mh5.c;
        if (z && this.J) {
            int iD = this.I.v;
            while (iD > 0) {
                if (this.I.r(iD) == 202 && Intrinsics.a(this.I.s(iD), wffVar)) {
                    oag oagVar3 = (oag) this.I.p(iD);
                    this.K = oagVar3;
                    return oagVar3;
                }
                lqj lqjVar = this.I;
                iD = lqjVar.D(iD, lqjVar.b);
            }
        }
        if (this.G.c > 0) {
            while (iQ > 0) {
                if (this.G.i(iQ) == 202) {
                    hqj hqjVar = this.G;
                    if (Intrinsics.a(hqjVar.p(iQ, hqjVar.b), wffVar)) {
                        jde jdeVar = this.v;
                        if (jdeVar == null || (oagVar = (oag) jdeVar.e(iQ)) == null) {
                            hqj hqjVar2 = this.G;
                            oagVar = (oag) hqjVar2.b(iQ, hqjVar2.b);
                        }
                        this.K = oagVar;
                        return oagVar;
                    }
                }
                iQ = this.G.q(iQ);
            }
        }
        oag oagVar4 = this.u;
        this.K = oagVar4;
        return oagVar4;
    }

    public final yg5 m() {
        ArrayList arrayList;
        if (!this.b.k()) {
            return null;
        }
        ehc ehcVarB = a.b();
        lqj lqjVar = this.I;
        ehcVarB.addAll(z5i.p(lqjVar, null, lqjVar.t, null));
        hqj hqjVar = this.G;
        boolean z = hqjVar.f;
        int[] iArr = hqjVar.b;
        if (z || hqjVar.c == 0) {
            arrayList = l08.a;
        } else {
            vkh vkhVar = new vkh(hqjVar);
            int iQ = hqjVar.i;
            Object objValueOf = Integer.valueOf(hqjVar.l - kqj.d(iQ, iArr));
            while (iQ >= 0) {
                vkhVar.A0(hqjVar.i(iQ), hqjVar.k(iQ) ? hqjVar.p(iQ, iArr) : hh5.a, hqjVar.a.g(iQ), objValueOf);
                objValueOf = hqjVar.a(iQ);
                iQ = hqjVar.q(iQ);
            }
            arrayList = (ArrayList) ((n1) vkhVar).b;
        }
        ehcVarB.addAll(arrayList);
        ehcVarB.addAll(D());
        return new yg5(a.a(ehcVarB), this.C);
    }

    public final void n(see seeVar, Function2 function2) {
        ArrayList arrayList = this.s;
        if (this.F) {
            mh5.a("Reentrant composition is not supported");
        }
        this.g.r0();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(ytj.h().g());
            this.v = null;
            d0(seeVar);
            this.k = 0;
            this.F = true;
            try {
                b0();
                Object objC = C();
                if (objC != function2 && function2 != null) {
                    h0(function2);
                }
                ut9 ut9Var = this.D;
                dfe dfeVarA = luj.a();
                try {
                    dfeVarA.c(ut9Var);
                    wff wffVar = mh5.a;
                    if (function2 != null) {
                        T(200, wffVar);
                        y9m.t(2, function2);
                        function2.invoke(this, 1);
                        p(false);
                    } else if (!this.w || objC == null || objC.equals(hh5.a)) {
                        O();
                    } else {
                        T(200, wffVar);
                        y9m.t(2, objC);
                        Function2 function22 = (Function2) objC;
                        y9m.t(2, function22);
                        function22.invoke(this, 1);
                        p(false);
                    }
                    dfeVarA.l(dfeVarA.c - 1);
                    s();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        mh5.a("Check failed");
                    }
                    u();
                } catch (Throwable th) {
                    dfeVarA.l(dfeVarA.c - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void o(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        o(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object objN = this.G.n(i);
            jh5 jh5Var = this.M;
            jh5Var.c();
            jh5Var.h.add(objN);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0503  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(boolean r43) {
        /*
            Method dump skipped, instructions count: 1580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt9.p(boolean):void");
    }

    public final void q() {
        p(false);
        znh znhVarW = w();
        if (znhVarW != null) {
            int i = znhVarW.b;
            if ((i & 1) != 0) {
                znhVarW.b = i | 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c A[EDGE_INSN: B:58:0x007c->B:27:0x007c BREAK  A[LOOP:0: B:14:0x0038->B:26:0x0079], EDGE_INSN: B:59:0x007c->B:27:0x007c BREAK  A[LOOP:0: B:14:0x0038->B:26:0x0079]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.znh r() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt9.r():znh");
    }

    public final void s() {
        p(false);
        this.b.c();
        p(false);
        jh5 jh5Var = this.M;
        if (jh5Var.c) {
            jh5Var.d(false);
            jh5Var.d(false);
            jh5Var.b.l.J0(dqf.d);
            jh5Var.c = false;
        }
        jh5Var.b();
        if (jh5Var.d.c != 0) {
            mh5.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            mh5.a("Start/end imbalance");
        }
        i();
        this.G.c();
        this.w = this.x.c() != 0;
    }

    public final void t(boolean z, yt9 yt9Var) {
        this.i.add(this.j);
        this.j = yt9Var;
        int i = this.l;
        bg3 bg3Var = this.n;
        bg3Var.d(i);
        bg3Var.d(this.m);
        bg3Var.d(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void u() {
        iqj iqjVar = new iqj();
        if (this.C) {
            iqjVar.c();
        }
        if (this.b.d()) {
            iqjVar.k = new jde();
        }
        this.H = iqjVar;
        lqj lqjVarE = iqjVar.e();
        lqjVarE.e(true);
        this.I = lqjVarE;
    }

    public final bi5 v() {
        wt9 wt9Var = this.U;
        if (wt9Var != null) {
            return wt9Var;
        }
        wt9 wt9Var2 = new wt9(this.h);
        this.U = wt9Var2;
        return wt9Var2;
    }

    public final znh w() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (znh) am2.k(1, arrayList);
    }

    public final boolean x() {
        if (!z() || this.w) {
            return true;
        }
        znh znhVarW = w();
        return (znhVarW == null || (znhVarW.b & 4) == 0) ? false : true;
    }

    public final di5 y() {
        if (this.b.k()) {
            return this.Q;
        }
        return null;
    }

    public final boolean z() {
        znh znhVarW;
        return (this.S || this.y || this.w || (znhVarW = w()) == null || (znhVarW.b & 8) != 0) ? false : true;
    }
}
