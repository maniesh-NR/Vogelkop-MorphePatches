package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.os.Process;
import android.os.SystemClock;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import android.util.Base64;
import android.util.SparseBooleanArray;
import android.util.Xml;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.browser.UrlMangler;
import com.opera.android.settings.SettingsManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.RejectedExecutionException;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.c;
import org.chromium.url.GURL;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract /* synthetic */ class z5i {
    public static final ue5 a = new ue5(1803214771, new lf5((byte) 6), false);
    public static final ue5 b = new ue5(-1142842656, new lf5((byte) 7), false);
    public static m1i c;
    public static final u5h d;
    public static final x5h e;
    public static final x5h f;
    public static final x5h g;
    public static final x5h h;
    public static final x5h i;
    public static final x5h j;
    public static final w5h k;
    public static final x5h l;
    public static final x5h m;
    public static final w5h n;
    public static final v5h o;
    public static final u5h p;
    public static final u5h[] q;
    public static final String[] r;
    public static final Object s;
    public static final Object t;
    public static boolean u;
    public static long v;
    public static final byte[] w;

    static {
        u5h u5hVar = new u5h();
        u5h u5hVar2 = new u5h();
        d = u5hVar2;
        u5h u5hVar3 = new u5h();
        u5h x5hVar = new x5h();
        e = x5hVar;
        u5h v5hVar = new v5h();
        u5h x5hVar2 = new x5h();
        f = x5hVar2;
        u5h x5hVar3 = new x5h();
        u5h v5hVar2 = new v5h();
        u5h x5hVar4 = new x5h();
        g = x5hVar4;
        u5h x5hVar5 = new x5h();
        h = x5hVar5;
        u5h x5hVar6 = new x5h();
        i = x5hVar6;
        u5h x5hVar7 = new x5h();
        u5h x5hVar8 = new x5h();
        u5h x5hVar9 = new x5h();
        j = x5hVar9;
        u5h w5hVar = new w5h();
        k = w5hVar;
        u5h x5hVar10 = new x5h();
        l = x5hVar10;
        u5h x5hVar11 = new x5h();
        u5h w5hVar2 = new w5h();
        u5h x5hVar12 = new x5h();
        m = x5hVar12;
        u5h x5hVar13 = new x5h();
        u5h w5hVar3 = new w5h();
        u5h x5hVar14 = new x5h();
        u5h w5hVar4 = new w5h();
        n = w5hVar4;
        u5h u5hVar4 = new u5h();
        u5h u5hVar5 = new u5h();
        u5h x5hVar15 = new x5h();
        u5h u5hVar6 = new u5h();
        u5h w5hVar5 = new w5h();
        u5h x5hVar16 = new x5h();
        u5h w5hVar6 = new w5h();
        u5h x5hVar17 = new x5h();
        u5h w5hVar7 = new w5h();
        u5h x5hVar18 = new x5h();
        u5h w5hVar8 = new w5h();
        u5h w5hVar9 = new w5h();
        u5h v5hVar3 = new v5h();
        o = v5hVar3;
        u5h v5hVar4 = new v5h();
        u5h x5hVar19 = new x5h();
        u5h u5hVar7 = new u5h();
        p = u5hVar7;
        q = new u5h[]{u5hVar, u5hVar2, u5hVar3, x5hVar, v5hVar, x5hVar2, x5hVar3, v5hVar2, x5hVar4, x5hVar5, x5hVar6, x5hVar7, x5hVar8, x5hVar9, w5hVar, x5hVar10, x5hVar11, w5hVar2, x5hVar12, x5hVar13, w5hVar3, x5hVar14, w5hVar4, x5hVar15, u5hVar6, u5hVar5, u5hVar4, w5hVar9, w5hVar5, x5hVar16, w5hVar6, x5hVar17, w5hVar7, x5hVar18, w5hVar8, v5hVar3, v5hVar4, x5hVar19, u5hVar7, new w5h(), new v5h(), new v5h(), new x5h(), new w5h(), new u5h(), new v5h()};
        r = new String[]{"ar", "be", "bg", "bn", "ca", "cs", "da", "de", "el", "en-GB", "en-US", "es", "es-419", "et", "fa", "fi", "fil", "fr", "he", "hi", "hr", "hu", "id", "it", "ja", "ko", "lt", "lv", "ms", "my", "my-ZG", "nb", "nl", "pl", "pt-BR", "pt-PT", "ro", "ru", "si", "sk", "sl", "sv", "sw", "ta", "th", "tr", "uk", "ur", "vi", "zh-CN", "zh-TW"};
        s = new Object();
        t = new Object();
        w = new byte[0];
    }

    public static boolean A(int[] iArr, int[] iArr2, int i2) {
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (iArr[i3] != iArr2[i3]) {
                return false;
            }
        }
        return true;
    }

    public static void A0(int[] iArr, int[] iArr2, int i2) {
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            long j3 = ((iArr2[i3] & 4294967295L) - (iArr[i3] & 4294967295L)) + j2;
            iArr2[i3] = (int) j3;
            j2 = j3 >> 32;
        }
    }

    public static int B(int i2, int[] iArr) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 |= iArr[i4];
        }
        return ((i3 - 1) & (~i3)) >> 31;
    }

    public static BigInteger B0(int i2, int[] iArr) {
        byte[] bArr = new byte[i2 << 2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = iArr[i3];
            if (i4 != 0) {
                sfe.h0(i4, ((i2 - 1) - i3) << 2, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static final String C(String str) {
        String authority = Uri.parse(str).getAuthority();
        if (TextUtils.isEmpty(authority)) {
            return "";
        }
        try {
            return new String(Base64.decode(authority, 10), Charsets.UTF_8);
        } catch (IllegalArgumentException unused) {
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList C0(hqj hqjVar, int i2, Integer num) {
        vkh vkhVar = new vkh(hqjVar);
        int iQ = hqjVar.q(i2);
        qt9 qt9VarA = hqjVar.a(i2);
        while (i2 >= 0) {
            vkhVar.A0(hqjVar.i(i2), hqjVar.k(i2) ? hqjVar.p(i2, hqjVar.b) : hh5.a, hqjVar.a.g(i2), (Object) num);
            if (iQ >= 0) {
                qt9 qt9Var = qt9VarA;
                qt9VarA = hqjVar.a(iQ);
                i2 = iQ;
                iQ = hqjVar.q(iQ);
                num = qt9Var;
            } else {
                i2 = iQ;
                num = qt9VarA;
            }
        }
        return (ArrayList) ((n1) vkhVar).b;
    }

    public static final Integer D(hqj hqjVar, zh5 zh5Var, int i2, int i3) {
        Integer numD;
        int[] iArr = hqjVar.b;
        while (true) {
            if (i2 >= i3) {
                return null;
            }
            int i4 = iArr[(i2 * 5) + 3] + i2;
            if (hqjVar.j(i2) && hqjVar.i(i2) == 206 && Intrinsics.a(hqjVar.p(i2, iArr), mh5.e)) {
                Object objH = hqjVar.h(i2, 0);
                zt9 zt9Var = objH instanceof zt9 ? (zt9) objH : null;
                Object obj = zt9Var != null ? zt9Var.a : null;
                st9 st9Var = obj instanceof st9 ? (st9) obj : null;
                if (st9Var != null && st9Var.a == zh5Var) {
                    return Integer.valueOf(i2);
                }
            }
            if (hqjVar.d(i2) && (numD = D(hqjVar, zh5Var, i2 + 1, i4)) != null) {
                return Integer.valueOf(numD.intValue());
            }
            i2 = i4;
        }
    }

    public static final Object D0(Function1 function1, nt5 nt5Var) {
        x6b x6bVar = (x6b) nt5Var.getContext().get(rbe.t);
        if (x6bVar == null) {
            return zi4.C(nt5Var.getContext()).t(function1, nt5Var);
        }
        new pv((byte) 15, null, function1);
        return x6bVar.Q();
    }

    public static int[] E(int i2, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i2) {
            hai.d();
            return null;
        }
        int i3 = (i2 + 31) >> 5;
        int[] iArr = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i4] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArr;
    }

    public static final Object E0(y5i y5iVar, Function1 function1, mt5 mt5Var) {
        r76 r76Var = new r76(function1, null);
        k0m k0mVar = (k0m) mt5Var.getContext().get(k0m.b);
        d dVar = k0mVar != null ? k0mVar.a : null;
        if (dVar != null) {
            return na2.Z(dVar, r76Var, mt5Var);
        }
        nh4 nh4Var = new nh4(1, hib.b(mt5Var));
        nh4Var.s();
        try {
            op1 op1Var = y5iVar.d;
            if (op1Var == null) {
                op1Var = null;
            }
            op1Var.execute(new iv(nh4Var, y5iVar, r76Var, false, (byte) 11));
        } catch (RejectedExecutionException e2) {
            nh4Var.d(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e2));
        }
        Object objQ = nh4Var.q();
        px5 px5Var = px5.a;
        return objQ;
    }

    public static long[] F(int i2, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i2) {
            hai.d();
            return null;
        }
        int i3 = (i2 + 63) >> 6;
        long[] jArr = new long[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            jArr[i4] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return jArr;
    }

    public static final Exception F0(String str, FileNotFoundException fileNotFoundException) {
        int i2;
        boolean zA = false;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            try {
                Parcel parcelObtain = Parcel.obtain();
                Process.myUserHandle().writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                i2 = parcelObtain.readInt();
            } catch (Throwable unused) {
                i2 = 0;
            }
            zA = Intrinsics.a((String) method.invoke(null, "sys.user." + i2 + ".ce_available", "false"), "true");
        } catch (Throwable th) {
            wf8.a(fileNotFoundException, th);
        }
        if (zA || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            return new d0(fileNotFoundException);
        } finally {
            file.delete();
        }
    }

    public static int G(int[] iArr) {
        return iArr[0] & 1;
    }

    public static final Rect H(TextPaint textPaint, CharSequence charSequence, int i2, int i3) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i2 - 1, i3, MetricAffectingSpan.class) != i3) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i2 < i3) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i2, i3, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i2, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    textPaint2.getTextBounds(charSequence, i2, iNextSpanTransition, rect2);
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i2 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        textPaint.getTextBounds(charSequence, i2, i3, rect3);
        return rect3;
    }

    public static final String I(Context context) {
        String string = ru9.c(context).a.getString("onboarding.id", null);
        if (string != null) {
            return string;
        }
        String strO = c.o(UUID.randomUUID().toString(), "-", "");
        nv6 nv6VarB = ru9.c(context).b();
        ((SharedPreferences.Editor) nv6VarB.a).putString("onboarding.id", strO);
        nv6VarB.w();
        return strO;
    }

    public static final ung J(View view) {
        ung ungVar = (ung) view.getTag(2131363913);
        if (ungVar != null) {
            return ungVar;
        }
        ung ungVar2 = new ung();
        view.setTag(2131363913, ungVar2);
        return ungVar2;
    }

    public static final String K(String str) {
        if (UrlMangler.isMangled(str)) {
            return UrlMangler.a(str, "display_string");
        }
        Uri uri = Uri.parse(str);
        if (Intrinsics.a(uri.getScheme(), "opera-aria")) {
            return wqm.m(uri, "q");
        }
        return null;
    }

    public static final String L(kotlinx.serialization.json.d dVar) {
        if (dVar.c()) {
            return dVar.b();
        }
        n57.h(dVar, "Not a string: ");
        return null;
    }

    public static long M(ijg ijgVar, long j2, long j3, long j4) {
        c4j c4jVar = ijgVar.c;
        boolean z = c4jVar.equals(c4j.l) || j3 < c4jVar.c;
        if (ijgVar.x) {
            if (z || j2 == -9223372036854775807L) {
                if (j4 == -9223372036854775807L) {
                    j4 = SystemClock.elapsedRealtime() - c4jVar.c;
                }
                long j5 = c4jVar.a.f + ((long) (j4 * ijgVar.g.a));
                long j6 = c4jVar.d;
                return j6 != -9223372036854775807L ? Math.min(j5, j6) : j5;
            }
        } else if (z || j2 == -9223372036854775807L) {
            return c4jVar.a.f;
        }
        return j2;
    }

    public static final c8e N(c8e c8eVar, Function1 function1) {
        return c8eVar.d(new ji3(function1));
    }

    public static c8e O(c8e c8eVar, float f2, float f3, float f4, float f5, float f6, long j2, paj pajVar, boolean z, long j3, long j4, int i2) {
        return c8eVar.d(new r3a((i2 & 1) != 0 ? 1.0f : f2, (i2 & 2) != 0 ? 1.0f : f3, (i2 & 4) != 0 ? 1.0f : f4, 0.0f, 0.0f, (i2 & 32) != 0 ? 0.0f : f5, 0.0f, 0.0f, (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 0.0f : f6, 8.0f, (i2 & 1024) != 0 ? a2m.b : j2, (i2 & 2048) != 0 ? kfo.i : pajVar, (i2 & 4096) != 0 ? false : z, (i2 & 16384) != 0 ? t3a.a : j3, (i2 & 32768) != 0 ? t3a.a : j4, 0, 3, null, v1c.a));
    }

    public static c8e P(c8e c8eVar, float f2, float f3, float f4, float f5, paj pajVar, int i2) {
        float f6 = (i2 & 1) != 0 ? 1.0f : f2;
        float f7 = (i2 & 2) != 0 ? 1.0f : f3;
        float f8 = (i2 & 4) != 0 ? 1.0f : f4;
        float f9 = (i2 & 32) != 0 ? 0.0f : f5;
        long j2 = a2m.b;
        paj pajVar2 = (i2 & 2048) != 0 ? kfo.i : pajVar;
        long j3 = t3a.a;
        return O(c8eVar, f6, f7, f8, f9, 0.0f, j2, pajVar2, false, j3, j3, 524288);
    }

    public static boolean Q(int[] iArr, int[] iArr2, int i2) {
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            int i4 = iArr[i3] + LinearLayoutManager.INVALID_OFFSET;
            int i5 = iArr2[i3] + LinearLayoutManager.INVALID_OFFSET;
            if (i4 < i5) {
                return false;
            }
            if (i4 > i5) {
                return true;
            }
        }
        return true;
    }

    public static int R(int[] iArr) {
        for (int i2 = 0; i2 < 16; i2++) {
            int i3 = iArr[i2] + 1;
            iArr[i2] = i3;
            if (i3 != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int S(int[] iArr, int[] iArr2, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int i4 = iArr[i3] + 1;
            iArr2[i3] = i4;
            i3++;
            if (i4 != 0) {
                while (i3 < i2) {
                    iArr2[i3] = iArr[i3];
                    i3++;
                }
                return 0;
            }
        }
        return 1;
    }

    public static int T(int i2, int i3, int[] iArr) {
        while (i3 < i2) {
            int i4 = iArr[i3] + 1;
            iArr[i3] = i4;
            if (i4 != 0) {
                return 0;
            }
            i3++;
        }
        return 1;
    }

    public static int U(int i2, int i3, int[] iArr) {
        while (i3 < i2) {
            int i4 = iArr[i3] + 1;
            iArr[i3] = i4;
            if (i4 != 0) {
                return 0;
            }
            i3++;
        }
        return 1;
    }

    public static cig V(cig cigVar, cig cigVar2) {
        if (cigVar != null) {
            w69 w69Var = cigVar.a;
            if (cigVar2 != null) {
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i2 = 0; i2 < w69Var.a.size(); i2++) {
                    if (cigVar2.a(w69Var.b(i2))) {
                        int iB = w69Var.b(i2);
                        z4o.H(!false);
                        sparseBooleanArray.append(iB, true);
                    }
                }
                z4o.H(!false);
                return new cig(new w69(sparseBooleanArray));
            }
        }
        return cig.b;
    }

    public static boolean W(int i2, int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i3 = 1; i3 < i2; i3++) {
            if (iArr[i3] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean X(int i2, int[] iArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (iArr[i3] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int Y(int[] iArr, int[] iArr2, int i2) {
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = (((iArr[i3] & 4294967295L) - (iArr2[i3] & 4294967295L)) + j2) >> 32;
        }
        return (int) j2;
    }

    public static long Z() {
        byte b2;
        SocketTimeoutException socketTimeoutException;
        byte[] bArr;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            Object obj = t;
            synchronized (obj) {
            }
            datagramSocket.setSoTimeout(1000);
            synchronized (obj) {
            }
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b3 = 0;
            SocketTimeoutException socketTimeoutException2 = null;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i2], 123);
                bArr2[b3] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jCurrentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b3);
                    b2 = b3;
                    socketTimeoutException = socketTimeoutException2;
                    bArr = bArr2;
                } else {
                    long j2 = jCurrentTimeMillis / 1000;
                    long j3 = jCurrentTimeMillis - (j2 * 1000);
                    b2 = b3;
                    socketTimeoutException = socketTimeoutException2;
                    long j4 = j2 + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j4 >> 24);
                    bArr[41] = (byte) (j4 >> 16);
                    bArr[42] = (byte) (j4 >> 8);
                    bArr[43] = (byte) j4;
                    long j5 = (j3 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j5 >> 24);
                    bArr[45] = (byte) (j5 >> 16);
                    bArr[46] = (byte) (j5 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j6 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
                    byte b4 = bArr3[b2];
                    byte b5 = (byte) ((b4 >> 6) & 3);
                    byte b6 = (byte) (b4 & 7);
                    int i4 = bArr3[1] & 255;
                    long jJ0 = j0(24, bArr3);
                    long jJ02 = j0(32, bArr3);
                    long jJ03 = j0(40, bArr3);
                    if (b5 == 3) {
                        s49.m("SNTP: Unsynchronized server");
                    } else if (b6 != 4 && b6 != 5) {
                        s49.m(sko.i(b6, "SNTP: Untrusted mode: "));
                    } else if (i4 == 0 || i4 > 15) {
                        s49.m(sko.i(i4, "SNTP: Untrusted stratum: "));
                    } else if (jJ03 == 0) {
                        s49.m("SNTP: Zero transmitTime");
                    }
                    long j7 = (j6 + (((jJ03 - j6) + (jJ02 - jJ0)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j7;
                } catch (SocketTimeoutException e2) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException2 = e2;
                    } else {
                        SocketTimeoutException socketTimeoutException3 = socketTimeoutException;
                        socketTimeoutException3.addSuppressed(e2);
                        socketTimeoutException2 = socketTimeoutException3;
                    }
                    int i5 = i3 + 1;
                    if (i3 >= 10) {
                        break;
                    }
                    i2++;
                    i3 = i5;
                    b3 = b2;
                }
            }
            socketTimeoutException2.getClass();
            throw socketTimeoutException2;
        } finally {
        }
    }

    public static final void a(g1b g1bVar, Integer num, Function0 function0, ih5 ih5Var, int i2) {
        vt9 vt9Var;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-1753040181);
        int i3 = i2 | (vt9Var2.f(g1bVar) ? 4 : 2) | (vt9Var2.f(num) ? 32 : 16) | (vt9Var2.h(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY);
        if (vt9Var2.N(i3 & 1, (i3 & 147) != 146)) {
            vt9Var = vt9Var2;
            i7e.a(function0, null, i7e.f(null, vt9Var2, 0, 3), 0.0f, false, null, 0L, 0L, 0L, null, null, null, gyg.P(-1666597463, new f23(g1bVar, num, function0, (byte) 6), vt9Var2), vt9Var, (i3 >> 6) & 14, 7162);
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new g9(g1bVar, num, function0, i2, (byte) 7);
        }
    }

    public static final boolean a0(String str) {
        return c.q(BrowserUtils.getRendererUrl(str), "opera-aria://", false);
    }

    public static final void b(Integer num, c8e c8eVar, ih5 ih5Var, int i2) {
        int i3;
        byte b2;
        c8e c8eVar2;
        String strQ;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1858272718);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.f(num) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if (vt9Var.N(i4 & 1, (i4 & 19) != 18)) {
            boolean z = (num == null || num.intValue() == 0) ? false : true;
            if (z) {
                vt9Var.W(1969218889);
                strQ = uyg.r((shk) ahk.c.getValue(), new Object[]{num + "x"}, vt9Var);
                vt9Var.p(false);
            } else {
                vt9Var.W(1969298900);
                strQ = uyg.q((shk) ahk.d.getValue(), vt9Var);
                vt9Var.p(false);
            }
            o9i o9iVarA = m9i.a(new x62(8.0f, true, new t40((byte) 19)), rbe.l, vt9Var, 54);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            z7e z7eVar = z7e.b;
            c8e c8eVarP = qyn.P(vt9Var, z7eVar);
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
            x1p.b(z, null, vt9Var, 0);
            b2 = 1;
            ijl.b(strQ, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(abm.a)).l, vt9Var, 0, 0, 131070);
            vt9Var = vt9Var;
            vt9Var.p(true);
            c8eVar2 = z7eVar;
        } else {
            b2 = 1;
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new kx0(num, c8eVar2, i2, b2);
        }
    }

    public static final boolean b0(GURL gurl) {
        return gurl.b && a0(gurl.g());
    }

    public static final void c(tn tnVar, c8e c8eVar, ih5 ih5Var, int i2) {
        Object obj;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(669199561);
        if ((((vt9Var.h(tnVar) ? 4 : 2) | i2 | 432) & 1171) == 1170 && vt9Var.z()) {
            vt9Var.Q();
        } else {
            c8eVar = z7e.b;
            zpa zpaVar = hh5.a;
            vt9Var.W(-220138742);
            zpa zpaVar2 = zpa.k;
            vt9Var.W(644836070);
            boolean zF = vt9Var.f(tnVar) | vt9Var.f(zpaVar2);
            Object objK = vt9Var.K();
            if (zF || objK == zpaVar) {
                synchronized (((j06) tnVar.b)) {
                    obj = tnVar.c;
                }
                t0g t0gVar = new t0g(obj, zpaVar2);
                vt9Var.g0(t0gVar);
                objK = t0gVar;
            }
            afe afeVar = (afe) objK;
            vt9Var.p(false);
            vt9Var.W(644838839);
            boolean zH = vt9Var.h(tnVar) | vt9Var.f(afeVar);
            Object objK2 = vt9Var.K();
            if (zH || objK2 == zpaVar) {
                objK2 = new d7k(tnVar, afeVar, (byte) 7);
                vt9Var.g0(objK2);
            }
            vt9Var.p(false);
            rm5.b(tnVar, (Function1) objK2, vt9Var);
            vt9Var.p(false);
            d((fx4) afeVar.getValue(), c8eVar, vt9Var, 3504);
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fx0(tnVar, c8eVar, i2, (byte) 15);
        }
    }

    public static ijg c0(ijg ijgVar, ijg ijgVar2, gjg gjgVar, cig cigVar, boolean z) {
        ijg ijgVarB;
        fzl fzlVar;
        nyl nylVar;
        if (gjgVar.a && cigVar.a(17)) {
            gql gqlVar = ijgVar.j;
            rhg rhgVar = ijgVar2.a;
            int i2 = ijgVar2.b;
            c4j c4jVar = ijgVar2.c;
            fig figVar = ijgVar2.d;
            fig figVar2 = ijgVar2.e;
            int i3 = ijgVar2.f;
            thg thgVar = ijgVar2.g;
            int i4 = ijgVar2.h;
            boolean z2 = ijgVar2.i;
            int i5 = ijgVar2.k;
            r4n r4nVar = ijgVar2.l;
            vjd vjdVar = ijgVar2.m;
            float f2 = ijgVar2.n;
            float f3 = ijgVar2.o;
            int i6 = ijgVar2.p;
            pf2 pf2Var = ijgVar2.q;
            y36 y36Var = ijgVar2.r;
            u67 u67Var = ijgVar2.s;
            int i7 = ijgVar2.t;
            boolean z3 = ijgVar2.u;
            boolean z4 = ijgVar2.v;
            int i8 = ijgVar2.w;
            boolean z5 = ijgVar2.x;
            boolean z6 = ijgVar2.y;
            int i9 = ijgVar2.z;
            int i10 = ijgVar2.A;
            vjd vjdVar2 = ijgVar2.B;
            long j2 = ijgVar2.C;
            long j3 = ijgVar2.D;
            long j4 = ijgVar2.E;
            fzl fzlVar2 = ijgVar2.F;
            nyl nylVar2 = ijgVar2.G;
            if (gqlVar.p()) {
                nylVar = nylVar2;
            } else {
                nylVar = nylVar2;
                boolean z7 = c4jVar.a.b < gqlVar.o();
                z4o.H(z7);
                ijgVarB = new ijg(rhgVar, i2, c4jVar, figVar, figVar2, i3, thgVar, i4, z2, r4nVar, gqlVar, i5, vjdVar, f2, f3, pf2Var, i6, y36Var, u67Var, i7, z3, z4, i8, i9, i10, z5, z6, vjdVar2, j2, j3, j4, fzlVar2, nylVar);
            }
            z4o.H(z7);
            ijgVarB = new ijg(rhgVar, i2, c4jVar, figVar, figVar2, i3, thgVar, i4, z2, r4nVar, gqlVar, i5, vjdVar, f2, f3, pf2Var, i6, y36Var, u67Var, i7, z3, z4, i8, i9, i10, z5, z6, vjdVar2, j2, j3, j4, fzlVar2, nylVar);
        } else {
            ijgVarB = ijgVar2;
        }
        if (gjgVar.b && cigVar.a(30)) {
            ijgVarB = ijgVarB.b(ijgVar.F);
        }
        if (!z || ijgVar2.n != 0.0f) {
            return ijgVarB;
        }
        float f4 = ijgVar.o;
        rhg rhgVar2 = ijgVarB.a;
        int i11 = ijgVarB.b;
        c4j c4jVar2 = ijgVarB.c;
        fig figVar3 = ijgVarB.d;
        fig figVar4 = ijgVarB.e;
        int i12 = ijgVarB.f;
        thg thgVar2 = ijgVarB.g;
        int i13 = ijgVarB.h;
        boolean z8 = ijgVarB.i;
        gql gqlVar2 = ijgVarB.j;
        int i14 = ijgVarB.k;
        r4n r4nVar2 = ijgVarB.l;
        vjd vjdVar3 = ijgVarB.m;
        float f5 = ijgVarB.n;
        int i15 = ijgVarB.p;
        pf2 pf2Var2 = ijgVarB.q;
        y36 y36Var2 = ijgVarB.r;
        u67 u67Var2 = ijgVarB.s;
        int i16 = ijgVarB.t;
        boolean z9 = ijgVarB.u;
        boolean z10 = ijgVarB.v;
        int i17 = ijgVarB.w;
        boolean z11 = ijgVarB.x;
        boolean z12 = ijgVarB.y;
        int i18 = ijgVarB.z;
        int i19 = ijgVarB.A;
        vjd vjdVar4 = ijgVarB.B;
        long j5 = ijgVarB.C;
        long j6 = ijgVarB.D;
        long j7 = ijgVarB.E;
        fzl fzlVar3 = ijgVarB.F;
        nyl nylVar3 = ijgVarB.G;
        if (!gqlVar2.p()) {
            fzlVar = fzlVar3;
            boolean z13 = c4jVar2.a.b < gqlVar2.o();
            z4o.H(z13);
            return new ijg(rhgVar2, i11, c4jVar2, figVar3, figVar4, i12, thgVar2, i13, z8, r4nVar2, gqlVar2, i14, vjdVar3, f5, f4, pf2Var2, i15, y36Var2, u67Var2, i16, z9, z10, i17, i18, i19, z11, z12, vjdVar4, j5, j6, j7, fzlVar, nylVar3);
        }
        fzlVar = fzlVar3;
        z4o.H(z13);
        return new ijg(rhgVar2, i11, c4jVar2, figVar3, figVar4, i12, thgVar2, i13, z8, r4nVar2, gqlVar2, i14, vjdVar3, f5, f4, pf2Var2, i15, y36Var2, u67Var2, i16, z9, z10, i17, i18, i19, z11, z12, vjdVar4, j5, j6, j7, fzlVar, nylVar3);
    }

    public static final void d(fx4 fx4Var, c8e c8eVar, ih5 ih5Var, int i2) {
        int i3;
        ue5 ue5Var = o0g.a;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(100558968);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.h(fx4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.f(c8eVar) ? 32 : 16;
        }
        Object obj = null;
        if ((i2 & 384) == 0) {
            i3 |= (i2 & NotificationCompat.FLAG_GROUP_SUMMARY) == 0 ? vt9Var.f(null) : vt9Var.h(null) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= vt9Var.h(ue5Var) ? 2048 : 1024;
        }
        byte b2 = 1;
        if ((i3 & 1171) == 1170 && vt9Var.z()) {
            vt9Var.Q();
        } else {
            uji ujiVarN = w0h.n(vt9Var);
            jx9 jx9Var = fx4Var.c;
            HashSet hashSet = new HashSet();
            Iterator it = jx9Var.iterator();
            while (it.hasNext()) {
                hashSet.add(((pv4) it.next()).a());
            }
            byte b3 = 0;
            k0(ujiVarN, hashSet, vt9Var, 0);
            o2k o2kVar = (o2k) vt9Var.j(p2k.a);
            vt9Var.W(1543417698);
            vt9Var.W(1543418101);
            boolean zF = vt9Var.f(o2kVar);
            Object objK = vt9Var.K();
            if (zF || objK == hh5.a) {
                o2kVar.getClass();
                vt9Var.g0(null);
            } else {
                obj = objK;
            }
            vt9Var.p(false);
            vt9Var.p(false);
            ue5 ue5VarP = gyg.P(-1548770973, new kx4(ujiVarN, b3), vt9Var);
            vt9Var.W(1800734984);
            tfd tfdVarC = nr3.c(rbe.b, false);
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
            y4h.o(vt9Var, tfdVarC, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            ah5 ah5Var = ujp.g;
            if (vt9Var.S || !Intrinsics.a(vt9Var.K(), Integer.valueOf(iHashCode))) {
                vep.x(iHashCode, vt9Var, iHashCode, ah5Var);
            }
            y4h.o(vt9Var, c8eVarP, ujp.d);
            ue5VarP.invoke(fx4Var.a, vt9Var, 48);
            vt9Var.p(true);
            vt9Var.p(false);
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new uf1(fx4Var, c8eVar, i2, b2);
        }
    }

    public static int d0(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        long j2 = i3 & 4294967295L;
        long j3 = 0;
        int i5 = 0;
        do {
            long j4 = ((iArr[i5] & 4294967295L) * j2) + (iArr2[r8] & 4294967295L) + j3;
            iArr2[i4 + i5] = (int) j4;
            j3 = j4 >>> 32;
            i5++;
        } while (i5 < i2);
        return (int) j3;
    }

    public static final void e(g1b g1bVar, Integer num, Function0 function0, ih5 ih5Var, int i2) {
        int i3;
        vt9 vt9Var;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(1881248881);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var2.f(g1bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var2.f(num) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var2.h(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if (vt9Var2.N(i3 & 1, (i3 & 147) != 146)) {
            z7e z7eVar = z7e.b;
            c8e c8eVarX = a26.X(wxe.Q(z7eVar).d(mpj.a), 24.0f);
            byte b2 = 19;
            x62 x62Var = new x62(24.0f, true, new t40(b2));
            rd3 rd3Var = rbe.n;
            db5 db5VarA = cb5.a(x62Var, rd3Var, vt9Var2, 6);
            int iHashCode = Long.hashCode(vt9Var2.T);
            oag oagVarL = vt9Var2.l();
            c8e c8eVarP = qyn.P(vt9Var2, c8eVarX);
            bh5.To.getClass();
            vt9Var2.a0();
            boolean z = vt9Var2.S;
            fza fzaVar = m3c.S;
            if (z) {
                vt9Var2.k(fzaVar);
            } else {
                vt9Var2.j0();
            }
            ah5 ah5Var = ujp.f;
            y4h.o(vt9Var2, db5VarA, ah5Var);
            ah5 ah5Var2 = ujp.e;
            y4h.o(vt9Var2, oagVarL, ah5Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            ah5 ah5Var3 = ujp.g;
            y4h.o(vt9Var2, numValueOf, ah5Var3);
            y4h.m(vt9Var2);
            ah5 ah5Var4 = ujp.d;
            y4h.o(vt9Var2, c8eVarP, ah5Var4);
            int i4 = i3;
            o9i o9iVarA = m9i.a(new x62(24.0f, true, new t40(b2)), rbe.k, vt9Var2, 6);
            int iHashCode2 = Long.hashCode(vt9Var2.T);
            oag oagVarL2 = vt9Var2.l();
            c8e c8eVarP2 = qyn.P(vt9Var2, z7eVar);
            vt9Var2.a0();
            if (vt9Var2.S) {
                vt9Var2.k(fzaVar);
            } else {
                vt9Var2.j0();
            }
            y4h.o(vt9Var2, o9iVarA, ah5Var);
            y4h.o(vt9Var2, oagVarL2, ah5Var2);
            u35.j(iHashCode2, vt9Var2, ah5Var3, vt9Var2);
            y4h.o(vt9Var2, c8eVarP2, ah5Var4);
            hp7 hp7Var = ua5.a;
            wta.b(iza.a((dl7) tk7.a.getValue(), vt9Var2), null, a26.X(mpj.h(lcp.j(z7eVar, 1.0f, ((sa5) vt9Var2.j(hp7Var)).B, v8i.a(8.0f)), 48.0f), 8.0f), ((sa5) vt9Var2.j(hp7Var)).a, vt9Var2, 56, 0);
            db5 db5VarA2 = cb5.a(new x62(12.0f, true, new t40((byte) 19)), rd3Var, vt9Var2, 6);
            int iHashCode3 = Long.hashCode(vt9Var2.T);
            oag oagVarL3 = vt9Var2.l();
            c8e c8eVarP3 = qyn.P(vt9Var2, z7eVar);
            vt9Var2.a0();
            if (vt9Var2.S) {
                vt9Var2.k(fzaVar);
            } else {
                vt9Var2.j0();
            }
            y4h.o(vt9Var2, db5VarA2, ah5Var);
            y4h.o(vt9Var2, oagVarL3, ah5Var2);
            u35.j(iHashCode3, vt9Var2, ah5Var3, vt9Var2);
            y4h.o(vt9Var2, c8eVarP3, ah5Var4);
            String strQ = uyg.q((shk) dhk.a.getValue(), vt9Var2);
            hp7 hp7Var2 = abm.a;
            ijl.b(strQ, null, 0L, 0L, null, 0L, null, new pel(3), 0L, 0, false, 0, 0, ((wam) vt9Var2.j(hp7Var2)).f, vt9Var2, 0, 0, 130046);
            ijl.b(uyg.q((shk) dhk.b.getValue(), vt9Var2), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var2.j(hp7Var2)).k, vt9Var2, 0, 0, 131070);
            fr3.a(g1bVar, null, vt9Var2, i4 & 14);
            b(num, null, vt9Var2, (i4 >> 3) & 14);
            vt9Var2.p(true);
            vt9Var2.p(true);
            yi4.a(function0, new kga(rbe.p), false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, i41.b, vt9Var2, ((i4 >> 6) & 14) | 805306368, 508);
            vt9Var = vt9Var2;
            vt9Var.p(true);
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new j51(g1bVar, num, function0, i2, (byte) 1);
        }
    }

    public static final void e0(Lazy lazy, tcc tccVar, Object obj, Function0 function0) {
        yo7 yo7Var = new yo7(tccVar, obj, function0, (byte) 8);
        if (lazy.c() && ((qdc) tccVar).i.d(qcc.c)) {
            yo7Var.invoke(lazy.get());
        } else {
            tccVar.a(new k4c(lazy, tccVar, yo7Var));
        }
    }

    public static final void f(d29 d29Var, Function0 function0, Function1 function1, Function0 function02, Function0 function03, Function0 function04, Function0 function05, c8e c8eVar, ih5 ih5Var, int i2) {
        c8e c8eVar2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1411559903);
        int i3 = i2 | (vt9Var.h(d29Var) ? 4 : 2) | (vt9Var.h(function0) ? 32 : 16) | (vt9Var.h(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var.h(function02) ? 2048 : 1024) | (vt9Var.h(function03) ? 16384 : 8192) | (vt9Var.h(function04) ? 131072 : 65536) | (vt9Var.h(function05) ? 1048576 : 524288) | 12582912;
        if (vt9Var.N(i3 & 1, (4793491 & i3) != 4793490)) {
            z7e z7eVar = z7e.b;
            sfe.r(mzg.q(vt9Var, 2132018731), function0, function05, z7eVar, gyg.P(1045555591, new aek(d29Var, function1, function02, function03, function04, (byte) 3), vt9Var), vt9Var, (i3 & 112) | 24576 | ((i3 >> 12) & 896) | 3072, 0);
            c8eVar2 = z7eVar;
        } else {
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new iy5(d29Var, function0, function1, function02, function03, function04, function05, c8eVar2, i2);
        }
    }

    public static void f0(Context context) {
        try {
            mom.b(q9n.l(context, t5d.class), mom.a(context));
        } catch (IllegalArgumentException unused) {
        }
    }

    public static int g(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            long j3 = (iArr[i3] & 4294967295L) + (iArr2[i3] & 4294967295L) + j2;
            iArr3[i3] = (int) j3;
            j2 = j3 >>> 32;
        }
        return (int) j2;
    }

    public static zh9 g0(XmlResourceParser xmlResourceParser, Resources resources) throws Throwable {
        int next;
        int i2;
        int i3;
        TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            int i4 = 2;
            if (next == 2) {
                xmlResourceParser.require(2, null, "font-family");
                if (!xmlResourceParser.getName().equals("font-family")) {
                    w0(xmlResourceParser);
                    return null;
                }
                TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), uhh.b);
                int i5 = 0;
                String string = typedArrayObtainAttributes.getString(0);
                String string2 = typedArrayObtainAttributes.getString(5);
                String string3 = typedArrayObtainAttributes.getString(6);
                String string4 = typedArrayObtainAttributes.getString(2);
                int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
                int i6 = 3;
                int integer = typedArrayObtainAttributes.getInteger(3, 1);
                int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
                String string5 = typedArrayObtainAttributes.getString(7);
                typedArrayObtainAttributes.recycle();
                if (string == null || string2 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlResourceParser.next() != 3) {
                        if (xmlResourceParser.getEventType() == 2) {
                            if (xmlResourceParser.getName().equals("font")) {
                                TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), uhh.c);
                                int i7 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                                boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                                int i8 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                                String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                                int i9 = typedArrayObtainAttributes2.getInt(i8, 0);
                                int i10 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                                int resourceId2 = typedArrayObtainAttributes2.getResourceId(i10, 0);
                                typedArrayObtainAttributes2.getString(i10);
                                typedArrayObtainAttributes2.recycle();
                                while (xmlResourceParser.next() != 3) {
                                    w0(xmlResourceParser);
                                }
                                arrayList.add(new bi9(i7, i9, resourceId2, string6, z));
                            } else {
                                w0(xmlResourceParser);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    return new ai9((bi9[]) arrayList.toArray(new bi9[0]));
                }
                List listI0 = i0(resources, resourceId);
                ArrayList arrayList2 = new ArrayList();
                while (xmlResourceParser.next() != i6) {
                    if (xmlResourceParser.getEventType() == i4) {
                        if (xmlResourceParser.getName().equals("fallback")) {
                            TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), uhh.d);
                            try {
                                String string7 = typedArrayObtainAttributes3.getString(i5);
                                String string8 = typedArrayObtainAttributes3.getString(1);
                                i3 = integer;
                                String string9 = typedArrayObtainAttributes3.getString(i4);
                                if (string7 == null) {
                                    typedArray = typedArrayObtainAttributes3;
                                    throw new XmlPullParserException("query attribute must be set in fallback element");
                                }
                                while (xmlResourceParser.next() != i6) {
                                    w0(xmlResourceParser);
                                }
                                try {
                                    typedArray = typedArrayObtainAttributes3;
                                    i2 = i6;
                                    try {
                                        th9 th9Var = new th9(string, string2, string7, listI0, string8, string9);
                                        typedArray.recycle();
                                        arrayList2.add(th9Var);
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    typedArray = typedArrayObtainAttributes3;
                                }
                                th = th;
                            } catch (Throwable th3) {
                                th = th3;
                                typedArray = typedArrayObtainAttributes3;
                            }
                            typedArray.recycle();
                            throw th;
                        }
                        i2 = i6;
                        i3 = integer;
                        w0(xmlResourceParser);
                        i6 = i2;
                        integer = i3;
                        i4 = 2;
                        i5 = 0;
                    }
                }
                int i11 = integer;
                if (!arrayList2.isEmpty()) {
                    return new ci9(arrayList2, i11, integer2, string5);
                }
                if (string3 == null) {
                    qp2.o("The provider font XML requires query attribute or fallback children.");
                    return null;
                }
                arrayList2.add(new th9(string, string2, string3, listI0, null, null));
                if (string4 != null) {
                    arrayList2.add(new th9(string, string2, string4, listI0, null, null));
                }
                return new ci9(arrayList2, i11, integer2, string5);
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }

    public static void h(int i2, int i3, int[] iArr) {
        long j2 = (iArr[0] & 4294967295L) + (i3 & 4294967295L);
        iArr[0] = (int) j2;
        long j3 = (iArr[1] & 4294967295L) + 1 + (j2 >>> 32);
        iArr[1] = (int) j3;
        if ((j3 >>> 32) == 0) {
            return;
        }
        T(i2, 2, iArr);
    }

    public static long h0(int i2, byte[] bArr) {
        int i3 = bArr[i2];
        int i4 = bArr[i2 + 1];
        int i5 = bArr[i2 + 2];
        int i6 = bArr[i2 + 3];
        if ((i3 & NotificationCompat.FLAG_HIGH_PRIORITY) == 128) {
            i3 = (i3 & 127) + NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i4 & NotificationCompat.FLAG_HIGH_PRIORITY) == 128) {
            i4 = (i4 & 127) + NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i5 & NotificationCompat.FLAG_HIGH_PRIORITY) == 128) {
            i5 = (i5 & 127) + NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i6 & NotificationCompat.FLAG_HIGH_PRIORITY) == 128) {
            i6 = (i6 & 127) + NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        return (i3 << 24) + (i4 << 16) + (i5 << 8) + i6;
    }

    public static int i(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            long j3 = (iArr[i3] & 4294967295L) + (iArr2[i3] & 4294967295L) + (iArr3[i3] & 4294967295L) + j2;
            iArr3[i3] = (int) j3;
            j2 = j3 >>> 32;
        }
        return (int) j2;
    }

    public static List i0(Resources resources, int i2) throws Resources.NotFoundException {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static int j(int i2, int i3, int[] iArr, int[] iArr2) {
        long j2 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            long j3 = (iArr[i4] & 4294967295L) + (iArr2[r7] & 4294967295L) + j2;
            iArr2[i3 + i4] = (int) j3;
            j2 = j3 >>> 32;
        }
        return (int) j2;
    }

    public static long j0(int i2, byte[] bArr) {
        long jH0 = h0(i2, bArr);
        long jH02 = h0(i2 + 4, bArr);
        if (jH0 == 0 && jH02 == 0) {
            return 0L;
        }
        return ((jH02 * 1000) / 4294967296L) + ((jH0 - 2208988800L) * 1000);
    }

    public static int k(int[] iArr, int[] iArr2, int i2) {
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            long j3 = (iArr[i3] & 4294967295L) + (iArr2[i3] & 4294967295L) + j2;
            iArr2[i3] = (int) j3;
            j2 = j3 >>> 32;
        }
        return (int) j2;
    }

    public static final void k0(uji ujiVar, HashSet hashSet, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-290867539);
        if ((((vt9Var.h(ujiVar) ? 4 : 2) | i2 | (vt9Var.h(hashSet) ? 32 : 16)) & 19) == 18 && vt9Var.z()) {
            vt9Var.Q();
        } else {
            vt9Var.W(647262698);
            boolean zF = vt9Var.f(ujiVar);
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            Object obj = objK;
            if (zF || objK == zpaVar) {
                kwb kwbVar = new kwb();
                kwbVar.a = hashSet;
                vt9Var.g0(kwbVar);
                obj = kwbVar;
            }
            kwb kwbVar2 = (kwb) obj;
            vt9Var.p(false);
            vt9Var.W(647265340);
            boolean zH = vt9Var.h(kwbVar2) | vt9Var.h(hashSet) | vt9Var.h(ujiVar);
            Object objK2 = vt9Var.K();
            if (zH || objK2 == zpaVar) {
                objK2 = new f9(kwbVar2, hashSet, ujiVar, (byte) 19);
                vt9Var.g0(objK2);
            }
            vt9Var.p(false);
            rm5.a(ujiVar, hashSet, (Function1) objK2, vt9Var);
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fx0(ujiVar, hashSet, i2, (byte) 14);
        }
    }

    public static void l(int i2, int i3, int i4, int[] iArr) {
        long j2 = (i3 & 4294967295L) + (iArr[i4] & 4294967295L);
        iArr[i4] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return;
        }
        T(i2, i4 + 1, iArr);
    }

    public static boolean l0(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, int i2) throws IOException {
        if (bitmap.isRecycled()) {
            qp2.o("Already recycled");
            return false;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(compressFormat, i2, fileOutputStream);
                fileOutputStream.close();
                return true;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public static int m(int i2, int i3, int[] iArr) {
        long j2 = (i3 & 4294967295L) + (iArr[0] & 4294967295L);
        iArr[0] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return 0;
        }
        return T(i2, 1, iArr);
    }

    public static Bitmap m0(float f2, Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCopy = config != config2 ? bitmap.copy(config2, false) : bitmap;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCopy, Math.round(bitmapCopy.getWidth() * f2), Math.round(bitmapCopy.getHeight() * f2), true);
        Bitmap bitmapA = rk3.a(bitmapCreateScaledBitmap, 4);
        if (bitmapCreateScaledBitmap != bitmapCopy) {
            bitmapCreateScaledBitmap.recycle();
        }
        if (bitmapCopy != bitmap) {
            bitmapCopy.recycle();
        }
        return bitmapA;
    }

    public static boolean n(c4j c4jVar, c4j c4jVar2) {
        fig figVar = c4jVar.a;
        int i2 = figVar.b;
        fig figVar2 = c4jVar2.a;
        return i2 == figVar2.b && figVar.e == figVar2.e && figVar.h == figVar2.h && figVar.i == figVar2.i;
    }

    public static void n0(gig gigVar, ood oodVar) {
        int i2 = oodVar.b;
        long j2 = oodVar.c;
        h1b h1bVar = oodVar.a;
        if (i2 == -1) {
            if (gigVar.C(20)) {
                gigVar.r0(h1bVar);
                return;
            } else {
                if (h1bVar.isEmpty()) {
                    return;
                }
                gigVar.l0((qjd) h1bVar.get(0));
                return;
            }
        }
        if (gigVar.C(20)) {
            gigVar.x(oodVar.b, h1bVar, j2);
        } else {
            if (h1bVar.isEmpty()) {
                return;
            }
            gigVar.e((qjd) h1bVar.get(0), j2);
        }
    }

    public static final pna o(wjh wjhVar, t9f t9fVar) {
        v9f v9fVar = new v9f();
        v9fVar.b = new w5f((byte) 4);
        v9fVar.d = (byte) 10;
        if (t9fVar == null) {
            t9fVar = (t9f) xne.b.get();
        }
        v9fVar.c = t9fVar;
        v9fVar.a = (jg8) wjhVar.f;
        z9f z9fVar = new z9f(v9fVar);
        vna vnaVar = new vna();
        vnaVar.e = true;
        vnaVar.a(ptm.b, new q9a((byte) 16));
        vnaVar.a(er5.e, new q9a((byte) 17));
        return new pna(z9fVar, vnaVar, false);
    }

    public static int o0(int i2, int i3, int[] iArr, int[] iArr2) {
        int i4 = 0;
        while (i4 < i2) {
            int i5 = iArr[i4];
            iArr2[i4] = (i5 << 1) | (i3 >>> 31);
            i4++;
            i3 = i5;
        }
        return i3 >>> 31;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [qt9] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List p(lqj lqjVar, Integer num, int i2, Integer num2) {
        int iD;
        int iR;
        dee deeVar;
        if (lqjVar.w || lqjVar.o() == 0) {
            return l08.a;
        }
        vkh vkhVar = new vkh(lqjVar);
        if (num2 != null) {
            iD = num2.intValue();
        } else {
            iD = lqjVar.v;
            if (iD < 0) {
                iD = lqjVar.D(i2, lqjVar.b);
            }
        }
        if (num == 0) {
            int iM = lqjVar.i - lqjVar.M(lqjVar.q(i2), lqjVar.b);
            jde jdeVar = lqjVar.s;
            num = Integer.valueOf(iM + ((jdeVar == null || (deeVar = (dee) jdeVar.e(i2)) == null) ? 0 : deeVar.b));
        }
        int iQ = lqjVar.q(i2) * 5;
        int[] iArr = lqjVar.b;
        if (iQ < iArr.length) {
            iR = lqjVar.r(i2);
        } else {
            int iD2 = iD >= 0 ? lqjVar.D(iD, iArr) : iD;
            iR = lqjVar.r(iD);
            int i3 = iD;
            iD = iD2;
            i2 = i3;
        }
        while (i2 >= 0) {
            vkhVar.A0(iR, (lqjVar.b[(lqjVar.q(i2) * 5) + 1] & 536870912) != 0 ? lqjVar.s(i2) : hh5.a, lqjVar.N(i2), (Object) num);
            num = lqjVar.b(i2);
            if (iD >= 0) {
                int iD3 = lqjVar.D(iD, lqjVar.b);
                iR = lqjVar.r(iD);
                int i4 = iD;
                iD = iD3;
                i2 = i4;
            } else {
                i2 = iD;
            }
        }
        return (ArrayList) ((n1) vkhVar).b;
    }

    public static int p0(int i2, int[] iArr) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = iArr[i3];
            iArr[i3] = (i5 << 2) | (i4 >>> (-2));
            i3++;
            i4 = i5;
        }
        return i4 >>> (-2);
    }

    public static int q(long j2, long j3) {
        if (j2 == -9223372036854775807L || j3 == -9223372036854775807L) {
            return 0;
        }
        if (j3 == 0) {
            return 100;
        }
        return tym.i(tym.R(j2, j3), 0, 100);
    }

    public static int q0(int[] iArr, int[] iArr2, int i2) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = iArr[i3];
            iArr2[i3] = (i5 << 3) | (i4 >>> (-3));
            i3++;
            i4 = i5;
        }
        return i4 >>> (-3);
    }

    public static final void r(View view) {
        k1j k1jVarA = t1j.a(new g7n(view, null));
        while (k1jVarA.hasNext()) {
            ArrayList arrayList = J((View) k1jVarA.next()).a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (-1 < size) {
                    ((t5n) arrayList.get(size)).a.e();
                }
            }
        }
    }

    public static final boolean r0(Context context) {
        String[] strArr = OperaApplication.K;
        return ((Boolean) ((yk6) context.getApplicationContext().e().get()).k.g()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d3, code lost:
    
        if (r0 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d5, code lost:
    
        if (r14 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d7, code lost:
    
        r6.addLast(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00de, code lost:
    
        r14 = r6;
        r13 = r9;
        r12 = r11;
        r6 = r1;
        r1 = r2;
        r2 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0122, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0123, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(defpackage.l1j r20, g29 r21, i72 r22, w6g r23, boolean r24, boolean r25, z53 r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z5i.s(l1j, g29, i72, w6g, boolean, boolean, z53):java.lang.Object");
    }

    public static final void s0(Context context, SettingsManager settingsManager, d8j d8jVar, String str, boolean z, pt3 pt3Var) {
        Object next;
        if (!settingsManager.i("ai_assistant_menu_shortcut")) {
            ((g8j) d8jVar).c(new int[]{2131364286});
            return;
        }
        String[] strArr = OperaApplication.K;
        Iterator it = Collections.unmodifiableList(context.getApplicationContext().I().a).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((eri) next) instanceof l42) {
                    break;
                }
            }
        }
        eri eriVar = (eri) next;
        if (eriVar == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        pt3Var.b(eriVar, str, z, false);
    }

    public static final Object t(y5i y5iVar, Function1 function1, mt5 mt5Var) {
        if ((!y5iVar.n() || !y5iVar.r() || !y5iVar.o()) && mt5Var.getContext().get(a6i.a) != null) {
            return E0(y5iVar, function1, mt5Var);
        }
        return function1.invoke(mt5Var);
    }

    public static void t0(Context context, Locale locale, mlj mljVar) {
        String string = context.getString(2132017505, context.getString(2132017424), context.getString(ywc.a(locale.getLanguage()).b));
        qxh qxhVar = string != null ? new qxh(string) : null;
        xj xjVar = new xj(context, mljVar, (byte) 6);
        z77 z77Var = (z77) context.getSystemService("com.opera.android.ui.DIALOG_QUEUE_SERVICE");
        gkj gkjVar = new gkj(false, false);
        gkjVar.a = null;
        gkjVar.b = null;
        gkjVar.c = null;
        gkjVar.d = null;
        gkjVar.e = null;
        gkjVar.f = null;
        gkjVar.g = null;
        gkjVar.h = xjVar;
        gkjVar.i = null;
        gkjVar.j = null;
        gkjVar.k = 2132020202;
        gkjVar.l = 2132020043;
        gkjVar.m = 2132017504;
        gkjVar.n = true;
        gkjVar.o = qxhVar;
        z77Var.getClass();
        z77Var.b(gkjVar, ijm.b);
    }

    public static Bitmap u(int i2, int i3, Bitmap.Config config) {
        if (i2 <= 0 || i3 <= 0) {
            return null;
        }
        try {
            return Bitmap.createBitmap(i2, i3, config);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public static void u0(Context context, Locale locale) {
        String string = context.getString(2132017503, context.getString(ywc.a(locale.getLanguage()).b));
        qxh qxhVar = string != null ? new qxh(string) : null;
        kw0 kw0Var = new kw0(context);
        z77 z77Var = (z77) context.getSystemService("com.opera.android.ui.DIALOG_QUEUE_SERVICE");
        gkj gkjVar = new gkj(false, false);
        gkjVar.a = null;
        gkjVar.b = null;
        gkjVar.c = null;
        gkjVar.d = null;
        gkjVar.e = null;
        gkjVar.f = null;
        gkjVar.g = null;
        gkjVar.h = kw0Var;
        gkjVar.i = null;
        gkjVar.j = null;
        gkjVar.k = 2132018205;
        gkjVar.l = 2132020043;
        gkjVar.m = 2132017504;
        gkjVar.n = true;
        gkjVar.o = qxhVar;
        z77Var.getClass();
        z77Var.b(gkjVar, ijm.b);
    }

    public static int v(int i2, int i3, int[] iArr) {
        while (i3 < i2) {
            int i4 = iArr[i3] - 1;
            iArr[i3] = i4;
            if (i4 != -1) {
                return 0;
            }
            i3++;
        }
        return -1;
    }

    public static final void v0(Context context) {
        z77 z77VarU = sfe.U(context);
        nom nomVar = new nom((byte) 0);
        z77VarU.getClass();
        z77VarU.b(nomVar, ijm.b);
    }

    public static String w(CharsetDecoder charsetDecoder, dwj dwjVar) {
        StringBuilder sb = new StringBuilder((int) Math.min(2147483647L, dwjVar.u().c));
        if (Intrinsics.a(charsetDecoder.charset(), Charsets.UTF_8)) {
            dwjVar.request(Long.MAX_VALUE);
            sb.append((CharSequence) mfh.k(dwjVar.u(), dwjVar.u().c));
        } else {
            long j2 = dwjVar.u().c;
            sb.append((CharSequence) new String(w0h.m(dwjVar, -1), charsetDecoder.charset()));
        }
        return sb.toString();
    }

    public static void w0(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static Bitmap x(Drawable drawable, int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        return y(drawable, i2, i3, Bitmap.Config.ARGB_8888);
    }

    public static int x0(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            long j3 = ((iArr[i3] & 4294967295L) - (iArr2[i3] & 4294967295L)) + j2;
            iArr3[i3] = (int) j3;
            j2 = j3 >> 32;
        }
        return (int) j2;
    }

    public static Bitmap y(Drawable drawable, int i2, int i3, Bitmap.Config config) {
        if (i2 <= 0 || i3 <= 0) {
            return null;
        }
        Bitmap bitmapU = u(i2, i3, config);
        if (bitmapU != null) {
            Canvas canvas = new Canvas(bitmapU);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
        }
        return bitmapU;
    }

    public static void y0(int i2, int i3, int[] iArr) {
        long j2 = (iArr[0] & 4294967295L) - (i3 & 4294967295L);
        iArr[0] = (int) j2;
        long j3 = ((iArr[1] & 4294967295L) - 1) + (j2 >> 32);
        iArr[1] = (int) j3;
        if ((j3 >> 32) == 0) {
            return;
        }
        v(i2, 2, iArr);
    }

    public static final void z(CharsetEncoder charsetEncoder, c04 c04Var, CharSequence charSequence, int i2, int i3) throws CharacterCodingException {
        if (i2 < i3) {
            do {
                byte[] bArrS = w7d.s(charsetEncoder, charSequence, i2, i3);
                c04Var.s(bArrS.length, bArrS);
                int length = bArrS.length;
                if (length < 0) {
                    qp2.n("Check failed.");
                    return;
                }
                i2 += length;
            } while (i2 < i3);
        }
    }

    public static int z0(int i2, int i3, int[] iArr, int[] iArr2) {
        long j2 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            long j3 = ((iArr2[r3] & 4294967295L) - (iArr[i4] & 4294967295L)) + j2;
            iArr2[i3 + i4] = (int) j3;
            j2 = j3 >> 32;
        }
        return (int) j2;
    }
}
