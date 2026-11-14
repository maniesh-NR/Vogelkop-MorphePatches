package defpackage;

import J.N;
import android.app.Activity;
import android.graphics.Rect;
import android.hardware.camera2.CameraDevice;
import android.media.AudioManager;
import android.os.IInterface;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.leanplum.utils.SizeUtil;
import com.opera.android.browser.chromium.ChromiumContainerView;
import com.opera.android.custom_views.SmoothProgressBar;
import com.opera.android.custom_views.SplashView;
import defpackage.cdn;
import defpackage.dcl;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;

/* loaded from: classes.dex */
public final class ssi implements Runnable, ih4 {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ ssi(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ ssi(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj2;
    }

    public ssi(pno pnoVar) {
        this.a = (byte) 26;
        this.b = pnoVar.g;
    }

    public ssi(uuj uujVar) {
        this.a = (byte) 24;
        Objects.requireNonNull(uujVar);
        this.b = uujVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        r4.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        r4.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0031 A[SYNTHETIC] */
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
            java.lang.Object r2 = r10.b     // Catch: java.lang.Throwable -> L54
            b2j r2 = (b2j) r2     // Catch: java.lang.Throwable -> L54
            java.util.ArrayDeque r2 = r2.a     // Catch: java.lang.Throwable -> L54
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L54
            r3 = 1
            if (r0 != 0) goto L23
            java.lang.Object r0 = r10.b     // Catch: java.lang.Throwable -> L52
            b2j r0 = (b2j) r0     // Catch: java.lang.Throwable -> L52
            int r4 = r0.d     // Catch: java.lang.Throwable -> L52
            r5 = 4
            if (r4 != r5) goto L19
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L41
            goto L3a
        L19:
            long r6 = r0.e     // Catch: java.lang.Throwable -> L52
            r8 = 1
            long r6 = r6 + r8
            r0.e = r6     // Catch: java.lang.Throwable -> L52
            r0.d = r5     // Catch: java.lang.Throwable -> L52
            r0 = r3
        L23:
            java.lang.Object r4 = r10.b     // Catch: java.lang.Throwable -> L52
            b2j r4 = (b2j) r4     // Catch: java.lang.Throwable -> L52
            java.util.ArrayDeque r4 = r4.a     // Catch: java.lang.Throwable -> L52
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L52
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L52
            if (r4 != 0) goto L42
            java.lang.Object r10 = r10.b     // Catch: java.lang.Throwable -> L52
            b2j r10 = (b2j) r10     // Catch: java.lang.Throwable -> L52
            r10.d = r3     // Catch: java.lang.Throwable -> L52
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L41
        L3a:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
        L41:
            return
        L42:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L52
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L54
            r1 = r1 | r2
            r4.run()     // Catch: java.lang.RuntimeException -> L4c java.lang.Throwable -> L54
            goto L2
        L4c:
            r4.toString()     // Catch: java.lang.Throwable -> L54
            goto L2
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L52
            throw r10     // Catch: java.lang.Throwable -> L54
        L52:
            r10 = move-exception
            goto L50
        L54:
            r10 = move-exception
            if (r1 == 0) goto L5e
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L5e:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ssi.a():void");
    }

    @Override // defpackage.ih4
    public final void cancel() {
        this.b = null;
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [com.opera.android.browser.chromium.NetworkTester$NonProxiedTest] */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        Long l;
        switch (this.a) {
            case 0:
                vsi vsiVar = (vsi) this.b;
                int i = vsiVar.h - 1;
                vsiVar.h = i;
                if (i != 0 || vsiVar.e == null) {
                    return;
                }
                vsiVar.c(false);
                if (vsiVar.b != 2) {
                    vsiVar.f(vsiVar.e);
                    return;
                }
                return;
            case 1:
                SelectionPopupControllerImpl selectionPopupControllerImpl = (SelectionPopupControllerImpl) this.b;
                boolean z = SelectionPopupControllerImpl.R;
                long defaultActionModeHideDuration = ViewConfiguration.getDefaultActionModeHideDuration();
                selectionPopupControllerImpl.b.postDelayed(selectionPopupControllerImpl.k, defaultActionModeHideDuration - 1);
                if (selectionPopupControllerImpl.g()) {
                    selectionPopupControllerImpl.n.hide(defaultActionModeHideDuration);
                    return;
                }
                return;
            case 2:
                try {
                    a();
                    return;
                } catch (Error e) {
                    synchronized (((b2j) this.b).a) {
                        ((b2j) this.b).d = 1;
                        throw e;
                    }
                }
            case 3:
                SmoothProgressBar smoothProgressBar = (SmoothProgressBar) this.b;
                int progress = smoothProgressBar.getProgress();
                int i2 = smoothProgressBar.b;
                if (progress != i2) {
                    if (!smoothProgressBar.a) {
                        smoothProgressBar.a(i2);
                        return;
                    } else {
                        smoothProgressBar.a((((smoothProgressBar.b - smoothProgressBar.getProgress()) + 3) / 4) + smoothProgressBar.getProgress());
                        smoothProgressBar.postOnAnimationDelayed(this, 16L);
                        return;
                    }
                }
                return;
            case 4:
                syj syjVar = (syj) this.b;
                synchronized (syjVar.f) {
                    l = syjVar.g;
                }
                if (l != null) {
                    int iUptimeMillis = (int) ((SystemClock.uptimeMillis() / 20) - l.longValue());
                    syj syjVar2 = (syj) this.b;
                    ode odeVar = syjVar2.a;
                    synchronized (syjVar2.e) {
                        fFloatValue = iUptimeMillis < syjVar2.e.size() ? ((Number) syjVar2.e.get(iUptimeMillis)).floatValue() : 0.0f;
                    }
                    odeVar.r(Float.valueOf(fFloatValue * ((syj) this.b).c));
                    vml.d(this, 20L);
                    return;
                }
                return;
            case 5:
                ((SplashView) this.b).findViewById(2131364531).setVisibility(0);
                return;
            case 6:
                ((StaggeredGridLayoutManager) this.b).p();
                return;
            case 7:
                ((t0g) this.b).setValue(Boolean.TRUE);
                return;
            case 8:
                ((cy3) this.b).d.c(false, false);
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                xbf xbfVar = (xbf) this.b;
                FrameLayout frameLayout = (FrameLayout) xbfVar.b;
                frameLayout.setVisibility(4);
                frameLayout.removeView((View) xbfVar.f);
                frameLayout.removeView((View) xbfVar.g);
                ((View) xbfVar.c).setTranslationX(0.0f);
                ((ChromiumContainerView) xbfVar.d).setTranslationX(0.0f);
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.b).c.f;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 11:
                dnl dnlVar = (dnl) this.b;
                if (dnlVar.d.t()) {
                    return;
                }
                wxe.n();
                cnl cnlVar = dnl.m;
                wxe.n();
                try {
                    dnlVar.g.put(cnlVar);
                } catch (InterruptedException unused) {
                }
                dnlVar.e.post(dnlVar.a);
                return;
            case 12:
                ((Toolbar) this.b).F();
                return;
            case 13:
                usl uslVar = (usl) this.b;
                sp1 sp1Var = uslVar.b;
                itd itdVarW = uslVar.w();
                itd itdVar = itdVarW != null ? itdVarW : null;
                if (itdVar != null) {
                    itdVar.w();
                }
                try {
                    itdVarW.clear();
                    if (!sp1Var.onCreatePanelMenu(0, itdVarW) || !sp1Var.onPreparePanel(0, (View) null, itdVarW)) {
                        itdVarW.clear();
                    }
                    if (itdVar != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (itdVar != null) {
                        itdVar.v();
                    }
                }
            case 14:
                ((rzg) this.b).g();
                return;
            case 15:
                we9 we9Var = (we9) this.b;
                if (we9Var != null) {
                    we9Var.run();
                    return;
                }
                return;
            case 16:
                iuh iuhVar = ((g6m) this.b).e;
                wtm wtmVar = (wtm) iuhVar.c;
                zto ztoVar = new zto(iuhVar);
                ((qno) ztoVar).a = wtmVar;
                ArrayDeque arrayDeque = (ArrayDeque) wtmVar.b;
                arrayDeque.add(ztoVar);
                if (((qno) wtmVar.c) == null) {
                    qno qnoVar = (qno) arrayDeque.poll();
                    wtmVar.c = qnoVar;
                    if (qnoVar != null) {
                        qnoVar.executeOnExecutor((ThreadPoolExecutor) wtmVar.a, new Object[0]);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ((m6m) ((n9h) this.b).c).e = null;
                return;
            case SizeUtil.textSize0_1 /* 18 */:
                pom pomVar = (pom) this.b;
                pomVar.S();
                pomVar.T(0);
                return;
            case 19:
                i3n i3nVar = (i3n) this.b;
                i3nVar.G = false;
                CameraDevice cameraDevice = i3nVar.i;
                if (cameraDevice != null) {
                    cameraDevice.close();
                    i3nVar.i(3);
                    i3nVar.s = new Rect();
                    return;
                }
                return;
            case SizeUtil.textSize0 /* 20 */:
                ((x5n) this.b).m(0);
                return;
            case 21:
                ViewPager viewPager = (ViewPager) this.b;
                viewPager.setScrollState(0);
                viewPager.populate();
                return;
            case SizeUtil.textSize1 /* 22 */:
                cdn cdnVar = (cdn) this.b;
                tvk tvkVar = cdnVar.m;
                eej eejVar = cdnVar.h;
                k6l k6lVar = cdnVar.g;
                int i3 = cdnVar.l;
                if (i3 == 1 || cdnVar.o != null) {
                    return;
                }
                if (i3 == 2 && cdnVar.q == null && !cdnVar.R().c.isEnabled()) {
                    final dcl dclVar = cdnVar.p;
                    cdnVar.q = new Object(dclVar) { // from class: com.opera.android.browser.chromium.NetworkTester$NonProxiedTest
                        public long a = N.MIR5g6Sp(this);
                        public final dcl b;

                        {
                            this.b = dclVar;
                        }

                        public final void onTestCompleted(int i4) throws InterruptedException {
                            long j = this.a;
                            if (j == 0) {
                                return;
                            }
                            N.MDxXurEr(j);
                            this.a = 0L;
                            cdn cdnVar2 = (cdn) this.b.a;
                            if (i4 == 0 && cdnVar2.l == 2) {
                                cdnVar2.l = 4;
                            }
                            cdnVar2.n.run();
                            cdnVar2.q = null;
                        }
                    };
                    return;
                }
                int i4 = cdnVar.l;
                cdnVar.l = 1;
                if (k6lVar.o != null) {
                    if (!cdnVar.R().c.isEnabled()) {
                        b2l b2lVar = k6lVar.o;
                        eejVar.getClass();
                        edn ednVar = new edn(i4, tvkVar);
                        eejVar.b.R(ednVar, b2lVar);
                        cdnVar.o = ednVar;
                        return;
                    }
                    if (i4 == 2) {
                        b2l b2lVar2 = k6lVar.o;
                        eejVar.getClass();
                        tg7 tg7Var = new tg7(i4, tvkVar);
                        eejVar.b.S(tg7Var, b2lVar2, false);
                        cdnVar.o = tg7Var;
                        return;
                    }
                    return;
                }
                return;
            case 23:
                sgi sgiVar = (sgi) this.b;
                sgiVar.c = false;
                ((rdn) sgiVar.e).run();
                return;
            case SizeUtil.textSize2 /* 24 */:
                uuj uujVar = (uuj) this.b;
                ((ViewGroup) uujVar.c).setVisibility(8);
                ((ViewGroup) ((ViewGroup) uujVar.c).getParent()).removeView((ViewGroup) uujVar.c);
                uujVar.c = null;
                return;
            case 25:
                ((hoo) this.b).d.d(new lio(new umo(-1, "timeout")));
                return;
            case 26:
                ((WebView) this.b).destroy();
                return;
            case 27:
                ouo ouoVar = (ouo) this.b;
                AudioManager audioManager = ouoVar.d;
                int streamVolume = audioManager.getStreamVolume(3);
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                ((cpj) ouoVar.h).getClass();
                if (streamMaxVolume > 0 && streamVolume > 0) {
                    fFloatValue = streamVolume / streamMaxVolume;
                    if (fFloatValue > 1.0f) {
                        fFloatValue = 1.0f;
                    }
                }
                ouoVar.f.set(false);
                if (((Float) ouoVar.e.getAndSet(Float.valueOf(fFloatValue))).floatValue() != fFloatValue) {
                    ouoVar.b.post(new hto(this, fFloatValue, (byte) 0));
                    return;
                }
                return;
            case 28:
                wtm wtmVar2 = (wtm) this.b;
                Activity activity = (Activity) wtmVar2.a;
                View view = (View) wtmVar2.c;
                if (view != null) {
                    if (activity.isInPictureInPictureMode()) {
                        View view2 = (View) wtmVar2.c;
                        if (view2 != null) {
                            ((Activity) wtmVar2.a).runOnUiThread(new vr9(wtmVar2, view2, (byte) 29));
                            return;
                        }
                        return;
                    }
                    try {
                        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.height = Math.min(activity.getResources().getDimensionPixelSize(2131167408), (int) (hyg.s(activity) * 0.6f));
                            if (activity.getResources().getConfiguration().screenWidthDp > 640) {
                                layoutParams.width = hyg.r(activity, 640);
                            } else {
                                layoutParams.width = -1;
                            }
                            ((WindowManager) wtmVar2.b).updateViewLayout(view, layoutParams);
                            return;
                        }
                        return;
                    } catch (RuntimeException unused2) {
                        return;
                    }
                }
                return;
            default:
                g7m g7mVar = (g7m) ((tko) this.b).b;
                IInterface iInterface = (IInterface) g7mVar.k;
                if (iInterface != null) {
                    iInterface.getClass();
                    iInterface.asBinder().unlinkToDeath((xip) g7mVar.i, 0);
                    g7mVar.k = null;
                    g7mVar.r();
                }
                g7mVar.a = false;
                return;
        }
    }
}
