package ads_mobile_sdk;

import defpackage.dko;

/* loaded from: classes.dex */
public final class h50 extends ku0 {
    private static final h50 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private int code_;
    private hr message_;
    private hr version_;

    static {
        h50 h50Var = new h50();
        DEFAULT_INSTANCE = h50Var;
        ku0.a(h50.class, h50Var);
    }

    public h50() {
        fr frVar = hr.b;
        this.message_ = frVar;
        this.version_ = frVar;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"bitField0_", "code_", "message_", "version_"});
        }
        if (iA == 3) {
            return new h50();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(h50.class);
        }
        throw null;
    }
}
