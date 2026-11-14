package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.opera.android.StatusBarDrawerAppBarLayout;
import com.opera.android.custom_views.AnimationEmptyListView;
import com.opera.android.custom_views.DialogTitle;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.custom_views.FadingScrollView;
import com.opera.android.custom_views.LayoutDirectionRelativeLayout;
import com.opera.android.custom_views.OperaButtonBarLayout;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.startpage.livescore.LiveScoreAudioCommentaryView;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import com.opera.android.widget.GraphView;
import com.opera.android.widget.RecyclerViewEmptyViewSwitcher;

/* loaded from: classes.dex */
public final class y83 implements a5n {
    public final /* synthetic */ byte a;
    public final ViewGroup b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public /* synthetic */ y83(View view, LiveScoreAudioCommentaryView liveScoreAudioCommentaryView, ConstraintLayout constraintLayout, StylingTextView stylingTextView, Object obj, Object obj2, mlc mlcVar, byte b) {
        this.a = b;
        this.g = view;
        this.b = liveScoreAudioCommentaryView;
        this.c = constraintLayout;
        this.d = stylingTextView;
        this.e = obj;
        this.f = obj2;
        this.h = mlcVar;
    }

    public /* synthetic */ y83(ViewGroup viewGroup, Object obj, Object obj2, View view, View view2, Object obj3, View view3, byte b) {
        this.a = b;
        this.b = viewGroup;
        this.c = obj;
        this.d = obj2;
        this.e = view;
        this.f = view2;
        this.g = obj3;
        this.h = view3;
    }

    public y83(LinearLayout linearLayout, TextView textView, View view, StylingImageView stylingImageView, FrameLayout frameLayout, CircularProgressIndicator circularProgressIndicator, TextView textView2) {
        this.a = (byte) 11;
        this.b = linearLayout;
        this.c = textView;
        this.g = view;
        this.d = stylingImageView;
        this.e = frameLayout;
        this.h = circularProgressIndicator;
        this.f = textView2;
    }

    public y83(LinearLayout linearLayout, OperaListItem operaListItem, LayoutDirectionRelativeLayout layoutDirectionRelativeLayout, StylingTextView stylingTextView, StylingTextView stylingTextView2, StylingTextView stylingTextView3, GraphView graphView, MaterialButton materialButton) {
        this.a = (byte) 1;
        this.b = linearLayout;
        this.c = operaListItem;
        this.d = layoutDirectionRelativeLayout;
        this.e = stylingTextView;
        this.f = stylingTextView2;
        this.g = stylingTextView3;
        this.h = graphView;
    }

