package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.core.app.NotificationCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class i7e {
    public static final long a = z7h.a(0.5f, 0.0f);

    /* JADX WARN: Removed duplicated region for block: B:141:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0288 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final kotlin.jvm.functions.Function0 r28, defpackage.c8e r29, defpackage.pej r30, float r31, boolean r32, defpackage.paj r33, long r34, long r36, long r38, final defpackage.ue5 r40, kotlin.jvm.functions.Function2 r41, defpackage.j7e r42, final defpackage.ue5 r43, defpackage.ih5 r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i7e.a(kotlin.jvm.functions.Function0, c8e, pej, float, boolean, paj, long, long, long, ue5, kotlin.jvm.functions.Function2, j7e, ue5, ih5, int, int):void");
    }

    public static final void b(final cd1 cd1Var, final nx5 nx5Var, final Function0 function0, final Function1 function1, final c8e c8eVar, final pej pejVar, final float f, final boolean z, final paj pajVar, final long j, final long j2, final float f2, final ue5 ue5Var, final Function2 function2, final ue5 ue5Var2, ih5 ih5Var, final int i) {
        vt9 vt9Var;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-37400432);
        int i2 = i | (vt9Var2.h(cd1Var) ? 32 : 16) | (vt9Var2.h(nx5Var) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var2.h(function0) ? 2048 : 1024) | (vt9Var2.h(function1) ? 16384 : 8192) | (vt9Var2.f(c8eVar) ? 131072 : 65536) | (vt9Var2.f(pejVar) ? 1048576 : 524288) | (vt9Var2.c(f) ? 8388608 : 4194304) | (vt9Var2.g(z) ? 67108864 : 33554432) | (vt9Var2.f(pajVar) ? 536870912 : 268435456);
        int i3 = (vt9Var2.e(j) ? 4 : 2) | (vt9Var2.e(j2) ? 32 : 16) | (vt9Var2.c(f2) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var2.h(ue5Var) ? 2048 : 1024) | (vt9Var2.h(function2) ? 16384 : 8192) | (vt9Var2.h(ue5Var2) ? 131072 : 65536);
        if (vt9Var2.N(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 74899) == 74898) ? false : true)) {
            vt9Var2.S();
            if ((i & 1) != 0 && !vt9Var2.x()) {
                vt9Var2.Q();
            }
            vt9Var2.q();
            String strG = a4h.g(vt9Var2, 2132019592);
            c8e c8eVarD = mpj.m(as3.a.a(c8eVar, rbe.c), f, 1).d(mpj.a);
            c8e c8eVarC0 = z7e.b;
            Object obj = hh5.a;
            if (z) {
                vt9Var2.W(-1582035383);
                boolean z2 = (((i2 & 3670016) ^ 1572864) > 1048576 && vt9Var2.f(pejVar)) || (i2 & 1572864) == 1048576;
                Object objK = vt9Var2.K();
                if (z2 || objK == obj) {
                    fsf fsfVar = fsf.a;
                    e8m e8mVar = lej.a;
                    objK = new jej(pejVar, function1);
                    vt9Var2.g0(objK);
                }
                c8eVarC0 = alo.c0(c8eVarC0, (ble) objK, (s9i) null);
                vt9Var2.p(false);
            } else {
                vt9Var2.W(-1582020872);
                vt9Var2.p(false);
            }
            c8e c8eVarD2 = c8eVarD.d(c8eVarC0);
            a21 a21Var = pejVar.d;
            a21 a21Var2 = pejVar.d;
            fsf fsfVar2 = fsf.a;
            int i4 = (i2 & 3670016) ^ 1572864;
            boolean z3 = (i4 > 1048576 && vt9Var2.f(pejVar)) || (i2 & 1572864) == 1048576;
            Object objK2 = vt9Var2.K();
            if (z3 || objK2 == obj) {
                objK2 = new a7b(pejVar, (byte) 18);
                vt9Var2.g0(objK2);
            }
            c8e c8eVarS = rm5.s(c8eVarD2, a21Var, (Function2) objK2);
            z11 z11Var = (z11) a21Var2.f;
            boolean z4 = z && pejVar.e();
            boolean z5 = ((t0g) a21Var2.h).getValue() != null;
            boolean z6 = (i2 & 57344) == 16384;
            Object objK3 = vt9Var2.K();
            if (z6 || objK3 == obj) {
                objK3 = new e7e(function1, null);
                vt9Var2.g0(objK3);
            }
            c8e c8eVarA = ek7.a(c8eVarS, z11Var, z4, z5, (cr9) objK3, 168);
            boolean zF = vt9Var2.f(strG);
            Object objK4 = vt9Var2.K();
            if (zF || objK4 == obj) {
                objK4 = new tx0(strG, (byte) 22);
                vt9Var2.g0(objK4);
            }
            c8e c8eVarA2 = h0j.a(c8eVarA, false, (Function1) objK4);
            int iH = (int) ((p0g) a21Var2.k).h();
            if (iH < 0) {
                iH = 0;
            }
            c8e c8eVarM = ipe.m(c8eVarA2, new f69(iH));
            boolean z7 = ((i4 > 1048576 && vt9Var2.f(pejVar)) || (i2 & 1572864) == 1048576) | ((i2 & 112) == 32 || vt9Var2.h(cd1Var));
            Object objK5 = vt9Var2.K();
            if (z7 || objK5 == obj) {
                objK5 = new jkc(pejVar, cd1Var, (byte) 15);
                vt9Var2.g0(objK5);
            }
            int i5 = i3 << 6;
            int i6 = ((i2 >> 24) & 112) | 12582912 | (i5 & 896) | (i5 & 7168) | (i5 & 57344);
            vt9Var = vt9Var2;
            utk.a(z5i.N(z5i.N(c8eVarM, (Function1) objK5), new yq3(pejVar, (byte) 0)), pajVar, j, j2, f2, 0.0f, gyg.P(728743275, new h7e(function2, cd1Var, pejVar, ue5Var, ue5Var2, function0, nx5Var, z), vt9Var2), vt9Var, i6, 96);
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2(nx5Var, function0, function1, c8eVar, pejVar, f, z, pajVar, j, j2, f2, ue5Var, function2, ue5Var2, i) { // from class: b7e
                public final /* synthetic */ nx5 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ c8e e;
                public final /* synthetic */ pej f;
                public final /* synthetic */ float g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ paj i;
                public final /* synthetic */ long j;
                public final /* synthetic */ long k;
                public final /* synthetic */ float l;
                public final /* synthetic */ ue5 m;
                public final /* synthetic */ Function2 n;
                public final /* synthetic */ ue5 o;

                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM = aoh.m(71);
                    i7e.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (ih5) obj2, iM);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final long j, final Function0 function0, final boolean z, ih5 ih5Var, final int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-391613911);
        int i2 = i | (vt9Var.e(j) ? 4 : 2) | (vt9Var.h(function0) ? 32 : 16) | (vt9Var.g(z) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var.g(true) ? 2048 : 1024);
        if (!vt9Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            vt9Var.Q();
        } else if (j != 16) {
            vt9Var.W(-1438582326);
            iak iakVarB = md1.b(z ? 1.0f : 0.0f, nb6.Y(jae.c, vt9Var), null, vt9Var, 0, 28);
            String strG = a4h.g(vt9Var, 2132018255);
            vt9Var.W(-1438283579);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objK = vt9Var.K();
            byte b = 3;
            zpa zpaVar = hh5.a;
            if (z2 || objK == zpaVar) {
                objK = new u51(function0, b);
                vt9Var.g0(objK);
            }
            c8e c8eVarA = ruk.a(z7e.b, function0, (PointerInputEventHandler) objK);
            boolean zF = vt9Var.f(strG) | (i3 == 32);
            Object objK2 = vt9Var.K();
            if (zF || objK2 == zpaVar) {
                objK2 = new jkc(strG, function0, (byte) 14);
                vt9Var.g0(objK2);
            }
            c8e c8eVarA2 = h0j.a(c8eVarA, true, (Function1) objK2);
            vt9Var.p(false);
            c8e c8eVarD = mpj.c.d(c8eVarA2);
            boolean zF2 = ((i2 & 14) == 4) | vt9Var.f(iakVarB);
            Object objK3 = vt9Var.K();
            if (zF2 || objK3 == zpaVar) {
                objK3 = new qv0(j, iakVarB, (byte) 3);
                vt9Var.g0(objK3);
            }
            oup.H(c8eVarD, (Function1) objK3, vt9Var, 0);
            vt9Var.p(false);
        } else {
            vt9Var.W(-1437676103);
            vt9Var.p(false);
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2(j, function0, z, i) { // from class: a7e
                public final /* synthetic */ long a;
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ boolean c;

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = aoh.m(1);
                    i7e.c(this.a, this.b, this.c, (ih5) obj, iM);
                    return Unit.a;
                }
            };
        }
    }

    public static final float d(m1i m1iVar, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m1iVar.r >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (yi4.G(0.0f, Math.min(m1iVar.t.b() * 48.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    public static final float e(m1i m1iVar, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m1iVar.r & 4294967295L));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (yi4.G(0.0f, Math.min(m1iVar.t.b() * 24.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    public static final pej f(final Function1 function1, ih5 ih5Var, int i, int i2) {
        final byte b = 1;
        final byte b2 = 0;
        final boolean z = (i2 & 1) == 0;
        int i3 = i2 & 2;
        Object obj = hh5.a;
        if (i3 != 0) {
            vt9 vt9Var = (vt9) ih5Var;
            Object objK = vt9Var.K();
            Object obj2 = objK;
            if (objK == obj) {
                Object uvcVar = new uvc((byte) 27);
                vt9Var.g0(uvcVar);
                obj2 = uvcVar;
            }
            function1 = (Function1) obj2;
        }
        qej qejVar = qej.a;
        int i4 = (i & 14) | 384;
        e8m e8mVar = lej.a;
        final float f = qq3.b;
        final float f2 = qq3.c;
        vt9 vt9Var2 = (vt9) ih5Var;
        final n27 n27Var = (n27) vt9Var2.j(mi5.h);
        boolean zF = vt9Var2.f(n27Var) | vt9Var2.c(f);
        Object objK2 = vt9Var2.K();
        Object obj3 = objK2;
        if (zF || objK2 == obj) {
            Object obj4 = new Function0() { // from class: hej
                public final Object invoke() {
                    float fO0;
                    byte b3 = b2;
                    float f3 = f;
                    n27 n27Var2 = n27Var;
                    switch (b3) {
                        case 0:
                            fO0 = n27Var2.o0(f3);
                            break;
                        default:
                            fO0 = n27Var2.o0(f3);
                            break;
                    }
                    return Float.valueOf(fO0);
                }
            };
            vt9Var2.g0(obj4);
            obj3 = obj4;
        }
        final Function0 function0 = (Function0) obj3;
        boolean zF2 = vt9Var2.f(n27Var) | vt9Var2.c(f2);
        Object objK3 = vt9Var2.K();
        Object obj5 = objK3;
        if (zF2 || objK3 == obj) {
            Object obj6 = new Function0() { // from class: hej
                public final Object invoke() {
                    float fO0;
                    byte b3 = b;
                    float f3 = f2;
                    n27 n27Var2 = n27Var;
                    switch (b3) {
                        case 0:
                            fO0 = n27Var2.o0(f3);
                            break;
                        default:
                            fO0 = n27Var2.o0(f3);
                            break;
                    }
                    return Float.valueOf(fO0);
                }
            };
            vt9Var2.g0(obj6);
            obj5 = obj6;
        }
        final Function0 function02 = (Function0) obj5;
        Object[] objArr = {Boolean.valueOf(z), function1, Boolean.FALSE};
        c67 c67Var = new c67((Function2) new ali((byte) 29), (Function1) new ha1(z, function0, function02, function1));
        if ((((i4 & 14) ^ 6) <= 4 || !vt9Var2.g(z)) && (i4 & 6) != 4) {
            b = 0;
        }
        int i5 = b | (vt9Var2.f(function0) ? 1 : 0) | (vt9Var2.f(function02) ? 1 : 0) | (vt9Var2.f(function1) ? 1 : 0) | (vt9Var2.g(false) ? 1 : 0);
        Object objK4 = vt9Var2.K();
        Object obj7 = objK4;
        if (i5 != 0 || objK4 == obj) {
            Object obj8 = new Function0() { // from class: iej
                {
                    qej qejVar2 = qej.a;
                }

                public final Object invoke() {
                    return new pej(z, function0, function02, qej.a, function1);
                }
            };
            vt9Var2.g0(obj8);
            obj7 = obj8;
        }
        return (pej) w1h.u(objArr, c67Var, (Function0) obj7, vt9Var2, 0);
    }
}
