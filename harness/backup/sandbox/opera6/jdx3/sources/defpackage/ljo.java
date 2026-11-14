package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class ljo {
    public static final HashMap a = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[Catch: all -> 0x0082, IOException -> 0x0087, LOOP:0: B:11:0x003e->B:13:0x0044, LOOP_END, TryCatch #2 {IOException -> 0x0087, all -> 0x0082, blocks: (B:3:0x0004, B:9:0x0027, B:10:0x002d, B:11:0x003e, B:13:0x0044, B:15:0x0068, B:17:0x0072, B:18:0x007b, B:19:0x007e, B:8:0x0022), top: B:27:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068 A[Catch: all -> 0x0082, IOException -> 0x0087, TryCatch #2 {IOException -> 0x0087, all -> 0x0082, blocks: (B:3:0x0004, B:9:0x0027, B:10:0x002d, B:11:0x003e, B:13:0x0044, B:15:0x0068, B:17:0x0072, B:18:0x007b, B:19:0x007e, B:8:0x0022), top: B:27:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.net.URLConnection r7, defpackage.jro r8) {
        /*
            byte r0 = r8.a
            r1 = 1
            r2 = 0
            r7.setDoInput(r1)     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            r3 = 10000(0x2710, float:1.4013E-41)
            r7.setConnectTimeout(r3)     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            r7.setReadTimeout(r3)     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            r3 = r7
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            r3.setInstanceFollowRedirects(r1)     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            java.lang.String r8 = r8.c
            r3 = 11
            r4 = 12
            if (r0 != r3) goto L20
            java.lang.String r1 = "GET"
            goto L27
        L20:
            if (r0 != r4) goto L2d
            r7.setDoOutput(r1)     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            java.lang.String r1 = "POST"
        L27:
            r3 = r7
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            r3.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
        L2d:
            java.lang.String r1 = "User-Agent"
            java.lang.String r3 = defpackage.g1p.g     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            java.util.HashMap r5 = defpackage.ljo.a     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            r5.put(r1, r3)     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            java.util.Set r1 = r5.entrySet()     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
        L3e:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            if (r3 == 0) goto L66
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            java.lang.Object r5 = r3.getKey()     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            java.lang.Object r6 = r3.getValue()     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            r7.setRequestProperty(r5, r6)     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            java.lang.Object r5 = r3.getKey()     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            goto L3e
        L66:
            if (r0 != r4) goto L7e
            java.io.OutputStream r2 = r7.getOutputStream()     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            if (r0 != 0) goto L7b
            java.lang.String r0 = "UTF-8"
            byte[] r8 = r8.getBytes(r0)     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            r2.write(r8)     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
        L7b:
            r2.flush()     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
        L7e:
            r7.connect()     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L87
            goto L87
        L82:
            r7 = move-exception
            r9h.l(r2)
            throw r7
        L87:
            r9h.l(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ljo.a(java.net.URLConnection, jro):void");
    }
}
