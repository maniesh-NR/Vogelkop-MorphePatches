package ads_mobile_sdk;

import defpackage.dyo;
import java.util.Objects;

/* loaded from: classes.dex */
public final class fm0 extends ku0 {
    private static final fm0 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private hr bytecode_;
    private jl2 metadata_;
    private int status_;
    private hr vm_;

    static {
        fm0 fm0Var = new fm0();
        DEFAULT_INSTANCE = fm0Var;
        ku0.a(fm0.class, fm0Var);
    }

    public fm0() {
        fr frVar = hr.b;
        this.bytecode_ = frVar;
        this.vm_ = frVar;
    }

    public static dyo s() {
        return (dyo) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"bitField0_", "metadata_", "bytecode_", "vm_", "status_", ad.a$29});
        }
        if (iA == 3) {
            return new fm0();
        }
        if (iA == 4) {
            return new dyo(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(fm0.class);
        }
        throw null;
    }

    public final void a(hr hrVar) {
        Objects.requireNonNull(hrVar);
        this.bitField0_ |= 2;
        this.bytecode_ = hrVar;
    }

    public final void a(jl2 jl2Var) {
        this.metadata_ = jl2Var;
        this.bitField0_ |= 1;
    }

    public final void b(hr hrVar) {
        Objects.requireNonNull(hrVar);
        this.bitField0_ |= 4;
        this.vm_ = hrVar;
    }

    public final hr o() {
        return this.bytecode_;
    }

    public final jl2 p() {
        jl2 jl2Var = this.metadata_;
        return jl2Var == null ? jl2.q() : jl2Var;
    }

    public final int q$1() {
        int i_a = rfp._a(this.status_);
        if (i_a == 0) {
            return 1;
        }
        return i_a;
    }

    public final hr r() {
        return this.vm_;
    }
}
