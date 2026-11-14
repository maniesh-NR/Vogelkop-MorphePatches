package defpackage;

import ads_mobile_sdk.h21;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AndroidRuntimeException;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.opera.android.OperaApplication;
import java.io.BufferedInputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class hn9 {
    public static boolean c;
    public final /* synthetic */ byte a;
    public final /* synthetic */ Rect b;

    public /* synthetic */ hn9(Rect rect, byte b) {
        this.a = b;
        this.b = rect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Object obj, String str, c8e c8eVar, td3 td3Var, kr5 kr5Var, kh3 kh3Var, ih5 ih5Var, int i, int i2) {
        xxa xxaVar;
        xxa xxaVar2;
        xxa xxaVarA;
        td3 td3Var2 = (i2 & 32) != 0 ? rbe.f : td3Var;
        kr5 kr5Var2 = (i2 & 64) != 0 ? jr5.b : kr5Var;
        kh3 kh3Var2 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : kh3Var;
        vt9 vt9Var = (vt9) ih5Var;
        Context context = (Context) vt9Var.j(j41.b);
        AtomicReference atomicReference = jmj.a;
        Object obj2 = atomicReference.get();
        xxa xxaVar3 = obj2 instanceof xxa ? (xxa) obj2 : null;
        if (xxaVar3 == null) {
            xxa xxaVarA2 = null;
            loop0: while (true) {
                Object obj3 = atomicReference.get();
                if (obj3 instanceof xxa) {
                    xxaVar = (xxa) obj3;
                    xxaVar2 = xxaVarA2;
                } else {
                    if (xxaVarA2 == null) {
                        Context applicationContext = context.getApplicationContext();
                        imj imjVar = obj3 instanceof imj ? (imj) obj3 : null;
                        if (imjVar == null || (xxaVarA = imjVar.a(applicationContext)) == null) {
                            imj imjVar2 = applicationContext instanceof imj ? (imj) applicationContext : null;
                            xxaVarA2 = imjVar2 != null ? imjVar2.a(applicationContext) : lmj.a.a(applicationContext);
                        } else {
                            xxaVarA2 = xxaVarA;
                        }
                    }
                    xxaVar = xxaVarA2;
                    xxaVar2 = xxaVar;
                }
                while (!atomicReference.compareAndSet(obj3, xxaVar)) {
                    if (atomicReference.get() != obj3) {
                        break;
                    }
                }
                xxaVarA2 = xxaVar2;
            }
            xxaVar3 = xxaVar;
        }
        int i3 = i << 3;
        int i4 = (i & 126) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192);
        int i5 = i4 >> 3;
        i41.a(new sd2(obj, (hd2) vt9Var.j(ntc.a), xxaVar3), str, c8eVar, td3Var2, kr5Var2, kh3Var2, vt9Var, (i4 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (29360128 & i5) | (i5 & 234881024) | ((((i >> 27) & 14) << 27) & 1879048192), 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x0274, code lost:
    
        if (r3 == 2) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x029a, code lost:
    
        if (r2 != 2) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x029c, code lost:
    
        h9o.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x029f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x02ea, code lost:
    
        if (r4 == 2) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0315, code lost:
    
        if (r1 != 2) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0317, code lost:
    
        h9o.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x031a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x037d, code lost:
    
        if (r2 == 2) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x03a3, code lost:
    
        if (r2 != 2) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x03a5, code lost:
    
        h9o.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x03a8, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0402 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x07d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.lil r49, final java.lang.CharSequence r50, final kotlin.jvm.functions.Function2 r51, final defpackage.mhl r52, final defpackage.ue5 r53, final defpackage.ue5 r54, final defpackage.ue5 r55, final defpackage.ue5 r56, final defpackage.ue5 r57, final defpackage.ue5 r58, final defpackage.ue5 r59, final boolean r60, final boolean r61, final boolean r62, final defpackage.lde r63, final defpackage.zvf r64, final defpackage.sgl r65, final defpackage.ue5 r66, defpackage.ih5 r67, final int r68, final int r69) {
        /*
            Method dump skipped, instructions count: 2172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hn9.b(lil, java.lang.CharSequence, kotlin.jvm.functions.Function2, mhl, ue5, ue5, ue5, ue5, ue5, ue5, ue5, boolean, boolean, boolean, lde, zvf, sgl, ue5, ih5, int, int):void");
    }

    public static final void c(long j, ikl iklVar, ue5 ue5Var, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(396611577);
        int i2 = (vt9Var.e(j) ? 4 : 2) | i | (vt9Var.f(iklVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= vt9Var.h(ue5Var) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if (vt9Var.N(i2 & 1, (i2 & 147) != 146)) {
            j7h.a(j, iklVar, ue5Var, vt9Var, i2 & 1022);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new i7h(j, iklVar, ue5Var, i, (byte) 1);
        }
    }

    public static final void d(long j, ue5 ue5Var, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(590397809);
        int i2 = (vt9Var.e(j) ? 4 : 2) | i | (vt9Var.h(ue5Var) ? 32 : 16);
        if (vt9Var.N(i2 & 1, (i2 & 19) != 18)) {
            kfo.c(aq5.a.a(new u95(j)), ue5Var, vt9Var, 8 | (i2 & 112));
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new jah(j, ue5Var, i);
        }
    }

    public static final prb e(h21 h21Var) {
        prb prbVar = new prb();
        prb prbVar2 = new prb();
        prbVar2.r("uri", h21Var.a.toString());
        prbVar2.r("verb", h21Var.b);
        prbVar.o("firstline", prbVar2);
        Map map = h21Var.c;
        if (map != null && !map.isEmpty()) {
            wpb wpbVar = new wpb();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                prb prbVar3 = new prb();
                prbVar3.r("name", str);
                prbVar3.r("value", str2);
                wpbVar.o(prbVar3);
            }
            prbVar.o("headers", wpbVar);
        }
        byte[] bArr = h21Var.d;
        if (bArr != null) {
            prbVar.r("body", Base64.encodeToString(bArr.toString().getBytes(Charsets.UTF_8), 0));
        }
        return prbVar;
    }

    public static void f(URLConnection uRLConnection) {
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    public static void g(Activity activity) {
        if (c) {
            return;
        }
        c = true;
        String[] strArr = OperaApplication.K;
        OperaApplication application = activity.getApplication();
        Set setJ = application.K().j();
        try {
            String[] strArr2 = application.getPackageManager().getPackageInfo(application.getPackageName(), NotificationCompat.FLAG_HIGH_PRIORITY).splitNames;
            if (strArr2 != null) {
                for (String str : strArr2) {
                    if (str.startsWith("config.")) {
                        setJ.remove(str.substring(7));
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (setJ.isEmpty()) {
            Locale locale = wwc.a;
            if (w8h.o(activity, activity.getSharedPreferences("localize", 0).getString("language_code", null))) {
                return;
            }
        }
        if (application.getPackageManager().hasSystemFeature("android.software.webview")) {
            try {
                new WebView(activity).destroy();
                n0k.d(application, false);
                n0k.a(activity);
            } catch (AndroidRuntimeException unused2) {
            }
        }
    }

    public static void h(View view, o9n o9nVar) {
        int paddingStart = view.getPaddingStart();
        view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        sv2 sv2Var = new sv2();
        sv2Var.a = paddingStart;
        sv2Var.b = paddingEnd;
        sv2Var.c = paddingBottom;
        rgh rghVar = new rgh(o9nVar, sv2Var);
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(view, rghVar);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new cz0((byte) 1));
        }
    }

    public static float i(int i, Context context) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static ViewGroup j(View view) {
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static final qz0 k(mhl mhlVar) {
        if (mhlVar instanceof mhl) {
            return rbe.n;
        }
        s49.l(mhlVar, "Unknown position: ");
        return null;
    }

    public static boolean l(int i, long j) {
        return j >= 0 && j <= (1 << i);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public static tqi m(orb r19) {
        /*
            r0 = r19
            tqi r1 = new tqi
            org.json.JSONObject r2 = r0.a
            java.lang.String r3 = "id"
            int r3 = r2.getInt(r3)
            java.lang.String r4 = "customizationId"
            boolean r5 = r2.has(r4)
            if (r5 == 0) goto L1d
            int r4 = r2.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L1e
        L1d:
            r4 = 0
        L1e:
            java.lang.String r5 = "sdv2Id"
            boolean r2 = r2.has(r5)
            if (r2 == 0) goto L2f
            int r2 = r0.g(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L30
        L2f:
            r2 = 0
        L30:
            java.lang.String r5 = "title"
            java.lang.String r5 = r0.e(r5)
            java.lang.String r6 = "openUrl"
            java.lang.String r6 = r0.e(r6)
            java.lang.String r7 = "brandDomain"
            java.lang.String r8 = ""
            java.lang.String r7 = r0.m(r7, r8)
            java.lang.String r8 = "imageUrl"
            java.lang.String r8 = r0.e(r8)
            java.lang.String r10 = "trackingUrls"
            vpb r10 = r0.b(r10)
            org.json.JSONArray r0 = r10.a
            r11 = r0
            r0 = r1
            r1 = r3
            r3 = r2
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            int r12 = r11.length()
            r8.<init>(r12)
            int r11 = r11.length()
            r13 = 0
        L69:
            if (r13 >= r11) goto Lea
            orb r14 = r10.c(r13)
            java.lang.String r15 = "eventType"
            java.lang.String r15 = r14.e(r15)
            h58 r9 = idh.d
            r12 = 10
            int r12 = k95.o(r9, r12)
            int r12 = qbd.a(r12)
            r16 = r0
            r0 = 16
            if (r12 >= r0) goto L88
            r12 = r0
        L88:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r12)
            java.util.Iterator r9 = r9.iterator()
        L91:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto Lab
            java.lang.Object r12 = r9.next()
            r17 = r12
            idh r17 = (idh) r17
            r18 = r1
            java.lang.String r1 = r17.name()
            r0.put(r1, r12)
            r1 = r18
            goto L91
        Lab:
            r18 = r1
            java.lang.Object r0 = r0.get(r15)
            idh r0 = (idh) r0
            if (r0 != 0) goto Lb7
            r1 = 0
            goto Lde
        Lb7:
            java.lang.String r1 = "urls"
            vpb r1 = r14.b(r1)
            org.json.JSONArray r9 = r1.a
            java.util.ArrayList r12 = new java.util.ArrayList
            int r14 = r9.length()
            r12.<init>(r14)
            int r9 = r9.length()
            r14 = 0
        Lcd:
            if (r14 >= r9) goto Ld9
            java.lang.String r15 = r1.d(r14)
            r12.add(r15)
            int r14 = r14 + 1
            goto Lcd
        Ld9:
            jdh r1 = new jdh
            r1.<init>(r0, r12)
        Lde:
            if (r1 == 0) goto Le3
            r8.add(r1)
        Le3:
            int r13 = r13 + 1
            r0 = r16
            r1 = r18
            goto L69
        Lea:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hn9.m(orb):tqi");
    }

    public static final kqi n(String str) throws JSONException {
        orb orbVar = new orb(str);
        vpb vpbVarB = orbVar.b("speedDials");
        JSONArray jSONArray = vpbVarB.a;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            try {
                arrayList.add(m(vpbVarB.c(i2)));
            } catch (JSONException unused) {
            }
        }
        String strE = orbVar.e("requestId");
        String strE2 = orbVar.e("requestOrigin");
        iqi[] iqiVarArrValues = iqi.values();
        int length2 = iqiVarArrValues.length;
        while (true) {
            String str2 = strE2;
            if (i >= length2) {
                throw new JSONException("Invalid value: ".concat(str2));
            }
            iqi iqiVar = iqiVarArrValues[i];
            if (str2.equals(iqiVar.a)) {
                JSONObject jSONObject = orbVar.a;
                return new kqi(arrayList, strE, iqiVar, jSONObject.getLong("requestEpochMilliseconds"), jSONObject.getLong("serverEpochMilliseconds"));
            }
            i++;
            strE2 = str2;
        }
    }

    public static boolean o(w6g w6gVar) {
        return !c.l(w6gVar.b(), ".class", true);
    }

    public static final float p(ih5 ih5Var) {
        vt9 vt9Var = (vt9) ih5Var;
        long j = ((wam) vt9Var.j(abm.a)).l.b.c;
        long j2 = dam.l;
        if ((1095216660480L & j) != 4294967296L) {
            j = j2;
        }
        return ((n27) vt9Var.j(mi5.h)).o(j) / 2.0f;
    }

    public static PorterDuff.Mode q(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static final int r(BufferedInputStream bufferedInputStream) {
        return ((bufferedInputStream.read() & 255) << 24) | ((bufferedInputStream.read() & 255) << 16) | ((bufferedInputStream.read() & 255) << 8) | (bufferedInputStream.read() & 255);
    }

    public static w6g s(w6g w6gVar, w6g w6gVar2) {
        return xyh.d.e(StringsKt.T(w6gVar.a.w(), w6gVar2.a.w()).replace('\\', '/'));
    }

    public static void t(w36 w36Var) {
        w36Var.k = -3.4028235E38f;
        w36Var.j = LinearLayoutManager.INVALID_OFFSET;
        CharSequence charSequence = w36Var.a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                w36Var.a = SpannableString.valueOf(charSequence);
                w36Var.b = null;
            }
            CharSequence charSequence2 = w36Var.a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static final float u(ih5 ih5Var) {
        float f = ((gh7) ((vt9) ih5Var).j(xdb.c)).a;
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        float f2 = (f - qqj.c) / 2.0f;
        if (f2 < 0.0f) {
            return 0.0f;
        }
        return f2;
    }

    public static final dum v(sdk sdkVar, Throwable th) {
        return new dum(rih.t(sdkVar, th), th);
    }
}
