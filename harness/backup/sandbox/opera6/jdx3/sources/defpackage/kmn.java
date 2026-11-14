package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.LayoutDirectionToolbar;
import com.opera.android.ui.catalog.widget.OperaSwitch;
import com.opera.android.widget.AspectRatioLayout;

/* loaded from: classes.dex */
public final class kmn implements a5n {
    public final FrameLayout a;
    public final AspectRatioLayout b;
    public final LinearLayout c;
    public final Space d;
    public final Space e;
    public final FrameLayout f;
    public final FrameLayout g;
    public final ConstraintLayout h;
    public final TextView i;
    public final View j;
    public final MaterialButton k;
    public final LinearLayout l;
    public final MaterialButton m;
    public final LayoutDirectionToolbar n;
    public final MaterialButton o;
    public final MaterialButton p;
    public final ConstraintLayout q;
    public final OperaSwitch r;

    public kmn(FrameLayout frameLayout, AspectRatioLayout aspectRatioLayout, LinearLayout linearLayout, Space space, Space space2, FrameLayout frameLayout2, FrameLayout frameLayout3, ConstraintLayout constraintLayout, TextView textView, View view, MaterialButton materialButton, LinearLayout linearLayout2, MaterialButton materialButton2, LayoutDirectionToolbar layoutDirectionToolbar, MaterialButton materialButton3, MaterialButton materialButton4, ConstraintLayout constraintLayout2, OperaSwitch operaSwitch) {
        this.a = frameLayout;
        this.b = aspectRatioLayout;
        this.c = linearLayout;
        this.d = space;
        this.e = space2;
        this.f = frameLayout2;
        this.g = frameLayout3;
        this.h = constraintLayout;
        this.i = textView;
        this.j = view;
        this.k = materialButton;
        this.l = linearLayout2;
        this.m = materialButton2;
        this.n = layoutDirectionToolbar;
        this.o = materialButton3;
        this.p = materialButton4;
        this.q = constraintLayout2;
        this.r = operaSwitch;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        return this.a;
    }
}
