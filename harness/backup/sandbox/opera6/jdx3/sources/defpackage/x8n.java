package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import androidx.mediarouter.app.OperaMediaRouteButton;
import com.opera.android.custom_views.CardView;
import com.opera.android.custom_views.PageDotIndicator;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.settings.SettingsStatisticView;

/* loaded from: classes.dex */
public final class x8n implements r8n {
    public static final int[] c = {2130968738};
    public static final int[] d = {2130968922};
    public static final int[] e = {2130969846};
    public static final int[] f = {2130969931};
    public static final int[] g = {R.attr.src};
    public static final int[] h = {2130970825};
    public static final int[] i = {2130970826};
    public static final int[] j = {2130968917};
    public static final int[] k = {2130970322};
    public static final int[] l = {2130970506};
    public static final int[] m = {2130969618};
    public static final int[] n = {R.attr.windowBackground};
    public final /* synthetic */ byte a;
    public final ff2 b;

    public x8n() {
        this.a = (byte) 9;
        TypedValue typedValue = new TypedValue();
        typedValue.data = R.attr.windowBackground;
        typedValue.resourceId = R.attr.windowBackground;
        typedValue.type = 2;
        this.b = new ff2(n, typedValue);
    }

    public /* synthetic */ x8n(ff2 ff2Var, byte b) {
        this.a = b;
        this.b = ff2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.r8n
    public final void a(View view) throws NumberFormatException {
        ColorStateList colorStateListF;
        ColorStateList colorStateListF2;
        ColorStateList colorStateListF3;
        ColorStateList colorStateListF4;
        Drawable drawableH;
        ColorStateList colorStateListF5;
        Drawable drawableH2;
        ColorStateList colorStateListF6;
        byte b = this.a;
        ff2 ff2Var = this.b;
        switch (b) {
            case 0:
                Context context = view.getContext();
                TypedValue typedValueC = ff2Var.c(context);
                if (typedValueC != null && (colorStateListF = ff2.f(context, typedValueC)) != null && (view instanceof StylingImageView)) {
                    ((StylingImageView) view).e.M(colorStateListF);
                    break;
                }
                break;
            case 1:
                Context context2 = view.getContext();
                TypedValue typedValueC2 = ff2Var.c(context2);
                if (typedValueC2 != null && (colorStateListF2 = ff2.f(context2, typedValueC2)) != null) {
                    if (view instanceof CardView) {
                        CardView cardView = (CardView) view;
                        cardView.e = colorStateListF2;
                        cardView.d.M(colorStateListF2);
                        cardView.invalidate();
                    }
                    if (view instanceof androidx.cardview.widget.CardView) {
                        ((androidx.cardview.widget.CardView) view).c(colorStateListF2);
                        break;
                    }
                }
                break;
            case 2:
                Context context3 = view.getContext();
                TypedValue typedValueC3 = ff2Var.c(context3);
                if (typedValueC3 != null && (colorStateListF3 = ff2.f(context3, typedValueC3)) != null && (view instanceof CardView)) {
                    CardView cardView2 = (CardView) view;
                    cardView2.l = colorStateListF3.getDefaultColor();
                    cardView2.d();
                    break;
                }
                break;
            case 3:
                Context context4 = view.getContext();
                TypedValue typedValueC4 = ff2Var.c(context4);
                if (typedValueC4 != null && (colorStateListF4 = ff2.f(context4, typedValueC4)) != null) {
                    if (!(view instanceof StylingImageView)) {
                        if (view instanceof StylingTextView) {
                            ((StylingTextView) view).h.M(colorStateListF4);
                            break;
                        }
                    } else {
                        ((StylingImageView) view).c(colorStateListF4);
                        break;
                    }
                }
                break;
            case 4:
                if ((view instanceof ImageView) && ff2Var != null) {
                    ImageView imageView = (ImageView) view;
                    TypedValue typedValueC5 = ff2Var.c(imageView.getContext());
                    if (typedValueC5 != null && (drawableH = ff2.h(imageView.getContext(), typedValueC5)) != null) {
                        imageView.setImageDrawable(drawableH);
                        break;
                    }
                }
                break;
            case 5:
                Context context5 = view.getContext();
                TypedValue typedValueC6 = ff2Var.c(context5);
                ColorStateList colorStateListF7 = typedValueC6 != null ? ff2.f(context5, typedValueC6) : null;
                wdd wddVar = (wdd) view;
                if (colorStateListF7 != null) {
                    wddVar.setButtonTintList(colorStateListF7);
                    break;
                }
                break;
            case 6:
                if ((view instanceof OperaMediaRouteButton) && ff2Var != null) {
                    OperaMediaRouteButton operaMediaRouteButton = (OperaMediaRouteButton) view;
                    TypedValue typedValueC7 = ff2Var.c(operaMediaRouteButton.getContext());
                    if (typedValueC7 != null && (colorStateListF5 = ff2.f(operaMediaRouteButton.getContext(), typedValueC7)) != null) {
                        operaMediaRouteButton.l = colorStateListF5;
                        Drawable drawable = operaMediaRouteButton.i;
                        if (drawable != null) {
                            Drawable drawableMutate = drawable.mutate();
                            drawableMutate.setTintList(colorStateListF5);
                            operaMediaRouteButton.i = drawableMutate;
                            operaMediaRouteButton.postInvalidate();
                            break;
                        }
                    }
                }
                break;
            case 7:
                PageDotIndicator pageDotIndicator = (PageDotIndicator) view;
                Context context6 = view.getContext();
                TypedValue typedValueC8 = ff2Var.c(context6);
                if (typedValueC8 != null && (drawableH2 = ff2.h(context6, typedValueC8)) != null) {
                    pageDotIndicator.c = drawableH2;
                    pageDotIndicator.invalidate();
                    break;
                }
                break;
            case 8:
                SettingsStatisticView settingsStatisticView = (SettingsStatisticView) view;
                Context context7 = view.getContext();
                TypedValue typedValueC9 = ff2Var != null ? ff2Var.c(context7) : null;
                if (typedValueC9 != null && (colorStateListF6 = ff2.f(context7, typedValueC9)) != null) {
                    settingsStatisticView.d.c = colorStateListF6.getDefaultColor();
                }
                settingsStatisticView.a(view.getContext());
                break;
            default:
                TypedValue typedValueC10 = ff2Var.c(view.getContext());
                if (typedValueC10 != null) {
                    q9n.B(view, ff2.h(view.getContext(), typedValueC10));
                    break;
                }
                break;
        }
    }
}
