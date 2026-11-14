package defpackage;

/* loaded from: classes.dex */
public final class bf7 implements qe7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bf7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void f(re7 re7Var) {
    }

    private final void g(re7 re7Var) {
    }

    private final void h(re7 re7Var) {
    }

    private final void i(re7 re7Var) {
    }

    private final void j(re7 re7Var) {
    }

    private final void k(re7 re7Var) {
    }

    @Override // defpackage.qe7
    public final void a(re7 re7Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                cf7 cf7Var = (cf7) obj;
                if (((re7) cf7Var.d).l()) {
                    cf7Var.b(hjm.b, 3);
                    break;
                }
                break;
            case 1:
                ((nf7) obj).b();
                break;
            default:
                rf7 rf7Var = (rf7) obj;
                h7f h7fVar = rf7Var.b;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((qf7) g7fVarH.next()).a(re7Var);
                }
                if (!re7Var.j() && !rf7Var.k) {
                    rf7Var.k = true;
                    vml.c(new of7(rf7Var, (byte) 0));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.qe7
    public final void b(re7 re7Var) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                h7f h7fVar = ((rf7) this.b).b;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((qf7) g7fVarH.next()).b(re7Var);
                }
                break;
        }
    }

    @Override // defpackage.qe7
    public final void c(re7 re7Var) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                h7f h7fVar = ((rf7) this.b).b;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((qf7) g7fVarH.next()).c(re7Var);
                }
                break;
        }
    }

    @Override // defpackage.qe7
    public final void e(re7 re7Var) {
        switch (this.a) {
            case 0:
                cf7 cf7Var = (cf7) this.b;
                if (((re7) cf7Var.d).l()) {
                    cf7Var.b(hjm.b, 3);
                    break;
                }
                break;
        }
    }
}
