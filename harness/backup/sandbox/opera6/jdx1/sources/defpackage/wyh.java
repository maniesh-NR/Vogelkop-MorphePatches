package defpackage;

import ads_mobile_sdk.cu2;
import ads_mobile_sdk.e7;
import ads_mobile_sdk.i41;
import ads_mobile_sdk.pd;
import ads_mobile_sdk.qw;
import ads_mobile_sdk.rf1;
import ads_mobile_sdk.ru0;
import ads_mobile_sdk.sb0;
import ads_mobile_sdk.tf3;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.PointF;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.play_billing.zzbl;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.json.JSONArray;

/* loaded from: classes.dex */
public abstract class wyh {
    public static final bc6 a = new bc6(24, 0);
    public static final ue5 b = new ue5(738101732, new bf5((byte) 2), false);
    public static final ue5 c = new ue5(1633519149, new lf5((byte) 5), false);
    public static final ue5 d = new ue5(-1313782994, new gf5((byte) 21), false);
    public static final ue5 e = new ue5(-115655080, new gf5((byte) 22), false);
    public static final Object f;
    public static final m3g g;
    public static final df5 h;
    public static final int[] i;
    public static final char[] j;

    static {
        new ue5(938896890, new gf5((byte) 23), false);
        new ue5(-1260957560, new gf5((byte) 24), false);
        new ue5(-624276661, new gf5((byte) 16), false);
        new ue5(1856366871, new gf5((byte) 17), false);
        new ue5(726381850, new gf5((byte) 18), false);
        new ue5(1820783130, new gf5((byte) 19), false);
        new ue5(-2124355154, new gf5((byte) 20), false);
        f = new Object();
        g = new m3g((byte) 24);
        h = new df5((byte) 3);
        i = new int[]{1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
        j = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    public static boolean A(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static final void B(Context context, x77 x77Var, on onVar) {
        Object objInvoke;
        xgp.a.getClass();
        Context applicationContext = context.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            qp2.o("The provided application context is not an instance of Application. The Google Mobile Ads SDK should not be used from contexts like BroadcastReceivers, only Services and Activities.");
            return;
        }
        mt5 mt5Var = null;
        if (ru0.d.compareAndSet(false, true)) {
            int i2 = qw.k;
            pn7.b.getClass();
            na2.B(sgb.b(new jg8(new s9e(new ThreadPoolExecutor(1, 1, pn7.p(0L, un7.e), TimeUnit.SECONDS, new LinkedBlockingQueue(), new tf3("WebView"))))), null, null, new u6k((byte) 25, mt5Var, (Application) applicationContext), 3);
        }
        e7 e7Var = ru0.b;
        m53 m53Var = new m53(context, (Application) applicationContext, (byte) 23);
        synchronized (e7Var) {
            objInvoke = e7Var.a;
            if (objInvoke == null) {
                objInvoke = m53Var.invoke();
                e7Var.a = objInvoke;
            }
        }
        sb0 sb0Var = (sb0) ((xgp) objInvoke);
        ((i41) sb0Var.d.get()).a = x77Var;
        cu2 cu2Var = (cu2) sb0Var.a1.get();
        cu2Var.a.setValue(cu2.b[0], (cwh) x77Var.c);
        rf1 rf1Var = (rf1) sb0Var.T2.get();
        rf1Var.getClass();
        c26.K(new hkm(rf1Var, onVar, mt5Var, (byte) 21));
        synchronized (f) {
        }
    }

    public static final void C(s4 s4Var, String str) {
        s4Var.r(s4Var.b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static /* synthetic */ void D(s4 s4Var) {
        C(s4Var, "object");
        throw null;
    }

    public static boolean E(int i2) {
        return (i2 & 1) > 0;
    }

    public static final boolean F(xc4 xc4Var, String str) throws s7b {
        if (Intrinsics.a(Build.FINGERPRINT, "robolectric")) {
            return true;
        }
        try {
            sd4.a(str);
            int[] iArr = (int[]) ((ma4) xc4.b(xc4Var, str)).c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                if (e82.t(0, iArr) >= 0) {
                    return true;
                }
            }
            return false;
        } catch (CameraAccessException e2) {
            throw new s7b(e2);
        }
    }

    public static boolean G(int i2, boolean z) {
        if ((i2 >>> 8) == 3368816) {
            return true;
        }
        if (i2 == 1751476579 && z) {
            return true;
        }
        for (int i3 = 0; i3 < 29; i3++) {
            if (i[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean H(gu6 gu6Var, float f2) {
        gu6Var.m().getClass();
        return (gu6Var.r() ? -f2 : t(gu6Var)) <= 0.0f;
    }

    public static boolean I(String str) {
        tgk tgkVarL = tgk.l();
        try {
            boolean zContains = new HashSet(t8.a.getSharedPreferences("org.chromium.components.gcm_driver.lazy_subscriptions", 0).getStringSet("fcm_lazy_subscriptions", Collections.EMPTY_SET)).contains(str);
            tgkVarL.close();
            return zContains;
        } catch (Throwable th) {
            try {
                tgkVarL.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static boolean J(long[] jArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            if (jArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int K(int i2) {
        if (A(i2, 2)) {
            i2 = (i2 & (-3)) | 96;
        }
        return A(i2, 4) ? i2 & (-5) : i2;
    }

    public static final CharSequence L(int i2, CharSequence charSequence) {
        if (charSequence.length() >= 200) {
            if (i2 != -1) {
                int i3 = i2 - 30;
                int i4 = i2 + 30;
                String str = i3 <= 0 ? "" : ".....";
                String str2 = i4 >= charSequence.length() ? "" : ".....";
                StringBuilder sb = new StringBuilder(str);
                if (i3 < 0) {
                    i3 = 0;
                }
                int length = charSequence.length();
                if (i4 > length) {
                    i4 = length;
                }
                sb.append(charSequence.subSequence(i3, i4).toString());
                sb.append(str2);
                return sb.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final PointF M(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x - pointF2.x, pointF.y - pointF2.y);
    }

    public static final String N(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return z1m.l(sb, str != null ? sko.k(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    public static final PointF O(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static final long P(n6b n6bVar, fsf fsfVar, m6b m6bVar, boolean z) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits = n6bVar.g;
        if (fsfVar != null) {
            int i2 = m6bVar.a;
            if (i2 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i2 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = fsfVar == fsf.b ? Float.floatToRawIntBits(fIntBitsToFloat) << 32 : Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L;
        }
        long jD = y8f.d(Q(n6bVar, fsfVar, m6bVar), jFloatToRawIntBits);
        if (z || !n6bVar.i) {
            return jD;
        }
        return 0L;
    }

    public static final long Q(n6b n6bVar, fsf fsfVar, m6b m6bVar) {
        float fIntBitsToFloat;
        if (fsfVar == null) {
            return n6bVar.c;
        }
        int i2 = m6bVar.a;
        if (i2 == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (n6bVar.c >> 32));
        } else {
            if (i2 != 2) {
                return n6bVar.c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (n6bVar.c & 4294967295L));
        }
        return fsfVar == fsf.b ? Float.floatToRawIntBits(fIntBitsToFloat) << 32 : Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L;
    }

    public static byte[] R(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 < 0) {
                qp2.n(sko.i(i2, "Not enough bytes to read: "));
                return null;
            }
            i3 += i4;
        }
        return bArr;
    }

    public static byte[] S(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int i5 = fileInputStream.read(bArr2);
                if (i5 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, i5);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i3 - iInflate);
                    i4 += i5;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            if (i4 == i2) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    public static long T(InputStream inputStream, int i2) {
        byte[] bArrR = R(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (bArrR[i3] & 255) << (i3 << 3);
        }
        return j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object U(java.io.File r4, kotlin.jvm.functions.Function1 r5, nt5 r6) throws java.io.IOException {
        /*
            boolean r0 = r6 instanceof a29
            if (r0 == 0) goto L13
            r0 = r6
            a29 r0 = (a29) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            a29 r0 = new a29
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.u
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            java.io.File r4 = r0.t
            defpackage.ybh.y(r6)     // Catch: java.io.IOException -> L3f
            return r6
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L30:
            defpackage.ybh.y(r6)
            r0.t = r4     // Catch: java.io.IOException -> L3f
            r0.v = r3     // Catch: java.io.IOException -> L3f
            java.lang.Object r4 = r5.invoke(r0)     // Catch: java.io.IOException -> L3f
            if (r4 != r1) goto L3e
            return r1
        L3e:
            return r4
        L3f:
            r5 = move-exception
            boolean r6 = r5 instanceof defpackage.wx5
            if (r6 != 0) goto La1
            boolean r6 = r4.exists()
            if (r6 == 0) goto L9c
            boolean r6 = r4.isFile()
            if (r6 == 0) goto L76
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L66
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L61
            java.io.IOException r4 = defpackage.mkh.i(r4, r5)
            goto La0
        L61:
            java.io.IOException r4 = defpackage.mkh.i(r4, r5)
            goto La0
        L66:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L71
            java.io.IOException r4 = defpackage.mkh.i(r4, r5)
            goto La0
        L71:
            java.io.IOException r4 = defpackage.mkh.i(r4, r5)
            goto La0
        L76:
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L8c
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L87
            java.io.IOException r4 = defpackage.mkh.i(r4, r5)
            goto La0
        L87:
            java.io.IOException r4 = defpackage.mkh.i(r4, r5)
            goto La0
        L8c:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L97
            java.io.IOException r4 = defpackage.mkh.i(r4, r5)
            goto La0
        L97:
            java.io.IOException r4 = defpackage.mkh.i(r4, r5)
            goto La0
        L9c:
            java.io.IOException r4 = defpackage.mkh.i(r4, r5)
        La0:
            throw r4
        La1:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyh.U(java.io.File, kotlin.jvm.functions.Function1, nt5):java.lang.Object");
    }

    public static final void V(tn tnVar, nsh nshVar, String str, boolean z, String str2) {
        if (!(nshVar instanceof nsh)) {
            h9o.p();
            return;
        }
        d5o d5oVar = new d5o();
        h2h h2hVar = nshVar.c;
        d5oVar.b = h2hVar;
        if (h2hVar.a() != null) {
            h2hVar.a().getClass();
            String str3 = h2hVar.a().a;
            if (str3 != null) {
                d5oVar.c = str3;
            }
        }
        if (str != null && str.length() != 0) {
            if (TextUtils.isEmpty(str)) {
                qp2.o("offerToken can not be empty");
                return;
            }
            d5oVar.c = str;
        }
        if (str2 != null) {
            g40 g40Var = new g40();
            g40Var.b = str2;
            d5oVar.a = g40Var;
        }
        zzbl.zzc((h2h) d5oVar.b, "ProductDetails is required for constructing ProductDetailsParams.");
        tnVar.c = new ArrayList(Collections.singletonList(new kf3(d5oVar)));
        tnVar.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static vuj W(dn8 dn8Var, boolean z, boolean z2) {
        vuj vujVar;
        int i2;
        long j2;
        int i3;
        long jU;
        int i4;
        int i5;
        long j3;
        int i6;
        int[] iArr;
        long length = dn8Var.getLength();
        long j4 = -1;
        int i7 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j5 = 4096;
        if (i7 != 0 && length <= 4096) {
            j5 = length;
        }
        int i8 = (int) j5;
        g1g g1gVar = new g1g(64);
        int i9 = 0;
        int i10 = 0;
        boolean z3 = false;
        while (i10 < i8) {
            g1gVar.K(8);
            boolean z4 = true;
            if (!dn8Var.peekFully(g1gVar.a, i9, 8, true)) {
                break;
            }
            long jC = g1gVar.C();
            int iM = g1gVar.m();
            if (jC == 1) {
                j2 = j4;
                dn8Var.peekFully(g1gVar.a, 8, 8);
                i5 = 16;
                g1gVar.M(16);
                i3 = i10;
                jU = g1gVar.u();
                i4 = i7;
            } else {
                j2 = j4;
                if (jC == 0) {
                    long length2 = dn8Var.getLength();
                    if (length2 != j2) {
                        jC = (length2 - dn8Var.getPeekPosition()) + 8;
                    }
                }
                long j6 = jC;
                i3 = i10;
                jU = j6;
                i4 = i7;
                i5 = 8;
            }
            long j7 = i5;
            if (jU < j7) {
                vujVar = null;
                if (iM != 1718773093 || i5 != 8) {
                    return new ze2(iM, jU, i5);
                }
                jU = j7;
            } else {
                vujVar = null;
            }
            int i11 = i3 + i5;
            if (iM == 1836019574) {
                i8 += (int) jU;
                if (i4 != 0 && i8 > length) {
                    i8 = (int) length;
                }
                i10 = i11;
                i7 = i4;
                j4 = j2;
                i9 = 0;
            } else {
                if (iM != 1953653099 && iM != 1835297121 && iM != 1835626086) {
                    if (iM != 1836019558 && iM != 1836475768) {
                        if (iM == 1835295092) {
                            z3 = true;
                        }
                        if (iM != 1937007212 || jU <= 1000000) {
                            j3 = length;
                            if ((i11 + jU) - j7 < i8) {
                                int i12 = (int) (jU - j7);
                                i10 = i11 + i12;
                                if (iM != 1718909296) {
                                    i6 = 0;
                                    if (i12 != 0) {
                                        dn8Var.advancePeekPosition(i12);
                                    }
                                } else {
                                    if (i12 < 8) {
                                        return new ze2(iM, i12, 8);
                                    }
                                    g1gVar.K(i12);
                                    i6 = 0;
                                    dn8Var.peekFully(g1gVar.a, 0, i12);
                                    int iM2 = g1gVar.m();
                                    if (G(iM2, z2)) {
                                        z3 = true;
                                    }
                                    g1gVar.O(4);
                                    int iA = g1gVar.a() / 4;
                                    if (!z3 && iA > 0) {
                                        iArr = new int[iA];
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 >= iA) {
                                                z4 = z3;
                                                break;
                                            }
                                            int iM3 = g1gVar.m();
                                            iArr[i13] = iM3;
                                            if (G(iM3, z2)) {
                                                break;
                                            }
                                            i13++;
                                        }
                                    } else {
                                        z4 = z3;
                                        iArr = vujVar;
                                    }
                                    if (!z4) {
                                        return new mhk(iM2, iArr);
                                    }
                                    z3 = z4;
                                }
                            }
                        }
                        i2 = 0;
                        break;
                    }
                    i2 = 1;
                    break;
                }
                j3 = length;
                i6 = 0;
                i10 = i11;
                i9 = i6;
                i7 = i4;
                j4 = j2;
                length = j3;
            }
        }
        vujVar = null;
        i2 = i9;
        return !z3 ? n9a.i : z != i2 ? i2 != 0 ? l5b.c : l5b.d : vujVar;
    }

    public static void X(String str, boolean z) {
        SharedPreferences sharedPreferences = ht5.a;
        HashSet hashSet = new HashSet(sharedPreferences.getStringSet("subscriptions_with_persisted_messages", Collections.EMPTY_SET));
        if (hashSet.contains(str) == z) {
            return;
        }
        if (z) {
            hashSet.add(str);
        } else {
            hashSet.remove(str);
        }
        sharedPreferences.edit().putStringSet("subscriptions_with_persisted_messages", hashSet).apply();
    }

    public static void Y(String str, boolean z) {
        boolean zI = I(str);
        if (zI == z) {
            return;
        }
        if (zI) {
            s(str);
        }
        SharedPreferences sharedPreferences = t8.a.getSharedPreferences("org.chromium.components.gcm_driver.lazy_subscriptions", 0);
        HashSet hashSet = new HashSet(sharedPreferences.getStringSet("fcm_lazy_subscriptions", Collections.EMPTY_SET));
        if (zI) {
            hashSet.remove(str);
        } else {
            hashSet.add(str);
        }
        sharedPreferences.edit().putStringSet("fcm_lazy_subscriptions", hashSet).apply();
    }

    public static final PointF Z(PointF pointF, float f2) {
        return new PointF(pointF.x * f2, f2 * pointF.y);
    }

    public static final void a(rg5 rg5Var, ue5 ue5Var, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1775165595);
        int i3 = (vt9Var.h(rg5Var) ? 4 : 2) | i2 | (vt9Var.h(ue5Var) ? 32 : 16);
        byte b2 = 18;
        if (vt9Var.N(i3 & 1, (i3 & 19) != 18)) {
            mt5 mt5Var = null;
            pej pejVarF = i7e.f(null, vt9Var, 6, 2);
            int i4 = i3 & 14;
            boolean z = i4 == 4 || vt9Var.f(rg5Var);
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (z || objK == zpaVar) {
                objK = new r94(rg5Var, (byte) 12);
                vt9Var.g0(objK);
            }
            Function0 function0 = (Function0) objK;
            Object value = rg5Var.i.getValue();
            boolean zF = (i4 == 4 || vt9Var.h(rg5Var)) | vt9Var.f(pejVarF);
            Object objK2 = vt9Var.K();
            if (zF || objK2 == zpaVar) {
                objK2 = new r3(rg5Var, pejVarF, mt5Var, (byte) 21);
                vt9Var.g0(objK2);
            }
            rm5.e(vt9Var, value, (Function2) objK2);
            f(pejVarF, function0, ue5Var, vt9Var, (i3 << 3) & 896);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fx0(rg5Var, ue5Var, i2, b2);
        }
    }

    public static void a0(OutputStream outputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 << 3)) & 255);
        }
        outputStream.write(bArr);
    }

    public static final long b(float f2, boolean z, boolean z2) {
        return (Float.floatToRawIntBits(f2) << 32) | (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L);
    }

    public static void b0(int i2, ByteArrayOutputStream byteArrayOutputStream) {
        a0(byteArrayOutputStream, i2, 2);
    }

    public static yyh c(int i2, ki9 ki9Var) {
        return new yyh(i2, ki9Var, new ji9(new ii9[0]));
    }

    public static final void d(Function0 function0, Function0 function02, c8e c8eVar, ih5 ih5Var, int i2) {
        int i3;
        c8e c8eVar2;
        v62 v62Var;
        Function2 function2;
        Function2 function22;
        ah5 ah5Var;
        Function2 function23;
        int i4;
        vt9 vt9Var;
        rd3 rd3Var;
        i39 i39Var;
        Function0 function03;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(372151047);
        if ((i2 & 6) == 0) {
            i3 = i2 | (vt9Var2.h(function0) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var2.h(function02) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if (vt9Var2.N(i5 & 1, (i5 & 147) != 146)) {
            i39 i39Var2 = mpj.a;
            rd3 rd3Var2 = rbe.n;
            v62 v62Var2 = b72.c;
            db5 db5VarA = cb5.a(v62Var2, rd3Var2, vt9Var2, 0);
            int iHashCode = Long.hashCode(vt9Var2.T);
            oag oagVarL = vt9Var2.l();
            c8e c8eVarP = qyn.P(vt9Var2, i39Var2);
            bh5.To.getClass();
            vt9Var2.a0();
            boolean z = vt9Var2.S;
            Function0 function04 = m3c.S;
            if (z) {
                vt9Var2.k(function04);
            } else {
                vt9Var2.j0();
            }
            Function2 function24 = ujp.f;
            y4h.o(vt9Var2, db5VarA, function24);
            Function2 function25 = ujp.e;
            y4h.o(vt9Var2, oagVarL, function25);
            Integer numValueOf = Integer.valueOf(iHashCode);
            ah5 ah5Var2 = ujp.g;
            y4h.o(vt9Var2, numValueOf, ah5Var2);
            y4h.m(vt9Var2);
            Function2 function26 = ujp.d;
            y4h.o(vt9Var2, c8eVarP, function26);
            unf unfVar = pof.a;
            if (((spf) vt9Var2.j(tpf.a)).b != l2n.a) {
                vt9Var2.W(38804314);
                i39Var = i39Var2;
                function22 = function26;
                ah5Var = ah5Var2;
                i4 = i5;
                function03 = function04;
                function23 = function24;
                vt9Var = vt9Var2;
                v62Var = v62Var2;
                function2 = function25;
                rd3Var = rd3Var2;
                xf8.j(phj.h0(vt9Var2, 2131232692), null, i39Var, null, jr5.c, 0.0f, null, vt9Var, 25016, pd.V0);
                vt9Var.p(false);
            } else {
                v62Var = v62Var2;
                function2 = function25;
                function22 = function26;
                ah5Var = ah5Var2;
                function23 = function24;
                i4 = i5;
                vt9Var = vt9Var2;
                rd3Var = rd3Var2;
                i39Var = i39Var2;
                function03 = function04;
                vt9Var.W(39072433);
                vt9Var.p(false);
            }
            pof.b.getClass();
            i39 i39Var3 = i39Var;
            c8e c8eVarB0 = a26.b0(i39Var3, 24.0f, 24.0f, 24.0f, 0.0f, 8);
            db5 db5VarA2 = cb5.a(v62Var, rd3Var, vt9Var, 0);
            int iHashCode2 = Long.hashCode(vt9Var.T);
            oag oagVarL2 = vt9Var.l();
            c8e c8eVarP2 = qyn.P(vt9Var, c8eVarB0);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(function03);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, db5VarA2, function23);
            y4h.o(vt9Var, oagVarL2, function2);
            ah5 ah5Var3 = ah5Var;
            u35.j(iHashCode2, vt9Var, ah5Var3, vt9Var);
            y4h.o(vt9Var, c8eVarP2, function22);
            vt9 vt9Var3 = vt9Var;
            Function2 function27 = function23;
            Function2 function28 = function2;
            Function0 function05 = function03;
            int i6 = i4;
            Function2 function29 = function22;
            ijl.b(mzg.q(vt9Var, 2132022054), null, pof.a(vt9Var).a.f(), 0L, null, 0L, null, null, 0L, 2, false, 10, 0, pof.b(vt9Var).g, vt9Var3, 0, 24960, 110586);
            String strQ = mzg.q(vt9Var3, 2132022055);
            ikl iklVar = pof.b(vt9Var3).j;
            long jW = pof.a(vt9Var3).a.w();
            z7e z7eVar = z7e.b;
            ijl.b(strQ, a26.b0(z7eVar, 0.0f, 16.0f, 0.0f, 0.0f, 13), jW, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, iklVar, vt9Var3, 0, 0, 131064);
            vt9Var2 = vt9Var3;
            vt9Var2.p(true);
            c8e c8eVarY = a26.Y(wxe.Q(i39Var3), 24.0f, 20.0f);
            o9i o9iVarA = m9i.a(new x62(8.0f, true, new bi(rbe.p, (byte) 26)), rbe.k, vt9Var2, 0);
            int iHashCode3 = Long.hashCode(vt9Var2.T);
            oag oagVarL3 = vt9Var2.l();
            c8e c8eVarP3 = qyn.P(vt9Var2, c8eVarY);
            vt9Var2.a0();
            if (vt9Var2.S) {
                vt9Var2.k(function05);
            } else {
                vt9Var2.j0();
            }
            y4h.o(vt9Var2, o9iVarA, function27);
            y4h.o(vt9Var2, oagVarL3, function28);
            u35.j(iHashCode3, vt9Var2, ah5Var3, vt9Var2);
            y4h.o(vt9Var2, c8eVarP3, function29);
            scd.f(function02, mzg.q(vt9Var2, 2132020043), null, false, false, smf.d, null, null, null, null, null, null, null, null, vt9Var2, ((i6 >> 3) & 14) | 196608, 0, 16348);
            scd.f(function0, mzg.q(vt9Var2, 2132018378), null, false, false, smf.a, null, null, null, null, null, null, null, null, vt9Var2, (i6 & 14) | 196608, 0, 16348);
            vt9Var2.p(true);
            vt9Var2.p(true);
            c8eVar2 = z7eVar;
        } else {
            vt9Var2.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var2.r();
        if (znhVarR != null) {
            znhVarR.d = new v0a(function0, function02, c8eVar2, i2, (byte) 0);
        }
    }

    public static final xqb e(SerialDescriptor serialDescriptor) {
        String str = "Value of type '" + serialDescriptor.i() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.d() + '\'';
        serialDescriptor.i();
        return new xqb(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.", (Exception) null, 8);
    }

    public static final void f(pej pejVar, Function0 function0, ue5 ue5Var, ih5 ih5Var, int i2) {
        vt9 vt9Var;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-2023917498);
        int i3 = i2 | (vt9Var2.f(pejVar) ? 4 : 2) | (vt9Var2.h(function0) ? 32 : 16) | (vt9Var2.h(ue5Var) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY);
        if (vt9Var2.N(i3 & 1, (i3 & 147) != 146)) {
            vt9Var2.S();
            if ((i2 & 1) != 0 && !vt9Var2.x()) {
                vt9Var2.Q();
            }
            vt9Var2.q();
            float dimension = ((Resources) vt9Var2.j(j41.c)).getDimension(2131165347) / ((n27) vt9Var2.j(mi5.h)).b();
            boolean zC = vt9Var2.c(dimension);
            Object objK = vt9Var2.K();
            if (zC || objK == hh5.a) {
                u8i u8iVar = v8i.a;
                objK = new u8i(new hh7(dimension), new hh7(dimension), new hh7(0.0f), new hh7(0.0f));
                vt9Var2.g0(objK);
            }
            unf unfVar = pof.a;
            long jZ = pof.a(vt9Var2).a.z();
            vt9Var = vt9Var2;
            i7e.a(function0, oup.m0(z7e.b, hkf.a), pejVar, 0.0f, false, (u8i) objK, jZ, 0L, u95.f, null, null, null, gyg.P(-1937474780, new sg5(jZ, ue5Var, function0), vt9Var2), vt9Var, ((i3 >> 3) & 14) | 805306368 | ((i3 << 6) & 896), 6552);
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new g9(pejVar, function0, ue5Var, i2, (byte) 10, false);
        }
    }

    public static final void g(long j2, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-732444905);
        int i3 = (vt9Var.e(j2) ? 4 : 2) | i2;
        if (vt9Var.N(i3 & 1, (i3 & 3) != 2)) {
            View view = (View) vt9Var.j(j41.f);
            int iU0 = cs5.u0(j2);
            Integer numValueOf = Integer.valueOf(iU0);
            boolean zH = vt9Var.h(view) | vt9Var.d(iU0);
            Object objK = vt9Var.K();
            if (zH || objK == hh5.a) {
                objK = new ug5(view, iU0, (byte) 0);
                vt9Var.g0(objK);
            }
            Function0 function0 = (Function0) objK;
            if (vt9Var.f(view) | vt9Var.f(numValueOf)) {
                rm5.L(vt9Var, function0);
            }
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new vg5(j2, i2);
        }
    }

    public static final void h(ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(2045804959);
        if (vt9Var.N(i2 & 1, i2 != 0)) {
            View view = (View) vt9Var.j(j41.f);
            boolean zH = vt9Var.h(view);
            Object objK = vt9Var.K();
            if (zH || objK == hh5.a) {
                objK = new tg5(view, (byte) 0);
                vt9Var.g0(objK);
            }
            Function0 function0 = (Function0) objK;
            if (vt9Var.f(view)) {
                rm5.L(vt9Var, function0);
            }
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new gf5(i2);
        }
    }

    public static final boolean i(n6b n6bVar) {
        return !n6bVar.h && n6bVar.d;
    }

    public static final boolean j(n6b n6bVar) {
        return n6bVar.h && !n6bVar.d;
    }

    public static final void k(long j2, long j3, long j4) {
        if (j3 < 0 || j4 > j2) {
            StringBuilder sbQ = p3p.q(j3, "startIndex (", ") and endIndex (");
            sbQ.append(j4);
            sbQ.append(") are not within the range [0..size(");
            sbQ.append(j2);
            sbQ.append("))");
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        if (j3 <= j4) {
            return;
        }
        StringBuilder sbQ2 = p3p.q(j3, "startIndex (", ") > endIndex (");
        sbQ2.append(j4);
        sbQ2.append(')');
        throw new IllegalArgumentException(sbQ2.toString());
    }

    public static final void l(long j2, long j3) {
        if (0 > j2 || j2 < j3 || j3 < 0) {
            qp2.o(j7c.o(j2, "))", p3p.q(j3, "offset (0) and byteCount (", ") are not within the range [0..size(")));
        }
    }

    public static c8e m(c8e c8eVar) {
        return c8eVar.d(new yw4(new mr3((byte) 21)));
    }

    public static byte[] n(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static void o(long[] jArr, long[] jArr2, int i2) {
        jArr2[i2] = jArr[0];
        jArr2[i2 + 1] = jArr[1];
        jArr2[i2 + 2] = jArr[2];
        jArr2[i2 + 3] = jArr[3];
        jArr2[i2 + 4] = jArr[4];
        jArr2[i2 + 5] = jArr[5];
        jArr2[i2 + 6] = jArr[6];
        jArr2[i2 + 7] = jArr[7];
        jArr2[i2 + 8] = jArr[8];
    }

    public static void p(long[] jArr, long[] jArr2, int i2) {
        int i3 = -i2;
        for (int i4 = 0; i4 < 10; i4++) {
            int i5 = (int) jArr[i4];
            jArr[i4] = i5 ^ ((((int) jArr2[i4]) ^ i5) & i3);
        }
    }

    public static t87 q(q0 q0Var, int i2) {
        qci vciVar;
        if (q0Var.p(kge.a)) {
            vciVar = new qci();
        } else {
            if (!q0Var.p(kge.m)) {
                s49.l(q0Var, "unrecognized digest OID: ");
                return null;
            }
            vciVar = new vci(NotificationCompat.FLAG_LOCAL_ONLY);
        }
        return (kge.m.p(q0Var) || vciVar.d() != i2) ? new w87(vciVar, i2, (byte) 1) : vciVar;
    }

    public static final int r(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static void s(String str) {
        t8.a.getSharedPreferences("org.chromium.components.gcm_driver.lazy_subscriptions", 0).edit().remove(str).apply();
        X(str, false);
    }

    public static final float t(gu6 gu6Var) {
        return gu6Var.m().e == fsf.b ? Float.intBitsToFloat((int) (gu6Var.q() >> 32)) : Float.intBitsToFloat((int) (gu6Var.q() & 4294967295L));
    }

    public static byte[] u(String str, Key key) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr = new byte[16];
        q36.a.nextBytes(bArr);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        try {
            cipher.init(1, key, new IvParameterSpec(bArr));
            byte[] bArrDoFinal = cipher.doFinal(str.getBytes(Charsets.UTF_8));
            byte[] bArr2 = new byte[bArrDoFinal.length + 16];
            for (int i2 = 0; i2 < 16; i2++) {
                bArr2[i2] = bArr[i2];
            }
            int length = bArrDoFinal.length;
            for (int i3 = 0; i3 < length; i3++) {
                bArr2[i3 + 16] = bArrDoFinal[i3];
            }
            return bArr2;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final String v(int i2, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i2 >= 0) {
            sb.append("Unexpected JSON token at offset " + i2 + ": ");
        }
        sb.append(str);
        if (str2 != null && !StringsKt.N(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !StringsKt.N(str3)) {
            sb.append("\n" + str3);
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    public static gw0 w(orb orbVar) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = orbVar.b("navs").a;
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(x70.a(jSONArray.getInt(i2)));
        }
        t70 t70VarA = t70.a(orbVar.a.getInt("ep"));
        orb orbVarI = orbVar.i("a");
        return new gw0(t70VarA, orbVarI != null ? new fw0(orbVarI.m("c", (String) null), orbVarI.m("s", (String) null), orbVarI.m("t", (String) null)) : null, arrayList);
    }

    public static esd x(String str) {
        ucd ucdVarH = esd.e.h(0, str);
        if (ucdVarH == null) {
            qp2.o(am2.m('\"', "No subtype found for: \"", str));
            return null;
        }
        String str2 = (String) ucdVarH.a().get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        String lowerCase2 = ((String) ucdVarH.a().get(2)).toLowerCase(locale);
        ArrayList arrayList = new ArrayList();
        int i2 = ((a) ucdVarH.b()).b;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= str.length()) {
                return new esd(str, lowerCase, (String[]) arrayList.toArray(new String[0]), lowerCase2);
            }
            ucd ucdVarH2 = esd.f.h(i3, str);
            if (ucdVarH2 == null) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(i3) + "\" for: \"" + str + '\"').toString());
            }
            e5 e5Var = ucdVarH2.c;
            MatchGroup matchGroupG = e5Var.g(1);
            String str3 = matchGroupG != null ? matchGroupG.a : null;
            if (str3 == null) {
                i2 = ((a) ucdVarH2.b()).b;
            } else {
                MatchGroup matchGroupG2 = e5Var.g(2);
                String strH = matchGroupG2 != null ? matchGroupG2.a : null;
                if (strH == null) {
                    strH = e5Var.g(3).a;
                } else if (StringsKt.c0(strH, '\'') && StringsKt.I(strH, '\'') && strH.length() > 2) {
                    strH = p3p.h(1, 1, strH);
                }
                arrayList.add(str3);
                arrayList.add(strH);
                i2 = ((a) ucdVarH2.b()).b;
            }
        }
    }

    public static byte[] y(Cursor cursor, int i2) {
        if (cursor.getType(i2) != 3) {
            return cursor.getBlob(i2);
        }
        return e82.z(cursor.getBlob(i2), djh.j(0, r2.length - 1));
    }

    public static byte[] z(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            return null;
        }
        if (type != 3) {
            return cursor.getBlob(i2);
        }
        return e82.z(cursor.getBlob(i2), djh.j(0, r2.length - 1));
    }
}
