package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.opera.hype.image.editor.TextBoxEditText;
import kotlin.ranges.IntRange;
import kotlin.ranges.a;

/* loaded from: classes.dex */
public final class sik extends ReplacementSpan {
    public final fyf a;
    public final fyf b;

    public sik(int i, TextBoxEditText textBoxEditText) {
        this.a = new fyf(i, textBoxEditText, 118);
        this.b = new fyf(0, textBoxEditText, 127);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2 = i4;
        canvas.drawText(charSequence, i, i2, f, f2, paint);
        fyf fyfVar = this.b;
        fyfVar.getClass();
        fyfVar.a = paint.getColor();
        fyfVar.b = paint.getStyle();
        fyfVar.c = paint.getStrokeJoin();
        fyfVar.d = 0.0f;
        fyfVar.e = paint.getStrokeWidth();
        yq1 yq1Var = fyfVar.h;
        fyfVar.f = yq1Var.getShadowRadius();
        fyfVar.g = yq1Var.getShadowColor();
        this.a.a(paint);
        canvas.drawText(charSequence, i, i2, f, f2, paint);
        fyfVar.a(paint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt(fontMetricsInt);
        }
        String string = charSequence.toString();
        IntRange intRangeJ = djh.j(i, i2);
        return (int) paint.measureText(string.substring(((a) intRangeJ).a, ((a) intRangeJ).b + 1));
    }
}
