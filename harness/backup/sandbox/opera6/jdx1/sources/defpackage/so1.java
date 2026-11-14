package defpackage;

import androidx.core.app.NotificationCompat;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class so1 {
    public static final hp7 a = new hp7(new vk1((byte) 15), (byte) 0);
    public static final hp7 b = new hp7(new vk1((byte) 13), (byte) 0);
    public static final u36 c = new u36(0.8f, 0.0f, 0.8f, 0.15f);
    public static final float d = 24.0f;
    public static final float e = 28.0f;
    public static final float f = 4.0f;
    public static final float g = 12.0f;

    public static final void a(final ue5 ue5Var, c8e c8eVar, final ue5 ue5Var2, final ue5 ue5Var3, float f2, cec cecVar, nul nulVar, ih5 ih5Var, final int i) {
        final c8e c8eVar2;
        final float f3;
        final cec cecVar2;
        final nul nulVar2;
        float f4;
        cec cecVarB;
        nul nulVarC;
        c8e c8eVar3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-302230691);
        int i2 = i | 13197360;
        if (vt9Var.N(i2 & 1, (4793491 & i2) != 4793490)) {
            vt9Var.S();
            if ((i & 1) == 0 || vt9Var.x()) {
                float f5 = oul.a;
                f4 = f5;
                cecVarB = oul.b(vt9Var);
                nulVarC = oul.c(vt9Var);
                c8eVar3 = z7e.b;
            } else {
                vt9Var.Q();
                c8eVar3 = c8eVar;
                f4 = f2;
                cecVarB = cecVar;
                nulVarC = nulVar;
            }
            vt9Var.q();
            d(c8eVar3, ue5Var, abm.a(ap1.a, vt9Var), ikl.d, rbe.o, ue5Var2, ue5Var3, (gh7.b(f4, Float.NaN) || gh7.b(f4, Float.POSITIVE_INFINITY)) ? oul.a : f4, cecVarB, nulVarC, null, vt9Var, 14380086, 48);
            c8eVar2 = c8eVar3;
            cecVar2 = cecVarB;
            nulVar2 = nulVarC;
            f3 = f4;
        } else {
            vt9Var.Q();
            c8eVar2 = c8eVar;
            f3 = f2;
            cecVar2 = cecVar;
            nulVar2 = nulVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2(c8eVar2, ue5Var2, ue5Var3, f3, cecVar2, nulVar2, i) { // from class: qo1
                public final /* synthetic */ c8e b;
                public final /* synthetic */ ue5 c;
                public final /* synthetic */ ue5 d;
                public final /* synthetic */ float e;
                public final /* synthetic */ cec f;
                public final /* synthetic */ nul g;

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = aoh.m(3463);
                    so1.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (ih5) obj, iM);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(ue5 ue5Var, c8e c8eVar, ue5 ue5Var2, ue5 ue5Var3, float f2, float f3, cec cecVar, nul nulVar, rul rulVar, ih5 ih5Var, int i) {
        vt9 vt9Var;
        float f4;
        float f5;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-1406602045);
        int i2 = i | (vt9Var2.f(c8eVar) ? 32 : 16) | 196608 | (vt9Var2.f(cecVar) ? 1048576 : 524288) | (vt9Var2.f(nulVar) ? 8388608 : 4194304) | (vt9Var2.f(rulVar) ? 67108864 : 33554432);
        if (vt9Var2.N(i2 & 1, (38347923 & i2) != 38347922)) {
            vt9Var2.S();
            if ((i & 1) == 0 || vt9Var2.x()) {
                f5 = oul.e;
            } else {
                vt9Var2.Q();
                f5 = f3;
            }
            vt9Var2.q();
            ikl iklVarA = abm.a(uo1.a, vt9Var2);
            ikl iklVarA2 = abm.a(ap1.a, vt9Var2);
            ikl iklVar = ikl.d;
            int i3 = i2 >> 3;
            vt9Var = vt9Var2;
            g(c8eVar, ue5Var, iklVarA, e, ue5Var, iklVarA2, iklVar, iklVar, ue5Var2, ue5Var3, (gh7.b(f2, Float.NaN) || gh7.b(f2, Float.POSITIVE_INFINITY)) ? oul.d : f2, (gh7.b(f5, Float.NaN) || gh7.b(f5, Float.POSITIVE_INFINITY)) ? oul.e : f5, cecVar, nulVar, rulVar, vt9Var, (i3 & 14) | 920153136, 438 | (458752 & i3) | (3670016 & i3) | (i3 & 29360128));
            f4 = f5;
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
            f4 = f3;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ko1(ue5Var, c8eVar, ue5Var2, ue5Var3, f2, f4, cecVar, nulVar, rulVar, i, (byte) 1);
        }
    }

    public static final void c(ue5 ue5Var, c8e c8eVar, ue5 ue5Var2, ue5 ue5Var3, float f2, float f3, cec cecVar, nul nulVar, rul rulVar, ih5 ih5Var, int i) {
        vt9 vt9Var;
        float f4;
        float f5;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-1378129383);
        int i2 = i | (vt9Var2.f(c8eVar) ? 32 : 16) | 196608 | (vt9Var2.f(cecVar) ? 1048576 : 524288) | (vt9Var2.f(nulVar) ? 8388608 : 4194304) | (vt9Var2.f(rulVar) ? 67108864 : 33554432);
        if (vt9Var2.N(i2 & 1, (38347923 & i2) != 38347922)) {
            vt9Var2.S();
            if ((i & 1) == 0 || vt9Var2.x()) {
                f5 = oul.c;
            } else {
                vt9Var2.Q();
                f5 = f3;
            }
            vt9Var2.q();
            ikl iklVarA = abm.a(zo1.a, vt9Var2);
            ikl iklVarA2 = abm.a(ap1.a, vt9Var2);
            ikl iklVar = ikl.d;
            int i3 = i2 >> 3;
            vt9Var = vt9Var2;
            g(c8eVar, ue5Var, iklVarA, d, ue5Var, iklVarA2, iklVar, iklVar, ue5Var2, ue5Var3, (gh7.b(f2, Float.NaN) || gh7.b(f2, Float.POSITIVE_INFINITY)) ? oul.b : f2, (gh7.b(f5, Float.NaN) || gh7.b(f5, Float.POSITIVE_INFINITY)) ? oul.c : f5, cecVar, nulVar, rulVar, vt9Var, (i3 & 14) | 920153136, 438 | (458752 & i3) | (3670016 & i3) | (i3 & 29360128));
            f4 = f5;
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
            f4 = f3;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ko1(ue5Var, c8eVar, ue5Var2, ue5Var3, f2, f4, cecVar, nulVar, rulVar, i, (byte) 0);
        }
    }

    public static final void d(final c8e c8eVar, final ue5 ue5Var, final ikl iklVar, final ikl iklVar2, final rd3 rd3Var, final ue5 ue5Var2, final ue5 ue5Var3, final float f2, final cec cecVar, final nul nulVar, final rul rulVar, ih5 ih5Var, final int i, final int i2) {
        int i3;
        ikl iklVar3;
        ikl iklVar4;
        rd3 rd3Var2;
        ue5 ue5Var4;
        ue5 ue5Var5;
        float f3;
        int i4;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-2033800111);
        if ((i & 6) == 0) {
            i3 = (vt9Var.f(c8eVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= vt9Var.h(ue5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            iklVar3 = iklVar;
            i3 |= vt9Var.f(iklVar3) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        } else {
            iklVar3 = iklVar;
        }
        if ((i & 3072) == 0) {
            i3 |= vt9Var.h(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            iklVar4 = iklVar2;
            i3 |= vt9Var.f(iklVar4) ? 16384 : 8192;
        } else {
            iklVar4 = iklVar2;
        }
        if ((196608 & i) == 0) {
            rd3Var2 = rd3Var;
            i3 |= vt9Var.f(rd3Var2) ? 131072 : 65536;
        } else {
            rd3Var2 = rd3Var;
        }
        if ((1572864 & i) == 0) {
            ue5Var4 = ue5Var2;
            i3 |= vt9Var.h(ue5Var4) ? 1048576 : 524288;
        } else {
            ue5Var4 = ue5Var2;
        }
        if ((12582912 & i) == 0) {
            ue5Var5 = ue5Var3;
            i3 |= vt9Var.h(ue5Var5) ? 8388608 : 4194304;
        } else {
            ue5Var5 = ue5Var3;
        }
        if ((100663296 & i) == 0) {
            f3 = f2;
            i3 |= vt9Var.c(f3) ? 67108864 : 33554432;
        } else {
            f3 = f2;
        }
        if ((805306368 & i) == 0) {
            i3 |= vt9Var.f(cecVar) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (vt9Var.f(nulVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= vt9Var.f(rulVar) ? 32 : 16;
        }
        if (vt9Var.N(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            ((sv6) vt9Var.j(a)).a(new amj(c8eVar, ue5Var, iklVar3, iklVar4, rd3Var2, ue5Var4, ue5Var5, f3, cecVar, nulVar, rulVar), vt9Var, 0);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2() { // from class: mo1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = aoh.m(i | 1);
                    int iM2 = aoh.m(i2);
                    so1.d(c8eVar, ue5Var, iklVar, iklVar2, rd3Var, ue5Var2, ue5Var3, f2, cecVar, nulVar, rulVar, (ih5) obj, iM, iM2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final defpackage.ue5 r25, defpackage.c8e r26, final defpackage.ue5 r27, defpackage.ue5 r28, float r29, defpackage.cec r30, defpackage.nul r31, defpackage.rul r32, defpackage.ih5 r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.so1.e(ue5, c8e, ue5, ue5, float, cec, nul, rul, ih5, int, int):void");
    }

    public static final void f(final c8e c8eVar, final u89 u89Var, final long j, final long j2, final long j3, long j4, final ue5 ue5Var, final ikl iklVar, final ikl iklVar2, Function0 function0, final z62 z62Var, final rd3 rd3Var, final int i, final boolean z, final ue5 ue5Var2, ue5 ue5Var3, final float f2, ih5 ih5Var, final int i2, final int i3) {
        int i4;
        ue5 ue5Var4;
        vt9 vt9Var;
        long j5;
        Function0 function02;
        zpa zpaVar;
        c8e h25Var;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(126395868);
        int i5 = i2 | (vt9Var2.f(c8eVar) ? 4 : 2) | (vt9Var2.f(u89Var) ? 32 : 16);
        boolean zE = vt9Var2.e(j);
        int i6 = NotificationCompat.FLAG_HIGH_PRIORITY;
        int i7 = i5 | (zE ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (vt9Var2.e(j2) ? 2048 : 1024) | (vt9Var2.e(j3) ? 16384 : 8192) | (vt9Var2.e(j4) ? 131072 : 65536) | (vt9Var2.h(ue5Var) ? 1048576 : 524288) | (vt9Var2.f(iklVar) ? 8388608 : 4194304) | (vt9Var2.h(null) ? 67108864 : 33554432) | (vt9Var2.f(iklVar2) ? 536870912 : 268435456);
        if ((i3 & 6) == 0) {
            i4 = i3 | (vt9Var2.h(function0) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if (vt9Var2.f(rd3Var)) {
            i6 = NotificationCompat.FLAG_LOCAL_ONLY;
        }
        int i8 = i4 | i6;
        if ((i3 & 3072) == 0) {
            i8 |= vt9Var2.d(i) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i8 |= vt9Var2.g(z) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i8 |= vt9Var2.h(ue5Var2) ? 131072 : 65536;
        }
        int i9 = i8 | (vt9Var2.c(f2) ? 8388608 : 4194304);
        if (vt9Var2.N(i7 & 1, ((i7 & 306783379) == 306783378 && (4793491 & i9) == 4793490) ? false : true)) {
            boolean z2 = ((i7 & 112) == 32) | ((i9 & 896) == 256) | ((i9 & 7168) == 2048) | ((29360128 & i9) == 8388608);
            Object objK = vt9Var2.K();
            zpa zpaVar2 = hh5.a;
            if (z2 || objK == zpaVar2) {
                qul qulVar = new qul(u89Var, z62Var, rd3Var, i, f2);
                vt9Var2.g0(qulVar);
                objK = qulVar;
            }
            qul qulVar2 = (qul) objK;
            int iHashCode = Long.hashCode(vt9Var2.T);
            oag oagVarL = vt9Var2.l();
            c8e c8eVarP = qyn.P(vt9Var2, c8eVar);
            bh5.To.getClass();
            vt9Var2.a0();
            boolean z3 = vt9Var2.S;
            fza fzaVar = m3c.S;
            if (z3) {
                vt9Var2.k(fzaVar);
            } else {
                vt9Var2.j0();
            }
            ah5 ah5Var = ujp.f;
            y4h.o(vt9Var2, qulVar2, ah5Var);
            ah5 ah5Var2 = ujp.e;
            y4h.o(vt9Var2, oagVarL, ah5Var2);
            ah5 ah5Var3 = ujp.g;
            if (vt9Var2.S || !Intrinsics.a(vt9Var2.K(), Integer.valueOf(iHashCode))) {
                vep.x(iHashCode, vt9Var2, iHashCode, ah5Var3);
            }
            ah5 ah5Var4 = ujp.d;
            y4h.o(vt9Var2, c8eVarP, ah5Var4);
            z7e z7eVar = z7e.b;
            c8e c8eVarZ = j14.Z(z7eVar, "navigationIcon");
            float f3 = f;
            c8e c8eVarB0 = a26.b0(c8eVarZ, f3, 0.0f, 0.0f, 0.0f, 14);
            td3 td3Var = rbe.b;
            tfd tfdVarC = nr3.c(td3Var, false);
            int iHashCode2 = Long.hashCode(vt9Var2.T);
            oag oagVarL2 = vt9Var2.l();
            c8e c8eVarP2 = qyn.P(vt9Var2, c8eVarB0);
            vt9Var2.a0();
            if (vt9Var2.S) {
                vt9Var2.k(fzaVar);
            } else {
                vt9Var2.j0();
            }
            y4h.o(vt9Var2, tfdVarC, ah5Var);
            y4h.o(vt9Var2, oagVarL2, ah5Var2);
            if (vt9Var2.S || !Intrinsics.a(vt9Var2.K(), Integer.valueOf(iHashCode2))) {
                vep.x(iHashCode2, vt9Var2, iHashCode2, ah5Var3);
            }
            y4h.o(vt9Var2, c8eVarP2, ah5Var4);
            hp7 hp7Var = aq5.a;
            kfo.c(hp7Var.a(new u95(j)), ue5Var2, vt9Var2, 8 | ((i9 >> 12) & 112));
            vt9Var2.p(true);
            vt9Var2.W(-1359701523);
            c8e c8eVarZ2 = a26.Z(j14.Z(z7eVar, "title"), f3, 0.0f, 2);
            if (z) {
                vt9Var2.W(510338172);
                Object objK2 = vt9Var2.K();
                zpaVar = zpaVar2;
                if (objK2 == zpaVar) {
                    objK2 = new k51((byte) 11);
                    vt9Var2.g0(objK2);
                }
                AtomicInteger atomicInteger = h0j.a;
                h25Var = new h25((Function1) objK2);
                vt9Var2.p(false);
            } else {
                zpaVar = zpaVar2;
                vt9Var2.W(510340109);
                vt9Var2.p(false);
                h25Var = z7eVar;
            }
            c8e c8eVarD = c8eVarZ2.d(h25Var);
            boolean z4 = (i9 & 14) == 4;
            Object objK3 = vt9Var2.K();
            if (z4 || objK3 == zpaVar) {
                function02 = function0;
                objK3 = new p01(function02, (byte) 1);
                vt9Var2.g0(objK3);
            } else {
                function02 = function0;
            }
            c8e c8eVarN = z5i.N(c8eVarD, (Function1) objK3);
            tfd tfdVarC2 = nr3.c(td3Var, false);
            int iHashCode3 = Long.hashCode(vt9Var2.T);
            oag oagVarL3 = vt9Var2.l();
            c8e c8eVarP3 = qyn.P(vt9Var2, c8eVarN);
            vt9Var2.a0();
            if (vt9Var2.S) {
                vt9Var2.k(fzaVar);
            } else {
                vt9Var2.j0();
            }
            y4h.o(vt9Var2, tfdVarC2, ah5Var);
            y4h.o(vt9Var2, oagVarL3, ah5Var2);
            if (vt9Var2.S || !Intrinsics.a(vt9Var2.K(), Integer.valueOf(iHashCode3))) {
                vep.x(iHashCode3, vt9Var2, iHashCode3, ah5Var3);
            }
            y4h.o(vt9Var2, c8eVarP3, ah5Var4);
            j7h.a(j2, iklVar, ue5Var, vt9Var2, ((i7 >> 9) & 14) | ((i7 >> 18) & 112) | ((i7 >> 12) & 896));
            vt9Var = vt9Var2;
            vt9Var.p(true);
            vt9Var.p(false);
            c8e c8eVarB02 = a26.b0(j14.Z(z7eVar, "actionIcons"), 0.0f, 0.0f, f3, 0.0f, 11);
            tfd tfdVarC3 = nr3.c(td3Var, false);
            int iHashCode4 = Long.hashCode(vt9Var.T);
            oag oagVarL4 = vt9Var.l();
            c8e c8eVarP4 = qyn.P(vt9Var, c8eVarB02);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, tfdVarC3, ah5Var);
            y4h.o(vt9Var, oagVarL4, ah5Var2);
            if (vt9Var.S || !Intrinsics.a(vt9Var.K(), Integer.valueOf(iHashCode4))) {
                vep.x(iHashCode4, vt9Var, iHashCode4, ah5Var3);
            }
            y4h.o(vt9Var, c8eVarP4, ah5Var4);
            j5 = j4;
            ue5Var4 = ue5Var3;
            kfo.c(hp7Var.a(new u95(j5)), ue5Var4, vt9Var, 56);
            vt9Var.p(true);
            vt9Var.p(true);
        } else {
            ue5Var4 = ue5Var3;
            vt9Var = vt9Var2;
            j5 = j4;
            function02 = function0;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            final ue5 ue5Var5 = ue5Var4;
            final Function0 function03 = function02;
            final long j6 = j5;
            znhVarR.d = new Function2(u89Var, j, j2, j3, j6, ue5Var, iklVar, iklVar2, function03, z62Var, rd3Var, i, z, ue5Var2, ue5Var5, f2, i2, i3) { // from class: oo1
                public final /* synthetic */ u89 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ ue5 g;
                public final /* synthetic */ ikl h;
                public final /* synthetic */ ikl i;
                public final /* synthetic */ Function0 j;
                public final /* synthetic */ z62 k;
                public final /* synthetic */ rd3 l;
                public final /* synthetic */ int m;
                public final /* synthetic */ boolean n;
                public final /* synthetic */ ue5 o;
                public final /* synthetic */ ue5 p;
                public final /* synthetic */ float q;
                public final /* synthetic */ int r;

                {
                    this.r = i3;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = aoh.m(1);
                    int iM2 = aoh.m(this.r);
                    so1.f(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, (ih5) obj, iM, iM2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(final c8e c8eVar, final ue5 ue5Var, final ikl iklVar, final float f2, final ue5 ue5Var2, final ikl iklVar2, final ikl iklVar3, final ikl iklVar4, final ue5 ue5Var3, final ue5 ue5Var4, final float f3, final float f4, final cec cecVar, final nul nulVar, final rul rulVar, ih5 ih5Var, final int i, final int i2) {
        int i3;
        ikl iklVar5;
        float f5;
        ue5 ue5Var5;
        ikl iklVar6;
        int i4;
        ue5 ue5Var6;
        float f6;
        rd3 rd3Var = rbe.n;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1092180406);
        if ((i & 6) == 0) {
            i3 = (vt9Var.f(c8eVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= vt9Var.h(ue5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            iklVar5 = iklVar;
            i3 |= vt9Var.f(iklVar5) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        } else {
            iklVar5 = iklVar;
        }
        if ((i & 3072) == 0) {
            f5 = f2;
            i3 |= vt9Var.c(f5) ? 2048 : 1024;
        } else {
            f5 = f2;
        }
        if ((i & 24576) == 0) {
            ue5Var5 = ue5Var2;
            i3 |= vt9Var.h(ue5Var5) ? 16384 : 8192;
        } else {
            ue5Var5 = ue5Var2;
        }
        if ((i & 196608) == 0) {
            i3 |= vt9Var.f(iklVar2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= vt9Var.h(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= vt9Var.f(iklVar3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= vt9Var.h(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            iklVar6 = iklVar4;
            i3 |= vt9Var.f(iklVar6) ? 536870912 : 268435456;
        } else {
            iklVar6 = iklVar4;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (vt9Var.f(rd3Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= vt9Var.h(ue5Var3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            ue5Var6 = ue5Var4;
            i4 |= vt9Var.h(ue5Var6) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        } else {
            ue5Var6 = ue5Var4;
        }
        if ((i2 & 3072) == 0) {
            f6 = f3;
            i4 |= vt9Var.c(f6) ? 2048 : 1024;
        } else {
            f6 = f3;
        }
        if ((i2 & 24576) == 0) {
            i4 |= vt9Var.c(f4) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= vt9Var.f(cecVar) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= vt9Var.f(nulVar) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= vt9Var.f(rulVar) ? 8388608 : 4194304;
        }
        if (vt9Var.N(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 4793491) == 4793490) ? false : true)) {
            ((qx6) vt9Var.j(b)).a(new i8m(c8eVar, ue5Var, iklVar5, f5, ue5Var5, iklVar2, iklVar3, iklVar6, ue5Var3, ue5Var6, f6, f4, cecVar, nulVar, rulVar), vt9Var, 0);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2() { // from class: no1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = aoh.m(i | 1);
                    int iM2 = aoh.m(i2);
                    so1.g(c8eVar, ue5Var, iklVar, f2, ue5Var2, iklVar2, iklVar3, iklVar4, ue5Var3, ue5Var4, f3, f4, cecVar, nulVar, rulVar, (ih5) obj, iM, iM2);
                    return Unit.a;
                }
            };
        }
    }

    public static final tul h(ih5 ih5Var) {
        Object[] objArr = new Object[0];
        c67 c67Var = tul.d;
        boolean zC = ((vt9) ih5Var).c(-3.4028235E38f) | ((vt9) ih5Var).c(0.0f) | ((vt9) ih5Var).c(0.0f);
        vt9 vt9Var = (vt9) ih5Var;
        Object objK = vt9Var.K();
        if (zC || objK == hh5.a) {
            objK = new vk1((byte) 14);
            vt9Var.g0(objK);
        }
        return (tul) w1h.u(objArr, c67Var, (Function0) objK, vt9Var, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.tul r9, float r10, defpackage.wi6 r11, defpackage.we1 r12, nt5 r13) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.so1.i(tul, float, wi6, we1, nt5):java.lang.Object");
    }
}
