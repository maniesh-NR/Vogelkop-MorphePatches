package defpackage;

/* loaded from: classes.dex */
public final class w26 implements z2m {
    public final jza a;
    public final short b;

    /* JADX WARN: Multi-variable type inference failed */
    public w26(jza jzaVar, int i) {
        this.a = jzaVar;
        this.b = i;
        if (i > 0) {
            return;
        }
        qp2.o("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.z2m
    public final void a() {
        jza jzaVar = this.a;
        if (jzaVar.y() != null) {
            t3p.o();
            return;
        }
        boolean z = jzaVar instanceof xnk;
        o26 o26Var = new o26(jzaVar.getRequest().m, this.b, (z && ((xnk) jzaVar).g) ? false : true);
        if (z) {
            ipe.k(o26Var);
        } else if (jzaVar instanceof l68) {
            ipe.k(o26Var);
        } else {
            h9o.p();
        }
    }
}
