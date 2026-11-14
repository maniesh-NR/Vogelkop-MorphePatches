package defpackage;

/* loaded from: classes.dex */
public final class fwf implements ndc, idc {
    public final tcc a;
    public final qdc b = new qdc(this, true);
    public boolean c;

    public fwf(tcc tccVar) {
        this.a = tccVar;
    }

    public final void E(ndc ndcVar, occ occVar) {
        b();
    }

    public final void a(boolean z) {
        if (z == this.c) {
            return;
        }
        tcc tccVar = this.a;
        if (z) {
            tccVar.a(this);
        } else {
            tccVar.b(this);
        }
        this.c = z;
        b();
    }

    public final void b() {
        boolean z = this.c;
        qdc qdcVar = this.a;
        this.b.g((z || qdcVar.i == qcc.a) ? qdcVar.i : qcc.c);
    }

    public final tcc getLifecycle() {
        return this.b;
    }
}
