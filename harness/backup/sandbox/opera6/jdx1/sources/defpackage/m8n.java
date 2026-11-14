package defpackage;

/* loaded from: classes.dex */
public final class m8n extends p8n {
    public boolean e = false;
    public int f = 0;
    public final /* synthetic */ n8n g;

    public m8n(n8n n8nVar) {
        this.g = n8nVar;
    }

    @Override // defpackage.p8n
    public final void f() {
        if (this.e) {
            return;
        }
        this.e = true;
        p8n p8nVar = (p8n) this.g.e;
        if (p8nVar != null) {
            p8nVar.f();
        }
    }

    public final void g() {
        int i = this.f + 1;
        this.f = i;
        n8n n8nVar = this.g;
        if (i == n8nVar.a.size()) {
            p8n p8nVar = (p8n) n8nVar.e;
            if (p8nVar != null) {
                p8nVar.g();
            }
            this.f = 0;
            this.e = false;
            n8nVar.c = false;
        }
    }
}
