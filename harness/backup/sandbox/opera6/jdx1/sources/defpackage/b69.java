package defpackage;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class b69 implements f2m {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(hub.a);

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    @Override // defpackage.f2m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.kyh a(android.content.Context r3, defpackage.kyh r4, int r5, int r6) {
        /*
            r2 = this;
            boolean r2 = defpackage.rm5.E(r5, r6)
            if (r2 == 0) goto Lb4
            com.bumptech.glide.a r2 = com.bumptech.glide.a.b(r3)
            zg3 r2 = r2.a
            java.lang.Object r3 = r4.get()
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r0) goto L1a
            int r5 = r3.getWidth()
        L1a:
            if (r6 != r0) goto L20
            int r6 = r3.getHeight()
        L20:
            android.graphics.Paint r0 = defpackage.h2m.a
            int r0 = r3.getWidth()
            if (r0 != r5) goto L2e
            int r0 = r3.getHeight()
            if (r0 == r6) goto L60
        L2e:
            float r5 = (float) r5
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r6 = (float) r6
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r6 = r6 / r0
            float r5 = java.lang.Math.min(r5, r6)
            int r6 = r3.getWidth()
            float r6 = (float) r6
            float r6 = r6 * r5
            int r6 = java.lang.Math.round(r6)
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r0 = r0 * r5
            int r0 = java.lang.Math.round(r0)
            int r1 = r3.getWidth()
            if (r1 != r6) goto L62
            int r6 = r3.getHeight()
            if (r6 != r0) goto L62
        L60:
            r6 = r3
            goto La8
        L62:
            int r6 = r3.getWidth()
            float r6 = (float) r6
            float r6 = r6 * r5
            int r6 = (int) r6
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r0 = r0 * r5
            int r0 = (int) r0
            android.graphics.Bitmap$Config r1 = r3.getConfig()
            if (r1 == 0) goto L7b
            android.graphics.Bitmap$Config r1 = r3.getConfig()
            goto L7d
        L7b:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
        L7d:
            android.graphics.Bitmap r6 = r2.g(r6, r0, r1)
            boolean r0 = r3.hasAlpha()
            r6.setHasAlpha(r0)
            java.lang.String r0 = "TransformationUtils"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L9d
            r3.getWidth()
            r3.getHeight()
            r6.getWidth()
            r6.getHeight()
        L9d:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r0.setScale(r5, r5)
            defpackage.h2m.a(r3, r6, r0)
        La8:
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto Laf
            return r4
        Laf:
            ah3 r2 = defpackage.ah3.c(r2, r6)
            return r2
        Lb4:
            java.lang.String r2 = " or height: "
            java.lang.String r3 = " less than or equal to zero and not Target.SIZE_ORIGINAL"
            java.lang.String r4 = "Cannot apply transformation on width: "
            java.lang.String r2 = fki.o(r5, r6, r4, r2, r3)
            qp2.o(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b69.a(android.content.Context, kyh, int, int):kyh");
    }

    @Override // defpackage.hub
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.hub
    public final boolean equals(Object obj) {
        return obj instanceof b69;
    }

    @Override // defpackage.hub
    public final int hashCode() {
        return 1572326941;
    }
}
