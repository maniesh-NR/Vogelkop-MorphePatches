package defpackage;

/* loaded from: classes.dex */
public final class a4d extends t59 {
    public f38 e;

    public final int f(Object obj) {
        kyh kyhVar = (kyh) obj;
        if (kyhVar == null) {
            return 1;
        }
        return kyhVar.b();
    }

    public final void i(Object obj, Object obj2) {
        kyh kyhVar = (kyh) obj2;
        f38 f38Var = this.e;
        if (f38Var == null || kyhVar == null) {
            return;
        }
        f38Var.e.L(kyhVar, true);
    }
}
