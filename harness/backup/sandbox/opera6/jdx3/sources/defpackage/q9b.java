package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class q9b extends ol7 {
    public int b;
    public int c;
    public final Paint d;

    public q9b(ColorDrawable colorDrawable) {
        super(colorDrawable);
        Paint paint = new Paint();
        paint.setColor(0);
        this.d = paint;
    }

    public final void a(Drawable drawable) {
        super.a(drawable);
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        Drawable drawable = ((ol7) this).a;
        if (drawable != null) {
            drawable.setBounds(getBounds().left, getBounds().top + this.b, getBounds().right, getBounds().bottom - this.c);
        }
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        canvas.drawRect(getBounds().left, getBounds().top, getBounds().right, getBounds().top + this.b, paint);
        canvas.drawRect(getBounds().left, getBounds().bottom - this.c, getBounds().right, getBounds().bottom, paint);
        super.draw(canvas);
    }

    public final void onBoundsChange(Rect rect) {
        b();
    }
}
