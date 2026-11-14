package ads_mobile_sdk;

import defpackage.s2p;
import defpackage.v9g;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i03 extends ku0 {
    private static final i03 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private String cachedSdkCore_ = "";
    private long lastUpdateTimeMs_;

    static {
        i03 i03Var = new i03();
        DEFAULT_INSTANCE = i03Var;
        ku0.a(i03.class, i03Var);
    }

    public static i03 a(InputStream inputStream) {
        ku0 ku0VarA = ku0.a(DEFAULT_INSTANCE, v9g.a(inputStream), ul0.a());
        ku0.a(ku0VarA);
        return (i03) ku0VarA;
    }

    public static i03 p() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "cachedSdkCore_", "lastUpdateTimeMs_"});
        }
        if (iA == 3) {
            return new i03();
        }
        if (iA == 4) {
            return new s2p(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(i03.class);
        }
        throw null;
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.cachedSdkCore_ = str;
    }

    public final String o() {
        return this.cachedSdkCore_;
    }

    public final long q() {
        return this.lastUpdateTimeMs_;
    }
}
