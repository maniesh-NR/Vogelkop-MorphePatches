package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class vf9 extends tf9 {
    public Path g;

    @Override // defpackage.tf9
    public final void a(Canvas canvas, Rect rect) {
        if (this.g == null) {
            return;
        }
        canvas.save();
        float f = -(this.d / 2.0f);
        canvas.translate(f, f);
        canvas.drawPath(this.g, this.e);
        canvas.restore();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.g = i41.H((this.d / 2.0f) + rect.width());
    }
}
