package com.opera.android.browser.obml;

import J.N;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import defpackage.agg;
import defpackage.b59;
import defpackage.b8h;
import defpackage.cm;
import defpackage.f8a;
import defpackage.i0l;
import defpackage.jk5;
import defpackage.ks3;
import defpackage.nr8;
import defpackage.oji;
import defpackage.qp2;
import defpackage.v1;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class Platform {
    public static Context a = null;
    public static byte b = -1;
    public static boolean c = false;
    public static byte d = 0;
    public static volatile String f;
    public static String g;
    public static final ArrayList e = new ArrayList();
    public static final ceg h = new ceg(Looper.getMainLooper(), (byte) 1);

    public static boolean a(IntBuffer intBuffer, ByteBuffer byteBuffer, IntBuffer intBuffer2, int i, String str, String str2) {
        if (str2 == str) {
            return false;
        }
        intBuffer.put(i);
        int length = str2.length();
        if (length == 1) {
            byteBuffer.put((byte) 1);
            intBuffer2.put(str2.charAt(0));
            return true;
        }
        if (length == 2) {
            byteBuffer.put((byte) 2);
            intBuffer2.put(str2.charAt(0));
            intBuffer2.put(str2.charAt(1));
            return true;
        }
        if (length == 3) {
            byteBuffer.put((byte) 3);
            intBuffer2.put(str2.charAt(0));
            intBuffer2.put(str2.charAt(1));
            intBuffer2.put(str2.charAt(2));
            return true;
        }
        if (length != 4) {
            return true;
        }
        byteBuffer.put((byte) 4);
        intBuffer2.put(str2.charAt(0));
        intBuffer2.put(str2.charAt(1));
        intBuffer2.put(str2.charAt(2));
        intBuffer2.put(str2.charAt(3));
        return true;
    }

    public static void b(IntBuffer intBuffer, ByteBuffer byteBuffer, IntBuffer intBuffer2, int i, int i2, char[] cArr) {
        IntBuffer intBuffer3;
        ByteBuffer byteBuffer2;
        IntBuffer intBuffer4;
        String upperCase;
        int i3 = i;
        while (i3 <= i2) {
            cArr[0] = (char) i3;
            if ("ßİŉǰΐΰևẖẗẘẙẚẞὐὒὔὖᾀᾁᾂᾃᾄᾅᾆᾇᾈᾉᾊᾋᾌᾍᾎᾏᾐᾑᾒᾓᾔᾕᾖᾗᾘᾙᾚᾛᾜᾝᾞᾟᾠᾡᾢᾣᾤᾥᾦᾧᾨᾩᾪᾫᾬᾭᾮᾯᾲᾳᾴᾶᾷᾼῂῃῄῆῇῌῒΐῖῗῢΰῤῦῧῲῳῴῶῷῼﬀﬁﬂﬃﬄﬅﬆﬓﬔﬕﬖﬗ".indexOf(i3) < 0) {
                char c2 = cArr[0];
                char lowerCase = Character.toLowerCase(c2);
                if (lowerCase != c2) {
                    intBuffer.put(i3);
                    byteBuffer.put((byte) 1);
                    intBuffer2.put(lowerCase);
                }
                intBuffer3 = intBuffer;
                byteBuffer2 = byteBuffer;
                intBuffer4 = intBuffer2;
            } else {
                String str = new String(cArr);
                Locale locale = Locale.US;
                intBuffer3 = intBuffer;
                byteBuffer2 = byteBuffer;
                intBuffer4 = intBuffer2;
                if (!a(intBuffer3, byteBuffer2, intBuffer4, i3, str, str.toLowerCase(locale)) && (upperCase = str.toUpperCase(locale)) != str && upperCase.length() > 1) {
                    a(intBuffer3, byteBuffer2, intBuffer4, i3, str, upperCase);
                }
            }
            i3++;
            intBuffer = intBuffer3;
            byteBuffer = byteBuffer2;
            intBuffer2 = intBuffer4;
        }
    }

    public static String c() {
        f8a f8aVar = f8a.h;
        if (f == null) {
            qp2.n("Platform base path not initialized");
            return null;
        }
        String str = (String) N.MQ$xB7I2("Cookies", "Client");
        if (a == null || !TextUtils.isEmpty(str)) {
            return f8aVar.a(str);
        }
        qp2.n("Empty cookie");
        return null;
    }

    public static String d(String str) {
        if (f != null) {
            return z1m.l(new StringBuilder(), f, str);
        }
        qp2.n("Platform base path not initialized");
        return null;
    }

    public static void e(boolean z) {
        boolean z2 = d == 0;
        d = z ? (byte) 2 : (byte) 1;
        if (a != null) {
            N.MurTvRR9(z);
            if (z2 && d != 0 && c) {
                cak.a(8);
            }
        }
    }

    public static void f() {
        Context context = a;
        String[] strArr = OperaApplication.K;
        SettingsManager settingsManagerJ = ((OperaApplication) context.getApplicationContext()).J();
        N.MNOKrXtU(settingsManagerJ.u("personalized_ads"), !settingsManagerJ.I() ? true : settingsManagerJ.M());
    }

    @NonNull
    public static String getAbGroup() {
        return v1.u(a).x();
    }

    @Nullable
    public static String getAdvertisingId() {
        Context context = a;
        String[] strArr = OperaApplication.K;
        return ((OperaApplication) context.getApplicationContext()).d().b().a;
    }

    public static byte getAndroidApiVersion() {
        return (byte) Build.VERSION.SDK_INT;
    }

    @NonNull
    public static Buffer[] getCaseFolding() {
        char[] cArr = new char[1];
        IntBuffer intBufferAsIntBuffer = ByteBuffer.allocateDirect(5200).order(ByteOrder.nativeOrder()).asIntBuffer();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(1300);
        IntBuffer intBufferAsIntBuffer2 = ByteBuffer.allocateDirect(5200).order(ByteOrder.nativeOrder()).asIntBuffer();
        intBufferAsIntBuffer.put(0);
        intBufferAsIntBuffer2.put(0);
        b(intBufferAsIntBuffer, byteBufferAllocateDirect, intBufferAsIntBuffer2, 65, 90, cArr);
        b(intBufferAsIntBuffer, byteBufferAllocateDirect, intBufferAsIntBuffer2, 181, 181, cArr);
        b(intBufferAsIntBuffer, byteBufferAllocateDirect, intBufferAsIntBuffer2, ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_MASK, 223, cArr);
        b(intBufferAsIntBuffer, byteBufferAllocateDirect, intBufferAsIntBuffer2, Constants.Crypt.KEY_LENGTH, 590, cArr);
        b(intBufferAsIntBuffer, byteBufferAllocateDirect, intBufferAsIntBuffer2, 837, 837, cArr);
        b(intBufferAsIntBuffer, byteBufferAllocateDirect, intBufferAsIntBuffer2, 880, 1071, cArr);
        b(intBufferAsIntBuffer, byteBufferAllocateDirect, intBufferAsIntBuffer2, 1120, 1415, cArr);
        b(intBufferAsIntBuffer, byteBufferAllocateDirect, intBufferAsIntBuffer2, 4256, 4293, cArr);
        b(intBufferAsIntBuffer, byteBufferAllocateDirect, intBufferAsIntBuffer2, 7680, 8189, cArr);
        b(intBufferAsIntBuffer, byteBufferAllocateDirect, intBufferAsIntBuffer2, 8486, 8498, cArr);
        b(intBufferAsIntBuffer, byteBufferAllocateDirect, intBufferAsIntBuffer2, 8544, 8579, cArr);
        b(intBufferAsIntBuffer, byteBufferAllocateDirect, intBufferAsIntBuffer2, 9398, 9423, cArr);
        b(intBufferAsIntBuffer, byteBufferAllocateDirect, intBufferAsIntBuffer2, 11264, 11501, cArr);
        b(intBufferAsIntBuffer, byteBufferAllocateDirect, intBufferAsIntBuffer2, 42560, 42646, cArr);
        b(intBufferAsIntBuffer, byteBufferAllocateDirect, intBufferAsIntBuffer2, 42786, 42891, cArr);
        b(intBufferAsIntBuffer, byteBufferAllocateDirect, intBufferAsIntBuffer2, 64256, 64279, cArr);
        b(intBufferAsIntBuffer, byteBufferAllocateDirect, intBufferAsIntBuffer2, 65313, 65338, cArr);
        intBufferAsIntBuffer.put(0, intBufferAsIntBuffer.position() - 1);
        intBufferAsIntBuffer2.put(0, intBufferAsIntBuffer2.position() - 1);
        return new Buffer[]{intBufferAsIntBuffer, byteBufferAllocateDirect, intBufferAsIntBuffer2};
    }

    @Nullable
    public static String getConfigBundle() {
        String str;
        Context context = a;
        String[] strArr = OperaApplication.K;
        jk5 jk5VarI = ((OperaApplication) context.getApplicationContext()).i();
        synchronized (jk5VarI.d) {
            str = jk5VarI.e;
        }
        return str == null ? jk5VarI.a() : str;
    }

    @NonNull
    public static String getCountry() {
        return Locale.getDefault().getCountry().toLowerCase(Locale.US);
    }

    @NonNull
    public static String getLanguage() {
        return sfe.b0(Locale.getDefault());
    }

    public static boolean getLimitAdTracking() {
        Context context = a;
        String[] strArr = OperaApplication.K;
        return ((OperaApplication) context.getApplicationContext()).d().b().b;
    }

    public static byte getPlatformName() {
        return i0l.g() ? (byte) 99 : (byte) 97;
    }

    @NonNull
    public static String getSimMCC() {
        return i0l.d(a);
    }

    @NonNull
    public static String getSimMNC() {
        return i0l.e(a);
    }

    @Nullable
    public static String getUniquePlatformId() {
        Context context = a;
        String[] strArr = OperaApplication.K;
        if (((OperaApplication) context.getApplicationContext()).J().i("onboarding_deleted")) {
            return null;
        }
        return zi4.A(a);
    }

    @Nullable
    public static String getUserStats() {
        b59 b59Var = (b59) oji.y(a).a;
        StringBuilder sb = new StringBuilder();
        SharedPreferences.Editor editorEdit = ((SharedPreferences) b59Var.get()).edit();
        for (int i : vep.B(7)) {
            if (fki.g(i) != 0) {
                int i2 = ((SharedPreferences) b59Var.get()).getInt(fki.t(i), 0);
                if (i2 != 0) {
                    if (sb.length() > 0) {
                        sb.append(',');
                    }
                    sb.append(fki.g(i));
                    sb.append('/');
                    sb.append(i2);
                    editorEdit.putInt(fki.t(i), 0);
                }
            }
        }
        if (sb.length() > 0) {
            editorEdit.apply();
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static byte getWebpQuality() {
        byte b2 = b;
        if (b2 >= 0) {
            return b2;
        }
        byte bMax = (byte) Math.max(((Math.max(0, nr8.e(a) - 80) * 15) / (-60)) + 90, 75);
        b = bMax;
        return bMax;
    }

    public static boolean isConfigBundlePending() {
        boolean z;
        Context context = a;
        String[] strArr = OperaApplication.K;
        jk5 jk5VarI = ((OperaApplication) context.getApplicationContext()).i();
        synchronized (jk5VarI.d) {
            z = jk5VarI.e != null;
        }
        return z;
    }

    public static boolean isRequestingHomeCountryReset() {
        Context context = a;
        String[] strArr = OperaApplication.K;
        return ((OperaApplication) context.getApplicationContext()).J().i("ongoing_installation_location_reset");
    }

    public static void onSettingChanged(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        ArrayList arrayList = e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((agg) obj).a(str, str2);
        }
    }

    @NonNull
    public static String readProxyConfig() {
        cm cmVarG;
        if (a != null) {
            try {
                cmVarG = b8h.g(new URI("http://www.opera.com"));
            } catch (URISyntaxException unused) {
                cmVarG = null;
            }
            if (cmVarG != null) {
                Locale locale = Locale.US;
                return cmVarG.c + ":" + cmVarG.b;
            }
        }
        return "";
    }

    public static void requestSlice(int i) {
        ceg cegVar = h;
        cegVar.getClass();
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.setAsynchronous(true);
        cegVar.sendMessageDelayed(messageObtain, i);
    }

    public static void setHost(@NonNull String str) {
        g = str;
        ks3.I(40, str);
    }
}
