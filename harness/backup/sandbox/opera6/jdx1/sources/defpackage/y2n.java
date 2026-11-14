package defpackage;

import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class y2n extends qrm {
    public static final v2n G = new v2n();
    public Rect A;
    public int B;
    public x2n C;
    public r3j D;
    public final Map E;
    public final bf4 F;
    public g07 s;
    public ntk t;
    public so2 u;
    public q3j v;
    public o94 w;
    public buk x;
    public int y;
    public ghf z;

    public y2n(j3n j3nVar) {
        super(j3nVar);
        this.u = so2.c;
        this.v = new q3j();
        this.w = null;
        this.y = 3;
        this.E = Collections.EMPTY_MAP;
        this.F = new bf4(this, (byte) 2);
    }

    public static void I(HashSet hashSet, int i, int i2, Size size, u3n u3nVar) {
        if (i > size.getWidth() || i2 > size.getHeight()) {
            return;
        }
        try {
            hashSet.add(new Size(i, ((Integer) u3nVar.z(i).clamp(Integer.valueOf(i2))).intValue()));
        } catch (IllegalArgumentException unused) {
        }
        try {
            hashSet.add(new Size(((Integer) u3nVar.g(i2).clamp(Integer.valueOf(i))).intValue(), i2));
        } catch (IllegalArgumentException unused2) {
        }
    }

    public static int J(boolean z, int i, int i2, Range range) {
        int i3 = i % i2;
        if (i3 != 0) {
            i = z ? i - i3 : i + (i2 - i3);
        }
        return ((Integer) range.clamp(Integer.valueOf(i))).intValue();
    }

    public static u3n S(gp2 gp2Var, ip7 ip7Var, zrd zrdVar) {
        u3n u3nVarA = v3n.a(k3n.b(gp2Var, ip7Var, zrdVar).a);
        if (u3nVarA == null) {
            return null;
        }
        Size sizeA = gp2Var != null ? gp2Var.f.a() : null;
        if (!(u3nVarA instanceof x3n)) {
            if (b77.a.b(MediaCodecInfoReportIncorrectInfoQuirk.class) != null) {
                u3nVarA = new x3n(u3nVarA);
            } else if (sizeA != null && !u3nVarA.o(sizeA.getWidth(), sizeA.getHeight())) {
                sizeA.toString();
                Objects.toString(u3nVarA.C());
                Objects.toString(u3nVarA.E());
                u3nVarA = new x3n(u3nVarA);
            }
        }
        if (sizeA != null && (u3nVarA instanceof x3n)) {
            ((x3n) u3nVarA).d.add(sizeA);
        }
        return u3nVarA;
    }

    @Override // defpackage.qrm
    public final to2 A(to2 to2Var, to2 to2Var2) {
        Size size = to2Var.a;
        Objects.toString(to2Var);
        Objects.toString(to2Var2);
        List list = (List) ((j3n) this.h).b(hya.vp, null);
        ArrayList arrayList = list != null ? new ArrayList(list) : null;
        if (arrayList != null && !arrayList.contains(size)) {
            Objects.toString(size);
            arrayList.toString();
        }
        return to2Var;
    }

    @Override // defpackage.qrm
    public final void E(Rect rect) {
        this.k = rect;
        T();
    }

    public final void K(q3j q3jVar, so2 so2Var, to2 to2Var) {
        g07 g07Var;
        boolean z = so2Var.a == -1;
        boolean z2 = so2Var.b == 1;
        if (z && z2) {
            qp2.n("Unexpected stream state, stream is error but active");
            return;
        }
        q3jVar.a.clear();
        ((HashSet) q3jVar.b.c).clear();
        ip7 ip7Var = to2Var.c;
        if (!z && (g07Var = this.s) != null) {
            if (z2) {
                q3jVar.a(g07Var, ip7Var, -1);
            } else {
                wjh wjhVarA = po2.a(g07Var);
                if (ip7Var == null) {
                    t3p.q("Null dynamicRange");
                    return;
                } else {
                    wjhVarA.f = ip7Var;
                    q3jVar.a.add(wjhVarA.d());
                }
            }
        }
        o94 o94Var = this.w;
        if (o94Var != null) {
            o94Var.cancel(false);
        }
        o94 o94VarZ = k1g.z(new r2n(this, q3jVar));
        this.w = o94VarZ;
        o94VarZ.addListener(new wr9(o94VarZ, new eyi(this, o94VarZ, z2), (byte) 0), x7d.l());
    }

    public final void L() {
        xug.i();
        r3j r3jVar = this.D;
        if (r3jVar != null) {
            r3jVar.b();
            this.D = null;
        }
        g07 g07Var = this.s;
        if (g07Var != null) {
            g07Var.a();
            this.s = null;
        }
        ghf ghfVar = this.z;
        if (ghfVar != null) {
            ghfVar.K();
            this.z = null;
        }
        ntk ntkVar = this.t;
        if (ntkVar != null) {
            ntkVar.c();
            this.t = null;
        }
        this.A = null;
        this.x = null;
        this.u = so2.c;
        this.B = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.q3j M(defpackage.j3n r30, defpackage.to2 r31) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1115
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y2n.M(j3n, to2):q3j");
    }

    public final int N(zd4 zd4Var) {
        int iJ = j(zd4Var, p(zd4Var));
        this.u.getClass();
        return iJ;
    }

    public final wfh O() {
        HashSet hashSet = this.g;
        if (hashSet == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        wfh wfhVar = wfh.c;
        return wfh.a(arrayList, on2.c);
    }

    public final k4n P() {
        k4n k4nVar = (k4n) ((j3n) this.h).i(j3n.b);
        Objects.requireNonNull(k4nVar);
        return k4nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Q(defpackage.zd4 r4, defpackage.j3n r5, int r6, android.graphics.Rect r7, android.util.Size r8, defpackage.ip7 r9) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            if (r6 != r1) goto L5
            return r0
        L5:
            boolean r6 = r4.p()
            if (r6 == 0) goto L1e
            an2 r6 = defpackage.j3n.d
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Object r5 = r5.b(r6, r2)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            java.util.Objects.requireNonNull(r5)
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L90
        L1e:
            boolean r5 = r4.p()
            if (r5 == 0) goto L3a
            ygh r5 = defpackage.b77.a
            boolean r5 = androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk.a(r5)
            if (r5 != 0) goto L90
            xd4 r5 = r4.g()
            ygh r5 = r5.s()
            boolean r5 = androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk.a(r5)
            if (r5 != 0) goto L90
        L3a:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk> r5 = androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk.class
            ygh r6 = defpackage.b77.a
            tgh r5 = r6.b(r5)
            androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk r5 = (androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk) r5
            boolean r6 = r4.p()
            if (r6 == 0) goto L69
            if (r5 == 0) goto L69
            ip7 r5 = defpackage.ip7.d
            if (r9 == r5) goto L52
            r5 = r1
            goto L53
        L52:
            r5 = r0
        L53:
            java.lang.String r6 = "samsung"
            java.lang.String r9 = android.os.Build.BRAND
            boolean r6 = r6.equalsIgnoreCase(r9)
            if (r6 == 0) goto L69
            java.lang.String r6 = "pa3q"
            java.lang.String r9 = android.os.Build.DEVICE
            boolean r6 = r6.equalsIgnoreCase(r9)
            if (r6 == 0) goto L69
            if (r5 != 0) goto L90
        L69:
            int r5 = r8.getWidth()
            int r6 = r7.width()
            if (r5 != r6) goto L90
            int r5 = r8.getHeight()
            int r6 = r7.height()
            if (r5 != r6) goto L90
            boolean r5 = r4.p()
            if (r5 == 0) goto L8a
            boolean r4 = r3.p(r4)
            if (r4 == 0) goto L8a
            return r1
        L8a:
            so2 r3 = r3.u
            r3.getClass()
            return r0
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y2n.Q(zd4, j3n, int, android.graphics.Rect, android.util.Size, ip7):boolean");
    }

    public final void R() {
        if (e() == null) {
            return;
        }
        L();
        j3n j3nVar = (j3n) this.h;
        to2 to2Var = this.i;
        to2Var.getClass();
        q3j q3jVarM = M(j3nVar, to2Var);
        this.v = q3jVarM;
        K(q3jVarM, this.u, this.i);
        Object[] objArr = {this.v.b()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        G(Collections.unmodifiableList(arrayList));
        r();
    }

    public final void T() {
        zd4 zd4VarE = e();
        ntk ntkVar = this.t;
        if (zd4VarE == null || ntkVar == null) {
            return;
        }
        int iN = N(zd4VarE);
        this.B = iN;
        xug.q(new py4(ntkVar, iN, c(), (byte) 2));
    }

    @Override // defpackage.qrm
    public final qsm h(boolean z, tsm tsmVar) {
        G.getClass();
        j3n j3nVar = v2n.a;
        tj5 tj5VarA = tsmVar.a(j3nVar.C(), 1);
        if (z) {
            tj5VarA = tj5.A(tj5VarA, j3nVar);
        }
        if (tj5VarA == null) {
            return null;
        }
        return new j3n(wrf.f(((nva) n(tj5VarA)).b));
    }

    @Override // defpackage.qrm
    public final Set l(xd4 xd4Var) {
        return P().g(xd4Var, 0).a();
    }

    @Override // defpackage.qrm
    public final Set m() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    @Override // defpackage.qrm
    public final psm n(tj5 tj5Var) {
        return new nva(fee.l(tj5Var), (byte) 3);
    }

    @Override // defpackage.qrm
    public final boolean o() {
        return true;
    }

    public final String toString() {
        return "VideoCapture:".concat(i());
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0111  */
    @Override // defpackage.qrm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.qsm v(defpackage.xd4 r24, defpackage.psm r25) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1091
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y2n.v(xd4, psm):qsm");
    }

    @Override // defpackage.qrm
    public final void w(int i) {
        if (D(i)) {
            T();
        }
    }

    @Override // defpackage.qrm
    public final void x() throws ExecutionException, InterruptedException {
        g();
        to2 to2Var = this.i;
        if (to2Var == null || this.x != null) {
            return;
        }
        x6f x6fVarC = P().c();
        Object obj = so2.c;
        ListenableFuture listenableFutureB = x6fVarC.b();
        if (listenableFutureB.isDone()) {
            try {
                obj = listenableFutureB.get();
            } catch (InterruptedException | ExecutionException e) {
                h9o.o(e);
                return;
            }
        }
        this.u = (so2) obj;
        q3j q3jVarM = M((j3n) this.h, to2Var);
        this.v = q3jVarM;
        K(q3jVarM, this.u, to2Var);
        Object[] objArr = {this.v.b()};
        ArrayList arrayList = new ArrayList(1);
        Object obj2 = objArr[0];
        Objects.requireNonNull(obj2);
        arrayList.add(obj2);
        G(Collections.unmodifiableList(arrayList));
        this.d = 1;
        s();
        P().c().g(x7d.l(), this.F);
        x2n x2nVar = this.C;
        if (x2nVar != null) {
            jpo.n("SourceStreamRequirementObserver can be closed from main thread only", xug.n());
            mc4 mc4Var = x2nVar.a;
            if (mc4Var != null) {
                if (x2nVar.b) {
                    x2nVar.b = false;
                    mc4Var.c();
                }
                x2nVar.a = null;
            }
        }
        mc4 mc4VarF = f();
        x2n x2nVar2 = new x2n();
        x2nVar2.b = false;
        x2nVar2.a = mc4VarF;
        this.C = x2nVar2;
        P().i().g(x7d.l(), this.C);
        if (2 != this.y) {
            this.y = 2;
            P().h(2);
        }
    }

    @Override // defpackage.qrm
    public final void y() {
        jpo.n("VideoCapture can only be detached on the main thread.", xug.n());
        if (this.C != null) {
            P().i().f(this.C);
            x2n x2nVar = this.C;
            x2nVar.getClass();
            jpo.n("SourceStreamRequirementObserver can be closed from main thread only", xug.n());
            mc4 mc4Var = x2nVar.a;
            if (mc4Var != null) {
                if (x2nVar.b) {
                    x2nVar.b = false;
                    mc4Var.c();
                }
                x2nVar.a = null;
            }
            this.C = null;
        }
        if (3 != this.y) {
            this.y = 3;
            P().h(3);
        }
        P().c().f(this.F);
        o94 o94Var = this.w;
        if (o94Var != null) {
            o94Var.cancel(false);
        }
        L();
    }

    @Override // defpackage.qrm
    public final to2 z(eb4 eb4Var) {
        this.v.b.f(eb4Var);
        Object[] objArr = {this.v.b()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        G(Collections.unmodifiableList(arrayList));
        to2 to2Var = this.i;
        Objects.requireNonNull(to2Var);
        ne5 ne5VarB = to2Var.b();
        ne5VarB.f = eb4Var;
        return ne5VarB.p();
    }
}
