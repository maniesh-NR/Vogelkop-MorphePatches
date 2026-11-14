package ads_mobile_sdk;

import defpackage.kuo;

/* loaded from: classes.dex */
public final class e42 extends ku0 {
    private static final e42 DEFAULT_INSTANCE;
    public static final int c = 1;
    private boolean deviceOnline_;

    static {
        e42 e42Var = new e42();
        DEFAULT_INSTANCE = e42Var;
        ku0.a(e42.class, e42Var);
    }

    public static kuo o() {
        return (kuo) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"deviceOnline_"});
        }
        if (iA == 3) {
            return new e42();
        }
        if (iA == 4) {
            return new kuo(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(e42.class);
        }
        throw null;
    }
}
