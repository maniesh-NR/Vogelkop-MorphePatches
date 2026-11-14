package defpackage;

import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class n66 implements q5n, bcf {
    public final /* synthetic */ o66 a;

    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final g3o l0(android.view.View r7, g3o r8) {
        /*
            r6 = this;
            d3o r7 = r8.a
            o66 r6 = r6.a
            int r0 = r6.r
            r0 = r0 & 4
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L16
            r9b r0 = r7.l()
            int r0 = r0.b
            if (r0 == 0) goto L16
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            int r3 = r6.r
            r3 = r3 & 8
            if (r3 == 0) goto L27
            r9b r3 = r7.l()
            int r3 = r3.d
            if (r3 == 0) goto L27
            r3 = r2
            goto L28
        L27:
            r3 = r1
        L28:
            int r4 = r6.r
            r4 = r4 & r2
            if (r4 == 0) goto L37
            r9b r4 = r7.l()
            int r4 = r4.a
            if (r4 == 0) goto L37
            r4 = r2
            goto L38
        L37:
            r4 = r1
        L38:
            int r5 = r6.r
            r5 = r5 & 2
            if (r5 == 0) goto L48
            r9b r5 = r7.l()
            int r5 = r5.c
            if (r5 == 0) goto L48
            r5 = r2
            goto L49
        L48:
            r5 = r1
        L49:
            if (r0 != 0) goto L57
            if (r3 == 0) goto L6e
            int r0 = r6.n
            r9b r3 = r7.l()
            int r3 = r3.d
            int r0 = r0 - r3
            goto L60
        L57:
            int r0 = r6.n
            r9b r3 = r7.l()
            int r3 = r3.b
            int r0 = r0 + r3
        L60:
            l56 r3 = r6.f
            int r3 = r3.j()
            if (r0 == r3) goto L6e
            l56 r1 = r6.f
            r1.g(r0)
            r1 = r2
        L6e:
            if (r4 != 0) goto L7c
            if (r5 == 0) goto L8e
            int r0 = r6.p
            r9b r7 = r7.l()
            int r7 = r7.c
            int r0 = r0 - r7
            goto L85
        L7c:
            int r0 = r6.p
            r9b r7 = r7.l()
            int r7 = r7.a
            int r0 = r0 + r7
        L85:
            l56 r7 = r6.f
            int r3 = r7.f
            if (r0 == r3) goto L8e
            r7.f = r0
            goto L8f
        L8e:
            r2 = r1
        L8f:
            if (r2 == 0) goto L96
            l56 r6 = r6.f
            r6.show()
        L96:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n66.l0(android.view.View, g3o):g3o");
    }

    public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
        return this.a.onKey(view, keyEvent.getKeyCode(), keyEvent);
    }
}
