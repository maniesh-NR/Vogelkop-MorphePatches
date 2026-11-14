package defpackage;

import ads_mobile_sdk.pd;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class snn implements tnn {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, pd.h1, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final en8 a;
    public final hyl b;
    public final pw7 c;
    public final int d;
    public final byte[] e;
    public final g1g f;
    public final int g;
    public final oj9 h;
    public int i;
    public long j;
    public int k;
    public long l;

    public snn(en8 en8Var, hyl hylVar, pw7 pw7Var) throws s1g {
        this.a = en8Var;
        this.b = hylVar;
        this.c = pw7Var;
        int i = pw7Var.c;
        int iMax = Math.max(1, i / 10);
        this.g = iMax;
        g1g g1gVar = new g1g((byte[]) pw7Var.f);
        g1gVar.t();
        int iT = g1gVar.t();
        this.d = iT;
        int i2 = pw7Var.b;
        int i3 = pw7Var.d;
        int i4 = (((i3 - (i2 << 2)) << 3) / (pw7Var.e * i2)) + 1;
        if (iT != i4) {
            throw s1g.d("Expected frames per block: " + i4 + "; got: " + iT, null);
        }
        int iG = tym.g(iMax, iT);
        this.e = new byte[iG * i3];
        this.f = new g1g((iT << 1) * i2 * iG);
        int i5 = ((i3 * i) << 3) / iT;
        nj9 nj9Var = new nj9();
        nj9Var.m = dzd.p("audio/raw");
        nj9Var.h = i5;
        nj9Var.i = i5;
        nj9Var.n = (iMax << 1) * i2;
        nj9Var.E = i2;
        nj9Var.F = i;
        nj9Var.G = 2;
        this.h = new oj9(nj9Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0021, code lost:
    
        r9 = true;
     */
    @Override // defpackage.tnn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.lp6 r26, long r27) throws java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.snn.a(lp6, long):boolean");
    }

    @Override // defpackage.tnn
    public final void b(int i, long j) {
        wnn wnnVar = new wnn(this.c, this.d, i, j);
        this.a.h(wnnVar);
        oj9 oj9Var = this.h;
        hyl hylVar = this.b;
        hylVar.g(oj9Var);
        hylVar.e(wnnVar.e);
    }

    @Override // defpackage.tnn
    public final void c(long j) {
        this.i = 0;
        this.j = j;
        this.k = 0;
        this.l = 0L;
    }

    public final void d(int i) {
        long j = this.j;
        long j2 = this.l;
        pw7 pw7Var = this.c;
        long j3 = pw7Var.c;
        String str = tym.a;
        long jW = j + tym.W(j2, 1000000L, j3, RoundingMode.DOWN);
        int i2 = (i << 1) * pw7Var.b;
        this.b.a(jW, 1, i2, this.k - i2, null);
        this.l += i;
        this.k -= i2;
    }
}
