package ads_mobile_sdk;

import defpackage.dko;

/* loaded from: classes.dex */
public final class d50 extends ku0 {
    private static final d50 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private hr uri_;
    private hr verb_;
    private hr version_;

    static {
        d50 d50Var = new d50();
        DEFAULT_INSTANCE = d50Var;
        ku0.a(d50.class, d50Var);
    }

    public d50() {
        fr frVar = hr.b;
        this.verb_ = frVar;
        this.uri_ = frVar;
        this.version_ = frVar;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"bitField0_", "verb_", "uri_", "version_"});
        }
        if (iA == 3) {
            return new d50();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(d50.class);
        }
        throw null;
    }
}
