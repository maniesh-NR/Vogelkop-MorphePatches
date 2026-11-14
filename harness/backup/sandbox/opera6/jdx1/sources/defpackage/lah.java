package defpackage;

import J.N;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.webkit.WebViewCompat;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.suggestion.Suggestion;
import com.usercentrics.sdk.UsercentricsConsentUserResponse;
import com.usercentrics.sdk.UsercentricsUserInteraction;
import com.usercentrics.sdk.ui.PredefinedUIResponse;
import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class lah {
    public static volatile String a;
    public static volatile String b;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0069 -> B:23:0x006a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable A(java.util.List r5, nt5 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.l3m
            if (r0 == 0) goto L13
            r0 = r6
            l3m r0 = (defpackage.l3m) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            l3m r0 = new l3m
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.w
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            java.util.ArrayList r5 = r0.v
            java.util.Iterator r2 = r0.u
            java.util.ArrayList r4 = r0.t
            defpackage.ybh.y(r6)
            goto L6a
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            r5 = 0
            return r5
        L34:
            defpackage.ybh.y(r6)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r2 = 10
            int r2 = k95.o(r5, r2)
            r6.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
            r2 = r5
            r5 = r6
        L4a:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L6f
            java.lang.Object r6 = r2.next()
            r0.t = r5
            r0.u = r2
            r0.v = r5
            r0.x = r3
            boolean r4 = r6 instanceof defpackage.sdk
            if (r4 == 0) goto L66
            sdk r6 = (defpackage.sdk) r6
            java.lang.Object r6 = r6.a(r0)
        L66:
            if (r6 != r1) goto L69
            return r1
        L69:
            r4 = r5
        L6a:
            r5.add(r6)
            r5 = r4
            goto L4a
        L6f:
            java.util.List r5 = (java.util.List) r5
            java.util.Collection r5 = (java.util.Collection) r5
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lah.A(java.util.List, nt5):java.io.Serializable");
    }

    public static final void a(u89 u89Var, long j, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1353562852);
        int i2 = (vt9Var.f(u89Var) ? 4 : 2) | i | (vt9Var.e(j) ? 32 : 16);
        if (vt9Var.N(i2 & 1, (i2 & 19) != 18)) {
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            Object obj = objK;
            if (objK == zpaVar) {
                d91 d91VarA = f91.a();
                d91VarA.h(1);
                vt9Var.g0(d91VarA);
                obj = d91VarA;
            }
            d91 d91Var = (d91) obj;
            Object objK2 = vt9Var.K();
            if (objK2 == zpaVar) {
                objK2 = luj.b(new d8e(u89Var, (byte) 23));
                vt9Var.g0(objK2);
            }
            iak iakVarB = md1.b(((Number) ((iak) objK2).getValue()).floatValue(), nb6.Y(jae.c, vt9Var), null, vt9Var, 0, 28);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objK3 = vt9Var.K();
            if (z || objK3 == zpaVar) {
                objK3 = new rmg(u89Var, (byte) 8);
                vt9Var.g0(objK3);
            }
            AtomicInteger atomicInteger = h0j.a;
            c8e c8eVarH = mpj.h(new h25((Function1) objK3), 16.0f);
            boolean zF = (i3 == 4) | vt9Var.f(iakVarB) | ((i2 & 112) == 32) | vt9Var.h(d91Var);
            Object objK4 = vt9Var.K();
            if (zF || objK4 == zpaVar) {
                objK4 = new do3((Object) u89Var, (Object) iakVarB, j, (Object) d91Var, (byte) 2);
                vt9Var.g0(objK4);
            }
            oup.H(c8eVarH, (Function1) objK4, vt9Var, 0);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new jah(u89Var, j, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final boolean r16, final kotlin.jvm.functions.Function0 r17, final defpackage.c8e r18, defpackage.sah r19, defpackage.td3 r20, cr9 r21, final defpackage.ue5 r22, defpackage.ih5 r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lah.b(boolean, kotlin.jvm.functions.Function0, c8e, sah, td3, cr9, ue5, ih5, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair c(java.io.RandomAccessFile r10, int r11) {
        /*
            r0 = 0
            if (r11 < 0) goto L8b
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r11 > r1) goto L8b
            long r2 = r10.length()
            r4 = 22
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L6d
            long r6 = (long) r11
            long r4 = r2 - r4
            long r4 = java.lang.Math.min(r6, r4)
            int r11 = (int) r4
            r4 = 22
            int r11 = r11 + r4
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocate(r11)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            r11.order(r5)
            int r6 = r11.capacity()
            long r6 = (long) r6
            long r2 = r2 - r6
            r10.seek(r2)
            byte[] r6 = r11.array()
            int r7 = r11.arrayOffset()
            int r8 = r11.capacity()
            r10.readFully(r6, r7, r8)
            java.nio.ByteOrder r10 = r11.order()
            if (r10 != r5) goto L85
            int r10 = r11.capacity()
            r5 = -1
            if (r10 < r4) goto L6a
            int r10 = r10 - r4
            int r4 = java.lang.Math.min(r10, r1)
            r6 = 0
        L51:
            if (r6 >= r4) goto L6a
            int r7 = r10 - r6
            int r8 = r11.getInt(r7)
            r9 = 101010256(0x6054b50, float:2.506985E-35)
            if (r8 != r9) goto L67
            int r8 = r7 + 20
            short r8 = r11.getShort(r8)
            r8 = r8 & r1
            if (r8 == r6) goto L6b
        L67:
            int r6 = r6 + 1
            goto L51
        L6a:
            r7 = r5
        L6b:
            if (r7 != r5) goto L6e
        L6d:
            return r0
        L6e:
            r11.position(r7)
            java.nio.ByteBuffer r10 = r11.slice()
            java.nio.ByteOrder r11 = java.nio.ByteOrder.LITTLE_ENDIAN
            r10.order(r11)
            long r0 = (long) r7
            long r2 = r2 + r0
            java.lang.Long r11 = java.lang.Long.valueOf(r2)
            android.util.Pair r10 = android.util.Pair.create(r10, r11)
            return r10
        L85:
            java.lang.String r10 = "ByteBuffer byte order must be little endian"
            qp2.o(r10)
            return r0
        L8b:
            java.lang.String r10 = "maxCommentSize: "
            java.lang.String r10 = defpackage.a4h.a(r10, r11)
            qp2.o(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lah.c(java.io.RandomAccessFile, int):android.util.Pair");
    }

    public static void d(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
    }

    public static final void e(StylingImageButton stylingImageButton, boolean z) {
        n1h.n(stylingImageButton, z ? 2132019966 : 2132022047, 0);
        Drawable drawable = stylingImageButton.getDrawable();
        if (drawable == null) {
            drawable = new ColorDrawable(0);
            stylingImageButton.setImageDrawable(drawable);
        }
        drawable.setLevel(z ? 1 : 0);
    }

    public static final void f(String str, boolean z) {
        ucd ucdVarD;
        tcd tcdVarA;
        String str2;
        if (str == null || StringsKt.N(str)) {
            return;
        }
        String str3 = b;
        if ((str3 != null && !StringsKt.N(str3) && !z) || (ucdVarD = Regex.d(new Regex("\\bChrome/([0-9.]+)"), str)) == null || (tcdVarA = ucdVarD.a()) == null || (str2 = (String) tcdVarA.get(1)) == null) {
            return;
        }
        b = str2;
    }

    public static final String g(String str) {
        String string;
        if (str == null || (string = StringsKt.l0(str).toString()) == null || string.length() <= 0) {
            return null;
        }
        return string;
    }

    public static anj h(String str) {
        String strH = wqm.H(str);
        URL urlE0 = a26.e0(strH);
        if (urlE0 == null) {
            return new anj(strH);
        }
        if (Intrinsics.a(urlE0.getProtocol(), "file")) {
            return new anj(new File(urlE0.getPath()).getName());
        }
        String hostString = BrowserUtils.getHostString(urlE0.toString());
        String str2 = (String) N.MnEPjazD(hostString, false);
        String strS = aik.s(hostString, anj.d);
        int i = 0;
        for (int i2 = 0; i2 < strS.length(); i2++) {
            if (strS.charAt(i2) == '.') {
                i++;
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < str2.length(); i4++) {
            if (str2.charAt(i4) == '.') {
                i3++;
            }
        }
        int i5 = i - i3;
        int iK = 0;
        for (int i6 = 0; i6 < i5; i6++) {
            iK = StringsKt.K(strS, '.', iK, 4) + 1;
        }
        String strSubstring = "";
        String strSubstring2 = iK > 0 ? strS.substring(0, iK - 1) : "";
        int iK2 = StringsKt.K(strS, '.', iK, 4);
        if (iK2 > iK + 1) {
            String strSubstring3 = strS.substring(iK, iK2);
            strSubstring = strS.substring(iK2 + 1);
            strS = strSubstring3;
        }
        return new anj(strS, strSubstring2, strSubstring);
    }

    public static fqk i(Suggestion suggestion, int i, xpk xpkVar) {
        Suggestion suggestion2 = suggestion;
        if (rbe.z) {
            Locale locale = Locale.US;
            int i2 = suggestion2.g;
            String str = suggestion2.b;
            String str2 = String.format(locale, "[%d]: %s", Arrays.copyOf(new Object[]{Integer.valueOf(i2), str}, 2));
            if (!str.equals(str2)) {
                suggestion2 = new Suggestion(suggestion2.a, str2, suggestion2.c, suggestion2.d, suggestion2.e, suggestion2.f, suggestion2.g, suggestion2.h, suggestion2.i, suggestion2.j, suggestion2.k);
            }
        }
        return new fqk(suggestion2, i, xpkVar);
    }

    public static final void j(mk7 mk7Var, d91 d91Var, voh vohVar, long j, float f, f82 f82Var) {
        d91Var.g();
        d91Var.a.moveTo(0.0f, 0.0f);
        float fO0 = mk7Var.o0(10.0f);
        float f2 = f82Var.b;
        d91Var.e((fO0 * f2) / 2.0f, mk7Var.o0(5.0f) * f2);
        d91Var.e(mk7Var.o0(10.0f) * f2, 0.0f);
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (vohVar.b() >> 32)) + (Math.min(vohVar.c - vohVar.a, vohVar.d - vohVar.b) / 2.0f)) - ((mk7Var.o0(10.0f) * f2) / 2.0f);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (vohVar.b() & 4294967295L)) - mk7Var.o0(2.5f);
        d91Var.i((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
        float fO02 = f82Var.a - mk7Var.o0(2.5f);
        long jW0 = mk7Var.w0();
        d5o d5oVarS0 = mk7Var.s0();
        long jD = d5oVarS0.D();
        d5oVarS0.A().j();
        try {
            ((wth) d5oVarS0.a).M(jW0, fO02);
            mk7.F0(mk7Var, d91Var, j, f, new qik(0, 0, mk7Var.o0(2.5f), 0.0f, 30), 48);
        } finally {
            am2.w(d5oVarS0, jD);
        }
    }

    public static final String k(Context context) {
        PackageInfo q0iVar;
        String str;
        String strG = g(a);
        if (strG == null) {
            List list = r8p.a;
            String str2 = null;
            strG = g(PreferenceManager.getDefaultSharedPreferences(context).getString("opera.ads.sdk.default_user_agent", null));
            if (strG == null) {
                Set set = tlp.a;
                try {
                    p0i p0iVar = t0i.b;
                    q0iVar = WebViewCompat.getCurrentWebViewPackage(context);
                } catch (Throwable th) {
                    p0i p0iVar2 = t0i.b;
                    q0iVar = new q0i(th);
                }
                if (q0iVar instanceof q0i) {
                    q0iVar = null;
                }
                PackageInfo packageInfo = q0iVar;
                if (packageInfo != null) {
                    if (!tlp.a.contains(packageInfo.packageName)) {
                        packageInfo = null;
                    }
                    if (packageInfo != null && (str = packageInfo.versionName) != null && !StringsKt.N(str) && Character.isDigit(str.charAt(0))) {
                        str2 = str;
                    }
                }
                if (str2 == null) {
                    str2 = "51.0.2704.81";
                }
                StringBuilder sb = new StringBuilder("Mozilla/5.0 (Linux; Android ");
                sb.append(Build.VERSION.RELEASE);
                sb.append("; ");
                sb.append(Build.MODEL);
                sb.append(" Build/");
                return sko.n(sb, Build.ID, "; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/", str2, " Mobile Safari/537.36");
            }
        }
        return strG;
    }

    public static final voh n(p1d p1dVar, int i, j2m j2mVar, njl njlVar, boolean z, int i2) {
        float f;
        voh vohVarC = njlVar != null ? njlVar.c(j2mVar.b.i(i)) : voh.e;
        int iM = p1dVar.M(2.0f);
        float f2 = vohVarC.a;
        if (z) {
            f = i2 - f2;
            f2 = f - iM;
        } else {
            f = f2 + iM;
        }
        return new voh(f2, vohVarC.b, f, vohVarC.d);
    }

    public static RecyclerView o(View view) {
        Object parent = view.getParent();
        if (parent instanceof RecyclerView) {
            return (RecyclerView) parent;
        }
        if (parent instanceof View) {
            return o((View) parent);
        }
        return null;
    }

    public static int p(Suggestion suggestion) {
        switch (suggestion.a) {
            case 8:
                return 1;
            case 9:
            case 11:
            case 15:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 28:
            case 30:
            case 31:
            default:
                return 0;
            case 10:
                return 2;
            case 12:
                return 4;
            case 13:
                return 5;
            case 14:
                return 3;
            case 16:
                return 8;
            case 17:
                return 9;
            case 18:
                return 10;
            case 19:
                return 11;
            case 20:
                return 12;
            case 26:
                return 17;
            case 27:
                return 18;
            case 29:
                return 19;
            case 32:
                return 21;
            case 33:
                return 22;
            case 34:
                return 23;
        }
    }

    public static void q(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = ((j >>> 57) ^ (jArr[1] << 7)) & 144115188075855871L;
        long j3 = j & 144115188075855871L;
        long j4 = jArr2[0];
        long j5 = ((j4 >>> 57) ^ (jArr2[1] << 7)) & 144115188075855871L;
        long j6 = j4 & 144115188075855871L;
        long[] jArr4 = new long[6];
        r(jArr3, j3, j6, jArr4, 0);
        r(jArr3, j2, j5, jArr4, 2);
        r(jArr3, j3 ^ j2, j6 ^ j5, jArr4, 4);
        long j7 = jArr4[1] ^ jArr4[2];
        long j8 = jArr4[0];
        long j9 = jArr4[3];
        long j10 = (jArr4[4] ^ j8) ^ j7;
        long j11 = (jArr4[5] ^ j9) ^ j7;
        jArr3[0] = j8 ^ (j10 << 57);
        jArr3[1] = (j10 >>> 7) ^ (j11 << 50);
        jArr3[2] = (j11 >>> 14) ^ (j9 << 43);
        jArr3[3] = j9 >>> 21;
    }

    public static void r(long[] jArr, long j, long j2, long[] jArr2, int i) {
        jArr[1] = j2;
        long j3 = j2 << 1;
        jArr[2] = j3;
        long j4 = j3 ^ j2;
        jArr[3] = j4;
        long j5 = j2 << 2;
        jArr[4] = j5;
        jArr[5] = j5 ^ j2;
        long j6 = j4 << 1;
        jArr[6] = j6;
        jArr[7] = j6 ^ j2;
        long j7 = jArr[((int) j) & 7];
        long j8 = 0;
        int i2 = 48;
        do {
            int i3 = (int) (j >>> i2);
            long j9 = (jArr[i3 & 7] ^ (jArr[(i3 >>> 3) & 7] << 3)) ^ (jArr[(i3 >>> 6) & 7] << 6);
            j7 ^= j9 << i2;
            j8 ^= j9 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr2[i] = 144115188075855871L & j7;
        jArr2[i + 1] = (j7 >>> 57) ^ ((j8 ^ (((j & 72198606942111744L) & ((j2 << 7) >> 63)) >>> 8)) << 7);
    }

    public static eao s(t9l t9lVar, u7k u7kVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        double d;
        int iCeil = ((m9f) t9lVar.a).b;
        byte[][] bArr4 = (byte[][]) u7kVar.a;
        eao[] eaoVarArr = new eao[bArr4.length];
        for (int i = 0; i != bArr4.length; i++) {
            eaoVarArr[i] = new eao(0, bArr4[i]);
        }
        sfe.h0(0, 20, bArr);
        int i2 = 0;
        while (iCeil > 1) {
            int i3 = 0;
            while (true) {
                d = iCeil / 2;
                if (i3 >= ((int) Math.floor(d))) {
                    break;
                }
                sfe.h0(i3, 24, bArr);
                int i4 = i3 << 1;
                eaoVarArr[i3] = u(t9lVar, eaoVarArr[i4], eaoVarArr[i4 + 1], bArr, bArr2, bArr3);
                i3++;
            }
            if (iCeil % 2 == 1) {
                eaoVarArr[(int) Math.floor(d)] = eaoVarArr[iCeil - 1];
            }
            iCeil = (int) Math.ceil(iCeil / 2.0d);
            i2++;
            sfe.h0(i2, 20, bArr);
        }
        return eaoVarArr[0];
    }

    public static void t(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        q(jArr, jArr2, jArr4);
        v(jArr4, jArr3);
    }

    public static eao u(t9l t9lVar, eao eaoVar, eao eaoVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (eaoVar.a != eaoVar2.a) {
            qp2.n("height of both nodes must be equal");
            return null;
        }
        byte[] bArr4 = (byte[]) t9lVar.d;
        yvb yvbVar = (yvb) t9lVar.b;
        int i = ((m9f) t9lVar.a).a;
        sfe.h0(0, 28, bArr);
        yvbVar.a(3, 0, bArr4, bArr, bArr2);
        sfe.h0(1, 28, bArr);
        yvbVar.a(3, 0, bArr4, bArr, bArr3);
        sfe.h0(2, 28, bArr);
        yvbVar.a(3, i, bArr4, bArr, bArr3);
        byte[] bArr5 = eaoVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            bArr3[i2] = (byte) (bArr3[i2] ^ bArr5[i2]);
        }
        byte[] bArr6 = eaoVar2.b;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i + i3;
            bArr3[i4] = (byte) (bArr3[i4] ^ bArr6[i3]);
        }
        byte[] bArr7 = new byte[i];
        yvbVar.a(1, 0, bArr2, bArr3, bArr7);
        return new eao(eaoVar.a, bArr7);
    }

    public static void v(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = j3 ^ ((j4 >>> 49) ^ (j4 >>> 40));
        long j6 = j ^ ((j5 << 15) ^ (j5 << 24));
        long j7 = (j2 ^ ((j4 << 15) ^ (j4 << 24))) ^ ((j5 >>> 49) ^ (j5 >>> 40));
        long j8 = j7 >>> 49;
        jArr2[0] = (j6 ^ j8) ^ (j8 << 9);
        jArr2[1] = j7 & 562949953421311L;
    }

    public static final afe w(jyh jyhVar, Object obj, Object obj2, Function2 function2, ih5 ih5Var) {
        vt9 vt9Var = (vt9) ih5Var;
        ((tyh) vt9Var.j(vyh.b)).getClass();
        syh syhVarA = tyh.a(vt9Var);
        boolean zF = vt9Var.f(jyhVar) | vt9Var.f(obj) | vt9Var.f(obj2) | vt9Var.f(syhVarA);
        Object objK = vt9Var.K();
        if (zF || objK == hh5.a) {
            objK = hyg.k(scd.g0(h.a, new izh(function2, syhVarA, (mt5) null, (byte) 2)));
            vt9Var.g0(objK);
        }
        return (afe) objK;
    }

    public static final void x(ImageView imageView, Drawable drawable) {
        drawable.mutate();
        Drawable drawable2 = imageView.getDrawable();
        drawable.setLevel(drawable2 != null ? drawable2.getLevel() : 0);
        imageView.setImageDrawable(drawable);
    }

    public static void y(long[] jArr, long[] jArr2, int i) {
        long[] jArr3 = new long[4];
        ui6.t(jArr, jArr3, 2);
        while (true) {
            v(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                ui6.t(jArr2, jArr3, 2);
            }
        }
    }

    public static final UsercentricsConsentUserResponse z(PredefinedUIResponse predefinedUIResponse) {
        UsercentricsUserInteraction usercentricsUserInteraction;
        int iOrdinal = predefinedUIResponse.a.ordinal();
        if (iOrdinal == 0) {
            usercentricsUserInteraction = UsercentricsUserInteraction.ACCEPT_ALL;
        } else if (iOrdinal == 1) {
            usercentricsUserInteraction = UsercentricsUserInteraction.DENY_ALL;
        } else if (iOrdinal == 2) {
            usercentricsUserInteraction = UsercentricsUserInteraction.GRANULAR;
        } else {
            if (iOrdinal != 3) {
                h9o.p();
                return null;
            }
            usercentricsUserInteraction = UsercentricsUserInteraction.NO_INTERACTION;
        }
        return new UsercentricsConsentUserResponse(usercentricsUserInteraction, predefinedUIResponse.b, predefinedUIResponse.c);
    }
}
