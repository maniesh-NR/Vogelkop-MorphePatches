package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class d8c implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c8e b;
    public final /* synthetic */ ue5 c;

    public /* synthetic */ d8c(c8e c8eVar, ue5 ue5Var, int i, byte b) {
        this.a = b;
        this.b = c8eVar;
        this.c = ue5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        ue5 ue5Var = this.c;
        c8e c8eVar = this.b;
        ih5 ih5Var = (ih5) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                f8c.a(c8eVar, ue5Var, ih5Var, aoh.m(49));
                break;
            case 1:
                xf8.n(c8eVar, ue5Var, ih5Var, aoh.m(49));
                break;
            default:
                y7h.b(c8eVar, ue5Var, ih5Var, aoh.m(49));
                break;
        }
        return Unit.a;
    }
}
