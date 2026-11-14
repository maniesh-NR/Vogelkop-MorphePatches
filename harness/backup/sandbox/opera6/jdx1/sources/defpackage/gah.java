package defpackage;

import androidx.core.app.NotificationCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gah {
    public static final gah a = new gah();
    public static final u8i b = v8i.a;
    public static final float c = 80.0f;
    public static final float d = 80.0f;
    public static final float e = 3.0f;

    public final void a(final sah sahVar, final boolean z, final c8e c8eVar, long j, long j2, float f, ih5 ih5Var, final int i) {
        final long j3;
        final long j4;
        final float f2;
        int i2;
        float f3;
        long j5;
        long j6;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1076870256);
        int i3 = i | (vt9Var.f(sahVar) ? 4 : 2) | (vt9Var.g(z) ? 32 : 16) | (vt9Var.f(c8eVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | 74752;
        if (vt9Var.N(i3 & 1, (599187 & i3) != 599186)) {
            vt9Var.S();
            if ((i & 1) == 0 || vt9Var.x()) {
                hp7 hp7Var = ua5.a;
                long j7 = ((sa5) vt9Var.j(hp7Var)).G;
                long j8 = ((sa5) vt9Var.j(hp7Var)).s;
                i2 = i3 & (-523265);
                f3 = d;
                j5 = j8;
                j6 = j7;
            } else {
                vt9Var.Q();
                i2 = i3 & (-523265);
                j6 = j;
                j5 = j2;
                f3 = f;
            }
            vt9Var.q();
            b(sahVar, z, c8eVar, f3, null, j6, 0.0f, gyg.P(298232649, new fah(z, j5, sahVar), vt9Var), vt9Var, (i2 & 14) | 12582912 | (i2 & 112) | (i2 & 896) | 100663296);
            f2 = f3;
            j3 = j6;
            j4 = j5;
        } else {
            vt9Var.Q();
            j3 = j;
            j4 = j2;
            f2 = f;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2(sahVar, z, c8eVar, j3, j4, f2, i) { // from class: aah
                public final /* synthetic */ sah b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ c8e d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ float g;

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = aoh.m(1572865);
                    this.a.a(this.b, this.c, this.d, this.e, this.f, this.g, (ih5) obj, iM);
                    return Unit.a;
                }
            };
        }
    }

    public final void b(final sah sahVar, final boolean z, final c8e c8eVar, final float f, u8i u8iVar, final long j, float f2, final ue5 ue5Var, ih5 ih5Var, final int i) {
        final sah sahVar2;
        int i2;
        gah gahVar;
        final u8i u8iVar2;
        final float f3;
        int i3;
        u8i u8iVar3;
        final u8i u8iVar4;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1341144489);
        if ((i & 6) == 0) {
            sahVar2 = sahVar;
            i2 = (vt9Var.f(sahVar2) ? 4 : 2) | i;
        } else {
            sahVar2 = sahVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vt9Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var.f(c8eVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i & 3072) == 0) {
            i2 |= vt9Var.c(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= vt9Var.e(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= vt9Var.h(ue5Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            gahVar = this;
            i2 |= vt9Var.f(gahVar) ? 67108864 : 33554432;
        } else {
            gahVar = this;
        }
        if (vt9Var.N(i2 & 1, (38347923 & i2) != 38347922)) {
            vt9Var.S();
            if ((i & 1) == 0 || vt9Var.x()) {
                i3 = i2 & (-3727361);
                u8iVar3 = b;
                f3 = e;
            } else {
                vt9Var.Q();
                i3 = i2 & (-3727361);
                u8iVar3 = u8iVar;
                f3 = f2;
            }
            int i4 = i3;
            vt9Var.q();
            c8e c8eVarH = mpj.h(c8eVar, 40.0f);
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (objK == zpaVar) {
                objK = new u4h((byte) 3);
                vt9Var.g0(objK);
            }
            c8e c8eVarF = fr3.F(c8eVarH, (Function1) objK);
            boolean zC = ((i4 & 14) == 4) | ((i4 & 112) == 32) | ((((i4 & 7168) ^ 3072) > 2048 && vt9Var.c(f)) || (i4 & 3072) == 2048) | vt9Var.c(f3) | vt9Var.f(u8iVar3);
            Object objK2 = vt9Var.K();
            if (zC || objK2 == zpaVar) {
                u8iVar4 = u8iVar3;
                cr9 cr9Var = new cr9() { // from class: bah
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        final ifg ifgVarN = ((pfd) obj2).N(((yo5) obj3).a);
                        int i5 = ifgVarN.a;
                        int i6 = ifgVarN.b;
                        final sah sahVar3 = sahVar2;
                        final boolean z2 = z;
                        final float f4 = f;
                        final float f5 = f3;
                        final u8i u8iVar5 = u8iVar4;
                        return ((vfd) obj).b0(i5, i6, n08.a, new Function1() { // from class: dah
                            public final Object invoke(Object obj4) {
                                final sah sahVar4 = sahVar3;
                                final boolean z3 = z2;
                                final float f6 = f4;
                                final float f7 = f5;
                                final u8i u8iVar6 = u8iVar5;
                                p1d.p((p1d) obj4, ifgVarN, new Function1() { // from class: eah
                                    public final Object invoke(Object obj5) {
                                        m1i m1iVar = (m1i) obj5;
                                        sah sahVar5 = sahVar4;
                                        boolean z4 = ((Number) sahVar5.a.d()).floatValue() > 0.0f || z3;
                                        m1iVar.t((((Number) sahVar5.a.d()).floatValue() * m1iVar.M(f6)) - Float.intBitsToFloat((int) (m1iVar.r & 4294967295L)));
                                        m1iVar.l(z4 ? m1iVar.t.b() * f7 : 0.0f);
                                        m1iVar.n(u8iVar6);
                                        m1iVar.f(true);
                                        return Unit.a;
                                    }
                                }, 4);
                                return Unit.a;
                            }
                        });
                    }
                };
                vt9Var.g0(cr9Var);
                objK2 = cr9Var;
            } else {
                u8iVar4 = u8iVar3;
            }
            c8e c8eVarC = sfe.C(yi4.F(c8eVarF, (cr9) objK2), j, u8iVar4);
            int i5 = ((i4 >> 12) & 7168) | 48;
            tfd tfdVarC = nr3.c(rbe.f, false);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarC);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, tfdVarC, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            ah5 ah5Var = ujp.g;
            if (vt9Var.S || !Intrinsics.a(vt9Var.K(), Integer.valueOf(iHashCode))) {
                vep.x(iHashCode, vt9Var, iHashCode, ah5Var);
            }
            y4h.o(vt9Var, c8eVarP, ujp.d);
            ue5Var.invoke(as3.a, vt9Var, Integer.valueOf(((i5 >> 6) & 112) | 6));
            vt9Var.p(true);
            u8iVar2 = u8iVar4;
        } else {
            vt9Var.Q();
            u8iVar2 = u8iVar;
            f3 = f2;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            final gah gahVar2 = gahVar;
            znhVarR.d = new Function2() { // from class: cah
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.a.b(sahVar, z, c8eVar, f, u8iVar2, j, f3, ue5Var, (ih5) obj, aoh.m(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
