package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class bcd {
    public final Paint a = new Paint(1);
    public final Paint b;
    public final Path c;
    public final int d;
    public Bitmap e;
    public BitmapShader f;

    public bcd(Resources resources, Path path, int i) throws Resources.NotFoundException {
        Paint paint = new Paint(1);
        this.b = paint;
        this.d = i;
        this.c = path;
        resources.getDimensionPixelSize(2131165543);
        resources.getDimensionPixelSize(2131165544);
        paint.setStrokeWidth(resources.getDimension(2131165542) * 2.0f);
    }

    public final void a(Canvas canvas, int i) {
        int i2;
        Bitmap bitmapU;
        Bitmap bitmap = this.e;
        Paint paint = this.b;
        if (bitmap == null && (bitmapU = z5i.u((i2 = this.d), i2, Bitmap.Config.ALPHA_8)) != null) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(-1);
            Canvas canvas2 = new Canvas(bitmapU);
            Path path = this.c;
            canvas2.clipPath(path);
            canvas2.drawPath(path, paint);
            this.e = bitmapU;
        }
        Bitmap bitmap2 = this.e;
        if (bitmap2 == null) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
    }

    public final void b(Canvas canvas, float f, float f2, int i) {
        canvas.save();
        canvas.translate(f, f2);
        Paint paint = this.a;
        paint.setColor(i);
        canvas.drawPath(this.c, paint);
        canvas.restore();
    }
}
