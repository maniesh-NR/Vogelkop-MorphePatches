package ads_mobile_sdk;

import defpackage.map;

/* loaded from: classes.dex */
public final class rz2 extends ku0 {
    private static final rz2 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int evictionReason_;
    private int scarRequestType_;
    private String requestId_ = "";
    private String requestAgent_ = "";

    static {
        rz2 rz2Var = new rz2();
        DEFAULT_INSTANCE = rz2Var;
        ku0.a(rz2.class, rz2Var);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"evictionReason_", "requestId_", "scarRequestType_", "requestAgent_"});
        }
        if (iA == 3) {
            return new rz2();
        }
        if (iA == 4) {
            return new map(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(rz2.class);
        }
        throw null;
    }
}
