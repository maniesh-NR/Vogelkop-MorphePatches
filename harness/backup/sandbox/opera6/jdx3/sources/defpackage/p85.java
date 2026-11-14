package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.custom_views.DropShadowFrameLayout;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.custom_views.PullSpinner;
import com.opera.android.custom_views.SeparatorView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class p85 implements a5n {
    public final /* synthetic */ byte a = 1;
    public final LinearLayout b;
    public final StylingTextView c;
    public final FrameLayout d;
    public final ConstraintLayout e;
    public final ViewGroup f;
    public final ViewGroup g;
    public final View h;
    public final View i;
    public final View j;
    public final View k;
    public final View l;
    public final View m;

    /* JADX WARN: Multi-variable type inference failed */
    public p85(LinearLayout linearLayout, OperaListItem operaListItem, LinearLayout linearLayout2, LinearLayout linearLayout3, StylingTextView stylingTextView, OperaListItem operaListItem2, OperaListItem operaListItem3, OperaListItem operaListItem4, FadingRecyclerView fadingRecyclerView, SeparatorView separatorView, OperaListItem operaListItem5, PullSpinner pullSpinner, FrameLayout frameLayout) {
        this.b = linearLayout;
        this.e = operaListItem;
        this.f = linearLayout2;
        this.g = linearLayout3;
        this.c = stylingTextView;
        this.h = operaListItem2;
        this.i = operaListItem3;
        this.j = operaListItem4;
        this.k = separatorView;
        this.l = operaListItem5;
        this.m = pullSpinner;
        this.d = frameLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p85(ConstraintLayout constraintLayout, FrameLayout frameLayout, FrameLayout frameLayout2, StylingTextView stylingTextView, StylingTextView stylingTextView2, LinearLayout linearLayout, ImageView imageView, TextView textView, ConstraintLayout constraintLayout2, ImageView imageView2, ImageView imageView3, DropShadowFrameLayout dropShadowFrameLayout) {
        this.e = constraintLayout;
        this.d = frameLayout;
        this.g = frameLayout2;
        this.c = stylingTextView;
        this.h = stylingTextView2;
        this.b = linearLayout;
        this.i = imageView;
        this.l = textView;
        this.f = constraintLayout2;
        this.j = imageView2;
        this.k = imageView3;
        this.m = dropShadowFrameLayout;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        switch (this.a) {
            case 0:
                return this.e;
            default:
                return this.b;
        }
    }
}
