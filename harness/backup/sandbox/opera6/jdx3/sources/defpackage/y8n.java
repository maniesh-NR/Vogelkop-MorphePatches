package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.opera.android.custom_views.StylingImageCheckableWithText;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.TabCountButton;
import java.util.Objects;

/* loaded from: classes.dex */
public final class y8n implements r8n {
    public static final int[] f = {2130968736};
    public static final int[] g = {2130968737};
    public static final int[] h = {2130971135};
    public static final int[] i = {2130971136};
    public static final int[] j = {2130968736};
    public static final int[] k = {2130970878};
    public static final int[] l = {2130970647};
    public static final int[] m = {2130969913};
    public static final int[] n = {2130969933};
    public static final int[] o = {2130969934};
    public static final int[] p = {R.attr.textColor};
    public static final int[] q = {R.attr.background};
    public static final int[] r = {R.attr.textColor};
    public static final int[] s = {R.attr.textColorHighlight};
    public static final int[] t = {R.attr.textColorHint};
    public static final int[] u = {R.attr.textAppearance};
    public final /* synthetic */ byte a;
    public final ff2 b;
    public final ff2 c;
    public final ff2 d;
    public final ff2 e;

    public /* synthetic */ y8n(ff2 ff2Var, ff2 ff2Var2, ff2 ff2Var3, ff2 ff2Var4, byte b) {
        this.a = b;
        this.b = ff2Var;
        this.c = ff2Var2;
        this.d = ff2Var3;
        this.e = ff2Var4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.view.View, com.opera.android.custom_views.StylingImageCheckableWithText] */
    @Override // defpackage.r8n
    public final void a(View view) throws Resources.NotFoundException, NumberFormatException {
        TypedValue typedValueC;
        TypedValue typedValueC2;
        TypedValue typedValueC3;
        TypedValue typedValueC4;
        TypedValue typedValueC5;
        ColorStateList colorStateListF;
        TypedValue typedValueC6;
        ColorStateList colorStateListF2;
        TypedValue typedValueC7;
        ColorStateList colorStateListF3;
        TypedValue typedValueC8;
        ColorStateList colorStateListF4;
        TypedValue typedValueC9;
        TypedValue typedValueC10;
        TypedValue typedValueC11;
        TypedValue typedValueC12;
        byte b = this.a;
        ff2 ff2Var = this.e;
        ff2 ff2Var2 = this.d;
        ff2 ff2Var3 = this.c;
        ff2 ff2Var4 = this.b;
        switch (b) {
            case 0:
                Context context = view.getContext();
                PorterDuff.Mode mode = null;
                ColorStateList colorStateListF5 = (ff2Var2 == null || (typedValueC4 = ff2Var2.c(context)) == null) ? null : ff2.f(context, typedValueC4);
                if (colorStateListF5 != null) {
                    ((FloatingActionButton) view).setBackgroundTintList(colorStateListF5);
                }
                PorterDuff.Mode mode2 = (ff2Var == null || (typedValueC3 = ff2Var.c(view.getContext())) == null) ? null : PorterDuff.Mode.values()[typedValueC3.data];
                if (mode2 != null) {
                    ((FloatingActionButton) view).setBackgroundTintMode(mode2);
                }
                Context context2 = view.getContext();
                ColorStateList colorStateListF6 = (ff2Var4 == null || (typedValueC2 = ff2Var4.c(context2)) == null) ? null : ff2.f(context2, typedValueC2);
                if (colorStateListF6 != null) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    if (floatingActionButton.d != colorStateListF6) {
                        floatingActionButton.d = colorStateListF6;
                        floatingActionButton.g();
                    }
                }
                Context context3 = view.getContext();
                if (ff2Var3 != null && (typedValueC = ff2Var3.c(context3)) != null) {
                    mode = PorterDuff.Mode.values()[typedValueC.data];
                }
                if (mode != null) {
                    FloatingActionButton floatingActionButton2 = (FloatingActionButton) view;
                    if (floatingActionButton2.e != mode) {
                        floatingActionButton2.e = mode;
                        floatingActionButton2.g();
                        break;
                    }
                }
                break;
            case 1:
                MaterialButton materialButton = (MaterialButton) view;
                Context context4 = view.getContext();
                Objects.requireNonNull(materialButton);
                if (ff2Var4 != null && (typedValueC8 = ff2Var4.c(context4)) != null && (colorStateListF4 = ff2.f(context4, typedValueC8)) != null) {
                    materialButton.I(colorStateListF4);
                }
                if (ff2Var3 != null && (typedValueC7 = ff2Var3.c(context4)) != null && (colorStateListF3 = ff2.f(context4, typedValueC7)) != null) {
                    materialButton.H(colorStateListF3);
                }
                if (ff2Var2 != null && (typedValueC6 = ff2Var2.c(context4)) != null && (colorStateListF2 = ff2.f(context4, typedValueC6)) != null) {
                    materialButton.F(colorStateListF2);
                }
                if (ff2Var != null && (typedValueC5 = ff2Var.c(context4)) != null && (colorStateListF = ff2.f(context4, typedValueC5)) != null && materialButton.i != colorStateListF) {
                    materialButton.i = colorStateListF;
                    materialButton.K(false);
                    break;
                }
                break;
            case 2:
                Context context5 = view.getContext();
                ?? r7 = (StylingImageCheckableWithText) view;
                ov0 ov0Var = r7.p;
                if (ff2Var4 != null && (typedValueC12 = ff2Var4.c(context5)) != null) {
                    ((StylingImageView) ov0Var.c).setImageDrawable(ff2.h(context5, typedValueC12));
                }
                if (ff2Var3 != null && (typedValueC11 = ff2Var3.c(context5)) != null) {
                    ((StylingImageView) ov0Var.c).setImageTintList(ff2.f(context5, typedValueC11));
                }
                if (ff2Var2 != null && (typedValueC10 = ff2Var2.c(context5)) != null) {
                    ((TextView) ov0Var.d).setTextColor(ff2.f(context5, typedValueC10));
                }
                if (ff2Var != null && (typedValueC9 = ff2Var.c(context5)) != null) {
                    r7.setBackground(ff2.h(context5, typedValueC9));
                    break;
                }
                break;
            default:
                Context context6 = view.getContext();
                ColorStateList colorStateListB = b(context6, ff2Var4, r);
                if (colorStateListB != null) {
                    if (view instanceof TextView) {
                        ((TextView) view).setTextColor(colorStateListB);
                    } else if (view instanceof TabCountButton) {
                        ((TabCountButton) view).f(colorStateListB);
                    }
                }
                if (view instanceof TextView) {
                    TextView textView = (TextView) view;
                    ColorStateList colorStateListB2 = b(context6, ff2Var3, s);
                    if (colorStateListB2 != null) {
                        textView.setHighlightColor(colorStateListB2.getDefaultColor());
                    }
                    ColorStateList colorStateListB3 = b(context6, ff2Var2, t);
                    if (colorStateListB3 != null) {
                        textView.setHintTextColor(colorStateListB3);
                        break;
                    }
                }
                break;
        }
    }

    public final ColorStateList b(Context context, ff2 ff2Var, int[] iArr) throws Resources.NotFoundException, NumberFormatException {
        TypedValue typedValueC;
        TypedValue typedValueC2;
        if (ff2Var != null) {
            typedValueC2 = ff2Var.c(context);
            if (typedValueC2 == null) {
                return null;
            }
        } else {
            ff2 ff2Var2 = this.e;
            if (ff2Var2 == null || (typedValueC = ff2Var2.c(context)) == null) {
                return null;
            }
            int i2 = typedValueC.resourceId;
            TypedValue typedValue = new TypedValue();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, iArr);
            typedArrayObtainStyledAttributes.getValue(0, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            typedValueC2 = typedValue;
        }
        return ff2.f(context, typedValueC2);
    }
}
