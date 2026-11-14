package ads_mobile_sdk;

import defpackage.kgp;
import defpackage.v9g;
import defpackage.wmp;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t70 extends ku0 {
    private static final t70 DEFAULT_INSTANCE;
    public static final int c = 1;
    private static final dn1 concatenatedSignalsMapDefaultEntry_3_;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private gn1 concatenatedSignalsMap_ = gn1.b;
    private hb2 patternMatchingFlag_;
    private mg2 preProcessingFlag_;

    static {
        wmp wmpVar = cs3.d;
        concatenatedSignalsMapDefaultEntry_3_ = new dn1(wmpVar, wmpVar, "");
        t70 t70Var = new t70();
        DEFAULT_INSTANCE = t70Var;
        ku0.a(t70.class, t70Var);
    }

    public static t70 a(InputStream inputStream) {
        ku0 ku0VarA = ku0.a(DEFAULT_INSTANCE, v9g.a(inputStream), ul0.a());
        ku0.a(ku0VarA);
        return (t70) ku0VarA;
    }

    public static t70 p() {
        return DEFAULT_INSTANCE;
    }

    public static kgp s() {
        return (kgp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u00032", new Object[]{"bitField0_", "patternMatchingFlag_", "preProcessingFlag_", "concatenatedSignalsMap_", concatenatedSignalsMapDefaultEntry_3_});
        }
        if (iA == 3) {
            return new t70();
        }
        if (iA == 4) {
            return new kgp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(t70.class);
        }
        throw null;
    }

    public final void a(hb2 hb2Var) {
        Objects.requireNonNull(hb2Var);
        this.patternMatchingFlag_ = hb2Var;
        this.bitField0_ |= 1;
    }

    public final void a(mg2 mg2Var) {
        Objects.requireNonNull(mg2Var);
        this.preProcessingFlag_ = mg2Var;
        this.bitField0_ |= 2;
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.concatenatedSignalsMap_);
    }

    public final hb2 q() {
        hb2 hb2Var = this.patternMatchingFlag_;
        return hb2Var == null ? hb2.o() : hb2Var;
    }

    public final mg2 r() {
        mg2 mg2Var = this.preProcessingFlag_;
        return mg2Var == null ? mg2.o() : mg2Var;
    }
}
