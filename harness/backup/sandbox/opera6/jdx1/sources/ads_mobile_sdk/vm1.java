package ads_mobile_sdk;

import defpackage.flp;
import defpackage.map;

/* loaded from: classes.dex */
public final class vm1 extends ku0 {
    private static final vm1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private flp andNodes_;
    private int bitField0_;
    private mn1 matchNode_;
    private vm1 notNode_;
    private flp orNodes_;

    static {
        vm1 vm1Var = new vm1();
        DEFAULT_INSTANCE = vm1Var;
        ku0.a(vm1.class, vm1Var);
    }

    public vm1() {
        am2 am2Var = am2.e;
        this.andNodes_ = am2Var;
        this.orNodes_ = am2Var;
    }

    public static vm1 p() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "andNodes_", vm1.class, "orNodes_", vm1.class, "notNode_", "matchNode_"});
        }
        if (iA == 3) {
            return new vm1();
        }
        if (iA == 4) {
            return new map(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(vm1.class);
        }
        throw null;
    }

    public final flp o$1() {
        return this.andNodes_;
    }

    public final mn1 q() {
        mn1 mn1Var = this.matchNode_;
        return mn1Var == null ? mn1.q() : mn1Var;
    }

    public final vm1 r() {
        vm1 vm1Var = this.notNode_;
        return vm1Var == null ? DEFAULT_INSTANCE : vm1Var;
    }

    public final flp s() {
        return this.orNodes_;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean u() {
        return (this.bitField0_ & 1) != 0;
    }
}
