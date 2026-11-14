package ads_mobile_sdk;

import defpackage.map;

/* loaded from: classes.dex */
public final class s40 extends ku0 {
    private static final s40 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private r40 digests_;
    private long length_;
    private String url_ = "";
    private String fileBasename_ = "";

    static {
        s40 s40Var = new s40();
        DEFAULT_INSTANCE = s40Var;
        ku0.a(s40.class, s40Var);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "url_", "digests_", "length_", "fileBasename_"});
        }
        if (iA == 3) {
            return new s40();
        }
        if (iA == 4) {
            return new map(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(s40.class);
        }
        throw null;
    }
}
