package ads_mobile_sdk;

import defpackage.hjp;
import java.util.Objects;

/* loaded from: classes.dex */
public final class vd extends ku0 {
    private static final vd DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private hr data_;
    private hr hash_;
    private hr osVersion_;
    private hr timestamp_;

    static {
        vd vdVar = new vd();
        DEFAULT_INSTANCE = vdVar;
        ku0.a(vd.class, vdVar);
    }

    public vd() {
        fr frVar = hr.b;
        this.data_ = frVar;
        this.hash_ = frVar;
        this.timestamp_ = frVar;
        this.osVersion_ = frVar;
    }

    public static vd a(byte[] bArr, ul0 ul0Var) throws bj1 {
        ku0 ku0VarA = ku0.a(DEFAULT_INSTANCE, bArr, bArr.length, ul0Var);
        ku0.a(ku0VarA);
        return (vd) ku0VarA;
    }

    public static hjp s() {
        return (hjp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"bitField0_", "data_", "hash_", "timestamp_", "osVersion_"});
        }
        if (iA == 3) {
            return new vd();
        }
        if (iA == 4) {
            return new hjp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(vd.class);
        }
        throw null;
    }

    public final void a(fr frVar) {
        Objects.requireNonNull(frVar);
        this.bitField0_ |= 8;
        this.osVersion_ = frVar;
    }

    public final void b(fr frVar) {
        Objects.requireNonNull(frVar);
        this.bitField0_ |= 4;
        this.timestamp_ = frVar;
    }

    public final hr o() {
        return this.data_;
    }

    public final hr p() {
        return this.hash_;
    }

    public final hr q() {
        return this.osVersion_;
    }

    public final hr r() {
        return this.timestamp_;
    }
}
