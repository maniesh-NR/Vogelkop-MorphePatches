package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.ExactHeightRecyclerView;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.sheet.OperaBottomSheetBehavior;
import com.opera.android.sheet.VelocityTrackingCoordinatorLayout;
import com.opera.android.tabui2.recently_closed_tabs.RecentlyClosedTabsSheetContentWrapper;
import com.opera.android.tabui2.recently_closed_tabs.RecentlyClosedTabsSheetLayoutSwitcher;
import com.opera.android.widget.MeasurableHeightScrollView;

/* loaded from: classes.dex */
public final class knh extends ltl {
    public static final ixh I = new ixh(40.0f);
    public static final ixh J = new ixh(20.0f);
    public y83 A;
    public vl6 B;
    public gnh C;
    public ghf D;
    public flb E;
    public umh F;
    public boolean G;
    public boolean H;
    public final fnh r;
    public final u4l s;
    public final yqa t;
    public final ysj u;
    public final inh v;
    public final ua7 w;
    public final pde x;
    public final ro9 y;
    public final yc3 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public knh(gjm gjmVar, fnh fnhVar, u4l u4lVar, yqa yqaVar, ysj ysjVar, inh inhVar) {
        itl itlVar = (itl) u7k.j(2131559265).a;
        itlVar.h = false;
        itlVar.f = true;
        super(itlVar);
        this.r = fnhVar;
        this.s = u4lVar;
        this.t = yqaVar;
        this.u = ysjVar;
        this.v = inhVar;
        this.w = new ua7((Fragment) this, gjmVar);
        this.x = new pde(og.a);
        this.y = new ro9((byte) 28);
        this.z = new yc3(this, (byte) 4);
    }

