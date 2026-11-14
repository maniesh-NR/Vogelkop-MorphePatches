package defpackage;

import android.view.ViewTreeObserver;
import android.widget.TextView;

/* loaded from: classes.dex */
public final /* synthetic */ class xkl implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ cgh b;
    public final /* synthetic */ edf c;

    public /* synthetic */ xkl(TextView textView, cgh cghVar, edf edfVar) {
        this.a = textView;
        this.b = cghVar;
        this.c = edfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            r9 = this;
            android.widget.TextView r0 = r9.a
            android.text.Layout r1 = r0.getLayout()
            r2 = 3
            r3 = 0
            if (r1 != 0) goto Le
            android.text.StaticLayout r1 = na2.G(r0, r3, r2)
        Le:
            cgh r4 = r9.b
            boolean r5 = r4 instanceof defpackage.ckl
            edf r9 = r9.c
            r6 = 1
            if (r5 == 0) goto L20
            int r0 = r1.getLineCount()
            ddf r9 = r9.b(r0)
            goto L7d
        L20:
            boolean r5 = r4 instanceof defpackage.dkl
            if (r5 == 0) goto L83
            int r5 = r1.getLineCount()
            int r5 = r5 - r6
            int r7 = r1.getEllipsisCount(r5)
            if (r7 <= 0) goto L75
            dkl r4 = (defpackage.dkl) r4
            zyk r7 = r4.b
            java.lang.Object r8 = r7.getValue()
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L75
            int r8 = r1.getLineStart(r5)
            int r5 = r1.getEllipsisStart(r5)
            int r5 = r5 + r8
            java.lang.String r4 = r4.a
            fr r8 = defpackage.opm.a(r4)
            if (r8 == 0) goto L4f
            int r4 = r8.c
            goto L53
        L4f:
            int r4 = r4.length()
        L53:
            if (r5 >= r4) goto L6c
            java.lang.Object r1 = r7.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r0.setText(r1)
            android.text.StaticLayout r0 = na2.G(r0, r3, r2)
            int r0 = r0.getLineCount()
            r9.b(r0)
            ddf r9 = defpackage.ddf.b
            goto L7d
        L6c:
            int r0 = r1.getLineCount()
            ddf r9 = r9.b(r0)
            goto L7d
        L75:
            int r0 = r1.getLineCount()
            ddf r9 = r9.b(r0)
        L7d:
            ddf r0 = defpackage.ddf.a
            if (r9 != r0) goto L82
            return r6
        L82:
            return r3
        L83:
            h9o.p()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkl.onPreDraw():boolean");
    }
}
