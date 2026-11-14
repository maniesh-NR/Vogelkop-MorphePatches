package defpackage;

import android.content.res.Resources;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.opera.android.custom_views.StylingImageView;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class itg extends h83 {
    @Override // defpackage.i83
    public final void H0(ei eiVar) {
        TextView textView = (TextView) eiVar.h;
        Resources resources = textView.getResources();
        q9n.E(textView, resources.getDimensionPixelSize(2131165267), resources.getDimensionPixelSize(2131165266));
        AppCompatImageView appCompatImageView = (StylingImageView) eiVar.f;
        q9n.C(appCompatImageView.getResources().getDimensionPixelSize(2131165265), appCompatImageView);
    }

    @Override // defpackage.i83
    public final void I0() throws JSONException {
        p8f p8fVar = this.z.c;
        lvg lvgVar = new lvg(2, 5);
        mvg mvgVarT = p8fVar.t();
        if (mvgVarT != null) {
            mvgVarT.f.add(lvgVar);
            p8fVar.G(mvgVarT);
        }
        xih.t(requireActivity().getSupportFragmentManager(), false, null);
    }

    @Override // defpackage.jbl
    public final String y() {
        return "base-account-onboarding-fragment";
    }
}
