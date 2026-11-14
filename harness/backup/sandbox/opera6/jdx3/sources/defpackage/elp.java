package defpackage;

import android.util.Size;

/* loaded from: classes.dex */
public abstract class elp {
    public static final ftj a = new ftj(15);

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(android.content.Context r7, java.io.File r8, int r9, int r10, nt5 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.ykp
            if (r0 == 0) goto L14
            r0 = r11
            ykp r0 = (defpackage.ykp) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.u = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ykp r0 = new ykp
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.t
            px5 r0 = px5.a
            int r1 = r6.u
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            ybh.y(r11)     // Catch: java.lang.Throwable -> L49
            goto L44
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r7)
            r7 = 0
            return r7
        L30:
            ybh.y(r11)
            p0i r11 = t0i.b     // Catch: java.lang.Throwable -> L49
            ftj r1 = defpackage.elp.a     // Catch: java.lang.Throwable -> L49
            r6.u = r2     // Catch: java.lang.Throwable -> L49
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            java.lang.Object r11 = r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L49
            if (r11 != r0) goto L44
            return r0
        L44:
            android.graphics.drawable.Drawable r11 = (android.graphics.drawable.Drawable) r11     // Catch: java.lang.Throwable -> L49
            p0i r7 = t0i.b     // Catch: java.lang.Throwable -> L49
            return r11
        L49:
            r0 = move-exception
            r7 = r0
            p0i r8 = t0i.b
            q0i r8 = new q0i
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elp.a(android.content.Context, java.io.File, int, int, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(java.io.File r7, nt5 r8) {
        /*
            java.lang.String r0 = "Can't decode image bounds: "
            boolean r1 = r8 instanceof defpackage.zkp
            if (r1 == 0) goto L15
            r1 = r8
            zkp r1 = (defpackage.zkp) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.v = r2
            goto L1a
        L15:
            zkp r1 = new zkp
            r1.<init>(r8)
        L1a:
            java.lang.Object r8 = r1.u
            px5 r2 = px5.a
            int r3 = r1.v
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L32
            if (r3 != r5) goto L2c
            java.io.File r7 = r1.t
            ybh.y(r8)     // Catch: java.lang.Throwable -> L79
            goto L4d
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r7)
            return r4
        L32:
            ybh.y(r8)
            p0i r8 = t0i.b     // Catch: java.lang.Throwable -> L79
            r1.t = r7     // Catch: java.lang.Throwable -> L79
            r1.v = r5     // Catch: java.lang.Throwable -> L79
            cv6 r8 = bb7.a     // Catch: java.lang.Throwable -> L79
            mr6 r8 = mr6.b     // Catch: java.lang.Throwable -> L79
            eno r3 = new eno     // Catch: java.lang.Throwable -> L79
            r6 = 14
            r3.<init>(r6, r4, r7)     // Catch: java.lang.Throwable -> L79
            java.lang.Object r8 = na2.Z(r8, r3, r1)     // Catch: java.lang.Throwable -> L79
            if (r8 != r2) goto L4d
            return r2
        L4d:
            r1 = r8
            android.util.Size r1 = (android.util.Size) r1     // Catch: java.lang.Throwable -> L79
            int r2 = r1.getWidth()     // Catch: java.lang.Throwable -> L79
            if (r2 <= 0) goto L5c
            int r1 = r1.getHeight()     // Catch: java.lang.Throwable -> L79
            if (r1 > 0) goto L5d
        L5c:
            r5 = 0
        L5d:
            if (r5 == 0) goto L60
            r4 = r8
        L60:
            android.util.Size r4 = (android.util.Size) r4     // Catch: java.lang.Throwable -> L79
            if (r4 == 0) goto L67
            p0i r7 = t0i.b     // Catch: java.lang.Throwable -> L79
            return r4
        L67:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L79
            r1.append(r7)     // Catch: java.lang.Throwable -> L79
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L79
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L79
            throw r8     // Catch: java.lang.Throwable -> L79
        L79:
            r7 = move-exception
            p0i r8 = t0i.b
            q0i r8 = new q0i
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elp.b(java.io.File, nt5):java.lang.Object");
    }

    public static final Size c(Size size, int i, int i2) {
        int width = size.getWidth();
        int height = size.getHeight();
        int iMin = Math.min(width, i);
        int iMin2 = Math.min(height, i2);
        return iMin * height >= width * iMin2 ? new Size(iMin, ((r1 + width) - 1) / width) : new Size(((r2 + height) - 1) / height, iMin2);
    }
}
