package defpackage;

import J.N;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.leanplum.utils.SizeUtil;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.browser.UrlMangler;
import com.opera.android.custom_views.HiddenFragmentContainer;
import com.opera.android.tabui2.ConfigurationProvidingFrameLayout;
import com.opera.android.widget.UrlFieldEditText;
import java.util.concurrent.CancellationException;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class z61 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ z61() {
        this.a = (byte) 20;
    }

    public z61(View view) {
        this.a = (byte) 25;
        this.b = new kze(view.isAttachedToWindow() ? ng.a : og.a);
        view.addOnAttachStateChangeListener(this);
    }

    public /* synthetic */ z61(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }

    private final void g(View view) {
    }

    private final void h(View view) {
    }

    private final void i(View view) {
    }

    private final void j(View view) {
    }

    private final void k(View view) {
    }

    private final void l(View view) {
    }

    private final void m(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        pde pdeVar;
        int iIndexOf;
        byte b = 0;
        atj atjVarK = null;
        boolean z = true;
        switch (this.a) {
            case 0:
                a71 a71Var = (a71) this.b;
                Context context = view.getContext();
                if (!a71Var.c) {
                    context.getApplicationContext().registerComponentCallbacks(a71Var.d);
                    a71Var.c = true;
                    break;
                }
                break;
            case 1:
                ql2 ql2Var = (ql2) this.b;
                ql2Var.g = true;
                p37.A(ql2Var.a, ql2Var, (dh4) null, new ol2(ql2Var, b));
                break;
            case 2:
                x03 x03Var = (x03) this.b;
                View view2 = x03Var.a;
                view2.getViewTreeObserver().addOnPreDrawListener(x03Var.f);
                n03 n03VarK = ujp.k(view2);
                x03Var.e = n03VarK;
                if (n03VarK != null && (pdeVar = n03VarK.b) != null) {
                    pdeVar.k(x03Var.g);
                    break;
                }
                break;
            case 4:
                x65 x65Var = (x65) this.b;
                x65Var.z = true;
                x65Var.e.F(x65Var);
                view.getViewTreeObserver().addOnWindowFocusChangeListener(x65Var);
                x65Var.m0();
                break;
            case 5:
                ((ConfigurationProvidingFrameLayout) this.b).e.f();
                break;
            case 7:
                wt7 wt7Var = (wt7) this.b;
                wt7Var.l = true;
                wt7Var.b();
                break;
            case 8:
                yv7 yv7Var = (yv7) this.b;
                hz4 hz4Var = yv7Var.c;
                ((bpd) hz4Var.g).b = yv7Var;
                b2l b2lVar = ((k6l) hz4Var.h).o;
                if (b2lVar != null) {
                    d7l d7lVar = (d7l) b2lVar;
                    String strG0 = d7lVar.g0();
                    if (wqm.r(strG0)) {
                        wqm.H(strG0);
                    }
                    knf knfVarH = d7lVar.e.h();
                    String strZ = knfVarH != null ? knfVarH.z() : BrowserUtils.getEditableString(d7lVar.j.getUrl());
                    if (strZ.length() >= 1000 && strZ.startsWith("data:") && (iIndexOf = strZ.indexOf(44) + 1) != 0 && strZ.length() - 1 > iIndexOf) {
                        strZ = strZ.substring(0, iIndexOf).concat("uri-content");
                    }
                    String url = d7lVar.j.getUrl();
                    d7lVar.h0();
                    d7lVar.i0();
                    GURL gurl = new GURL(url);
                    String strH0 = N.MKonq97J(gurl) ? (String) N.M6gdEujY(gurl) : d7lVar.h0();
                    zg zgVarB = BrowserUtils.b(d7lVar.j.getUrl());
                    boolean zIsOffline = UrlMangler.isOffline(url);
                    if (!wqm.A(url) && !wqm.w(url) && !zIsOffline && !UrlMangler.d(d7lVar.j.getUrl()) && !UrlMangler.c(url) && !UrlMangler.b(url) && !"jump".equals(UrlMangler.getAuthority(url)) && !url.startsWith("market://")) {
                        d7lVar.j.c0();
                    }
                    d7lVar.j.m();
                    d7lVar.n0();
                    boolean zO0 = d7lVar.o0();
                    if (!d7lVar.j.r() && (!d7lVar.j.c0() || d7lVar.o0())) {
                        z = false;
                    }
                    UrlFieldEditText urlFieldEditText = yv7Var.l;
                    if (zgVarB != null) {
                        sre sreVar = (sre) zgVarB.b;
                        urlFieldEditText.B(sreVar.a(), sreVar.a(), 2, 0);
                    } else {
                        urlFieldEditText.B(strZ, strH0, 2, 0);
                    }
                    if (z || zO0) {
                        yv7Var.l.a0 = null;
                    } else {
                        yv7Var.l.a0 = url;
                    }
                }
                yv7Var.o();
                view.requestFocus();
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                z28 z28Var = (z28) this.b;
                AccessibilityManager accessibilityManager = z28Var.q;
                if (z28Var.r != null && accessibilityManager != null && z28Var.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(z28Var.r);
                    break;
                }
                break;
            case 11:
                view.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) this.b);
                break;
            case 15:
                bpd bpdVar = (bpd) this.b;
                bpdVar.E().F((qxc) bpdVar.b);
                bpdVar.a0();
                break;
            case 16:
                lqe lqeVar = (lqe) this.b;
                c1f c1fVarC = c1f.c(lqeVar.a);
                lqeVar.q = c1fVarC;
                if (c1fVarC != null) {
                    c1fVarC.d(lqeVar.r);
                    break;
                }
                break;
            case 17:
                shf shfVar = (shf) this.b;
                ((pde) shfVar.a).k((d8d) shfVar.c);
                break;
            case 19:
                ((l8i) this.b).a();
                break;
            case SizeUtil.textSize0 /* 20 */:
                Object tag = view.getTag(2131364495);
                if (tag != null) {
                    atjVarK = (atj) tag;
                } else {
                    Object parent = view.getParent();
                    View view3 = parent instanceof View ? (View) parent : null;
                    if (view3 != null) {
                        atjVarK = xug.k(view3);
                    }
                }
                this.b = atjVarK;
                if (atjVarK != null && atjVarK.c.add(view)) {
                    atjVarK.b();
                    break;
                }
                break;
            case SizeUtil.textSize1 /* 22 */:
                ghf ghfVar = (ghf) this.b;
                c1f c1fVarC2 = c1f.c((View) ghfVar.b);
                ghfVar.d = c1fVarC2;
                if (c1fVarC2 != null) {
                    c1fVarC2.d((eck) ghfVar.c);
                    break;
                }
                break;
            case SizeUtil.textSize2 /* 24 */:
                h5k h5kVar = (h5k) this.b;
                ((TextView) h5kVar.b).getViewTreeObserver().addOnPreDrawListener((ml2) h5kVar.d);
                break;
            case 25:
                ((kze) this.b).r(ng.a);
                break;
            case 26:
                sw0 sw0Var = (sw0) this.b;
                View view4 = (View) sw0Var.m;
                xf8.F0(sw0Var, view4.getContext().getResources().getConfiguration());
                view4.getContext().registerComponentCallbacks(sw0Var.n);
                break;
            case 27:
                wjj wjjVar = (wjj) this.b;
                NestedScrollView nestedScrollView = (NestedScrollView) wjjVar.c;
                nestedScrollView.z((n9n) wjjVar.a);
                nestedScrollView.addOnLayoutChangeListener((ho3) wjjVar.b);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        pde pdeVar;
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        switch (this.a) {
            case 0:
                a71 a71Var = (a71) this.b;
                Context context = view.getContext();
                if (a71Var.c) {
                    context.getApplicationContext().unregisterComponentCallbacks(a71Var.d);
                    a71Var.c = false;
                    break;
                }
                break;
            case 1:
                ql2 ql2Var = (ql2) this.b;
                ValueAnimator valueAnimator = ql2Var.e;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    DecelerateInterpolator decelerateInterpolator = ql2.j;
                    bq1 bq1Var = ql2Var.a;
                    int i = ql2Var.f;
                    ViewGroup.LayoutParams layoutParams = bq1Var.getLayoutParams();
                    if (layoutParams != null && layoutParams.height != i) {
                        layoutParams.height = i;
                        bq1Var.setLayoutParams(layoutParams);
                        break;
                    }
                }
                break;
            case 2:
                x03 x03Var = (x03) this.b;
                x03Var.a.getViewTreeObserver().removeOnPreDrawListener(x03Var.f);
                n03 n03Var = x03Var.e;
                if (n03Var != null && (pdeVar = n03Var.b) != null) {
                    pdeVar.p(x03Var.g);
                }
                x03Var.e = null;
                break;
            case 3:
                nl4 nl4Var = (nl4) this.b;
                ViewTreeObserver viewTreeObserver = nl4Var.y;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        nl4Var.y = view.getViewTreeObserver();
                    }
                    nl4Var.y.removeGlobalOnLayoutListener(nl4Var.j);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 4:
                x65 x65Var = (x65) this.b;
                x65Var.z = false;
                view.removeOnAttachStateChangeListener(x65Var.p);
                view.getViewTreeObserver().removeOnWindowFocusChangeListener(x65Var);
                x65Var.e.H(x65Var);
                break;
            case 5:
                break;
            case 6:
                zk7 zk7Var = (zk7) this.b;
                zk7Var.c.setVisible(false, false);
                view.removeOnAttachStateChangeListener(this);
                zk7Var.e = null;
                break;
            case 7:
                break;
            case 8:
                ((bpd) ((yv7) this.b).c.g).b = null;
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ew7 ew7Var = (ew7) this.b;
                i06 i06Var = ew7.e;
                fz2 fz2Var = ew7Var.c;
                xtb[] xtbVarArr = ew7.f;
                xtb xtbVar = xtbVarArr[0];
                if (((Boolean) fz2Var.b).booleanValue()) {
                    ew7Var.a.removeCallbacks(ew7Var.b);
                    fz2Var.g(xtbVarArr[0], Boolean.FALSE);
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                z28 z28Var = (z28) this.b;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = z28Var.r;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = z28Var.q) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 11:
                view.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) this.b);
                break;
            case 12:
                HiddenFragmentContainer hiddenFragmentContainer = (HiddenFragmentContainer) this.b;
                int i2 = hiddenFragmentContainer.b;
                if (i2 > 0) {
                    hiddenFragmentContainer.b = i2 - 1;
                }
                view.removeOnAttachStateChangeListener(hiddenFragmentContainer.a);
                boolean z = hiddenFragmentContainer.b > 0;
                if (z != (hiddenFragmentContainer.getVisibility() == 0)) {
                    hiddenFragmentContainer.setVisibility(z ? 0 : 4);
                    break;
                }
                break;
            case 13:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.b;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener2 = hideBottomViewOnScrollBehavior.h;
                if (touchExplorationStateChangeListener2 != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener2);
                    hideBottomViewOnScrollBehavior.h = null;
                    break;
                }
                break;
            case 14:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.b;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener3 = hideViewOnScrollBehavior.c;
                if (touchExplorationStateChangeListener3 != null && (accessibilityManager3 = hideViewOnScrollBehavior.b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener3);
                    hideViewOnScrollBehavior.c = null;
                    break;
                }
                break;
            case 15:
                bpd bpdVar = (bpd) this.b;
                bpdVar.E().H((qxc) bpdVar.b);
                break;
            case 16:
                lqe lqeVar = (lqe) this.b;
                c1f c1fVar = lqeVar.q;
                if (c1fVar != null) {
                    c1fVar.g(lqeVar.r);
                }
                lqeVar.q = null;
                break;
            case 17:
                shf shfVar = (shf) this.b;
                ((pde) shfVar.a).p((d8d) shfVar.c);
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                rmh rmhVar = (rmh) this.b;
                p1j p1jVar = rmhVar.b;
                if (p1jVar != null) {
                    p1jVar.cancel(false);
                    rmhVar.b = null;
                    break;
                }
                break;
            case 19:
                l8i l8iVar = (l8i) this.b;
                l8iVar.e.S();
                ValueAnimator valueAnimator2 = (ValueAnimator) l8iVar.d.d;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    break;
                }
                break;
            case SizeUtil.textSize0 /* 20 */:
                atj atjVar = (atj) this.b;
                if (atjVar != null && atjVar.c.remove(view)) {
                    atjVar.b();
                    break;
                }
                break;
            case 21:
                l3k l3kVar = (l3k) this.b;
                ViewTreeObserver viewTreeObserver2 = l3kVar.p;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        l3kVar.p = view.getViewTreeObserver();
                    }
                    l3kVar.p.removeGlobalOnLayoutListener(l3kVar.j);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case SizeUtil.textSize1 /* 22 */:
                ghf ghfVar = (ghf) this.b;
                c1f c1fVar2 = (c1f) ghfVar.d;
                if (c1fVar2 != null) {
                    c1fVar2.g((eck) ghfVar.c);
                }
                ghfVar.d = null;
                break;
            case 23:
                ((hqk) this.b).H(null, false);
                break;
            case SizeUtil.textSize2 /* 24 */:
                h5k h5kVar = (h5k) this.b;
                ((TextView) h5kVar.b).getViewTreeObserver().removeOnPreDrawListener((ml2) h5kVar.d);
                break;
            case 25:
                ((kze) this.b).r(og.a);
                break;
            case 26:
                sw0 sw0Var = (sw0) this.b;
                ((View) sw0Var.m).getContext().unregisterComponentCallbacks(sw0Var.n);
                break;
            case 27:
                wjj wjjVar = (wjj) this.b;
                NestedScrollView nestedScrollView = (NestedScrollView) wjjVar.c;
                nestedScrollView.removeOnAttachStateChangeListener(this);
                nestedScrollView.z((n9n) null);
                nestedScrollView.removeOnLayoutChangeListener((ho3) wjjVar.b);
                break;
            case 28:
                q9n.u(((mrn) this.b).j);
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((d3k) this.b).k((CancellationException) null);
                break;
        }
    }
}
