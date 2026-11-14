package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class vp9 extends b23 {
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public vp9(int i, int i2, int i3, int i4, int i5, int i6) {
        super((byte) 1);
        this.b = i;
        this.c = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.d = i6;
    }

    @Override // defpackage.b23
    public final View f(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(2131558908, (ViewGroup) null, false);
        int i = 2131364597;
        TextView textView = (TextView) w1h.j(2131364597, viewInflate);
        if (textView != null) {
            i = 2131364598;
            TextView textView2 = (TextView) w1h.j(2131364598, viewInflate);
            if (textView2 != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                textView.setText(this.f);
                textView2.setText(this.g);
                return linearLayout;
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        return context.getString(2132019218);
    }

    @Override // defpackage.b23
    public final CharSequence i(Context context) {
        return context.getString(this.e);
    }

    @Override // defpackage.b23
    public final Drawable j(Context context) {
        return sgb.F(this.b, context);
    }

    @Override // defpackage.b23
    public final ColorStateList l(Context context) {
        return f03.u(this.c, context, 2131101243);
    }

    @Override // defpackage.b23
    public final ColorStateList m(Context context) {
        return f03.u(this.d, context, 2131101243);
    }
}
