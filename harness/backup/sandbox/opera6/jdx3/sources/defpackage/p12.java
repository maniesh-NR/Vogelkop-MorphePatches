package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.SystemClock;
import android.os.Trace;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.media3.ui.PlayerView;
import com.opera.android.BrowserActivity;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.media.MediaPlayerMini;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class p12 implements t43 {
    public static ArrayList i;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public p12(byte b) {
        switch (b) {
            case 8:
                long[] jArr = imi.a;
                this.a = new see();
                tee teeVar = jmi.a;
                this.c = new tee();
                this.d = new ArrayList();
                this.e = new ArrayList();
                this.f = new ArrayList();
                this.g = new ArrayList();
                this.h = new ArrayList();
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                this.b = new Object();
                this.d = q0b.c;
                this.g = new HashMap();
                this.h = new HashSet();
                break;
            case 16:
                Boolean bool = Boolean.FALSE;
                this.a = hyg.k(bool);
                this.b = new p0g(1.0f);
                this.c = hyg.k(bool);
                this.d = new p0g(1.0f);
                this.e = hyg.k(bool);
                this.f = hyg.k(new a2m(a2m.b));
                this.g = hyg.k(bool);
                this.h = hyg.k(new u95(u95.f));
                break;
            default:
                this.a = new int[16];
                this.b = new int[16];
                this.c = new int[16];
                this.d = new int[16];
                this.e = new int[16];
                this.f = new int[16];
                this.g = new int[16];
                this.h = new int[16];
                break;
        }
    }

    public p12(Context context, gjm gjmVar, yv3 yv3Var, qsh qshVar, g7m g7mVar) {
        this.a = context;
        this.b = gjmVar;
        this.c = yv3Var;
        this.d = qshVar;
        this.e = g7mVar;
        this.f = new qs7((byte) 22);
        this.g = new y55();
    }

    public /* synthetic */ p12(String str, String str2, String str3, Object obj, String str4, String str5, String str6, Serializable serializable) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = obj;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = serializable;
    }

    public static int C(int[] iArr, n6c n6cVar, boolean z) {
        n6cVar.getClass();
        int iG0 = cs5.g0(n6cVar, z) + iArr[0];
        iArr[0] = iG0;
        return Math.max(0, iG0);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3 A[Catch: all -> 0x018c, DONT_GENERATE, TRY_LEAVE, TryCatch #2 {, blocks: (B:12:0x0070, B:14:0x0083, B:16:0x008f, B:18:0x0093, B:22:0x009e, B:23:0x00a1, B:25:0x00a3), top: B:80:0x0070, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static xcc a(defpackage.p12 r16, ndc r17, defpackage.jf4 r18, defpackage.bp3 r19) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p12.a(p12, ndc, jf4, bp3):xcc");
    }

    public static ec4 c(jf4 jf4Var) {
        Iterator it = jf4Var.a.iterator();
        while (it.hasNext()) {
            ((qbc) it.next()).getClass();
            rn2 rn2Var = qbc.b;
            if (!Intrinsics.a(rn2Var, rn2Var)) {
                synchronized (ik8.a) {
                }
            }
        }
        return fc4.a;
    }

    public static Intent g(String str, String str2) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority("play.google.com");
        builder.encodedPath("/store/account/subscriptions");
        if (str != null) {
            builder.appendQueryParameter("sku", str);
        }
        if (str2 != null) {
            builder.appendQueryParameter("package", str2);
        }
        Intent intent = new Intent("android.intent.action.VIEW", builder.build());
        intent.putExtra("com.opera.android.extra.DO_NOT_INTERCEPT", true);
        return intent;
    }

    public static ArrayList h(oqe oqeVar) {
        List list = (List) ((msh) oqeVar).A.c;
        List list2 = Collections.EMPTY_LIST;
        if (list == null) {
            list = list2;
        }
        return nb6.J(sfe.R(list, msh.class));
    }

    public static String i(Intent intent) {
        String dataString;
        String action = intent.getAction();
        if ("com.opera.android.action.SHOW_MANAGE_SPACE".equals(action) || "com.opera.android.action.SHOW_WALLET".equals(action) || "com.opera.android.settings.SITE_SETTING".equals(action) || (dataString = intent.getDataString()) == null) {
            return null;
        }
        URI uriA = wqm.a("http://", dataString);
        return uriA != null ? uriA.toString() : dataString;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.fdb s(defpackage.wth r7, android.content.Intent r8, int r9) {
        /*
            java.lang.String r0 = "query"
            java.lang.String r3 = r8.getStringExtra(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Le
            r7 = 0
            return r7
        Le:
            java.lang.String r0 = "com.opera.android.EXTRA_SEARCH_IN_NEW_TAB"
            r1 = 1
            boolean r5 = r8.getBooleanExtra(r0, r1)
            java.lang.String r0 = "com.opera.android.EXTRA_SEARCH_INCOGNITO_MODE"
            r1 = -1
            int r0 = r8.getIntExtra(r0, r1)
            r2 = 3
            r4 = 0
            if (r0 < 0) goto L2e
            int[] r6 = vep.B(r2)
            int r6 = r6.length
            if (r0 >= r6) goto L2e
            int[] r6 = vep.B(r2)
            r0 = r6[r0]
            goto L2f
        L2e:
            r0 = r4
        L2f:
            if (r0 != 0) goto L33
            r6 = r2
            goto L34
        L33:
            r6 = r0
        L34:
            java.lang.String r0 = "com.opera.android.EXTRA_SEARCH_URL_ORIGIN"
            boolean r2 = r8.hasExtra(r0)
            if (r2 == 0) goto L53
            int r8 = r8.getIntExtra(r0, r1)
            if (r8 < 0) goto L51
            r0 = 10
            int[] r1 = vep.B(r0)
            int r1 = r1.length
            if (r8 >= r1) goto L51
            int[] r0 = vep.B(r0)
            r4 = r0[r8]
        L51:
            if (r4 != 0) goto L54
        L53:
            r4 = r9
        L54:
            fdb r1 = new fdb
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p12.s(wth, android.content.Intent, int):fdb");
    }

    public static ValueAnimator y(boolean z, float f, float f2, float f3, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, Runnable runnable, Runnable runnable2) {
        ValueAnimator duration = ValueAnimator.ofFloat(f, f2).setDuration((long) (f3 * 150.0f));
        duration.addUpdateListener(animatorUpdateListener);
        duration.setInterpolator(lf1.l);
        duration.addListener(new t05(runnable, runnable2, (byte) 2));
        duration.start();
        if (!z) {
            duration.end();
        }
        return duration;
    }

    public final void A() {
        Trace.beginSection("CX:unbindAll");
        try {
            xug.i();
            v(0);
            ((cdc) this.f).k((HashSet) this.h);
        } finally {
            Trace.endSection();
        }
    }

    public final void B(boolean z) {
        if (!w()) {
            j();
            return;
        }
        if (m()) {
            return;
        }
        MediaPlayerMini mediaPlayerMini = (MediaPlayerMini) LayoutInflater.from(((ViewGroup) this.b).getContext()).inflate(2131559047, (ViewGroup) this.b, false);
        this.c = mediaPlayerMini;
        atj.a(mediaPlayerMini);
        ((ViewGroup) this.b).addView((MediaPlayerMini) this.c);
        sjg sjgVar = new sjg(2, (PlayerView) ((MediaPlayerMini) this.c).a.f);
        this.d = sjgVar;
        ((tjg) ((xbf) this.a).b).b(sjgVar, z);
        ug7 ug7Var = (ug7) this.e;
        if (ug7Var != null) {
            boolean zM = m();
            wg7 wg7Var = ug7Var.a;
            wg7Var.P = zM;
            wg7Var.K0();
            StatusBarDrawingFrameLayout statusBarDrawingFrameLayout = wg7Var.k;
            int iT = f03.t(wg7Var.P ? 2130969496 : 2130969497, statusBarDrawingFrameLayout.getContext(), 2131101243);
            if (iT != statusBarDrawingFrameLayout.k) {
                statusBarDrawingFrameLayout.k = iT;
                statusBarDrawingFrameLayout.b();
            }
        }
    }

    public final boolean b() {
        q6e q6eVar = (q6e) this.b;
        WeakReference weakReference = (WeakReference) this.h;
        eri eriVar = null;
        oim oimVar = weakReference != null ? (oim) weakReference.get() : null;
        if (oimVar != null && !oimVar.isFinished()) {
            return false;
        }
        HashSet hashSet = gco.a;
        Iterator it = Collections.unmodifiableList(q6eVar.a).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            eri eriVar2 = (eri) it.next();
            if (gco.a(eriVar2)) {
                eriVar = eriVar2;
                break;
            }
        }
        this.g = eriVar;
        return (eriVar == null || !((SharedPreferences) ((b59) this.a).get()).getBoolean("allow_ask_again", true) || q6eVar.b().equals((eri) this.g)) ? false : true;
    }

    public final mr d(jf4 jf4Var) {
        Object mrVar;
        Trace.beginSection("CX:getCameraInfo");
        try {
            xd4 xd4VarG = jf4Var.c(((wg4) this.e).a.c()).g();
            ec4 ec4VarC = c(jf4Var);
            td4 td4VarV = y9m.v(xd4VarG.e(), (String) null, ec4VarC.a);
            synchronized (this.b) {
                mrVar = ((HashMap) this.g).get(td4VarV);
                if (mrVar == null) {
                    mrVar = new mr(xd4VarG, ec4VarC);
                    ((HashMap) this.g).put(td4VarV, mrVar);
                }
            }
            return (mr) mrVar;
        } finally {
            Trace.endSection();
        }
    }

    public final int e() {
        boolean z;
        wg4 wg4Var = (wg4) this.e;
        if (wg4Var != null) {
            tah tahVar = wg4Var.g;
            if (tahVar != null) {
                tc4 tc4Var = (tc4) tahVar.f;
                synchronized (tc4Var.b) {
                    z = tc4Var.f;
                }
                return z ? 1 : 0;
            }
            qp2.n("CameraX not initialized yet.");
        }
        return 0;
    }

    public final long f() {
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        sko.s(arrayList.get(0));
        throw null;
    }

    public final void j() {
        if (m()) {
            ((tjg) ((xbf) this.a).b).j((sjg) this.d);
            this.d = null;
            ((ViewGroup) ((MediaPlayerMini) this.c).getParent()).removeView((MediaPlayerMini) this.c);
            this.c = null;
            ug7 ug7Var = (ug7) this.e;
            if (ug7Var != null) {
                boolean zM = m();
                wg7 wg7Var = ug7Var.a;
                wg7Var.P = zM;
                wg7Var.K0();
                StatusBarDrawingFrameLayout statusBarDrawingFrameLayout = wg7Var.k;
                int iT = f03.t(wg7Var.P ? 2130969496 : 2130969497, statusBarDrawingFrameLayout.getContext(), 2131101243);
                if (iT != statusBarDrawingFrameLayout.k) {
                    statusBarDrawingFrameLayout.k = iT;
                    statusBarDrawingFrameLayout.b();
                }
            }
        }
    }

    public final void k(wg4 wg4Var, Context context) {
        cf4 cf4Var;
        synchronized (this.b) {
            this.e = wg4Var;
            this.a = context;
            if (wg4Var != null && (cf4Var = wg4Var.n) != null) {
                g7a g7aVarL = x7d.l();
                cf4Var.n.add(new af4(this, g7aVarL));
                g7aVarL.execute(new ye4(cf4Var, this));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.oqe r4, java.util.ArrayList r5, int r6, boolean r7) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.b
            ow8 r0 = (defpackage.ow8) r0
            if (r6 < 0) goto L2e
            java.lang.Object r1 = r3.d
            java.lang.String r1 = (java.lang.String) r1
            msh r4 = (defpackage.msh) r4
            fve r2 = new fve
            r2.<init>(r4, r5, r1)
            int r5 = r6 + 1
            if (r5 < 0) goto L26
            java.util.ArrayList r1 = r0.a
            int r1 = r1.size()
            if (r5 >= r1) goto L29
            ja2 r1 = r0.J(r5)
            boolean r1 = r2.equals(r1)
            goto L2a
        L26:
            r0.getClass()
        L29:
            r1 = 0
        L2a:
            if (r1 == 0) goto L2f
            if (r7 != 0) goto L37
        L2e:
            return
        L2f:
            r0.H(r5, r2)
            km5 r4 = r4.A
            r5 = 1
            r4.b = r5
        L37:
            java.lang.Object r3 = r3.a
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            r3.H0(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p12.l(oqe, java.util.ArrayList, int, boolean):void");
    }

    public final boolean m() {
        MediaPlayerMini mediaPlayerMini = (MediaPlayerMini) this.c;
        return (mediaPlayerMini == null || mediaPlayerMini.getParent() == null) ? false : true;
    }

    public final p7d n() {
        boolean z;
        ru9 ru9Var = (ru9) this.e;
        kze kzeVar = (kze) this.b;
        if (((jtg) this.a).d()) {
            int iOrdinal = uvg.d((wvg) kzeVar.g()).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            if (iOrdinal != 4) {
                                if (iOrdinal == 5) {
                                    return (p7d) ((tsd) this.h).g();
                                }
                                h9o.p();
                                return null;
                            }
                        }
                    } else if (((wvg) kzeVar.g()).b()) {
                        z = ru9Var.a.getInt("main.menu.premium_promo.top.impressions", 0) < 4;
                        rxh rxhVar = new rxh(2132022206);
                        uac uacVar = cxc.k;
                        return new p7d(12, z, rxhVar, new rxh(2132019183));
                    }
                }
            }
            qtg qtgVar = (qtg) ((kze) this.c).g();
            if (qtgVar.a != 1) {
                return new p7d(0, ru9Var.a.getInt("main.menu.premium_promo.top.impressions", 0) < 4, new rxh(2132022254), new rxh(2132022067));
            }
            z = ru9Var.a.getInt("main.menu.premium_promo.top.impressions", 0) < 4;
            rxh rxhVar2 = new rxh(2132022254);
            int i2 = qtgVar.b;
            return new p7d(0, z, rxhVar2, new txh(new Object[]{Integer.valueOf(i2)}, 2131886137, i2));
        }
        return null;
    }

    public final void o(r2k r2kVar, r2k r2kVar2) {
        Object obj;
        Map map;
        this.h = (Function0) ((Function1) this.f).invoke(r2kVar);
        tn tnVar = (tn) this.g;
        Object objInvoke = ((q92) this.b).invoke(r2kVar, ((d5o) this.a).B());
        synchronized (((j06) tnVar.b)) {
            tnVar.c = objInvoke;
            if (!tnVar.a) {
                tnVar.a = true;
                while (true) {
                    synchronized (((j06) tnVar.b)) {
                        obj = tnVar.c;
                        map = (Map) tnVar.d;
                    }
                    for (Map.Entry entry : map.entrySet()) {
                        Function1 function1 = (Function1) entry.getKey();
                        if (((Boolean) entry.getValue()).booleanValue()) {
                            function1.invoke(obj);
                        }
                    }
                    synchronized (((j06) tnVar.b)) {
                        if (obj == tnVar.c) {
                            break;
                        }
                    }
                }
                tnVar.a = false;
            }
        }
        ((j04) this.d).invoke(r2kVar, r2kVar2, Boolean.valueOf(((Function0) this.h) != null));
    }

    @Override // defpackage.t43
    public final void onConfigurationChanged(Configuration configuration) {
        ((esg) this.h).G();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r28, int r29, java.util.ArrayList r30, ro9 r31, k6c r32, boolean r33, boolean r34, boolean r35, int r36, int r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p12.p(int, int, java.util.ArrayList, ro9, k6c, boolean, boolean, boolean, int, int):void");
    }

    public final cdb q(String str, lqm lqmVar, wth wthVar) {
        String scheme;
        String host;
        String strO;
        String string;
        fp1 fp1Var = (BrowserActivity) this.a;
        if (wqm.s(str) || wqm.u(str)) {
            Uri uri = Uri.parse(str);
            lk6 lk6Var = lk6.a;
            return lk6.f(1, ik6.b, lqmVar, fp1Var, uri) ? new vcb(new bgf(Uri.parse(str), lqmVar, 1)) : new zcb();
        }
        Uri uri2 = Uri.parse(str);
        if (lcp.t(uri2)) {
            String queryParameter = uri2.getQueryParameter("ofa_cb");
            String string2 = queryParameter != null ? StringsKt.l0(queryParameter).toString() : null;
            return TextUtils.isEmpty(string2) ? new zcb() : new vcb(new sk5(string2));
        }
        if (uri2 != null) {
            scheme = uri2.getScheme();
            host = uri2.getHost();
        } else {
            scheme = null;
            host = null;
        }
        if (btb.a(scheme, host)) {
            vx3 vx3VarA = ay3.a(btb.d(uri2, null, null, false), lqm.d, false);
            vx3VarA.c(true);
            vx3VarA.a(true);
            return new vcb(new ay3(vx3VarA));
        }
        if (f03.J(uri2, 3)) {
            return new vcb(new xh2(uri2, lqmVar));
        }
        String str2 = ("www.bing.com".equals(uri2.getHost()) && "/search".equals(uri2.getPath()) && ((Boolean) ((wt3) this.g).get()).booleanValue() && (strO = aik.o(wqm.m(uri2, "q"))) != null && (string = Settings.Secure.getString(fp1Var.getContentResolver(), "default_input_method")) != null && string.startsWith("com.touchtype.swiftkey/")) ? strO : null;
        if (str2 != null) {
            return new fdb(wthVar, str2, 1, false, 1);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cdb r(android.content.Intent r8, defpackage.wth r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p12.r(android.content.Intent, wth, boolean):cdb");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            r14 = this;
            java.lang.Object r14 = r14.a
            see r14 = (see) r14
            boolean r0 = r14.j()
            if (r0 == 0) goto L52
            java.lang.Object[] r0 = r14.c
            long[] r1 = r14.a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L4f
            r3 = 0
            r4 = r3
        L15:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L4a
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2f:
            if (r9 >= r7) goto L48
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 < 0) goto L3e
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2f
        L3e:
            int r4 = r4 << 3
            int r4 = r4 + r9
            r14 = r0[r4]
            defpackage.sko.s(r14)
            r14 = 0
            throw r14
        L48:
            if (r7 != r8) goto L4f
        L4a:
            if (r4 == r2) goto L4f
            int r4 = r4 + 1
            goto L15
        L4f:
            r14.a()
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p12.t():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(int r12, int r13, int r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p12.u(int, int, int, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(int i2) {
        hf4 hf4Var;
        wg4 wg4Var = (wg4) this.e;
        if (wg4Var != null) {
            tah tahVar = wg4Var.g;
            if (tahVar == null) {
                qp2.n("CameraX not initialized yet.");
                return;
            }
            tc4 tc4Var = (tc4) tahVar.f;
            synchronized (tc4Var.b) {
                tc4Var.f = i2;
                hf4Var = tc4Var.c;
            }
            if (hf4Var != null) {
                boolean z = i2 == 2;
                tc4Var.g = z;
                if (!z) {
                    tc4Var.d = l08.a;
                }
                Iterator it = hf4Var.c().iterator();
                while (it.hasNext()) {
                    be4 be4Var = (zd4) it.next();
                    be4 be4Var2 = be4Var instanceof be4 ? be4Var : null;
                    if (be4Var2 != null) {
                        if (i2 == 1) {
                            ysm ysmVar = be4Var2.a;
                            synchronized (ysmVar.k) {
                                ysmVar.o = true;
                            }
                        } else if (i2 == 2) {
                            ysm ysmVar2 = be4Var2.a;
                            synchronized (ysmVar2.k) {
                                ysmVar2.o = false;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }

    public final boolean w() {
        xbf xbfVar = (xbf) this.a;
        if (((gig) ((ode) xbfVar.c).g()).getCurrentTimeline().p() || ((ViewGroup) this.b) == null) {
            return false;
        }
        Iterator it = Collections.unmodifiableList(((tjg) xbfVar.b).t).iterator();
        while (it.hasNext()) {
            if (((sjg) it.next()).a == 5) {
                return false;
            }
        }
        return true;
    }

    public final void x() {
        Integer num;
        Integer num2;
        oqe oqeVar = (oqe) this.f;
        if (oqeVar != null) {
            y85 y85Var = null;
            this.f = null;
            tsh tshVar = (tsh) this.e;
            String str = (String) ((msh) oqeVar).v.b;
            aum aumVar = tshVar.g;
            g82 g82Var = tshVar.f ? null : tshVar.a;
            if (g82Var != null && g82Var.a.equals(str)) {
                y85Var = tshVar.c ? new y85(SystemClock.uptimeMillis() - tshVar.d, tshVar.e) : tshVar.b;
            }
            if (y85Var != null) {
                long j = y85Var.a;
                pu8 pu8Var = aumVar.b;
                if (j <= TimeUnit.SECONDS.toMillis((pu8Var == null || (num2 = pu8Var.a) == null) ? 30 : num2.intValue())) {
                    int i2 = y85Var.b;
                    pu8 pu8Var2 = aumVar.b;
                    if (i2 <= ((pu8Var2 == null || (num = pu8Var2.b) == null) ? 50 : num.intValue())) {
                        return;
                    }
                }
                ArrayList arrayListH = h(oqeVar);
                if (arrayListH.isEmpty()) {
                    return;
                }
                ArrayList arrayList = ((ow8) this.b).a;
                int size = arrayList.size();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        i3 = -1;
                        break;
                    }
                    Object obj = arrayList.get(i4);
                    i4++;
                    ja2 ja2Var = (ja2) obj;
                    if ((ja2Var instanceof j82) && ((j82) ja2Var).c.equals(oqeVar)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                l(oqeVar, arrayListH, i3, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(java.lang.String r24, int r25, long r26, ab4 r28, hh2 r29, nt5 r30) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p12.z(java.lang.String, int, long, ab4, hh2, nt5):java.lang.Object");
    }
}
