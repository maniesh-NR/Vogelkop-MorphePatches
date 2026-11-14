package com.opera.android.account.auth;

import android.os.CancellationSignal;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.opera.android.custom_views.FitWindowsFrameLayoutWithToolbar;
import com.opera.android.custom_views.ToolbarProgressBar;
import defpackage.bn7;
import defpackage.nj2;
import defpackage.ov0;
import defpackage.yij;
import defpackage.zpa;

/* loaded from: classes.dex */
public class FinishAccountSetupAuthActivity extends yij {
    public static final /* synthetic */ int W = 0;
    public final nj2 S = new nj2(this, (byte) 1);
    public ov0 T;
    public boolean U;
    public CancellationSignal V;

    @Override // defpackage.g53
    public final View H0() {
        return (Toolbar) this.T.c;
    }

    @Override // defpackage.g53
    public final void K0() {
        if (this.V != null) {
            return;
        }
        this.V = M0().g(true, new bn7(this, (byte) 25), zpa.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N0() {
        if (this.U || M0().d() || M0().e()) {
            return;
        }
        this.U = true;
        setResult(-1);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void finish() {
        super/*android.app.Activity*/.finish();
        overridePendingTransition(0, 2130772040);
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final int j0() {
        return 2131558507;
    }

    @Override // defpackage.yij, defpackage.g53, com.opera.android.FullscreenWebActivity, defpackage.dx3, defpackage.hjf
    public final void onDestroy() {
        super.onDestroy();
        CancellationSignal cancellationSignal = this.V;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
            this.V = null;
        }
        this.T = null;
    }

    @Override // defpackage.rz4
    public final void onPause() {
        super.onPause();
        M0().h(this.S);
    }

    @Override // defpackage.rz4
    public final void onResume() {
        super.onResume();
        M0().a(this.S);
        N0();
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final void u0(View view) {
        FitWindowsFrameLayoutWithToolbar fitWindowsFrameLayoutWithToolbar = (FitWindowsFrameLayoutWithToolbar) view;
        int i = 2131363061;
        if (((ToolbarProgressBar) w1h.j(2131363061, view)) != null) {
            i = 2131364794;
            Toolbar toolbarJ = w1h.j(2131364794, view);
            if (toolbarJ != null) {
                i = 2131364795;
                if (((FrameLayout) w1h.j(2131364795, view)) != null) {
                    i = 2131364798;
                    View viewJ = w1h.j(2131364798, view);
                    if (viewJ != null) {
                        i = 2131365082;
                        if (((LinearLayout) w1h.j(2131365082, view)) != null) {
                            this.T = new ov0(fitWindowsFrameLayoutWithToolbar, toolbarJ, viewJ, (byte) 2);
                            return;
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
