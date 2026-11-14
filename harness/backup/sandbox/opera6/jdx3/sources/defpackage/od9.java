package defpackage;

import android.widget.FrameLayout;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.OperaButtonBarLayout;
import com.opera.android.custom_views.StylingTextView;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public class od9 extends s63 implements jbl {
    public int l;
    public ode m;
    public String n;
    public ode o;
    public Callback p;
    public ks3 q;

    public final void A0() {
        ks3 ks3Var = this.q;
        if (ks3Var == null) {
            return;
        }
        ((OperaButtonBarLayout) ks3Var.e).setVisibility(4);
        ((LayoutDirectionLinearLayout) this.q.g).animate().alpha(0.0f);
        ((FrameLayout) this.q.h).animate().alpha(1.0f);
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        super.onDestroy();
        Callback callback = this.p;
        if (callback == null) {
            return;
        }
        this.p = null;
        callback.run(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0228 A[PHI: r1
      0x0228: PHI (r1v7 int) = (r1v6 int), (r1v10 int), (r1v15 int) binds: [B:51:0x00f2, B:57:0x0111, B:67:0x0146] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.s63
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dgh s0(android.view.LayoutInflater r28, android.view.ViewGroup r29, defpackage.epj r30) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od9.s0(android.view.LayoutInflater, android.view.ViewGroup, epj):dgh");
    }

    @Override // defpackage.s63
    public final void t0() {
        this.q = null;
    }

    @Override // defpackage.jbl
    public final String y() {
        return "flow-code-verification";
    }

    public final void y0(Boolean bool) {
        if (this.q == null) {
            return;
        }
        boolean z = bool != null && bool.booleanValue();
        ks3 ks3Var = this.q;
        if (z) {
            ((MaterialButton) ks3Var.d).setEnabled(true);
            ((MaterialButton) this.q.c).setEnabled(true);
        } else {
            ((MaterialButton) ks3Var.d).setEnabled(false);
            ((MaterialButton) this.q.c).setEnabled(false);
        }
    }

    public final void z0(String str) {
        ks3 ks3Var = this.q;
        if (ks3Var == null) {
            return;
        }
        if (str == null) {
            ((LayoutDirectionLinearLayout) ks3Var.g).animate().alpha(0.0f);
            ((FrameLayout) this.q.h).animate().alpha(1.0f);
            return;
        }
        if (str.length() == 6) {
            str = str.substring(0, 3) + " " + str.substring(3, 6);
        }
        ((StylingTextView) this.q.f).setText(str);
        ((LayoutDirectionLinearLayout) this.q.g).animate().alpha(1.0f);
        ((FrameLayout) this.q.h).animate().alpha(0.0f);
    }
}
