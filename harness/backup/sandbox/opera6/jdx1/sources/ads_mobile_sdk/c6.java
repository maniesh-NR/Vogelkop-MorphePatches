package ads_mobile_sdk;

import defpackage.cpo;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c6 extends ku0 {
    private static final c6 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private long createTimeMs_;
    private int status_;
    private String filename_ = "";
    private String checksum_ = "";

    static {
        c6 c6Var = new c6();
        DEFAULT_INSTANCE = c6Var;
        ku0.a(c6.class, c6Var);
    }

    public static cpo s() {
        return (cpo) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0003ለ\u0002\u0004ဌ\u0003", new Object[]{"bitField0_", "filename_", "createTimeMs_", "checksum_", "status_"});
        }
        if (iA == 3) {
            return new c6();
        }
        if (iA == 4) {
            return new cpo(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(c6.class);
        }
        throw null;
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.checksum_ = str;
    }

    public final void c(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.filename_ = str;
    }

    public final String o() {
        return this.checksum_;
    }

    public final long p() {
        return this.createTimeMs_;
    }

    public final String q() {
        return this.filename_;
    }

    public final int r$1() {
        int i = this.status_;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 3 : 2 : 1;
        if (i2 == 0) {
            return 4;
        }
        return i2;
    }
}
