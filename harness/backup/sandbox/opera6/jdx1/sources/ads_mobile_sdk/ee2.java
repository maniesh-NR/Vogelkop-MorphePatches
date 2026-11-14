package ads_mobile_sdk;

import defpackage.hso;

/* loaded from: classes.dex */
public final class ee2 extends ku0 {
    private static final ee2 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    private int bitField0_;
    private boolean cacheHit_;
    private int cacheMissReason_;
    private boolean isFromPreviousSession_;
    private int numAdsInCachedResponse_;
    private int numRequestedAds_;
    private long timeInCacheMs_;

    static {
        ee2 ee2Var = new ee2();
        DEFAULT_INSTANCE = ee2Var;
        ku0.a(ee2.class, ee2Var);
    }

    public static hso o() {
        return (hso) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004င\u0003\u0005င\u0004\u0006ဂ\u0005", new Object[]{"bitField0_", "cacheHit_", "isFromPreviousSession_", "cacheMissReason_", "numRequestedAds_", "numAdsInCachedResponse_", "timeInCacheMs_"});
        }
        if (iA == 3) {
            return new ee2();
        }
        if (iA == 4) {
            return new hso(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(ee2.class);
        }
        throw null;
    }
}
