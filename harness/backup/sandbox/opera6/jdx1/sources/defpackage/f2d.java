package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f2d extends ozb implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ p2d j;
    public final /* synthetic */ Function0 k;
    public final /* synthetic */ c8e l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2d(p2d p2dVar, Function0 function0, c8e c8eVar, int i, byte b) {
        super(2);
        this.i = b;
        this.j = p2dVar;
        this.k = function0;
        this.l = c8eVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.i;
        c8e c8eVar = this.l;
        Function0 function0 = this.k;
        p2d p2dVar = this.j;
        ih5 ih5Var = (ih5) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                x1p.c(p2dVar, function0, c8eVar, ih5Var, aoh.m(1));
                break;
            default:
                x1p.c(p2dVar, function0, c8eVar, ih5Var, aoh.m(1));
                break;
        }
        return Unit.a;
    }
}
