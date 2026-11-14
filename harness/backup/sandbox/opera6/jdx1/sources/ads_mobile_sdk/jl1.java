package ads_mobile_sdk;

import defpackage.g6p;
import java.util.Objects;

/* loaded from: classes.dex */
public final class jl1 extends ku0 {
    private static final jl1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private hr hmacKey_;
    private int hmacSignatureLength_;
    private byte memoizedIsInitialized = 2;
    private hr symmetricKey_;
    private int type_;

    static {
        jl1 jl1Var = new jl1();
        DEFAULT_INSTANCE = jl1Var;
        ku0.a(jl1.class, jl1Var);
    }

    public jl1() {
        fr frVar = hr.b;
        this.symmetricKey_ = frVar;
        this.hmacKey_ = frVar;
    }

    public static g6p o() {
        return (g6p) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        switch (zwg.a(i)) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = (byte) (ku0Var == null ? 0 : 1);
                return null;
            case 2:
                return new zq2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᴌ\u0000\u0002ᔊ\u0001\u0003ᔊ\u0002\u0004င\u0003", new Object[]{"bitField0_", "type_", ad.a$13, "symmetricKey_", "hmacKey_", "hmacSignatureLength_"});
            case 3:
                return new jl1();
            case 4:
                return new g6p(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                return ku0.b(jl1.class);
            default:
                throw null;
        }
    }

    public final void a(fr frVar) {
        Objects.requireNonNull(frVar);
        this.bitField0_ |= 4;
        this.hmacKey_ = frVar;
    }

    public final void b(fr frVar) {
        Objects.requireNonNull(frVar);
        this.bitField0_ |= 2;
        this.symmetricKey_ = frVar;
    }
}
