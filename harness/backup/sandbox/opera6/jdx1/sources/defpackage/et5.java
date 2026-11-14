package defpackage;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class et5 {
    public static final is5 a;

    static {
        cwi cwiVar = cwi.a;
        cwi cwiVar2 = cwi.a;
        hp7 hp7Var = w91.a;
        cwi cwiVar3 = cwi.a;
        long j = u95.c;
        long j2 = u95.b;
        a = new is5(j, j2, j2, u95.b(j2, 0.38f), u95.b(j2, 0.38f));
    }

    public static final void a(is5 is5Var, c8e c8eVar, ue5 ue5Var, ih5 ih5Var, int i) {
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-527864079);
        if ((i & 6) == 0) {
            i2 = (vt9Var.f(is5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vt9Var.f(c8eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var.h(ue5Var) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if (vt9Var.N(i2 & 1, (i2 & 147) != 146)) {
            sd3 sd3Var = bt5.a;
            c8e c8eVarC = sfe.C(t0h.q(c8eVar, 3.0f, v8i.a(4.0f)), is5Var.a, kfo.i);
            uhb uhbVar = uhb.a;
            c8e c8eVarS0 = oup.s0(a26.Z(na2.Y(c8eVarC), 0.0f, bt5.d, 1), oup.q0(vt9Var), true, true);
            int i3 = (i2 << 3) & 7168;
            db5 db5VarA = cb5.a(b72.c, rbe.n, vt9Var, 0);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarS0);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, db5VarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            ue5Var.invoke(eb5.a, vt9Var, Integer.valueOf(((i3 >> 6) & 112) | 6));
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ga1(is5Var, c8eVar, ue5Var, i, (byte) 4);
        }
    }

    public static final void b(c8e c8eVar, is5 is5Var, Function1 function1, ih5 ih5Var, int i, int i2) {
        int i3;
        int i4;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (vt9Var.f(c8eVar) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (vt9Var.f(is5Var) ? 32 : 16);
        }
        int i7 = i4 | (vt9Var.h(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY);
        if (vt9Var.N(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                c8eVar = z7e.b;
            }
            if (i6 != 0) {
                is5Var = a;
            }
            a(is5Var, c8eVar, gyg.P(-250345048, new b57((Object) function1, (Object) is5Var, (byte) 7), vt9Var), vt9Var, ((i7 >> 3) & 14) | 384 | ((i7 << 3) & 112));
        } else {
            vt9Var.Q();
        }
        c8e c8eVar2 = c8eVar;
        is5 is5Var2 = is5Var;
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ct5(c8eVar2, is5Var2, function1, i, i2);
        }
    }

    public static final void c(String str, boolean z, is5 is5Var, c8e c8eVar, cr9 cr9Var, Function0 function0, ih5 ih5Var, int i) {
        int i2;
        int i3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-2001167027);
        if ((i & 6) == 0) {
            i2 = (vt9Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vt9Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var.f(is5Var) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i & 3072) == 0) {
            i2 |= vt9Var.f(c8eVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= vt9Var.h(cr9Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= vt9Var.h(function0) ? 131072 : 65536;
        }
        if (vt9Var.N(i2 & 1, (74899 & i2) != 74898)) {
            sd3 sd3Var = bt5.a;
            float f = bt5.c;
            x62 x62Var = new x62(f, true, new t40((byte) 19));
            boolean z2 = ((i2 & 112) == 32) | ((458752 & i2) == 131072);
            Object objK = vt9Var.K();
            if (z2 || objK == hh5.a) {
                objK = new dt5(z, function0, (byte) 0);
                vt9Var.g0(objK);
            }
            c8e c8eVarZ = a26.Z(mpj.j(jpo.q(c8eVar, z, str, (Function0) objK, 12).d(mpj.a), 112.0f, 48.0f, 280.0f, 48.0f), f, 0.0f, 2);
            o9i o9iVarA = m9i.a(x62Var, sd3Var, vt9Var, 54);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarZ);
            bh5.To.getClass();
            vt9Var.a0();
            boolean z3 = vt9Var.S;
            fza fzaVar = m3c.S;
            if (z3) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            ah5 ah5Var = ujp.f;
            y4h.o(vt9Var, o9iVarA, ah5Var);
            ah5 ah5Var2 = ujp.e;
            y4h.o(vt9Var, oagVarL, ah5Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            ah5 ah5Var3 = ujp.g;
            y4h.o(vt9Var, numValueOf, ah5Var3);
            y4h.m(vt9Var);
            ah5 ah5Var4 = ujp.d;
            y4h.o(vt9Var, c8eVarP, ah5Var4);
            if (cr9Var == null) {
                vt9Var.W(-1597947094);
                vt9Var.p(false);
                i3 = i2;
            } else {
                vt9Var.W(-1597947093);
                float f2 = bt5.e;
                c8e c8eVarG = mpj.g(z7e.b, f2, 0.0f, f2, f2, 2);
                tfd tfdVarC = nr3.c(rbe.b, false);
                i3 = i2;
                int iHashCode2 = Long.hashCode(vt9Var.T);
                oag oagVarL2 = vt9Var.l();
                c8e c8eVarP2 = qyn.P(vt9Var, c8eVarG);
                vt9Var.a0();
                if (vt9Var.S) {
                    vt9Var.k(fzaVar);
                } else {
                    vt9Var.j0();
                }
                y4h.o(vt9Var, tfdVarC, ah5Var);
                y4h.o(vt9Var, oagVarL2, ah5Var2);
                u35.j(iHashCode2, vt9Var, ah5Var3, vt9Var);
                y4h.o(vt9Var, c8eVarP2, ah5Var4);
                cr9Var.invoke(new u95(z ? is5Var.c : is5Var.e), vt9Var, 0);
                vt9Var.p(true);
                vt9Var.p(false);
            }
            long j = z ? is5Var.b : is5Var.d;
            qbe.b(str, new g4c(1.0f, true), new ikl(j, bt5.h, bt5.i, null, bt5.k, bt5.b, bt5.j, null, null, null, 16613240), 0, false, 1, 0, vt9Var, (i3 & 14) | 1572864, 952);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new tb3(str, z, is5Var, c8eVar, cr9Var, function0, i);
        }
    }
}
