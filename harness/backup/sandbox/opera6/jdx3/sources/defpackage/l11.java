package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class l11 implements hxj {
    public final View a;
    public final byte b;
    public final int c;
    public final int d;
    public final boolean e;
    public final k11 f;

    public /* synthetic */ l11(int i, int i2, int i3, View view) {
        this(view, i, i2, 0, false, k11.a);
    }

    public l11(View view, int i, int i2) {
        this(i, i2, 56, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l11(View view, int i, int i2, int i3, boolean z, k11 k11Var) {
        this.a = view;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = k11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.hxj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ixj c() {
        /*
            r10 = this;
            ixj r0 = new ixj
            android.view.View r1 = r10.a
            android.view.View r2 = r1.getRootView()
            int r2 = r2.getWidth()
            boolean r3 = cs5.W(r1)
            boolean r4 = r1.isAttachedToWindow()
            r5 = 0
            if (r4 == 0) goto L28
            boolean r4 = defpackage.q9n.x(r1)
            if (r4 == 0) goto L28
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            boolean r6 = r1.getGlobalVisibleRect(r4)
            if (r6 != 0) goto L29
        L28:
            r4 = r5
        L29:
            if (r4 == 0) goto L66
            k11 r6 = r10.f
            int r6 = r6.ordinal()
            int r7 = r10.c
            if (r6 == 0) goto L53
            r8 = 1
            if (r6 == r8) goto L4b
            r8 = 2
            if (r6 != r8) goto L47
            if (r3 == 0) goto L42
            int r3 = r4.right
        L3f:
            int r6 = r3 + (-1)
            goto L5a
        L42:
            int r6 = r4.left
        L44:
            int r3 = r6 + 1
            goto L5a
        L47:
            h9o.p()
            return r5
        L4b:
            if (r3 == 0) goto L50
            int r6 = r4.left
            goto L44
        L50:
            int r3 = r4.right
            goto L3f
        L53:
            int r3 = r4.left
            int r6 = r3 + r7
            int r3 = r4.right
            int r3 = r3 - r7
        L5a:
            android.graphics.Rect r8 = new android.graphics.Rect
            int r9 = r4.top
            int r9 = r9 + r7
            int r4 = r4.bottom
            int r4 = r4 - r7
            r8.<init>(r6, r9, r3, r4)
            goto L67
        L66:
            r8 = r5
        L67:
            boolean r6 = cs5.W(r1)
            boolean r3 = r1.isAttachedToWindow()
            if (r3 == 0) goto L83
            boolean r3 = defpackage.q9n.x(r1)
            if (r3 == 0) goto L83
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            boolean r1 = r1.getGlobalVisibleRect(r3)
            if (r1 == 0) goto L83
            r5 = r3
        L83:
            int r3 = r10.d
            r4 = 0
            r1 = r2
            r2 = r8
            r8 = r5
            byte r5 = r10.b
            boolean r7 = r10.e
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l11.c():ixj");
    }
}
