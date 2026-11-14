package defpackage;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class gz0 {
    public static final hp7 a;

    static {
        a26.d(16.0f, 7);
        a26.d(16.0f, 7);
        a26.d(24.0f, 7);
        a = new hp7(new lb((byte) 5), (byte) 0);
    }

    public static final void a(Function0 function0, c8e c8eVar, y77 y77Var, ue5 ue5Var, ih5 ih5Var, int i) {
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(24925658);
        if ((i & 6) == 0) {
            i2 = (vt9Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vt9Var.f(c8eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var.f(y77Var) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i & 3072) == 0) {
            i2 |= vt9Var.h(ue5Var) ? 2048 : 1024;
        }
        if (vt9Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            ((rl6) vt9Var.j(a)).a(new s9i(function0, c8eVar, y77Var, ue5Var, (byte) 6, false), vt9Var, 0);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fz0(function0, c8eVar, y77Var, ue5Var, i, (byte) 0);
        }
    }
}
