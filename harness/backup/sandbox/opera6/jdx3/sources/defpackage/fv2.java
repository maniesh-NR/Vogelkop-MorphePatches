package defpackage;

import J.N;
import android.content.Context;
import android.view.ViewTreeObserver;
import com.google.android.material.textfield.TextInputEditText;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.bar.BottomBar;
import com.opera.android.bookmarks.h;
import com.opera.android.browser.BrowserFragment;
import com.opera.android.bubbleview.BubbleView;
import com.opera.android.crashhandler.OperaCrashKeys;
import com.opera.android.settings.BigSwitchButton;
import com.opera.android.widget.ThemeableLottieAnimationView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;
import okhttp3.internal.connection.RealCall;
import org.chromium.components.media_router.caf.remoting.CafExpandedControllerActivity;
import org.chromium.content.browser.BrowserStartupControllerImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class fv2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fv2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xm3 xm3Var;
        lz3 lz3Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                gv2 gv2Var = (gv2) obj;
                gv2Var.a(gv2Var.a).invoke(new iu2(gv2Var, (byte) 2));
                break;
            case 1:
                hv2 hv2Var = (hv2) obj;
                hv2Var.i = false;
                hv2Var.e();
                break;
            case 2:
                wz2 wz2Var = (wz2) obj;
                if (!wz2Var.a) {
                    wz2Var.a(false);
                    wz2Var.b();
                    break;
                }
                break;
            case 3:
                yz2 yz2Var = (yz2) ((xz2) obj).d;
                if (!yz2Var.a) {
                    yz2Var.a(false);
                    yz2Var.b();
                }
                ViewTreeObserver viewTreeObserver = yz2Var.e;
                if (yz2Var.d != null) {
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnDrawListener(yz2Var.d);
                    }
                    yz2Var.d = null;
                    break;
                }
                break;
            case 4:
                zz2 zz2Var = (zz2) obj;
                if (!zz2Var.a) {
                    zz2Var.a(false);
                    zz2Var.b();
                    break;
                }
                break;
            case 5:
                p43 p43Var = (p43) obj;
                if (!p43Var.e) {
                    RealCall realCallB = p43Var.b();
                    p43Var.d = realCallB;
                    realCallB.enqueue(p43Var);
                    break;
                }
                break;
            case 6:
                r43 r43Var = (r43) obj;
                v84 v84Var = r43Var.d;
                if (v84Var != null) {
                    v84Var.cancel();
                    r43Var.d = null;
                }
                r43Var.b.S();
                if (!r43Var.e) {
                    RealCall realCallB2 = r43Var.b();
                    r43Var.d = realCallB2;
                    realCallB2.enqueue(r43Var);
                    break;
                }
                break;
            case 7:
                wue wueVar = (wue) obj;
                wueVar.d = false;
                if (!wueVar.e) {
                    a53 a53Var = new a53(wueVar);
                    wueVar.c = a53Var;
                    ((xqe) wueVar.b.b).b.b(a53Var);
                    g7f g7fVar = new g7f(wueVar.a);
                    while (g7fVar.hasNext()) {
                        ((rw8) g7fVar.next()).a(((xqe) wueVar.c.a.b.b).a());
                    }
                    break;
                }
                break;
            case 8:
                ((f93) obj).e();
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                TextInputEditText textInputEditText = ((zu) ((f9c) obj).s).c;
                l5b l5bVar = q9n.c;
                q9n.G(textInputEditText.getContext(), textInputEditText);
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((y93) obj).g0();
                break;
            case 11:
                k2d k2dVar = BigSwitchButton.j;
                ((ThemeableLottieAnimationView) ((BigSwitchButton) obj).a.d).t(BigSwitchButton.l, null);
                break;
            case 12:
                th3 th3Var = (th3) obj;
                if (!th3Var.e) {
                    th3Var.k();
                    break;
                }
                break;
            case 13:
                dn3 dn3Var = (dn3) obj;
                gn3 gn3Var = dn3Var.k;
                if (gn3Var.s != null && !gn3Var.H.R(1)) {
                    gn3Var.s.K(dn3Var.i);
                    break;
                }
                break;
            case 14:
                dn3 dn3Var2 = (dn3) obj;
                gn3 gn3Var2 = dn3Var2.k;
                if (gn3Var2.s != null) {
                    db dbVar = gn3Var2.i;
                    zwk zwkVar = gn3Var2.h;
                    if (xgh.a || !xgh.s(dbVar, zwkVar)) {
                        gn3Var2.s.K(dn3Var2.i);
                        break;
                    }
                }
                break;
            case 15:
                gn3 gn3Var3 = (gn3) ((fn3) obj).b;
                if (xgh.s(gn3Var3.i, gn3Var3.h)) {
                    if (!xgh.a && (xm3Var = gn3Var3.s) != null) {
                        xm3Var.e.a(new qhc(lkj.k(-2L, "", ""), 8));
                        gn3Var3.s.notifyItemChanged(0);
                    }
                    if (gn3Var3.L) {
                        gn3Var3.L = false;
                        gn3Var3.u();
                        break;
                    }
                }
                break;
            case 16:
                ne5 ne5Var = (ne5) obj;
                ne5Var.f = null;
                ArrayList arrayList = (ArrayList) ne5Var.b;
                arrayList.clear();
                h hVar = (h) ne5Var.a;
                arrayList.addAll(alo.u(Arrays.asList(hVar.o())));
                if (alo.G(hVar)) {
                    arrayList.addAll(alo.u(Arrays.asList(hVar.l())));
                    break;
                }
                break;
            case 17:
                BottomBar bottomBar = ((jo3) obj).a;
                bottomBar.setAlpha(1.0f);
                if (bottomBar.f) {
                    bottomBar.f = false;
                    bottomBar.setDescendantFocusability(131072);
                    break;
                }
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                ks3 ks3Var = (ks3) obj;
                OperaCrashKeys operaCrashKeys = (OperaCrashKeys) ks3Var.c;
                AtomicReferenceArray atomicReferenceArray = operaCrashKeys.a;
                for (int i = 0; i < atomicReferenceArray.length(); i++) {
                    N.MDEEK5$i(i, (String) atomicReferenceArray.get(i));
                }
                operaCrashKeys.b = true;
                Iterator it = ((CopyOnWriteArraySet) ks3Var.f).iterator();
                while (it.hasNext()) {
                    ym8 ym8Var = (ym8) it.next();
                    ym8Var.getClass();
                    zd2 zd2Var = new zd2(ym8Var.a, operaCrashKeys, new tw2((Object) ym8Var, (byte) 10));
                    if (!he2.a(zd2Var, new Void[0])) {
                        tw2 tw2Var = (tw2) zd2Var.d;
                        Context context = (Context) zd2Var.b;
                        Object obj2 = tw2Var.b;
                        zd2Var.a(ym8.a(context));
                    }
                }
                break;
            case 19:
                ysj ysjVar = (ysj) obj;
                int i2 = BrowserActivity.E1;
                ysjVar.b(am2.i(2132019200, 2500, ysjVar), ijm.b);
                break;
            case SizeUtil.textSize0 /* 20 */:
                ((uw3) obj).S();
                break;
            case 21:
                ((BrowserFragment) obj).g0();
                break;
            case SizeUtil.textSize1 /* 22 */:
                ((BrowserStartupControllerImpl) obj).b(1);
                break;
            case 23:
                ((bp3) obj).b = false;
                break;
            case SizeUtil.textSize2 /* 24 */:
                ((oc2) obj).invoke();
                break;
            case 25:
                BubbleView bubbleView = (BubbleView) obj;
                int i3 = BubbleView.D;
                bubbleView.y = false;
                if (bubbleView.isAttachedToWindow() && (lz3Var = bubbleView.w) != null) {
                    i7f i7fVar = lz3Var.c;
                    g7f g7fVarC = u35.c(i7fVar, i7fVar);
                    while (g7fVarC.hasNext()) {
                        ((kz3) g7fVarC.next()).h();
                    }
                    break;
                }
                break;
            case 26:
                w04 w04Var = (w04) obj;
                w04Var.c = false;
                vml.a(w04Var.d);
                x05 x05Var = w04Var.b;
                if (!x05Var.d.isRunning()) {
                    x05Var.start();
                    break;
                }
                break;
            case 27:
                File fileG = ((r9i) obj).G();
                if (fileG.exists()) {
                    try {
                        fileG.delete();
                        break;
                    } catch (SecurityException unused) {
                        return;
                    }
                }
                break;
            case 28:
                CafExpandedControllerActivity cafExpandedControllerActivity = (CafExpandedControllerActivity) obj;
                int i4 = CafExpandedControllerActivity.h;
                cafExpandedControllerActivity.b.d();
                cafExpandedControllerActivity.a.postDelayed(cafExpandedControllerActivity.f, 1000L);
                break;
            default:
                sgb.k(((za4) obj).f, (CancellationException) null);
                break;
        }
    }
}
