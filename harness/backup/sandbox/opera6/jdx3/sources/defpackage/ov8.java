package defpackage;

import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.feed.SoftwareClipMaskableFrameLayout;
import com.opera.android.ui.catalog.widget.OperaTextView;

/* loaded from: classes.dex */
public final class ov8 extends ou8 {
    public static final ixh m = new ixh(36.0f);
    public static final ixh n = new ixh(52.0f);
    public final yhe k;
    public final vs l;

    public ov8(View view, yhe yheVar, r9i r9iVar) {
        super(r9iVar, view);
        this.k = yheVar;
        SoftwareClipMaskableFrameLayout softwareClipMaskableFrameLayout = (SoftwareClipMaskableFrameLayout) view;
        int i = 2131362921;
        if (((StylingImageView) w1h.j(2131362921, view)) != null) {
            i = 2131362923;
            yq1 yq1Var = (StylingTextView) w1h.j(2131362923, view);
            if (yq1Var != null) {
                i = 2131362924;
                LinearLayout linearLayout = (LinearLayout) w1h.j(2131362924, view);
                if (linearLayout != null) {
                    i = 2131362925;
                    OperaTextView operaTextViewJ = w1h.j(2131362925, view);
                    if (operaTextViewJ != null) {
                        this.l = new vs((ViewGroup) softwareClipMaskableFrameLayout, (View) yq1Var, (Object) linearLayout, (Object) operaTextViewJ, (byte) 12);
                        if (view instanceof SoftwareClipMaskableFrameLayout) {
                            ((SoftwareClipMaskableFrameLayout) view).d = new ge5(view, this, (byte) 21);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.ou8, defpackage.y9n
    public final void T(View view, int i, int i2) {
        j82 j82Var;
        super.T(view, i, i2);
        if (!r9i.K(i, i2) || (j82Var = (j82) this.b) == null) {
            return;
        }
        oqe oqeVar = ((pue) j82Var).c;
        yhe yheVar = this.k;
        if (oqeVar != null) {
            ((uqe) yheVar.b).h.j(oqeVar, 1);
        } else {
            yheVar.getClass();
        }
    }

    @Override // defpackage.ou8, defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        super.V(ja2Var, z);
        if (z) {
            return;
        }
        oqe oqeVar = ((pue) ((j82) a0())).c;
        if (oqeVar instanceof msh) {
            vs vsVar = this.l;
            ((StylingTextView) vsVar.c).setText(((i) this).itemView.getResources().getString(2132019031, ((StylingTextView) vsVar.c).getText(), DateUtils.getRelativeTimeSpanString(((msh) oqeVar).o * 1000, System.currentTimeMillis(), 60000L, 262144)));
        }
    }

    @Override // defpackage.ou8, android.view.View.OnClickListener
    public final void onClick(View view) {
        super.onClick(view);
        j82 j82Var = (j82) this.b;
        if (j82Var == null || view != ((i) this).itemView) {
            return;
        }
        oqe oqeVar = ((pue) j82Var).c;
        boolean z = oqeVar instanceof msh;
        yhe yheVar = this.k;
        if (z) {
            ((uqe) yheVar.b).h.h(1, (msh) oqeVar);
        } else {
            yheVar.getClass();
        }
    }
}
