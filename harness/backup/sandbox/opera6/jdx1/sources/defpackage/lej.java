package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class lej {
    public static final e8m a = rm5.X(300, 2, wq7.a);

    public static final void a(ue5 ue5Var, ih5 ih5Var, int i) {
        ue5 ue5Var2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1033612924);
        byte b = 0;
        if (vt9Var.N(i & 1, (i & 19) != 18)) {
            String strG = a4h.g(vt9Var, 2132019590);
            kga kgaVar = new kga(rbe.o);
            tfd tfdVarC = nr3.c(rbe.b, false);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, kgaVar);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, tfdVarC, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            ah5 ah5Var = ujp.g;
            if (vt9Var.S || !Intrinsics.a(vt9Var.K(), Integer.valueOf(iHashCode))) {
                vep.x(iHashCode, vt9Var, iHashCode, ah5Var);
            }
            y4h.o(vt9Var, c8eVarP, ujp.d);
            zvf zvfVar = wtl.a;
            int iM = ((n27) vt9Var.j(mi5.h)).M(4.0f);
            boolean zD = vt9Var.d(iM);
            Object objK = vt9Var.K();
            Object obj = hh5.a;
            if (zD || objK == obj) {
                objK = new xtl(iM);
                vt9Var.g0(objK);
            }
            xtl xtlVar = (xtl) objK;
            ue5 ue5VarP = gyg.P(2059851063, new kej(strG, b), vt9Var);
            mfe mfeVar = sb3.a;
            boolean zG = vt9Var.g(false) | vt9Var.f(mfeVar);
            Object objK2 = vt9Var.K();
            if (zG || objK2 == obj) {
                objK2 = new ztl(mfeVar);
                vt9Var.g0(objK2);
            }
            ue5Var2 = ue5Var;
            wtl.b(xtlVar, ue5VarP, (ztl) objK2, null, false, ue5Var2, vt9Var, 100663344);
            vt9Var.p(true);
        } else {
            ue5Var2 = ue5Var;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new bg5(ue5Var2, i, (byte) 12);
        }
    }
}
