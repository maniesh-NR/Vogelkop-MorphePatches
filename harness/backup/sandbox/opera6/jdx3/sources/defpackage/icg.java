package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class icg extends e1g {
    public final y5g e;
    public final uj f;
    public final uj g;
    public final qte h;
    public final boolean i;
    public final List j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icg(y5g y5gVar, uj ujVar, uj ujVar2, qte qteVar, boolean z) {
        super(4000);
        d9j[] d9jVarArr = d9j.a;
        this.e = y5gVar;
        this.f = ujVar;
        this.g = ujVar2;
        this.h = qteVar;
        this.i = z;
        this.j = Arrays.asList(y5gVar, ujVar, ujVar2, qteVar);
    }

    @Override // defpackage.e1g, defpackage.t6j
    public final ix4 b(hx4 hx4Var) {
        if (!this.i) {
            hx4Var.c.remove(Integer.valueOf(this.h.a));
        }
        return super.b(hx4Var);
    }

    @Override // defpackage.v6j
    public final List d() {
        return this.j;
    }

    @Override // defpackage.e1g
    public final r6j g(int i) {
        return new r6j(i, new x6j(d8j.class, new rag((byte) 18)), 2132021363, 2132021364, 2131232288, false, (Function1) new o5f(this, (byte) 26), 96);
    }
}
