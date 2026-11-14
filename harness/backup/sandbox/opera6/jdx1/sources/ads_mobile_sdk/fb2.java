package ads_mobile_sdk;

import defpackage.dko;
import defpackage.flp;
import defpackage.wmp;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class fb2 extends ku0 {
    private static final fb2 DEFAULT_INSTANCE;
    public static final int c = 9;
    public static final int d = 1;
    public static final int e = 11;
    public static final int f = 12;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 4;
    private static final dn1 includeDefaultEntry_2_;
    public static final int j = 13;
    public static final int k = 5;
    public static final int l = 6;
    public static final int m = 7;
    public static final int n = 8;
    public static final int o = 10;
    public static final int p = 14;
    private boolean allowCompression_;
    private boolean allowCookies_;
    private flp allowedKeys_;
    private flp andRules_;
    private String baseUrl_;
    private int bitField0_;
    private flp blobUrlKeys_;
    private flp consoleLogs_;
    private flp elseRules_;
    private int errorCode_;
    private String errorString_;
    private flp includeSignals_;
    private vm1 pattern_;
    private gn1 include_ = gn1.b;
    private String ruleLabel_ = "";

    static {
        wmp wmpVar = cs3.d;
        includeDefaultEntry_2_ = new dn1(wmpVar, wmpVar, "");
        fb2 fb2Var = new fb2();
        DEFAULT_INSTANCE = fb2Var;
        ku0.a(fb2.class, fb2Var);
    }

    public fb2() {
        am2 am2Var = am2.e;
        this.andRules_ = am2Var;
        this.elseRules_ = am2Var;
        this.includeSignals_ = am2Var;
        this.blobUrlKeys_ = am2Var;
        this.allowedKeys_ = am2Var;
        this.consoleLogs_ = am2Var;
        this.errorString_ = "";
        this.baseUrl_ = "";
    }

    public final String A() {
        return this.ruleLabel_;
    }

    public final boolean B() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean C() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean D() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean E() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean F() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u000e\u0000\u0001\u0001\u000e\u000e\u0001\u0006\u0000\u0001ဉ\u0001\u00022\u0003\u001b\u0004Ț\u0005Ț\u0006ለ\u0002\u0007င\u0003\bለ\u0004\tለ\u0000\nဇ\u0005\u000b\u001b\f\u001b\rȚ\u000eဇ\u0006", new Object[]{"bitField0_", "pattern_", "include_", includeDefaultEntry_2_, "includeSignals_", h41.class, "blobUrlKeys_", "consoleLogs_", "errorString_", "errorCode_", "baseUrl_", "ruleLabel_", "allowCookies_", "andRules_", fb2.class, "elseRules_", fb2.class, "allowedKeys_", "allowCompression_"});
        }
        if (iA == 3) {
            return new fb2();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(fb2.class);
        }
        throw null;
    }

    public final boolean o() {
        return this.allowCookies_;
    }

    public final flp p() {
        return this.allowedKeys_;
    }

    public final flp q() {
        return this.andRules_;
    }

    public final String r() {
        return this.baseUrl_;
    }

    public final flp s() {
        return this.blobUrlKeys_;
    }

    public final flp t() {
        return this.consoleLogs_;
    }

    public final flp u() {
        return this.elseRules_;
    }

    public final int v() {
        return this.errorCode_;
    }

    public final String w() {
        return this.errorString_;
    }

    public final Map x() {
        return Collections.unmodifiableMap(this.include_);
    }

    public final flp y() {
        return this.includeSignals_;
    }

    public final vm1 z() {
        vm1 vm1Var = this.pattern_;
        return vm1Var == null ? vm1.p() : vm1Var;
    }
}
