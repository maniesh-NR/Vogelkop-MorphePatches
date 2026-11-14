package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class k4g extends b23 {
    public final int b;
    public final boolean c;

    public k4g(int i, boolean z) {
        super((byte) 1);
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.b23
    public final CharSequence g(Context context) {
        int i = this.b;
        return i <= 0 ? context.getText(2132020035) : this.c ? context.getResources().getQuantityString(2131886167, i, Integer.valueOf(i)) : sko.v(context.getResources().getQuantityString(2131886176, i, Integer.valueOf(i)), "\n", context.getString(2132021360));
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        return context.getString(2132019218);
    }

    @Override // defpackage.b23
    public final CharSequence i(Context context) {
        return this.b <= 0 ? context.getText(2132017861) : context.getText(2132021361);
    }

    @Override // defpackage.b23
    public final Drawable j(Context context) {
        return sgb.F(2131232172, context);
    }

    @Override // defpackage.b23
    public final int k(Context context) {
        return 0;
    }

    @Override // defpackage.b23
    public final ColorStateList m(Context context) {
        return f03.u(2130969284, context, 2131101243);
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
