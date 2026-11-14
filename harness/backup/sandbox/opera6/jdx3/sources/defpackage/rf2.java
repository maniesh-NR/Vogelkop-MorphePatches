package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.opera.android.StatusBarDrawerAppBarLayout;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.custom_views.FadingTextView;
import com.opera.android.custom_views.SeparatorView;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.downloads.DownloadFilterChip;
import com.opera.android.downloads.SaveSheet;
import com.opera.android.settings.BigSwitchButton;
import com.opera.android.settings.SettingsStatisticView;
import com.opera.android.ui.catalog.widget.OperaChip;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.widget.GraphView;
import com.opera.android.widget.SideActionsLayout;

/* loaded from: classes.dex */
public final class rf2 implements a5n {
    public final /* synthetic */ byte a;
    public final Object b;
    public final View c;
    public final View d;
    public final View e;
    public final View f;
    public final View g;
    public final View h;
    public final Object i;
    public final View j;
    public final View k;

    public /* synthetic */ rf2(FrameLayout frameLayout, TextView textView, View view, View view2, View view3, View view4, Object obj, View view5, View view6, View view7, byte b) {
        this.a = b;
        this.b = frameLayout;
        this.e = textView;
        this.c = view;
        this.f = view2;
        this.g = view3;
        this.h = view4;
        this.i = obj;
        this.d = view5;
        this.j = view6;
        this.k = view7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rf2(FrameLayout frameLayout, StylingImageView stylingImageView, StylingImageView stylingImageView2, StylingImageView stylingImageView3, StylingImageView stylingImageView4, StylingImageView stylingImageView5, FrameLayout frameLayout2, LinearLayout linearLayout, Space space, Space space2) {
        this.a = (byte) 0;
        this.b = frameLayout;
        this.c = stylingImageView;
        this.f = stylingImageView2;
        this.g = stylingImageView3;
        this.h = stylingImageView4;
        this.i = stylingImageView5;
        this.e = frameLayout2;
        this.d = linearLayout;
        this.j = space;
        this.k = space2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rf2(FrameLayout frameLayout, SaveSheet.FilenameEditText filenameEditText, SideActionsLayout sideActionsLayout, StylingImageView stylingImageView, OperaChip operaChip, StylingTextView stylingTextView, View view, LinearLayout linearLayout, MaterialButton materialButton, FrameLayout frameLayout2) {
        this.a = (byte) 1;
        this.b = frameLayout;
        this.f = filenameEditText;
        this.g = sideActionsLayout;
        this.c = stylingImageView;
        this.h = operaChip;
        this.i = stylingTextView;
        this.j = view;
        this.d = linearLayout;
        this.k = materialButton;
        this.e = frameLayout2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rf2(LinearLayout linearLayout, OperaListItem operaListItem, OperaListItem operaListItem2, SettingsStatisticView settingsStatisticView, BigSwitchButton bigSwitchButton, OperaListItem operaListItem3, SeparatorView separatorView, SeparatorView separatorView2, FrameLayout frameLayout, GraphView graphView) {
        this.a = (byte) 6;
        this.d = linearLayout;
        this.e = operaListItem;
        this.c = operaListItem2;
        this.f = settingsStatisticView;
        this.g = bigSwitchButton;
        this.h = operaListItem3;
        this.i = separatorView;
        this.j = separatorView2;
        this.b = frameLayout;
        this.k = graphView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rf2(LinearLayout linearLayout, g7d g7dVar, StylingTextView stylingTextView, StylingImageButton stylingImageButton, CircularProgressIndicator circularProgressIndicator, StylingImageButton stylingImageButton2, OperaChip operaChip, CardView cardView, FadingTextView fadingTextView, OperaChip operaChip2) {
        this.a = (byte) 5;
        this.d = linearLayout;
        this.b = g7dVar;
        this.e = stylingTextView;
        this.c = stylingImageButton;
        this.f = circularProgressIndicator;
        this.g = stylingImageButton2;
        this.h = operaChip;
        this.i = cardView;
        this.j = fadingTextView;
        this.k = operaChip2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rf2(CoordinatorLayout coordinatorLayout, DownloadFilterChip downloadFilterChip, StatusBarDrawerAppBarLayout statusBarDrawerAppBarLayout, LinearLayout linearLayout, FloatingActionButton floatingActionButton, DownloadFilterChip downloadFilterChip2, FadingRecyclerView fadingRecyclerView, View view, Toolbar toolbar, DownloadFilterChip downloadFilterChip3) {
        this.a = (byte) 3;
        this.b = coordinatorLayout;
        this.e = downloadFilterChip;
        this.c = statusBarDrawerAppBarLayout;
        this.d = linearLayout;
        this.f = floatingActionButton;
        this.g = downloadFilterChip2;
        this.h = fadingRecyclerView;
        this.i = view;
        this.j = toolbar;
        this.k = downloadFilterChip3;
    }

    public static rf2 a(View view) {
        int i = 2131362042;
        DownloadFilterChip downloadFilterChip = (DownloadFilterChip) w1h.j(2131362042, view);
        if (downloadFilterChip != null) {
            i = 2131362059;
            StatusBarDrawerAppBarLayout statusBarDrawerAppBarLayout = (StatusBarDrawerAppBarLayout) w1h.j(2131362059, view);
            if (statusBarDrawerAppBarLayout != null) {
                i = 2131362316;
                LinearLayout linearLayout = (LinearLayout) w1h.j(2131362316, view);
                if (linearLayout != null) {
                    i = 2131362317;
                    if (((ChipGroup) w1h.j(2131362317, view)) != null) {
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                        i = 2131362835;
                        FloatingActionButton floatingActionButtonJ = w1h.j(2131362835, view);
                        if (floatingActionButtonJ != null) {
                            i = 2131363151;
                            if (((HorizontalScrollView) w1h.j(2131363151, view)) != null) {
                                i = 2131363789;
                                DownloadFilterChip downloadFilterChip2 = (DownloadFilterChip) w1h.j(2131363789, view);
                                if (downloadFilterChip2 != null) {
                                    i = 2131364032;
                                    FadingRecyclerView fadingRecyclerView = (FadingRecyclerView) w1h.j(2131364032, view);
                                    if (fadingRecyclerView != null) {
                                        i = 2131364164;
                                        View viewJ = w1h.j(2131364164, view);
                                        if (viewJ != null) {
                                            i = 2131364794;
                                            Toolbar toolbarJ = w1h.j(2131364794, view);
                                            if (toolbarJ != null) {
                                                i = 2131365087;
                                                DownloadFilterChip downloadFilterChip3 = (DownloadFilterChip) w1h.j(2131365087, view);
                                                if (downloadFilterChip3 != null) {
                                                    return new rf2(coordinatorLayout, downloadFilterChip, statusBarDrawerAppBarLayout, linearLayout, floatingActionButtonJ, downloadFilterChip2, fadingRecyclerView, viewJ, toolbarJ, downloadFilterChip3);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        View view = this.d;
        Object obj = this.b;
        switch (b) {
        }
        return (LinearLayout) view;
    }
}
