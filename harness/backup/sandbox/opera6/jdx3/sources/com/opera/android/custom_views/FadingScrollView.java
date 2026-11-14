package com.opera.android.custom_views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.fan;
import defpackage.z5n;

/* loaded from: classes.dex */
public class FadingScrollView extends ScrollView {
    public final int a;
    public int b;
    public final z5n c;

    public FadingScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = fan.a(12.0f, context.getResources());
        this.c = new z5n(this, context, attributeSet);
    }

    public final boolean a(MotionEvent motionEvent) {
        if (!motionEvent.isFromSource(8194)) {
            return false;
        }
        int layoutDirection = getLayoutDirection();
        int i = this.a;
        if (layoutDirection == 1) {
            if (motionEvent.getX() < i) {
                return false;
            }
        } else if (motionEvent.getX() > getWidth() - i) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f;
        super.dispatchDraw(canvas);
        z5n z5nVar = this.c;
        int i = z5nVar.f;
        float scrollX = getChildCount() == 0 ? 0.0f : getScrollX() < i ? getScrollX() / i : 1.0f;
        int i2 = z5nVar.f;
        float scrollY = getChildCount() == 0 ? 0.0f : getScrollY() < i2 ? getScrollY() / i2 : 1.0f;
        if (getChildCount() == 0) {
            f = 0.0f;
        } else {
            int right = (getChildAt(0).getRight() - getScrollX()) - (getWidth() - getPaddingRight());
            f = right < i ? right / i : 1.0f;
        }
        z5nVar.a(canvas, this, scrollX, scrollY, f, z5nVar.b(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = motionEvent.getAction() == 0 && motionEvent.isButtonPressed(1) && a(motionEvent);
        if (z) {
            this.b++;
        }
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (z) {
            this.b--;
        }
        return zDispatchTouchEvent;
    }

    @Override // android.view.View
    public final boolean isVerticalScrollBarEnabled() {
        return this.b == 0 && super.isVerticalScrollBarEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        boolean zA = a(motionEvent);
        if (zA) {
            this.b++;
        }
        PointerIcon pointerIconOnResolvePointerIcon = super.onResolvePointerIcon(motionEvent, i);
        if (zA) {
            this.b--;
        }
        return pointerIconOnResolvePointerIcon;
    }
}
