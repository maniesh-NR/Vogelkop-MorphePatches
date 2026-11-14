package defpackage;

import J.N;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.opera.android.OperaApplication;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.sync.SyncedSession;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import com.opera.android.widget.ThemeableLottieAnimationView;
import java.util.Date;

/* loaded from: classes.dex */
public abstract class y93 extends ltl implements ywk, mm9 {
    public boolean A;
    public LayoutInflater B;
    public boolean C;
    public or2 r;
    public boolean s;
    public final r93 t;
    public ViewGroup u;
    public ViewPager v;
    public FadingRecyclerView w;
    public AppBarLayout x;
    public t93 y;
    public zwk z;

    /* JADX WARN: Illegal instructions before constructor call */
    public y93(int i, int i2) {
        u7k u7kVarJ = u7k.j(2131559404);
        itl itlVar = (itl) u7kVarJ.a;
        itlVar.e = true;
        u7kVarJ.s(i);
        itlVar.b = i2;
        super(itlVar);
        this.t = new r93(this, (byte) 0);
        this.A = true;
    }

    @Override // defpackage.ywk
    public final void G(int i) {
    }

    public abstract d G0(Object obj, LinearLayoutManager linearLayoutManager);

    public u93 H0(ViewGroup viewGroup, Object obj) {
        SyncedSession syncedSession = (SyncedSession) obj;
        ViewGroup viewGroup2 = (ViewGroup) this.B.inflate(2131559407, viewGroup, false);
        RecyclerView recyclerViewFindViewById = viewGroup2.findViewById(2131363328);
        getActivity();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        recyclerViewFindViewById.C0(linearLayoutManager);
        return new u93(this, viewGroup2, recyclerViewFindViewById, syncedSession, linearLayoutManager);
    }

    public final String I0(Object obj) {
        return getContext().getResources().getString(2132021788, aik.e(J0(obj)));
    }

    public Date J0(Object obj) {
        return ((tq8) obj).z();
    }

    public String K0(Object obj) {
        return ((tq8) obj).h();
    }

    public Object[] L0() {
        return (SyncedSession[]) N.MENDCTHo();
    }

    public void M0() {
        boolean z = this.y.b == 0;
        Object[] objArrL0 = L0();
        if (objArrL0.length > 0) {
            this.r.c.setVisibility(8);
            this.v.setVisibility(0);
            this.w.setVisibility(0);
            this.v.getAdapter().notifyDataSetChanged();
            ((RecyclerView) this.w).m.notifyDataSetChanged();
            if (cs5.W(this.v) && z) {
                this.s = true;
                this.v.setCurrentItem(objArrL0.length - 1);
                return;
            }
            return;
        }
        if (z && this.A) {
            ((ThemeableLottieAnimationView) this.r.d).setVisibility(0);
            ((StylingImageView) this.r.f).setVisibility(4);
            ((StylingTextView) this.r.b).setText(2132021798);
            ((ThemeableLottieAnimationView) this.r.d).p(-1);
            ((ThemeableLottieAnimationView) this.r.d).j(2131951680);
            ((ThemeableLottieAnimationView) this.r.d).h();
            ((OperaMaterialButton) this.r.e).setVisibility(8);
        } else {
            N0();
        }
        this.v.setVisibility(8);
        this.w.setVisibility(8);
        this.A = false;
    }

    public void N0() {
        ((ThemeableLottieAnimationView) this.r.d).setVisibility(8);
        ((StylingImageView) this.r.f).setVisibility(0);
        ((StylingTextView) this.r.b).setText(2132021790);
        ((StylingImageView) this.r.f).setImageDrawable(sgb.F(2131232686, requireContext()));
        ((OperaMaterialButton) this.r.e).setVisibility(8);
    }

    public void O0() {
        ((ThemeableLottieAnimationView) this.r.d).setVisibility(8);
        ((StylingImageView) this.r.f).setVisibility(0);
        ((StylingTextView) this.r.b).setText(2132021768);
        ((StylingImageView) this.r.f).setImageDrawable(sgb.F(2131232686, requireContext()));
        ((OperaMaterialButton) this.r.e).setOnClickListener(new h4i((Object) this, (byte) 21));
    }

