package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class pz implements dx7 {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public hyl h;
    public hyl i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public hyl v;
    public long w;
    public final bq4 b = new bq4(new byte[7], 7);
    public final g1g c = new g1g(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public byte j = 0;
    public int k = 0;
    public short l = 256;

    public pz(String str, int i, String str2, boolean z) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0295, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0296, code lost:
    
        r23.m = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x029a, code lost:
    
        if (r23.n != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x029c, code lost:
    
        r23.j = 1;
        r23.k = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02a3, code lost:
    
        r23.j = r17;
        r23.k = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02aa, code lost:
    
        r24.N(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0289, code lost:
    
        r23.q = (r8 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0291, code lost:
    
        if ((r8 & 1) != 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0293, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r8v16 */
    @Override // defpackage.dx7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.g1g r24) throws defpackage.s1g {
        /*
            Method dump skipped, instructions count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz.a(g1g):void");
    }

    @Override // defpackage.dx7
    public final void b(boolean z) {
    }

    @Override // defpackage.dx7
    public final void c(en8 en8Var, s7m s7mVar) {
        s7mVar.a();
        s7mVar.b();
        this.g = s7mVar.e;
        s7mVar.b();
        hyl hylVarTrack = en8Var.track(s7mVar.d, 1);
        this.h = hylVarTrack;
        this.v = hylVarTrack;
        if (!this.a) {
            this.i = new s97();
            return;
        }
        s7mVar.a();
        s7mVar.b();
        hyl hylVarTrack2 = en8Var.track(s7mVar.d, 5);
        this.i = hylVarTrack2;
        nj9 nj9Var = new nj9();
        s7mVar.b();
        nj9Var.a = s7mVar.e;
        nj9Var.l = dzd.p(this.f);
        nj9Var.m = dzd.p("application/id3");
        z1m.q(nj9Var, hylVarTrack2);
    }

    @Override // defpackage.dx7
    public final void d(int i, long j) {
        this.u = j;
    }

    @Override // defpackage.dx7
    public final void seek() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = (byte) 0;
        this.k = 0;
        this.l = (short) 256;
    }
}
