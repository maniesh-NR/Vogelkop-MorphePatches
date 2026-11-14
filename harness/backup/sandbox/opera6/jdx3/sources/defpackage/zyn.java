package defpackage;

import android.os.AsyncTask;

/* loaded from: classes.dex */
public final class zyn extends AsyncTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public zyn(int i, String str) {
        this.a = i;
        this.b = str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:43|3)|(6:47|4|41|5|(1:14)(3:9|45|10)|15)|37|32|33|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c A[EXC_TOP_SPLITTER, PHI: r0
      0x005c: PHI (r0v5 java.net.Socket) = (r0v4 java.net.Socket), (r0v6 java.net.Socket) binds: [B:31:0x005a, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doInBackground(java.lang.Object[] r5) throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.Void[] r5 = (java.lang.Void[]) r5
            r5 = 0
            java.net.Socket r0 = new java.net.Socket     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L51
            java.lang.String r1 = "127.0.0.1"
            int r2 = r4.a     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L51
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L51
            java.io.InputStream r1 = r0.getInputStream()     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3f
            int r2 = r1.read()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            r3 = 255(0xff, float:3.57E-43)
            if (r2 != r3) goto L2f
            int r2 = r1.read()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            if (r2 != 0) goto L2f
            java.io.OutputStream r2 = r0.getOutputStream()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            java.lang.String r4 = r4.b     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L54
            byte[] r4 = r4.getBytes()     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L54
            r2.write(r4)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L54
            goto L30
        L2c:
            r4 = move-exception
        L2d:
            r5 = r1
            goto L45
        L2f:
            r2 = r5
        L30:
            xvg.l(r1)
            xvg.l(r2)
            goto L5c
        L37:
            r4 = move-exception
            r2 = r5
            goto L2d
        L3a:
            r2 = r5
            goto L54
        L3c:
            r4 = move-exception
            r2 = r5
            goto L45
        L3f:
            r1 = r5
        L40:
            r2 = r1
            goto L54
        L42:
            r4 = move-exception
            r0 = r5
            r2 = r0
        L45:
            xvg.l(r5)
            xvg.l(r2)
            if (r0 == 0) goto L50
            r0.close()     // Catch: java.io.IOException -> L50
        L50:
            throw r4
        L51:
            r0 = r5
            r1 = r0
            goto L40
        L54:
            xvg.l(r1)
            xvg.l(r2)
            if (r0 == 0) goto L5f
        L5c:
            r0.close()     // Catch: java.io.IOException -> L5f
        L5f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zyn.doInBackground(java.lang.Object[]):java.lang.Object");
    }
}
