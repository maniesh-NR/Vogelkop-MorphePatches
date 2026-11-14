package ads_mobile_sdk;

import defpackage.map;

/* loaded from: classes.dex */
public final class n33 extends ku0 {
    private static final n33 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int valueCase_ = 0;
    private Object value_;

    static {
        n33 n33Var = new n33();
        DEFAULT_INSTANCE = n33Var;
        ku0.a(n33.class, n33Var);
    }

    public static n33 p() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȼ\u0000\u0002:\u0000\u00035\u0000\u00043\u0000", new Object[]{"value_", "valueCase_"});
        }
        if (iA == 3) {
            return new n33();
        }
        if (iA == 4) {
            return new map(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(n33.class);
        }
        throw null;
    }

    public final boolean o() {
        if (this.valueCase_ == 2) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double q() {
        if (this.valueCase_ == 4) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final long r() {
        if (this.valueCase_ == 3) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String s() {
        return this.valueCase_ == 1 ? (String) this.value_ : "";
    }

    public final boolean t() {
        return this.valueCase_ == 2;
    }

    public final boolean u() {
        return this.valueCase_ == 4;
    }

    public final boolean v() {
        return this.valueCase_ == 3;
    }

    public final boolean w() {
        return this.valueCase_ == 1;
    }
}
