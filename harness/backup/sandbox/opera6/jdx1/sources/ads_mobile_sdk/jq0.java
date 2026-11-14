package ads_mobile_sdk;

import defpackage.i6p;
import defpackage.v9g;
import defpackage.wmp;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class jq0 extends ku0 {
    private static final jq0 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 8;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    private static final dn1 storedSdkCoreDataDefaultEntry_5_;
    private int bitField0_;
    private yz consentState_;
    private boolean hasSdkInitializedPreviously_;
    private int sessionsSinceUpdate_;
    private gn1 storedSdkCoreData_ = gn1.b;
    private String flagJson_ = "";
    private String cachedUserAgent_ = "";

    static {
        wmp wmpVar = cs3.d;
        storedSdkCoreDataDefaultEntry_5_ = new dn1(wmpVar, wmpVar, "");
        jq0 jq0Var = new jq0();
        DEFAULT_INSTANCE = jq0Var;
        ku0.a(jq0.class, jq0Var);
    }

    public static jq0 a(InputStream inputStream) {
        ku0 ku0VarA = ku0.a(DEFAULT_INSTANCE, v9g.a(inputStream), ul0.a());
        ku0.a(ku0VarA);
        return (jq0) ku0VarA;
    }

    public static jq0 q() {
        return DEFAULT_INSTANCE;
    }

    public static i6p v() {
        return (i6p) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0001\u0000\u0000\u0001ለ\u0000\u0002င\u0001\u00052\u0006ဉ\u0003\u0007ለ\u0004\bဇ\u0002", new Object[]{"bitField0_", "flagJson_", "sessionsSinceUpdate_", "storedSdkCoreData_", storedSdkCoreDataDefaultEntry_5_, "consentState_", "cachedUserAgent_", "hasSdkInitializedPreviously_"});
        }
        if (iA == 3) {
            return new jq0();
        }
        if (iA == 4) {
            return new i6p(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(jq0.class);
        }
        throw null;
    }

    public final void a(yz yzVar) {
        Objects.requireNonNull(yzVar);
        this.consentState_ = yzVar;
        this.bitField0_ |= 8;
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.cachedUserAgent_ = str;
    }

    public final void c(String str) {
        this.bitField0_ |= 1;
        this.flagJson_ = str;
    }

    public final String o() {
        return this.cachedUserAgent_;
    }

    public final yz p() {
        yz yzVar = this.consentState_;
        return yzVar == null ? yz.s() : yzVar;
    }

    public final String r() {
        return this.flagJson_;
    }

    public final boolean s() {
        return this.hasSdkInitializedPreviously_;
    }

    public final int t() {
        return this.sessionsSinceUpdate_;
    }

    public final Map u() {
        return Collections.unmodifiableMap(this.storedSdkCoreData_);
    }
}
