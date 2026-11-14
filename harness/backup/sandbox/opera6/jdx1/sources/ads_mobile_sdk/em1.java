package ads_mobile_sdk;

import defpackage.cvo;
import java.util.Objects;

/* loaded from: classes.dex */
public final class em1 extends ku0 {
    private static final em1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    private int bitField0_;
    private long eventCount_;
    private long eventId_;
    private long runtimeMs_;
    private int status_;
    private String exceptionName_ = "";
    private String stackTrace_ = "";
    private String debugInfo_ = "";

    static {
        em1 em1Var = new em1();
        DEFAULT_INSTANCE = em1Var;
        ku0.a(em1.class, em1Var);
    }

    public static cvo o() {
        return (cvo) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "eventId_", "runtimeMs_", "status_", st.a$3, "exceptionName_", "stackTrace_", "eventCount_", "debugInfo_"});
        }
        if (iA == 3) {
            return new em1();
        }
        if (iA == 4) {
            return new cvo(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(em1.class);
        }
        throw null;
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.debugInfo_ = str;
    }

    public final void c(String str) {
        this.bitField0_ |= 8;
        this.exceptionName_ = str;
    }

    public final void d(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.stackTrace_ = str;
    }
}
