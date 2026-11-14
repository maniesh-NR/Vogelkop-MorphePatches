package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.opera.android.browser.OperaPageRootView;
import com.opera.android.custom_views.FadingScrollView;
import com.opera.android.custom_views.MakeOperaDefaultBanner;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.media.MediaPlayerMini;
import com.opera.android.settings.speed_dial.SpeedDialShapePreview;
import com.opera.android.sheet.VelocityTrackingCoordinatorLayout;
import com.opera.android.ui.catalog.widget.OperaIconedMessage;
import com.opera.android.webaiassistant.WebAiAssistantLayoutSwitcher;
import com.opera.android.webaiassistant.WebAiAssistantSheetContentWrapper;
import com.opera.android.webcore.FastResizeWebViewContainer;
import com.opera.android.widget.MeasurableHeightScrollView;

/* loaded from: classes.dex */
public final class ei implements a5n {
    public final /* synthetic */ byte a;
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final View e;
    public final Object f;
    public final View g;
    public final View h;
    public final View i;

    public /* synthetic */ ei(ViewGroup viewGroup, View view, View view2, View view3, View view4, View view5, View view6, View view7, byte b) {
        this.a = b;
        this.b = viewGroup;
        this.c = view;
        this.d = view2;
        this.e = view3;
        this.f = view4;
        this.g = view5;
        this.h = view6;
        this.i = view7;
    }

