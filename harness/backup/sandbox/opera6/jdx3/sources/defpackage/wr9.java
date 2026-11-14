package defpackage;

import J.N;
import android.net.Uri;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.w;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.i;
import com.google.ads.interactivemedia.v3.internal.zzei;
import com.google.ads.interactivemedia.v3.internal.zzpw;
import com.google.ads.interactivemedia.v3.internal.zzpx;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.common.util.concurrent.ListenableFuture;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import com.opera.android.browser.chromium.ChromiumContainerView;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.api.Callback;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import org.chromium.content.browser.BrowserStartupControllerImpl;

/* loaded from: classes.dex */
public final class wr9 implements Runnable {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public /* synthetic */ wr9(byte b, Object obj, Object obj2, boolean z) {
        this.a = b;
        this.b = obj2;
        this.c = obj;
    }

    public wr9(a2j a2jVar) {
        this.a = (byte) 18;
        this.c = a2jVar;
    }

    public wr9(bl9 bl9Var, Fragment fragment) {
        this.a = (byte) 11;
        this.b = fragment;
        Objects.requireNonNull(bl9Var);
        this.c = bl9Var;
    }

    public wr9(Callback callback) {
        this.a = (byte) 10;
        this.b = callback;
    }

    public wr9(cwk cwkVar, boolean z) {
        this.a = (byte) 20;
        this.c = cwkVar;
        this.b = z ? cwkVar.m : null;
    }

    public wr9(i5o i5oVar, r9i r9iVar) {
        this.a = (byte) 1;
        this.b = r9iVar;
        Objects.requireNonNull(i5oVar);
        this.c = i5oVar;
    }

