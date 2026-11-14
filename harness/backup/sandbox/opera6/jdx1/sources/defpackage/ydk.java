package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class ydk implements Function2 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ c8e b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ br9 i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ ydk(myn mynVar, c8e c8eVar, boolean z, ayn aynVar, kxn kxnVar, Function1 function1, Function1 function12, ihg ihgVar, Function1 function13, int i) {
        this.e = mynVar;
        this.b = c8eVar;
        this.c = z;
        this.f = aynVar;
        this.g = kxnVar;
        this.h = function1;
        this.i = function12;
        this.j = ihgVar;
        this.k = function13;
        this.d = i;
    }

    public /* synthetic */ ydk(n01 n01Var, n01 n01Var2, n01 n01Var3, n01 n01Var4, boolean z, Function0 function0, Function0 function02, qek qekVar, c8e c8eVar, int i) {
        this.e = n01Var;
        this.f = n01Var2;
        this.g = n01Var3;
        this.h = n01Var4;
        this.c = z;
        this.i = function0;
        this.j = function02;
        this.k = qekVar;
        this.b = c8eVar;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.d;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Function1 function1 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = aoh.m(i | 1);
                kfo.b((n01) obj8, (n01) obj7, (n01) obj6, (n01) obj5, this.c, (Function0) function1, (Function0) obj4, (qek) obj3, this.b, (ih5) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = aoh.m(i | 1);
                qyn.a((myn) obj8, this.b, this.c, (ayn) obj7, (kxn) obj6, (Function1) obj5, function1, (ihg) obj4, (Function1) obj3, (ih5) obj, iM2);
                break;
        }
        return Unit.a;
    }
}
