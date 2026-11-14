package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class w8n implements r8n {
    public static final int[] e = {2130968726};
    public static final int[] f = {R.attr.background};
    public static final int[] g = {R.attr.backgroundTint};
    public static final int[] h = {2130968736};
    public static final int[] i = {R.attr.backgroundTintMode};
    public static final int[] j = {2130968737};
    public static final int[] k = {2130969416};
    public static final int[] l = {2130969677};
    public static final int[] m = {2130969079};
    public final /* synthetic */ byte a;
    public final ff2 b;
    public final ff2 c;
    public final ff2 d;

    public /* synthetic */ w8n(ff2 ff2Var, ff2 ff2Var2, ff2 ff2Var3, byte b) {
        this.a = b;
        this.b = ff2Var;
        this.c = ff2Var2;
        this.d = ff2Var3;
    }

    @Override // defpackage.r8n
    public final void a(View view) throws NumberFormatException {
        TypedValue typedValueC;
        int i2;
        TypedValue typedValueC2;
        TypedValue typedValueC3;
        TypedValue typedValueC4;
        byte b = this.a;
        ff2 ff2Var = this.d;
        ff2 ff2Var2 = this.c;
        ff2 ff2Var3 = this.b;
        switch (b) {
            case 0:
                TypedValue typedValueC5 = ff2Var3.c(view.getContext());
                if (typedValueC5 != null) {
                    Context context = view.getContext();
                    if (typedValueC5.resourceId == 0 && ((i2 = typedValueC5.type) < 28 || i2 > 31)) {
                        view.setBackground(null);
                        break;
                    } else {
                        Drawable drawableH = ff2.h(context, typedValueC5);
                        if ((view.getBackground() instanceof zdd) && (drawableH instanceof ColorDrawable)) {
                            zdd background = view.getBackground();
                            background.q(context);
                            background.u(ColorStateList.valueOf(((ColorDrawable) drawableH).getColor()));
                        } else {
                            q9n.B(view, drawableH);
                        }
                        if (ff2Var2 != null) {
                            TypedValue typedValueC6 = ff2Var2.c(view.getContext());
                            ColorStateList colorStateListF = typedValueC6 != null ? ff2.f(context, typedValueC6) : null;
                            WeakHashMap weakHashMap = r5n.a;
                            view.setBackgroundTintList(colorStateListF);
                        }
                        if (ff2Var != null && (typedValueC = ff2Var.c(view.getContext())) != null) {
                            PorterDuff.Mode mode = PorterDuff.Mode.values()[typedValueC.data];
                            WeakHashMap weakHashMap2 = r5n.a;
                            view.setBackgroundTintMode(mode);
                            break;
                        }
                    }
                }
                break;
            default:
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) view;
                Context context2 = view.getContext();
                if (ff2Var3 != null && (typedValueC4 = ff2Var3.c(context2)) != null) {
                    int i3 = typedValueC4.resourceId;
                    collapsingToolbarLayout.e(i3 == 0 ? context2.getColor(2131101243) : context2.getColor(i3));
                }
                if (ff2Var2 != null && (typedValueC3 = ff2Var2.c(context2)) != null) {
                    int i4 = typedValueC3.resourceId;
                    int color = i4 == 0 ? context2.getColor(2131101243) : context2.getColor(i4);
                    collapsingToolbarLayout.getClass();
                    ColorStateList colorStateListValueOf = ColorStateList.valueOf(color);
                    v85 v85Var = collapsingToolbarLayout.l;
                    if (v85Var.o != colorStateListValueOf) {
                        v85Var.o = colorStateListValueOf;
                        v85Var.l(false);
                    }
                }
                if (ff2Var != null && (typedValueC2 = ff2Var.c(context2)) != null) {
                    int i5 = typedValueC2.resourceId;
                    int color2 = i5 == 0 ? context2.getColor(2131101243) : context2.getColor(i5);
                    collapsingToolbarLayout.getClass();
                    collapsingToolbarLayout.l.r(ColorStateList.valueOf(color2));
                    break;
                }
                break;
        }
    }
}
