package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import com.opera.android.OperaApplication;
import com.opera.android.bubbleview.BubbleView;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class rcn extends lz3 {
    public rcn(ViewGroup viewGroup, View view, int i, CharSequence charSequence, CharSequence charSequence2, wzg wzgVar, int i2, mf0 mf0Var) {
        super(viewGroup, i2, 1500L, new l11(view, 1, i));
        Context context = view.getContext();
        String[] strArr = OperaApplication.K;
        lcn lcnVar = new lcn(this, ((OperaApplication) context.getApplicationContext()).L().c, mf0Var);
        a(lcnVar);
        BubbleView bubbleView = this.b;
        int i3 = 2131361862;
        MaterialButton materialButtonJ = w1h.j(2131361862, bubbleView);
        if (materialButtonJ != null) {
            i3 = 2131362353;
            if (((StylingImageButton) w1h.j(2131362353, bubbleView)) != null) {
                i3 = 2131362414;
                if (w1h.j(2131362414, bubbleView) != null) {
                    i3 = 2131363509;
                    yq1 yq1Var = (StylingTextView) w1h.j(2131363509, bubbleView);
                    if (yq1Var != null) {
                        i3 = 2131363525;
                        yq1 yq1Var2 = (StylingTextView) w1h.j(2131363525, bubbleView);
                        if (yq1Var2 != null) {
                            yq1Var2.setText(charSequence);
                            yq1Var.setText(charSequence2);
                            byte b = 8;
                            if (wzgVar == null) {
                                materialButtonJ.setVisibility(8);
                                return;
                            }
                            materialButtonJ.setText((CharSequence) wzgVar.b);
                            materialButtonJ.setOnClickListener(new dv2(this, lcnVar, wzgVar, b));
                            materialButtonJ.setVisibility(0);
                            return;
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(bubbleView.getResources().getResourceName(i3)));
        throw null;
    }

    @Override // defpackage.lz3
    public final boolean d(boolean z) {
        if (!e(z)) {
            return false;
        }
        b(hjm.b);
        return true;
    }
}