    public static y83 a(View view) {
        int i = 2131362041;
        StatusBarDrawerAppBarLayout statusBarDrawerAppBarLayout = (StatusBarDrawerAppBarLayout) w1h.j(2131362041, view);
        if (statusBarDrawerAppBarLayout != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
            i = 2131362684;
            AnimationEmptyListView animationEmptyListView = (AnimationEmptyListView) w1h.j(2131362684, view);
            if (animationEmptyListView != null) {
                i = 2131362692;
                RecyclerViewEmptyViewSwitcher recyclerViewEmptyViewSwitcher = (RecyclerViewEmptyViewSwitcher) w1h.j(2131362692, view);
                if (recyclerViewEmptyViewSwitcher != null) {
                    i = 2131364014;
                    RecyclerView recyclerView = (FadingRecyclerView) w1h.j(2131364014, view);
                    if (recyclerView != null) {
                        i = 2131364164;
                        View viewJ = w1h.j(2131364164, view);
                        if (viewJ != null) {
                            i = 2131364525;
                            CircularProgressIndicator circularProgressIndicatorJ = w1h.j(2131364525, view);
                            if (circularProgressIndicatorJ != null) {
                                i = 2131364794;
                                if (w1h.j(2131364794, view) != null) {
                                    return new y83((ViewGroup) coordinatorLayout, (Object) statusBarDrawerAppBarLayout, (Object) animationEmptyListView, (View) recyclerViewEmptyViewSwitcher, (View) recyclerView, (Object) viewJ, (View) circularProgressIndicatorJ, (byte) 0);
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

    public static y83 b(View view) {
        int i = 2131363715;
        View viewJ = w1h.j(2131363715, view);
        if (viewJ != null) {
            or2 or2VarB = or2.b(viewJ);
            i = 2131363716;
            View viewJ2 = w1h.j(2131363716, view);
            if (viewJ2 != null) {
                or2 or2VarB2 = or2.b(viewJ2);
                i = 2131363717;
                ConstraintLayout constraintLayoutJ = w1h.j(2131363717, view);
                if (constraintLayoutJ != null) {
                    i = 2131363718;
                    TextView textView = (TextView) w1h.j(2131363718, view);
                    if (textView != null) {
                        i = 2131363725;
                        View viewJ3 = w1h.j(2131363725, view);
                        if (viewJ3 != null) {
                            or2 or2VarB3 = or2.b(viewJ3);
                            i = 2131363973;
                            ImageView imageView = (ImageView) w1h.j(2131363973, view);
                            if (imageView != null) {
                                return new y83((ViewGroup) view, (Object) or2VarB, (Object) or2VarB2, (View) constraintLayoutJ, (View) textView, (Object) or2VarB3, (View) imageView, (byte) 5);
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static y83 c(View view) {
        int i = 2131362230;
        if (((OperaButtonBarLayout) w1h.j(2131362230, view)) != null) {
            i = 2131362422;
            ViewStub viewStub = (ViewStub) w1h.j(2131362422, view);
            if (viewStub != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = 2131362594;
                StylingImageView stylingImageView = (StylingImageView) w1h.j(2131362594, view);
                if (stylingImageView != null) {
                    i = 2131363509;
                    yq1 yq1Var = (StylingTextView) w1h.j(2131363509, view);
                    if (yq1Var != null) {
                        i = 2131363659;
                        MaterialButton materialButton = (OperaMaterialButton) w1h.j(2131363659, view);
                        if (materialButton != null) {
                            i = 2131363917;
                            OperaMaterialButton operaMaterialButton = (OperaMaterialButton) w1h.j(2131363917, view);
                            if (operaMaterialButton != null) {
                                i = 2131364140;
                                if (((FadingScrollView) w1h.j(2131364140, view)) != null) {
                                    i = 2131364511;
                                    if (((Space) w1h.j(2131364511, view)) != null) {
                                        i = 2131363525;
                                        yq1 yq1Var2 = (DialogTitle) w1h.j(2131363525, view);
                                        if (yq1Var2 != null) {
                                            return new y83((ViewGroup) constraintLayout, (Object) viewStub, (Object) stylingImageView, (View) yq1Var, (View) materialButton, (Object) operaMaterialButton, (View) yq1Var2, (byte) 6);
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

    public static y83 d(View view) {
        int i = 2131362248;
        TextView textView = (TextView) w1h.j(2131362248, view);
        if (textView != null) {
            i = 2131362548;
            View viewJ = w1h.j(2131362548, view);
            if (viewJ != null) {
                i = 2131362594;
                StylingImageView stylingImageView = (StylingImageView) w1h.j(2131362594, view);
                if (stylingImageView != null) {
                    i = 2131363173;
                    FrameLayout frameLayout = (FrameLayout) w1h.j(2131363173, view);
                    if (frameLayout != null) {
                        i = 2131363953;
                        CircularProgressIndicator circularProgressIndicatorJ = w1h.j(2131363953, view);
                        if (circularProgressIndicatorJ != null) {
                            i = 2131363525;
                            TextView textView2 = (TextView) w1h.j(2131363525, view);
                            if (textView2 != null) {
                                return new y83((LinearLayout) view, textView, viewJ, stylingImageView, frameLayout, circularProgressIndicatorJ, textView2);
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static y83 e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d(layoutInflater.inflate(2131559317, viewGroup, false));
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        Object obj = this.g;
        ConstraintLayout constraintLayout = this.b;
        switch (b) {
        }
        return (LinearLayout) constraintLayout;
    }
}
