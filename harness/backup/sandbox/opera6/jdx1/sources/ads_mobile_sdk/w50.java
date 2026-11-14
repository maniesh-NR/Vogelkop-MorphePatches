package ads_mobile_sdk;

import defpackage.map;

/* loaded from: classes.dex */
public final class w50 extends ku0 {
    private static final w50 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private hr imageDigest_;
    private hr image_;
    private String mimeType_ = "";
    private int type_;

    static {
        w50 w50Var = new w50();
        DEFAULT_INSTANCE = w50Var;
        ku0.a(w50.class, w50Var);
    }

    public w50() {
        fr frVar = hr.b;
        this.image_ = frVar;
        this.imageDigest_ = frVar;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"bitField0_", "type_", st.a$5, "mimeType_", "image_", "imageDigest_"});
        }
        if (iA == 3) {
            return new w50();
        }
        if (iA == 4) {
            return new map(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(w50.class);
        }
        throw null;
    }
}
