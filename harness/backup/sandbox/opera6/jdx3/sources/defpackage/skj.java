package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.DialogTitle;
import com.opera.android.custom_views.FadingScrollView;
import com.opera.android.custom_views.OperaButtonBarLayout;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;

/* loaded from: classes.dex */
public final class skj extends c63 {
    public final ua7 e;

    public skj(gjm gjmVar, qcf qcfVar) {
        super(gjmVar, qcfVar, pkj.c);
        this.e = new ua7((Fragment) this, gjmVar);
    }

    @Override // defpackage.c63
    public final Dialog g0(Bundle bundle) {
        qkj qkjVar = (qkj) this.e.p();
        Context contextRequireContext = requireContext();
        rkj rkjVar = new rkj(this, (byte) 0);
        rkj rkjVar2 = new rkj(this, (byte) 1);
        wwd wwdVar = qkjVar.b;
        vql vqlVar = qkjVar.a;
        Dialog dialog = new Dialog(contextRequireContext, qkjVar.e);
        Resources resources = dialog.getContext().getResources();
        dialog.setContentView(2131559180);
        ConstraintLayout constraintLayoutRequireViewById = dialog.requireViewById(2131362526);
        int i = 2131362125;
        if (((FrameLayout) w1h.j(2131362125, constraintLayoutRequireViewById)) != null) {
            i = 2131362126;
            if (((ImageView) w1h.j(2131362126, constraintLayoutRequireViewById)) != null) {
                i = 2131362230;
                if (((OperaButtonBarLayout) w1h.j(2131362230, constraintLayoutRequireViewById)) != null) {
                    ConstraintLayout constraintLayout = constraintLayoutRequireViewById;
                    i = 2131363509;
                    StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363509, constraintLayoutRequireViewById);
                    if (stylingTextView != null) {
                        i = 2131363659;
                        OperaMaterialButton operaMaterialButton = (OperaMaterialButton) w1h.j(2131363659, constraintLayoutRequireViewById);
                        if (operaMaterialButton != null) {
                            i = 2131363661;
                            if (((OperaMaterialButton) w1h.j(2131363661, constraintLayoutRequireViewById)) != null) {
                                i = 2131363917;
                                OperaMaterialButton operaMaterialButton2 = (OperaMaterialButton) w1h.j(2131363917, constraintLayoutRequireViewById);
                                if (operaMaterialButton2 != null) {
                                    i = 2131364140;
                                    if (((FadingScrollView) w1h.j(2131364140, constraintLayoutRequireViewById)) != null) {
                                        i = 2131364511;
                                        if (((Space) w1h.j(2131364511, constraintLayoutRequireViewById)) != null) {
                                            i = 2131363525;
                                            DialogTitle dialogTitle = (DialogTitle) w1h.j(2131363525, constraintLayoutRequireViewById);
                                            if (dialogTitle != null) {
                                                qkjVar.f = new pt1(constraintLayout, constraintLayout, stylingTextView, operaMaterialButton, operaMaterialButton2, dialogTitle);
                                                qkjVar.a();
                                                pt1 pt1Var = qkjVar.f;
                                                if (pt1Var == null) {
                                                    pt1Var = null;
                                                }
                                                yq1 yq1Var = (DialogTitle) pt1Var.b;
                                                CharSequence charSequenceA = vqlVar.a.a(resources);
                                                yq1Var.setText(charSequenceA);
                                                yq1Var.setVisibility(charSequenceA.length() > 0 ? 0 : 8);
                                                if (vqlVar.b) {
                                                    yq1Var.setTextAlignment(4);
                                                }
                                                pt1 pt1Var2 = qkjVar.f;
                                                if (pt1Var2 == null) {
                                                    pt1Var2 = null;
                                                }
                                                yq1 yq1Var2 = (StylingTextView) pt1Var2.c;
                                                CharSequence charSequenceA2 = wwdVar.a.a(resources);
                                                yq1Var2.setText(charSequenceA2);
                                                yq1Var2.setVisibility(charSequenceA2.length() > 0 ? 0 : 8);
                                                pt1 pt1Var3 = qkjVar.f;
                                                if (pt1Var3 == null) {
                                                    pt1Var3 = null;
                                                }
                                                MaterialButton materialButton = (OperaMaterialButton) pt1Var3.g;
                                                CharSequence charSequenceA3 = qkjVar.c.a(resources);
                                                materialButton.setText(charSequenceA3);
                                                materialButton.setVisibility(charSequenceA3.length() > 0 ? 0 : 8);
                                                materialButton.setOnClickListener(new nf(rkjVar, dialog, (byte) 10));
                                                pt1 pt1Var4 = qkjVar.f;
                                                MaterialButton materialButton2 = (OperaMaterialButton) (pt1Var4 != null ? pt1Var4 : null).f;
                                                CharSequence charSequenceA4 = qkjVar.d.a(resources);
                                                materialButton2.setText(charSequenceA4);
                                                materialButton2.setVisibility(charSequenceA4.length() <= 0 ? 8 : 0);
                                                materialButton2.setOnClickListener(new nf(rkjVar2, dialog, (byte) 11));
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
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutRequireViewById.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.c63
    public final Class h0() {
        return ((qkj) this.e.p()).getClass();
    }

    @Override // defpackage.c63
    public final void i0(boolean z) {
        ((qkj) this.e.p()).b(z);
    }
}
