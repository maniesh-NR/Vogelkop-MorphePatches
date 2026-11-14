package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class td1 extends ozb implements Function2 {
    public final /* synthetic */ byte i = 0;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Function1 k;
    public final /* synthetic */ ue5 l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td1(Object obj, b3m b3mVar, p8g p8gVar, Function1 function1, de1 de1Var, puj pujVar, ue5 ue5Var) {
        super(2);
        this.j = obj;
        this.m = b3mVar;
        this.n = p8gVar;
        this.k = function1;
        this.o = de1Var;
        this.p = pujVar;
        this.l = ue5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td1(Object obj, c8e c8eVar, Function1 function1, td3 td3Var, String str, Function1 function12, ue5 ue5Var, int i) {
        super(2);
        this.j = obj;
        this.m = c8eVar;
        this.k = function1;
        this.n = td3Var;
        this.o = str;
        this.p = function12;
        this.l = ue5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.i;
        Object obj3 = this.p;
        Object obj4 = this.o;
        Object obj5 = this.n;
        Object obj6 = this.m;
        switch (b) {
            case 0:
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Number) obj2).intValue();
                p8g p8gVar = (p8g) obj5;
                de1 de1Var = (de1) obj4;
                b3m b3mVar = (b3m) obj6;
                byte b2 = 2;
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    t0g t0gVar = b3mVar.e;
                    t0g t0gVar2 = b3mVar.d;
                    Object value = t0gVar.getValue();
                    Object obj7 = this.j;
                    boolean zG = vt9Var.g(Intrinsics.a(obj7, value));
                    Object objK = vt9Var.K();
                    Function1 function1 = this.k;
                    zpa zpaVar = hh5.a;
                    if (zG || objK == zpaVar) {
                        objK = (!Intrinsics.a(obj7, t0gVar.getValue()) || p8gVar == null) ? (Intrinsics.a(obj7, b3mVar.f().b()) || Intrinsics.a(obj7, b3mVar.f().a())) ? (or5) function1.invoke(de1Var) : (or5) function1.invoke(new p8g(de1Var, b3mVar.f().b(), obj7)) : (or5) function1.invoke(p8gVar);
                        vt9Var.g0(objK);
                    }
                    or5 or5Var = (or5) objK;
                    boolean zG2 = vt9Var.g(Intrinsics.a(b3mVar.f().a(), obj7)) | vt9Var.g(Intrinsics.a(obj7, t0gVar.getValue()));
                    Object objK2 = vt9Var.K();
                    if (zG2 || objK2 == zpaVar) {
                        objK2 = (Intrinsics.a(b3mVar.f().a(), obj7) || (Intrinsics.a(obj7, t0gVar.getValue()) && p8gVar != null)) ? vh8.b : (Intrinsics.a(obj7, b3mVar.f().b()) || Intrinsics.a(obj7, b3mVar.f().a())) ? ((or5) function1.invoke(de1Var)).b : ((or5) function1.invoke(new p8g(de1Var, obj7, b3mVar.f().b()))).b;
                        vt9Var.g0(objK2);
                    }
                    vh8 vh8Var = (vh8) objK2;
                    Object objK3 = vt9Var.K();
                    if (objK3 == zpaVar) {
                        objK3 = new yd1(Intrinsics.a(obj7, t0gVar2.getValue()));
                        vt9Var.g0(objK3);
                    }
                    yd1 yd1Var = (yd1) objK3;
                    x48 x48Var = or5Var.a;
                    vco vcoVar = new vco(obj7, or5Var.c.h());
                    yd1Var.b.setValue(Boolean.valueOf(Intrinsics.a(obj7, t0gVar2.getValue())));
                    yd1Var.c.setValue(Boolean.valueOf((!Intrinsics.a(obj7, t0gVar.getValue()) || Intrinsics.a(obj7, t0gVar2.getValue()) || Intrinsics.a(obj7, b3mVar.c())) ? false : true));
                    c8e c8eVarD = vcoVar.d(yd1Var);
                    boolean zH = vt9Var.h(obj7);
                    Object objK4 = vt9Var.K();
                    if (zH || objK4 == zpaVar) {
                        objK4 = new b11(obj7, b2);
                        vt9Var.g0(objK4);
                    }
                    Function1 function12 = (Function1) objK4;
                    boolean zF = vt9Var.f(vh8Var);
                    Object objK5 = vt9Var.K();
                    if (zF || objK5 == zpaVar) {
                        objK5 = new qd1(vh8Var, (byte) 0);
                        vt9Var.g0(objK5);
                    }
                    xf8.b(b3mVar, function12, c8eVarD, x48Var, vh8Var, (Function2) objK5, gyg.P(1831990167, new sd1(obj7, (puj) obj3, de1Var, this.l), vt9Var), vt9Var, 100663296);
                } else {
                    vt9Var.Q();
                }
                break;
            default:
                ((Number) obj2).intValue();
                p37.b(this.j, (c8e) obj6, this.k, (td3) obj5, (String) obj4, (Function1) obj3, this.l, (ih5) obj, aoh.m(1769473));
                break;
        }
        return Unit.a;
    }
}