    public final void G0(String str, boolean z) {
        if (z || !this.v.g()) {
            y83 y83Var = this.A;
            if (y83Var == null) {
                y83Var = null;
            }
            Object parent = ((LinearLayout) y83Var.b).getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                gtj gtjVarE = gtj.e(view, str, 2500);
                gtjVarE.b(view);
                gtjVarE.j();
            } else {
                nm2 nm2Var = new nm2(str, (byte) 1);
                ysj ysjVar = this.u;
                ysjVar.getClass();
                ysjVar.b(nm2Var, ijm.b);
            }
        }
    }

    public final void H0(OperaBottomSheetBehavior operaBottomSheetBehavior) {
        y83 y83Var = this.A;
        if (y83Var == null) {
            y83Var = null;
        }
        NestedScrollView nestedScrollView = (MeasurableHeightScrollView) y83Var.g;
        if (!nestedScrollView.isLaidOut() || nestedScrollView.isLayoutRequested()) {
            nestedScrollView.addOnLayoutChangeListener(new kq2(operaBottomSheetBehavior, this, (byte) 2));
            return;
        }
        y83 y83Var2 = this.A;
        if (y83Var2 == null) {
            y83Var2 = null;
        }
        Context context = ((MeasurableHeightScrollView) y83Var2.g).getContext();
        y83 y83Var3 = this.A;
        int height = ((MeasurableHeightScrollView) (y83Var3 != null ? y83Var3 : null).g).getHeight();
        double dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167736);
        double d = 6.75d * dimensionPixelSize;
        if (height > 0) {
            while (d / height > 0.85d && d > (r0 << 1)) {
                d -= dimensionPixelSize;
            }
        }
        operaBottomSheetBehavior.H((int) d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I0() {
        /*
            r3 = this;
            boolean r0 = r3.H
            r1 = 0
            if (r0 == 0) goto L17
            y83 r0 = r3.A
            if (r0 != 0) goto La
            r0 = r1
        La:
            java.lang.Object r0 = r0.f
            com.opera.android.custom_views.ExactHeightRecyclerView r0 = (com.opera.android.custom_views.ExactHeightRecyclerView) r0
            r2 = -1
            boolean r0 = r0.canScrollVertically(r2)
            if (r0 != 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            y83 r2 = r3.A
            if (r2 != 0) goto L1d
            r2 = r1
        L1d:
            java.lang.Object r2 = r2.f
            com.opera.android.custom_views.ExactHeightRecyclerView r2 = (com.opera.android.custom_views.ExactHeightRecyclerView) r2
            s14 r2 = r2.Y()
            boolean r2 = r2.b
            if (r0 == r2) goto L38
            y83 r2 = r3.A
            if (r2 == 0) goto L2e
            r1 = r2
        L2e:
            java.lang.Object r1 = r1.f
            com.opera.android.custom_views.ExactHeightRecyclerView r1 = (com.opera.android.custom_views.ExactHeightRecyclerView) r1
            r1.setNestedScrollingEnabled(r0)
            r3.J0()
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.knh.I0():void");
    }

    public final void J0() {
        y83 y83Var = this.A;
        MeasurableHeightScrollView measurableHeightScrollView = (MeasurableHeightScrollView) (y83Var == null ? null : y83Var).g;
        if (y83Var == null) {
            y83Var = null;
        }
        measurableHeightScrollView.L = ((ExactHeightRecyclerView) y83Var.f).Y().b || this.G || !this.H;
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        vl6 vl6Var = this.B;
        if (vl6Var == null) {
            vl6Var = null;
        }
        vl6Var.S();
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        super.onDestroy();
        y83 y83Var = this.A;
        if (y83Var == null) {
            y83Var = null;
        }
        ((ExactHeightRecyclerView) y83Var.f).t0(this.z);
    }

    public final void onStart() {
        super.onStart();
        xf8.F0(this.x, ng.a);
    }

    public final void onStop() {
        super.onStop();
        xf8.F0(this.x, og.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.view.View, androidx.recyclerview.widget.RecyclerView, com.opera.android.custom_views.ExactHeightRecyclerView, com.opera.android.custom_views.RecyclerViewForScreenshot] */
    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) throws Resources.NotFoundException {
        super.onViewCreated(view, bundle);
        view.postOnAnimation(new ca(view, (byte) 5));
        q9n.f(this.l, new e73(new nga(this.k, 0), this, (byte) 11));
        this.k.setBackground(new ColorDrawable(this.k.getContext().getColor(2131099819)));
        this.k.getBackground().setAlpha(0);
        y83 y83Var = this.A;
        if (y83Var == null) {
            y83Var = null;
        }
        OperaBottomSheetBehavior operaBottomSheetBehaviorC = OperaBottomSheetBehavior.C((MeasurableHeightScrollView) y83Var.g);
        operaBottomSheetBehaviorC.x(new r42(this, (byte) 3));
        H0(operaBottomSheetBehaviorC);
        y83 y83Var2 = this.A;
        if (y83Var2 == null) {
            y83Var2 = null;
        }
        ((MeasurableHeightScrollView) y83Var2.g).addOnLayoutChangeListener(new vs7(this, operaBottomSheetBehaviorC, (byte) 1));
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165347);
        y83 y83Var3 = this.A;
        if (y83Var3 == null) {
            y83Var3 = null;
        }
        new m9f((MeasurableHeightScrollView) y83Var3.g, dimensionPixelSize).v(1.0f);
        y83 y83Var4 = this.A;
        if (y83Var4 == null) {
            y83Var4 = null;
        }
        byte b = 6;
        this.B = new vl6((MeasurableHeightScrollView) y83Var4.g, 6, new lld((Object) this, (byte) 16));
        tcc lifecycle = getViewLifecycleOwner().getLifecycle();
        vl6 vl6Var = this.B;
        if (vl6Var == null) {
            vl6Var = null;
        }
        lifecycle.a(vl6Var);
        Context context = view.getContext();
        b2l b2lVarJ = this.v.j();
        pde pdeVar = this.x;
        gnh gnhVar = new gnh(pdeVar, context, this.r, this.s, b2lVarJ, this);
        this.C = gnhVar;
        this.D = new ghf(gnhVar);
        Context context2 = view.getContext();
        ghf ghfVar = this.D;
        if (ghfVar == null) {
            ghfVar = null;
        }
        this.E = new flb(new nvk(context2, ghfVar));
        jsc jscVar = jsc.d;
        uxj uxjVar = new uxj(new ixh(0.0f), 59);
        qxj qxjVar = new qxj(new lxh(2131232112), null, null, 254);
        Context context3 = view.getContext();
        ixh ixhVar = I;
        ikc ikcVar = new ikc(new cyj(jscVar, J, null, new rxj(ixhVar.k(context3), ixhVar.k(view.getContext())), new zxj(new ayj(ixhVar, ixhVar, new ixh(0.0f), umj.c, true)), uxjVar, qxjVar, null, 132));
        gnh gnhVar2 = this.C;
        gnh gnhVar3 = gnhVar2 == null ? null : gnhVar2;
        ghf ghfVar2 = this.D;
        ghf ghfVar3 = ghfVar2 == null ? null : ghfVar2;
        yqa yqaVar = this.t;
        ro9 ro9Var = this.y;
        this.F = new umh(pdeVar, gnhVar3, ikcVar, yqaVar, ghfVar3, ro9Var);
        y83 y83Var5 = this.A;
        if (y83Var5 == null) {
            y83Var5 = null;
        }
        ?? r2 = (ExactHeightRecyclerView) y83Var5.f;
        r2.D0(ro9Var);
        r2.m(new ij8(r2.getContext()));
        r2.B0(new k56());
        r2.getContext();
        r2.C0(new LinearLayoutManager());
        umh umhVar = this.F;
        if (umhVar == null) {
            umhVar = null;
        }
        r2.y0(umhVar);
        flb flbVar = this.E;
        flb flbVar2 = flbVar;
        if (flbVar == null) {
            flbVar2 = 0;
        }
        flbVar2.e(r2);
        s6h s6hVar = new s6h((byte) 12);
        y83 y83Var6 = this.A;
        if (y83Var6 == null) {
            y83Var6 = null;
        }
        ((LinearLayout) y83Var6.b).setOnClickListener(new j5g(s6hVar, this, b));
        y83 y83Var7 = this.A;
        if (y83Var7 == null) {
            y83Var7 = null;
        }
        ((Toolbar) y83Var7.h).setOnTouchListener(new m42(this, (byte) 7));
        y83 y83Var8 = this.A;
        if (y83Var8 == null) {
            y83Var8 = null;
        }
        ((StylingImageButton) ((kf) y83Var8.d).c).setOnClickListener(new zvd(this, (byte) 29));
        J0();
        I0();
        y83 y83Var9 = this.A;
        if (y83Var9 == null) {
            y83Var9 = null;
        }
        ((ExactHeightRecyclerView) y83Var9.f).o(this.z);
        y83 y83Var10 = this.A;
        if (y83Var10 == null) {
            y83Var10 = null;
        }
        q9n.d(new r9g((Object) this, (byte) 20), (MeasurableHeightScrollView) y83Var10.g);
        gnh gnhVar4 = this.C;
        a26.T((gnhVar4 != null ? gnhVar4 : null).i, pdeVar, new iwa(this, (byte) 24));
    }

    @Override // defpackage.ltl
    public final int t0(Context context) {
        return 0;
    }

    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        View viewFindViewById = statusBarDrawingFrameLayout.findViewById(2131363024);
        int i = 2131362409;
        RecentlyClosedTabsSheetContentWrapper recentlyClosedTabsSheetContentWrapper = (RecentlyClosedTabsSheetContentWrapper) w1h.j(2131362409, viewFindViewById);
        if (recentlyClosedTabsSheetContentWrapper != null) {
            LinearLayout linearLayout = (LinearLayout) viewFindViewById;
            i = 2131363092;
            ConstraintLayout constraintLayoutJ = w1h.j(2131363092, viewFindViewById);
            if (constraintLayoutJ != null) {
                int i2 = 2131362507;
                StylingImageButton stylingImageButton = (StylingImageButton) w1h.j(2131362507, constraintLayoutJ);
                if (stylingImageButton != null) {
                    i2 = 2131362625;
                    if (((StylingImageView) w1h.j(2131362625, constraintLayoutJ)) != null) {
                        i2 = 2131363525;
                        if (((StylingTextView) w1h.j(2131363525, constraintLayoutJ)) != null) {
                            kf kfVar = new kf((byte) 25, (View) constraintLayoutJ, (Object) stylingImageButton);
                            i = 2131363313;
                            RecentlyClosedTabsSheetLayoutSwitcher recentlyClosedTabsSheetLayoutSwitcher = (RecentlyClosedTabsSheetLayoutSwitcher) w1h.j(2131363313, viewFindViewById);
                            if (recentlyClosedTabsSheetLayoutSwitcher != null) {
                                i = 2131364003;
                                RecyclerView recyclerView = (ExactHeightRecyclerView) w1h.j(2131364003, viewFindViewById);
                                if (recyclerView != null) {
                                    i = 2131364421;
                                    MeasurableHeightScrollView measurableHeightScrollView = (MeasurableHeightScrollView) w1h.j(2131364421, viewFindViewById);
                                    if (measurableHeightScrollView != null) {
                                        i = 2131364424;
                                        if (((VelocityTrackingCoordinatorLayout) w1h.j(2131364424, viewFindViewById)) != null) {
                                            i = 2131364794;
                                            Toolbar toolbarJ = w1h.j(2131364794, viewFindViewById);
                                            if (toolbarJ != null) {
                                                this.A = new y83((ViewGroup) linearLayout, (Object) recentlyClosedTabsSheetContentWrapper, (Object) kfVar, (View) recentlyClosedTabsSheetLayoutSwitcher, (View) recyclerView, (Object) measurableHeightScrollView, (View) toolbarJ, (byte) 8);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                t3p.q("Missing required view with ID: ".concat(constraintLayoutJ.getResources().getResourceName(i2)));
                return;
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i)));
    }
}
