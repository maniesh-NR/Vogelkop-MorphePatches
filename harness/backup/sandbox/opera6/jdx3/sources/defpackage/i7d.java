package defpackage;

import android.R;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.jensdriller.libs.undobar.MaxWidthLinearLayout;
import com.opera.android.BrowserActivity;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.CircleImageView;
import com.opera.android.custom_views.FadingNestedScrollView;
import com.opera.android.custom_views.FadingTextView;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.sheet.OperaBottomSheetBehavior;
import com.opera.android.sheet.VelocityTrackingCoordinatorLayout;
import com.opera.android.ui.catalog.widget.OperaChip;
import com.opera.android.widget.MenuSettingsListItem;

/* loaded from: classes.dex */
public final class i7d extends k24 implements jbl {
    public final h73 f;
    public boolean g;
    public final boolean h;
    public boolean i;
    public boolean j;
    public vl6 k;
    public pt1 l;
    public h7d m;
    public qm9 n;
    public y53 o;
    public nga p;
    public final v6d q;

    public i7d(h73 h73Var, boolean z, boolean z2) {
        this.f = h73Var;
        this.g = z;
        this.h = z2;
        this.q = new v6d(h73Var.b);
    }

    public static boolean s0(Configuration configuration) {
        return configuration.orientation == 2 || configuration.screenWidthDp >= 600;
    }

    @Override // defpackage.k24, defpackage.l24
    public final void L() {
        this.q.b(t6d.a);
        super.L();
    }

    @Override // defpackage.k24, defpackage.l24
    public final void l() {
        super.l();
        if (isRemoving()) {
            return;
        }
        this.q.b(t6d.b);
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        o0();
    }

    @Override // defpackage.k24
    public final void m0() {
        o0();
    }

