package defpackage;

/* loaded from: classes.dex */
public final class xwh {
    public final nbl a;
    public final o94 b;
    public final o94 c;
    public final l94 d;
    public final l94 e;
    public boolean f = false;
    public boolean g = false;
    public fr4 h;

    public xwh(bp2 bp2Var, nbl nblVar) {
        this.a = nblVar;
        l94 l94Var = new l94();
        l94Var.c = new byh();
        o94 o94Var = new o94(l94Var);
        l94Var.b = o94Var;
        try {
            this.d = l94Var;
            l94Var.a = "CaptureCompleteFuture";
        } catch (Exception e) {
            o94Var.a(e);
        }
        this.b = o94Var;
        l94 l94Var2 = new l94();
        l94Var2.c = new byh();
        o94 o94Var2 = new o94(l94Var2);
        l94Var2.b = o94Var2;
        try {
            this.e = l94Var2;
            l94Var2.a = "RequestCompleteFuture";
        } catch (Exception e2) {
            o94Var2.a(e2);
        }
        this.c = o94Var2;
    }

    public final void a() {
        jpo.n("The callback can only complete once.", !this.c.b.isDone());
        this.e.b(null);
    }
}
