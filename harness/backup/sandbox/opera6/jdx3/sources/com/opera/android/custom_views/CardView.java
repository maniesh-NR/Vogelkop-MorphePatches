package com.opera.android.custom_views;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.mhh;
import defpackage.qp2;
import defpackage.tk4;
import defpackage.ua7;
import defpackage.uk4;
import defpackage.vk4;

/* loaded from: classes.dex */
public class CardView extends LayoutDirectionFrameLayout {
    public final int c;
    public final ua7 d;
    public ColorStateList e;
    public final int f;
    public Path g;
    public Drawable h;
    public uk4 i;
    public final int j;
    public View k;
    public int l;
    public final boolean m;
    public vk4 n;
    public final Paint o;

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 2130968933);
        byte b = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.maxWidth});
            this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
        ua7 ua7Var = new ua7(this, 1, PorterDuff.Mode.MULTIPLY);
        this.d = ua7Var;
        this.o = new Paint(1);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, mhh.a, 2130968933, 0);
        ua7Var.A(typedArrayObtainStyledAttributes2, 2);
        this.e = typedArrayObtainStyledAttributes2.getColorStateList(2);
        this.j = typedArrayObtainStyledAttributes2.getResourceId(14, -1);
        this.l = typedArrayObtainStyledAttributes2.getColor(13, 0);
        this.m = typedArrayObtainStyledAttributes2.getBoolean(15, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(3, 0);
        this.f = dimensionPixelSize;
        typedArrayObtainStyledAttributes2.recycle();
        if (dimensionPixelSize > 0) {
            setClipToOutline(true);
            setOutlineProvider(new tk4(this, b));
        }
        d();
    }

    public final void d() {
        uk4 uk4Var = this.i;
        if (uk4Var != null) {
            uk4Var.a.setColorFilter(new PorterDuffColorFilter(this.l, uk4Var.b ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC));
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i;
        if (canvas.isHardwareAccelerated() || (i = this.f) <= 0) {
            super.dispatchDraw(canvas);
            return;
        }
        Path path = this.g;
        if (path == null) {
            path = new Path();
            this.g = path;
        }
        path.reset();
        this.g.addRoundRect(0.0f, 0.0f, getWidth(), getHeight(), i, i, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(this.g);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        ColorStateList colorStateList = this.e;
        int colorForState = colorStateList != null ? colorStateList.getColorForState(getDrawableState(), 0) : 0;
        if (this.h != null || colorForState == 0) {
            canvas2 = canvas;
        } else {
            Paint paint = this.o;
            paint.setColor(colorForState);
            float width = getWidth();
            float height = getHeight();
            float f = this.f;
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, width, height, f, f, paint);
        }
        Drawable drawable = this.h;
        ua7 ua7Var = this.d;
        if (drawable != null) {
            ua7Var.X(((View) ua7Var.b).getDrawableState(), 0, drawable);
        } else {
            ua7Var.getClass();
        }
        if (this.n != null) {
            if (isInEditMode()) {
                this.n.onGlobalLayout();
            }
            this.i.c = this.n.a.bottom;
        }
        try {
            super.draw(canvas2);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.d.G();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.n != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.n);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.d.F();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.n != null) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.n);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.j;
        if (i != -1) {
            View viewFindViewById = findViewById(i);
            this.k = viewFindViewById;
            if (viewFindViewById != null) {
                this.n = new vk4(this);
            } else {
                qp2.n(p3p.i(i, "Child with id ", " not found"));
            }
        }
    }

    @Override // com.opera.android.custom_views.LayoutDirectionFrameLayout, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.c;
        if (i3 <= 0 || i3 >= View.MeasureSpec.getSize(i)) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(i)), i2);
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        this.h = drawable;
        uk4 uk4Var = drawable != null ? new uk4(getResources(), drawable, this.m) : null;
        this.i = uk4Var;
        super.setBackground(uk4Var);
        d();
    }
}
