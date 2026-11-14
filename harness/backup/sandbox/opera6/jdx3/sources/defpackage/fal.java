package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import com.opera.android.custom_views.EqualWidthLinearLayout;

/* loaded from: classes.dex */
public final class fal implements pvk {
    public final EqualWidthLinearLayout a;
    public final View b;
    public final qvk c;
    public float d;
    public final /* synthetic */ gal e;

    public fal(gal galVar, EqualWidthLinearLayout equalWidthLinearLayout, View view) {
        this.e = galVar;
        this.a = equalWidthLinearLayout;
        this.b = view;
        qvk qvkVar = new qvk(equalWidthLinearLayout.getContext());
        qvkVar.e = this;
        this.c = qvkVar;
        equalWidthLinearLayout.c = new eal(this, (byte) 0);
        view.setOnTouchListener(new eal(this, (byte) 1));
    }

    @Override // defpackage.pvk
    public final boolean a(int i) {
        return i == 0 || i == 2;
    }

    @Override // defpackage.pvk
    public final void b(int i, int i2, int i3, int i4, int i5, int i6) {
        gal galVar = this.e;
        float fL = (-i5) / gal.w.l(galVar.c.a.getContext());
        if (galVar.f()) {
            fL = -fL;
        }
        galVar.f = djh.b(this.d + fL, 0.0f, 1.0f);
        galVar.e();
    }

    @Override // defpackage.pvk
    public final void c(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a.postOnAnimation(new br(i5, (Object) this.e, (byte) 26));
    }

    @Override // defpackage.pvk
    public final void d() {
        gal galVar = this.e;
        galVar.g(galVar.f > 0.5f ? p6l.b : p6l.a);
        galVar.b(200L);
    }

    @Override // defpackage.pvk
    public final void e(int i, int i2, int i3) {
        this.b.cancelLongPress();
        gal galVar = this.e;
        this.d = galVar.f;
        ValueAnimator valueAnimator = galVar.k;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
