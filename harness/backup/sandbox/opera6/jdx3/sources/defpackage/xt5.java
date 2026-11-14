package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageView;

/* loaded from: classes.dex */
public final class xt5 extends i {
    public final or2 b;
    public final float c;

    /* JADX WARN: Illegal instructions before constructor call */
    public xt5(or2 or2Var, wg5 wg5Var, cv2 cv2Var) {
        View view = or2Var.c;
        super(view);
        this.b = or2Var;
        this.c = ((StylingImageView) or2Var.d).getResources().getDimensionPixelSize(2131165499);
        view.setOnClickListener(new nf(this, wg5Var, (byte) 28));
        view.setOnLongClickListener(new ys2(this, cv2Var, (byte) 1));
    }

    public final void U(Bitmap bitmap) {
        or2 or2Var = this.b;
        AppCompatImageView appCompatImageView = (StylingImageView) or2Var.d;
        AppCompatImageView appCompatImageView2 = (StylingImageView) or2Var.d;
        appCompatImageView.setBackground(new jq4(this.c, appCompatImageView2.getLayoutDirection(), f03.t(2130968623, appCompatImageView2.getContext(), 2131103876), bitmap));
    }
}
