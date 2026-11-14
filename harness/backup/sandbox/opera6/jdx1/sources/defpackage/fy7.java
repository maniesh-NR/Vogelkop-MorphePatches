package defpackage;

import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class fy7 implements InputFilter {
    public final TextView a;
    public ey7 b;

    public fy7(TextView textView) {
        this.a = textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r1 != 3) goto L24;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence filter(java.lang.CharSequence r4, int r5, int r6, android.text.Spanned r7, int r8, int r9) {
        /*
            r3 = this;
            android.widget.TextView r0 = r3.a
            boolean r1 = r0.isInEditMode()
            if (r1 != 0) goto L45
            xx7 r1 = defpackage.xx7.a()
            int r1 = r1.c()
            if (r1 == 0) goto L46
            r2 = 1
            if (r1 == r2) goto L19
            r5 = 3
            if (r1 == r5) goto L46
            goto L45
        L19:
            if (r9 != 0) goto L29
            if (r8 != 0) goto L29
            int r3 = r7.length()
            if (r3 != 0) goto L29
            java.lang.CharSequence r3 = r0.getText()
            if (r4 == r3) goto L45
        L29:
            if (r4 == 0) goto L45
            if (r5 != 0) goto L33
            int r3 = r4.length()
            if (r6 == r3) goto L37
        L33:
            java.lang.CharSequence r4 = r4.subSequence(r5, r6)
        L37:
            xx7 r3 = defpackage.xx7.a()
            int r5 = r4.length()
            r6 = 0
            java.lang.CharSequence r3 = r3.j(r6, r5, r6, r4)
            return r3
        L45:
            return r4
        L46:
            xx7 r5 = defpackage.xx7.a()
            ey7 r6 = r3.b
            if (r6 != 0) goto L55
            ey7 r6 = new ey7
            r6.<init>(r0, r3)
            r3.b = r6
        L55:
            r5.l(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy7.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }
}
