package defpackage;

import ads_mobile_sdk.xu0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.animation.BaseInterpolator;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.content.FileProvider;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.c;
import okhttp3.internal._HeadersCommonKt;
import org.chromium.net.NetworkChangeNotifier;

/* loaded from: classes.dex */
public abstract class w7d {
    public static volatile Handler a;
    public static j06 c;
    public static SecretKey i;
    public static final ue5 b = new ue5(1146212646, new gf5((byte) 3), false);
    public static final Object d = new Object();
    public static final Object e = new Object();
    public static final StackTraceElement[] f = new StackTraceElement[0];
    public static final hai g = new hai((byte) 29);
    public static final Object h = new Object();
    public static final iip j = new iip(2);

    public static fq A(int i2, int i3) {
        if (i3 < 50) {
            vr3 vr3Var = xu0.a;
            xu0.c("The maximum height set for the inline adaptive ad size was " + i3 + " dp, which is below the minimum recommended value of 50 dp.", null);
        }
        if (i3 >= 1) {
            return new fq(i2, i3, 44, null);
        }
        bxl.d(sko.i(i3, "Invalid maxHeight for inline adaptive banner: "));
        return null;
    }

    public static ArrayList C(gig gigVar) {
        ArrayList arrayList = new ArrayList();
        gql currentTimeline = gigVar.getCurrentTimeline();
        int iA = currentTimeline.a(true);
        for (int i2 = 0; i2 < gigVar.p(); i2++) {
            arrayList.add(gigVar.Q(iA));
            iA = currentTimeline.e(iA, 0, true);
        }
        return arrayList;
    }

    public static final byte[] E(String str, String str2) throws IllegalStateException, NoSuchAlgorithmException, IOException, InvalidKeyException {
        Mac mac;
        byte[] bytes;
        SecretKey secretKeyI = I();
        if (secretKeyI != null) {
            try {
                mac = Mac.getInstance("HmacSHA256");
                mac.init(secretKeyI);
            } catch (GeneralSecurityException unused) {
            }
        } else {
            mac = null;
        }
        if (mac == null) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                Charset charset = Charsets.UTF_8;
                byte[] bytes2 = str.getBytes(charset);
                dataOutputStream.writeInt(bytes2.length);
                dataOutputStream.write(bytes2);
                if (str2 == null || (bytes = str2.getBytes(charset)) == null) {
                    bytes = new byte[0];
                }
                dataOutputStream.writeInt(bytes.length);
                dataOutputStream.write(bytes);
                dataOutputStream.close();
                mac.update(byteArrayOutputStream.toByteArray());
                return mac.doFinal();
            } finally {
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public static Rect F(View view, FrameLayout frameLayout) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        frameLayout.getLocationInWindow(iArr2);
        int i2 = iArr[0] - iArr2[0];
        int i3 = iArr[1] - iArr2[1];
        return new Rect(i2, i3, view.getWidth() + i2, view.getHeight() + i3);
    }

    public static void G(String str) {
        synchronized (e) {
            e(str, null);
        }
    }

    public static final boolean H(int i2, int i3, long j2) {
        int iJ = yo5.j(j2);
        if (i2 > yo5.h(j2) || iJ > i2) {
            return false;
        }
        return i3 <= yo5.g(j2) && yo5.i(j2) <= i3;
    }

    public static SecretKey I() {
        synchronized (h) {
            SecretKey secretKey = i;
            if (secretKey != null) {
                return secretKey;
            }
            Context context = t8.a;
            File file = new File(context.getNoBackupFilesDir(), "webapp-authenticator");
            tgk tgkVarM = tgk.m();
            try {
                SecretKeySpec secretKeySpec = null;
                if (file.exists()) {
                    if (file.length() == 32) {
                        byte[] bArr = new byte[32];
                        try {
                            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                            try {
                                dataInputStream.readFully(bArr);
                                dataInputStream.close();
                                secretKeySpec = new SecretKeySpec(bArr, "HmacSHA256");
                            } finally {
                            }
                        } catch (IOException unused) {
                        }
                    }
                    i = secretKeySpec;
                } else {
                    try {
                        KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA256");
                        keyGenerator.init(NotificationCompat.FLAG_LOCAL_ONLY, new SecureRandom());
                        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
                        if (N(context, file, secretKeyGenerateKey)) {
                            i = secretKeyGenerateKey;
                            tgkVarM.close();
                            return secretKeyGenerateKey;
                        }
                    } catch (NoSuchAlgorithmException e2) {
                        throw new IllegalStateException("HmacSHA256 is not available", e2);
                    }
                }
                tgkVarM.close();
                return secretKeySpec;
            } finally {
            }
        }
    }

