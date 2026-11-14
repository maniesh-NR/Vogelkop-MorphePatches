package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class rl6 {
    public static final rl6 a = new rl6();

    public final void a(s9i s9iVar, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1565826668);
        byte b = 2;
        int i2 = (vt9Var.f(s9iVar) ? 4 : 2) | i;
        if (vt9Var.N(i2 & 1, (i2 & 3) != 2)) {
            vtp.c((Function0) s9iVar.b, (y77) s9iVar.d, gyg.P(1163527043, new o31(s9iVar, b), vt9Var), vt9Var, 384);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fx0(this, s9iVar, i, (byte) 21);
        }
    }
}
