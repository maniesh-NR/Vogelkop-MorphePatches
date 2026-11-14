package defpackage;

/* loaded from: classes.dex */
public final class kj4 implements ivh {
    public final /* synthetic */ cd5 a;

    public kj4(cd5 cd5Var) {
        this.a = cd5Var;
    }

    @Override // defpackage.ivh
    public final void E(lvh lvhVar) {
        this.a.B0(new gwa(3, "Capture request is cancelled because camera is closed", (Throwable) null));
    }

    @Override // defpackage.ivh
    public final void s(owh owhVar, long j, w61 w61Var) {
        this.a.j0((Object) null);
    }

    @Override // defpackage.ivh
    public final void t(owh owhVar, long j, hwh hwhVar) {
        this.a.B0(new gwa(2, "Capture request failed with reason " + hwhVar.getReason(), (Throwable) null));
    }
}
