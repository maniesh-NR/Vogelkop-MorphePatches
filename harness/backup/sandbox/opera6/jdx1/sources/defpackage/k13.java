package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class k13 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n01 b;

    public /* synthetic */ k13(n01 n01Var, int i, byte b) {
        this.a = b;
        this.b = n01Var;
    }

    public final Object invoke(Object obj, Object obj2) throws oye {
        byte b = this.a;
        ih5 ih5Var = (ih5) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                xf8.a(this.b, ih5Var, aoh.m(1));
                break;
            case 1:
                kfo.l(this.b, ih5Var, aoh.m(1));
                break;
            case 2:
                kfo.m(this.b, ih5Var, aoh.m(1));
                break;
            default:
                kfo.i(this.b, ih5Var, aoh.m(1));
                break;
        }
        return Unit.a;
    }
}
