package ads_mobile_sdk;

import defpackage.flp;
import defpackage.moo;
import defpackage.y7h;

/* loaded from: classes.dex */
public final class e50 extends ku0 {
    private static final e50 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    private int bitField0_;
    private hr body_;
    private hr bodydigest_;
    private int bodylength_;
    private d50 firstline_;
    private byte memoizedIsInitialized = 2;
    private flp headers_ = am2.e;

    static {
        e50 e50Var = new e50();
        DEFAULT_INSTANCE = e50Var;
        ku0.a(e50.class, e50Var);
    }

    public e50() {
        fr frVar = hr.b;
        this.body_ = frVar;
        this.bodydigest_ = frVar;
    }

    public static moo o() {
        return (moo) DEFAULT_INSTANCE.e();
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
                return new zq2(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"bitField0_", "firstline_", "headers_", a50.class, "body_", "bodydigest_", "bodylength_"});
            case 3:
                return new e50();
            case 4:
                return new moo(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                return ku0.b(e50.class);
            default:
                throw null;
        }
    }

    public final void a(a50 a50Var) {
        flp flpVarC = this.headers_;
        if (!((j) flpVarC).a) {
            flpVarC = y7h.c(flpVarC);
            this.headers_ = flpVarC;
        }
        flpVarC.add(a50Var);
    }
}
