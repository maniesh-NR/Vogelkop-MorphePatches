package defpackage;

/* loaded from: classes.dex */
public final class wue implements u82 {
    public final h7f a = new h7f();
    public final tw2 b;
    public a53 c;
    public boolean d;
    public boolean e;

    public wue(tw2 tw2Var) {
        this.b = tw2Var;
    }

    @Override // defpackage.u82
    public final void a(rw8 rw8Var) {
        if (this.a.b(rw8Var)) {
            a53 a53Var = this.c;
            if (a53Var != null) {
                rw8Var.a(((xqe) a53Var.a.b.b).a());
                return;
            }
            this.e = false;
            if (this.d) {
                return;
            }
            this.d = true;
            ((xqe) this.b.b).n(new fv2(this, (byte) 7));
        }
    }

    @Override // defpackage.u82
    public final void b(rw8 rw8Var) {
        h7f h7fVar = this.a;
        if (h7fVar.c(rw8Var) && h7fVar.isEmpty()) {
            if (this.d) {
                this.e = true;
                return;
            }
            a53 a53Var = this.c;
            if (a53Var != null) {
                ((xqe) this.b.b).b.c(a53Var);
                this.c = null;
            }
        }
    }
}
