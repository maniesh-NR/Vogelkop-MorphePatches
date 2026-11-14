package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class pp6 {
    public final Context a;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.bp r4) {
        /*
            r3 = this;
            int r0 = r4.a
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto L68
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 >= r1) goto L68
            java.lang.Object r4 = r4.b
            gzd r4 = (defpackage.gzd) r4
            java.lang.String r4 = r4.h()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L68
            rne r0 = new rne
            android.content.Context r3 = r3.a
            r0.<init>(r3)
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r3.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 != 0) goto L30
            java.lang.String r0 = "UNKNOWN"
            goto L59
        L30:
            int r1 = r0.getType()
            if (r1 != 0) goto L55
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 <= r2) goto L41
            int r1 = r0.getSubtype()
            goto L4d
        L41:
            java.lang.String r1 = "phone"
            java.lang.Object r1 = r3.getSystemService(r1)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            int r1 = r1.getNetworkType()
        L4d:
            java.lang.String r1 = defpackage.aik.l(r1)
            if (r1 == 0) goto L55
            r0 = r1
            goto L59
        L55:
            java.lang.String r0 = r0.getTypeName()
        L59:
            lcp.r = r0
            sne r0 = new sne     // Catch: java.util.concurrent.RejectedExecutionException -> L68
            r0.<init>(r4, r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L68
            java.util.concurrent.ThreadPoolExecutor r3 = he2.c     // Catch: java.util.concurrent.RejectedExecutionException -> L68
            r4 = 0
            java.lang.Void[] r4 = new java.lang.Void[r4]     // Catch: java.util.concurrent.RejectedExecutionException -> L68
            r0.executeOnExecutor(r3, r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L68
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pp6.a(bp):void");
    }
}
