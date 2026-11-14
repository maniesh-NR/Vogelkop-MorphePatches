package defpackage;

import android.text.method.LinkMovementMethod;
import android.view.GestureDetector;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class vwj extends LinkMovementMethod {
    public agc a;
    public GestureDetector b;
    public final yk4 c;
    public final zt d;

    public vwj() {
        this.c = null;
        this.d = null;
    }

    public vwj(yk4 yk4Var, zt ztVar) {
        this.c = yk4Var;
        this.d = ztVar;
    }

    public static void a(TextView textView) {
        phj.Z(textView);
        if (textView.getMovementMethod() instanceof vwj) {
            return;
        }
        textView.setMovementMethod(new vwj());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.widget.TextView r8, android.text.Spannable r9, android.view.MotionEvent r10) {
        /*
            r7 = this;
            int r0 = r10.getAction()
            float r1 = r10.getX()
            int r1 = (int) r1
            int r2 = r8.getScrollX()
            int r2 = r2 + r1
            int r1 = r8.getTotalPaddingLeft()
            int r2 = r2 - r1
            float r1 = r10.getY()
            int r1 = (int) r1
            int r3 = r8.getScrollY()
            int r3 = r3 + r1
            int r1 = r8.getTotalPaddingTop()
            int r3 = r3 - r1
            r1 = 0
            if (r3 < 0) goto L4f
            int r4 = r8.getHeight()
            if (r3 >= r4) goto L4f
            android.text.Layout r4 = r8.getLayout()
            int r3 = r4.getLineForVertical(r3)
            float r5 = r4.getLineLeft(r3)
            int r5 = (int) r5
            float r6 = r4.getLineRight(r3)
            int r6 = (int) r6
            if (r2 < r5) goto L4f
            if (r2 > r6) goto L4f
            float r2 = (float) r2
            int r2 = r4.getOffsetForHorizontal(r3, r2)
            java.lang.Class<agc> r3 = defpackage.agc.class
            java.lang.Object[] r9 = r9.getSpans(r2, r2, r3)
            agc[] r9 = (defpackage.agc[]) r9
            goto L50
        L4f:
            r9 = r1
        L50:
            r2 = 0
            if (r9 == 0) goto L59
            int r3 = r9.length
            if (r3 <= 0) goto L59
            r9 = r9[r2]
            goto L5a
        L59:
            r9 = r1
        L5a:
            android.view.GestureDetector r3 = r7.b
            r4 = 1
            if (r3 != 0) goto L6f
            android.view.GestureDetector r3 = new android.view.GestureDetector
            android.content.Context r5 = r8.getContext()
            sgh r6 = new sgh
            r6.<init>(r7, r8, r4)
            r3.<init>(r5, r6)
            r7.b = r3
        L6f:
            if (r0 != 0) goto L7f
            boolean r5 = r9 instanceof defpackage.p0d
            if (r5 != 0) goto L7b
            zt r5 = r7.d
            if (r5 != 0) goto L7b
            r5 = r2
            goto L7c
        L7b:
            r5 = r4
        L7c:
            r3.setIsLongpressEnabled(r5)
        L7f:
            r3.onTouchEvent(r10)
            if (r0 == r4) goto La0
            r10 = 3
            if (r0 == r10) goto La0
            if (r0 == 0) goto L8c
            r10 = 2
            if (r0 != r10) goto La4
        L8c:
            agc r10 = r7.a
            if (r9 == r10) goto La4
            r8.invalidate()
            agc r8 = r7.a
            if (r8 == 0) goto L99
            r8.a = r2
        L99:
            r7.a = r9
            if (r9 == 0) goto La4
            r9.a = r4
            return r4
        La0:
            agc r9 = r7.a
            if (r9 != 0) goto La5
        La4:
            return r4
        La5:
            r8.invalidate()
            agc r8 = r7.a
            if (r8 == 0) goto Lae
            r8.a = r2
        Lae:
            r7.a = r1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vwj.onTouchEvent(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }
}
