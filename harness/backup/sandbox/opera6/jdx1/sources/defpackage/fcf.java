package defpackage;

/* loaded from: classes.dex */
public final class fcf extends zje {
    public final gcf f;
    public boolean g;

    public fcf(gcf gcfVar, hcf hcfVar) {
        super(hcfVar, gcfVar.isEnabled());
        this.f = gcfVar;
        this.g = true;
    }

    @Override // defpackage.zje
    public final void a() {
        this.f.handleOnBackCancelled();
    }

    @Override // defpackage.zje
    public final void b() {
        this.f.handleOnBackPressed();
    }

    @Override // defpackage.zje
    public final void c(wje wjeVar) {
        this.f.handleOnBackProgressed(new jz2(wjeVar));
    }

    @Override // defpackage.zje
    public final void d(wje wjeVar) {
        this.f.handleOnBackStarted(new jz2(wjeVar));
    }

    public final void g(boolean z) {
        this.g = z;
        f(z && this.f.isEnabled());
    }
}
