package defpackage;

import android.view.ScaleGestureDetector;

/* loaded from: classes.dex */
public final class d0b extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public boolean a = false;
    public final /* synthetic */ ydb b;

    public d0b(ydb ydbVar) {
        this.b = ydbVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float currentSpan = scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan();
        ydb ydbVar = this.b;
        float scaleFactor = scaleGestureDetector.getScaleFactor() * ydbVar.h();
        if (ydbVar.E) {
            if (!this.a) {
                this.a = true;
            } else if (currentSpan != 0.0f) {
                ydbVar.e = true;
                ydbVar.o(Math.min(ydbVar.f(), Math.max(scaleFactor, ydbVar.g() - 0.1f)), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                ydbVar.invalidate();
                return true;
            }
        }
        return true;
    }
}
