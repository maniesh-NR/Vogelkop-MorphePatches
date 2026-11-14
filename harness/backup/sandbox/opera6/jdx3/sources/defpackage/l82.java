package defpackage;

/* loaded from: classes.dex */
public final class l82 extends z7 {
    public final /* synthetic */ g92 h;
    public final /* synthetic */ n82 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l82(n82 n82Var, String str, g92 g92Var) {
        super(str, "", (byte) 1);
        this.h = g92Var;
        this.i = n82Var;
    }

    @Override // defpackage.z7
    public final String a() {
        g92 g92Var = this.h;
        return g92Var != null ? (String) g92Var.get() : "";
    }

    @Override // defpackage.z7
    public final boolean b() {
        return true;
    }

    @Override // defpackage.z7
    public final void c(fvh fvhVar) {
        super.c(fvhVar);
        this.i.S(fvhVar);
    }
}
