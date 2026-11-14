package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class p8i extends s8i {
    public final o8i f;
    public final n8i g;
    public final Paint h;
    public final RectF i;
    public final Bitmap j;
    public final int k;
    public int l;
    public final int m;
    public boolean n;

    public p8i(int i, int i2, Context context, Bitmap bitmap) {
        super(bitmap, i);
        this.i = new RectF();
        this.f = new o8i(this, i2);
        this.g = new n8i(this);
        Paint paint = new Paint();
        this.h = paint;
        paint.setAntiAlias(true);
        Drawable drawableF = sgb.F(2131233186, context);
        int iA = fan.a(4.0f, context.getResources());
        this.j = ((BitmapDrawable) drawableF).getBitmap();
        this.k = iA;
        invalidateSelf();
        this.m = fan.a(1.0f, context.getResources());
    }

    public final void a(int i) {
        this.n = true;
        this.l = i;
        n8i n8iVar = this.g;
        ValueAnimator valueAnimator = n8iVar.a;
        if (n8iVar.e == 255) {
            return;
        }
        n8iVar.e = (short) 255;
        valueAnimator.cancel();
        valueAnimator.setIntValues(((Integer) n8iVar.a.getAnimatedValue()).intValue(), n8iVar.e);
        valueAnimator.end();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00cd  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r14) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p8i.draw(android.graphics.Canvas):void");
    }
}
