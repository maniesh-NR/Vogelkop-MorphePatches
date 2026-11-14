package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class z71 implements Function2 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ ue5 b;
    public final /* synthetic */ c8e c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ z71(ue5 ue5Var, Function0 function0, c8e c8eVar, boolean z, otd otdVar, zvf zvfVar, int i) {
        this.b = ue5Var;
        this.e = function0;
        this.c = c8eVar;
        this.d = z;
        this.f = otdVar;
        this.g = zvfVar;
    }

    public /* synthetic */ z71(xtl xtlVar, ue5 ue5Var, ztl ztlVar, c8e c8eVar, boolean z, ue5 ue5Var2, int i) {
        this.e = xtlVar;
        this.b = ue5Var;
        this.f = ztlVar;
        this.c = c8eVar;
        this.d = z;
        this.g = ue5Var2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = aoh.m(7);
                a81.a(this.b, (Function0) obj5, this.c, this.d, (otd) obj4, (zvf) obj3, (ih5) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = aoh.m(100663345);
                wtl.b((xtl) obj5, this.b, (ztl) obj4, this.c, this.d, (ue5) obj3, (ih5) obj, iM2);
                break;
        }
        return Unit.a;
    }
}
