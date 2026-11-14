package ads_mobile_sdk;

import defpackage.dko;
import defpackage.s7p;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class kg2 extends ku0 {
    private static final kg2 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private gn1 includeSignals_ = gn1.b;
    private vm1 pattern_;

    static {
        kg2 kg2Var = new kg2();
        DEFAULT_INSTANCE = kg2Var;
        ku0.a(kg2.class, kg2Var);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new Object[]{"bitField0_", "pattern_", "includeSignals_", s7p.a});
        }
        if (iA == 3) {
            return new kg2();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(kg2.class);
        }
        throw null;
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.includeSignals_);
    }

    public final vm1 p() {
        vm1 vm1Var = this.pattern_;
        return vm1Var == null ? vm1.p() : vm1Var;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }
}
