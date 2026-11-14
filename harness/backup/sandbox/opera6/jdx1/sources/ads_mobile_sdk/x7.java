package ads_mobile_sdk;

import defpackage.gip;
import defpackage.map;

/* loaded from: classes.dex */
public final class x7 extends ku0 {
    private static final x7 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int activeExperimentIdsMemoizedSerializedSize = -1;
    private gip activeExperimentIds_ = qb1.e;
    private int bitField0_;
    private i92 program_;

    static {
        x7 x7Var = new x7();
        DEFAULT_INSTANCE = x7Var;
        ku0.a(x7.class, x7Var);
    }

    public static x7 a(byte[] bArr, ul0 ul0Var) throws bj1 {
        ku0 ku0VarA = ku0.a(DEFAULT_INSTANCE, bArr, bArr.length, ul0Var);
        ku0.a(ku0VarA);
        return (x7) ku0VarA;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002'", new Object[]{"bitField0_", "program_", "activeExperimentIds_"});
        }
        if (iA == 3) {
            return new x7();
        }
        if (iA == 4) {
            return new map(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(x7.class);
        }
        throw null;
    }

    public final gip o() {
        return this.activeExperimentIds_;
    }

    public final i92 p() {
        i92 i92Var = this.program_;
        return i92Var == null ? i92.o() : i92Var;
    }
}
