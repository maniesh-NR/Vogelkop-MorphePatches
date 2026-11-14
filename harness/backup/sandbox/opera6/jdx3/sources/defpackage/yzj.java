package defpackage;

/* loaded from: classes.dex */
public final class yzj implements gq8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yzj(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.gq8
    public final void Q(hq8 hq8Var) {
        switch (this.a) {
            case 0:
                zzj zzjVar = (zzj) this.b;
                if (!hq8Var.j()) {
                    zzjVar.c.remove(hq8Var);
                    zzjVar.a.j(zzj.a(hq8Var));
                    break;
                }
                break;
            default:
                hq8Var.o(this);
                break;
        }
    }

    @Override // defpackage.gq8
    public final void r(int i, hq8 hq8Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (!hq8Var.j()) {
                    ((zzj) obj).a.m(zzj.a(hq8Var));
                    break;
                }
                break;
            default:
                if (i == 7 && !hq8Var.g().isEmpty()) {
                    hq8Var.o(this);
                    ((cpk) obj).a();
                    break;
                }
                break;
        }
    }
}
