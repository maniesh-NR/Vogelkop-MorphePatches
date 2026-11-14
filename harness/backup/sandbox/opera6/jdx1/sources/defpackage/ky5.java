package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ky5 {
    public static final ey5 a;
    public static final i6 b;

    static {
        ey5 ey5Var = new ey5("Nigeria", "+234", "NG");
        a = ey5Var;
        b = rm5.K(ey5Var);
    }

    public static final void a(ey5 ey5Var, Function0 function0, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1788709654);
        int i2 = i | (vt9Var.f(ey5Var) ? 4 : 2) | (vt9Var.h(function0) ? 32 : 16);
        byte b2 = 0;
        if (vt9Var.N(i2 & 1, (i2 & 19) != 18)) {
            utk.b(function0, mpj.a, false, null, 0L, 0L, 0.0f, null, null, gyg.P(1746521077, new hy5(ey5Var, b2), vt9Var), vt9Var, ((i2 >> 3) & 14) | 48, 1020);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fx0(ey5Var, function0, i, (byte) 20);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.ey5 r40, final g1b r41, final kotlin.jvm.functions.Function1 r42, defpackage.c8e r43, boolean r44, defpackage.ih5 r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ky5.b(ey5, g1b, kotlin.jvm.functions.Function1, c8e, boolean, ih5, int, int):void");
    }
}
