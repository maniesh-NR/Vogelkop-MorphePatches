package com.opera.android.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.SparseLongArray;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.fan;
import defpackage.k2c;
import defpackage.l2c;
import defpackage.nl2;

/* loaded from: classes.dex */
public class GraphView extends View implements k2c {
    public static final zp8 p = new zp8();
    public final l2c a;
    public final Paint b;
    public final Paint c;
    public final Path d;
    public final Path e;
    public final SparseLongArray f;
    public final float g;
    public ColorStateList h;
    public ColorStateList i;
    public float j;
    public float k;
    public boolean l;
    public boolean m;
    public float n;
    public int o;

    public GraphView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Path();
        this.e = new Path();
        this.f = new SparseLongArray();
        this.h = ColorStateList.valueOf(-16777216);
        this.i = ColorStateList.valueOf(-16777216);
        this.j = 1.0f;
        this.k = 1.0f;
        this.o = -1;
        this.a = new l2c(this, this, attributeSet);
        Resources resources = context.getResources();
        float fA = fan.a(16.0f, resources);
        float fApplyDimension = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        this.g = fApplyDimension;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setPathEffect(new CornerPathEffect(fA));
        paint.setStrokeWidth(fApplyDimension);
        Paint paint2 = new Paint(paint);
        this.c = paint2;
        paint2.setStyle(Paint.Style.FILL);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 6.0f);
        valueAnimatorOfFloat.setDuration(1500L);
        valueAnimatorOfFloat.addUpdateListener(new nl2(this, (byte) 8));
        valueAnimatorOfFloat.start();
    }

    public final void a() {
        int colorForState = this.h.getColorForState(getDrawableState(), -16777216);
        this.c.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), colorForState, p37.m0(colorForState, 0), Shader.TileMode.CLAMP));
        invalidate();
    }

    @Override // defpackage.k2c
    public final l2c b() {
        return this.a;
    }

    public final float c(float f) {
        float width = (f / this.j) * getWidth();
        return this.m ? getWidth() - width : width;
    }

    public final float d(float f, float f2) {
        float interpolation = p.getInterpolation(cs5.s(this.n - ((((float) Math.floor((f2 - this.o) / 2.0f)) / (this.f.size() / 2.0f)) / 0.2f), 0.0f, 1.0f));
        float height = getHeight();
        float f3 = this.g;
        return (f3 / 2.0f) + ((1.0f - ((f / this.k) * interpolation)) * (height - f3));
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a();
    }

    @Override // defpackage.k2c
    public final void i(int i) {
        this.l = true;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z = this.l;
        Path path = this.d;
        Path path2 = this.e;
        if (z) {
            this.l = false;
            this.m = this.a.b();
            path.reset();
            SparseLongArray sparseLongArray = this.f;
            float fKeyAt = sparseLongArray.keyAt(0);
            path.moveTo(c(fKeyAt), d(sparseLongArray.valueAt(0), fKeyAt));
            for (int i = 1; i < sparseLongArray.size(); i++) {
                float fKeyAt2 = sparseLongArray.keyAt(i);
                path.lineTo(c(fKeyAt2), d(sparseLongArray.valueAt(i), fKeyAt2));
            }
            path2.reset();
            path2.moveTo(c(0.0f), getHeight());
            path2.lineTo(c(0.0f), getHeight());
            float fKeyAt3 = sparseLongArray.keyAt(0);
            path2.lineTo(c(fKeyAt3), d(sparseLongArray.valueAt(0), fKeyAt3));
            for (int i2 = 0; i2 < sparseLongArray.size(); i2++) {
                float fKeyAt4 = sparseLongArray.keyAt(i2);
                path2.lineTo(c(fKeyAt4), d(sparseLongArray.valueAt(i2), fKeyAt4));
            }
            float fKeyAt5 = sparseLongArray.keyAt(sparseLongArray.size() - 1);
            path2.lineTo(c(fKeyAt5), d(sparseLongArray.valueAt(sparseLongArray.size() - 1), fKeyAt5));
            path2.lineTo(c(this.j), getHeight());
            path2.lineTo(c(this.j), getHeight());
            path2.close();
        }
        int colorForState = this.i.getColorForState(getDrawableState(), -16777216);
        Paint paint = this.b;
        paint.setColor(colorForState);
        canvas.drawPath(path2, this.c);
        canvas.drawPath(path, paint);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a();
        this.l = true;
        invalidate();
    }
}
