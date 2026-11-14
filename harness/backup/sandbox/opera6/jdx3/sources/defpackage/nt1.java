package defpackage;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.opera.android.custom_views.DialogTitle;
import com.opera.android.custom_views.FadingScrollView;
import com.opera.android.custom_views.OperaButtonBarLayout;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;

/* loaded from: classes.dex */
public final class nt1 extends c63 {
    public final ua7 e;
    public pt1 f;

    public nt1(gjm gjmVar, qcf qcfVar) {
        super(gjmVar, qcfVar, kt1.c);
        this.e = new ua7((Fragment) this, gjmVar);
    }

    @Override // defpackage.c63
    public final Dialog g0(Bundle bundle) {
        final Dialog dialog = new Dialog(requireContext(), 2132083349);
        dialog.setContentView(2131558645);
        ConstraintLayout constraintLayoutRequireViewById = dialog.requireViewById(2131362526);
        int i = 2131362124;
        View viewJ = w1h.j(2131362124, constraintLayoutRequireViewById);
        if (viewJ != null) {
            zt5 zt5VarA = zt5.a(viewJ);
            i = 2131362125;
            FrameLayout frameLayout = (FrameLayout) w1h.j(2131362125, constraintLayoutRequireViewById);
            if (frameLayout != null) {
                i = 2131362230;
                if (((OperaButtonBarLayout) w1h.j(2131362230, constraintLayoutRequireViewById)) != null) {
                    ConstraintLayout constraintLayout = constraintLayoutRequireViewById;
                    i = 2131363509;
                    StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363509, constraintLayoutRequireViewById);
                    if (stylingTextView != null) {
                        i = 2131363659;
                        OperaMaterialButton operaMaterialButton = (OperaMaterialButton) w1h.j(2131363659, constraintLayoutRequireViewById);
                        if (operaMaterialButton != null) {
                            i = 2131363917;
                            OperaMaterialButton operaMaterialButton2 = (OperaMaterialButton) w1h.j(2131363917, constraintLayoutRequireViewById);
                            if (operaMaterialButton2 != null) {
                                i = 2131364140;
                                if (((FadingScrollView) w1h.j(2131364140, constraintLayoutRequireViewById)) != null) {
                                    i = 2131364511;
                                    if (((Space) w1h.j(2131364511, constraintLayoutRequireViewById)) != null) {
                                        i = 2131363525;
                                        if (((DialogTitle) w1h.j(2131363525, constraintLayoutRequireViewById)) != null) {
                                            this.f = new pt1(constraintLayout, zt5VarA, frameLayout, stylingTextView, operaMaterialButton, operaMaterialButton2);
                                            final byte b = 0;
                                            final byte b2 = 1;
                                            boolean z = getResources().getConfiguration().orientation == 1;
                                            pt1 pt1Var = this.f;
                                            if (pt1Var == null) {
                                                pt1Var = null;
                                            }
                                            ((FrameLayout) pt1Var.b).setVisibility(z ? 0 : 8);
                                            pt1 pt1Var2 = this.f;
                                            if (pt1Var2 == null) {
                                                pt1Var2 = null;
                                            }
                                            String string = getString(2132017591);
                                            ((zt5) pt1Var2.e).c.setText(getString(2132018516, new Object[]{string}));
                                            ((StylingTextView) pt1Var2.c).setText(getString(2132017583, new Object[]{string}));
                                            pt1 pt1Var3 = this.f;
                                            pt1 pt1Var4 = pt1Var3 != null ? pt1Var3 : null;
                                            ((OperaMaterialButton) pt1Var4.g).setOnClickListener(new View.OnClickListener(this) { // from class: mt1
                                                public final /* synthetic */ nt1 b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    byte b3 = b;
                                                    Dialog dialog2 = dialog;
                                                    nt1 nt1Var = this.b;
                                                    switch (b3) {
                                                        case 0:
                                                            nt1Var.c = kt1.a;
                                                            dialog2.dismiss();
                                                            break;
                                                        default:
                                                            nt1Var.c = kt1.b;
                                                            dialog2.dismiss();
                                                            break;
                                                    }
                                                }
                                            });
                                            ((OperaMaterialButton) pt1Var4.f).setOnClickListener(new View.OnClickListener(this) { // from class: mt1
                                                public final /* synthetic */ nt1 b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    byte b3 = b2;
                                                    Dialog dialog2 = dialog;
                                                    nt1 nt1Var = this.b;
                                                    switch (b3) {
                                                        case 0:
                                                            nt1Var.c = kt1.a;
                                                            dialog2.dismiss();
                                                            break;
                                                        default:
                                                            nt1Var.c = kt1.b;
                                                            dialog2.dismiss();
                                                            break;
                                                    }
                                                }
                                            });
                                            return dialog;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutRequireViewById.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.c63
    public final Class h0() {
        return lt1.class;
    }

    @Override // defpackage.c63
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean z = configuration.orientation == 1;
        pt1 pt1Var = this.f;
        if (pt1Var == null) {
            pt1Var = null;
        }
        ((FrameLayout) pt1Var.b).setVisibility(z ? 0 : 8);
    }
}
