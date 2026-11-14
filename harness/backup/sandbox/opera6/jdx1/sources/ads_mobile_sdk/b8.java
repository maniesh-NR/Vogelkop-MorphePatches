package ads_mobile_sdk;

import defpackage.flp;
import defpackage.lko;
import defpackage.y7h;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b8 extends ku0 {
    private static final b8 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private o7 clientPingMetadata_;
    private flp payloads_ = am2.e;

    static {
        b8 b8Var = new b8();
        DEFAULT_INSTANCE = b8Var;
        ku0.a(b8.class, b8Var);
    }

    public static lko o() {
        return (lko) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "payloads_", z7.class, "clientPingMetadata_"});
        }
        if (iA == 3) {
            return new b8();
        }
        if (iA == 4) {
            return new lko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(b8.class);
        }
        throw null;
    }

    public final void a(o7 o7Var) {
        Objects.requireNonNull(o7Var);
        this.clientPingMetadata_ = o7Var;
        this.bitField0_ |= 1;
    }

    public final void a(z7 z7Var) {
        flp flpVarC = this.payloads_;
        if (!((j) flpVarC).a) {
            flpVarC = y7h.c(flpVarC);
            this.payloads_ = flpVarC;
        }
        flpVarC.add(z7Var);
    }
}
