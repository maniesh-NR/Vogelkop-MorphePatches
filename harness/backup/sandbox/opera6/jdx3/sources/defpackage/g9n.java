package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class g9n implements r8n {
    public static final int[] f = {2130971151};
    public static final int[] g = {2130970890};
    public static final int[] h = {2130971152};
    public static final int[] i = {2130970891};
    public static final int[] j = {2130969071};
    public static final int[] k = {R.attr.collapseIcon};
    public final ff2 a;
    public final ff2 b;
    public final ff2 c;
    public final ff2 d;
    public final ff2 e;

    public g9n(ff2 ff2Var, ff2 ff2Var2, ff2 ff2Var3, ff2 ff2Var4, ff2 ff2Var5) {
        this.a = ff2Var;
        this.b = ff2Var2;
        this.c = ff2Var3;
        this.d = ff2Var4;
        this.e = ff2Var5;
    }

    @Override // defpackage.r8n
    public final void a(View view) {
        TypedValue typedValueC;
        Drawable drawableH;
        TypedValue typedValueC2;
        ColorStateList colorStateListF;
        TypedValue typedValueC3;
        TypedValue typedValueC4;
        ColorStateList colorStateListF2;
        TypedValue typedValueC5;
        Toolbar toolbar = (Toolbar) view;
        Context context = view.getContext();
        ff2 ff2Var = this.a;
        if (ff2Var != null && (typedValueC5 = ff2Var.c(context)) != null) {
            int i2 = typedValueC5.resourceId;
            toolbar.k = i2;
            yq1 yq1Var = toolbar.b;
            if (yq1Var != null) {
                yq1Var.setTextAppearance(context, i2);
            }
        }
        ff2 ff2Var2 = this.c;
        if (ff2Var2 != null && (typedValueC4 = ff2Var2.c(context)) != null && (colorStateListF2 = ff2.f(context, typedValueC4)) != null) {
            int defaultColor = colorStateListF2.getDefaultColor();
            toolbar.getClass();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(defaultColor);
            toolbar.y = colorStateListValueOf;
            yq1 yq1Var2 = toolbar.b;
            if (yq1Var2 != null) {
                yq1Var2.setTextColor(colorStateListValueOf);
            }
        }
        ff2 ff2Var3 = this.b;
        if (ff2Var3 != null && (typedValueC3 = ff2Var3.c(context)) != null) {
            int i3 = typedValueC3.resourceId;
            toolbar.l = i3;
            yq1 yq1Var3 = toolbar.c;
            if (yq1Var3 != null) {
                yq1Var3.setTextAppearance(context, i3);
            }
        }
        ff2 ff2Var4 = this.d;
        if (ff2Var4 != null && (typedValueC2 = ff2Var4.c(context)) != null && (colorStateListF = ff2.f(context, typedValueC2)) != null) {
            int defaultColor2 = colorStateListF.getDefaultColor();
            toolbar.getClass();
            ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(defaultColor2);
            toolbar.z = colorStateListValueOf2;
            yq1 yq1Var4 = toolbar.c;
            if (yq1Var4 != null) {
                yq1Var4.setTextColor(colorStateListValueOf2);
            }
        }
        ff2 ff2Var5 = this.e;
        if (ff2Var5 == null || (typedValueC = ff2Var5.c(context)) == null || (drawableH = ff2.h(context, typedValueC)) == null) {
            return;
        }
        toolbar.c();
        toolbar.g.setImageDrawable(drawableH);
    }
}
