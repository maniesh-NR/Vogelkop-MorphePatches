package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class l3b extends b23 {
    public final long b;

    public l3b(long j) {
        super((byte) 1);
        this.b = j;
    }

    @Override // defpackage.b23
    public final CharSequence g(Context context) {
        long j = this.b;
        return j > 0 ? context.getResources().getQuantityString(2131886097, (int) j, Long.valueOf(j)) : context.getString(2132020028);
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
        return this.b > 0 ? context.getString(2132018058) : context.getString(2132020029);
    }

    @Override // defpackage.b23
    public final Drawable j(Context context) {
        return sgb.F(2131232005, context);
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
}
