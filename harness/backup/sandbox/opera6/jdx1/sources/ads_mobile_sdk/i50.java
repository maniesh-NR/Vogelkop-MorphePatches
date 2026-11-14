package ads_mobile_sdk;

import defpackage.dko;
import defpackage.flp;

/* loaded from: classes.dex */
public final class i50 extends ku0 {
    private static final i50 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    private int bitField0_;
    private hr body_;
    private hr bodydigest_;
    private int bodylength_;
    private h50 firstline_;
    private hr remoteIp_;
    private byte memoizedIsInitialized = 2;
    private flp headers_ = am2.e;

    static {
        i50 i50Var = new i50();
        DEFAULT_INSTANCE = i50Var;
        ku0.a(i50.class, i50Var);
    }

    public i50() {
        fr frVar = hr.b;
        this.body_ = frVar;
        this.bodydigest_ = frVar;
        this.remoteIp_ = frVar;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        switch (zwg.a(i)) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = (byte) (ku0Var == null ? 0 : 1);
                return null;
            case 2:
                return new zq2(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"bitField0_", "firstline_", "headers_", a50.class, "body_", "bodydigest_", "bodylength_", "remoteIp_"});
            case 3:
                return new i50();
            case 4:
                return new dko(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                return ku0.b(i50.class);
            default:
                throw null;
        }
    }
}
