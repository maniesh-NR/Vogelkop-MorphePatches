package ads_mobile_sdk;

import defpackage.gip;
import defpackage.n3p;
import defpackage.t3p;
import java.util.Objects;

/* loaded from: classes.dex */
public final class jl2 extends ku0 {
    private static final jl2 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int architecture_;
    private int bitField0_;
    private Object metadata_;
    private int metadataCase_ = 0;
    private int activeExperimentIdsMemoizedSerializedSize = -1;
    private gip activeExperimentIds_ = qb1.e;

    static {
        jl2 jl2Var = new jl2();
        DEFAULT_INSTANCE = jl2Var;
        ku0.a(jl2.class, jl2Var);
    }

    public static jl2 a(fr frVar) throws bj1 {
        jl2 jl2Var = DEFAULT_INSTANCE;
        ul0 ul0VarA = ul0.a();
        byte[] bArr = frVar.d;
        int length = bArr.length;
        hv hvVar = new hv(bArr, length);
        try {
            hvVar.d(length);
            ku0 ku0VarA = ku0.a(jl2Var, hvVar, ul0VarA);
            hvVar.a(0);
            ku0.a(ku0VarA);
            ku0.a(ku0VarA);
            return (jl2) ku0VarA;
        } catch (bj1 e2) {
            t3p.n(e2);
            return null;
        }
    }

    public static jl2 q() {
        return DEFAULT_INSTANCE;
    }

    public static n3p t() {
        return (n3p) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000\u0004'", new Object[]{"metadata_", "metadataCase_", "bitField0_", kl2.class, k92.class, "architecture_", ad.a$22, "activeExperimentIds_"});
        }
        if (iA == 3) {
            return new jl2();
        }
        if (iA == 4) {
            return new n3p(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(jl2.class);
        }
        throw null;
    }

    public final void a(k92 k92Var) {
        Objects.requireNonNull(k92Var);
        this.metadata_ = k92Var;
        this.metadataCase_ = 2;
    }

    public final void a(kl2 kl2Var) {
        Objects.requireNonNull(kl2Var);
        this.metadata_ = kl2Var;
        this.metadataCase_ = 1;
    }

    public final gip o() {
        return this.activeExperimentIds_;
    }

    public final mk p() {
        mk mkVarA = mk.a(this.architecture_);
        return mkVarA == null ? mk.UNSUPPORTED : mkVarA;
    }

    public final kl2 r() {
        return this.metadataCase_ == 1 ? (kl2) this.metadata_ : kl2.p();
    }

    public final k92 s() {
        return this.metadataCase_ == 2 ? (k92) this.metadata_ : k92.o();
    }
}
