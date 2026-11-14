package ads_mobile_sdk;

import defpackage.flp;
import defpackage.map;

/* loaded from: classes.dex */
public final class mn1 extends ku0 {
    private static final mn1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 5;
    public static final int g = 4;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    private int bitField0_;
    private Object comparisonOperator_;
    private boolean equalsTo_;
    private Object matchValue_;
    private int matchValueCase_ = 0;
    private int comparisonOperatorCase_ = 0;
    private flp path_ = am2.e;

    static {
        mn1 mn1Var = new mn1();
        DEFAULT_INSTANCE = mn1Var;
        ku0.a(mn1.class, mn1Var);
    }

    public static mn1 q() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        return this.matchValueCase_ == 5;
    }

    public final boolean B() {
        return this.matchValueCase_ == 2;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\t\u0002\u0001\u0001\t\t\u0000\u0001\u0000\u0001Ț\u0002Ȼ\u0000\u0003:\u0000\u0004<\u0000\u00053\u0000\u0006:\u0001\u0007:\u0001\b:\u0001\tဇ\u0000", new Object[]{"matchValue_", "matchValueCase_", "comparisonOperator_", "comparisonOperatorCase_", "bitField0_", "path_", mn1.class, "equalsTo_"});
        }
        if (iA == 3) {
            return new mn1();
        }
        if (iA == 4) {
            return new map(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(mn1.class);
        }
        throw null;
    }

    public final mn1 o() {
        return this.matchValueCase_ == 4 ? (mn1) this.matchValue_ : DEFAULT_INSTANCE;
    }

    public final boolean p() {
        if (this.matchValueCase_ == 3) {
            return ((Boolean) this.matchValue_).booleanValue();
        }
        return false;
    }

    public final boolean r() {
        return this.equalsTo_;
    }

    public final double s() {
        if (this.matchValueCase_ == 5) {
            return ((Double) this.matchValue_).doubleValue();
        }
        return 0.0d;
    }

    public final flp t() {
        return this.path_;
    }

    public final String u() {
        return this.matchValueCase_ == 2 ? (String) this.matchValue_ : "";
    }

    public final boolean v() {
        return this.matchValueCase_ == 4;
    }

    public final boolean w() {
        return this.comparisonOperatorCase_ == 8;
    }

    public final boolean x() {
        return this.matchValueCase_ == 3;
    }

    public final boolean y() {
        return this.comparisonOperatorCase_ == 6;
    }

    public final boolean z() {
        return this.comparisonOperatorCase_ == 7;
    }
}
