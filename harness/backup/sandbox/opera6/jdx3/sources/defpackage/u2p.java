package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class u2p extends aoo {
    public ImageView u;
    public TextView v;
    public boolean w;

    @Override // defpackage.aoo
    public final void i(View view) {
        super.i(view);
        View view2 = this.j;
        if (view2 == null) {
            view2 = this;
        }
        this.c.b(view2, new g2p(this, (byte) 0));
    }

    @Override // defpackage.aoo
    public final View k() {
        this.u = new ImageView(this.a);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        this.u.setAdjustViewBounds(true);
        addView(this.u, layoutParams);
        return this.u;
    }

    @Override // defpackage.aoo
    public final void p() {
        ImageView imageView = this.u;
        if (imageView != null) {
            imageView.setImageBitmap(null);
            this.u.setVisibility(4);
        }
        TextView textView = this.v;
        if (textView != null) {
            upj.j(textView);
            this.v = null;
        }
        sc scVar = this.o;
        if (scVar != null) {
            scVar.a();
        }
    }
}
