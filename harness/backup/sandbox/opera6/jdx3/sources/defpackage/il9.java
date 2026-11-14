package defpackage;

/* loaded from: classes.dex */
public final class il9 implements Runnable {
    public boolean a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ ll9 c;

    public /* synthetic */ il9(ll9 ll9Var, byte b) {
        this.b = b;
        this.c = ll9Var;
    }

    public final void a() {
        byte b = this.b;
        ll9 ll9Var = this.c;
        switch (b) {
            case 0:
                ll9Var.a();
                if (ll9Var.h <= 0 && ll9Var.i <= 0) {
                    ll9Var.c.a();
                    break;
                }
                break;
            case 1:
                qim qimVar = ll9Var.c;
                qimVar.e(qimVar.d());
                break;
            default:
                ll9Var.c.a();
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = false;
        a();
    }
}
