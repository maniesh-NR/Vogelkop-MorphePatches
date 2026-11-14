package defpackage;

import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public abstract class fed {
    public static final hp7 a;

    static {
        z4c.b(new uuc((byte) 6));
        a = new hp7(new uuc((byte) 7), (byte) 1);
    }

    public static final void a(sa5 sa5Var, iae iaeVar, acj acjVar, wam wamVar, ue5 ue5Var, ih5 ih5Var, int i) {
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(904511636);
        if ((i & 6) == 0) {
            i2 = (vt9Var.f(sa5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vt9Var.f(iaeVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var.f(acjVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i & 3072) == 0) {
            i2 |= vt9Var.f(wamVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= vt9Var.h(ue5Var) ? 16384 : 8192;
        }
        if (vt9Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            vt9Var.S();
            if ((i & 1) != 0 && !vt9Var.x()) {
                vt9Var.Q();
            }
            vt9Var.q();
            p5i p5iVarA = n5i.a(7, 0.0f, false);
            long j = sa5Var.a;
            boolean zE = vt9Var.e(j);
            Object objK = vt9Var.K();
            if (zE || objK == hh5.a) {
                objK = new akl(j, u95.b(j, 0.4f));
                vt9Var.g0(objK);
            }
            kfo.d(new k7h[]{ua5.a.a(sa5Var), a.a(iaeVar), c6b.a.a(p5iVarA), ccj.a.a(acjVar), bkl.a.a((akl) objK), abm.a.a(wamVar)}, gyg.P(-1750539308, new ub3((Object) wamVar, (br9) ue5Var, (byte) 3), vt9Var), vt9Var, 56);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new lc1(sa5Var, iaeVar, acjVar, wamVar, ue5Var, i, (byte) 3);
        }
    }

    public static final void b(sa5 sa5Var, acj acjVar, wam wamVar, ue5 ue5Var, ih5 ih5Var, int i, int i2) {
        ue5 ue5Var2;
        wam wamVar2;
        acj acjVar2;
        sa5 sa5Var2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-449719819);
        int i3 = (((i2 & 1) == 0 && vt9Var.f(sa5Var)) ? 4 : 2) | i | (((i2 & 2) == 0 && vt9Var.f(acjVar)) ? 32 : 16) | (vt9Var.f(wamVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY);
        if ((i & 3072) == 0) {
            i3 |= vt9Var.h(ue5Var) ? 2048 : 1024;
        }
        if (vt9Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            vt9Var.S();
            if ((i & 1) == 0 || vt9Var.x()) {
                if ((i2 & 1) != 0) {
                    sa5Var = (sa5) vt9Var.j(ua5.a);
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    acjVar = (acj) vt9Var.j(ccj.a);
                    i3 &= -113;
                }
                sa5 sa5Var3 = sa5Var;
                acj acjVar3 = acjVar;
                vt9Var.q();
                int i4 = i3 & 14;
                int i5 = i3 << 3;
                a(sa5Var3, (iae) vt9Var.j(a), acjVar3, wamVar, ue5Var, vt9Var, i4 | (i5 & 896) | (i5 & 7168) | (i5 & 57344));
                wamVar2 = wamVar;
                ue5Var2 = ue5Var;
                sa5Var2 = sa5Var3;
                acjVar2 = acjVar3;
            } else {
                vt9Var.Q();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                sa5 sa5Var32 = sa5Var;
                acj acjVar32 = acjVar;
                vt9Var.q();
                int i42 = i3 & 14;
                int i52 = i3 << 3;
                a(sa5Var32, (iae) vt9Var.j(a), acjVar32, wamVar, ue5Var, vt9Var, i42 | (i52 & 896) | (i52 & 7168) | (i52 & 57344));
                wamVar2 = wamVar;
                ue5Var2 = ue5Var;
                sa5Var2 = sa5Var32;
                acjVar2 = acjVar32;
            }
        } else {
            ue5Var2 = ue5Var;
            wamVar2 = wamVar;
            vt9Var.Q();
            acjVar2 = acjVar;
            sa5Var2 = sa5Var;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new eed(sa5Var2, acjVar2, wamVar2, ue5Var2, i, i2);
        }
    }
}
