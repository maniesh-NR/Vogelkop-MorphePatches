package ads_mobile_sdk;

import defpackage.idp;
import defpackage.wmp;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class pp extends ku0 {
    private static final pp DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    private static final dn1 serverParametersDefaultEntry_5_;
    private int bitField0_;
    private boolean shouldCollectSignalsOnFullApp_;
    private boolean shouldGatherSignals_;
    private gn1 serverParameters_ = gn1.b;
    private String adapterClassName_ = "";
    private String platform_ = "";

    static {
        wmp wmpVar = cs3.d;
        serverParametersDefaultEntry_5_ = new dn1(wmpVar, wmpVar, "");
        pp ppVar = new pp();
        DEFAULT_INSTANCE = ppVar;
        ku0.a(pp.class, ppVar);
    }

    public static pp o() {
        return DEFAULT_INSTANCE;
    }

    public static idp s() {
        return (idp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ለ\u0003\u00052", new Object[]{"bitField0_", "adapterClassName_", "shouldGatherSignals_", "shouldCollectSignalsOnFullApp_", "platform_", "serverParameters_", serverParametersDefaultEntry_5_});
        }
        if (iA == 3) {
            return new pp();
        }
        if (iA == 4) {
            return new idp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(pp.class);
        }
        throw null;
    }

    public final void b(String str) {
        this.bitField0_ |= 1;
        this.adapterClassName_ = str;
    }

    public final void c(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.platform_ = str;
    }

    public final gn1 p() {
        gn1 gn1Var = this.serverParameters_;
        if (gn1Var.a) {
            return gn1Var;
        }
        gn1 gn1VarB = gn1Var.b();
        this.serverParameters_ = gn1VarB;
        return gn1VarB;
    }

    public final Map q() {
        return Collections.unmodifiableMap(this.serverParameters_);
    }

    public final boolean r() {
        return this.shouldCollectSignalsOnFullApp_;
    }
}
