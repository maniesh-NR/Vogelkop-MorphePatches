package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class y1o extends gc {
    public static final AccelerateInterpolator A = new AccelerateInterpolator();
    public static final DecelerateInterpolator B = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public final Activity c;
    public ActionBarOverlayLayout d;
    public ActionBarContainer e;
    public rtl f;
    public ActionBarContextView g;
    public final View h;
    public boolean i;
    public x1o j;
    public x1o k;
    public z8b l;
    public boolean m;
    public boolean q;
    public boolean r;
    public boolean s;
    public n8n u;
    public boolean v;
    public boolean w;
    public final ArrayList n = new ArrayList();
    public int o = 0;
    public boolean p = true;
    public boolean t = true;
    public final w1o x = new w1o(this, 0);
    public final w1o y = new w1o(this, 1);
    public final z4k z = new z4k(this, (byte) 17);

    public y1o(Activity activity, boolean z) {
        this.c = activity;
        View decorView = activity.getWindow().getDecorView();
        x(decorView);
        if (z) {
            return;
        }
        this.h = decorView.findViewById(R.id.content);
    }

    public y1o(Dialog dialog) {
        x(dialog.getWindow().getDecorView());
    }

    @Override // defpackage.gc
    public final boolean b() {
        qsl qslVar;
        ptd ptdVar;
        rtl rtlVar = this.f;
        if (rtlVar == null || (qslVar = rtlVar.a.L) == null || (ptdVar = qslVar.b) == null) {
            return false;
        }
        if (qslVar == null) {
            ptdVar = null;
        }
        if (ptdVar == null) {
            return true;
        }
        ptdVar.collapseActionView();
        return true;
    }

    @Override // defpackage.gc
    public final void c(boolean z) {
        if (z != this.m) {
            this.m = z;
            ArrayList arrayList = this.n;
            if (arrayList.size() > 0) {
                throw fki.n(0, arrayList);
            }
        }
    }

    @Override // defpackage.gc
    public final int d() {
        return this.f.b;
    }

    @Override // defpackage.gc
    public final Context e() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(2130968590, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // defpackage.gc
    public final void f() {
        if (this.q) {
            return;
        }
        this.q = true;
        z(false);
    }

    @Override // defpackage.gc
    public final void h() {
        y(this.a.getResources().getBoolean(2131034112));
    }

    @Override // defpackage.gc
    public final boolean j(int i, KeyEvent keyEvent) {
        itd itdVar;
        x1o x1oVar = this.j;
        if (x1oVar == null || (itdVar = x1oVar.d) == null) {
            return false;
        }
        itdVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return itdVar.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.gc
    public final void m(boolean z) {
        if (this.i) {
            return;
        }
        n(z);
    }

    @Override // defpackage.gc
    public final void n(boolean z) {
        int i = z ? 4 : 0;
        rtl rtlVar = this.f;
        int i2 = rtlVar.b;
        this.i = true;
        rtlVar.a((i & 4) | (i2 & (-5)));
    }

    @Override // defpackage.gc
    public final void o() {
        this.i = true;
        this.f.a(12);
    }

    @Override // defpackage.gc
    public final void p(int i) {
        rtl rtlVar = this.f;
        Toolbar toolbar = rtlVar.a;
        Drawable drawableF = i != 0 ? sgb.F(i, toolbar.getContext()) : null;
        rtlVar.f = drawableF;
        if ((rtlVar.b & 4) == 0) {
            toolbar.A(null);
            return;
        }
        if (drawableF == null) {
            drawableF = rtlVar.o;
        }
        toolbar.A(drawableF);
    }

    @Override // defpackage.gc
    public final void q(boolean z) {
        n8n n8nVar;
        this.v = z;
        if (z || (n8nVar = this.u) == null) {
            return;
        }
        n8nVar.a();
    }

    @Override // defpackage.gc
    public final void r(String str) {
        this.f.b(str);
    }

    @Override // defpackage.gc
    public final void s(String str) {
        rtl rtlVar = this.f;
        rtlVar.g = true;
        Toolbar toolbar = rtlVar.a;
        rtlVar.h = str;
        if ((rtlVar.b & 8) != 0) {
            toolbar.D(str);
            if (rtlVar.g) {
                r5n.m(toolbar.getRootView(), str);
            }
        }
    }

    @Override // defpackage.gc
    public final void t(CharSequence charSequence) {
        rtl rtlVar = this.f;
        if (rtlVar.g) {
            return;
        }
        Toolbar toolbar = rtlVar.a;
        rtlVar.h = charSequence;
        if ((rtlVar.b & 8) != 0) {
            toolbar.D(charSequence);
            if (rtlVar.g) {
                r5n.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.gc
    public final void u() {
        if (this.q) {
            this.q = false;
            z(false);
        }
    }

    @Override // defpackage.gc
    public final se v(z8b z8bVar) {
        x1o x1oVar = this.j;
        if (x1oVar != null) {
            x1oVar.a();
        }
        this.d.j(false);
        this.g.e();
        x1o x1oVar2 = new x1o(this, this.g.getContext(), z8bVar);
        itd itdVar = x1oVar2.d;
        itdVar.w();
        try {
            if (!((re) x1oVar2.e.a).q(x1oVar2, itdVar)) {
                return null;
            }
            this.j = x1oVar2;
            x1oVar2.g();
            this.g.c(x1oVar2);
            w(true);
            return x1oVar2;
        } finally {
            itdVar.v();
        }
    }

    public final void w(boolean z) {
        l8n l8nVarJ;
        l8n l8nVarJ2;
        boolean z2 = this.s;
        if (z) {
            if (!z2) {
                this.s = true;
                z(false);
            }
        } else if (z2) {
            this.s = false;
            z(false);
        }
        boolean zIsLaidOut = this.e.isLaidOut();
        rtl rtlVar = this.f;
        if (!zIsLaidOut) {
            if (z) {
                rtlVar.a.setVisibility(4);
                this.g.setVisibility(0);
                return;
            } else {
                rtlVar.a.setVisibility(0);
                this.g.setVisibility(8);
                return;
            }
        }
        if (z) {
            l8nVarJ = r5n.b(rtlVar.a);
            l8nVarJ.a(0.0f);
            l8nVarJ.c(100L);
            l8nVarJ.d(new qtl(rtlVar, 4));
            l8nVarJ2 = this.g.j(0, 200L);
        } else {
            l8n l8nVarB = r5n.b(rtlVar.a);
            l8nVarB.a(1.0f);
            l8nVarB.c(200L);
            l8nVarB.d(new qtl(rtlVar, 0));
            l8nVarJ = this.g.j(8, 100L);
            l8nVarJ2 = l8nVarB;
        }
        n8n n8nVar = new n8n();
        ArrayList arrayList = n8nVar.a;
        arrayList.add(l8nVarJ);
        View view = (View) l8nVarJ.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) l8nVarJ2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(l8nVarJ2);
        n8nVar.b();
    }

    public final void x(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131362503);
        this.d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.w = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                actionBarOverlayLayout.w.o = actionBarOverlayLayout.b;
                int i = actionBarOverlayLayout.k;
                if (i != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(i);
                    WeakHashMap weakHashMap = r5n.a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
            }
        }
        View viewFindViewById = view.findViewById(2131361858);
        if (!(viewFindViewById instanceof Toolbar)) {
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(viewFindViewById != null ? viewFindViewById.getClass().getSimpleName() : "null"));
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        rtl rtlVar = toolbar.J;
        if (rtlVar == null) {
            rtlVar = new rtl(toolbar, true);
            toolbar.J = rtlVar;
        }
        this.f = rtlVar;
        this.g = (ActionBarContextView) view.findViewById(2131361871);
        ActionBarContainer actionBarContainerFindViewById = view.findViewById(2131361861);
        this.e = actionBarContainerFindViewById;
        rtl rtlVar2 = this.f;
        if (rtlVar2 == null || this.g == null || actionBarContainerFindViewById == null) {
            qp2.n(y1o.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = rtlVar2.a.getContext();
        this.a = context;
        if ((this.f.b & 4) != 0) {
            this.i = true;
        }
        int i2 = context.getApplicationInfo().targetSdkVersion;
        this.f.getClass();
        y(context.getResources().getBoolean(2131034112));
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, zhh.a, 2130968585, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.d;
            if (!actionBarOverlayLayout2.g) {
                qp2.n("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.w = true;
                actionBarOverlayLayout2.j(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer = this.e;
            WeakHashMap weakHashMap2 = r5n.a;
            actionBarContainer.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void y(boolean z) {
        if (z) {
            this.e.getClass();
            this.f.getClass();
        } else {
            this.f.getClass();
            this.e.getClass();
        }
        this.f.getClass();
        this.f.a.requestLayout();
        this.d.getClass();
    }

    public final void z(boolean z) {
        boolean z2 = this.s || !(this.q || this.r);
        boolean z3 = this.t;
        z4k z4kVar = this.z;
        View view = this.h;
        if (!z2) {
            if (z3) {
                this.t = false;
                n8n n8nVar = this.u;
                if (n8nVar != null) {
                    n8nVar.a();
                }
                int i = this.o;
                w1o w1oVar = this.x;
                if (i != 0 || (!this.v && !z)) {
                    w1oVar.g();
                    return;
                }
                this.e.setAlpha(1.0f);
                ActionBarContainer actionBarContainer = this.e;
                actionBarContainer.a = true;
                actionBarContainer.setDescendantFocusability(393216);
                n8n n8nVar2 = new n8n();
                float f = -this.e.getHeight();
                if (z) {
                    this.e.getLocationInWindow(new int[]{0, 0});
                    f -= r13[1];
                }
                l8n l8nVarB = r5n.b(this.e);
                l8nVarB.e(f);
                View view2 = (View) l8nVarB.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(z4kVar != null ? new wo1(z4kVar, view2, (byte) 4) : null);
                }
                boolean z4 = n8nVar2.c;
                ArrayList arrayList = n8nVar2.a;
                if (!z4) {
                    arrayList.add(l8nVarB);
                }
                if (this.p && view != null) {
                    l8n l8nVarB2 = r5n.b(view);
                    l8nVarB2.e(f);
                    if (!n8nVar2.c) {
                        arrayList.add(l8nVarB2);
                    }
                }
                boolean z5 = n8nVar2.c;
                if (!z5) {
                    n8nVar2.d = A;
                }
                if (!z5) {
                    n8nVar2.b = 250L;
                }
                if (!z5) {
                    n8nVar2.e = w1oVar;
                }
                this.u = n8nVar2;
                n8nVar2.b();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.t = true;
        n8n n8nVar3 = this.u;
        if (n8nVar3 != null) {
            n8nVar3.a();
        }
        this.e.setVisibility(0);
        int i2 = this.o;
        w1o w1oVar2 = this.y;
        if (i2 == 0 && (this.v || z)) {
            this.e.setTranslationY(0.0f);
            float f2 = -this.e.getHeight();
            if (z) {
                this.e.getLocationInWindow(new int[]{0, 0});
                f2 -= r13[1];
            }
            this.e.setTranslationY(f2);
            n8n n8nVar4 = new n8n();
            l8n l8nVarB3 = r5n.b(this.e);
            l8nVarB3.e(0.0f);
            View view3 = (View) l8nVarB3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(z4kVar != null ? new wo1(z4kVar, view3, (byte) 4) : null);
            }
            boolean z6 = n8nVar4.c;
            ArrayList arrayList2 = n8nVar4.a;
            if (!z6) {
                arrayList2.add(l8nVarB3);
            }
            if (this.p && view != null) {
                view.setTranslationY(f2);
                l8n l8nVarB4 = r5n.b(view);
                l8nVarB4.e(0.0f);
                if (!n8nVar4.c) {
                    arrayList2.add(l8nVarB4);
                }
            }
            boolean z7 = n8nVar4.c;
            if (!z7) {
                n8nVar4.d = B;
            }
            if (!z7) {
                n8nVar4.b = 250L;
            }
            if (!z7) {
                n8nVar4.e = w1oVar2;
            }
            this.u = n8nVar4;
            n8nVar4.b();
        } else {
            this.e.setAlpha(1.0f);
            this.e.setTranslationY(0.0f);
            if (this.p && view != null) {
                view.setTranslationY(0.0f);
            }
            w1oVar2.g();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.d;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = r5n.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }
}
