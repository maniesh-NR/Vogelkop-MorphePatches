package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class a81 {
    static {
        cwi cwiVar = cwi.a;
        hp7 hp7Var = w91.a;
        cwi cwiVar2 = cwi.a;
        cwi cwiVar3 = cwi.a;
    }

    public static final void a(ue5 ue5Var, Function0 function0, c8e c8eVar, boolean z, otd otdVar, zvf zvfVar, ih5 ih5Var, int i) {
        c8e c8eVar2;
        boolean z2;
        otd otdVar2;
        zvf zvfVar2;
        otd otdVar3;
        int i2;
        c8e c8eVar3;
        zvf zvfVar3;
        otd otdVar4;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-532959117);
        int i3 = i | (vt9Var.h(function0) ? 32 : 16) | 113995136;
        boolean z3 = true;
        if (vt9Var.N(i3 & 1, (38347923 & i3) != 38347922)) {
            vt9Var.S();
            if ((i & 1) == 0 || vt9Var.x()) {
                float f = jtd.a;
                sa5 sa5Var = (sa5) vt9Var.j(ua5.a);
                otd otdVar5 = sa5Var.f0;
                if (otdVar5 == null) {
                    otdVar3 = new otd(ua5.c(sa5Var, ric.i), ua5.c(sa5Var, ric.k), ua5.c(sa5Var, ric.q), u95.b(ua5.c(sa5Var, ric.c), ric.d), u95.b(ua5.c(sa5Var, ric.e), ric.f), u95.b(ua5.c(sa5Var, ric.g), ric.h));
                    sa5Var.f0 = otdVar3;
                } else {
                    otdVar3 = otdVar5;
                }
                i2 = i3 & (-3670017);
                zvf zvfVar4 = jtd.b;
                c8eVar3 = z7e.b;
                zvfVar3 = zvfVar4;
                otdVar4 = otdVar3;
            } else {
                vt9Var.Q();
                i2 = i3 & (-3670017);
                c8eVar3 = c8eVar;
                z3 = z;
                otdVar4 = otdVar;
                zvfVar3 = zvfVar;
            }
            vt9Var.q();
            k1g.d(ue5Var, function0, c8eVar3, z3, otdVar4, zvfVar3, vt9Var, i2 & 268435454);
            c8eVar2 = c8eVar3;
            z2 = z3;
            otdVar2 = otdVar4;
            zvfVar2 = zvfVar3;
        } else {
            vt9Var.Q();
            c8eVar2 = c8eVar;
            z2 = z;
            otdVar2 = otdVar;
            zvfVar2 = zvfVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new z71(ue5Var, function0, c8eVar2, z2, otdVar2, zvfVar2, i);
        }
    }
}
