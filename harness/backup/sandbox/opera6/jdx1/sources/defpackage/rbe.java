package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rbe implements ee5, g, k4b, u2j, w7e, bn, kud, lo7, jc, jv0, jzh, g1j, u24, a54 {
    public static boolean z;
    public final /* synthetic */ byte a;
    public static final td3 b = new td3(-1.0f, -1.0f);
    public static final td3 c = new td3(0.0f, -1.0f);
    public static final td3 d = new td3(1.0f, -1.0f);
    public static final td3 e = new td3(-1.0f, 0.0f);
    public static final td3 f = new td3(0.0f, 0.0f);
    public static final td3 g = new td3(1.0f, 0.0f);
    public static final td3 h = new td3(-1.0f, 1.0f);
    public static final td3 i = new td3(0.0f, 1.0f);
    public static final td3 j = new td3(1.0f, 1.0f);
    public static final sd3 k = new sd3(-1.0f);
    public static final sd3 l = new sd3(0.0f);
    public static final sd3 m = new sd3(1.0f);
    public static final rd3 n = new rd3(-1.0f);
    public static final rd3 o = new rd3(0.0f);
    public static final rd3 p = new rd3(1.0f);
    public static final t14 q = new t14((byte) 15);
    public static final rbe r = new rbe((byte) 3);
    public static final rbe s = new rbe((byte) 4);
    public static final /* synthetic */ rbe t = new rbe((byte) 5);
    public static final rbe u = new rbe((byte) 7);
    public static final rbe v = new rbe((byte) 8);
    public static final rbe w = new rbe((byte) 9);
    public static final wch x = new wch("");
    public static final rbe y = new rbe((byte) 10);
    public static final rbe A = new rbe((byte) 12);
    public static final rbe B = new rbe((byte) 13);

    public /* synthetic */ rbe(byte b2) {
        this.a = b2;
    }

    public rbe(Set set) {
        this.a = (byte) 0;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw p3p.g(it);
        }
    }

    public static sgl d(ih5 ih5Var) {
        vt9 vt9Var = (vt9) ih5Var;
        sa5 sa5Var = (sa5) vt9Var.j(ua5.a);
        sgl sglVarA = sa5Var.h0;
        if (sglVarA == null) {
            vt9Var.W(390452338);
            vt9Var.p(false);
            sglVarA = null;
        } else {
            vt9Var.W(390452339);
            akl aklVar = (akl) vt9Var.j(bkl.a);
            if (!Intrinsics.a(sglVarA.k, aklVar)) {
                sglVarA = sglVarA.a(sglVarA.a, sglVarA.b, sglVarA.c, sglVarA.d, sglVarA.e, sglVarA.f, sglVarA.g, sglVarA.h, sglVarA.i, sglVarA.j, aklVar, sglVarA.l, sglVarA.m, sglVarA.n, sglVarA.o, sglVarA.p, sglVarA.q, sglVarA.r, sglVarA.s, sglVarA.t, sglVarA.u, sglVarA.v, sglVarA.w, sglVarA.x, sglVarA.y, sglVarA.z, sglVarA.A, sglVarA.B, sglVarA.C, sglVarA.D, sglVarA.E, sglVarA.F, sglVarA.G, sglVarA.H, sglVarA.I, sglVarA.J, sglVarA.K, sglVarA.L, sglVarA.M, sglVarA.N, sglVarA.O, sglVarA.P, sglVarA.Q);
                sa5Var.h0 = sglVarA;
            }
            vt9Var.p(false);
        }
        if (sglVarA != null) {
            vt9Var.W(-1788515437);
            vt9Var.p(false);
            return sglVarA;
        }
        vt9Var.W(-1788321191);
        long jC = ua5.c(sa5Var, auf.p);
        long jC2 = ua5.c(sa5Var, auf.v);
        ta5 ta5Var = auf.c;
        long jB = u95.b(ua5.c(sa5Var, ta5Var), 0.38f);
        long jC3 = ua5.c(sa5Var, auf.j);
        long j2 = u95.f;
        long jC4 = ua5.c(sa5Var, auf.a);
        long jC5 = ua5.c(sa5Var, auf.i);
        akl aklVar2 = (akl) vt9Var.j(bkl.a);
        long jC6 = ua5.c(sa5Var, auf.s);
        long jC7 = ua5.c(sa5Var, auf.B);
        long jB2 = u95.b(ua5.c(sa5Var, auf.f), 0.12f);
        long jC8 = ua5.c(sa5Var, auf.m);
        long jC9 = ua5.c(sa5Var, auf.r);
        long jC10 = ua5.c(sa5Var, auf.A);
        long jB3 = u95.b(ua5.c(sa5Var, auf.e), 0.38f);
        long jC11 = ua5.c(sa5Var, auf.l);
        long jC12 = ua5.c(sa5Var, auf.u);
        long jC13 = ua5.c(sa5Var, auf.D);
        long jB4 = u95.b(ua5.c(sa5Var, auf.h), 0.38f);
        long jC14 = ua5.c(sa5Var, auf.o);
        long jC15 = ua5.c(sa5Var, auf.q);
        long jC16 = ua5.c(sa5Var, auf.z);
        long jB5 = u95.b(ua5.c(sa5Var, auf.d), 0.38f);
        long jC17 = ua5.c(sa5Var, auf.k);
        ta5 ta5Var2 = auf.w;
        long jC18 = ua5.c(sa5Var, ta5Var2);
        long jC19 = ua5.c(sa5Var, ta5Var2);
        long jB6 = u95.b(ua5.c(sa5Var, ta5Var), 0.38f);
        long jC20 = ua5.c(sa5Var, ta5Var2);
        long jC21 = ua5.c(sa5Var, auf.t);
        long jC22 = ua5.c(sa5Var, auf.C);
        long jB7 = u95.b(ua5.c(sa5Var, auf.g), 0.38f);
        long jC23 = ua5.c(sa5Var, auf.n);
        ta5 ta5Var3 = auf.x;
        long jC24 = ua5.c(sa5Var, ta5Var3);
        long jC25 = ua5.c(sa5Var, ta5Var3);
        long jB8 = u95.b(ua5.c(sa5Var, ta5Var3), 0.38f);
        long jC26 = ua5.c(sa5Var, ta5Var3);
        ta5 ta5Var4 = auf.y;
        sgl sglVar = new sgl(jC, jC2, jB, jC3, j2, j2, j2, j2, jC4, jC5, aklVar2, jC6, jC7, jB2, jC8, jC9, jC10, jB3, jC11, jC12, jC13, jB4, jC14, jC15, jC16, jB5, jC17, jC18, jC19, jB6, jC20, jC21, jC22, jB7, jC23, jC24, jC25, jB8, jC26, ua5.c(sa5Var, ta5Var4), ua5.c(sa5Var, ta5Var4), u95.b(ua5.c(sa5Var, ta5Var4), 0.38f), ua5.c(sa5Var, ta5Var4));
        sa5Var.h0 = sglVar;
        vt9Var.p(false);
        return sglVar;
    }

    public static sa5 y(ih5 ih5Var) {
        return (sa5) ((vt9) ih5Var).j(ua5.a);
    }

    public static wam z(ih5 ih5Var) {
        return (wam) ((vt9) ih5Var).j(abm.a);
    }

    public final void I() {
    }

    @Override // defpackage.u24
    public final Class a() {
        return ByteBuffer.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0194  */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(final boolean r27, final boolean r28, final defpackage.lde r29, defpackage.c8e r30, final defpackage.sgl r31, final defpackage.paj r32, float r33, float r34, defpackage.ih5 r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rbe.b(boolean, boolean, lde, c8e, sgl, paj, float, float, ih5, int, int):void");
    }

    public final void c(final String str, final Function2 function2, final boolean z2, final boolean z3, final uac uacVar, final lde ldeVar, final boolean z4, final ue5 ue5Var, final ue5 ue5Var2, final ue5 ue5Var3, final ue5 ue5Var4, final ue5 ue5Var5, final ue5 ue5Var6, final ue5 ue5Var7, final sgl sglVar, zvf zvfVar, final ue5 ue5Var8, ih5 ih5Var, final int i2) {
        int i3;
        boolean z5;
        vt9 vt9Var;
        final zvf zvfVar2;
        int i4;
        zvf zvfVar3;
        String str2;
        ue5 ue5Var9;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-1732281618);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var2.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var2.h(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z5 = z2;
            i3 |= vt9Var2.g(z5) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        } else {
            z5 = z2;
        }
        if ((i2 & 3072) == 0) {
            i3 |= vt9Var2.g(z3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= vt9Var2.f(uacVar) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= vt9Var2.f(ldeVar) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= vt9Var2.g(z4) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= vt9Var2.h(ue5Var) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= vt9Var2.h(ue5Var2) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= vt9Var2.h(ue5Var3) ? 536870912 : 268435456;
        }
        int i5 = 14155776 | (vt9Var2.h(ue5Var4) ? 4 : 2) | (vt9Var2.h(ue5Var5) ? 32 : 16) | (vt9Var2.h(ue5Var6) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var2.h(ue5Var7) ? 2048 : 1024) | (vt9Var2.f(sglVar) ? 16384 : 8192) | 65536;
        if (vt9Var2.N(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 4793491) == 4793490) ? false : true)) {
            vt9Var2.S();
            if ((i2 & 1) == 0 || vt9Var2.x()) {
                i4 = i5 & (-458753);
                zvfVar3 = new zvf(16.0f, 16.0f, 16.0f, 16.0f);
            } else {
                vt9Var2.Q();
                i4 = i5 & (-458753);
                zvfVar3 = zvfVar;
            }
            vt9Var2.q();
            boolean z6 = ((i3 & 14) == 4) | ((i3 & 57344) == 16384);
            Object objK = vt9Var2.K();
            if (z6 || objK == hh5.a) {
                sf1 sf1Var = new sf1(str);
                uacVar.getClass();
                objK = new j2m(sf1Var, h9f.a);
                vt9Var2.g0(objK);
            }
            String str3 = ((j2m) objK).a.b;
            lil lilVar = lil.b;
            mhl mhlVar = new mhl();
            if (ue5Var == null) {
                vt9Var2.W(1927058812);
                vt9Var2.p(false);
                ue5Var9 = null;
                str2 = str3;
            } else {
                vt9Var2.W(1927058813);
                str2 = str3;
                ue5 ue5VarP = gyg.P(-1459717586, new rtf(ue5Var, (byte) 0), vt9Var2);
                vt9Var2.p(false);
                ue5Var9 = ue5VarP;
            }
            int i6 = i3 >> 9;
            int i7 = i4 << 21;
            vt9Var = vt9Var2;
            hn9.b(lilVar, str2, function2, mhlVar, ue5Var9, ue5Var2, ue5Var3, ue5Var4, ue5Var5, ue5Var6, ue5Var7, z3, z5, z4, ldeVar, zvfVar3, sglVar, ue5Var8, vt9Var, ((i3 << 3) & 896) | 6 | (i6 & 458752) | (i6 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), ((i4 >> 9) & 14) | ((i3 >> 6) & 112) | (i3 & 896) | (i6 & 7168) | ((i3 >> 3) & 57344) | ((i4 << 6) & 3670016) | 12582912);
            zvfVar2 = zvfVar3;
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
            zvfVar2 = zvfVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2() { // from class: qtf
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = aoh.m(i2 | 1);
                    this.a.c(str, function2, z2, z3, uacVar, ldeVar, z4, ue5Var, ue5Var2, ue5Var3, ue5Var4, ue5Var5, ue5Var6, ue5Var7, sglVar, zvfVar2, ue5Var8, (ih5) obj, iM);
                    return Unit.a;
                }
            };
        }
    }

    @Override // defpackage.a54
    public final byte[] copyFrom(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return bArr2;
    }

    @Override // defpackage.k4b
    public final void e(g07 g07Var) {
    }

    @Override // defpackage.kud
    public final void f(itd itdVar, boolean z2) {
    }

    @Override // defpackage.u24
    public final Object g(byte[] bArr) {
        return ByteBuffer.wrap(bArr);
    }

    @Override // defpackage.u2j
    public final Object getDefaultValue() {
        return x;
    }

    public final boolean h() {
        return false;
    }

    public final void i() {
    }

    public final boolean isEnabled() {
        return false;
    }

    public final void j(List list, x92 x92Var) {
    }

    public final void k(String str) {
    }

    public final void l(String str) {
    }

    public final void m(bm bmVar) {
    }

    public final void n(String str, String str2) {
    }

    @Override // defpackage.k4b
    public final void o() {
    }

    public final void onAdClicked() {
    }

    @Override // defpackage.kud
    public final boolean p(itd itdVar) {
        return false;
    }

    @Override // defpackage.k4b
    public final void q(int i2, g07 g07Var, nd4 nd4Var) {
    }

    public final Object r(x79 x79Var) {
        return fr3.I((Executor) x79Var.h(new qfh(gk3.class, Executor.class)));
    }

    @Override // defpackage.u2j
    public final Object readFrom(InputStream inputStream) throws wx5 {
        try {
            ych.i.getClass();
            crb crbVar = ych.k;
            crbVar.getClass();
            return cqp.L(crbVar, wch.Companion.serializer(), inputStream);
        } catch (o2j e2) {
            throw new wx5("Unable to read UserPrefs", e2);
        }
    }

    @Override // defpackage.jzh
    public final kyh s(kyh kyhVar, trf trfVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) kyhVar.get()).compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        kyhVar.d();
        return new p54(byteArrayOutputStream.toByteArray());
    }

    public final void t(re7 re7Var) {
    }

    public final String toString() {
        switch (this.a) {
            case 29:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    public final boolean u() {
        return false;
    }

    public final boolean v() {
        return false;
    }

    @Override // defpackage.w7e
    public final v7e w(d5o d5oVar) {
        return wlm.b;
    }

    @Override // defpackage.u2j
    public final Unit writeTo(Object obj, OutputStream outputStream) throws IOException {
        ych.i.getClass();
        crb crbVar = ych.k;
        crbVar.getClass();
        cqp.O(crbVar, wch.Companion.serializer(), (wch) obj, outputStream);
        return Unit.a;
    }

    public final no7 x(Context context) {
        return new gy(context, 17, "ads_configs");
    }
}
