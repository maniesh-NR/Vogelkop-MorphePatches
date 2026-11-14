package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.widget.GradientSlider;
import com.opera.android.widget.MenuSettingsListItem;

/* loaded from: classes.dex */
public final class v8n implements r8n {
    public static final int[] d = {R.attr.background};
    public static final int[] e = {2130970152};
    public static final int[] f = {R.attr.dropDownSelector};
    public static final int[] g = {R.attr.popupBackground};
    public static final int[] h = {2130971181};
    public static final int[] i = {2130969949};
    public static final int[] j = {2130969565};
    public static final int[] k = {2130969559};
    public static final int[] l = {R.attr.foreground};
    public static final int[] m = {R.attr.foregroundTint};
    public static final int[] n = {2130971200};
    public static final int[] o = {2130971189};
    public static final int[] p = {2130971181};
    public static final int[] q = {2130969949};
    public static final int[] r = {2130968917};
    public static final int[] s = {2130968871};
    public static final int[] t = {2130970702};
    public static final int[] u = {2130970700};
    public static final int[] v = {2130969330};
    public static final int[] w = {2130969303};
    public static final int[] x = {2130971241};
    public static final int[] y = {2130971240};
    public final /* synthetic */ byte a;
    public final ff2 b;
    public final ff2 c;

