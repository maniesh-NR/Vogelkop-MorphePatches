package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* loaded from: classes.dex */
public abstract class tf9 extends LayerDrawable {
    public final Context a;
    public final int b;
    public final Paint.Style c;
    public final int d;
    public final Paint e;
    public boolean f;

    public tf9(Context context, sll sllVar, Paint.Style style, int i) throws Resources.NotFoundException {
        super(sllVar != null ? new Drawable[]{sllVar} : new Drawable[0]);
        Paint paint = new Paint(1);
        this.e = paint;
        this.a = context;
        this.b = i;
        this.c = style;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165749);
        this.d = dimensionPixelSize;
        paint.setStrokeWidth(dimensionPixelSize);
    }

    public void a(Canvas canvas, Rect rect) {
        float f = this.d / 2.0f;
        canvas.drawOval(rect.left - f, rect.top - f, rect.right + f, rect.bottom + f, this.e);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f) {
            int iT = f03.t(this.b, this.a, 2131101243);
            Paint.Style style = Paint.Style.STROKE;
            Paint.Style style2 = this.c;
            Paint paint = this.e;
            if (style2 == style || style2 == Paint.Style.FILL_AND_STROKE) {
                paint.setColor(iT);
                paint.setStyle(style);
                a(canvas, getBounds());
            }
            Paint.Style style3 = Paint.Style.FILL;
            if (style2 == style3 || style2 == Paint.Style.FILL_AND_STROKE) {
                paint.setStyle(style3);
                paint.setColor(p37.a0(0.12f, iT));
                a(canvas, getBounds());
            }
        }
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        super.onStateChange(iArr);
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (iArr[i] == 16842908) {
                z = true;
                break;
            }
            i++;
        }
        boolean z2 = z != this.f;
        this.f = z;
        return z2;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.e.setAlpha(i);
    }
}
