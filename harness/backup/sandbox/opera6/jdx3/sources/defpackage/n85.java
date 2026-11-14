package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final class n85 {
    public final View a;
    public final View b;
    public final int c;
    public final int d;
    public boolean e;
    public boolean f;
    public float g;
    public ValueAnimator h;

    public n85(View view, View view2) {
        this.a = view;
        this.b = view2;
        if (view2.isLayoutRequested() || view2.getMeasuredHeight() == 0) {
            view2.measure(0, 0);
        }
        int measuredHeight = view2.getMeasuredHeight();
        if (view.isLayoutRequested() || view.getMeasuredHeight() == 0) {
            view.measure(0, 0);
        }
        int measuredHeight2 = view.getMeasuredHeight();
        this.c = measuredHeight2;
        this.d = measuredHeight + measuredHeight2;
        this.e = measuredHeight2 > 0;
        this.f = measuredHeight2 > 0;
        this.g = measuredHeight2 > 0 ? 1.0f : 0.0f;
    }
}
