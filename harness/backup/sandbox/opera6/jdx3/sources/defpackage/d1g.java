package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class d1g extends f1g implements s6j {
    public final hx5 c;
    public final kak d;
    public boolean e;

    public d1g(ekc ekcVar, int i) {
        super(i);
        this.c = new hx5(this.b, new o5f(this, (byte) 20));
        this.d = new kak(i, ekcVar, new isd(this, (byte) 11));
        this.e = true;
    }

    @Override // defpackage.s6j
    public ix4 a(hx4 hx4Var, Object obj) {
        if (this.e) {
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
        kak kakVar = this.d;
        kakVar.b.k(kakVar.d);
    }

    @Override // defpackage.v6j
    public final void f() {
        kak kakVar = this.d;
        kakVar.b.p(kakVar.d);
    }

    public r6j g(int i, Object obj) {
        return new r6j(i, new x6j(d8j.class, new ve5((byte) 27)), 2132021102, 2132021103, 2131231984, false, (Function1) new z3(this, (byte) 23), 96);
    }
}
