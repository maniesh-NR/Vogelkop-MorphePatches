package defpackage;

/* loaded from: classes.dex */
public final class ngn extends d17 {
    public boolean d;
    public int e;
    public final /* synthetic */ sgi f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ngn(sgi sgiVar) {
        super(100L);
        this.f = sgiVar;
    }

    @Override // defpackage.d17
    public final void b() {
        boolean z = this.d;
        int i = this.e;
        sgi sgiVar = this.f;
        sgiVar.J(i, z);
        ((rdn) sgiVar.e).run();
    }
}
