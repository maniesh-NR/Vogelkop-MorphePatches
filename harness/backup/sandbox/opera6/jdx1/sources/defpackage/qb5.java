package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class qb5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ivh b;
    public final /* synthetic */ owh c;

    public /* synthetic */ qb5(ivh ivhVar, owh owhVar, byte b) {
        this.a = b;
        this.b = ivhVar;
        this.c = owhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.q(this.c);
                break;
            case 1:
                this.b.o(this.c);
                break;
            default:
                this.b.m(this.c);
                break;
        }
    }
}
