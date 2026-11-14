package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class kt2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ot2 b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ kt2(ot2 ot2Var, int[] iArr, byte b) {
        this.a = b;
        this.b = ot2Var;
        this.c = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int[] iArr = this.c;
        ot2 ot2Var = this.b;
        switch (b) {
            case 0:
                ot2Var.b.e(new xk4(new oba(2, 0, iArr)), false);
                break;
            default:
                ot2Var.b.e(new a6g(new oba(2, 0, iArr)), false);
                break;
        }
    }
}
