package ads_mobile_sdk;

import defpackage.jip;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ul2 extends ku0 {
    private static final ul2 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    public static final int l = 10;
    private long appStartProgramUpdateDelayMs_;
    private int bitField0_;
    private boolean enableRetryDownload_;
    private boolean reinitializeAfterUpdate_;
    private boolean updateBeforeInitialization_;
    private boolean updateOnInitializationOnly_ = true;
    private long minUpdateIntervalMs_ = 600000;
    private long programAlmostExpiredMs_ = 3600000;
    private String programRequestUrl_ = "https://pagead2.googlesyndication.com/mads/asp";
    private long maxRetryCount_ = 5;
    private long retryBaseIntervalMs_ = 60000;

    static {
        ul2 ul2Var = new ul2();
        DEFAULT_INSTANCE = ul2Var;
        ku0.a(ul2.class, ul2Var);
    }

    public static ul2 p() {
        return DEFAULT_INSTANCE;
    }

    public static jip w() {
        return (jip) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဇ\u0007\tဂ\b\nဂ\t", new Object[]{"bitField0_", "updateOnInitializationOnly_", "reinitializeAfterUpdate_", "updateBeforeInitialization_", "minUpdateIntervalMs_", "programAlmostExpiredMs_", "programRequestUrl_", "appStartProgramUpdateDelayMs_", "enableRetryDownload_", "maxRetryCount_", "retryBaseIntervalMs_"});
        }
        if (iA == 3) {
            return new ul2();
        }
        if (iA == 4) {
            return new jip(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(ul2.class);
        }
        throw null;
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.programRequestUrl_ = str;
    }

    public final long o() {
        return this.appStartProgramUpdateDelayMs_;
    }

    public final boolean q() {
        return this.enableRetryDownload_;
    }

    public final long r() {
        return this.maxRetryCount_;
    }

    public final long s() {
        return this.programAlmostExpiredMs_;
    }

    public final String t() {
        return this.programRequestUrl_;
    }

    public final long u() {
        return this.retryBaseIntervalMs_;
    }

    public final boolean v() {
        return this.updateBeforeInitialization_;
    }
}
