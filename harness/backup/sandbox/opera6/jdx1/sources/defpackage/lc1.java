package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class lc1 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ lc1(c8e c8eVar, ue5 ue5Var, ue5 ue5Var2, ue5 ue5Var3, ue5 ue5Var4, int i) {
        this.a = (byte) 4;
        this.b = c8eVar;
        this.d = ue5Var;
        this.e = ue5Var2;
        this.f = ue5Var3;
        this.g = ue5Var4;
        this.c = i;
    }

    public /* synthetic */ lc1(f2e f2eVar, String str, Function0 function0, Function0 function02, c8e c8eVar, int i) {
        this.a = (byte) 6;
        this.d = f2eVar;
        this.e = str;
        this.f = function0;
        this.g = function02;
        this.b = c8eVar;
        this.c = i;
    }

    public /* synthetic */ lc1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = obj4;
        this.g = obj5;
        this.c = i;
    }

    public /* synthetic */ lc1(Function1 function1, c8e c8eVar, Function1 function12, Function1 function13, k51 k51Var, int i) {
        this.a = (byte) 0;
        this.d = function1;
        this.b = c8eVar;
        this.e = function12;
        this.f = function13;
        this.g = k51Var;
        this.c = i;
    }

    public /* synthetic */ lc1(sun sunVar, bpb bpbVar, Function0 function0, Function1 function1, c8e c8eVar, int i) {
        this.a = (byte) 7;
        this.e = sunVar;
        this.f = bpbVar;
        this.g = function0;
        this.d = function1;
        this.b = c8eVar;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.c;
        Object obj3 = this.b;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                nb6.a((Function1) obj7, (c8e) obj3, (Function1) obj6, (Function1) obj5, (k51) obj4, (ih5) obj, aoh.m(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                sfe.a((xtl) obj7, (ue5) obj6, (ztl) obj5, (c8e) obj3, (ue5) obj4, (ih5) obj, aoh.m(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM = aoh.m(i) | 1;
                ((ue5) obj7).e(this.e, this.f, this.b, this.g, (ih5) obj, iM);
                break;
            case 3:
                ((Integer) obj2).getClass();
                fed.a((sa5) obj7, (iae) obj6, (acj) obj5, (wam) obj3, (ue5) obj4, (ih5) obj, aoh.m(i | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                j14.d((c8e) obj3, (ue5) obj7, (ue5) obj6, (ue5) obj5, (ue5) obj4, (ih5) obj, aoh.m(i | 1));
                break;
            case 5:
                int iIntValue = ((Integer) obj2).intValue();
                break;
            case 6:
                ((Integer) obj2).getClass();
                alo.e((f2e) obj7, (String) obj6, (Function0) obj5, (Function0) obj4, (c8e) obj3, (ih5) obj, aoh.m(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                xvg.b((sun) obj6, (bpb) obj5, (Function0) obj4, (Function1) obj7, (c8e) obj3, (ih5) obj, aoh.m(i | 1));
                break;
        }
        return Unit.a;
    }
}
