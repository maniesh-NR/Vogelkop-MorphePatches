package defpackage;

/* loaded from: classes.dex */
public abstract class cx4 extends ex4 implements s6j {
    public final hx5 f;
    public final kak g;

    public cx4(ekc ekcVar, int i) {
        super(i);
        this.f = new hx5(this.b, new bo3(this, (byte) 19));
        this.g = new kak(i, ekcVar, new u59(this, (byte) 23));
    }

    @Override // defpackage.v6j
    public final hx5 c() {
        return this.f;
    }

    @Override // defpackage.v6j
    public final void e() {
        super.e();
        kak kakVar = this.g;
        kakVar.b.k(kakVar.d);
    }

    @Override // defpackage.v6j
    public final void f() {
        kak kakVar = this.g;
        kakVar.b.p(kakVar.d);
    }

    @Override // defpackage.ex4
    public final void g(r6j r6jVar) {
        kak kakVar = this.g;
        Object objG = kakVar.b.g();
        if (objG == null) {
            return;
        }
        kakVar.c.y(objG);
    }

    public r6j h(r6j r6jVar, Object obj, int i) {
        return r6j.b(r6jVar, i, new x6j(g0c.class, new a7b((h1c) obj, (byte) 1)), 2132021237, 0, new nna(this, (byte) 13), 24);
    }
}
