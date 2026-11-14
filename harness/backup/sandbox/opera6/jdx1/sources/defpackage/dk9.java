package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class dk9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ek9 b;

    public /* synthetic */ dk9(ek9 ek9Var, byte b) {
        this.a = b;
        this.b = ek9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ek9 ek9Var = this.b;
        switch (b) {
            case 0:
                ViewParent parent = ek9Var.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                ek9Var.a();
                View view = ek9Var.d;
                if (view.isEnabled() && !view.isLongClickable() && ek9Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    ek9Var.g = true;
                    break;
                }
                break;
        }
    }
}