    public ei(ConstraintLayout constraintLayout, ViewStub viewStub, FrameLayout frameLayout, StylingImageView stylingImageView, TextView textView, View view, View view2, TextView textView2) {
        this.a = (byte) 3;
        this.b = constraintLayout;
        this.c = viewStub;
        this.d = frameLayout;
        this.f = stylingImageView;
        this.i = textView;
        this.e = view;
        this.g = view2;
        this.h = textView2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ei(ConstraintLayout constraintLayout, FloatingActionButton floatingActionButton, PreviewView previewView, StylingImageView stylingImageView, TextView textView, StylingImageView stylingImageView2, StylingImageView stylingImageView3, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3) {
        this.a = (byte) 0;
        this.b = constraintLayout;
        this.e = floatingActionButton;
        this.f = stylingImageView;
        this.i = textView;
        this.g = stylingImageView2;
        this.h = stylingImageView3;
        this.c = constraintLayout2;
        this.d = constraintLayout3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ei(ConstraintLayout constraintLayout, StylingImageView stylingImageView, StylingTextView stylingTextView, StylingTextView stylingTextView2, Group group, FadingScrollView fadingScrollView, MaterialButton materialButton, TextSwitcher textSwitcher) {
        this.a = (byte) 9;
        this.b = constraintLayout;
        this.f = stylingImageView;
        this.c = stylingTextView;
        this.d = stylingTextView2;
        this.e = group;
        this.g = fadingScrollView;
        this.h = materialButton;
        this.i = textSwitcher;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ei(MakeOperaDefaultBanner makeOperaDefaultBanner, StylingImageButton stylingImageButton, StylingImageView stylingImageView, MaterialButton materialButton, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.a = (byte) 6;
        this.b = makeOperaDefaultBanner;
        this.c = stylingImageButton;
        this.f = stylingImageView;
        this.d = materialButton;
        this.i = textView;
        this.e = textView2;
        this.g = textView3;
        this.h = textView4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ei(SpeedDialShapePreview speedDialShapePreview, View view, View view2, View view3, View view4, View view5, View view6, ConstraintLayout constraintLayout, TextView textView) {
        this.a = (byte) 12;
        this.c = speedDialShapePreview;
        this.d = view;
        this.e = view2;
        this.f = view3;
        this.g = view4;
        this.h = view5;
        this.i = view6;
        this.b = constraintLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ei(VelocityTrackingCoordinatorLayout velocityTrackingCoordinatorLayout, WebAiAssistantSheetContentWrapper webAiAssistantSheetContentWrapper, MeasurableHeightScrollView measurableHeightScrollView, ConstraintLayout constraintLayout, rvg rvgVar, WebAiAssistantLayoutSwitcher webAiAssistantLayoutSwitcher, View view, FastResizeWebViewContainer fastResizeWebViewContainer) {
        this.a = (byte) 2;
        this.c = velocityTrackingCoordinatorLayout;
        this.d = webAiAssistantSheetContentWrapper;
        this.e = measurableHeightScrollView;
        this.b = constraintLayout;
        this.f = rvgVar;
        this.g = webAiAssistantLayoutSwitcher;
        this.h = view;
        this.i = fastResizeWebViewContainer;
    }

    public ei(OperaIconedMessage operaIconedMessage, LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, TextView textView, MaterialButton materialButton, MaterialButton materialButton2, TextView textView2) {
        this.a = (byte) 8;
        this.b = operaIconedMessage;
        this.c = linearLayout;
        this.d = linearLayout2;
        this.e = imageView;
        this.i = textView;
        this.f = materialButton;
        this.g = materialButton2;
        this.h = textView2;
    }

    public static ei a(View view) {
        int i = 2131362110;
        StylingImageView stylingImageView = (StylingImageView) w1h.j(2131362110, view);
        if (stylingImageView != null) {
            i = 2131362363;
            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131362363, view);
            if (stylingTextView != null) {
                i = 2131362822;
                StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131362822, view);
                if (stylingTextView2 != null) {
                    i = 2131363012;
                    if (w1h.j(2131363012, view) != null) {
                        i = 2131363025;
                        if (w1h.j(2131363025, view) != null) {
                            i = 2131363093;
                            if (w1h.j(2131363093, view) != null) {
                                i = 2131363200;
                                Group groupJ = w1h.j(2131363200, view);
                                if (groupJ != null) {
                                    i = 2131363201;
                                    if (((StylingImageView) w1h.j(2131363201, view)) != null) {
                                        i = 2131363202;
                                        if (((TextView) w1h.j(2131363202, view)) != null) {
                                            i = 2131363518;
                                            if (((Space) w1h.j(2131363518, view)) != null) {
                                                i = 2131364140;
                                                FadingScrollView fadingScrollView = (FadingScrollView) w1h.j(2131364140, view);
                                                if (fadingScrollView != null) {
                                                    i = 2131364144;
                                                    if (w1h.j(2131364144, view) != null) {
                                                        i = 2131364465;
                                                        MaterialButton materialButtonJ = w1h.j(2131364465, view);
                                                        if (materialButtonJ != null) {
                                                            i = 2131364969;
                                                            TextSwitcher textSwitcher = (TextSwitcher) w1h.j(2131364969, view);
                                                            if (textSwitcher != null) {
                                                                return new ei((ConstraintLayout) view, stylingImageView, stylingTextView, stylingTextView2, groupJ, fadingScrollView, materialButtonJ, textSwitcher);
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
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        ConstraintLayout constraintLayout = this.c;
        CardView cardView = this.b;
        switch (b) {
            case 0:
                return (ConstraintLayout) cardView;
            case 1:
                return (OperaPageRootView) cardView;
            case 2:
                return (VelocityTrackingCoordinatorLayout) constraintLayout;
            case 3:
                return (ConstraintLayout) cardView;
            case 4:
                return (CoordinatorLayout) cardView;
            case 5:
                return (LinearLayout) cardView;
            case 6:
                return (MakeOperaDefaultBanner) cardView;
            case 7:
                return (MediaPlayerMini) cardView;
            case 8:
                return (OperaIconedMessage) cardView;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return (ConstraintLayout) cardView;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return (LinearLayout) cardView;
            case 11:
                return (LinearLayout) cardView;
            default:
                return (SpeedDialShapePreview) constraintLayout;
        }
    }
}
