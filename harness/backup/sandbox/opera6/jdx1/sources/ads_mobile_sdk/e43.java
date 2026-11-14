package ads_mobile_sdk;

import defpackage.luo;

/* loaded from: classes.dex */
public final class e43 extends ku0 {
    private static final e43 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private boolean automaticRefresh_;
    private boolean staleResultAllowed_;

    static {
        e43 e43Var = new e43();
        DEFAULT_INSTANCE = e43Var;
        ku0.a(e43.class, e43Var);
    }

    public static luo o() {
        return (luo) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"automaticRefresh_", "staleResultAllowed_"});
        }
        if (iA == 3) {
            return new e43();
        }
        if (iA == 4) {
            return new luo(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(e43.class);
        }
        throw null;
    }
}
