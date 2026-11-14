package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.opera.android.custom_views.DialogTitle;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.custom_views.OperaButtonBarLayout;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;

/* loaded from: classes.dex */
public final class ht1 extends c63 {
    public final it1 e;
    public final umi f;
    public final ua7 g;

    public ht1(it1 it1Var, umi umiVar, gjm gjmVar, gw3 gw3Var) {
        super(gjmVar, gw3Var, et1.c);
        this.e = it1Var;
        this.f = umiVar;
        this.g = new ua7((Fragment) this, gjmVar);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaMaterialButton] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaMaterialButton] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, com.opera.android.custom_views.FadingRecyclerView] */
    @Override // defpackage.c63
    public final Dialog g0(Bundle bundle) {
        final Dialog dialog = new Dialog(requireContext(), 2132083349);
        dialog.setContentView(2131558488);
        ConstraintLayout constraintLayoutRequireViewById = dialog.requireViewById(2131362526);
        int i = 2131362230;
        if (((OperaButtonBarLayout) w1h.j(2131362230, constraintLayoutRequireViewById)) != null) {
            ConstraintLayout constraintLayout = constraintLayoutRequireViewById;
            int i2 = 2131363509;
            if (((StylingTextView) w1h.j(2131363509, constraintLayoutRequireViewById)) != null) {
                i2 = 2131363659;
                ?? r4 = (OperaMaterialButton) w1h.j(2131363659, constraintLayoutRequireViewById);
                if (r4 != 0) {
                    i2 = 2131363917;
                    ?? r5 = (OperaMaterialButton) w1h.j(2131363917, constraintLayoutRequireViewById);
                    if (r5 != 0) {
                        i2 = 2131364431;
                        ?? r6 = (FadingRecyclerView) w1h.j(2131364431, constraintLayoutRequireViewById);
                        if (r6 != 0) {
                            i2 = 2131364511;
                            if (((Space) w1h.j(2131364511, constraintLayoutRequireViewById)) != null) {
                                i2 = 2131363525;
                                if (((DialogTitle) w1h.j(2131363525, constraintLayoutRequireViewById)) != null) {
                                    kf kfVar = new kf(constraintLayout, r4, r5, r6);
                                    final byte b = 0;
                                    r6.setWillNotDraw(false);
                                    this.f.b(new vx(this, (byte) 3)).c(new xj(kfVar, this, (byte) 10)).a(null, null);
                                    r5.setOnClickListener(new View.OnClickListener(this) { // from class: gt1
                                        public final /* synthetic */ ht1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b2 = b;
                                            Dialog dialog2 = dialog;
                                            ht1 ht1Var = this.b;
                                            switch (b2) {
                                                case 0:
                                                    ht1Var.c = et1.a;
                                                    dialog2.dismiss();
                                                    break;
                                                default:
                                                    ht1Var.c = et1.b;
                                                    dialog2.dismiss();
                                                    break;
                                            }
                                        }
                                    });
                                    final byte b2 = 1;
                                    r4.setOnClickListener(new View.OnClickListener(this) { // from class: gt1
                                        public final /* synthetic */ ht1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b22 = b2;
                                            Dialog dialog2 = dialog;
                                            ht1 ht1Var = this.b;
                                            switch (b22) {
                                                case 0:
                                                    ht1Var.c = et1.a;
                                                    dialog2.dismiss();
                                                    break;
                                                default:
                                                    ht1Var.c = et1.b;
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
            i = i2;
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutRequireViewById.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.c63
    public final Class h0() {
        return ft1.class;
    }
}
