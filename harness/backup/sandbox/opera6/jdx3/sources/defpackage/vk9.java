package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.slider.Slider;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class vk9 implements a5n {
    public final LinearLayout a;
    public final OperaListItem b;
    public final OperaListItem c;
    public final OperaListItem d;
    public final OperaListItem e;
    public final FrameLayout f;
    public final StylingImageButton g;
    public final StylingImageButton h;
    public final StylingTextView i;
    public final StylingTextView j;
    public final TextView k;
    public final LinearLayout l;
    public final ImageView m;
    public final StylingTextView n;
    public final Slider o;

    public vk9(LinearLayout linearLayout, OperaListItem operaListItem, OperaListItem operaListItem2, OperaListItem operaListItem3, OperaListItem operaListItem4, FrameLayout frameLayout, StylingImageButton stylingImageButton, StylingImageButton stylingImageButton2, StylingTextView stylingTextView, StylingTextView stylingTextView2, TextView textView, LinearLayout linearLayout2, ImageView imageView, StylingTextView stylingTextView3, Slider slider) {
        this.a = linearLayout;
        this.b = operaListItem;
        this.c = operaListItem2;
        this.d = operaListItem3;
        this.e = operaListItem4;
        this.f = frameLayout;
        this.g = stylingImageButton;
        this.h = stylingImageButton2;
        this.i = stylingTextView;
        this.j = stylingTextView2;
        this.k = textView;
        this.l = linearLayout2;
        this.m = imageView;
        this.n = stylingTextView3;
        this.o = slider;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        return this.a;
    }
}
