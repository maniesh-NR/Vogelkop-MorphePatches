package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.r;
import androidx.fragment.app.w;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.opera.android.BrowserActivity;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.annotations.WeakOwner;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.uninstall.UninstallSurveyFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public abstract class ltl extends k24 {
    public wjj g;
    public itl h;
    public qe6 j;
    public StatusBarDrawingFrameLayout k;
    public Toolbar l;
    public se m;

    @WeakOwner
    protected qm9 n;
    public boolean o;
    public boolean p;
    public final nrl f = new nrl();
    public final ArrayList i = new ArrayList();
    public final r63 q = new r63(this, 1);

    public ltl(itl itlVar) {
        this.h = itlVar;
    }

    public static void o0(AppBarLayout appBarLayout, int i) {
        if (i != -1) {
            appBarLayout.n = i;
            WeakReference weakReference = appBarLayout.o;
            if (weakReference != null) {
                weakReference.clear();
            }
            appBarLayout.o = null;
        }
        qv5 layoutParams = appBarLayout.getLayoutParams();
        AppBarLayout.Behavior behavior = layoutParams.a;
        if (behavior == null) {
            behavior = new AppBarLayout.Behavior();
        }
        ((AppBarLayout.BaseBehavior) behavior).o = new gtl();
        layoutParams.b(behavior);
    }

    public void A0(FloatingActionButton floatingActionButton) {
        atj.a(floatingActionButton);
        n1h.n(floatingActionButton, 2132017365, 0);
        floatingActionButton.setImageResource(2131231967);
    }

    public void B0(LayoutInflater layoutInflater, FadingRecyclerView fadingRecyclerView) {
    }

    public itl C0(itl itlVar) {
        return itlVar;
    }

    public final void D0() {
        View view = getView();
        if (view == null || !this.o) {
            return;
        }
        view.postOnAnimation(new cbl((Object) this, (byte) 13));
    }

    public final void E0() {
        Context context = this.l.getContext();
        ColorStateList colorStateListV = f03.v(context);
        Toolbar toolbar = this.l;
        int iT0 = t0(context);
        int iS0 = s0();
        if (iT0 == 0) {
            toolbar.A((Drawable) null);
        } else {
            Drawable drawableF = sgb.F(iT0, toolbar.getContext());
            j14.o0(drawableF, colorStateListV);
            toolbar.A(drawableF);
            View view = (View) mzg.h(toolbar, "mNavButtonView");
            if (view != null) {
                n1h.n(view, iS0, 0);
            }
        }
        AppCompatImageButton appCompatImageButton = this.l.g;
        Drawable drawable = appCompatImageButton != null ? appCompatImageButton.getDrawable() : null;
        if (drawable == null) {
            return;
        }
        drawable.mutate();
        drawable.setTintList(colorStateListV);
        Toolbar toolbar2 = this.l;
        toolbar2.c();
        toolbar2.g.setImageDrawable(drawable);
    }

    public final ktl F0(jtl jtlVar) {
        ktl ktlVar = new ktl(jtlVar);
        this.i.add(ktlVar);
        return ktlVar;
    }

    @Override // defpackage.ryl
    public final void j0(btj btjVar) {
        if (this.h.d) {
            this.b = btjVar;
        } else {
            qp2.n("ToolbarFragment installs its own snackbar handler. Call Config.Builder.withCustomSnackbarHandling() to opt out.");
        }
    }

    @Override // defpackage.k24
    public final void m0() {
        if (this.m == null) {
            this.l.F();
        }
    }

    @Override // defpackage.k24
    public final View n0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        a6n a6nVar;
        int i2;
        int i3;
        itl itlVarC0 = C0(this.h);
        BrowserActivity activity = getActivity();
        nrl nrlVar = this.f;
        nrlVar.getClass();
        if (activity instanceof BrowserActivity) {
            nrlVar.b = new v6d(activity.u1);
        }
        final byte b = 1;
        if (itlVarC0.h) {
            nrlVar.a = true;
        }
        Context context = viewGroup != null ? viewGroup.getContext() : getContext();
        boolean z = pjm.a;
        int i4 = itlVarC0.i;
        final byte b2 = 2;
        if (z) {
            i4 = i4 == 1 ? 1 : 2;
        }
        final byte b3 = 0;
        boolean z2 = i4 == 1;
        StatusBarDrawingFrameLayout statusBarDrawingFrameLayout = new StatusBarDrawingFrameLayout(context, null);
        this.k = statusBarDrawingFrameLayout;
        statusBarDrawingFrameLayout.c(z2 && !itlVarC0.e);
        if (z2 && !itlVarC0.e && !itlVarC0.f) {
            q9n.f(this.k, new r8n(this) { // from class: etl
                public final /* synthetic */ ltl b;

                {
                    this.b = this;
                }

                @Override // defpackage.r8n
                public final void a(View view) {
                    byte b4 = b3;
                    ltl ltlVar = this.b;
                    switch (b4) {
                        case 0:
                            ltlVar.k.e(f03.t(2130970872, view.getContext(), 2131101243));
                            break;
                        case 1:
                            ltlVar.E0();
                            break;
                        default:
                            ColorStateList colorStateListV = f03.v(ltlVar.l.getContext());
                            j14.p0(ltlVar.l.o(), colorStateListV);
                            Toolbar toolbar = ltlVar.l;
                            toolbar.e();
                            qe qeVar = toolbar.a;
                            qeVar.j();
                            me meVar = qeVar.t.g;
                            j14.o0(meVar != null ? meVar.getDrawable() : null, colorStateListV);
                            break;
                    }
                }
            });
        }
        StatusBarDrawingFrameLayout statusBarDrawingFrameLayout2 = this.k;
        if (xug.k(statusBarDrawingFrameLayout2) == null) {
            statusBarDrawingFrameLayout2.setTag(2131364495, new atj(statusBarDrawingFrameLayout2));
        }
        View viewInflate = layoutInflater.inflate(itlVarC0.l.b, (ViewGroup) statusBarDrawingFrameLayout2, true);
        sa2 sa2Var = itlVarC0.l;
        sa2 sa2Var2 = itl.m;
        if (sa2Var == sa2Var2) {
            WeakHashMap weakHashMap = r5n.a;
            ViewStub viewStub = (ViewStub) ((View) m5n.f(viewInflate, 2131364799));
            if (i4 == 1) {
                i3 = 0;
            } else if (i4 == 2) {
                i3 = 2131559468;
            } else if (i4 == 3) {
                i3 = 2131559469;
            } else if (i4 == 4) {
                i3 = 2131559466;
            } else {
                if (i4 != 5) {
                    throw null;
                }
                i3 = 2131559465;
            }
            viewStub.setLayoutResource(i3);
            viewStub.inflate();
        }
        Toolbar toolbarY = q9n.y(2131364794, viewInflate);
        this.l = toolbarY;
        pxh pxhVar = itlVarC0.a;
        if (pxhVar != null) {
            toolbarY.D(pxhVar.a(toolbarY.getResources()));
        }
        this.l.B(new ic(this, (byte) 13));
        q9n.f(this.l, new r8n(this) { // from class: etl
            public final /* synthetic */ ltl b;

            {
                this.b = this;
            }

            @Override // defpackage.r8n
            public final void a(View view) {
                byte b4 = b;
                ltl ltlVar = this.b;
                switch (b4) {
                    case 0:
                        ltlVar.k.e(f03.t(2130970872, view.getContext(), 2131101243));
                        break;
                    case 1:
                        ltlVar.E0();
                        break;
                    default:
                        ColorStateList colorStateListV = f03.v(ltlVar.l.getContext());
                        j14.p0(ltlVar.l.o(), colorStateListV);
                        Toolbar toolbar = ltlVar.l;
                        toolbar.e();
                        qe qeVar = toolbar.a;
                        qeVar.j();
                        me meVar = qeVar.t.g;
                        j14.o0(meVar != null ? meVar.getDrawable() : null, colorStateListV);
                        break;
                }
            }
        });
        int i5 = itlVarC0.b;
        if (i5 != 0) {
            Toolbar toolbar = this.l;
            toolbar.getClass();
            new lsk(toolbar.getContext()).inflate(i5, toolbar.o());
            q9n.f(this.l, new r8n(this) { // from class: etl
                public final /* synthetic */ ltl b;

                {
                    this.b = this;
                }

                @Override // defpackage.r8n
                public final void a(View view) {
                    byte b4 = b2;
                    ltl ltlVar = this.b;
                    switch (b4) {
                        case 0:
                            ltlVar.k.e(f03.t(2130970872, view.getContext(), 2131101243));
                            break;
                        case 1:
                            ltlVar.E0();
                            break;
                        default:
                            ColorStateList colorStateListV = f03.v(ltlVar.l.getContext());
                            j14.p0(ltlVar.l.o(), colorStateListV);
                            Toolbar toolbar2 = ltlVar.l;
                            toolbar2.e();
                            qe qeVar = toolbar2.a;
                            qeVar.j();
                            me meVar = qeVar.t.g;
                            j14.o0(meVar != null ? meVar.getDrawable() : null, colorStateListV);
                            break;
                    }
                }
            });
            Toolbar toolbar2 = this.l;
            toolbar2.H = new crk(this, (byte) 17);
            x0(toolbar2.o());
            this.l.F.a(new htl(), getViewLifecycleOwner());
        }
        if (itlVarC0.c) {
            FloatingActionButton floatingActionButtonFindViewById = viewInflate.findViewById(2131362835);
            Objects.requireNonNull(floatingActionButtonFindViewById);
            FloatingActionButton floatingActionButton = floatingActionButtonFindViewById;
            floatingActionButton.a(0, true);
            A0(floatingActionButton);
        }
        View coordinatorLayout = new CoordinatorLayout(context, (AttributeSet) null);
        qm9 qm9Var = new qm9(coordinatorLayout);
        this.n = qm9Var;
        if (!itlVarC0.d) {
            this.b = qm9Var;
        }
        statusBarDrawingFrameLayout2.addView(coordinatorLayout);
        if (itlVarC0.l == sa2Var2) {
            WeakHashMap weakHashMap2 = r5n.a;
            ViewStub viewStub2 = (ViewStub) ((View) m5n.f(viewInflate, 2131362412));
            int i6 = itlVarC0.j;
            if (i6 == 1) {
                i = 2131559462;
            } else {
                if (i6 != 2) {
                    throw null;
                }
                i = 2131559463;
            }
            viewStub2.setLayoutResource(i);
            NestedScrollView nestedScrollView = (ViewGroup) viewStub2.inflate();
            int iA = vep.A(itlVarC0.j);
            if (iA == 0) {
                a6nVar = (a6n) nestedScrollView;
                p0(viewInflate, nestedScrollView);
                this.g = new wjj(nestedScrollView);
                v0(layoutInflater, nestedScrollView);
            } else if (iA != 1) {
                a6nVar = null;
            } else {
                a6nVar = (a6n) nestedScrollView;
                p0(viewInflate, nestedScrollView);
                B0(layoutInflater, (FadingRecyclerView) nestedScrollView);
            }
            if (itlVarC0.k != 0) {
                ViewStub viewStub3 = (ViewStub) ((View) m5n.f(viewInflate, 2131362180));
                int i7 = itlVarC0.k;
                if (i7 == 1) {
                    i2 = 2131559461;
                } else {
                    if (i7 != 2) {
                        throw null;
                    }
                    i2 = 2131559464;
                }
                viewStub3.setLayoutResource(i2);
                u0(layoutInflater, (ViewGroup) viewStub3.inflate());
                if (a6nVar != null) {
                    a6nVar.h(f03.u(2130969702, context, R.color.transparent));
                    a6nVar.f();
                    a6nVar.c();
                }
                viewStub3.setVisibility(0);
            }
            boolean z3 = itlVarC0.k != 0;
            dxh dxhVar = itlVarC0.g;
            if (z3) {
                this.k.d(true);
                StatusBarDrawingFrameLayout statusBarDrawingFrameLayout3 = this.k;
                q9n.f(statusBarDrawingFrameLayout3, new lje(statusBarDrawingFrameLayout3, b3));
            } else {
                z4o.q0(nestedScrollView);
                z4o.r0(this.k, dxhVar);
            }
        } else {
            y0(layoutInflater, statusBarDrawingFrameLayout2);
            z0();
        }
        getParentFragmentManager().o.add(this.q);
        return statusBarDrawingFrameLayout2;
    }

    public void onConfigurationChanged(Configuration configuration) {
        gtj gtjVar;
        super/*androidx.fragment.app.Fragment*/.onConfigurationChanged(configuration);
        qm9 qm9Var = this.n;
        if (qm9Var == null || (gtjVar = qm9Var.d) == null) {
            return;
        }
        gtjVar.k();
    }

    @Override // defpackage.ryl
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setShowsDialog(false);
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) throws Resources.NotFoundException {
        r activity = getActivity();
        View view = getView();
        Animation animationOnCreateAnimation = super/*androidx.fragment.app.Fragment*/.onCreateAnimation(i, z, i2);
        nrl nrlVar = this.f;
        nrlVar.getClass();
        if (animationOnCreateAnimation == null && i2 != 0) {
            animationOnCreateAnimation = AnimationUtils.loadAnimation(activity, i2);
        }
        ValueAnimator valueAnimatorOfFloat = null;
        if (animationOnCreateAnimation == null && (i == 4097 || i == 4099 || i == 8194)) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(220L);
        }
        if (animationOnCreateAnimation == null && valueAnimatorOfFloat == null) {
            t6d t6dVar = z ? t6d.d : t6d.a;
            v6d v6dVar = (v6d) nrlVar.b;
            if (v6dVar != null && nrlVar.a) {
                v6dVar.b(t6dVar);
            }
        } else if (z) {
            ld9 ld9Var = new ld9(nrlVar, (byte) 5);
            if (animationOnCreateAnimation != null) {
                animationOnCreateAnimation.setAnimationListener(new zk9(nrlVar, view, ld9Var));
            } else {
                valueAnimatorOfFloat.addListener(new al9(nrlVar, view, ld9Var));
            }
            t6d t6dVar2 = t6d.c;
            v6d v6dVar2 = (v6d) nrlVar.b;
            if (v6dVar2 != null && nrlVar.a) {
                v6dVar2.b(t6dVar2);
            }
        } else {
            t6d t6dVar3 = t6d.a;
            v6d v6dVar3 = (v6d) nrlVar.b;
            if (v6dVar3 != null && nrlVar.a) {
                v6dVar3.b(t6dVar3);
            }
        }
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.start();
        }
        return animationOnCreateAnimation;
    }

    @Override // defpackage.k24
    public void onDestroyView() {
        se seVar = this.m;
        if (seVar != null) {
            seVar.a();
        }
        this.b = null;
        this.n = null;
        this.o = false;
        w parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.o.remove(this.q);
        nrl nrlVar = this.f;
        v6d v6dVar = (v6d) nrlVar.b;
        if (v6dVar != null) {
            v6dVar.b(t6d.a);
            nrlVar.b = null;
        }
        super.onDestroyView();
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        return true;
    }

    public void onPause() {
        super/*androidx.fragment.app.Fragment*/.onPause();
        if (w0()) {
            gwi.a(getActivity()).b(false);
        }
    }

    public void onResume() {
        super/*androidx.fragment.app.Fragment*/.onResume();
        if (w0()) {
            gwi.a(getActivity()).b(true);
        }
        D0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p0(View view, View view2) {
        WeakHashMap weakHashMap = r5n.a;
        AppBarLayout appBarLayout = (AppBarLayout) ((View) m5n.f(view, 2131362059));
        int id = view2.getId() != -1 ? view2.getId() : 2131362409;
        o0(appBarLayout, id);
        q0(view, id, appBarLayout);
        if (view2 instanceof nij) {
            nij nijVar = (nij) view2;
            CollapsingToolbarLayout collapsingToolbarLayoutFindViewById = view.findViewById(2131362365);
            nijVar.a(new g00(this, collapsingToolbarLayoutFindViewById != null ? collapsingToolbarLayoutFindViewById.getLayoutParams().height : -2, collapsingToolbarLayoutFindViewById));
        }
    }

    public final void q0(View view, int i, AppBarLayout appBarLayout) {
        NestedScrollView nestedScrollViewFindViewById = view.findViewById(i);
        byte b = 15;
        if (nestedScrollViewFindViewById instanceof NestedScrollView) {
            this.j = new qe6(new f1p(nestedScrollViewFindViewById, appBarLayout), b);
        } else if (nestedScrollViewFindViewById instanceof ScrollView) {
            this.j = new qe6(new d06((ScrollView) nestedScrollViewFindViewById), b);
        } else if (nestedScrollViewFindViewById instanceof RecyclerView) {
            this.j = new qe6((RecyclerView) nestedScrollViewFindViewById);
        }
    }

    public MenuItem r0(int i) {
        return this.l.o().findItem(i);
    }

    public int s0() {
        return this instanceof UninstallSurveyFragment ? 2132018253 : 2132021917;
    }

    public int t0(Context context) {
        if (this instanceof UninstallSurveyFragment) {
            return 2131232034;
        }
        return f03.E(2130968579, context, 2131231986);
    }

    public void u0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
    }

    public void v0(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        this.i.forEach(new Consumer() { // from class: ftl
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ktl ktlVar = (ktl) obj;
                ndc viewLifecycleOwner = this.a.getViewLifecycleOwner();
                ktlVar.getClass();
                viewLifecycleOwner.getLifecycle().a(ktlVar);
                ktlVar.b = (a5n) ktlVar.a.k(layoutInflater, viewGroup);
            }
        });
    }

    public boolean w0() {
        return false;
    }

    public void x0(itd itdVar) {
    }

    public void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
    }

    public void z0() {
        this.k.d(true);
        StatusBarDrawingFrameLayout statusBarDrawingFrameLayout = this.k;
        q9n.f(statusBarDrawingFrameLayout, new lje(statusBarDrawingFrameLayout, (byte) 0));
    }
}
