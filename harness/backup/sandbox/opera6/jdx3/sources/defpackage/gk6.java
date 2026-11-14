package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gk6 extends Drawable {
    public static final /* synthetic */ int j = 0;
    public final Drawable a;
    public final Integer b;
    public final int c;
    public final int d;
    public final fk6 e;
    public int f;
    public Integer g;
    public final Paint h;
    public Drawable i;

    public gk6(Context context, Drawable drawable, Integer num, int i, int i2, fk6 fk6Var, int i3) {
        this.a = drawable;
        this.b = num;
        this.c = i;
        this.d = i2;
        this.e = fk6Var;
        this.f = i3;
        this.g = Integer.valueOf(f03.t(num.intValue(), context, 2131101243));
        Paint paint = new Paint(1);
        paint.setColor(f03.t(2130969332, context, 2131101243));
        this.h = paint;
        if (drawable == null) {
            drawable = null;
        } else {
            Integer num2 = this.g;
            if (num2 != null) {
                j14.n0(drawable, num2.intValue());
            }
        }
        this.i = drawable;
    }

    public final void a(int i, Context context) {
        int iT = f03.t(2130969332, context, 2131101243);
        Paint paint = this.h;
        if (paint.getColor() != iT) {
            paint.setColor(iT);
        }
        Drawable drawable = null;
        Integer num = this.b;
        Integer numValueOf = num != null ? Integer.valueOf(f03.t(num.intValue(), context, 2131101243)) : null;
        if (!Intrinsics.a(this.g, numValueOf)) {
            this.g = numValueOf;
            Drawable drawable2 = this.a;
            if (drawable2 != null) {
                if (numValueOf != null) {
                    j14.n0(drawable2, numValueOf.intValue());
                }
                drawable = drawable2;
            }
            this.i = drawable;
        }
        this.f = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getBounds().left, getBounds().top);
        float fWidth = getBounds().width();
        float f = this.c;
        float fHeight = getBounds().height();
        float f2 = this.d;
        canvas.scale(fWidth / f, fHeight / f2);
        bcd bcdVar = (bcd) this.e.invoke();
        bcdVar.b(canvas, 0.0f, 0.0f, this.h.getColor());
        Drawable drawable = this.i;
        if (drawable != null) {
            float fWidth2 = (f / 2.0f) - (drawable.getBounds().width() / 2.0f);
            float fHeight2 = (f2 / 2.0f) - (drawable.getBounds().height() / 2.0f);
            try {
                canvas.save();
                canvas.translate(fWidth2, fHeight2);
                drawable.draw(canvas);
                canvas.restore();
            } finally {
                canvas.restore();
            }
        }
        int i = this.f;
        if (i != 0) {
            bcdVar.a(canvas, i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.h.setAlpha(i);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
