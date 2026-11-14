package ads_mobile_sdk;

import android.content.Context;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import defpackage.axn;
import defpackage.c26;
import defpackage.edp;
import defpackage.fsg;
import defpackage.llp;
import defpackage.prb;
import defpackage.scd;
import defpackage.zhl;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class cy0 extends WebView {
    public final CoroutineContext a;
    public final nx5 b;
    public final nx5 c;
    public final q70 d;
    public final ah3 e;
    public final k8 f;
    public final ko3 g;
    public final y01 h;
    public final qr0 i;
    public final ek j;
    public final AtomicBoolean k;
    public final AtomicBoolean l;
    public final AtomicBoolean m;
    public final AtomicBoolean n;
    public mt0 o;
    public volatile llp p;
    public volatile gp3 q;
    public bz0 r;
    public cr3 s;
    public int t;
    public dgo u;
    public final wf3 v;
    public wf3 w;
    public final DisplayMetrics x;
    public bl1 y;
    public ry0 z;

    public cy0(CoroutineContext coroutineContext, nx5 nx5Var, nx5 nx5Var2, q70 q70Var, ah3 ah3Var, k8 k8Var, Context context, String str, cr3 cr3Var, ko3 ko3Var, y01 y01Var, qr0 qr0Var, ek ekVar) {
        super(context);
        this.a = coroutineContext;
        this.b = nx5Var;
        this.c = nx5Var2;
        this.d = q70Var;
        this.e = ah3Var;
        this.f = k8Var;
        this.g = ko3Var;
        this.h = y01Var;
        this.i = qr0Var;
        this.j = ekVar;
        this.k = new AtomicBoolean(false);
        this.l = new AtomicBoolean(false);
        this.m = new AtomicBoolean(false);
        this.n = new AtomicBoolean(false);
        this.s = cr3Var;
        this.t = -1;
        mt5 mt5Var = null;
        this.v = (wf3) scd.g0(h.a, new by0(this, mt5Var, (byte) 0));
        this.x = ioh.g(context);
        c26.K(new by0(this, mt5Var, (byte) 1));
        WebSettings settings = getSettings();
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setMixedContentMode(2);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setTextZoom(100);
        settings.setSupportMultipleWindows(true);
        settings.setSupportZoom(true);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setUserAgentString(str);
        Boolean bool = Boolean.FALSE;
        fo foVar = fo.a;
        if (((Boolean) qr0Var.a("gads:clear_webview_cache:enabled", bool, foVar)).booleanValue()) {
            clearCache(true);
        }
        setWillNotDraw(false);
        setLayerType(0, null);
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        setBackgroundColor(0);
        if (((Boolean) qr0Var.a("gads:webview_sound_effects:disabled", Boolean.TRUE, foVar)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
    }

    public static /* synthetic */ Object a(cy0 cy0Var, String str, String str2, boolean z, nt5 nt5Var, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return cy0Var.a(str, str2, "text/html", "UTF-8", z, nt5Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0204, code lost:
    
        if (defpackage.na2.Z(r4, r5, r7) == r8) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0190, code lost:
    
        if (defpackage.na2.Z(r4, r5, r7) != r8) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d7, code lost:
    
        if (defpackage.na2.Z(r0, r5, r7) != r8) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ee A[Catch: all -> 0x0209, TryCatch #7 {all -> 0x0209, blocks: (B:19:0x0049, B:104:0x0208, B:92:0x01da, B:94:0x01de, B:65:0x0178, B:67:0x017c, B:87:0x01bd, B:89:0x01c1, B:98:0x01ea, B:100:0x01ee), top: B:133:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0217 A[Catch: all -> 0x023e, TryCatch #16 {all -> 0x023e, blocks: (B:109:0x0210, B:111:0x0217, B:113:0x021e, B:115:0x0222, B:117:0x0226, B:118:0x0227, B:119:0x022c, B:120:0x022d, B:121:0x0234, B:122:0x0235, B:123:0x023c, B:124:0x023d), top: B:139:0x0210 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x023d A[Catch: all -> 0x023e, TRY_LEAVE, TryCatch #16 {all -> 0x023e, blocks: (B:109:0x0210, B:111:0x0217, B:113:0x021e, B:115:0x0222, B:117:0x0226, B:118:0x0227, B:119:0x022c, B:120:0x022d, B:121:0x0234, B:122:0x0235, B:123:0x023c, B:124:0x023d), top: B:139:0x0210 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017c A[Catch: all -> 0x0209, TRY_LEAVE, TryCatch #7 {all -> 0x0209, blocks: (B:19:0x0049, B:104:0x0208, B:92:0x01da, B:94:0x01de, B:65:0x0178, B:67:0x017c, B:87:0x01bd, B:89:0x01c1, B:98:0x01ea, B:100:0x01ee), top: B:133:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c1 A[Catch: all -> 0x0209, TryCatch #7 {all -> 0x0209, blocks: (B:19:0x0049, B:104:0x0208, B:92:0x01da, B:94:0x01de, B:65:0x0178, B:67:0x017c, B:87:0x01bd, B:89:0x01c1, B:98:0x01ea, B:100:0x01ee), top: B:133:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01de A[Catch: all -> 0x0209, TRY_LEAVE, TryCatch #7 {all -> 0x0209, blocks: (B:19:0x0049, B:104:0x0208, B:92:0x01da, B:94:0x01de, B:65:0x0178, B:67:0x017c, B:87:0x01bd, B:89:0x01c1, B:98:0x01ea, B:100:0x01ee), top: B:133:0x002d }] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [cd5, mt5] */
    /* JADX WARN: Type inference failed for: r12v10, types: [mt5] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8, types: [cd5] */
    /* JADX WARN: Type inference failed for: r12v9, types: [ads_mobile_sdk.ae1, cd5, java.lang.String, kotlin.coroutines.CoroutineContext, mt5, rx5] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, boolean r23, nt5 r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cy0.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r17, java.lang.String r18, java.util.UUID r19, mt5 r20) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cy0.a(java.lang.String, java.lang.String, java.util.UUID, mt5):java.lang.Object");
    }

    public final Object a(String str, mt5 mt5Var) {
        if (this.k.get()) {
            return Unit.a;
        }
        mt5 mt5Var2 = null;
        if (Looper.getMainLooper().isCurrentThread()) {
            evaluateJavascript(str, null);
            return Unit.a;
        }
        Object objZ = defpackage.na2.Z(this.a, new px0(this, str, mt5Var2, (byte) 0), mt5Var);
        return objZ == px5.a ? objZ : Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(mt5 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.mx0
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.mx0 r0 = (ads_mobile_sdk.mx0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.mx0 r0 = new ads_mobile_sdk.mx0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            ads_mobile_sdk.cy0 r6 = r0.a
            defpackage.ybh.y(r7)     // Catch: java.lang.Throwable -> L66
            goto L6e
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L30:
            defpackage.ybh.y(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.k
            boolean r7 = r7.getAndSet(r4)
            if (r7 == 0) goto L3e
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L3e:
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.l
            boolean r7 = r7.getAndSet(r4)
            if (r7 != 0) goto L53
            ads_mobile_sdk.ek r7 = r6.j
            r7.getClass()
            java.util.concurrent.atomic.AtomicInteger r7 = ads_mobile_sdk.rl1.a
            int r7 = r7.decrementAndGet()
            ads_mobile_sdk.rl1.b = r7
        L53:
            kotlin.coroutines.CoroutineContext r7 = r6.a     // Catch: java.lang.Throwable -> L66
            ads_mobile_sdk.gy1 r2 = new ads_mobile_sdk.gy1     // Catch: java.lang.Throwable -> L66
            r5 = 3
            r2.<init>(r6, r3, r5)     // Catch: java.lang.Throwable -> L66
            r0.a = r6     // Catch: java.lang.Throwable -> L66
            r0.d = r4     // Catch: java.lang.Throwable -> L66
            java.lang.Object r6 = defpackage.na2.Z(r7, r2, r0)     // Catch: java.lang.Throwable -> L66
            if (r6 != r1) goto L6e
            return r1
        L66:
            r7 = move-exception
            ads_mobile_sdk.ah3 r6 = r6.e
            java.lang.String r0 = "GmaWebView.destroySafe"
            r6.a(r0, r7)
        L6e:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cy0.a(mt5):java.lang.Object");
    }

    public final Object a(prb prbVar, String str, mt5 mt5Var) {
        String str2 = "(window.AFMA_ReceiveMessage || function() {})('" + str + "', " + prbVar + ");";
        vr3 vr3Var = xu0.a;
        xu0.b("Dispatching AFMA event: ".concat(str2), null);
        Object objA = a(str2, mt5Var);
        return objA == px5.a ? objA : Unit.a;
    }

    public final void a(cr3 cr3Var) {
        synchronized (this) {
            this.s = cr3Var;
        }
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, java.lang.String r6, java.util.UUID r7, mt5 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.lx0
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.lx0 r0 = (ads_mobile_sdk.lx0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.lx0 r0 = new ads_mobile_sdk.lx0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.a
            defpackage.ybh.y(r8)
            goto L3e
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L30:
            defpackage.ybh.y(r8)
            r0.a = r5
            r0.d = r3
            java.lang.Object r8 = r4.a(r5, r6, r7, r0)
            if (r8 != r1) goto L3e
            return r1
        L3e:
            rap r8 = (defpackage.rap) r8
            boolean r4 = r8 instanceof ads_mobile_sdk.av0
            if (r4 == 0) goto L47
            ads_mobile_sdk.av0 r8 = (ads_mobile_sdk.av0) r8
            return r8
        L47:
            ads_mobile_sdk.hv0 r8 = (ads_mobile_sdk.hv0) r8
            java.lang.Object r4 = r8.b
            prb r4 = (defpackage.prb) r4
            if (r4 != 0) goto L5b
            ads_mobile_sdk.ev0 r4 = new ads_mobile_sdk.ev0
            java.lang.String r6 = "Null response from "
            java.lang.String r5 = sko.j(r6, r5)
            r4.<init>(r5)
            return r4
        L5b:
            ads_mobile_sdk.hv0 r5 = new ads_mobile_sdk.hv0
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cy0.b(java.lang.String, java.lang.String, java.util.UUID, mt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0125, code lost:
    
        if (defpackage.na2.Z(r6, r7, r2) != r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015e, code lost:
    
        if (defpackage.na2.Z(r0, r6, r2) != r3) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0191, code lost:
    
        if (defpackage.na2.Z(r0, r8, r2) == r3) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01cd A[Catch: all -> 0x01ce, TRY_LEAVE, TryCatch #3 {all -> 0x01ce, blocks: (B:97:0x01a0, B:99:0x01a7, B:101:0x01ae, B:103:0x01b2, B:105:0x01b6, B:106:0x01b7, B:107:0x01bc, B:108:0x01bd, B:109:0x01c4, B:110:0x01c5, B:111:0x01cc, B:112:0x01cd), top: B:121:0x01a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112 A[Catch: all -> 0x0172, TRY_LEAVE, TryCatch #5 {all -> 0x0172, blocks: (B:57:0x010e, B:59:0x0112, B:69:0x0145, B:71:0x0149), top: B:125:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0149 A[Catch: all -> 0x0172, TRY_LEAVE, TryCatch #5 {all -> 0x0172, blocks: (B:57:0x010e, B:59:0x0112, B:69:0x0145, B:71:0x0149), top: B:125:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0168 A[Catch: all -> 0x0197, TRY_LEAVE, TryCatch #10 {all -> 0x0197, blocks: (B:18:0x0047, B:90:0x0196, B:22:0x0061, B:75:0x0164, B:77:0x0168), top: B:125:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017c A[Catch: all -> 0x019b, TRY_LEAVE, TryCatch #12 {all -> 0x019b, blocks: (B:84:0x0178, B:86:0x017c), top: B:128:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a7 A[Catch: all -> 0x01ce, TryCatch #3 {all -> 0x01ce, blocks: (B:97:0x01a0, B:99:0x01a7, B:101:0x01ae, B:103:0x01b2, B:105:0x01b6, B:106:0x01b7, B:107:0x01bc, B:108:0x01bd, B:109:0x01c4, B:110:0x01c5, B:111:0x01cc, B:112:0x01cd), top: B:121:0x01a0 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ads_mobile_sdk.cy0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v21, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v3, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r4v5, types: [ads_mobile_sdk.rg3, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r18, mt5 r19) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cy0.b(java.lang.String, mt5):java.lang.Object");
    }

    public final Object b(prb prbVar, String str, mt5 mt5Var) {
        Object objA = a(str + "(" + prbVar + ");", mt5Var);
        return objA == px5.a ? objA : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r8, nt5 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.ay0
            if (r0 == 0) goto L14
            r0 = r9
            ads_mobile_sdk.ay0 r0 = (ads_mobile_sdk.ay0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ads_mobile_sdk.ay0 r0 = new ads_mobile_sdk.ay0
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.a
            px5 r0 = px5.a
            int r1 = r6.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            defpackage.ybh.y(r9)
            goto L5c
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r2
        L30:
            defpackage.ybh.y(r9)
            ads_mobile_sdk.wf3 r9 = r7.v
            if (r9 == 0) goto L5f
            ads_mobile_sdk.q70 r1 = r7.d
            if (r1 == 0) goto L5f
            r6.c = r3
            java.lang.String r3 = r9.a
            on7 r7 = pn7.b
            mip r7 = r1.c
            r7.getClass()
            long r4 = android.os.SystemClock.elapsedRealtime()
            un7 r7 = un7.d
            long r4 = defpackage.cs5.y0(r4, r7)
            r2 = r8
            java.lang.Object r7 = r1.a(r2, r3, r4, r6)
            if (r7 == r0) goto L59
            kotlin.Unit r7 = kotlin.Unit.a
        L59:
            if (r7 != r0) goto L5c
            return r0
        L5c:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cy0.c(java.lang.String, nt5):java.lang.Object");
    }

    public final bz0 d() {
        bz0 bz0Var;
        synchronized (this) {
            bz0Var = this.r;
        }
        return bz0Var;
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        if (!this.l.getAndSet(true)) {
            this.j.getClass();
            rl1.b = rl1.a.decrementAndGet();
        }
        this.k.set(true);
        q70 q70Var = this.d;
        if (q70Var != null) {
            mt5 mt5Var = null;
            defpackage.na2.B(q70Var.a, h.a, null, new fsg(new zhl((byte) 21, mt5Var, (Object) q70Var), mt5Var, (byte) 3), 2);
        }
        super.destroy();
    }

    public final cr3 e() {
        cr3 cr3Var;
        synchronized (this) {
            cr3Var = this.s;
        }
        return cr3Var;
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        br3 br3Var;
        int i3;
        float f;
        if (this.k.get()) {
            setMeasuredDimension(0, 0);
            return;
        }
        cr3 cr3VarE = e();
        if (isInEditMode() || cr3VarE.a == br3.a || this.n.get() || (br3Var = cr3VarE.a) == br3.d) {
            super.onMeasure(i, i2);
            return;
        }
        if (br3Var == br3.e) {
            bz0 bz0VarD = d();
            if (bz0VarD != null) {
                synchronized (bz0VarD.f) {
                    f = bz0VarD.h;
                }
            } else {
                f = 0.0f;
            }
            if (f <= 0.0f) {
                super.onMeasure(i, i2);
                return;
            }
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int i4 = (int) (size2 * f);
            int i5 = (int) (size / f);
            if (size2 == 0 && i5 != 0) {
                i4 = size;
                size2 = i5;
            } else if (size != 0 || i4 == 0) {
                i4 = size;
                size = i4;
                i5 = size2;
                size2 = i5;
            } else {
                i5 = size2;
                size = i4;
            }
            setMeasuredDimension(Math.min(size, i4), Math.min(size2, i5));
            return;
        }
        mt5 mt5Var = null;
        if (cr3VarE.d) {
            xh3.a(this.c, new by0(this, mt5Var, (byte) 6));
            synchronized (this) {
                i3 = this.t;
            }
            setMeasuredDimension(View.MeasureSpec.getSize(i), i3 == -1 ? View.MeasureSpec.getSize(i2) : (int) (i3 * this.x.density));
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size3 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size4 = View.MeasureSpec.getSize(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size3 : Integer.MAX_VALUE;
        int i7 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size4 : Integer.MAX_VALUE;
        int i8 = cr3VarE.b;
        if (i8 > i6 || cr3VarE.c > i7) {
            float f2 = this.x.density;
            int i9 = (int) (size3 / f2);
            int i10 = (int) (size4 / f2);
            StringBuilder sbO = sko.o((int) (i8 / f2), (int) (cr3VarE.c / f2), "Not enough space to show the full ad. Need ", "x", " dp, but only have ");
            sbO.append(i9);
            sbO.append("x");
            sbO.append(i10);
            sbO.append(" dp.");
            String string = sbO.toString();
            xu0.c(string, null);
            if (!this.m.getAndSet(true)) {
                xh3.a(this.c, new px0(this, string, mt5Var, (byte) 2));
            }
        }
        if (getVisibility() != 8) {
            setVisibility(0);
        }
        setMeasuredDimension(cr3VarE.b, cr3VarE.c);
    }

    @Override // android.webkit.WebView
    public final void onPause() {
        super.onPause();
        this.g.getClass();
        try {
            if (axn.b(WebViewFeature.MUTE_AUDIO)) {
                WebViewCompat.setAudioMuted(this, true);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public final void onResume() {
        super.onResume();
        this.g.getClass();
        try {
            if (axn.b(WebViewFeature.MUTE_AUDIO)) {
                WebViewCompat.setAudioMuted(this, false);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Unit unit;
        dgo dgoVar = this.u;
        if (dgoVar != null) {
            ((ew1) dgoVar.b).onTouch(null, motionEvent);
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            k8 k8Var = this.f;
            k8Var.getClass();
            e7 e7Var = k8Var.j;
            u83 u83Var = ((h7) (e7Var != null ? e7Var : null).a).b;
            edp edpVar = (edp) u83Var.f.get();
            if (edpVar == null) {
                u83Var.e.b(fl0.EVENT_ID_EARLY_INPUT_EVENT);
            } else {
                edpVar.a(motionEvent);
            }
            gp3 gp3Var = this.q;
            if (gp3Var != null) {
                gp3Var.a = motionEvent;
            }
        }
        if (this.k.get()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }
}
