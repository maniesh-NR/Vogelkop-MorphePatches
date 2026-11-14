package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class w6d implements Function2 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ w6d(int i, Function0 function0, int i2) {
        this.c = i;
        this.b = function0;
    }

    public /* synthetic */ w6d(Function0 function0, int i, int i2) {
        this.b = function0;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        ih5 ih5Var = (ih5) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                qbe.k(this.c, aoh.m(1), ih5Var, this.b);
                break;
            default:
                sfe.m(this.c, aoh.m(1), ih5Var, this.b);
                break;
        }
        return Unit.a;
    }
}
