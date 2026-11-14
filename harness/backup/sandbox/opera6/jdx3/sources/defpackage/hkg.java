package defpackage;

/* loaded from: classes.dex */
public abstract class hkg implements f7f {
    public gig a;
    public eig b;

    public void a(xbf xbfVar) {
        this.a = (gig) ((ode) xbfVar.c).g();
        ((ode) xbfVar.c).k(this);
        eig eigVar = this.b;
        if (eigVar != null) {
            this.a.S(eigVar);
        }
    }

    public void b(xbf xbfVar) {
        ((ode) xbfVar.c).p(this);
        eig eigVar = this.b;
        if (eigVar != null) {
            this.a.g0(eigVar);
        }
        this.a = null;
    }

    public final gig c() {
        gig gigVar = this.a;
        if (gigVar != null) {
            return gigVar;
        }
        h9o.e();
        return null;
    }

    public abstract void d(gig gigVar);

    public final void d0(Object obj) {
        gig gigVar = (gig) obj;
        gig gigVar2 = this.a;
        if (gigVar2 == gigVar) {
            return;
        }
        eig eigVar = this.b;
        if (eigVar != null) {
            gigVar2.g0(eigVar);
        }
        this.a = gigVar;
        eig eigVar2 = this.b;
        if (eigVar2 != null) {
            gigVar.S(eigVar2);
        }
        d(this.a);
    }
}
