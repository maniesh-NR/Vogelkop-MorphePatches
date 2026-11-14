package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class uea extends fgd {
    public static final AtomicInteger M = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public s14 C;
    public sfa D;
    public int E;
    public boolean F;
    public volatile boolean G;
    public boolean H;
    public csh I;
    public boolean J;
    public long K;
    public boolean L;
    public final int k;
    public final int l;
    public final Uri m;
    public final boolean n;
    public final int o;
    public final ed6 p;
    public final nd6 q;
    public final s14 r;
    public final boolean s;
    public final boolean t;
    public final pql u;
    public final rq6 v;
    public final List w;
    public final vl7 x;
    public final nua y;
    public final g1g z;

    public uea(rq6 rq6Var, ed6 ed6Var, nd6 nd6Var, oj9 oj9Var, boolean z, ed6 ed6Var2, nd6 nd6Var2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, pql pqlVar, vl7 vl7Var, s14 s14Var, nua nuaVar, g1g g1gVar, boolean z6, boolean z7, fjg fjgVar) {
        super(ed6Var, nd6Var, oj9Var, i, obj, j, j2, j3);
        this.A = z;
        this.o = i2;
        this.K = z3 ? j2 - j : -9223372036854775807L;
        this.l = i3;
        this.q = nd6Var2;
        this.p = ed6Var2;
        this.F = nd6Var2 != null;
        this.B = z2;
        this.m = uri;
        this.s = z5;
        this.u = pqlVar;
        this.t = z4;
        this.v = rq6Var;
        this.w = list;
        this.x = vl7Var;
        this.r = s14Var;
        this.y = nuaVar;
        this.z = g1gVar;
        this.L = z6;
        this.n = z7;
        a1b a1bVar = h1b.b;
        this.I = csh.e;
        this.k = M.getAndIncrement();
    }

    public static byte[] d(String str) {
        if (cqp.K0(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    public final void c(ed6 ed6Var, nd6 nd6Var, boolean z, boolean z2) {
        nd6 nd6VarB;
        boolean z3;
        int i = this.E;
        if (z) {
            z3 = i != 0;
            nd6VarB = nd6Var;
        } else {
            nd6VarB = nd6Var.b(i);
            z3 = false;
        }
        try {
            lp6 lp6VarG = g(ed6Var, nd6VarB, z2);
            if (z3) {
                lp6VarG.h(this.E, false);
            }
            while (!this.G && ((cn8) this.C.c).b(lp6VarG, s14.g) == 0) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.d.f & 16384) == 0) {
                            throw e;
                        }
                        ((cn8) this.C.c).seek(0L, 0L);
                    }
                } finally {
                    this.E = (int) (lp6VarG.d - nd6Var.e);
                }
            }
        } finally {
            oup.P(ed6Var);
        }
    }

    @Override // defpackage.rsc
    public final void cancelLoad() {
        this.G = true;
    }

    public final int e(int i) {
        z4o.H(!this.L);
        csh cshVar = this.I;
        if (i >= cshVar.d) {
            return 0;
        }
        return ((Integer) cshVar.get(i)).intValue();
    }

    public final boolean f() {
        return this.K != -9223372036854775807L;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:77|(2:79|(2:81|(2:83|(7:85|(2:87|(2:89|(1:91)(1:92))(7:93|(1:95)(1:97)|96|98|(4:100|(1:102)|103|(1:105))(1:106)|(1:108)|109))(8:110|(1:112)(8:113|(1:(2:115|(3:117|(1:119)|(1:121)(1:215))(0))(2:214|122))|(1:124)|(1:127)|128|(1:131)|130|132)|125|(0)|128|(0)|130|132)|138|198|139|140|(2:209|146)(3:147|(1:213)(2:154|211)|155))(1:133))(1:135))(1:136))(1:137)|134|138|198|139|140|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x033e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x033f, code lost:
    
        r2.f = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0342, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0343, code lost:
    
        r5 = 0;
        r2.f = 0;
        r6 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0349 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1 A[PHI: r17
      0x00d1: PHI (r17v1 long) = (r17v0 long), (r17v3 long), (r17v3 long) binds: [B:36:0x00cc, B:22:0x007e, B:34:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.lp6 g(defpackage.ed6 r32, defpackage.nd6 r33, boolean r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uea.g(ed6, nd6, boolean):lp6");
    }

    @Override // defpackage.rsc
    public final void load() {
        s14 s14Var;
        this.D.getClass();
        if (this.C == null && (s14Var = this.r) != null) {
            cn8 cn8Var = (cn8) s14Var.c;
            if ((cn8Var instanceof p7m) || (cn8Var instanceof wn9)) {
                this.C = s14Var;
                this.F = false;
            }
        }
        nd6 nd6Var = this.q;
        ed6 ed6Var = this.p;
        if (this.F) {
            ed6Var.getClass();
            nd6Var.getClass();
            c(ed6Var, nd6Var, this.B, false);
            this.E = 0;
            this.F = false;
        }
        if (this.G) {
            return;
        }
        if (!this.t) {
            c(this.i, this.b, this.A, true);
        }
        this.H = !this.G;
    }
}
