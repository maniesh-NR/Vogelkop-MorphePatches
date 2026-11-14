package defpackage;

/* loaded from: classes.dex */
public final class fg3 implements qyh {
    public static final mrf b = mrf.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final mrf c = new mrf("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, mrf.e);
    public final jl6 a;

    public fg3(jl6 jl6Var) {
        this.a = jl6Var;
    }

    @Override // defpackage.qyh
    public final int j(trf trfVar) {
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(java.lang.Object r6, java.io.File r7, defpackage.trf r8) throws java.lang.Throwable {
        /*
            r5 = this;
            kyh r6 = (defpackage.kyh) r6
            jl6 r5 = r5.a
            java.lang.Object r6 = r6.get()
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            mrf r0 = defpackage.fg3.c
            java.lang.Object r1 = r8.c(r0)
            android.graphics.Bitmap$CompressFormat r1 = (android.graphics.Bitmap.CompressFormat) r1
            if (r1 != 0) goto L1f
            boolean r1 = r6.hasAlpha()
            if (r1 == 0) goto L1d
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            goto L1f
        L1d:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
        L1f:
            r6.getWidth()
            r6.getHeight()
            android.os.SystemClock.elapsedRealtimeNanos()
            mrf r2 = defpackage.fg3.b
            java.lang.Object r2 = r8.c(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L56
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L56
            t04 r3 = new t04     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            r6.compress(r1, r2, r3)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L56
            r3.close()     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L56
            r3.close()     // Catch: java.io.IOException -> L48 java.lang.Throwable -> L5c
        L48:
            r5 = 1
            goto L5f
        L4a:
            r5 = move-exception
            r3 = r4
            goto L50
        L4d:
            r3 = r4
            goto L56
        L4f:
            r5 = move-exception
        L50:
            if (r3 == 0) goto L55
            r3.close()     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L5c
        L55:
            throw r5
        L56:
            if (r3 == 0) goto L5e
            r3.close()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            goto L5e
        L5c:
            r5 = move-exception
            throw r5
        L5e:
            r5 = 0
        L5f:
            java.lang.String r7 = "BitmapEncoder"
            r2 = 2
            boolean r7 = android.util.Log.isLoggable(r7, r2)
            if (r7 == 0) goto L7b
            java.util.Objects.toString(r1)
            defpackage.rm5.x(r6)
            android.os.SystemClock.elapsedRealtimeNanos()
            java.lang.Object r7 = r8.c(r0)
            java.util.Objects.toString(r7)
            r6.hasAlpha()
        L7b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fg3.l(java.lang.Object, java.io.File, trf):boolean");
    }
}
