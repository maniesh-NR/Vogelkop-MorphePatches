package defpackage;

import java.util.Collections;

/* loaded from: classes.dex */
public final class f6a implements dx7 {
    public final ghf a;
    public String b;
    public hyl c;
    public e6a d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final ahe g = new ahe(32);
    public final ahe h = new ahe(33);
    public final ahe i = new ahe(34);
    public final ahe j = new ahe(39);
    public final ahe k = new ahe(40);
    public long m = -9223372036854775807L;
    public final g1g n = new g1g();

    public f6a(ghf ghfVar) {
        this.a = ghfVar;
    }

    @Override // defpackage.dx7
    public final void a(g1g g1gVar) {
        int i;
        this.c.getClass();
        String str = tym.a;
        while (g1gVar.a() > 0) {
            int i2 = g1gVar.b;
            int i3 = g1gVar.c;
            byte[] bArr = g1gVar.a;
            this.l += g1gVar.a();
            this.c.f(g1gVar.a(), g1gVar);
            while (i2 < i3) {
                int iA = qyn.A(bArr, i2, i3, this.f);
                if (iA == i3) {
                    f(i2, i3, bArr);
                    return;
                }
                int i4 = (bArr[iA + 3] & 126) >> 1;
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
                    f(i2, i5, bArr);
                }
                int i8 = i3 - i5;
                long j = this.l - i8;
                e(i8, i7 < 0 ? -i7 : 0, j, this.m);
                g(j, i8, i4, this.m);
                i2 = i5 + i6;
            }
        }
    }

    @Override // defpackage.dx7
    public final void b(boolean z) {
        this.c.getClass();
        String str = tym.a;
        if (z) {
            ((pr) this.a.d).m(0);
            e(0, 0, this.l, this.m);
            g(this.l, 0, 48, this.m);
        }
    }

    @Override // defpackage.dx7
    public final void c(en8 en8Var, s7m s7mVar) {
        s7mVar.a();
        s7mVar.b();
        this.b = s7mVar.e;
        s7mVar.b();
        hyl hylVarTrack = en8Var.track(s7mVar.d, 2);
        this.c = hylVarTrack;
        this.d = new e6a(hylVarTrack);
        this.a.q(en8Var, s7mVar);
    }

    @Override // defpackage.dx7
    public final void d(int i, long j) {
        this.m = j;
    }

    public final void e(int i, int i2, long j, long j2) {
        pr prVar = (pr) this.a.d;
        e6a e6aVar = this.d;
        boolean z = this.e;
        if (e6aVar.j && e6aVar.g) {
            e6aVar.m = e6aVar.c;
            e6aVar.j = false;
        } else if (e6aVar.h || e6aVar.g) {
            if (z && e6aVar.i) {
                e6aVar.a(i + ((int) (j - e6aVar.b)));
            }
            e6aVar.k = e6aVar.b;
            e6aVar.l = e6aVar.e;
            e6aVar.m = e6aVar.c;
            e6aVar.i = true;
        }
        if (!this.e) {
            ahe aheVar = this.g;
            aheVar.b(i2);
            ahe aheVar2 = this.h;
            aheVar2.b(i2);
            ahe aheVar3 = this.i;
            aheVar3.b(i2);
            if (aheVar.c && aheVar2.c && aheVar3.c) {
                String str = this.b;
                int i3 = aheVar.e;
                byte[] bArr = new byte[aheVar2.e + i3 + aheVar3.e];
                System.arraycopy(aheVar.d, 0, bArr, 0, i3);
                System.arraycopy(aheVar2.d, 0, bArr, aheVar.e, aheVar2.e);
                System.arraycopy(aheVar3.d, 0, bArr, aheVar.e + aheVar2.e, aheVar3.e);
                ehe eheVarZ = qyn.Z(aheVar2.d, 3, aheVar2.e, null);
                che cheVar = eheVarZ.b;
                String strA = cheVar != null ? j75.a(cheVar.a, cheVar.b, cheVar.c, cheVar.d, cheVar.e, cheVar.f) : null;
                nj9 nj9Var = new nj9();
                nj9Var.a = str;
                nj9Var.l = dzd.p("video/mp2t");
                nj9Var.m = dzd.p("video/hevc");
                nj9Var.j = strA;
                nj9Var.t = eheVarZ.e;
                nj9Var.u = eheVarZ.f;
                nj9Var.v = eheVarZ.g;
                nj9Var.w = eheVarZ.h;
                nj9Var.C = new ja5(eheVarZ.k, eheVarZ.l, eheVarZ.m, eheVarZ.c + 8, eheVarZ.d + 8, null);
                nj9Var.z = eheVarZ.i;
                nj9Var.o = eheVarZ.j;
                nj9Var.D = eheVarZ.a + 1;
                nj9Var.p = Collections.singletonList(bArr);
                oj9 oj9Var = new oj9(nj9Var);
                this.c.g(oj9Var);
                int i4 = oj9Var.p;
                z4o.H(i4 != -1);
                prVar.D(i4);
                this.e = true;
            }
        }
        ahe aheVar4 = this.j;
        boolean zB = aheVar4.b(i2);
        g1g g1gVar = this.n;
        if (zB) {
            g1gVar.L(aheVar4.d, qyn.m0(aheVar4.d, aheVar4.e));
            g1gVar.O(5);
            prVar.b(j2, g1gVar);
        }
        ahe aheVar5 = this.k;
        if (aheVar5.b(i2)) {
            g1gVar.L(aheVar5.d, qyn.m0(aheVar5.d, aheVar5.e));
            g1gVar.O(5);
            prVar.b(j2, g1gVar);
        }
    }

    public final void f(int i, int i2, byte[] bArr) {
        e6a e6aVar = this.d;
        if (e6aVar.f) {
            int i3 = e6aVar.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                e6aVar.g = (bArr[i4] & 128) != 0;
                e6aVar.f = false;
            } else {
                e6aVar.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    public final void g(long j, int i, int i2, long j2) {
        e6a e6aVar = this.d;
        boolean z = this.e;
        e6aVar.g = false;
        e6aVar.h = false;
        e6aVar.e = j2;
        e6aVar.d = 0;
        e6aVar.b = j;
        if (i2 >= 32 && i2 != 40) {
            if (e6aVar.i && !e6aVar.j) {
                if (z) {
                    e6aVar.a(i);
                }
                e6aVar.i = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                e6aVar.h = !e6aVar.j;
                e6aVar.j = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        e6aVar.c = z2;
        e6aVar.f = z2 || i2 <= 9;
        if (!this.e) {
            this.g.d(i2);
            this.h.d(i2);
            this.i.d(i2);
        }
        this.j.d(i2);
        this.k.d(i2);
    }

    @Override // defpackage.dx7
    public final void seek() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        qyn.o(this.f);
        this.g.c();
        this.h.c();
        this.i.c();
        this.j.c();
        this.k.c();
        ((pr) this.a.d).m(0);
        e6a e6aVar = this.d;
        if (e6aVar != null) {
            e6aVar.f = false;
            e6aVar.g = false;
            e6aVar.h = false;
            e6aVar.i = false;
            e6aVar.j = false;
        }
    }
}
