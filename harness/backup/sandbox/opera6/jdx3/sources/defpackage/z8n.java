package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class z8n implements r8n {
    public static final int[] c = {2130971135};
    public static final int[] d = {R.attr.tint};
    public final ff2 a;
    public final /* synthetic */ byte b;

    public z8n(ff2 ff2Var, byte b) {
        this.b = b;
        this.a = ff2Var;
    }

    @Override // defpackage.r8n
    public final void a(View view) throws NumberFormatException {
        ColorStateList colorStateListF;
        ColorStateList colorStateListF2;
        byte b = this.b;
        ff2 ff2Var = this.a;
        switch (b) {
            case 0:
                Context context = view.getContext();
                TypedValue typedValueC = ff2Var.c(context);
                if (typedValueC != null && (colorStateListF = ff2.f(context, typedValueC)) != null) {
                    ((ImageView) view).setImageTintList(colorStateListF);
                    break;
                }
                break;
            default:
                Context context2 = view.getContext();
                TypedValue typedValueC2 = ff2Var.c(context2);
                if (typedValueC2 != null && (colorStateListF2 = ff2.f(context2, typedValueC2)) != null) {
                    ((ImageView) view).setImageTintList(colorStateListF2);
                    break;
                }
                break;
        }
    }
}
