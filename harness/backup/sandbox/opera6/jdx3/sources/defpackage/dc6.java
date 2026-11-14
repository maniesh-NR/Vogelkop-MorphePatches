package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public final class dc6 extends b23 {
    public final long b;
    public final int c;

    public dc6(long j, int i) {
        super((byte) 1);
        this.b = j;
        this.c = i;
    }

    public static void q(String str, LinearLayout linearLayout) {
        cc6.b(LayoutInflater.from(linearLayout.getContext()), linearLayout).c.setText(str);
    }

    @Override // defpackage.b23
    public final View f(Context context) {
        ov0 ov0VarH = ov0.h(LayoutInflater.from(context));
        LinearLayout linearLayout = (LinearLayout) ov0VarH.d;
        long j = this.b;
        int i = this.c;
        if (j > 0) {
            if (i > 0) {
                q(context.getResources().getQuantityString(2131886116, i, Integer.valueOf(i)), linearLayout);
                q(context.getResources().getQuantityString(2131886115, (int) j, Long.valueOf(j)), linearLayout);
            } else {
                q(context.getResources().getQuantityString(2131886115, (int) j, Long.valueOf(j)), linearLayout);
                q(context.getResources().getString(2132018481), linearLayout);
            }
        } else {
            if (i <= 0) {
                return null;
            }
            q(context.getResources().getQuantityString(2131886116, i, Integer.valueOf(i)), linearLayout);
            q(context.getResources().getString(2132018478), linearLayout);
        }
        return (LinearLayout) ov0VarH.b;
    }

    @Override // defpackage.b23
    public final CharSequence g(Context context) {
        long j = this.b;
        int i = this.c;
        return (j <= 0 || i <= 0) ? (j > 0 || i > 0) ? context.getString(2132018472) : context.getString(2132018479) : context.getString(2132018473);
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        return context.getString(2132019218);
    }

    @Override // defpackage.nz0
    public final int getTheme() {
        return 2132083342;
    }

    @Override // defpackage.b23
    public final CharSequence i(Context context) {
        return (this.b > 0 || this.c > 0) ? context.getString(2132018474) : context.getString(2132018480);
    }

    @Override // defpackage.b23
    public final Drawable j(Context context) {
        return (this.b > 0 || this.c > 0) ? sgb.F(2131232058, context) : sgb.F(2131232118, context);
    }

    @Override // defpackage.b23
    public final int k(Context context) {
        return 0;
    }

    @Override // defpackage.b23
    public final ColorStateList l(Context context) {
        return null;
    }

    @Override // defpackage.b23
    public final ColorStateList m(Context context) {
        return f03.u(2130969288, context, 2131101243);
    }

    @Override // defpackage.b23
    public final Integer o() {
        return 2131165295;
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        finish(hjm.a);
    }
}
