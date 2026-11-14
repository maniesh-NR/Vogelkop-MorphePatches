package ads_mobile_sdk;

import defpackage.map;

/* loaded from: classes.dex */
public final class uz0 extends ku0 {
    private static final uz0 DEFAULT_INSTANCE;
    public static final int c = 1;
    private String action_ = "";

    static {
        uz0 uz0Var = new uz0();
        DEFAULT_INSTANCE = uz0Var;
        ku0.a(uz0.class, uz0Var);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"action_"});
        }
        if (iA == 3) {
            return new uz0();
        }
        if (iA == 4) {
            return new map(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(uz0.class);
        }
        throw null;
    }
}
