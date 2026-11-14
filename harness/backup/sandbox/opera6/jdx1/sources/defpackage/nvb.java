package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class nvb {
    public final r17 a;
    public ovb b;
    public gg9 c;

    public nvb(r17 r17Var) {
        this.a = r17Var;
    }

    public final boolean a(int i) {
        Function1 function1;
        r17 r17Var;
        if (i == 7) {
            ovb ovbVar = this.b;
            if (ovbVar == null) {
                ovbVar = null;
            }
            function1 = ovbVar.a;
        } else if (i == 2) {
            ovb ovbVar2 = this.b;
            if (ovbVar2 == null) {
                ovbVar2 = null;
            }
            function1 = ovbVar2.b;
        } else if (i == 6) {
            ovb ovbVar3 = this.b;
            if (ovbVar3 == null) {
                ovbVar3 = null;
            }
            function1 = ovbVar3.c;
        } else if (i == 5) {
            ovb ovbVar4 = this.b;
            if (ovbVar4 == null) {
                ovbVar4 = null;
            }
            function1 = ovbVar4.d;
        } else if (i == 3) {
            ovb ovbVar5 = this.b;
            if (ovbVar5 == null) {
                ovbVar5 = null;
            }
            function1 = ovbVar5.e;
        } else if (i == 4) {
            ovb ovbVar6 = this.b;
            if (ovbVar6 == null) {
                ovbVar6 = null;
            }
            function1 = ovbVar6.f;
        } else {
            if (i != 1 && i != 0) {
                qp2.n("invalid ImeAction");
                return false;
            }
            function1 = null;
        }
        if (function1 != null) {
            function1.invoke(this);
            return true;
        }
        if (i == 6) {
            gg9 gg9Var = this.c;
            (gg9Var != null ? gg9Var : null).g(1, true);
            return true;
        }
        if (i == 5) {
            gg9 gg9Var2 = this.c;
            (gg9Var2 != null ? gg9Var2 : null).g(2, true);
            return true;
        }
        if (i != 7 || (r17Var = this.a) == null) {
            return false;
        }
        r17Var.a();
        return true;
    }
}
