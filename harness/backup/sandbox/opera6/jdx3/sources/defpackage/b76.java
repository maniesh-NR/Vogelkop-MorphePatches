package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class b76 extends b23 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b76(byte b) {
        super((byte) 1);
        this.b = b;
    }

    @Override // defpackage.b23
    public final CharSequence g(Context context) {
        switch (this.b) {
            case 0:
                return context.getString(2132018457);
            default:
                return phj.y(context.getString(2132019149));
        }
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        switch (this.b) {
        }
        return context.getString(2132019218);
    }

    @Override // defpackage.nz0
    public final int getTheme() {
        switch (this.b) {
            case 0:
                return 2132083342;
            default:
                return super.getTheme();
        }
    }

    @Override // defpackage.b23
    public final CharSequence i(Context context) {
        switch (this.b) {
            case 0:
                return context.getString(2132018458);
            default:
                return context.getString(2132019150);
        }
    }

    @Override // defpackage.b23
    public final Drawable j(Context context) {
        switch (this.b) {
            case 0:
                return sgb.F(2131232076, context);
            default:
                return sgb.F(2131232062, context);
        }
    }

    @Override // defpackage.b23
    public final ColorStateList l(Context context) {
        switch (this.b) {
            case 1:
                return f03.u(2130969111, context, 2131101243);
            default:
                return super.l(context);
        }
    }
}
