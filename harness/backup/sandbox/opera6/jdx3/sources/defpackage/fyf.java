package defpackage;

import android.graphics.Paint;
import com.opera.hype.image.editor.TextBoxEditText;

/* loaded from: classes.dex */
public final class fyf {
    public int a;
    public Paint.Style b;
    public Paint.Join c;
    public float d;
    public float e;
    public float f;
    public int g;
    public final TextBoxEditText h;

    public fyf(int i, TextBoxEditText textBoxEditText, int i2) {
        i = (i2 & 1) != 0 ? 0 : i;
        Paint.Style style = Paint.Style.STROKE;
        Paint.Join join = Paint.Join.ROUND;
        float f = (i2 & 8) != 0 ? 0.0f : 0.04f;
        this.a = i;
        this.b = style;
        this.c = join;
        this.d = f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0;
        this.h = textBoxEditText;
    }

    public final void a(Paint paint) {
        paint.setColor(this.a);
        paint.setStyle(this.b);
        paint.setStrokeJoin(this.c);
        float f = this.d;
        paint.setStrokeWidth(f == 0.0f ? this.e : f * paint.getTextSize());
        paint.setShadowLayer(this.f, 0.0f, 0.0f, this.g);
    }
}
