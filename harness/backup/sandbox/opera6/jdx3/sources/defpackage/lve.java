package defpackage;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class lve {
    public final /* synthetic */ p12 a;

    public lve(p12 p12Var) {
        this.a = p12Var;
    }

    @vkk
    public void a(@NonNull vre vreVar) {
        p12 p12Var = this.a;
        msh mshVar = (msh) ((oqe) p12Var.f);
        if (mshVar != null && mshVar.equals(vreVar.a) && ((lsh) vreVar.a.e.get()) == lsh.IGNORE) {
            p12Var.f = null;
        }
    }
}
