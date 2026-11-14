package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class l8d implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u8d b;
    public final /* synthetic */ int c;

    public /* synthetic */ l8d(u8d u8dVar, int i, byte b) {
        this.a = b;
        this.b = u8dVar;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        ih5 ih5Var = (ih5) obj;
        ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                sfe.l(this.b, ih5Var, aoh.m(this.c | 1));
                break;
            case 1:
                sfe.v(this.b, ih5Var, aoh.m(this.c | 1));
                break;
            default:
                sfe.v(this.b, ih5Var, aoh.m(this.c | 1));
                break;
        }
        return Unit.a;
    }
}
