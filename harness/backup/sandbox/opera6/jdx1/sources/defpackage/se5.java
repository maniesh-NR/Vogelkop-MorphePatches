package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class se5 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ se5(c8e c8eVar, w62 w62Var, z62 z62Var, sd3 sd3Var, vd9 vd9Var, ue5 ue5Var, int i) {
        this.a = (byte) 1;
        this.d = c8eVar;
        this.e = w62Var;
        this.f = z62Var;
        this.g = sd3Var;
        this.h = vd9Var;
        this.b = ue5Var;
        this.c = i;
    }

    public /* synthetic */ se5(Object obj, Object obj2, Object obj3, br9 br9Var, Object obj4, Object obj5, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = br9Var;
        this.g = obj4;
        this.h = obj5;
        this.c = i;
    }

    public /* synthetic */ se5(ue5 ue5Var, String str, Boolean bool, is5 is5Var, Object obj, Object obj2, int i) {
        this.a = (byte) 0;
        this.b = ue5Var;
        this.d = str;
        this.e = bool;
        this.f = is5Var;
        this.g = obj;
        this.h = obj2;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        int i = this.c;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = aoh.m(i) | 1;
                ((ue5) obj8).f((String) obj7, (Boolean) obj6, (is5) obj5, this.g, this.h, (ih5) obj, iM);
                break;
            case 1:
                ((Integer) obj2).getClass();
                p37.e((c8e) obj7, (w62) obj6, (z62) obj5, (sd3) obj4, (vd9) obj3, (ue5) obj8, (ih5) obj, aoh.m(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ui6.d((g1b) obj8, (jbg) obj7, (n7i) obj6, (Function1) obj5, (c8e) obj4, (v1b) obj3, (ih5) obj, aoh.m(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ic4.d((ue5) obj8, (c8e) obj7, (ue5) obj6, (ue5) obj5, (ue5) obj4, (rhc) obj3, (ih5) obj, aoh.m(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                gyg.b((fsl) obj8, (String) obj7, (n01) obj6, (Function0) obj5, (Function0) obj4, (c8e) obj3, (ih5) obj, aoh.m(i | 1));
                break;
        }
        return Unit.a;
    }
}
