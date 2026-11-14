package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class tb3 implements Function2 {
    public final /* synthetic */ byte a = 3;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ tb3(c8e c8eVar, Function0 function0, boolean z, paj pajVar, pta ptaVar, Function2 function2, int i) {
        this.d = c8eVar;
        this.e = function0;
        this.b = z;
        this.f = pajVar;
        this.g = ptaVar;
        this.h = function2;
        this.c = i;
    }

    public /* synthetic */ tb3(String str, boolean z, is5 is5Var, c8e c8eVar, cr9 cr9Var, Function0 function0, int i) {
        this.d = str;
        this.b = z;
        this.e = is5Var;
        this.f = c8eVar;
        this.g = cr9Var;
        this.h = function0;
        this.c = i;
    }

    public /* synthetic */ tb3(ue5 ue5Var, Function0 function0, c8e c8eVar, boolean z, otd otdVar, zvf zvfVar, int i) {
        this.h = ue5Var;
        this.d = function0;
        this.e = c8eVar;
        this.b = z;
        this.f = otdVar;
        this.g = zvfVar;
        this.c = i;
    }

    public /* synthetic */ tb3(xtl xtlVar, ztl ztlVar, nx5 nx5Var, boolean z, afe afeVar, ue5 ue5Var, int i) {
        this.d = xtlVar;
        this.e = ztlVar;
        this.f = nx5Var;
        this.b = z;
        this.g = afeVar;
        this.h = ue5Var;
        this.c = i;
    }

    public /* synthetic */ tb3(boolean z, bsl bslVar, c8e c8eVar, hv4 hv4Var, qik qikVar, qik qikVar2, int i) {
        this.b = z;
        this.d = bslVar;
        this.e = c8eVar;
        this.f = hv4Var;
        this.g = qikVar;
        this.h = qikVar2;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.c;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.h;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = aoh.m(i | 1);
                sfe.w((xtl) obj6, (ztl) obj5, (nx5) obj4, this.b, (afe) obj3, (ue5) obj7, (ih5) obj, iM);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM2 = aoh.m(i | 1);
                k1g.b(this.b, (bsl) obj6, (c8e) obj5, (hv4) obj4, (qik) obj3, (qik) obj7, (ih5) obj, iM2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM3 = aoh.m(i | 1);
                et5.c((String) obj6, this.b, (is5) obj5, (c8e) obj4, (cr9) obj3, (Function0) obj7, (ih5) obj, iM3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iM4 = aoh.m(i | 1);
                f03.b((c8e) obj6, (Function0) obj5, this.b, (paj) obj4, (pta) obj3, (Function2) obj7, (ih5) obj, iM4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM5 = aoh.m(i | 1);
                k1g.d((ue5) obj7, (Function0) obj6, (c8e) obj5, this.b, (otd) obj4, (zvf) obj3, (ih5) obj, iM5);
                break;
        }
        return Unit.a;
    }
}
