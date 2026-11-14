package defpackage;

/* loaded from: classes.dex */
public final class zv2 implements bh4 {
    public final yv2[] a;

    public zv2(yv2[] yv2VarArr) {
        this.a = yv2VarArr;
    }

    public final void a() {
        for (yv2 yv2Var : this.a) {
            xb7 xb7Var = yv2Var.f;
            if (xb7Var == null) {
                xb7Var = null;
            }
            xb7Var.dispose();
        }
    }

    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
