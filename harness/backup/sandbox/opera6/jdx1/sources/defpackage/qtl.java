package defpackage;

/* loaded from: classes.dex */
public final class qtl extends p8n {
    public boolean e = false;
    public final /* synthetic */ byte f;
    public final /* synthetic */ rtl g;

    /* JADX WARN: Multi-variable type inference failed */
    public qtl(rtl rtlVar, int i) {
        this.g = rtlVar;
        this.f = i;
    }

    @Override // defpackage.p8n
    public final void d() {
        this.e = true;
    }

    @Override // defpackage.p8n
    public final void f() {
        this.g.a.setVisibility(0);
    }

    public final void g() {
        if (this.e) {
            return;
        }
        this.g.a.setVisibility(this.f);
    }
}
