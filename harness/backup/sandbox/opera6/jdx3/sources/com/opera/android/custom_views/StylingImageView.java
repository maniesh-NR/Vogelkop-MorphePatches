package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.k2c;
import defpackage.khh;
import defpackage.l2c;
import defpackage.s8i;
import defpackage.ua7;

/* loaded from: classes.dex */
public class StylingImageView extends AppCompatImageView implements k2c {
    public final int a;
    public final boolean b;
    public boolean c;
    public final ua7 d;
    public final ua7 e;
    public final l2c f;
    public final fr g;
    public int h;
    public boolean i;
    public float[] j;

    public StylingImageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StylingImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ua7 ua7Var = new ua7((View) this, 1, mode);
        this.d = ua7Var;
        ua7 ua7Var2 = new ua7((View) this, 1, mode);
        this.e = ua7Var2;
        this.h = 0;
        this.f = new l2c(this, this, attributeSet);
        fr frVarF = fr.f(context, attributeSet);
        this.g = frVarF;
        if (frVarF != null) {
            frVarF.e(this);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.N, i, 0);
        ua7Var.A(typedArrayObtainStyledAttributes, 5);
        ua7Var2.A(typedArrayObtainStyledAttributes, 2);
        this.a = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.b = typedArrayObtainStyledAttributes.getBoolean(0, false);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(6, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(4, true));
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId != 0) {
            setImageResource(resourceId);
        }
        if (resourceId2 != 0) {
            setBackgroundDrawable(sgb.F(resourceId2, context));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        if (this.a == 0 || getDrawable() != null || !this.c || getVisibility() == 8) {
            return;
        }
        setImageResource(this.a);
    }

    @Override // defpackage.k2c
    public final l2c b() {
        return this.f;
    }

    public final void c(ColorStateList colorStateList) {
        this.d.M(colorStateList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        return layoutParams != null && layoutParams.height > 0 && layoutParams.width > 0 && !getAdjustViewBounds();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void draw(Canvas canvas) {
        Drawable drawable = getDrawable();
        ua7 ua7Var = this.d;
        if (drawable != null) {
            ua7Var.X(((View) ua7Var.b).getDrawableState(), 0, drawable);
        } else {
            ua7Var.getClass();
        }
        Drawable background = getBackground();
        ua7 ua7Var2 = this.e;
        if (background != null) {
            ua7Var2.X(((View) ua7Var2.b).getDrawableState(), 0, background);
        } else {
            ua7Var2.getClass();
        }
        super/*android.view.View*/.draw(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void drawableStateChanged() {
        int intrinsicWidth;
        int intrinsicHeight;
        Drawable drawable = getDrawable();
        if (drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
            intrinsicHeight = drawable.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        super.drawableStateChanged();
        this.d.G();
        this.e.G();
        if (drawable != null) {
            if (intrinsicWidth == drawable.getIntrinsicWidth() && intrinsicHeight == drawable.getIntrinsicHeight()) {
                return;
            }
            setImageDrawable(null);
            setImageDrawable(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean hasOverlappingRendering() {
        return (getDrawable() instanceof s8i) || super.hasOverlappingRendering();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.k2c
    public final void i(int i) {
        fr frVar = this.g;
        if (frVar != null) {
            frVar.e(this);
        }
        if (this.b && this.h != i) {
            setScaleX(getScaleX() * (-1.0f));
        }
        this.h = i;
        refreshDrawableState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        this.c = true;
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onConfigurationChanged(Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
        this.d.F();
        this.e.F();
        refreshDrawableState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        this.c = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.getDrawable()
            if (r0 == 0) goto L3a
            float[] r0 = r4.j
            if (r0 != 0) goto L10
            r0 = 9
            float[] r0 = new float[r0]
            r4.j = r0
        L10:
            android.graphics.Matrix r0 = r4.getImageMatrix()
            float[] r1 = r4.j
            r0.getValues(r1)
            float[] r0 = r4.j
            r1 = 2
            r1 = r0[r1]
            int r2 = (int) r1
            float r2 = (float) r2
            float r1 = r1 - r2
            r2 = 5
            r0 = r0[r2]
            int r2 = (int) r0
            float r2 = (float) r2
            float r0 = r0 - r2
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 != 0) goto L30
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L3a
        L30:
            r5.save()
            float r1 = -r1
            float r0 = -r0
            r5.translate(r1, r0)
            r0 = 1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            super/*android.view.View*/.onDraw(r5)
            if (r0 == 0) goto L43
            r5.restore()
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.custom_views.StylingImageView.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onVisibilityChanged(View view, int i) {
        super/*android.view.View*/.onVisibilityChanged(view, i);
        if (this.d == null) {
            return;
        }
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void requestLayout() {
        if (this.i) {
            return;
        }
        super/*android.view.View*/.requestLayout();
    }

    public void setImageDrawable(Drawable drawable) {
        if (!d()) {
            super.setImageDrawable(drawable);
            return;
        }
        this.i = true;
        super.setImageDrawable(drawable);
        this.i = false;
    }
}
