package ads_mobile_sdk;

import android.content.Context;

/* loaded from: classes.dex */
public final class ba2 extends oa3 {
    public final Context d;
    public final int e;
    public final i41 f;

    public ba2(Context context, int i, i41 i41Var) {
        super(null, 2);
        this.d = context;
        this.e = i;
        this.f = i41Var;
    }

    @Override // defpackage.wdp
    /* renamed from: a */
    public final lw0 mo15a() {
        return lw0.PACKAGE_INFO;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:8:0x005d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // defpackage.wdp
    public final java.lang.Object d(mt5 r15) {
        /*
            r14 = this;
            ads_mobile_sdk.hv0 r15 = new ads_mobile_sdk.hv0
            ads_mobile_sdk.aa2 r0 = new ads_mobile_sdk.aa2
            android.content.Context r1 = r14.d
            r2 = r1
            java.lang.String r1 = r2.getPackageName()
            android.content.pm.PackageManager r3 = r2.getPackageManager()
            java.lang.String r4 = r2.getPackageName()
            r5 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r5)
            java.lang.String r3 = r3.versionName
            r4 = r2
            r2 = r3
            java.lang.Integer r3 = new java.lang.Integer
            int r5 = r14.e
            r3.<init>(r5)
            android.content.pm.PackageManager r6 = r4.getPackageManager()
            android.content.pm.ApplicationInfo r7 = r4.getApplicationInfo()
            java.lang.CharSequence r6 = r6.getApplicationLabel(r7)
            java.lang.String r6 = r6.toString()
            r7 = 30
            r8 = 0
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L5d
            if (r9 < r7) goto L4e
            android.content.pm.PackageManager r9 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L5d
            android.content.pm.ApplicationInfo r10 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r10 = r10.packageName     // Catch: java.lang.Throwable -> L5d
            android.content.pm.InstallSourceInfo r9 = r9.getInstallSourceInfo(r10)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r9 = r9.getInstallingPackageName()     // Catch: java.lang.Throwable -> L5d
            goto L5e
        L4e:
            android.content.pm.PackageManager r9 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L5d
            android.content.pm.ApplicationInfo r10 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r10 = r10.packageName     // Catch: java.lang.Throwable -> L5d
            java.lang.String r9 = r9.getInstallerPackageName(r10)     // Catch: java.lang.Throwable -> L5d
            goto L5e
        L5d:
            r9 = r8
        L5e:
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L75
            if (r10 < r7) goto L75
            android.content.pm.PackageManager r7 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L75
            android.content.pm.ApplicationInfo r10 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L75
            java.lang.String r10 = r10.packageName     // Catch: java.lang.Throwable -> L75
            android.content.pm.InstallSourceInfo r7 = r7.getInstallSourceInfo(r10)     // Catch: java.lang.Throwable -> L75
            java.lang.String r7 = r7.getInitiatingPackageName()     // Catch: java.lang.Throwable -> L75
            goto L76
        L75:
            r7 = r8
        L76:
            java.lang.String r4 = r4.getPackageName()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            java.lang.String r5 = ".android."
            r10.append(r5)
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            dvj r5 = ads_mobile_sdk.ax0.f
            ads_mobile_sdk.i41 r14 = r14.f
            x77 r5 = r14.a()
            java.lang.String r10 = ""
            if (r5 == 0) goto La0
            java.lang.Object r5 = r5.b
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto La1
        La0:
            r5 = r10
        La1:
            kotlin.text.Regex r11 = ads_mobile_sdk.ax0.h
            ucd r5 = kotlin.text.Regex.d(r11, r5)
            if (r5 == 0) goto Lb5
            e5 r5 = r5.c
            r12 = 1
            kotlin.text.MatchGroup r5 = r5.g(r12)
            if (r5 == 0) goto Lb5
            java.lang.String r5 = r5.a
            goto Lb6
        Lb5:
            r5 = r8
        Lb6:
            x77 r14 = r14.a()
            if (r14 == 0) goto Lc3
            java.lang.Object r14 = r14.b
            java.lang.String r14 = (java.lang.String) r14
            if (r14 == 0) goto Lc3
            r10 = r14
        Lc3:
            ucd r14 = kotlin.text.Regex.d(r11, r10)
            if (r14 == 0) goto Ld4
            e5 r14 = r14.c
            r10 = 2
            kotlin.text.MatchGroup r14 = r14.g(r10)
            if (r14 == 0) goto Ld4
            java.lang.String r8 = r14.a
        Ld4:
            r13 = r7
            r7 = r4
            r4 = r6
            r6 = r13
            r13 = r8
            r8 = r5
            r5 = r9
            r9 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r15.<init>(r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ba2.d(mt5):java.lang.Object");
    }
}
