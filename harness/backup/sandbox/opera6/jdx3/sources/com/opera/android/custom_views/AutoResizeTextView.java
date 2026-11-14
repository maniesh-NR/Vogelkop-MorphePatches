package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import defpackage.fan;
import defpackage.j1f;
import defpackage.khh;

/* loaded from: classes.dex */
public class AutoResizeTextView extends StylingTextView {
    public final j1f m;

    /* JADX WARN: Multi-variable type inference failed */
    public AutoResizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j1f j1fVar = new j1f();
        j1fVar.e = new RectF();
        j1fVar.f = new RectF();
        j1fVar.d = this;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, khh.e, 0, 0);
        j1fVar.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, fan.a(12.0f, getResources()));
        typedArrayObtainStyledAttributes.recycle();
        j1fVar.b = (int) getTextSize();
        j1fVar.g = new TextPaint(getPaint());
        this.m = j1fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        t();
    }

    @Override // com.opera.android.custom_views.StylingTextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        t();
    }

    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setLineSpacing(float f, float f2) {
        super/*android.widget.TextView*/.setLineSpacing(f, f2);
        t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setLines(int i) {
        super/*android.widget.TextView*/.setLines(i);
        t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setMaxLines(int i) {
        super/*android.widget.TextView*/.setMaxLines(i);
        t();
    }

    public final void setSingleLine() {
        setSingleLine(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setSingleLine(boolean z) {
        super/*android.widget.TextView*/.setSingleLine(z);
        t();
    }

    public final void setTextSize(float f) {
        setTextSize(2, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTextSize(int i, float f) {
        j1f j1fVar = this.m;
        if (j1fVar == null) {
            super/*android.widget.TextView*/.setTextSize(i, f);
        } else {
            j1fVar.b = (int) TypedValue.applyDimension(i, f, ((AutoResizeTextView) j1fVar.d).getResources().getDisplayMetrics());
            j1fVar.a();
        }
    }

    public final void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        t();
    }

    public final void t() {
        j1f j1fVar = this.m;
        if (j1fVar == null) {
            return;
        }
        j1fVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(float f) {
        super/*android.widget.TextView*/.setTextSize(0, f);
    }
}
