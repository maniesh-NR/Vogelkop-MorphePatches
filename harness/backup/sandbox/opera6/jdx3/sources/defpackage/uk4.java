package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* loaded from: classes.dex */
public final class uk4 extends LayerDrawable {
    public final Drawable a;
    public final boolean b;
    public int c;

    public uk4(Resources resources, Drawable drawable, boolean z) {
        super(new Drawable[]{drawable});
        this.a = drawable.getConstantState().newDrawable(resources).mutate();
        this.b = z;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.c == 0) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        canvas.save();
        canvas.clipRect(bounds.left, this.c, bounds.right, bounds.bottom);
        super.draw(canvas);
        canvas.restore();
        Rect bounds2 = getBounds();
        Drawable drawable = this.a;
        drawable.setBounds(bounds2);
        canvas.save();
        canvas.clipRect(bounds.left, 0, bounds.right, this.c);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.a.setBounds(rect);
    }
}
