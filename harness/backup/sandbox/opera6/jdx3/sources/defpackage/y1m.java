package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.LayerDrawable;

/* loaded from: classes.dex */
public final class y1m extends DrawableWrapper {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public y1m(LayerDrawable layerDrawable, float f, float f2, float f3) {
        super(layerDrawable);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = 0.5f;
        this.e = 0.5f;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        int iSave = canvas.save();
        try {
            Rect bounds = drawable.getBounds();
            int i = bounds.right - bounds.left;
            int i2 = bounds.bottom - bounds.top;
            canvas.translate(this.a, this.b);
            canvas.rotate(this.c, (i * this.d) + bounds.left, (i2 * this.e) + bounds.top);
            super.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }
}
