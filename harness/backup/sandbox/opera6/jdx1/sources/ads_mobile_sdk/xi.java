package ads_mobile_sdk;

import defpackage.bgp;
import defpackage.ckp;
import defpackage.hip;
import defpackage.kjp;
import defpackage.lkp;
import defpackage.mkp;
import defpackage.sgp;
import defpackage.v9g;
import defpackage.wmp;
import defpackage.yep;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class xi extends ku0 {
    private static final xi DEFAULT_INSTANCE;
    private static final dn1 adUnitAndFormatToRequestSignalsDefaultEntry_7_;
    public static final int c = 13;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    public static final int h = 5;
    public static final int i = 6;
    public static final int j = 7;
    public static final int k = 8;
    public static final int l = 9;
    public static final int m = 10;
    public static final int n = 11;
    public static final int o = 12;
    private gn1 adManagerSignalAdapterConfigs_;
    private gn1 adUnitAndFormatToMediationConfigs_;
    private gn1 adUnitAndFormatToRequestSignals_;
    private gn1 adUnitPatterns_;
    private gn1 adapterInitializationConfigs_;
    private gn1 admobSignalAdapterConfigs_;
    private String appSettingsJson_;
    private int appSettingsVersion_;
    private int bitField0_;
    private String commonSettingsJson_;
    private long lastUpdateTimeMs_;
    private int loggingOnlyExperimentIdsMemoizedSerializedSize = -1;
    private lkp loggingOnlyExperimentIds_;
    private long serverCacheTtlSecs_;
    private gn1 signalAdapterConfigs_;

    static {
        wmp wmpVar = cs3.d;
        adUnitAndFormatToRequestSignalsDefaultEntry_7_ = new dn1(wmpVar, wmpVar, "");
        xi xiVar = new xi();
        DEFAULT_INSTANCE = xiVar;
        ku0.a(xi.class, xiVar);
    }

    public xi() {
        gn1 gn1Var = gn1.b;
        this.adUnitAndFormatToMediationConfigs_ = gn1Var;
        this.adUnitAndFormatToRequestSignals_ = gn1Var;
        this.adapterInitializationConfigs_ = gn1Var;
        this.adUnitPatterns_ = gn1Var;
        this.signalAdapterConfigs_ = gn1Var;
        this.admobSignalAdapterConfigs_ = gn1Var;
        this.adManagerSignalAdapterConfigs_ = gn1Var;
        this.appSettingsJson_ = "";
        this.loggingOnlyExperimentIds_ = wm1.e;
        this.commonSettingsJson_ = "";
    }

    public static ckp A() {
        return (ckp) DEFAULT_INSTANCE.e();
    }

    public static xi a(InputStream inputStream) {
        ku0 ku0VarA = ku0.a(DEFAULT_INSTANCE, v9g.a(inputStream), ul0.a());
        ku0.a(ku0VarA);
        return (xi) ku0VarA;
    }

    public static xi x() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\r\u0000\u0001\u0001\r\r\u0007\u0001\u0000\u0001ለ\u0001\u0002ဂ\u0002\u0003ဂ\u0003\u0004%\u00052\u0006ለ\u0004\u00072\b2\t2\n2\u000b2\f2\rင\u0000", new Object[]{"bitField0_", "appSettingsJson_", "lastUpdateTimeMs_", "serverCacheTtlSecs_", "loggingOnlyExperimentIds_", "adUnitAndFormatToMediationConfigs_", bgp.a, "commonSettingsJson_", "adUnitAndFormatToRequestSignals_", adUnitAndFormatToRequestSignalsDefaultEntry_7_, "adapterInitializationConfigs_", hip.a, "adUnitPatterns_", sgp.a, "signalAdapterConfigs_", mkp.a, "admobSignalAdapterConfigs_", kjp.a, "adManagerSignalAdapterConfigs_", yep.a, "appSettingsVersion_"});
        }
        if (iA == 3) {
            return new xi();
        }
        if (iA == 4) {
            return new ckp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(xi.class);
        }
        throw null;
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.appSettingsJson_ = str;
    }

    public final void c(String str) {
        this.bitField0_ |= 16;
        this.commonSettingsJson_ = str;
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.adManagerSignalAdapterConfigs_);
    }

    public final Map p() {
        return Collections.unmodifiableMap(this.adUnitAndFormatToMediationConfigs_);
    }

    public final Map q() {
        return Collections.unmodifiableMap(this.adUnitAndFormatToRequestSignals_);
    }

    public final Map r() {
        return Collections.unmodifiableMap(this.adUnitPatterns_);
    }

    public final Map s() {
        return Collections.unmodifiableMap(this.adapterInitializationConfigs_);
    }

    public final Map t() {
        return Collections.unmodifiableMap(this.admobSignalAdapterConfigs_);
    }

    public final String u() {
        return this.appSettingsJson_;
    }

    public final int v() {
        return this.appSettingsVersion_;
    }

    public final String w() {
        return this.commonSettingsJson_;
    }

    public final long y() {
        return this.lastUpdateTimeMs_;
    }

    public final long z() {
        return this.serverCacheTtlSecs_;
    }
}
