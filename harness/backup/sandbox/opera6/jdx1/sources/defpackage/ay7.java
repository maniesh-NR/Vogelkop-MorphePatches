package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public final class ay7 extends ReplacementSpan {
    public final cz7 a;
    public final dz7 b = new dz7();

    public ay7(cz7 cz7Var) {
        this.a = cz7Var;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        this.b.a(paint);
        paint.setColor(ab5.l(paint.getColor(), 255));
        this.a.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.b.a(paint);
        paint.setColor(ab5.l(paint.getColor(), 255));
        return this.a.getSize(paint, charSequence, i, i2, fontMetricsInt);
    }
}
