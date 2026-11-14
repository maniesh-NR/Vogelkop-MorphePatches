package ads_mobile_sdk;

import android.content.Context;

/* loaded from: classes.dex */
public final class ya1 {
    public final Context a;
    public xa1 b;

    public ya1(Context context) {
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(ads_mobile_sdk.e7 r10) {
        /*
            r9 = this;
            android.content.Context r0 = r9.a
            if (r0 == 0) goto La5
            ads_mobile_sdk.xa1 r1 = new ads_mobile_sdk.xa1
            r1.<init>(r0)
            byte r0 = r1.a
            r2 = 2
            r3 = 0
            if (r0 != r2) goto L1c
            hkp r4 = r1.d
            if (r4 == 0) goto L1c
            ads_mobile_sdk.wa1 r4 = r1.e
            if (r4 == 0) goto L1c
            r10.a(r3)
            goto La2
        L1c:
            r4 = 3
            r5 = 1
            if (r0 != r5) goto L25
            r10.a(r4)
            goto La2
        L25:
            if (r0 != r4) goto L2c
            r10.a(r4)
            goto La2
        L2c:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r4 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            java.lang.String r6 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            java.lang.String r7 = "com.android.vending"
            r4.<init>(r7, r6)
            r0.setComponent(r4)
            android.content.Context r4 = r1.b
            android.content.pm.PackageManager r6 = r4.getPackageManager()
            java.util.List r6 = r6.queryIntentServices(r0, r3)
            if (r6 == 0) goto L9d
            boolean r8 = r6.isEmpty()
            if (r8 != 0) goto L9d
            java.lang.Object r6 = r6.get(r3)
            android.content.pm.ResolveInfo r6 = (android.content.pm.ResolveInfo) r6
            android.content.pm.ServiceInfo r6 = r6.serviceInfo
            if (r6 == 0) goto L9d
            java.lang.String r8 = r6.packageName
            java.lang.String r6 = r6.name
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L97
            if (r6 == 0) goto L97
            android.content.pm.PackageManager r6 = r4.getPackageManager()
            r8 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L97
            int r6 = r6.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L97
            r7 = 80837300(0x4d17ab4, float:4.924835E-36)
            if (r6 < r7) goto L97
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            ads_mobile_sdk.wa1 r0 = new ads_mobile_sdk.wa1
            r0.<init>(r1, r10)
            r1.e = r0
            boolean r0 = r4.bindService(r2, r0, r5)     // Catch: java.lang.SecurityException -> L90
            if (r0 != 0) goto La2
            r1.a = r3
            r10.a(r5)
            goto La2
        L90:
            r1.a = r3
            r0 = 4
            r10.a(r0)
            goto La2
        L97:
            r1.a = r3
            r10.a(r2)
            goto La2
        L9d:
            r1.a = r3
            r10.a(r2)
        La2:
            r9.b = r1
            return
        La5:
            java.lang.String r9 = "Please provide a valid Context."
            qp2.o(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ya1.a(ads_mobile_sdk.e7):void");
    }
}
