package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.opera.android.custom_views.CheckBox;
import com.opera.android.custom_views.DialogTitle;
import com.opera.android.custom_views.FadingScrollView;
import com.opera.android.custom_views.OperaButtonBarLayout;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;

/* loaded from: classes.dex */
public final class vrk extends c63 {
    public final ua7 e;

    public vrk(gjm gjmVar, gw3 gw3Var) {
        super(gjmVar, gw3Var, srk.b);
        this.e = new ua7((Fragment) this, gjmVar);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaMaterialButton] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.TextView, com.opera.android.custom_views.StylingTextView] */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaMaterialButton] */
    @Override // defpackage.c63
    public final Dialog g0(Bundle bundle) {
        trk trkVar = (trk) this.e.p();
        Context contextRequireContext = requireContext();
        urk urkVar = new urk(this, (byte) 0);
        urk urkVar2 = new urk(this, (byte) 1);
        Dialog dialog = new Dialog(contextRequireContext, trkVar.e);
        dialog.setContentView(2131559536);
        ConstraintLayout constraintLayoutRequireViewById = dialog.requireViewById(2131362526);
        int i = 2131362230;
        if (((OperaButtonBarLayout) w1h.j(2131362230, constraintLayoutRequireViewById)) != null) {
            ConstraintLayout constraintLayout = constraintLayoutRequireViewById;
            i = 2131363170;
            CheckBox checkBox = (CheckBox) w1h.j(2131363170, constraintLayoutRequireViewById);
            if (checkBox != null) {
                i = 2131363509;
                ?? r8 = (StylingTextView) w1h.j(2131363509, constraintLayoutRequireViewById);
                if (r8 != 0) {
                    i = 2131363659;
                    ?? r9 = (OperaMaterialButton) w1h.j(2131363659, constraintLayoutRequireViewById);
                    if (r9 != 0) {
                        i = 2131363917;
                        ?? r10 = (OperaMaterialButton) w1h.j(2131363917, constraintLayoutRequireViewById);
                        if (r10 != 0) {
                            i = 2131364140;
                            if (((FadingScrollView) w1h.j(2131364140, constraintLayoutRequireViewById)) != null) {
                                i = 2131364511;
                                if (((Space) w1h.j(2131364511, constraintLayoutRequireViewById)) != null) {
                                    i = 2131363525;
                                    if (((DialogTitle) w1h.j(2131363525, constraintLayoutRequireViewById)) != null) {
                                        jm9 jm9Var = new jm9(constraintLayout, checkBox, r8, r9, r10);
                                        r8.setText(constraintLayout.getResources().getString(2132022305, constraintLayout.getResources().getString(2132017591)));
                                        r10.setEnabled(false);
                                        r10.setOnClickListener(new h4i(urkVar, (byte) 18));
                                        r9.setOnClickListener(new h4i(urkVar2, (byte) 19));
                                        checkBox.m = new crk(jm9Var, (byte) 2);
                                        return dialog;
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
        return trk.class;
    }
}
