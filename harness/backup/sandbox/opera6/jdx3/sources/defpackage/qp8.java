package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class qp8 extends Drawable {
    public Bitmap a;
    public Paint b;
    public int c;
    public int d;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.b;
        Bitmap bitmap = this.a;
        if (bitmap.isRecycled()) {
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, bounds, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
