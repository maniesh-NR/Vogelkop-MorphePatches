package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a9i {
    public final int a;
    public final int b;
    public final int c;
    public final RectF d;
    public final Paint e;
    public final TextPaint f;
    public final float g;
    public final float h;

    public a9i(int i, int i2, int i3, int i4, int i5, float f) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = new RectF(0.0f, 0.0f, i, i2);
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setColor(i5);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        textPaint.setColor(i4);
        textPaint.setFakeBoldText(true);
        textPaint.setTextSize(f);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        this.g = (float) Math.ceil(fontMetrics.bottom - fontMetrics.top);
        this.h = -fontMetrics.top;
    }

    public final Bitmap a(String str) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i = this.a;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, this.b, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f = this.c;
        canvas.drawRoundRect(this.d, f, f, this.e);
        String upperCase = str.substring(0, 1).toUpperCase(Locale.getDefault());
        TextPaint textPaint = this.f;
        float fMeasureText = (i - textPaint.measureText(upperCase)) / 2.0f;
        float f2 = this.g;
        canvas.drawText(upperCase, fMeasureText, Math.round(((Math.max(r2, f2) - f2) / 2.0f) + this.h), textPaint);
        return bitmapCreateBitmap;
    }
}
