package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class d03 extends ol7 {
    public static final /* synthetic */ int e = 0;
    public final x03 b;
    public final Drawable c;
    public final Drawable d;

    public d03(x03 x03Var, Drawable drawable, Drawable drawable2) {
        super(drawable);
        this.b = x03Var;
        this.c = drawable;
        this.d = drawable2;
        new Paint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public final void draw(Canvas canvas) {
        this.b.getClass();
        super.draw(canvas);
    }

    public final void getOutline(Outline outline) {
        this.d.getOutline(outline);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable mutate() {
        this.c.mutate();
        return super/*android.graphics.drawable.Drawable*/.mutate();
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.d.setBounds(rect);
    }
}
