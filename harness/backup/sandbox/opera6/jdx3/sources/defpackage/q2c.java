package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class q2c extends ViewGroup implements k2c {
    public l2c a;
    public fr b;

    @Override // defpackage.k2c
    public final l2c b() {
        return this.a;
    }

    @Override // android.view.ViewGroup
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public p2c generateLayoutParams(AttributeSet attributeSet) {
        return new p2c(getContext(), attributeSet);
    }

    public final void d() {
        fr frVar = this.b;
        if (frVar != null) {
            frVar.e(this);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Object layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof m2c) {
                ((m2c) layoutParams).a(childAt, this);
            }
        }
    }

    @Override // defpackage.k2c
    public final void i(int i) {
        if (i == 0) {
            setLayoutDirection(0);
        } else if (i == 1) {
            setLayoutDirection(1);
        }
        d();
        requestLayout();
        cs5.P(this);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        d();
        super.onMeasure(i, i2);
    }
}
