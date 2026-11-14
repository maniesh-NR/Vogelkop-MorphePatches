package defpackage;

/* loaded from: classes.dex */
public final class amh {
    public final qq8 a;
    public final bp b;
    public final Object c = new Object();

    public amh(qq8 qq8Var, bp bpVar) {
        this.a = qq8Var;
        this.b = bpVar;
    }

    public final void a(long j) {
        synchronized (this.c) {
            tr3 tr3Var = (tr3) this.a.c;
            tr3Var.a = j;
            tr3Var.p(j);
        }
    }
}
