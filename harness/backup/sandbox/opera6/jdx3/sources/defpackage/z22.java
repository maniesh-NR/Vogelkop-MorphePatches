package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.opera.android.BrowserActivity;
import com.opera.android.FullscreenWebActivity;
import com.opera.android.bar.BottomBar;
import com.opera.android.browser.chromium.ChromiumContainerView;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.custom_views.BottomIndicatorButton;
import com.opera.android.custom_views.BottomIndicatorButtonGroup;
import com.opera.android.custom_views.DropShadowFrameLayout;
import com.opera.android.widget.UrlFieldEditText;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final /* synthetic */ class z22 implements View.OnLayoutChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z22(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height;
        int paddingBottom;
        int i9;
        int height2;
        int height3;
        byte b = this.a;
        byte b2 = 3;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((i22) obj).invoke();
                break;
            case 1:
                ((ql2) obj).a();
                break;
            case 2:
                BottomIndicatorButtonGroup bottomIndicatorButtonGroup = (BottomIndicatorButtonGroup) obj;
                PathInterpolator pathInterpolator = BottomIndicatorButtonGroup.i;
                if (((BottomIndicatorButton) view).isSelected()) {
                    bottomIndicatorButtonGroup.b();
                    break;
                }
                break;
            case 3:
                BrowserActivity browserActivity = (BrowserActivity) obj;
                jp3 jp3Var = browserActivity.H;
                if (jp3Var == null) {
                    jp3Var = null;
                }
                kp3 kp3Var = (kp3) ((rlh) jp3Var.d).a.getValue();
                BottomBar bottomBar = browserActivity.A;
                if (bottomBar == null) {
                    bottomBar = null;
                }
                if (bottomBar instanceof lp3) {
                    no3 no3Var = kp3Var.a;
                    if (!no3Var.a && !no3Var.b && !no3Var.c) {
                        height = view.getHeight();
                        paddingBottom = view.getPaddingBottom();
                        i9 = height - paddingBottom;
                    }
                    i9 = 0;
                } else {
                    jvj jvjVar = browserActivity.D;
                    if (jvjVar == null) {
                        jvjVar = null;
                    }
                    if (jvjVar.d) {
                        height = view.getHeight();
                        paddingBottom = view.getPaddingBottom();
                        i9 = height - paddingBottom;
                    }
                    i9 = 0;
                }
                BottomBar bottomBar2 = browserActivity.A;
                int iMax = Math.max(0, i9 - (bottomBar2 != null ? bottomBar2 : null).d());
                ChromiumContainerView chromiumContainerViewE0 = browserActivity.e0();
                zy4 zy4Var = chromiumContainerViewE0.b;
                if (zy4Var.f != iMax) {
                    zy4Var.f = iMax;
                    zy4Var.S();
                    ChromiumContent chromiumContent = chromiumContainerViewE0.e;
                    if (chromiumContent != null && !chromiumContent.h()) {
                        chromiumContainerViewE0.e.A(zy4Var.Q());
                    }
                    if (zy4Var.q == 3) {
                        chromiumContainerViewE0.a(zy4Var.R());
                        break;
                    }
                }
                break;
            case 4:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    view.post(new lb4(carouselLayoutManager, b2));
                    break;
                }
                break;
            case 5:
                o85 o85Var = (o85) obj;
                pde pdeVar = o85Var.d;
                p85 p85Var = o85Var.a;
                ConstraintLayout constraintLayout = p85Var.e;
                int height4 = constraintLayout.getHeight();
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int paddingTop = (height4 + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0)) - ((DropShadowFrameLayout) p85Var.m).getPaddingTop();
                n85 n85Var = o85Var.n;
                xf8.F0(pdeVar, Integer.valueOf(paddingTop + (n85Var.e ? n85Var.d - n85Var.a.getHeight() : 0)));
                break;
            case 6:
                hi7 hi7Var = (hi7) obj;
                int i10 = i3 - i;
                int i11 = i4 - i2;
                int i12 = i7 - i5;
                int i13 = i8 - i6;
                Point point = hi7Var.h;
                ni7 ni7Var = hi7Var.i;
                igi igiVar = hi7Var.e;
                if (i10 != i12 || i11 != i13) {
                    if (i12 != 0 || i13 != 0) {
                        Point point2 = hi7Var.m;
                        if (point2 == null) {
                            View view2 = (View) igiVar.e;
                            int left = view2.getLeft();
                            int top = view2.getTop();
                            ni7Var.b(view2.getLeft(), view2.getTop());
                            if (view2.getLeft() != left || view2.getTop() != top) {
                                hi7Var.m = new Point(left, top);
                                break;
                            }
                        } else {
                            ni7Var.b(point2.x, point2.y);
                            break;
                        }
                    } else {
                        ni7Var.b(point.x, point.y);
                        hi7Var.m = point;
                        break;
                    }
                }
                break;
            case 7:
                FullscreenWebActivity fullscreenWebActivity = (FullscreenWebActivity) obj;
                HashSet hashSet = FullscreenWebActivity.I;
                int height5 = view.getHeight();
                if (height5 != fullscreenWebActivity.H) {
                    fullscreenWebActivity.H = height5;
                    fullscreenWebActivity.d0(fullscreenWebActivity.G);
                    break;
                }
                break;
            case 8:
                ota otaVar = (ota) obj;
                if (i != i5 || i2 != i6) {
                    otaVar.b();
                    break;
                }
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                view.post(new ld9((x79) obj, (byte) 27));
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                int i14 = f0e.h;
                ((f0e) obj).U();
                break;
            case 11:
                vml.c(new yqd((rhj) obj, (byte) 6));
                break;
            case 12:
                uig uigVar = (uig) obj;
                int i15 = uigVar.r;
                PopupWindow popupWindow = uigVar.q;
                int i16 = i4 - i2;
                int i17 = i8 - i6;
                if ((i3 - i != i7 - i5 || i16 != i17) && popupWindow.isShowing()) {
                    uigVar.r();
                    popupWindow.update(view, (uigVar.getWidth() - popupWindow.getWidth()) - i15, (-popupWindow.getHeight()) - i15, -1, -1);
                    break;
                }
                break;
            case 13:
                zig zigVar = (zig) obj;
                uig uigVar2 = zigVar.a;
                int width = (uigVar2.getWidth() - uigVar2.getPaddingLeft()) - uigVar2.getPaddingRight();
                int height6 = (uigVar2.getHeight() - uigVar2.getPaddingBottom()) - uigVar2.getPaddingTop();
                ViewGroup viewGroup = zigVar.d;
                int iB = zig.b(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                int paddingBottom2 = height2 - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int iMax2 = Math.max(iB, zig.b(zigVar.l) + zig.b(zigVar.j));
                ViewGroup viewGroup2 = zigVar.e;
                if (viewGroup2 == null) {
                    height3 = 0;
                } else {
                    height3 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams3 = viewGroup2.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        height3 += marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin;
                    }
                }
                boolean z = width <= iMax2 || height6 <= paddingBottom2 + (height3 << 1);
                if (zigVar.B != z) {
                    zigVar.B = z;
                    view.post(new vig(zigVar, (byte) 1));
                }
                boolean z2 = i3 - i != i7 - i5;
                if (!zigVar.B && z2) {
                    view.post(new vig(zigVar, (byte) 2));
                    break;
                }
                break;
            case 14:
                PreviewView previewView = (PreviewView) obj;
                int i18 = PreviewView.p;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    previewView.b();
                    previewView.a(true);
                    break;
                }
                break;
            case 15:
                vml.c(new mni(((uvi) obj).a, b2));
                break;
            case 16:
                ((v4k) obj).b();
                break;
            case 17:
                uuj uujVar = (uuj) obj;
                int i19 = uujVar.a;
                ArrayList arrayList = (ArrayList) uujVar.c;
                int size = arrayList.size();
                int i20 = 0;
                while (i20 < size) {
                    Object obj2 = arrayList.get(i20);
                    i20++;
                    wwl wwlVar = (wwl) obj2;
                    AppCompatImageView appCompatImageView = wwlVar.a;
                    int width2 = i19 - appCompatImageView.getWidth();
                    if (width2 < 0) {
                        width2 = 0;
                    }
                    int i21 = width2 / 2;
                    int height7 = i19 - appCompatImageView.getHeight();
                    if (height7 < 0) {
                        height7 = 0;
                    }
                    int i22 = height7 / 2;
                    wwlVar.b.set(appCompatImageView.getLeft() - i21, appCompatImageView.getTop() - i22, appCompatImageView.getRight() + i21, appCompatImageView.getBottom() + i22);
                }
                break;
            default:
                wtm wtmVar = (wtm) obj;
                n2n n2nVar = (n2n) ((zyk) wtmVar.c).getValue();
                bq1 bq1Var = (UrlFieldEditText) wtmVar.b;
                n2nVar.a.set(new Rect(bq1Var.getLeft(), 0, bq1Var.getRight(), ((ConstraintLayout) wtmVar.a).getLayoutParams().height));
                break;
        }
    }
}
