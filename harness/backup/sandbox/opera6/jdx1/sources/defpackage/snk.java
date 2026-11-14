package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class snk {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final TextPaint f;
    public final Paint g;
    public final Paint h;
    public CharSequence i;
    public Layout.Alignment j;
    public Bitmap k;
    public float l;
    public int m;
    public int n;
    public float o;
    public int p;
    public float q;
    public float r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public float x;
    public float y;
    public float z;

    public snk(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.a = fRound;
        this.b = fRound;
        this.c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.graphics.Canvas r11, boolean r12) {
        /*
            r10 = this;
            if (r12 == 0) goto La7
            android.text.StaticLayout r12 = r10.E
            android.text.StaticLayout r0 = r10.F
            if (r12 == 0) goto La6
            if (r0 == 0) goto La6
            int r1 = r11.save()
            int r2 = r10.G
            float r2 = (float) r2
            int r3 = r10.H
            float r3 = (float) r3
            r11.translate(r2, r3)
            int r2 = r10.u
            int r2 = android.graphics.Color.alpha(r2)
            if (r2 <= 0) goto L3d
            int r2 = r10.u
            android.graphics.Paint r8 = r10.g
            r8.setColor(r2)
            int r2 = r10.I
            int r2 = -r2
            float r4 = (float) r2
            int r2 = r12.getWidth()
            int r3 = r10.I
            int r2 = r2 + r3
            float r6 = (float) r2
            int r2 = r12.getHeight()
            float r7 = (float) r2
            r5 = 0
            r3 = r11
            r3.drawRect(r4, r5, r6, r7, r8)
            goto L3e
        L3d:
            r3 = r11
        L3e:
            int r11 = r10.w
            r2 = 0
            r4 = 1
            android.text.TextPaint r5 = r10.f
            if (r11 != r4) goto L5e
            android.graphics.Paint$Join r11 = android.graphics.Paint.Join.ROUND
            r5.setStrokeJoin(r11)
            float r11 = r10.a
            r5.setStrokeWidth(r11)
            int r11 = r10.v
            r5.setColor(r11)
            android.graphics.Paint$Style r11 = android.graphics.Paint.Style.FILL_AND_STROKE
            r5.setStyle(r11)
            r0.draw(r3)
            goto L92
        L5e:
            r6 = 2
            float r7 = r10.b
            if (r11 != r6) goto L6b
            float r11 = r10.c
            int r0 = r10.v
            r5.setShadowLayer(r7, r11, r11, r0)
            goto L92
        L6b:
            r6 = 3
            if (r11 == r6) goto L72
            r4 = 4
            if (r11 != r4) goto L92
            r4 = r2
        L72:
            int r11 = r10.v
            r6 = -1
            if (r4 != 0) goto L7a
            r9 = r6
            r6 = r11
            r11 = r9
        L7a:
            r4 = 1073741824(0x40000000, float:2.0)
            float r4 = r7 / r4
            int r8 = r10.s
            r5.setColor(r8)
            android.graphics.Paint$Style r8 = android.graphics.Paint.Style.FILL
            r5.setStyle(r8)
            float r8 = -r4
            r5.setShadowLayer(r7, r8, r8, r6)
            r0.draw(r3)
            r5.setShadowLayer(r7, r4, r4, r11)
        L92:
            int r10 = r10.s
            r5.setColor(r10)
            android.graphics.Paint$Style r10 = android.graphics.Paint.Style.FILL
            r5.setStyle(r10)
            r12.draw(r3)
            r10 = 0
            r5.setShadowLayer(r10, r10, r10, r2)
            r3.restoreToCount(r1)
        La6:
            return
        La7:
            r3 = r11
            android.graphics.Rect r11 = r10.J
            r11.getClass()
            android.graphics.Bitmap r11 = r10.k
            r11.getClass()
            android.graphics.Bitmap r11 = r10.k
            android.graphics.Rect r12 = r10.J
            android.graphics.Paint r10 = r10.h
            r0 = 0
            r3.drawBitmap(r11, r0, r12, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.snk.a(android.graphics.Canvas, boolean):void");
    }
}
