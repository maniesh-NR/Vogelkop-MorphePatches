package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class fb1 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c8e b;
    public final /* synthetic */ ue5 c;
    public final /* synthetic */ int d;

    public /* synthetic */ fb1(c8e c8eVar, ue5 ue5Var, int i, byte b) {
        this.a = b;
        this.b = c8eVar;
        this.c = ue5Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.d;
        ue5 ue5Var = this.c;
        c8e c8eVar = this.b;
        ih5 ih5Var = (ih5) obj;
        ((Integer) obj2).getClass();
        int i2 = i | 1;
        switch (b) {
            case 0:
                j14.f(c8eVar, ue5Var, ih5Var, aoh.m(i2));
                break;
            case 1:
                j14.g(c8eVar, ue5Var, ih5Var, aoh.m(i2));
                break;
            case 2:
                sw6.d(c8eVar, ue5Var, ih5Var, aoh.m(i2));
                break;
            case 3:
                xf8.m(c8eVar, ue5Var, ih5Var, aoh.m(i2));
                break;
            default:
                kfo.e(c8eVar, ue5Var, ih5Var, aoh.m(i2));
                break;
        }
        return Unit.a;
    }
}
