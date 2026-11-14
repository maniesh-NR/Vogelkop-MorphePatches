package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class pb5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ivh b;
    public final /* synthetic */ owh c;
    public final /* synthetic */ long d;
    public final /* synthetic */ w61 e;

    public /* synthetic */ pb5(ivh ivhVar, owh owhVar, long j, w61 w61Var, byte b) {
        this.a = b;
        this.b = ivhVar;
        this.c = owhVar;
        this.d = j;
        this.e = w61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        w61 w61Var = this.e;
        long j = this.d;
        owh owhVar = this.c;
        ivh ivhVar = this.b;
        switch (b) {
            case 0:
                ivhVar.D(owhVar, j, w61Var);
                break;
            default:
                ivhVar.s(owhVar, j, w61Var);
                break;
        }
    }
}
