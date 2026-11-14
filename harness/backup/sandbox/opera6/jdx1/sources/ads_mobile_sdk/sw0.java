package ads_mobile_sdk;

import defpackage.eep;
import defpackage.flp;
import defpackage.y7h;

/* loaded from: classes.dex */
public final class sw0 extends ku0 {
    private static final sw0 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private mu clientPingMetadata_;
    private flp payloads_ = am2.e;

    static {
        sw0 sw0Var = new sw0();
        DEFAULT_INSTANCE = sw0Var;
        ku0.a(sw0.class, sw0Var);
    }

    public static eep o() {
        return (eep) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "payloads_", rw0.class, "clientPingMetadata_"});
        }
        if (iA == 3) {
            return new sw0();
        }
        if (iA == 4) {
            return new eep(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(sw0.class);
        }
        throw null;
    }

    public final void a(mu muVar) {
        this.clientPingMetadata_ = muVar;
        this.bitField0_ |= 1;
    }

    public final void a(rw0 rw0Var) {
        flp flpVarC = this.payloads_;
        if (!((j) flpVarC).a) {
            flpVarC = y7h.c(flpVarC);
            this.payloads_ = flpVarC;
        }
        flpVarC.add(rw0Var);
    }
}
