package ads_mobile_sdk;

import defpackage.d9p;
import defpackage.flp;
import defpackage.y7h;
import java.util.Objects;

/* loaded from: classes.dex */
public final class le extends ku0 {
    private static final le DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private flp encryptedBlobs_ = am2.e;
    private hr hash_ = hr.b;
    private int protoName_ = 1;
    private int encryptionMethod_ = 1;

    static {
        le leVar = new le();
        DEFAULT_INSTANCE = leVar;
        ku0.a(le.class, leVar);
    }

    public static d9p o() {
        return (d9p) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"bitField0_", "encryptedBlobs_", "hash_", "protoName_", ad.a$9, "encryptionMethod_", st.a$10});
        }
        if (iA == 3) {
            return new le();
        }
        if (iA == 4) {
            return new d9p(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(le.class);
        }
        throw null;
    }

    public final void a(fr frVar) {
        Objects.requireNonNull(frVar);
        flp flpVarC = this.encryptedBlobs_;
        if (!((j) flpVarC).a) {
            flpVarC = y7h.c(flpVarC);
            this.encryptedBlobs_ = flpVarC;
        }
        flpVarC.add(frVar);
    }

    public final void b(fr frVar) {
        Objects.requireNonNull(frVar);
        this.bitField0_ |= 1;
        this.hash_ = frVar;
    }
}
