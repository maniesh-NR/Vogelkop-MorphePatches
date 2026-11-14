package defpackage;

import android.text.TextPaint;

/* loaded from: classes.dex */
public final class lam extends cz7 {
    public TextPaint e;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r20, java.lang.CharSequence r21, int r22, int r23, float r24, int r25, int r26, int r27, android.graphics.Paint r28) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = r28
            boolean r3 = r1 instanceof android.text.Spanned
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L4c
            android.text.Spanned r1 = (android.text.Spanned) r1
            java.lang.Class<android.text.style.CharacterStyle> r3 = android.text.style.CharacterStyle.class
            r6 = r22
            r7 = r23
            java.lang.Object[] r1 = r1.getSpans(r6, r7, r3)
            android.text.style.CharacterStyle[] r1 = (android.text.style.CharacterStyle[]) r1
            int r3 = r1.length
            if (r3 == 0) goto L43
            int r3 = r1.length
            r6 = 0
            if (r3 != r5) goto L25
            r3 = r1[r6]
            if (r3 == r0) goto L43
        L25:
            android.text.TextPaint r3 = r0.e
            if (r3 != 0) goto L30
            android.text.TextPaint r3 = new android.text.TextPaint
            r3.<init>()
            r0.e = r3
        L30:
            r4 = r3
            r4.set(r2)
        L34:
            int r3 = r1.length
            if (r6 >= r3) goto L4a
            r3 = r1[r6]
            boolean r7 = r3 instanceof android.text.style.MetricAffectingSpan
            if (r7 != 0) goto L40
            r3.updateDrawState(r4)
        L40:
            int r6 = r6 + 1
            goto L34
        L43:
            boolean r1 = r2 instanceof android.text.TextPaint
            if (r1 == 0) goto L4a
            r4 = r2
            android.text.TextPaint r4 = (android.text.TextPaint) r4
        L4a:
            r11 = r4
            goto L54
        L4c:
            boolean r1 = r2 instanceof android.text.TextPaint
            if (r1 == 0) goto L4a
            r4 = r2
            android.text.TextPaint r4 = (android.text.TextPaint) r4
            goto L4a
        L54:
            if (r11 == 0) goto L84
            int r1 = r11.bgColor
            if (r1 == 0) goto L84
            short r1 = r0.c
            float r1 = (float) r1
            float r9 = r24 + r1
            r1 = r25
            float r8 = (float) r1
            r1 = r27
            float r10 = (float) r1
            int r1 = r11.getColor()
            android.graphics.Paint$Style r3 = r11.getStyle()
            int r4 = r11.bgColor
            r11.setColor(r4)
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL
            r11.setStyle(r4)
            r6 = r20
            r7 = r24
            r6.drawRect(r7, r8, r9, r10, r11)
            r11.setStyle(r3)
            r11.setColor(r1)
        L84:
            xx7 r1 = defpackage.xx7.a()
            r1.getClass()
            r1 = r26
            float r1 = (float) r1
            if (r11 != 0) goto L91
            r11 = r2
        L91:
            kam r0 = r0.b
            cyd r2 = r0.b
            java.lang.Object r3 = r2.e
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3
            android.graphics.Typeface r4 = r11.getTypeface()
            r11.setTypeface(r3)
            int r0 = r0.a
            int r14 = r0 << 1
            java.lang.Object r0 = r2.d
            r13 = r0
            char[] r13 = (char[]) r13
            r15 = 2
            r12 = r20
            r16 = r24
            r17 = r1
            r18 = r11
            r12.drawText(r13, r14, r15, r16, r17, r18)
            r11.setTypeface(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lam.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }
}
