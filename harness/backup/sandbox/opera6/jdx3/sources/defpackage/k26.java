package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* loaded from: classes.dex */
public final class k26 extends LayerDrawable {
    public final Drawable a;
    public final Drawable b;
    public int c;

    public k26(Drawable drawable, Drawable drawable2) {
        super(new Drawable[]{drawable, drawable2});
        this.a = drawable;
        this.b = drawable2;
        drawable2.setAlpha(this.c);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.c < 255) {
            this.a.draw(canvas);
        }
        int i = this.c;
        if (i > 0) {
            Drawable drawable = this.b;
            drawable.setAlpha(i);
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }
}
