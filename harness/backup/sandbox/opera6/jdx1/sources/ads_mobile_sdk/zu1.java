package ads_mobile_sdk;

import defpackage.v9g;
import defpackage.ymp;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class zu1 extends ku0 {
    private static final zu1 DEFAULT_INSTANCE;
    private static final dn1 adUnitToUseMediaViewDefaultEntry_2_ = new dn1(cs3.d, cs3.c, Boolean.FALSE);
    public static final int c = 1;
    public static final int d = 2;
    private gn1 adUnitToUseMediaView_ = gn1.b;
    private long appVersionCode_;

    static {
        zu1 zu1Var = new zu1();
        DEFAULT_INSTANCE = zu1Var;
        ku0.a(zu1.class, zu1Var);
    }

    public static zu1 a(InputStream inputStream) {
        ku0 ku0VarA = ku0.a(DEFAULT_INSTANCE, v9g.a(inputStream), ul0.a());
        ku0.a(ku0VarA);
        return (zu1) ku0VarA;
    }

    public static zu1 q() {
        return DEFAULT_INSTANCE;
    }

    public static ymp r() {
        return (ymp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u00022", new Object[]{"appVersionCode_", "adUnitToUseMediaView_", adUnitToUseMediaViewDefaultEntry_2_});
        }
        if (iA == 3) {
            return new zu1();
        }
        if (iA == 4) {
            return new ymp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(zu1.class);
        }
        throw null;
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.adUnitToUseMediaView_);
    }

    public final long p() {
        return this.appVersionCode_;
    }
}
