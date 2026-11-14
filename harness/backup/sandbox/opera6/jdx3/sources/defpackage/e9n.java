package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class e9n implements r8n {
    public static final int[] h = {R.attr.drawableStart};
    public static final int[] i = {R.attr.drawableEnd};
    public static final int[] j = {R.attr.drawableLeft};
    public static final int[] k = {R.attr.drawableRight};
    public static final int[] l = {R.attr.drawableTop};
    public static final int[] m = {R.attr.drawableBottom};
    public static final int[] n = {R.attr.drawableTint};
    public final ff2 a;
    public final ff2 b;
    public final ff2 c;
    public final ff2 d;
    public final ff2 e;
    public final ff2 f;
    public final ff2 g;

    public e9n(ff2 ff2Var, ff2 ff2Var2, ff2 ff2Var3, ff2 ff2Var4, ff2 ff2Var5, ff2 ff2Var6, ff2 ff2Var7) {
        this.a = ff2Var;
        this.b = ff2Var2;
        this.c = ff2Var3;
        this.d = ff2Var4;
        this.e = ff2Var5;
        this.f = ff2Var6;
        this.g = ff2Var7;
    }

    public static Drawable b(Context context, ff2 ff2Var) {
        TypedValue typedValueC;
        if (ff2Var == null || (typedValueC = ff2Var.c(context)) == null) {
            return null;
        }
        return ff2.h(context, typedValueC);
    }

    @Override // defpackage.r8n
    public final void a(View view) {
        TypedValue typedValueC;
        Context context = view.getContext();
        TextView textView = (TextView) view;
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        Drawable drawable = compoundDrawablesRelative[0];
        ff2 ff2Var = this.f;
        ff2 ff2Var2 = this.e;
        if (drawable == null && compoundDrawablesRelative[2] == null) {
            textView.setCompoundDrawablesWithIntrinsicBounds(b(context, this.c), b(context, ff2Var2), b(context, this.d), b(context, ff2Var));
        } else {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(b(context, this.a), b(context, ff2Var2), b(context, this.b), b(context, ff2Var));
        }
        ff2 ff2Var3 = this.g;
        if (ff2Var3 == null || (typedValueC = ff2Var3.c(context)) == null) {
            return;
        }
        textView.setCompoundDrawableTintList(ff2.f(context, typedValueC));
    }
}
