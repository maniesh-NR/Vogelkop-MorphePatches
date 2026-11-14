package defpackage;

import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.URLUtil;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.opera.android.OperaApplication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.DoubleUnaryOperator;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.a;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class rm5 {
    public static final ue5 a = new ue5(1118245738, new cf5((byte) 18), false);
    public static final ue5 b = new ue5(706221066, new cf5((byte) 19), false);
    public static final ue5 c = new ue5(-1901959653, new ef5((byte) 10), false);
    public static final ue5 d = new ue5(-2010049422, new ef5((byte) 11), false);
    public static final vb7 e = new vb7();
    public static final boolean[] f = new boolean[3];
    public static final int[] g = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};
    public static final int[] h = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};
    public static final int[] i = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] k = new char[64];
    public static final eko l = new eko(23);

    public static int A(int i2, int i3) {
        return (i3 * 31) + i2;
    }

    public static int B(int i2, Object obj) {
        return A(obj == null ? 0 : obj.hashCode(), i2);
    }

    public static y6b C(qn7 qn7Var, long j2, int i2) {
        puh puhVar = puh.b;
        if ((i2 & 2) != 0) {
            puhVar = puh.a;
        }
        if ((i2 & 4) != 0) {
            j2 = 0;
        }
        return new y6b(qn7Var, puhVar, j2);
    }

    public static boolean D(Context context) {
        return context.getPackageManager().hasSystemFeature("android.software.picture_in_picture") && ((AppOpsManager) context.getSystemService("appops")).checkOpNoThrow("android:picture_in_picture", context.getApplicationInfo().uid, context.getPackageName()) == 0;
    }

    public static boolean E(int i2, int i3) {
        if (i2 > 0 || i2 == Integer.MIN_VALUE) {
            return i3 > 0 || i3 == Integer.MIN_VALUE;
        }
        return false;
    }

    public static final c8e F(c8e c8eVar, p12 p12Var) {
        return c8eVar.d(new rb7(p12Var));
    }

    public static float G(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static final c67 H(Function1 function1, Function2 function2) {
        a7b a7bVar = new a7b(function2, (byte) 3);
        y9m.t(1, function1);
        return new c67((Function2) a7bVar, function1);
    }

    public static final Integer I(String str) {
        try {
            return Integer.valueOf(c.q(str, "#", false) ? Color.parseColor(str) : Color.parseColor("#".concat(str)));
        } catch (Throwable th) {
            dqg.a.a("Error when parsing color with HEX<" + str + ">", th);
            return null;
        }
    }

    public static c5o J(Bundle bundle) {
        String string = bundle.getString("parameter");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            String strOptString = jSONObject.optString("appId");
            String strOptString2 = jSONObject.optString("placementId");
            if (TextUtils.isEmpty(strOptString)) {
                return null;
            }
            if (TextUtils.isEmpty(strOptString2)) {
                return null;
            }
            return new c5o(strOptString, strOptString2);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final i6 K(Object... objArr) {
        return rqj.c.g(Arrays.asList(objArr));
    }

    public static final void L(ih5 ih5Var, Function0 function0) {
        erf erfVar = ((vt9) ih5Var).M.b.l;
        erfVar.J0(sqf.d);
        ui6.i0(erfVar, 0, function0);
    }

    public static void M(int[] iArr, int[] iArr2) {
        long j2 = iArr[16] & 4294967295L;
        long j3 = iArr[17] & 4294967295L;
        long j4 = iArr[18] & 4294967295L;
        long j5 = iArr[19] & 4294967295L;
        long j6 = iArr[20] & 4294967295L;
        long j7 = iArr[21] & 4294967295L;
        long j8 = iArr[22] & 4294967295L;
        long j9 = iArr[23] & 4294967295L;
        long j10 = ((iArr[12] & 4294967295L) + j6) - 1;
        long j11 = (iArr[13] & 4294967295L) + j8;
        long j12 = (iArr[14] & 4294967295L) + j8 + j9;
        long j13 = (iArr[15] & 4294967295L) + j9;
        long j14 = j3 + j7;
        long j15 = j7 - j9;
        long j16 = j8 - j9;
        long j17 = j10 + j15;
        long j18 = (iArr[0] & 4294967295L) + j17;
        iArr2[0] = (int) j18;
        long j19 = (((iArr[1] & 4294967295L) + j9) - j10) + j11 + (j18 >> 32);
        iArr2[1] = (int) j19;
        long j20 = (((iArr[2] & 4294967295L) - j7) - j11) + j12 + (j19 >> 32);
        iArr2[2] = (int) j20;
        long j21 = ((iArr[3] & 4294967295L) - j12) + j13 + j17 + (j20 >> 32);
        iArr2[3] = (int) j21;
        long j22 = (((((iArr[4] & 4294967295L) + j2) + j7) + j11) - j13) + j17 + (j21 >> 32);
        iArr2[4] = (int) j22;
        long j23 = ((iArr[5] & 4294967295L) - j2) + j11 + j12 + j14 + (j22 >> 32);
        iArr2[5] = (int) j23;
        long j24 = (((iArr[6] & 4294967295L) + j4) - j3) + j12 + j13 + (j23 >> 32);
        iArr2[6] = (int) j24;
        long j25 = ((((iArr[7] & 4294967295L) + j2) + j5) - j4) + j13 + (j24 >> 32);
        iArr2[7] = (int) j25;
        long j26 = (((((iArr[8] & 4294967295L) + j2) + j3) + j6) - j5) + (j25 >> 32);
        iArr2[8] = (int) j26;
        long j27 = (((iArr[9] & 4294967295L) + j4) - j6) + j14 + (j26 >> 32);
        iArr2[9] = (int) j27;
        long j28 = ((((iArr[10] & 4294967295L) + j4) + j5) - j15) + j16 + (j27 >> 32);
        iArr2[10] = (int) j28;
        long j29 = ((((iArr[11] & 4294967295L) + j5) + j6) - j16) + (j28 >> 32);
        iArr2[11] = (int) j29;
        N((int) ((j29 >> 32) + 1), iArr2);
    }

    public static void N(int i2, int[] iArr) {
        long j2;
        if (i2 != 0) {
            long j3 = i2 & 4294967295L;
            long j4 = (iArr[0] & 4294967295L) + j3;
            iArr[0] = (int) j4;
            long j5 = ((iArr[1] & 4294967295L) - j3) + (j4 >> 32);
            iArr[1] = (int) j5;
            long j6 = j5 >> 32;
            if (j6 != 0) {
                long j7 = j6 + (iArr[2] & 4294967295L);
                iArr[2] = (int) j7;
                j6 = j7 >> 32;
            }
            long j8 = (iArr[3] & 4294967295L) + j3 + j6;
            iArr[3] = (int) j8;
            long j9 = (iArr[4] & 4294967295L) + j3 + (j8 >> 32);
            iArr[4] = (int) j9;
            j2 = j9 >> 32;
        } else {
            j2 = 0;
        }
        if ((j2 == 0 || z5i.T(12, 5, iArr) == 0) && !(iArr[11] == -1 && z5i.Q(iArr, g, 12))) {
            return;
        }
        g(iArr);
    }

    public static Executor O(final Executor executor, final df9 df9Var) {
        executor.getClass();
        return executor == m97.a ? executor : new Executor() { // from class: r9e
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e2) {
                    df9Var.setExceptionInternal(e2);
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P(kotlin.jvm.functions.Function0 r5, kotlin.jvm.functions.Function2 r6, nt5 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.p11
            if (r0 == 0) goto L13
            r0 = r7
            p11 r0 = (defpackage.p11) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            p11 r0 = new p11
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.t
            px5 r1 = px5.a
            int r2 = r0.u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.ybh.y(r7)     // Catch: m11 -> L40
            goto L40
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L2e:
            defpackage.ybh.y(r7)
            s3 r7 = new s3     // Catch: m11 -> L40
            r2 = 4
            r7.<init>(r5, r6, r3, r2)     // Catch: m11 -> L40
            r0.u = r4     // Catch: m11 -> L40
            java.lang.Object r5 = defpackage.sgb.q(r7, r0)     // Catch: m11 -> L40
            if (r5 != r1) goto L40
            return r1
        L40:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm5.P(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, nt5):java.lang.Object");
    }

    public static stj Q() {
        return new stj(0);
    }

    public static a2k R(float f2, float f3, Object obj, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new a2k(f2, f3, obj);
    }

    public static void S(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        gyg.U(iArr, iArr3);
        while (true) {
            M(iArr3, iArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                gyg.U(iArr2, iArr3);
            }
        }
    }

    public static void T(int[] iArr, int[] iArr2, int[] iArr3) {
        if (z5i.x0(12, iArr, iArr2, iArr3) != 0) {
            long j2 = (iArr3[0] & 4294967295L) - 1;
            iArr3[0] = (int) j2;
            long j3 = (iArr3[1] & 4294967295L) + 1 + (j2 >> 32);
            iArr3[1] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (iArr3[2] & 4294967295L);
                iArr3[2] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = ((iArr3[3] & 4294967295L) - 1) + j4;
            iArr3[3] = (int) j6;
            long j7 = ((iArr3[4] & 4294967295L) - 1) + (j6 >> 32);
            iArr3[4] = (int) j7;
            if ((j7 >> 32) != 0) {
                z5i.v(12, 5, iArr3);
            }
        }
    }

    public static final g1b U(Iterable iterable) {
        g1b g1bVar = iterable instanceof g1b ? (g1b) iterable : null;
        if (g1bVar == null) {
            g1bVar = iterable instanceof i6 ? (i6) iterable : null;
            if (g1bVar == null) {
                ybg ybgVar = iterable instanceof ybg ? (ybg) iterable : null;
                i6 i6VarH = ybgVar != null ? ybgVar.h() : null;
                if (i6VarH != null) {
                    return i6VarH;
                }
                rqj rqjVar = rqj.c;
                if (iterable instanceof Collection) {
                    return rqjVar.g((Collection) iterable);
                }
                ybg ybgVarH = rqjVar.h();
                o95.t(iterable, ybgVarH);
                return ybgVarH.h();
            }
        }
        return g1bVar;
    }

    public static final jbg V(Map map) {
        jbg jbgVar = map instanceof jbg ? (jbg) map : null;
        if (jbgVar != null) {
            return jbgVar;
        }
        ibg ibgVar = map instanceof ibg ? (ibg) map : null;
        jbg jbgVarBuild = ibgVar != null ? ibgVar.build() : null;
        if (jbgVarBuild != null) {
            return jbgVarBuild;
        }
        kbg kbgVar = kbg.g;
        kbgVar.getClass();
        if (map.isEmpty()) {
            return kbgVar;
        }
        lbg lbgVar = new lbg(kbgVar);
        lbgVar.putAll(map);
        return lbgVar.build();
    }

    public static byte[] W(byte[] bArr) {
        int i2 = 0;
        while (i2 < bArr.length && bArr[i2] == 0) {
            i2++;
        }
        if (i2 == 0) {
            return bArr;
        }
        int length = bArr.length;
        y72.a(length, bArr.length);
        return Arrays.copyOfRange(bArr, i2, length);
    }

    public static e8m X(int i2, int i3, vq7 vq7Var) {
        if ((i3 & 1) != 0) {
            i2 = 300;
        }
        int i4 = (i3 & 2) != 0 ? 0 : 90;
        if ((i3 & 4) != 0) {
            vq7Var = wq7.a;
        }
        return new e8m(i2, i4, vq7Var);
    }

    public static void Y(d82 d82Var, RectF rectF) {
        rectF.left = Float.MAX_VALUE;
        rectF.top = Float.MAX_VALUE;
        rectF.right = Float.MIN_VALUE;
        rectF.bottom = Float.MIN_VALUE;
        k1j k1jVarA = t1j.a((Function2) d82Var.b);
        while (k1jVarA.hasNext()) {
            RectF rectF2 = (RectF) k1jVarA.next();
            float f2 = rectF2.left;
            if (f2 <= rectF2.right && rectF2.top <= rectF2.bottom) {
                rectF.left = Math.min(rectF.left, f2);
                rectF.top = Math.min(rectF.top, rectF2.top);
                rectF.right = Math.max(rectF.right, rectF2.right);
                rectF.bottom = Math.max(rectF.bottom, rectF2.bottom);
            }
        }
        if (rectF.left > rectF.right || rectF.top > rectF.bottom) {
            rectF.setEmpty();
        }
    }

    public static final void a(Object obj, Object obj2, Function1 function1, ih5 ih5Var) {
        vt9 vt9Var = (vt9) ih5Var;
        boolean zF = vt9Var.f(obj) | vt9Var.f(obj2);
        Object objK = vt9Var.K();
        if (zF || objK == hh5.a) {
            objK = new tb7(function1);
            vt9Var.g0(objK);
        }
    }

    public static void a0(MediationAdConfiguration mediationAdConfiguration) {
        int iTaggedForChildDirectedTreatment = mediationAdConfiguration.taggedForChildDirectedTreatment();
        mzg.a = iTaggedForChildDirectedTreatment != 0 ? iTaggedForChildDirectedTreatment != 1 ? null : 1 : 0;
        Bundle mediationExtras = mediationAdConfiguration.getMediationExtras();
        fcp.d = mediationExtras.containsKey("mute_audio") ? Boolean.valueOf(mediationExtras.getBoolean("mute_audio")) : null;
    }

    public static final void b(Object obj, Function1 function1, ih5 ih5Var) {
        vt9 vt9Var = (vt9) ih5Var;
        boolean zF = vt9Var.f(obj);
        Object objK = vt9Var.K();
        if (zF || objK == hh5.a) {
            objK = new tb7(function1);
            vt9Var.g0(objK);
        }
    }

    public static boolean b0(String str) {
        char cB;
        List<String> listX = StringsKt.X(str, new char[]{'.'});
        if (!(listX instanceof Collection) || !listX.isEmpty()) {
            for (String str2 : listX) {
                if (str2.length() != 0 && str2.length() <= 63) {
                    char cZ = pik.z(str2);
                    if (('A' <= cZ && cZ < '[') || ('a' <= cZ && cZ < '{')) {
                        char cB2 = pik.B(str2);
                        if ((('A' <= cB2 && cB2 < '[') || ('a' <= cB2 && cB2 < '{')) || ('0' <= (cB = pik.B(str2)) && cB < ':')) {
                            IntRange intRangeJ = djh.j(1, str2.length() - 1);
                            String strSubstring = str2.substring(((a) intRangeJ).a, ((a) intRangeJ).b + 1);
                            for (int i2 = 0; i2 < strSubstring.length(); i2++) {
                                char cCharAt = strSubstring.charAt(i2);
                                if (('A' <= cCharAt && cCharAt < '[') || (('a' <= cCharAt && cCharAt < '{') || (('0' <= cCharAt && cCharAt < ':') || cCharAt == '-'))) {
                                }
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static final void c(Object[] objArr, Function1 function1, ih5 ih5Var) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        vt9 vt9Var = (vt9) ih5Var;
        boolean zD = vt9Var.d(objArrCopyOf.length);
        for (Object obj : objArrCopyOf) {
            zD |= vt9Var.f(obj);
        }
        Object objK = vt9Var.K();
        if (zD || objK == hh5.a) {
            vt9Var.g0(new tb7(function1));
        }
    }

    public static boolean c0(String str) {
        if (str.length() > 0) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (' ' <= cCharAt && cCharAt < 127 && !StringsKt.F(" ()<>@,;:\\\"/[]?={}", cCharAt)) {
                }
            }
            return true;
        }
        return false;
    }

    public static j71 d(int i2, int i3, int i4, int i5) {
        ColorSpace rgb;
        e5i e5iVar;
        byte b2;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace rgb2;
        ColorSpace colorSpaceF;
        int i6 = (i5 & 4) != 0 ? 0 : i4;
        e5i e5iVar2 = xa5.e;
        oup.u0(i6);
        Bitmap.Config configU0 = oup.u0(i6);
        if (Intrinsics.a(e5iVar2, e5iVar2)) {
            rgb = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (Intrinsics.a(e5iVar2, xa5.q)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (Intrinsics.a(e5iVar2, xa5.r)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (Intrinsics.a(e5iVar2, xa5.o)) {
            rgb = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (Intrinsics.a(e5iVar2, xa5.j)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (Intrinsics.a(e5iVar2, xa5.i)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (Intrinsics.a(e5iVar2, xa5.t)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (Intrinsics.a(e5iVar2, xa5.s)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (Intrinsics.a(e5iVar2, xa5.k)) {
            rgb = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (Intrinsics.a(e5iVar2, xa5.l)) {
            rgb = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (Intrinsics.a(e5iVar2, xa5.g)) {
            rgb = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (Intrinsics.a(e5iVar2, xa5.h)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (Intrinsics.a(e5iVar2, xa5.f)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (Intrinsics.a(e5iVar2, xa5.m)) {
            rgb = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (Intrinsics.a(e5iVar2, xa5.p)) {
            rgb = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!Intrinsics.a(e5iVar2, xa5.n)) {
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 34 && (colorSpaceF = g8.F(e5iVar2)) != null) {
                    rgb2 = colorSpaceF;
                } else if (i7 < 36 || (rgb = u8.j(e5iVar2)) == null) {
                    if (e5iVar2 != null) {
                        String str = e5iVar2.a;
                        float[] fArrA = e5iVar2.d.a();
                        x1m x1mVar = e5iVar2.g;
                        if (x1mVar != null) {
                            e5iVar = e5iVar2;
                            b2 = 0;
                            transferParameters = new ColorSpace.Rgb.TransferParameters(x1mVar.b, x1mVar.c, x1mVar.d, x1mVar.e, x1mVar.f, x1mVar.g, x1mVar.a);
                        } else {
                            e5iVar = e5iVar2;
                            b2 = 0;
                            transferParameters = null;
                        }
                        e5i e5iVar3 = e5iVar;
                        float[] fArr = e5iVar3.i;
                        if (transferParameters != null) {
                            ColorSpace.Rgb rgb3 = new ColorSpace.Rgb(str, e5iVar3.h, fArrA, transferParameters);
                            if (Float.isNaN(fArr[b2]) || Arrays.equals(rgb3.getTransform(), fArr)) {
                                rgb2 = rgb3;
                            } else {
                                rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                            }
                        } else {
                            float[] fArr2 = e5iVar3.h;
                            final d5i d5iVar = e5iVar3.l;
                            final byte b3 = b2;
                            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: wa5
                                @Override // java.util.function.DoubleUnaryOperator
                                public final double applyAsDouble(double d2) {
                                    byte b4 = b3;
                                    d5i d5iVar2 = (d5i) d5iVar;
                                    switch (b4) {
                                    }
                                    return ((Number) d5iVar2.invoke(Double.valueOf(d2))).doubleValue();
                                }
                            };
                            final d5i d5iVar2 = e5iVar3.o;
                            final byte b4 = 1;
                            rgb2 = new ColorSpace.Rgb(str, fArr2, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: wa5
                                @Override // java.util.function.DoubleUnaryOperator
                                public final double applyAsDouble(double d2) {
                                    byte b42 = b4;
                                    d5i d5iVar22 = (d5i) d5iVar2;
                                    switch (b42) {
                                    }
                                    return ((Number) d5iVar22.invoke(Double.valueOf(d2))).doubleValue();
                                }
                            }, e5iVar3.e, e5iVar3.f);
                        }
                    } else {
                        rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                }
                return new j71(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, configU0, true, rgb2));
            }
            rgb = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        rgb2 = rgb;
        return new j71(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, configU0, true, rgb2));
    }

    public static final void e(ih5 ih5Var, Object obj, Function2 function2) {
        CoroutineContext coroutineContext = ((vt9) ih5Var).R;
        vt9 vt9Var = (vt9) ih5Var;
        boolean zF = vt9Var.f(obj);
        Object objK = vt9Var.K();
        if (zF || objK == hh5.a) {
            objK = new s1c(coroutineContext, function2);
            vt9Var.g0(objK);
        }
    }

    public static final void f(Object obj, Object obj2, Function2 function2, ih5 ih5Var) {
        CoroutineContext coroutineContext = ((vt9) ih5Var).R;
        vt9 vt9Var = (vt9) ih5Var;
        boolean zF = vt9Var.f(obj) | vt9Var.f(obj2);
        Object objK = vt9Var.K();
        if (zF || objK == hh5.a) {
            objK = new s1c(coroutineContext, function2);
            vt9Var.g0(objK);
        }
    }

    public static void g(int[] iArr) {
        long j2 = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j2;
        long j3 = ((iArr[1] & 4294967295L) - 1) + (j2 >> 32);
        iArr[1] = (int) j3;
        long j4 = j3 >> 32;
        if (j4 != 0) {
            long j5 = j4 + (iArr[2] & 4294967295L);
            iArr[2] = (int) j5;
            j4 = j5 >> 32;
        }
        long j6 = (iArr[3] & 4294967295L) + 1 + j4;
        iArr[3] = (int) j6;
        long j7 = (iArr[4] & 4294967295L) + 1 + (j6 >> 32);
        iArr[4] = (int) j7;
        if ((j7 >> 32) != 0) {
            z5i.T(12, 5, iArr);
        }
    }

    public static boolean h(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static final voh i(b2c b2cVar) {
        b2c b2cVarR = b2cVar.R();
        return b2cVarR != null ? b2cVarR.y(b2cVar, true) : new voh(0.0f, 0.0f, (int) (b2cVar.h() >> 32), (int) (b2cVar.h() & 4294967295L));
    }

    public static final voh j(b2c b2cVar, boolean z) {
        b2c b2cVarV = v(b2cVar);
        float fH = (int) (b2cVarV.h() >> 32);
        float fH2 = (int) (b2cVarV.h() & 4294967295L);
        voh vohVarY = b2cVarV.y(b2cVar, z);
        float f2 = vohVarY.a;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fH) {
                f2 = fH;
            }
        }
        float f3 = vohVarY.b;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 > fH2) {
                f3 = fH2;
            }
        }
        float f4 = vohVarY.c;
        if (z) {
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 <= fH) {
                fH = f4;
            }
            f4 = fH;
        }
        float f5 = vohVarY.d;
        if (z) {
            float f6 = f5 >= 0.0f ? f5 : 0.0f;
            if (f6 <= fH2) {
                fH2 = f6;
            }
            f5 = fH2;
        }
        if (f2 == f4 || f3 == f5) {
            return voh.e;
        }
        long jB = b2cVarV.B((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
        long jB2 = b2cVarV.B((Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
        long jB3 = b2cVarV.B((Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L));
        long jB4 = b2cVarV.B((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jB4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jB3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jB & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jB2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jB4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jB3 & 4294967295L));
        return new voh(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final boolean k(Iterable iterable, int i2) {
        if (i2 == 0) {
            return true;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((b2l) it.next()).j.a().d != i2) {
                return true;
            }
        }
        return false;
    }

    public static void l(vo5 vo5Var, jfc jfcVar, uo5 uo5Var) {
        uo5Var.n = -1;
        eo5 eo5Var = uo5Var.L;
        int[] iArr = uo5Var.o0;
        eo5 eo5Var2 = uo5Var.K;
        eo5 eo5Var3 = uo5Var.I;
        eo5 eo5Var4 = uo5Var.J;
        eo5 eo5Var5 = uo5Var.H;
        uo5Var.o = -1;
        int[] iArr2 = vo5Var.o0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i2 = eo5Var5.g;
            int iN = vo5Var.n() - eo5Var4.g;
            eo5Var5.i = jfcVar.k(eo5Var5);
            eo5Var4.i = jfcVar.k(eo5Var4);
            jfcVar.d(eo5Var5.i, i2);
            jfcVar.d(eo5Var4.i, iN);
            uo5Var.n = 2;
            uo5Var.X = i2;
            int i3 = iN - i2;
            uo5Var.T = i3;
            int i4 = uo5Var.a0;
            if (i3 < i4) {
                uo5Var.T = i4;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i5 = eo5Var3.g;
        int iK = vo5Var.k() - eo5Var2.g;
        eo5Var3.i = jfcVar.k(eo5Var3);
        eo5Var2.i = jfcVar.k(eo5Var2);
        jfcVar.d(eo5Var3.i, i5);
        jfcVar.d(eo5Var2.i, iK);
        if (uo5Var.Z > 0 || uo5Var.f0 == 8) {
            pvj pvjVarK = jfcVar.k(eo5Var);
            eo5Var.i = pvjVarK;
            jfcVar.d(pvjVarK, uo5Var.Z + i5);
        }
        uo5Var.o = 2;
        uo5Var.Y = i5;
        int i6 = iK - i5;
        uo5Var.U = i6;
        int i7 = uo5Var.b0;
        if (i6 < i7) {
            uo5Var.U = i7;
        }
    }

    public static void m(long j2, g1g g1gVar, hyl[] hylVarArr) {
        int i2;
        while (true) {
            if (g1gVar.a() <= 1) {
                return;
            }
            int i3 = 0;
            while (true) {
                if (g1gVar.a() == 0) {
                    i2 = -1;
                    break;
                }
                int iA = g1gVar.A();
                i3 += iA;
                if (iA != 255) {
                    i2 = i3;
                    break;
                }
            }
            int i4 = 0;
            while (true) {
                if (g1gVar.a() == 0) {
                    i4 = -1;
                    break;
                }
                int iA2 = g1gVar.A();
                i4 += iA2;
                if (iA2 != 255) {
                    break;
                }
            }
            int i5 = g1gVar.b + i4;
            if (i4 == -1 || i4 > g1gVar.a()) {
                w7d.K("Skipping remainder of malformed SEI NAL unit.");
                i5 = g1gVar.c;
            } else if (i2 == 4 && i4 >= 8) {
                int iA3 = g1gVar.A();
                int iH = g1gVar.H();
                int iM = iH == 49 ? g1gVar.m() : 0;
                int iA4 = g1gVar.A();
                if (iH == 47) {
                    g1gVar.O(1);
                }
                boolean z = iA3 == 181 && (iH == 49 || iH == 47) && iA4 == 3;
                if (iH == 49) {
                    z &= iM == 1195456820;
                }
                if (z) {
                    n(j2, g1gVar, hylVarArr);
                }
            }
            g1gVar.N(i5);
        }
    }

    public static void n(long j2, g1g g1gVar, hyl[] hylVarArr) {
        int iA = g1gVar.A();
        if ((iA & 64) != 0) {
            g1gVar.O(1);
            int i2 = (iA & 31) * 3;
            int i3 = g1gVar.b;
            for (hyl hylVar : hylVarArr) {
                g1gVar.N(i3);
                hylVar.f(i2, g1gVar);
                z4o.H(j2 != -9223372036854775807L);
                hylVar.a(j2, 1, i2, 0, null);
            }
        }
    }

    public static AdError o(int i2, String str) {
        return new AdError(i2, str, "com.opera.ads.mediation.admob");
    }

    public static final nx5 p(h hVar, ih5 ih5Var) {
        hVar.getClass();
        return new fth(((vt9) ih5Var).R, hVar);
    }

    public static AdError q(int i2, String str) {
        return new AdError(i2, str, "com.opera.ads");
    }

    public static final float r(Context context, float f2) {
        return f2 * context.getResources().getDisplayMetrics().density;
    }

    public static final c8e s(c8e c8eVar, a21 a21Var, Function2 function2) {
        fsf fsfVar = fsf.a;
        return c8eVar.d(new yj7(a21Var, function2));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: m2 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(l99 r4, java.lang.Object r5, java.lang.Object r6, nt5 r7) throws m2 {
        /*
            boolean r0 = r7 instanceof defpackage.fa9
            if (r0 == 0) goto L13
            r0 = r7
            fa9 r0 = (defpackage.fa9) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            fa9 r0 = new fa9
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.u
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L29
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            return
        L29:
            java.lang.Object r6 = r0.t
            defpackage.ybh.y(r7)
            goto L3d
        L2f:
            defpackage.ybh.y(r7)
            r0.t = r6
            r0.v = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L3d
            return
        L3d:
            m2 r4 = new m2
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm5.t(l99, java.lang.Object, java.lang.Object, nt5):void");
    }

    public static final boolean u(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static final b2c v(b2c b2cVar) {
        b2c b2cVar2;
        b2c b2cVarR = b2cVar.R();
        while (true) {
            b2c b2cVar3 = b2cVarR;
            b2cVar2 = b2cVar;
            b2cVar = b2cVar3;
            if (b2cVar == null) {
                break;
            }
            b2cVarR = b2cVar.R();
        }
        wye wyeVar = b2cVar2 instanceof wye ? (wye) b2cVar2 : null;
        if (wyeVar == null) {
            return b2cVar2;
        }
        wye wyeVar2 = wyeVar;
        while (true) {
            wyeVar2 = wyeVar2.w;
            if (wyeVar2 == null) {
                return wyeVar;
            }
            wyeVar = wyeVar2;
        }
    }

    public static int w(int i2, int i3, Bitmap.Config config) {
        int i4 = i2 * i3;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i5 = pym.a[config.ordinal()];
        int i6 = 1;
        if (i5 != 1) {
            i6 = 2;
            if (i5 != 2 && i5 != 3) {
                i6 = 4;
                if (i5 == 4) {
                    i6 = 8;
                }
            }
        }
        return i4 * i6;
    }

    public static int x(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled Bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        sb.append("[");
        sb.append(width);
        sb.append("x");
        sb.append(height);
        sb.append("] ");
        sb.append(config);
        throw new IllegalStateException(sb.toString());
    }

    public static ArrayList y(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean z(ContextWrapper contextWrapper, Intent intent, Function2 function2) {
        boolean zEquals;
        String dataString = intent.getDataString();
        if (intent.getCategories() != null) {
            Set<String> categories = intent.getCategories();
            if (!(categories instanceof Collection) || !categories.isEmpty()) {
                Iterator<T> it = categories.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (Intrinsics.a((String) it.next(), "android.intent.category.BROWSABLE")) {
                        if (Intrinsics.a(intent.getAction(), "android.intent.action.VIEW") && dataString != null && intent.getComponent() == null && URLUtil.isNetworkUrl(dataString)) {
                            HashSet hashSet = mdb.a;
                            if (!intent.getBooleanExtra("externally_handled", false)) {
                                return ((Boolean) function2.invoke(dataString, lqm.d)).booleanValue();
                            }
                        }
                    }
                }
            }
            HashSet hashSet2 = mdb.a;
            intent.removeExtra("externally_handled");
            return false;
        }
        if (Intrinsics.a(intent.getAction(), "android.intent.action.VIEW") && dataString != null && !TextUtils.equals(intent.getPackage(), contextWrapper.getPackageName()) && !intent.getBooleanExtra("com.opera.android.extra.DO_NOT_INTERCEPT", false)) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                zEquals = true;
            } else {
                String[] strArr = OperaApplication.K;
                ResolveInfo resolveInfo = contextWrapper.getApplicationContext().k().a;
                if ((resolveInfo != null ? resolveInfo.activityInfo : null) == null) {
                    zEquals = false;
                } else {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    zEquals = component.equals(new ComponentName(activityInfo.packageName, activityInfo.name));
                }
            }
            if (zEquals && URLUtil.isNetworkUrl(dataString) && !mdb.d(mdb.c(dataString))) {
                return ((Boolean) function2.invoke(dataString, lqm.p)).booleanValue();
            }
        }
        return false;
    }

    public abstract void Z(ArrayList arrayList);
}
