package com.opera.android.account.auth;

import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.FitWindowsFrameLayoutWithToolbar;
import com.opera.android.custom_views.LayoutDirectionToolbar;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.ToolbarProgressBar;
import defpackage.bn7;
import defpackage.bw7;
import defpackage.db;
import defpackage.g53;
import defpackage.ov0;
import defpackage.su;
import defpackage.vml;
import defpackage.yk4;

/* loaded from: classes.dex */
public class EditProfileAuthActivity extends g53 {
    public static final /* synthetic */ int V = 0;
    public ov0 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;

    public EditProfileAuthActivity() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g53
    public Uri F0() {
        if (!this.R) {
            return null;
        }
        Uri uriBuild = dgh.h().buildUpon().appendEncodedPath(vep.h(2)).build();
        String stringExtra = getIntent().getStringExtra("ARGUMENT_HIGHLIGHT_SECTION");
        return stringExtra != null ? uriBuild.buildUpon().fragment(stringExtra).build() : uriBuild;
    }

    @Override // defpackage.g53
    public final String G0() {
        return "";
    }

    @Override // defpackage.g53
    public final View H0() {
        return ((ov0) this.P.c).b;
    }

    @Override // defpackage.g53
    public final void I0() {
        vml.c(new bn7((Object) this, (byte) 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g53
    public final void J0() {
        if (this.R) {
            String[] strArr = OperaApplication.K;
            db dbVarB = ((OperaApplication) getApplication()).b();
            dbVarB.g(true, new rl((byte) 16), new su((Object) this, (Object) dbVarB, (Object) ((OperaApplication) getApplication()).s(), (byte) 22));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g53
    public final void K0() {
        if (this.S) {
            return;
        }
        this.S = true;
        String[] strArr = OperaApplication.K;
        ((OperaApplication) getApplication()).s().y(new bw7(this, (byte) 1), true);
    }

    @Override // defpackage.g53
    public final void L0(View view) {
        boolean z = z();
        ov0 ov0Var = this.P;
        if (z) {
            ((StylingImageView) ((ov0) ov0Var.c).c).setImageResource(2131232477);
        } else {
            ((StylingImageView) ((ov0) ov0Var.c).c).setImageResource(2131232478);
        }
        ((ov0) this.P.c).b.setBackgroundColor(f03.t(2130968702, view.getContext(), 2131103876));
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final int j0() {
        return 2131558506;
    }

    @Override // defpackage.g53, com.opera.android.FullscreenWebActivity, defpackage.dx3, defpackage.hjf
    public final void onDestroy() {
        this.U = true;
        super.onDestroy();
    }

    @Override // com.opera.android.FullscreenWebActivity, defpackage.dx3
    public final void onStop() {
        super.onStop();
        this.Q = false;
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final void p0() {
        if (!this.T) {
            super.p0();
            this.T = true;
        }
        this.Q = true;
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final void u0(View view) {
        FitWindowsFrameLayoutWithToolbar fitWindowsFrameLayoutWithToolbar = (FitWindowsFrameLayoutWithToolbar) view;
        int i = 2131363061;
        if (((ToolbarProgressBar) w1h.j(2131363061, view)) != null) {
            i = 2131364794;
            LayoutDirectionToolbar layoutDirectionToolbarJ = w1h.j(2131364794, view);
            if (layoutDirectionToolbarJ != null) {
                int i2 = 2131363774;
                StylingImageView stylingImageView = (StylingImageView) w1h.j(2131363774, layoutDirectionToolbarJ);
                if (stylingImageView != null) {
                    i2 = 2131364454;
                    MaterialButton materialButtonJ = w1h.j(2131364454, layoutDirectionToolbarJ);
                    if (materialButtonJ != null) {
                        ov0 ov0Var = new ov0((View) layoutDirectionToolbarJ, (Object) stylingImageView, (Object) materialButtonJ, (byte) 3);
                        int i3 = 2131364795;
                        if (((FrameLayout) w1h.j(2131364795, view)) != null) {
                            i3 = 2131364798;
                            View viewJ = w1h.j(2131364798, view);
                            if (viewJ != null) {
                                i3 = 2131365082;
                                if (((LinearLayout) w1h.j(2131365082, view)) != null) {
                                    this.P = new ov0((View) fitWindowsFrameLayoutWithToolbar, (Object) ov0Var, (Object) viewJ, (byte) 1);
                                    return;
                                }
                            }
                        }
                        i = i3;
                    }
                }
                t3p.q("Missing required view with ID: ".concat(layoutDirectionToolbarJ.getResources().getResourceName(i2)));
                return;
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g53, com.opera.android.FullscreenWebActivity
    public final void v0() {
        super.v0();
        ((MaterialButton) ((ov0) this.P.c).d).setOnClickListener(new yk4((Object) this, (byte) 16));
        ((OperaApplication) getApplication()).s().y(new bw7(this, (byte) 0), false);
    }
}
