package defpackage;

/* loaded from: classes.dex */
public final class nml {
    public final umi a;
    public final n5o b;
    public final rmi c;
    public oml d;

    public nml(umi umiVar, n5o n5oVar, rmi rmiVar) {
        this.a = umiVar;
        this.b = n5oVar;
        this.c = rmiVar;
    }

    public final oml a(Object obj) {
        oml omlVar = new oml(this);
        omlVar.a(obj, null);
        return omlVar;
    }

    public final void b(nml nmlVar) {
        nmlVar.getClass();
        oml omlVar = new oml(nmlVar);
        if (this.d == null) {
            this.d = omlVar;
        } else {
            h9o.e();
        }
    }

    public final oml c(n5o n5oVar) {
        b(this.a.f(n5oVar));
        return new oml(this);
    }
}
