package defpackage;

/* loaded from: classes.dex */
public final class v9j extends h42 {
    public final u9j n;
    public final kze o = new kze(og.a);
    public boolean p;

    public v9j(u9j u9jVar) {
        this.n = u9jVar;
    }

    @Override // defpackage.h42
    public final void l() {
        super.l();
        boolean z = this.p;
        kze kzeVar = this.o;
        u9j u9jVar = this.n;
        if (!z) {
            this.p = true;
            u9jVar.m(kzeVar);
        }
        kzeVar.r(ng.a);
        u9jVar.j();
    }

    @Override // defpackage.h42
    public final void m() {
        super.m();
        this.n.onStopped();
        this.o.r(og.a);
    }
}
