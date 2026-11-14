package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.opera.android.custom_views.EqualWidthLinearLayout;
import com.opera.android.custom_views.ObservableEditText;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.custom_views.TabCountButton;
import com.opera.android.tabui2.ConfigurationProvidingFrameLayout;
import com.opera.android.tabui2.FadeoutRecyclerView;
import com.opera.android.tabui2.TabGalleryButtonContainer;
import com.opera.android.tabui2.TabUiRootFrameLayout;
import com.opera.android.ui.catalog.widget.OperaTextView;

/* loaded from: classes.dex */
public final class ebl implements a5n {
    public final FloatingActionButton A;
    public final TabCountButton B;
    public final RelativeLayout C;
    public final TabUiRootFrameLayout a;
    public final EqualWidthLinearLayout b;
    public final StylingImageButton c;
    public final StylingImageButton d;
    public final StylingImageButton e;
    public final ConfigurationProvidingFrameLayout f;
    public final FadeoutRecyclerView g;
    public final RecyclerView h;
    public final RecyclerView i;
    public final FadeoutRecyclerView j;
    public final FrameLayout k;
    public final FrameLayout l;
    public final StylingImageButton m;
    public final StylingImageButton n;
    public final ObservableEditText o;
    public final StylingImageButton p;
    public final RelativeLayout q;
    public final RelativeLayout r;
    public final StylingImageButton s;
    public final OperaTextView t;
    public final StylingImageButton u;
    public final StylingImageButton v;
    public final TabUiRootFrameLayout w;
    public final StylingTextView x;
    public final StylingTextView y;
    public final TabGalleryButtonContainer z;

    public ebl(TabUiRootFrameLayout tabUiRootFrameLayout, EqualWidthLinearLayout equalWidthLinearLayout, StylingImageButton stylingImageButton, StylingImageButton stylingImageButton2, StylingImageButton stylingImageButton3, ConfigurationProvidingFrameLayout configurationProvidingFrameLayout, FadeoutRecyclerView fadeoutRecyclerView, RecyclerView recyclerView, RecyclerView recyclerView2, FadeoutRecyclerView fadeoutRecyclerView2, FrameLayout frameLayout, FrameLayout frameLayout2, StylingImageButton stylingImageButton4, StylingImageButton stylingImageButton5, StylingImageButton stylingImageButton6, ObservableEditText observableEditText, StylingImageButton stylingImageButton7, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, StylingImageButton stylingImageButton8, OperaTextView operaTextView, StylingImageButton stylingImageButton9, StylingImageButton stylingImageButton10, TabUiRootFrameLayout tabUiRootFrameLayout2, StylingTextView stylingTextView, StylingTextView stylingTextView2, TabGalleryButtonContainer tabGalleryButtonContainer, FloatingActionButton floatingActionButton, TabCountButton tabCountButton, RelativeLayout relativeLayout3) {
        this.a = tabUiRootFrameLayout;
        this.b = equalWidthLinearLayout;
        this.c = stylingImageButton;
        this.d = stylingImageButton2;
        this.e = stylingImageButton3;
        this.f = configurationProvidingFrameLayout;
        this.g = fadeoutRecyclerView;
        this.h = recyclerView;
        this.i = recyclerView2;
        this.j = fadeoutRecyclerView2;
        this.k = frameLayout;
        this.l = frameLayout2;
        this.m = stylingImageButton4;
        this.n = stylingImageButton5;
        this.o = observableEditText;
        this.p = stylingImageButton7;
        this.q = relativeLayout;
        this.r = relativeLayout2;
        this.s = stylingImageButton8;
        this.t = operaTextView;
        this.u = stylingImageButton9;
        this.v = stylingImageButton10;
        this.w = tabUiRootFrameLayout2;
        this.x = stylingTextView;
        this.y = stylingTextView2;
        this.z = tabGalleryButtonContainer;
        this.A = floatingActionButton;
        this.B = tabCountButton;
        this.C = relativeLayout3;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        return this.a;
    }
}
