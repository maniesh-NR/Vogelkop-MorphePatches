package defpackage;

import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class oul {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;

    static {
        xam xamVar = ap1.a;
        a = 64.0f;
        b = 64.0f;
        xam xamVar2 = zo1.a;
        c = 112.0f;
        int i = yo1.a;
        d = 64.0f;
        xam xamVar3 = uo1.a;
        e = 152.0f;
        int i2 = to1.a;
    }

    public static nul a(sa5 sa5Var) {
        nul nulVar = sa5Var.b0;
        if (nulVar != null) {
            return nulVar;
        }
        nul nulVar2 = new nul(ua5.c(sa5Var, cp1.a), ua5.c(sa5Var, cp1.c), ua5.c(sa5Var, cp1.b), ua5.c(sa5Var, cp1.e), ua5.c(sa5Var, cp1.f), ua5.c(sa5Var, cp1.d));
        sa5Var.b0 = nulVar2;
        return nulVar2;
    }

    public static cec b(ih5 ih5Var) {
        WeakHashMap weakHashMap = k3o.x;
        return new cec(new tlm(fac.m(ih5Var).g, fac.m(ih5Var).b), a4h.a | 16);
    }

    public static nul c(ih5 ih5Var) {
        return a((sa5) ((vt9) ih5Var).j(ua5.a));
    }
}
