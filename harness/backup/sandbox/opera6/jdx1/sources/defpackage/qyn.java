package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.graphics.BlendMode;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.provider.DocumentsContract;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.opera.android.BrowserActivity;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class qyn implements w18 {
    public static final gd7 a = new gd7("RESUME_TOKEN", 4);
    public static final ue5 b = new ue5(264538863, new gf5((byte) 26), false);
    public static final ue5 c = new ue5(-1919335651, new gf5((byte) 27), false);
    public static final byte[] d = {0, 0, 0, 1};
    public static final float[] e = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object f = new Object();
    public static int[] g = new int[10];
    public static final jqb h = new jqb((byte) 2);
    public static final eko i = new eko(3);

    public static int A(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        z4o.H(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            o(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            o(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            o(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b2 = bArr[i6];
            if ((b2 & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                    o(zArr);
                    return i7;
                }
                i6 -= 2;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    public static final String B(n01 n01Var) {
        BigDecimal q0iVar;
        String str;
        String str2 = n01Var.b;
        l01 l01Var = n01Var.a;
        byte b2 = l01Var.a;
        byte b3 = l01Var.b;
        try {
            p0i p0iVar = t0i.b;
            q0iVar = new BigDecimal(str2);
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        if (t0i.d(q0iVar) == null) {
            str = new DecimalFormat(b3 > 0 ? sko.j("0.", c.n(b3, "0")) : "0", DecimalFormatSymbols.getInstance(Locale.getDefault())).format(q0iVar.divide(BigDecimal.TEN.pow(b2), b3, RoundingMode.HALF_UP));
        } else {
            hzc hzcVarC = hzc.c.c("formatForDisplay");
            String str3 = hzcVarC.b;
            eaj eajVar = eaj.e;
            if (hzcVarC.a.a.compareTo(eajVar) <= 0) {
                hzcVarC.b(eajVar, str3, sko.k("Cannot format ", str2, ", returning empty string"), null);
            }
            str = null;
        }
        return str == null ? "" : str;
    }

    public static String C(s25 s25Var, long j, int i2, int i3, int i4) {
        if (j == 0 && i2 == 0) {
            return s25Var.a.getString(i4);
        }
        BrowserActivity browserActivity = s25Var.a;
        return browserActivity.getString(2132021414, aik.h(j, browserActivity), browserActivity.getResources().getQuantityString(i3, i2, Integer.valueOf(i2)));
    }

    public static long D(long j, long j2) {
        zi4.o(j, "a");
        zi4.o(j2, "b");
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j3 = j2 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j3) {
            long j4 = jNumberOfTrailingZeros - j3;
            long j5 = (j4 >> 63) & j4;
            long j6 = (j4 - j5) - j5;
            j3 += j5;
            jNumberOfTrailingZeros = j6 >> Long.numberOfTrailingZeros(j6);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static final String E(HashMap map) {
        orb orbVar;
        String str = (String) map.get("_lpx");
        if (str != null) {
            try {
                orbVar = new orb(str);
            } catch (JSONException unused) {
            }
        } else {
            orbVar = null;
        }
        if (orbVar == null) {
            return null;
        }
        String strM = orbVar.m("__name__", (String) null);
        if (strM == null ? false : strM.equals("Open URL")) {
            return orbVar.m("URL", (String) null);
        }
        return null;
    }

    public static final float F(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static Long G(Uri uri) throws Throwable {
        Throwable th;
        ParcelFileDescriptor parcelFileDescriptorU;
        Long lValueOf = null;
        try {
            parcelFileDescriptorU = U(uri, "r");
            if (parcelFileDescriptorU != null) {
                try {
                    lValueOf = Long.valueOf(parcelFileDescriptorU.getStatSize());
                } catch (FileNotFoundException unused) {
                } catch (Throwable th2) {
                    th = th2;
                    joh.j(parcelFileDescriptorU);
                    throw th;
                }
            }
        } catch (FileNotFoundException unused2) {
            parcelFileDescriptorU = null;
        } catch (Throwable th3) {
            th = th3;
            parcelFileDescriptorU = null;
        }
        joh.j(parcelFileDescriptorU);
        return lValueOf;
    }

    public static String H(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = (byte[]) list.get(i2);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                z0b z0bVarP = h1b.p();
                int i3 = 0;
                while (i3 < bArr.length) {
                    int iA = A(bArr, i3, bArr.length, zArr);
                    if (iA != bArr.length) {
                        z0bVarP.c(Integer.valueOf(iA));
                    }
                    i3 = iA + 3;
                }
                csh cshVarG = z0bVarP.g();
                for (int i4 = 0; i4 < cshVarG.d; i4++) {
                    if (((Integer) cshVarG.get(i4)).intValue() + 3 < length) {
                        bq4 bq4Var = new bq4(bArr, ((Integer) cshVarG.get(i4)).intValue() + 3, length);
                        sv2 sv2VarW = W(bq4Var);
                        if (sv2VarW.a == 33 && sv2VarW.b == 0) {
                            bq4Var.t(4);
                            int i5 = bq4Var.i(3);
                            bq4Var.s();
                            che cheVarX = X(bq4Var, true, i5, null);
                            return j75.a(cheVarX.a, cheVarX.b, cheVarX.c, cheVarX.d, cheVarX.e, cheVarX.f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static String I(oj9 oj9Var) {
        String str = oj9Var.n;
        String str2 = oj9Var.k;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (str2.startsWith("dva1") || str2.startsWith("dvav")) {
                return "video/avc";
            }
            if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return oj9Var.n;
    }

    public static csh J(orb orbVar, String str) throws JSONException, NumberFormatException, ParseException {
        scd.q(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        vpb vpbVarB = orbVar.b(str);
        int length = vpbVarB.a.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            i7b i7bVarJ0 = z4o.j0(vpbVarB.c(i2));
            int i4 = i3 + 1;
            int iB = w0b.b(objArrCopyOf.length, i4);
            if (iB > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
            }
            objArrCopyOf[i3] = i7bVarJ0;
            i2++;
            i3 = i4;
        }
        return h1b.o(i3, objArrCopyOf);
    }

    public static c8e K(c8e c8eVar, lde ldeVar) {
        return c8eVar.d(new ema(ldeVar));
    }

    public static boolean L(byte[] bArr, int i2, oj9 oj9Var) {
        int i3;
        if (Objects.equals(oj9Var.n, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i3 = b2 & 31) == 1 || i3 == 9 || i3 == 14)) {
                return false;
            }
        } else if (Objects.equals(oj9Var.n, "video/hevc")) {
            sv2 sv2VarW = W(new bq4(bArr, 4, i2 + 4));
            int i4 = sv2VarW.a;
            if (i4 == 35) {
                return false;
            }
            if (i4 <= 14 && i4 % 2 == 0 && sv2VarW.c == oj9Var.E - 1) {
                return false;
            }
        }
        return true;
    }

    public static final boolean M(long j) {
        return (j & 2) != 0;
    }

    public static final boolean N(long j) {
        return (j & 1) != 0;
    }

    public static final c8e O(ih5 ih5Var, c8e c8eVar) {
        if (c8eVar.b(new hf5((byte) 10))) {
            return c8eVar;
        }
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.X(1219399079);
        c8e c8eVar2 = (c8e) c8eVar.a(z7e.b, new whf(vt9Var, (byte) 15));
        vt9Var.p(false);
        return c8eVar2;
    }

    public static final c8e P(ih5 ih5Var, c8e c8eVar) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.W(439770924);
        c8e c8eVarO = O(vt9Var, c8eVar);
        vt9Var.p(false);
        return c8eVarO;
    }

    public static int Q(oj9 oj9Var) {
        String strI = I(oj9Var);
        if (Objects.equals(strI, "video/avc")) {
            return 1;
        }
        return Objects.equals(strI, "video/hevc") ? 2 : 0;
    }

    public static BlendMode R(lh3 lh3Var) {
        switch (mh3.a[lh3Var.ordinal()]) {
            case 1:
                return BlendMode.CLEAR;
            case 2:
                return BlendMode.SRC;
            case 3:
                return BlendMode.DST;
            case 4:
                return BlendMode.SRC_OVER;
            case 5:
                return BlendMode.DST_OVER;
            case 6:
                return BlendMode.SRC_IN;
            case 7:
                return BlendMode.DST_IN;
            case 8:
                return BlendMode.SRC_OUT;
            case 9:
                return BlendMode.DST_OUT;
            case 10:
                return BlendMode.SRC_ATOP;
            case 11:
                return BlendMode.DST_ATOP;
            case 12:
                return BlendMode.XOR;
            case 13:
                return BlendMode.PLUS;
            case 14:
                return BlendMode.MODULATE;
            case 15:
                return BlendMode.SCREEN;
            case 16:
                return BlendMode.OVERLAY;
            case 17:
                return BlendMode.DARKEN;
            case 18:
                return BlendMode.LIGHTEN;
            case 19:
                return BlendMode.COLOR_DODGE;
            case 20:
                return BlendMode.COLOR_BURN;
            case 21:
                return BlendMode.HARD_LIGHT;
            case 22:
                return BlendMode.SOFT_LIGHT;
            case 23:
                return BlendMode.DIFFERENCE;
            case 24:
                return BlendMode.EXCLUSION;
            case 25:
                return BlendMode.MULTIPLY;
            case 26:
                return BlendMode.HUE;
            case 27:
                return BlendMode.SATURATION;
            case 28:
                return BlendMode.COLOR;
            case 29:
                return BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }

    public static ParcelFileDescriptor U(Uri uri, String str) {
        return "file".equals(uri.getScheme()) ? ParcelFileDescriptor.open(new File(uri.getPath()), ParcelFileDescriptor.parseMode(str)) : t8.a.getContentResolver().openFileDescriptor(uri, str);
    }

    public static final f0g V(Object... objArr) {
        return new f0g(2, e82.C(objArr));
    }

    public static sv2 W(bq4 bq4Var) {
        bq4Var.s();
        return new sv2(bq4Var.i(6), bq4Var.i(6), bq4Var.i(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static che X(defpackage.bq4 r19, boolean r20, int r21, che r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 8
            r6 = 1
            r7 = 0
            if (r20 == 0) goto L43
            r2 = 2
            int r2 = r0.i(r2)
            boolean r8 = r0.h()
            r9 = 5
            int r9 = r0.i(r9)
            r10 = r7
            r11 = r10
        L1f:
            r12 = 32
            if (r10 >= r12) goto L2f
            boolean r12 = r0.h()
            if (r12 == 0) goto L2c
            int r12 = r6 << r10
            r11 = r11 | r12
        L2c:
            int r10 = r10 + 1
            goto L1f
        L2f:
            r10 = r7
        L30:
            if (r10 >= r3) goto L3b
            int r12 = r0.i(r5)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L30
        L3b:
            r13 = r2
        L3c:
            r17 = r4
            r14 = r8
            r15 = r9
            r16 = r11
            goto L58
        L43:
            if (r2 == 0) goto L51
            int r3 = r2.a
            boolean r8 = r2.b
            int r9 = r2.c
            int r11 = r2.d
            int[] r4 = r2.e
            r13 = r3
            goto L3c
        L51:
            r17 = r4
            r13 = r7
            r14 = r13
            r15 = r14
            r16 = r15
        L58:
            int r18 = r0.i(r5)
            r2 = r7
        L5d:
            if (r7 >= r1) goto L72
            boolean r3 = r0.h()
            if (r3 == 0) goto L67
            int r2 = r2 + 88
        L67:
            boolean r3 = r0.h()
            if (r3 == 0) goto L6f
            int r2 = r2 + 8
        L6f:
            int r7 = r7 + 1
            goto L5d
        L72:
            r0.t(r2)
            if (r1 <= 0) goto L7c
            int r5 = r5 - r1
            int r5 = r5 << r6
            r0.t(r5)
        L7c:
            che r12 = new che
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qyn.X(bq4, boolean, int, che):che");
    }

    public static sa2 Y(int i2, int i3, byte[] bArr) {
        int i4 = i2 + 2;
        do {
            i3--;
            if (bArr[i3] != 0) {
                if (i3 <= i4) {
                    return null;
                }
                bq4 bq4Var = new bq4(bArr, i4, i3 + 1);
                while (bq4Var.d(16)) {
                    int i5 = bq4Var.i(8);
                    int i6 = 0;
                    while (i5 == 255) {
                        i6 += 255;
                        i5 = bq4Var.i(8);
                    }
                    int i7 = i6 + i5;
                    int i8 = bq4Var.i(8);
                    int i9 = 0;
                    while (i8 == 255) {
                        i9 += 255;
                        i8 = bq4Var.i(8);
                    }
                    int i10 = i9 + i8;
                    if (i10 == 0 || !bq4Var.d(i10)) {
                        return null;
                    }
                    if (i7 == 176) {
                        int iM = bq4Var.m();
                        boolean zH = bq4Var.h();
                        int iM2 = zH ? bq4Var.m() : 0;
                        int iM3 = bq4Var.m();
                        int iM4 = -1;
                        for (int i11 = 0; i11 <= iM3; i11++) {
                            iM4 = bq4Var.m();
                            bq4Var.m();
                            int i12 = bq4Var.i(6);
                            if (i12 == 63) {
                                return null;
                            }
                            bq4Var.i(i12 == 0 ? Math.max(0, iM - 30) : Math.max(0, (i12 + iM) - 31));
                            if (zH) {
                                int i13 = bq4Var.i(6);
                                if (i13 == 63) {
                                    return null;
                                }
                                bq4Var.i(i13 == 0 ? Math.max(0, iM2 - 30) : Math.max(0, (i13 + iM2) - 31));
                            }
                            if (bq4Var.h()) {
                                bq4Var.t(10);
                            }
                        }
                        return new sa2((byte) 12, iM4, false);
                    }
                    bq4Var.t(i10 << 3);
                }
                return null;
            }
        } while (i3 > i4);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ehe Z(byte[] r32, int r33, int r34, r9i r35) {
        /*
            Method dump skipped, instructions count: 1005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qyn.Z(byte[], int, int, r9i):ehe");
    }

    public static final void a(myn mynVar, c8e c8eVar, boolean z, ayn aynVar, kxn kxnVar, Function1 function1, Function1 function12, ihg ihgVar, Function1 function13, ih5 ih5Var, int i2) {
        int i3;
        boolean z2;
        vt9 vt9Var;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(1465752536);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var2.h(mynVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var2.f(c8eVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var2.g(z) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= vt9Var2.f(aynVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= vt9Var2.f(kxnVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= vt9Var2.h(function1) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= vt9Var2.h(function12) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= vt9Var2.f(ihgVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= vt9Var2.h(function13) ? 67108864 : 33554432;
        }
        if ((38347923 & i3) == 38347922 && vt9Var2.z()) {
            vt9Var2.Q();
            vt9Var = vt9Var2;
        } else {
            vt9Var2.S();
            if ((i2 & 1) != 0 && !vt9Var2.x()) {
                vt9Var2.Q();
            }
            vt9Var2.q();
            vt9Var2.W(-161067104);
            vt9Var2.W(1849434622);
            Object objK = vt9Var2.K();
            zpa zpaVar = hh5.a;
            if (objK == zpaVar) {
                objK = new na();
                vt9Var2.g0(objK);
            }
            na naVar = (na) objK;
            vt9Var2.p(false);
            vt9Var2.p(false);
            a19 a19Var = ihgVar != null ? ihgVar.a : null;
            vt9Var2.W(-161063608);
            if (a19Var == null) {
                vt9Var2.W(1849434622);
                Object objK2 = vt9Var2.K();
                if (objK2 == zpaVar) {
                    objK2 = new ma();
                    vt9Var2.g0(objK2);
                }
                a19Var = (ma) objK2;
                z2 = false;
                vt9Var2.p(false);
            } else {
                z2 = false;
            }
            a19 a19Var2 = a19Var;
            vt9Var2.p(z2);
            vt9Var2.W(5004770);
            boolean z3 = (234881024 & i3) == 67108864;
            Object objK3 = vt9Var2.K();
            if (z3 || objK3 == zpaVar) {
                objK3 = new ra(function13, (byte) 18);
                vt9Var2.g0(objK3);
            }
            vt9Var2.p(false);
            vt9Var = vt9Var2;
            t8.a(mynVar, c8eVar, z, aynVar, kxnVar, function1, function12, naVar, a19Var2, (Function1) objK3, vt9Var, i3 & 4194302);
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ydk(mynVar, c8eVar, z, aynVar, kxnVar, function1, function12, ihgVar, function13, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static r9i a0(int r38, int r39, byte[] r40) {
        /*
            Method dump skipped, instructions count: 2041
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qyn.a0(int, int, byte[]):r9i");
    }

    public static final void b(String str, Function0 function0, Function0 function02, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1469975966);
        int i3 = i2 | (vt9Var.f(str) ? 4 : 2) | (vt9Var.h(function0) ? 32 : 16) | (vt9Var.h(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY);
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            c61 c61VarF = a26.F(vt9Var);
            z7e z7eVar = z7e.b;
            c8e c8eVarX = a26.X(wxe.Q(z7eVar), 24.0f);
            byte b2 = 19;
            x62 x62Var = new x62(24.0f, true, new t40(b2));
            rd3 rd3Var = rbe.n;
            db5 db5VarA = cb5.a(x62Var, rd3Var, vt9Var, 6);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = P(vt9Var, c8eVarX);
            bh5.To.getClass();
            vt9Var.a0();
            boolean z = vt9Var.S;
            Function0 function03 = m3c.S;
            if (z) {
                vt9Var.k(function03);
            } else {
                vt9Var.j0();
            }
            ah5 ah5Var = ujp.f;
            y4h.o(vt9Var, db5VarA, ah5Var);
            ah5 ah5Var2 = ujp.e;
            y4h.o(vt9Var, oagVarL, ah5Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            ah5 ah5Var3 = ujp.g;
            y4h.o(vt9Var, numValueOf, ah5Var3);
            y4h.m(vt9Var);
            ah5 ah5Var4 = ujp.d;
            y4h.o(vt9Var, c8eVarP, ah5Var4);
            db5 db5VarA2 = cb5.a(new x62(12.0f, true, new t40(b2)), rd3Var, vt9Var, 6);
            int iHashCode2 = Long.hashCode(vt9Var.T);
            oag oagVarL2 = vt9Var.l();
            c8e c8eVarP2 = P(vt9Var, z7eVar);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(function03);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, db5VarA2, ah5Var);
            y4h.o(vt9Var, oagVarL2, ah5Var2);
            u35.j(iHashCode2, vt9Var, ah5Var3, vt9Var);
            y4h.o(vt9Var, c8eVarP2, ah5Var4);
            String strQ = uyg.q((shk) ahk.b.getValue(), vt9Var);
            hp7 hp7Var = abm.a;
            ijl.b(strQ, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).f, vt9Var, 0, 0, 131070);
            ijl.b(uyg.q((shk) dhk.n.getValue(), vt9Var), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).k, vt9Var, 0, 0, 131070);
            vt9Var.p(true);
            i39 i39Var = mpj.a;
            o9i o9iVarA = m9i.a(new x62(8.0f, true, new t40((byte) 19)), rbe.k, vt9Var, 6);
            int iHashCode3 = Long.hashCode(vt9Var.T);
            oag oagVarL3 = vt9Var.l();
            c8e c8eVarP3 = P(vt9Var, i39Var);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(function03);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA, ah5Var);
            y4h.o(vt9Var, oagVarL3, ah5Var2);
            u35.j(iHashCode3, vt9Var, ah5Var3, vt9Var);
            y4h.o(vt9Var, c8eVarP3, ah5Var4);
            if (1.0f <= 0.0d) {
                y7b.a("invalid weight; must be greater than zero");
            }
            yi4.k(function0, new g4c(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, (paj) null, (z14) null, (zvf) null, gyg.d, vt9Var, ((i3 >> 3) & 14) | 805306368, 508);
            boolean zH = vt9Var.h(c61VarF) | ((i3 & 14) == 4) | ((i3 & 896) == 256);
            Object objK = vt9Var.K();
            if (zH || objK == hh5.a) {
                objK = new eda(c61VarF, str, function02, (byte) 1);
                vt9Var.g0(objK);
            }
            Function0 function04 = (Function0) objK;
            if (1.0f <= 0.0d) {
                y7b.a("invalid weight; must be greater than zero");
            }
            yi4.a(function04, new g4c(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, gyg.e, vt9Var, 805306368, 508);
            vt9Var = vt9Var;
            vt9Var.p(true);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fda(str, function0, function02, i2, (byte) 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.hhe b0(int r31, int r32, byte[] r33) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qyn.b0(int, int, byte[]):hhe");
    }

    public static final void c(z0k z0kVar, Function0 function0, Function0 function02, ih5 ih5Var, int i2) {
        z0k z0kVar2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-533268122);
        int i3 = (vt9Var.f(z0kVar) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.h(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var.h(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            z7e z7eVar = z7e.b;
            c8e c8eVarX = a26.X(wxe.Q(z7eVar), 24.0f);
            byte b2 = 19;
            x62 x62Var = new x62(24.0f, true, new t40(b2));
            rd3 rd3Var = rbe.n;
            db5 db5VarA = cb5.a(x62Var, rd3Var, vt9Var, 6);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = P(vt9Var, c8eVarX);
            bh5.To.getClass();
            vt9Var.a0();
            boolean z = vt9Var.S;
            fza fzaVar = m3c.S;
            if (z) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            ah5 ah5Var = ujp.f;
            y4h.o(vt9Var, db5VarA, ah5Var);
            ah5 ah5Var2 = ujp.e;
            y4h.o(vt9Var, oagVarL, ah5Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            ah5 ah5Var3 = ujp.g;
            y4h.o(vt9Var, numValueOf, ah5Var3);
            y4h.m(vt9Var);
            ah5 ah5Var4 = ujp.d;
            y4h.o(vt9Var, c8eVarP, ah5Var4);
            int i4 = i3;
            x62 x62Var2 = new x62(24.0f, true, new t40(b2));
            sd3 sd3Var = rbe.k;
            o9i o9iVarA = m9i.a(x62Var2, sd3Var, vt9Var, 6);
            int iHashCode2 = Long.hashCode(vt9Var.T);
            oag oagVarL2 = vt9Var.l();
            c8e c8eVarP2 = P(vt9Var, z7eVar);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA, ah5Var);
            y4h.o(vt9Var, oagVarL2, ah5Var2);
            u35.j(iHashCode2, vt9Var, ah5Var3, vt9Var);
            y4h.o(vt9Var, c8eVarP2, ah5Var4);
            hn9.a(z0kVar.b.g, z0kVar.a, x1p.j(mpj.h(lcp.j(z7eVar, 1.0f, ((sa5) vt9Var.j(ua5.a)).B, v8i.a(8.0f)), 48.0f), v8i.a(8.0f)), null, jr5.a, null, vt9Var, 1572864, 1976);
            db5 db5VarA2 = cb5.a(new x62(12.0f, true, new t40((byte) 19)), rd3Var, vt9Var, 6);
            int iHashCode3 = Long.hashCode(vt9Var.T);
            oag oagVarL3 = vt9Var.l();
            c8e c8eVarP3 = P(vt9Var, z7eVar);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, db5VarA2, ah5Var);
            y4h.o(vt9Var, oagVarL3, ah5Var2);
            u35.j(iHashCode3, vt9Var, ah5Var3, vt9Var);
            y4h.o(vt9Var, c8eVarP3, ah5Var4);
            z0kVar2 = z0kVar;
            String str = z0kVar2.a;
            hp7 hp7Var = abm.a;
            ijl.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).f, vt9Var, 0, 0, 131070);
            ijl.b(uyg.r((shk) dhk.f.getValue(), new Object[]{Long.valueOf(z0kVar2.d)}, vt9Var), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).k, vt9Var, 0, 0, 131070);
            o9i o9iVarA2 = m9i.a(b72.a, rbe.l, vt9Var, 48);
            int iHashCode4 = Long.hashCode(vt9Var.T);
            oag oagVarL4 = vt9Var.l();
            c8e c8eVarP4 = P(vt9Var, z7eVar);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA2, ah5Var);
            y4h.o(vt9Var, oagVarL4, ah5Var2);
            u35.j(iHashCode4, vt9Var, ah5Var3, vt9Var);
            y4h.o(vt9Var, c8eVarP4, ah5Var4);
            ijl.b(uyg.q((shk) dhk.F.getValue(), vt9Var), new g4c(1.0f, false), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).l, vt9Var, 0, 0, 131068);
            ocp.c(vt9Var, mpj.l(z7eVar, 8.0f));
            xf8.j(iza.a((dl7) tk7.u.getValue(), vt9Var), "points", mpj.h(z7eVar, 14.0f), null, null, 0.0f, null, vt9Var, 440, 120);
            ocp.c(vt9Var, mpj.l(z7eVar, 4.0f));
            ijl.b(String.valueOf(z0kVar2.c), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).n, vt9Var, 0, 0, 131070);
            vt9Var.p(true);
            vt9Var.p(true);
            vt9Var.p(true);
            kga kgaVar = new kga(rbe.p);
            o9i o9iVarA3 = m9i.a(new x62(8.0f, true, new t40((byte) 19)), sd3Var, vt9Var, 6);
            int iHashCode5 = Long.hashCode(vt9Var.T);
            oag oagVarL5 = vt9Var.l();
            c8e c8eVarP5 = P(vt9Var, kgaVar);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA3, ah5Var);
            y4h.o(vt9Var, oagVarL5, ah5Var2);
            u35.j(iHashCode5, vt9Var, ah5Var3, vt9Var);
            y4h.o(vt9Var, c8eVarP5, ah5Var4);
            yi4.k(function0, (c8e) null, false, (paj) null, (z14) null, (zvf) null, gyg.b, vt9Var, ((i4 >> 3) & 14) | 805306368, 510);
            yi4.a(function02, (c8e) null, false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, gyg.c, vt9Var, ((i4 >> 6) & 14) | 805306368, 510);
            vt9Var = vt9Var;
            vt9Var.p(true);
            vt9Var.p(true);
        } else {
            z0kVar2 = z0kVar;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new j51(z0kVar2, function0, function02, i2, (byte) 5);
        }
    }

    public static wxd c0(MappedByteBuffer mappedByteBuffer) {
        ByteBuffer byteBuffer;
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        xxd xxdVar = new xxd(byteBufferDuplicate);
        int i2 = 4;
        xxdVar.b(4);
        int i3 = byteBufferDuplicate.getShort() & 65535;
        if (i3 > 100) {
            s49.m("Cannot read metadata.");
            return null;
        }
        xxdVar.b(6);
        int i4 = 0;
        while (true) {
            byteBuffer = xxdVar.a;
            if (i4 >= i3) {
                j = -1;
                break;
            }
            int i5 = byteBufferDuplicate.getInt();
            xxdVar.b(i2);
            j = byteBuffer.getInt() & 4294967295L;
            xxdVar.b(i2);
            if (1835365473 == i5) {
                break;
            }
            i4++;
            i2 = 4;
        }
        if (j != -1) {
            xxdVar.b((int) (j - byteBufferDuplicate.position()));
            xxdVar.b(12);
            long j2 = byteBuffer.getInt() & 4294967295L;
            for (int i6 = 0; i6 < j2; i6++) {
                int i7 = byteBufferDuplicate.getInt();
                long j3 = byteBuffer.getInt() & 4294967295L;
                byteBuffer.getInt();
                if (1164798569 == i7 || 1701669481 == i7) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    wxd wxdVar = new wxd();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    ((t9d) wxdVar).d = byteBufferDuplicate;
                    ((t9d) wxdVar).a = iPosition;
                    int i8 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    ((t9d) wxdVar).b = i8;
                    ((t9d) wxdVar).c = ((ByteBuffer) ((t9d) wxdVar).d).getShort(i8);
                    return wxdVar;
                }
            }
        }
        s49.m("Cannot read metadata.");
        return null;
    }

    public static final void d(a1k a1kVar, Function0 function0, Function0 function02, Function0 function03, Function0 function04, ih5 ih5Var, int i2) {
        vt9 vt9Var;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(537736538);
        int i3 = (vt9Var2.f(a1kVar) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= vt9Var2.h(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var2.h(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= vt9Var2.h(function03) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= vt9Var2.h(function04) ? 16384 : 8192;
        }
        if (vt9Var2.N(i3 & 1, (i3 & 9363) != 9362)) {
            vt9Var = vt9Var2;
            i7e.a(function0, null, i7e.f(null, vt9Var2, 0, 3), 0.0f, false, null, 0L, 0L, 0L, null, null, null, gyg.P(-4897096, new aek(a1kVar, function0, function02, function03, function04, (byte) 5), vt9Var2), vt9Var, (i3 >> 3) & 14, 7162);
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new wy5(a1kVar, function0, function02, function03, function04, i2, (byte) 3);
        }
    }

    public static final int d0(int i2) {
        return (((-16777216) & i2) >>> 24) | ((16711680 & i2) >>> 8) | ((65280 & i2) << 8) | ((i2 & 255) << 24);
    }

    public static final String[] e(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str.length() > 0) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final long e0(long j) {
        return (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40) | ((j & 255) << 56);
    }

    public static final boolean f(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static long f0(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j < 0) & (j2 == Long.MIN_VALUE)))) {
            long j4 = j * j2;
            if (j == 0 || j4 / j == j2) {
                return j4;
            }
        }
        return j3;
    }

    public static void g(String str, boolean z) {
        if (z) {
            return;
        }
        qp2.o(str);
    }

    public static void g0(bq4 bq4Var) {
        int iM = bq4Var.m() + 1;
        bq4Var.t(8);
        for (int i2 = 0; i2 < iM; i2++) {
            bq4Var.m();
            bq4Var.m();
            bq4Var.s();
        }
        bq4Var.t(20);
    }

    public static final void h(WorkDatabase workDatabase, jl5 jl5Var, r4o r4oVar) {
        int i2;
        ArrayList arrayListJ = j95.j(new r4o[]{r4oVar});
        int i3 = 0;
        while (!arrayListJ.isEmpty()) {
            List list = ((r4o) o95.x(arrayListJ)).c;
            if ((list instanceof Collection) && list.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it = list.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    if (!((off) it.next()).b.j.i.isEmpty() && (i2 = i2 + 1) < 0) {
                        j95.m();
                        throw null;
                    }
                }
            }
            i3 += i2;
        }
        if (i3 != 0) {
            i5o i5oVarC = workDatabase.C();
            i5oVarC.getClass();
            TreeMap treeMap = e6i.i;
            e6i e6iVarE = aoh.e(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) i5oVarC.a;
            workDatabase_Impl.b();
            Cursor cursorS = workDatabase_Impl.s(e6iVarE);
            try {
                int i4 = cursorS.moveToFirst() ? cursorS.getInt(0) : 0;
                cursorS.close();
                e6iVarE.release();
                jl5Var.getClass();
                if (i4 + i3 <= 8) {
                    return;
                }
                qp2.o(fki.o(i4, i3, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: 8;\nalready enqueued count: ", ";\ncurrent enqueue operation count: ", ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
            } catch (Throwable th) {
                cursorS.close();
                e6iVarE.release();
                throw th;
            }
        }
    }

    public static List h0(Iterable iterable, Function1 function1) {
        return CollectionsKt.c0(new jk(function1, (byte) 3), iterable);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: xqb */
    public static final void i(rpb rpbVar, KSerializer kSerializer, KSerializer kSerializer2, String str) throws xqb {
        SerialDescriptor descriptor = kSerializer2.getDescriptor();
        lrb.d(rpbVar, descriptor);
        if (wxe.h(descriptor).contains(str)) {
            String strI = kSerializer.getDescriptor().i();
            String strI2 = kSerializer2.getDescriptor().i();
            throw new xqb(z1m.l(z1m.n("Class '", strI2, "' cannot be serialized ", (rpbVar.a.l == o15.b && Intrinsics.a(strI, strI2)) ? "in ALL_JSON_OBJECTS class discriminator mode" : am2.m('\'', "as base class '", strI), " because it has property name that conflicts with JSON class discriminator '"), str, "'."), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.", (Exception) null, 8);
        }
    }

    public static final Pair i0(String str, itb itbVar) {
        StringBuilder sb = new StringBuilder("in the polymorphic scope of '");
        s15 s15Var = (s15) itbVar;
        sb.append(s15Var.c());
        sb.append('\'');
        String string = sb.toString();
        if (str == null) {
            return new Pair("Class discriminator was missing and no default serializers were registered ".concat(string), (Object) null);
        }
        String strW = p3p.w("Serializer for subclass '", str, "' is not found ", string);
        StringBuilder sbN = z1m.n("Check if class with serial name '", str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
        sbN.append(s15Var.c());
        sbN.append("' has to be sealed and '@Serializable'.");
        return new Pair(strW, sbN.toString());
    }

    public static final void j(xvg xvgVar) {
        if (xvgVar instanceof g2j) {
            qp2.n("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (xvgVar instanceof xxg) {
            qp2.n("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (xvgVar instanceof nng) {
            qp2.n("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: xqb */
    public static final void j0(String str, b bVar) throws xqb {
        StringBuilder sbS = p3p.s("Class with serial name ", str, " cannot be serialized polymorphically because it is represented as ");
        sbS.append(uqh.a(bVar.getClass()).c());
        sbS.append('.');
        throw new xqb(sbS.toString(), "Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.", (Exception) null, 8);
    }

    public static void k(Object obj) {
        l(obj, "Argument must not be null");
    }

    public static final String k0(byte b2) {
        char[] cArr = i41.a;
        return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]});
    }

    public static void l(Object obj, String str) {
        if (obj != null) {
            return;
        }
        t3p.q(str);
    }

    public static final String l0(int i2) {
        if (i2 == 0) {
            return "0";
        }
        char[] cArr = i41.a;
        int i3 = 0;
        char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
        while (i3 < 8 && cArr2[i3] == '0') {
            i3++;
        }
        return c.h(cArr2, i3, 8);
    }

    public static final void m(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbQ = p3p.q(j, "size=", " offset=");
            sbQ.append(j2);
            sbQ.append(" byteCount=");
            sbQ.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbQ.toString());
        }
    }

    public static int m0(byte[] bArr, int i2) {
        int i3;
        synchronized (f) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 >= i2 - 2) {
                        i4 = i2;
                        break;
                    }
                    if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                        break;
                    }
                    i4++;
                }
                if (i4 < i2) {
                    int[] iArrCopyOf = g;
                    if (iArrCopyOf.length <= i5) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length << 1);
                        g = iArrCopyOf;
                    }
                    iArrCopyOf[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = g[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i10 + 2;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }

    public static final String n(rpb rpbVar, SerialDescriptor serialDescriptor) {
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof fqb) {
                return ((fqb) annotation).discriminator();
            }
        }
        return rpbVar.a.i;
    }

    public static Object n0(ud4 ud4Var, s15 s15Var) {
        if (ud4Var instanceof inm) {
            return ((inm) ud4Var).E(s15Var);
        }
        if (!(ud4Var instanceof xd4)) {
            return null;
        }
        xd4 xd4Var = (xd4) ud4Var;
        if (xd4Var.getImplementation() != ud4Var) {
            return n0(xd4Var.getImplementation(), s15Var);
        }
        return null;
    }

    public static void o(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static final int p(long j, long j2) {
        boolean zN = N(j);
        if (zN != N(j2)) {
            return zN ? -1 : 1;
        }
        return (Math.min(F(j), F(j2)) < 0.0f || M(j) == M(j2)) ? (int) Math.signum(F(j) - F(j2)) : M(j) ? -1 : 1;
    }

    public static c8e q(c8e c8eVar, cr9 cr9Var) {
        return c8eVar.d(new gh5(uup.d, cr9Var));
    }

    public static final Long r(fr6 fr6Var) {
        String strE = fr6Var.a().e("Content-Length");
        if (strE != null) {
            return StringsKt.k0(strE);
        }
        return null;
    }

    public static final tr5 s(yoa yoaVar) {
        String strE = yoaVar.a().e("Content-Type");
        if (strE == null) {
            return null;
        }
        tr5 tr5Var = tr5.e;
        return na2.I(strE);
    }

    public static final tr5 t(spa spaVar) {
        String strF = spaVar.c.f("Content-Type");
        if (strF == null) {
            return null;
        }
        tr5 tr5Var = tr5.e;
        return na2.I(strF);
    }

    public static Parcelable u(Parcelable parcelable, Parcelable.Creator creator) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } finally {
            parcelObtain.recycle();
        }
    }

    public static boolean v(Uri uri, Uri uri2) throws Throwable {
        ParcelFileDescriptor parcelFileDescriptor;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream;
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        ParcelFileDescriptor parcelFileDescriptorU;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        try {
            ParcelFileDescriptor parcelFileDescriptorU2 = U(uri, "r");
            try {
                autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorU2);
                try {
                    parcelFileDescriptorU = U(uri2, "wt");
                    try {
                        autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorU);
                        try {
                            xvg.n(autoCloseInputStream, autoCloseOutputStream);
                            autoCloseOutputStream.close();
                            xvg.l(autoCloseInputStream);
                            return true;
                        } catch (IOException | IllegalStateException unused) {
                            parcelFileDescriptorU = null;
                            try {
                                w(uri2);
                                xvg.l(parcelFileDescriptor2);
                                xvg.l(autoCloseInputStream);
                                xvg.l(parcelFileDescriptorU);
                                xvg.l(autoCloseOutputStream);
                                return false;
                            } catch (Throwable th) {
                                parcelFileDescriptor = parcelFileDescriptorU;
                                th = th;
                                xvg.l(parcelFileDescriptor2);
                                xvg.l(autoCloseInputStream);
                                xvg.l(parcelFileDescriptor);
                                xvg.l(autoCloseOutputStream);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            parcelFileDescriptor = null;
                            xvg.l(parcelFileDescriptor2);
                            xvg.l(autoCloseInputStream);
                            xvg.l(parcelFileDescriptor);
                            xvg.l(autoCloseOutputStream);
                            throw th;
                        }
                    } catch (IOException | IllegalStateException unused2) {
                        autoCloseOutputStream = null;
                    } catch (Throwable th3) {
                        parcelFileDescriptor = parcelFileDescriptorU;
                        th = th3;
                        autoCloseOutputStream = null;
                    }
                } catch (IOException | IllegalStateException unused3) {
                    parcelFileDescriptorU = null;
                    autoCloseOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    parcelFileDescriptor = null;
                    autoCloseOutputStream = null;
                }
            } catch (IOException | IllegalStateException unused4) {
                autoCloseInputStream = null;
                autoCloseOutputStream = null;
                parcelFileDescriptor2 = parcelFileDescriptorU2;
                parcelFileDescriptorU = null;
            } catch (Throwable th5) {
                autoCloseInputStream = null;
                autoCloseOutputStream = null;
                parcelFileDescriptor2 = parcelFileDescriptorU2;
                th = th5;
                parcelFileDescriptor = null;
            }
        } catch (IOException | IllegalStateException unused5) {
            parcelFileDescriptorU = null;
            autoCloseInputStream = null;
            autoCloseOutputStream = null;
        } catch (Throwable th6) {
            th = th6;
            parcelFileDescriptor = null;
            autoCloseInputStream = null;
            autoCloseOutputStream = null;
        }
    }

    public static void w(Uri uri) throws FileNotFoundException {
        Context context = t8.a;
        if ("file".equals(uri.getScheme())) {
            new File(uri.getPath()).delete();
        } else {
            try {
                DocumentsContract.deleteDocument(context.getContentResolver(), uri);
            } catch (FileNotFoundException | IllegalStateException unused) {
            }
        }
    }

    public static void x(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            kd5 kd5Var = (kd5) obj;
            j76 j76Var = new j76(kd5Var);
            for (qfh qfhVar : kd5Var.b) {
                boolean z = kd5Var.e;
                k76 k76Var = new k76(qfhVar, z);
                if (!map.containsKey(k76Var)) {
                    map.put(k76Var, new HashSet());
                }
                Set set = (Set) map.get(k76Var);
                if (!set.isEmpty() && !z) {
                    j9h.v(qfhVar, ".", "Multiple components provide ");
                    return;
                }
                set.add(j76Var);
            }
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            for (j76 j76Var2 : (Set) it.next()) {
                for (y27 y27Var : j76Var2.a.c) {
                    if (!y27Var.c) {
                        Set<j76> set2 = (Set) map.get(new k76(y27Var.a, y27Var.b == 2));
                        if (set2 != null) {
                            for (j76 j76Var3 : set2) {
                                j76Var2.b.add(j76Var3);
                                j76Var3.c.add(j76Var2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            j76 j76Var4 = (j76) it3.next();
            if (j76Var4.c.isEmpty()) {
                hashSet2.add(j76Var4);
            }
        }
        while (!hashSet2.isEmpty()) {
            j76 j76Var5 = (j76) hashSet2.iterator().next();
            hashSet2.remove(j76Var5);
            i2++;
            Iterator it4 = j76Var5.b.iterator();
            while (it4.hasNext()) {
                j76 j76Var6 = (j76) it4.next();
                j76Var6.c.remove(j76Var5);
                if (j76Var6.c.isEmpty()) {
                    hashSet2.add(j76Var6);
                }
            }
        }
        if (i2 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            j76 j76Var7 = (j76) it5.next();
            if (!j76Var7.c.isEmpty() && !j76Var7.b.isEmpty()) {
                arrayList2.add(j76Var7.a);
            }
        }
        throw new a37("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long y(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i2 = ((int) ((j ^ j2) >> 63)) | 1;
        switch (s0d.a[roundingMode.ordinal()]) {
            case 1:
                zi4.p(j4 == 0);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i2 >= 0) {
                    return j3;
                }
                return j3 + i2;
            case 4:
                return j3 + i2;
            case 5:
                if (i2 <= 0) {
                    return j3;
                }
                return j3 + i2;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j4);
                long jAbs2 = jAbs - (Math.abs(j2) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (jAbs2 <= 0) {
                    return j3;
                }
                return j3 + i2;
            default:
                t40.h();
                return 0L;
        }
    }

    public static final String z(String str) {
        if (str == null || str.length() != 0) {
            return str;
        }
        return null;
    }

    public abstract void S(int i2);

    public abstract void T(Typeface typeface);
}
