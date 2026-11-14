package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.opera.android.bar.ExtraSideActionsAppbar;

/* loaded from: classes.dex */
public final class bn8 extends Drawable {
    public final xbf a = new xbf((byte) 12);
    public final Paint b = new Paint(1);
    public final Rect c = new Rect();
    public final int d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public final int j;
    public final /* synthetic */ ExtraSideActionsAppbar k;

    public bn8(ExtraSideActionsAppbar extraSideActionsAppbar, Resources resources) {
        this.k = extraSideActionsAppbar;
        this.d = resources.getDimensionPixelSize(2131167744);
        Rect rect = fan.a;
        this.e = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        this.j = resources.getDimensionPixelSize(2131167255);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ExtraSideActionsAppbar extraSideActionsAppbar = this.k;
        this.a.y(canvas, 0, 0, extraSideActionsAppbar.getWidth(), extraSideActionsAppbar.getHeight(), this.i, this.g, 0, 0, this.f ? this.e : this.d, true);
        int left = extraSideActionsAppbar.e.getLeft();
        int top = extraSideActionsAppbar.e.getTop();
        int i = this.j;
        int i2 = top + i;
        int right = extraSideActionsAppbar.e.getRight();
        int bottom = extraSideActionsAppbar.e.getBottom() - i;
        Rect rect = this.c;
        rect.set(left, i2, right, bottom);
        int iHeight = rect.height() / 2;
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.b;
        paint.setStyle(style);
        paint.setColor(this.h);
        float f = iHeight;
        canvas.drawRoundRect(rect.left, rect.top, rect.right, rect.bottom, f, f, paint);
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
