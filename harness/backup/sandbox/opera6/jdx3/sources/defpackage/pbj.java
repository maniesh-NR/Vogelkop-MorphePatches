package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class pbj extends Drawable {
    public final gjf a;
    public final byte b;
    public final float c;
    public final Paint d;
    public final Paint e;

    /* JADX WARN: Multi-variable type inference failed */
    public pbj(gjf gjfVar, int i, float f, int i2, int i3) {
        this.a = gjfVar;
        this.b = i;
        this.c = f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i2);
        this.d = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(i3);
        paint2.setStrokeWidth(f);
        this.e = paint2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i = (int) (this.c / 2.0f);
        int iWidth = getBounds().width() - (i << 1);
        if (iWidth <= 0) {
            return;
        }
        Path path = this.a.b(iWidth, this.b).c;
        float f = i;
        float f2 = getBounds().left + f;
        float f3 = getBounds().top + f;
        int iSave = canvas.save();
        canvas.translate(f2, f3);
        try {
            canvas.drawPath(path, this.d);
            canvas.drawPath(path, this.e);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d.setAlpha(i);
        this.e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
    }
}
