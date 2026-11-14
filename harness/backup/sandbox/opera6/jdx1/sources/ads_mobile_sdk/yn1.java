package ads_mobile_sdk;

import defpackage.flp;
import defpackage.ilp;
import defpackage.wmp;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class yn1 extends ku0 {
    private static final yn1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 3;
    private static final dn1 dataDefaultEntry_2_;
    public static final int e = 2;
    private flp adapters_;
    private gn1 data_ = gn1.b;
    private flp waterfallAdapters_;

    static {
        wmp wmpVar = cs3.d;
        dataDefaultEntry_2_ = new dn1(wmpVar, wmpVar, "");
        yn1 yn1Var = new yn1();
        DEFAULT_INSTANCE = yn1Var;
        ku0.a(yn1.class, yn1Var);
    }

    public yn1() {
        am2 am2Var = am2.e;
        this.adapters_ = am2Var;
        this.waterfallAdapters_ = am2Var;
    }

    public static ilp r() {
        return (ilp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0002\u0000\u0001Ț\u00022\u0003Ț", new Object[]{"adapters_", "data_", dataDefaultEntry_2_, "waterfallAdapters_"});
        }
        if (iA == 3) {
            return new yn1();
        }
        if (iA == 4) {
            return new ilp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(yn1.class);
        }
        throw null;
    }

    public final flp o() {
        return this.adapters_;
    }

    public final Map p() {
        return Collections.unmodifiableMap(this.data_);
    }
}
