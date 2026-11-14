package defpackage;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final class h5m implements f7f {
    public final v3m a;
    public final ghf b;
    public final cbl c;
    public final o4m d;
    public final f5m e;
    public vz5 f;
    public j5m g;
    public final kze h;

    /* JADX WARN: Type inference failed for: r0v0, types: [f5m] */
    public h5m(v3m v3mVar, ghf ghfVar, cbl cblVar, o4m o4mVar) {
        final byte b = 0;
        this.e = new f7f(this) { // from class: f5m
            public final /* synthetic */ h5m b;

            {
                this.b = this;
            }

            public final void d0(Object obj) throws Resources.NotFoundException {
                byte b2 = b;
                h5m h5mVar = this.b;
                switch (b2) {
                    case 0:
                        j5m j5mVar = (j5m) obj;
                        j5m j5mVar2 = h5mVar.g;
                        if (j5mVar2 != null) {
                            j5mVar2.d.p(h5mVar);
                        }
                        h5mVar.g = j5mVar;
                        j5mVar.d.k(h5mVar);
                        break;
                    default:
                        d5m d5mVar = (d5m) obj;
                        int iOrdinal = d5mVar.a.ordinal();
                        if (iOrdinal == 0) {
                            byte b3 = ((a5m) d5mVar).b;
                            int i = (b3 == 1 || b3 == 6) ? 2132019017 : 2132018403;
                            ghf ghfVar2 = h5mVar.b;
                            g5m g5mVar = new g5m(h5mVar, (byte) 1);
                            String string = ((Resources) ghfVar2.d).getString(i);
                            b2l b2lVar = ((k6l) ghfVar2.b).o;
                            if (b2lVar != null) {
                                ((aal) ghfVar2.c).S(new c4m(ghfVar2, string, 2132020924, g5mVar), b2lVar, true);
                            }
                            h5mVar.a();
                            break;
                        } else if (iOrdinal == 1) {
                            break;
                        }
                        break;
                }
            }
        };
        kze kzeVar = new kze(new b5m(2));
        this.h = kzeVar;
        this.a = v3mVar;
        this.b = ghfVar;
        this.c = cblVar;
        this.d = o4mVar;
        final byte b2 = 1;
        kzeVar.k(new f7f(this) { // from class: f5m
            public final /* synthetic */ h5m b;

            {
                this.b = this;
            }

            public final void d0(Object obj) throws Resources.NotFoundException {
                byte b22 = b2;
                h5m h5mVar = this.b;
                switch (b22) {
                    case 0:
                        j5m j5mVar = (j5m) obj;
                        j5m j5mVar2 = h5mVar.g;
                        if (j5mVar2 != null) {
                            j5mVar2.d.p(h5mVar);
                        }
                        h5mVar.g = j5mVar;
                        j5mVar.d.k(h5mVar);
                        break;
                    default:
                        d5m d5mVar = (d5m) obj;
                        int iOrdinal = d5mVar.a.ordinal();
                        if (iOrdinal == 0) {
                            byte b3 = ((a5m) d5mVar).b;
                            int i = (b3 == 1 || b3 == 6) ? 2132019017 : 2132018403;
                            ghf ghfVar2 = h5mVar.b;
                            g5m g5mVar = new g5m(h5mVar, (byte) 1);
                            String string = ((Resources) ghfVar2.d).getString(i);
                            b2l b2lVar = ((k6l) ghfVar2.b).o;
                            if (b2lVar != null) {
                                ((aal) ghfVar2.c).S(new c4m(ghfVar2, string, 2132020924, g5mVar), b2lVar, true);
                            }
                            h5mVar.a();
                            break;
                        } else if (iOrdinal == 1) {
                            break;
                        }
                        break;
                }
            }
        });
    }

    public final void a() {
        j5m j5mVar;
        kze kzeVar = this.h;
        if (((d5m) kzeVar.g()).a()) {
            return;
        }
        if (this.f == null || (j5mVar = this.g) == null) {
            kzeVar.r(new b5m(2));
        } else {
            j5mVar.c();
        }
    }

    public final void b(vz5 vz5Var) {
        vz5 vz5Var2 = this.f;
        f5m f5mVar = this.e;
        if (vz5Var2 != null) {
            ((kze) vz5Var2.f).p(f5mVar);
        }
        this.f = vz5Var;
        if (vz5Var != null) {
            ((kze) vz5Var.f).k(f5mVar);
            return;
        }
        j5m j5mVar = this.g;
        if (j5mVar != null) {
            j5mVar.d.p(this);
        }
        this.g = null;
        a();
    }

    public final void c(String str, String str2) throws Resources.NotFoundException {
        vz5 vz5Var;
        if (!v3m.f(this.a.a)) {
            a();
            return;
        }
        if (((d5m) this.h.g()).b()) {
            return;
        }
        if (str == null || str2 == null) {
            g5m g5mVar = new g5m(this, (byte) 0);
            ghf ghfVar = this.b;
            String string = ((Resources) ghfVar.d).getString(2132018403);
            b2l b2lVar = ((k6l) ghfVar.b).o;
            if (b2lVar == null) {
                return;
            }
            ((aal) ghfVar.c).S(new c4m(ghfVar, string, 2132020924, g5mVar), b2lVar, true);
            return;
        }
        if (str.equals(str2) || (vz5Var = this.f) == null) {
            return;
        }
        kze kzeVar = (kze) vz5Var.f;
        j5m j5mVar = (j5m) kzeVar.g();
        Runnable runnable = j5mVar.j;
        if (runnable != null) {
            runnable.run();
            j5mVar.j = null;
        }
        int i = vz5Var.a;
        vz5Var.a = i + 1;
        j5m j5mVar2 = new j5m(vz5Var, i, str, str2, (oji) vz5Var.e, 3, 10000L);
        kzeVar.r(j5mVar2);
        vz5Var.b = j5mVar2.a;
        vz5Var.b();
    }

    public final void d0(Object obj) {
        d5m d5mVar = (d5m) obj;
        j5m j5mVar = this.g;
        kze kzeVar = this.h;
        if (j5mVar == null) {
            kzeVar.r(new a5m(7));
        } else {
            if (d5mVar.equals((d5m) kzeVar.g())) {
                return;
            }
            kzeVar.r(d5mVar);
        }
    }
}
