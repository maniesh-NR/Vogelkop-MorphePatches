package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class qvk extends GestureDetector.SimpleOnGestureListener {
    public final int a;
    public final GestureDetector b;
    public final PointF c = new PointF();
    public int d = -1;
    public pvk e;

    public qvk(Context context) {
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.b = new GestureDetector(context, this);
    }

    public final boolean a(MotionEvent motionEvent) {
        int action;
        boolean zOnTouchEvent = this.b.onTouchEvent(motionEvent);
        if (this.e == null || this.d == -1 || !((action = motionEvent.getAction()) == 1 || action == 3)) {
            return zOnTouchEvent;
        }
        this.d = -1;
        this.e.d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.e == null || this.d == -1) {
            return false;
        }
        float rawX = motionEvent2.getRawX();
        float rawY = motionEvent2.getRawY();
        PointF pointF = this.c;
        this.e.c((int) rawX, (int) rawY, (int) (rawX - pointF.x), (int) (rawY - pointF.y), (int) f, (int) f2);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.e == null) {
            return false;
        }
        float rawX = motionEvent2.getRawX();
        float rawY = motionEvent2.getRawY();
        int i = this.d;
        PointF pointF = this.c;
        if (i == -1) {
            float rawX2 = rawX - motionEvent.getRawX();
            float rawY2 = rawY - motionEvent.getRawY();
            float fAbs = Math.abs(rawX2);
            int i2 = this.a;
            int i3 = fAbs > ((float) i2) ? rawX2 > 0.0f ? 2 : 0 : Math.abs(rawY2) > ((float) i2) ? rawY2 > 0.0f ? 3 : 1 : -1;
            if (i3 != -1 && this.e.a(i3)) {
                this.d = i3;
                this.e.e(i3, (int) rawX, (int) rawY);
                pointF.set(rawX, rawY);
            }
        }
        if (this.d == -1) {
            return false;
        }
        this.e.b((int) rawX, (int) rawY, (int) (-f), (int) (-f2), (int) (rawX - pointF.x), (int) (rawY - pointF.y));
        return true;
    }
}
