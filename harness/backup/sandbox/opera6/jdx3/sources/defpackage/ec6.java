package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.opera.android.import_data.ImportChromeDataActivity;

/* loaded from: classes.dex */
public final class ec6 extends b23 {
    public final jm3 b;
    public final v5g c;

    public ec6(jm3 jm3Var, v5g v5gVar) {
        super((byte) 1);
        this.b = jm3Var;
        this.c = v5gVar;
    }

    @Override // defpackage.b23
    public final View f(Context context) throws Resources.NotFoundException {
        jm3 jm3Var = this.b;
        boolean z = jm3Var.a;
        v5g v5gVar = this.c;
        if (z) {
            if (v5gVar.a) {
                return null;
            }
        } else if (!v5gVar.a) {
            return null;
        }
        ov0 ov0VarH = ov0.h(LayoutInflater.from(context));
        LinearLayout linearLayout = (LinearLayout) ov0VarH.b;
        LinearLayout linearLayout2 = (LinearLayout) ov0VarH.d;
        TextView textView = (TextView) ov0VarH.c;
        if (!jm3Var.a) {
            if (!v5gVar.a) {
                return null;
            }
            Resources resources = context.getResources();
            int i = v5gVar.b;
            cc6.b(LayoutInflater.from(linearLayout2.getContext()), linearLayout2).c.setText(resources.getQuantityString(2131886116, i, Integer.valueOf(i)));
            textView.setText(context.getResources().getString(2132018471));
            textView.setVisibility(0);
            return linearLayout;
        }
        Resources resources2 = context.getResources();
        long j = jm3Var.b;
        cc6.b(LayoutInflater.from(linearLayout2.getContext()), linearLayout2).c.setText(resources2.getQuantityString(2131886115, (int) j, Long.valueOf(j)));
        if (v5gVar.c == y2b.c) {
            textView.setText(context.getString(2132018483));
            textView.setVisibility(0);
            return linearLayout;
        }
        textView.setText(context.getString(2132018484));
        textView.setVisibility(0);
        return linearLayout;
    }

    @Override // defpackage.b23
    public final CharSequence g(Context context) {
        return context.getString(2132018473);
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        return q() ? context.getString(2132019218) : context.getString(2132021985);
    }

    @Override // defpackage.nz0
    public final int getTheme() {
        return 2132083342;
    }

    @Override // defpackage.b23
    public final CharSequence i(Context context) {
        return q() ? context.getString(2132018474) : context.getString(2132018482);
    }

    @Override // defpackage.b23
    public final Drawable j(Context context) {
        return sgb.F(2131232058, context);
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
        if (q()) {
            finish(hjm.a);
            return;
        }
        int i = ImportChromeDataActivity.d0;
        Context context = bz0Var.getContext();
        jm3 jm3Var = this.b;
        boolean z = jm3Var.a;
        v5g v5gVar = this.c;
        if (z && !v5gVar.a) {
            ir5.e(context, j2b.c, true, jm3Var.b);
        } else {
            if (!v5gVar.a || z) {
                return;
            }
            ir5.e(context, j2b.d, true, v5gVar.b);
        }
    }

    public final boolean q() {
        v5g v5gVar = this.c;
        return !v5gVar.a && v5gVar.c == y2b.c;
    }
}
