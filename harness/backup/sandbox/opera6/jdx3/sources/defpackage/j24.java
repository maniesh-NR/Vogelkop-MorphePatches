package defpackage;

import android.view.MotionEvent;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class j24 extends FrameLayout {
    public boolean a;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
