package defpackage;

import ads_mobile_sdk.z1;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.tasks.OnFailureListener;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ulp implements h93, g1i, g, etm, j0n, f45, jum, OnFailureListener, o87, y63, wx3, u18, yb4, u55, kr5 {
    public static final ulp b = new ulp(1);
    public static final p41 c = new p41(0);
    public static final p41 d = new p41(1);
    public static final p41 e = new p41(2);
    public static final ulp f = new ulp(3);
    public static final ulp g = new ulp(4);
    public static final /* synthetic */ ulp h = new ulp(5);
    public static final /* synthetic */ ulp i = new ulp(6);
    public static final ulp j = new ulp(7);
    public static final ulp k = new ulp(8);
    public static final ulp l = new ulp(9);
    public static final ulp m = new ulp(10);
    public static final ulp n = new ulp(11);
    public static final ulp o = new ulp(12);
    public static final /* synthetic */ ulp p = new ulp(13);
    public final /* synthetic */ byte a;

    public /* synthetic */ ulp(byte b2) {
        this.a = b2;
    }

    public static sgl A(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, akl aklVar, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, vt9 vt9Var, int i2, int i3) {
        long j40 = (i2 & 1) != 0 ? u95.g : j2;
        long j41 = (i2 & 2) != 0 ? u95.g : j3;
        long j42 = (i2 & 4) != 0 ? u95.g : j4;
        long j43 = (i2 & 8) != 0 ? u95.g : j5;
        long j44 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? u95.g : j10;
        long j45 = (i2 & NotificationCompat.FLAG_GROUP_SUMMARY) != 0 ? u95.g : j11;
        akl aklVar2 = (i2 & 1024) != 0 ? null : aklVar;
        long j46 = (32768 & i2) != 0 ? u95.g : j16;
        long j47 = (65536 & i2) != 0 ? u95.g : j17;
        long j48 = (131072 & i2) != 0 ? u95.g : j18;
        long j49 = (262144 & i2) != 0 ? u95.g : j19;
        long j50 = (524288 & i2) != 0 ? u95.g : j20;
        long j51 = (1048576 & i2) != 0 ? u95.g : j21;
        long j52 = (2097152 & i2) != 0 ? u95.g : j22;
        long j53 = (4194304 & i2) != 0 ? u95.g : j23;
        long j54 = (8388608 & i2) != 0 ? u95.g : j24;
        long j55 = (16777216 & i2) != 0 ? u95.g : j25;
        long j56 = (33554432 & i2) != 0 ? u95.g : j26;
        long j57 = (67108864 & i2) != 0 ? u95.g : j27;
        long j58 = (134217728 & i2) != 0 ? u95.g : j28;
        long j59 = (268435456 & i2) != 0 ? u95.g : j29;
        long j60 = (536870912 & i2) != 0 ? u95.g : j30;
        long j61 = (i2 & 1073741824) != 0 ? u95.g : j31;
        long j62 = u95.g;
        return B((sa5) vt9Var.j(ua5.a), (akl) vt9Var.j(bkl.a)).a(j40, j41, j42, j43, j6, j7, j8, j9, j44, j45, aklVar2, j12, j13, j14, j15, j46, j47, j48, j49, j50, j51, j52, j53, j54, j55, j56, j57, j58, j59, j60, j61, j62, j62, j62, j62, (i3 & 16) != 0 ? j62 : j32, (i3 & 32) != 0 ? j62 : j33, (i3 & 64) != 0 ? j62 : j34, (i3 & NotificationCompat.FLAG_HIGH_PRIORITY) != 0 ? j62 : j35, (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? j62 : j36, (i3 & NotificationCompat.FLAG_GROUP_SUMMARY) != 0 ? j62 : j37, (i3 & 1024) != 0 ? j62 : j38, (i3 & 2048) != 0 ? j62 : j39);
    }

    public static sgl B(sa5 sa5Var, akl aklVar) {
        sgl sglVar = sa5Var.i0;
        if (sglVar != null) {
            if (Intrinsics.a(sglVar.k, aklVar)) {
                return sglVar;
            }
            sgl sglVarA = sglVar.a(sglVar.a, sglVar.b, sglVar.c, sglVar.d, sglVar.e, sglVar.f, sglVar.g, sglVar.h, sglVar.i, sglVar.j, aklVar, sglVar.l, sglVar.m, sglVar.n, sglVar.o, sglVar.p, sglVar.q, sglVar.r, sglVar.s, sglVar.t, sglVar.u, sglVar.v, sglVar.w, sglVar.x, sglVar.y, sglVar.z, sglVar.A, sglVar.B, sglVar.C, sglVar.D, sglVar.E, sglVar.F, sglVar.G, sglVar.H, sglVar.I, sglVar.J, sglVar.K, sglVar.L, sglVar.M, sglVar.N, sglVar.O, sglVar.P, sglVar.Q);
            sa5Var.i0 = sglVarA;
            return sglVarA;
        }
        long jC = ua5.c(sa5Var, q39.y);
        long jC2 = ua5.c(sa5Var, q39.D);
        ta5 ta5Var = q39.g;
        long jC3 = ua5.c(sa5Var, ta5Var);
        float f2 = q39.h;
        long jB = u95.b(jC3, f2);
        long jC4 = ua5.c(sa5Var, q39.s);
        ta5 ta5Var2 = q39.c;
        long jC5 = ua5.c(sa5Var, ta5Var2);
        long jC6 = ua5.c(sa5Var, ta5Var2);
        long jC7 = ua5.c(sa5Var, ta5Var2);
        long jC8 = ua5.c(sa5Var, ta5Var2);
        long jC9 = ua5.c(sa5Var, q39.b);
        long jC10 = ua5.c(sa5Var, q39.r);
        long jC11 = ua5.c(sa5Var, q39.x);
        long jC12 = ua5.c(sa5Var, q39.a);
        long jB2 = u95.b(ua5.c(sa5Var, q39.e), q39.f);
        long jC13 = ua5.c(sa5Var, q39.q);
        long jC14 = ua5.c(sa5Var, q39.A);
        long jC15 = ua5.c(sa5Var, q39.I);
        long jB3 = u95.b(ua5.c(sa5Var, q39.k), q39.l);
        long jC16 = ua5.c(sa5Var, q39.u);
        long jC17 = ua5.c(sa5Var, q39.C);
        long jC18 = ua5.c(sa5Var, q39.K);
        long jB4 = u95.b(ua5.c(sa5Var, q39.o), q39.p);
        long jC19 = ua5.c(sa5Var, q39.w);
        long jC20 = ua5.c(sa5Var, q39.z);
        long jC21 = ua5.c(sa5Var, q39.H);
        long jB5 = u95.b(ua5.c(sa5Var, q39.i), q39.j);
        long jC22 = ua5.c(sa5Var, q39.t);
        ta5 ta5Var3 = q39.E;
        long jC23 = ua5.c(sa5Var, ta5Var3);
        long jC24 = ua5.c(sa5Var, ta5Var3);
        long jB6 = u95.b(ua5.c(sa5Var, ta5Var), f2);
        long jC25 = ua5.c(sa5Var, ta5Var3);
        long jC26 = ua5.c(sa5Var, q39.B);
        long jC27 = ua5.c(sa5Var, q39.J);
        long jB7 = u95.b(ua5.c(sa5Var, q39.m), q39.n);
        long jC28 = ua5.c(sa5Var, q39.v);
        ta5 ta5Var4 = q39.F;
        long jC29 = ua5.c(sa5Var, ta5Var4);
        long jC30 = ua5.c(sa5Var, ta5Var4);
        long jB8 = u95.b(ua5.c(sa5Var, ta5Var4), f2);
        long jC31 = ua5.c(sa5Var, ta5Var4);
        ta5 ta5Var5 = q39.G;
        sgl sglVar2 = new sgl(jC, jC2, jB, jC4, jC5, jC6, jC7, jC8, jC9, jC10, aklVar, jC11, jC12, jB2, jC13, jC14, jC15, jB3, jC16, jC17, jC18, jB4, jC19, jC20, jC21, jB5, jC22, jC23, jC24, jB6, jC25, jC26, jC27, jB7, jC28, jC29, jC30, jB8, jC31, ua5.c(sa5Var, ta5Var5), ua5.c(sa5Var, ta5Var5), u95.b(ua5.c(sa5Var, ta5Var5), f2), ua5.c(sa5Var, ta5Var5));
        sa5Var.i0 = sglVar2;
        return sglVar2;
    }

    public static nl3 C(int i2) {
        h58 h58Var = nl3.h;
        w4 w4VarE = sko.e(h58Var, h58Var);
        while (w4VarE.hasNext()) {
            nl3 nl3Var = (nl3) w4VarE.next();
            if (nl3Var.a == i2) {
                return nl3Var;
            }
        }
        h9o.h("Collection contains no element matching the predicate.");
        return null;
    }

    public static File D(String str, String str2, String str3) {
        return new File(new File(str), sko.v(str2, ".", str3));
    }

    public static z1 y(int i2) throws Exception {
        z1 z1Var = (z1) z1.c.get(Integer.valueOf(i2));
        if (z1Var != null) {
            return z1Var;
        }
        throw new Exception("Invalid for value enum " + ulp.class.getName() + ": " + i2);
    }

    public static sgl z(ih5 ih5Var) {
        vt9 vt9Var = (vt9) ih5Var;
        return B((sa5) vt9Var.j(ua5.a), (akl) vt9Var.j(bkl.a));
    }

    @Override // defpackage.jum
    public final String b() {
        return "classic";
    }

    @Override // defpackage.yb4
    public final int c() {
        return 1;
    }

    @Override // defpackage.yb4
    public final hbl d() {
        return hbl.b;
    }

    @Override // defpackage.yb4
    public final long e() {
        return -1L;
    }

    @Override // defpackage.y63
    public final boolean f(float f2) {
        throw new IllegalStateException("not implemented");
    }

    @Override // defpackage.kr5
    public final long g(long j2, long j3) {
        float fMax = Math.max(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax) & 4294967295L);
    }

    @Override // defpackage.y63
    public final zvb h() {
        throw new IllegalStateException("not implemented");
    }

    @Override // defpackage.y63
    public final boolean i(float f2) {
        return false;
    }

    @Override // defpackage.y63
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.y63
    public final float k() {
        return 0.0f;
    }

    public final boolean l(Object obj, File file, trf trfVar) throws Throwable {
        try {
            j34.b((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final void m(pna pnaVar, kuk kukVar) {
        switch (this.a) {
            case 9:
                pnaVar.d.f(mpa.l, new z40((cr9) kukVar, (mt5) null, (byte) 1));
                break;
            default:
                tqa tqaVar = (tqa) goa.a(pnaVar, tqa.b);
                tqaVar.a.add(new wpa((cr9) kukVar, pnaVar, (mt5) null));
                break;
        }
    }

    @Override // defpackage.j0n
    public final Object n(esb esbVar, float f2) {
        return xsb.b(esbVar, f2);
    }

    public final b2l o(b2l b2lVar) {
        return b2lVar;
    }

    public final void onFailure(Exception exc) {
        r6e.e.e("MobileVisionBase", "Error preloading model resource", exc);
    }

    @Override // defpackage.yb4
    public final vb4 p() {
        return vb4.a;
    }

    @Override // defpackage.yb4
    public final wb4 q() {
        return wb4.a;
    }

    public final j87 r(List list, List list2) {
        return uup.k(new ik((ArrayList) list, list2, (byte) 0), true);
    }

    public final void s() {
    }

    @Override // defpackage.yb4
    public final ub4 t() {
        return ub4.a;
    }

    @Override // defpackage.y63
    public final float u() {
        return 1.0f;
    }

    @Override // defpackage.etm
    public final boolean v() {
        return false;
    }

    public final void w(boolean z, lde ldeVar, sgl sglVar, paj pajVar, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-818661242);
        int i3 = i2 | (vt9Var.g(z) ? 4 : 2) | (vt9Var.g(false) ? 32 : 16) | (vt9Var.f(ldeVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var.f(sglVar) ? 16384 : 8192) | (vt9Var.f(pajVar) ? 131072 : 65536);
        if (vt9Var.N(i3 & 1, (38347923 & i3) != 38347922)) {
            vt9Var.S();
            if ((i2 & 1) != 0 && !vt9Var.x()) {
                vt9Var.Q();
            }
            vt9Var.q();
            nr3.a(fr3.E(z7e.b, new d7k(pajVar, new vgl(new pw3(gmj.a(!z ? sglVar.g : ((Boolean) ipe.l(ldeVar, vt9Var, (i3 >> 6) & 14).getValue()).booleanValue() ? sglVar.e : sglVar.f, nb6.Y(jae.d, vt9Var), null, vt9Var, 0, 12), iak.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 12)), (byte) 28)).d(new h6b(z, ldeVar, sglVar, pajVar)), vt9Var, 0);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new hx0(this, z, ldeVar, sglVar, pajVar, i2);
        }
    }

    public final void x(final String str, final Function2 function2, final boolean z, final uac uacVar, final lde ldeVar, final ue5 ue5Var, final ue5 ue5Var2, final ue5 ue5Var3, final ue5 ue5Var4, final paj pajVar, final sgl sglVar, zvf zvfVar, ue5 ue5Var5, ih5 ih5Var, final int i2) {
        int i3;
        uac uacVar2;
        vt9 vt9Var;
        final zvf zvfVar2;
        final ue5 ue5Var6;
        zvf zvfVar3;
        int i4;
        ue5 ue5VarP;
        ue5 ue5VarP2;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(1806980801);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var2.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var2.h(function2) ? 32 : 16;
        }
        int i5 = i2 & 384;
        int i6 = NotificationCompat.FLAG_LOCAL_ONLY;
        if (i5 == 0) {
            i3 |= vt9Var2.g(z) ? 256 : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= vt9Var2.g(false) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            uacVar2 = uacVar;
            i3 |= vt9Var2.f(uacVar2) ? 16384 : 8192;
        } else {
            uacVar2 = uacVar;
        }
        if ((i2 & 196608) == 0) {
            i3 |= vt9Var2.f(ldeVar) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= vt9Var2.g(false) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= vt9Var2.h(ue5Var) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= vt9Var2.h(ue5Var2) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= vt9Var2.h(null) ? 536870912 : 268435456;
        }
        int i7 = 100663296 | (vt9Var2.h(ue5Var3) ? 4 : 2) | (vt9Var2.h(null) ? 32 : 16);
        if (!vt9Var2.h(null)) {
            i6 = NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        int i8 = i7 | i6 | (vt9Var2.h(ue5Var4) ? 2048 : 1024) | (vt9Var2.f(pajVar) ? 16384 : 8192) | (vt9Var2.f(sglVar) ? 131072 : 65536) | 13107200;
        if (vt9Var2.N(i3 & 1, ((i3 & 306783379) == 306783378 && (i8 & 38347923) == 38347922) ? false : true)) {
            vt9Var2.S();
            if ((i2 & 1) == 0 || vt9Var2.x()) {
                zvfVar3 = ue5Var == null ? new zvf(16.0f, 16.0f, 16.0f, 16.0f) : new zvf(16.0f, 8.0f, 16.0f, 8.0f);
                i4 = i8 & (-3670017);
                ue5VarP = gyg.P(417908150, new ugl(z, ldeVar, sglVar, pajVar), vt9Var2);
            } else {
                vt9Var2.Q();
                i4 = i8 & (-3670017);
                zvfVar3 = zvfVar;
                ue5VarP = ue5Var5;
            }
            vt9Var2.q();
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 57344) == 16384);
            Object objK = vt9Var2.K();
            if (z2 || objK == hh5.a) {
                sf1 sf1Var = new sf1(str);
                uacVar2.getClass();
                j2m j2mVar = new j2m(sf1Var, h9f.a);
                vt9Var2.g0(j2mVar);
                objK = j2mVar;
            }
            String str2 = ((j2m) objK).a.b;
            lil lilVar = lil.a;
            mhl mhlVar = new mhl();
            if (ue5Var == null) {
                vt9Var2.W(-1353131191);
                vt9Var2.p(false);
                ue5VarP2 = null;
            } else {
                vt9Var2.W(-1353131190);
                ue5VarP2 = gyg.P(1110058497, new rtf(ue5Var, (byte) 1), vt9Var2);
                vt9Var2.p(false);
            }
            int i9 = i3 >> 9;
            int i10 = i4 << 21;
            vt9Var = vt9Var2;
            zvf zvfVar4 = zvfVar3;
            hn9.b(lilVar, str2, function2, mhlVar, ue5VarP2, ue5Var2, null, ue5Var3, null, null, ue5Var4, false, z, false, ldeVar, zvfVar4, sglVar, ue5VarP, vt9Var, ((i3 << 3) & 896) | 6 | (i9 & 458752) | (i9 & 3670016) | (i10 & 29360128) | (i10 & 234881024) | (i10 & 1879048192), ((i4 >> 9) & 14) | ((i3 >> 6) & 112) | (i3 & 896) | (i9 & 7168) | ((i3 >> 3) & 57344) | ((i4 << 3) & 3670016) | 12582912);
            zvfVar2 = zvfVar4;
            ue5Var6 = ue5VarP;
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
            zvfVar2 = zvfVar;
            ue5Var6 = ue5Var5;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2() { // from class: tgl
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = aoh.m(i2 | 1);
                    this.a.x(str, function2, z, uacVar, ldeVar, ue5Var, ue5Var2, ue5Var3, ue5Var4, pajVar, sglVar, zvfVar2, ue5Var6, (ih5) obj, iM);
                    return Unit.a;
                }
            };
        }
    }
}
