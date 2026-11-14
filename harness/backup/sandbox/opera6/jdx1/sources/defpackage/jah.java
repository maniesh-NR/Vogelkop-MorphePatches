package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class jah implements Function2 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jah(long j, ue5 ue5Var, int i) {
        this.b = j;
        this.c = ue5Var;
    }

    public /* synthetic */ jah(u89 u89Var, long j, int i) {
        this.c = u89Var;
        this.b = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.c;
        long j = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                lah.a((u89) obj3, j, (ih5) obj, aoh.m(1));
                break;
            default:
                ((Integer) obj2).getClass();
                hn9.d(j, (ue5) obj3, (ih5) obj, aoh.m(1));
                break;
        }
        return Unit.a;
    }
}
