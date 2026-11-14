package ads_mobile_sdk;

import defpackage.gnp;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a50 extends ku0 {
    private static final a50 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private hr name_;
    private hr value_;

    static {
        a50 a50Var = new a50();
        DEFAULT_INSTANCE = a50Var;
        ku0.a(a50.class, a50Var);
    }

    public a50() {
        fr frVar = hr.b;
        this.name_ = frVar;
        this.value_ = frVar;
    }

    public static gnp o() {
        return (gnp) DEFAULT_INSTANCE.e();
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
                return new zq2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"bitField0_", "name_", "value_"});
            case 3:
                return new a50();
            case 4:
                return new gnp(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                return ku0.b(a50.class);
            default:
                throw null;
        }
    }

    public final void a(fr frVar) {
        Objects.requireNonNull(frVar);
        this.bitField0_ |= 1;
        this.name_ = frVar;
    }

    public final void b(fr frVar) {
        Objects.requireNonNull(frVar);
        this.bitField0_ |= 2;
        this.value_ = frVar;
    }
}
