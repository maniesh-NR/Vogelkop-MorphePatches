package defpackage;

/* loaded from: classes.dex */
public abstract class e1g extends f1g implements t6j {
    public final hx5 c;
    public boolean d;

    public e1g(int i) {
        super(i);
        this.c = new hx5(this.b, new o5f((Object) this, (byte) 21));
        this.d = true;
    }

    public ix4 b(hx4 hx4Var) {
        if (this.d) {
            return hx4Var.a();
        }
        hx4Var.c.clear();
        return hx4Var.a();
    }

    @Override // defpackage.v6j
    public final hx5 c() {
        return this.c;
    }

    @Override // defpackage.v6j
    public final void e() {
        super.e();
        r6j r6jVarG = g(this.a);
        this.d = r6jVarG.h;
        this.b.n(r6jVarG);
    }

    public r6j g(int i) {
        x6j x6jVar = new x6j(d8j.class, new ve5((byte) 3));
        y2 y2Var = new y2((byte) 0);
        l08 l08Var = l08.a;
        return new r6j(i, x6jVar, z2.a, new p6j(2132021062), 2131232118, true, true, true, y2Var, l08Var);
    }
}
