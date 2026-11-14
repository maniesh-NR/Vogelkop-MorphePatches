package defpackage;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class dkk {
    public static final ftj a = new ftj((byte) 2);
    public static final Object b = new Object();

    public static final void a(c8e c8eVar, Function2 function2, ih5 ih5Var, int i, int i2) {
        int i3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (vt9Var.f(c8eVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= vt9Var.h(function2) ? 32 : 16;
        }
        if (vt9Var.N(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                c8eVar = z7e.b;
            }
            Object objK = vt9Var.K();
            if (objK == hh5.a) {
                objK = new hkk(ydp.h);
                vt9Var.g0(objK);
            }
            b((hkk) objK, c8eVar, function2, vt9Var, (i3 << 3) & 1008);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new zef(c8eVar, function2, i, i2);
        }
    }

    public static final void b(hkk hkkVar, c8e c8eVar, Function2 function2, ih5 ih5Var, int i) {
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-511989831);
        if ((i & 6) == 0) {
            i2 = (vt9Var.h(hkkVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vt9Var.f(c8eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var.h(function2) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if (vt9Var.N(i2 & 1, (i2 & 147) != 146)) {
            int iHashCode = Long.hashCode(vt9Var.T);
            tt9 tt9VarB = mkh.B(vt9Var);
            c8e c8eVarP = qyn.P(vt9Var, c8eVar);
            oag oagVarL = vt9Var.l();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, hkkVar, hkkVar.c);
            y4h.o(vt9Var, tt9VarB, hkkVar.d);
            y4h.o(vt9Var, function2, hkkVar.e);
            bh5.To.getClass();
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            vt9Var.p(true);
            if (vt9Var.z()) {
                vt9Var.W(-1259187287);
                vt9Var.p(false);
            } else {
                vt9Var.W(-1259245908);
                boolean zH = vt9Var.h(hkkVar);
                Object objK = vt9Var.K();
                if (zH || objK == hh5.a) {
                    objK = new dnj(hkkVar, (byte) 19);
                    vt9Var.g0(objK);
                }
                rm5.L(vt9Var, (Function0) objK);
                vt9Var.p(false);
            }
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ga1(hkkVar, c8eVar, function2, i, (byte) 17);
        }
    }
}
