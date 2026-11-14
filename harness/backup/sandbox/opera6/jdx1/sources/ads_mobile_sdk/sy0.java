package ads_mobile_sdk;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class sy0 extends FrameLayout {
    public final cy0 a;
    public hg0 b;

    public sy0(cy0 cy0Var) {
        super(cy0Var.getContext());
        this.a = cy0Var;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        addView(cy0Var);
        setBackgroundColor(0);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        hg0 hg0Var = this.b;
        if (hg0Var == null) {
            return false;
        }
        hg0Var.a(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        xu0.b("Attempting to remove ad from its container, this should not be done unless the ad is destroyed.", null);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        xu0.b("Attempting to remove ad from its container, this should not be done unless the ad is destroyed.", null);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        xu0.b("Attempting to remove ad from its container, this should not be done unless the ad is destroyed.", null);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        xu0.b("Attempting to remove ad from its container, this should not be done unless the ad is destroyed.", null);
        super.removeViews(i, i2);
    }
}
