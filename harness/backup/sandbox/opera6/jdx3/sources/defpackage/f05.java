package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.shapes.OvalShape;

/* loaded from: classes.dex */
public final class f05 extends OvalShape {
    public final int a;
    public final Paint b;
    public final int c;
    public final /* synthetic */ g05 d;

    public f05(g05 g05Var, int i, int i2) {
        this.d = g05Var;
        Paint paint = new Paint();
        this.b = paint;
        this.a = i;
        this.c = i2;
        float f = i2 / 2.0f;
        paint.setShader(new RadialGradient(f, f, i, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
    public final void draw(Canvas canvas, Paint paint) {
        g05 g05Var = this.d;
        float width = g05Var.getWidth() / 2.0f;
        float height = g05Var.getHeight() / 2.0f;
        int i = this.c;
        canvas.drawCircle(width, height, (i / 2.0f) + this.a, this.b);
        canvas.drawCircle(width, height, i / 2.0f, paint);
    }
}
