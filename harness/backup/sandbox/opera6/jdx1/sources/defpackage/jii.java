package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.custom_views.InterceptableFrameLayout;
import com.opera.android.custom_views.RecyclerViewForScreenshot;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class jii implements a5n {
    public final CoordinatorLayout a;
    public final LinearLayout b;
    public final FrameLayout c;
    public final StylingImageView d;
    public final hi4 e;
    public final hi4 f;
    public final hi4 g;
    public final TextInputLayout h;
    public final hi4 i;
    public final InterceptableFrameLayout j;
    public final RecyclerViewForScreenshot k;
    public final LinearProgressIndicator l;
    public final LinearLayout m;
    public final StylingTextView n;
    public final ViewSwitcher o;
    public final FloatingActionButton p;
    public final LinearLayout q;

    public jii(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, FrameLayout frameLayout, StylingImageView stylingImageView, hi4 hi4Var, hi4 hi4Var2, hi4 hi4Var3, TextInputLayout textInputLayout, hi4 hi4Var4, InterceptableFrameLayout interceptableFrameLayout, RecyclerViewForScreenshot recyclerViewForScreenshot, LinearProgressIndicator linearProgressIndicator, LinearLayout linearLayout2, StylingTextView stylingTextView, ViewSwitcher viewSwitcher, FloatingActionButton floatingActionButton, LinearLayout linearLayout3) {
        this.a = coordinatorLayout;
        this.b = linearLayout;
        this.c = frameLayout;
        this.d = stylingImageView;
        this.e = hi4Var;
        this.f = hi4Var2;
        this.g = hi4Var3;
        this.h = textInputLayout;
        this.i = hi4Var4;
        this.j = interceptableFrameLayout;
        this.k = recyclerViewForScreenshot;
        this.l = linearProgressIndicator;
        this.m = linearLayout2;
        this.n = stylingTextView;
        this.o = viewSwitcher;
        this.p = floatingActionButton;
        this.q = linearLayout3;
    }

    public final View getRoot() {
        return this.a;
    }
}
