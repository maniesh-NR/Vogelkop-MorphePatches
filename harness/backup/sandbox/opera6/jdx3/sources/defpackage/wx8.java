package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class wx8 implements q8j {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public wx8(uqe uqeVar, String str) {
        this.b = str;
        Objects.requireNonNull(uqeVar);
        this.c = uqeVar;
    }

    public wx8(uy8 uy8Var, stm stmVar) {
        this.b = stmVar;
        this.c = uy8Var;
    }

    private final void b() {
    }

    @Override // defpackage.q8j
    public final void a() {
        switch (this.a) {
            case 0:
                ((stm) this.b).b(((uy8) this.c).I);
                break;
        }
    }

    @Override // defpackage.q8j
    public final void c(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                uy8 uy8Var = (uy8) obj2;
                uy8Var.a = (qtm) obj;
                if (uy8Var.j) {
                    uy8Var.o.c(false);
                }
                uy8Var.p.c(false);
                break;
            default:
                nre nreVar = (nre) obj;
                uqe uqeVar = (uqe) obj2;
                if (uqeVar.o == this) {
                    uqeVar.o = null;
                    if (nreVar != null) {
                        uqeVar.c(nreVar, (String) this.b);
                        break;
                    }
                }
                break;
        }
    }
}
