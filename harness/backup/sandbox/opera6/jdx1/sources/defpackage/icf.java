package defpackage;

/* loaded from: classes.dex */
public final class icf extends bke {
    public final xje c;
    public final /* synthetic */ kcf d;

    public icf(kcf kcfVar) {
        this.d = kcfVar;
        xje xjeVar = new xje(new kqd(kcfVar, (byte) 15));
        xjeVar.b(this);
        this.c = xjeVar;
    }

    @Override // defpackage.bke
    public final void d(boolean z) {
        kcf kcfVar = this.d;
        kcfVar.c = z;
        ip1 ip1Var = kcfVar.b;
        if (ip1Var != null) {
            ip1Var.accept(Boolean.valueOf(z));
        }
    }
}
