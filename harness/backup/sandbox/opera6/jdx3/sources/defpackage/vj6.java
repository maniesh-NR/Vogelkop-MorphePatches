package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: classes.dex */
public abstract class vj6 {
    public static final Paint a;

    static {
        Paint paint = new Paint();
        a = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
    }

    public static synchronized void a(float f, float f2, float f3, float f4, Canvas canvas, int i) {
        Paint paint = a;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        canvas.drawRect(f, f2, f3, f4, paint);
    }
}