    public /* synthetic */ v8n(ff2 ff2Var, ff2 ff2Var2, byte b) {
        this.a = b;
        this.b = ff2Var;
        this.c = ff2Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v18, types: [android.view.View, com.opera.android.widget.GradientSlider] */
    @Override // defpackage.r8n
    public final void a(View view) throws NumberFormatException {
        TypedValue typedValueC;
        ColorStateList colorStateListF;
        TypedValue typedValueC2;
        Drawable drawableH;
        TypedValue typedValueC3;
        TypedValue typedValueC4;
        TypedValue typedValueC5;
        TypedValue typedValueC6;
        TypedValue typedValueC7;
        TypedValue typedValueC8;
        TypedValue typedValueC9;
        ColorStateList colorStateListF2;
        TypedValue typedValueC10;
        ColorStateList colorStateListF3;
        TypedValue typedValueC11;
        TypedValue typedValueC12;
        TypedValue typedValueC13;
        TypedValue typedValueC14;
        ColorStateList colorStateListF4;
        ColorStateList colorStateListF5;
        TypedValue typedValueC15;
        TypedValue typedValueC16;
        int defaultColor;
        TypedValue typedValueC17;
        TypedValue typedValueC18;
        byte b = this.a;
        ff2 ff2Var = this.c;
        ff2 ff2Var2 = this.b;
        switch (b) {
            case 0:
                appBarLayoutH = view instanceof AppBarLayout ? (AppBarLayout) view : null;
                if (appBarLayoutH != null) {
                    if (ff2Var != null && (typedValueC2 = ff2Var.c(appBarLayoutH.getContext())) != null && (drawableH = ff2.h(appBarLayoutH.getContext(), typedValueC2)) != null) {
                        q9n.B(appBarLayoutH, drawableH);
                    }
                    if (ff2Var2 != null && (typedValueC = ff2Var2.c(appBarLayoutH.getContext())) != null && (colorStateListF = ff2.f(appBarLayoutH.getContext(), typedValueC)) != null) {
                        if (appBarLayoutH.m != colorStateListF) {
                            appBarLayoutH.m = colorStateListF;
                            appBarLayoutH.setBackground(appBarLayoutH.getBackground());
                        }
                        Drawable background = appBarLayoutH.getBackground();
                        if (appBarLayoutH.k && (background instanceof zdd)) {
                            ((zdd) background).u(colorStateListF);
                            break;
                        }
                    }
                }
                break;
            case 1:
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) view;
                Context context = autoCompleteTextView.getContext();
                Drawable drawableH2 = (ff2Var == null || (typedValueC4 = ff2Var.c(context)) == null) ? null : ff2.h(context, typedValueC4);
                if (drawableH2 != null) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(drawableH2);
                }
                Object objH = mzg.h(autoCompleteTextView, "mPopup");
                ListPopupWindow listPopupWindow = (objH == null || !(objH instanceof ListPopupWindow)) ? null : (ListPopupWindow) objH;
                if (listPopupWindow != null) {
                    if (ff2Var2 != null && (typedValueC3 = ff2Var2.c(context)) != null) {
                        appBarLayoutH = ff2.h(context, typedValueC3);
                    }
                    listPopupWindow.setListSelector(appBarLayoutH);
                    ListView listView = listPopupWindow.getListView();
                    if (listView != null) {
                        listView.setSelector((Drawable) appBarLayoutH);
                        if (listView.getParent() != null) {
                            q9n.B((View) listView.getParent(), drawableH2);
                            break;
                        }
                    }
                }
                break;
            case 2:
                Context context2 = view.getContext();
                ColorStateList colorStateListF6 = (ff2Var2 == null || (typedValueC6 = ff2Var2.c(context2)) == null) ? null : ff2.f(context2, typedValueC6);
                Context context3 = view.getContext();
                if (ff2Var != null && (typedValueC5 = ff2Var.c(context3)) != null) {
                    appBarLayoutH = ff2.f(context3, typedValueC5);
                }
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) view;
                if (colorStateListF6 != null) {
                    int defaultColor2 = colorStateListF6.getDefaultColor();
                    p83 p83Var = ((o83) circularProgressIndicator).a;
                    if (p83Var.f != defaultColor2) {
                        p83Var.f = defaultColor2;
                        circularProgressIndicator.invalidate();
                    }
                }
                if (appBarLayoutH != null) {
                    circularProgressIndicator.f(new int[]{appBarLayoutH.getDefaultColor()});
                    break;
                }
                break;
            case 3:
                Context context4 = view.getContext();
                StylingTextView stylingTextView = (StylingTextView) view;
                zg zgVar = stylingTextView.i;
                Drawable drawableH3 = (Drawable) zgVar.c;
                Drawable drawableH4 = (Drawable) zgVar.d;
                if (ff2Var2 != null && (typedValueC8 = ff2Var2.c(context4)) != null) {
                    drawableH3 = ff2.h(context4, typedValueC8);
                }
                if (ff2Var != null && (typedValueC7 = ff2Var.c(context4)) != null) {
                    drawableH4 = ff2.h(context4, typedValueC7);
                }
                stylingTextView.s(drawableH3, drawableH4);
                break;
            case 4:
                Context context5 = view.getContext();
                TypedValue typedValueC19 = ff2Var2.c(context5);
                if (typedValueC19 != null) {
                    view.setForeground(ff2.h(context5, typedValueC19));
                    if (ff2Var != null) {
                        TypedValue typedValueC20 = ff2Var.c(view.getContext());
                        view.setForegroundTintList(typedValueC20 != null ? ff2.f(context5, typedValueC20) : null);
                        break;
                    }
                }
                break;
            case 5:
                if (view instanceof GradientSlider) {
                    ?? r5 = (GradientSlider) view;
                    ColorStateList colorStateList = r5.f1;
                    if (ff2Var2 != null && (typedValueC10 = ff2Var2.c(r5.getContext())) != null && (colorStateListF3 = ff2.f(r5.getContext(), typedValueC10)) != null) {
                        colorStateList = colorStateListF3;
                    }
                    ColorStateList colorStateList2 = r5.g1;
                    if (ff2Var != null && (typedValueC9 = ff2Var.c(r5.getContext())) != null && (colorStateListF2 = ff2.f(r5.getContext(), typedValueC9)) != null) {
                        colorStateList2 = colorStateListF2;
                    }
                    r5.f1 = colorStateList;
                    r5.g1 = colorStateList2;
                    r5.postInvalidate();
                    break;
                }
                break;
            case 6:
                Context context6 = view.getContext();
                ColorStateList colorStateListF7 = (ff2Var2 == null || (typedValueC12 = ff2Var2.c(context6)) == null) ? null : ff2.f(context6, typedValueC12);
                Context context7 = view.getContext();
                if (ff2Var != null && (typedValueC11 = ff2Var.c(context7)) != null) {
                    appBarLayoutH = ff2.f(context7, typedValueC11);
                }
                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) view;
                if (colorStateListF7 != null) {
                    int defaultColor3 = colorStateListF7.getDefaultColor();
                    p83 p83Var2 = ((o83) linearProgressIndicator).a;
                    if (p83Var2.f != defaultColor3) {
                        p83Var2.f = defaultColor3;
                        linearProgressIndicator.invalidate();
                    }
                }
                if (appBarLayoutH != null) {
                    linearProgressIndicator.f(new int[]{appBarLayoutH.getDefaultColor()});
                    break;
                }
                break;
            case 7:
                Context context8 = view.getContext();
                ColorStateList colorStateListF8 = (ff2Var2 == null || (typedValueC14 = ff2Var2.c(context8)) == null) ? null : ff2.f(context8, typedValueC14);
                Context context9 = view.getContext();
                if (ff2Var != null && (typedValueC13 = ff2Var.c(context9)) != null) {
                    appBarLayoutH = ff2.f(context9, typedValueC13);
                }
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) view;
                if (colorStateListF8 != null) {
                    materialCheckBox.setButtonTintList(colorStateListF8);
                }
                if (appBarLayoutH != null && materialCheckBox.o != appBarLayoutH) {
                    materialCheckBox.o = appBarLayoutH;
                    materialCheckBox.b();
                    break;
                }
                break;
            case 8:
                Context context10 = view.getContext();
                MenuSettingsListItem menuSettingsListItem = (MenuSettingsListItem) view;
                if (ff2Var2 != null && (colorStateListF5 = ff2.f(context10, ff2Var2.c(context10))) != null) {
                    ((StylingImageView) menuSettingsListItem.b.e).c(colorStateListF5);
                }
                if (ff2Var != null && (colorStateListF4 = ff2.f(context10, ff2Var.c(context10))) != null) {
                    ((StylingImageView) menuSettingsListItem.b.d).c(colorStateListF4);
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ov0 ov0VarG = ov0.g(view);
                View view2 = ov0VarG.b;
                Context context11 = view2.getContext();
                ColorStateList colorStateListF9 = (ff2Var2 == null || (typedValueC16 = ff2Var2.c(context11)) == null) ? null : ff2.f(context11, typedValueC16);
                if (colorStateListF9 != null) {
                    view2.setBackgroundTintList(new exh(colorStateListF9).b(view2.getContext()));
                }
                Context context12 = view2.getContext();
                if (ff2Var != null && (typedValueC15 = ff2Var.c(context12)) != null) {
                    appBarLayoutH = ff2.f(context12, typedValueC15);
                }
                if (appBarLayoutH != null) {
                    ((View) ov0VarG.c).setBackgroundTintList(new exh(appBarLayoutH).b(view2.getContext()));
                    break;
                }
                break;
            default:
                Context context13 = view.getContext();
                StatusBarDrawingFrameLayout statusBarDrawingFrameLayout = (StatusBarDrawingFrameLayout) view;
                ColorStateList colorStateListF10 = (ff2Var2 == null || (typedValueC18 = ff2Var2.c(context13)) == null) ? null : ff2.f(context13, typedValueC18);
                if (colorStateListF10 != null) {
                    statusBarDrawingFrameLayout.e(colorStateListF10.getDefaultColor());
                }
                if (ff2Var != null && (typedValueC17 = ff2Var.c(context13)) != null) {
                    appBarLayoutH = ff2.f(context13, typedValueC17);
                }
                if (appBarLayoutH != null && (defaultColor = appBarLayoutH.getDefaultColor()) != statusBarDrawingFrameLayout.k) {
                    statusBarDrawingFrameLayout.k = defaultColor;
                    statusBarDrawingFrameLayout.b();
                    break;
                }
                break;
        }
    }
}
