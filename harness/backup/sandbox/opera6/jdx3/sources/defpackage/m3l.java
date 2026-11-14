package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.leanplum.core.BuildConfig;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class m3l extends Drawable {
    public static final /* synthetic */ int h = 0;
    public final TextPaint a;
    public String b;
    public int c;
    public int d;
    public final int e;
    public final int f;
    public ColorStateList g;

    public m3l(Context context, AttributeSet attributeSet) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.a = textPaint;
        this.b = BuildConfig.BUILD_NUMBER;
        this.d = 255;
        this.g = ColorStateList.valueOf(-16777216);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.Q, 2130968614, 2132082698);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        textPaint.setTextSize(dimensionPixelSize);
        if (string != null) {
            textPaint.setTypeface(Typeface.create(string, 0));
        }
    }

    public final void a(int i) {
        if (this.c == i) {
            return;
        }
        this.c = i;
        this.b = i > 99 ? "…" : String.format(Locale.getDefault(), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.c)}, 1));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iA0 = p37.a0(this.d / 255.0f, this.g.getColorForState(getState(), -16777216));
        TextPaint textPaint = this.a;
        textPaint.setColor(iA0);
        Rect bounds = getBounds();
        canvas.drawText(this.b, (bounds.width() / 2.0f) + bounds.left + this.f, (((bounds.height() / 2.0f) + (bounds.top + this.e)) - ((textPaint.descent() - textPaint.ascent()) / 2.0f)) - textPaint.ascent(), textPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
