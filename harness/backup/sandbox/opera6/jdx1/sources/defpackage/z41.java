package defpackage;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class z41 {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    public static final void a(k9f k9fVar, c8e c8eVar, long j, ih5 ih5Var, int i) {
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1776202187);
        int i3 = (vt9Var.f(k9fVar) ? 4 : 2) | i | (vt9Var.f(c8eVar) ? 32 : 16) | NotificationCompat.FLAG_HIGH_PRIORITY;
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            vt9Var.S();
            if ((i & 1) == 0 || vt9Var.x()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                vt9Var.Q();
                i2 = i3 & (-897);
            }
            vt9Var.q();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objK = vt9Var.K();
            if (z || objK == hh5.a) {
                objK = new z3(k9fVar, (byte) 20);
                vt9Var.g0(objK);
            }
            scd.c(k9fVar, rbe.c, gyg.P(-1653527038, new u41(j, h0j.a(c8eVar, false, (Function1) objK)), vt9Var), vt9Var, i4 | 432);
        } else {
            vt9Var.Q();
        }
        long j2 = j;
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new v41(k9fVar, c8eVar, j2, i);
        }
    }

    public static final void b(int i, int i2, ih5 ih5Var, c8e c8eVar) {
        int i3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (vt9Var.f(c8eVar) ? 4 : 2) | i;
        }
        if (vt9Var.N(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                c8eVar = z7e.b;
            }
            ocp.c(vt9Var, fr3.E(mpj.i(c8eVar, a, 25.0f), new x41(((akl) vt9Var.j(bkl.a)).a, (byte) 0)));
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new w41(c8eVar, i, i2);
        }
    }
}
