package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class od1 extends ozb implements Function2 {
    public final /* synthetic */ byte i = 0;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od1(b3m b3mVar, c8e c8eVar, Function1 function1, td3 td3Var, Function1 function12, ue5 ue5Var, int i) {
        super(2);
        this.m = b3mVar;
        this.j = c8eVar;
        this.n = function1;
        this.p = td3Var;
        this.o = function12;
        this.k = ue5Var;
        this.l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od1(b3m b3mVar, Function1 function1, c8e c8eVar, x48 x48Var, vh8 vh8Var, ue5 ue5Var, int i) {
        super(2);
        this.m = b3mVar;
        this.n = function1;
        this.j = c8eVar;
        this.o = x48Var;
        this.p = vh8Var;
        this.k = ue5Var;
        this.l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od1(cfe cfeVar, c8e c8eVar, x48 x48Var, vh8 vh8Var, String str, ue5 ue5Var, int i) {
        super(2);
        this.m = cfeVar;
        this.j = c8eVar;
        this.n = x48Var;
        this.o = vh8Var;
        this.p = str;
        this.k = ue5Var;
        this.l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od1(pqh pqhVar, lqh lqhVar, n0n n0nVar, nqh nqhVar, int i, pqh pqhVar2, ArrayList arrayList) {
        super(2);
        this.m = pqhVar;
        this.j = lqhVar;
        this.n = n0nVar;
        this.o = nqhVar;
        this.l = i;
        this.p = pqhVar2;
        this.k = arrayList;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.i;
        Object obj3 = this.k;
        int i = this.l;
        Object obj4 = this.n;
        Object obj5 = this.j;
        Object obj6 = this.m;
        Object obj7 = this.p;
        Object obj8 = this.o;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                p37.a((b3m) obj6, (c8e) obj5, (Function1) obj4, (td3) obj7, (Function1) obj8, (ue5) obj3, (ih5) obj, aoh.m(i | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                xf8.c((cfe) obj6, (c8e) obj5, (x48) obj4, (vh8) obj8, (String) obj7, (ue5) obj3, (ih5) obj, aoh.m(i | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                xf8.f((b3m) obj6, (Function1) obj4, (c8e) obj5, (x48) obj8, (vh8) obj7, (ue5) obj3, (ih5) obj, aoh.m(i | 1));
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int iIntValue = ((Number) obj2).intValue();
                nqh nqhVar = (nqh) obj8;
                pqh pqhVar = (pqh) obj7;
                pqh pqhVar2 = (pqh) obj6;
                Object obj9 = pqhVar2.a;
                qn3.Companion.getClass();
                pqhVar2.a = obj9 + pn3.a(zBooleanValue);
                lqh lqhVar = (lqh) obj5;
                n0n n0nVar = (n0n) obj4;
                boolean z = n0nVar.b > 45 && nqhVar.a < i;
                lqhVar.a = z;
                if (z && zBooleanValue) {
                    boolean zB = n0nVar.b(iIntValue + 1);
                    Object obj10 = pqhVar.a;
                    if (!zB) {
                        ((List) obj10).add(Integer.valueOf(iIntValue));
                        int i2 = nqhVar.a;
                        cg3 cg3Var = dg3.Companion;
                        nqhVar.a = i2 + 16;
                        ((ArrayList) obj3).add(new ArrayList((Collection) pqhVar.a));
                        ((List) pqhVar.a).clear();
                        pqhVar.a = new ArrayList();
                    } else if (((List) obj10).size() == 0) {
                        ((List) pqhVar.a).add(Integer.valueOf(iIntValue));
                        int i3 = nqhVar.a;
                        cg3 cg3Var2 = dg3.Companion;
                        nqhVar.a = i3 + 17;
                    }
                }
                break;
        }
        return Unit.a;
    }
}
