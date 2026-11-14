package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class ngl extends Drawable {
    public final TextPaint a;
    public final Rect b;
    public final String c;
    public final ColorStateList d;

    public ngl(String str, Typeface typeface, int i, int i2) {
        this(str, typeface, i, ColorStateList.valueOf(i2));
    }

    public ngl(String str, Typeface typeface, int i, ColorStateList colorStateList) {
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        Rect rect = new Rect();
        this.b = rect;
        this.c = str;
        this.d = colorStateList;
        textPaint.setAntiAlias(true);
        textPaint.setTypeface(typeface);
        textPaint.setTextSize(i);
        textPaint.setColor(colorStateList.getDefaultColor());
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.getTextBounds(str, 0, str.length(), rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawText(this.c, getBounds().centerX(), getBounds().centerY() - this.b.exactCenterY(), this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.b.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.b.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.d.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        boolean z;
        TextPaint textPaint = this.a;
        int colorForState = this.d.getColorForState(iArr, textPaint.getColor());
        if (colorForState != textPaint.getColor()) {
            textPaint.setColor(colorForState);
            z = true;
        } else {
            z = false;
        }
        return super.setState(iArr) || z;
    }
}
