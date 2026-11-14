package defpackage;

import android.text.TextPaint;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class xkm {
    public static final TextPaint a = new TextPaint();
    public static final List b = Arrays.asList("⚕️", "♀️", "♂️", "♟️", "♾️");

    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.lang.String r14) {
        /*
            boolean r0 = androidx.emoji2.emojipicker.EmojiPickerView.l
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L93
            xx7 r0 = defpackage.xx7.a()
            boolean r3 = r0.f()
            java.lang.String r4 = "Not initialized yet"
            jpo.n(r4, r3)
            java.lang.String r3 = "sequence cannot be null"
            jpo.m(r14, r3)
            sx7 r0 = r0.d
            boolean r3 = r0.d
            if (r3 != 0) goto L93
            g77 r0 = r0.a
            zy7 r3 = new zy7
            java.lang.Object r0 = r0.b
            cyd r0 = (defpackage.cyd) r0
            r3.<init>(r0)
            int r0 = r14.length()
            r4 = r2
            r5 = r4
        L2f:
            r6 = 65535(0xffff, double:3.23786E-319)
            r8 = 32
            r9 = 2147483647(0x7fffffff, float:NaN)
            if (r4 >= r0) goto L84
            int r10 = java.lang.Character.codePointAt(r14, r4)
            int r11 = r3.a(r10)
            if (r11 == r1) goto L7e
            r13 = 2
            if (r11 == r13) goto L6d
            r6 = 3
            if (r11 == r6) goto L4b
        L49:
            r10 = r2
            goto L2f
        L4b:
            kam r6 = r3.e
            vxd r6 = r6.a()
            r7 = 10
            int r7 = r6.a(r7)
            if (r7 == 0) goto L66
            java.lang.Object r8 = r6.d
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            int r6 = r6.a
            int r7 = r7 + r6
            short r6 = r8.getShort(r7)
            r12 = r6
            goto L67
        L66:
            r12 = r2
        L67:
            if (r12 > r9) goto L6b
            int r5 = r5 + 1
        L6b:
            r10 = r1
            goto L2f
        L6d:
            int r10 = java.lang.Character.charCount(r10)
            int r4 = r4 + r10
            boolean r10 = r3.b()
            if (r10 == 0) goto L2f
            long r11 = r3.d
            long r11 = r11 >>> r8
            long r11 = r11 & r6
            int r12 = (int) r11
            goto L2f
        L7e:
            int r6 = java.lang.Character.charCount(r10)
            int r4 = r4 + r6
            goto L49
        L84:
            if (r5 != 0) goto L93
            boolean r0 = r3.c()
            if (r0 == 0) goto L93
            long r3 = r3.d
            long r3 = r3 >>> r8
            long r3 = r3 & r6
            int r0 = (int) r3
            if (r0 <= r9) goto Lbc
        L93:
            android.text.TextPaint r0 = defpackage.xkm.a
            boolean r3 = r0.hasGlyph(r14)
            r4 = 0
            if (r3 == 0) goto L9e
            r3 = r14
            goto L9f
        L9e:
            r3 = r4
        L9f:
            if (r3 != 0) goto Lb9
            java.util.List r3 = defpackage.xkm.b
            boolean r3 = r3.contains(r14)
            if (r3 == 0) goto Lba
            java.lang.String r3 = "️"
            java.lang.String r5 = ""
            java.lang.String r14 = kotlin.text.c.o(r14, r3, r5)
            boolean r0 = r0.hasGlyph(r14)
            if (r0 == 0) goto Lba
            r4 = r14
            goto Lba
        Lb9:
            r4 = r3
        Lba:
            if (r4 == 0) goto Lbd
        Lbc:
            return r1
        Lbd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkm.a(java.lang.String):boolean");
    }
}
