package defpackage;

import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class x6c {
    public static final m6c a = new m6c(null, 0, false, 0.0f, new w6c((byte) 0), 0.0f, false, sgb.b(h.a), xf8.i(), ap5.b(0, 0, 0, 0, 15), 0, l08.a, 0, 0, 0, fsf.a, 0, 0);

    public static final u6c a(final int i, ih5 ih5Var, int i2) {
        final byte b = 0;
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        c67 c67Var = u6c.y;
        boolean zD = ((vt9) ih5Var).d(i) | ((vt9) ih5Var).d(0);
        vt9 vt9Var = (vt9) ih5Var;
        Object objK = vt9Var.K();
        if (zD || objK == hh5.a) {
            objK = new Function0() { // from class: v6c
                public final Object invoke() {
                    byte b2 = b;
                    int i3 = i;
                    switch (b2) {
                        case 0:
                            return new u6c(i3, 0);
                        default:
                            return Integer.valueOf(i3);
                    }
                }
            };
            vt9Var.g0(objK);
        }
        return (u6c) w1h.u(objArr, c67Var, (Function0) objK, vt9Var, 0);
    }
}
