package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class xgo implements View.OnTouchListener {
    public final g94 a;
    public final u2p b;
    public final fio c;
    public long d;
    public float e;
    public float f;

    public xgo(g94 g94Var, u2p u2pVar, fio fioVar) {
        this.a = g94Var;
        this.b = u2pVar;
        this.c = fioVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (bwg.g(r14.getContext(), r13.c, r15, r13.d, r11, r12) != false) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            r13 = this;
            int r0 = r15.getActionMasked()
            g94 r1 = r13.a
            r2 = 2
            r3 = 0
            fio r4 = r13.c
            r5 = 1
            if (r0 == 0) goto L61
            if (r0 == r5) goto L32
            if (r0 != r2) goto L60
            android.content.Context r6 = r14.getContext()
            long r9 = r13.d
            float r11 = r13.e
            float r12 = r13.f
            fio r7 = r13.c
            r8 = r15
            boolean r13 = bwg.g(r6, r7, r8, r9, r11, r12)
            if (r13 != 0) goto L60
            byte r13 = r4.a
            android.view.ViewParent r14 = r14.getParent()
            if (r14 == 0) goto L60
            if (r13 != r2) goto L60
            r14.requestDisallowInterceptTouchEvent(r3)
            return r3
        L32:
            r8 = r15
            float r11 = r13.e
            float r12 = r13.f
            r15 = 0
            r13.e = r15
            r13.f = r15
            u2p r15 = r13.b
            if (r15 == 0) goto L4e
            float r0 = r8.getX()
            double r6 = (double) r0
            float r0 = r8.getY()
            double r9 = (double) r0
            r15.f = r6
            r15.g = r9
        L4e:
            byte r15 = r4.a
            if (r15 != r2) goto L60
            android.content.Context r6 = r14.getContext()
            fio r7 = r13.c
            long r9 = r13.d
            boolean r13 = bwg.g(r6, r7, r8, r9, r11, r12)
            if (r13 != 0) goto L8b
        L60:
            return r3
        L61:
            r8 = r15
            float r15 = r8.getX()
            r13.e = r15
            float r15 = r8.getY()
            r13.f = r15
            byte r15 = r4.a
            android.view.ViewParent r0 = r14.getParent()
            if (r0 == 0) goto L7b
            if (r15 != r2) goto L7b
            r0.requestDisallowInterceptTouchEvent(r5)
        L7b:
            long r6 = android.os.SystemClock.elapsedRealtime()
            r13.d = r6
            byte r13 = r4.a
            r15 = 4
            if (r13 != r15) goto L8f
            byte r13 = r4.e
            r13 = r13 & r15
            if (r13 == 0) goto L8f
        L8b:
            r1.l(r14)
            return r5
        L8f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xgo.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
