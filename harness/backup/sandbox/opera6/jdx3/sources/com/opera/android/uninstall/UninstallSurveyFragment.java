package com.opera.android.uninstall;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.custom_views.SideMarginContainer;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import com.opera.android.uninstall.UninstallSurveyFragment;
import defpackage.b7k;
import defpackage.dlm;
import defpackage.dpj;
import defpackage.fpj;
import defpackage.glm;
import defpackage.h63;
import defpackage.itl;
import defpackage.ixh;
import defpackage.ltl;
import defpackage.nlm;
import defpackage.pde;
import defpackage.pt1;
import defpackage.q9n;
import defpackage.r22;
import defpackage.rlm;
import defpackage.u7k;
import defpackage.vs;
import defpackage.yse;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/opera/android/uninstall/UninstallSurveyFragment;", "Lltl;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UninstallSurveyFragment extends ltl {
    public final zyk r;
    public pt1 s;
    public so5 t;
    public so5 u;
    public boolean v;

    /* JADX WARN: Illegal instructions before constructor call */
    public UninstallSurveyFragment() {
        itl itlVar = (itl) u7k.j(2131559495).a;
        itlVar.e = true;
        super(itlVar);
        this.r = z4c.b(new yse(this, (byte) 20));
    }

    public static Integer H0(nlm nlmVar) {
        List list;
        r22 r22Var = nlmVar.b;
        int i = -1;
        if (r22Var != null && (list = (List) r22Var.d) != null) {
            Iterator it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((dlm) it.next()).a.a) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (i < 0 || !nlmVar.c.contains(Integer.valueOf(i))) {
            return null;
        }
        return numValueOf;
    }

    public final void G0() {
        so5 so5Var;
        dpj dpjVar = fpj.a;
        Context contextRequireContext = requireContext();
        dpjVar.getClass();
        boolean z = dpj.k(contextRequireContext) == fpj.b;
        if (z != this.v) {
            if (!z ? (so5Var = this.t) == null : (so5Var = this.u) == null) {
                so5Var = null;
            }
            pt1 pt1Var = this.s;
            if (pt1Var == null) {
                pt1Var = null;
            }
            so5Var.a((ConstraintLayout) pt1Var.e);
            pt1 pt1Var2 = this.s;
            ((ImageView) ((b7k) ((vs) (pt1Var2 != null ? pt1Var2 : null).f).e).c).setVisibility(z ? 8 : 0);
            this.v = z;
        }
    }

    public final rlm I0() {
        return (rlm) this.r.getValue();
    }

    public final void J0() {
        pt1 pt1Var = this.s;
        if (pt1Var == null) {
            pt1Var = null;
        }
        ((OperaTextInputEditText) ((b7k) ((vs) ((vs) pt1Var.f).d).d).c).clearFocus();
        l5b l5bVar = q9n.c;
        q9n.u(getView());
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        I0().b.l(false);
    }

    @Override // defpackage.ltl
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        G0();
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        pde pdeVar = I0().c;
        ndc viewLifecycleOwner = getViewLifecycleOwner();
        pt1 pt1Var = this.s;
        if (pt1Var == null) {
            pt1Var = null;
        }
        xf8.i0(pdeVar, viewLifecycleOwner, (ConstraintLayout) pt1Var.d, (List) null, new glm(this, (byte) 0));
    }

    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        ConstraintLayout constraintLayoutFindViewById = statusBarDrawingFrameLayout.findViewById(2131362473);
        int i = 2131362182;
        if (((SideMarginContainer) w1h.j(2131362182, constraintLayoutFindViewById)) != null) {
            i = 2131362056;
            ConstraintLayout constraintLayoutJ = w1h.j(2131362056, constraintLayoutFindViewById);
            if (constraintLayoutJ != null) {
                i = 2131362414;
                ConstraintLayout constraintLayoutJ2 = w1h.j(2131362414, constraintLayoutFindViewById);
                if (constraintLayoutJ2 != null) {
                    int i2 = 2131362539;
                    TextView textView = (TextView) w1h.j(2131362539, constraintLayoutJ2);
                    if (textView != null) {
                        i2 = 2131363021;
                        View viewJ = w1h.j(2131363021, constraintLayoutJ2);
                        if (viewJ != null) {
                            int i3 = 2131362037;
                            LinearLayout linearLayout = (LinearLayout) w1h.j(2131362037, viewJ);
                            if (linearLayout != null) {
                                i3 = 2131363790;
                                View viewJ2 = w1h.j(2131363790, viewJ);
                                if (viewJ2 != null) {
                                    TextInputEditText textInputEditText = (OperaTextInputEditText) w1h.j(2131364979, viewJ2);
                                    if (textInputEditText == null) {
                                        t3p.q("Missing required view with ID: ".concat(viewJ2.getResources().getResourceName(2131364979)));
                                        return;
                                    }
                                    b7k b7kVar = new b7k((byte) 6, (FrameLayout) viewJ2, textInputEditText);
                                    i3 = 2131363981;
                                    TextView textView2 = (TextView) w1h.j(2131363981, viewJ);
                                    if (textView2 != null) {
                                        vs vsVar = new vs((LinearLayout) viewJ, linearLayout, b7kVar, textView2, (byte) 23);
                                        i2 = 2131363092;
                                        ConstraintLayout constraintLayoutJ3 = w1h.j(2131363092, constraintLayoutJ2);
                                        if (constraintLayoutJ3 != null) {
                                            int i4 = 2131362943;
                                            if (((TextView) w1h.j(2131362943, constraintLayoutJ3)) != null) {
                                                i4 = 2131362945;
                                                if (((TextView) w1h.j(2131362945, constraintLayoutJ3)) != null) {
                                                    i4 = 2131364115;
                                                    ImageView imageView = (ImageView) w1h.j(2131364115, constraintLayoutJ3);
                                                    if (imageView != null) {
                                                        b7k b7kVar2 = new b7k((byte) 5, (View) constraintLayoutJ3, (Object) imageView);
                                                        i2 = 2131363516;
                                                        if (((Space) w1h.j(2131363516, constraintLayoutJ2)) != null) {
                                                            vs vsVar2 = new vs((ViewGroup) constraintLayoutJ2, (View) textView, (Object) vsVar, (Object) b7kVar2, (byte) 22);
                                                            ConstraintLayout constraintLayout = constraintLayoutFindViewById;
                                                            int i5 = 2131363948;
                                                            MaterialButton materialButton = (OperaMaterialButton) w1h.j(2131363948, constraintLayoutFindViewById);
                                                            if (materialButton != null) {
                                                                i5 = 2131364179;
                                                                MaterialButton materialButtonJ = w1h.j(2131364179, constraintLayoutFindViewById);
                                                                if (materialButtonJ != null) {
                                                                    i5 = 2131364740;
                                                                    ViewStub viewStub = (ViewStub) w1h.j(2131364740, constraintLayoutFindViewById);
                                                                    if (viewStub != null) {
                                                                        i5 = 2131364794;
                                                                        if (w1h.j(2131364794, constraintLayoutFindViewById) != null) {
                                                                            pt1 pt1Var = new pt1((ViewGroup) constraintLayout, (View) constraintLayoutJ, (Object) vsVar2, (View) materialButton, (View) materialButtonJ, (View) viewStub, (byte) 26);
                                                                            final byte b = 0;
                                                                            materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: flm
                                                                                public final /* synthetic */ UninstallSurveyFragment b;

                                                                                {
                                                                                    this.b = this;
                                                                                }

                                                                                @Override // android.view.View.OnClickListener
                                                                                public final void onClick(View view) {
                                                                                    byte b2 = b;
                                                                                    UninstallSurveyFragment uninstallSurveyFragment = this.b;
                                                                                    switch (b2) {
                                                                                        case 0:
                                                                                            uninstallSurveyFragment.J0();
                                                                                            uninstallSurveyFragment.I0().i(qlm.a);
                                                                                            break;
                                                                                        default:
                                                                                            uninstallSurveyFragment.J0();
                                                                                            uninstallSurveyFragment.I0().i(qlm.b);
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            });
                                                                            final byte b2 = 1;
                                                                            materialButtonJ.setOnClickListener(new View.OnClickListener(this) { // from class: flm
                                                                                public final /* synthetic */ UninstallSurveyFragment b;

                                                                                {
                                                                                    this.b = this;
                                                                                }

                                                                                @Override // android.view.View.OnClickListener
                                                                                public final void onClick(View view) {
                                                                                    byte b22 = b2;
                                                                                    UninstallSurveyFragment uninstallSurveyFragment = this.b;
                                                                                    switch (b22) {
                                                                                        case 0:
                                                                                            uninstallSurveyFragment.J0();
                                                                                            uninstallSurveyFragment.I0().i(qlm.a);
                                                                                            break;
                                                                                        default:
                                                                                            uninstallSurveyFragment.J0();
                                                                                            uninstallSurveyFragment.I0().i(qlm.b);
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            });
                                                                            textInputEditText.addTextChangedListener(new h63((Object) this, (byte) 9));
                                                                            this.s = pt1Var;
                                                                            so5 so5Var = new so5();
                                                                            pt1 pt1Var2 = this.s;
                                                                            if (pt1Var2 == null) {
                                                                                pt1Var2 = null;
                                                                            }
                                                                            so5Var.d((ConstraintLayout) pt1Var2.e);
                                                                            this.t = so5Var;
                                                                            so5 so5Var2 = new so5();
                                                                            pt1 pt1Var3 = this.s;
                                                                            so5Var2.d((ConstraintLayout) (pt1Var3 != null ? pt1Var3 : null).e);
                                                                            so5Var2.f(2131364179, 6, 0, 6, 0);
                                                                            so5Var2.f(2131364179, 7, 2131363948, 6, 0);
                                                                            so5Var2.f(2131364179, 3, 0, 3, 0);
                                                                            so5Var2.f(2131364179, 4, 0, 4, 0);
                                                                            so5Var2.f(2131363948, 6, 2131364179, 7, new ixh(16.0f).k(requireContext()));
                                                                            so5Var2.f(2131363948, 7, 0, 7, 0);
                                                                            so5Var2.f(2131363948, 3, 0, 3, 0);
                                                                            so5Var2.f(2131363948, 4, 0, 4, 0);
                                                                            this.u = so5Var2;
                                                                            G0();
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            i = i5;
                                                        }
                                                    }
                                                }
                                            }
                                            t3p.q("Missing required view with ID: ".concat(constraintLayoutJ3.getResources().getResourceName(i4)));
                                            return;
                                        }
                                    }
                                }
                            }
                            t3p.q("Missing required view with ID: ".concat(viewJ.getResources().getResourceName(i3)));
                            return;
                        }
                    }
                    t3p.q("Missing required view with ID: ".concat(constraintLayoutJ2.getResources().getResourceName(i2)));
                    return;
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutFindViewById.getResources().getResourceName(i)));
    }
}
