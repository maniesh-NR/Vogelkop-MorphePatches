package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class qwc extends ab2 {
    public final swc d;

    public qwc(View view) {
        super(view);
        StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363296, view);
        if (stylingTextView != null) {
            this.d = new swc((FrameLayout) view, stylingTextView, (byte) 0);
        } else {
            t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(2131363296)));
            throw null;
        }
    }

    @Override // defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        yq1 yq1Var = this.d.c;
        yq1Var.setText(yq1Var.getContext().getString(((pwc) ja2Var).b));
    }
}
