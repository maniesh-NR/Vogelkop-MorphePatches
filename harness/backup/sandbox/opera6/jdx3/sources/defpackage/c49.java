package defpackage;

import android.content.res.Resources;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.StylingImageView;

/* loaded from: classes.dex */
public final class c49 extends i83 {
    public final db z;

    public c49(db dbVar) {
        super(2132019661, 2132017274, 2131558428, 2132017269);
        this.z = dbVar;
    }

    @Override // defpackage.i83
    public final Pair G0(View view) {
        int i = 2131363948;
        MaterialButton materialButtonJ = w1h.j(2131363948, view);
        if (materialButtonJ != null) {
            i = 2131364179;
            MaterialButton materialButtonJ2 = w1h.j(2131364179, view);
            if (materialButtonJ2 != null) {
                return new Pair(materialButtonJ, materialButtonJ2);
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.i83
    public final void H0(ei eiVar) {
        TextView textView = (TextView) eiVar.h;
        Resources resources = textView.getResources();
        q9n.E(textView, resources.getDimensionPixelSize(2131165267), resources.getDimensionPixelSize(2131165266));
        AppCompatImageView appCompatImageView = (StylingImageView) eiVar.f;
        q9n.C(appCompatImageView.getResources().getDimensionPixelSize(2131165265), appCompatImageView);
    }

    @Override // defpackage.i83
    public final void I0() {
        xih.w(requireActivity().getSupportFragmentManager(), this.z, null, true);
    }

    @Override // defpackage.jbl
    public final String y() {
        return "base-account-onboarding-fragment";
    }
}
