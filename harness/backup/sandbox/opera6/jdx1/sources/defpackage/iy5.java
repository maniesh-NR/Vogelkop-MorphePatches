package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class iy5 implements Function2 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ iy5(d29 d29Var, Function0 function0, Function1 function1, Function0 function02, Function0 function03, Function0 function04, Function0 function05, c8e c8eVar, int i) {
        this.c = d29Var;
        this.d = function0;
        this.b = function1;
        this.e = function02;
        this.f = function03;
        this.g = function04;
        this.h = function05;
        this.i = c8eVar;
    }

    public /* synthetic */ iy5(daa daaVar, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function1 function1, c8e c8eVar, int i) {
        this.c = daaVar;
        this.d = function0;
        this.e = function02;
        this.f = function03;
        this.g = function04;
        this.h = function05;
        this.b = function1;
        this.i = c8eVar;
    }

    public /* synthetic */ iy5(n27 n27Var, afe afeVar, afe afeVar2, kg9 kg9Var, afe afeVar3, List list, Function1 function1, afe afeVar4) {
        this.c = n27Var;
        this.d = afeVar;
        this.e = afeVar2;
        this.h = kg9Var;
        this.f = afeVar3;
        this.i = list;
        this.b = function1;
        this.g = afeVar4;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        switch (b) {
            case 0:
                n27 n27Var = (n27) obj9;
                afe afeVar = (afe) obj8;
                afe afeVar2 = (afe) obj7;
                kg9 kg9Var = (kg9) obj4;
                afe afeVar3 = (afe) obj6;
                List list = (List) obj3;
                afe afeVar4 = (afe) obj5;
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objK = vt9Var.K();
                    zpa zpaVar = hh5.a;
                    if (objK == zpaVar) {
                        objK = new ox0(afeVar, (byte) 8);
                        vt9Var.g0(objK);
                    }
                    rm5.L(vt9Var, (Function0) objK);
                    float fJ0 = n27Var.j0(((Number) afeVar2.getValue()).intValue());
                    z7e z7eVar = z7e.b;
                    c8e c8eVarL = mpj.l(z7eVar, fJ0);
                    db5 db5VarA = cb5.a(b72.c, rbe.n, vt9Var, 0);
                    int iHashCode = Long.hashCode(vt9Var.T);
                    oag oagVarL = vt9Var.l();
                    c8e c8eVarP = qyn.P(vt9Var, c8eVarL);
                    bh5.To.getClass();
                    vt9Var.a0();
                    if (vt9Var.S) {
                        vt9Var.k(m3c.S);
                    } else {
                        vt9Var.j0();
                    }
                    y4h.o(vt9Var, db5VarA, ujp.f);
                    y4h.o(vt9Var, oagVarL, ujp.e);
                    y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
                    y4h.m(vt9Var);
                    y4h.o(vt9Var, c8eVarP, ujp.d);
                    String str = (String) afeVar3.getValue();
                    c8e c8eVarC = sfe.C(wxe.w(mpj.a, kg9Var), ((sa5) vt9Var.j(ua5.a)).p, kfo.i);
                    Object objK2 = vt9Var.K();
                    if (objK2 == zpaVar) {
                        objK2 = new gb1(afeVar3, (byte) 8);
                        vt9Var.g0(objK2);
                    }
                    qbe.i(str, (Function1) objK2, c8eVarC, false, false, null, fr3.c, null, null, null, null, null, null, false, null, null, null, true, 0, 0, null, null, null, vt9Var, 1572912, 12582912, 0, 8257464);
                    utk.a(mpj.e(z7eVar, 0.0f, 1), v8i.a(4.0f), 0L, 0L, 3.0f, 8.0f, gyg.P(2140821645, new px0((Object) list, (Object) this.b, (Object) afeVar3, (Object) afeVar4, (byte) 4), vt9Var), vt9Var, 12804102, 76);
                    vt9Var.p(true);
                } else {
                    vt9Var.Q();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                z5i.f((d29) obj9, (Function0) obj8, this.b, (Function0) obj7, (Function0) obj6, (Function0) obj5, (Function0) obj4, (c8e) obj3, (ih5) obj, aoh.m(9));
                break;
            default:
                ((Integer) obj2).getClass();
                ipe.a((daa) obj9, (Function0) obj8, (Function0) obj7, (Function0) obj6, (Function0) obj5, (Function0) obj4, this.b, (c8e) obj3, (ih5) obj, aoh.m(9));
                break;
        }
        return Unit.a;
    }
}
