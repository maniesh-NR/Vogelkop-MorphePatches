package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public abstract class v6j {
    public final char a;
    public final hx5 b = new hx5(this);

    /* JADX WARN: Multi-variable type inference failed */
    public v6j(int i) {
        this.a = i;
    }

    public abstract hx5 c();

    public abstract List d();

    public void e() {
        for (ex4 ex4Var : d()) {
            hx5 hx5Var = ex4Var.b;
            ekc ekcVar = ex4Var.d;
            if (ekcVar != null) {
                hx5Var.t(ekcVar);
            }
            hx5 hx5Var2 = this.b;
            ex4Var.d = hx5Var2;
            hx5Var.s(hx5Var2, ex4Var.e);
        }
    }

    public void f() {
    }
}
