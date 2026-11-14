package defpackage;

import java.util.List;
import kotlin.Pair;

/* loaded from: classes.dex */
public abstract class vf1 {
    public static final Pair a;

    static {
        l08 l08Var = l08.a;
        a = new Pair(l08Var, l08Var);
    }

    public static final void a(sf1 sf1Var, List list, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1794596951);
        int i2 = (i & 6) == 0 ? (vt9Var.f(sf1Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= vt9Var.h(list) ? 32 : 16;
        }
        if (vt9Var.N(i2 & 1, (i2 & 19) != 18)) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                rf1 rf1Var = (rf1) list.get(i3);
                cr9 cr9Var = (cr9) rf1Var.a;
                int i4 = rf1Var.b;
                int i5 = rf1Var.c;
                Object objK = vt9Var.K();
                if (objK == hh5.a) {
                    objK = m51.d;
                    vt9Var.g0(objK);
                }
                tfd tfdVar = (tfd) objK;
                int iHashCode = Long.hashCode(vt9Var.T);
                oag oagVarL = vt9Var.l();
                c8e c8eVarP = qyn.P(vt9Var, z7e.b);
                bh5.To.getClass();
                vt9Var.a0();
                if (vt9Var.S) {
                    vt9Var.k(m3c.S);
                } else {
                    vt9Var.j0();
                }
                y4h.o(vt9Var, tfdVar, ujp.f);
                y4h.o(vt9Var, oagVarL, ujp.e);
                y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
                y4h.m(vt9Var);
                y4h.o(vt9Var, c8eVarP, ujp.d);
                cr9Var.invoke(sf1Var.subSequence(i4, i5).b, vt9Var, 0);
                vt9Var.p(true);
            }
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new uf1(sf1Var, list, i, (byte) 0);
        }
    }
}
