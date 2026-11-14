package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class nxl extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, isf {
    public final f0k c;
    public final GestureDetector e;
    public final PointF a = new PointF();
    public final PointF b = new PointF();
    public final float d = 25.0f;
    public volatile float f = 3.1415927f;

    public nxl(Context context, f0k f0kVar) {
        this.c = f0kVar;
        this.e = new GestureDetector(context, this);
    }

    @Override // defpackage.isf
    public final void a(float[] fArr, float f) {
        this.f = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.a.x) / this.d;
        float y = motionEvent2.getY();
        PointF pointF = this.a;
        float f3 = (y - pointF.y) / this.d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.b;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = (fCos * f3) + (fSin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        f0k f0kVar = this.c;
        PointF pointF3 = this.b;
        synchronized (f0kVar) {
            float f5 = pointF3.y;
            f0kVar.g = f5;
            Matrix.setRotateM(f0kVar.e, 0, -f5, (float) Math.cos(f0kVar.h), (float) Math.sin(f0kVar.h), 0.0f);
            Matrix.setRotateM(f0kVar.f, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.c.k.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.e.onTouchEvent(motionEvent);
    }
}
