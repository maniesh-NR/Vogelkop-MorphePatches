package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.leanplum.utils.SizeUtil;
import com.opera.android.StatusBarDrawerAppBarLayout;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.BottomIndicatorButton;
import com.opera.android.custom_views.BottomIndicatorButtonGroup;
import com.opera.android.custom_views.DialogTitle;
import com.opera.android.custom_views.FadingNestedScrollView;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.custom_views.VpnProBanner;
import com.opera.android.downloads.DownloadsPanel;
import com.opera.android.settings.BigSwitchButton;
import com.opera.android.settings.SettingsStatisticView;
import com.opera.android.suggestion.adapter.ProductSuggestionListItem;
import com.opera.android.ui.catalog.widget.OperaIconedMessage;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import com.opera.android.ui.catalog.widget.OperaTextView;
import com.opera.android.vpn.LocationButton;
import com.opera.android.widget.GraphView;
import com.opera.android.widget.SelectableRelativeLayout;

/* loaded from: classes.dex */
public final class pt1 implements a5n {
    public final /* synthetic */ byte a;
    public final View b;
    public final View c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final View g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ pt1(ViewGroup viewGroup, View view, View view2, View view3, StylingTextView stylingTextView, StylingTextView stylingTextView2, byte b) {
        this.a = b;
        this.d = viewGroup;
        this.e = view;
        this.f = view2;
        this.g = view3;
        this.c = stylingTextView;
        this.b = stylingTextView2;
    }

