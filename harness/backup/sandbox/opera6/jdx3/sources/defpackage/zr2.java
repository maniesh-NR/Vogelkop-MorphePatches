package defpackage;

/* loaded from: classes.dex */
public final class zr2 implements c7d {
    public final /* synthetic */ byte a;
    public final /* synthetic */ as2 b;

    public /* synthetic */ zr2(as2 as2Var, byte b) {
        this.a = b;
        this.b = as2Var;
    }

    private final void a(int i) {
    }

    @Override // defpackage.c7d
    public final void c(int i) {
        switch (this.a) {
            case 0:
                kd6 kd6Var = kd6.a;
                as2 as2Var = this.b;
                as2Var.a = kd6Var;
                as2Var.b(new rw7(jd6.b));
                break;
        }
    }

    @Override // defpackage.c7d
    public final void onSuccess() {
        byte b = this.a;
        as2 as2Var = this.b;
        switch (b) {
            case 0:
                as2Var.c = new vk1((byte) 22);
                as2Var.a = kd6.c;
                as2Var.b(new sw7(as2Var));
                break;
            default:
                t3g t3gVar = as2Var.d;
                if (!(t3gVar instanceof yr2)) {
                    as2Var.c = new vk1((byte) 21);
                    break;
                } else {
                    ((yr2) t3gVar).a = new p3g();
                    break;
                }
        }
    }
}
