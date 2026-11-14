package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class ecd extends Drawable {
    public final gjf a;
    public final int b;
    public final Paint c;

    public ecd(gjf gjfVar, int i) {
        this.a = gjfVar;
        this.b = i;
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        this.c = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        bcd bcdVarB = this.a.b(getBounds().width(), this.b);
        float f = getBounds().left;
        float f2 = getBounds().top;
        int iSave = canvas.save();
        canvas.translate(f, f2);
        try {
            canvas.drawPath(bcdVarB.c, this.c);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        this.c.setColor(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.c.setColor(colorStateList.getDefaultColor());
        }
    }
}
