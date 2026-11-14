package defpackage;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public interface tj5 {
    static wrf A(tj5 tj5Var, tj5 tj5Var2) {
        if (tj5Var == null && tj5Var2 == null) {
            return wrf.c;
        }
        fee feeVarL = tj5Var2 != null ? fee.l(tj5Var2) : fee.k();
        if (tj5Var != null) {
            Iterator it = tj5Var.d().iterator();
            while (it.hasNext()) {
                n(feeVarL, tj5Var2, tj5Var, (an2) it.next());
            }
        }
        return wrf.f(feeVarL);
    }

    static void n(fee feeVar, tj5 tj5Var, tj5 tj5Var2, an2 an2Var) {
        if (!Objects.equals(an2Var, hya.up)) {
            feeVar.q(an2Var, tj5Var2.h(an2Var), tj5Var2.i(an2Var));
            return;
        }
        zxh zxhVar = (zxh) tj5Var2.b(an2Var, null);
        zxh zxhVar2 = (zxh) tj5Var.b(an2Var, null);
        sj5 sj5VarH = tj5Var2.h(an2Var);
        if (zxhVar == null) {
            zxhVar = zxhVar2;
        } else if (zxhVar2 != null) {
            p8f p8fVarK = p8f.k(zxhVar2);
            sa2 sa2Var = zxhVar.a;
            if (sa2Var != null) {
                p8fVarK.b = sa2Var;
            }
            ayh ayhVar = zxhVar.b;
            if (ayhVar != null) {
                p8fVarK.c = ayhVar;
            }
            bm8 bm8Var = zxhVar.c;
            if (bm8Var != null) {
                p8fVarK.d = bm8Var;
            }
            zxhVar = new zxh((sa2) p8fVarK.b, (ayh) p8fVarK.c, (bm8) p8fVarK.d);
        }
        feeVar.q(an2Var, sj5VarH, zxhVar);
    }

    Object b(an2 an2Var, Object obj);

    void c(xj xjVar);

    Set d();

    Set e(an2 an2Var);

    boolean g(an2 an2Var);

    sj5 h(an2 an2Var);

    Object i(an2 an2Var);

    Object j(an2 an2Var, sj5 sj5Var);
}
