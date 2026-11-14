package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import defpackage.dll;
import defpackage.dt1;
import defpackage.fan;
import defpackage.g7j;
import defpackage.hjf;
import defpackage.khh;
import defpackage.mu1;
import defpackage.q9n;
import defpackage.sll;
import defpackage.u7;
import defpackage.u8n;
import defpackage.vf9;
import defpackage.xj;
import kotlin.text.c;

/* loaded from: classes.dex */
public class AccentSelector extends FrameLayout implements Checkable {
    public static final /* synthetic */ int n = 0;
    public xj a;
    public boolean b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Path g;
    public final Path h;
    public final Path i;
    public final Path j;
    public final float k;
    public final int l;
    public final sll m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccentSelector(Context context, @Nullable AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, 0);
        byte b = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.a, 0, 0);
        try {
            int color = typedArrayObtainStyledAttributes.getColor(0, context.getColor(2131099816));
            typedArrayObtainStyledAttributes.recycle();
            setClickable(true);
            setFocusable(true);
            Paint paint = new Paint();
            this.c = paint;
            paint.setAntiAlias(true);
            Paint paint2 = new Paint();
            this.d = paint2;
            paint2.setAntiAlias(true);
            Paint paint3 = new Paint();
            this.e = paint3;
            Paint.Style style = Paint.Style.STROKE;
            paint3.setStyle(style);
            paint3.setAntiAlias(true);
            paint3.setStrokeWidth(fan.a(1.0f, getResources()));
            paint3.setColor(color);
            Paint paint4 = new Paint();
            this.f = paint4;
            paint4.setStyle(style);
            paint4.setAntiAlias(true);
            paint4.setStrokeWidth(fan.a(2.0f, getResources()));
            float fA = fan.a(12.0f, getResources());
            this.k = fA;
            int dimensionPixelSize = getResources().getDimensionPixelSize(2131167706);
            this.l = dimensionPixelSize;
            float f = dimensionPixelSize;
            float f2 = f - fA;
            this.h = i41.H(f2);
            this.i = i41.H(f2 - paint3.getStrokeWidth());
            this.j = i41.H(f - paint4.getStrokeWidth());
            this.g = oup.S(c.o("M0,@L@,@L@,0L0,@", "@", String.valueOf(f2)));
            ShapeDrawable shapeDrawable = new ShapeDrawable(new PathShape(i41.H(f), f, f));
            shapeDrawable.setIntrinsicWidth(dimensionPixelSize);
            shapeDrawable.setIntrinsicHeight(dimensionPixelSize);
            sll sllVar = new sll(context, null, shapeDrawable);
            this.m = sllVar;
            setForeground(new vf9(context, sllVar, style, 2130969783));
            u7 u7Var = new u7(this, b);
            l5b l5bVar = q9n.c;
            dll dllVarV = hjf.v(getContext());
            if (dllVarV == null) {
                return;
            }
            u8n.b(dllVarV, this, u7Var);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a(Canvas canvas, boolean z) {
        canvas.save();
        float f = this.k / 2.0f;
        canvas.translate(f, f);
        Paint paint = this.c;
        Path path = this.h;
        canvas.drawPath(path, paint);
        canvas.save();
        canvas.clipPath(this.g);
        canvas.drawPath(path, this.d);
        canvas.restore();
        if (z) {
            canvas.save();
            Paint paint2 = this.e;
            float strokeWidth = paint2.getStrokeWidth() / 2.0f;
            canvas.translate(strokeWidth, strokeWidth);
            canvas.drawPath(this.i, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.b) {
            a(canvas, true);
            return;
        }
        a(canvas, false);
        canvas.save();
        Paint paint = this.f;
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        canvas.translate(strokeWidth, strokeWidth);
        canvas.drawPath(this.j, paint);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setChecked(this.b);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        f03.g0(accessibilityNodeInfo, this.b);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.l, 1073741824);
        setMeasuredDimension(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        boolean zPerformClick = super.performClick();
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.b != z) {
            this.b = z;
            invalidate();
            xj xjVar = this.a;
            if (xjVar != null) {
                dt1 dt1Var = (dt1) xjVar.b;
                g7j g7jVar = (g7j) xjVar.c;
                dt1Var.M(g7jVar, true);
                ((mu1) dt1Var.b).b.I0().b.U(g7jVar, true);
            }
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        if (this.b) {
            return;
        }
        setChecked(true);
    }
}
