package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import com.appsflyer.internal.AFj1xSDK;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFj1zSDK extends AFi1dSDK {

    @NotNull
    private final Runnable component3;

    @NotNull
    private final AFj1ySDK getCurrencyIso4217Code;

    @NotNull
    private final AFc1pSDK getMediationNetwork;

    @NotNull
    private final ExecutorService getMonetizationNetwork;
    private String hashCode;

    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] getMonetizationNetwork;

        static {
            int[] iArr = new int[AFj1ySDK.values().length];
            try {
                iArr[AFj1ySDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1ySDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1ySDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getMonetizationNetwork = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AFj1zSDK(@NotNull AFc1pSDK aFc1pSDK, @NotNull ExecutorService executorService, @NotNull AFj1ySDK aFj1ySDK, @NotNull Runnable runnable, @NotNull Runnable runnable2) {
        String str;
        int i = AFj1xSDK.AFa1ySDK.getMonetizationNetwork[aFj1ySDK.ordinal()];
        if (i == 1) {
            str = "facebook";
        } else if (i == 2) {
            str = "instagram";
        } else {
            if (i != 3) {
                h9o.p();
                throw null;
            }
            str = "facebook_lite";
        }
        super("app", str, aFc1pSDK, runnable);
        this.getMediationNetwork = aFc1pSDK;
        this.getMonetizationNetwork = executorService;
        this.getCurrencyIso4217Code = aFj1ySDK;
        this.component3 = runnable2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[PHI: r0
      0x008c: PHI (r0v7 java.lang.String) = (r0v6 java.lang.String), (r0v13 java.lang.String), (r0v19 java.lang.String) binds: [B:14:0x003c, B:23:0x0063, B:32:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean AFAdRevenueData(android.content.Context r12) {
        /*
            r11 = this;
            boolean r0 = r11.getRevenue()
            r1 = 0
            if (r0 != 0) goto L14
            com.appsflyer.AFLogger r2 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r3 = com.appsflyer.internal.AFg1cSDK.META_REFERRER
            r6 = 4
            r7 = 0
            java.lang.String r4 = "Referrer collection disallowed by counter."
            r5 = 0
            com.appsflyer.internal.AFg1gSDK.d$default(r2, r3, r4, r5, r6, r7)
            return r1
        L14:
            com.appsflyer.internal.AFc1pSDK r0 = r11.getMediationNetwork
            java.lang.String r2 = "com.facebook.sdk.ApplicationId"
            java.lang.String r0 = r0.getCurrencyIso4217Code(r2)
            java.lang.String r2 = "fb"
            r3 = 0
            if (r0 == 0) goto L26
            java.lang.String r0 = kotlin.text.StringsKt.T(r0, r2)
            goto L27
        L26:
            r0 = r3
        L27:
            if (r0 == 0) goto L2f
            int r4 = r0.length()
            if (r4 != 0) goto L3c
        L2f:
            com.appsflyer.AFLogger r5 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r6 = com.appsflyer.internal.AFg1cSDK.META_REFERRER
            r9 = 4
            r10 = 0
            java.lang.String r7 = "Facebook app id Manifest metadata is not found."
            r8 = 0
            com.appsflyer.internal.AFg1gSDK.d$default(r5, r6, r7, r8, r9, r10)
            r0 = r3
        L3c:
            if (r0 != 0) goto L8c
            com.appsflyer.internal.AFc1pSDK r0 = r11.getMediationNetwork
            java.lang.String r4 = "facebook_application_id"
            java.lang.String r0 = r0.getRevenue(r4)
            if (r0 == 0) goto L4d
            java.lang.String r0 = kotlin.text.StringsKt.T(r0, r2)
            goto L4e
        L4d:
            r0 = r3
        L4e:
            if (r0 == 0) goto L56
            int r4 = r0.length()
            if (r4 != 0) goto L63
        L56:
            com.appsflyer.AFLogger r5 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r6 = com.appsflyer.internal.AFg1cSDK.META_REFERRER
            r9 = 4
            r10 = 0
            java.lang.String r7 = "Facebook app id string resource is not found."
            r8 = 0
            com.appsflyer.internal.AFg1gSDK.d$default(r5, r6, r7, r8, r9, r10)
            r0 = r3
        L63:
            if (r0 != 0) goto L8c
            com.appsflyer.internal.AFc1pSDK r0 = r11.getMediationNetwork
            java.lang.String r4 = "com.appsflyer.FacebookApplicationId"
            java.lang.String r0 = r0.getCurrencyIso4217Code(r4)
            if (r0 == 0) goto L74
            java.lang.String r0 = kotlin.text.StringsKt.T(r0, r2)
            goto L75
        L74:
            r0 = r3
        L75:
            if (r0 == 0) goto L7d
            int r2 = r0.length()
            if (r2 != 0) goto L8a
        L7d:
            com.appsflyer.AFLogger r4 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r5 = com.appsflyer.internal.AFg1cSDK.META_REFERRER
            r8 = 4
            r9 = 0
            java.lang.String r6 = "AF Facebook app id Manifest metadata is not found."
            r7 = 0
            com.appsflyer.internal.AFg1gSDK.d$default(r4, r5, r6, r7, r8, r9)
            r0 = r3
        L8a:
            if (r0 == 0) goto L8d
        L8c:
            r3 = r0
        L8d:
            r11.hashCode = r3
            if (r3 != 0) goto L9e
            com.appsflyer.AFLogger r4 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r5 = com.appsflyer.internal.AFg1cSDK.META_REFERRER
            r8 = 4
            r9 = 0
            java.lang.String r6 = "Referrer collection disallowed by missing Facebook app id."
            r7 = 0
            com.appsflyer.internal.AFg1gSDK.d$default(r4, r5, r6, r7, r8, r9)
            return r1
        L9e:
            boolean r11 = r11.getCurrencyIso4217Code(r12)
            if (r11 != 0) goto Lb1
            com.appsflyer.AFLogger r2 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r3 = com.appsflyer.internal.AFg1cSDK.META_REFERRER
            r6 = 4
            r7 = 0
            java.lang.String r4 = "Referrer collection disallowed by missing content providers."
            r5 = 0
            com.appsflyer.internal.AFg1gSDK.d$default(r2, r3, r4, r5, r6, r7)
            return r1
        Lb1:
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1zSDK.AFAdRevenueData(android.content.Context):boolean");
    }

    private static boolean component2(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    private final boolean getCurrencyIso4217Code(Context context) {
        int i = AFa1vSDK.getMonetizationNetwork[this.getCurrencyIso4217Code.ordinal()];
        if (i == 1) {
            return getMediationNetwork(context);
        }
        if (i == 2) {
            return getMonetizationNetwork(context);
        }
        if (i == 3) {
            return component2(context);
        }
        h9o.p();
        return false;
    }

    private static boolean getMediationNetwork(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ec A[Catch: all -> 0x0219, TRY_LEAVE, TryCatch #2 {all -> 0x0219, blocks: (B:3:0x002c, B:8:0x0041, B:10:0x0047, B:24:0x00ec, B:11:0x0068, B:12:0x0078, B:13:0x007d, B:14:0x007e, B:16:0x0084, B:17:0x00a4, B:18:0x00b4, B:20:0x00ba, B:21:0x00da), top: B:95:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fd A[Catch: all -> 0x0210, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0210, blocks: (B:31:0x010e, B:33:0x0114, B:35:0x011b, B:38:0x013d, B:40:0x016f, B:43:0x017b, B:44:0x018a, B:46:0x0190, B:49:0x019f, B:51:0x01c0, B:61:0x01dd, B:57:0x01d2, B:58:0x01d7, B:36:0x0120, B:65:0x01fd), top: B:92:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024f A[DONT_GENERATE, PHI: r10
      0x024f: PHI (r10v4 android.content.ContentProviderClient) = 
      (r10v3 android.content.ContentProviderClient)
      (r10v10 android.content.ContentProviderClient)
      (r10v10 android.content.ContentProviderClient)
     binds: [B:81:0x024d, B:63:0x01fa, B:68:0x020d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void getMonetizationNetwork(com.appsflyer.internal.AFj1zSDK r27, android.content.Context r28) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1zSDK.getMonetizationNetwork(com.appsflyer.internal.AFj1zSDK, android.content.Context):void");
    }

    private static boolean getMonetizationNetwork(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    @SuppressLint({"NewApi"})
    public final void getRevenue(@NotNull Context context) {
        if (AFAdRevenueData(context)) {
            this.getMonetizationNetwork.execute(new h(this, context, (byte) 4));
        } else {
            this.component3.run();
        }
    }
}
