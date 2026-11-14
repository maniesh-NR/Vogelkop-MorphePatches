package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class qgh extends Drawable {
    public final boolean a;
    public final Paint b;

    public qgh(boolean z) {
        this.a = z;
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(536870911);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iHeight = getBounds().height();
        int i = iHeight << 1;
        boolean z = this.a;
        int iWidth = z ? getBounds().width() - i : 0;
        int iCenterY = getBounds().centerY() - iHeight;
        if (z) {
            i = getBounds().right;
        }
        canvas.drawOval(iWidth, iCenterY, i, getBounds().centerY() + iHeight, this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
