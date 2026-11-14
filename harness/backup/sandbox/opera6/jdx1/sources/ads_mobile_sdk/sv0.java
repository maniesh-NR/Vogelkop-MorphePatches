package ads_mobile_sdk;

import defpackage.map;

/* loaded from: classes.dex */
public final class sv0 extends ku0 {
    private static final sv0 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 4;
    public static final int f = 3;
    private int status_;
    private String stacktrace_ = "";
    private String topException_ = "";
    private String conduitTraceKey_ = "";

    static {
        sv0 sv0Var = new sv0();
        DEFAULT_INSTANCE = sv0Var;
        ku0.a(sv0.class, sv0Var);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"status_", "stacktrace_", "conduitTraceKey_", "topException_"});
        }
        if (iA == 3) {
            return new sv0();
        }
        if (iA == 4) {
            return new map(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(sv0.class);
        }
        throw null;
    }
}
