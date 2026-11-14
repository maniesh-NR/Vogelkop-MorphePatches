package defpackage;

import androidx.core.app.NotificationCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class wtl {
    public static final zvf a = new zvf(8.0f, 4.0f, 8.0f, 4.0f);

    public static final void a(final ytl ytlVar, c8e c8eVar, float f, paj pajVar, long j, long j2, final ue5 ue5Var, ih5 ih5Var, final int i) {
        int i2;
        vt9 vt9Var;
        final c8e c8eVar2;
        final float f2;
        final paj pajVar2;
        final long j3;
        final long j4;
        long jD;
        int i3;
        float f3;
        long j5;
        paj pajVar3;
        c8e c8eVar3;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-343758958);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? vt9Var2.f(ytlVar) : vt9Var2.h(ytlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 3504;
        if ((i & 24576) == 0) {
            i4 = i2 | 11696;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        int i5 = i4 | 113246208;
        if ((805306368 & i) == 0) {
            i5 |= vt9Var2.h(ue5Var) ? 536870912 : 268435456;
        }
        if (vt9Var2.N(i5 & 1, (306783379 & i5) != 306783378)) {
            vt9Var2.S();
            if ((i & 1) == 0 || vt9Var2.x()) {
                paj pajVarB = ccj.b(vfg.b, vt9Var2);
                jD = ua5.d(vfg.c, vt9Var2);
                long jD2 = ua5.d(vfg.a, vt9Var2);
                i3 = i5 & (-4186113);
                z7e z7eVar = z7e.b;
                f3 = ocp.d;
                j5 = jD2;
                pajVar3 = pajVarB;
                c8eVar3 = z7eVar;
            } else {
                vt9Var2.Q();
                i3 = i5 & (-4186113);
                c8eVar3 = c8eVar;
                f3 = f;
                pajVar3 = pajVar;
                jD = j;
                j5 = j2;
            }
            vt9Var2.q();
            vt9Var2.W(-1719831991);
            vt9Var2.p(false);
            int i6 = i3 >> 9;
            vt9Var = vt9Var2;
            utk.a(c8eVar3, pajVar3, j5, 0L, 0.0f, 0.0f, gyg.P(-1573998995, new vtl(f3, jD, ue5Var), vt9Var2), vt9Var, 12582912 | (57344 & i6) | (i6 & 458752), 72);
            j3 = jD;
            f2 = f3;
            c8eVar2 = c8eVar3;
            pajVar2 = pajVar3;
            j4 = j5;
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
            c8eVar2 = c8eVar;
            f2 = f;
            pajVar2 = pajVar;
            j3 = j;
            j4 = j2;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2() { // from class: utl
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wtl.a(ytlVar, c8eVar2, f2, pajVar2, j3, j4, ue5Var, (ih5) obj, aoh.m(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(xtl xtlVar, ue5 ue5Var, ztl ztlVar, c8e c8eVar, boolean z, ue5 ue5Var2, ih5 ih5Var, int i) {
        xtl xtlVar2;
        ztl ztlVar2;
        ue5 ue5Var3;
        boolean z2;
        c8e c8eVar2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-293753984);
        int i2 = (vt9Var.f(xtlVar) ? 4 : 2) | i | (vt9Var.f(ztlVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | 14380032;
        if (vt9Var.N(i2 & 1, (38347923 & i2) != 38347922)) {
            b3m b3mVarS = r9h.s(ztlVar.b, "tooltip transition", vt9Var, 48);
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (objK == zpaVar) {
                objK = hyg.k((Object) null);
                vt9Var.g0(objK);
            }
            afe afeVar = (afe) objK;
            Object objK2 = vt9Var.K();
            if (objK2 == zpaVar) {
                new ox0(afeVar, (byte) 16);
                objK2 = new ytl();
                vt9Var.g0(objK2);
            }
            ue5 ue5VarP = gyg.P(-23901870, new ub3((Object) afeVar, (br9) ue5Var2, (byte) 8), vt9Var);
            z7e z7eVar = z7e.b;
            xtlVar2 = xtlVar;
            ztlVar2 = ztlVar;
            sfe.a(xtlVar2, gyg.P(-527401546, new ytd(b3mVarS, ue5Var, (ytl) objK2), vt9Var), ztlVar2, z7eVar, ue5VarP, vt9Var, (i2 & 14) | 100663344 | (i2 & 896) | 14380032);
            ue5Var3 = ue5Var2;
            c8eVar2 = z7eVar;
            z2 = true;
        } else {
            xtlVar2 = xtlVar;
            ztlVar2 = ztlVar;
            vt9Var.Q();
            ue5Var3 = ue5Var2;
            z2 = z;
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new z71(xtlVar2, ue5Var, ztlVar2, c8eVar2, z2, ue5Var3, i);
        }
    }
}
