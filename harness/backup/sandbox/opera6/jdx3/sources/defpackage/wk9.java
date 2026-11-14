package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.opera.android.custom_views.FadingNestedScrollView;
import com.opera.android.custom_views.SeparatorView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;

/* loaded from: classes.dex */
public final class wk9 implements a5n {
    public final /* synthetic */ byte a = 1;
    public final LinearLayout b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final View n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final View s;
    public final Object t;
    public final Object u;
    public final Object v;

    /* JADX WARN: Multi-variable type inference failed */
    public wk9(LinearLayout linearLayout, vs vsVar, vs vsVar2, vs vsVar3, vs vsVar4, vs vsVar5, vs vsVar6, vs vsVar7, vs vsVar8, vs vsVar9, vs vsVar10, vs vsVar11, TextView textView, vs vsVar12, vs vsVar13, vs vsVar14, vs vsVar15, OperaMaterialButton operaMaterialButton, vs vsVar16, vs vsVar17, vs vsVar18) {
        this.b = linearLayout;
        this.c = vsVar;
        this.d = vsVar2;
        this.e = vsVar3;
        this.f = vsVar4;
        this.g = vsVar5;
        this.h = vsVar6;
        this.i = vsVar7;
        this.j = vsVar8;
        this.k = vsVar9;
        this.l = vsVar10;
        this.m = vsVar11;
        this.n = textView;
        this.o = vsVar12;
        this.p = vsVar13;
        this.q = vsVar14;
        this.r = vsVar15;
        this.s = operaMaterialButton;
        this.t = vsVar16;
        this.u = vsVar17;
        this.v = vsVar18;
    }

    public wk9(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, LinearLayout linearLayout, RecyclerView recyclerView2, LinearLayout linearLayout2, SeparatorView separatorView, FrameLayout frameLayout, RecyclerView recyclerView3, LinearLayout linearLayout3, SeparatorView separatorView2, LinearLayout linearLayout4, FadingNestedScrollView fadingNestedScrollView, StylingTextView stylingTextView, RecyclerView recyclerView4, RecyclerView recyclerView5, LinearLayout linearLayout5, SeparatorView separatorView3, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView6, LinearLayout linearLayout6, SeparatorView separatorView4) {
        this.c = coordinatorLayout;
        this.d = recyclerView;
        this.b = linearLayout;
        this.e = recyclerView2;
        this.j = linearLayout2;
        this.o = separatorView;
        this.s = frameLayout;
        this.f = recyclerView3;
        this.k = linearLayout3;
        this.p = separatorView2;
        this.l = linearLayout4;
        this.t = fadingNestedScrollView;
        this.u = stylingTextView;
        this.g = recyclerView4;
        this.h = recyclerView5;
        this.m = linearLayout5;
        this.q = separatorView3;
        this.v = swipeRefreshLayout;
        this.i = recyclerView6;
        this.n = linearLayout6;
        this.r = separatorView4;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        switch (this.a) {
            case 0:
                return (CoordinatorLayout) this.c;
            default:
                return this.b;
        }
    }
}
