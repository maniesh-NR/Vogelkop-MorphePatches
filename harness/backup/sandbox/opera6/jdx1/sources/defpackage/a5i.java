package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class a5i implements ke7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e5i b;

    public /* synthetic */ a5i(e5i e5iVar, byte b) {
        this.a = b;
        this.b = e5iVar;
    }

    @Override // defpackage.ke7
    public final double d(double d) {
        byte b = this.a;
        e5i e5iVar = this.b;
        switch (b) {
            case 0:
                return djh.a(e5iVar.k.d(d), e5iVar.e, e5iVar.f);
            default:
                return e5iVar.n.d(djh.a(d, e5iVar.e, e5iVar.f));
        }
    }
}
