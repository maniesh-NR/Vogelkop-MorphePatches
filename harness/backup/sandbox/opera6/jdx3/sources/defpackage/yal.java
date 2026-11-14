package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.LineBackgroundSpan;
import android.text.style.LineHeightSpan;

/* loaded from: classes.dex */
public final class yal implements LineHeightSpan, LineBackgroundSpan {
    public final fr a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Rect e = new Rect();

    public yal(fr frVar, boolean z, boolean z2, boolean z3) {
        this.a = frVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = i5 - fontMetricsInt.ascent;
        if (i6 <= 0) {
            return;
        }
        int i7 = (this.a.b << 1) + i6;
        int iRound = Math.round(i5 * (i7 / i6));
        fontMetricsInt.descent = iRound;
        fontMetricsInt.ascent = iRound - i7;
    }

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        int color = paint.getColor();
        if (this.b) {
            paint.setColor(0);
        } else {
            paint.setColor(this.c ? p37.a0(0.1f, color) : 0);
        }
        Rect rect = this.e;
        rect.left = i;
        rect.top = i3;
        rect.right = i2;
        rect.bottom = i5;
        canvas.drawRect(rect, paint);
        paint.setColor(p37.a0(0.3f, color));
        if (paint.getColor() != 0) {
            Paint.Style style = paint.getStyle();
            float strokeWidth = paint.getStrokeWidth();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.a.c);
            if (this.d) {
                canvas.drawRect(rect, paint);
            } else {
                float f = i;
                float f2 = i3;
                float f3 = i5;
                canvas.drawLine(f, f2, f, f3, paint);
                float f4 = i2;
                canvas.drawLine(f4, f2, f4, f3, paint);
                canvas.drawLine(f, f3, f4, f3, paint);
            }
            paint.setStrokeWidth(strokeWidth);
            paint.setStyle(style);
        }
        paint.setColor(color);
    }
}
