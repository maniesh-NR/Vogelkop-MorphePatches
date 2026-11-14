package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.opera.android.bar.LimitedSideActionsAppbar;

/* loaded from: classes.dex */
public final class iec extends Drawable {
    public final xbf a = new xbf((byte) 12);
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public final int f;
    public final int g;
    public final /* synthetic */ LimitedSideActionsAppbar h;

    public iec(LimitedSideActionsAppbar limitedSideActionsAppbar, Resources resources) {
        this.h = limitedSideActionsAppbar;
        this.f = resources.getDimensionPixelSize(2131167744);
        Rect rect = fan.a;
        this.g = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        LimitedSideActionsAppbar limitedSideActionsAppbar = this.h;
        this.a.y(canvas, 0, 0, limitedSideActionsAppbar.getWidth(), limitedSideActionsAppbar.getHeight(), this.e, this.d, 0, 0, this.c ? this.g : this.f, false);
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