    public /* synthetic */ wr9(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public wr9(s9i s9iVar, xoi xoiVar) {
        this.a = (byte) 12;
        this.b = xoiVar;
        Objects.requireNonNull(s9iVar);
        this.c = s9iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        ((java.lang.Runnable) r10.b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        defpackage.a2j.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r10.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0033 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.c     // Catch: java.lang.Throwable -> L7b
            a2j r2 = (defpackage.a2j) r2     // Catch: java.lang.Throwable -> L7b
            java.util.ArrayDeque r2 = r2.b     // Catch: java.lang.Throwable -> L7b
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L7b
            r3 = 1
            if (r0 != 0) goto L23
            java.lang.Object r0 = r10.c     // Catch: java.lang.Throwable -> L79
            a2j r0 = (defpackage.a2j) r0     // Catch: java.lang.Throwable -> L79
            int r4 = r0.c     // Catch: java.lang.Throwable -> L79
            r5 = 4
            if (r4 != r5) goto L19
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto L43
            goto L3c
        L19:
            long r6 = r0.d     // Catch: java.lang.Throwable -> L79
            r8 = 1
            long r6 = r6 + r8
            r0.d = r6     // Catch: java.lang.Throwable -> L79
            r0.c = r5     // Catch: java.lang.Throwable -> L79
            r0 = r3
        L23:
            java.lang.Object r4 = r10.c     // Catch: java.lang.Throwable -> L79
            a2j r4 = (defpackage.a2j) r4     // Catch: java.lang.Throwable -> L79
            java.util.ArrayDeque r4 = r4.b     // Catch: java.lang.Throwable -> L79
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L79
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L79
            r10.b = r4     // Catch: java.lang.Throwable -> L79
            if (r4 != 0) goto L44
            java.lang.Object r10 = r10.c     // Catch: java.lang.Throwable -> L79
            a2j r10 = (defpackage.a2j) r10     // Catch: java.lang.Throwable -> L79
            r10.c = r3     // Catch: java.lang.Throwable -> L79
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto L43
        L3c:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
        L43:
            return
        L44:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L7b
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.b     // Catch: java.lang.RuntimeException -> L53 java.lang.Throwable -> L73
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.RuntimeException -> L53 java.lang.Throwable -> L73
            r3.run()     // Catch: java.lang.RuntimeException -> L53 java.lang.Throwable -> L73
            goto L70
        L53:
            r3 = move-exception
            java.util.logging.Logger r4 = defpackage.a2j.f     // Catch: java.lang.Throwable -> L73
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r6.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L73
            java.lang.Object r7 = r10.b     // Catch: java.lang.Throwable -> L73
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L73
            r6.append(r7)     // Catch: java.lang.Throwable -> L73
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L73
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L73
        L70:
            r10.b = r2     // Catch: java.lang.Throwable -> L7b
            goto L2
        L73:
            r0 = move-exception
            r10.b = r2     // Catch: java.lang.Throwable -> L7b
            throw r0     // Catch: java.lang.Throwable -> L7b
        L77:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            throw r10     // Catch: java.lang.Throwable -> L7b
        L79:
            r10 = move-exception
            goto L77
        L7b:
            r10 = move-exception
            if (r1 == 0) goto L85
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L85:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wr9.a():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        rl rlVar;
        byte b = 1;
        int i = 0;
        Object[] objArr = 0;
        try {
            switch (this.a) {
                case 0:
                    rr9 rr9Var = (rr9) this.c;
                    try {
                        rr9Var.onSuccess(k1g.v((ListenableFuture) this.b));
                        return;
                    } catch (Error | RuntimeException e) {
                        rr9Var.onFailure(e);
                        return;
                    } catch (ExecutionException e2) {
                        Throwable cause = e2.getCause();
                        if (cause == null) {
                            rr9Var.onFailure(e2);
                            return;
                        } else {
                            rr9Var.onFailure(cause);
                            return;
                        }
                    }
                case 1:
                    i5o i5oVar = (i5o) this.c;
                    t9f t9fVar = (t9f) ((jy) i5oVar.b).get();
                    Uri uri = (Uri) ((k5o) ((sy) i5oVar.j).get()).b;
                    r9i r9iVar = (r9i) this.b;
                    String str = (String) r9iVar.b;
                    String str2 = (String) r9iVar.c;
                    String str3 = (String) r9iVar.d;
                    nz nzVar = (nz) i5oVar.k;
                    jz.a(t9fVar, uri, str, str, str2, "", str3, nzVar != null ? nzVar.o : "", null);
                    return;
                case 2:
                    throw new RuntimeException("Filter " + ((qzj) this.b).key() + " crashed with exception.", (RuntimeException) this.c);
                case 3:
                    boolean z = ((BrowserStartupControllerImpl) this.c).g;
                    qy3 qy3Var = (qy3) this.b;
                    if (z) {
                        qy3Var.c();
                        return;
                    } else {
                        qy3Var.a();
                        return;
                    }
                case 4:
                    try {
                        try {
                            fr4 fr4Var = (fr4) this.c;
                            Object objF = k1g.F((ListenableFuture) this.b);
                            l94 l94Var = ((sr9) fr4Var).b;
                            if (l94Var != null) {
                                l94Var.b(objF);
                            }
                        } catch (CancellationException unused) {
                            ((fr4) this.c).cancel(false);
                        }
                    } catch (ExecutionException e3) {
                        fr4 fr4Var2 = (fr4) this.c;
                        Throwable cause2 = e3.getCause();
                        l94 l94Var2 = ((sr9) fr4Var2).b;
                        if (l94Var2 != null) {
                            l94Var2.d(cause2);
                        }
                    }
                    return;
                case 5:
                    uv4 uv4Var = (uv4) ((k5o) this.c).c;
                    uv4Var.d((iw4) this.b);
                    ArrayDeque arrayDeque = uv4Var.b;
                    if (arrayDeque.isEmpty()) {
                        return;
                    }
                    ((Runnable) arrayDeque.remove()).run();
                    if (arrayDeque.isEmpty() || (rlVar = uv4Var.a) == null) {
                        return;
                    }
                    rlVar.run();
                    return;
                case 6:
                    xr6 xr6Var = (xr6) this.c;
                    ArrayList arrayList = (ArrayList) this.b;
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        vr6 vr6Var = (vr6) obj;
                        ArrayList arrayList2 = xr6Var.r;
                        i iVar = vr6Var.a;
                        View view = iVar == null ? null : iVar.itemView;
                        i iVar2 = vr6Var.b;
                        View view2 = iVar2 != null ? iVar2.itemView : null;
                        if (view != null) {
                            ViewPropertyAnimator duration = view.animate().setDuration(((e) xr6Var).f);
                            arrayList2.add(vr6Var.a);
                            duration.translationX(vr6Var.e - vr6Var.c);
                            duration.translationY(vr6Var.f - vr6Var.d);
                            duration.alpha(0.0f).setListener(new ur6(xr6Var, vr6Var, duration, view, (byte) 0)).start();
                        }
                        if (view2 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                            arrayList2.add(vr6Var.b);
                            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(((e) xr6Var).f).alpha(1.0f).setListener(new ur6(xr6Var, vr6Var, viewPropertyAnimatorAnimate, view2, (byte) 1)).start();
                        }
                    }
                    arrayList.clear();
                    xr6Var.n.remove(arrayList);
                    return;
                case 7:
                    qs7 qs7VarX = qs7.x();
                    int i2 = e17.d;
                    h5o h5oVar = (h5o) this.b;
                    qs7VarX.getClass();
                    ((e17) this.c).a.c(new h5o[]{h5oVar});
                    return;
                case 8:
                    View view3 = (View) this.c;
                    view3.setTranslationX(0.0f);
                    view3.setTranslationY(0.0f);
                    return;
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    zlj zljVar = (zlj) this.b;
                    zljVar.a.a();
                    synchronized (zljVar.b) {
                        synchronized (((r38) this.c)) {
                            try {
                                if (((ArrayList) ((r38) this.c).a.b).contains(new p38((zlj) this.b, pg8.b))) {
                                    r38 r38Var = (r38) this.c;
                                    zlj zljVar2 = (zlj) this.b;
                                    r38Var.getClass();
                                    try {
                                        zljVar2.g(r38Var.p, 5);
                                    } catch (Throwable th) {
                                        throw new h94(th);
                                    }
                                }
                                ((r38) this.c).b();
                            } finally {
                            }
                        }
                    }
                    return;
                case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                    Object obj2 = this.c;
                    this.c = null;
                    if (obj2 != null) {
                        ((Callback) this.b).run(obj2);
                        return;
                    }
                    return;
                case 11:
                    bl9 bl9Var = (bl9) this.c;
                    w wVar = (w) bl9Var.c;
                    a aVarF = u35.f(wVar, wVar);
                    aVarF.m((Fragment) this.b);
                    bl9Var.a(aVarF);
                    return;
                case 12:
                    ((s9i) this.c).S((xoi) this.b, 6000L);
                    return;
                case 13:
                    aeb aebVar = ((zdb) this.c).b;
                    ksc kscVar = (ksc) this.b;
                    ChromiumContent chromiumContent = aebVar.a;
                    if (chromiumContent.h()) {
                        return;
                    }
                    kscVar.h = N.MWaTX$e6(chromiumContent.t, kscVar.a);
                    chromiumContent.e().q().r(kscVar);
                    return;
                case 14:
                    ie2 ie2Var = (ie2) this.c;
                    Object obj3 = this.b;
                    boolean z2 = ie2Var.c.get();
                    je2 je2Var = ie2Var.f;
                    if (z2) {
                        je2Var.dispatchOnCancelled(ie2Var, obj3);
                    } else {
                        je2Var.dispatchOnLoadComplete(ie2Var, obj3);
                    }
                    ie2Var.b = 3;
                    return;
                case 15:
                    s28 s28Var = (s28) this.c;
                    l76 l76Var = (l76) s28Var.e;
                    String str4 = (String) this.b;
                    if (l76Var.contains(str4)) {
                        l76Var.remove(str4);
                    }
                    l76Var.add(str4);
                    s28Var.d();
                    return;
                case 16:
                    s28 s28Var2 = (s28) this.c;
                    ((l76) s28Var2.e).clear();
                    s28Var2.d();
                    ((Runnable) this.b).run();
                    return;
                case 17:
                    ((nh4) this.c).F((jg8) this.b, Unit.a);
                    return;
                case SizeUtil.textSize0_1 /* 18 */:
                    try {
                        a();
                        return;
                    } catch (Error e4) {
                        synchronized (((a2j) this.c).b) {
                            ((a2j) this.c).c = 1;
                            throw e4;
                        }
                    }
                case 19:
                    shf shfVar = (shf) this.b;
                    shfVar.a = this.c;
                    AtomicReference atomicReference = (AtomicReference) shfVar.c;
                    while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
                    }
                    return;
                case SizeUtil.textSize0 /* 20 */:
                    cwk cwkVar = (cwk) this.c;
                    qsh qshVar = cwkVar.g;
                    ((View) qshVar.b).setTranslationX(0.0f);
                    ((ChromiumContainerView) qshVar.c).setTranslationX(0.0f);
                    cwkVar.c.setVisibility(4);
                    cwkVar.a.setVisibility(4);
                    b2l b2lVar = (b2l) this.b;
                    if (b2lVar != null) {
                        d7l d7lVar = (d7l) b2lVar;
                        if (d7lVar.m) {
                            return;
                        }
                        cwkVar.b.setVisibility(0);
                        xt3 xt3Var = cwkVar.d;
                        s03 s03Var = new s03(xt3Var, new bwk(cwkVar, b));
                        cwkVar.o = s03Var;
                        if (d7lVar.m || d7lVar.n0() || d7lVar.j.c0()) {
                            s03Var.run();
                        } else {
                            xt3Var.run(s03Var);
                            vml.d(s03Var, 5000L);
                        }
                        ((k6l) cwkVar.h.get()).C(b2lVar, 3);
                        ((x5f) ((orm) cwkVar.i.b.get())).L0(kr0.c);
                        return;
                    }
                    return;
                case 21:
                    b2l b2lVar2 = (b2l) this.b;
                    k6l k6lVar = (k6l) this.c;
                    if (b2lVar2 == k6lVar.o || k6lVar.b.contains(b2lVar2)) {
                        return;
                    }
                    ((d7l) b2lVar2).dispose();
                    return;
                case SizeUtil.textSize1 /* 22 */:
                    nh4 nh4Var = (nh4) this.c;
                    ListenableFuture listenableFuture = (ListenableFuture) this.b;
                    if (listenableFuture.isCancelled()) {
                        nh4Var.d((Throwable) null);
                        return;
                    }
                    try {
                        p0i p0iVar = t0i.b;
                        nh4Var.resumeWith(x6.g(listenableFuture));
                        return;
                    } catch (ExecutionException e5) {
                        p0i p0iVar2 = t0i.b;
                        nh4Var.resumeWith(new q0i(e5.getCause()));
                        return;
                    }
                case 23:
                    View view4 = ((mrn) this.c).m;
                    view4.setTranslationY(view4.getHeight());
                    view4.animate().setDuration(pn7.f(mrn.A)).setInterpolator(lf1.d).translationY(0.0f).alpha(1.0f).start();
                    return;
                case SizeUtil.textSize2 /* 24 */:
                    n1p n1pVar = (n1p) this.b;
                    p0i p0iVar3 = t0i.b;
                    n1pVar.invoke(new t0i(new q0i(new IOException("Downloading in progress: " + ((File) this.c)))));
                    return;
                case 25:
                    a3p a3pVar = (a3p) this.b;
                    StringBuilder sb = new StringBuilder("mraid.setPlacementType('");
                    sb.append(a3pVar.k ? "interstitial" : "inline");
                    sb.append("');");
                    a3pVar.g(sb.toString());
                    WebView webView = (WebView) this.c;
                    ito[] itoVarArr = ito.a;
                    webView.evaluateJavascript("mraid.logLevel = mraid.LogLevelEnum.NONE;", new z4d((byte) 5));
                    a3pVar.y();
                    a3pVar.w();
                    a3pVar.r();
                    a3pVar.g("mraid.fireReadyEvent();");
                    if (a3pVar.w) {
                        a3pVar.s();
                        return;
                    }
                    return;
                case 26:
                    Throwable thD = t0i.d(this.b);
                    zcf zcfVar = (zcf) this.c;
                    if (thD == null) {
                        zcfVar.onSuccess();
                        return;
                    }
                    String message = thD.getMessage();
                    if (message == null) {
                        message = "Sdk initialization error.";
                    }
                    zcfVar.a(new cm(6, message, (byte) (objArr == true ? 1 : 0)));
                    return;
                case 27:
                    ((gpp) ((rop) this.b).c).c.remove((String) this.c);
                    return;
                case 28:
                    cf3 cf3Var = (cf3) this.b;
                    mf3 mf3Var = (mf3) this.c;
                    ye3 ye3Var = (ye3) cf3Var.f.d;
                    i9c i9cVar = cf3Var.f;
                    if (ye3Var != null) {
                        ((ye3) i9cVar.d).a(mf3Var, null);
                        return;
                    } else {
                        zzc.zzo("BillingClient", "No valid listener is set in BroadcastManager");
                        return;
                    }
                default:
                    plk plkVar = (plk) this.b;
                    wmb wmbVar = (wmb) this.c;
                    WebView webView2 = (WebView) plkVar.a;
                    zzei zzeiVar = (zzei) plkVar.d;
                    if (zzeiVar == null) {
                        "Attempted to send bridge message after cleanup: ".concat(wmbVar.toString());
                        return;
                    }
                    zzpw zzpwVar = new zzpw();
                    zzpwVar.a(Constants.Params.TYPE, wmbVar.d);
                    zzpwVar.a("sid", wmbVar.c);
                    Object obj4 = wmbVar.b;
                    if (obj4 != null) {
                        zzpwVar.a(Constants.Params.DATA, obj4);
                    }
                    zzpx zzpxVarB = zzpwVar.b();
                    String str5 = "javascript:adsense.mobileads.afmanotify.receiveMessage('" + wmbVar.a + "', " + zzeiVar.a.d(zzpxVarB) + ");";
                    wmbVar.toString();
                    try {
                        webView2.evaluateJavascript(str5, null);
                        return;
                    } catch (IllegalStateException unused2) {
                        webView2.loadUrl(str5);
                        return;
                    }
            }
        } finally {
            ((fr4) this.c).g = null;
        }
        ((fr4) this.c).g = null;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return wr9.class.getSimpleName() + "," + ((rr9) this.c);
            case SizeUtil.textSize0_1 /* 18 */:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((a2j) this.c).c;
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
