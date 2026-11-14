package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import defpackage.ho5;
import defpackage.jo5;

/* loaded from: classes.dex */
public class Group extends ho5 {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.ho5
    public final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    @Override // defpackage.ho5
    public final void n() {
        jo5 jo5Var = (jo5) getLayoutParams();
        jo5Var.p0.J(0);
        jo5Var.p0.G(0);
    }

    @Override // defpackage.ho5, android.view.View
    public final void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        d();
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        d();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        d();
    }
}
