package ads_mobile_sdk;

import defpackage.gfp;

/* loaded from: classes.dex */
public final class rw0 extends ku0 {
    private static final rw0 DEFAULT_INSTANCE;
    public static final int c = 6;
    private int bitField0_;
    private nw0 gmaSdkMonitoringMessage_;

    static {
        rw0 rw0Var = new rw0();
        DEFAULT_INSTANCE = rw0Var;
        ku0.a(rw0.class, rw0Var);
    }

    public static gfp o() {
        return (gfp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"bitField0_", "gmaSdkMonitoringMessage_"});
        }
        if (iA == 3) {
            return new rw0();
        }
        if (iA == 4) {
            return new gfp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(rw0.class);
        }
        throw null;
    }

    public final void a(nw0 nw0Var) {
        this.gmaSdkMonitoringMessage_ = nw0Var;
        this.bitField0_ |= 1;
    }
}
