package defpackage;

/* loaded from: classes.dex */
public final class ebk implements jj6 {
    public final /* synthetic */ byte a;
    public final Object b;

    public ebk() {
        this.a = (byte) 1;
        this.b = cvk.d;
    }

    public ebk(v0j v0jVar) {
        this.a = (byte) 0;
        this.b = v0jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    @Override // defpackage.jj6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.lj6 a(defpackage.hwj r7, defpackage.vrf r8) throws android.system.ErrnoException {
        /*
            r6 = this;
            byte r0 = r6.a
            java.lang.Object r6 = r6.b
            r1 = 0
            switch(r0) {
                case 0: goto L36;
                default: goto L8;
            }
        L8:
            java.lang.String r0 = r7.b
            oza r7 = r7.a
            java.lang.String r2 = "image/svg+xml"
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r2)
            if (r0 != 0) goto L2e
            v04 r0 = r7.source()
            g54 r2 = defpackage.gj6.b
            boolean r2 = r0.J(r2)
            if (r2 == 0) goto L35
            g54 r2 = defpackage.gj6.a
            r3 = 1024(0x400, double:5.06E-321)
            long r2 = r0.B1(r2, r3)
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L35
        L2e:
            cvk r1 = new cvk
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r1.<init>(r7, r8, r6)
        L35:
            return r1
        L36:
            android.graphics.Bitmap$Config r0 = defpackage.eza.a(r8)
            android.content.Context r2 = r8.a
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            if (r0 == r3) goto L44
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.HARDWARE
            if (r0 != r3) goto Lc9
        L44:
            oza r0 = r7.a
            g29 r3 = r0.getFileSystem()
            g29 r4 = g29.SYSTEM
            if (r3 != r4) goto L5d
            w6g r3 = r0.n1()
            if (r3 == 0) goto L5d
            java.io.File r0 = r3.toFile()
            android.graphics.ImageDecoder$Source r0 = android.graphics.ImageDecoder.createSource(r0)
            goto Lbe
        L5d:
            x7d r0 = r0.getMetadata()
            boolean r3 = r0 instanceof defpackage.yb2
            if (r3 == 0) goto L72
            android.content.res.AssetManager r2 = r2.getAssets()
            yb2 r0 = (defpackage.yb2) r0
            java.lang.String r0 = r0.r
            android.graphics.ImageDecoder$Source r0 = android.graphics.ImageDecoder.createSource(r2, r0)
            goto Lbe
        L72:
            boolean r3 = r0 instanceof defpackage.uq5
            if (r3 == 0) goto L92
            uq5 r0 = (defpackage.uq5) r0     // Catch: android.system.ErrnoException -> Lbd
            android.content.res.AssetFileDescriptor r0 = r0.r     // Catch: android.system.ErrnoException -> Lbd
            java.io.FileDescriptor r2 = r0.getFileDescriptor()     // Catch: android.system.ErrnoException -> Lbd
            long r3 = r0.getStartOffset()     // Catch: android.system.ErrnoException -> Lbd
            int r5 = android.system.OsConstants.SEEK_SET     // Catch: android.system.ErrnoException -> Lbd
            android.system.Os.lseek(r2, r3, r5)     // Catch: android.system.ErrnoException -> Lbd
            ce2 r2 = new ce2     // Catch: android.system.ErrnoException -> Lbd
            r3 = 7
            r2.<init>(r0, r3)     // Catch: android.system.ErrnoException -> Lbd
            android.graphics.ImageDecoder$Source r0 = android.graphics.ImageDecoder.createSource(r2)     // Catch: android.system.ErrnoException -> Lbd
            goto Lbe
        L92:
            boolean r3 = r0 instanceof defpackage.fzh
            if (r3 == 0) goto Lb0
            r3 = r0
            fzh r3 = (defpackage.fzh) r3
            java.lang.String r4 = r3.r
            java.lang.String r5 = r2.getPackageName()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lb0
            android.content.res.Resources r0 = r2.getResources()
            int r2 = r3.s
            android.graphics.ImageDecoder$Source r0 = android.graphics.ImageDecoder.createSource(r0, r2)
            goto Lbe
        Lb0:
            boolean r2 = r0 instanceof defpackage.f34
            if (r2 == 0) goto Lbd
            f34 r0 = (defpackage.f34) r0
            java.nio.ByteBuffer r0 = r0.r
            android.graphics.ImageDecoder$Source r0 = android.graphics.ImageDecoder.createSource(r0)
            goto Lbe
        Lbd:
            r0 = r1
        Lbe:
            if (r0 == 0) goto Lc9
            jg3 r1 = new jg3
            oza r7 = r7.a
            v0j r6 = (defpackage.v0j) r6
            r1.<init>(r0, r7, r8, r6)
        Lc9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebk.a(hwj, vrf):lj6");
    }
}
