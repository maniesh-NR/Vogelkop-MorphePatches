package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class bzg extends e1g {
    public final xk e;
    public final y5g f;
    public final xoj g;
    public final q9 h;
    public final q9 i;
    public final uj j;
    public final xoj k;
    public final boolean l;
    public final List m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzg(xk xkVar, y5g y5gVar, xoj xojVar, q9 q9Var, q9 q9Var2, uj ujVar, xoj xojVar2, boolean z) {
        super(11000);
        d9j[] d9jVarArr = d9j.a;
        this.e = xkVar;
        this.f = y5gVar;
        this.g = xojVar;
        this.h = q9Var;
        this.i = q9Var2;
        this.j = ujVar;
        this.k = xojVar2;
        this.l = z;
        this.m = Arrays.asList(xkVar, y5gVar, xojVar, q9Var, q9Var2, ujVar, xojVar2);
    }

    @Override // defpackage.e1g, defpackage.t6j
    public final ix4 b(hx4 hx4Var) {
        if (!this.l) {
            hx4Var.c.remove(Integer.valueOf(this.k.a));
        }
        return super.b(hx4Var);
    }

    @Override // defpackage.v6j
    public final List d() {
        return this.m;
    }

    @Override // defpackage.e1g
    public final r6j g(int i) {
        return new r6j(i, new x6j(d8j.class, new rag((byte) 19)), 2132021377, 2132021378, 2131232189, false, (Function1) new rmg(this, (byte) 2), 96);
    }
}
