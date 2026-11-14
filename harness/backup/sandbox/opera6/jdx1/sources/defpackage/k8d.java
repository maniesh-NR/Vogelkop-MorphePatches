package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class k8d implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ br9 h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ int j;

    public /* synthetic */ k8d(cn4 cn4Var, String str, String str2, o01 o01Var, n01 n01Var, Function1 function1, Function0 function0, xvf xvfVar, int i) {
        this.a = (byte) 3;
        this.b = cn4Var;
        this.c = str;
        this.d = str2;
        this.f = o01Var;
        this.g = n01Var;
        this.h = function1;
        this.e = function0;
        this.i = xvfVar;
        this.j = i;
    }

    public /* synthetic */ k8d(u8d u8dVar, lyi lyiVar, Integer num, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i, byte b) {
        this.a = b;
        this.b = u8dVar;
        this.c = lyiVar;
        this.d = num;
        this.e = function0;
        this.f = function02;
        this.g = function03;
        this.h = function04;
        this.i = function05;
        this.j = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.j;
        Object obj3 = this.i;
        Function1 function1 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.d;
        Object obj7 = this.c;
        Object obj8 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = aoh.m(i | 1);
                sfe.c((u8d) obj8, (lyi) obj7, (Integer) obj6, this.e, (Function0) obj5, (Function0) obj4, (Function0) function1, (Function0) obj3, (ih5) obj, iM);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM2 = aoh.m(i | 1);
                sfe.c((u8d) obj8, (lyi) obj7, (Integer) obj6, this.e, (Function0) obj5, (Function0) obj4, (Function0) function1, (Function0) obj3, (ih5) obj, iM2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM3 = aoh.m(i | 1);
                sfe.c((u8d) obj8, (lyi) obj7, (Integer) obj6, this.e, (Function0) obj5, (Function0) obj4, (Function0) function1, (Function0) obj3, (ih5) obj, iM3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM4 = aoh.m(i | 1);
                zi4.a((cn4) obj8, (String) obj7, (String) obj6, (o01) obj5, (n01) obj4, function1, this.e, (xvf) obj3, (ih5) obj, iM4);
                break;
        }
        return Unit.a;
    }
}
