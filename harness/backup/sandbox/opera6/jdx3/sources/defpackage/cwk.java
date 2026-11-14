package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.browser.chromium.ChromiumContainerView;
import com.opera.android.custom_views.StylingTextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class cwk implements pvk {
    public final StatusBarDrawingFrameLayout a;
    public final View b;
    public final View c;
    public final xt3 d;
    public final StylingTextView e;
    public final qsh g;
    public final wt3 h;
    public final wv1 i;
    public int k;
    public b2l l;
    public b2l m;
    public boolean n;
    public s03 o;
    public final int p;
    public final int q;
    public final int r;
    public int s;
    public final int t;
    public int u;
    public boolean v;
    public final PathInterpolator f = lf1.j;
    public final PathInterpolator j = new PathInterpolator(0.0f, 0.66f, 0.0f, 1.0f);

    public cwk(StatusBarDrawingFrameLayout statusBarDrawingFrameLayout, View view, View view2, View view3, ChromiumContainerView chromiumContainerView, wt3 wt3Var, wv1 wv1Var, xt3 xt3Var) {
        this.a = statusBarDrawingFrameLayout;
        this.b = view;
        this.c = view2;
        this.d = xt3Var;
        WeakHashMap weakHashMap = r5n.a;
        this.e = (StylingTextView) ((View) m5n.f(statusBarDrawingFrameLayout, 2131364676));
        this.g = new qsh((Object) view3, (Object) chromiumContainerView, (byte) 5);
        this.h = wt3Var;
        this.i = wv1Var;
        Resources resources = statusBarDrawingFrameLayout.getResources();
        this.p = fan.a(100.0f, resources);
        this.q = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        this.t = (int) TypedValue.applyDimension(1, 160.0f, resources.getDisplayMetrics());
        this.r = (int) TypedValue.applyDimension(1, 140.0f, resources.getDisplayMetrics());
    }

    @Override // defpackage.pvk
    public final boolean a(int i) {
        return i == 0 || i == 2;
    }

    @Override // defpackage.pvk
    public final void b(int i, int i2, int i3, int i4, int i5, int i6) {
        g(i5);
    }

    @Override // defpackage.pvk
    public final void c(int i, int i2, int i3, int i4, int i5, int i6) {
        if (Math.abs(i6) > Math.abs(i5)) {
            return;
        }
        this.v = true;
        g(i3 + ((int) nb6.i(i5 * 0.033333335f, -r1, (int) (((View) this.g.b).getWidth() * 0.5f))));
    }

    @Override // defpackage.pvk
    public final void d() {
        qsh qshVar = this.g;
        View view = (View) qshVar.b;
        int iAbs = (int) Math.abs(view.getTranslationX());
        int width = 0;
        boolean z = this.m != null && (iAbs >= this.p || iAbs >= this.s / 3);
        if (!z) {
            f(false);
        }
        int i = this.s;
        int i2 = ((i - iAbs) * 200) / i;
        if (this.k == 0) {
            if (z) {
                width = -view.getWidth();
            }
        } else if (z) {
            width = view.getWidth();
        }
        Runnable vr9Var = new vr9(new wr9(this, z), 2);
        long j = i2;
        float f = width;
        ((ChromiumContainerView) qshVar.c).animate().setStartDelay(0L).setDuration(j).translationX(f);
        view.animate().setStartDelay(0L).setDuration(j).withEndAction(vr9Var).translationX(f);
        this.c.animate().setStartDelay(0L).setDuration(j).withEndAction(vr9Var).translationX(this.u + width);
        yq1 yq1Var = this.e;
        yq1Var.animate().setDuration(j).alpha((!z || this.v || yq1Var.getAlpha() <= 0.2f) ? 0.0f : 1.0f).setInterpolator(this.f);
        this.m = null;
    }

    @Override // defpackage.pvk
    public final void e(int i, int i2, int i3) throws Resources.NotFoundException {
        qsh qshVar = this.g;
        View view = (View) qshVar.b;
        view.animate().cancel();
        view.setTranslationX(0.0f);
        ChromiumContainerView chromiumContainerView = (ChromiumContainerView) qshVar.c;
        chromiumContainerView.animate().cancel();
        chromiumContainerView.setTranslationX(0.0f);
        View view2 = this.c;
        view2.animate().cancel();
        view2.setVisibility(0);
        this.a.setVisibility(0);
        View view3 = this.b;
        view3.animate().cancel();
        view3.setVisibility(4);
        view3.setAlpha(1.0f);
        s03 s03Var = this.o;
        if (s03Var != null) {
            vml.a(s03Var);
            s03Var.b = true;
            this.o = null;
        }
        yq1 yq1Var = this.e;
        yq1Var.animate().cancel();
        yq1Var.setAlpha(0.0f);
        this.v = false;
        h(i);
        f(false);
    }

    public final void f(boolean z) {
        if (this.n != z) {
            if (!z) {
                this.n = false;
            } else {
                if (this.m == null || this.l != null) {
                    return;
                }
                this.n = true;
            }
        }
    }

    public final void g(int i) {
        int i2 = this.k;
        boolean z = false;
        if (i2 != 0 || i <= 0) {
            if (i2 == 2 && i < 0 && !h(0)) {
                return;
            }
        } else if (!h(2)) {
            return;
        }
        boolean z2 = this.m == null;
        int i3 = z2 ? this.t : this.s;
        int iMax = this.k == 0 ? Math.max(i, -i3) : Math.min(i, i3);
        if (z2) {
            float f = iMax;
            iMax = (int) ((this.j.getInterpolation(Math.abs(f / i3)) * f) / 2.0f);
        }
        this.c.setTranslationX(this.u + iMax);
        qsh qshVar = this.g;
        float f2 = iMax;
        ((View) qshVar.b).setTranslationX(f2);
        ((ChromiumContainerView) qshVar.c).setTranslationX(f2);
        boolean z3 = this.v;
        int i4 = this.q;
        float interpolation = 0.0f;
        if (!z3 && !z2) {
            interpolation = this.f.getInterpolation(nb6.i((Math.abs(f2) - i4) / (this.p - i4), 0.0f, 1.0f));
        }
        this.e.setAlpha(interpolation);
        if (!z2 && Math.abs(iMax) >= i4) {
            z = true;
        }
        f(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.View, android.widget.TextView, com.opera.android.custom_views.StylingTextView] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(int r14) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwk.h(int):boolean");
    }
}
