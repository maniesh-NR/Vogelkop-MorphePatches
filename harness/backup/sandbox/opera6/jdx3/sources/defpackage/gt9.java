package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class gt9 extends ft9 {
    public final ov0 d;

    public gt9(Context context, k6n k6nVar) {
        super(context, k6nVar, k6nVar);
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131558910, (ViewGroup) this, false);
        addView(constraintLayoutInflate);
        int i = 2131362454;
        StylingTextView stylingTextView = (StylingTextView) w1h.j(2131362454, constraintLayoutInflate);
        if (stylingTextView != null) {
            i = 2131363924;
            LinearLayout linearLayout = (LinearLayout) w1h.j(2131363924, constraintLayoutInflate);
            if (linearLayout != null) {
                this.d = new ov0(constraintLayoutInflate, stylingTextView, linearLayout);
                linearLayout.setVisibility(8);
                return;
            }
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }
}
