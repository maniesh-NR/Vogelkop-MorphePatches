package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class roh implements kw1 {
    public final ide a = new ide();
    public final dee b = new dee();
    public final Object c;

    public roh(Object obj) {
        this.c = obj;
    }

    public final void a(jim jimVar, j1c j1cVar) {
        Exception exc;
        ide ideVar = this.a;
        int i = ideVar.b;
        dee deeVar = new dee();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            dee deeVar2 = this.b;
            if (i2 >= i) {
                if (i3 != deeVar2.b) {
                    mh5.a("Applier operation size mismatch");
                }
                deeVar2.d();
                ideVar.b = 0;
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (ideVar.c(i2)) {
                        case 0:
                            jimVar.u();
                            i2 = i4;
                        case 1:
                            int i5 = i3 + 1;
                            jimVar.r(deeVar2.g(i3));
                            i3 = i5;
                            i2 = i4;
                        case 2:
                            int i6 = i2 + 2;
                            i2 += 3;
                            jimVar.k(ideVar.c(i4), ideVar.c(i6));
                        case 3:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    jimVar.j(ideVar.c(i4), ideVar.c(i7), ideVar.c(i8));
                                } catch (Exception e) {
                                    exc = e;
                                    i2 = i8;
                                    break;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i2 = i7;
                                break;
                            }
                        case 4:
                            jimVar.a();
                            i2 = i4;
                        case 5:
                            i2 += 2;
                            int i9 = i3 + 1;
                            jimVar.p(ideVar.c(i4), deeVar2.g(i3));
                            i3 = i9;
                        case 6:
                            i2 += 2;
                            try {
                                ideVar.c(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (Exception e3) {
                                exc = e3;
                                break;
                            }
                        case 7:
                            int i11 = i3 + 1;
                            Object objG = deeVar2.g(i3);
                            y9m.t(2, objG);
                            i3 += 2;
                            jimVar.l(deeVar2.g(i11), (Function2) objG);
                            i2 = i4;
                        case 8:
                            Object obj = jimVar.c;
                            if (obj instanceof eg5) {
                                eg5 eg5Var = (eg5) obj;
                                if (((dfe) j1cVar.e).k(eg5Var)) {
                                    eg5Var.a();
                                }
                            }
                            deeVar.a(obj);
                            jimVar.s();
                            i2 = i4;
                        default:
                            i2 = i4;
                    }
                } catch (Exception e4) {
                    exc = e4;
                    i2 = i4;
                }
            } finally {
                jimVar.n();
            }
            exc = e3;
            throw new gg5(deeVar2, deeVar, ideVar, i2 - 1, exc);
        }
    }

    @Override // defpackage.kw1
    public final Object i() {
        return this.c;
    }

    @Override // defpackage.kw1
    public final void j(int i, int i2, int i3) {
        ide ideVar = this.a;
        ideVar.a(3);
        ideVar.a(i);
        ideVar.a(i2);
        ideVar.a(i3);
    }

    @Override // defpackage.kw1
    public final void k(int i, int i2) {
        ide ideVar = this.a;
        ideVar.a(2);
        ideVar.a(i);
        ideVar.a(i2);
    }

    @Override // defpackage.kw1
    public final void l(Object obj, Function2 function2) {
        this.a.a(7);
        dee deeVar = this.b;
        deeVar.a(function2);
        deeVar.a(obj);
    }

    @Override // defpackage.kw1
    public final void m(int i, Object obj) {
        ide ideVar = this.a;
        ideVar.a(6);
        ideVar.a(i);
        this.b.a(obj);
    }

    @Override // defpackage.kw1
    public final void p(int i, Object obj) {
        ide ideVar = this.a;
        ideVar.a(5);
        ideVar.a(i);
        this.b.a(obj);
    }

    @Override // defpackage.kw1
    public final void r(Object obj) {
        this.a.a(1);
        this.b.a(obj);
    }

    @Override // defpackage.kw1
    public final void s() {
        this.a.a(8);
    }

    @Override // defpackage.kw1
    public final void u() {
        this.a.a(0);
    }
}
