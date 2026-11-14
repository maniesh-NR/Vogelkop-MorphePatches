package com.opera.android.ads;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.opera.android.custom_views.LayoutDirectionFrameLayout;
import defpackage.dll;
import defpackage.fan;
import defpackage.q9n;
import defpackage.u7;
import defpackage.u8n;

/* loaded from: classes.dex */
public class AdStarRatingView extends LayoutDirectionFrameLayout {
    public static final /* synthetic */ int h = 0;
    public final Drawable c;
    public final Drawable d;
    public final int e;
    public double f;
    public final Rect g;

    public AdStarRatingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Rect rect = new Rect();
        this.g = rect;
        setWillNotDraw(false);
        Drawable drawableMutate = sgb.F(2131232256, getContext()).mutate();
        this.c = drawableMutate;
        drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), this.c.getIntrinsicHeight());
        Drawable drawableMutate2 = sgb.F(2131232256, getContext()).mutate();
        this.d = drawableMutate2;
        drawableMutate2.setBounds(0, 0, drawableMutate2.getIntrinsicWidth(), this.d.getIntrinsicHeight());
        this.c.setColorFilter(getContext().getColor(2131100251), PorterDuff.Mode.MULTIPLY);
        u7 u7Var = new u7(this, (byte) 4);
        dll dllVarS = q9n.s(this);
        if (dllVarS != null) {
            u8n.b(dllVarS, this, u7Var);
        }
        u7Var.a(this);
        this.e = fan.a(2.0f, context.getResources());
        rect.set(0, 0, this.c.getIntrinsicWidth() / 2, this.c.getIntrinsicHeight());
        if (isInEditMode()) {
            this.f = 4.0d;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int paddingTop = (getPaddingTop() + getHeight()) - getPaddingBottom();
        Drawable drawable = this.c;
        int intrinsicHeight = (paddingTop - drawable.getIntrinsicHeight()) / 2;
        int paddingLeft = getPaddingLeft();
        int iSave = canvas.save();
        canvas.translate(paddingLeft, intrinsicHeight);
        for (int i = 1; i <= 5; i++) {
            double d = i;
            double d2 = this.f;
            Drawable drawable2 = this.d;
            (d <= d2 ? drawable2 : drawable).draw(canvas);
            double d3 = this.f;
            if (d3 < d && d3 > i - 1) {
                canvas.save();
                canvas.clipRect(this.g);
                drawable2.draw(canvas);
                canvas.restore();
            }
            canvas.translate(drawable.getIntrinsicWidth() + this.e, 0.0f);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // com.opera.android.custom_views.LayoutDirectionFrameLayout, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + (this.c.getIntrinsicWidth() * 5) + (this.e << 2), getPaddingBottom() + getPaddingTop() + this.c.getIntrinsicHeight());
    }
}
