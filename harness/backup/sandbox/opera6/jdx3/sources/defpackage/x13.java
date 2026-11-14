package defpackage;

/* loaded from: classes.dex */
public final class x13 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z13 b;

    public /* synthetic */ x13(z13 z13Var, byte b) {
        this.a = b;
        this.b = z13Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        z13 z13Var = this.b;
        switch (b) {
            case 0:
                guo guoVar = z13Var.d;
                if (guoVar != null) {
                    guoVar.a();
                }
                z13Var.d = null;
                guo guoVar2 = z13Var.h;
                if (guoVar2 != null) {
                    guoVar2.a();
                }
                z13Var.h = null;
                z13Var.i = false;
                break;
            case 1:
                z13Var.e();
                break;
            default:
                z13Var.e();
                break;
        }
    }
}
