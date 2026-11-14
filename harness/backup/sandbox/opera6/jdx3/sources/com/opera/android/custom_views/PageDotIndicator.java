package com.opera.android.custom_views;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import defpackage.khh;
import defpackage.wub;
import defpackage.wwf;

/* loaded from: classes.dex */
public class PageDotIndicator extends View {
    public static final int[] e = {R.attr.state_selected};
    public static final int[] f = new int[0];
    public final wwf a;
    public ViewPager b;
    public Drawable c;
    public final int d;

    public PageDotIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.y);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.c = sgb.F(typedArrayObtainStyledAttributes.getResourceId(0, 0), context);
        }
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.a = new wwf(new wub(this));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.c;
        if (drawable == null || this.b == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = this.c.getIntrinsicHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int count = this.b.getAdapter().getCount();
        for (int i = 0; i < count; i++) {
            int i2 = ((this.d + intrinsicWidth) * i) + paddingLeft;
            this.c.setBounds(i2, paddingTop, i2 + intrinsicWidth, paddingTop + intrinsicHeight);
            float fMin = 1.0f - Math.min(1.0f, Math.abs(i - this.a.c));
            int iRound = Math.round((1.0f - fMin) * 255.0f);
            int iRound2 = Math.round(fMin * 255.0f);
            if (iRound > 0) {
                this.c.setAlpha(iRound);
                this.c.setState(f);
                this.c.draw(canvas);
            }
            if (iRound2 > 0) {
                this.c.setAlpha(iRound2);
                this.c.setState(e);
                this.c.draw(canvas);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ViewPager viewPager;
        if (this.c == null || (viewPager = this.b) == null) {
            super.onMeasure(50, 10);
            return;
        }
        int count = viewPager.getAdapter().getCount();
        setMeasuredDimension((this.c.getIntrinsicWidth() * Math.max(count, 1)) + ((count - 1) * this.d) + getPaddingRight() + getPaddingLeft(), this.c.getIntrinsicHeight() + getPaddingBottom() + getPaddingTop());
    }
}
