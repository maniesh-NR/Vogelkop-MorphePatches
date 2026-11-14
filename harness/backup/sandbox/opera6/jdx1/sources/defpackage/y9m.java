package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.GoogleApiAvailability;
import java.io.IOException;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class y9m {
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final ue5 e = new ue5(1037699551, new lf5((byte) 8), false);
    public static final gd7 f = new gd7("NO_OWNER", 4);
    public static final byte[] g = {48, 49, 53, 0};
    public static final byte[] h = {48, 49, 48, 0};
    public static final byte[] i = {48, 48, 57, 0};
    public static final byte[] j = {48, 48, 53, 0};
    public static final byte[] k = {48, 48, 49, 0};
    public static final byte[] l = {48, 48, 49, 0};
    public static final byte[] m = {48, 48, 50, 0};
    public static final Object n = new Object();
    public static final eko o = new eko(2);
    public static yza p;

    public static int A(zmi zmiVar, int i2, byte[] bArr, int i3, int i4, efb efbVar, f72 f72Var) throws ajb {
        Object objNewInstance = zmiVar.newInstance();
        zmi zmiVar2 = zmiVar;
        byte[] bArr2 = bArr;
        int i5 = i4;
        f72 f72Var2 = f72Var;
        int iY = Y(objNewInstance, zmiVar2, bArr2, i3, i5, f72Var2);
        zmiVar2.makeImmutable(objNewInstance);
        f72Var2.c = objNewInstance;
        efbVar.add(objNewInstance);
        while (iY < i5) {
            f72 f72Var3 = f72Var2;
            int i6 = i5;
            int iD = D(bArr2, iY, f72Var3);
            if (i2 != f72Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            zmi zmiVar3 = zmiVar2;
            Object objNewInstance2 = zmiVar3.newInstance();
            iY = Y(objNewInstance2, zmiVar3, bArr3, iD, i6, f72Var3);
            zmiVar2 = zmiVar3;
            bArr2 = bArr3;
            i5 = i6;
            f72Var2 = f72Var3;
            zmiVar2.makeImmutable(objNewInstance2);
            f72Var2.c = objNewInstance2;
            efbVar.add(objNewInstance2);
        }
        return iY;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ajb */
    public static int B(int i2, byte[] bArr, int i3, int i4, cmm cmmVar, f72 f72Var) throws ajb {
        if ((i2 >>> 3) == 0) {
            throw new ajb("Protocol message contained an invalid tag (zero).");
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int iF = F(bArr, i3, f72Var);
            cmmVar.d(i2, Long.valueOf(f72Var.b));
            return iF;
        }
        if (i5 == 1) {
            cmmVar.d(i2, Long.valueOf(z(bArr, i3)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int iD = D(bArr, i3, f72Var);
            int i6 = f72Var.a;
            if (i6 < 0) {
                throw ajb.h();
            }
            if (i6 > bArr.length - iD) {
                throw ajb.j();
            }
            if (i6 == 0) {
                cmmVar.d(i2, e54.b);
            } else {
                cmmVar.d(i2, e54.h(iD, i6, bArr));
            }
            return iD + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw new ajb("Protocol message contained an invalid tag (zero).");
            }
            cmmVar.d(i2, Integer.valueOf(y(bArr, i3)));
            return i3 + 4;
        }
        cmm cmmVarC = cmm.c();
        int i7 = (i2 & (-8)) | 4;
        int i8 = f72Var.d + 1;
        f72Var.d = i8;
        if (i8 >= 100) {
            throw new ajb("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i9 = 0;
        while (true) {
            if (i3 >= i4) {
                break;
            }
            int iD2 = D(bArr, i3, f72Var);
            int i10 = f72Var.a;
            if (i10 == i7) {
                i9 = i10;
                i3 = iD2;
                break;
            }
            i3 = B(i10, bArr, iD2, i4, cmmVarC, f72Var);
            i9 = i10;
        }
        f72Var.d--;
        if (i3 > i4 || i9 != i7) {
            throw ajb.i();
        }
        cmmVar.d(i2, cmmVarC);
        return i3;
    }

    public static int C(int i2, byte[] bArr, int i3, f72 f72Var) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            f72Var.a = i4 | (b2 << 7);
            return i5;
        }
        int i6 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            f72Var.a = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & Byte.MAX_VALUE) << 14);
        int i9 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            f72Var.a = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & Byte.MAX_VALUE) << 21);
        int i11 = i3 + 4;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            f72Var.a = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                f72Var.a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static int D(byte[] bArr, int i2, f72 f72Var) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return C(b2, bArr, i3, f72Var);
        }
        f72Var.a = b2;
        return i3;
    }

    public static int E(int i2, byte[] bArr, int i3, int i4, efb efbVar, f72 f72Var) {
        mbb mbbVar = (mbb) efbVar;
        int iD = D(bArr, i3, f72Var);
        mbbVar.addInt(f72Var.a);
        while (iD < i4) {
            int iD2 = D(bArr, iD, f72Var);
            if (i2 != f72Var.a) {
                break;
            }
            iD = D(bArr, iD2, f72Var);
            mbbVar.addInt(f72Var.a);
        }
        return iD;
    }

    public static int F(byte[] bArr, int i2, f72 f72Var) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            f72Var.b = j2;
            return i3;
        }
        int i4 = i2 + 2;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            i5 += 7;
            j3 |= (r10 & Byte.MAX_VALUE) << i5;
            b2 = bArr[i4];
            i4 = i6;
        }
        f72Var.b = j3;
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean G(double r10) {
        /*
            long r0 = java.lang.Double.doubleToRawLongBits(r10)
            r2 = -9223372036854775808
            long r4 = r0 & r2
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r8 = 1
            if (r4 != 0) goto L1f
            double[][] r2 = wp8.a
            r2 = 63
            long r2 = r0 >>> r2
            long r4 = ~r2
            long r4 = r4 + r8
            long r0 = r0 ^ r4
            long r0 = r0 + r2
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 > 0) goto L35
            goto L2f
        L1f:
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 >= 0) goto L26
            long r2 = r0 - r2
            r0 = r6
        L26:
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 > 0) goto L35
            long r8 = r8 - r0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 > 0) goto L35
        L2f:
            boolean r0 = java.lang.Double.isNaN(r10)
            if (r0 == 0) goto L45
        L35:
            r0 = 0
            double r0 = r0 - r10
            double r10 = wp8.a(r0)
            r0 = 3859002664735258655(0x358dee7a4ad4b81f, double:1.0E-50)
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L47
        L45:
            r10 = 1
            return r10
        L47:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y9m.G(double):boolean");
    }

    public static final int H(int i2, View view) {
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i2);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i4 = i3;
            }
            i3++;
            Object objH = y7h.h(view);
            view = objH instanceof View ? (View) objH : null;
        }
        return i4;
    }

    public static final View I(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(H(2131365017, view), H(2131365020, view));
        View view2 = view;
        int i2 = 0;
        View view3 = view2;
        while (view != null) {
            if (i2 == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (L(view) == null) {
                i2++;
                Object objH = y7h.h(view);
                View view4 = view2;
                view2 = view;
                view = objH instanceof View ? (View) objH : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final boolean J(vg9 vg9Var, yo7 yo7Var) {
        int iOrdinal = vg9Var.Y0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                vg9 vg9VarV = gyg.v(vg9Var);
                if (vg9VarV != null) {
                    return J(vg9VarV, yo7Var) || K(vg9Var, vg9VarV, 1, yo7Var);
                }
                qp2.n("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return vg9Var.V0().a ? ((Boolean) yo7Var.invoke(vg9Var)).booleanValue() : e0(vg9Var, yo7Var);
                }
                h9o.p();
                return false;
            }
        }
        return e0(vg9Var, yo7Var);
    }

    public static final boolean K(vg9 vg9Var, vg9 vg9Var2, int i2, yo7 yo7Var) {
        if (g0(vg9Var, vg9Var2, i2, yo7Var)) {
            return true;
        }
        Boolean bool = (Boolean) wxe.X(vg9Var, i2, new jff(ui6.f0(vg9Var).l.f(), vg9Var, vg9Var2, i2, yo7Var, (byte) 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final fh5 L(View view) {
        Object tag = view.getTag(2131362029);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (fh5) weakReference.get();
        }
        return null;
    }

    public static final boolean M(ikl iklVar) {
        pgg pggVar;
        dhg dhgVar = iklVar.c;
        ez7 ez7Var = (dhgVar == null || (pggVar = dhgVar.b) == null) ? null : new ez7(pggVar.b);
        boolean z = false;
        if (ez7Var != null && ez7Var.a == 1) {
            z = true;
        }
        return !z;
    }

    public static final yza N() {
        yza yzaVar = p;
        if (yzaVar != null) {
            return yzaVar;
        }
        xza xzaVar = new xza("Outlined.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        l08 l08Var = u0n.a;
        nvj nvjVar = new nvj(u95.b);
        np4 np4Var = new np4();
        np4Var.h(11.0f, 7.0f);
        np4Var.e(2.0f);
        t7g t7gVar = new t7g(2.0f);
        ArrayList arrayList = np4Var.a;
        arrayList.add(t7gVar);
        np4Var.e(-2.0f);
        np4Var.a();
        np4Var.h(11.0f, 11.0f);
        np4Var.e(2.0f);
        arrayList.add(new t7g(6.0f));
        np4Var.e(-2.0f);
        np4Var.a();
        np4Var.h(12.0f, 2.0f);
        np4Var.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        np4Var.i(4.48f, 10.0f, 10.0f, 10.0f);
        np4Var.i(10.0f, -4.48f, 10.0f, -10.0f);
        arrayList.add(new j7g(17.52f, 2.0f, 12.0f, 2.0f));
        np4Var.a();
        np4Var.h(12.0f, 20.0f);
        np4Var.c(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        np4Var.i(3.59f, -8.0f, 8.0f, -8.0f);
        np4Var.i(8.0f, 3.59f, 8.0f, 8.0f);
        np4Var.i(-3.59f, 8.0f, -8.0f, 8.0f);
        np4Var.a();
        xza.d(xzaVar, arrayList, nvjVar);
        yza yzaVarE = xzaVar.e();
        p = yzaVarE;
        return yzaVarE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int O(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y9m.O(java.lang.String):int");
    }

    public static int P(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static int Q(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        if (f5 <= 0.008856452f) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float f6 = f5;
        float[] fArr = c;
        return ab5.c(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static boolean R(int i2, Object obj) {
        if (obj instanceof br9) {
            if ((obj instanceof lr9 ? ((lr9) obj).getArity() : obj instanceof Function0 ? 0 : obj instanceof Function1 ? 1 : obj instanceof Function2 ? 2 : obj instanceof cr9 ? 3 : obj instanceof dr9 ? 4 : obj instanceof er9 ? 5 : obj instanceof fr9 ? 6 : obj instanceof gr9 ? 7 : obj instanceof hr9 ? 8 : obj instanceof ir9 ? 9 : obj instanceof nq9 ? 10 : obj instanceof oq9 ? 11 : obj instanceof qq9 ? 13 : obj instanceof rq9 ? 14 : obj instanceof sq9 ? 15 : obj instanceof tq9 ? 16 : obj instanceof uq9 ? 17 : obj instanceof vq9 ? 18 : obj instanceof wq9 ? 19 : obj instanceof yq9 ? 20 : obj instanceof zq9 ? 21 : -1) == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean S(Context context) {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context, 20415000) == 0;
    }

    public static boolean T(Object obj) {
        if (obj instanceof Map.Entry) {
            return !(obj instanceof ptb) || (obj instanceof stb);
        }
        return false;
    }

    public static float U(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static int V(int i2, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{W(i2)});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int W(int i2) {
        switch (vep.A(vep.B(11)[i2])) {
            case 1:
                return 2130970521;
            case 2:
                return 2130970522;
            case 3:
                return 2130970523;
            case 4:
                return 2130970524;
            case 5:
                return 2130970525;
            case 6:
                return 2130970526;
            case 7:
                return 2130970527;
            case 8:
                return 2130970528;
            case 9:
                return 2130970529;
            case 10:
                return 2130970530;
            default:
                return 0;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ajb */
    public static int X(Object obj, zmi zmiVar, byte[] bArr, int i2, int i3, int i4, f72 f72Var) throws ajb {
        pwd pwdVar = (pwd) zmiVar;
        int i5 = f72Var.d + 1;
        f72Var.d = i5;
        if (i5 >= 100) {
            throw new ajb("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iZ = pwdVar.z(obj, bArr, i2, i3, i4, f72Var);
        f72Var.d--;
        f72Var.c = obj;
        return iZ;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ajb */
    public static int Y(Object obj, zmi zmiVar, byte[] bArr, int i2, int i3, f72 f72Var) throws ajb {
        int iC = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iC = C(i4, bArr, iC, f72Var);
            i4 = f72Var.a;
        }
        int i5 = iC;
        if (i4 < 0 || i4 > i3 - i5) {
            throw ajb.j();
        }
        int i6 = f72Var.d + 1;
        f72Var.d = i6;
        if (i6 >= 100) {
            throw new ajb("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i7 = i5 + i4;
        zmiVar.f(obj, bArr, i5, i7, f72Var);
        f72Var.d--;
        f72Var.c = obj;
        return i7;
    }

    public static final List Z(String str) {
        int i2;
        Pair pair;
        Pair pair2;
        if (str == null) {
            return l08.a;
        }
        l4c l4cVarA = z4c.a(f7c.c, new be8((byte) 19));
        for (int i3 = 0; i3 <= str.length() - 1; i3 = i2) {
            l4c l4cVarA2 = z4c.a(f7c.c, new be8((byte) 20));
            Integer numValueOf = null;
            i2 = i3;
            while (true) {
                if (i2 <= str.length() - 1) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt == ',') {
                        ((ArrayList) l4cVarA.getValue()).add(new x8a(StringsKt.l0(str.substring(i3, numValueOf != null ? numValueOf.intValue() : i2)).toString(), l4cVarA2.isInitialized() ? (List) l4cVarA2.getValue() : l08.a));
                        i2++;
                    } else if (cCharAt != ';') {
                        i2++;
                    } else {
                        if (numValueOf == null) {
                            numValueOf = Integer.valueOf(i2);
                        }
                        int i4 = i2 + 1;
                        int i5 = i4;
                        while (i5 <= StringsKt.J(str)) {
                            char cCharAt2 = str.charAt(i5);
                            if (cCharAt2 == ',' || cCharAt2 == ';') {
                                a0(l4cVarA2, str, i4, i5, "");
                                break;
                            }
                            if (cCharAt2 != '=') {
                                i5++;
                            } else {
                                int i6 = i5 + 1;
                                if (str.length() == i6) {
                                    pair2 = new Pair(Integer.valueOf(i6), "");
                                } else {
                                    char c2 = '\"';
                                    if (str.charAt(i6) == '\"') {
                                        int i7 = i5 + 2;
                                        StringBuilder sb = new StringBuilder();
                                        while (i7 <= str.length() - 1) {
                                            char cCharAt3 = str.charAt(i7);
                                            if (cCharAt3 == c2) {
                                                int i8 = i7 + 1;
                                                int i9 = i8;
                                                while (i9 < str.length() && str.charAt(i9) == ' ') {
                                                    i9++;
                                                }
                                                if (i9 == str.length() || str.charAt(i9) == ';' || str.charAt(i9) == ',') {
                                                    pair = new Pair(Integer.valueOf(i8), sb.toString());
                                                    break;
                                                }
                                            }
                                            if (cCharAt3 != '\\' || i7 >= str.length() - 3) {
                                                sb.append(cCharAt3);
                                                i7++;
                                            } else {
                                                sb.append(str.charAt(i7 + 1));
                                                i7 += 2;
                                            }
                                            c2 = '\"';
                                        }
                                        pair = new Pair(Integer.valueOf(i7), "\"".concat(sb.toString()));
                                    } else {
                                        int i10 = i6;
                                        while (i10 <= str.length() - 1) {
                                            char cCharAt4 = str.charAt(i10);
                                            if (cCharAt4 == ',' || cCharAt4 == ';') {
                                                pair = new Pair(Integer.valueOf(i10), StringsKt.l0(str.substring(i6, i10)).toString());
                                                break;
                                            }
                                            i10++;
                                        }
                                        pair = new Pair(Integer.valueOf(i10), StringsKt.l0(str.substring(i6, i10)).toString());
                                    }
                                    pair2 = pair;
                                }
                                int iIntValue = ((Number) pair2.a).intValue();
                                a0(l4cVarA2, str, i4, i5, (String) pair2.b);
                                i2 = iIntValue;
                            }
                        }
                        a0(l4cVarA2, str, i4, i5, "");
                        i2 = i5;
                    }
                } else {
                    ((ArrayList) l4cVarA.getValue()).add(new x8a(StringsKt.l0(str.substring(i3, numValueOf != null ? numValueOf.intValue() : i2)).toString(), l4cVarA2.isInitialized() ? (List) l4cVarA2.getValue() : l08.a));
                }
            }
        }
        return l4cVarA.isInitialized() ? (List) l4cVarA.getValue() : l08.a;
    }

    public static final void a(n01 n01Var, c8e c8eVar, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(2118663378);
        int i3 = (vt9Var.f(n01Var) ? 4 : 2) | i2;
        if (vt9Var.N(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 14) == 4;
            Object objK = vt9Var.K();
            if (z || objK == hh5.a) {
                String strB = qyn.B(n01Var);
                Character chValueOf = strB.length() == 0 ? null : Character.valueOf(strB.charAt(0));
                if (chValueOf != null && Character.isDigit(chValueOf.charValue())) {
                    strB = "+".concat(strB);
                }
                objK = strB;
                vt9Var.g0(objK);
            }
            String str = (String) objK;
            o9i o9iVarA = m9i.a(new x62(8.0f, true, new t40((byte) 19)), rbe.l, vt9Var, 54);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVar);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            xf8.j(iza.a(k1g.A(n01Var.a), vt9Var), "Reward", mpj.h(z7e.b, 16.0f), null, null, 0.0f, null, vt9Var, 440, 120);
            ijl.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, ((wam) vt9Var.j(abm.a)).j, vt9Var, 0, 24576, 114686);
            vt9Var = vt9Var;
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new hda(n01Var, c8eVar, i2, (byte) 0);
        }
    }

    public static final void a0(l4c l4cVar, String str, int i2, int i3, String str2) {
        String string = StringsKt.l0(str.substring(i2, i3)).toString();
        if (string.length() == 0) {
            return;
        }
        ((ArrayList) l4cVar.getValue()).add(new y8a(string, str2));
    }

    public static final void b(int i2, ih5 ih5Var, int i3) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1661545415);
        int i4 = (vt9Var.d(i2) ? 4 : 2) | i3;
        if (vt9Var.N(i4 & 1, (i4 & 3) != 2)) {
            o9i o9iVarA = m9i.a(new x62(4.0f, true, new t40((byte) 19)), rbe.l, vt9Var, 54);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, z7e.b);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            wta.b(iza.a((dl7) tk7.a.getValue(), vt9Var), "Boost icon", null, ((sa5) vt9Var.j(ua5.a)).a, vt9Var, 56, 4);
            ijl.b(u35.g(i2, "x"), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(abm.a)).j, vt9Var, 0, 0, 131070);
            vt9Var = vt9Var;
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new gda(i2, i3, (byte) 0);
        }
    }

    public static pqb b0(dsb dsbVar) {
        int i2 = dsbVar.o;
        if (i2 == 2) {
            dsbVar.o = 1;
        }
        try {
            try {
                return zwg.n(dsbVar);
            } catch (OutOfMemoryError | StackOverflowError e2) {
                throw new srb("Failed parsing JSON source: " + dsbVar + " to Json", e2);
            }
        } finally {
            dsbVar.b0(i2);
        }
    }

    public static final void c(Function0 function0, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1440495885);
        int i3 = (vt9Var.h(function0) ? 4 : 2) | i2;
        if (vt9Var.N(i3 & 1, (i3 & 3) != 2)) {
            zvf zvfVar = b24.a;
            hp7 hp7Var = ua5.a;
            long j2 = ((sa5) vt9Var.j(hp7Var)).a;
            long j3 = u95.g;
            yi4.i(function0, (c8e) null, false, (paj) null, b24.e((sa5) vt9Var.j(hp7Var)).a(j3, j2, j3, j3), (go3) null, (zvf) null, zi4.g, vt9Var, (i3 & 14) | 805306368, 494);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new is1(function0, i2, (byte) 5);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: arb */
    /* JADX INFO: Thrown type has an unknown type hierarchy: ksb */
    public static pqb c0(String str) throws arb, ksb {
        try {
            dsb dsbVar = new dsb(new StringReader(str));
            pqb pqbVarB0 = b0(dsbVar);
            pqbVarB0.getClass();
            if ((pqbVarB0 instanceof mrb) || dsbVar.W() == 10) {
                return pqbVarB0;
            }
            throw new ksb("Did not consume the entire document.");
        } catch (IOException e2) {
            throw new arb(e2);
        } catch (b8d | NumberFormatException e3) {
            throw new ksb(e3);
        }
    }

    public static final void d(final ad2 ad2Var, final zca zcaVar, final Function1 function1, final boolean z, final boolean z2, final Function0 function0, final Function1 function12, final Function0 function02, final fum fumVar, final Function0 function03, final Function1 function13, final gca gcaVar, final Function0 function04, final Function0 function05, final sek sekVar, final Function0 function06, final hz5 hz5Var, final Function0 function07, final Function0 function08, final Function0 function09, final Function1 function14, c8e c8eVar, ih5 ih5Var, final int i2, final int i3, final int i4, final int i5) {
        Function1 function15;
        boolean z3;
        boolean z4;
        int i6;
        int i7;
        vt9 vt9Var;
        final c8e c8eVar2;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(1804770467);
        int i8 = ((i2 & 8) == 0 ? vt9Var2.f(ad2Var) : vt9Var2.h(ad2Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i8 |= vt9Var2.d(zcaVar.ordinal()) ? 32 : 16;
        }
        int i9 = i2 & 384;
        int i10 = NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i9 == 0) {
            function15 = function1;
            i8 |= vt9Var2.h(function15) ? 256 : 128;
        } else {
            function15 = function1;
        }
        if ((i2 & 3072) == 0) {
            z3 = z;
            i8 |= vt9Var2.g(z3) ? 2048 : 1024;
        } else {
            z3 = z;
        }
        if ((i2 & 24576) == 0) {
            z4 = z2;
            i8 |= vt9Var2.g(z4) ? 16384 : 8192;
        } else {
            z4 = z2;
        }
        if ((i2 & 196608) == 0) {
            i8 |= vt9Var2.h(function0) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i8 |= vt9Var2.h(function12) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i8 |= vt9Var2.h(function02) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i8 |= vt9Var2.f(fumVar) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i8 |= vt9Var2.h(function03) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (vt9Var2.h(function13) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= vt9Var2.f(gcaVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            if (vt9Var2.h(function04)) {
                i10 = 256;
            }
            i6 |= i10;
        }
        if ((i3 & 3072) == 0) {
            i6 |= vt9Var2.h(function05) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 |= vt9Var2.f(sekVar) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i6 |= vt9Var2.h(function06) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i6 |= (i3 & 2097152) == 0 ? vt9Var2.f(hz5Var) : vt9Var2.h(hz5Var) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i6 |= vt9Var2.h(function07) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i6 |= vt9Var2.h(function08) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i6 |= vt9Var2.h(function09) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i7 = i4 | (vt9Var2.h(function14) ? 4 : 2);
        } else {
            i7 = i4;
        }
        int i11 = i5 & 2097152;
        if (i11 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            i7 |= vt9Var2.f(c8eVar) ? 32 : 16;
        }
        int i12 = i7;
        if (vt9Var2.N(i8 & 1, ((i8 & 306783379) == 306783378 && (i6 & 306783379) == 306783378 && (i12 & 19) == 18) ? false : true)) {
            c8e c8eVar3 = i11 != 0 ? z7e.b : c8eVar;
            boolean z5 = (1879048192 & i8) == 536870912;
            Object objK = vt9Var2.K();
            if (z5 || objK == hh5.a) {
                objK = new p01(function03, (byte) 5);
                vt9Var2.g0(objK);
            }
            final boolean z6 = z3;
            final boolean z7 = z4;
            final Function1 function16 = function15;
            w1h.a(c8eVar3, gyg.P(1275903071, new is1(function02, (byte) 3), vt9Var2), null, gyg.P(-1389695331, new z47(coh.g(fumVar, (Function1) objK, vt9Var2, (i8 >> 24) & 14), (byte) 1), vt9Var2), null, 0, 0L, 0L, null, gyg.P(-326982668, new cr9() { // from class: ida
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    xvf xvfVar = (xvf) obj;
                    ih5 ih5Var2 = (ih5) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((vt9) ih5Var2).f(xvfVar) ? 4 : 2;
                    }
                    vt9 vt9Var3 = (vt9) ih5Var2;
                    if (vt9Var3.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                        y9m.j(z6, z7, function0, function12, ad2Var, zcaVar, function16, function13, a26.W(z7e.b, xvfVar), vt9Var3, 0);
                    } else {
                        vt9Var3.Q();
                    }
                    return Unit.a;
                }
            }, vt9Var2), vt9Var2, ((i12 >> 3) & 14) | 805309488, 500);
            vt9Var = vt9Var2;
            if (gcaVar == null) {
                vt9Var.W(1518500615);
                vt9Var.p(false);
            } else {
                vt9Var.W(1518500616);
                f(gcaVar, function04, function05, vt9Var, (i6 >> 3) & 1008);
                vt9Var.p(false);
            }
            if (sekVar == null) {
                vt9Var.W(1518699573);
                vt9Var.p(false);
            } else {
                vt9Var.W(1518699574);
                kfo.p(sekVar, function06, null, vt9Var, (i6 >> 12) & 112, 4);
                vt9Var = vt9Var;
                vt9Var.p(false);
            }
            if (hz5Var == null) {
                vt9Var.W(1518872863);
                vt9Var.p(false);
            } else {
                vt9Var.W(1518872864);
                int i13 = i6 >> 18;
                xy5.g(hz5Var, function07, function08, function09, function14, vt9Var, 8 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | ((i12 << 12) & 57344));
                vt9Var.p(false);
            }
            c8eVar2 = c8eVar3;
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2() { // from class: jda
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = aoh.m(i2 | 1);
                    int iM2 = aoh.m(i3);
                    int iM3 = aoh.m(i4);
                    y9m.d(ad2Var, zcaVar, function1, z, z2, function0, function12, function02, fumVar, function03, function13, gcaVar, function04, function05, sekVar, function06, hz5Var, function07, function08, function09, function14, c8eVar2, (ih5) obj, iM, iM2, iM3, i5);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean d0(vg9 vg9Var, yo7 yo7Var) {
        vg9[] vg9VarArr = new vg9[16];
        if (!vg9Var.a.n) {
            a8b.b("visitChildren called on an unattached node");
        }
        dfe dfeVar = new dfe(new b8e[16]);
        b8e b8eVar = vg9Var.a;
        b8e b8eVar2 = b8eVar.f;
        if (b8eVar2 == null) {
            ui6.h(dfeVar, b8eVar);
        } else {
            dfeVar.c(b8eVar2);
        }
        int i2 = 0;
        while (true) {
            int i3 = dfeVar.c;
            if (i3 == 0) {
                break;
            }
            b8e b8eVarU = (b8e) dfeVar.l(i3 - 1);
            if ((b8eVarU.d & 1024) == 0) {
                ui6.h(dfeVar, b8eVarU);
            } else {
                while (true) {
                    if (b8eVarU == null) {
                        break;
                    }
                    if ((b8eVarU.c & 1024) != 0) {
                        dfe dfeVar2 = null;
                        while (b8eVarU != null) {
                            if (b8eVarU instanceof vg9) {
                                vg9 vg9Var2 = (vg9) b8eVarU;
                                int i4 = i2 + 1;
                                if (vg9VarArr.length < i4) {
                                    int length = vg9VarArr.length;
                                    ?? r10 = new Object[Math.max(i4, length << 1)];
                                    System.arraycopy(vg9VarArr, 0, r10, 0, length);
                                    vg9VarArr = r10;
                                }
                                vg9VarArr[i2] = vg9Var2;
                                i2 = i4;
                            } else if ((b8eVarU.c & 1024) != 0 && (b8eVarU instanceof i17)) {
                                int i5 = 0;
                                for (b8e b8eVar3 = ((i17) b8eVarU).p; b8eVar3 != null; b8eVar3 = b8eVar3.f) {
                                    if ((b8eVar3.c & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            b8eVarU = b8eVar3;
                                        } else {
                                            if (dfeVar2 == null) {
                                                dfeVar2 = new dfe(new b8e[16]);
                                            }
                                            if (b8eVarU != null) {
                                                dfeVar2.c(b8eVarU);
                                                b8eVarU = null;
                                            }
                                            dfeVar2.c(b8eVar3);
                                        }
                                    }
                                }
                                if (i5 != 1) {
                                }
                            }
                            b8eVarU = ui6.U(dfeVar2);
                        }
                    } else {
                        b8eVarU = b8eVarU.f;
                    }
                }
            }
        }
        Arrays.sort(vg9VarArr, 0, i2, yg9.b);
        int i6 = i2 - 1;
        if (i6 < vg9VarArr.length) {
            while (i6 >= 0) {
                vg9 vg9Var3 = vg9VarArr[i6];
                if (gyg.E(vg9Var3) && s(vg9Var3, yo7Var)) {
                    return true;
                }
                i6--;
            }
        }
        return false;
    }

    public static final void e(hca hcaVar, c8e c8eVar, ih5 ih5Var, int i2) {
        vt9 vt9Var;
        byte b2;
        c8e c8eVar2;
        zpa zpaVar;
        int i3;
        hca hcaVar2 = hcaVar;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-1709494965);
        int i4 = (vt9Var2.f(hcaVar2) ? 4 : 2) | i2 | 48;
        if (vt9Var2.N(i4 & 1, (i4 & 19) != 18)) {
            afe afeVarH = dyg.h(((pca) hcaVar2).i, vt9Var2);
            pca pcaVar = (pca) hcaVar2;
            afe afeVarH2 = dyg.h(pcaVar.h, vt9Var2);
            afe afeVarH3 = dyg.h(pcaVar.k, vt9Var2);
            afe afeVarH4 = dyg.h(pcaVar.m, vt9Var2);
            afe afeVarH5 = dyg.h(pcaVar.o, vt9Var2);
            afe afeVarH6 = dyg.h(pcaVar.q, vt9Var2);
            afe afeVarH7 = dyg.h(pcaVar.s, vt9Var2);
            afe afeVarH8 = dyg.h(pcaVar.t, vt9Var2);
            ad2 ad2Var = (ad2) afeVarH.getValue();
            zca zcaVar = (zca) afeVarH2.getValue();
            int i5 = i4 & 14;
            boolean z = i5 == 4;
            Object objK = vt9Var2.K();
            zpa zpaVar2 = hh5.a;
            if (z || objK == zpaVar2) {
                zpaVar = zpaVar2;
                i3 = i5;
                ci7 ci7Var = new ci7(1, hcaVar2, hca.class, "onFilterSelected", "onFilterSelected(Lcom/opera/momi/clientsdk/ui/history/HistoryFilter;)V", 0, (byte) 8);
                vt9Var2.g0(ci7Var);
                objK = ci7Var;
            } else {
                i3 = i5;
                zpaVar = zpaVar2;
            }
            Function1 function1 = (mtb) objK;
            boolean zBooleanValue = ((Boolean) afeVarH3.getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) afeVarH4.getValue()).booleanValue();
            boolean z2 = i3 == 4;
            Object objK2 = vt9Var2.K();
            if (z2 || objK2 == zpaVar) {
                qv7 qv7Var = new qv7(0, hcaVar, hca.class, "onRefresh", "onRefresh()V", 0, (byte) 17);
                vt9Var2.g0(qv7Var);
                objK2 = qv7Var;
            }
            Function0 function0 = (mtb) objK2;
            boolean z3 = i3 == 4;
            Object objK3 = vt9Var2.K();
            if (z3 || objK3 == zpaVar) {
                ci7 ci7Var2 = new ci7(1, hcaVar, hca.class, "onLastVisibleItemChanged", "onLastVisibleItemChanged(I)V", 0, (byte) 10);
                vt9Var2.g0(ci7Var2);
                objK3 = ci7Var2;
            }
            Function1 function12 = (mtb) objK3;
            boolean z4 = i3 == 4;
            Object objK4 = vt9Var2.K();
            if (z4 || objK4 == zpaVar) {
                qv7 qv7Var2 = new qv7(0, hcaVar, hca.class, "onBack", "onBack()V", 0, (byte) 18);
                vt9Var2.g0(qv7Var2);
                objK4 = qv7Var2;
            }
            Function0 function02 = (mtb) objK4;
            fum fumVar = (fum) afeVarH5.getValue();
            boolean z5 = i3 == 4;
            Object objK5 = vt9Var2.K();
            if (z5 || objK5 == zpaVar) {
                qv7 qv7Var3 = new qv7(0, hcaVar, hca.class, "onMessageShown", "onMessageShown()V", 0, (byte) 19);
                vt9Var2.g0(qv7Var3);
                objK5 = qv7Var3;
            }
            Function0 function03 = (mtb) objK5;
            boolean z6 = i3 == 4;
            Object objK6 = vt9Var2.K();
            if (z6 || objK6 == zpaVar) {
                ci7 ci7Var3 = new ci7(1, hcaVar, hca.class, "onActionButtonClick", "onActionButtonClick(Lcom/opera/momi/clientsdk/ui/history/HistoryUiEntry;)V", 0, (byte) 11);
                vt9Var2.g0(ci7Var3);
                objK6 = ci7Var3;
            }
            Function1 function13 = (mtb) objK6;
            gca gcaVar = (gca) afeVarH6.getValue();
            boolean z7 = i3 == 4;
            Object objK7 = vt9Var2.K();
            if (z7 || objK7 == zpaVar) {
                qv7 qv7Var4 = new qv7(0, hcaVar, hca.class, "onBottomSheetDismissed", "onBottomSheetDismissed()V", 0, (byte) 20);
                vt9Var2.g0(qv7Var4);
                objK7 = qv7Var4;
            }
            Function0 function04 = (mtb) objK7;
            boolean z8 = i3 == 4;
            Object objK8 = vt9Var2.K();
            if (z8 || objK8 == zpaVar) {
                qv7 qv7Var5 = new qv7(0, hcaVar, hca.class, "onActivateSpotifyVoucher", "onActivateSpotifyVoucher()V", 0, (byte) 21);
                vt9Var2.g0(qv7Var5);
                objK8 = qv7Var5;
            }
            Function0 function05 = (mtb) objK8;
            sek sekVar = (sek) afeVarH7.getValue();
            boolean z9 = i3 == 4;
            Object objK9 = vt9Var2.K();
            if (z9 || objK9 == zpaVar) {
                qv7 qv7Var6 = new qv7(0, hcaVar, hca.class, "onStreakClaimDismissed", "onStreakClaimDismissed()V", 0, (byte) 22);
                vt9Var2.g0(qv7Var6);
                objK9 = qv7Var6;
            }
            Function0 function06 = (mtb) objK9;
            hz5 hz5Var = (hz5) afeVarH8.getValue();
            boolean z10 = i3 == 4;
            Object objK10 = vt9Var2.K();
            if (z10 || objK10 == zpaVar) {
                qv7 qv7Var7 = new qv7(0, hcaVar, hca.class, "onCouponCampaignSheetDismissed", "onCouponCampaignSheetDismissed()V", 0, (byte) 14);
                vt9Var2.g0(qv7Var7);
                objK10 = qv7Var7;
            }
            Function0 function07 = (mtb) objK10;
            boolean z11 = i3 == 4;
            Object objK11 = vt9Var2.K();
            if (z11 || objK11 == zpaVar) {
                qv7 qv7Var8 = new qv7(0, hcaVar, hca.class, "onCouponCampaignCopyCode", "onCouponCampaignCopyCode()V", 0, (byte) 15);
                vt9Var2.g0(qv7Var8);
                objK11 = qv7Var8;
            }
            Function0 function08 = (mtb) objK11;
            boolean z12 = i3 == 4;
            Object objK12 = vt9Var2.K();
            if (z12 || objK12 == zpaVar) {
                qv7 qv7Var9 = new qv7(0, hcaVar, hca.class, "onCouponCampaignPrimaryAction", "onCouponCampaignPrimaryAction()V", 0, (byte) 16);
                vt9Var2.g0(qv7Var9);
                objK12 = qv7Var9;
            }
            Function0 function09 = (mtb) objK12;
            boolean z13 = i3 == 4;
            Object objK13 = vt9Var2.K();
            if (z13 || objK13 == zpaVar) {
                hcaVar2 = hcaVar;
                objK13 = new ci7(1, hcaVar2, hca.class, "onCouponCampaignLinkClick", "onCouponCampaignLinkClick(Ljava/lang/String;)V", 0, (byte) 9);
                vt9Var2.g0(objK13);
            } else {
                hcaVar2 = hcaVar;
            }
            z7e z7eVar = z7e.b;
            vt9Var = vt9Var2;
            b2 = 1;
            d(ad2Var, zcaVar, function1, zBooleanValue, zBooleanValue2, function0, function12, function02, fumVar, function03, function13, gcaVar, function04, function05, sekVar, function06, hz5Var, function07, function08, function09, (mtb) objK13, z7eVar, vt9Var, 0, 2097152, 48, 0);
            c8eVar2 = z7eVar;
        } else {
            vt9Var = vt9Var2;
            b2 = 1;
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new hda(hcaVar2, c8eVar2, i2, b2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean e0(vg9 vg9Var, yo7 yo7Var) {
        vg9[] vg9VarArr = new vg9[16];
        if (!vg9Var.a.n) {
            a8b.b("visitChildren called on an unattached node");
        }
        dfe dfeVar = new dfe(new b8e[16]);
        b8e b8eVar = vg9Var.a;
        b8e b8eVar2 = b8eVar.f;
        if (b8eVar2 == null) {
            ui6.h(dfeVar, b8eVar);
        } else {
            dfeVar.c(b8eVar2);
        }
        int i2 = 0;
        while (true) {
            int i3 = dfeVar.c;
            if (i3 == 0) {
                break;
            }
            b8e b8eVarU = (b8e) dfeVar.l(i3 - 1);
            if ((b8eVarU.d & 1024) == 0) {
                ui6.h(dfeVar, b8eVarU);
            } else {
                while (true) {
                    if (b8eVarU == null) {
                        break;
                    }
                    if ((b8eVarU.c & 1024) != 0) {
                        dfe dfeVar2 = null;
                        while (b8eVarU != null) {
                            if (b8eVarU instanceof vg9) {
                                vg9 vg9Var2 = (vg9) b8eVarU;
                                int i4 = i2 + 1;
                                if (vg9VarArr.length < i4) {
                                    int length = vg9VarArr.length;
                                    ?? r10 = new Object[Math.max(i4, length << 1)];
                                    System.arraycopy(vg9VarArr, 0, r10, 0, length);
                                    vg9VarArr = r10;
                                }
                                vg9VarArr[i2] = vg9Var2;
                                i2 = i4;
                            } else if ((b8eVarU.c & 1024) != 0 && (b8eVarU instanceof i17)) {
                                int i5 = 0;
                                for (b8e b8eVar3 = ((i17) b8eVarU).p; b8eVar3 != null; b8eVar3 = b8eVar3.f) {
                                    if ((b8eVar3.c & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            b8eVarU = b8eVar3;
                                        } else {
                                            if (dfeVar2 == null) {
                                                dfeVar2 = new dfe(new b8e[16]);
                                            }
                                            if (b8eVarU != null) {
                                                dfeVar2.c(b8eVarU);
                                                b8eVarU = null;
                                            }
                                            dfeVar2.c(b8eVar3);
                                        }
                                    }
                                }
                                if (i5 != 1) {
                                }
                            }
                            b8eVarU = ui6.U(dfeVar2);
                        }
                    } else {
                        b8eVarU = b8eVarU.f;
                    }
                }
            }
        }
        Arrays.sort(vg9VarArr, 0, i2, yg9.b);
        for (int i6 = 0; i6 < i2; i6++) {
            vg9 vg9Var3 = vg9VarArr[i6];
            if (gyg.E(vg9Var3) && J(vg9Var3, yo7Var)) {
                return true;
            }
        }
        return false;
    }

    public static final void f(gca gcaVar, Function0 function0, Function0 function02, ih5 ih5Var, int i2) {
        vt9 vt9Var;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-1650969196);
        int i3 = (vt9Var2.f(gcaVar) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= vt9Var2.h(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var2.h(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if (vt9Var2.N(i3 & 1, (i3 & 147) != 146)) {
            vt9Var = vt9Var2;
            i7e.a(function0, null, i7e.f(null, vt9Var2, 0, 3), 0.0f, false, null, 0L, 0L, 0L, null, null, null, gyg.P(-542729870, new f23(gcaVar, function0, function02, (byte) 9), vt9Var2), vt9Var, (i3 >> 3) & 14, 7162);
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new j51(gcaVar, function0, function02, i2, (byte) 3);
        }
    }

    public static final void f0(nh4 nh4Var, mt5 mt5Var, boolean z) {
        Object objF;
        Object objR = nh4Var.r();
        Throwable thE = nh4Var.e(objR);
        if (thE != null) {
            p0i p0iVar = t0i.b;
            objF = new q0i(thE);
        } else {
            p0i p0iVar2 = t0i.b;
            objF = nh4Var.f(objR);
        }
        if (!z) {
            mt5Var.resumeWith(objF);
            return;
        }
        ia7 ia7Var = (ia7) mt5Var;
        nt5 nt5Var = ia7Var.e;
        Object obj = ia7Var.g;
        CoroutineContext context = nt5Var.getContext();
        Object objB = eml.b(context, obj);
        ikm ikmVarC = objB != eml.a ? cx5.c(nt5Var, context, objB) : null;
        try {
            ia7Var.e.resumeWith(objF);
            if (ikmVarC == null || ikmVarC.F0()) {
                eml.a(context, objB);
            }
        } catch (Throwable th) {
            if (ikmVarC == null || ikmVarC.F0()) {
                eml.a(context, objB);
            }
            throw th;
        }
    }

    public static final void g(hea heaVar, Function0 function0, c8e c8eVar, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1293994530);
        int i3 = i2 | (vt9Var.h(heaVar) ? 4 : 2) | (vt9Var.h(function0) ? 32 : 16);
        byte b2 = 1;
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            u8i u8iVar = ((acj) vt9Var.j(ccj.a)).d;
            hp7 hp7Var = ua5.a;
            gk4 gk4VarZ = i41.z((sa5) vt9Var.j(hp7Var));
            c26.a(c8eVar, u8iVar, gk4VarZ.a(((sa5) vt9Var.j(hp7Var)).F, gk4VarZ.b, gk4VarZ.c, gk4VarZ.d), null, gyg.P(2140984084, new b57(heaVar, function0, b2), vt9Var), vt9Var, 196614, 24);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new g9(heaVar, function0, c8eVar, i2, (byte) 16, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00fc, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0196 A[EDGE_INSN: B:152:0x0196->B:123:0x0196 BREAK  A[LOOP:5: B:86:0x0128->B:157:0x0128], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012a  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean g0(defpackage.vg9 r12, defpackage.vg9 r13, int r14, yo7 r15) throws pxb {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y9m.g0(vg9, vg9, int, yo7):boolean");
    }

    public static final void h(gea geaVar, c8e c8eVar, ih5 ih5Var, int i2) {
        vt9 vt9Var;
        c8e c8eVar2;
        shk shkVar;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-647134779);
        int i3 = (vt9Var2.d(geaVar.ordinal()) ? 4 : 2) | i2 | 48;
        if (vt9Var2.N(i3 & 1, (i3 & 19) != 18)) {
            int iOrdinal = geaVar.ordinal();
            if (iOrdinal == 0) {
                shkVar = (shk) ahk.p0.getValue();
            } else {
                if (iOrdinal != 1) {
                    h9o.p();
                    return;
                }
                shkVar = (shk) ahk.q0.getValue();
            }
            String upperCase = uyg.q(shkVar, vt9Var2).toUpperCase(Locale.ROOT);
            ikl iklVar = ((wam) vt9Var2.j(abm.a)).o;
            hp7 hp7Var = ua5.a;
            long j2 = ((sa5) vt9Var2.j(hp7Var)).d;
            long j3 = ((sa5) vt9Var2.j(hp7Var)).c;
            u8i u8iVar = ((acj) vt9Var2.j(ccj.a)).b;
            z7e z7eVar = z7e.b;
            vt9Var = vt9Var2;
            ijl.b(upperCase, a26.Z(sfe.C(z7eVar, j3, u8iVar), 4.0f, 0.0f, 2), j2, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, iklVar, vt9Var, 0, 24576, 114680);
            c8eVar2 = z7eVar;
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fx0(geaVar, c8eVar2, i2, (byte) 29);
        }
    }

    public static final int h0(sxi sxiVar, int i2) {
        int i3;
        int[] iArr = sxiVar.f;
        int i4 = i2 + 1;
        int length = sxiVar.e.length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= length) {
                i3 = (i5 + length) >>> 1;
                int i6 = iArr[i3];
                if (i6 >= i4) {
                    if (i6 <= i4) {
                        break;
                    }
                    length = i3 - 1;
                } else {
                    i5 = i3 + 1;
                }
            } else {
                i3 = (-i5) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : ~i3;
    }

    public static final void i(zca zcaVar, Function1 function1, c8e c8eVar, ih5 ih5Var, int i2) {
        c8e c8eVar2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(143935686);
        int i3 = 32;
        int i4 = i2 | (vt9Var.d(zcaVar.ordinal()) ? 4 : 2) | (vt9Var.h(function1) ? 32 : 16) | 384;
        boolean z = false;
        boolean z2 = true;
        if (vt9Var.N(i4 & 1, (i4 & 147) != 146)) {
            x62 x62Var = new x62(10.0f, true, new t40((byte) 19));
            c8e c8eVarB0 = a26.b0(oup.s0(mpj.a, oup.q0(vt9Var), false, true), 16.0f, 8.0f, 16.0f, 0.0f, 8);
            o9i o9iVarA = m9i.a(x62Var, rbe.k, vt9Var, 6);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarB0);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            vt9Var.W(1376298561);
            h58 h58Var = zca.c;
            w4 w4VarE = sko.e(h58Var, h58Var);
            while (w4VarE.hasNext()) {
                zca zcaVar2 = (zca) w4VarE.next();
                boolean z3 = zcaVar2 == zcaVar ? z2 : z;
                acj acjVar = (acj) vt9Var.j(ccj.a);
                paj pajVar = (paj) vt9Var.j(bcj.a);
                if (pajVar == null) {
                    pajVar = acjVar.c;
                }
                ue5 ue5Var = zcaVar2 == zcaVar ? zi4.c : null;
                boolean zD = ((i4 & 112) == i3 ? z2 : z) | vt9Var.d(zcaVar2.ordinal());
                Object objK = vt9Var.K();
                if (zD || objK == hh5.a) {
                    objK = new gv8(function1, zcaVar2, (byte) 7);
                    vt9Var.g0(objK);
                }
                ey4.b(z3, (Function0) objK, gyg.P(1302342042, new whf(zcaVar2, (byte) 28), vt9Var), null, false, ue5Var, pajVar, null, null, null, vt9Var, 384, 3928);
                z = z;
                i4 = i4;
                i3 = i3;
                z2 = true;
            }
            vt9Var.p(z);
            vt9Var.p(true);
            c8eVar2 = z7e.b;
        } else {
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new g9(zcaVar, function1, c8eVar2, i2, (byte) 15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i0(int r4, java.lang.Object r5, defpackage.yyh r6, defpackage.ki9 r7, int r8) {
        /*
            boolean r0 = r5 instanceof android.graphics.Typeface
            if (r0 != 0) goto L5
            return r5
        L5:
            r0 = r4 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L29
            ki9 r0 = r6.b
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r7)
            if (r0 != 0) goto L29
            ki9 r0 = defpackage.ki9.d
            int r3 = r7.compareTo(r0)
            if (r3 < 0) goto L29
            ki9 r3 = r6.b
            int r3 = r3.a
            int r0 = r0.a
            int r0 = kotlin.jvm.internal.Intrinsics.b(r3, r0)
            if (r0 >= 0) goto L29
            r0 = r2
            goto L2a
        L29:
            r0 = r1
        L2a:
            r4 = r4 & 2
            if (r4 == 0) goto L35
            r6.getClass()
            if (r8 == 0) goto L35
            r4 = r2
            goto L36
        L35:
            r4 = r1
        L36:
            if (r4 != 0) goto L3b
            if (r0 != 0) goto L3b
            return r5
        L3b:
            if (r0 == 0) goto L40
            int r7 = r7.a
            goto L44
        L40:
            ki9 r7 = r6.b
            int r7 = r7.a
        L44:
            if (r4 == 0) goto L4a
            if (r8 != r2) goto L4d
            r1 = r2
            goto L4d
        L4a:
            r6.getClass()
        L4d:
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r5, r7, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y9m.i0(int, java.lang.Object, yyh, ki9, int):java.lang.Object");
    }

    public static final void j(final boolean z, final boolean z2, final Function0 function0, final Function1 function1, final ad2 ad2Var, final zca zcaVar, final Function1 function12, final Function1 function13, final c8e c8eVar, ih5 ih5Var, final int i2) {
        vt9 vt9Var;
        g1b g1bVar;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(1954081805);
        int i3 = i2 | (vt9Var2.g(z) ? 4 : 2) | (vt9Var2.g(z2) ? 32 : 16) | (vt9Var2.h(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var2.h(function1) ? 2048 : 1024) | (vt9Var2.f(ad2Var) ? 16384 : 8192) | (vt9Var2.d(zcaVar.ordinal()) ? 131072 : 65536) | (vt9Var2.h(function12) ? 1048576 : 524288) | (vt9Var2.h(function13) ? 8388608 : 4194304) | (vt9Var2.f(c8eVar) ? 67108864 : 33554432);
        byte b2 = 0;
        if (vt9Var2.N(i3 & 1, (38347923 & i3) != 38347922)) {
            yc2 yc2Var = ad2Var instanceof yc2 ? (yc2) ad2Var : null;
            if (yc2Var == null || (g1bVar = (g1b) yc2Var.a) == null) {
                g1bVar = rqj.c;
            }
            final u6c u6cVarA = x6c.a(0, vt9Var2, 3);
            vtp.g(u6cVarA, g1bVar, vt9Var2, 64);
            boolean zF = vt9Var2.f(u6cVarA);
            Object objK = vt9Var2.K();
            zpa zpaVar = hh5.a;
            if (zF || objK == zpaVar) {
                objK = new mda(u6cVarA, null, b2);
                vt9Var2.g0(objK);
            }
            rm5.e(vt9Var2, zcaVar, (Function2) objK);
            boolean zF2 = vt9Var2.f(u6cVarA) | ((i3 & 7168) == 2048);
            Object objK2 = vt9Var2.K();
            if (zF2 || objK2 == zpaVar) {
                objK2 = new fg6(u6cVarA, function1, (mt5) null, (byte) 22);
                vt9Var2.g0(objK2);
            }
            rm5.e(vt9Var2, u6cVarA, (Function2) objK2);
            final g1b g1bVar2 = g1bVar;
            vt9Var = vt9Var2;
            lah.b(z, function0, c8eVar.d(mpj.c), null, rbe.c, null, gyg.P(-1045930393, new cr9() { // from class: kda
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ih5 ih5Var2 = (ih5) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    vt9 vt9Var3 = (vt9) ih5Var2;
                    if (vt9Var3.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                        x62 x62Var = new x62(8.0f, true, new t40((byte) 19));
                        c8e c8eVarD = mpj.m(z7e.b, 560.0f, 1).d(mpj.c);
                        zca zcaVar2 = zcaVar;
                        boolean zD = vt9Var3.d(zcaVar2.ordinal());
                        Function1 function14 = function12;
                        boolean zF3 = zD | vt9Var3.f(function14);
                        g1b g1bVar3 = g1bVar2;
                        boolean zH = zF3 | vt9Var3.h(g1bVar3);
                        Function1 function15 = function13;
                        boolean zF4 = zH | vt9Var3.f(function15);
                        ad2 ad2Var2 = ad2Var;
                        boolean zH2 = zF4 | vt9Var3.h(ad2Var2);
                        boolean z3 = z2;
                        boolean zG = zH2 | vt9Var3.g(z3);
                        Object objK3 = vt9Var3.K();
                        if (zG || objK3 == hh5.a) {
                            objK3 = new pw5(g1bVar3, ad2Var2, z3, zcaVar2, function14, function15);
                            vt9Var3.g0(objK3);
                        }
                        sgb.c(c8eVarD, u6cVarA, null, x62Var, null, null, false, null, (Function1) objK3, vt9Var3, 24576, 492);
                    } else {
                        vt9Var3.Q();
                    }
                    return Unit.a;
                }
            }, vt9Var2), vt9Var, (i3 & 14) | 1597440 | ((i3 >> 3) & 112), 40);
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2(z, z2, function0, function1, ad2Var, zcaVar, function12, function13, c8eVar, i2) { // from class: lda
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ ad2 e;
                public final /* synthetic */ zca f;
                public final /* synthetic */ Function1 g;
                public final /* synthetic */ Function1 h;
                public final /* synthetic */ c8e i;

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = aoh.m(1);
                    y9m.j(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (ih5) obj, iM);
                    return Unit.a;
                }
            };
        }
    }

    public static void j0(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(sko.k(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        Intrinsics.d(y9m.class.getName(), classCastException);
        throw classCastException;
    }

    public static final void k(ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1505051014);
        if (vt9Var.N(i2 & 1, i2 != 0)) {
            c8e c8eVarX = a26.X(wxe.Q(mpj.a), 48.0f);
            tfd tfdVarC = nr3.c(rbe.f, false);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarX);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, tfdVarC, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            v4h.a(null, 0L, 0.0f, 0L, 0, 0.0f, vt9Var, 0, 63);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new nf8(i2);
        }
    }

    public static String k0(int i2) {
        return i2 == 0 ? "Clear" : i2 == 1 ? "Src" : i2 == 2 ? "Dst" : i2 == 3 ? "SrcOver" : i2 == 4 ? "DstOver" : i2 == 5 ? "SrcIn" : i2 == 6 ? "DstIn" : i2 == 7 ? "SrcOut" : i2 == 8 ? "DstOut" : i2 == 9 ? "SrcAtop" : i2 == 10 ? "DstAtop" : i2 == 11 ? "Xor" : i2 == 12 ? "Plus" : i2 == 13 ? "Modulate" : i2 == 14 ? "Screen" : i2 == 15 ? "Overlay" : i2 == 16 ? "Darken" : i2 == 17 ? "Lighten" : i2 == 18 ? "ColorDodge" : i2 == 19 ? "ColorBurn" : i2 == 20 ? "HardLight" : i2 == 21 ? "Softlight" : i2 == 22 ? "Difference" : i2 == 23 ? "Exclusion" : i2 == 24 ? "Multiply" : i2 == 25 ? "Hue" : i2 == 26 ? "Saturation" : i2 == 27 ? "Color" : i2 == 28 ? "Luminosity" : "Unknown";
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(java.lang.String r37, kotlin.jvm.functions.Function0 r38, kotlin.jvm.functions.Function0 r39, defpackage.ih5 r40, int r41) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y9m.l(java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, ih5, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.i38 l0(defpackage.i38 r17, defpackage.bza r18, defpackage.vrf r19, y55 r20, nt5 r21) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y9m.l0(i38, bza, vrf, y55, nt5):i38");
    }

    public static final void m(Function0 function0, ih5 ih5Var, int i2) {
        Function0 function02;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(514417077);
        byte b2 = 4;
        int i3 = (vt9Var.h(function0) ? 4 : 2) | i2;
        if (vt9Var.N(i3 & 1, (i3 & 3) != 2)) {
            i39 i39Var = mpj.a;
            zvf zvfVar = b24.a;
            hp7 hp7Var = ua5.a;
            long j2 = ((sa5) vt9Var.j(hp7Var)).a;
            function02 = function0;
            yi4.a(function02, i39Var, false, (paj) null, b24.b(((sa5) vt9Var.j(hp7Var)).h, j2, 0L, 0L, vt9Var, 12), (e24) null, (go3) null, (zvf) null, zi4.f, vt9Var, (i3 & 14) | 805306416, 492);
            vt9Var = vt9Var;
        } else {
            function02 = function0;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new is1(function02, i2, b2);
        }
    }

    public static final List m0(ArrayList arrayList, List list) {
        List list2 = list;
        int iA = qbd.a(k95.o(list2, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : list2) {
            linkedHashMap.put(((fbc) obj).f, obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            fbc fbcVar = (fbc) obj2;
            linkedHashMap2.put(fbcVar.f, fbcVar);
        }
        return CollectionsKt.k0(linkedHashMap2.values());
    }

    public static void n(int i2, int i3, int[] iArr, int i4, ehc ehcVar, boolean z) {
        boolean z2;
        dn5 dn5Var;
        for (int i5 : iArr) {
            if ((i2 & i5) == i5) {
                ehcVar.add(new fn5(i4));
                int length = iArr.length;
                int i6 = 0;
                while (i6 < length) {
                    int i7 = iArr[i6];
                    if ((i2 & i7) == i7) {
                        boolean z3 = (i3 & i7) == i7;
                        if (i7 == 1) {
                            z2 = z;
                            dn5Var = new dn5(i7, z2, z3, 2132021381, 2132021382);
                        } else if (i7 == 8) {
                            z2 = z;
                            dn5Var = new dn5(i7, z2, z3, 2132021386, 2132021387);
                        } else if (i7 == 16) {
                            z2 = z;
                            dn5Var = new dn5(i7, z2, z3, 2132021549, 2132021385);
                        } else if (i7 == 32) {
                            z2 = z;
                            dn5Var = new dn5(i7, z2, z3, 2132021089, 2132021090);
                        } else if (i7 != 64) {
                            qp2.o(sko.i(i7, "Unexpected consent: "));
                            return;
                        } else {
                            z2 = z;
                            dn5Var = new dn5(i7, z2, z3, 2132021086, 2132021087);
                        }
                        ehcVar.add(dn5Var);
                    } else {
                        z2 = z;
                    }
                    i6++;
                    z = z2;
                }
                return;
            }
        }
    }

    public static float n0() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static final c8e o(c8e c8eVar, float f2) {
        return f2 == 1.0f ? c8eVar : z5i.O(c8eVar, 0.0f, 0.0f, f2, 0.0f, 0.0f, 0L, null, true, 0L, 0L, 1044475);
    }

    public static Collection p(Object obj) {
        if ((obj instanceof ptb) && !(obj instanceof qtb)) {
            j0(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e2) {
            Intrinsics.d(y9m.class.getName(), e2);
            throw e2;
        }
    }

    public static List q(Object obj) {
        if ((obj instanceof ptb) && !(obj instanceof rtb)) {
            j0(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e2) {
            Intrinsics.d(y9m.class.getName(), e2);
            throw e2;
        }
    }

    public static Map r(Object obj) {
        if ((obj instanceof ptb) && !(obj instanceof ttb)) {
            j0(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            Intrinsics.d(y9m.class.getName(), e2);
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0075 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean s(defpackage.vg9 r7, yo7 r8) {
        /*
            qg9 r0 = r7.Y0()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L80
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L35
            if (r0 == r3) goto L80
            if (r0 != r1) goto L31
            boolean r0 = d0(r7, r8)
            if (r0 != 0) goto L76
            ig9 r0 = r7.V0()
            boolean r0 = r0.a
            if (r0 == 0) goto L2d
            java.lang.Object r7 = r8.invoke(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L2e
        L2d:
            r7 = r2
        L2e:
            if (r7 == 0) goto L75
            goto L76
        L31:
            h9o.p()
            return r2
        L35:
            vg9 r0 = defpackage.gyg.v(r7)
            java.lang.String r5 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L7c
            qg9 r6 = r0.Y0()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L77
            if (r6 == r4) goto L55
            if (r6 == r3) goto L77
            if (r6 == r1) goto L51
            h9o.p()
            return r2
        L51:
            qp2.n(r5)
            return r2
        L55:
            boolean r1 = s(r0, r8)
            if (r1 != 0) goto L76
            boolean r7 = K(r7, r0, r3, r8)
            if (r7 != 0) goto L76
            ig9 r7 = r0.V0()
            boolean r7 = r7.a
            if (r7 == 0) goto L75
            java.lang.Object r7 = r8.invoke(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L76
        L75:
            return r2
        L76:
            return r4
        L77:
            boolean r7 = K(r7, r0, r3, r8)
            return r7
        L7c:
            qp2.n(r5)
            return r2
        L80:
            boolean r7 = d0(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y9m.s(vg9, yo7):boolean");
    }

    public static void t(int i2, Object obj) {
        if (obj == null || R(i2, obj)) {
            return;
        }
        j0(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static final Object u(fxj fxjVar, int i2) {
        Object obj;
        int iF = x1p.f(fxjVar.c, i2, fxjVar.a);
        if (iF < 0 || (obj = fxjVar.b[iF]) == n) {
            return null;
        }
        return obj;
    }

    public static final td4 v(String str, String str2, rn2 rn2Var) {
        ArrayList arrayListJ = j95.j(new String[]{str});
        if (str2 != null) {
            arrayListJ.add(str2);
        }
        return new td4(arrayListJ, rn2Var);
    }

    public static kxd w(s15 s15Var, String str) {
        kxd kxdVar;
        HashMap map = kxd.c;
        synchronized (map) {
            Object kxdVar2 = map.get(str);
            if (kxdVar2 == null) {
                kxdVar2 = new kxd(s15Var, str);
                map.put(str, kxdVar2);
            }
            kxdVar = (kxd) kxdVar2;
            if (!kxdVar.b.equals(s15Var)) {
                throw new IllegalStateException("Check failed.");
            }
        }
        return kxdVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ajb */
    public static int x(byte[] bArr, int i2, f72 f72Var) throws ajb {
        int iD = D(bArr, i2, f72Var);
        int i3 = f72Var.a;
        if (i3 < 0) {
            throw ajb.h();
        }
        if (i3 > bArr.length - iD) {
            throw ajb.j();
        }
        if (i3 == 0) {
            f72Var.c = e54.b;
            return iD;
        }
        f72Var.c = e54.h(iD, i3, bArr);
        return iD + i3;
    }

    public static int y(byte[] bArr, int i2) {
        return (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24);
    }

    public static long z(byte[] bArr, int i2) {
        return (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48) | ((bArr[i2 + 7] & 255) << 56);
    }
}
