package ads_mobile_sdk;

import defpackage.y7p;

/* loaded from: classes.dex */
public final class ks extends ku0 {
    private static final ks DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    private int numPreloadedAds_;
    private int numPreloaders_;
    private int preloaderFormat_;
    private boolean preloaderInFlight_;
    private int preloaderMaxBufferSize_;
    private int preloaderNumAdsAvailable_;
    private String preloaderPreloadId_ = "";
    private int totalInflightAdLimit_;

    static {
        ks ksVar = new ks();
        DEFAULT_INSTANCE = ksVar;
        ku0.a(ks.class, ksVar);
    }

    public static y7p o() {
        return (y7p) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\f\u0005Ȉ\u0006\u0004\u0007\u0004\b\u0007", new Object[]{"totalInflightAdLimit_", "numPreloadedAds_", "numPreloaders_", "preloaderFormat_", "preloaderPreloadId_", "preloaderMaxBufferSize_", "preloaderNumAdsAvailable_", "preloaderInFlight_"});
        }
        if (iA == 3) {
            return new ks();
        }
        if (iA == 4) {
            return new y7p(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(ks.class);
        }
        throw null;
    }
}
