package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class z4h implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g5h b;

    public /* synthetic */ z4h(g5h g5hVar, byte b) {
        this.a = b;
        this.b = g5hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        g5h g5hVar = this.b;
        switch (b) {
            case 0:
                g5hVar.K = true;
                break;
            case 1:
                g5hVar.n();
                break;
            default:
                if (!g5hVar.Q) {
                    mkd mkdVar = g5hVar.s;
                    mkdVar.getClass();
                    mkdVar.j(g5hVar);
                    break;
                }
                break;
        }
    }
}
