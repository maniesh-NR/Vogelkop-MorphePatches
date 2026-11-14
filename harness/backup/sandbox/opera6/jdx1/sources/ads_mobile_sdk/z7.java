package ads_mobile_sdk;

import defpackage.amp;

/* loaded from: classes.dex */
public final class z7 extends ku0 {
    private static final z7 DEFAULT_INSTANCE;
    public static final int c = 18;
    private t7 adshieldMonitoringMessage_;
    private int bitField0_;

    static {
        z7 z7Var = new z7();
        DEFAULT_INSTANCE = z7Var;
        ku0.a(z7.class, z7Var);
    }

    public static amp o() {
        return (amp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"bitField0_", "adshieldMonitoringMessage_"});
        }
        if (iA == 3) {
            return new z7();
        }
        if (iA == 4) {
            return new amp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(z7.class);
        }
        throw null;
    }

    public final void a(t7 t7Var) {
        this.adshieldMonitoringMessage_ = t7Var;
        this.bitField0_ |= 1;
    }
}
