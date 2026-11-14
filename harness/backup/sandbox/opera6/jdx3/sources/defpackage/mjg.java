package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class mjg implements od3 {
    public final /* synthetic */ okg a;

    @Override // defpackage.od3
    public final void c(Integer num, qjd qjdVar) {
        okg okgVar = this.a;
        egd egdVarC = okgVar.c(qjdVar);
        if (egdVarC == null || egdVarC.e == Integer.MIN_VALUE) {
            return;
        }
        okgVar.c.remove(num.intValue());
        okgVar.b.b();
    }
}
