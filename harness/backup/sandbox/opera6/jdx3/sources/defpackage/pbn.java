package defpackage;

import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.i;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.opera.android.custom_views.StylingImageView;

/* loaded from: classes.dex */
public final class pbn extends i {
    public final y83 b;
    public final lrk c;

    public pbn(y83 y83Var, lrk lrkVar) {
        super((LinearLayout) y83Var.b);
        this.b = y83Var;
        this.c = lrkVar;
        ((CircularProgressIndicator) y83Var.h).setVisibility(8);
        AppCompatImageView appCompatImageView = (StylingImageView) y83Var.d;
        appCompatImageView.setVisibility(0);
        appCompatImageView.setImageResource(2131232018);
        svk svkVar = new svk(this, (byte) 20);
        q9n.e(appCompatImageView, svkVar);
        svkVar.a(appCompatImageView);
    }
}
