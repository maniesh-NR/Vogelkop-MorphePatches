package ads_mobile_sdk;

import defpackage.pcp;

/* loaded from: classes.dex */
public final class oq extends ku0 {
    private static final oq DEFAULT_INSTANCE;
    public static final int c = 4;
    public static final int d = 5;
    private int bitField0_;
    private String errorDescription_ = "";
    private int errorType_;

    static {
        oq oqVar = new oq();
        DEFAULT_INSTANCE = oqVar;
        ku0.a(oq.class, oqVar);
    }

    public static pcp o() {
        return (pcp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004᠌\u0000\u0005ဈ\u0001", new Object[]{"bitField0_", "errorType_", ad.a$8, "errorDescription_"});
        }
        if (iA == 3) {
            return new oq();
        }
        if (iA == 4) {
            return new pcp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(oq.class);
        }
        throw null;
    }

    public final void b(String str) {
        this.bitField0_ |= 2;
        this.errorDescription_ = str;
    }
}
