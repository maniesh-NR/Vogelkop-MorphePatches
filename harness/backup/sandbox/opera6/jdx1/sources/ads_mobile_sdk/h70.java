package ads_mobile_sdk;

import defpackage.dko;
import defpackage.flp;

/* loaded from: classes.dex */
public final class h70 extends ku0 {
    private static final h70 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 9;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    public static final int h = 5;
    public static final int i = 6;
    public static final int j = 7;
    public static final int k = 8;
    public static final int l = 10;
    public static final int m = 11;
    public static final int n = 12;
    public static final int o = 13;
    public static final int p = 14;
    private int bitField0_;
    private flp ipAddresses_;
    private boolean isRetargeting_;
    private boolean isSubframeReferrerUrlRemoved_;
    private boolean isSubframeUrlRemoved_;
    private boolean isUrlRemovedByPolicy_;
    private boolean maybeLaunchedByExternalApplication_;
    private int navigationInitiation_;
    private double navigationTimeMsec_;
    private String referrerMainFrameUrl_;
    private String referrerUrl_;
    private flp serverRedirectChain_;
    private String url_ = "";
    private String mainFrameUrl_ = "";
    private int type_ = 4;

    static {
        h70 h70Var = new h70();
        DEFAULT_INSTANCE = h70Var;
        ku0.a(h70.class, h70Var);
    }

    public h70() {
        am2 am2Var = am2.e;
        this.ipAddresses_ = am2Var;
        this.referrerUrl_ = "";
        this.referrerMainFrameUrl_ = "";
        this.serverRedirectChain_ = am2Var;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"bitField0_", "url_", "type_", ad.a$12, "ipAddresses_", "referrerUrl_", "referrerMainFrameUrl_", "isRetargeting_", "navigationTimeMsec_", "serverRedirectChain_", e70.class, "mainFrameUrl_", "navigationInitiation_", ad.a$3, "maybeLaunchedByExternalApplication_", "isSubframeUrlRemoved_", "isSubframeReferrerUrlRemoved_", "isUrlRemovedByPolicy_"});
        }
        if (iA == 3) {
            return new h70();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(h70.class);
        }
        throw null;
    }
}
