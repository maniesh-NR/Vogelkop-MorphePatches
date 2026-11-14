package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* loaded from: classes.dex */
public final class n2n extends TouchDelegate {
    public final Rect a;
    public final View b;
    public boolean c;

    public n2n(Rect rect, View view) {
        super(rect, view);
        this.a = rect;
        this.b = view;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            float r0 = r6.getX()
            int r0 = (int) r0
            float r1 = r6.getY()
            int r1 = (int) r1
            int r2 = r6.getAction()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L22
            if (r2 == r3) goto L1f
            r3 = 2
            if (r2 == r3) goto L1f
            r3 = 3
            if (r2 != r3) goto L2d
            boolean r3 = r5.c
            r5.c = r4
            goto L2e
        L1f:
            boolean r3 = r5.c
            goto L2e
        L22:
            android.graphics.Rect r2 = r5.a
            boolean r2 = r2.contains(r0, r1)
            if (r2 == 0) goto L2d
            r5.c = r3
            goto L2e
        L2d:
            r3 = r4
        L2e:
            if (r3 == 0) goto L46
            android.view.View r5 = r5.b
            int r2 = r5.getLeft()
            int r0 = r0 - r2
            float r0 = (float) r0
            int r2 = r5.getTop()
            int r1 = r1 - r2
            float r1 = (float) r1
            r6.setLocation(r0, r1)
            boolean r5 = r5.dispatchTouchEvent(r6)
            return r5
        L46:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n2n.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
