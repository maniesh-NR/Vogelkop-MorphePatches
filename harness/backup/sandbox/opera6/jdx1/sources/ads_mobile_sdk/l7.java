package ads_mobile_sdk;

import androidx.core.app.NotificationCompat;
import defpackage.n7p;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l7 extends ku0 {
    public static final int A = 26;
    public static final int B = 27;
    private static final l7 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 22;
    public static final int e = 9;
    public static final int f = 23;
    public static final int g = 24;
    public static final int h = 3;
    public static final int i = 25;
    public static final int j = 4;
    public static final int k = 5;
    public static final int l = 6;
    public static final int m = 18;
    public static final int n = 7;
    public static final int o = 8;
    public static final int p = 10;
    public static final int q = 11;
    public static final int r = 12;
    public static final int s = 13;
    public static final int t = 14;
    public static final int u = 15;
    public static final int v = 16;
    public static final int w = 17;
    public static final int x = 19;
    public static final int y = 20;
    public static final int z = 21;
    private boolean allowFallbackToStaticProgram_;
    private int bitField0_;
    private boolean enableLazyScheduler_;
    private boolean enableMinimalCerSignal_;
    private boolean enableViewstringBinding_;
    private boolean forceInitializeWithStaticProgram_;
    private int hostType_;
    private tm1 loggingOptions_;
    private ul2 programUpdateOptions_;
    private int requestedAdshieldVersion_;
    private int fallbackAdshieldVersion_ = 1;
    private boolean allowFallback_ = true;
    private String hostVersion_ = "unknown_host";
    private boolean enableGassClient_ = true;
    private long appStartQuerySignalsTimeoutMs_ = 100;
    private long signalsTimeoutMs_ = 2000;
    private long gassSignalTimeoutMs_ = 10;
    private long localIntSignalTimeoutMs_ = 100;
    private long httpRequestTimeoutMs_ = 20000;
    private String prodInstallerCert_ = "";
    private String debugInstallerCert_ = "";
    private long methodTimeoutMs_ = 500;
    private long appStartWindowMs_ = 3000;
    private boolean enableMinimalAppStartQuerySignals_ = true;
    private boolean clearDgArgsAfterUse_ = true;
    private boolean enableDgProgramCache_ = true;
    private boolean skipProgramUpdateWithStaticProgram_ = true;

    static {
        l7 l7Var = new l7();
        DEFAULT_INSTANCE = l7Var;
        ku0.a(l7.class, l7Var);
    }

    public static n7p N() {
        return (n7p) DEFAULT_INSTANCE.e();
    }

    public final boolean A() {
        return this.forceInitializeWithStaticProgram_;
    }

    public final long B() {
        return this.gassSignalTimeoutMs_;
    }

    public final int C() {
        int i2 = this.hostType_;
        int i3 = 1;
        if (i2 != 0) {
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 0 : 4;
                }
            } else {
                i3 = 2;
            }
        }
        if (i3 == 0) {
            return 5;
        }
        return i3;
    }

    public final String D() {
        return this.hostVersion_;
    }

    public final long E() {
        return this.httpRequestTimeoutMs_;
    }

    public final long F() {
        return this.localIntSignalTimeoutMs_;
    }

    public final tm1 G() {
        tm1 tm1Var = this.loggingOptions_;
        return tm1Var == null ? tm1.o() : tm1Var;
    }

    public final long H() {
        return this.methodTimeoutMs_;
    }

    public final String I() {
        return this.prodInstallerCert_;
    }

    public final ul2 J() {
        ul2 ul2Var = this.programUpdateOptions_;
        return ul2Var == null ? ul2.p() : ul2Var;
    }

    public final int K() {
        int i_a$2 = sko._a$2(this.requestedAdshieldVersion_);
        if (i_a$2 == 0) {
            return 1;
        }
        return i_a$2;
    }

    public final long L() {
        return this.signalsTimeoutMs_;
    }

    public final boolean M() {
        return this.skipProgramUpdateWithStaticProgram_;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            ad adVar = ad.a$4;
            return new zq2(DEFAULT_INSTANCE, "\u0004\u001a\u0000\u0001\u0001\u001b\u001a\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0005\u0004ဇ\u0007\u0005ဉ\b\u0006ဇ\t\u0007ဂ\u000b\bဉ\f\tဇ\u0002\nဂ\r\u000bဂ\u000e\fဂ\u000f\rဈ\u0010\u000eဈ\u0011\u000fဂ\u0012\u0010ဂ\u0013\u0011ဇ\u0014\u0012ဂ\n\u0013ဇ\u0015\u0014ဇ\u0016\u0015ဇ\u0017\u0016᠌\u0001\u0017ဇ\u0003\u0018ဇ\u0004\u0019ဌ\u0006\u001aဇ\u0018\u001bဇ\u0019", new Object[]{"bitField0_", "requestedAdshieldVersion_", adVar, "hostVersion_", "enableGassClient_", "loggingOptions_", "enableViewstringBinding_", "signalsTimeoutMs_", "programUpdateOptions_", "allowFallback_", "gassSignalTimeoutMs_", "localIntSignalTimeoutMs_", "httpRequestTimeoutMs_", "prodInstallerCert_", "debugInstallerCert_", "methodTimeoutMs_", "appStartWindowMs_", "enableMinimalAppStartQuerySignals_", "appStartQuerySignalsTimeoutMs_", "clearDgArgsAfterUse_", "enableDgProgramCache_", "enableLazyScheduler_", "fallbackAdshieldVersion_", adVar, "allowFallbackToStaticProgram_", "forceInitializeWithStaticProgram_", "hostType_", "enableMinimalCerSignal_", "skipProgramUpdateWithStaticProgram_"});
        }
        if (iA == 3) {
            return new l7();
        }
        if (iA == 4) {
            return new n7p(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(l7.class);
        }
        throw null;
    }

    public final void a(tm1 tm1Var) {
        this.loggingOptions_ = tm1Var;
        this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
    }

    public final void a(ul2 ul2Var) {
        this.programUpdateOptions_ = ul2Var;
        this.bitField0_ |= 4096;
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 131072;
        this.debugInstallerCert_ = str;
    }

    public final void c(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.hostVersion_ = str;
    }

    public final void d(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 65536;
        this.prodInstallerCert_ = str;
    }

    public final boolean o() {
        return this.allowFallback_;
    }

    public final boolean p() {
        return this.allowFallbackToStaticProgram_;
    }

    public final long q() {
        return this.appStartQuerySignalsTimeoutMs_;
    }

    public final long r() {
        return this.appStartWindowMs_;
    }

    public final boolean s() {
        return this.clearDgArgsAfterUse_;
    }

    public final String t() {
        return this.debugInstallerCert_;
    }

    public final boolean u() {
        return this.enableGassClient_;
    }

    public final boolean v() {
        return this.enableLazyScheduler_;
    }

    public final boolean w() {
        return this.enableMinimalAppStartQuerySignals_;
    }

    public final boolean x() {
        return this.enableMinimalCerSignal_;
    }

    public final boolean y() {
        return this.enableViewstringBinding_;
    }

    public final int z() {
        int i_a$2 = sko._a$2(this.fallbackAdshieldVersion_);
        if (i_a$2 == 0) {
            return 2;
        }
        return i_a$2;
    }
}
