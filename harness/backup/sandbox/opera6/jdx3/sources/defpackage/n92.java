package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.TypedValue;

/* loaded from: classes.dex */
public final class n92 extends m92 {
    public final xbf f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    public n92(int i, int i2, Context context, Bitmap bitmap) {
        super(bitmap, i2);
        this.f = new xbf((byte) 12);
        Resources resources = context.getResources();
        this.g = context.getColor(2131099824);
        this.h = fan.a(2.0f, resources);
        this.i = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        this.k = i;
        this.j = i;
    }

    @Override // defpackage.m92, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f.y(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, this.g, 0, this.e, this.h, this.i, false);
        super.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.j;
    }
}
