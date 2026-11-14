package defpackage;

import ads_mobile_sdk.ov;
import ads_mobile_sdk.ul0;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import android.graphics.Matrix;
import android.view.inputmethod.ExtractedText;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.Preconditions;
import com.opera.android.OperaApplication;
import com.opera.android.PushedContentHandler;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.settings.SettingsManager;
import com.usercentrics.ccpa.CCPAData;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.NavigationEntry;
import org.chromium.content_public.browser.NavigationHandle;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class x1p {
    public static final d65 a = new d65((Throwable) null);
    public static final int[] b = new int[0];
    public static final long[] c = new long[0];
    public static final Object[] d = new Object[0];
    public static final r0o e = new r0o(0.31006f, 0.31616f);
    public static final r0o f = new r0o(0.34567f, 0.3585f);
    public static final r0o g = new r0o(0.32168f, 0.33767f);
    public static final r0o h = new r0o(0.31271f, 0.32902f);
    public static final float[] i = {0.964212f, 1.0f, 0.825188f};
    public static final int[] j = {13, 15, 14};
    public static final j5i k = new j5i(0.16f, 0.1f, 0.08f, 0.1f);
    public static final StackTraceElement[] l = new StackTraceElement[0];
    public static final eko m = new eko(7);
    public static yza n;
    public static ua7 o;

    public static boolean C(NavigationHandle navigationHandle) {
        return !navigationHandle.p && (navigationHandle.d & 1073741824) == 1073741824;
    }

    public static boolean D(Context context, nzk nzkVar) {
        String[] strArr = OperaApplication.K;
        SettingsManager settingsManagerJ = context.getApplicationContext().J();
        if (settingsManagerJ.i("darken_websites") && settingsManagerJ.i("night_mode_switch_theme") && owe.c.a.get()) {
            return true;
        }
        return settingsManagerJ.i("darken_websites_dark_theme") && settingsManagerJ.P(nzkVar);
    }

    public static boolean E(int i2) {
        return i2 == 6 || i2 == 1 || i2 == 2 || i2 == 4;
    }

    public static j6e I(XmlResourceParser xmlResourceParser, wzg wzgVar, p1 p1Var, k6e k6eVar) throws XmlPullParserException, IOException {
        String str;
        xmlResourceParser.require(2, null, "provider");
        String attributeValue = xmlResourceParser.getAttributeValue(null, "name");
        String attributeValue2 = xmlResourceParser.getAttributeValue(null, "url");
        String attributeValue3 = xmlResourceParser.getAttributeValue(null, "suggest");
        String attributeValue4 = xmlResourceParser.getAttributeValue(null, "color-icon");
        if (attributeValue4 == null) {
            attributeValue4 = xmlResourceParser.getAttributeValue(null, "mono-icon");
        }
        if (attributeValue4 != null) {
            wzgVar.getClass();
            str = attributeValue4;
        } else {
            str = null;
        }
        j6e j6eVar = new j6e(attributeValue, attributeValue2, str, attributeValue3, Boolean.parseBoolean(xmlResourceParser.getAttributeValue(null, "default")) ? 2 : 4, k6eVar);
        l6e l6eVar = j6eVar.a;
        l6eVar.i = wzgVar;
        l6eVar.g = p1Var;
        return j6eVar;
    }

    public static String R(PushedContentHandler pushedContentHandler) {
        long j2 = ((SharedPreferences) pushedContentHandler.e.get()).getLong("last-success", 0L);
        b59 b59Var = pushedContentHandler.e;
        long j3 = ((SharedPreferences) b59Var.get()).getLong("last-data", 0L);
        if (j2 == 0 && j3 == 0) {
            return ((SharedPreferences) b59Var.get()).contains("version") ? "U" : "";
        }
        String str = d3.i.format(new Date(j2));
        if (j3 == 0) {
            return str;
        }
        return str + "A" + ((j2 - j3) / 3600000);
    }

    public static void S(sp4 sp4Var, boolean z) {
        Boolean bool = Boolean.TRUE;
        cwm cwmVar = sp4Var.a;
        long jC = new ch6().c();
        rdj rdjVar = cwmVar.e;
        mdk[] mdkVarArr = mdk.a;
        rdjVar.d("ccpa_timestamp_millis", String.valueOf(jC));
        sp4Var.d.b(new CCPAData(1, bool, Boolean.valueOf(z), sp4Var.c));
    }

    public static final String T(Object obj) {
        return sko.k(obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName(), "@", String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1)));
    }

    public static final u1g U(Integer num, Integer num2, Integer num3, hc2 hc2Var, String str, boolean z) {
        int iIntValue;
        int iIntValue2 = num.intValue() + (z ? 1 : 0);
        if (num2 != null) {
            iIntValue = num2.intValue();
            if (z) {
                iIntValue++;
            }
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        int iMin = Math.min(iIntValue, iIntValue3);
        if (iIntValue2 >= iMin) {
            return V(z, hc2Var, str, iIntValue2, iIntValue);
        }
        u1g u1gVarV = V(z, hc2Var, str, iIntValue2, iIntValue2);
        while (iIntValue2 < iMin) {
            l08 l08Var = l08.a;
            iIntValue2++;
            u1gVarV = new u1g(l08Var, Arrays.asList(V(z, hc2Var, str, iIntValue2, iIntValue2), jpo.s(Arrays.asList(new u1g(Collections.singletonList(new ufg(" ")), l08Var), u1gVarV))));
        }
        return iIntValue3 > iIntValue ? jpo.s(Arrays.asList(new u1g(Collections.singletonList(new ufg(c.n(iIntValue3 - iIntValue, " "))), l08.a), u1gVarV)) : iIntValue3 == iIntValue ? u1gVarV : new u1g(l08.a, Arrays.asList(V(z, hc2Var, str, iIntValue3 + 1, iIntValue), u1gVarV));
    }

    public static final u1g V(boolean z, hc2 hc2Var, String str, int i2, int i3) {
        if (i3 < (z ? 1 : 0) + 1) {
            qp2.n("Check failed.");
            return null;
        }
        ehc ehcVarB = a.b();
        if (z) {
            ehcVarB.add(new ufg("-"));
        }
        ehcVarB.add(new t4f(Collections.singletonList(new lnm(Integer.valueOf(i2 - (z ? 1 : 0)), Integer.valueOf(i3 - (z ? 1 : 0)), hc2Var, str, z))));
        return new u1g(a.a(ehcVarB), l08.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0029 A[PHI: r1
      0x0029: PHI (r1v1 int) = (r1v0 int), (r1v2 int), (r1v3 int) binds: [B:6:0x0007, B:8:0x000b, B:23:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.vm2 W(int r5) {
        /*
            r0 = 6
            if (r5 == 0) goto L37
            r1 = 1
            r2 = 2
            if (r5 == r1) goto L16
            if (r5 == r2) goto L29
            r1 = 5
            r3 = 3
            if (r5 == r3) goto L29
            r4 = 4
            if (r5 != r4) goto L12
            r0 = r3
            goto L37
        L12:
            if (r5 == r1) goto L37
            if (r5 != r0) goto L18
        L16:
            r0 = r2
            goto L37
        L18:
            r1 = 7
            if (r5 == r1) goto L37
            r2 = 8
            if (r5 == r2) goto L37
            r2 = 9
            if (r5 != r2) goto L25
            r0 = r4
            goto L37
        L25:
            r2 = 10
            if (r5 != r2) goto L2b
        L29:
            r0 = r1
            goto L37
        L2b:
            r1 = 11
            if (r5 == r1) goto L37
            r1 = 12
            if (r5 == r1) goto L37
            r1 = 13
            if (r5 != r1) goto L3d
        L37:
            vm2 r5 = new vm2
            r5.<init>(r0)
            return r5
        L3d:
            java.lang.String r0 = "Unexpected CameraError: "
            java.lang.String r5 = defpackage.yc4.a(r5)
            defpackage.t3p.i(r5, r0)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x1p.W(int):vm2");
    }

    public static final ExtractedText X(mil milVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = milVar.a.b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j2 = milVar.b;
        extractedText.selectionStart = xjl.f(j2);
        extractedText.selectionEnd = xjl.e(j2);
        extractedText.flags = !StringsKt.F(milVar.a.b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static void Y(ChromiumContent chromiumContent, boolean z) {
        NavigationEntry navigationEntryI;
        NavigationController navigationControllerQ = chromiumContent.e().q();
        boolean z2 = false;
        boolean z3 = true;
        if (navigationControllerQ.s(0)) {
            int iT = navigationControllerQ.t();
            if (iT > 0 || (iT >= 0 && !z && (navigationEntryI = navigationControllerQ.i(iT)) != null && !navigationEntryI.a.a.isEmpty())) {
                z2 = true;
            }
            z3 = true ^ z2;
        }
        if (z3) {
            vml.c(new yqd(chromiumContent, (byte) 9));
        }
    }

    public static final void b(boolean z, c8e c8eVar, ih5 ih5Var, int i2) {
        long j2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1122017855);
        int i3 = (vt9Var.g(z) ? 4 : 2) | i2 | 48;
        if (vt9Var.N(i3 & 1, (i3 & 19) != 18)) {
            hyf hyfVarA = iza.a((dl7) tk7.a.getValue(), vt9Var);
            if (z) {
                vt9Var.W(1696751592);
                j2 = ((sa5) vt9Var.j(ua5.a)).a;
                vt9Var.p(false);
            } else {
                vt9Var.W(1696814646);
                j2 = ((kk8) vt9Var.j(lk8.a)).j;
                vt9Var.p(false);
            }
            long j3 = j2;
            z7e z7eVar = z7e.b;
            wta.b(hyfVarA, "Boost icon", z7eVar, j3, vt9Var, 440, 0);
            c8eVar = z7eVar;
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new w41(z, c8eVar, i2);
        }
    }

    public static final void c(p2d p2dVar, Function0 function0, c8e c8eVar, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1070242582);
        vt9Var.X(-492369756);
        Object objK = vt9Var.K();
        zpa zpaVar = hh5.a;
        if (objK == zpaVar) {
            objK = new f3d();
            vt9Var.g0(objK);
        }
        vt9Var.p(false);
        f3d f3dVar = (f3d) objK;
        vt9Var.X(-492369756);
        Object objK2 = vt9Var.K();
        if (objK2 == zpaVar) {
            objK2 = new Matrix();
            vt9Var.g0(objK2);
        }
        vt9Var.p(false);
        Matrix matrix = (Matrix) objK2;
        vt9Var.X(1157296644);
        boolean zF = vt9Var.f(p2dVar);
        Object objK3 = vt9Var.K();
        if (zF || objK3 == zpaVar) {
            objK3 = hyg.k((Object) null);
            vt9Var.g0(objK3);
        }
        vt9Var.p(false);
        afe afeVar = (afe) objK3;
        vt9Var.X(185151773);
        if (p2dVar == null || p2dVar.b() == 0.0f) {
            nr3.a(c8eVar, vt9Var, 0);
            vt9Var.p(false);
            znh znhVarR = vt9Var.r();
            if (znhVarR == null) {
                return;
            }
            znhVarR.d = new f2d(p2dVar, function0, c8eVar, i2, (byte) 0);
            return;
        }
        vt9Var.p(false);
        float fC = dzm.c();
        oup.H(mpj.i(c8eVar, p2dVar.i.width() / fC, p2dVar.i.height() / fC), new g2d(p2dVar, matrix, f3dVar, function0, afeVar), vt9Var, 0);
        znh znhVarR2 = vt9Var.r();
        if (znhVarR2 != null) {
            znhVarR2.d = new f2d(p2dVar, function0, c8eVar, i2, (byte) 1);
        }
    }

    public static ul0 e() {
        ClassLoader classLoader = x1p.class.getClassLoader();
        if (ul0.class.equals(ul0.class)) {
            try {
                try {
                    if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ReflectiveOperationException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            Iterator it = Arrays.asList(new x1p[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e3) {
                    Logger.getLogger(ov.class.getName()).log(Level.SEVERE, "Unable to load ul0", (Throwable) e3);
                }
            }
            if (arrayList.size() == 1) {
                return (ul0) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (ul0) ul0.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (ReflectiveOperationException e4) {
                h9o.o(e4);
                return null;
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static final int f(int i2, int i3, int[] iArr) {
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int g(long[] jArr, int i2, long j2) {
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static j59 h(Context context, int i2, int i3, int i4, int i5) {
        String strCheckNotEmpty = Preconditions.checkNotEmpty(context.getString(i4), "ApiKey must be set.");
        return new j59(Preconditions.checkNotEmpty(context.getString(i2), "ApplicationId must be set."), strCheckNotEmpty, (String) null, (String) null, context.getString(i3), (String) null, (String) null, context.getString(i5));
    }

    public static final c8e j(c8e c8eVar, paj pajVar) {
        return z5i.O(c8eVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, pajVar, true, 0L, 0L, 1042431);
    }

    public static final c8e m(c8e c8eVar) {
        return z5i.O(c8eVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, 0L, 0L, 1044479);
    }

    public static kd5 n(String str, String str2) {
        wn2 wn2Var = new wn2(str, str2);
        jd5 jd5VarB = kd5.b(wn2.class);
        jd5VarB.e = true;
        jd5VarB.f = new id5(wn2Var, (byte) 0);
        return jd5VarB.b();
    }

    public static double p(double d2) {
        if (wp8.a(d2) > 40.0d) {
            return d2 > 0.0d ? 1.0d : -1.0d;
        }
        double dB = pt9.b(d2 * d2);
        return d2 < 0.0d ? -dB : dB;
    }

    public static double q(double d2, double d3) {
        double dP;
        double dP2;
        if (d2 > d3) {
            return -q(d3, d2);
        }
        if (d2 < -0.4769362762044697d) {
            if (d3 < 0.0d) {
                dP = r(-d3);
                dP2 = r(-d2);
            }
            return dP - dP2;
        }
        if (d3 > 0.4769362762044697d && d2 > 0.0d) {
            return r(d2) - r(d3);
        }
        dP = p(d3);
        dP2 = p(d2);
        return dP - dP2;
    }

    public static double r(double d2) {
        if (wp8.a(d2) > 40.0d) {
            return d2 > 0.0d ? 0.0d : 2.0d;
        }
        double dC = pt9.c(d2 * d2);
        return d2 < 0.0d ? 2.0d - dC : dC;
    }

    public static jwb s(jwb jwbVar, d2c d2cVar, ikl iklVar, n27 n27Var, mh9 mh9Var) {
        if (jwbVar != null && d2cVar == ((d2c) jwbVar.c) && xgh.v(iklVar, d2cVar).equals((ikl) jwbVar.d) && n27Var.b() == ((q27) jwbVar.e).a && mh9Var == ((mh9) jwbVar.f)) {
            return jwbVar;
        }
        jwb jwbVar2 = jwb.h;
        if (jwbVar2 != null && d2cVar == ((d2c) jwbVar2.c) && xgh.v(iklVar, d2cVar).equals((ikl) jwbVar2.d) && n27Var.b() == ((q27) jwbVar2.e).a && mh9Var == ((mh9) jwbVar2.f)) {
            return jwbVar2;
        }
        jwb jwbVar3 = new jwb(d2cVar, xgh.v(iklVar, d2cVar), new q27(n27Var.b(), n27Var.n0()), mh9Var);
        jwb.h = jwbVar3;
        return jwbVar3;
    }

    public static kd5 t(String str, ybc ybcVar) {
        jd5 jd5VarB = kd5.b(wn2.class);
        jd5VarB.e = true;
        jd5VarB.a(y27.a(Context.class));
        jd5VarB.f = new z0c(str, ybcVar, (byte) 2);
        return jd5VarB.b();
    }

    public static boolean y() {
        try {
            if (v31.G0 == null) {
                v31.G0 = Class.forName("android.os.SystemProperties");
            }
            Method declaredMethod = v31.H0;
            if (declaredMethod == null) {
                Class cls = v31.G0;
                declaredMethod = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                v31.H0 = declaredMethod;
            }
            Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return Intrinsics.a(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public CharSequence A(Context context) {
        return null;
    }

    public CharSequence B(Context context) {
        return null;
    }

    public void J(Fragment fragment) {
    }

    public void K(Fragment fragment) {
    }

    public void M() {
    }

    public void N(Fragment fragment) {
    }

    public void O() {
    }

    public void P(Fragment fragment) {
    }

    public void Q() {
    }

    public boolean o() {
        return true;
    }

    public Integer u() {
        return null;
    }

    public CharSequence v(Context context) {
        return null;
    }

    public boolean x() {
        return true;
    }

    public abstract CharSequence z(Context context);
}
