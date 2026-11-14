package ads_mobile_sdk;

import defpackage.iap;

/* loaded from: classes.dex */
public final class md extends ku0 {
    private static final md DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    public static final int l = 10;
    public static final int m = 11;
    public static final int n = 12;
    public static final int o = 13;
    public static final int p = 14;
    public static final int q = 15;
    public static final int r = 16;
    public static final int s = 17;
    public static final int t = 18;
    public static final int u = 19;
    public static final int v = 20;
    public static final int w = 21;
    private int bitField0_;
    private long viewDxSignal_;
    private long viewDySignal_;
    private long tcxSignal_ = -1;
    private long tcySignal_ = -1;
    private long tcd_ = -1;
    private long avgMoveTcd_ = -1;
    private long tcp_ = -1;
    private long avgMoveTcp_ = -1;
    private int obscured_ = 1000;
    private long tctMs_ = -1;
    private long toolType_ = -1;
    private long source_ = -1;
    private int isPhysicalTouch_ = 1000;
    private long stkDepth_ = -1;
    private long pathDistanceSignal_ = -1;
    private long viewXSignal_ = -1;
    private long viewYSignal_ = -1;
    private long tcxDownSignal_ = -1;
    private long tcyDownSignal_ = -1;
    private long tcxUpSignal_ = -1;
    private long tcyUpSignal_ = -1;

    static {
        md mdVar = new md();
        DEFAULT_INSTANCE = mdVar;
        ku0.a(md.class, mdVar);
    }

    public static iap o() {
        return (iap) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            ad adVar = ad.a$2;
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"bitField0_", "tcxSignal_", "tcySignal_", "tcd_", "avgMoveTcd_", "tcp_", "avgMoveTcp_", "obscured_", adVar, "tctMs_", "toolType_", "source_", "isPhysicalTouch_", adVar, "stkDepth_", "pathDistanceSignal_", "viewXSignal_", "viewYSignal_", "viewDxSignal_", "viewDySignal_", "tcxDownSignal_", "tcyDownSignal_", "tcxUpSignal_", "tcyUpSignal_"});
        }
        if (iA == 3) {
            return new md();
        }
        if (iA == 4) {
            return new iap(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(md.class);
        }
        throw null;
    }
}
