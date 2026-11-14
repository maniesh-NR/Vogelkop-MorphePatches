package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class sw6 {
    public static final gog a = new gog(30);

    public static final void a(xfl xflVar, kfl kflVar, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1904307118);
        int i2 = (vt9Var.f(xflVar) ? 4 : 2) | i | (vt9Var.h(kflVar) ? 32 : 16);
        if (vt9Var.N(i2 & 1, (i2 & 19) != 18)) {
            vt9Var.W(-1009482584);
            Context context = (Context) vt9Var.j(j41.b);
            vt9Var.p(false);
            boolean zH = vt9Var.h(kflVar) | ((i2 & 14) == 4) | vt9Var.h(context);
            Object objK = vt9Var.K();
            if (zH || objK == hh5.a) {
                objK = new f9(kflVar, context, xflVar, (byte) 27);
                vt9Var.g0(objK);
            }
            et5.b(null, null, (Function1) objK, vt9Var, 0, 3);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fx0(xflVar, kflVar, i, (byte) 24);
        }
    }

    public static final void b(final int i, final long j, ih5 ih5Var, final int i2) {
        final int i3;
        int i4;
        znh znhVarR;
        Function2 function2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = i2 | (vt9Var.d(i3) ? 4 : 2);
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= vt9Var.e(j) ? 32 : 16;
        }
        if (vt9Var.N(i4 & 1, (i4 & 19) != 18)) {
            Context context = (Context) vt9Var.j(j41.b);
            boolean zF = vt9Var.f(context) | ((i4 & 14) == 4);
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (zF || objK == zpaVar) {
                objK = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                vt9Var.g0(objK);
            }
            int iIntValue = ((Number) objK).intValue();
            if (iIntValue == -1) {
                znhVarR = vt9Var.r();
                if (znhVarR != null) {
                    final byte b = 1;
                    function2 = new Function2() { // from class: rw6
                        public final Object invoke(Object obj, Object obj2) {
                            byte b2 = b;
                            ih5 ih5Var2 = (ih5) obj;
                            ((Integer) obj2).getClass();
                            switch (b2) {
                                case 0:
                                    sw6.b(i3, j, ih5Var2, aoh.m(i2 | 1));
                                    break;
                                default:
                                    sw6.b(i3, j, ih5Var2, aoh.m(i2 | 1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    znhVarR.d = function2;
                }
                return;
            }
            hyf hyfVarH0 = phj.h0(vt9Var, iIntValue);
            boolean z = (i4 & 112) == 32;
            Object objK2 = vt9Var.K();
            if (z || objK2 == zpaVar) {
                objK2 = j == 16 ? null : new kh3(j, 5);
                vt9Var.g0(objK2);
            }
            nr3.a(nb6.L(mpj.h(z7e.b, bt5.e), hyfVarH0, null, jr5.b, 0.0f, (kh3) objK2, 22), vt9Var, 0);
        } else {
            vt9Var.Q();
        }
        znhVarR = vt9Var.r();
        if (znhVarR != null) {
            final byte b2 = 0;
            function2 = new Function2() { // from class: rw6
                public final Object invoke(Object obj, Object obj2) {
                    byte b22 = b2;
                    ih5 ih5Var2 = (ih5) obj;
                    ((Integer) obj2).getClass();
                    switch (b22) {
                        case 0:
                            sw6.b(i, j, ih5Var2, aoh.m(i2 | 1));
                            break;
                        default:
                            sw6.b(i, j, ih5Var2, aoh.m(i2 | 1));
                            break;
                    }
                    return Unit.a;
                }
            };
            znhVarR.d = function2;
        }
    }

    public static final void c(xfl xflVar, lfl lflVar, Function0 function0, ih5 ih5Var, int i) {
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? vt9Var.f(xflVar) : vt9Var.h(xflVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? vt9Var.f(lflVar) : vt9Var.h(lflVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var.h(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        boolean z = false;
        if (vt9Var.N(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && vt9Var.f(lflVar));
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (z2 || objK == zpaVar) {
                objK = new y7d(new wth(new gb3(lflVar, function0, (byte) 20), (byte) 29));
                vt9Var.g0(objK);
            }
            y7d y7dVar = (y7d) objK;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && vt9Var.h(xflVar))) {
                z = true;
            }
            Object objK2 = vt9Var.K();
            if (z || objK2 == zpaVar) {
                objK2 = new r94(xflVar, (byte) 25);
                vt9Var.g0(objK2);
            }
            w91.a(y7dVar, (Function0) objK2, a, gyg.P(1315155414, new fx0(lflVar, xflVar, (byte) 23), vt9Var), vt9Var, 3456, 0);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ga1(xflVar, lflVar, function0, i, (byte) 6);
        }
    }

    public static final void d(c8e c8eVar, ue5 ue5Var, ih5 ih5Var, int i) {
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1392105195);
        if ((i & 6) == 0) {
            i2 = (vt9Var.f(c8eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vt9Var.h(ue5Var) ? 32 : 16;
        }
        if (vt9Var.N(i2 & 1, (i2 & 19) != 18)) {
            w7d.a(c8eVar, vfl.a, ue5Var, vt9Var, (i2 & 14) | 432 | ((i2 << 6) & 7168));
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fb1(c8eVar, ue5Var, i, (byte) 2);
        }
    }
}
