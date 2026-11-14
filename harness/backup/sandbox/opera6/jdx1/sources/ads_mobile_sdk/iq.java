package ads_mobile_sdk;

import defpackage.dko;

/* loaded from: classes.dex */
public final class iq extends ku0 {
    private static final iq DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 7;
    public static final int g = 8;
    public static final int h = 4;
    public static final int i = 5;
    public static final int j = 6;
    public static final int k = 9;
    public static final int l = 11;
    public static final int m = 10;
    private int backoffStep_;
    private int bitField0_;
    private long cacheTimestamp_;
    private hq error_;
    private float executionCredit_;
    private int failedExecutions_;
    private boolean isFromPrebid_;
    private boolean isPublisherCreated_;
    private long lastExecutionTimestamp_;
    private int skippedExecutions_;
    private String javascriptLibraryName_ = "";
    private String buyerGeneratedRequestData_ = "";

    static {
        iq iqVar = new iq();
        DEFAULT_INSTANCE = iqVar;
        ku0.a(iq.class, iqVar);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004င\u0005\u0005င\u0006\u0006င\u0007\u0007ဂ\u0003\bခ\u0004\tဇ\b\nဉ\n\u000bဇ\t", new Object[]{"bitField0_", "javascriptLibraryName_", "buyerGeneratedRequestData_", "cacheTimestamp_", "failedExecutions_", "skippedExecutions_", "backoffStep_", "lastExecutionTimestamp_", "executionCredit_", "isPublisherCreated_", "error_", "isFromPrebid_"});
        }
        if (iA == 3) {
            return new iq();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(iq.class);
        }
        throw null;
    }
}
