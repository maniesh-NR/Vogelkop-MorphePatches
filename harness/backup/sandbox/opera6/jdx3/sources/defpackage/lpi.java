package defpackage;

/* loaded from: classes.dex */
public final class lpi extends mx3 {
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4 A[PHI: r7
      0x00e4: PHI (r7v1 int) = (r7v0 int), (r7v2 int) binds: [B:3:0x0043, B:5:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.mx3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r15 = this;
            r0 = 2131363850(0x7f0a080a, float:1.834752E38)
            zp1 r15 = r15.a
            android.view.View r0 = r15.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1 = 2131362415(0x7f0a026f, float:1.834461E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            int r2 = r0.indexOfChild(r1)
            r3 = 2131362469(0x7f0a02a5, float:1.834472E38)
            android.view.View r4 = r0.findViewById(r3)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r0.removeView(r1)
            r0.removeView(r4)
            android.content.Context r15 = r15.getContext()
            android.view.LayoutInflater r15 = android.view.LayoutInflater.from(r15)
            r5 = 2131558484(0x7f0d0054, float:1.8742285E38)
            r6 = 0
            android.view.View r15 = r15.inflate(r5, r0, r6)
            r5 = r15
            com.opera.android.custom_views.TopPaddingFadingScrollView r5 = (com.opera.android.custom_views.TopPaddingFadingScrollView) r5
            r7 = 2131362414(0x7f0a026e, float:1.8344608E38)
            android.view.View r8 = w1h.j(r7, r15)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            if (r8 == 0) goto Le4
            r7 = 2131362468(0x7f0a02a4, float:1.8344717E38)
            android.view.View r8 = w1h.j(r7, r15)
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            if (r8 == 0) goto Le4
            android.view.View r9 = w1h.j(r3, r15)
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            if (r9 == 0) goto Le5
            r3 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r10 = w1h.j(r3, r15)
            com.opera.android.custom_views.StylingTextView r10 = (com.opera.android.custom_views.StylingTextView) r10
            if (r10 == 0) goto Le5
            r11 = 2131363510(0x7f0a06b6, float:1.834683E38)
            android.view.View r12 = w1h.j(r11, r15)
            if (r12 == 0) goto Le2
            android.view.View r15 = r1.findViewById(r3)
            android.widget.TextView r15 = (android.widget.TextView) r15
            if (r15 == 0) goto L79
            java.lang.CharSequence r15 = r15.getText()
            goto L7b
        L79:
            java.lang.String r15 = ""
        L7b:
            int r1 = r15.length()
            r3 = 1
            if (r1 <= 0) goto L84
            r1 = r3
            goto L85
        L84:
            r1 = r6
        L85:
            if (r1 == 0) goto L8d
            r10.setText(r15)
            r10.setVisibility(r6)
        L8d:
            android.view.View r15 = r4.findViewById(r7)
            android.widget.FrameLayout r15 = (android.widget.FrameLayout) r15
            int r4 = r15.getChildCount()
            if (r4 > 0) goto L9a
            r3 = r6
        L9a:
            if (r3 == 0) goto Ld7
            int r4 = r15.getChildCount()
            r7 = r6
        La1:
            if (r7 >= r4) goto Ld4
            android.view.View r10 = r15.getChildAt(r7)
            r15.removeView(r10)
            r8.addView(r10)
            if (r7 != 0) goto Lbe
            int r11 = r10.getPaddingStart()
            int r13 = r10.getPaddingEnd()
            int r14 = r10.getPaddingBottom()
            r10.setPaddingRelative(r11, r6, r13, r14)
        Lbe:
            int r11 = r4 + (-1)
            if (r7 != r11) goto Ld1
            int r11 = r10.getPaddingStart()
            int r13 = r10.getPaddingTop()
            int r14 = r10.getPaddingEnd()
            r10.setPaddingRelative(r11, r13, r14, r6)
        Ld1:
            int r7 = r7 + 1
            goto La1
        Ld4:
            r9.setVisibility(r6)
        Ld7:
            if (r1 == 0) goto Lde
            if (r3 == 0) goto Lde
            r12.setVisibility(r6)
        Lde:
            r0.addView(r5, r2)
            return
        Le2:
            r3 = r11
            goto Le5
        Le4:
            r3 = r7
        Le5:
            android.content.res.Resources r15 = r15.getResources()
            java.lang.String r15 = r15.getResourceName(r3)
            java.lang.String r0 = "Missing required view with ID: "
            java.lang.String r15 = r0.concat(r15)
            t3p.q(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lpi.a():void");
    }
}
