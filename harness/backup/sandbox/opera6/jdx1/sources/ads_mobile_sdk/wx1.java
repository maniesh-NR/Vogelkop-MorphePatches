package ads_mobile_sdk;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import defpackage.the;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class wx1 implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public final zt1 a;
    public final WeakReference b;

    public wx1(zt1 zt1Var, WeakReference weakReference) {
        this.a = zt1Var;
        this.b = weakReference;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        float x;
        int i2;
        if (motionEvent != null) {
            if (Math.abs(f) > Math.abs(f2)) {
                if (f > 0.0f) {
                    the[] theVarArr = the.b;
                    i = 1;
                } else {
                    the[] theVarArr2 = the.b;
                    i = 2;
                }
            } else if (f2 > 0.0f) {
                the[] theVarArr3 = the.b;
                i = 8;
            } else if (f2 < 0.0f) {
                the[] theVarArr4 = the.b;
                i = 4;
            }
            zt1 zt1Var = this.a;
            if (i == zt1Var.e()) {
                if (i == 1 || i == 2) {
                    x = (motionEvent2.getX() - motionEvent.getX()) / f;
                } else if (i == 4 || i == 8) {
                    x = (motionEvent2.getY() - motionEvent.getY()) / f2;
                } else {
                    i2 = 0;
                    zt1Var.a(i2, (View) this.b.get());
                }
                i2 = (int) (x * 1000.0f);
                zt1Var.a(i2, (View) this.b.get());
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        zt1 zt1Var = this.a;
        if (!zt1Var.d()) {
            return false;
        }
        zt1Var.c();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
