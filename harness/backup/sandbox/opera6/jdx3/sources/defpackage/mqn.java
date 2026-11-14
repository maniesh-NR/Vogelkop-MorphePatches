package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.opera.android.Lazy;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.LayoutDirectionToolbar;
import com.opera.android.sheet.OperaBottomSheetBehavior;
import com.opera.android.sheet.VelocityTrackingCoordinatorLayout;
import com.opera.android.webaiassistant.WebAiAssistantLayoutSwitcher;
import com.opera.android.webaiassistant.WebAiAssistantSheetContentWrapper;
import com.opera.android.webcore.FastResizeWebViewContainer;
import com.opera.android.widget.MeasurableHeightScrollView;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.ViewAndroidDelegate;

/* loaded from: classes.dex */
public final class mqn extends lqn {
    public final nw3 R;
    public y83 S;
    public vl6 T;
    public final kze U;

    /* JADX WARN: Illegal instructions before constructor call */
    public mqn(ru9 ru9Var, pjn pjnVar, Lazy lazy, orm ormVar, hq3 hq3Var, vsn vsnVar, wll wllVar, qwe qweVar, d7h d7hVar, sw3 sw3Var, Lazy lazy2, nw3 nw3Var) {
        u7k u7kVarJ = u7k.j(2131559566);
        ((itl) u7kVarJ.a).h = false;
        super(u7kVarJ, ru9Var, pjnVar, lazy, ormVar, hq3Var, vsnVar, wllVar, qweVar, d7hVar, sw3Var, lazy2);
        this.R = nw3Var;
        this.U = new kze(Boolean.FALSE);
    }

