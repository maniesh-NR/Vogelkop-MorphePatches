package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class pd1 extends ozb implements Function2 {
    public final /* synthetic */ byte i = 0;
    public final /* synthetic */ b3m j;
    public final /* synthetic */ Function1 k;
    public final /* synthetic */ c8e l;
    public final /* synthetic */ ue5 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd1(b3m b3mVar, c8e c8eVar, Function1 function1, td3 td3Var, Function1 function12, Function1 function13, ue5 ue5Var, int i) {
        super(2);
        this.j = b3mVar;
        this.l = c8eVar;
        this.k = function1;
        this.q = td3Var;
        this.o = function12;
        this.p = function13;
        this.m = ue5Var;
        this.n = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd1(b3m b3mVar, Function1 function1, c8e c8eVar, x48 x48Var, vh8 vh8Var, Function2 function2, ue5 ue5Var, int i) {
        super(2);
        this.j = b3mVar;
        this.k = function1;
        this.l = c8eVar;
        this.o = x48Var;
        this.p = vh8Var;
        this.q = function2;
        this.m = ue5Var;
        this.n = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.i;
        int i = this.n;
        Object obj3 = this.q;
        Object obj4 = this.p;
        Object obj5 = this.o;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iM = aoh.m(i | 1);
                b3m b3mVar = this.j;
                c8e c8eVar = this.l;
                Function1 function1 = this.k;
                p37.c(b3mVar, c8eVar, function1, (td3) obj3, (Function1) obj5, (Function1) obj4, this.m, (ih5) obj, iM);
                break;
            default:
                ((Number) obj2).intValue();
                int iM2 = aoh.m(i | 1);
                b3m b3mVar2 = this.j;
                Function1 function12 = this.k;
                c8e c8eVar2 = this.l;
                xf8.b(b3mVar2, function12, c8eVar2, (x48) obj5, (vh8) obj4, (Function2) obj3, this.m, (ih5) obj, iM2);
                break;
        }
        return Unit.a;
    }
}
