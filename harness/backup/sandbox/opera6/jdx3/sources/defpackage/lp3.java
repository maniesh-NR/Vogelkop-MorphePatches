package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import com.opera.android.bar.BottomBar;

/* loaded from: classes.dex */
public abstract class lp3 extends BottomBar {
    public View s;
    public int t;

    @Override // com.opera.android.bar.BottomBar
    public final void a(int i) {
        super.a(i);
        this.s.setBackgroundColor(i);
    }

    @Override // com.opera.android.bar.BottomBar
    public final int f() {
        return this.t;
    }

    @Override // com.opera.android.bar.BottomBar
    public void g() {
        atj.a(this.s);
        View view = this.g;
        if (view != null) {
            atj.a(view);
        }
    }

    @Override // com.opera.android.bar.BottomBar
    public void l(int i) {
        int iA;
        View view = this.g;
        if (view == null || view.getVisibility() != 0) {
            iA = 0;
        } else {
            Context context = getContext();
            iA = fan.a(1.0f, context.getResources()) + f03.w(2130971212, context, 0);
        }
        boolean z = iA > 0;
        View view2 = this.g;
        if (view2 != null) {
            view2.setTranslationY(i);
        }
        boolean z2 = z && i < iA;
        View view3 = this.h;
        if (view3 != null) {
            view3.setVisibility(z2 ? 0 : 8);
        }
        int iMax = Math.max(i - iA, 0);
        this.s.setTranslationY(iMax);
        this.i.setTranslationY(Math.min(i, iA + iMax + ((!z || z2) ? 0 : -fan.a(1.0f, getContext().getResources()))));
        int iMin = (z ? Math.min(i, iA) : 0) + iMax;
        this.t = iMin;
        j(iMin);
        m();
    }

    public int n() {
        return 2131362057;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) throws Resources.NotFoundException {
        super.onConfigurationChanged(configuration);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165337);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131165338);
        View viewFindViewById = findViewById(2131363655);
        if (viewFindViewById == null) {
            return;
        }
        jo5 jo5Var = (jo5) viewFindViewById.getLayoutParams();
        jo5Var.P = dimensionPixelSize2;
        jo5Var.setMarginStart(dimensionPixelSize);
        jo5Var.setMarginEnd(dimensionPixelSize);
        viewFindViewById.setLayoutParams(jo5Var);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.s = findViewById(n());
    }
}
