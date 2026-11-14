package ads_mobile_sdk;

import defpackage.map;

/* loaded from: classes.dex */
public final class um3 extends ku0 {
    private static final um3 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private int protocolNumber_;
    private int variant_;

    static {
        um3 um3Var = new um3();
        DEFAULT_INSTANCE = um3Var;
        ku0.a(um3.class, um3Var);
    }

    public static um3 o() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "protocolNumber_", "variant_"});
        }
        if (iA == 3) {
            return new um3();
        }
        if (iA == 4) {
            return new map(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(um3.class);
        }
        throw null;
    }

    public final int p() {
        return this.protocolNumber_;
    }

    public final int q() {
        return this.variant_;
    }
}
