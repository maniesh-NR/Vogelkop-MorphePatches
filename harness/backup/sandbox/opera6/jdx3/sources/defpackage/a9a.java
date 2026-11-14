package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.BestHorizontalFitLayout;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class a9a extends i {
    public final TextView b;
    public final BestHorizontalFitLayout c;
    public final StylingTextView d;
    public final StylingTextView e;
    public final StylingTextView f;

    public a9a(View view) {
        super(view);
        this.b = (TextView) view.findViewById(2131363332);
        this.c = (BestHorizontalFitLayout) view.findViewById(2131364523);
        this.d = (StylingTextView) view.findViewById(2131362597);
        this.e = (StylingTextView) view.findViewById(2131362598);
        this.f = (StylingTextView) view.findViewById(2131362593);
    }

    public final void U(vg7 vg7Var) throws Resources.NotFoundException {
        String string;
        boolean z = false;
        if (vg7Var == null || !vg7Var.c) {
            V(null, false);
            return;
        }
        long j = vg7Var.a;
        BestHorizontalFitLayout bestHorizontalFitLayout = this.c;
        if (j <= 0) {
            string = "";
        } else {
            Context context = bestHorizontalFitLayout.getContext();
            int[][] iArr = lg7.a;
            string = context.getResources().getString(2132018723, aik.h(j, context));
        }
        this.d.setText(string);
        this.e.setText(string);
        long j2 = vg7Var.b;
        String string2 = j2 > 0 ? lg7.c(bestHorizontalFitLayout.getContext(), j2, true).toString() : "";
        this.f.setText(string2);
        if (!string.isEmpty() && !string2.isEmpty()) {
            z = true;
        }
        V(vg7Var, z);
    }

    public final void V(vg7 vg7Var, boolean z) {
        BestHorizontalFitLayout bestHorizontalFitLayout = this.c;
        int visibility = bestHorizontalFitLayout.getVisibility();
        if (z && vg7Var != null && vg7Var.c) {
            if (visibility == 4) {
                bestHorizontalFitLayout.setVisibility(0);
            }
        } else if (visibility == 0) {
            ViewPropertyAnimator duration = bestHorizontalFitLayout.animate().alpha(0.0f).setDuration(250L);
            duration.withEndAction(new ld9(this, (byte) 18));
            duration.start();
        }
    }
}
