package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ob4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rb4 b;
    public final /* synthetic */ owh c;

    public /* synthetic */ ob4(rb4 rb4Var, qb4 qb4Var, owh owhVar, byte b) {
        this.a = b;
        this.b = rb4Var;
        this.c = owhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e(qb4.c(this.c));
                break;
            default:
                this.b.a(qb4.c(this.c));
                break;
        }
    }
}