    public static void J(int i2, t87 t87Var) {
        t87Var.a((byte) (i2 >>> 24));
        t87Var.a((byte) (i2 >>> 16));
        t87Var.a((byte) (i2 >>> 8));
        t87Var.a((byte) i2);
    }

    public static void K(String str) {
        synchronized (e) {
            e(str, null);
        }
    }

    public static void L(String str, Throwable th) {
        synchronized (e) {
            e(str, th);
        }
    }

    public static int M(lza lzaVar, lza lzaVar2) {
        return (Math.min(lzaVar.getWidth(), lzaVar2.getWidth()) * Math.max(0, lzaVar.getHeight() - lzaVar2.getHeight())) + (lzaVar.getHeight() * Math.max(0, lzaVar.getWidth() - lzaVar2.getWidth()));
    }

    public static boolean N(Context context, File file, SecretKey secretKey) throws IOException {
        byte[] encoded = secretKey.getEncoded();
        if (encoded.length != 32) {
            return false;
        }
        File file2 = new File(context.getNoBackupFilesDir(), "webapp-authenticator.tmp");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                fileOutputStream.write(encoded);
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                if (file2.renameTo(file)) {
                    return true;
                }
                file2.delete();
                return false;
            } finally {
            }
        } catch (IOException unused) {
            file2.delete();
            return false;
        }
    }

    public static final void a(c8e c8eVar, hp7 hp7Var, ue5 ue5Var, ih5 ih5Var, int i2) {
        int i3;
        ue5 ue5Var2 = ic4.b;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-714464401);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.f(c8eVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.f(hp7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var.h(ue5Var2) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= vt9Var.h(ue5Var) ? 2048 : 1024;
        }
        if (vt9Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            Object objK = vt9Var.K();
            if (objK == hh5.a) {
                t0g t0gVar = new t0g(null, qs7.g);
                vt9Var.g0(t0gVar);
                objK = t0gVar;
            }
            fb3 fb3VarH = h(ue5Var2, vt9Var, (i3 >> 6) & 14);
            kfo.c(hp7Var.a(fb3VarH), gyg.P(274270255, new px0(c8eVar, (afe) objK, ue5Var, fb3VarH), vt9Var), vt9Var, 56);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ga1((Object) c8eVar, (Object) hp7Var, (Object) ue5Var, i2, (byte) 1);
        }
    }

    public static int b(Context context, int i2) {
        Resources resources = context.getApplicationContext().getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return (i2 == resources.getConfiguration().orientation || i2 == 0) ? zed.b(displayMetrics.heightPixels / displayMetrics.density) : zed.b(displayMetrics.widthPixels / displayMetrics.density);
    }

    public static fq c(int i2, Context context, int i3) {
        return new fq(i2, Math.max(Math.min(i2 > 655 ? zed.b((i2 / 728.0f) * 90.0f) : i2 > 632 ? 81 : i2 > 526 ? zed.b((i2 / 468.0f) * 60.0f) : i2 > 432 ? 68 : zed.b((i2 / 320.0f) * 50.0f), Math.min(90, zed.a(b(context, i3) * 0.15d))), 50), 52, null);
    }

    public static final void d(final View view, BaseInterpolator baseInterpolator, long j2, final float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        if (scaleX < scaleY) {
            scaleX = scaleY;
        }
        Object tag = view.getTag(2131364521);
        if (tag != null) {
            ((w46) tag).a.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(scaleX, f2);
        view.setTag(2131364521, new w46(valueAnimatorOfFloat));
        valueAnimatorOfFloat.setInterpolator(baseInterpolator);
        valueAnimatorOfFloat.setDuration(j2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: iq8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f2;
                View view2 = view;
                view2.setScaleX(fFloatValue);
                view2.setScaleY(fFloatValue);
            }
        });
        valueAnimatorOfFloat.addListener(new nt7(view, f2, (byte) 1));
        valueAnimatorOfFloat.start();
    }

    public static void e(String str, Throwable th) {
        String strReplace;
        String str2;
        if (th == null) {
            str2 = null;
        } else {
            synchronized (e) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    } else {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    }
                }
            }
            str2 = strReplace;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        str2.replace("\n", "\n  ");
    }

    public static c8e f(c8e c8eVar) {
        return c8eVar.d(new oa2(uup.d));
    }

    public static fq g(int i2, Context context, int i3) {
        return new fq(i2, Math.max(Math.min(Math.max(100, zed.b((i2 / 320.0f) * 100.0f)), Math.min(150, zed.a(b(context, i3) * 0.2d))), 50), 28, null);
    }

    public static final fb3 h(ue5 ue5Var, ih5 ih5Var, int i2) {
        boolean z = (((i2 & 14) ^ 6) > 4 && ((vt9) ih5Var).f(ue5Var)) || (i2 & 6) == 4;
        vt9 vt9Var = (vt9) ih5Var;
        Object objK = vt9Var.K();
        zpa zpaVar = hh5.a;
        if (z || objK == zpaVar) {
            objK = new fb3(ue5Var);
            vt9Var.g0(objK);
        }
        fb3 fb3Var = (fb3) objK;
        boolean zF = vt9Var.f(fb3Var);
        Object objK2 = vt9Var.K();
        if (zF || objK2 == zpaVar) {
            objK2 = new t02(fb3Var, (byte) 23);
            vt9Var.g0(objK2);
        }
        rm5.b(fb3Var, (Function1) objK2, vt9Var);
        return fb3Var;
    }

    public static final d3k i(f99 f99Var, nx5 nx5Var, Function2 function2) {
        return j14.Y(new z99(f99Var, function2, (byte) 2), nx5Var);
    }

    public static afe j() {
        return new t0g(Unit.a, qs7.g);
    }

    public static int k(lza lzaVar, kza kzaVar) {
        if (lzaVar.getWidth() <= 0 || lzaVar.getHeight() <= 0) {
            qp2.o("Zero or negative size: ".concat(lzaVar.d()));
            return 0;
        }
        if (kzaVar.getWidth() <= 0 || kzaVar.getHeight() <= 0) {
            qp2.o("Zero or negative size: ".concat(kzaVar.d()));
            return 0;
        }
        if (lzaVar == kzaVar || (lzaVar.getWidth() == kzaVar.a && lzaVar.getHeight() == kzaVar.b)) {
            return 0;
        }
        if (lzaVar.getWidth() > Integer.MAX_VALUE / lzaVar.getHeight() || kzaVar.getWidth() > Integer.MAX_VALUE / kzaVar.getHeight()) {
            return Integer.MAX_VALUE;
        }
        return M(lzaVar, kzaVar) + (M(kzaVar, lzaVar) << 1);
    }

    public static rce l(String str, String str2, rvh rvhVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("form-data; name=");
        esd esdVar = sce.e;
        aib.k(sb, str);
        if (str2 != null) {
            sb.append("; filename=");
            aib.k(sb, str2);
        }
        String string = sb.toString();
        b9a b9aVar = new b9a();
        _HeadersCommonKt.headersCheckName("Content-Disposition");
        _HeadersCommonKt.commonAddLenient(b9aVar, "Content-Disposition", string);
        e9a e9aVarCommonBuild = _HeadersCommonKt.commonBuild(b9aVar);
        if ((e9aVarCommonBuild != null ? _HeadersCommonKt.commonHeadersGet(e9aVarCommonBuild.a, "Content-Type") : null) != null) {
            qp2.o("Unexpected header: Content-Type");
            return null;
        }
        if ((e9aVarCommonBuild != null ? _HeadersCommonKt.commonHeadersGet(e9aVarCommonBuild.a, "Content-Length") : null) == null) {
            return new rce(e9aVarCommonBuild, rvhVar);
        }
        qp2.o("Unexpected header: Content-Length");
        return null;
    }

    public static void m(String str) {
        synchronized (e) {
            e(str, null);
        }
    }

    public static g54 n(String str) {
        int i2;
        char cCharAt;
        byte[] bArr = a.a;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i3 = (int) ((length * 6) / 8);
        byte[] bArrCopyOf = new byte[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i4 < length) {
                char cCharAt2 = str.charAt(i4);
                if ('A' <= cCharAt2 && cCharAt2 < '[') {
                    i2 = cCharAt2 - 'A';
                } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                    i2 = cCharAt2 - 'G';
                } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                    i2 = cCharAt2 + 4;
                } else if (cCharAt2 != '+' && cCharAt2 != '-') {
                    if (cCharAt2 != '/' && cCharAt2 != '_') {
                        if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                            break;
                        }
                        i4++;
                    } else {
                        i2 = 63;
                    }
                } else {
                    i2 = 62;
                }
                i6 = (i6 << 6) | i2;
                i5++;
                if (i5 % 4 == 0) {
                    bArrCopyOf[i7] = (byte) (i6 >> 16);
                    int i8 = i7 + 2;
                    bArrCopyOf[i7 + 1] = (byte) (i6 >> 8);
                    i7 += 3;
                    bArrCopyOf[i8] = (byte) i6;
                }
                i4++;
            } else {
                int i9 = i5 % 4;
                if (i9 != 1) {
                    if (i9 == 2) {
                        bArrCopyOf[i7] = (byte) ((i6 << 12) >> 16);
                        i7++;
                    } else if (i9 == 3) {
                        int i10 = i6 << 6;
                        int i11 = i7 + 1;
                        bArrCopyOf[i7] = (byte) (i10 >> 16);
                        i7 += 2;
                        bArrCopyOf[i11] = (byte) (i10 >> 8);
                    }
                    if (i7 != i3) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i7);
                    }
                }
            }
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new g54(bArrCopyOf);
        }
        return null;
    }

    public static g54 o(String str) {
        if (str.length() % 2 != 0) {
            bxl.d("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 << 1;
            bArr[i2] = (byte) (wyh.r(str.charAt(i3 + 1)) + (wyh.r(str.charAt(i3)) << 4));
        }
        return new g54(bArr);
    }

    public static boolean p(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
            return false;
        }
        for (int i2 : hdrCapabilities.getSupportedHdrTypes()) {
            if (i2 == 1) {
                return true;
            }
        }
        return false;
    }

    public static void q(String str) {
        synchronized (e) {
            e(str, null);
        }
    }

    public static void r(String str, Throwable th) {
        synchronized (e) {
            e(str, th);
        }
    }

    public static final byte[] s(CharsetEncoder charsetEncoder, CharSequence charSequence, int i2, int i3) throws CharacterCodingException {
        if (charSequence instanceof String) {
            if (i2 == 0) {
                String str = (String) charSequence;
                if (i3 == str.length()) {
                    return str.getBytes(charsetEncoder.charset());
                }
            }
            return ((String) charSequence).substring(i2, i3).getBytes(charsetEncoder.charset());
        }
        ByteBuffer byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i2, i3));
        byte[] bArr = null;
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferEncode.array();
            if (bArrArray.length == byteBufferEncode.remaining()) {
                bArr = bArrArray;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr2);
        return bArr2;
    }

    public static g54 t(String str) {
        g54 g54Var = new g54(str.getBytes(Charsets.UTF_8));
        g54Var.c = str;
        return g54Var;
    }

    public static String u(MessageDigest messageDigest, v7a v7aVar) {
        byte[] bArrDigest = messageDigest.digest();
        int iOrdinal = v7aVar.ordinal();
        int i2 = 0;
        if (iOrdinal == 0) {
            StringBuilder sb = new StringBuilder(bArrDigest.length << 1);
            int length = bArrDigest.length;
            while (i2 < length) {
                byte b2 = bArrDigest[i2];
                char[] cArr = f8a.k;
                sb.append(cArr[(b2 >> 4) & 15]);
                sb.append(cArr[b2 & 15]);
                i2++;
            }
            return sb.toString();
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return Base64.encodeToString(bArrDigest, 2);
            }
            if (iOrdinal == 3) {
                return Base64.encodeToString(bArrDigest, 10);
            }
            if (iOrdinal == 4) {
                return Base64.encodeToString(bArrDigest, 11);
            }
            h9o.p();
            return null;
        }
        StringBuilder sb2 = new StringBuilder(bArrDigest.length << 1);
        int length2 = bArrDigest.length;
        while (i2 < length2) {
            byte b3 = bArrDigest[i2];
            char[] cArr2 = f8a.l;
            sb2.append(cArr2[(b3 >> 4) & 15]);
            sb2.append(cArr2[b3 & 15]);
            i2++;
        }
        return sb2.toString();
    }

    public static final String v(String str) {
        String string = StringsKt.l0(str).toString();
        return StringsKt.N(string) ? string : StringsKt.E(string, "://", false) ? c.o(string, "http://", "https://") : "https://".concat(string);
    }

    public static Uri x(File file) {
        synchronized (d) {
            j06 j06Var = c;
            if (j06Var == null) {
                return null;
            }
            j06Var.getClass();
            Context context = t8.a;
            return FileProvider.getUriForFile(context, context.getPackageName() + ".FileProvider", file);
        }
    }

    public static HashMap y() {
        HashMap map = new HashMap(286);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        arrayList.add("BB");
        arrayList.add("BM");
        arrayList.add("BS");
        arrayList.add("CA");
        arrayList.add("DM");
        arrayList.add("DO");
        arrayList.add("GD");
        arrayList.add("GU");
        arrayList.add("JM");
        arrayList.add("KN");
        arrayList.add("KY");
        arrayList.add("LC");
        arrayList.add("MP");
        arrayList.add("MS");
        arrayList.add("PR");
        arrayList.add("SX");
        arrayList.add("TC");
        arrayList.add("TT");
        arrayList.add("VC");
        arrayList.add("VG");
        arrayList.add("VI");
        map.put(1, arrayList);
        ArrayList arrayList2 = new ArrayList(2);
        arrayList2.add("RU");
        arrayList2.add("KZ");
        ArrayList arrayListI = u35.i(36, map, u35.i(34, map, u35.i(33, map, u35.i(32, map, u35.i(31, map, u35.i(30, map, u35.i(27, map, u35.i(20, map, u35.i(7, map, arrayList2, 1, "EG"), 1, "ZA"), 1, "GR"), 1, "NL"), 1, "BE"), 1, "FR"), 1, "ES"), 1, "HU"), 2, "IT");
        arrayListI.add("VA");
        map.put(39, arrayListI);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add("RO");
        ArrayList arrayListI2 = u35.i(43, map, u35.i(41, map, u35.i(40, map, arrayList3, 1, "CH"), 1, "AT"), 4, "GB");
        arrayListI2.add("GG");
        arrayListI2.add("IM");
        arrayListI2.add("JE");
        map.put(44, arrayListI2);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add("DK");
        ArrayList arrayListI3 = u35.i(46, map, u35.i(45, map, arrayList4, 1, "SE"), 2, "NO");
        arrayListI3.add("SJ");
        map.put(47, arrayListI3);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("PL");
        ArrayList arrayListI4 = u35.i(60, map, u35.i(58, map, u35.i(57, map, u35.i(56, map, u35.i(55, map, u35.i(54, map, u35.i(53, map, u35.i(52, map, u35.i(51, map, u35.i(49, map, u35.i(48, map, arrayList5, 1, "DE"), 1, "PE"), 1, "MX"), 1, "CU"), 1, "AR"), 1, "BR"), 1, "CL"), 1, "CO"), 1, "VE"), 1, "MY"), 3, "AU");
        arrayListI4.add("CC");
        arrayListI4.add("CX");
        map.put(61, arrayListI4);
        ArrayList arrayList6 = new ArrayList(1);
        arrayList6.add("ID");
        ArrayList arrayListI5 = u35.i(211, map, u35.i(98, map, u35.i(95, map, u35.i(94, map, u35.i(93, map, u35.i(92, map, u35.i(91, map, u35.i(90, map, u35.i(86, map, u35.i(84, map, u35.i(82, map, u35.i(81, map, u35.i(66, map, u35.i(65, map, u35.i(64, map, u35.i(63, map, u35.i(62, map, arrayList6, 1, "PH"), 1, "NZ"), 1, "SG"), 1, "TH"), 1, "JP"), 1, "KR"), 1, "VN"), 1, "CN"), 1, "TR"), 1, "IN"), 1, "PK"), 1, "AF"), 1, "LK"), 1, "MM"), 1, "IR"), 1, "SS"), 2, "MA");
        arrayListI5.add("EH");
        map.put(212, arrayListI5);
        ArrayList arrayList7 = new ArrayList(1);
        arrayList7.add("DZ");
        ArrayList arrayListI6 = u35.i(261, map, u35.i(260, map, u35.i(258, map, u35.i(257, map, u35.i(NotificationCompat.FLAG_LOCAL_ONLY, map, u35.i(255, map, u35.i(254, map, u35.i(253, map, u35.i(252, map, u35.i(251, map, u35.i(250, map, u35.i(249, map, u35.i(248, map, u35.i(247, map, u35.i(246, map, u35.i(245, map, u35.i(244, map, u35.i(243, map, u35.i(242, map, u35.i(241, map, u35.i(240, map, u35.i(239, map, u35.i(238, map, u35.i(237, map, u35.i(236, map, u35.i(235, map, u35.i(234, map, u35.i(233, map, u35.i(232, map, u35.i(231, map, u35.i(230, map, u35.i(229, map, u35.i(228, map, u35.i(227, map, u35.i(226, map, u35.i(225, map, u35.i(224, map, u35.i(223, map, u35.i(222, map, u35.i(221, map, u35.i(220, map, u35.i(218, map, u35.i(216, map, u35.i(213, map, arrayList7, 1, "TN"), 1, "LY"), 1, "GM"), 1, "SN"), 1, "MR"), 1, "ML"), 1, "GN"), 1, "CI"), 1, "BF"), 1, "NE"), 1, "TG"), 1, "BJ"), 1, "MU"), 1, "LR"), 1, "SL"), 1, "GH"), 1, "NG"), 1, "TD"), 1, "CF"), 1, "CM"), 1, "CV"), 1, "ST"), 1, "GQ"), 1, "GA"), 1, "CG"), 1, "CD"), 1, "AO"), 1, "GW"), 1, "IO"), 1, "AC"), 1, "SC"), 1, "SD"), 1, "RW"), 1, "ET"), 1, "SO"), 1, "DJ"), 1, "KE"), 1, "TZ"), 1, "UG"), 1, "BI"), 1, "MZ"), 1, "ZM"), 1, "MG"), 2, "RE");
        arrayListI6.add("YT");
        map.put(262, arrayListI6);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add("ZW");
        ArrayList arrayListI7 = u35.i(269, map, u35.i(268, map, u35.i(267, map, u35.i(266, map, u35.i(265, map, u35.i(264, map, u35.i(263, map, arrayList8, 1, "NA"), 1, "MW"), 1, "LS"), 1, "BW"), 1, "SZ"), 1, "KM"), 2, "SH");
        arrayListI7.add("TA");
        map.put(290, arrayListI7);
        ArrayList arrayList9 = new ArrayList(1);
        arrayList9.add("ER");
        ArrayList arrayListI8 = u35.i(357, map, u35.i(356, map, u35.i(355, map, u35.i(354, map, u35.i(353, map, u35.i(352, map, u35.i(351, map, u35.i(350, map, u35.i(299, map, u35.i(298, map, u35.i(297, map, u35.i(291, map, arrayList9, 1, "AW"), 1, "FO"), 1, "GL"), 1, "GI"), 1, "PT"), 1, "LU"), 1, "IE"), 1, "IS"), 1, "AL"), 1, "MT"), 1, "CY"), 2, "FI");
        arrayListI8.add("AX");
        map.put(358, arrayListI8);
        ArrayList arrayList10 = new ArrayList(1);
        arrayList10.add("BG");
        ArrayList arrayListI9 = u35.i(509, map, u35.i(508, map, u35.i(507, map, u35.i(506, map, u35.i(505, map, u35.i(504, map, u35.i(503, map, u35.i(502, map, u35.i(501, map, u35.i(500, map, u35.i(423, map, u35.i(421, map, u35.i(420, map, u35.i(389, map, u35.i(387, map, u35.i(386, map, u35.i(385, map, u35.i(383, map, u35.i(382, map, u35.i(381, map, u35.i(380, map, u35.i(378, map, u35.i(377, map, u35.i(376, map, u35.i(375, map, u35.i(374, map, u35.i(373, map, u35.i(372, map, u35.i(371, map, u35.i(370, map, u35.i(359, map, arrayList10, 1, "LT"), 1, "LV"), 1, "EE"), 1, "MD"), 1, "AM"), 1, "BY"), 1, "AD"), 1, "MC"), 1, "SM"), 1, "UA"), 1, "RS"), 1, "ME"), 1, "XK"), 1, "HR"), 1, "SI"), 1, "BA"), 1, "MK"), 1, "CZ"), 1, "SK"), 1, "LI"), 1, "FK"), 1, "BZ"), 1, "GT"), 1, "SV"), 1, "HN"), 1, "NI"), 1, "CR"), 1, "PA"), 1, "PM"), 1, "HT"), 3, "GP");
        arrayListI9.add("BL");
        arrayListI9.add("MF");
        map.put(590, arrayListI9);
        ArrayList arrayList11 = new ArrayList(1);
        arrayList11.add("BO");
        ArrayList arrayListI10 = u35.i(598, map, u35.i(597, map, u35.i(596, map, u35.i(595, map, u35.i(594, map, u35.i(593, map, u35.i(592, map, u35.i(591, map, arrayList11, 1, "GY"), 1, "EC"), 1, "GF"), 1, "PY"), 1, "MQ"), 1, "SR"), 1, "UY"), 2, "CW");
        arrayListI10.add("BQ");
        map.put(599, arrayListI10);
        ArrayList arrayList12 = new ArrayList(1);
        arrayList12.add("TL");
        map.put(998, u35.i(996, map, u35.i(995, map, u35.i(994, map, u35.i(993, map, u35.i(992, map, u35.i(979, map, u35.i(977, map, u35.i(976, map, u35.i(975, map, u35.i(974, map, u35.i(973, map, u35.i(972, map, u35.i(971, map, u35.i(970, map, u35.i(968, map, u35.i(967, map, u35.i(966, map, u35.i(965, map, u35.i(964, map, u35.i(963, map, u35.i(962, map, u35.i(961, map, u35.i(960, map, u35.i(888, map, u35.i(886, map, u35.i(883, map, u35.i(882, map, u35.i(881, map, u35.i(880, map, u35.i(878, map, u35.i(870, map, u35.i(856, map, u35.i(855, map, u35.i(853, map, u35.i(852, map, u35.i(850, map, u35.i(808, map, u35.i(800, map, u35.i(692, map, u35.i(691, map, u35.i(690, map, u35.i(689, map, u35.i(688, map, u35.i(687, map, u35.i(686, map, u35.i(685, map, u35.i(683, map, u35.i(682, map, u35.i(681, map, u35.i(680, map, u35.i(679, map, u35.i(678, map, u35.i(677, map, u35.i(676, map, u35.i(675, map, u35.i(674, map, u35.i(673, map, u35.i(672, map, u35.i(670, map, arrayList12, 1, "NF"), 1, "BN"), 1, "NR"), 1, "PG"), 1, "TO"), 1, "SB"), 1, "VU"), 1, "FJ"), 1, "PW"), 1, "WF"), 1, "CK"), 1, "NU"), 1, "WS"), 1, "KI"), 1, "NC"), 1, "TV"), 1, "PF"), 1, "TK"), 1, "FM"), 1, "MH"), 1, "001"), 1, "001"), 1, "KP"), 1, "HK"), 1, "MO"), 1, "KH"), 1, "LA"), 1, "001"), 1, "001"), 1, "BD"), 1, "001"), 1, "001"), 1, "001"), 1, "TW"), 1, "001"), 1, "MV"), 1, "LB"), 1, "JO"), 1, "SY"), 1, "IQ"), 1, "KW"), 1, "SA"), 1, "YE"), 1, "OM"), 1, "PS"), 1, "AE"), 1, "IL"), 1, "BH"), 1, "QA"), 1, "BT"), 1, "MN"), 1, "NP"), 1, "001"), 1, "TJ"), 1, "TM"), 1, "AZ"), 1, "GE"), 1, "KG"), 1, "UZ"));
        return map;
    }

    public static int z(Context context) {
        NetworkInfo activeNetworkInfo;
        int currentConnectionType = NetworkChangeNotifier.isInitialized() ? NetworkChangeNotifier.getInstance().getCurrentConnectionType() : 6;
        if (currentConnectionType != 6 || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return currentConnectionType;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1) {
            return 2;
        }
        if (type == 0) {
            return 3;
        }
        return type == 7 ? 7 : 0;
    }

    public abstract ro9 B();

    public final Object D(int i2) {
        Object objInvoke;
        phb phbVarO = B().o(i2);
        int i3 = i2 - phbVarO.a;
        Function1 key = phbVarO.c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i3))) == null) ? new yr6(i2) : objInvoke;
    }

    public abstract voh w();
}
