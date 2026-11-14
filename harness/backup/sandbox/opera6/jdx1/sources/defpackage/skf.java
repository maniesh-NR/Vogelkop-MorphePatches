package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class skf implements Function2 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ br9 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ br9 g;
    public final /* synthetic */ Object h;

    public /* synthetic */ skf(erd erdVar, Function0 function0, Function0 function02, Function1 function1, Function0 function03, Function0 function04, c8e c8eVar, int i) {
        this.c = erdVar;
        this.b = function0;
        this.d = function02;
        this.g = function1;
        this.e = function03;
        this.f = function04;
        this.h = c8eVar;
    }

    public /* synthetic */ skf(String str, Integer num, Function1 function1, kg9 kg9Var, String str2, String str3, Function0 function0) {
        this.c = str;
        this.f = num;
        this.g = function1;
        this.h = kg9Var;
        this.d = str2;
        this.e = str3;
        this.b = function0;
    }

    public /* synthetic */ skf(String str, Function1 function1, Function0 function0, c8e c8eVar, String str2, String str3, Integer num, int i) {
        this.c = str;
        this.g = function1;
        this.b = function0;
        this.h = c8eVar;
        this.d = str2;
        this.e = str3;
        this.f = num;
    }

    public /* synthetic */ skf(Function0 function0, Function0 function02, String str, Function0 function03, Function0 function04, Function0 function05, c8e c8eVar, int i) {
        this.b = function0;
        this.d = function02;
        this.c = str;
        this.e = function03;
        this.f = function04;
        this.g = function05;
        this.h = c8eVar;
    }

    public /* synthetic */ skf(msi msiVar, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, int i) {
        this.c = msiVar;
        this.g = function1;
        this.d = function12;
        this.e = function13;
        this.f = function14;
        this.h = function15;
        this.b = function16;
    }

    public final Object invoke(Object obj, Object obj2) {
        ue5 ue5VarP;
        byte b = this.a;
        Function1 function1 = this.b;
        Object obj3 = this.h;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Function1 function12 = this.g;
        Object obj7 = this.c;
        switch (b) {
            case 0:
                String str = (String) obj7;
                Integer num = (Integer) obj4;
                Function1 function13 = function12;
                kg9 kg9Var = (kg9) obj3;
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                Function0 function0 = (Function0) function1;
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i39 i39Var = mpj.c;
                    o9i o9iVarA = m9i.a(b72.a, rbe.k, vt9Var, 48);
                    int iHashCode = Long.hashCode(vt9Var.T);
                    oag oagVarL = vt9Var.l();
                    c8e c8eVarP = qyn.P(vt9Var, i39Var);
                    bh5.To.getClass();
                    vt9Var.a0();
                    if (vt9Var.S) {
                        vt9Var.k(m3c.S);
                    } else {
                        vt9Var.j0();
                    }
                    y4h.o(vt9Var, o9iVarA, ujp.f);
                    y4h.o(vt9Var, oagVarL, ujp.e);
                    y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
                    y4h.m(vt9Var);
                    y4h.o(vt9Var, c8eVarP, ujp.d);
                    boolean zF = vt9Var.f(num) | vt9Var.f(function13);
                    Object objK = vt9Var.K();
                    if (zF || objK == hh5.a) {
                        objK = new jkc(num, function13, (byte) 27);
                        vt9Var.g0(objK);
                    }
                    Function1 function14 = (Function1) objK;
                    c8e c8eVarD = new g4c(1.0f, true).d(mpj.b);
                    pof.b.getClass();
                    c8e c8eVarW = wxe.w(a26.a0(c8eVarD, 16.0f, 8.0f, 4.0f, 8.0f), kg9Var);
                    ue5 ue5VarP2 = null;
                    if (str2 == null) {
                        vt9Var.W(914194858);
                        vt9Var.p(false);
                        ue5VarP = null;
                    } else {
                        vt9Var.W(914194859);
                        ue5VarP = gyg.P(-1766256823, new lx0(str2, (byte) 11), vt9Var);
                        vt9Var.p(false);
                    }
                    if (str3 == null) {
                        vt9Var.W(914265290);
                    } else {
                        vt9Var.W(914265291);
                        ue5VarP2 = gyg.P(-1328243007, new lx0(str3, (byte) 12), vt9Var);
                    }
                    vt9Var.p(false);
                    long j = u95.f;
                    r9h.i(str, function14, c8eVarW, false, false, (ikl) null, (ue5) null, ue5VarP, (ue5) null, ue5VarP2, (uac) null, (rvb) null, (ovb) null, 0, 0, (paj) null, ulp.A(0L, 0L, 0L, 0L, j, j, j, j, 0L, 0L, null, j, j, j, j, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, vt9Var, 2147452687, 4095), vt9Var, 0, 4190072);
                    scd.f(function0, mzg.q(vt9Var, 2132018586), a26.b0(z7e.b, 0.0f, 12.0f, 8.0f, 0.0f, 9), false, false, smf.d, null, null, null, null, null, null, null, null, vt9Var, 196608, 0, 16344);
                    vt9Var.p(true);
                } else {
                    vt9Var.Q();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                aib.i((Function0) function1, (Function0) obj6, (String) obj7, (Function0) obj5, (Function0) obj4, (Function0) function12, (c8e) obj3, (ih5) obj, aoh.m(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                gyg.f((erd) obj7, (Function0) function1, (Function0) obj6, function12, (Function0) obj5, (Function0) obj4, (c8e) obj3, (ih5) obj, aoh.m(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                zi4.b((String) obj7, function12, (Function0) function1, (c8e) obj3, (String) obj6, (String) obj5, (Integer) obj4, (ih5) obj, aoh.m(1573249));
                break;
            default:
                ((Integer) obj2).getClass();
                r9h.c((msi) obj7, function12, (Function1) obj6, (Function1) obj5, (Function1) obj4, (Function1) obj3, function1, (ih5) obj, aoh.m(9));
                break;
        }
        return Unit.a;
    }
}
