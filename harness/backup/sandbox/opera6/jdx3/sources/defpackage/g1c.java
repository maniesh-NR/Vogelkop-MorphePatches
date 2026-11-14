package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class g1c extends cx4 {
    public final uj h;
    public final uj i;
    public final uj j;
    public final List k;

    /* JADX WARN: Illegal instructions before constructor call */
    public g1c(j1c j1cVar, uj ujVar, uj ujVar2, uj ujVar3) {
        v9j v9jVar = (v9j) j1cVar.e;
        d9j[] d9jVarArr = d9j.a;
        super(v9jVar, 29000);
        this.h = ujVar;
        this.i = ujVar2;
        this.j = ujVar3;
        this.k = Arrays.asList(ujVar, ujVar2, ujVar3);
    }

    @Override // defpackage.s6j
    public final ix4 a(hx4 hx4Var, Object obj) {
        if (((h1c) obj).d.a) {
            return hx4Var.a();
        }
        hx4Var.c.clear();
        return hx4Var.a();
    }

    @Override // defpackage.ex4, defpackage.v6j
    public final List d() {
        return this.k;
    }
}
