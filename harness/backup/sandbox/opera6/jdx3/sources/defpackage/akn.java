package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.ScaleGestureDetector;

/* loaded from: classes.dex */
public final class akn extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ w6j c;

    public akn(w6j w6jVar) {
        this.c = w6jVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        w6j w6jVar = this.c;
        boolean zK = w6jVar.k();
        zjn zjnVar = (zjn) w6jVar.a;
        if (!zK) {
            return false;
        }
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        float f = -(scaleGestureDetector.getFocusX() - this.a);
        float f2 = -(scaleGestureDetector.getFocusY() - this.b);
        float fMin = Math.min(3.0f, scaleGestureDetector.getScaleFactor() * zjnVar.a(((lkn) w6jVar.e).getBounds(), ((lkn) w6jVar.e).b(), ((lkn) w6jVar.e).a()));
        Rect bounds = ((lkn) w6jVar.e).getBounds();
        int iB = ((lkn) w6jVar.e).b();
        int iA = ((lkn) w6jVar.e).a();
        float fA = zjnVar.a(bounds, iB, iA);
        RectF rectFB = zjnVar.b(bounds, iB, iA);
        float fWidth = focusX / bounds.width();
        zjnVar.a = Math.max(1.0f, fMin / Math.max(bounds.width() / iB, bounds.height() / iA));
        float fA2 = zjnVar.a(bounds, iB, iA);
        zjnVar.c(bounds, iB, iA, ((((focusX / fA) + (rectFB.left / fA)) * fA2) - (fWidth * bounds.width())) + f, ((((focusY / fA) + (rectFB.top / fA)) * fA2) - ((focusY / bounds.height()) * bounds.height())) + f2);
        lkn lknVar = (lkn) w6jVar.e;
        zjn zjnVar2 = lknVar.i;
        if (!zjnVar.equals(zjnVar2)) {
            zjnVar2.getClass();
            zjnVar2.a = zjnVar.a;
            zjnVar2.b = zjnVar.b;
            zjnVar2.c = zjnVar.c;
            lknVar.invalidateSelf();
        }
        ((emn) w6jVar.b).run();
        this.a = scaleGestureDetector.getFocusX();
        this.b = scaleGestureDetector.getFocusY();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (!this.c.k()) {
            return false;
        }
        this.a = scaleGestureDetector.getFocusX();
        this.b = scaleGestureDetector.getFocusY();
        return true;
    }
}
