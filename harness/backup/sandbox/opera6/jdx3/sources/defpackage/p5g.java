package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.button.MaterialButton;
import com.opera.ad.interstitial.AdActivity;
import com.opera.android.custom_views.OrientationFitConstraintLayout;

/* loaded from: classes.dex */
public final class p5g extends FrameLayout {
    public final /* synthetic */ byte a = 0;
    public final Object b;

    public p5g(Context context) {
        super(context, null, 0, 0);
        LayoutInflater.from(context).inflate(2131559209, this);
        int i = 2131362240;
        if (((OrientationFitConstraintLayout) w1h.j(2131362240, this)) != null) {
            i = 2131363196;
            MaterialButton materialButtonJ = w1h.j(2131363196, this);
            if (materialButtonJ != null) {
                i = 2131364075;
                MaterialButton materialButtonJ2 = w1h.j(2131364075, this);
                if (materialButtonJ2 != null) {
                    this.b = new q5g(this, materialButtonJ, materialButtonJ2, (byte) 0);
                    return;
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public p5g(AdActivity adActivity, nxo nxoVar) {
        super(adActivity);
        this.b = nxoVar;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 1:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                nxo nxoVar = (nxo) this.b;
                if (nxoVar != null && size != 0 && size2 != 0) {
                    int[] iArrK = z4o.k(nxoVar, size, size2);
                    for (int i3 = 0; i3 < getChildCount(); i3++) {
                        getChildAt(i3).measure(View.MeasureSpec.makeMeasureSpec(iArrK[0], 1073741824), View.MeasureSpec.makeMeasureSpec(iArrK[1], 1073741824));
                    }
                    setMeasuredDimension(iArrK[0], iArrK[1]);
                    break;
                } else {
                    super.onMeasure(i, i2);
                    break;
                }
            default:
                super.onMeasure(i, i2);
                break;
        }
    }
}
