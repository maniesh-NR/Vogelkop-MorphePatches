package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class ru1 extends d1g {
    public final oxe f;
    public final q9 g;
    public final uj h;
    public final List i;

    /* JADX WARN: Illegal instructions before constructor call */
    public ru1(yu1 yu1Var, oxe oxeVar, q9 q9Var, uj ujVar) {
        v9j v9jVar = yu1Var.g;
        d9j[] d9jVarArr = d9j.a;
        super(v9jVar, 0);
        this.f = oxeVar;
        this.g = q9Var;
        this.h = ujVar;
        this.i = Arrays.asList(oxeVar, q9Var, ujVar);
    }

    @Override // defpackage.d1g, defpackage.s6j
    public final ix4 a(hx4 hx4Var, Object obj) {
        tu1 tu1Var = (tu1) obj;
        if (!(tu1Var.d instanceof c4c)) {
            qu1[] qu1VarArr = qu1.a;
            hx4Var.b(4);
            hx4Var.b(5);
            hx4Var.b(6);
        }
        if (!tu1Var.e) {
            qu1[] qu1VarArr2 = qu1.a;
            hx4Var.b(8);
        }
        if (!tu1Var.f.a) {
            qu1[] qu1VarArr3 = qu1.a;
            hx4Var.b(9);
        }
        return super.a(hx4Var, tu1Var);
    }

    @Override // defpackage.v6j
    public final List d() {
        return this.i;
    }
}
