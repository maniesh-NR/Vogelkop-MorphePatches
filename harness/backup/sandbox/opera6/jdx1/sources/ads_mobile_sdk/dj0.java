package ads_mobile_sdk;

import android.content.Context;

/* loaded from: classes.dex */
public final class dj0 {
    public final Context a;
    public final ia3 b;
    public final String c;
    public final long d;
    public final long e;

    public dj0(Context context, l7 l7Var, ia3 ia3Var) {
        this.a = context;
        this.c = l7Var.D();
        this.d = l7Var.B();
        this.e = l7Var.F();
        this.b = ia3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.HashMap r12) {
        /*
            r11 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r1 = r11.c
            java.lang.String r2 = "v"
            r12.put(r2, r1)
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>()
            java.lang.String r2 = "t"
            r12.put(r2, r1)
            java.lang.String r1 = "E"
            r2 = -1
            r4 = 0
            java.lang.String r5 = "gs"
            java.lang.Object r5 = r12.get(r5)     // Catch: java.lang.Throwable -> L9f
            com.google.common.util.concurrent.ListenableFuture r5 = (com.google.common.util.concurrent.ListenableFuture) r5     // Catch: java.lang.Throwable -> L9f
            if (r5 == 0) goto L9f
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L9f
            r7 = 31
            if (r6 < r7) goto L2e
            boolean r6 = r5.isDone()     // Catch: java.lang.Throwable -> L9f
            if (r6 == 0) goto L9f
        L2e:
            long r6 = r11.d     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r5 = r5.get(r6, r0)     // Catch: java.lang.Throwable -> L9f
            ads_mobile_sdk.pd r5 = (ads_mobile_sdk.pd) r5     // Catch: java.lang.Throwable -> L9f
            if (r5 == 0) goto L9f
            boolean r6 = r5.v()     // Catch: java.lang.Throwable -> L9f
            if (r6 == 0) goto L81
            ads_mobile_sdk.he r6 = r5.r()     // Catch: java.lang.Throwable -> L9f
            boolean r7 = r6.r()     // Catch: java.lang.Throwable -> L9f
            if (r7 == 0) goto L5c
            ads_mobile_sdk.hr r7 = r6.o()     // Catch: java.lang.Throwable -> L9f
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.ISO_8859_1     // Catch: java.lang.Throwable -> L9f
            int r8 = r7.size()     // Catch: java.lang.Throwable -> L9f
            if (r8 != 0) goto L57
            java.lang.String r7 = ""
            goto L5d
        L57:
            java.lang.String r7 = r7.mo2a()     // Catch: java.lang.Throwable -> L9f
            goto L5d
        L5c:
            r7 = r4
        L5d:
            boolean r8 = r6.t()     // Catch: java.lang.Throwable -> L7e
            if (r8 == 0) goto L6c
            long r8 = r6.q()     // Catch: java.lang.Throwable -> L7e
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L7e
            goto L6d
        L6c:
            r8 = r4
        L6d:
            boolean r9 = r6.s()     // Catch: java.lang.Throwable -> L7a
            if (r9 == 0) goto L77
            java.lang.String r4 = r6.p()     // Catch: java.lang.Throwable -> L7a
        L77:
            r6 = r4
            r4 = r7
            goto L83
        L7a:
            r6 = r4
        L7b:
            r4 = r7
        L7c:
            r7 = r1
            goto La2
        L7e:
            r6 = r4
            r8 = r6
            goto L7b
        L81:
            r6 = r4
            r8 = r6
        L83:
            java.lang.String r7 = r5.p()     // Catch: java.lang.Throwable -> L7c
            int r7 = r7.length()     // Catch: java.lang.Throwable -> L7c
            r9 = 1
            if (r7 <= r9) goto L93
            java.lang.String r7 = r5.p()     // Catch: java.lang.Throwable -> L7c
            goto L94
        L93:
            r7 = r1
        L94:
            boolean r9 = r5.t()     // Catch: java.lang.Throwable -> La2
            if (r9 == 0) goto La2
            long r2 = r5.o()     // Catch: java.lang.Throwable -> La2
            goto La2
        L9f:
            r7 = r1
            r6 = r4
            r8 = r6
        La2:
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto Lc1
            java.lang.String r1 = "ai"
            java.lang.Object r1 = r12.get(r1)     // Catch: java.lang.Throwable -> Lc1
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1     // Catch: java.lang.Throwable -> Lc1
            if (r1 == 0) goto Lc1
            long r9 = r11.e     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r11 = r1.get(r9, r0)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> Lc1
            boolean r0 = defpackage.p37.y0(r11)     // Catch: java.lang.Throwable -> Lc1
            if (r0 != 0) goto Lc1
            r7 = r11
        Lc1:
            java.lang.String r11 = "int"
            r12.put(r11, r7)
            if (r4 == 0) goto Lcd
            java.lang.String r11 = "att"
            r12.put(r11, r4)
        Lcd:
            if (r8 == 0) goto Ld4
            java.lang.String r11 = "attts"
            r12.put(r11, r8)
        Ld4:
            if (r6 == 0) goto Ldb
            java.lang.String r11 = "attkid"
            r12.put(r11, r6)
        Ldb:
            java.lang.Long r11 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "gv"
            r12.put(r0, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dj0.a(java.util.HashMap):void");
    }
}
