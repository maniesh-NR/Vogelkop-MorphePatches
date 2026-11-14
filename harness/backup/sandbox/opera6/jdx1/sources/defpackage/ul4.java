package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class ul4 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ c8e c;

    public /* synthetic */ ul4(int i, c8e c8eVar, int i2, byte b) {
        this.a = b;
        this.b = i;
        this.c = c8eVar;
    }

    public /* synthetic */ ul4(c8e c8eVar, int i, byte b) {
        this.a = b;
        this.c = c8eVar;
        this.b = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        ih5 ih5Var = (ih5) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                z4o.e(this.c, ih5Var, aoh.m(this.b | 1));
                break;
            case 1:
                f8c.k(this.b, aoh.m(1), ih5Var, this.c);
                break;
            case 2:
                vtp.f(this.c, ih5Var, aoh.m(this.b | 1));
                break;
            case 3:
                vtp.e(this.c, ih5Var, aoh.m(this.b | 1));
                break;
            case 4:
                phj.r(this.b, aoh.m(1), ih5Var, this.c);
                break;
            case 5:
                gyg.e(this.c, ih5Var, aoh.m(this.b | 1));
                break;
            default:
                sol.a(this.b, aoh.m(1), ih5Var, this.c);
                break;
        }
        return Unit.a;
    }
}
