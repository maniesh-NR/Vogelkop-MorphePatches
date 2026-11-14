package com.opera.android.account.auth;

import J.N;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.OperaApplication;
import com.opera.android.browser.WebContentsWrapper;
import com.opera.android.custom_views.FitWindowsFrameLayoutWithToolbar;
import com.opera.android.custom_views.LayoutDirectionToolbar;
import com.opera.android.custom_views.ToolbarProgressBar;
import com.opera.api.Callback;
import defpackage.f8m;
import defpackage.g53;
import defpackage.iyk;
import defpackage.l24;
import defpackage.m24;
import defpackage.orb;
import defpackage.ov0;
import defpackage.s14;
import defpackage.zzh;
import java.util.Objects;
import org.chromium.content_public.browser.WebContents;
import org.json.JSONException;

/* loaded from: classes.dex */
public class TwoFactorAuthenticationActivity extends g53 implements m24 {
    public static final /* synthetic */ int T = 0;
    public final pad P;
    public ov0 Q;
    public s14 R;
    public boolean S;

    public TwoFactorAuthenticationActivity() {
        super(0);
        this.P = new pad((byte) 7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g53
    public final Uri F0() {
        Uri data = getIntent().getData();
        if (data == null) {
            return null;
        }
        Uri uriH = dgh.h();
        if (!data.isAbsolute()) {
            data = data.getEncodedPath().startsWith("/") ? uriH.buildUpon().encodedPath(data.getEncodedPath()).build() : Uri.withAppendedPath(uriH, data.getEncodedPath());
        }
        if (Objects.equals(data.getScheme(), uriH.getScheme()) && Objects.equals(data.getHost(), uriH.getHost())) {
            return data;
        }
        M0();
        return null;
    }

    @Override // defpackage.g53
    public final String G0() {
        return getResources().getString(2132018853);
    }

    @Override // defpackage.g53
    public final View H0() {
        return (LayoutDirectionToolbar) this.Q.c;
    }

    @Override // defpackage.g53
    public final void I0() {
        M0();
    }

    @Override // defpackage.g53
    public final void J0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g53
    public final void K0() {
        if (this.S) {
            return;
        }
        this.S = true;
        String[] strArr = OperaApplication.K;
        ((OperaApplication) getApplication()).s().y(new zzh(this, (byte) 29), true);
    }

    @Override // defpackage.g53
    public final void L0(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M0() {
        s14 s14Var = this.R;
        if (s14Var != null) {
            mgh mghVar = (mgh) s14Var.d;
            if (((Callback) mghVar.c) != null) {
                mghVar.e("2fa error");
            }
            this.R = null;
        }
        finish();
    }

    @Override // defpackage.m24
    public final void a(l24 l24Var) {
        this.P.t(l24Var);
    }

    @Override // defpackage.m24
    public final void c(l24 l24Var) {
        this.P.A(l24Var);
    }

    @Override // defpackage.dx3, defpackage.hjf
    public final Object getSystemService(String str) {
        return "com.opera.android.BPR_SERVICE".equals(str) ? this : super.getSystemService(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void interfaceCall(@Nullable String str, @NonNull Callback callback) {
        if (str == null) {
            M0();
            return;
        }
        if (this.R == null) {
            finish();
            return;
        }
        try {
            orb orbVar = new orb(str);
            s14 s14Var = this.R;
            iyk iykVar = new iyk(this, callback, (byte) 3);
            if (((Callback) ((mgh) s14Var.d).c) == null) {
                iykVar.run(null);
            } else if (!s14Var.b || ((iyk) s14Var.e) != null) {
                iykVar.run(null);
            } else {
                s14Var.e = iykVar;
                s14Var.s(orbVar);
            }
        } catch (JSONException unused) {
            M0();
        }
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final int j0() {
        return 2131559178;
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final WebContentsWrapper t0(qi qiVar, WebContents webContents) {
        N.ML2Ly2B9(this, webContents);
        return super.t0(qiVar, webContents);
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final void u0(View view) {
        FitWindowsFrameLayoutWithToolbar fitWindowsFrameLayoutWithToolbar = (FitWindowsFrameLayoutWithToolbar) view;
        int i = 2131362089;
        if (((FrameLayout) w1h.j(2131362089, view)) != null) {
            i = 2131363061;
            if (((ToolbarProgressBar) w1h.j(2131363061, view)) != null) {
                i = 2131364794;
                LayoutDirectionToolbar layoutDirectionToolbarJ = w1h.j(2131364794, view);
                if (layoutDirectionToolbarJ != null) {
                    i = 2131364795;
                    if (((FrameLayout) w1h.j(2131364795, view)) != null) {
                        i = 2131364798;
                        View viewJ = w1h.j(2131364798, view);
                        if (viewJ != null) {
                            i = 2131365082;
                            if (((LinearLayout) w1h.j(2131365082, view)) != null) {
                                this.Q = new ov0(fitWindowsFrameLayoutWithToolbar, layoutDirectionToolbarJ, viewJ, (byte) 28);
                                return;
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g53, com.opera.android.FullscreenWebActivity
    public final void v0() {
        s14 s14Var = f8m.e;
        this.R = s14Var;
        if (s14Var == null) {
            finish();
        } else {
            super.v0();
        }
    }
}
