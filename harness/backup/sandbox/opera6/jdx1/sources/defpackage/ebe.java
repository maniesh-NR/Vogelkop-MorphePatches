package defpackage;

/* loaded from: classes.dex */
public final class ebe implements dx7 {
    public final g1g a;
    public final fbe b;
    public final String c;
    public final int d;
    public final String e;
    public hyl f;
    public String g;
    public byte h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public ebe(String str, int i, String str2) {
        g1g g1gVar = new g1g(4);
        this.a = g1gVar;
        g1gVar.a[0] = -1;
        this.b = new fbe();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.dx7
    public final void a(g1g g1gVar) {
        this.f.getClass();
        while (g1gVar.a() > 0) {
            byte b = this.h;
            g1g g1gVar2 = this.a;
            if (b == 0) {
                byte[] bArr = g1gVar.a;
                int i = g1gVar.b;
                int i2 = g1gVar.c;
                while (true) {
                    if (i >= i2) {
                        g1gVar.N(i2);
                        break;
                    }
                    byte b2 = bArr[i];
                    boolean z = (b2 & 255) == 255;
                    boolean z2 = this.k && (b2 & 224) == 224;
                    this.k = z;
                    if (z2) {
                        g1gVar.N(i + 1);
                        this.k = false;
                        g1gVar2.a[1] = bArr[i];
                        this.i = 2;
                        this.h = (byte) 1;
                        break;
                    }
                    i++;
                }
            } else if (b == 1) {
                int iMin = Math.min(g1gVar.a(), 4 - this.i);
                g1gVar.k(g1gVar2.a, this.i, iMin);
                int i3 = this.i + iMin;
                this.i = i3;
                if (i3 >= 4) {
                    g1gVar2.N(0);
                    int iM = g1gVar2.m();
                    fbe fbeVar = this.b;
                    if (fbeVar.a(iM)) {
                        this.m = fbeVar.c;
                        if (!this.j) {
                            this.l = (fbeVar.g * 1000000) / fbeVar.d;
                            nj9 nj9Var = new nj9();
                            nj9Var.a = this.g;
                            nj9Var.l = dzd.p(this.e);
                            nj9Var.m = dzd.p(fbeVar.b);
                            nj9Var.n = 4096;
                            nj9Var.E = fbeVar.e;
                            nj9Var.F = fbeVar.d;
                            nj9Var.d = this.c;
                            nj9Var.f = this.d;
                            this.f.g(new oj9(nj9Var));
                            this.j = true;
                        }
                        g1gVar2.N(0);
                        this.f.f(4, g1gVar2);
                        this.h = (byte) 2;
                    } else {
                        this.i = 0;
                        this.h = (byte) 1;
                    }
                }
            } else {
                if (b != 2) {
                    h9o.e();
                    return;
                }
                int iMin2 = Math.min(g1gVar.a(), this.m - this.i);
                this.f.f(iMin2, g1gVar);
                int i4 = this.i + iMin2;
                this.i = i4;
                if (i4 >= this.m) {
                    z4o.H(this.n != -9223372036854775807L);
                    this.f.a(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = (byte) 0;
                }
            }
        }
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
        this.f = en8Var.track(s7mVar.d, 1);
    }

    @Override // defpackage.dx7
    public final void d(int i, long j) {
        this.n = j;
    }

    @Override // defpackage.dx7
    public final void seek() {
        this.h = (byte) 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }
}
