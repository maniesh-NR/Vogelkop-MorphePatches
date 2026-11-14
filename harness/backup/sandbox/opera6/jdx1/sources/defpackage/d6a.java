package defpackage;

/* loaded from: classes.dex */
public final class d6a implements dx7 {
    public final ghf a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public hyl j;
    public c6a k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final ahe d = new ahe(7);
    public final ahe e = new ahe(8);
    public final ahe f = new ahe(6);
    public long m = -9223372036854775807L;
    public final g1g o = new g1g();

    public d6a(ghf ghfVar, boolean z, boolean z2) {
        this.a = ghfVar;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.dx7
    public final void a(g1g g1gVar) {
        int i;
        this.j.getClass();
        String str = tym.a;
        int i2 = g1gVar.b;
        int i3 = g1gVar.c;
        byte[] bArr = g1gVar.a;
        this.g += g1gVar.a();
        this.j.f(g1gVar.a(), g1gVar);
        while (true) {
            int iA = qyn.A(bArr, i2, i3, this.h);
            if (iA == i3) {
                f(bArr, i2, i3);
                return;
            }
            int i4 = bArr[iA + 3] & 31;
            if (iA <= 0 || bArr[iA - 1] != 0) {
                i = 3;
            } else {
                iA--;
                i = 4;
            }
            int i5 = iA;
            int i6 = i;
            int i7 = i5 - i2;
            if (i7 > 0) {
                f(bArr, i2, i5);
            }
            int i8 = i3 - i5;
            long j = this.g - i8;
            e(j, i8, i7 < 0 ? -i7 : 0, this.m);
            g(j, i4, this.m);
            i2 = i5 + i6;
        }
    }

    @Override // defpackage.dx7
    public final void b(boolean z) {
        this.j.getClass();
        String str = tym.a;
        if (z) {
            ((pr) this.a.d).m(0);
            e(this.g, 0, 0, this.m);
            g(this.g, 9, this.m);
            e(this.g, 0, 0, this.m);
        }
    }

    @Override // defpackage.dx7
    public final void c(en8 en8Var, s7m s7mVar) {
        s7mVar.a();
        s7mVar.b();
        this.i = s7mVar.e;
        s7mVar.b();
        hyl hylVarTrack = en8Var.track(s7mVar.d, 2);
        this.j = hylVarTrack;
        this.k = new c6a(hylVarTrack, this.b, this.c);
        this.a.q(en8Var, s7mVar);
    }

    @Override // defpackage.dx7
    public final void d(int i, long j) {
        this.m = j;
        this.n |= (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r23, int r25, int r26, long r27) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d6a.e(long, int, int, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d6a.f(byte[], int, int):void");
    }

    public final void g(long j, int i, long j2) {
        if (!this.l || this.k.c) {
            this.d.d(i);
            this.e.d(i);
        }
        this.f.d(i);
        c6a c6aVar = this.k;
        boolean z = this.n;
        c6aVar.i = i;
        c6aVar.l = j2;
        c6aVar.j = j;
        c6aVar.s = z;
        if (!c6aVar.b || i != 1) {
            if (!c6aVar.c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        b6a b6aVar = c6aVar.m;
        c6aVar.m = c6aVar.n;
        c6aVar.n = b6aVar;
        b6aVar.b = false;
        b6aVar.a = false;
        c6aVar.h = 0;
        c6aVar.k = true;
    }

    @Override // defpackage.dx7
    public final void seek() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        qyn.o(this.h);
        this.d.c();
        this.e.c();
        this.f.c();
        ((pr) this.a.d).m(0);
        c6a c6aVar = this.k;
        if (c6aVar != null) {
            c6aVar.k = false;
            c6aVar.o = false;
            b6a b6aVar = c6aVar.n;
            b6aVar.b = false;
            b6aVar.a = false;
        }
    }
}
