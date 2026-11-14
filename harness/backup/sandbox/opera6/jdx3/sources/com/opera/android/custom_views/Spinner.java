package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import defpackage.khh;

/* loaded from: classes.dex */
public class Spinner extends View {
    public final Drawable a;
    public long b;
    public int c;
    public boolean d;
    public int e;
    public int f;

    public Spinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.d = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.I);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.a = resourceId == 0 ? null : sgb.F(resourceId, context);
        invalidate();
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a() {
        invalidate();
        if (this.d) {
            return;
        }
        this.d = true;
        int i = this.c;
        this.c = 0;
        int iUptimeMillis = (int) (((SystemClock.uptimeMillis() / 3) + this.c) % 360);
        if (i < iUptimeMillis) {
            i += 360;
        }
        this.c = i - iUptimeMillis;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.a;
        if (drawable != null) {
            int iUptimeMillis = !this.d ? this.c : (int) (((SystemClock.uptimeMillis() / 3) + this.c) % 360);
            canvas.save();
            canvas.translate(this.e, this.f);
            canvas.rotate(-iUptimeMillis);
            drawable.draw(canvas);
            canvas.restore();
            if (!this.d || SystemClock.uptimeMillis() - this.b < 50) {
                return;
            }
            this.b = SystemClock.uptimeMillis();
            postInvalidateDelayed(50L);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.a != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
            int paddingTop = (measuredHeight - getPaddingTop()) - getPaddingBottom();
            int i5 = paddingLeft / 2;
            this.e = getPaddingLeft() + i5;
            int i6 = paddingTop / 2;
            this.f = getPaddingTop() + i6;
            this.a.setBounds((-paddingLeft) / 2, (-paddingTop) / 2, i5, i6);
        }
    }
}
