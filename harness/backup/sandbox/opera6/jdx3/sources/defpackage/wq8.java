package defpackage;

/* loaded from: classes.dex */
public final class wq8 implements sq8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wq8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a(hq8 hq8Var) {
    }

    private final void b(int i, hq8 hq8Var) {
    }

    private final void c(int i, hq8 hq8Var) {
    }

    @Override // defpackage.sq8
    public final void B(int i, hq8 hq8Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ar8 ar8Var = (ar8) obj;
                if (hq8Var == ar8Var.r) {
                    ar8Var.r = null;
                    ar8Var.p.setVisibility(4);
                    ar8Var.o0();
                    break;
                }
                break;
            case 1:
                ((tlg) obj).S();
                break;
            default:
                zzj zzjVar = (zzj) obj;
                if (!hq8Var.j()) {
                    zzjVar.c.remove(hq8Var);
                    zzjVar.a.j(zzj.a(hq8Var));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.sq8
    public final void u(int i, hq8 hq8Var) {
        switch (this.a) {
            case 1:
                ((tlg) this.b).S();
                break;
        }
    }

    @Override // defpackage.sq8
    public final void w(hq8 hq8Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                ((tlg) obj).S();
                break;
            default:
                zzj zzjVar = (zzj) obj;
                if (!hq8Var.j()) {
                    if (zzjVar.c.add(hq8Var)) {
                        hq8Var.b(zzjVar.e);
                    }
                    zzjVar.a.f(zzj.a(hq8Var), null);
                    break;
                }
                break;
        }
    }
}
