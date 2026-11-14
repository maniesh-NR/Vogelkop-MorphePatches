package com.opera.android.custom_views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.custom_views.BottomIndicatorButtonGroup;
import defpackage.dll;
import defpackage.fan;
import defpackage.kc;
import defpackage.q9n;
import defpackage.u7;
import defpackage.u8n;
import defpackage.z22;

/* loaded from: classes.dex */
public class BottomIndicatorButtonGroup extends LinearLayout {
    public static final PathInterpolator i = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
    public final z22 a;
    public final Paint b;
    public BottomIndicatorButton c;
    public ValueAnimator d;
    public float e;
    public float f;
    public float g;
    public float h;

    public BottomIndicatorButtonGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.a = new z22(this, (byte) 2);
        Paint paint = new Paint(1);
        this.b = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(fan.a(2.0f, getResources()) << 1);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        u7 u7Var = new u7(this, (byte) 19);
        dll dllVarS = q9n.s(this);
        if (dllVarS != null) {
            u8n.b(dllVarS, this, u7Var);
        }
        u7Var.a(this);
    }

    public final void a(BottomIndicatorButton bottomIndicatorButton) {
        if (bottomIndicatorButton.isSelected()) {
            return;
        }
        this.c.setSelected(false);
        BottomIndicatorButton bottomIndicatorButton2 = this.c;
        z22 z22Var = this.a;
        bottomIndicatorButton2.removeOnLayoutChangeListener(z22Var);
        this.c = bottomIndicatorButton;
        bottomIndicatorButton.setSelected(true);
        this.c.addOnLayoutChangeListener(z22Var);
        b();
    }

    public final void b() {
        BottomIndicatorButton bottomIndicatorButton = this.c;
        float measuredWidth = bottomIndicatorButton.findViewById(bottomIndicatorButton.a() ? 2131364525 : 2131363485).getMeasuredWidth();
        BottomIndicatorButton bottomIndicatorButton2 = this.c;
        float x = bottomIndicatorButton2.findViewById(bottomIndicatorButton2.a() ? 2131364525 : 2131363485).getX() + bottomIndicatorButton2.getX();
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator == null) {
            if (this.h == measuredWidth && this.g == x) {
                return;
            }
        } else if (this.e == x && this.f == measuredWidth) {
            return;
        }
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final float f = this.g;
        final float fAbs = Math.abs(x - f) * (x > f ? 1 : -1);
        final byte b = 0;
        ValueAnimator duration = ValueAnimator.ofFloat(this.h, measuredWidth).setDuration(300L);
        this.d = duration;
        this.f = measuredWidth;
        this.e = x;
        duration.setInterpolator(i);
        this.d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: up3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                byte b2 = b;
                float f2 = fAbs;
                float f3 = f;
                Object obj = this;
                switch (b2) {
                    case 0:
                        BottomIndicatorButtonGroup bottomIndicatorButtonGroup = (BottomIndicatorButtonGroup) obj;
                        PathInterpolator pathInterpolator = BottomIndicatorButtonGroup.i;
                        bottomIndicatorButtonGroup.g = (valueAnimator2.getInterpolator().getInterpolation(valueAnimator2.getAnimatedFraction()) * f2) + f3;
                        bottomIndicatorButtonGroup.h = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                        bottomIndicatorButtonGroup.invalidate();
                        break;
                    default:
                        xf8.G0((kze) ((g7m) obj).g, Float.valueOf(((f2 - f3) * ((Float) valueAnimator2.getAnimatedValue()).floatValue()) + f3));
                        break;
                }
            }
        });
        this.d.addListener(new kc(this, (byte) 1));
        this.d.start();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.g;
        float bottom = this.c.getBottom();
        canvas.drawLine(f, bottom, f + this.h, bottom, this.b);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        BottomIndicatorButton bottomIndicatorButton = (BottomIndicatorButton) getChildAt(0);
        this.c = bottomIndicatorButton;
        a(bottomIndicatorButton);
    }
}
