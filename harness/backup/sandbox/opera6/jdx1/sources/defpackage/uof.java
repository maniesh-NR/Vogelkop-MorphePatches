package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class uof {
    public static final tof a;

    static {
        a = pjm.a ? tof.a : tof.b;
    }

    public static rul a(ih5 ih5Var) {
        boolean z = pjm.a;
        zpa zpaVar = hh5.a;
        if (z) {
            vt9 vt9Var = (vt9) ih5Var;
            vt9Var.W(263082537);
            float f = oul.a;
            tul tulVarH = so1.h(vt9Var);
            Object objK = vt9Var.K();
            if (objK == zpaVar) {
                objK = new nd3((byte) 11);
                vt9Var.g0(objK);
            }
            Function0 function0 = (Function0) objK;
            boolean zF = vt9Var.f(tulVarH) | vt9Var.f(function0);
            Object objK2 = vt9Var.K();
            if (zF || objK2 == zpaVar) {
                objK2 = new afg(tulVarH, function0);
                vt9Var.g0(objK2);
            }
            afg afgVar = (afg) objK2;
            vt9Var.p(false);
            return afgVar;
        }
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.W(263152132);
        float f2 = oul.a;
        tul tulVarH2 = so1.h(vt9Var2);
        Object objK3 = vt9Var2.K();
        if (objK3 == zpaVar) {
            objK3 = new nd3((byte) 11);
            vt9Var2.g0(objK3);
        }
        Function0 function02 = (Function0) objK3;
        a2k a2kVarY = nb6.Y(jae.c, vt9Var2);
        wi6 wi6VarA = m0k.a(vt9Var2);
        boolean zF2 = vt9Var2.f(tulVarH2) | vt9Var2.f(function02) | vt9Var2.f(a2kVarY) | vt9Var2.f(wi6VarA) | vt9Var2.g(false);
        Object objK4 = vt9Var2.K();
        if (zF2 || objK4 == zpaVar) {
            objK4 = new z38(tulVarH2, a2kVarY, wi6VarA, function02);
            vt9Var2.g0(objK4);
        }
        z38 z38Var = (z38) objK4;
        vt9Var2.p(false);
        return z38Var;
    }
}