    public final void X(Bundle bundle, String str) {
        if (!"SyncAuthPortalFragment_request".equals(str) || bundle.getInt("result_code") == -1) {
            return;
        }
        this.C = true;
        vml.c(new fv2(this, (byte) 10));
    }

    @Override // defpackage.ywk
    public final void g() {
        M0();
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        i iVarF;
        if (!z || (iVarF = getFragmentManager().F("dialog")) == null) {
            super.l0(z);
        } else {
            iVarF.dismiss();
        }
    }

    @Override // defpackage.k24
    public final void onAttach(Context context) {
        super.onAttach(context);
        String[] strArr = OperaApplication.K;
        this.z = ((OperaApplication) context.getApplicationContext()).N();
        tcc lifecycle = getLifecycle();
        dxk dxkVar = getActivity().U;
        if (dxkVar == null) {
            dxkVar = null;
        }
        lifecycle.a(new mxk(dxkVar, this.z));
    }

    public final Animator onCreateAnimator(int i, boolean z, int i2) {
        if (z || !this.C) {
            return super/*androidx.fragment.app.Fragment*/.onCreateAnimator(i, z, i2);
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0);
        valueAnimatorOfInt.setDuration(0L);
        return valueAnimatorOfInt;
    }

    @Override // defpackage.ltl, defpackage.k24
    public void onDestroyView() {
        this.z.H(this);
        ViewPager viewPager = this.v;
        if (viewPager != null) {
            viewPager.removeOnPageChangeListener(this.t);
            this.v.setAdapter((PagerAdapter) null);
        }
        this.y = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        super.onDestroyView();
    }

    @Override // defpackage.k24
    public final void onDetach() {
        super.onDetach();
        this.z = null;
    }

    /* JADX WARN: Type inference failed for: r11v8, types: [android.view.View, com.opera.android.custom_views.FadingRecyclerView] */
    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        this.y = new t93(this);
        this.B = layoutInflater;
        this.u = (ViewGroup) statusBarDrawingFrameLayout.findViewById(2131362409);
        byte b = 0;
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131558691, (ViewGroup) null, false);
        int i = 2131362034;
        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) w1h.j(2131362034, constraintLayoutInflate);
        if (themeableLottieAnimationView != null) {
            i = 2131362680;
            OperaMaterialButton operaMaterialButton = (OperaMaterialButton) w1h.j(2131362680, constraintLayoutInflate);
            if (operaMaterialButton != null) {
                i = 2131362682;
                StylingImageView stylingImageView = (StylingImageView) w1h.j(2131362682, constraintLayoutInflate);
                if (stylingImageView != null) {
                    i = 2131362690;
                    StylingTextView stylingTextView = (StylingTextView) w1h.j(2131362690, constraintLayoutInflate);
                    if (stylingTextView != null) {
                        ConstraintLayout constraintLayout = constraintLayoutInflate;
                        this.r = new or2((View) constraintLayout, (Object) themeableLottieAnimationView, (Object) operaMaterialButton, (Object) stylingImageView, (Object) stylingTextView, (byte) 7);
                        statusBarDrawingFrameLayout.addView(constraintLayout);
                        this.x = statusBarDrawingFrameLayout.findViewById(2131362059);
                        ?? r11 = (FadingRecyclerView) statusBarDrawingFrameLayout.findViewById(2131364664);
                        this.w = r11;
                        r11.setVisibility(8);
                        this.w.y0(new x93(this, b));
                        RecyclerView recyclerView = this.w;
                        recyclerView.getContext();
                        recyclerView.C0(new w93(0, false));
                        this.w.m(new s93(this, (byte) 0));
                        this.w.setLayoutDirection(0);
                        ltl.o0(this.x, -1);
                        ViewPager viewPagerFindViewById = this.u.findViewById(2131365011);
                        this.v = viewPagerFindViewById;
                        viewPagerFindViewById.setAdapter(this.y);
                        this.v.addOnPageChangeListener(this.t);
                        this.z.getClass();
                        if (zwk.e()) {
                            M0();
                        } else {
                            O0();
                            this.r.c.setVisibility(0);
                        }
                        this.z.F(this);
                        return;
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
    }
}
