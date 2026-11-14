package com.opera.android.custom_views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.text.Layout;
import android.util.AttributeSet;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class FadingTextView extends StylingTextView {
    public LinearGradient m;
    public int n;
    public float o;
    public float p;
    public boolean q;
    public final Rect r;
    public final float s;

    /* JADX WARN: Multi-variable type inference failed */
    public FadingTextView(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet, 0);
        this.r = new Rect();
        this.s = context.getResources().getDimension(2131165701);
        cs5.W(this);
        int dimension = (int) getResources().getDimension(2131165702);
        if (this.l.b) {
            i = dimension;
            dimension = 0;
        } else {
            i = 0;
        }
        setPadding(dimension, 0, i, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        ((ArrayList) this.l.d).add(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((ArrayList) this.l.d).remove(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        int compoundPaddingLeft = getCompoundPaddingLeft();
        int compoundPaddingRight = getCompoundPaddingRight();
        int width = getWidth();
        int height = getHeight();
        int i3 = (width - compoundPaddingLeft) - compoundPaddingRight;
        Layout layout = getLayout();
        if (this.q) {
            if (layout != null) {
                this.o = layout.getLineWidth(0);
                this.q = false;
            } else {
                this.o = 0.0f;
            }
        }
        boolean z = this.l.b;
        float f2 = this.s;
        if (layout == null || !z) {
            f = i3 - f2;
        } else {
            layout.getLineBounds(0, this.r);
            f = r6.right - (i3 - f2);
        }
        float f3 = f;
        if (i3 <= 0 || height <= 0 || this.o <= i3 || getLineCount() > 1) {
            getPaint().setShader(null);
        } else {
            int currentTextColor = getCurrentTextColor();
            if (this.m == null || currentTextColor != this.n || f3 != this.p) {
                if (z) {
                    i = (-16777216) | currentTextColor;
                    i2 = 16777215 & currentTextColor;
                } else {
                    i = currentTextColor & 16777215;
                    i2 = currentTextColor | (-16777216);
                }
                this.m = new LinearGradient(f3, 0.0f, f2 + f3, 0.0f, i2, i, Shader.TileMode.CLAMP);
                this.n = currentTextColor;
                this.p = f3;
            }
            getPaint().setShader(this.m);
        }
        super/*android.view.View*/.onDraw(canvas);
    }

    @Override // com.opera.android.custom_views.StylingTextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.q = true;
        super.onTextChanged(charSequence, i, i2, i3);
    }
}
