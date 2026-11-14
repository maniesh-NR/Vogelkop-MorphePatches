package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class lr3 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c8e b;

    public /* synthetic */ lr3(c8e c8eVar, int i, byte b) {
        this.a = b;
        this.b = c8eVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        ih5 ih5Var = (ih5) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                nr3.a(this.b, ih5Var, aoh.m(1));
                break;
            default:
                gyg.d(this.b, ih5Var, aoh.m(7));
                break;
        }
        return Unit.a;
    }
}
