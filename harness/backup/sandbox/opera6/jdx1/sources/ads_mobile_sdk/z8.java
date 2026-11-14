package ads_mobile_sdk;

import defpackage.bmp;
import defpackage.flp;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z8 extends ku0 {
    private static final z8 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private String effectiveAdUnitId_;
    private flp excludingRegexes_;
    private flp includingRegexes_;

    static {
        z8 z8Var = new z8();
        DEFAULT_INSTANCE = z8Var;
        ku0.a(z8.class, z8Var);
    }

    public z8() {
        am2 am2Var = am2.e;
        this.includingRegexes_ = am2Var;
        this.excludingRegexes_ = am2Var;
        this.effectiveAdUnitId_ = "";
    }

    public static bmp r() {
        return (bmp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ț\u0002Ț\u0003ለ\u0000", new Object[]{"bitField0_", "includingRegexes_", "excludingRegexes_", "effectiveAdUnitId_"});
        }
        if (iA == 3) {
            return new z8();
        }
        if (iA == 4) {
            return new bmp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(z8.class);
        }
        throw null;
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.effectiveAdUnitId_ = str;
    }

    public final String o() {
        return this.effectiveAdUnitId_;
    }

    public final flp p$1() {
        return this.excludingRegexes_;
    }

    public final List q() {
        return this.includingRegexes_;
    }
}