    @Override // defpackage.lqn, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) throws Resources.NotFoundException {
        super.onViewCreated(view, bundle);
        q9n.f(this.l, new e73(new nga(this.k, 0), this, (byte) 16));
        this.k.setBackground(new ColorDrawable(this.k.getContext().getColor(2131099819)));
        this.k.getBackground().setAlpha(0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165347);
        y83 y83Var = this.S;
        if (y83Var == null) {
            y83Var = null;
        }
        ((FastResizeWebViewContainer) y83Var.h).c(this.U);
        y83 y83Var2 = this.S;
        if (y83Var2 == null) {
            y83Var2 = null;
        }
        OperaBottomSheetBehavior.C((MeasurableHeightScrollView) y83Var2.f).x(new r42(this, (byte) 4));
        y83 y83Var3 = this.S;
        if (y83Var3 == null) {
            y83Var3 = null;
        }
        new m9f((MeasurableHeightScrollView) y83Var3.f, dimensionPixelSize).v(1.0f);
        y83 y83Var4 = this.S;
        if (y83Var4 == null) {
            y83Var4 = null;
        }
        this.T = new vl6((MeasurableHeightScrollView) y83Var4.f, 6, new bxk((Object) this, (byte) 12));
        tcc lifecycle = getViewLifecycleOwner().getLifecycle();
        vl6 vl6Var = this.T;
        if (vl6Var == null) {
            vl6Var = null;
        }
        lifecycle.a(vl6Var);
        s6h s6hVar = new s6h((byte) 12);
        y83 y83Var5 = this.S;
        if (y83Var5 == null) {
            y83Var5 = null;
        }
        byte b = 9;
        ((LinearLayout) y83Var5.b).setOnClickListener(new obn(s6hVar, this, b));
        y83 y83Var6 = this.S;
        if (y83Var6 == null) {
            y83Var6 = null;
        }
        ((LayoutDirectionToolbar) y83Var6.g).setOnTouchListener(new m42(this, b));
        y83 y83Var7 = this.S;
        ((MeasurableHeightScrollView) (y83Var7 == null ? null : y83Var7).f).L = false;
        q9n.d(new r2n((Object) this, (byte) 17), (MeasurableHeightScrollView) (y83Var7 != null ? y83Var7 : null).f);
    }

    @Override // defpackage.ltl
    public final int t0(Context context) {
        return 0;
    }

    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        View viewFindViewById = statusBarDrawingFrameLayout.findViewById(2131363024);
        int i = 2131362409;
        WebAiAssistantSheetContentWrapper webAiAssistantSheetContentWrapper = (WebAiAssistantSheetContentWrapper) w1h.j(2131362409, viewFindViewById);
        if (webAiAssistantSheetContentWrapper != null) {
            i = 2131363011;
            View viewJ = w1h.j(2131363011, viewFindViewById);
            if (viewJ != null) {
                rvg rvgVarA = rvg.a(viewJ);
                LinearLayout linearLayout = (LinearLayout) viewFindViewById;
                i = 2131363313;
                WebAiAssistantLayoutSwitcher webAiAssistantLayoutSwitcher = (WebAiAssistantLayoutSwitcher) w1h.j(2131363313, viewFindViewById);
                if (webAiAssistantLayoutSwitcher != null) {
                    i = 2131364421;
                    NestedScrollView nestedScrollView = (MeasurableHeightScrollView) w1h.j(2131364421, viewFindViewById);
                    if (nestedScrollView != null) {
                        i = 2131364424;
                        if (((VelocityTrackingCoordinatorLayout) w1h.j(2131364424, viewFindViewById)) != null) {
                            i = 2131364794;
                            LayoutDirectionToolbar layoutDirectionToolbarJ = w1h.j(2131364794, viewFindViewById);
                            if (layoutDirectionToolbarJ != null) {
                                i = 2131365082;
                                FastResizeWebViewContainer fastResizeWebViewContainer = (FastResizeWebViewContainer) w1h.j(2131365082, viewFindViewById);
                                if (fastResizeWebViewContainer != null) {
                                    this.S = new y83((ViewGroup) linearLayout, (Object) webAiAssistantSheetContentWrapper, (Object) rvgVarA, (View) webAiAssistantLayoutSwitcher, (View) nestedScrollView, (Object) layoutDirectionToolbarJ, (View) fastResizeWebViewContainer, (byte) 13);
                                    y83 y83Var = this.S;
                                    if (y83Var == null) {
                                        y83Var = null;
                                    }
                                    mrn mrnVar = new mrn(this.t, (rvg) y83Var.d, this.P, this.Q, this.R);
                                    y83 y83Var2 = this.S;
                                    if (y83Var2 == null) {
                                        y83Var2 = null;
                                    }
                                    WebAiAssistantLayoutSwitcher webAiAssistantLayoutSwitcher2 = (WebAiAssistantLayoutSwitcher) y83Var2.e;
                                    hq3 hq3Var = this.v;
                                    WebContents webContentsE = hq3Var.b.e();
                                    this.J = webContentsE;
                                    p8f p8fVarA = this.x.a(webContentsE, f03.t(2130969325, new s8n(requireContext(), 2130969943), 2131103876));
                                    this.I = p8fVarA;
                                    ((FastResizeWebViewContainer) webAiAssistantLayoutSwitcher2.getChildAt(0)).a((zll) p8fVarA.b, hq3Var.b, this.y);
                                    ViewAndroidDelegate viewAndroidDelegateJ0 = webContentsE.J0();
                                    if (viewAndroidDelegateJ0 != null) {
                                        new ga7(viewAndroidDelegateJ0.b);
                                    }
                                    ysj ysjVar = (ysj) this.A.get();
                                    View view = mrnVar.m;
                                    this.F = new mlj(ysjVar, view);
                                    qm9 qm9Var = this.n;
                                    ndc viewLifecycleOwner = getViewLifecycleOwner();
                                    qm9Var.g = view;
                                    viewLifecycleOwner.getLifecycle().a(new d62(qm9Var, view));
                                    qyj qyjVarF = this.w.c.f();
                                    tcc lifecycle = getViewLifecycleOwner().getLifecycle();
                                    qyjVarF.getClass();
                                    lifecycle.a(new ob((Object) qyjVarF, (byte) 16));
                                    Context contextRequireContext = requireContext();
                                    ndc viewLifecycleOwner2 = getViewLifecycleOwner();
                                    y1n y1nVar = new y1n((Object) this, (byte) 26);
                                    nqi nqiVar = new nqi((Object) this, (byte) 18);
                                    mlj mljVar = this.F;
                                    mlj mljVar2 = mljVar == null ? null : mljVar;
                                    iqn iqnVar = new iqn(this, mrnVar);
                                    d7h d7hVar = this.z;
                                    hq3 hq3Var2 = (hq3) d7hVar.b;
                                    srn srnVar = (srn) d7hVar.c;
                                    viewLifecycleOwner2.getLifecycle().a(new d62(hq3Var2, new gq3(contextRequireContext, viewLifecycleOwner2, srnVar.e, srnVar.d, y1nVar, new qrn(srnVar, (byte) 1), mljVar2, new ilm(srnVar, (byte) 16), nqiVar, srnVar.b, hq3Var2.c, (k42) srnVar.n.get(), iqnVar, (gjm) srnVar.o.get()), (byte) 1));
                                    this.C = webAiAssistantSheetContentWrapper;
                                    this.G = mrnVar;
                                    this.D = webAiAssistantLayoutSwitcher2;
                                    final byte b = 0;
                                    webAiAssistantLayoutSwitcher2.c().c.setOnClickListener(new View.OnClickListener(this) { // from class: fqn
                                        public final /* synthetic */ mqn b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            byte b2 = b;
                                            mqn mqnVar = this.b;
                                            switch (b2) {
                                                case 0:
                                                    vl6 vl6Var = mqnVar.T;
                                                    if (vl6Var == null) {
                                                        vl6Var = null;
                                                    }
                                                    vl6Var.S();
                                                    mqnVar.w.h.run();
                                                    break;
                                                default:
                                                    mqnVar.w.getClass();
                                                    break;
                                            }
                                        }
                                    });
                                    final byte b2 = 1;
                                    webAiAssistantLayoutSwitcher2.a().c.setOnClickListener(new View.OnClickListener(this) { // from class: fqn
                                        public final /* synthetic */ mqn b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            byte b22 = b2;
                                            mqn mqnVar = this.b;
                                            switch (b22) {
                                                case 0:
                                                    vl6 vl6Var = mqnVar.T;
                                                    if (vl6Var == null) {
                                                        vl6Var = null;
                                                    }
                                                    vl6Var.S();
                                                    mqnVar.w.h.run();
                                                    break;
                                                default:
                                                    mqnVar.w.getClass();
                                                    break;
                                            }
                                        }
                                    });
                                    webAiAssistantSheetContentWrapper.F(this.H);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i)));
    }
}
