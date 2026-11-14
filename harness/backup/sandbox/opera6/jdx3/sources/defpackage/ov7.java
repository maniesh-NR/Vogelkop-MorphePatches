package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class ov7 implements View.OnTouchListener {
    public final /* synthetic */ byte a = 0;

    public /* synthetic */ ov7() {
    }

    public /* synthetic */ ov7(igi igiVar) {
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (view.canScrollVertically(1) || view.canScrollVertically(-1)) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 1 || actionMasked == 3) {
                        view.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
                return false;
            default:
                int action = motionEvent.getAction();
                boolean z = action == 0;
                boolean z2 = action == 1 && view.isPressed();
                if (z || z2) {
                    Drawable background = view.getBackground();
                    if (background instanceof RippleDrawable) {
                        ((RippleDrawable) background).setVisible(z, true);
                        view.setPressed(z);
                        if (!z2) {
                            return true;
                        }
                        view.performClick();
                        return true;
                    }
                }
                return false;
        }
    }
}
