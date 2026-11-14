package com.google.android.gms.ads;

import ads_mobile_sdk.qr0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J3\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/gms/ads/MediationUtils;", "", "Landroid/content/Context;", "context", "Lcom/google/android/gms/ads/AdSize;", "originalAdSize", "", "potentials", "findClosestSize", "(Landroid/content/Context;Lcom/google/android/gms/ads/AdSize;Ljava/util/List;)Lcom/google/android/gms/ads/AdSize;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MediationUtils {

    @NotNull
    public static final MediationUtils INSTANCE = new MediationUtils();
    private static qr0 a;

    private MediationUtils() {
    }

    public static void a(qr0 qr0Var) {
        a = qr0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.google.android.gms.ads.AdSize findClosestSize(@org.jetbrains.annotations.NotNull android.content.Context r11, com.google.android.gms.ads.AdSize r12, java.util.List<com.google.android.gms.ads.AdSize> r13) {
        /*
            ads_mobile_sdk.fo r0 = ads_mobile_sdk.fo.a$10
            r1 = 0
            if (r13 == 0) goto Lc8
            if (r12 == 0) goto Lc8
            boolean r2 = r12.isInlineAdaptiveBanner()
            if (r2 != 0) goto L30
            android.content.res.Resources r2 = r11.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            int r3 = r12.getWidthInPixels(r11)
            float r3 = (float) r3
            float r3 = r3 / r2
            int r3 = zed.b(r3)
            int r11 = r12.getHeightInPixels(r11)
            float r11 = (float) r11
            float r11 = r11 / r2
            int r11 = zed.b(r11)
            com.google.android.gms.ads.AdSize r12 = new com.google.android.gms.ads.AdSize
            r12.<init>(r3, r11)
        L30:
            java.util.Iterator r11 = r13.iterator()
        L34:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto Lc8
            java.lang.Object r13 = r11.next()
            com.google.android.gms.ads.AdSize r13 = (com.google.android.gms.ads.AdSize) r13
            com.google.android.gms.ads.MediationUtils r2 = com.google.android.gms.ads.MediationUtils.INSTANCE
            r2.getClass()
            if (r13 == 0) goto L34
            int r2 = r12.getWidth()
            int r3 = r13.getWidth()
            int r4 = r12.getHeight()
            int r5 = r13.getHeight()
            double r6 = (double) r2
            ads_mobile_sdk.qr0 r8 = com.google.android.gms.ads.MediationUtils.a
            if (r8 == 0) goto L71
            r9 = 1045220557(0x3e4ccccd, float:0.2)
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            java.lang.String r10 = "gads:mediation_min_width_ratio"
            java.lang.Object r8 = r8.a(r10, r9, r0)
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            double r8 = (double) r8
            goto L73
        L71:
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
        L73:
            double r6 = r6 * r8
            double r8 = (double) r3
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 > 0) goto L34
            if (r2 < r3) goto L34
            boolean r2 = r12.isInlineAdaptiveBanner()
            if (r2 == 0) goto L88
            int r2 = r12.getInlineMaxHeight()
            if (r2 < r5) goto L34
            goto Laf
        L88:
            double r2 = (double) r4
            ads_mobile_sdk.qr0 r6 = com.google.android.gms.ads.MediationUtils.a
            if (r6 == 0) goto La2
            r7 = 1050253722(0x3e99999a, float:0.3)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.String r8 = "gads:mediation_min_height_ratio"
            java.lang.Object r6 = r6.a(r8, r7, r0)
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            double r6 = (double) r6
            goto La7
        La2:
            r6 = 4604480259023595110(0x3fe6666666666666, double:0.7)
        La7:
            double r2 = r2 * r6
            double r6 = (double) r5
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 > 0) goto L34
            if (r4 < r5) goto L34
        Laf:
            if (r1 == 0) goto Lc5
            int r2 = r1.getWidth()
            int r3 = r1.getHeight()
            int r3 = r3 * r2
            int r2 = r13.getWidth()
            int r4 = r13.getHeight()
            int r4 = r4 * r2
            if (r3 > r4) goto L34
        Lc5:
            r1 = r13
            goto L34
        Lc8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.MediationUtils.findClosestSize(android.content.Context, com.google.android.gms.ads.AdSize, java.util.List):com.google.android.gms.ads.AdSize");
    }
}