    @Override // defpackage.k24
    public final View n0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131559003, viewGroup, false);
        int i = 2131362417;
        if (((MaxWidthLinearLayout) w1h.j(2131362417, viewInflate)) != null) {
            i = 2131363376;
            View viewJ = w1h.j(2131363376, viewInflate);
            if (viewJ != null) {
                int i2 = 2131363092;
                View viewJ2 = w1h.j(2131363092, viewJ);
                if (viewJ2 != null) {
                    int i3 = 2131362097;
                    View viewJ3 = w1h.j(2131362097, viewJ2);
                    if (viewJ3 != null) {
                        CircleImageView circleImageView = (CircleImageView) w1h.j(2131362100, viewJ3);
                        if (circleImageView == null) {
                            t3p.q("Missing required view with ID: ".concat(viewJ3.getResources().getResourceName(2131362100)));
                            return null;
                        }
                        g7d g7dVar = new g7d((FrameLayout) viewJ3, circleImageView);
                        i3 = 2131362326;
                        if (w1h.j(2131362326, viewJ2) != null) {
                            i3 = 2131362545;
                            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131362545, viewJ2);
                            if (stylingTextView != null) {
                                i3 = 2131362759;
                                StylingImageButton stylingImageButton = (StylingImageButton) w1h.j(2131362759, viewJ2);
                                if (stylingImageButton != null) {
                                    i3 = 2131362760;
                                    CircularProgressIndicator circularProgressIndicatorJ = w1h.j(2131362760, viewJ2);
                                    if (circularProgressIndicatorJ != null) {
                                        i3 = 2131364300;
                                        StylingImageButton stylingImageButton2 = (StylingImageButton) w1h.j(2131364300, viewJ2);
                                        if (stylingImageButton2 != null) {
                                            i3 = 2131364633;
                                            OperaChip operaChip = (OperaChip) w1h.j(2131364633, viewJ2);
                                            if (operaChip != null) {
                                                i3 = 2131364974;
                                                CardView cardViewJ = w1h.j(2131364974, viewJ2);
                                                if (cardViewJ != null) {
                                                    i3 = 2131364500;
                                                    FadingTextView fadingTextView = (FadingTextView) w1h.j(2131364500, viewJ2);
                                                    if (fadingTextView != null) {
                                                        i3 = 2131365047;
                                                        OperaChip operaChip2 = (OperaChip) w1h.j(2131365047, viewJ2);
                                                        if (operaChip2 != null) {
                                                            rf2 rf2Var = new rf2((LinearLayout) viewJ2, g7dVar, stylingTextView, stylingImageButton, circularProgressIndicatorJ, stylingImageButton2, operaChip, cardViewJ, fadingTextView, operaChip2);
                                                            i2 = 2131364244;
                                                            View viewJ4 = w1h.j(2131364244, viewJ);
                                                            if (viewJ4 != null) {
                                                                int i4 = 2131363926;
                                                                ViewStub viewStub = (ViewStub) w1h.j(2131363926, viewJ4);
                                                                if (viewStub != null) {
                                                                    i4 = 2131363928;
                                                                    ViewStub viewStub2 = (ViewStub) w1h.j(2131363928, viewJ4);
                                                                    if (viewStub2 != null) {
                                                                        i4 = 2131364256;
                                                                        MenuSettingsListItem menuSettingsListItemJ = w1h.j(2131364256, viewJ4);
                                                                        if (menuSettingsListItemJ != null) {
                                                                            i4 = 2131364262;
                                                                            MenuSettingsListItem menuSettingsListItemJ2 = w1h.j(2131364262, viewJ4);
                                                                            if (menuSettingsListItemJ2 != null) {
                                                                                i4 = 2131364269;
                                                                                MenuSettingsListItem menuSettingsListItemJ3 = w1h.j(2131364269, viewJ4);
                                                                                if (menuSettingsListItemJ3 != null) {
                                                                                    i4 = 2131364325;
                                                                                    MenuSettingsListItem menuSettingsListItemJ4 = w1h.j(2131364325, viewJ4);
                                                                                    if (menuSettingsListItemJ4 != null) {
                                                                                        i4 = 2131364354;
                                                                                        MenuSettingsListItem menuSettingsListItemJ5 = w1h.j(2131364354, viewJ4);
                                                                                        if (menuSettingsListItemJ5 != null) {
                                                                                            ei eiVar = new ei((ViewGroup) viewJ4, (View) viewStub, (View) viewStub2, (View) menuSettingsListItemJ, (View) menuSettingsListItemJ2, (View) menuSettingsListItemJ3, (View) menuSettingsListItemJ4, (View) menuSettingsListItemJ5, (byte) 5);
                                                                                            i2 = 2131364753;
                                                                                            View viewJ5 = w1h.j(2131364753, viewJ);
                                                                                            if (viewJ5 != null) {
                                                                                                RecyclerView recyclerViewJ = w1h.j(2131364747, viewJ5);
                                                                                                if (recyclerViewJ == null) {
                                                                                                    t3p.q("Missing required view with ID: ".concat(viewJ5.getResources().getResourceName(2131364747)));
                                                                                                    return null;
                                                                                                }
                                                                                                kf kfVar = new kf((byte) 18, viewJ5, (Object) recyclerViewJ);
                                                                                                View viewJ6 = w1h.j(2131364787, viewJ);
                                                                                                if (viewJ6 != null) {
                                                                                                    or2 or2Var = new or2(viewJ, (Object) rf2Var, (Object) eiVar, (Object) kfVar, (Object) or2.c(viewJ6), (byte) 15);
                                                                                                    i = 2131364421;
                                                                                                    FadingNestedScrollView fadingNestedScrollView = (FadingNestedScrollView) w1h.j(2131364421, viewInflate);
                                                                                                    if (fadingNestedScrollView != null) {
                                                                                                        i = 2131364424;
                                                                                                        CoordinatorLayout coordinatorLayout = (VelocityTrackingCoordinatorLayout) w1h.j(2131364424, viewInflate);
                                                                                                        if (coordinatorLayout != null) {
                                                                                                            i = 2131364571;
                                                                                                            StatusBarDrawingFrameLayout statusBarDrawingFrameLayout = (StatusBarDrawingFrameLayout) w1h.j(2131364571, viewInflate);
                                                                                                            if (statusBarDrawingFrameLayout != null) {
                                                                                                                i = 2131364813;
                                                                                                                View viewJ7 = w1h.j(2131364813, viewInflate);
                                                                                                                if (viewJ7 != null) {
                                                                                                                    this.l = new pt1((FrameLayout) viewInflate, (Object) or2Var, (Object) fadingNestedScrollView, (ViewGroup) coordinatorLayout, (View) statusBarDrawingFrameLayout, viewJ7, (byte) 8);
                                                                                                                    tcc lifecycle = getViewLifecycleOwner().getLifecycle();
                                                                                                                    NestedScrollView nestedScrollView = (FadingNestedScrollView) this.l.e;
                                                                                                                    OperaBottomSheetBehavior operaBottomSheetBehaviorC = OperaBottomSheetBehavior.C(nestedScrollView);
                                                                                                                    x79 x79Var = new x79();
                                                                                                                    x79Var.a = new can();
                                                                                                                    byte b = 1;
                                                                                                                    x79Var.c = new za3(x79Var, b);
                                                                                                                    x79Var.d = new r42(x79Var, b);
                                                                                                                    byte b2 = 9;
                                                                                                                    x79Var.e = new z22(x79Var, b2);
                                                                                                                    x79Var.b = operaBottomSheetBehaviorC;
                                                                                                                    q9n.g(nestedScrollView, new tu4(x79Var, (View) nestedScrollView));
                                                                                                                    q9n.d(new bm8(x79Var, (byte) 23), nestedScrollView);
                                                                                                                    y53 y53Var = new y53(this, this.f, or2Var, fadingNestedScrollView, lifecycle, x79Var);
                                                                                                                    lifecycle.a(y53Var);
                                                                                                                    this.o = y53Var;
                                                                                                                    ((FrameLayout) this.l.b).setOnClickListener(new sma(this, (byte) 21));
                                                                                                                    ((FrameLayout) this.l.b).setBackgroundResource(s0(getResources().getConfiguration()) ? R.color.transparent : 2131099819);
                                                                                                                    this.f.w.j(getViewLifecycleOwner(), new ks6(this, (byte) 29));
                                                                                                                    LinearLayout linearLayout = (LinearLayout) ((rf2) ((or2) this.l.d).d).d;
                                                                                                                    lzb lzbVar = new lzb(this, b2);
                                                                                                                    q9n.e(linearLayout, lzbVar);
                                                                                                                    lzbVar.a(linearLayout);
                                                                                                                    z4o.r0((StatusBarDrawingFrameLayout) this.l.c, (dxh) null);
                                                                                                                    z4o.q0((FadingNestedScrollView) this.l.e);
                                                                                                                    q0();
                                                                                                                    this.n = new qm9((FadingNestedScrollView) this.l.e);
                                                                                                                    this.b = new qfb((Object) this, (byte) 6);
                                                                                                                    FrameLayout frameLayout = (FrameLayout) this.l.b;
                                                                                                                    if (xug.k(frameLayout) == null) {
                                                                                                                        frameLayout.setTag(2131364495, new atj(frameLayout));
                                                                                                                    }
                                                                                                                    return (FrameLayout) this.l.b;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    i2 = 2131364787;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                t3p.q("Missing required view with ID: ".concat(viewJ4.getResources().getResourceName(i4)));
                                                                return null;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    t3p.q("Missing required view with ID: ".concat(viewJ2.getResources().getResourceName(i3)));
                    return null;
                }
                t3p.q("Missing required view with ID: ".concat(viewJ.getResources().getResourceName(i2)));
                return null;
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public final void o0() {
        vl6 vl6Var = this.k;
        if (vl6Var == null || !vl6Var.S()) {
            p0();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        gtj gtjVar;
        super/*androidx.fragment.app.Fragment*/.onConfigurationChanged(configuration);
        ((LinearLayout) ((or2) this.l.d).c).post(new q53(this, (byte) 1));
        h7d h7dVar = this.m;
        if (h7dVar != null) {
            if (h7dVar.e) {
                int i = ((OperaBottomSheetBehavior) h7dVar.a.b).q;
                byte b = 4;
                if (i != 1 && i != 2 && i == 3) {
                    b = 3;
                }
                h7dVar.f = b;
            }
            h7dVar.a(s0(configuration));
            yzb yzbVar = h7dVar.d;
            y0a y0aVar = new y0a(h7dVar, (byte) 19);
            i7d i7dVar = (i7d) yzbVar.b;
            q9n.A((LinearLayout) ((or2) i7dVar.l.d).c, new zr9((Object) i7dVar, (Object) y0aVar, (byte) 22));
        }
        qm9 qm9Var = this.n;
        if (qm9Var != null && (gtjVar = qm9Var.d) != null) {
            gtjVar.k();
        }
        y53 y53Var = this.o;
        if (y53Var != null) {
            gtj gtjVar2 = y53Var.e.d;
            if (gtjVar2 != null) {
                gtjVar2.k();
            }
            zol zolVar = y53Var.k;
            boolean z = configuration.screenWidthDp < 360;
            if (z == zolVar.f) {
                return;
            }
            zolVar.f = z;
            zolVar.h();
            ((RecyclerView) ((kf) y53Var.c.f).c).invalidate();
        }
    }

    @Override // defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        this.b = null;
        this.n = null;
        this.o = null;
        this.l = null;
        this.p = null;
        this.k = null;
        this.m = null;
        this.j = true;
        this.q.b(t6d.a);
    }

    public final void onResume() {
        super/*androidx.fragment.app.Fragment*/.onResume();
        if (this.i) {
            this.i = false;
            vml.c(new q53(this, (byte) 2));
        }
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        h7d h7dVar;
        super.onViewCreated(view, bundle);
        ((FrameLayout) this.l.b).getBackground().mutate();
        this.k = new vl6((NestedScrollView) this.l.e, 4, (nj8) new c5o(this, new m9f((FadingNestedScrollView) this.l.e, getResources().getDimensionPixelSize(2131165347)), false));
        getViewLifecycleOwner().getLifecycle().a(this.k);
        this.m = new h7d(this.k, this.l, getResources(), new yzb((Object) this, (byte) 13));
        if (this.j) {
            return;
        }
        ((FrameLayout) this.l.b).getBackground().setAlpha(0);
        this.k.S();
        if (this.h || (h7dVar = this.m) == null) {
            return;
        }
        q9n.A((LinearLayout) ((or2) this.l.d).c, new zr9((Object) this, (Object) new y0a(h7dVar, (byte) 19), (byte) 22));
    }

    public final void p0() {
        if (this.i) {
            return;
        }
        this.i = true;
        if (isResumed()) {
            g0();
        }
    }

    public final void q0() {
        ((StylingImageButton) ((rf2) ((or2) this.l.d).d).c).setVisibility(this.g ? 8 : 0);
        ((rf2) ((or2) this.l.d).d).f.setVisibility(this.g ? 0 : 8);
    }

    public final void r0() {
        if (this.l == null) {
            return;
        }
        h73 h73Var = this.f;
        boolean asBoolean = h73Var.s.getAsBoolean();
        pt1 pt1Var = this.l;
        if (asBoolean) {
            ((FrameLayout) pt1Var.b).setPadding(0, 0, 0, 0);
            StatusBarDrawingFrameLayout statusBarDrawingFrameLayout = (StatusBarDrawingFrameLayout) this.l.c;
            this.p = new nga(statusBarDrawingFrameLayout, f03.t(2130969325, statusBarDrawingFrameLayout.getContext(), 2131101243));
        } else {
            ((FrameLayout) pt1Var.b).setPadding(0, ((avl) h73Var.w.g()).c, 0, 0);
            ((StatusBarDrawingFrameLayout) this.l.c).e(0);
            this.p = null;
        }
        pt3 pt3Var = h73Var.t;
        y0a y0aVar = new y0a(this, (byte) 18);
        BrowserActivity browserActivity = pt3Var.b;
        int i = BrowserActivity.E1;
        ImageView imageViewU0 = browserActivity.u0();
        byte b = 1;
        if (!imageViewU0.isLaidOut() || imageViewU0.isLayoutRequested()) {
            imageViewU0.addOnLayoutChangeListener(new kq2(y0aVar, browserActivity, b));
        } else {
            y0aVar.run(Boolean.valueOf(q9n.t(imageViewU0).centerX() < browserActivity.getResources().getDisplayMetrics().widthPixels / 2));
        }
    }

    @Override // defpackage.jbl
    public final String y() {
        return "MainMenuFragment";
    }
}
