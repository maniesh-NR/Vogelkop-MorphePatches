package ads_mobile_sdk;

import defpackage.ugp;
import java.util.Objects;

/* loaded from: classes.dex */
public final class tm1 extends ku0 {
    private static final tm1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private float logSampleRate_;
    private String remoteCaptureServiceUrl_ = "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1";
    private long logBufferSize_ = 1000;
    private long logIntervalMs_ = 60000;

    static {
        tm1 tm1Var = new tm1();
        DEFAULT_INSTANCE = tm1Var;
        ku0.a(tm1.class, tm1Var);
    }

    public static tm1 o() {
        return DEFAULT_INSTANCE;
    }

    public static ugp t() {
        return (ugp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"bitField0_", "remoteCaptureServiceUrl_", "logSampleRate_", "logBufferSize_", "logIntervalMs_"});
        }
        if (iA == 3) {
            return new tm1();
        }
        if (iA == 4) {
            return new ugp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(tm1.class);
        }
        throw null;
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.remoteCaptureServiceUrl_ = str;
    }

    public final long p() {
        return this.logBufferSize_;
    }

    public final long q() {
        return this.logIntervalMs_;
    }

    public final float r() {
        return this.logSampleRate_;
    }

    public final String s() {
        return this.remoteCaptureServiceUrl_;
    }
}
