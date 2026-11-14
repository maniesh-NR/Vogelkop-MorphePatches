package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class a15 extends lze {
    public final /* synthetic */ bre c;
    public final /* synthetic */ c15 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a15(c15 c15Var, c15 c15Var2, bre breVar) {
        super(c15Var2);
        this.c = breVar;
        Objects.requireNonNull(c15Var);
        this.d = c15Var;
    }

    @Override // defpackage.lze
    public final void b(Object obj) {
        c15 c15Var = this.d;
        q8j q8jVar = c15Var.n;
        ta7 ta7Var = c15Var.j;
        if (q8jVar == this) {
            c15Var.n = null;
            bre breVarT = ta7Var.t();
            bre breVar = this.c;
            if (breVar.equals(breVarT) && ta7Var.u()) {
                return;
            }
            ta7Var.y(ta7Var.n(), breVar, true);
            c15Var.c();
        }
    }
}
