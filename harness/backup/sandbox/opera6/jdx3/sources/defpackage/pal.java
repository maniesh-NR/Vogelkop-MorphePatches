package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public final class pal extends ReplacementSpan {
    public final fr a;
    public final ral b;
    public final int c;
    public final boolean d;
    public final boolean e;

    public pal(fr frVar, ral ralVar, int i, boolean z, boolean z2) {
        this.a = frVar;
        this.b = ralVar;
        this.c = i;
        this.d = z;
        this.e = z2;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.e) {
            int color = paint.getColor();
            this.a.getClass();
            paint.setColor(p37.a0(0.3f, color));
            if (paint.getColor() != 0) {
                float strokeWidth = paint.getStrokeWidth();
                paint.setStrokeWidth(r0.c);
                canvas.drawLine(f, i3, f, i5, paint);
                paint.setStrokeWidth(strokeWidth);
            }
            paint.setColor(color);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r8 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r8 == false) goto L30;
     */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getSize(android.graphics.Paint r9, java.lang.CharSequence r10, int r11, int r12, android.graphics.Paint.FontMetricsInt r13) {
        /*
            r8 = this;
            r10 = -1
            r11 = 0
            if (r13 == 0) goto Lc
            r13.ascent = r10
            r13.descent = r11
            r13.top = r10
            r13.bottom = r11
        Lc:
            fr r12 = r8.a
            int r12 = r12.b
            android.text.TextPaint r9 = (android.text.TextPaint) r9
            ral r13 = r8.b
            java.util.ArrayList r13 = r13.a
            int r0 = r8.c
            java.lang.Object r1 = r13.get(r0)
            qal r1 = (defpackage.qal) r1
            nal r1 = r1.d
            int r1 = r1.ordinal()
            boolean r8 = r8.d
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L38
            if (r1 == r2) goto L36
            if (r1 != r3) goto L32
            if (r8 != 0) goto L3a
            goto La0
        L32:
            h9o.p()
            return r11
        L36:
            r1 = r2
            goto L3b
        L38:
            if (r8 != 0) goto La0
        L3a:
            r1 = r11
        L3b:
            float r4 = r9.density
            r9.getFontSpacing()
            r9.getLetterSpacing()
            r9.getTextScaleX()
            r9.getTextSize()
            r9.getTextSkewX()
            r9.getTypeface()
            r9.getFlags()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L57:
            int r5 = r4.size()
            int r6 = r13.size()
            if (r5 >= r6) goto L87
            int r5 = r4.size()
            java.lang.Object r5 = r13.get(r5)
            qal r5 = (defpackage.qal) r5
            java.lang.CharSequence r6 = r5.a
            int r7 = r5.b
            int r5 = r5.c
            float r5 = r9.measureText(r6, r7, r5)
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            float r5 = (float) r5
            int r5 = (int) r5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r4.add(r6)
            if (r5 <= r11) goto L57
            r11 = r5
            goto L57
        L87:
            java.lang.Object r9 = r4.get(r0)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            int r11 = r11 - r9
            if (r1 == 0) goto La0
            int r9 = r11 % 2
            if (r9 != 0) goto L9b
            int r11 = r11 / 2
            goto La0
        L9b:
            if (r8 != 0) goto L9e
            r10 = r2
        L9e:
            int r11 = r11 + r10
            int r11 = r11 / r3
        La0:
            int r12 = r12 + r11
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pal.getSize(android.graphics.Paint, java.lang.CharSequence, int, int, android.graphics.Paint$FontMetricsInt):int");
    }
}
