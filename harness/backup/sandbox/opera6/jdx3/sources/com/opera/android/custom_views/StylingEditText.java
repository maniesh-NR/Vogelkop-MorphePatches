package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.khh;
import defpackage.ua7;

/* loaded from: classes.dex */
public class StylingEditText extends ObservableEditText {
    public final ua7 v;

    /* JADX WARN: Multi-variable type inference failed */
    public StylingEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ua7 ua7Var = new ua7((View) this, 1, PorterDuff.Mode.SRC_IN);
        this.v = ua7Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.K);
        ua7Var.A(typedArrayObtainStyledAttributes, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void draw(Canvas canvas) {
        Drawable background = getBackground();
        ua7 ua7Var = this.v;
        if (background != null) {
            ua7Var.X(((View) ua7Var.b).getDrawableState(), 0, background);
        } else {
            ua7Var.getClass();
        }
        super/*android.view.View*/.draw(canvas);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ua7 ua7Var = this.v;
        if (ua7Var != null) {
            ua7Var.G();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onConfigurationChanged(Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
        ua7 ua7Var = this.v;
        if (ua7Var != null) {
            ua7Var.F();
        }
    }
}
