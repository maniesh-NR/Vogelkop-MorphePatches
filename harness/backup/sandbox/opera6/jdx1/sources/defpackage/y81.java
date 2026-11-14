package defpackage;

import android.graphics.Canvas;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class y81 {
    public final c91 a;
    public final int b;
    public final long c;
    public final ljl d;
    public final CharSequence e;
    public final float f;
    public final List g;

    /* JADX WARN: Removed duplicated region for block: B:103:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y81(defpackage.c91 r23, int r24, int r25, long r26) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y81.<init>(c91, int, int, long):void");
    }

    public final ljl a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        pgg pggVar;
        float fC = c();
        c91 c91Var = this.a;
        ib1 ib1Var = c91Var.g;
        byte b = c91Var.l;
        w2c w2cVar = c91Var.i;
        ikl iklVar = c91Var.b;
        z81 z81Var = a91.a;
        dhg dhgVar = iklVar.c;
        return new ljl(charSequence, fC, ib1Var, i, truncateAt, b, (dhgVar == null || (pggVar = dhgVar.b) == null) ? false : pggVar.a, i3, i5, i6, i7, i4, i2, w2cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0096 A[EDGE_INSN: B:39:0x0096->B:31:0x0096 BREAK  A[LOOP:0: B:23:0x0076->B:26:0x007c], EDGE_INSN: B:31:0x0096->B:33:0x00a6 BREAK  A[LOOP:1: B:28:0x008a->B:30:0x008e]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(defpackage.voh r11, int r12, gpk r13) {
        /*
            r10 = this;
            android.graphics.RectF r4 = defpackage.xvg.v(r11)
            r11 = 1
            r8 = 0
            if (r12 == 0) goto Lc
            if (r12 != r11) goto Lc
            r12 = r11
            goto Ld
        Lc:
            r12 = r8
        Ld:
            whf r6 = new whf
            r0 = 6
            r6.<init>(r13, r0)
            ljl r0 = r10.d
            android.text.Layout r1 = r0.f
            int r10 = android.os.Build.VERSION.SDK_INT
            r13 = 34
            if (r10 < r13) goto L23
            int[] r10 = defpackage.g8.t(r0, r4, r12, r6)
            goto La6
        L23:
            x79 r2 = r0.c()
            if (r12 != r11) goto L38
            rgh r10 = new rgh
            java.lang.CharSequence r12 = r1.getText()
            i1 r13 = r0.l()
            r10.<init>(r12, r13)
            r5 = r10
            goto L46
        L38:
            java.lang.CharSequence r10 = r1.getText()
            android.text.TextPaint r12 = r0.a
            bpd r13 = new bpd
            r3 = 19
            r13.<init>(r10, r12, r3)
            r5 = r13
        L46:
            float r10 = r4.top
            int r10 = (int) r10
            int r10 = r1.getLineForVertical(r10)
            float r12 = r4.top
            float r13 = r0.e(r10)
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 <= 0) goto L5d
            int r10 = r10 + 1
            int r12 = r0.g
            if (r10 >= r12) goto L96
        L5d:
            r3 = r10
            float r10 = r4.bottom
            int r10 = (int) r10
            int r10 = r1.getLineForVertical(r10)
            if (r10 != 0) goto L71
            float r12 = r4.bottom
            float r13 = r0.i(r8)
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 < 0) goto L96
        L71:
            r7 = 1
            int r12 = defpackage.mfh.r(r0, r1, r2, r3, r4, r5, r6, r7)
        L76:
            r13 = r3
            r9 = -1
            if (r12 != r9) goto L84
            if (r13 >= r10) goto L96
            int r3 = r13 + 1
            r7 = 1
            int r12 = defpackage.mfh.r(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L76
        L84:
            r7 = 0
            r3 = r10
            int r10 = defpackage.mfh.r(r0, r1, r2, r3, r4, r5, r6, r7)
        L8a:
            if (r10 != r9) goto L98
            if (r13 >= r3) goto L96
            int r3 = r3 + (-1)
            r7 = 0
            int r10 = defpackage.mfh.r(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L8a
        L96:
            r10 = 0
            goto La6
        L98:
            int r12 = r12 + r11
            int r12 = r5.g(r12)
            int r10 = r10 - r11
            int r10 = r5.h(r10)
            int[] r10 = new int[]{r12, r10}
        La6:
            if (r10 != 0) goto Lab
            long r10 = defpackage.xjl.b
            return r10
        Lab:
            r12 = r10[r8]
            r10 = r10[r11]
            long r10 = defpackage.upj.c(r12, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y81.b(voh, int, gpk):long");
    }

    public final float c() {
        return yo5.h(this.c);
    }

    public final void d(sh4 sh4Var) {
        Canvas canvas = b31.a;
        Canvas canvas2 = ((a31) sh4Var).a;
        ljl ljlVar = this.d;
        if (ljlVar.d) {
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, c(), this.f);
        }
        int i = ljlVar.h;
        if (canvas2.getClipBounds(ljlVar.o)) {
            if (i != 0) {
                canvas2.translate(0.0f, i);
            }
            ThreadLocal threadLocal = pjl.a;
            Object relVar = threadLocal.get();
            if (relVar == null) {
                relVar = new rel();
                threadLocal.set(relVar);
            }
            rel relVar2 = (rel) relVar;
            relVar2.a = canvas2;
            try {
                ljlVar.f.draw(relVar2);
                if (i != 0) {
                    canvas2.translate(0.0f, (-1.0f) * i);
                }
            } finally {
                relVar2.a = null;
            }
        }
        if (ljlVar.d) {
            canvas2.restore();
        }
    }

    public final void e(sh4 sh4Var, long j, jaj jajVar, bgl bglVar, nk7 nk7Var) {
        ib1 ib1Var = this.a.g;
        byte b = ib1Var.c;
        ib1Var.d(j);
        ib1Var.f(jajVar);
        ib1Var.g(bglVar);
        ib1Var.e(nk7Var);
        ib1Var.b(3);
        new r2(1, this, y81.class, "paint", "paint(Landroidx/compose/ui/graphics/Canvas;)V", 0, (byte) 7).invoke(sh4Var);
        ib1Var.b(b);
    }

    public final void f(sh4 sh4Var, dz3 dz3Var, float f, jaj jajVar, bgl bglVar, nk7 nk7Var) {
        ib1 ib1Var = this.a.g;
        byte b = ib1Var.c;
        ib1Var.c(dz3Var, (Float.floatToRawIntBits(c()) << 32) | (Float.floatToRawIntBits(this.f) & 4294967295L), f);
        ib1Var.f(jajVar);
        ib1Var.g(bglVar);
        ib1Var.e(nk7Var);
        ib1Var.b(3);
        new r2(1, this, y81.class, "paint", "paint(Landroidx/compose/ui/graphics/Canvas;)V", 0, (byte) 8).invoke(sh4Var);
        ib1Var.b(b);
    }
}
