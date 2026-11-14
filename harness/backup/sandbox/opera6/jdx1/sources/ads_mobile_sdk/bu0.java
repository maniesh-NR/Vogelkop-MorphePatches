package ads_mobile_sdk;

import defpackage.dko;

/* loaded from: classes.dex */
public final class bu0 extends ku0 {
    private static final bu0 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private hr bytecode_;
    private kl2 metadata_;
    private hr vm_;

    static {
        bu0 bu0Var = new bu0();
        DEFAULT_INSTANCE = bu0Var;
        ku0.a(bu0.class, bu0Var);
    }

    public bu0() {
        fr frVar = hr.b;
        this.vm_ = frVar;
        this.bytecode_ = frVar;
    }

    public static bu0 a(byte[] bArr, ul0 ul0Var) throws bj1 {
        ku0 ku0VarA = ku0.a(DEFAULT_INSTANCE, bArr, bArr.length, ul0Var);
        ku0.a(ku0VarA);
        return (bu0) ku0VarA;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"bitField0_", "metadata_", "vm_", "bytecode_"});
        }
        if (iA == 3) {
            return new bu0();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(bu0.class);
        }
        throw null;
    }

    public final hr o() {
        return this.bytecode_;
    }

    public final kl2 p() {
        kl2 kl2Var = this.metadata_;
        return kl2Var == null ? kl2.p() : kl2Var;
    }

    public final hr q() {
        return this.vm_;
    }
}
