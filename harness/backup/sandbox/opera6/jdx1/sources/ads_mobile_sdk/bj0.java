package ads_mobile_sdk;

import defpackage.dkp;
import defpackage.kap;
import defpackage.mip;

/* loaded from: classes.dex */
public final class bj0 implements dkp {
    public final kap a;
    public final th3 b;
    public final mip c;
    public final long d;

    public bj0(kap kapVar, th3 th3Var, mip mipVar, long j) {
        this.a = kapVar;
        this.b = th3Var;
        this.c = mipVar;
        this.d = j;
    }

    @Override // defpackage.dkp
    public final boolean a(jl2 jl2Var) {
        th3 th3Var = this.b;
        if (jl2Var == null || jl2Var.equals(jl2.q())) {
            th3Var.b(fl0.EVENT_ID_DG_VALIDATOR_UPDATE_METADATA_NOT_FOUND);
            return true;
        }
        if (jl2Var.p() != this.a.get()) {
            th3Var.b(fl0.EVENT_ID_DG_VALIDATOR_UPDATE_METADATA_ARCH_MISMATCH);
            return true;
        }
        long jQ = jl2Var.r().q() * 1000;
        this.c.getClass();
        boolean z = jQ - System.currentTimeMillis() <= this.d;
        if (z) {
            th3Var.b(fl0.EVENT_ID_DG_VALIDATOR_UPDATE_PROGRAM_ALMOST_EXPIRED);
        }
        return z;
    }

    @Override // defpackage.dkp
    public final boolean b(jl2 jl2Var) {
        th3 th3Var = this.b;
        if (jl2Var == null || jl2Var.equals(jl2.q())) {
            th3Var.b(fl0.EVENT_ID_DG_VALIDATOR_INIT_METADATA_NOT_FOUND);
            return false;
        }
        if (jl2Var.p() == this.a.get()) {
            return true;
        }
        th3Var.b(fl0.EVENT_ID_DG_VALIDATOR_INIT_METADATA_ARCH_MISMATCH);
        return false;
    }
}
