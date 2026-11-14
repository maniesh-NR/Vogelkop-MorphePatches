package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class w41 implements Function2 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ c8e c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ w41(c8e c8eVar, int i, int i2) {
        this.c = c8eVar;
        this.b = i2;
    }

    public /* synthetic */ w41(boolean z, c8e c8eVar, int i) {
        this.b = z;
        this.c = c8eVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        ih5 ih5Var = (ih5) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                int iM = aoh.m(1);
                boolean z = this.b;
                z41.b(iM, z ? 1 : 0, ih5Var, this.c);
                break;
            default:
                x1p.b(this.b, this.c, ih5Var, aoh.m(1));
                break;
        }
        return Unit.a;
    }
}
