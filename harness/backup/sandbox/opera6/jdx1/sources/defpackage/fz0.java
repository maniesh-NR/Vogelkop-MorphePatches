package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class fz0 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fz0(e2e e2eVar, mk8 mk8Var, Function1 function1, c8e c8eVar, int i) {
        this.a = (byte) 6;
        this.e = e2eVar;
        this.f = mk8Var;
        this.c = function1;
        this.b = c8eVar;
        this.d = i;
    }

    public /* synthetic */ fz0(Object obj, Object obj2, c8e c8eVar, ue5 ue5Var, int i, byte b) {
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.b = c8eVar;
        this.c = ue5Var;
        this.d = i;
    }

    public /* synthetic */ fz0(Object obj, Object obj2, Object obj3, br9 br9Var, int i, byte b) {
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.f = obj3;
        this.c = br9Var;
        this.d = i;
    }

    public /* synthetic */ fz0(Object obj, String str, Function0 function0, c8e c8eVar, int i, byte b) {
        this.a = b;
        this.f = obj;
        this.c = str;
        this.e = function0;
        this.b = c8eVar;
        this.d = i;
    }

    public /* synthetic */ fz0(ue5 ue5Var, c8e c8eVar, ue5 ue5Var2, x62 x62Var, int i) {
        this.a = (byte) 7;
        this.c = ue5Var;
        this.b = c8eVar;
        this.e = ue5Var2;
        this.f = x62Var;
        this.d = i;
    }

    public /* synthetic */ fz0(ue5 ue5Var, Object obj, Object obj2, Object obj3, int i) {
        this.a = (byte) 4;
        this.c = ue5Var;
        this.e = obj;
        this.b = obj2;
        this.f = obj3;
        this.d = i;
    }

    public /* synthetic */ fz0(zl4 zl4Var, Function0 function0, Function0 function02, c8e c8eVar, int i) {
        this.a = (byte) 2;
        this.f = zl4Var;
        this.e = function0;
        this.c = function02;
        this.b = c8eVar;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        Object obj4 = this.e;
        Object obj5 = this.f;
        int i = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                gz0.a((Function0) obj4, (c8e) obj3, (y77) obj5, (ue5) obj6, (ih5) obj, aoh.m(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                sfe.x((ztl) obj4, (afe) obj5, (c8e) obj3, (ue5) obj6, (ih5) obj, aoh.m(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                z4o.c((zl4) obj5, (Function0) obj4, (Function0) obj6, (c8e) obj3, (ih5) obj, aoh.m(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                z4o.d((String) obj5, (String) obj6, (Function0) obj4, (c8e) obj3, (ih5) obj, aoh.m(i | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iM = aoh.m(i) | 1;
                ((ue5) obj6).d(this.e, this.b, this.f, (ih5) obj, iM);
                break;
            case 5:
                ((Integer) obj2).getClass();
                lcp.a((Boolean) obj4, (qf5) obj3, (ndc) obj5, (Function1) obj6, (ih5) obj, aoh.m(i | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                vtp.a((e2e) obj4, (mk8) obj5, (Function1) obj6, (c8e) obj3, (ih5) obj, aoh.m(i | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                lcp.f((ue5) obj6, (c8e) obj3, (ue5) obj4, (x62) obj5, (ih5) obj, aoh.m(i | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                zi4.g((String) obj4, (String) obj5, (c8e) obj3, (ue5) obj6, (ih5) obj, aoh.m(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                coh.c((hfk) obj5, (String) obj6, (Function0) obj4, (c8e) obj3, (ih5) obj, aoh.m(i | 1));
                break;
        }
        return Unit.a;
    }
}
