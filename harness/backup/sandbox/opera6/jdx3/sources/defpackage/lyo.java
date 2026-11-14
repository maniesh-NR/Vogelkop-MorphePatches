package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class lyo {
    public final /* synthetic */ dzo a;

    public /* synthetic */ lyo(dzo dzoVar) {
        this.a = dzoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "operaadx://FINISHED"
            boolean r0 = r0.equalsIgnoreCase(r7)
            dzo r6 = r6.a
            r1 = 1
            if (r0 == 0) goto L25
            boolean r7 = r6.j
            if (r7 != 0) goto L8a
            r6.e = r1
            z4k r7 = r6.h
            if (r7 == 0) goto L22
            java.lang.Object r7 = r7.b
            lxo r7 = (defpackage.lxo) r7
            java.lang.Object r7 = r7.b
            dn r7 = (defpackage.dn) r7
            if (r7 == 0) goto L22
            r7.i()
        L22:
            r6.j = r1
            return r1
        L25:
            nyo r0 = r6.c
            fio r2 = r6.d
            if (r2 == 0) goto L33
            boolean r3 = r2.f
            if (r3 == 0) goto L33
            int r2 = r2.d
            if (r2 == r1) goto L46
        L33:
            long r2 = r6.g
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L8a
            r4 = 2000(0x7d0, double:9.88E-321)
            long r2 = r2 + r4
            long r4 = android.os.SystemClock.uptimeMillis()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L8a
        L46:
            bl r2 = r6.a
            if (r2 == 0) goto L50
            boolean r2 = r2.k(r7)
            if (r2 != 0) goto L8a
        L50:
            android.content.Intent r2 = new android.content.Intent
            android.net.Uri r7 = android.net.Uri.parse(r7)
            java.lang.String r3 = "android.intent.action.VIEW"
            r2.<init>(r3, r7)
            android.content.Context r7 = r0.getContext()
            boolean r7 = defpackage.n5p.b(r7, r2)
            if (r7 == 0) goto L88
            r7 = 268435456(0x10000000, float:2.524355E-29)
            r2.addFlags(r7)
            java.lang.ref.WeakReference r7 = r6.b
            if (r7 == 0) goto L80
            java.lang.Object r7 = r7.get()
            if (r7 == 0) goto L80
            java.lang.ref.WeakReference r6 = r6.b
            java.lang.Object r6 = r6.get()
            android.app.Activity r6 = (android.app.Activity) r6
            r6.startActivity(r2)
            return r1
        L80:
            android.content.Context r6 = r0.getContext()
            r6.startActivity(r2)
            return r1
        L88:
            r6 = 0
            return r6
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyo.a(java.lang.String):boolean");
    }
}