    public /* synthetic */ pt1(ViewGroup viewGroup, View view, Object obj, View view2, View view3, View view4, byte b) {
        this.a = b;
        this.d = viewGroup;
        this.e = view;
        this.f = obj;
        this.c = view2;
        this.g = view3;
        this.b = view4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pt1(FrameLayout frameLayout, StylingImageView stylingImageView, StylingImageView stylingImageView2, StylingTextView stylingTextView, CardView cardView, CircularProgressIndicator circularProgressIndicator) {
        this.a = (byte) 9;
        this.b = frameLayout;
        this.e = stylingImageView;
        this.f = stylingImageView2;
        this.c = stylingTextView;
        this.d = cardView;
        this.g = circularProgressIndicator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pt1(FrameLayout frameLayout, OperaMaterialButton operaMaterialButton, StylingTextView stylingTextView, OperaMaterialButton operaMaterialButton2, RecyclerView recyclerView, TextView textView) {
        this.a = (byte) 1;
        this.b = frameLayout;
        this.d = operaMaterialButton;
        this.c = stylingTextView;
        this.e = operaMaterialButton2;
        this.f = recyclerView;
        this.g = textView;
    }

    public /* synthetic */ pt1(FrameLayout frameLayout, Object obj, Object obj2, ViewGroup viewGroup, View view, View view2, byte b) {
        this.a = b;
        this.b = frameLayout;
        this.d = obj;
        this.e = obj2;
        this.f = viewGroup;
        this.c = view;
        this.g = view2;
    }

    public /* synthetic */ pt1(LinearLayout linearLayout, View view, View view2, View view3, View view4, View view5, byte b) {
        this.a = b;
        this.g = linearLayout;
        this.d = view;
        this.e = view2;
        this.f = view3;
        this.c = view4;
        this.b = view5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pt1(LinearLayout linearLayout, LayoutDirectionLinearLayout layoutDirectionLinearLayout, LocationButton locationButton, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, OperaIconedMessage operaIconedMessage, OperaListItem operaListItem) {
        this.a = (byte) 27;
        this.g = linearLayout;
        this.d = locationButton;
        this.e = materialButton;
        this.f = materialButton2;
        this.c = operaIconedMessage;
        this.b = operaListItem;
    }

    public pt1(LinearLayout linearLayout, BigSwitchButton bigSwitchButton, FrameLayout frameLayout, OperaListItem operaListItem, SettingsStatisticView settingsStatisticView, GraphView graphView) {
        this.a = (byte) 17;
        this.g = linearLayout;
        this.d = bigSwitchButton;
        this.b = frameLayout;
        this.e = operaListItem;
        this.f = settingsStatisticView;
        this.c = graphView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pt1(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, StylingTextView stylingTextView, OperaMaterialButton operaMaterialButton, OperaMaterialButton operaMaterialButton2, DialogTitle dialogTitle) {
        this.a = (byte) 11;
        this.d = constraintLayout;
        this.e = constraintLayout2;
        this.c = stylingTextView;
        this.f = operaMaterialButton;
        this.g = operaMaterialButton2;
        this.b = dialogTitle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pt1(ConstraintLayout constraintLayout, StylingImageButton stylingImageButton, StylingImageView stylingImageView, StylingImageButton stylingImageButton2, StylingTextView stylingTextView, StylingTextView stylingTextView2) {
        this.a = (byte) 23;
        this.d = constraintLayout;
        this.f = stylingImageButton;
        this.e = stylingImageView;
        this.g = stylingImageButton2;
        this.c = stylingTextView;
        this.b = stylingTextView2;
    }

    public pt1(ConstraintLayout constraintLayout, StylingImageView stylingImageView, BottomIndicatorButtonGroup bottomIndicatorButtonGroup, StylingImageView stylingImageView2, BottomIndicatorButton bottomIndicatorButton, BottomIndicatorButton bottomIndicatorButton2, ConstraintLayout constraintLayout2) {
        this.a = (byte) 25;
        this.d = constraintLayout;
        this.f = bottomIndicatorButtonGroup;
        this.e = stylingImageView2;
        this.c = bottomIndicatorButton;
        this.g = bottomIndicatorButton2;
        this.b = constraintLayout2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ pt1(ConstraintLayout constraintLayout, Object obj, View view, StylingImageView stylingImageView, StylingTextView stylingTextView, StylingTextView stylingTextView2, byte b) {
        this.a = b;
        this.d = constraintLayout;
        this.f = obj;
        this.g = view;
        this.e = stylingImageView;
        this.c = stylingTextView;
        this.b = stylingTextView2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pt1(ConstraintLayout constraintLayout, zt5 zt5Var, FrameLayout frameLayout, StylingTextView stylingTextView, OperaMaterialButton operaMaterialButton, OperaMaterialButton operaMaterialButton2) {
        this.a = (byte) 4;
        this.d = constraintLayout;
        this.e = zt5Var;
        this.b = frameLayout;
        this.c = stylingTextView;
        this.f = operaMaterialButton;
        this.g = operaMaterialButton2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pt1(CoordinatorLayout coordinatorLayout, StatusBarDrawerAppBarLayout statusBarDrawerAppBarLayout, DownloadsPanel downloadsPanel, FadingRecyclerView fadingRecyclerView, FrameLayout frameLayout, View view) {
        this.a = (byte) 5;
        this.d = coordinatorLayout;
        this.e = statusBarDrawerAppBarLayout;
        this.f = downloadsPanel;
        this.c = fadingRecyclerView;
        this.b = frameLayout;
        this.g = view;
    }

    public pt1(OperaListItem operaListItem, FrameLayout frameLayout, LinearLayout linearLayout, FrameLayout frameLayout2, OperaTextView operaTextView, OperaTextView operaTextView2) {
        this.a = (byte) 12;
        this.d = operaListItem;
        this.b = frameLayout;
        this.g = linearLayout;
        this.e = frameLayout2;
        this.f = operaTextView;
        this.c = operaTextView2;
    }

    public static pt1 a(View view) {
        int i = 2131363149;
        View viewJ = w1h.j(2131363149, view);
        if (viewJ != null) {
            i = 2131363450;
            ImageView imageView = (ImageView) w1h.j(2131363450, view);
            if (imageView != null) {
                i = 2131363451;
                TextView textView = (TextView) w1h.j(2131363451, view);
                if (textView != null) {
                    i = 2131363452;
                    ImageView imageView2 = (ImageView) w1h.j(2131363452, view);
                    if (imageView2 != null) {
                        i = 2131363453;
                        TextView textView2 = (TextView) w1h.j(2131363453, view);
                        if (textView2 != null) {
                            return new pt1((ViewGroup) view, viewJ, (Object) imageView, (View) textView, (View) imageView2, (View) textView2, (byte) 10);
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static pt1 b(View view) {
        int i = 2131362109;
        AppCompatImageView appCompatImageView = (StylingImageButton) w1h.j(2131362109, view);
        if (appCompatImageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = 2131363022;
            AppCompatImageView appCompatImageView2 = (StylingImageButton) w1h.j(2131363022, view);
            if (appCompatImageView2 != null) {
                i = 2131363137;
                AppCompatImageView appCompatImageView3 = (StylingImageButton) w1h.j(2131363137, view);
                if (appCompatImageView3 != null) {
                    i = 2131364043;
                    AppCompatImageView appCompatImageView4 = (StylingImageButton) w1h.j(2131364043, view);
                    if (appCompatImageView4 != null) {
                        i = 2131364044;
                        Space space = (Space) w1h.j(2131364044, view);
                        if (space != null) {
                            return new pt1(linearLayout, (View) appCompatImageView, (View) appCompatImageView2, (View) appCompatImageView3, (View) appCompatImageView4, (View) space, (byte) 14);
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static pt1 c(View view) {
        int i = 2131362362;
        AppCompatImageView appCompatImageView = (StylingImageButton) w1h.j(2131362362, view);
        if (appCompatImageView != null) {
            i = 2131363057;
            TextView textView = (TextView) w1h.j(2131363057, view);
            if (textView != null) {
                i = 2131363461;
                AppCompatImageView appCompatImageView2 = (StylingImageButton) w1h.j(2131363461, view);
                if (appCompatImageView2 != null) {
                    i = 2131363670;
                    AppCompatImageView appCompatImageView3 = (StylingImageButton) w1h.j(2131363670, view);
                    if (appCompatImageView3 != null) {
                        i = 2131363525;
                        TextView textView2 = (TextView) w1h.j(2131363525, view);
                        if (textView2 != null) {
                            return new pt1((ViewGroup) view, (View) appCompatImageView, (Object) textView, (View) appCompatImageView2, (View) appCompatImageView3, (View) textView2, (byte) 22);
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static pt1 d(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(2131558518, (ViewGroup) null, false);
        int i = 2131362433;
        OperaMaterialButton operaMaterialButton = (OperaMaterialButton) w1h.j(2131362433, viewInflate);
        if (operaMaterialButton != null) {
            i = 2131362546;
            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131362546, viewInflate);
            if (stylingTextView != null) {
                i = 2131363387;
                OperaMaterialButton operaMaterialButton2 = (OperaMaterialButton) w1h.j(2131363387, viewInflate);
                if (operaMaterialButton2 != null) {
                    i = 2131364032;
                    RecyclerView recyclerViewJ = w1h.j(2131364032, viewInflate);
                    if (recyclerViewJ != null) {
                        i = 2131364107;
                        if (((LinearLayout) w1h.j(2131364107, viewInflate)) != null) {
                            i = 2131364140;
                            if (((ScrollView) w1h.j(2131364140, viewInflate)) != null) {
                                FrameLayout frameLayout = (FrameLayout) viewInflate;
                                i = 2131363525;
                                TextView textView = (TextView) w1h.j(2131363525, viewInflate);
                                if (textView != null) {
                                    return new pt1(frameLayout, operaMaterialButton, stylingTextView, operaMaterialButton2, recyclerViewJ, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public static pt1 e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131559449, viewGroup, false);
        int i = 2131363249;
        if (((LinearLayout) w1h.j(2131363249, viewInflate)) != null) {
            i = 2131363254;
            AppCompatImageView appCompatImageView = (StylingImageView) w1h.j(2131363254, viewInflate);
            if (appCompatImageView != null) {
                i = 2131363255;
                if (((StylingTextView) w1h.j(2131363255, viewInflate)) != null) {
                    i = 2131363256;
                    AppCompatImageView appCompatImageView2 = (StylingImageView) w1h.j(2131363256, viewInflate);
                    if (appCompatImageView2 != null) {
                        i = 2131363258;
                        AppCompatImageView appCompatImageView3 = (StylingImageButton) w1h.j(2131363258, viewInflate);
                        if (appCompatImageView3 != null) {
                            i = 2131363262;
                            if (((LinearLayout) w1h.j(2131363262, viewInflate)) != null) {
                                i = 2131363263;
                                StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363263, viewInflate);
                                if (stylingTextView != null) {
                                    i = 2131363266;
                                    StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131363266, viewInflate);
                                    if (stylingTextView2 != null) {
                                        return new pt1((ViewGroup) viewInflate, (View) appCompatImageView, (View) appCompatImageView2, (View) appCompatImageView3, stylingTextView, stylingTextView2, (byte) 24);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public static pt1 f(LayoutInflater layoutInflater) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131559194, (ViewGroup) null, false);
        int i = 2131362240;
        View viewJ = w1h.j(2131362240, constraintLayoutInflate);
        if (viewJ != null) {
            pq3 pq3VarA = pq3.a(viewJ);
            i = 2131362422;
            ViewStub viewStub = (ViewStub) w1h.j(2131362422, constraintLayoutInflate);
            if (viewStub != null) {
                i = 2131362594;
                StylingImageView stylingImageView = (StylingImageView) w1h.j(2131362594, constraintLayoutInflate);
                if (stylingImageView != null) {
                    i = 2131363509;
                    StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363509, constraintLayoutInflate);
                    if (stylingTextView != null) {
                        i = 2131364138;
                        if (w1h.j(2131364138, constraintLayoutInflate) != null) {
                            i = 2131364140;
                            if (((FadingNestedScrollView) w1h.j(2131364140, constraintLayoutInflate)) != null) {
                                ConstraintLayout constraintLayout = constraintLayoutInflate;
                                i = 2131363525;
                                DialogTitle dialogTitle = (DialogTitle) w1h.j(2131363525, constraintLayoutInflate);
                                if (dialogTitle != null) {
                                    return new pt1(constraintLayout, (Object) pq3VarA, (View) viewStub, stylingImageView, stylingTextView, (StylingTextView) dialogTitle, (byte) 13);
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        View view = this.g;
        View view2 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                return (ot1) obj;
            case 1:
                return (FrameLayout) view2;
            case 2:
                return (wl3) obj;
            case 3:
                return (ConstraintLayout) obj;
            case 4:
                return (ConstraintLayout) obj;
            case 5:
                return (CoordinatorLayout) obj;
            case 6:
                return (LinearLayout) view;
            case 7:
                return (SelectableRelativeLayout) obj;
            case 8:
                return (FrameLayout) view2;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return (FrameLayout) view2;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return (RelativeLayout) obj;
            case 11:
                return (ConstraintLayout) obj;
            case 12:
                return (OperaListItem) obj;
            case 13:
                return (ConstraintLayout) obj;
            case 14:
                return (LinearLayout) view;
            case 15:
                return (ProductSuggestionListItem) obj;
            case 16:
                return (ConstraintLayout) obj;
            case 17:
                return (LinearLayout) view;
            case SizeUtil.textSize0_1 /* 18 */:
                return (StatusBarDrawingFrameLayout) obj;
            case 19:
                return (LayoutDirectionLinearLayout) obj;
            case SizeUtil.textSize0 /* 20 */:
                return (ConstraintLayout) obj;
            case 21:
                return (FrameLayout) view2;
            case SizeUtil.textSize1 /* 22 */:
                return (ConstraintLayout) obj;
            case 23:
                return (ConstraintLayout) obj;
            case SizeUtil.textSize2 /* 24 */:
                return (SelectableRelativeLayout) obj;
            case 25:
                return (ConstraintLayout) obj;
            case 26:
                return (ConstraintLayout) obj;
            case 27:
                return (LinearLayout) view;
            case 28:
                return (VpnProBanner) obj;
            default:
                return (FrameLayout) view2;
        }
    }
}
