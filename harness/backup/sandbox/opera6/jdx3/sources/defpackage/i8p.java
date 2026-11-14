package defpackage;

import android.content.BroadcastReceiver;

/* loaded from: classes.dex */
public final class i8p extends BroadcastReceiver {
    public boolean a;
    public final /* synthetic */ t8p b;

    public i8p(t8p t8pVar) {
        this.b = t8pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r5, android.content.Intent r6) throws java.lang.IllegalStateException, java.io.IOException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            r4 = this;
            t8p r5 = r4.b
            ami r0 = r5.c
            java.lang.String r6 = r6.getAction()
            if (r6 == 0) goto L50
            euo r1 = r5.u
            int r1 = r1.a
            if (r1 == 0) goto L50
            java.lang.String r1 = "android.intent.action.SCREEN_OFF"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L29
            euo r1 = r5.u
            int r2 = r1.a
            r3 = 3
            if (r2 != r3) goto L29
            r1.a()
            r0.a(r5)
            r5 = 1
        L26:
            r4.a = r5
            return
        L29:
            java.lang.String r1 = "android.intent.action.USER_PRESENT"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L50
            boolean r6 = r4.a
            if (r6 == 0) goto L50
            euo r6 = r5.u
            int r1 = r6.a
            r2 = 4
            if (r1 == r2) goto L3f
            r2 = 7
            if (r1 != r2) goto L50
        L3f:
            r6.b()
            g2p r6 = r5.I
            r0.b(r5, r6)
            wtm r5 = r5.x
            r6 = 22
            r5.a(r6)
            r5 = 0
            goto L26
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i8p.onReceive(android.content.Context, android.content.Intent):void");
    }
}
