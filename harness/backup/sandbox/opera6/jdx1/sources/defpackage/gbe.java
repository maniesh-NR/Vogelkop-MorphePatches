package defpackage;

/* loaded from: classes.dex */
public final class gbe implements dx7 {
    public String e;
    public hyl f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public byte d = 0;
    public final g1g a = new g1g(new byte[15], 2);
    public final bq4 b = new bq4();
    public final g1g c = new g1g();
    public final hbe p = new hbe();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    /* JADX WARN: Removed duplicated region for block: B:195:0x03e1  */
    @Override // defpackage.dx7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.g1g r26) throws defpackage.s1g {
        /*
            Method dump skipped, instructions count: 1312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gbe.a(g1g):void");
    }

    @Override // defpackage.dx7
    public final void b(boolean z) {
    }

    @Override // defpackage.dx7
    public final void c(en8 en8Var, s7m s7mVar) {
        s7mVar.a();
        s7mVar.b();
        this.e = s7mVar.e;
        s7mVar.b();
        this.f = en8Var.track(s7mVar.d, 1);
    }

    @Override // defpackage.dx7
    public final void d(int i, long j) {
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.i) {
                this.h = j;
            } else {
                this.g = j;
            }
        }
    }

    @Override // defpackage.dx7
    public final void seek() {
        this.d = (byte) 0;
        this.l = 0;
        this.a.K(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }
}
