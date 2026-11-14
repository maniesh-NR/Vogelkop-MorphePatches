package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.leanplum.internal.Constants;

/* loaded from: classes.dex */
public final class jqe extends Drawable {
    public static final /* synthetic */ xtb[] e = {new pee(jqe.class, Constants.Kinds.COLOR, "getColor()I", 0), new pee(jqe.class, "insetX", "getInsetX()I", 0), new pee(jqe.class, "cornerRadius", "getCornerRadius()I", 0)};
    public final iqe a = new iqe(this, (byte) 0);
    public final iqe b = new iqe(this, (byte) 1);
    public final iqe c = new iqe(this, (byte) 2);
    public final Paint d = new Paint(1);

    public final int a() {
        xtb xtbVar = e[0];
        return ((Number) this.a.b).intValue();
    }

    public final int b() {
        xtb xtbVar = e[2];
        return ((Number) this.c.b).intValue();
    }

    public final int c() {
        xtb xtbVar = e[1];
        return ((Number) this.b.b).intValue();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (Color.alpha(a()) == 0) {
            return;
        }
        int iA = a();
        Paint paint = this.d;
        paint.setColor(iA);
        Rect bounds = getBounds();
        canvas.drawRoundRect(c() + bounds.left, bounds.top, bounds.right - c(), b() + bounds.bottom, b(), b(), paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }
}
