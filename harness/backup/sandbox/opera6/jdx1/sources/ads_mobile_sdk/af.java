package ads_mobile_sdk;

import defpackage.bop;
import defpackage.ump;
import defpackage.v9g;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class af extends ku0 {
    private static final af DEFAULT_INSTANCE;
    public static final int c = 1;
    private gn1 logs_ = gn1.b;

    static {
        af afVar = new af();
        DEFAULT_INSTANCE = afVar;
        ku0.a(af.class, afVar);
    }

    public static af a(InputStream inputStream) {
        ku0 ku0VarA = ku0.a(DEFAULT_INSTANCE, v9g.a(inputStream), ul0.a());
        ku0.a(ku0VarA);
        return (af) ku0VarA;
    }

    public static af o() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"logs_", bop.a});
        }
        if (iA == 3) {
            return new af();
        }
        if (iA == 4) {
            return new ump(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(af.class);
        }
        throw null;
    }

    public final Map p() {
        return Collections.unmodifiableMap(this.logs_);
    }
}
