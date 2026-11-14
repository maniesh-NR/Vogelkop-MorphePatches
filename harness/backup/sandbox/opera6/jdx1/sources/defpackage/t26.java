package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class t26 extends ozb implements Function2 {
    public final /* synthetic */ b3m i;
    public final /* synthetic */ c8e j;
    public final /* synthetic */ h49 k;
    public final /* synthetic */ Function1 l;
    public final /* synthetic */ ue5 m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t26(b3m b3mVar, c8e c8eVar, h49 h49Var, Function1 function1, ue5 ue5Var, int i) {
        super(2);
        this.i = b3mVar;
        this.j = c8eVar;
        this.k = h49Var;
        this.l = function1;
        this.m = ue5Var;
        this.n = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        o0g.b(this.i, this.j, this.k, this.l, this.m, (ih5) obj, aoh.m(this.n | 1));
        return Unit.a;
    }
}
