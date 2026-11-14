package com.opera.android.touch;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.fan;

/* loaded from: classes.dex */
public class CurveOverlayView extends View {
    public final Path a;
    public final int b;
    public final Paint c;
    public int d;

    public CurveOverlayView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = new Path();
        this.c = new Paint(1);
        setLayerType(1, null);
        this.b = fan.a(11.0f, getContext().getResources());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.c;
        int color = paint.getColor();
        int i = this.d;
        if (color != i) {
            paint.setColor(i);
        }
        canvas.save();
        canvas.translate(0.0f, getHeight() - this.b);
        canvas.drawPath(this.a, paint);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.a;
        path.reset();
        int i5 = this.b;
        path.quadTo(i / 4, i5, i / 2, i5);
        float f = i;
        path.quadTo(r6 * 3, i5, f, 0.0f);
        path.lineTo(f, i5);
        path.lineTo(0.0f, i5);
        path.close();
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            this.d = ((ColorDrawable) drawable).getColor();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.d = i;
        invalidate();
    }
}
