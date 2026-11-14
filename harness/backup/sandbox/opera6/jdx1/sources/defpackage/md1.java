package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class md1 {
    public static final a2k a = rm5.R(0.0f, 0.0f, null, 7);

    static {
        Map map = tan.a;
        rm5.R(0.0f, 0.0f, new gh7(0.4f), 3);
    }

    public static final iak a(float f, h49 h49Var, ih5 ih5Var, int i, int i2) {
        return c(new gh7(f), a26.g, h49Var, null, (i2 & 4) != 0 ? "DpAnimation" : "OperaSwitchThumbSize", ih5Var, (i << 6) & 57344, 8);
    }

    public static final iak b(float f, h49 h49Var, String str, ih5 ih5Var, int i, int i2) {
        h49 h49Var2;
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (h49Var == a) {
            vt9 vt9Var = (vt9) ih5Var;
            vt9Var.W(1144115775);
            boolean zC = vt9Var.c(0.01f);
            Object objK = vt9Var.K();
            if (zC || objK == hh5.a) {
                objK = rm5.R(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                vt9Var.g0(objK);
            }
            vt9Var.p(false);
            h49Var2 = (a2k) objK;
        } else {
            vt9 vt9Var2 = (vt9) ih5Var;
            vt9Var2.W(1144225701);
            vt9Var2.p(false);
            h49Var2 = h49Var;
        }
        return c(Float.valueOf(f), a26.e, h49Var2, null, str2, ih5Var, (i << 3) & 57344, 0);
    }

    public static final iak c(Object obj, j8m j8mVar, h49 h49Var, Float f, String str, ih5 ih5Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        vt9 vt9Var = (vt9) ih5Var;
        Object objK = vt9Var.K();
        Object obj2 = hh5.a;
        if (objK == obj2) {
            objK = hyg.k((Object) null);
            vt9Var.g0(objK);
        }
        afe afeVar = (afe) objK;
        Object objK2 = vt9Var.K();
        if (objK2 == obj2) {
            objK2 = new cd1(obj, j8mVar, f);
            vt9Var.g0(objK2);
        }
        cd1 cd1Var = (cd1) objK2;
        afe afeVarO = hyg.o((Object) null, vt9Var);
        if (f != null && (h49Var instanceof a2k)) {
            a2k a2kVar = (a2k) h49Var;
            if (!Intrinsics.a(a2kVar.c, f)) {
                h49Var = new a2k(a2kVar.a, a2kVar.b, f);
            }
        }
        afe afeVarO2 = hyg.o(h49Var, vt9Var);
        Object objK3 = vt9Var.K();
        if (objK3 == obj2) {
            objK3 = xf8.h(-1, null, null, 6);
            vt9Var.g0(objK3);
        }
        or4 or4Var = (or4) objK3;
        boolean zH = vt9Var.h(or4Var) | vt9Var.h(obj);
        Object objK4 = vt9Var.K();
        if (zH || objK4 == obj2) {
            objK4 = new x2(or4Var, obj, (byte) 14);
            vt9Var.g0(objK4);
        }
        rm5.L(vt9Var, (Function0) objK4);
        boolean zH2 = vt9Var.h(or4Var) | vt9Var.h(cd1Var) | vt9Var.f(afeVarO2) | vt9Var.f(afeVarO);
        Object objK5 = vt9Var.K();
        if (zH2 || objK5 == obj2) {
            Object ld1Var = new ld1(or4Var, cd1Var, afeVarO2, afeVarO, null);
            vt9Var.g0(ld1Var);
            objK5 = ld1Var;
        }
        rm5.e(vt9Var, or4Var, (Function2) objK5);
        iak iakVar = (iak) afeVar.getValue();
        return iakVar == null ? cd1Var.c : iakVar;
    }
}
