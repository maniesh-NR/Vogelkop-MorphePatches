package ads_mobile_sdk;

import defpackage.aep;
import defpackage.wmp;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class qa extends ku0 {
    private static final qa DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private static final dn1 extrasDefaultEntry_2_;
    private int bitField0_;
    private gn1 extras_ = gn1.b;
    private String format_ = "";

    static {
        wmp wmpVar = cs3.d;
        extrasDefaultEntry_2_ = new dn1(wmpVar, wmpVar, "");
        qa qaVar = new qa();
        DEFAULT_INSTANCE = qaVar;
        ku0.a(qa.class, qaVar);
    }

    public static aep q() {
        return (aep) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ለ\u0000\u00022", new Object[]{"bitField0_", "format_", "extras_", extrasDefaultEntry_2_});
        }
        if (iA == 3) {
            return new qa();
        }
        if (iA == 4) {
            return new aep(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(qa.class);
        }
        throw null;
    }

    public final void b(String str) {
        this.bitField0_ |= 1;
        this.format_ = str;
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.extras_);
    }

    public final String p() {
        return this.format_;
    }
}
