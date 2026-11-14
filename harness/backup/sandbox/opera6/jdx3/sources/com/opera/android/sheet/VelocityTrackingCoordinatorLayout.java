package com.opera.android.sheet;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.n1n;

/* loaded from: classes.dex */
public class VelocityTrackingCoordinatorLayout extends CoordinatorLayout {
    public int A;
    public n1n B;
    public final float y;
    public VelocityTracker z;

    public VelocityTrackingCoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.y = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.maxWidth});
            this.B = new n1n(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0), 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.A = -1;
            VelocityTracker velocityTracker = this.z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.z = null;
            }
            this.A = motionEvent.getPointerId(motionEvent.getActionIndex());
        }
        VelocityTracker velocityTrackerObtain = this.z;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.z = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        boolean zDispatchTouchEvent = super/*android.view.View*/.dispatchTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.A = -1;
            VelocityTracker velocityTracker2 = this.z;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.z = null;
            }
        }
        return zDispatchTouchEvent;
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (this.B != null) {
            int mode = View.MeasureSpec.getMode(i);
            n1n n1nVar = this.B;
            float f = n1nVar.c;
            int i3 = f != 0.0f ? (int) (size * f) : size;
            int i4 = n1nVar.b;
            if (i4 != 0 && i3 > i4) {
                i3 = i4;
            }
            int i5 = n1nVar.a;
            if (i5 != 0 && i3 < i5) {
                i3 = i5;
            }
            i = View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), mode);
        }
        super.onMeasure(i, i2);
    }
}
