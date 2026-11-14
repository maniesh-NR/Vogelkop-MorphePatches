package ads_mobile_sdk;

import defpackage.olp;
import defpackage.wmp;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class yz extends ku0 {
    private static final yz DEFAULT_INSTANCE;
    public static final int c = 1;
    private static final dn1 concatenatedSignalsMapDefaultEntry_5_;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    private int bitField0_;
    private qx consentAllowlist_;
    private hb2 patternMatchingFlag_;
    private mg2 preProcessingFlag_;
    private gn1 concatenatedSignalsMap_ = gn1.b;
    private String consentStringJson_ = "";
    private String consentStateJson_ = "";

    static {
        wmp wmpVar = cs3.d;
        concatenatedSignalsMapDefaultEntry_5_ = new dn1(wmpVar, wmpVar, "");
        yz yzVar = new yz();
        DEFAULT_INSTANCE = yzVar;
        ku0.a(yz.class, yzVar);
    }

    public static yz s() {
        return DEFAULT_INSTANCE;
    }

    public static olp w() {
        return (olp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0001\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u00052\u0006ဉ\u0004", new Object[]{"bitField0_", "consentStringJson_", "consentStateJson_", "patternMatchingFlag_", "preProcessingFlag_", "concatenatedSignalsMap_", concatenatedSignalsMapDefaultEntry_5_, "consentAllowlist_"});
        }
        if (iA == 3) {
            return new yz();
        }
        if (iA == 4) {
            return new olp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(yz.class);
        }
        throw null;
    }

    public final void a(qx qxVar) {
        Objects.requireNonNull(qxVar);
        this.consentAllowlist_ = qxVar;
        this.bitField0_ |= 16;
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.consentStateJson_ = str;
    }

    public final void c(String str) {
        this.bitField0_ |= 1;
        this.consentStringJson_ = str;
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.concatenatedSignalsMap_);
    }

    public final qx p() {
        qx qxVar = this.consentAllowlist_;
        return qxVar == null ? qx.r() : qxVar;
    }

    public final String q() {
        return this.consentStateJson_;
    }

    public final String r() {
        return this.consentStringJson_;
    }

    public final hb2 t() {
        hb2 hb2Var = this.patternMatchingFlag_;
        return hb2Var == null ? hb2.o() : hb2Var;
    }

    public final mg2 u() {
        mg2 mg2Var = this.preProcessingFlag_;
        return mg2Var == null ? mg2.o() : mg2Var;
    }

    public final boolean v() {
        return (this.bitField0_ & 4) != 0;
    }
}
