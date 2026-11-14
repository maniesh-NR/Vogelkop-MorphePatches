package com.opera.android.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.material.slider.Slider;
import com.opera.android.widget.GradientSlider;
import defpackage.f0a;
import defpackage.khh;
import defpackage.o2a;
import java.util.Collections;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/opera/android/widget/GradientSlider;", "Lcom/google/android/material/slider/Slider;", "o2a", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GradientSlider extends Slider {
    public static final ColorStateList m1 = ColorStateList.valueOf(0);
    public ColorStateList f1;
    public ColorStateList g1;
    public final int h1;
    public final boolean i1;
    public final Paint j1;
    public final o2a k1;
    public final f0a l1;

    /* JADX WARN: Multi-variable type inference failed */
    public GradientSlider(@NotNull final Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1 = w0();
        this.g1 = w0();
        this.h1 = -1;
        this.i1 = true;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(v0());
        this.j1 = paint;
        this.k1 = new o2a(this, this.f1, this.g1);
        this.l1 = new f0a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.o, 2130970782, 0);
        ColorStateList colorStateListU = f03.u(2130969343, context, 2131101204);
        colorStateListU = colorStateListU == null ? ResourcesCompat.a(context.getResources(), 2131101204, context.getTheme()) : colorStateListU;
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(2);
        this.f1 = colorStateList == null ? colorStateListU : colorStateList;
        ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(1);
        this.g1 = colorStateList2 != null ? colorStateList2 : colorStateListU;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        this.h1 = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId != -1) {
            t0(new w73() { // from class: n2a
                /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, com.google.android.material.slider.Slider, com.opera.android.widget.GradientSlider] */
                public final void b(Object obj, float f, boolean z) {
                    ColorStateList colorStateList3 = GradientSlider.m1;
                    Resources resources = context.getResources();
                    ?? r2 = this.a;
                    r2.setContentDescription(resources.getString(r2.h1, Integer.valueOf((int) (((r2.z0() - r2.w()) / (r2.x() - r2.w())) * 100.0f))));
                }
            });
        }
        r5n.l(this, (f8) null);
    }

    public final void B0(ColorStateList colorStateList) {
        super.B0(m1);
    }

    public final void W(ColorStateList colorStateList) {
        super.W(m1);
    }

    public final void X(int i) {
        if (this.i1) {
            this.j1.setStrokeWidth(i);
        }
        super.X(i);
    }

    public final void Y(ColorStateList colorStateList) {
        super.Y(m1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDraw(Canvas canvas) {
        int iA;
        int iA2;
        float f;
        Integer num = (Integer) mzg.j(this, "calculateTrackCenter", (Class[]) null, new Object[0]);
        float fIntValue = num != null ? num.intValue() : getHeight() / 2;
        float fX0 = x0();
        float fY0 = y0() + fX0;
        ColorStateList colorStateList = this.f1;
        ColorStateList colorStateList2 = this.g1;
        int layoutDirection = getLayoutDirection();
        o2a o2aVar = this.k1;
        if (layoutDirection == 1) {
            int iA3 = o2aVar.a(colorStateList2);
            iA2 = o2aVar.a(colorStateList);
            iA = iA3;
        } else {
            iA = o2aVar.a(colorStateList);
            iA2 = o2aVar.a(colorStateList2);
        }
        LinearGradient linearGradient = o2aVar.e;
        if (linearGradient != null && o2aVar.b == fX0 && o2aVar.a == fY0 && o2aVar.c == iA && o2aVar.d == iA2) {
            f = fY0;
        } else {
            o2aVar.b = fX0;
            o2aVar.a = fY0;
            o2aVar.c = iA;
            o2aVar.d = iA2;
            f = fY0;
            LinearGradient linearGradient2 = new LinearGradient(fX0, 0.0f, f, 0.0f, iA, iA2, Shader.TileMode.CLAMP);
            o2aVar.e = linearGradient2;
            linearGradient = linearGradient2;
        }
        Paint paint = this.j1;
        paint.setShader(linearGradient);
        canvas.drawLine(fX0, fIntValue, f, fIntValue, paint);
        super.onDraw(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        zyk zykVar = this.l1.a;
        ((Rect) zykVar.getValue()).set(0, 0, getWidth(), getHeight());
        setSystemGestureExclusionRects(Collections.singletonList((Rect) zykVar.getValue()));
    }
}
